import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public abstract class class487 {

    @OriginalMember(owner = "client!km", name = "e", descriptor = "Lbc;")
    public class187 field6863;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    public int field6871;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public static int field6867 = 0;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    public static int field6870 = 0;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "Z")
    public static volatile boolean field6868 = true;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "[I")
    public static int[] field6862 = new int[4096];

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "I")
    public static int field6874;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "Lj;")
    public static class436 field6864;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([IIIII)Laq;")
    public abstract class385 method1073(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(F)V")
    public abstract void method1154(float arg0);

    @OriginalMember(owner = "client!km", name = "d", descriptor = "()V")
    public abstract void method1111();

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V")
    public abstract void method1065(boolean arg0);

    @OriginalMember(owner = "client!km", name = "e", descriptor = "()V")
    public abstract void method1066();

    @OriginalMember(owner = "client!km", name = "f", descriptor = "()V")
    public abstract void method1122();

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1062(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!km", name = "g", descriptor = "()Z")
    public abstract boolean method1096();

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
    public abstract void method1087(int arg0);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lop;Lop;FLop;)Lop;")
    public abstract class63 method1103(class63 arg0, class63 arg1, float arg2, class63 arg3);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lgr;IIII)Lab;")
    public abstract class232 method1088(class85 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lsa;)V")
    public abstract void method1052(class168 arg0);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1054(Canvas arg0);

    @OriginalMember(owner = "client!km", name = "h", descriptor = "()Z")
    public abstract boolean method1074();

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIII)V")
    public abstract void method1130(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!km", name = "i", descriptor = "()Z")
    public abstract boolean method1132();

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lss;[Lua;Z)Loj;")
    public abstract class485 method1061(class76 arg0, class140[] arg1, boolean arg2);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/awt/Canvas;ILdq;IILbc;)Lkm;")
    public static final synchronized class487 method2858(Canvas arg0, int arg1, class14 arg2, int arg3, int arg4, class187 arg5) {
        field6865++;
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class232.field3273[var7]) {
                var6 = var7;
                break;
            }
        }
        if (~var6 == arg3) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class487 var9;
        if (arg1 == 0) {
            var9 = class128.method781(var6, arg5, 113, arg0);
        } else if (arg1 == 1) {
            var9 = class181.method1185(var6, arg4, arg5, (byte) 63, arg2, arg0);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class232.field3273[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIII)V")
    public abstract void method1127(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!km", name = "j", descriptor = "()Z")
    public abstract boolean method1098();

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IBIII)V")
    public final void method2859(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        this.method1130(arg2, arg4, arg0, arg3, 1);
        field6859++;
        if (arg1 != -6) {
            this.method1122();
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(IIII)V")
    public abstract void method1094(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!km", name = "k", descriptor = "()I")
    public abstract int method1112();

    @OriginalMember(owner = "client!km", name = "l", descriptor = "()F")
    public abstract float method1140();

    @OriginalMember(owner = "client!km", name = "m", descriptor = "()I")
    public abstract int method1128();

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
    public abstract void method1060(int arg0);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)I")
    public abstract int method1067(int arg0, int arg1);

    @OriginalMember(owner = "client!km", name = "n", descriptor = "()Z")
    public abstract boolean method1082();

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lab;Lnd;Ldr;Lbm;I)V")
    public abstract void method1063(class232 arg0, class473 arg1, class250 arg2, class219 arg3, int arg4);

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(IIIIII)V")
    public final void method2860(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6860++;
        this.method1107(arg2, arg4, arg1, arg0, arg3, arg5);
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(I)V")
    public static void method2861(int arg0) {
        if (arg0 >= -72) {
            method2865(11, -98, -68, (class23) null);
        }
        field6864 = null;
        field6862 = null;
    }

    @OriginalMember(owner = "client!km", name = "o", descriptor = "()Z")
    public abstract boolean method1086();

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I[Lrc;)V")
    public abstract void method1083(int arg0, class488[] arg1);

    @OriginalMember(owner = "client!km", name = "p", descriptor = "()I")
    public abstract int method1084();

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIBI)V")
    public final void method2862(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field6874++;
        this.method1125(arg4, arg0, arg1, arg2, 1);
        if (arg3 != 36) {
            this.method1128();
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIII[BII)V")
    public abstract void method1152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!km", name = "q", descriptor = "()Ldr;")
    public abstract class250 method1124();

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILvb;II)V")
    public abstract void method1110(int arg0, class90 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!km", name = "r", descriptor = "()V")
    public abstract void method1091();

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(I)V")
    public abstract void method1104(int arg0);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIZ)V")
    public final void method2863(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method1120(arg0, arg3, arg4, arg2, arg1, 1);
        field6873++;
        if (!arg5) {
            this.method1066();
        }
    }

    @OriginalMember(owner = "client!km", name = "s", descriptor = "()Z")
    public abstract boolean method1078();

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(II)I")
    public abstract int method1102(int arg0, int arg1);

    @OriginalMember(owner = "client!km", name = "e", descriptor = "(I)Lsa;")
    public abstract class168 method1081(int arg0);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIZ)Laq;")
    public abstract class385 method1133(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!km", name = "t", descriptor = "()Z")
    public abstract boolean method1142();

    @OriginalMember(owner = "client!km", name = "u", descriptor = "()Z")
    public abstract boolean method1136();

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II[I[I)Lvb;")
    public abstract class90 method1148(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method1070(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(IIII)V")
    public abstract void method1079(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!km", name = "v", descriptor = "()V")
    public abstract void method1058();

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lop;)V")
    public abstract void method1064(class63 arg0);

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(IIIII)V")
    public final void method2864(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 0) {
            this.method2864(-62, 43, 108, 51, -76);
        }
        field6866++;
        this.method1118(arg2, arg4, arg3, arg1, 1);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lnd;)V")
    public abstract void method1115(class473 arg0);

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(IIIII)V")
    public abstract void method1118(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!km", name = "w", descriptor = "()V")
    public abstract void method1137();

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIILqr;)V")
    public static final void method2865(int arg0, int arg1, int arg2, class23 arg3) {
        field6861++;
        if (arg3.field1128 == arg0 && arg0 != -1) {
            class372 var4 = class31.field505.method950(true, arg0);
            int var5 = var4.field5271;
            if (var5 == 1) {
                arg3.field1064 = 0;
                arg3.field1126 = 0;
                arg3.field1071 = 0;
                arg3.field1124 = 1;
                arg3.field1110 = arg1;
                class272.method1706(arg3.field6766, var4, class2.field21 == arg3, (byte) 31, arg3.field6765, arg3.field6746, arg3.field1064);
            }
            if (var5 == 2) {
                arg3.field1071 = 0;
            }
        } else if (arg0 == -1 || arg3.field1128 == -1 || class31.field505.method950(true, arg0).field5260 >= class31.field505.method950(true, arg3.field1128).field5260) {
            arg3.field1064 = 0;
            arg3.field1138 = arg3.field1142;
            arg3.field1110 = arg1;
            arg3.field1128 = arg0;
            arg3.field1071 = 0;
            arg3.field1126 = 0;
            arg3.field1124 = 1;
            if (arg3.field1128 != -1) {
                class272.method1706(arg3.field6766, class31.field505.method950(true, arg3.field1128), class2.field21 == arg3, (byte) 31, arg3.field6765, arg3.field6746, arg3.field1064);
            }
        }
        int var6 = 14 / ((-arg2 - 71) / 46);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lua;Z)Laq;")
    public abstract class385 method1139(class140 arg0, boolean arg1);

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(IIIII)V")
    public abstract void method1125(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(FF)V")
    public abstract void method1144(float arg0, float arg1);

    @OriginalMember(owner = "client!km", name = "f", descriptor = "(I)V")
    public abstract void method1099(int arg0);

    @OriginalMember(owner = "client!km", name = "x", descriptor = "()I")
    public abstract int method1056();

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(II)V")
    public abstract void method1138(int arg0, int arg1);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IFFFFF)V")
    public abstract void method1153(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!km", name = "y", descriptor = "()Z")
    public abstract boolean method1126();

    @OriginalMember(owner = "client!km", name = "g", descriptor = "(I)V")
    public abstract void method1141(int arg0);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([I)V")
    public abstract void method1077(int[] arg0);

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(II)V")
    public abstract void method1106(int arg0, int arg1);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IZIIII)V")
    public final void method2866(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1076(arg5, arg3, arg0, arg2, arg4, 1);
        if (arg1) {
            field6872++;
        }
    }

    @OriginalMember(owner = "client!km", name = "z", descriptor = "()V")
    public abstract void method1101();

    @OriginalMember(owner = "client!km", name = "A", descriptor = "()Z")
    public abstract boolean method1123();

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(IIII)[I")
    public abstract int[] method1149(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!km", name = "B", descriptor = "()I")
    public abstract int method1134();

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(IIIIII)Z")
    public abstract boolean method1113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III[I)V")
    public abstract void method1095(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!km", name = "C", descriptor = "()I")
    public abstract int method1051();

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ldr;)V")
    public abstract void method1071(class250 arg0);

    @OriginalMember(owner = "client!km", name = "D", descriptor = "()V")
    public abstract void method1129();

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([Lab;Ldr;[Lbm;I)V")
    public abstract void method1147(class232[] arg0, class250 arg1, class219[] arg2, int arg3);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method1072(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(FFF)V")
    public abstract void method1069(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II[[I[[IIII)Ldh;")
    public abstract class269 method1143(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(IIIIII)V")
    public abstract void method1120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIILvb;II)V")
    public abstract void method1090(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class90 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!km", name = "e", descriptor = "(IIIIII)Lop;")
    public abstract class63 method1053(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!km", name = "e", descriptor = "(IIII)V")
    public abstract void method1117(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!km", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method2867(-8615);
        field6875++;
    }

    @OriginalMember(owner = "client!km", name = "E", descriptor = "()Z")
    public abstract boolean method1092();

    @OriginalMember(owner = "client!km", name = "f", descriptor = "(IIII)V")
    public abstract void method1116(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([Lab;Lnd;Ldr;[Lbm;I)V")
    public abstract void method1093(class232[] arg0, class473 arg1, class250 arg2, class219[] arg3, int arg4);

    @OriginalMember(owner = "client!km", name = "F", descriptor = "()F")
    public abstract float method1097();

    @OriginalMember(owner = "client!km", name = "G", descriptor = "()V")
    public abstract void method1119();

    @OriginalMember(owner = "client!km", name = "H", descriptor = "()V")
    public abstract void method1055();

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(ILbc;)V")
    public class487(int arg0, class187 arg1) {
        this.field6863 = arg1;
        this.field6871 = arg0;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(Z)V")
    public abstract void method1100(boolean arg0);

    @OriginalMember(owner = "client!km", name = "I", descriptor = "()Z")
    public abstract boolean method1121();

    @OriginalMember(owner = "client!km", name = "J", descriptor = "()Z")
    public abstract boolean method1085();

    @OriginalMember(owner = "client!km", name = "f", descriptor = "(IIIIII)V")
    public abstract void method1076(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!km", name = "h", descriptor = "(I)V")
    public final void method2867(int arg0) {
        if (arg0 != -8615) {
            field6867 = 38;
        }
        class232.field3273[this.field6871] = false;
        field6869++;
        this.method1129();
    }

    @OriginalMember(owner = "client!km", name = "K", descriptor = "()Z")
    public abstract boolean method1145();

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(Z)V")
    public abstract void method1108(boolean arg0);

    @OriginalMember(owner = "client!km", name = "L", descriptor = "()Ldr;")
    public abstract class250 method1105();

    @OriginalMember(owner = "client!km", name = "g", descriptor = "(IIII)V")
    public abstract void method1075(int arg0, int arg1, int arg2, int arg3);
}
