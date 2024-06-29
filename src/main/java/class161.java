import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class161 extends class59 {

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "[B")
    public byte[] field2402;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "Ljf;")
    public static class216 field2407 = new class216(64);

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field2408 = null;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "Ljava/lang/String;")
    public static String field2413 = "Face here";

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "[I")
    public static int[] field2409 = new int[2];

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "Z")
    public static boolean field2415 = false;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
    public static int field2412 = 0;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "Z")
    public static volatile boolean field2416 = false;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2417 = "Loading sprites - ";

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "Ljava/lang/String;")
    public static String field2414 = "Prepared sound engine";

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "[I")
    public static int[] field2410;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIII)V")
    public static final void method1100(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 - arg3 >= class56.field816 && (arg0 + arg3) <= class187.field2938 && class115.field1678 <= arg1 - arg3 && class60.field882 >= (arg1 + arg3)) {
            class277.method1917((byte) 32, arg4, arg1, arg0, arg3);
        } else {
            method1102(arg1, arg4, arg0, arg3, 0);
        }
        if (arg2 != -2170) {
            method1100(-17, -47, -7, 2, 114);
        }
        field2404++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)I")
    public static final int method1101(int arg0, int arg1) {
        class270 var2 = class245.method1746(true, arg1);
        int var3 = var2.field4398;
        field2405++;
        if (arg0 == 1357013281) {
            int var4 = var2.field4400;
            int var5 = var2.field4399;
            int var6 = class198.field3141[var5 - var4];
            return class299.field4770[var3] >> var4 & var6;
        } else {
            return -32;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(IIIII)V")
    private static final void method1102(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg4;
        int var6 = -arg3;
        int var7 = -1;
        int var8 = arg3;
        field2403++;
        int var9 = class196.method1369(class187.field2938, arg2 + arg3, true, class56.field816);
        int var10 = class196.method1369(class187.field2938, arg2 - arg3, true, class56.field816);
        class16.method97(-7, class78.field1180[arg0], var9, arg1, var10);
        while (var5 < var8) {
            var7 += 2;
            var6 += var7;
            if (var6 > 0) {
                var8--;
                int var11 = arg0 - var8;
                int var12 = arg0 + var8;
                var6 -= var8 << 1;
                if (var12 >= class115.field1678 && var11 <= class60.field882) {
                    int var13 = class196.method1369(class187.field2938, arg2 + var5, true, class56.field816);
                    int var14 = class196.method1369(class187.field2938, arg2 - var5, true, class56.field816);
                    if (class60.field882 >= var12) {
                        class16.method97(arg4 ^ 0xFFFFFFF9, class78.field1180[var12], var13, arg1, var14);
                    }
                    if (var11 >= class115.field1678) {
                        class16.method97(-7, class78.field1180[var11], var13, arg1, var14);
                    }
                }
            }
            var5++;
            int var15 = arg0 + var5;
            int var16 = arg0 - var5;
            if (var15 >= class115.field1678 && var16 <= class60.field882) {
                int var17 = class196.method1369(class187.field2938, arg2 + var8, true, class56.field816);
                int var18 = class196.method1369(class187.field2938, arg2 - var8, true, class56.field816);
                if (class60.field882 >= var15) {
                    class16.method97(arg4 ^ 0xFFFFFFF9, class78.field1180[var15], var17, arg1, var18);
                }
                if (class115.field1678 <= var16) {
                    class16.method97(arg4 - 7, class78.field1180[var16], var17, arg1, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)V")
    public static void method1103(byte arg0) {
        field2414 = null;
        field2408 = null;
        field2410 = null;
        field2413 = null;
        field2407 = null;
        field2409 = null;
        if (arg0 != -115) {
            field2412 = 67;
        }
        field2417 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIZI)Leh;")
    public static final class157 method1104(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field2406++;
        long var5 = ((long) arg1 & 0xFFFFL) << 32 | ((long) arg4 & 0xFFFFL) << 48 | ((long) arg0 & 0xFFFFL) << 16 | (long) arg2 & 0xFFFFL;
        if (!arg3) {
            return null;
        }
        class157 var7 = (class157) class152.field2261.method1517(var5, (byte) 83);
        if (var7 != null) {
            return var7;
        }
        class143[] var8 = null;
        class192 var9 = class106.method711(arg2, 6199);
        if (var9.field3055 != null) {
            var8 = new class143[var9.field3055.length];
            for (int var10 = 0; var10 < var8.length; var10++) {
                class8 var11 = class200.method1394(var9.field3055[var10], -30700);
                var8[var10] = new class143(var11.field117, var11.field106, var11.field104, var11.field107, var11.field119, var11.field105, var11.field113, var11.field116);
            }
        }
        class157 var12 = new class157(var9.field3061, var8, var9.field3054, arg4, arg1, arg0);
        class152.field2261.method1518(var12, var5, (byte) 75);
        return var12;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "([B)V")
    public class161(byte[] arg0) {
        this.field2402 = arg0;
    }
}
