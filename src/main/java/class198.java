import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class198 extends class14 {

    @OriginalMember(owner = "client!wa", name = "V", descriptor = "I")
    private int field3912 = 128;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "I")
    private int field3904 = 0;

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "I")
    private int field3902 = 0;

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "I")
    public int field3914 = -1;

    @OriginalMember(owner = "client!wa", name = "ab", descriptor = "I")
    private int field3917 = 0;

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
    private int field3910 = 128;

    @OriginalMember(owner = "client!wa", name = "W", descriptor = "Lea;")
    public static class38 field3913 = class9.method46((byte) 125, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "Lea;")
    private static class38 field3903 = class9.method46((byte) 110, "Existing User");

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "Lea;")
    public static class38 field3916 = field3903;

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "Lrc;")
    public static class155 field3908 = new class155(100);

    @OriginalMember(owner = "client!wa", name = "fb", descriptor = "Lda;")
    public static class29 field3922 = new class29(4096);

    @OriginalMember(owner = "client!wa", name = "kb", descriptor = "Lea;")
    public static class38 field3927 = class9.method46((byte) 102, "Diese Betatest)2Welt ist nur f-Ur eingeladene");

    @OriginalMember(owner = "client!wa", name = "jb", descriptor = "Lea;")
    public static class38 field3926 = class9.method46((byte) 103, "::clientdrop");

    @OriginalMember(owner = "client!wa", name = "gb", descriptor = "Lea;")
    private static class38 field3923 = class9.method46((byte) 106, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!wa", name = "ib", descriptor = "Lea;")
    public static class38 field3925 = field3923;

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!wa", name = "U", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!wa", name = "bb", descriptor = "I")
    private int field3918;

    @OriginalMember(owner = "client!wa", name = "cb", descriptor = "I")
    public int field3919;

    @OriginalMember(owner = "client!wa", name = "hb", descriptor = "Ldd;")
    public static class32 field3924;

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "[S")
    private short[] field3906;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "[S")
    private short[] field3907;

    @OriginalMember(owner = "client!wa", name = "db", descriptor = "[S")
    private short[] field3920;

    @OriginalMember(owner = "client!wa", name = "eb", descriptor = "[S")
    private short[] field3921;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "(I)V")
    public static void method1302(int arg0) {
        if (arg0 != -6) {
            field3926 = null;
        }
        field3913 = null;
        field3922 = null;
        field3923 = null;
        field3925 = null;
        field3926 = null;
        field3916 = null;
        field3927 = null;
        field3908 = null;
        field3924 = null;
        field3903 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Lqf;")
    public static final class149 method1303(int arg0, int arg1) {
        field3911++;
        class149 var2 = (class149) class35.field738.method1078((byte) 113, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class151.field3112.method215(arg1, 16, 1);
        class149 var4 = new class149();
        if (arg0 != -9094) {
            field3913 = null;
        }
        if (var3 != null) {
            var4.method1049((byte) 114, new class66(var3));
        }
        class35.field738.method1076((long) arg1, -4, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(IZ)Lrg;")
    public final class159 method1304(int arg0, boolean arg1) {
        field3905++;
        class159 var3 = (class159) class178.field3605.method1078((byte) 77, (long) this.field3919);
        if (var3 == null) {
            class81 var4 = class81.method692(class172.field3524, this.field3918, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field3921 != null) {
                for (int var5 = 0; var5 < this.field3921.length; var5++) {
                    var4.method698(this.field3921[var5], this.field3920[var5]);
                }
            }
            if (this.field3907 != null) {
                for (int var6 = 0; var6 < this.field3907.length; var6++) {
                    var4.method688(this.field3907[var6], this.field3906[var6]);
                }
            }
            var3 = var4.method681(this.field3917 + 64, this.field3904 + 850, -30, -50, -30, true, true);
            class178.field3605.method1076((long) this.field3919, -4, var3);
        }
        class159 var7;
        if (this.field3914 == -1 || arg0 == -1) {
            var7 = var3.method344(true);
        } else {
            var7 = class139.method997(-39, this.field3914).method1003(var3, arg0, true);
        }
        if (this.field3912 != 128 || this.field3910 != 128) {
            var7.method1148(this.field3912, this.field3910, this.field3912);
        }
        if (!arg1) {
            return null;
        }
        if (this.field3902 != 0) {
            if (this.field3902 == 90) {
                var7.method1149();
            }
            if (this.field3902 == 180) {
                var7.method1149();
                var7.method1149();
            }
            if (this.field3902 == 270) {
                var7.method1149();
                var7.method1149();
                var7.method1149();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lhc;I)V")
    public final void method1305(class66 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method509(arg1 ^ 0xFFFFFF32);
            if (var3 == 0) {
                field3909++;
                if (arg1 != -181) {
                    field3923 = null;
                    return;
                }
                return;
            }
            this.method1306((byte) -71, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BILhc;)V")
    private final void method1306(byte arg0, int arg1, class66 arg2) {
        int var4 = -83 % ((28 - arg0) / 58);
        if (arg1 == 1) {
            this.field3918 = arg2.method511(-120);
        } else if (arg1 == 2) {
            this.field3914 = arg2.method511(-128);
        } else if (arg1 == 4) {
            this.field3912 = arg2.method511(88);
        } else if (arg1 == 5) {
            this.field3910 = arg2.method511(-119);
        } else if (arg1 == 6) {
            this.field3902 = arg2.method511(63);
        } else if (arg1 == 7) {
            this.field3917 = arg2.method509(125);
        } else if (arg1 == 8) {
            this.field3904 = arg2.method509(120);
        } else if (arg1 == 40) {
            int var7 = arg2.method509(117);
            this.field3921 = new short[var7];
            this.field3920 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3921[var8] = (short) arg2.method511(112);
                this.field3920[var8] = (short) arg2.method511(-128);
            }
        } else if (arg1 == 41) {
            int var5 = arg2.method509(116);
            this.field3907 = new short[var5];
            this.field3906 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3907[var6] = (short) arg2.method511(-125);
                this.field3906[var6] = (short) arg2.method511(99);
            }
        }
        field3915++;
    }
}
