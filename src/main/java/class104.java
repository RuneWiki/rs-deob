import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class104 {

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public int field1516 = -1;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "Z")
    public boolean field1515 = false;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    private int field1518 = 0;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    private int field1522 = 128;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "Z")
    public boolean field1525 = false;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    private int field1528 = 128;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    private int field1535 = 0;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    private int field1526 = 0;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "Lnc;")
    public static class89 field1529 = new class89(64);

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public int field1523;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
    private int field1533;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "[S")
    private short[] field1520;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "[S")
    private short[] field1527;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "[S")
    private short[] field1531;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "[S")
    private short[] field1539;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method755(int arg0, Component arg1) {
        field1521++;
        arg1.removeMouseListener(class42.field738);
        arg1.removeMouseMotionListener(class42.field738);
        arg1.removeFocusListener(class42.field738);
        if (arg0 == 255) {
            class224.field3483 = 0;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljk;B)Z")
    public static final boolean method756(class297 arg0, byte arg1) {
        field1538++;
        if (arg1 < 68) {
            method760(false);
        }
        if (arg0.field4600 == 205) {
            class206.field3091 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIBI)Lpb;")
    public final class2 method757(int arg0, int arg1, byte arg2, int arg3) {
        int var5 = 122 / ((arg2 - 31) / 37);
        class2 var6 = (class2) class275.field4239.method945((long) this.field1523, true);
        field1519++;
        if (var6 == null) {
            class219 var7 = class219.method1502(class109.field1610, this.field1533, 0);
            if (var7 == null) {
                return null;
            }
            if (this.field1539 != null) {
                for (int var8 = 0; var8 < this.field1539.length; var8++) {
                    var7.method1476(this.field1539[var8], this.field1531[var8]);
                }
            }
            if (this.field1527 != null) {
                for (int var9 = 0; var9 < this.field1527.length; var9++) {
                    var7.method1477(this.field1527[var9], this.field1520[var9]);
                }
            }
            var6 = var7.method1501(this.field1535 + 64, this.field1518 + 850, -30, -50, -30);
            class275.field4239.method941(var6, (long) this.field1523, -8447);
        }
        class2 var10;
        if (this.field1516 == -1 || arg1 == -1) {
            var10 = var6.method26(true, true, true);
        } else {
            var10 = class108.method781(this.field1516, -1).method1512(arg1, arg0, var6, arg3, 65535);
        }
        if (this.field1528 != 128 || this.field1522 != 128) {
            var10.method8(this.field1528, this.field1522, this.field1528);
        }
        if (this.field1526 != 0) {
            if (this.field1526 == 90) {
                var10.method13();
            }
            if (this.field1526 == 180) {
                var10.method38();
            }
            if (this.field1526 == 270) {
                var10.method25();
            }
        }
        return var10;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lca;II)V")
    private final void method758(class54 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1533 = arg0.method423(81);
        } else if (arg1 == 2) {
            this.field1516 = arg0.method423(-114);
        } else if (arg1 == 4) {
            this.field1528 = arg0.method423(-85);
        } else if (arg1 == 5) {
            this.field1522 = arg0.method423(arg2 - 95);
        } else if (arg1 == 6) {
            this.field1526 = arg0.method423(108);
        } else if (arg1 == 7) {
            this.field1535 = arg0.method407(255);
        } else if (arg1 == 8) {
            this.field1518 = arg0.method407(arg2 ^ 0xFFFFFF08);
        } else if (arg1 == 9) {
            this.field1525 = true;
        } else if (arg1 == 10) {
            this.field1515 = true;
        } else if (arg1 == 40) {
            int var6 = arg0.method407(arg2 ^ 0xFFFFFF08);
            this.field1531 = new short[var6];
            this.field1539 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1539[var7] = (short) arg0.method423(-84);
                this.field1531[var7] = (short) arg0.method423(-78);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method407(255);
            this.field1520 = new short[var4];
            this.field1527 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1527[var5] = (short) arg0.method423(59);
                this.field1520[var5] = (short) arg0.method423(-86);
            }
        }
        field1517++;
        if (arg2 != -9) {
            method755(105, (Component) null);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lca;B)V")
    public final void method759(class54 arg0, byte arg1) {
        if (arg1 <= 37) {
            this.field1533 = -100;
        }
        field1524++;
        while (true) {
            int var3 = arg0.method407(255);
            if (var3 == 0) {
                return;
            }
            this.method758(arg0, var3, -9);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V")
    public static final void method760(boolean arg0) {
        int var1 = 0;
        if (arg0) {
            return;
        }
        while (class284.field4353 > var1) {
            int var10002 = class173.field2539[var1]--;
            if (class173.field2539[var1] >= -10) {
                label88: {
                    class57 var3 = class295.field4492[var1];
                    if (var3 == null) {
                        var3 = class57.method473(class211.field3161, class49.field810[var1], 0);
                        if (var3 == null) {
                            break label88;
                        }
                        class173.field2539[var1] += var3.method475();
                        class295.field4492[var1] = var3;
                    }
                    if (class173.field2539[var1] < 0) {
                        label91: {
                            int var4;
                            if (class163.field2364[var1] == 0) {
                                var4 = class10.field155[var1] * class112.field1719 >> 8;
                            } else {
                                int var5 = (class163.field2364[var1] & 0xFF) * 128;
                                int var6 = (class163.field2364[var1] & 0xFF4182) >> 16;
                                int var7 = var6 * 128 + 64 - class185.field2687.field425;
                                if (var7 < 0) {
                                    var7 = -var7;
                                }
                                int var8 = class163.field2364[var1] >> 8 & 0xFF;
                                int var9 = var8 * 128 + 64 - class185.field2687.field455;
                                if (var9 < 0) {
                                    var9 = -var9;
                                }
                                int var10 = var7 + var9 - 128;
                                if (var10 > var5) {
                                    class173.field2539[var1] = -100;
                                    break label91;
                                }
                                if (var10 < 0) {
                                    var10 = 0;
                                }
                                var4 = (var5 - var10) * class10.field155[var1] * class194.field2934 / var5 >> 8;
                            }
                            if (var4 > 0) {
                                class98 var11 = var3.method474().method730(class209.field3126);
                                class35 var12 = class35.method267(var11, 100, var4);
                                var12.method239(class60.field987[var1] - 1);
                                class108.field1581.method913(var12);
                            }
                            class173.field2539[var1] = -100;
                        }
                    }
                }
            } else {
                class284.field4353--;
                for (int var2 = var1; var2 < class284.field4353; var2++) {
                    class49.field810[var2] = class49.field810[var2 + 1];
                    class295.field4492[var2] = class295.field4492[var2 + 1];
                    class60.field987[var2] = class60.field987[var2 + 1];
                    class173.field2539[var2] = class173.field2539[var2 + 1];
                    class163.field2364[var2] = class163.field2364[var2 + 1];
                    class10.field155[var2] = class10.field155[var2 + 1];
                }
                var1--;
            }
            var1++;
        }
        if (class233.field3601 && !class145.method988(127)) {
            if (class188.field2789 != 0 && class175.field2558 != -1) {
                class67.method534((byte) 45, class188.field2789, false, class220.field3404, 0, class175.field2558);
            }
            class233.field3601 = false;
        } else if (class188.field2789 != 0 && class175.field2558 != -1 && !class145.method988(120)) {
            class228.field3556++;
            class59.field964.method1540(185, (byte) -2);
            class59.field964.method453((byte) 126, class175.field2558);
            class175.field2558 = -1;
        }
        field1532++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static void method761(int arg0) {
        if (arg0 == 128) {
            field1529 = null;
        }
    }
}
