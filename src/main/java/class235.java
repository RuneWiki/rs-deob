import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class235 {

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public int field3755 = 0;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public int field3757 = 0;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public int field3769 = 0;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public int field3766 = -1;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public int field3756 = -1;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public int field3774 = -1;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public int field3759 = -1;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public int field3767 = -1;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public int field3760 = -1;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
    public int field3776 = -1;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    public int field3779 = -1;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public int field3761 = 0;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    public int field3780 = -1;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public int field3768 = 0;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
    public int field3783 = -1;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public int field3775 = 0;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    public int field3782 = -1;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "I")
    public int field3790 = -1;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public int field3773 = 0;

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
    public int field3788 = -1;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public int field3772 = 0;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
    public int field3785 = -1;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    public int field3770 = -1;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
    public int field3786 = 0;

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "I")
    public int field3793 = -1;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "I")
    public int field3791 = -1;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public int field3758 = 0;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
    public int field3784 = -1;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "I")
    public int field3792 = -1;

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "I")
    public int field3789 = -1;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public int field3765 = -1;

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "I")
    public int field3796 = -1;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "[I")
    public static int[] field3764 = new int[25];

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field3795 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "Ljava/lang/String;")
    public static String field3798 = "K";

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "Lcc;")
    public static class216 field3794 = new class216(64);

    @OriginalMember(owner = "client!ui", name = "T", descriptor = "[[B")
    public static byte[][] field3800 = new byte[1000][];

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "[[I")
    public int[][] field3799;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public static void method1660(byte arg0) {
        field3798 = null;
        if (arg0 == 15) {
            field3764 = null;
            field3794 = null;
            field3800 = null;
            field3795 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1661(byte arg0, String arg1) {
        field3787++;
        if (arg0 > -32) {
            return;
        }
        if (class21.field227 >= 2) {
            if (arg1.equalsIgnoreCase("::gc")) {
                class182.method1355((byte) 99);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class172.method1276(0, (String) null, (byte) 40, "mem=" + var4 + "k");
            }
            if (arg1.equalsIgnoreCase("::mm")) {
                class182.method1355((byte) 117);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class172.method1276(0, (String) null, (byte) 40, "Memory before cleanup=" + var7 + "k");
                class198.method1456(true);
                class182.method1355((byte) 91);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class172.method1276(0, (String) null, (byte) 40, "Memory after cleanup=" + var9 + "k");
            }
            if (arg1.equalsIgnoreCase("::pcachesize")) {
                class172.method1276(0, (String) null, (byte) 40, "Number of player models in cache:" + class59.method427(-125));
            }
            if (arg1.equalsIgnoreCase("::clientdrop")) {
                class17.method121((byte) 98);
            }
            if (arg1.equalsIgnoreCase("::clientjs5drop")) {
                class280.field4465.method1505(-110);
            }
            if (arg1.equalsIgnoreCase("::serverjs5drop")) {
                class280.field4465.method1504(true);
            }
            if (arg1.equalsIgnoreCase("::breakcon")) {
                class138.field2241.method50((byte) -122);
                class180.field2901.method718(true);
                class280.field4465.method1503(true);
            }
            if (arg1.equalsIgnoreCase("::replacecanvas")) {
                class29.field348 = true;
            }
            if (arg1.equalsIgnoreCase("::rebuild")) {
                class256.method1811(25, true);
            }
            if (arg1.equalsIgnoreCase("::fpson")) {
                class159.field2605 = true;
            }
            if (arg1.equalsIgnoreCase("::fpsoff")) {
                class159.field2605 = false;
            }
            if (arg1.startsWith("::setba")) {
                class256.field4221 = class230.method1639(122, arg1.substring(8));
                class133.method963(class138.field2241, -59);
                class26.field297 = false;
            }
            if (arg1.startsWith("::setparticles")) {
                class157.method1162(class230.method1639(126, arg1.substring(15)));
                class133.method963(class138.field2241, 45);
                class26.field297 = false;
            }
            if (arg1.startsWith("::fps ") && class27.field313 != 0) {
                class126.method906(class230.method1639(126, arg1.substring(6)), true);
            }
            if (arg1.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg1.startsWith("::rect_debug")) {
                class93.field1389 = class230.method1639(22, arg1.substring(12).trim());
                class172.method1276(0, (String) null, (byte) 40, "rect_debug=" + class93.field1389);
            }
            if (arg1.equalsIgnoreCase("::qa_op_test")) {
                class36.field447 = true;
            }
            arg1.startsWith("::hdr");
            if (arg1.equalsIgnoreCase("::tween")) {
                if (class217.field3444) {
                    class217.field3444 = false;
                    class172.method1276(0, (String) null, (byte) 40, "Forced tweening disabled.");
                } else {
                    class217.field3444 = true;
                    class172.method1276(0, (String) null, (byte) 40, "Forced tweening ENABLED!");
                }
            }
            if (arg1.equalsIgnoreCase("::shiftclick")) {
                if (class171.field2761) {
                    System.out.println("Shift-click disabled.");
                    class171.field2761 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class171.field2761 = true;
                }
            }
            if (arg1.equalsIgnoreCase("::getcgcoord")) {
                class172.method1276(0, (String) null, (byte) 40, "x:" + (class186.field2993.field1979 >> 7) + " z:" + (class186.field2993.field1910 >> 7) + " groundh:" + class220.field3533[class58.field826][class186.field2993.field1979 >> 7][class186.field2993.field1910 >> 7]);
            }
        }
        class232.field3723++;
        class220.field3532.method557(169, 8);
        class220.field3532.method1074(arg1.length() - 1, 65);
        class220.field3532.method1073(arg1.substring(2), false);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public final void method1662(int arg0) {
        field3762++;
        int var2 = 33 / ((arg0 - 52) / 48);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZILjava/lang/String;I)Z")
    public static final boolean method1663(boolean arg0, int arg1, String arg2, int arg3) {
        field3778++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = arg2.length();
        int var7 = 0;
        int var8 = 0;
        if (arg1 != 97) {
            field3795 = null;
        }
        while (var8 < var6) {
            label80: {
                char var9 = arg2.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        break label80;
                    }
                    if (var9 == '+' && arg0) {
                        break label80;
                    }
                }
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else if (var9 >= 'a' && var9 <= 'z') {
                    var11 = var9 - 'W';
                } else {
                    return false;
                }
                if (arg3 <= var11) {
                    return false;
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg3 * var7 + var11;
                if (var10 / arg3 != var7) {
                    return false;
                }
                var7 = var10;
                var5 = true;
            }
            var8++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)I")
    public static final int method1664(int arg0, int arg1) {
        field3763++;
        int var2 = (arg1 & 0x55555555) + ((arg1 & 0xAAAAAAAA) >>> 1);
        if (arg0 <= 1) {
            method1661((byte) -25, (String) null);
        }
        int var3 = (var2 >>> 2 & 0x73333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILv;)V")
    private final void method1665(int arg0, int arg1, class152 arg2) {
        field3771++;
        if (arg1 == 1) {
            this.field3760 = arg2.method1126(false);
            this.field3776 = arg2.method1126(false);
            if (this.field3760 == 65535) {
                this.field3760 = -1;
            }
            if (this.field3776 == 65535) {
                this.field3776 = -1;
            }
        } else if (arg1 == 2) {
            this.field3759 = arg2.method1126(false);
        } else if (arg1 == 3) {
            this.field3767 = arg2.method1126(false);
        } else if (arg1 == 4) {
            this.field3770 = arg2.method1126(false);
        } else if (arg1 == 5) {
            this.field3774 = arg2.method1126(false);
        } else if (arg1 == 6) {
            this.field3783 = arg2.method1126(false);
        } else if (arg1 == 7) {
            this.field3785 = arg2.method1126(false);
        } else if (arg1 == 8) {
            this.field3789 = arg2.method1126(false);
        } else if (arg1 == 9) {
            this.field3793 = arg2.method1126(false);
        } else if (arg1 == 26) {
            this.field3775 = (short) (arg2.method1111(arg0 ^ 0xFFFFFF03) * 4);
            this.field3755 = (short) (arg2.method1111(arg0 + 259) * 4);
        } else if (arg1 == 27) {
            if (this.field3799 == null) {
                this.field3799 = new int[12][];
            }
            int var4 = arg2.method1111(arg0 ^ 0xFFFFFF03);
            this.field3799[var4] = new int[6];
            for (int var5 = 0; var5 < 6; var5++) {
                this.field3799[var4][var5] = arg2.method1090(class148.method1051(arg0, -12105));
            }
        } else if (arg1 == 29) {
            this.field3773 = arg2.method1111(255);
        } else if (arg1 == 30) {
            this.field3772 = arg2.method1126(false);
        } else if (arg1 == 31) {
            this.field3769 = arg2.method1111(255);
        } else if (arg1 == 32) {
            this.field3761 = arg2.method1126(false);
        } else if (arg1 == 33) {
            this.field3757 = arg2.method1090(12107);
        } else if (arg1 == 34) {
            this.field3768 = arg2.method1111(255);
        } else if (arg1 == 35) {
            this.field3786 = arg2.method1126(false);
        } else if (arg1 == 36) {
            this.field3758 = arg2.method1090(12107);
        } else if (arg1 == 37) {
            this.field3779 = arg2.method1111(255);
        } else if (arg1 == 38) {
            this.field3788 = arg2.method1126(false);
        } else if (arg1 == 39) {
            this.field3792 = arg2.method1126(false);
        } else if (arg1 == 40) {
            this.field3796 = arg2.method1126(false);
        } else if (arg1 == 41) {
            this.field3790 = arg2.method1126(false);
        } else if (arg1 == 42) {
            this.field3766 = arg2.method1126(false);
        } else if (arg1 == 43) {
            arg2.method1126(false);
        } else if (arg1 == 44) {
            arg2.method1126(false);
        } else if (arg1 == 45) {
            arg2.method1126(false);
        } else if (arg1 == 46) {
            this.field3780 = arg2.method1126(false);
        } else if (arg1 == 47) {
            this.field3765 = arg2.method1126(false);
        } else if (arg1 == 48) {
            this.field3784 = arg2.method1126(false);
        } else if (arg1 == 49) {
            this.field3782 = arg2.method1126(false);
        } else if (arg1 == 50) {
            this.field3756 = arg2.method1126(false);
        } else if (arg1 == 51) {
            this.field3791 = arg2.method1126(false);
        }
        if (arg0 != -4) {
            this.field3780 = -37;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lv;I)V")
    public final void method1666(class152 arg0, int arg1) {
        field3781++;
        if (arg1 <= 6) {
            method1660((byte) 69);
        }
        while (true) {
            int var3 = arg0.method1111(255);
            if (var3 == 0) {
                return;
            }
            this.method1665(-4, var3, arg0);
        }
    }
}
