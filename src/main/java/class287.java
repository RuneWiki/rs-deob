import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class287 {

    @OriginalMember(owner = "client!za", name = "c", descriptor = "I")
    public int field3766;

    @OriginalMember(owner = "client!za", name = "i", descriptor = "Ll;")
    public class16 field3772;

    @OriginalMember(owner = "client!za", name = "d", descriptor = "Ljc;")
    public static class305 field3767 = new class305("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!za", name = "p", descriptor = "Lbu;")
    public static class17 field3779 = new class17("LIVE", 0);

    @OriginalMember(owner = "client!za", name = "q", descriptor = "Lho;")
    public static class103 field3780 = new class103(5, 16);

    @OriginalMember(owner = "client!za", name = "r", descriptor = "Lti;")
    public static class306 field3781 = new class306();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!za", name = "b", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!za", name = "e", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!za", name = "f", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!za", name = "g", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!za", name = "h", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!za", name = "j", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!za", name = "k", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!za", name = "l", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!za", name = "m", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!za", name = "o", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!za", name = "n", descriptor = "Lfo;")
    public static class361 field3777;

    @OriginalMember(owner = "client!za", name = "s", descriptor = "Lfo;")
    public static class361 field3782;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "()Z")
    public abstract boolean method1202();

    @OriginalMember(owner = "client!za", name = "pa", descriptor = "()I")
    public abstract int method1165();

    @OriginalMember(owner = "client!za", name = "ra", descriptor = "(ILta;II)V")
    public abstract void method1220(int arg0, class144 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIII)V")
    public final void method1717(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1153(arg1, arg5, arg0, arg2, arg3, 1);
        if (arg4 != -22794) {
            field3767 = null;
        }
        field3768++;
    }

    @OriginalMember(owner = "client!za", name = "v", descriptor = "(III[I)V")
    public abstract void method1207(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(I[Lbn;)V")
    public abstract void method1146(int arg0, class309[] arg1);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIZ)V")
    public final void method1718(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method1128(arg0, arg2, arg1, arg3, 1);
        if (!arg4) {
            field3765++;
        }
    }

    @OriginalMember(owner = "client!za", name = "b", descriptor = "()Z")
    public abstract boolean method1154();

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(IIIIII)Lob;")
    public abstract class521 method1230(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "c", descriptor = "()Z")
    public abstract boolean method1142();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1195(Canvas arg0);

    @OriginalMember(owner = "client!za", name = "d", descriptor = "()Lc;")
    public abstract class124 method1125();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Z)V")
    public abstract void method1184(boolean arg0);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1217(Canvas arg0);

    @OriginalMember(owner = "client!za", name = "e", descriptor = "()Z")
    public abstract boolean method1168();

    @OriginalMember(owner = "client!za", name = "HA", descriptor = "(IIII)V")
    public abstract void method1134(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "SA", descriptor = "(Lc;)V")
    public abstract void method1227(class124 arg0);

    @OriginalMember(owner = "client!za", name = "f", descriptor = "()Z")
    public abstract boolean method1235();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Leu;)V")
    public abstract void method1131(class336 arg0);

    @OriginalMember(owner = "client!za", name = "IA", descriptor = "(IIIII)V")
    public abstract void method1185(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(I)V")
    public abstract void method1187(int arg0);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(I)V")
    public abstract void method1143(int arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(II[[I[[IIII)Lya;")
    public abstract class38 method1214(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(Z)V")
    public abstract void method1175(boolean arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lob;)V")
    public abstract void method1159(class521 arg0);

    @OriginalMember(owner = "client!za", name = "g", descriptor = "()Lc;")
    public abstract class124 method1183();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIII)V")
    public final void method1719(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1136(arg1, arg0, arg2, arg3, 1);
        if (arg4 >= 0) {
            field3776++;
        }
    }

    @OriginalMember(owner = "client!za", name = "c", descriptor = "(I)V")
    public abstract void method1171(int arg0);

    @OriginalMember(owner = "client!za", name = "da", descriptor = "(FF)V")
    public abstract void method1140(float arg0, float arg1);

    @OriginalMember(owner = "client!za", name = "Q", descriptor = "(III)V")
    public abstract void method1167(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!za", name = "AA", descriptor = "()I")
    public abstract int method1234();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method1212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method1152(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!za", name = "c", descriptor = "(IIIIII)V")
    public abstract void method1228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(IIIII)V")
    public final void method1720(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -26028) {
            field3782 = null;
        }
        field3764++;
        this.method1185(arg1, arg4, arg0, arg3, 1);
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIII)V")
    public abstract void method1137(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lgf;[Lev;Z)Lla;")
    public abstract class316 method1201(class183 arg0, class491[] arg1, boolean arg2);

    @OriginalMember(owner = "client!za", name = "T", descriptor = "()F")
    public abstract float method1223();

    @OriginalMember(owner = "client!za", name = "s", descriptor = "(IIII)V")
    public abstract void method1180(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "h", descriptor = "()Z")
    public abstract boolean method1190();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lev;Z)Lo;")
    public abstract class24 method1236(class491 arg0, boolean arg1);

    @OriginalMember(owner = "client!za", name = "JA", descriptor = "(F)V")
    public abstract void method1139(float arg0);

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(I)V")
    public abstract void method1173(int arg0);

    @OriginalMember(owner = "client!za", name = "i", descriptor = "()Z")
    public abstract boolean method1129();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIF)Lbn;")
    public abstract class309 method1231(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!za", name = "j", descriptor = "()Z")
    public abstract boolean method1229();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(II[I[I)Lta;")
    public abstract class144 method1215(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!za", name = "aa", descriptor = "()F")
    public abstract float method1155();

    @OriginalMember(owner = "client!za", name = "va", descriptor = "()V")
    public abstract void method1206();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Le;Leu;Lc;Lut;I)V")
    public abstract void method1203(class373 arg0, class336 arg1, class124 arg2, class82 arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lob;Lob;FLob;)Lob;")
    public abstract class521 method1162(class521 arg0, class521 arg1, float arg2, class521 arg3);

    @OriginalMember(owner = "client!za", name = "k", descriptor = "()V")
    public abstract void method1147();

    @OriginalMember(owner = "client!za", name = "MA", descriptor = "([I)V")
    public abstract void method1163(int[] arg0);

    @OriginalMember(owner = "client!za", name = "ya", descriptor = "(I)V")
    public abstract void method1130(int arg0);

    @OriginalMember(owner = "client!za", name = "GA", descriptor = "(IIII)V")
    public abstract void method1221(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "l", descriptor = "()V")
    public abstract void method1158();

    @OriginalMember(owner = "client!za", name = "m", descriptor = "()Z")
    public abstract boolean method1237();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIZIII)V")
    public final void method1721(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        this.method1157(arg0, arg3, arg5, arg1, arg4, 1);
        field3775++;
        if (!arg2) {
            this.method1152(null, -49);
        }
    }

    @OriginalMember(owner = "client!za", name = "c", descriptor = "(Z)V")
    public abstract void method1166(boolean arg0);

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(IIIIII)V")
    public abstract void method1157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "o", descriptor = "()Z")
    public abstract boolean method1149();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "([Le;Lc;[Lut;I)V")
    public abstract void method1170(class373[] arg0, class124 arg1, class82[] arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "q", descriptor = "()Z")
    public abstract boolean method1144();

    @OriginalMember(owner = "client!za", name = "e", descriptor = "(IIIIII)V")
    public final void method1722(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < -22) {
            field3773++;
            this.method1228(arg4, arg2, arg1, arg5, arg3, 1);
        }
    }

    @OriginalMember(owner = "client!za", name = "s", descriptor = "()Z")
    public abstract boolean method1199();

    @OriginalMember(owner = "client!za", name = "ZA", descriptor = "(IIIII)V")
    public abstract void method1136(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "t", descriptor = "()Z")
    public abstract boolean method1193();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lfq;Ljava/awt/Canvas;Ll;IBI)Lza;")
    public static final synchronized class287 method1723(class137 arg0, Canvas arg1, class16 arg2, int arg3, byte arg4, int arg5) {
        field3778++;
        int var6 = -1;
        if (arg4 != 53) {
            return null;
        }
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class173.field2223[var7]) {
                var6 = var7;
                break;
            }
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class287 var9;
        if (arg3 == 0) {
            var9 = class95.method533(arg1, arg2, (byte) 84, var6);
        } else if (arg3 == 1) {
            var9 = class477.method2909(arg1, arg0, -47, arg5, arg2, var6);
        } else if (arg3 == 2) {
            var9 = class453.method2806(124, arg2, arg0, arg1, var6);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class173.field2223[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!za", name = "r", descriptor = "()I")
    public abstract int method1141();

    @OriginalMember(owner = "client!za", name = "<init>", descriptor = "(ILl;)V")
    public class287(int arg0, class16 arg1) {
        this.field3766 = arg0;
        this.field3772 = arg1;
    }

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(IIIIZ)Lo;")
    public abstract class24 method1216(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(FFF)V")
    public abstract void method1177(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!za", name = "t", descriptor = "(I)V")
    public abstract void method1145(int arg0);

    @OriginalMember(owner = "client!za", name = "ba", descriptor = "(IIII)V")
    public abstract void method1182(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(IIII)V")
    public abstract void method1189(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "u", descriptor = "()V")
    public abstract void method1198();

    @OriginalMember(owner = "client!za", name = "v", descriptor = "()V")
    public abstract void method1208();

    @OriginalMember(owner = "client!za", name = "e", descriptor = "(I)V")
    public final void method1724(int arg0) {
        class173.field2223[this.field3766] = false;
        field3769++;
        this.method1179();
        if (arg0 != 1) {
            this.field3766 = 106;
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(II)I")
    public abstract int method1191(int arg0, int arg1);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(B)V")
    public static void method1725(byte arg0) {
        field3782 = null;
        field3781 = null;
        field3780 = null;
        field3767 = null;
        if (arg0 != 4) {
            method1725((byte) -65);
        }
        field3777 = null;
        field3779 = null;
    }

    @OriginalMember(owner = "client!za", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1205(Canvas arg0);

    @OriginalMember(owner = "client!za", name = "w", descriptor = "()V")
    public abstract void method1179();

    @OriginalMember(owner = "client!za", name = "P", descriptor = "(IIIIII)V")
    public abstract void method1153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(II)I")
    public abstract int method1211(int arg0, int arg1);

    @OriginalMember(owner = "client!za", name = "x", descriptor = "()V")
    public abstract void method1188();

    @OriginalMember(owner = "client!za", name = "y", descriptor = "()V")
    public abstract void method1196();

    @OriginalMember(owner = "client!za", name = "f", descriptor = "(I)V")
    public abstract void method1233(int arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Ln;)V")
    public abstract void method1225(class15 arg0);

    @OriginalMember(owner = "client!za", name = "Y", descriptor = "()I")
    public abstract int method1210();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lpq;IIII)Le;")
    public abstract class373 method1213(class131 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1161(Canvas arg0);

    @OriginalMember(owner = "client!za", name = "z", descriptor = "()Z")
    public abstract boolean method1135();

    @OriginalMember(owner = "client!za", name = "g", descriptor = "(I)Ln;")
    public abstract class15 method1204(int arg0);

    @OriginalMember(owner = "client!za", name = "A", descriptor = "()Z")
    public abstract boolean method1132();

    @OriginalMember(owner = "client!za", name = "B", descriptor = "(IFFFFF)V")
    public abstract void method1181(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!za", name = "n", descriptor = "()V")
    public abstract void method1232();

    @OriginalMember(owner = "client!za", name = "OA", descriptor = "()I")
    public abstract int method1169();

    @OriginalMember(owner = "client!za", name = "sa", descriptor = "(IIII)[I")
    public abstract int[] method1151(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "([Le;Leu;Lc;[Lut;I)V")
    public abstract void method1156(class373[] arg0, class336 arg1, class124 arg2, class82[] arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(II)V")
    public abstract void method1200(int arg0, int arg1);

    @OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V")
    protected void finalize() {
        this.method1724(1);
        field3771++;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "([IIIII)Lo;")
    public abstract class24 method1218(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "VA", descriptor = "(IIIIII)Z")
    public abstract boolean method1209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "ma", descriptor = "(IIIII)V")
    public abstract void method1128(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIILta;II)V")
    public abstract void method1126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class144 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!za", name = "B", descriptor = "()I")
    public abstract int method1176();

    @OriginalMember(owner = "client!za", name = "K", descriptor = "(IIIIII[BII)V")
    public abstract void method1172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
