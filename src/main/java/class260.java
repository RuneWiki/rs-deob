import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class260 {

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "Z")
    public boolean field4228 = false;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "[I")
    private int[] field4226 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public int field4239 = -1;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field4229 = 0;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4238 = "Loading title screen - ";

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "Ltf;")
    public static class244 field4224;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "[I")
    private int[] field4235;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "[S")
    private short[] field4222;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "[S")
    private short[] field4231;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "[S")
    private short[] field4236;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "[S")
    private short[] field4240;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)Z")
    public final boolean method1832(byte arg0) {
        field4234++;
        boolean var2 = true;
        if (arg0 != -35) {
            method1834(-29);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field4226[var3] != -1 && !class135.field1948.method487(false, this.field4226[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public static final void method1833(int arg0) {
        class65.method431((long) class311.field4996);
        if (class238.field3824 != -1) {
            class15.method91(class238.field3824, arg0 + 47);
        }
        field4233++;
        for (int var1 = 0; var1 < class254.field4142; var1++) {
            if (class302.field4808[var1]) {
                class195.field3092[var1] = true;
            }
            class278.field4553[var1] = class302.field4808[var1];
            class302.field4808[var1] = false;
        }
        class167.field2576 = -1;
        class175.field2758 = class311.field4996;
        class63.field918 = -1;
        class104.field1521 = null;
        if (class238.field3824 != -1) {
            class254.field4142 = 0;
            class159.method1094(0);
        }
        class151.method1038();
        class135.field1949 = arg0;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public static void method1834(int arg0) {
        field4224 = null;
        field4238 = null;
        if (arg0 != 0) {
            method1833(-58);
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)Ljj;")
    public final class141 method1835(int arg0) {
        field4232++;
        int var2 = 0;
        class141[] var3 = new class141[5];
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field4226[var4] != -1) {
                var3[var2++] = class141.method909(class135.field1948, this.field4226[var4], 0);
            }
        }
        if (arg0 != -1) {
            this.method1832((byte) -90);
        }
        class141 var5 = new class141(var3, var2);
        if (this.field4240 != null) {
            for (int var6 = 0; var6 < this.field4240.length; var6++) {
                var5.method886(this.field4240[var6], this.field4236[var6]);
            }
        }
        if (this.field4222 != null) {
            for (int var7 = 0; var7 < this.field4222.length; var7++) {
                var5.method898(this.field4222[var7], this.field4231[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)Ljj;")
    public final class141 method1836(int arg0) {
        field4225++;
        if (this.field4235 == null) {
            return null;
        }
        class141[] var2 = new class141[this.field4235.length];
        if (arg0 != -27604) {
            this.method1836(18);
        }
        for (int var3 = 0; var3 < this.field4235.length; var3++) {
            var2[var3] = class141.method909(class135.field1948, this.field4235[var3], 0);
        }
        class141 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class141(var2, var2.length);
        }
        if (this.field4240 != null) {
            for (int var5 = 0; var5 < this.field4240.length; var5++) {
                var4.method886(this.field4240[var5], this.field4236[var5]);
            }
        }
        if (this.field4222 != null) {
            for (int var6 = 0; var6 < this.field4222.length; var6++) {
                var4.method898(this.field4222[var6], this.field4231[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZLim;)V")
    public final void method1837(boolean arg0, class170 arg1) {
        field4237++;
        if (!arg0) {
            this.field4226 = null;
        }
        while (true) {
            int var3 = arg1.method1218(-103);
            if (var3 == 0) {
                return;
            }
            this.method1839(arg1, var3, false);
        }
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)Z")
    public final boolean method1838(int arg0) {
        field4227++;
        if (this.field4235 == null) {
            return true;
        }
        boolean var2 = true;
        int var3 = 0;
        int var4 = -115 % ((arg0 - 38) / 34);
        while (this.field4235.length > var3) {
            if (!class135.field1948.method487(false, this.field4235[var3], 0)) {
                var2 = false;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lim;IZ)V")
    private final void method1839(class170 arg0, int arg1, boolean arg2) {
        field4230++;
        if (arg2) {
            field4229 = -65;
        }
        if (arg1 == 1) {
            this.field4239 = arg0.method1218(92);
        } else if (arg1 == 2) {
            int var8 = arg0.method1218(-93);
            this.field4235 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4235[var9] = arg0.method1186((byte) -66);
            }
        } else if (arg1 == 3) {
            this.field4228 = true;
        } else if (arg1 == 40) {
            int var4 = arg0.method1218(80);
            this.field4236 = new short[var4];
            this.field4240 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4240[var5] = (short) arg0.method1186((byte) -117);
                this.field4236[var5] = (short) arg0.method1186((byte) -79);
            }
        } else if (arg1 == 41) {
            int var6 = arg0.method1218(-110);
            this.field4222 = new short[var6];
            this.field4231 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4222[var7] = (short) arg0.method1186((byte) -57);
                this.field4231[var7] = (short) arg0.method1186((byte) -40);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field4226[arg1 - 60] = arg0.method1186((byte) -87);
            return;
        }
    }
}
