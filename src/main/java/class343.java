import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class343 extends class137 implements class497 {

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "Lwha;")
    private class285 field4333;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Lfh;")
    public static class653 field4334 = new class653();

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    public static int field4342 = 0;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "Ltha;")
    public static class296 field4343;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([BB)V", line = 5)
    public static final void method1972(byte[] arg0, byte arg1) {
        ++field4335;
        class461 var2 = new class461(arg0);
        int var3 = -116 / ((57 - arg1) / 37);
        while (true) {
            int var4;
            label45: do {
                while (true) {
                    while (true) {
                        var4 = var2.method2600((byte) -125);
                        if (var4 == 0) {
                            return;
                        }
                        if (~var4 != -2) {
                            if (var4 != 4) {
                                continue label45;
                            }
                            int var7 = var2.method2600((byte) -128);
                            class273.field3429 = new int[var7];
                            for (int var8 = 0; var8 < var7; ++var8) {
                                class273.field3429[var8] = var2.method2566(-2);
                                if (~class273.field3429[var8] == -65536) {
                                    class273.field3429[var8] = -1;
                                }
                            }
                        } else {
                            int[] var9 = class615.field8494 = new int[6];
                            var9[0] = var2.method2566(-2);
                            var9[1] = var2.method2566(-2);
                            var9[2] = var2.method2566(-2);
                            var9[3] = var2.method2566(-2);
                            var9[4] = var2.method2566(-2);
                            var9[5] = var2.method2566(-2);
                        }
                    }
                }
            } while (~var4 != -6);
            int var5 = var2.method2600((byte) -125);
            class759.field10593 = new int[var5];
            for (int var6 = 0; ~var5 < ~var6; ++var6) {
                class759.field10593[var6] = var2.method2566(-2);
                if (class759.field10593[var6] == 65535) {
                    class759.field10593[var6] = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)Z", line = 85)
    public final boolean method1368(boolean arg0) {
        ++field4336;
        return !arg0 ? false : super.method1004(super.field1962.field4475, (byte) 126);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;", line = 96)
    public final Buffer method1369(int arg0, boolean arg1) {
        ++field4339;
        if (arg0 != -25053) {
            this.field4333 = null;
        }
        return super.method1010(arg1, super.field1962.field4475, (byte) -117);
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ltk;Lwha;Z)V", line = 109)
    public class343(class347 arg0, class285 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field4333 = arg1;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)Lwha;", line = 121)
    public final class285 method1370(byte arg0) {
        int var2 = 54 % ((arg0 - -21) / 47);
        ++field4340;
        return this.field4333;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 133)
    public final void method294(byte arg0) {
        ++field4341;
        super.method294(arg0);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V", line = 143)
    public final void method1008(int arg0, int arg1) {
        super.method1008(this.field4333.field3586 * arg0, arg1);
        if (arg1 != 23833) {
            field4334 = null;
        }
        ++field4338;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)V", line = 156)
    public static void method1973(boolean arg0) {
        field4343 = null;
        field4334 = null;
        if (arg0) {
            field4334 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)I", line = 167)
    public final int method297(int arg0) {
        ++field4337;
        if (arg0 != 2) {
            method1972((byte[]) null, (byte) 102);
        }
        return super.method297(2);
    }
}
