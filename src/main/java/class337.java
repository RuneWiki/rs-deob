import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class337 {

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field5067 = 0;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "Z")
    public static boolean field5072 = false;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5074 = "green:";

    @OriginalMember(owner = "client!en", name = "i", descriptor = "J")
    public static long field5075 = 0L;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BIIIILwa;)Ljava/awt/Frame;", line = 6)
    public static final Frame method2331(byte arg0, int arg1, int arg2, int arg3, int arg4, class80 arg5) {
        field5068++;
        if (!arg5.method624(true)) {
            return null;
        }
        if (arg4 == 0) {
            class31[] var6 = class266.method1808((byte) -102, arg5);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field383 == arg3 && var6[var8].field375 == arg1 && (arg2 == 0 || var6[var8].field373 == arg2) && (!var7 || var6[var8].field386 > arg4)) {
                    var7 = true;
                    arg4 = var6[var8].field386;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class285 var9 = arg5.method628(arg3, arg4, -94, arg1, arg2);
        while (var9.field4241 == 0) {
            class186.method1304(10, 10L);
        }
        Frame var10 = (Frame) var9.field4244;
        if (var10 == null) {
            return null;
        } else if (var9.field4241 == 2) {
            class145.method1048((byte) -32, arg5, var10);
            return null;
        } else {
            if (arg0 != -81) {
                field5067 = 4;
            }
            return var10;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V", line = 79)
    public static void method2332(int arg0) {
        if (arg0 <= 9) {
            method2333(88, 20, -58, 18, true);
        }
        field5074 = null;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIZ)V", line = 89)
    public static final void method2333(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class245.field3524 = arg1;
        class99.field1356 = arg2;
        class208.field2988 = arg3;
        class251.field3605 = new class202[arg0][class245.field3524][class99.field1356];
        class269.field3994 = new int[arg0][class245.field3524 + 1][class99.field1356 + 1];
        if (class67.field908) {
            class125.field1693 = new class268[4][];
        }
        if (arg4) {
            class113.field1545 = new class202[1][class245.field3524][class99.field1356];
            class336.field5066 = new int[class245.field3524][class99.field1356];
            class143.field1967 = new int[1][class245.field3524 + 1][class99.field1356 + 1];
            if (class67.field908) {
                class288.field4283 = new class268[1][];
            }
        } else {
            class113.field1545 = (class202[][][]) null;
            class336.field5066 = (int[][]) null;
            class143.field1967 = (int[][][]) null;
            class288.field4283 = (class268[][]) null;
        }
        class35.method198(false);
        class190.field2621 = new class209[500];
        class22.field285 = 0;
        class201.field2865 = new class209[500];
        class56.field769 = 0;
        class96.field1302 = new int[arg0][class245.field3524 + 1][class99.field1356 + 1];
        class226.field3242 = new class280[5000];
        class342.field5127 = 0;
        class136.field1875 = new class280[100];
        class240.field3399 = new boolean[class208.field2988 + class208.field2988 + 1][class208.field2988 + class208.field2988 + 1];
        class286.field4248 = new boolean[class208.field2988 + class208.field2988 + 2][class208.field2988 + class208.field2988 + 2];
        class307.field4599 = new byte[arg0][class245.field3524][class99.field1356];
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)I", line = 132)
    public static final int method2334(int arg0) {
        if (arg0 == 1) {
            field5071++;
            return 15;
        } else {
            return -56;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IB)V", line = 145)
    public static final void method2335(int arg0, byte arg1) {
        int var2 = -99 % ((3 - arg1) / 42);
        class45.field549.method720(arg0, 1088);
        field5073++;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IB[JI[Ljava/lang/Object;)V", line = 165)
    public static final void method2336(int arg0, byte arg1, long[] arg2, int arg3, Object[] arg4) {
        field5070++;
        if (arg1 >= -95 || arg0 >= arg3) {
            return;
        }
        int var5 = (arg0 + arg3) / 2;
        int var6 = arg0;
        long var7 = arg2[var5];
        arg2[var5] = arg2[arg3];
        arg2[arg3] = var7;
        Object var9 = arg4[var5];
        arg4[var5] = arg4[arg3];
        arg4[arg3] = var9;
        for (int var10 = arg0; var10 < arg3; var10++) {
            if ((long) (var10 & 0x1) + var7 > arg2[var10]) {
                long var11 = arg2[var10];
                arg2[var10] = arg2[var6];
                arg2[var6] = var11;
                Object var13 = arg4[var10];
                arg4[var10] = arg4[var6];
                arg4[var6++] = var13;
            }
        }
        arg2[arg3] = arg2[var6];
        arg2[var6] = var7;
        arg4[arg3] = arg4[var6];
        arg4[var6] = var9;
        method2336(arg0, (byte) -116, arg2, var6 - 1, arg4);
        method2336(var6 + 1, (byte) -123, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZI)I", line = 220)
    public static final int method2337(boolean arg0, int arg1) {
        field5069++;
        return arg0 ? 88 : arg1 >>> 8;
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(I)[Lkn;", line = 236)
    public static final class178[] method2338(int arg0) {
        field5076++;
        class178[] var1 = new class178[class342.field5121];
        if (arg0 <= 70) {
            method2337(true, -116);
        }
        for (int var2 = 0; var2 < class342.field5121; var2++) {
            int var3 = class323.field4903[var2] * class288.field4281[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class209.field3012[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class235.field3331[class47.method303(255, var5[var6])];
            }
            var1[var2] = new class178(class154.field2136, class194.field2674, class209.field3002[var2], class274.field4115[var2], class323.field4903[var2], class288.field4281[var2], var4);
        }
        class236.method1624(77);
        return var1;
    }
}
