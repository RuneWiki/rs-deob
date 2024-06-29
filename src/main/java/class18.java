import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public abstract class class18 {

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field292 = 0;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field282 = 0;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field293 = 0;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "Ljava/lang/String;")
    public static String field299 = "flash1:";

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "[S")
    public static short[] field286 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "[Lhl;")
    public static class235[] field291 = new class235[29];

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public int field284;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public int field289;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public int field290;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public int field296;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public int field297;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public int field298;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "Lcd;")
    public static class136 field287;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "Lug;")
    public static class253 field285;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "Lug;")
    public static class253 field301;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "[Z")
    public static boolean[] field300;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "[[Lel;")
    public static class247[][] field288;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "[[[I")
    public static int[][][] field294;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 15)
    public static void method196(int arg0) {
        field286 = null;
        field294 = (int[][][]) null;
        field300 = null;
        field285 = null;
        field291 = null;
        field299 = null;
        field287 = null;
        field301 = null;
        field288 = (class247[][]) null;
        if (arg0 != 0) {
            field286 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIBIII)V", line = 36)
    public static final void method197(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg3 <= 42) {
            method199((String) null, 85, true);
        }
        if (arg1 >= class291.field4490 && class210.field3309 >= arg4 && class42.field579 <= arg0 && class334.field5205 >= arg2) {
            if (arg5 == 1) {
                class298.method2076(arg0, arg2, 25355, arg1, arg4, arg6);
            } else {
                class147.method1084(arg4, arg2, (byte) -111, arg1, arg5, arg6, arg0);
            }
        } else if (arg5 == 1) {
            class221.method1619(arg0, arg1, arg6, arg4, arg2, 22121);
        } else {
            class113.method802(arg6, arg1, arg4, arg2, arg0, -126, arg5);
        }
        field295++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 75)
    public static final void method199(String arg0, int arg1, boolean arg2) {
        field281++;
        String var3 = class7.method101(class327.method2297(true, arg0), (byte) 108);
        boolean var4 = arg2;
        for (int var5 = 0; var5 < class232.field3631; var5++) {
            class337 var6 = class284.field4403[class81.field1116[var5]];
            if (var6 != null && var6.field5277 != null && var6.field5277.equalsIgnoreCase(var3)) {
                if (arg1 == 1) {
                    class180.field2930++;
                    class183.field2965.method1947((byte) 99, 19);
                    class183.field2965.method80(0, 5);
                    class183.field2965.method45(true, class81.field1116[var5]);
                } else if (arg1 == 4) {
                    class21.field314++;
                    class183.field2965.method1947((byte) 74, 249);
                    class183.field2965.method80(0, 5);
                    class183.field2965.method30(class81.field1116[var5], (byte) -39);
                } else if (arg1 == 5) {
                    class183.field2965.method1947((byte) 89, 214);
                    class251.field3952++;
                    class183.field2965.method30(class81.field1116[var5], (byte) 98);
                    class183.field2965.method96((byte) 57, 0);
                } else if (arg1 == 6) {
                    class27.field397++;
                    class183.field2965.method1947((byte) 101, 114);
                    class183.field2965.method80(0, 5);
                    class183.field2965.method45(true, class81.field1116[var5]);
                } else if (arg1 == 7) {
                    class183.field2965.method1947((byte) -126, 103);
                    class183.field2965.method59(class81.field1116[var5], 23062);
                    class183.field2965.method61(0, (byte) -76);
                    class30.field444++;
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class131.method971("", (byte) -32, 0, class10.field193 + var3);
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)Llb;", line = 168)
    public static final class243 method200(int arg0, int arg1) {
        field283++;
        class243 var2 = (class243) class171.field2811.method1351((long) arg0, 63);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class24.field364.method1813(arg0, arg1, true);
        class243 var4 = new class243();
        if (var3 != null) {
            var4.method1743(arg0, 86, new class6(var3));
        }
        class171.field2811.method1347(var4, (long) arg0, (byte) -116);
        return var4;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)V")
    public abstract void method195(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
    public abstract void method198(int arg0, int arg1);
}
