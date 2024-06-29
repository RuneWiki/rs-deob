import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class164 extends class160 {

    @OriginalMember(owner = "client!il", name = "X", descriptor = "I")
    private int field2579 = 4096;

    @OriginalMember(owner = "client!il", name = "V", descriptor = "I")
    private int field2577 = 4096;

    @OriginalMember(owner = "client!il", name = "db", descriptor = "[I")
    private int[] field2585 = new int[3];

    @OriginalMember(owner = "client!il", name = "eb", descriptor = "I")
    private int field2586 = 4096;

    @OriginalMember(owner = "client!il", name = "S", descriptor = "I")
    private int field2574 = 409;

    @OriginalMember(owner = "client!il", name = "Z", descriptor = "I")
    public static int field2581 = 0;

    @OriginalMember(owner = "client!il", name = "T", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!il", name = "W", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!il", name = "Y", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!il", name = "ab", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!il", name = "bb", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!il", name = "cb", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!il", name = "U", descriptor = "Lke;")
    public static class110 field2576;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(II)Llf;")
    public static final class217 method1110(int arg0, int arg1) {
        ++field2580;
        if (arg0 > -44) {
            return null;
        } else {
            class217 var2 = (class217) class50.field736.method1887(0, (long) arg1);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class13.field211.method1590(class61.method461(arg1, 121), (byte) -25, class78.method561(arg1, (byte) -111));
                class217 var4 = new class217();
                if (var3 != null) {
                    var4.method1460(new class88(var3), -24290);
                }
                class50.field736.method1886(-78, (long) arg1, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZI)V")
    public static final void method1111(boolean arg0, int arg1) {
        ++field2583;
        if (arg1 != 0) {
            field2576 = null;
        }
        for (class11 var2 = (class11) class185.field2857.method1221(127); var2 != null; var2 = (class11) class185.field2857.method1227(-10626)) {
            if (var2.field206 != null) {
                class257.field4118.method1205(var2.field206);
                var2.field206 = null;
            }
            if (var2.field195 != null) {
                class257.field4118.method1205(var2.field195);
                var2.field195 = null;
            }
            var2.method1123(arg1);
        }
        if (arg0) {
            for (class11 var3 = (class11) class102.field1699.method1221(115); var3 != null; var3 = (class11) class102.field1699.method1227(-10626)) {
                if (var3.field206 != null) {
                    class257.field4118.method1205(var3.field206);
                    var3.field206 = null;
                }
                var3.method1123(0);
            }
            for (class11 var4 = (class11) class30.field444.method287(-126); var4 != null; var4 = (class11) class30.field444.method291((byte) -117)) {
                if (var4.field206 != null) {
                    class257.field4118.method1205(var4.field206);
                    var4.field206 = null;
                }
                var4.method1123(0);
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
    public class164() {
        super(1, false);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method3(int arg0, boolean arg1) {
        if (!arg1) {
            method1111(true, 63);
        }
        int[][] var3 = super.field2476.method839(!arg1, arg0);
        if (super.field2476.field1950) {
            int[][] var4 = this.method1079(arg0, 100, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class240.field3896; ++var11) {
                int var12 = var6[var11];
                int var13 = var12 - this.field2585[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~this.field2574 > ~var13) {
                    var8[var11] = var12;
                    var9[var11] = var5[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var5[var11];
                    int var15 = -this.field2585[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var15 > this.field2574) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field2585[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~this.field2574 > ~var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field2586 * var12 >> 12;
                            var9[var11] = this.field2577 * var14 >> 12;
                            var10[var11] = this.field2579 * var16 >> 12;
                        }
                    }
                }
            }
        }
        ++field2578;
        return var3;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        if (arg1 >= 11) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (~arg2 != -3) {
                        if (~arg2 != -4) {
                            if (~arg2 == -5) {
                                int var5 = arg0.method671(112);
                                this.field2585[2] = class55.method420(255, var5) >> 12;
                                this.field2585[1] = class55.method420(var5, 65280) >> 4;
                                this.field2585[0] = class55.method420(267386880, var5 << 4);
                            }
                        } else {
                            this.field2586 = arg0.method645(11596);
                        }
                    } else {
                        this.field2577 = arg0.method645(11596);
                    }
                } else {
                    this.field2579 = arg0.method645(11596);
                }
            } else {
                this.field2574 = arg0.method645(11596);
            }
            ++field2582;
        }
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(I)V")
    public static void method1112(int arg0) {
        if (arg0 == 32112) {
            field2576 = null;
        }
    }
}
