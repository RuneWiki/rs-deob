import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class140 extends class14 {

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "Z")
    public boolean field2913 = false;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "I")
    public int field2912 = -1;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
    public int field2918 = 2;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "I")
    public int field2916 = -1;

    @OriginalMember(owner = "client!pf", name = "ab", descriptor = "I")
    public int field2927 = -1;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
    public int field2920 = 5;

    @OriginalMember(owner = "client!pf", name = "hb", descriptor = "I")
    public int field2934 = 99;

    @OriginalMember(owner = "client!pf", name = "ib", descriptor = "I")
    public int field2935 = -1;

    @OriginalMember(owner = "client!pf", name = "X", descriptor = "I")
    public int field2924 = -1;

    @OriginalMember(owner = "client!pf", name = "eb", descriptor = "Lef;")
    public static class43 field2931 = null;

    @OriginalMember(owner = "client!pf", name = "gb", descriptor = "Z")
    public static boolean field2933 = false;

    @OriginalMember(owner = "client!pf", name = "bb", descriptor = "Lrc;")
    public static class155 field2928 = new class155(30);

    @OriginalMember(owner = "client!pf", name = "nb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2940 = Calendar.getInstance();

    @OriginalMember(owner = "client!pf", name = "qb", descriptor = "I")
    public static int field2943 = 0;

    @OriginalMember(owner = "client!pf", name = "pb", descriptor = "I")
    public static int field2942 = 0;

    @OriginalMember(owner = "client!pf", name = "ob", descriptor = "I")
    public static int field2941 = 0;

    @OriginalMember(owner = "client!pf", name = "sb", descriptor = "Lea;")
    private static class38 field2945 = class9.method46((byte) 102, "Password: ");

    @OriginalMember(owner = "client!pf", name = "rb", descriptor = "Lea;")
    public static class38 field2944 = field2945;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!pf", name = "Y", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!pf", name = "Z", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!pf", name = "cb", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!pf", name = "db", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!pf", name = "jb", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!pf", name = "kb", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!pf", name = "mb", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "[I")
    private int[] field2914;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "[I")
    public int[] field2915;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "[I")
    public int[] field2919;

    @OriginalMember(owner = "client!pf", name = "fb", descriptor = "[I")
    private int[] field2932;

    @OriginalMember(owner = "client!pf", name = "lb", descriptor = "[I")
    public int[] field2938;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "(I)V")
    public static final void method1001(int arg0) {
        class190.field3760.method1083(3056);
        if (arg0 < 59) {
            method1001(-58);
        }
        field2937++;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIILrg;)Lrg;")
    public final class159 method1002(int arg0, int arg1, int arg2, class159 arg3) {
        int var5 = this.field2919[arg0];
        class170 var6 = class116.method899((byte) 127, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        field2929++;
        if (var6 == null) {
            return arg3.method346(true);
        }
        if (arg2 != 1524262960) {
            this.method1010(2, null, 61);
        }
        int var8 = arg1 & 0x3;
        class159 var9 = arg3.method346(!var6.method1199(false, var7));
        if (var8 == 1) {
            var9.method1153();
        } else if (var8 == 2) {
            var9.method1152();
        } else if (var8 == 3) {
            var9.method1149();
        }
        var9.method358(var6, var7);
        if (var8 == 1) {
            var9.method1149();
        } else if (var8 == 2) {
            var9.method1152();
        } else if (var8 == 3) {
            var9.method1153();
        }
        return var9;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lrg;IZ)Lrg;")
    public final class159 method1003(class159 arg0, int arg1, boolean arg2) {
        field2922++;
        int var4 = this.field2919[arg1];
        if (!arg2) {
            this.method1012(null, -26, 52);
        }
        class170 var5 = class116.method899((byte) 127, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method344(true);
        } else {
            class159 var7 = arg0.method344(!var5.method1199(false, var6));
            var7.method358(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lhc;I)V")
    public final void method1004(class66 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method509(121);
            if (var3 == 0) {
                if (arg1 != 5) {
                    this.field2913 = true;
                }
                field2925++;
                return;
            }
            this.method1008(var3, arg0, 11);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)Laf;")
    public static final class7 method1005(int arg0, byte arg1) {
        field2921++;
        class7 var2 = (class7) class191.field3789.method1078((byte) 52, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class67.field1698.method215(arg0, 1, 1);
        if (arg1 != -92) {
            method1005(23, (byte) -99);
        }
        class7 var4 = new class7();
        if (var3 != null) {
            var4.method32(true, new class66(var3), arg0);
        }
        var4.method38(false);
        class191.field3789.method1076((long) arg0, arg1 + 88, var4);
        return var4;
    }

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "(I)[Lfa;")
    public static final class47[] method1006(int arg0) {
        if (arg0 != -5048) {
            field2928 = null;
        }
        field2911++;
        class47[] var1 = new class47[class25.field509];
        for (int var2 = 0; var2 < class25.field509; var2++) {
            class47 var3 = new class47();
            var3.field1146 = class52.field1338;
            var3.field1140 = class117.field2563;
            var3.field1145 = class150.field3101[var2];
            var3.field1143 = class148.field3080[var2];
            var3.field1147 = class30.field605[var2];
            var3.field1144 = class165.field3418[var2];
            var3.field1141 = class10.field227;
            var3.field1142 = class25.field513[var2];
            var1[var2] = var3;
        }
        class90.method758(true);
        return var1;
    }

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "(I)V")
    public final void method1007(int arg0) {
        field2936++;
        if (this.field2924 == -1) {
            if (this.field2932 == null) {
                this.field2924 = 0;
            } else {
                this.field2924 = 2;
            }
        }
        if (this.field2912 == -1) {
            if (this.field2932 == null) {
                this.field2912 = 0;
            } else {
                this.field2912 = 2;
            }
        }
        if (arg0 != 26486) {
            this.method1012(null, -72, -127);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILhc;I)V")
    private final void method1008(int arg0, class66 arg1, int arg2) {
        if (arg0 == 1) {
            int var11 = arg1.method511(arg2 - 137);
            this.field2938 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2938[var12] = arg1.method511(21);
            }
            this.field2919 = new int[var11];
            for (int var13 = 0; var13 < var11; var13++) {
                this.field2919[var13] = arg1.method511(-123);
            }
            for (int var14 = 0; var14 < var11; var14++) {
                this.field2919[var14] += arg1.method511(-119) << 16;
            }
        } else if (arg0 == 2) {
            this.field2935 = arg1.method511(55);
        } else if (arg0 == 3) {
            int var9 = arg1.method509(125);
            this.field2932 = new int[var9 + 1];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2932[var10] = arg1.method509(118);
            }
            this.field2932[var9] = 9999999;
        } else if (arg0 == 4) {
            this.field2913 = true;
        } else if (arg0 == 5) {
            this.field2920 = arg1.method509(arg2 ^ 0x7D);
        } else if (arg0 == 6) {
            this.field2927 = arg1.method511(50);
        } else if (arg0 == 7) {
            this.field2916 = arg1.method511(-123);
        } else if (arg0 == 8) {
            this.field2934 = arg1.method509(126);
        } else if (arg0 == 9) {
            this.field2924 = arg1.method509(121);
        } else if (arg0 == 10) {
            this.field2912 = arg1.method509(arg2 + 109);
        } else if (arg0 == 11) {
            this.field2918 = arg1.method509(arg2 + 114);
        } else if (arg0 == 12) {
            int var6 = arg1.method509(125);
            this.field2914 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2914[var7] = arg1.method511(-126);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field2914[var8] = (arg1.method511(-122) << 16) + this.field2914[var8];
            }
        } else if (arg0 == 13) {
            int var4 = arg1.method509(117);
            this.field2915 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2915[var5] = arg1.method466(class102.method836(arg2, -26256533));
            }
        }
        field2923++;
        if (arg2 != 11) {
            this.field2920 = 69;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILrg;BLpf;I)Lrg;")
    public final class159 method1009(int arg0, class159 arg1, byte arg2, class140 arg3, int arg4) {
        int var6 = 26 % ((arg2 + 24) / 50);
        field2926++;
        int var7 = this.field2919[arg0];
        class170 var8 = class116.method899((byte) 127, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg3.method1012(arg1, arg4, 65535);
        }
        int var10 = arg3.field2919[arg4];
        class170 var11 = class116.method899((byte) 127, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            class159 var13 = arg1.method346(!var8.method1199(false, var9));
            var13.method358(var8, var9);
            return var13;
        } else {
            class159 var14 = arg1.method346(!var8.method1199(false, var9) & !var11.method1199(false, var12));
            var14.method342(var8, var9, var11, var12, this.field2932);
            return var14;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILrg;I)Lrg;")
    public final class159 method1010(int arg0, class159 arg1, int arg2) {
        int var4 = this.field2919[arg0];
        field2930++;
        class170 var5 = class116.method899((byte) 127, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method346(true);
        }
        if (arg2 <= 33) {
            method1001(-128);
        }
        int var7 = 0;
        class170 var8 = null;
        if (this.field2914 != null && arg0 < this.field2914.length) {
            int var9 = this.field2914[arg0];
            var8 = class116.method899((byte) 127, var9 >> 16);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class159 var11 = arg1.method346(!var5.method1199(false, var6));
            var11.method358(var5, var6);
            return var11;
        } else {
            class159 var10 = arg1.method346(!var5.method1199(false, var6) & !var8.method1199(false, var7));
            var10.method358(var5, var6);
            var10.method358(var8, var7);
            return var10;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)V")
    public static void method1011(byte arg0) {
        field2944 = null;
        field2931 = null;
        field2940 = null;
        field2945 = null;
        if (arg0 != -36) {
            method1006(5);
        }
        field2928 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lrg;II)Lrg;")
    public final class159 method1012(class159 arg0, int arg1, int arg2) {
        field2939++;
        int var4 = this.field2919[arg1];
        class170 var5 = class116.method899((byte) 127, var4 >> 16);
        int var6 = var4 & arg2;
        if (var5 == null) {
            return arg0.method346(true);
        } else {
            class159 var7 = arg0.method346(!var5.method1199(false, var6));
            var7.method358(var5, var6);
            return var7;
        }
    }
}
