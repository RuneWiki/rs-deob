import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class183 extends class304 {

    @OriginalMember(owner = "client!wl", name = "T", descriptor = "Z")
    private boolean field2892 = true;

    @OriginalMember(owner = "client!wl", name = "eb", descriptor = "Z")
    private boolean field2903 = true;

    @OriginalMember(owner = "client!wl", name = "V", descriptor = "I")
    public static int field2894 = -1;

    @OriginalMember(owner = "client!wl", name = "Q", descriptor = "I")
    public static volatile int field2889 = -1;

    @OriginalMember(owner = "client!wl", name = "U", descriptor = "I")
    public static int field2893 = -1;

    @OriginalMember(owner = "client!wl", name = "X", descriptor = "I")
    public static int field2896 = 0;

    @OriginalMember(owner = "client!wl", name = "R", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!wl", name = "S", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!wl", name = "W", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!wl", name = "Y", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!wl", name = "ab", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!wl", name = "cb", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!wl", name = "db", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!wl", name = "Z", descriptor = "[Laf;")
    public static class195[] field2898;

    @OriginalMember(owner = "client!wl", name = "bb", descriptor = "[[[B")
    public static byte[][][] field2900;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(II)Z", line = 10)
    public static final boolean method1359(int arg0, int arg1) {
        if (arg1 != 1) {
            field2889 = -128;
        }
        field2902++;
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lwm;II)V", line = 38)
    public final void method69(class254 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field2903 = arg0.method1774((byte) 84) == 1;
        } else if (arg1 == 1) {
            this.field2892 = arg0.method1774((byte) 96) == 1;
        } else if (arg1 == 2) {
            this.field4652 = arg0.method1774((byte) -116) == 1;
        }
        field2895++;
        if (arg2 != -2828) {
            field2894 = -95;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIILjava/lang/String;I)V", line = 74)
    public static final void method1360(int arg0, int arg1, int arg2, String arg3, int arg4) {
        field2890++;
        class161 var5 = class94.method680(arg1, 0, arg0);
        if (var5 == null) {
            return;
        }
        if (var5.field2528 != null) {
            class296 var6 = new class296();
            var6.field4568 = arg3;
            var6.field4565 = arg4;
            var6.field4574 = var5;
            var6.field4575 = var5.field2528;
            class251.method1719(-31, var6);
        }
        boolean var7 = true;
        if (var5.field2598 > 0) {
            var7 = class34.method266(1, var5);
        }
        if (!var7 || !client.method1012(var5).method26(1, arg4 - 1)) {
            return;
        }
        if (arg4 == 1) {
            class160.field2428++;
            class85.field1236.method1141((byte) 30, 70);
            class85.field1236.method1773(arg1, false);
            class85.field1236.method1744(true, arg0);
        }
        if (arg4 == 2) {
            class47.field651++;
            class85.field1236.method1141((byte) 84, 209);
            class85.field1236.method1773(arg1, false);
            class85.field1236.method1744(true, arg0);
        }
        if (arg4 == 3) {
            class85.field1236.method1141((byte) 51, 138);
            class35.field507++;
            class85.field1236.method1773(arg1, false);
            class85.field1236.method1744(true, arg0);
        }
        if (arg4 == 4) {
            class168.field2716++;
            class85.field1236.method1141((byte) 30, 119);
            class85.field1236.method1773(arg1, false);
            class85.field1236.method1744(true, arg0);
        }
        if (arg4 == 5) {
            class223.field3391++;
            class85.field1236.method1141((byte) 88, 227);
            class85.field1236.method1773(arg1, false);
            class85.field1236.method1744(true, arg0);
        }
        if (arg4 == 6) {
            class231.field3525++;
            class85.field1236.method1141((byte) 119, 116);
            class85.field1236.method1773(arg1, false);
            class85.field1236.method1744(true, arg0);
        }
        if (arg4 == 7) {
            class65.field939++;
            class85.field1236.method1141((byte) 76, 156);
            class85.field1236.method1773(arg1, false);
            class85.field1236.method1744(true, arg0);
        }
        if (arg4 == 8) {
            class85.field1236.method1141((byte) 45, 32);
            class197.field3026++;
            class85.field1236.method1773(arg1, false);
            class85.field1236.method1744(true, arg0);
        }
        if (arg4 == 9) {
            class174.field2805++;
            class85.field1236.method1141((byte) 66, 198);
            class85.field1236.method1773(arg1, false);
            class85.field1236.method1744(true, arg0);
        }
        if (arg2 > -12) {
            method1362(41, true);
        }
        if (arg4 == 10) {
            class41.field592++;
            class85.field1236.method1141((byte) 49, 35);
            class85.field1236.method1773(arg1, false);
            class85.field1236.method1744(true, arg0);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)[I", line = 203)
    public final int[] method71(int arg0, int arg1) {
        if (arg0 != 7) {
            return (int[]) null;
        }
        field2897++;
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (this.field4669.field5223) {
            int[] var4 = this.method2086(this.field2892 ? class65.field941 - arg1 : arg1, 0, (byte) 112);
            if (this.field2903) {
                for (int var5 = 0; var5 < class218.field3333; var5++) {
                    var3[var5] = var4[class54.field721 - var5];
                }
            } else {
                class126.method944(var4, 0, var3, 0, class218.field3333);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "(B)V", line = 239)
    public static void method1361(byte arg0) {
        field2900 = (byte[][][]) null;
        field2898 = null;
        if (arg0 != 114) {
            field2900 = (byte[][][]) ((byte[][][]) null);
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)[[I", line = 250)
    public final int[][] method75(int arg0, int arg1) {
        field2891++;
        int[][] var3 = this.field4663.method886(arg0, 3);
        if (arg1 != 0) {
            this.method75(117, -112);
        }
        if (this.field4663.field1820) {
            int[][] var4 = this.method2082(0, (byte) -74, this.field2892 ? class65.field941 - arg0 : arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            if (this.field2903) {
                for (int var11 = 0; var11 < class218.field3333; var11++) {
                    var7[var11] = var6[class54.field721 - var11];
                    var8[var11] = var5[class54.field721 - var11];
                    var10[var11] = var9[class54.field721 - var11];
                }
            } else {
                for (int var12 = 0; var12 < class218.field3333; var12++) {
                    var7[var12] = var6[var12];
                    var8[var12] = var5[var12];
                    var10[var12] = var9[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V", line = 329)
    public class183() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 333)
    public static final String method1362(int arg0, boolean arg1) {
        if (!arg1) {
            field2896 = 17;
        }
        field2899++;
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }
}
