import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class184 extends class398 {

    @OriginalMember(owner = "client!um", name = "M", descriptor = "I")
    private int field2488 = 0;

    @OriginalMember(owner = "client!um", name = "N", descriptor = "I")
    private int field2489 = 1;

    @OriginalMember(owner = "client!um", name = "W", descriptor = "I")
    private int field2498 = 0;

    @OriginalMember(owner = "client!um", name = "O", descriptor = "Ljava/lang/String;")
    public static String field2490 = "yellow:";

    @OriginalMember(owner = "client!um", name = "V", descriptor = "D")
    public static double field2497 = -1.0D;

    @OriginalMember(owner = "client!um", name = "J", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!um", name = "K", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!um", name = "P", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!um", name = "R", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!um", name = "S", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!um", name = "T", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!um", name = "Q", descriptor = "Llm;")
    public static class347 field2492;

    @OriginalMember(owner = "client!um", name = "U", descriptor = "Z")
    public static boolean field2496;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(Z)Z")
    public static final boolean method1119(boolean arg0) {
        for (int var1 = class68.field875; var1 < class180.field2380; ++var1) {
            class254[][] var2 = class213.field2852[var1];
            for (int var3 = -class264.field3838; var3 <= 0; ++var3) {
                int var4 = class104.field1491 + var3;
                int var5 = class104.field1491 - var3;
                if (var4 >= class34.field476 || var5 < class63.field849) {
                    for (int var6 = -class264.field3838; var6 <= 0; ++var6) {
                        int var7 = class428.field6302 + var6;
                        int var8 = class428.field6302 - var6;
                        if (var4 >= class34.field476) {
                            if (var7 >= class310.field4561) {
                                class254 var9 = var2[var4][var7];
                                if (var9 != null && var9.field3501) {
                                    class423.field6233 = arg0;
                                    class328.field4782.method560(var9, (byte) 48);
                                    class328.field4782.method558((byte) -50);
                                }
                            }
                            if (var8 < class5.field65) {
                                class254 var10 = var2[var4][var8];
                                if (var10 != null && var10.field3501) {
                                    class423.field6233 = arg0;
                                    class328.field4782.method560(var10, (byte) 48);
                                    class328.field4782.method558((byte) -88);
                                }
                            }
                        }
                        if (var5 < class63.field849) {
                            if (var7 >= class310.field4561) {
                                class254 var11 = var2[var5][var7];
                                if (var11 != null && var11.field3501) {
                                    class423.field6233 = arg0;
                                    class328.field4782.method560(var11, (byte) 48);
                                    class328.field4782.method558((byte) -122);
                                }
                            }
                            if (var8 < class5.field65) {
                                class254 var12 = var2[var5][var8];
                                if (var12 != null && var12.field3501) {
                                    class423.field6233 = arg0;
                                    class328.field4782.method560(var12, (byte) 48);
                                    class328.field4782.method558((byte) -46);
                                }
                            }
                        }
                        if (class375.field5462 == 0) {
                            if (class125.field1750) {
                                class328.field4782.method562((byte) -54, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
    public class184() {
        super(0, true);
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(I)V")
    public final void method209(int arg0) {
        class42.method303(7344);
        if (arg0 != 16) {
            field2487 = 17;
        }
        ++field2491;
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(B)V")
    public static void method1120(byte arg0) {
        field2492 = null;
        field2490 = null;
        if (arg0 != 7) {
            field2497 = -1.3637427845245174D;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II)[I")
    public final int[] method95(int arg0, int arg1) {
        if (arg1 != 0) {
            field2487 = -33;
        }
        ++field2493;
        int[] var3 = super.field5927.method305(arg0, (byte) 99);
        if (super.field5927.field591) {
            int var4 = class84.field1206[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; class140.field1922 > var6; ++var6) {
                int var7 = class375.field5448[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (this.field2498 == 0) {
                    var9 = (-var4 + var7) * this.field2489;
                } else {
                    int var10 = var8 * var8 - -(var5 * var5) >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field2489 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (~this.field2488 != -1) {
                    if (this.field2488 == 2) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = 2048 - var12 << 1;
                    }
                } else {
                    var12 = class159.field2152[(4087 & var12) >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(Z)I")
    public static final int method1121(boolean arg0) {
        ++field2495;
        return !arg0 ? -27 : 6;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lnj;II)V")
    public final void method208(class228 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 3) {
                    this.field2489 = arg0.method1348(-101);
                }
            } else {
                this.field2488 = arg0.method1348(-100);
            }
        } else {
            this.field2498 = arg0.method1348(arg2 + 13004);
        }
        ++field2486;
        if (arg2 != -13132) {
            this.method208((class228) null, -111, 38);
        }
    }
}
