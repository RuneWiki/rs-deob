import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class150 extends class326 {

    @OriginalMember(owner = "client!ae", name = "Z", descriptor = "I")
    private int field2127;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "[I")
    public static int[] field2116 = new int[13];

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    public static int field2119 = 0;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
    public static int field2120 = 0;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "Lh;")
    public static class434 field2117 = new class434(97, 7);

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "Lta;")
    public static class128 field2121;

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "[[Z")
    public static boolean[][] field2125;

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
    public class150() {
        this(4096);
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(Z)V")
    public static void method887(boolean arg0) {
        field2117 = null;
        field2116 = null;
        if (!arg0) {
            field2120 = 109;
        }
        field2121 = null;
        field2125 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILbt;I)V")
    public final void method33(int arg0, class32 arg1, int arg2) {
        if (arg0 == 0) {
            this.field2127 = (arg1.method201((byte) -120) << 12) / 255;
        }
        if (arg2 >= -3) {
            this.method30((byte) -128, -69);
        }
        ++field2115;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(BI)Lnk;")
    public static final class464 method888(byte arg0, int arg1) {
        if (arg0 != -115) {
            method889(28, (byte) 69, -83, -70);
        }
        ++field2118;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 65535;
        if (class146.field2099[var2] == null || class146.field2099[var2][var3] == null) {
            boolean var4 = class492.method2867(var2, (byte) 83);
            if (!var4) {
                return null;
            }
        }
        return class146.field2099[var2][var3];
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        if (arg0 >= -6) {
            return null;
        } else {
            ++field2123;
            int[] var3 = super.field4344.method130(arg1, -110);
            if (super.field4344.field286) {
                class380.method2337(var3, 0, class181.field2495, this.field2127);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBII)V")
    public static final void method889(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = 36 / ((46 - arg1) / 46);
        ++field2124;
        String var5 = "tele " + arg0 + "," + (arg3 >> 6) + "," + (arg2 >> 6) + "," + (63 & arg3) + "," + (63 & arg2);
        System.out.println(var5);
        class205.method1172(var5, true, false);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lnk;III)V")
    public static final void method890(class464 arg0, int arg1, int arg2, int arg3) {
        if (!class289.field3899) {
            for (int var4 = 9; ~var4 <= -6; --var4) {
                String var8 = class367.method2243(arg0, false, var4);
                if (var8 != null) {
                    class402.method2436(arg0.field6402, true, arg0.field6440, false, (byte) 119, var8, arg0.field6397, 1011, arg0.field6400, class245.method1362(false, arg0, var4), (long) (var4 + 1));
                    ++class158.field2178;
                }
            }
            String var5 = class67.method446(-17504, arg0);
            if (var5 != null) {
                ++class409.field5601;
                class402.method2436(arg0.field6402, true, arg0.field6440, false, (byte) 127, var5, arg0.field6397, 49, arg0.field6400, arg0.field6334, 0L);
            }
            for (int var6 = 4; ~var6 <= -1; --var6) {
                String var7 = class367.method2243(arg0, false, var6);
                if (var7 != null) {
                    ++class158.field2178;
                    class402.method2436(arg0.field6402, true, arg0.field6440, false, (byte) 116, var7, arg0.field6397, 45, arg0.field6400, class245.method1362(false, arg0, var6), (long) (var6 + 1));
                }
            }
            if (client.method1046(arg0).method1259(-16034)) {
                if (arg0.field6410 == null) {
                    class402.method2436(arg0.field6402, true, arg0.field6440, false, (byte) 103, class228.field3000.method1176(class110.field1676, (byte) -127), arg0.field6397, 30, "", -1, 0L);
                } else {
                    class402.method2436(arg0.field6402, true, arg0.field6440, false, (byte) 121, arg0.field6410, arg0.field6397, 30, "", -1, 0L);
                }
                ++class459.field6223;
            }
        } else if (client.method1046(arg0).method1255((byte) 76) && ~(class456.field6187 & 32) != -1) {
            ++class94.field1375;
            class402.method2436(arg0.field6402, true, arg0.field6440, false, (byte) 124, class491.field6867, arg0.field6397, 11, class31.field407 + " -> " + arg0.field6400, class297.field3974, 0L);
        }
        ++field2122;
        if (arg2 != 30) {
            field2116 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V")
    public class150(int arg0) {
        super(0, true);
        this.field2127 = 4096;
        this.field2127 = arg0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
    public static final Object method891(int arg0, boolean arg1, byte[] arg2) {
        ++field2126;
        if (arg2 == null) {
            return null;
        } else {
            if (arg2.length > 136 && !class30.field401) {
                try {
                    class48 var3 = (class48) Class.forName("st").newInstance();
                    var3.method342(arg2, true);
                    return var3;
                } catch (Throwable var5) {
                    class30.field401 = true;
                }
            }
            int var4 = -21 / ((-31 - arg0) / 36);
            return arg1 ? class31.method182(arg2, -109) : arg2;
        }
    }
}
