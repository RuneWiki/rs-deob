import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class27 {

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "Ljava/lang/String;")
    public static String field376 = "yellow:";

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "Z")
    public static boolean field379 = false;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public int field380;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "[I")
    public static int[] field382;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILjj;)V", line = 11)
    public final void method154(int arg0, class44 arg1) {
        while (true) {
            int var3 = arg1.method286((byte) -66);
            if (var3 == 0) {
                if (arg0 != -2432) {
                    this.field375 = -82;
                }
                field374++;
                return;
            }
            this.method157(var3, arg1, -116);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIII)V", line = 31)
    public static final void method155(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class52.field738 < 100) {
            class126.method912(79);
        }
        field381++;
        if (class232.field3690) {
            class75.method506(arg1, arg0, arg1 + arg3, arg0 + arg2);
        } else {
            class59.method389(arg1, arg0, arg1 + arg3, arg0 + arg2);
        }
        if (class52.field738 < 100) {
            int var5 = arg1 + (arg3 / 2);
            byte var6 = 20;
            int var7 = arg0 - (18 - (arg2 / 2)) - var6;
            if (class232.field3690) {
                class75.method505(arg1, arg0, arg3, arg2, 0);
                class75.method507(var5 - 152, var7, 304, 34, 9179409);
                class75.method507(var5 - 151, var7 + 1, 302, 32, 0);
                class75.method505(var5 - 150, var7 + 2, class52.field738 * 3, 30, 9179409);
                class75.method505(class52.field738 * 3 + var5 - 150, var7 + 2, 300 - (class52.field738 * 3), 30, 0);
            } else {
                class59.method382(arg1, arg0, arg3, arg2, 0);
                class59.method390(var5 - 152, var7, 304, 34, 9179409);
                class59.method390(var5 - 151, var7 - -1, 302, 32, 0);
                class59.method382(var5 - 150, var7 + 2, class52.field738 * 3, 30, 9179409);
                class59.method382(class52.field738 * 3 + var5 - 150, var7 + 2, 300 - class52.field738 * 3, 30, 0);
            }
            class282.field4538.method1796(class33.field446, var5, var7 + var6, 16777215, -1);
            return;
        }
        class234.field3751 = class139.field2195 - ((int) ((float) arg3 / class122.field1920));
        class202.field3281 = (int) ((float) (arg2 * 2) / class122.field1920);
        class307.field4785 = (int) ((float) (arg3 * arg4) / class122.field1920);
        int var8 = class139.field2195 - ((int) ((float) arg3 / class122.field1920));
        class173.field2867 = class91.field1254 - (int) ((float) arg2 / class122.field1920);
        int var9 = class91.field1254 - (int) ((float) arg2 / class122.field1920);
        int var10 = (int) ((float) arg2 / class122.field1920) + class91.field1254;
        int var11 = (int) ((float) arg3 / class122.field1920) + class139.field2195;
        if (class232.field3690) {
            if (class296.field4687 == null || class296.field4687.field825 != arg3 || class296.field4687.field816 != arg2) {
                class296.field4687 = null;
                class296.field4687 = new class220(arg3, arg2);
            }
            class59.method401(class296.field4687.field3545, arg3, arg2);
            class273.method1980(0, var8, var9, (byte) -80, 0, var11, arg3, arg2, var10);
            class85.method580(0, 0, class74.field1051, var9, arg3, var10, var11, var8, 0, arg2);
            class344.method2388(arg3, var10, var11, 0, arg2, var9, var8, arg4 ^ 0xFFFFFF97, 0);
            class296.field4687.method1570();
            class75.method512(class296.field4687.field3545, arg1, arg0, arg3, arg2);
            class59.field833 = null;
        } else {
            class273.method1980(arg0, var8, var9, (byte) -101, arg1, var11, arg1 + arg3, arg0 - -arg2, var10);
            class85.method580(arg0, arg1, class74.field1051, var9, arg1 + arg3, var10, var11, var8, 0, arg0 + arg2);
            class344.method2388(arg1 + arg3, var10, var11, arg1, arg0 + arg2, var9, var8, -114, arg0);
        }
        if (class69.field969 > 0) {
            class165.field2743--;
            if (class165.field2743 == 0) {
                class69.field969--;
                class165.field2743 = 20;
            }
        }
        if (!class247.field3899) {
            return;
        }
        int var12 = arg0 + arg2 - 8;
        int var13 = arg1 + arg3 - 5;
        class296.field4688.method1813("Fps:" + class145.field2257, var13, var12, 16776960, -1);
        Runtime var14 = Runtime.getRuntime();
        int var15 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
        int var16 = 16776960;
        int var17 = var12 - 15;
        if (var15 > 65536) {
            var16 = 16711680;
        }
        class296.field4688.method1813("Mem:" + var15 + "k", var13, var17, var16, -1);
        var12 = var17 - 15;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZ)I", line = 147)
    public static final int method156(int arg0, boolean arg1) {
        if (arg1) {
            return -123;
        } else {
            field378++;
            return arg0 & 0x7F;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILjj;I)V", line = 158)
    private final void method157(int arg0, class44 arg1, int arg2) {
        if (arg0 == 1) {
            this.field370 = arg1.method271(21081);
            this.field375 = arg1.method286((byte) -76);
            this.field380 = arg1.method286((byte) -116);
        }
        int var4 = 11 / ((arg2 + 25) / 47);
        field373++;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V", line = 179)
    public static void method158(int arg0) {
        if (arg0 < -71) {
            field382 = null;
            field376 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 196)
    public static final Class method159(int arg0, String arg1) throws ClassNotFoundException {
        if (arg0 != 3) {
            method160(-114, 7);
        }
        field369++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)Ljava/lang/String;", line = 236)
    public static final String method160(int arg0, int arg1) {
        field371++;
        if (arg0 < 999999999) {
            return Integer.toString(arg0);
        } else if (arg1 == 9179409) {
            return "*";
        } else {
            return (String) null;
        }
    }
}
