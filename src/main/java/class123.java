import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class123 {

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public int field2218 = -1;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "Z")
    public boolean field2229 = false;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "[I")
    private int[] field2225 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!km", name = "q", descriptor = "[I")
    public static int[] field2233 = new int[2048];

    @OriginalMember(owner = "client!km", name = "s", descriptor = "Lbd;")
    public static class162 field2235 = class17.method142(0, "::cardmem");

    @OriginalMember(owner = "client!km", name = "r", descriptor = "I")
    public static int field2234 = 0;

    @OriginalMember(owner = "client!km", name = "u", descriptor = "I")
    public static int field2237 = 0;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field2226 = 0;

    @OriginalMember(owner = "client!km", name = "t", descriptor = "Lob;")
    public static class78 field2236 = null;

    @OriginalMember(owner = "client!km", name = "x", descriptor = "I")
    public static int field2240 = 1;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!km", name = "v", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!km", name = "w", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "[I")
    private int[] field2227;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "[I")
    public static int[] field2230;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "[S")
    private short[] field2217;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "[S")
    private short[] field2221;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "[S")
    private short[] field2222;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "[S")
    private short[] field2224;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "[[Lba;")
    public static class26[][] field2219;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)Lqj;", line = 5)
    public final class195 method992(int arg0) {
        int var2 = 58 % ((-arg0 - 33) / 42);
        field2239++;
        int var3 = 0;
        class195[] var4 = new class195[5];
        for (int var5 = 0; var5 < 5; var5++) {
            if (this.field2225[var5] != -1) {
                var4[var3++] = class195.method1449(class204.field3450, this.field2225[var5], 0);
            }
        }
        class195 var6 = new class195(var4, var3);
        if (this.field2222 != null) {
            for (int var7 = 0; var7 < this.field2222.length; var7++) {
                var6.method1454(this.field2222[var7], this.field2217[var7]);
            }
        }
        if (this.field2221 != null) {
            for (int var8 = 0; var8 < this.field2221.length; var8++) {
                var6.method1466(this.field2221[var8], this.field2224[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V", line = 62)
    public static void method993(int arg0) {
        field2219 = (class26[][]) null;
        field2235 = null;
        field2236 = null;
        field2230 = null;
        if (arg0 < 80) {
            field2236 = (class78) null;
        }
        field2233 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZLb;I)V", line = 79)
    private final void method994(boolean arg0, class94 arg1, int arg2) {
        field2228++;
        if (arg0) {
            this.method992(109);
        }
        if (arg2 == 1) {
            this.field2218 = arg1.method756(915905888);
        } else if (arg2 == 2) {
            int var8 = arg1.method756(915905888);
            this.field2227 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2227[var9] = arg1.method761((byte) 108);
            }
        } else if (arg2 == 3) {
            this.field2229 = true;
        } else if (arg2 == 40) {
            int var6 = arg1.method756(915905888);
            this.field2222 = new short[var6];
            this.field2217 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2222[var7] = (short) arg1.method761((byte) 108);
                this.field2217[var7] = (short) arg1.method761((byte) 108);
            }
        } else if (arg2 == 41) {
            int var4 = arg1.method756(915905888);
            this.field2221 = new short[var4];
            this.field2224 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2221[var5] = (short) arg1.method761((byte) 108);
                this.field2224[var5] = (short) arg1.method761((byte) 108);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field2225[arg2 - 60] = arg1.method761((byte) 108);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lb;I)V", line = 160)
    public final void method995(class94 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method756(915905888);
            if (var3 == 0) {
                field2231++;
                if (arg1 != 40) {
                    this.field2227 = (int[]) null;
                }
                return;
            }
            this.method994(false, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(I)Z", line = 199)
    public final boolean method996(int arg0) {
        if (arg0 != -6640) {
            return false;
        }
        field2232++;
        if (this.field2227 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field2227.length; var3++) {
            if (!class204.field3450.method1125(this.field2227[var3], 0, (byte) -112)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(I)Lqj;", line = 247)
    public final class195 method997(int arg0) {
        field2220++;
        if (this.field2227 == null) {
            return null;
        }
        class195[] var2 = new class195[this.field2227.length];
        for (int var3 = arg0; var3 < this.field2227.length; var3++) {
            var2[var3] = class195.method1449(class204.field3450, this.field2227[var3], 0);
        }
        class195 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class195(var2, var2.length);
        }
        if (this.field2222 != null) {
            for (int var5 = 0; var5 < this.field2222.length; var5++) {
                var4.method1454(this.field2222[var5], this.field2217[var5]);
            }
        }
        if (this.field2221 != null) {
            for (int var6 = 0; var6 < this.field2221.length; var6++) {
                var4.method1466(this.field2221[var6], this.field2224[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!km", name = "e", descriptor = "(I)Z", line = 316)
    public final boolean method998(int arg0) {
        field2223++;
        boolean var2 = true;
        int var3 = 0;
        if (arg0 != 2048) {
            this.field2217 = (short[]) null;
        }
        while (var3 < 5) {
            if (this.field2225[var3] != -1 && !class204.field3450.method1125(this.field2225[var3], 0, (byte) -112)) {
                var2 = false;
            }
            var3++;
        }
        return var2;
    }
}
