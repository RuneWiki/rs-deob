import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class200 extends class340 implements Runnable {

    @OriginalMember(owner = "client!lt", name = "q", descriptor = "Z")
    private boolean field2955 = true;

    @OriginalMember(owner = "client!lt", name = "z", descriptor = "I")
    public int field2964 = -1;

    @OriginalMember(owner = "client!lt", name = "y", descriptor = "Lqc;")
    private class126 field2963;

    @OriginalMember(owner = "client!lt", name = "p", descriptor = "[I")
    public static int[] field2954 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!lt", name = "t", descriptor = "I")
    public static int field2958 = 0;

    @OriginalMember(owner = "client!lt", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field2970 = new String[5];

    @OriginalMember(owner = "client!lt", name = "H", descriptor = "[[I")
    public static int[][] field2971 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!lt", name = "w", descriptor = "Lap;")
    public static class310 field2961 = new class310(33, 8);

    @OriginalMember(owner = "client!lt", name = "I", descriptor = "I")
    public static int field2972 = 0;

    @OriginalMember(owner = "client!lt", name = "r", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!lt", name = "s", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!lt", name = "u", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!lt", name = "v", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!lt", name = "x", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!lt", name = "A", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!lt", name = "B", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!lt", name = "D", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!lt", name = "E", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!lt", name = "F", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(B)V")
    public final void method1391(byte arg0) {
        if (arg0 != -128) {
            method1393(72, 98);
        }
        this.field2955 = false;
        field2959++;
    }

    @OriginalMember(owner = "client!lt", name = "run", descriptor = "()V")
    public final void run() {
        field2962++;
        while (this.field2955) {
            this.field2963.method953(this, 45);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method1392(String arg0, boolean arg1) {
        field2956++;
        if (arg0 == null) {
            return;
        }
        if (!(class349.field4807 < 100 || class339.field4690) || class349.field4807 >= 200) {
            class316.method2006(118, class25.field266.method1078(class66.field967, 100));
            return;
        }
        String var2 = class472.method2799(45, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class349.field4807; var3++) {
            String var7 = class472.method2799(93, class37.field446[var3]);
            if (var7 != null && var7.equals(var2)) {
                class316.method2006(100, arg0 + class266.field3837.method1078(class66.field967, 100));
                return;
            }
            if (class8.field54[var3] != null) {
                String var8 = class472.method2799(60, class8.field54[var3]);
                if (var8 != null && var8.equals(var2)) {
                    class316.method2006(53, arg0 + class266.field3837.method1078(class66.field967, 100));
                    return;
                }
            }
        }
        if (!arg1) {
            method1396(false);
        }
        for (int var4 = 0; var4 < class222.field3201; var4++) {
            String var5 = class472.method2799(33, class379.field5204[var4]);
            if (var5 != null && var5.equals(var2)) {
                class316.method2006(106, class434.field6136.method1078(class66.field967, 100) + arg0 + class38.field478.method1078(class66.field967, 100));
                return;
            }
            if (class276.field3985[var4] != null) {
                String var6 = class472.method2799(36, class276.field3985[var4]);
                if (var6 != null && var6.equals(var2)) {
                    class316.method2006(103, class434.field6136.method1078(class66.field967, 100) + arg0 + class38.field478.method1078(class66.field967, 100));
                    return;
                }
            }
        }
        if (class472.method2799(27, class262.field3781.field485).equals(var2)) {
            class316.method2006(104, class435.field6163.method1078(class66.field967, 100));
        } else {
            class391.field5398++;
            class336.method2111(class158.field2257, 122);
            class311.field4403.method1180((byte) -110, class345.method2147(arg0, (byte) 110));
            class311.field4403.method1184((byte) 95, arg0);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)V")
    public static final void method1393(int arg0, int arg1) {
        class380.field5227.method2120((byte) -82, arg1);
        field2968++;
        if (arg0 != 2) {
            field2961 = null;
        }
        class408.field5588.method2120((byte) 75, arg1);
        class442.field6289.method2120((byte) 112, arg1);
        class421.field5832.method2120((byte) 102, arg1);
        class439.field6224.method2120((byte) -106, arg1);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)V")
    public final void method1394(boolean arg0) {
        field2960++;
        if (!arg0) {
            method1396(false);
        }
        (new Thread(this, "a")).start();
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
    public static void method1395(int arg0) {
        if (arg0 != -6104) {
            field2972 = 30;
        }
        field2970 = null;
        field2961 = null;
        field2954 = null;
        field2971 = null;
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(Z)V")
    public static final void method1396(boolean arg0) {
        field2969++;
        if (!arg0) {
            return;
        }
        int[] var1 = new int[class373.field5128.field3451];
        int var2 = 0;
        for (int var3 = 0; var3 < class373.field5128.field3451; var3++) {
            class156 var5 = class373.field5128.method1644(var3, 96);
            if (var5.field2157 >= 0 || var5.field2204 >= 0) {
                var1[var2++] = var3;
            }
        }
        class353.field4853 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class353.field4853[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lqc;)V")
    public class200(class126 arg0) {
        this.field2963 = arg0;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IILnm;ILvc;B)V")
    public static final void method1397(int arg0, int arg1, class267 arg2, int arg3, class89 arg4, byte arg5) {
        field2957++;
        class51 var6 = class449.field6390.method843(86, arg2.field3865);
        if (var6.field735 == -1) {
            return;
        }
        int var7;
        if (arg2.field3849) {
            int var8 = arg2.field3918 + arg0;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class417 var9 = var6.method489(arg4, arg2.field3909, var7, (byte) 113);
        if (var9 == null) {
            return;
        }
        if (arg5 != 33) {
            field2971 = null;
        }
        int var10 = arg2.field3843;
        int var11 = arg2.field3856;
        if ((var7 & 0x1) == 1) {
            var11 = arg2.field3843;
            var10 = arg2.field3856;
        }
        int var12 = var9.method1294();
        int var13 = var9.method1295();
        if (var6.field737) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field738 == 0) {
            var9.method2497(arg3, -(var11 * 4) - (-arg1 - 4), var12, var13);
        } else {
            var9.method725(arg3, arg1 - ((var11 - 1) * 4), var12, var13, 1, var6.field738 | 0xFF000000, 1);
        }
    }
}
