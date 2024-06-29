import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class562 {

    @OriginalMember(owner = "client!r", name = "k", descriptor = "Lfa;")
    public class522 field7682;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public int field7672;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "[I")
    public static int[] field7683 = new int[1];

    @OriginalMember(owner = "client!r", name = "o", descriptor = "Lvu;")
    public static class204 field7686 = new class204();

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field7673;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field7674;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field7675;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field7676;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field7677;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field7679;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field7680;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field7681;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field7684;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field7685;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field7687;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1052(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1126(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "CA", descriptor = "(IIII)V")
    public abstract void method1072(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()Z")
    public abstract boolean method1087();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
    public abstract void method1058(boolean arg0);

    @OriginalMember(owner = "client!r", name = "VA", descriptor = "(IFFFFF)V")
    public abstract void method1060(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public abstract void method1038(int arg0);

    @OriginalMember(owner = "client!r", name = "YA", descriptor = "(IIII)V")
    public abstract void method1064(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method1056(Rectangle[] arg0, int arg1) throws class56;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "()I")
    public abstract int method1062();

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public abstract void method1082(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I[Lqea;)V")
    public abstract void method1111(int arg0, class392[] arg1);

    @OriginalMember(owner = "client!r", name = "finalize", descriptor = "()V")
    protected void finalize() {
        this.method3127(true);
        field7685++;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)Le;")
    public abstract class381 method1078(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lec;I)V")
    public abstract void method1120(class144 arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "DA", descriptor = "()I")
    public abstract int method1119();

    @OriginalMember(owner = "client!r", name = "JA", descriptor = "()V")
    public abstract void method1044();

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1143(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "AA", descriptor = "(III[I)V")
    public abstract void method1045(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()I")
    public abstract int method1133();

    @OriginalMember(owner = "client!r", name = "m", descriptor = "(IIIII)V")
    public abstract void method1149(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lcca;IIII)Lda;")
    public abstract class470 method1089(class250 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "d", descriptor = "()Z")
    public abstract boolean method1074();

    @OriginalMember(owner = "client!r", name = "V", descriptor = "(IIII)V")
    public abstract void method1077(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method3117(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field7677++;
        if (arg5 <= 88) {
            field7683 = null;
        }
        int var7 = arg3 - arg6;
        int var8 = arg0 + arg6;
        for (int var9 = arg0; var9 < var8; var9++) {
            class285.method1691(arg2, class315.field4224[var9], -7, arg1, arg4);
        }
        int var10 = arg2 - arg6;
        int var11 = arg1 + arg6;
        for (int var12 = arg3; var12 > var7; var12--) {
            class285.method1691(arg2, class315.field4224[var12], -7, arg1, arg4);
        }
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class315.field4224[var13];
            class285.method1691(var11, var14, -7, arg1, arg4);
            class285.method1691(arg2, var14, -7, var10, arg4);
        }
    }

    @OriginalMember(owner = "client!r", name = "XA", descriptor = "(IIIII)V")
    public abstract void method1144(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "()Lq;")
    public abstract class487 method1075();

    @OriginalMember(owner = "client!r", name = "f", descriptor = "()Z")
    public abstract boolean method1106();

    @OriginalMember(owner = "client!r", name = "FA", descriptor = "(ILua;II)V")
    public abstract void method1095(int arg0, class596 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lf;Z)V")
    public abstract void method1107(class532 arg0, boolean arg1);

    @OriginalMember(owner = "client!r", name = "g", descriptor = "()Z")
    public abstract boolean method1135();

    @OriginalMember(owner = "client!r", name = "h", descriptor = "()V")
    public abstract void method1142();

    @OriginalMember(owner = "client!r", name = "i", descriptor = "()Z")
    public abstract boolean method1099();

    @OriginalMember(owner = "client!r", name = "j", descriptor = "()V")
    public abstract void method1151() throws class56;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "()Lq;")
    public abstract class487 method1136();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZIIIII)V")
    public final void method3118(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7687++;
        if (!arg0) {
            method3119(12);
        }
        this.method1113(arg2, arg3, arg4, arg1, arg5, 1);
    }

    @OriginalMember(owner = "client!r", name = "l", descriptor = "()Laa;")
    public abstract class102 method1141();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)Lf;")
    public abstract class532 method1040(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!r", name = "L", descriptor = "()V")
    public abstract void method1148();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lit;)V")
    public abstract void method1048(class513 arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Le;)V")
    public abstract void method1129(class381 arg0);

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
    public static void method3119(int arg0) {
        if (arg0 >= -12) {
            field7686 = null;
        }
        field7683 = null;
        field7686 = null;
    }

    @OriginalMember(owner = "client!r", name = "ya", descriptor = "()V")
    public abstract void method1147();

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
    public abstract void method1063(int arg0);

    @OriginalMember(owner = "client!r", name = "m", descriptor = "()V")
    public abstract void method1061();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIF)Lqea;")
    public abstract class392 method1152(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
    public final void method3120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7673++;
        if (arg0 == 11743) {
            this.method1101(arg2, arg5, arg4, arg3, arg1, 1);
        }
    }

    @OriginalMember(owner = "client!r", name = "ja", descriptor = "(I)V")
    public abstract void method1146(int arg0);

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
    public abstract void method1081(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([IIIII)Lf;")
    public abstract class532 method1122(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([I)V")
    public abstract void method1127(int[] arg0);

    @OriginalMember(owner = "client!r", name = "n", descriptor = "()Z")
    public abstract boolean method1112();

    @OriginalMember(owner = "client!r", name = "J", descriptor = "(IIIIII)V")
    public abstract void method1113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "O", descriptor = "(IIIIII)Z")
    public abstract boolean method1083(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lf;B)V")
    public final void method3121(class532 arg0, byte arg1) {
        field7680++;
        this.method1107(arg0, true);
        int var3 = -34 / ((arg1 + 36) / 53);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method1070(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIII)V")
    public abstract void method1102(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ltq;Z)Lf;")
    public abstract class532 method1139(class92 arg0, boolean arg1);

    @OriginalMember(owner = "client!r", name = "IA", descriptor = "(IIIIII[BII)V")
    public abstract void method1066(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIII)V")
    public abstract void method1121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "o", descriptor = "()V")
    public abstract void method1114();

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1132(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
    public abstract void method1140(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "p", descriptor = "()Z")
    public abstract boolean method1100();

    @OriginalMember(owner = "client!r", name = "q", descriptor = "()V")
    public abstract void method1050();

    @OriginalMember(owner = "client!r", name = "BA", descriptor = "()I")
    public abstract int method1054();

    @OriginalMember(owner = "client!r", name = "r", descriptor = "()Lq;")
    public abstract class487 method1153();

    @OriginalMember(owner = "client!r", name = "s", descriptor = "()Z")
    public abstract boolean method1069();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
    public final void method3122(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1144(arg1, arg2, arg4, arg3, arg0);
        field7674++;
    }

    @OriginalMember(owner = "client!r", name = "v", descriptor = "()[I")
    public abstract int[] method1110();

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(IIIIII)Lit;")
    public abstract class513 method1138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
    public abstract int method1080(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "ZA", descriptor = "(Z)V")
    public abstract void method1091(boolean arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(FFF)V")
    public abstract void method1079(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIII)V")
    public final void method3123(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1149(arg2, arg4, arg0, arg1, arg3);
        field7676++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIILua;II)V")
    public abstract void method1055(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class596 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
    public abstract int method1137();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[I[I)Lua;")
    public abstract class596 method1128(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(IIIII)V")
    public final void method3124(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7678++;
        this.method1102(arg3, arg0, arg4, arg1, arg2);
    }

    @OriginalMember(owner = "client!r", name = "da", descriptor = "(IIII)V")
    public abstract void method1042(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "t", descriptor = "()Z")
    public abstract boolean method1098();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public abstract class270 method1037(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Canvas;BLfa;)Lr;")
    private static final class562 method3125(Canvas arg0, byte arg1, class522 arg2) {
        int var3 = 15 % ((-arg1 - 65) / 60);
        field7679++;
        return new class415(arg0, arg2);
    }

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
    public abstract void method1109(int arg0);

    @OriginalMember(owner = "client!r", name = "u", descriptor = "()Z")
    public abstract boolean method1071();

    @OriginalMember(owner = "client!r", name = "oa", descriptor = "([I)V")
    public abstract void method1057(int[] arg0);

    @OriginalMember(owner = "client!r", name = "la", descriptor = "(IIII)V")
    public abstract void method1088(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(IIIIII)V")
    public final void method3126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7684++;
        this.method1121(arg1, arg0, arg4, arg2, arg5, arg3);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Laga;[Ltq;Z)Lla;")
    public abstract class409 method1130(class658 arg0, class92[] arg1, boolean arg2);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!r", name = "w", descriptor = "()Z")
    public abstract boolean method1117();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lec;)V")
    public abstract void method1096(class144 arg0);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
    public abstract void method1093(boolean arg0);

    @OriginalMember(owner = "client!r", name = "x", descriptor = "()V")
    public abstract void method1150();

    @OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
    public abstract int method1108();

    @OriginalMember(owner = "client!r", name = "y", descriptor = "()Z")
    public abstract boolean method1094();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lit;Lit;FLit;)Lit;")
    public abstract class513 method1154(class513 arg0, class513 arg1, float arg2, class513 arg3);

    @OriginalMember(owner = "client!r", name = "va", descriptor = "(I)V")
    public abstract void method1049(int arg0);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(Z)V")
    public final void method3127(boolean arg0) {
        class696.field9852[this.field7672] = false;
        field7681++;
        this.method1142();
        if (!arg0) {
            this.field7682 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILjava/awt/Canvas;Lga;ILfa;)Lr;")
    public static final synchronized class562 method3128(int arg0, int arg1, Canvas arg2, class332 arg3, int arg4, class522 arg5) {
        field7675++;
        if (arg4 == 0) {
            return method3125(arg2, (byte) -128, arg5);
        } else if (arg4 == 2) {
            return class630.method3492(arg2, arg5, 76);
        } else if (arg4 == 1) {
            return class146.method835(arg2, 0, arg0, arg5);
        } else if (arg4 == 5) {
            return class184.method1218(arg0, 121, arg3, arg5, arg2);
        } else {
            if (arg1 != -21939) {
                method3119(47);
            }
            if (arg4 != 3) {
                throw new IllegalArgumentException("UM");
            }
            return class243.method1492(arg5, arg2, true, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(IIII)[I")
    public abstract int[] method1068(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I")
    public abstract int method1053(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIIII)V")
    public abstract void method1101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "z", descriptor = "()V")
    public abstract void method1092();

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lfa;)V")
    public class562(class522 arg0) {
        this.field7682 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class696.field9852[var3]) {
                var2 = var3;
                class696.field9852[var3] = true;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field7672 = var2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZ)Lf;")
    public abstract class532 method1076(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!r", name = "GA", descriptor = "(II)V")
    public abstract void method1090(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "MA", descriptor = "(III[I)V")
    public abstract void method1118(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lq;)V")
    public abstract void method1123(class487 arg0);

    @OriginalMember(owner = "client!r", name = "A", descriptor = "()V")
    public abstract void method1125();

    @OriginalMember(owner = "client!r", name = "ra", descriptor = "(F)V")
    public abstract void method1041(float arg0);

    @OriginalMember(owner = "client!r", name = "pa", descriptor = "(III)V")
    public abstract void method1073(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "B", descriptor = "()Z")
    public abstract boolean method1084();

    @OriginalMember(owner = "client!r", name = "C", descriptor = "()Z")
    public abstract boolean method1065();
}
