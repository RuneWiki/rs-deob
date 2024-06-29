import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class162 {

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "Lm;")
    public class126 field2379;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public int field2371;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field2365 = new String[100];

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Lbv;")
    public static class199 field2368;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V", line = 13)
    public final void method1027(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 3323) {
            field2375++;
            this.method1023(arg3, arg2, arg0, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIBIII)V", line = 28)
    public final void method1029(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 == 65) {
            this.method1113(arg3, arg1, arg0, arg4, arg5, 1);
            field2366++;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)V", line = 61)
    public final void method1045(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2370++;
        this.method1104(arg0, arg1, arg4, arg2, arg5, arg3);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V", line = 69)
    public final void method1046(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 23304) {
            this.method1124(-20, -126, 31, 9, -117);
        }
        this.method1048(arg2, arg3, arg0, arg4, 1);
        field2374++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V", line = 105)
    public static void method1064(byte arg0) {
        if (arg0 != 116) {
            method1090(null, -86, null, null, -84, true);
        }
        field2365 = null;
        field2368 = null;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I", line = 127)
    public static final int method1072(int arg0, int arg1) {
        if (arg0 != -15029) {
            method1077((byte) -43, null);
        }
        field2373++;
        return arg1 == 16711935 ? -1 : class223.method1527(arg1, (byte) -119);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLjava/lang/String;)V", line = 145)
    public static final void method1077(byte arg0, String arg1) {
        field2364++;
        if (arg1 == null || arg0 != -75) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class14.method93(arg1, arg0 ^ 0xFFFFF0B4);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class315.field4496; var3++) {
            String var4 = class474.field6980[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class14.method93(var4, 3841);
            if (var5 != null && var5.equals(var2)) {
                class315.field4496--;
                for (int var6 = var3; var6 < class315.field4496; var6++) {
                    class474.field6980[var6] = class474.field6980[var6 + 1];
                    class287.field4106[var6] = class287.field4106[var6 + 1];
                    class85.field1296[var6] = class85.field1296[var6 + 1];
                    class364.field5575[var6] = class364.field5575[var6 + 1];
                    class66.field990[var6] = class66.field990[var6 + 1];
                    class467.field6893[var6] = class467.field6893[var6 + 1];
                }
                class447.field6663 = class99.field1453;
                class66.field983++;
                class291.method1861((byte) -104, class179.field2633);
                class356.field5471.method1410(class456.method2739((byte) -12, arg1), -27645);
                class356.field5471.method1418(true, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)V", line = 222)
    public final void method1087(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < 115) {
            this.method1069(20, -47, 22, -83);
        }
        field2377++;
        this.method1036(arg1, arg0, arg5, arg3, arg4, 1);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;ILm;Lji;IZ)Lqa;", line = 235)
    public static final synchronized class162 method1090(Canvas arg0, int arg1, class126 arg2, class432 arg3, int arg4, boolean arg5) {
        field2376++;
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class299.field4257[var7]) {
                var6 = var7;
                break;
            }
        }
        if (arg5) {
            field2368 = null;
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class162 var9;
        if (arg1 == 0) {
            var9 = class359.method2230(var6, arg2, 35040, arg0);
        } else if (arg1 == 1) {
            var9 = class189.method1294(arg0, (byte) -54, var6, arg4, arg3, arg2);
        } else if (arg1 == 2) {
            var9 = class308.method1938(arg2, var6, arg0, (byte) 127, arg3);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class299.field4257[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V", line = 303)
    public final void method1108(int arg0) {
        field2378++;
        if (arg0 != -7682) {
            this.field2371 = 74;
        }
        class299.field4257[this.field2371] = false;
        this.method1094();
    }

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V", line = 332)
    protected void finalize() {
        field2372++;
        this.method1108(-7682);
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIII)V", line = 349)
    public final void method1124(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1092(arg2, arg1, arg3, arg4, arg0);
        field2367++;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILm;)V", line = 360)
    public class162(int arg0, class126 arg1) {
        this.field2379 = arg1;
        this.field2371 = arg0;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
    public abstract void method1019();

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "()F")
    public abstract float method1020();

    @OriginalMember(owner = "client!qa", name = "ba", descriptor = "(IIII)V")
    public abstract void method1021(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "na", descriptor = "(I)V")
    public abstract void method1022(int arg0);

    @OriginalMember(owner = "client!qa", name = "da", descriptor = "(IIIII)V")
    public abstract void method1023(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
    public abstract void method1024();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()Z")
    public abstract boolean method1025();

    @OriginalMember(owner = "client!qa", name = "la", descriptor = "()F")
    public abstract float method1026();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)Ll;")
    public abstract class16 method1028(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lgu;Z)Lf;")
    public abstract class529 method1030(class408 arg0, boolean arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lc;Lia;[Lvk;I)V")
    public abstract void method1031(class121[] arg0, class414 arg1, class247[] arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "()V")
    public abstract void method1032();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
    public abstract void method1033(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "(ILea;II)V")
    public abstract void method1034(int arg0, class381 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public abstract void method1035(int arg0);

    @OriginalMember(owner = "client!qa", name = "NA", descriptor = "(IIIIII)V")
    public abstract void method1036(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "()Z")
    public abstract boolean method1037();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lc;Lpo;Lia;[Lvk;I)V")
    public abstract void method1038(class121[] arg0, class389 arg1, class414 arg2, class247[] arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "(FF)V")
    public abstract void method1039(float arg0, float arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
    public abstract void method1040(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "()V")
    public abstract void method1041();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1042(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
    public abstract void method1043(int arg0);

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "(I)V")
    public abstract void method1044(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1047(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "(IIIII)V")
    public abstract void method1048(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "XA", descriptor = "(IFFFFF)V")
    public abstract void method1049(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "GA", descriptor = "(IIII)V")
    public abstract void method1050(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
    public abstract int method1051(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "(III)V")
    public abstract void method1052(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public abstract void method1053(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "()V")
    public abstract void method1054();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lc;Lpo;Lia;Lvk;I)V")
    public abstract void method1055(class121 arg0, class389 arg1, class414 arg2, class247 arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "()I")
    public abstract int method1056();

    @OriginalMember(owner = "client!qa", name = "xa", descriptor = "()I")
    public abstract int method1057();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILea;II)V")
    public abstract void method1058(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class381 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "aa", descriptor = "(IIIIII[BII)V")
    public abstract void method1059(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "()I")
    public abstract int method1060();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lna;")
    public abstract class35 method1061(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "([I)V")
    public abstract void method1062(int[] arg0);

    @OriginalMember(owner = "client!qa", name = "IA", descriptor = "(IIII)[I")
    public abstract int[] method1063(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)Ltl;")
    public abstract class436 method1065(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1066(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Lf;")
    public abstract class529 method1067(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lkt;)V")
    public abstract void method1068(int arg0, class107[] arg1);

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "(IIII)V")
    public abstract void method1069(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
    public abstract void method1070(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1071(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "()Z")
    public abstract boolean method1073();

    @OriginalMember(owner = "client!qa", name = "ia", descriptor = "(III[I)V")
    public abstract void method1074(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "()Z")
    public abstract boolean method1075();

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()I")
    public abstract int method1076();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lf;")
    public abstract class529 method1078(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
    public abstract boolean method1079();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method1080(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lje;[Lgu;Z)Loa;")
    public abstract class489 method1081(class275 arg0, class408[] arg1, boolean arg2);

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "(Lia;)V")
    public abstract void method1082(class414 arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ltl;)V")
    public abstract void method1083(class436 arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lkt;")
    public abstract class107 method1084(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1085(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ltl;Ltl;FLtl;)Ltl;")
    public abstract class436 method1086(class436 arg0, class436 arg1, float arg2, class436 arg3);

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "()Z")
    public abstract boolean method1088();

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "()V")
    public abstract void method1089();

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
    public abstract boolean method1091();

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "(IIIII)V")
    public abstract void method1092(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lea;")
    public abstract class381 method1093(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "()V")
    public abstract void method1094();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lpo;)V")
    public abstract void method1095(class389 arg0);

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "()Z")
    public abstract boolean method1096();

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "()Z")
    public abstract boolean method1097();

    @OriginalMember(owner = "client!qa", name = "pa", descriptor = "(IIII)V")
    public abstract void method1098(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "()I")
    public abstract int method1099();

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
    public abstract void method1100(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method1101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!qa", name = "JA", descriptor = "(II)V")
    public abstract void method1102(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
    public abstract void method1103(int arg0);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)V")
    public abstract void method1104(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "SA", descriptor = "(IIIIII)Z")
    public abstract boolean method1105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
    public abstract boolean method1106();

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "()Z")
    public abstract boolean method1107();

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "()Z")
    public abstract boolean method1109();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
    public abstract void method1110(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "ua", descriptor = "(F)V")
    public abstract void method1111(float arg0);

    @OriginalMember(owner = "client!qa", name = "va", descriptor = "()V")
    public abstract void method1112();

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIIIII)V")
    public abstract void method1113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "FA", descriptor = "()I")
    public abstract int method1114();

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "()Lia;")
    public abstract class414 method1115();

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "()V")
    public abstract void method1116();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ll;)V")
    public abstract void method1117(class16 arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lqc;IIII)Lc;")
    public abstract class121 method1118(class521 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "()Z")
    public abstract boolean method1119();

    @OriginalMember(owner = "client!qa", name = "fa", descriptor = "(IIII)V")
    public abstract void method1120(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z")
    public abstract boolean method1121();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)I")
    public abstract int method1122(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
    public abstract void method1123(int arg0);

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "()Z")
    public abstract boolean method1125();

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "()Lia;")
    public abstract class414 method1126();
}
