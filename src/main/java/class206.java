import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class206 {

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "Ln;")
    public class17 field2481;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public int field2475;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Lcea;")
    public static class180 field2471 = new class180("Loading shaders", "Lade shaders", "Chargement des nuanceurs", "Carregando sombreamento - ");

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "[I")
    public static int[] field2485 = new int[8];

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V", line = 8)
    public final void method1103(byte arg0) {
        field2476++;
        if (arg0 != 94) {
            field2483 = -114;
        }
        class193.field2327[this.field2475] = false;
        this.method1158();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V", line = 31)
    public final void method1113(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2477++;
        this.method1124(arg0, arg1, arg4, arg3, 1);
        int var6 = -4 % ((-arg2 - 42) / 53);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)V", line = 42)
    public final void method1115(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method1130(arg3, arg2, arg0, arg1, 1);
        field2473++;
        if (!arg4) {
            this.method1120(-78, 114, -66);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBIIII)V", line = 60)
    public final void method1118(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1133(arg3, arg4, arg2, arg5, arg0, 1);
        field2472++;
        if (arg1 <= 38) {
            field2480 = 87;
        }
    }

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V", line = 99)
    protected void finalize() {
        field2474++;
        this.method1103((byte) 94);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIBI)V", line = 134)
    public final void method1151(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 >= 102) {
            this.method1142(arg5, arg0, arg1, arg3, arg2, 1);
            field2478++;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;IBLdn;Ln;I)Lqa;", line = 145)
    public static final synchronized class206 method1152(Canvas arg0, int arg1, byte arg2, class438 arg3, class17 arg4, int arg5) {
        field2470++;
        if (arg5 == 0) {
            return class448.method2622(1, false, arg4, arg0);
        } else if (arg5 == 2) {
            return class57.method330(arg4, arg0, arg2 + 74);
        } else if (arg5 == 4) {
            return class448.method2622(arg2 ^ 0x33, true, arg4, arg0);
        } else if (arg5 == 1) {
            return class535.method3053(arg4, (byte) -111, arg0, arg1);
        } else if (arg5 == 5) {
            return class436.method2528(arg1, arg3, -4757, arg0, arg4);
        } else if (arg2 != 50) {
            return null;
        } else if (arg5 == 3) {
            return class72.method393(arg3, (byte) 106, arg1, arg0, arg4);
        } else {
            throw new IllegalArgumentException("UM");
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIZII)V", line = 187)
    public final void method1154(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (!arg3) {
            this.method1150();
        }
        this.method1168(arg0, arg5, arg2, arg4, arg1, 1);
        field2479++;
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V", line = 220)
    public static void method1170(int arg0) {
        field2471 = null;
        field2485 = null;
        if (arg0 > -52) {
            field2483 = -60;
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Ln;)V", line = 249)
    public class206(class17 arg0) {
        this.field2481 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class193.field2327[var3]) {
                var2 = var3;
                class193.field2327[var3] = true;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field2475 = var2;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V", line = 300)
    public final void method1195(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1110(arg1, arg4, arg2, arg3, arg0);
        field2484++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()Z")
    public abstract boolean method1100();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ldp;Z)Lha;")
    public abstract class52 method1101(class3 arg0, boolean arg1);

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "(IIIIII)Z")
    public abstract boolean method1102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()Z")
    public abstract boolean method1104();

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()Z")
    public abstract boolean method1105();

    @OriginalMember(owner = "client!qa", name = "la", descriptor = "(FF)V")
    public abstract void method1106(float arg0, float arg1);

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "(IIII)V")
    public abstract void method1107(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "()Z")
    public abstract boolean method1108();

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "()V")
    public abstract void method1109();

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIIII)V")
    public abstract void method1110(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "(IIII)[I")
    public abstract int[] method1111(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "IA", descriptor = "(III[I)V")
    public abstract void method1112(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lha;")
    public abstract class52 method1114(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method268(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lr;Lm;[Lcf;I)V")
    public abstract void method273(class157[] arg0, class163 arg1, class517[] arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public abstract void method1116(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "()V")
    public abstract void method1117();

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "(IIII)V")
    public abstract void method1119(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "(III)V")
    public abstract void method1120(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "(I)V")
    public abstract void method1121(int arg0);

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "()I")
    public abstract int method1122();

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "()V")
    public abstract void method1123();

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "(IIIII)V")
    public abstract void method1124(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "za", descriptor = "(IIIIII[BII)V")
    public abstract void method1125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "()Lm;")
    public abstract class163 method1126();

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "()I")
    public abstract int method1127();

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "()Z")
    public abstract boolean method271();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
    public abstract int method1128(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "CA", descriptor = "()I")
    public abstract int method1129();

    @OriginalMember(owner = "client!qa", name = "UA", descriptor = "(IIIII)V")
    public abstract void method1130(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "()V")
    public abstract void method1131();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
    public abstract void method1132(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(IIIIII)V")
    public abstract void method1133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lcba;")
    public abstract class469 method1134(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
    public abstract boolean method1135();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)Lmv;")
    public abstract class313 method1136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "()V")
    public abstract void method1137();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method274(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lr;Lka;Lm;[Lcf;I)V")
    public abstract void method270(class157[] arg0, class400 arg1, class163 arg2, class517[] arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public abstract void method1138(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method1139(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lka;)V")
    public abstract void method1140(class400 arg0);

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
    public abstract boolean method1141();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)V")
    public abstract void method1142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "()Z")
    public abstract boolean method1143();

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "()Z")
    public abstract boolean method1144();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
    public abstract int method1145(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "xa", descriptor = "()V")
    public abstract void method1146();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public abstract void method272(int arg0);

    @OriginalMember(owner = "client!qa", name = "ba", descriptor = "()I")
    public abstract int method1147();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lpa;")
    public abstract class309 method1148(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public abstract class174 method265(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1149(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "()Lm;")
    public abstract class163 method1150();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lei;IIII)Lr;")
    public abstract class157 method277(class152 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lfc;[Ldp;Z)Lra;")
    public abstract class90 method1153(class216 arg0, class3[] arg1, boolean arg2);

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
    public abstract boolean method1155();

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "(I)V")
    public abstract void method1156(int arg0);

    @OriginalMember(owner = "client!qa", name = "YA", descriptor = "()I")
    public abstract int method1157();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
    public abstract void method278(int arg0);

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "()V")
    public abstract void method1158();

    @OriginalMember(owner = "client!qa", name = "JA", descriptor = "(IIII)V")
    public abstract void method1159(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lm;)V")
    public abstract void method1160(class163 arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIZ)Lha;")
    public abstract class52 method1161(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lmv;Lmv;FLmv;)Lmv;")
    public abstract class313 method1162(class313 arg0, class313 arg1, float arg2, class313 arg3);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
    public abstract void method1163(int arg0);

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "(IIII)V")
    public abstract void method1164(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "(F)V")
    public abstract void method1165(float arg0);

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "()V")
    public abstract void method1166();

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "()F")
    public abstract float method1167();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)V")
    public abstract void method1168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "()Z")
    public abstract boolean method1169();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
    public abstract void method1171(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "()Lfd;")
    public abstract class448 method1172();

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z")
    public abstract boolean method1173();

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "()Z")
    public abstract boolean method1174();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()I")
    public abstract int method1175();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lu;)V")
    public abstract void method1176(class64 arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lr;Lka;Lm;Lcf;I)V")
    public abstract void method1177(class157 arg0, class400 arg1, class163 arg2, class517 arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILpa;II)V")
    public abstract void method1178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class309 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
    public abstract void method275(int arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIII)V")
    public abstract void method1179(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "(ILpa;II)V")
    public abstract void method1180(int arg0, class309 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
    public abstract void method1181(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "()V")
    public abstract void method1182();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "([I)V")
    public abstract void method1183(int[] arg0);

    @OriginalMember(owner = "client!qa", name = "ta", descriptor = "(II)V")
    public abstract void method1184(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
    public abstract void method1185(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "ra", descriptor = "()F")
    public abstract float method1186();

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1187(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "(IFFFFF)V")
    public abstract void method1188(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lmv;)V")
    public abstract void method1189(class313 arg0);

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "()Z")
    public abstract boolean method1190();

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)Lu;")
    public abstract class64 method1191(int arg0);

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "()V")
    public abstract void method1192();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lcba;)V")
    public abstract void method1193(int arg0, class469[] arg1);

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "()Z")
    public abstract boolean method1194();
}
