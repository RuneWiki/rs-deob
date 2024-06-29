import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class566 {

    @OriginalMember(owner = "client!r", name = "j", descriptor = "Lfa;")
    public class526 field7898;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public int field7890;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Lwp;")
    public static class453 field7889 = new class453(34, 8);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field7891;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field7892;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field7893;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field7894;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field7895;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field7896;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field7897;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field7899;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field7900;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field7901;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field7902;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBIII)V", line = 17)
    public final void method3109(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field7900++;
        if (arg1 == 4) {
            this.method1002(arg0, arg4, arg3, arg2, 1);
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIII)V", line = 41)
    public final void method3110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 == 20822) {
            this.method978(arg3, arg1, arg0, arg2, arg5, 1);
            field7893++;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILfa;Ljava/awt/Canvas;Lpl;I)Lr;", line = 74)
    public static final synchronized class566 method3111(int arg0, int arg1, class526 arg2, Canvas arg3, class612 arg4, int arg5) {
        field7902++;
        if (arg1 == 0) {
            return class259.method1510(arg2, arg3, (byte) -25);
        } else if (arg1 == 2) {
            return class168.method963(arg3, (byte) 105, arg2);
        } else if (arg1 == 1) {
            return class454.method2430(arg0, arg3, arg2, 191);
        } else if (arg1 == 5) {
            return class103.method589(arg2, arg3, arg0, (byte) -94, arg4);
        } else {
            if (arg5 != -19464) {
                field7889 = null;
            }
            if (arg1 != 3) {
                throw new IllegalArgumentException("UM");
            }
            return class703.method3945(-110, arg4, arg3, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lf;I)V", line = 121)
    public final void method3112(class536 arg0, int arg1) {
        if (arg1 != 5) {
            this.method985();
        }
        this.method976(arg0, true);
        field7896++;
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIIII)V", line = 138)
    public final void method3113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1065(arg4, arg1, arg5, arg3, arg2, arg0);
        field7891++;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IBIII)V", line = 163)
    public final void method3114(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 11) {
            this.method973(97);
        }
        field7894++;
        this.method1084(arg2, arg0, arg3, arg4, 1);
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V", line = 192)
    public static void method3115(int arg0) {
        if (arg0 != -2) {
            field7889 = null;
        }
        field7889 = null;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lfa;)V", line = 210)
    public class566(class526 arg0) {
        this.field7898 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class157.field2047[var3]) {
                var2 = var3;
                class157.field2047[var3] = true;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field7890 = var2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIB)V", line = 244)
    public static final void method3116(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field7897++;
        class704 var5 = class573.method3163(-98);
        var5.field9929.method3509(class350.field4476.field2831, (byte) -122);
        var5.field9929.method3509(arg0, (byte) -116);
        var5.field9929.method3509(arg3, (byte) -113);
        var5.field9929.method3526(arg2, 13469);
        int var6 = 95 % ((-arg4 - 43) / 42);
        var5.field9929.method3526(arg1, 13469);
        class122.method654(var5, (byte) -36);
        class82.field1097 = 1;
        class279.field3503 = 0;
        class290.field3618 = 0;
        class76.field1046 = -3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V", line = 270)
    public final void method3117(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 46 % ((67 - arg0) / 33);
        this.method1022(arg2, arg3, arg4, arg1, 1);
        field7899++;
    }

    @OriginalMember(owner = "client!r", name = "finalize", descriptor = "()V", line = 281)
    protected void finalize() {
        this.method3119(1);
        field7901++;
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(IIIIII)V", line = 303)
    public final void method3118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1090(arg1, arg2, arg5, arg4, arg0, arg3);
        field7892++;
    }

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(I)V", line = 311)
    public final void method3119(int arg0) {
        if (arg0 == 1) {
            field7895++;
            class157.field2047[this.field7890] = false;
            this.method1069();
        }
    }

    @OriginalMember(owner = "client!r", name = "IA", descriptor = "(IIIIII[BII)V")
    public abstract void method1074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!r", name = "JA", descriptor = "()V")
    public abstract void method1017();

    @OriginalMember(owner = "client!r", name = "da", descriptor = "(IIII)V")
    public abstract void method1083(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "O", descriptor = "(IIIIII)Z")
    public abstract boolean method982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "v", descriptor = "()[I")
    public abstract int[] method1016();

    @OriginalMember(owner = "client!r", name = "AA", descriptor = "(III[I)V")
    public abstract void method1046(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()V")
    public abstract void method1089();

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()I")
    public abstract int method997();

    @OriginalMember(owner = "client!r", name = "L", descriptor = "()V")
    public abstract void method1039();

    @OriginalMember(owner = "client!r", name = "d", descriptor = "()Z")
    public abstract boolean method985();

    @OriginalMember(owner = "client!r", name = "e", descriptor = "()Z")
    public abstract boolean method1047();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I[Lgga;)V")
    public abstract void method1024(int arg0, class332[] arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1065(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Leg;IIII)Lda;")
    public abstract class474 method1019(class47 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "f", descriptor = "()Z")
    public abstract boolean method1067();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lir;)V")
    public abstract void method993(class27 arg0);

    @OriginalMember(owner = "client!r", name = "ZA", descriptor = "(Z)V")
    public abstract void method1034(boolean arg0);

    @OriginalMember(owner = "client!r", name = "g", descriptor = "()Z")
    public abstract boolean method1027();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public abstract class272 method1008(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!r", name = "h", descriptor = "()Z")
    public abstract boolean method1085();

    @OriginalMember(owner = "client!r", name = "i", descriptor = "()Z")
    public abstract boolean method1032();

    @OriginalMember(owner = "client!r", name = "CA", descriptor = "(IIII)V")
    public abstract void method1000(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "j", descriptor = "()V")
    public abstract void method983();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
    public abstract void method1038(boolean arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1086(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method987(Rectangle[] arg0, int arg1) throws class180;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "()V")
    public abstract void method1004();

    @OriginalMember(owner = "client!r", name = "pa", descriptor = "(III)V")
    public abstract void method1075(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)Lf;")
    public abstract class536 method1071(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!r", name = "ya", descriptor = "()V")
    public abstract void method1031();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public abstract void method1051(int arg0);

    @OriginalMember(owner = "client!r", name = "l", descriptor = "()Z")
    public abstract boolean method996();

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIII)V")
    public abstract void method1022(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "GA", descriptor = "(II)V")
    public abstract void method1062(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1068(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "m", descriptor = "()Z")
    public abstract boolean method1026();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIF)Lgga;")
    public abstract class332 method1035(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!r", name = "BA", descriptor = "()I")
    public abstract int method974();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljt;Ljt;FLjt;)Ljt;")
    public abstract class533 method1064(class533 arg0, class533 arg1, float arg2, class533 arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([I)V")
    public abstract void method1030(int[] arg0);

    @OriginalMember(owner = "client!r", name = "la", descriptor = "(IIII)V")
    public abstract void method1048(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(IIII)[I")
    public abstract int[] method1037(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(IIIIII)V")
    public abstract void method978(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(IIIIII)Ljt;")
    public abstract class533 method990(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
    public abstract int method1018(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "m", descriptor = "(IIIII)V")
    public abstract void method1002(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "T", descriptor = "()I")
    public abstract int method1036();

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I")
    public abstract int method998(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lq;)V")
    public abstract void method1058(class491 arg0);

    @OriginalMember(owner = "client!r", name = "n", descriptor = "()Z")
    public abstract boolean method975();

    @OriginalMember(owner = "client!r", name = "o", descriptor = "()Z")
    public abstract boolean method1011();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method1044(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
    public abstract int method1057();

    @OriginalMember(owner = "client!r", name = "p", descriptor = "()Lq;")
    public abstract class491 method995();

    @OriginalMember(owner = "client!r", name = "XA", descriptor = "(IIIII)V")
    public abstract void method1084(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Le;)V")
    public abstract void method1091(class385 arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lsa;[Laga;Z)Lla;")
    public abstract class413 method989(class595 arg0, class661[] arg1, boolean arg2);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([IIIII)Lf;")
    public abstract class536 method1025(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1020(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "q", descriptor = "()V")
    public abstract void method1082();

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public abstract void method1041(int arg0);

    @OriginalMember(owner = "client!r", name = "r", descriptor = "()Z")
    public abstract boolean method1049();

    @OriginalMember(owner = "client!r", name = "MA", descriptor = "(III[I)V")
    public abstract void method991(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "s", descriptor = "()V")
    public abstract void method1052();

    @OriginalMember(owner = "client!r", name = "oa", descriptor = "([I)V")
    public abstract void method1060(int[] arg0);

    @OriginalMember(owner = "client!r", name = "ja", descriptor = "(I)V")
    public abstract void method1028(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
    public abstract void method1078(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "V", descriptor = "(IIII)V")
    public abstract void method1070(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)Le;")
    public abstract class385 method1015(int arg0);

    @OriginalMember(owner = "client!r", name = "t", descriptor = "()Lq;")
    public abstract class491 method1033();

    @OriginalMember(owner = "client!r", name = "J", descriptor = "(IIIIII)V")
    public abstract void method1090(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZ)Lf;")
    public abstract class536 method1053(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!r", name = "YA", descriptor = "(IIII)V")
    public abstract void method984(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lf;Z)V")
    public abstract void method976(class536 arg0, boolean arg1);

    @OriginalMember(owner = "client!r", name = "u", descriptor = "()V")
    public abstract void method988() throws class180;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
    public abstract void method973(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[I[I)Lua;")
    public abstract class600 method1080(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1021(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
    public abstract void method1005(boolean arg0);

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
    public abstract void method1040(int arg0);

    @OriginalMember(owner = "client!r", name = "w", descriptor = "()V")
    public abstract void method1003();

    @OriginalMember(owner = "client!r", name = "x", descriptor = "()Z")
    public abstract boolean method1023();

    @OriginalMember(owner = "client!r", name = "y", descriptor = "()Loa;")
    public abstract class226 method1001();

    @OriginalMember(owner = "client!r", name = "z", descriptor = "()Z")
    public abstract boolean method1006();

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
    public abstract void method1063(int arg0);

    @OriginalMember(owner = "client!r", name = "A", descriptor = "()V")
    public abstract void method1069();

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1073(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
    public abstract int method1055();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljt;)V")
    public abstract void method980(class533 arg0);

    @OriginalMember(owner = "client!r", name = "va", descriptor = "(I)V")
    public abstract void method1029(int arg0);

    @OriginalMember(owner = "client!r", name = "VA", descriptor = "(IFFFFF)V")
    public abstract void method994(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!r", name = "B", descriptor = "()Z")
    public abstract boolean method1076();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Laga;Z)Lf;")
    public abstract class536 method1072(class661 arg0, boolean arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lir;I)V")
    public abstract void method999(class27 arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "DA", descriptor = "()I")
    public abstract int method1045();

    @OriginalMember(owner = "client!r", name = "C", descriptor = "()Lq;")
    public abstract class491 method1087();

    @OriginalMember(owner = "client!r", name = "ra", descriptor = "(F)V")
    public abstract void method1054(float arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIILua;II)V")
    public abstract void method1007(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class600 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(FFF)V")
    public abstract void method1014(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!r", name = "FA", descriptor = "(ILua;II)V")
    public abstract void method1012(int arg0, class600 arg1, int arg2, int arg3);
}
