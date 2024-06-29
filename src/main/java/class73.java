import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class73 extends class276 {

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
    private int field1060 = 0;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
    private int field1063 = -32768;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "Z")
    private boolean field1058 = false;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "I")
    private int field1064 = 0;

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "Z")
    public boolean field1065 = false;

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
    private int field1078 = -1;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
    public int field1066;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
    private int field1061;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
    public int field1074;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "I")
    public int field1077;

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "Ldj;")
    private class200 field1082;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "[I")
    public static int[] field1059 = new int[100];

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public static int field1067 = 3;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "Lrc;")
    public static class69 field1080 = new class69();

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "Ljava/lang/String;")
    public static String field1083 = "Starting 3d Library";

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "Lgd;")
    private class77 field1072;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
    public static void method463(int arg0) {
        field1059 = null;
        field1083 = null;
        field1080 = null;
        if (arg0 != 8) {
            field1067 = 62;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILrk;)V")
    private final void method464(int arg0, class293 arg1) {
        field1069++;
        class191 var3 = (class191) arg1;
        if ((this.field1072 == null || this.field1072.field1207) && (var3.field2976 != null || var3.field2946 != null)) {
            this.field1072 = new class77(class4.field32, 1, 1);
        }
        if (this.field1072 != null) {
            this.field1072.method519(var3.field2976, var3.field2946, false, var3.field2944, var3.field2965, var3.field2973);
        }
        if (arg0 == 0) {
            this.field1058 = true;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lkk;I)V")
    public static final void method465(class254 arg0, int arg1) {
        class254 var2 = class76.method497(arg0, (byte) 60);
        field1070++;
        if (arg1 != 8) {
            method463(-77);
        }
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class79.field1254;
            var3 = class169.field2644;
        } else {
            var3 = var2.field4085;
            var4 = var2.field4152;
        }
        class219.method1532(false, arg0, var3, -1, var4);
        class137.method917((byte) -98, arg0, var4, var3);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "()I")
    public final int method206() {
        field1079++;
        return this.field1063;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(IIIII)V")
    public final void method209(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1075++;
        if (!this.field1058) {
            class293 var6 = this.method467(0);
            if (var6 == null) {
                return;
            }
            this.method464(0, var6);
        }
        if (this.field1072 != null) {
            this.field1072.method516(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
    public static final void method466(int arg0) {
        class97.field1437.method145(arg0 ^ 0xFFFFA070);
        field1068++;
        if (arg0 != 24521) {
            method465((class254) null, 64);
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)Lrk;")
    private final class293 method467(int arg0) {
        field1076++;
        class119 var2 = class278.method1939(this.field1061, (byte) -120);
        if (arg0 != 0) {
            return null;
        }
        class293 var3;
        if (this.field1065) {
            var3 = var2.method774((byte) 126, -1, 0, -1);
        } else {
            var3 = var2.method774((byte) 50, this.field1078, this.field1064, this.field1060);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIIIIJILgd;)V")
    public final void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class77 arg10) {
        field1071++;
        class293 var13 = this.method467(0);
        if (var13 != null) {
            this.method464(0, var13);
            var13.method205(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1072);
            this.field1063 = var13.method206();
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V")
    public final void method468(int arg0, int arg1) {
        field1081++;
        if (this.field1065) {
            return;
        }
        this.field1064 += arg0;
        while (this.field1082.field3168[this.field1060] < this.field1064) {
            this.field1064 -= this.field1082.field3168[this.field1060];
            this.field1060++;
            if (this.field1060 >= this.field1082.field3167.length) {
                this.field1065 = true;
                break;
            }
        }
        if (!this.field1065) {
            class49.method303(false, false, this.field1074, this.field1060, this.field1082, this.field1057);
        }
        if (arg1 != 21395) {
            this.field1061 = -37;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(III)Z")
    public static final boolean method469(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class82.field1297; var3++) {
            class230 var4 = class55.field741[var3];
            if (var4.field3683 == 1) {
                int var5 = var4.field3672 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3693 * var5 >> 8) + var4.field3674;
                    int var7 = (var4.field3677 * var5 >> 8) + var4.field3696;
                    int var8 = (var4.field3679 * var5 >> 8) + var4.field3681;
                    int var9 = (var4.field3668 * var5 >> 8) + var4.field3669;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3683 == 2) {
                int var10 = arg0 - var4.field3672;
                if (var10 > 0) {
                    int var11 = (var4.field3693 * var10 >> 8) + var4.field3674;
                    int var12 = (var4.field3677 * var10 >> 8) + var4.field3696;
                    int var13 = (var4.field3679 * var10 >> 8) + var4.field3681;
                    int var14 = (var4.field3668 * var10 >> 8) + var4.field3669;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3683 == 3) {
                int var15 = var4.field3674 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3671 * var15 >> 8) + var4.field3672;
                    int var17 = (var4.field3691 * var15 >> 8) + var4.field3685;
                    int var18 = (var4.field3679 * var15 >> 8) + var4.field3681;
                    int var19 = (var4.field3668 * var15 >> 8) + var4.field3669;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3683 == 4) {
                int var20 = arg2 - var4.field3674;
                if (var20 > 0) {
                    int var21 = (var4.field3671 * var20 >> 8) + var4.field3672;
                    int var22 = (var4.field3691 * var20 >> 8) + var4.field3685;
                    int var23 = (var4.field3679 * var20 >> 8) + var4.field3681;
                    int var24 = (var4.field3668 * var20 >> 8) + var4.field3669;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3683 == 5) {
                int var25 = arg1 - var4.field3681;
                if (var25 > 0) {
                    int var26 = (var4.field3671 * var25 >> 8) + var4.field3672;
                    int var27 = (var4.field3691 * var25 >> 8) + var4.field3685;
                    int var28 = (var4.field3693 * var25 >> 8) + var4.field3674;
                    int var29 = (var4.field3677 * var25 >> 8) + var4.field3696;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(IIIIIII)V")
    public class73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1062 = arg4;
        this.field1057 = arg3;
        this.field1066 = arg1;
        this.field1061 = arg0;
        this.field1074 = arg2;
        this.field1077 = arg5 + arg6;
        int var8 = class278.method1939(this.field1061, (byte) -104).field1810;
        if (var8 == -1) {
            this.field1065 = true;
        } else {
            this.field1065 = false;
            this.field1082 = class196.method1359(var8, (byte) 21);
        }
        if (this.field1077 == arg6) {
            class49.method303(false, false, this.field1074, this.field1060, this.field1082, this.field1057);
        }
    }
}
