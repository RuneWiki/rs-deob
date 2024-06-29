import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class157 {

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public int field2338 = -1;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "[I")
    private int[] field2345 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "Z")
    public boolean field2351 = false;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "[I")
    public static int[] field2353 = new int[200];

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field2340 = 0;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field2350 = 0;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "[I")
    private int[] field2339;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "[S")
    private short[] field2341;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "[S")
    private short[] field2344;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "[S")
    private short[] field2347;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "[S")
    private short[] field2352;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)Lfe;")
    public final class271 method1131(int arg0) {
        field2342++;
        if (this.field2339 == null) {
            return null;
        }
        if (arg0 <= 93) {
            this.method1136(-49, (class31) null);
        }
        class271[] var2 = new class271[this.field2339.length];
        for (int var3 = 0; var3 < this.field2339.length; var3++) {
            var2[var3] = class271.method1859(class207.field3193, this.field2339[var3], 0);
        }
        class271 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class271(var2, var2.length);
        }
        if (this.field2352 != null) {
            for (int var5 = 0; var5 < this.field2352.length; var5++) {
                var4.method1847(this.field2352[var5], this.field2347[var5]);
            }
        }
        if (this.field2344 != null) {
            for (int var6 = 0; var6 < this.field2344.length; var6++) {
                var4.method1858(this.field2344[var6], this.field2341[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)Lfe;")
    public final class271 method1132(boolean arg0) {
        field2349++;
        class271[] var2 = new class271[5];
        int var3 = 0;
        if (arg0) {
            this.method1133(23, (class31) null, (byte) 11);
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2345[var4] != -1) {
                var2[var3++] = class271.method1859(class207.field3193, this.field2345[var4], 0);
            }
        }
        class271 var5 = new class271(var2, var3);
        if (this.field2352 != null) {
            for (int var6 = 0; var6 < this.field2352.length; var6++) {
                var5.method1847(this.field2352[var6], this.field2347[var6]);
            }
        }
        if (this.field2344 != null) {
            for (int var7 = 0; var7 < this.field2344.length; var7++) {
                var5.method1858(this.field2344[var7], this.field2341[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILha;B)V")
    private final void method1133(int arg0, class31 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field2338 = arg1.method265(-123);
        } else if (arg0 == 2) {
            int var8 = arg1.method265(-94);
            this.field2339 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2339[var9] = arg1.method260((byte) -67);
            }
        } else if (arg0 == 3) {
            this.field2351 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method265(-126);
            this.field2347 = new short[var6];
            this.field2352 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2352[var7] = (short) arg1.method260((byte) -67);
                this.field2347[var7] = (short) arg1.method260((byte) -67);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method265(-111);
            this.field2344 = new short[var4];
            this.field2341 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2344[var5] = (short) arg1.method260((byte) -67);
                this.field2341[var5] = (short) arg1.method260((byte) -67);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field2345[arg0 - 60] = arg1.method260((byte) -67);
        }
        int var10 = 119 % ((-arg2 - 10) / 41);
        field2343++;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)Z")
    public final boolean method1134(int arg0) {
        field2354++;
        boolean var2 = true;
        int var3 = 38 % ((67 - arg0) / 58);
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2345[var4] != -1 && !class207.field3193.method698((byte) 103, 0, this.field2345[var4])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)Z")
    public final boolean method1135(int arg0) {
        field2346++;
        if (this.field2339 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != -22626) {
            field2353 = null;
        }
        for (int var3 = 0; var3 < this.field2339.length; var3++) {
            if (!class207.field3193.method698((byte) 102, 0, this.field2339[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILha;)V")
    public final void method1136(int arg0, class31 arg1) {
        field2348++;
        if (arg0 <= 67) {
            return;
        }
        while (true) {
            int var3 = arg1.method265(-120);
            if (var3 == 0) {
                return;
            }
            this.method1133(var3, arg1, (byte) 86);
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(Z)V")
    public static void method1137(boolean arg0) {
        field2353 = null;
        if (!arg0) {
            field2353 = null;
        }
    }
}
