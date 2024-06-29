import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class59 {

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public int field1245;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public int field1248;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public int field1253;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public int field1240;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "[I")
    public static int[] field1247 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Lud;")
    public static class279 field1235 = class130.method1024("brillant1:", 255);

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Lud;")
    public static class279 field1236 = class130.method1024("settings=", 255);

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "Z")
    public static boolean field1249 = false;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "[J")
    public static long[] field1250 = new long[100];

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "Lud;")
    public static class279 field1252 = class130.method1024("<col=00ff80>", 255);

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field1239 = 0;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "[I")
    public static int[] field1238;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "[Lom;")
    public static class70[] field1244;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILud;Lud;B)V", line = 17)
    public static final void method530(int arg0, class279 arg1, class279 arg2, byte arg3) {
        field1246++;
        class162.field2928 = arg0;
        class60.field1264 = arg1;
        class60.field1267 = arg2;
        if (class60.field1264.method1990((byte) 101, class60.field1265) || class60.field1267.method1990((byte) 110, class60.field1265)) {
            class279.field4943 = 3;
        } else if (class12.field386 == -1) {
            class265.field4772 = 0;
            class196.field3532 = 0;
            class279.field4943 = -3;
            class252.field4504 = 1;
            int var4 = -127 / ((-arg3 - 52) / 63);
            class53 var5 = new class53(128);
            var5.method464(10, false);
            var5.method505((int) (Math.random() * 99999.0D), (byte) 7);
            var5.method505(529, (byte) 7);
            var5.method490(class60.field1264.method2013(106), 14886);
            var5.method444((byte) 46, (int) (Math.random() * 9.9999999E7D));
            var5.method481(class60.field1267, (byte) 124);
            var5.method444((byte) 46, (int) (Math.random() * 9.9999999E7D));
            var5.method458(class17.field529, -114, class162.field2924);
            class314.field5534.field1142 = 0;
            class314.field5534.method464(236, false);
            class314.field5534.method464(var5.field1142, false);
            class314.field5534.method471(0, var5.field1142, (byte) -81, var5.field1168);
        } else {
            class176.method1367(-32140);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)I", line = 60)
    public static final int method531(int arg0, int arg1) {
        if (arg1 == 10598) {
            field1237++;
            return arg0 >>> 8;
        } else {
            return 32;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lud;Lud;II)V", line = 75)
    public static final void method532(class279 arg0, class279 arg1, int arg2, int arg3) {
        if (arg3 != 29437) {
            field1239 = 22;
        }
        class170.method1325(arg3 - 29437, arg0, arg2, (class279) null, -1, arg1);
        field1242++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIII)V", line = 88)
    public static final void method533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1241++;
        int var8 = arg1 + arg3;
        int var9 = arg6 - arg3;
        int var10 = arg2 - arg3;
        int var11 = arg0 + arg3;
        for (int var12 = arg0; var12 < var11; var12++) {
            class152.method1208(arg1, arg7, arg6, class182.field3348[var12], -7);
        }
        for (int var13 = arg2; var13 > var10; var13--) {
            class152.method1208(arg1, arg7, arg6, class182.field3348[var13], -7);
        }
        if (arg4 < 39) {
            method534(-45);
        }
        for (int var14 = var11; var14 <= var10; var14++) {
            int[] var15 = class182.field3348[var14];
            class152.method1208(arg1, arg7, var8, var15, -7);
            class152.method1208(var8, arg5, var9, var15, -7);
            class152.method1208(var9, arg7, arg6, var15, -7);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 167)
    public static void method534(int arg0) {
        field1236 = null;
        field1238 = null;
        int var1 = -58 % ((-arg0 - 6) / 59);
        field1252 = null;
        field1235 = null;
        field1250 = null;
        field1244 = null;
        field1247 = null;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V", line = 184)
    public class59() {
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lfb;)V", line = 186)
    public class59(class59 arg0) {
        this.field1245 = arg0.field1245;
        this.field1248 = arg0.field1248;
        this.field1253 = arg0.field1253;
        this.field1240 = arg0.field1240;
    }
}
