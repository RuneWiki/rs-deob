import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class397 extends class15 {

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field6031;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "Lmo;")
    public static class531 field6027 = new class531(6, 7);

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "Ljava/lang/String;")
    public static String field6030 = "";

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "[I")
    public static int[] field6033 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "Lbc;")
    public static class248 field6032;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZII)V", line = 12)
    public static final void method2462(int arg0, boolean arg1, int arg2, int arg3) {
        field6028++;
        class18 var4 = class140.method1047(11, arg0, false);
        var4.method122(arg1);
        var4.field283 = arg3;
        var4.field291 = arg2;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBI)V", line = 25)
    public static final void method2463(int arg0, byte arg1, int arg2) {
        field6026++;
        if (class319.field4859 < class319.field4856) {
            class319.field4859 = (float) ((double) class319.field4859 / 30.0D + (double) class319.field4859);
            if (class319.field4859 > class319.field4856) {
                class319.field4859 = class319.field4856;
            }
            class191.method1295(1130);
            class319.field4851 = (int) class319.field4859 >> 1;
            class319.field4857 = class19.method128(class319.field4851, -18606);
        } else if (class319.field4859 > class319.field4856) {
            class319.field4859 = (float) ((double) class319.field4859 - (double) class319.field4859 / 30.0D);
            if (class319.field4856 > class319.field4859) {
                class319.field4859 = class319.field4856;
            }
            class191.method1295(1130);
            class319.field4851 = (int) class319.field4859 >> 1;
            class319.field4857 = class19.method128(class319.field4851, -18606);
        }
        if (class79.field1578 != -1 && class322.field4926 != -1) {
            int var3 = class79.field1578 - class71.field1437;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class322.field4926 - class457.field6775;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class71.field1437 -= -var3;
            class457.field6775 += var4;
            if (var3 == 0 && var4 == 0) {
                class322.field4926 = -1;
                class79.field1578 = -1;
            }
            class191.method1295(1130);
        }
        if (arg1 < 14) {
            return;
        }
        if (class420.field6337 <= 0) {
            class310.field4697 = -1;
            class263.field4026 = -1;
        } else {
            class25.field383--;
            if (class25.field383 == 0) {
                class25.field383 = 100;
                class420.field6337--;
            }
        }
        if (!class84.field1745 || class454.field6754 == null) {
            return;
        }
        for (class463 var5 = (class463) class454.field6754.method1892(90); var5 != null; var5 = (class463) class454.field6754.method1893((byte) -2)) {
            class25 var6 = class319.field4842.method1247(false, var5.field6872.field1890);
            if (var5.method2775(arg2, (byte) -125, arg0)) {
                if (var6.field379 != null) {
                    if (var6.field379[4] != null) {
                        class274.method1739(var6.field379[4], 112, 1009, (long) var5.field6872.field1890, var6.field359, false, -1, var6.field341, true, -1, 0);
                    }
                    if (var6.field379[3] != null) {
                        class274.method1739(var6.field379[3], 19, 1006, (long) var5.field6872.field1890, var6.field359, false, -1, var6.field341, true, -1, 0);
                    }
                    if (var6.field379[2] != null) {
                        class274.method1739(var6.field379[2], 50, 1010, (long) var5.field6872.field1890, var6.field359, false, -1, var6.field341, true, -1, 0);
                    }
                    if (var6.field379[1] != null) {
                        class274.method1739(var6.field379[1], 37, 1011, (long) var5.field6872.field1890, var6.field359, false, -1, var6.field341, true, -1, 0);
                    }
                    if (var6.field379[0] != null) {
                        class274.method1739(var6.field379[0], 75, 1002, (long) var5.field6872.field1890, var6.field359, false, -1, var6.field341, true, -1, 0);
                    }
                }
                if (!var5.field6872.field1891) {
                    var5.field6872.field1891 = true;
                    class495.method2992(class417.field6287, var5.field6872.field1890, var6.field359);
                }
                if (var5.field6872.field1891) {
                    class495.method2992(class460.field6859, var5.field6872.field1890, var6.field359);
                }
            } else if (var5.field6872.field1891) {
                var5.field6872.field1891 = false;
                class495.method2992(class102.field1945, var5.field6872.field1890, var6.field359);
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(I)V", line = 169)
    public class397(int arg0) {
        this.field6031 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V", line = 178)
    public static void method2464(int arg0) {
        field6032 = null;
        field6033 = null;
        field6027 = null;
        field6030 = null;
        if (arg0 >= -84) {
            field6030 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V", line = 191)
    public final void method2465(int arg0) {
        this.field6031.method2652();
        if (arg0 > -66) {
            this.method2465(-114);
        }
        field6029++;
    }
}
