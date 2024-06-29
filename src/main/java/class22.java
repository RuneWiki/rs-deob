import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class22 extends class604 {

    @OriginalMember(owner = "client!an", name = "dd", descriptor = "I")
    public int field866 = -1;

    @OriginalMember(owner = "client!an", name = "Xc", descriptor = "I")
    public int field860 = -1;

    @OriginalMember(owner = "client!an", name = "ed", descriptor = "Laj;")
    public static class287 field867 = new class287(50);

    @OriginalMember(owner = "client!an", name = "Wc", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!an", name = "Yc", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!an", name = "Zc", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!an", name = "ad", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!an", name = "bd", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!an", name = "cd", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!an", name = "fd", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!an", name = "gd", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!an", name = "hd", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!an", name = "id", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!an", name = "jd", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!an", name = "kd", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!an", name = "ld", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!an", name = "md", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!an", name = "nd", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!an", name = "od", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!an", name = "pd", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!an", name = "qd", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!an", name = "sd", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!an", name = "rd", descriptor = "Lrr;")
    public class334 field880;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lr;BII)Z")
    public final boolean method444(class167 arg0, byte arg1, int arg2, int arg3) {
        ++field869;
        if (this.field880 != null && this.method459(131072, -1, arg0)) {
            class396 var5 = arg0.method53();
            int var6 = super.field8737.method2434(128);
            var5.method900(var6);
            var5.method891(super.field9806, super.field9809, super.field9815);
            boolean var7 = false;
            for (int var8 = 0; ~super.field8783.length < ~var8; ++var8) {
                if (super.field8783[var8] != null) {
                    boolean var9 = this.field880.field4938 == -1 ? this.field880.field4978 == 1 : this.field880.field4938 == 1;
                    boolean var10;
                    if (!class7.field521) {
                        var10 = super.field8783[var8].method358(arg2, arg3, var5, var9);
                    } else {
                        var10 = super.field8783[var8].method318(arg2, arg3, var5, var9, class477.field6857);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            int var11 = -91 % ((-30 - arg1) / 36);
            super.field8783[0] = super.field8783[1] = super.field8783[2] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIZII)V")
    public final void method445(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field868;
        super.field9814 = super.field9804 = (byte) arg2;
        if (class89.method868(5125, arg5, arg1)) {
            ++super.field9804;
        }
        if (~super.field8755 != 0 && class357.field5338.method2099(super.field8755, true).field2442 == 1) {
            super.field8760 = null;
            super.field8755 = -1;
        }
        if (super.field8723 != -1) {
            class526 var7 = class261.field3825.method1313((byte) -127, super.field8723);
            if (var7.field7423 && var7.field7427 != -1 && ~class357.field5338.method2099(var7.field7427, true).field2442 == -2) {
                super.field8723 = -1;
            }
        }
        if (super.field8676 != -1) {
            class526 var8 = class261.field3825.method1313((byte) -108, super.field8676);
            if (var8.field7423 && var8.field7427 != -1 && ~class357.field5338.method2099(var8.field7427, true).field2442 == -2) {
                super.field8676 = -1;
            }
        }
        if (!arg3) {
            int var9 = -super.field8787[0] + arg5;
            int var10 = -super.field8785[0] + arg1;
            if (~var9 <= 7 && var9 <= 8 && var10 >= -8 && ~var10 >= -9) {
                if (super.field8779 < 9) {
                    ++super.field8779;
                }
                for (int var11 = super.field8779; ~var11 < -1; --var11) {
                    super.field8787[var11] = super.field8787[var11 + -1];
                    super.field8785[var11] = super.field8785[var11 + -1];
                    super.field8786[var11] = super.field8786[var11 + -1];
                }
                super.field8787[0] = arg5;
                super.field8785[0] = arg1;
                super.field8786[0] = 1;
                return;
            }
        }
        super.field8787[0] = arg5;
        super.field8779 = arg0;
        super.field8780 = 0;
        super.field8778 = 0;
        super.field8785[0] = arg1;
        super.field9815 = (super.field8785[0] << 9) - -(arg4 << 8);
        super.field9806 = (super.field8787[0] << 9) + (arg4 << 8);
        if (super.field8784 != null) {
            super.field8784.method577();
        }
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(B)Z")
    public final boolean method446(byte arg0) {
        ++field864;
        if (this.field880 == null) {
            return false;
        } else {
            return arg0 != -103 ? true : true;
        }
    }

    @OriginalMember(owner = "client!an", name = "g", descriptor = "(I)Z")
    public final boolean method447(int arg0) {
        if (arg0 >= -15) {
            field867 = null;
        }
        ++field862;
        return false;
    }

    @OriginalMember(owner = "client!an", name = "e", descriptor = "(I)V")
    public final void method448(int arg0) {
        ++field861;
        if (arg0 < -12) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(ILr;)Lfe;")
    public final class531 method449(int arg0, class167 arg1) {
        ++field870;
        if (this.field880 != null && this.method459(2048, -1, arg1)) {
            if (arg0 != 92160000) {
                this.method457(true);
            }
            class396 var3 = arg1.method53();
            int var4 = super.field8737.method2434(128);
            var3.method900(var4);
            class370 var5 = class257.field3792[super.field9814][super.field9806 >> class30.field940][super.field9815 >> class30.field940];
            if (var5 != null && var5.field5494 != null) {
                int var6 = -var5.field5494.field3319 + super.field8747;
                super.field8747 = (int) ((float) super.field8747 - (float) var6 / 10.0F);
            } else {
                super.field8747 = (int) ((float) super.field8747 - (float) super.field8747 / 10.0F);
            }
            var3.method891(super.field9806, super.field9809 - 20 + -super.field8747, super.field9815);
            class658 var7 = this.method3465(0);
            class334 var8 = this.field880.field4984 != null ? this.field880.method2150(class113.field2038, -32224) : this.field880;
            super.field8781 = false;
            if (class527.field7429.field2628 && var8.field4982 && var7.field9469) {
                class138 var9 = super.field8755 != -1 && super.field8738 == 0 ? class357.field5338.method2099(super.field8755, true) : null;
                class138 var10 = super.field8766 == -1 || super.field8748 && var9 != null ? null : class357.field5338.method2099(super.field8766, true);
                class55 var11 = class3.method223(var10 != null ? var10 : var9, arg1, var4, 255 & this.field880.field4957, this.field880.field5000 & 65535, 65535 & this.field880.field4989, 255 & this.field880.field4975, this.field880.field4978, super.field8688, super.field8733, var10 != null ? super.field8736 : super.field8677, (byte) -1, super.field8783[0], super.field8721);
                if (var11 != null) {
                    super.field8781 = true;
                    arg1.method81(false);
                    if (!class7.field521) {
                        var11.method334(var3, (class684) null, 0);
                    } else {
                        var11.method317(var3, (class684) null, class477.field6857, 0);
                    }
                    arg1.method81(true);
                }
            }
            var3.method900(var4);
            var3.method891(super.field9806, -super.field8747 + -5 + super.field9809, super.field9815);
            class531 var12 = null;
            if (this.method454(false)) {
                var12 = class370.method2347(super.field8783.length, (byte) -124);
            }
            this.method3463(0, var3, arg1, false, super.field8783);
            if (class7.field521) {
                for (int var13 = 0; ~super.field8783.length < ~var13; ++var13) {
                    if (super.field8783[var13] != null) {
                        super.field8783[var13].method317(var3, var12 != null ? var12.field7451[var13] : null, class477.field6857, 0);
                    }
                }
            } else {
                for (int var14 = 0; ~super.field8783.length < ~var14; ++var14) {
                    if (super.field8783[var14] != null) {
                        super.field8783[var14].method334(var3, var12 != null ? var12.field7451[var14] : null, 0);
                    }
                }
            }
            if (super.field8784 != null) {
                class518 var15 = super.field8784.method582();
                if (!class7.field521) {
                    arg1.method123(var15);
                } else {
                    arg1.method72(var15, class477.field6857);
                }
            }
            for (int var16 = 0; ~super.field8783.length < ~var16; ++var16) {
                if (super.field8783[var16] != null) {
                    super.field8781 |= super.field8783[var16].method363();
                }
            }
            super.field8783[0] = super.field8783[1] = super.field8783[2] = null;
            super.field8698 = class705.field9922;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ILr;)Lbm;")
    public final class98 method450(int arg0, class167 arg1) {
        if (arg0 != -29645) {
            this.field880 = null;
        }
        ++field863;
        return null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IILjava/lang/String;)Z")
    public static final boolean method451(int arg0, int arg1, String arg2) {
        ++field876;
        if (class604.field8775.field795) {
            class394.field5757 = new class295();
            class394.field5757.field4419 = arg1;
            class394.field5757.field4425 = arg2;
            if (class625.field9027 != class36.field1029) {
                class394.field5757.field4414 = class394.field5757.field4419 + 40000;
                class394.field5757.field4418 = class394.field5757.field4419 + 50000;
            }
            if (class366.field5422.length > arg1 && class366.field5422[arg1] != null) {
                class535.field7497 = class366.field5422[arg1].field6007;
            }
            return true;
        } else {
            String var3 = "";
            if (class625.field9027 != class36.field1029) {
                var3 = ":" + (arg1 + 7000);
            }
            String var4 = "";
            if (class422.field6110 != null) {
                var4 = "/p=" + class422.field6110;
            }
            if (arg0 > -76) {
                return false;
            } else {
                String var5 = "http://" + arg2 + var3 + "/l=" + class140.field2466 + "/a=" + class292.field4385 + var4 + "/j" + (!class444.field6400 ? "0" : "1") + ",o" + (class334.field4971 ? "1" : "0") + ",a2";
                try {
                    class486.field6963.getAppletContext().showDocument(new URL(var5), "_self");
                    return true;
                } catch (Exception var6) {
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(III)V")
    public final void method452(int arg0, int arg1, int arg2) {
        ++field871;
        int var4 = super.field8787[0];
        int var5 = super.field8785[0];
        if (arg1 == 0) {
            ++var5;
        }
        if (~arg1 == -2) {
            ++var5;
            ++var4;
        }
        if (~arg1 == -3) {
            ++var4;
        }
        if (arg1 == 3) {
            ++var4;
            --var5;
        }
        if (~arg1 == -5) {
            --var5;
        }
        if (~arg1 == -6) {
            --var4;
            --var5;
        }
        if (arg1 == 6) {
            --var4;
        }
        if (~super.field8755 != 0 && class357.field5338.method2099(super.field8755, true).field2442 == 1) {
            super.field8760 = null;
            super.field8755 = -1;
        }
        if (~arg1 == -8) {
            --var4;
            ++var5;
        }
        if (super.field8723 != -1) {
            class526 var6 = class261.field3825.method1313((byte) -116, super.field8723);
            if (var6.field7423 && ~var6.field7427 != 0 && class357.field5338.method2099(var6.field7427, true).field2442 == 1) {
                super.field8723 = -1;
            }
        }
        if (super.field8676 != -1) {
            class526 var7 = class261.field3825.method1313((byte) -122, super.field8676);
            if (var7.field7423 && var7.field7427 != -1 && class357.field5338.method2099(var7.field7427, true).field2442 == 1) {
                super.field8676 = -1;
            }
        }
        if (super.field8779 < 9) {
            ++super.field8779;
        }
        int var8 = 55 % ((arg0 - -57) / 50);
        for (int var9 = super.field8779; var9 > 0; --var9) {
            super.field8787[var9] = super.field8787[var9 - 1];
            super.field8785[var9] = super.field8785[var9 - 1];
            super.field8786[var9] = super.field8786[var9 - 1];
        }
        super.field8787[0] = var4;
        super.field8785[0] = var5;
        super.field8786[0] = (byte) arg2;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIZLjava/lang/String;ZLjava/lang/String;)V")
    public static final void method453(int arg0, int arg1, int arg2, boolean arg3, String arg4, boolean arg5, String arg6) {
        ++field874;
        class51.field1188.field5152 = 1;
        String var7 = arg4.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg1 != -1) {
            class445 var11 = client.field4124.method980(-104, arg1);
            if (var11 == null || arg3 != var11.method2677(113)) {
                return;
            }
            if (var11.method2677(79)) {
                var10 = var11.field6403;
            } else {
                var9 = var11.field6413;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class268.field3985.field496; ++var13) {
            class110 var17 = class268.field3985.method258(var13, (byte) -67);
            if ((!arg5 || var17.field1955) && var17.field1988 == -1 && var17.field1977 == -1 && var17.field1963 == 0 && ~var17.field1954.toLowerCase().indexOf(var7) != 0) {
                if (arg1 != -1) {
                    if (arg3) {
                        if (!arg6.equals(var17.method991(var10, arg1, -8123))) {
                            continue;
                        }
                    } else if (~arg0 != ~var17.method986(false, var9, arg1)) {
                        continue;
                    }
                }
                if (~var12 <= -251) {
                    class104.field1843 = null;
                    class364.field5398 = -1;
                    return;
                }
                if (var12 >= var8.length) {
                    short[] var18 = new short[var8.length * 2];
                    for (int var19 = 0; ~var19 > ~var12; ++var19) {
                        var18[var19] = var8[var19];
                    }
                    var8 = var18;
                }
                var8[var12++] = (short) var13;
            }
        }
        class479.field6880 = 0;
        class364.field5398 = var12;
        class104.field1843 = var8;
        String[] var14 = new String[class364.field5398];
        for (int var15 = 0; ~var15 > ~class364.field5398; ++var15) {
            var14[var15] = class268.field3985.method258(var8[var15], (byte) -67).field1954;
        }
        int var16 = -81 % ((-72 - arg2) / 49);
        class156.method1206(var14, class104.field1843, (byte) 119);
        class51.field1188.method2225((byte) -70);
        class51.field1188.field5152 = 2;
    }

    @OriginalMember(owner = "client!an", name = "d", descriptor = "(Z)Z")
    private final boolean method454(boolean arg0) {
        if (arg0) {
            method453(77, -112, 126, false, (String) null, true, (String) null);
        }
        ++field873;
        return this.field880.field4944;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IILgfa;IILr;Z)V")
    public final void method455(int arg0, int arg1, class697 arg2, int arg3, int arg4, class167 arg5, boolean arg6) {
        ++field865;
        if (arg1 == -1008) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!an", name = "o", descriptor = "(I)I")
    public final int method456(int arg0) {
        ++field878;
        if (arg0 != -810) {
            this.method459(85, -21, (class167) null);
        }
        if (this.field880.field4984 != null) {
            class334 var2 = this.field880.method2150(class113.field2038, -32224);
            if (var2 != null && ~var2.field4937 != 0) {
                return var2.field4937;
            }
        }
        return this.field880.field4937;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)I")
    public final int method457(boolean arg0) {
        ++field872;
        if (this.field880.field4984 != null) {
            class334 var2 = this.field880.method2150(class113.field2038, -32224);
            if (var2 != null && var2.field4963 != -1) {
                return var2.field4963;
            }
        }
        return arg0 ? 27 : this.field880.field4963;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)I")
    public final int method458(int arg0) {
        if (arg0 != 133) {
            return 127;
        } else {
            ++field875;
            if (this.field880.field4984 != null) {
                class334 var2 = this.field880.method2150(class113.field2038, -32224);
                if (var2 != null && var2.field4954 != -1) {
                    return var2.field4954;
                }
            }
            return ~this.field880.field4954 == 0 ? super.method458(133) : this.field880.field4954;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IILr;)Z")
    private final boolean method459(int arg0, int arg1, class167 arg2) {
        ++field879;
        int var4 = arg0;
        class658 var5 = this.method3465(0);
        class138 var6 = super.field8755 != -1 && ~super.field8738 == -1 ? class357.field5338.method2099(super.field8755, true) : null;
        class138 var7 = ~super.field8766 == 0 || super.field8748 && var6 != null ? null : class357.field5338.method2099(super.field8766, true);
        int var8 = var5.field9477;
        int var9 = var5.field9497;
        if (~var8 != -1 || var9 != 0 || var5.field9463 != 0 || ~var5.field9478 != -1) {
            arg0 |= 7;
        }
        boolean var10 = ~super.field8697 != arg1 && class336.field5031 >= super.field8761 && super.field8680 > class336.field5031;
        if (var10) {
            arg0 |= 524288;
        }
        class55 var11 = super.field8783[0] = this.field880.method2159(class373.field5557, arg0, var6, -36, super.field8696, super.field8741, super.field8736, super.field8740, class113.field2038, super.field8768, super.field8685, super.field8677, var7, arg2, class357.field5338);
        if (var11 == null) {
            return false;
        } else {
            super.field8762 = var11.method315();
            super.field8705 = var11.method368();
            this.method3467(var11, (byte) -103);
            int var12 = super.field8737.method2434(arg1 + 129);
            if (var8 == 0 && ~var9 == -1) {
                this.method3456(16384, 0, 0, var12, this.method3446(0) << 9, this.method3446(0) << 9);
            } else {
                this.method3456(16384, var5.field9490, var5.field9457, var12, var9, var8);
                if (~super.field8721 != -1) {
                    super.field8783[0].method356(super.field8721);
                }
                if (~super.field8733 != -1) {
                    super.field8783[0].method366(super.field8733);
                }
                if (super.field8688 != 0) {
                    super.field8783[0].method337(0, super.field8688, 0);
                }
            }
            if (var10) {
                var11.method324(super.field8757, super.field8715, super.field8772, super.field8697 & 255);
            }
            if (super.field8723 != -1 && ~super.field8700 != 0) {
                class526 var13 = class261.field3825.method1313((byte) -127, super.field8723);
                boolean var14 = var13.field7404 == 3 && (~var8 != -1 || ~var9 != -1);
                int var15 = var4;
                if (var14) {
                    var15 = var4 | 7;
                } else {
                    if (~super.field8682 != -1) {
                        var15 = var4 | 5;
                    }
                    if (super.field8743 != 0) {
                        var15 |= 2;
                    }
                }
                class55 var16 = super.field8783[1] = var13.method3076(class357.field5338, (byte) 3, super.field8707, super.field8678, super.field8700, var15, arg2);
                if (var16 != null) {
                    if (~super.field8743 != -1) {
                        var16.method337(0, -super.field8743 << 2, 0);
                    }
                    if (~super.field8682 != -1) {
                        var16.method349(super.field8682 * 2048);
                    }
                    if (var14) {
                        if (super.field8721 != 0) {
                            var16.method356(super.field8721);
                        }
                        if (super.field8733 != 0) {
                            var16.method366(super.field8733);
                        }
                        if (super.field8688 != 0) {
                            var16.method337(0, super.field8688, 0);
                        }
                    }
                }
            } else {
                super.field8783[1] = null;
            }
            if (super.field8676 != -1 && ~super.field8744 != 0) {
                class526 var17 = class261.field3825.method1313((byte) -128, super.field8676);
                boolean var18 = var17.field7404 == 3 && (var8 != 0 || var9 != 0);
                int var19 = var4;
                if (!var18) {
                    if (~super.field8704 != -1) {
                        var19 = var4 | 5;
                    }
                    if (super.field8713 != 0) {
                        var19 |= 2;
                    }
                } else {
                    var19 = var4 | 7;
                }
                class55 var20 = super.field8783[2] = var17.method3079((byte) 18, class357.field5338, arg2, super.field8693, var19, super.field8717, super.field8744);
                if (var20 != null) {
                    if (~super.field8713 != -1) {
                        var20.method337(0, -super.field8713 << 2, 0);
                    }
                    if (~super.field8704 != -1) {
                        var20.method349(super.field8704 * 2048);
                    }
                    if (var18) {
                        if (~super.field8721 != -1) {
                            var20.method356(super.field8721);
                        }
                        if (super.field8733 != 0) {
                            var20.method366(super.field8733);
                        }
                        if (super.field8688 != 0) {
                            var20.method337(0, super.field8688, 0);
                        }
                    }
                }
            } else {
                super.field8783[2] = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lr;IIIII)V")
    public static final void method460(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.method142(arg2, arg4, arg2 + arg5, arg4 - -arg1);
        ++field881;
        arg0.method1267(arg4, arg1, 1, arg5, arg2, -16777216);
        if (~class660.field9506 <= -101) {
            float var6 = (float) class407.field5882 / (float) class407.field5892;
            int var7 = arg5;
            int var8 = arg1;
            if (var6 < 1.0F) {
                var8 = (int) ((float) arg5 * var6);
            } else {
                var7 = (int) ((float) arg1 / var6);
            }
            int var9 = (-var8 + arg1) / 2 + arg4;
            int var10 = (arg5 - var7) / 2 + arg2;
            if (class220.field3334 == null || ~arg5 != ~class220.field3334.method1792() || arg1 != class220.field3334.method1785()) {
                class407.method2495(class407.field5899, class407.field5902 + class407.field5882, class407.field5899 + class407.field5892, class407.field5902, var10, var9, var10 - -var7, var8 + var9);
                class407.method2494(arg0);
                class220.field3334 = arg0.method182(var10, var9, var7, var8, false);
            }
            class220.field3334.method3914(var10, var9);
            int var11 = class426.field6142 * var7 / class407.field5892;
            int var12 = class42.field1082 * var8 / class407.field5882;
            int var13 = class431.field6230 * var7 / class407.field5892 + var10;
            int var14 = var9 - (class428.field6172 * var8 / class407.field5882 + -var8 + var12);
            int var15 = -1996554240;
            if (class78.field1573 == class49.field1167) {
                var15 = -1996488705;
            }
            if (arg3 == -2) {
                arg0.method4(var13, var14, var11, var12, var15, 1);
                arg0.method108(var13, var14, var11, var12, var15, 0);
                if (~class414.field6008 < -1) {
                    int var16;
                    if (class42.field1080 <= 50) {
                        var16 = class42.field1080 * 5;
                    } else {
                        var16 = (100 - class42.field1080) * 5;
                    }
                    for (class473 var17 = (class473) class407.field5880.method1224(arg3); var17 != null; var17 = (class473) class407.field5880.method1232(-2)) {
                        class288 var18 = class407.field5864.method3355(var17.field6709, (byte) -2);
                        if (class47.method597(50, var18)) {
                            if (class87.field1627 != var17.field6709) {
                                if (~class362.field5373 != 0 && class362.field5373 == var18.field4320) {
                                    int var19 = var17.field6712 * var7 / class407.field5892 + var10;
                                    int var20 = var9 - -((-var17.field6706 + class407.field5882) * var8 / class407.field5882);
                                    arg0.method1267(var20 - 2, 4, 1, 4, var19 + -2, var16 << 24 | 16776960);
                                }
                            } else {
                                int var21 = var17.field6712 * var7 / class407.field5892 + var10;
                                int var22 = (-var17.field6706 + class407.field5882) * var8 / class407.field5882 + var9;
                                arg0.method1267(var22 + -2, 4, arg3 + 3, 4, var21 + -2, var16 << 24 | 16776960);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BLrr;)V")
    public final void method461(byte arg0, class334 arg1) {
        ++field877;
        if (arg0 < 4) {
            field867 = null;
        }
        this.field880 = arg1;
        if (super.field8784 != null) {
            super.field8784.method577();
        }
    }

    @OriginalMember(owner = "client!an", name = "e", descriptor = "(Z)V")
    public static void method462(boolean arg0) {
        if (!arg0) {
            field867 = null;
        }
        field867 = null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZLr;)V")
    public final void method463(boolean arg0, class167 arg1) {
        ++field859;
        if (this.field880 != null) {
            if (super.field8782 || this.method459(0, -1, arg1)) {
                class396 var3 = arg1.method53();
                var3.method900(super.field8737.method2434(128));
                var3.method891(super.field9806, super.field9809 + -20, super.field9815);
                if (!arg0) {
                    this.method3463(0, var3, arg1, super.field8782, super.field8783);
                    super.field8783[0] = super.field8783[1] = super.field8783[2] = null;
                }
            }
        }
    }
}
