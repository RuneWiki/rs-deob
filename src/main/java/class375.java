import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class375 {

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "F")
    public float field5658 = 0.25F;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "F")
    public float field5653 = 1.0F;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "F")
    public float field5670 = 1.0F;

    @OriginalMember(owner = "client!sn", name = "y", descriptor = "F")
    public float field5675;

    @OriginalMember(owner = "client!sn", name = "v", descriptor = "I")
    public int field5672;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public int field5657;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public int field5654;

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "F")
    public float field5671;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "F")
    public float field5651;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "Lma;")
    public class8 field5668;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public int field5659;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
    public int field5663;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    public int field5662;

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "Z")
    public static boolean field5676 = false;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!sn", name = "w", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!sn", name = "x", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!sn", name = "A", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "Lmo;")
    public static class447 field5666;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field5665;

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "()V", line = 361)
    public class375() {
        this.field5675 = 0.69921875F;
        this.field5672 = class82.field1011;
        this.field5657 = -50;
        this.field5654 = class121.field1691;
        this.field5671 = 1.2F;
        this.field5651 = 1.1523438F;
        this.field5668 = class318.field4974;
        this.field5659 = -60;
        this.field5663 = -50;
        this.field5662 = 0;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Ljg;)V", line = 377)
    public class375(class186 arg0) {
        int var2 = arg0.method1322(false);
        if (class377.field5695 && class296.field4710.method606() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field5654 = class121.field1691;
            } else {
                this.field5654 = arg0.method1284(8388607);
            }
            if ((var2 & 0x2) == 0) {
                this.field5651 = 1.1523438F;
            } else {
                this.field5651 = (float) arg0.method1272((byte) -115) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field5675 = 0.69921875F;
            } else {
                this.field5675 = (float) arg0.method1272((byte) -70) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field5671 = 1.2F;
            } else {
                this.field5671 = (float) arg0.method1272((byte) -72) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1284(8388607);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1272((byte) -71);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1272((byte) -78);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1272((byte) -59);
            }
            this.field5651 = 1.1523438F;
            this.field5654 = class121.field1691;
            this.field5675 = 0.69921875F;
            this.field5671 = 1.2F;
        }
        if ((var2 & 0x10) == 0) {
            this.field5657 = -50;
            this.field5659 = -60;
            this.field5663 = -50;
        } else {
            this.field5657 = arg0.method1276((byte) 112);
            this.field5659 = arg0.method1276((byte) -86);
            this.field5663 = arg0.method1276((byte) 90);
        }
        if ((var2 & 0x20) == 0) {
            this.field5672 = class82.field1011;
        } else {
            this.field5672 = arg0.method1284(8388607);
        }
        if ((var2 & 0x40) == 0) {
            this.field5662 = 0;
        } else {
            this.field5662 = arg0.method1272((byte) -127);
        }
        if ((var2 & 0x80) == 0) {
            this.field5668 = class318.field4974;
        } else {
            this.field5668 = class36.method238(arg0.method1272((byte) -122), arg0.method1272((byte) -45), false, arg0.method1272((byte) -52), arg0.method1272((byte) -70), arg0.method1272((byte) -92), arg0.method1272((byte) -62));
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V", line = 20)
    public static final void method2391(byte arg0) {
        field5669++;
        if (class217.field3550 < 102) {
            class217.field3550 += 6;
        }
        if (class248.field4063 != 0) {
            class316.field4967 -= class248.field4063 * 5;
            if (class316.field4967 >= class92.field1134) {
                class316.field4967 = class92.field1134 - 1;
            } else if (class316.field4967 < 0) {
                class316.field4967 = 0;
            }
            class248.field4063 = 0;
        }
        for (int var1 = 0; var1 < class269.field4316; var1++) {
            int var2 = class271.field4342[var1];
            char var3 = (char) class291.field4651[var1];
            if (var2 == 84) {
                class351.method2291(arg0 ^ 0xFFFFD524);
            } else if (class232.field3856[82] && var2 == 66) {
                if (field5665 != null) {
                    String var8 = "";
                    for (int var9 = class314.field4939.length - 1; var9 >= 0; var9--) {
                        if (class314.field4939[var9] != null && class314.field4939[var9].length() > 0) {
                            var8 = var8 + class314.field4939[var9] + '\n';
                        }
                    }
                    field5665.setContents(new StringSelection(var8), (ClipboardOwner) null);
                }
            } else if (class232.field3856[82] && var2 == 67) {
                if (field5665 != null) {
                    Transferable var4 = field5665.getContents((Object) null);
                    if (var4 != null) {
                        try {
                            String var5 = (String) var4.getTransferData(DataFlavor.stringFlavor);
                            if (var5 != null) {
                                String[] var6 = class63.method410(var5, '\n', arg0 + 62);
                                if (var6.length > 1) {
                                    for (int var7 = 0; var7 < var6.length; var7++) {
                                        class213.field3412 = var6[var7];
                                        class351.method2291(10981);
                                    }
                                } else {
                                    class213.field3412 = class213.field3412 + var5;
                                }
                            }
                        } catch (Exception var11) {
                        }
                    }
                }
            } else if (var2 == 85 && class128.field2028 > 0) {
                class213.field3412 = class213.field3412.substring(0, class128.field2028 - 1) + class213.field3412.substring(class128.field2028);
                class128.field2028--;
            } else if (var2 == 101 && class128.field2028 < class213.field3412.length()) {
                class213.field3412 = class213.field3412.substring(0, class128.field2028) + class213.field3412.substring(class128.field2028 + 1);
            } else if (var2 == 96 && class128.field2028 > 0) {
                class128.field2028--;
            } else if (var2 == 97 && class128.field2028 < class213.field3412.length()) {
                class128.field2028++;
            } else if (var2 == 102) {
                class128.field2028 = 0;
            } else if (var2 == 103) {
                class128.field2028 = class213.field3412.length();
            } else if (var2 == 104 && class199.field3211 < class314.field4939.length) {
                class199.field3211++;
                class250.method1733(-21496);
                class128.field2028 = class213.field3412.length();
            } else if (var2 == 105 && class199.field3211 > 0) {
                class199.field3211--;
                class250.method1733(-21496);
                class128.field2028 = class213.field3412.length();
            } else if (class318.method2112(-98, var3) || var3 == ':' || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || var3 == '+') {
                class213.field3412 = class213.field3412.substring(0, class128.field2028) + (char) class291.field4651[var1] + class213.field3412.substring(class128.field2028);
                class128.field2028++;
            }
        }
        class269.field4316 = 0;
        for (int var10 = 0; var10 < 100; var10++) {
            int var10002;
            if (class385.field5817[var10]) {
                var10002 = class7.field91[var10]++;
                if (class7.field91[var10] > 102) {
                    class385.field5817[var10] = false;
                }
            } else {
                var10002 = class7.field91[var10]--;
                if (class7.field91[var10] < 0) {
                    class377.field5697[var10] = (int) (Math.random() * (double) class369.field5615);
                    class35.field430[var10] = (int) (Math.random() * 350.0D);
                    class7.field91[var10] = 0;
                    class385.field5817[var10] = true;
                }
            }
        }
        class193.method1356((byte) 112);
        if (arg0 != -63) {
            field5676 = false;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lsn;I)Z", line = 214)
    public final boolean method2392(class375 arg0, int arg1) {
        field5673++;
        int var3 = 58 / ((arg1 - 69) / 50);
        return this.field5654 == arg0.field5654 && this.field5651 == arg0.field5651 && this.field5675 == arg0.field5675 && this.field5671 == arg0.field5671 && this.field5658 == arg0.field5658 && this.field5653 == arg0.field5653 && this.field5670 == arg0.field5670 && this.field5672 == arg0.field5672 && this.field5662 == arg0.field5662 && this.field5668 == arg0.field5668;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)I", line = 231)
    public static final int method2393(int arg0, int arg1, int arg2) {
        field5664++;
        if (arg2 != 10) {
            return 4;
        }
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg0 >>= 0x1;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(B)V", line = 260)
    public static final void method2394(byte arg0) {
        if (arg0 != 23) {
            method2391((byte) -57);
        }
        field5661++;
        class211 var1 = class281.method1921(15, 0, (byte) -106);
        var1.method1489((byte) -100);
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(B)V", line = 275)
    public static void method2395(byte arg0) {
        if (arg0 <= 104) {
            method2391((byte) -36);
        }
        field5666 = null;
        field5665 = null;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZ)V", line = 291)
    public static final void method2396(int arg0, boolean arg1) {
        if (arg1 && class400.field5950 != null) {
            class132.field2071 = class400.field5950.field279;
        } else {
            class132.field2071 = -1;
        }
        field5652++;
        class397.field5935 = 0;
        class400.field5950 = null;
        class315.field4952 = null;
        class30.field367 = null;
        class400.method2509();
        class400.field5952.method255(arg0 - 30706);
        class400.field5954 = null;
        class302.field4783 = null;
        class80.field1002 = -1;
        class91.field1131 = null;
        if (arg0 != 9712) {
            return;
        }
        class57.field725 = null;
        class257.field4167 = null;
        class107.field1496 = null;
        class31.field385 = null;
        class53.field668 = null;
        class402.field6003 = null;
        class196.field3184 = -1;
        class21.field260 = null;
        class267.method1818((byte) -66);
        class186.method1323(64, true, 128);
        class312.method2093(-2, 64, 64);
        class212.method1495(64, (byte) -100);
        class196.method1376((byte) 116, 64);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljg;B)V", line = 330)
    public final void method2397(class186 arg0, byte arg1) {
        this.field5653 = (float) (arg0.method1322(false) * 8) / 255.0F;
        field5667++;
        this.field5658 = (float) (arg0.method1322(false) * 8) / 255.0F;
        this.field5670 = (float) (arg0.method1322(false) * 8) / 255.0F;
        int var3 = -32 % ((arg1 - 1) / 46);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BI)V", line = 345)
    public static final void method2398(byte arg0, int arg1) {
        class217.field3552 = arg1;
        class411.field6088 = -1;
        class291.field4646 = 100;
        class433.field6401 = 3;
        field5660++;
        if (arg0 != 80) {
            method2395((byte) 68);
        }
    }
}
