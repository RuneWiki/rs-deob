import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class308 extends class372 {

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "[I")
    private int[] field4494 = new int[this.field5275];

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public static int field4507 = 0;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    private int field4500;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    private int field4502;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "Ldp;")
    public static class174 field4493;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "Lof;")
    public static class421 field4509;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "Z")
    public static boolean field4506;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "[B")
    private byte[] field4499;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BII)V")
    public final void method2104(byte arg0, int arg1, int arg2) {
        this.field4500 += this.field4494[arg2] * arg1 >> 12;
        ++field4497;
        if (arg0 != 109) {
            method2111(-94);
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)V")
    public final void method2105(byte arg0) {
        ++field4501;
        if (arg0 <= -115) {
            this.field4500 = 0;
            this.field4502 = 0;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I[III[I[B[[B[[B)I")
    public static final int method2106(int arg0, int[] arg1, int arg2, int arg3, int[] arg4, byte[] arg5, byte[][] arg6, byte[][] arg7) {
        ++field4492;
        int var8 = arg4[arg2];
        int var9 = var8 - -arg1[arg2];
        if (arg3 != 5608) {
            field4507 = -121;
        }
        int var10 = arg4[arg0];
        int var11 = arg1[arg0] + var10;
        int var12 = var8;
        if (~var10 < ~var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (~var9 < ~var11) {
            var13 = var11;
        }
        int var14 = arg5[arg2] & 255;
        if (~var14 < ~(arg5[arg0] & 255)) {
            var14 = arg5[arg0] & 255;
        }
        byte[] var15 = arg7[arg2];
        byte[] var16 = arg6[arg0];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; ++var19) {
            int var20 = var16[var18++] + var15[var17++];
            if (~var14 < ~var20) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)Llq;")
    public static final class75 method2107(int arg0, int arg1) {
        ++field4508;
        class75 var2 = (class75) class22.field343.method103(0, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 != 200) {
            return null;
        } else {
            byte[] var3 = class239.field3441.method1355(arg1, -12607, 31);
            class75 var4 = new class75();
            if (var3 != null) {
                var4.method591((byte) -122, new class37(var3), arg1);
            }
            class22.field343.method113(var4, 0, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)V")
    public void method1632(int arg0, byte arg1) {
        ++field4498;
        this.field4499[this.field4502++] = (byte) (127 + class35.method254(127, arg1 >> 1));
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(IIIIIF)V")
    public class308(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~var7 > ~super.field5275; ++var7) {
            this.field4494[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2108(String arg0, byte arg1) {
        ++field4496;
        if (arg0 != null) {
            if ((class284.field4255 < 100 || class389.field5581) && class284.field4255 < 200) {
                String var2 = class126.method1065(false, arg0);
                if (var2 != null) {
                    if (arg1 == -70) {
                        for (int var3 = 0; ~class284.field4255 < ~var3; ++var3) {
                            String var7 = class126.method1065(false, class164.field2473[var3]);
                            if (var7 != null && var7.equals(var2)) {
                                class373.method2380(19380, arg0 + class16.field234);
                                return;
                            }
                            if (class307.field4484[var3] != null) {
                                String var8 = class126.method1065(false, class307.field4484[var3]);
                                if (var8 != null && var8.equals(var2)) {
                                    class373.method2380(19380, arg0 + class16.field234);
                                    return;
                                }
                            }
                        }
                        for (int var4 = 0; class119.field1866 > var4; ++var4) {
                            String var5 = class126.method1065(false, class443.field6438[var4]);
                            if (var5 != null && var5.equals(var2)) {
                                class373.method2380(19380, class191.field2831 + arg0 + class37.field540);
                                return;
                            }
                            if (class205.field3010[var4] != null) {
                                String var6 = class126.method1065(false, class205.field3010[var4]);
                                if (var6 != null && var6.equals(var2)) {
                                    class373.method2380(19380, class191.field2831 + arg0 + class37.field540);
                                    return;
                                }
                            }
                        }
                        if (class126.method1065(false, class86.field1394.field2066).equals(var2)) {
                            class373.method2380(arg1 + 19450, class429.field6210);
                        } else {
                            ++class256.field3700;
                            class13.field216.method2781(false, 198);
                            class13.field216.method267(class429.method2677(arg0, 1), false);
                            class13.field216.method265((byte) -81, arg0);
                        }
                    }
                }
            } else {
                class373.method2380(arg1 ^ -19442, class147.field2278);
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
    public final void method2109(boolean arg0) {
        this.field4500 = Math.abs(this.field4500);
        ++field4505;
        if (~this.field4500 <= -4097) {
            this.field4500 = 4095;
        }
        this.method1632(this.field4502++, (byte) (this.field4500 >> 4));
        this.field4500 = 0;
        if (!arg0) {
            this.method1632(93, (byte) -67);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIII)V")
    public static final void method2110(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class321.field4641 * arg1 >> 8;
        ++field4503;
        if (~var4 != -1 && ~arg3 != 0) {
            class121.method1012((byte) 14, var4, false, class151.field2312, 0, arg3);
            class387.field5546 = true;
        }
        if (arg0 != 0) {
            field4495 = 77;
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
    public static void method2111(int arg0) {
        field4493 = null;
        field4509 = null;
        if (arg0 != 0) {
            method2111(123);
        }
    }
}
