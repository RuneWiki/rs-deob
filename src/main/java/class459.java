import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class459 extends class72 {

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "Lkg;")
    public static class271 field6619 = new class271("", 10);

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "Ljw;")
    public static class551 field6630 = new class551(9, 2);

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!vq", name = "p", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "Lsp;")
    public static class633 field6629;

    @OriginalMember(owner = "client!vq", name = "q", descriptor = "Lkr;")
    public static class743 field6628;

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(ILcq;)V")
    public class459(int arg0, class464 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public final void method55(int arg0) {
        if (arg0 < 30) {
            this.method59(-76, -121);
        }
        ++field6622;
    }

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "(I)V")
    public static final void method2799(int arg0) {
        ++field6620;
        if (~class647.field9160 > -103) {
            class647.field9160 += 6;
        }
        if (~class298.field4136 != 0 && ~class742.method4128(1) < ~class202.field2885) {
            for (int var1 = class298.field4136; var1 < class162.field2398.length; ++var1) {
                if (class162.field2398[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class162.field2398[var1].substring(6));
                    } catch (Exception var13) {
                    }
                    class569.method3326("Pausing for " + var2 + " seconds...", (byte) -42);
                    class298.field4136 = var1 - -1;
                    class202.field2885 = class742.method4128(1) + (long) (var2 * 1000);
                    return;
                }
                class718.field10065 = class162.field2398[var1];
                class215.method1498(70, false);
            }
            class298.field4136 = -1;
        }
        if (~class668.field9367 != -1) {
            class58.field1077 -= class668.field9367 * 5;
            if (class58.field1077 >= class405.field5649) {
                class58.field1077 = class405.field5649 + -1;
            }
            if (~class58.field1077 > -1) {
                class58.field1077 = 0;
            }
            class668.field9367 = 0;
        }
        for (int var3 = 0; class64.field1165 > var3; ++var3) {
            class602 var4 = class226.field3232[var3];
            int var5 = var4.method114(10721);
            char var6 = var4.method110(29932);
            int var7 = var4.method112((byte) -118);
            if (var5 == 84) {
                class215.method1498(-48, false);
            }
            if (var5 == 80) {
                class215.method1498(-120, true);
            } else if (~var5 == -67 && ~(var7 & 4) != -1) {
                if (class139.field2160 != null) {
                    String var8 = "";
                    for (int var9 = class748.field10459.length + -1; ~var9 <= -1; --var9) {
                        if (class748.field10459[var9] != null && class748.field10459[var9].length() > 0) {
                            var8 = var8 + class748.field10459[var9] + '\n';
                        }
                    }
                    class139.field2160.setContents(new StringSelection(var8), (ClipboardOwner) null);
                }
            } else if (var5 == 67 && (var7 & 4) != 0) {
                if (class139.field2160 != null) {
                    Transferable var10 = class139.field2160.getContents((Object) null);
                    if (var10 != null) {
                        try {
                            String var11 = (String) var10.getTransferData(DataFlavor.stringFlavor);
                            if (var11 != null) {
                                String[] var12 = class327.method2091('\n', 26911, var11);
                                class579.method3348(var12, 7281);
                            }
                        } catch (Exception var14) {
                        }
                    }
                }
            } else if (~var5 == -86 && class129.field1942 > 0) {
                class718.field10065 = class718.field10065.substring(0, class129.field1942 + -1) + class718.field10065.substring(class129.field1942);
                --class129.field1942;
            } else if (var5 == 101 && ~class129.field1942 > ~class718.field10065.length()) {
                class718.field10065 = class718.field10065.substring(0, class129.field1942) + class718.field10065.substring(class129.field1942 + 1);
            } else if (var5 == 96 && class129.field1942 > 0) {
                --class129.field1942;
            } else if (var5 == 97 && class129.field1942 < class718.field10065.length()) {
                ++class129.field1942;
            } else if (var5 != 102) {
                if (~var5 != -104) {
                    if (~var5 == -105 && ~class42.field643 > ~class748.field10459.length) {
                        ++class42.field643;
                        class41.method368(arg0 + -80);
                        class129.field1942 = class718.field10065.length();
                    } else if (var5 == 105 && class42.field643 > 0) {
                        --class42.field643;
                        class41.method368(arg0 + -80);
                        class129.field1942 = class718.field10065.length();
                    } else if (class317.method2038(122, var6) || ~var6 == -93 || ~var6 == -48 || var6 == '.' || ~var6 == -59 || var6 == ',' || ~var6 == -33 || var6 == '_' || ~var6 == -46 || var6 == '+' || ~var6 == -92 || var6 == ']') {
                        class718.field10065 = class718.field10065.substring(0, class129.field1942) + class226.field3232[var3].method110(29932) + class718.field10065.substring(class129.field1942);
                        ++class129.field1942;
                    }
                } else {
                    class129.field1942 = class718.field10065.length();
                }
            } else {
                class129.field1942 = 0;
            }
        }
        class64.field1165 = 0;
        if (arg0 == 80) {
            class56.field1055 = 0;
            class237.method1608(true);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/util/Random;IB)I")
    public static final int method2800(Random arg0, int arg1, byte arg2) {
        ++field6624;
        if (arg2 >= -29) {
            field6630 = null;
        }
        if (~arg1 >= -1) {
            throw new IllegalArgumentException();
        } else if (class278.method1826((byte) 114, arg1)) {
            return (int) ((long) arg1 * (4294967295L & (long) arg0.nextInt()) >> 32);
        } else {
            int var3 = -((int) (4294967296L % (long) arg1)) + Integer.MIN_VALUE;
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var4 >= var3);
            return class742.method4127((byte) -95, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V")
    public final void method59(int arg0, int arg1) {
        ++field6621;
        if (arg1 == 3) {
            super.field1282 = arg0;
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lcq;)V")
    public class459(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(II)I")
    public final int method58(int arg0, int arg1) {
        ++field6623;
        return arg1 != 11260 ? 9 : 1;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)I")
    public final int method60(int arg0) {
        if (arg0 != -3271) {
            method2799(-34);
        }
        ++field6626;
        return 0;
    }

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "(I)I")
    public final int method2801(int arg0) {
        ++field6627;
        if (arg0 != 27669) {
            field6630 = null;
        }
        return super.field1282;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIII)Lsfa;")
    public static final class693 method2802(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6625;
        if (arg4 <= 96) {
            return null;
        } else {
            long var7 = (long) arg3 * 76724863L ^ (long) arg5 * 32147369L ^ (long) arg1 * 986053L ^ (long) arg6 * 475427L ^ (long) arg2 * 97549L ^ (long) arg0 * 67481L;
            class693 var9 = (class693) class555.field7774.method3054((byte) -121, var7);
            if (var9 != null) {
                return var9;
            } else {
                class693 var10 = class532.field7530.method609(arg0, arg2, arg6, arg1, arg5, arg3);
                class555.field7774.method3047(false, var10, var7);
                return var10;
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "(I)V")
    public static void method2803(int arg0) {
        field6628 = null;
        field6630 = null;
        int var1 = -1 % ((arg0 - -53) / 38);
        field6629 = null;
        field6619 = null;
    }
}
