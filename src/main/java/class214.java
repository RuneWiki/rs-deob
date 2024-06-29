import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class214 extends class488 {

    @OriginalMember(owner = "client!ida", name = "s", descriptor = "I")
    private int field2701 = 0;

    @OriginalMember(owner = "client!ida", name = "F", descriptor = "Lwaa;")
    private class652 field2714 = new class652(16);

    @OriginalMember(owner = "client!ida", name = "N", descriptor = "I")
    private int field2722 = 0;

    @OriginalMember(owner = "client!ida", name = "L", descriptor = "Loe;")
    private class183 field2720 = new class183();

    @OriginalMember(owner = "client!ida", name = "S", descriptor = "J")
    private long field2727 = 0L;

    @OriginalMember(owner = "client!ida", name = "q", descriptor = "Lvp;")
    private class171 field2699;

    @OriginalMember(owner = "client!ida", name = "u", descriptor = "I")
    private int field2703;

    @OriginalMember(owner = "client!ida", name = "P", descriptor = "Z")
    private boolean field2724;

    @OriginalMember(owner = "client!ida", name = "M", descriptor = "Loe;")
    private class183 field2721;

    @OriginalMember(owner = "client!ida", name = "B", descriptor = "I")
    private int field2710;

    @OriginalMember(owner = "client!ida", name = "x", descriptor = "Luh;")
    private class149 field2706;

    @OriginalMember(owner = "client!ida", name = "p", descriptor = "[B")
    private byte[] field2698;

    @OriginalMember(owner = "client!ida", name = "R", descriptor = "Z")
    private boolean field2726;

    @OriginalMember(owner = "client!ida", name = "v", descriptor = "Lvp;")
    private class171 field2704;

    @OriginalMember(owner = "client!ida", name = "i", descriptor = "I")
    private int field2691;

    @OriginalMember(owner = "client!ida", name = "y", descriptor = "Lqc;")
    private class689 field2707;

    @OriginalMember(owner = "client!ida", name = "t", descriptor = "Ltg;")
    private class210 field2702;

    @OriginalMember(owner = "client!ida", name = "w", descriptor = "Z")
    public static boolean field2705 = false;

    @OriginalMember(owner = "client!ida", name = "k", descriptor = "Lhu;")
    public static class115 field2693 = new class115("", 11);

    @OriginalMember(owner = "client!ida", name = "Q", descriptor = "Ljk;")
    public static class585 field2725 = new class585(82, -1);

    @OriginalMember(owner = "client!ida", name = "h", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!ida", name = "l", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!ida", name = "m", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!ida", name = "n", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!ida", name = "o", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!ida", name = "r", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!ida", name = "z", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!ida", name = "A", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!ida", name = "C", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!ida", name = "D", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!ida", name = "E", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!ida", name = "G", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!ida", name = "H", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!ida", name = "J", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!ida", name = "T", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!ida", name = "U", descriptor = "Lgda;")
    public static class50 field2729;

    @OriginalMember(owner = "client!ida", name = "K", descriptor = "Lgba;")
    public static class618 field2719;

    @OriginalMember(owner = "client!ida", name = "I", descriptor = "Ldw;")
    private class667 field2717;

    @OriginalMember(owner = "client!ida", name = "O", descriptor = "Z")
    private boolean field2723;

    @OriginalMember(owner = "client!ida", name = "j", descriptor = "[B")
    private byte[] field2692;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(B)Z")
    public static final boolean method1298(byte arg0) {
        field2690++;
        if (arg0 <= 114) {
            return false;
        }
        if (class16.field296) {
            try {
                class140.method923(class627.field8991, (byte) 87, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(BI)I")
    public final int method1299(byte arg0, int arg1) {
        field2711++;
        class210 var3 = (class210) this.field2714.method3678((long) arg1, -122);
        if (arg0 != -71) {
            this.field2710 = 118;
        }
        return var3 == null ? 0 : var3.method921(arg0 ^ 0x5B0A);
    }

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "(I)I")
    public final int method1300(int arg0) {
        field2700++;
        if (this.field2717 == null) {
            return 0;
        }
        if (arg0 != 18892) {
            this.method1309(-124);
        }
        if (this.field2724) {
            class513 var2 = this.field2721.method1132((byte) -86);
            return var2 == null ? 0 : (int) var2.field7519;
        } else {
            return this.field2717.field9552;
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)Ldw;")
    public final class667 method1301(int arg0) {
        field2713++;
        if (this.field2717 != null) {
            return this.field2717;
        }
        if (this.field2702 == null) {
            if (this.field2706.method964((byte) 80)) {
                return null;
            }
            this.field2702 = this.field2706.method969(this.field2703, 255, true, (byte) 82, (byte) 0);
        }
        if (this.field2702.field2557) {
            return null;
        }
        byte[] var2 = this.field2702.method917(-27362);
        if (this.field2702 instanceof class139) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2717 = new class667(var2, this.field2710, this.field2698);
                if (this.field2717.field9555 != this.field2691) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field2717 = null;
                if (this.field2706.method964((byte) 44)) {
                    this.field2702 = null;
                } else {
                    this.field2702 = this.field2706.method969(this.field2703, 255, true, (byte) 82, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2717 = new class667(var2, this.field2710, this.field2698);
            } catch (RuntimeException var4) {
                this.field2706.method960((byte) -89);
                this.field2717 = null;
                if (this.field2706.method964((byte) 73)) {
                    this.field2702 = null;
                } else {
                    this.field2702 = this.field2706.method969(this.field2703, 255, true, (byte) 82, (byte) 0);
                }
                return null;
            }
            if (this.field2704 != null) {
                this.field2707.method3894(2465, this.field2704, var2, this.field2703);
            }
        }
        this.field2702 = null;
        if (arg0 != 18322) {
            this.field2717 = null;
        }
        if (this.field2699 != null) {
            this.field2692 = new byte[this.field2717.field9563];
            this.field2701 = 0;
        }
        return this.field2717;
    }

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "(BI)V")
    public final void method1302(byte arg0, int arg1) {
        field2696++;
        int var3 = -105 % ((arg0 + 51) / 50);
        if (this.field2699 == null) {
            return;
        }
        for (class513 var4 = this.field2720.method1132((byte) 35); var4 != null; var4 = this.field2720.method1134(8446)) {
            if (((long) arg1) == var4.field7519) {
                return;
            }
        }
        class513 var5 = new class513();
        var5.field7519 = arg1;
        this.field2720.method1129(var5, 262144);
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lbd;")
    public static final class56 method1303(Throwable arg0, String arg1) {
        field2715++;
        class56 var2;
        if (arg0 instanceof class56) {
            var2 = (class56) arg0;
            var2.field891 = var2.field891 + ' ' + arg1;
        } else {
            var2 = new class56(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(B)I")
    public final int method1304(byte arg0) {
        field2712++;
        if (this.method1301(arg0 ^ 0xFFFFB86D) == null) {
            return this.field2702 == null ? 0 : this.field2702.method921(-23373);
        } else if (arg0 == -1) {
            return 100;
        } else {
            return -14;
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(III)Ltg;")
    private final class210 method1305(int arg0, int arg1, int arg2) {
        field2695++;
        class210 var4 = (class210) this.field2714.method3678((long) arg1, -119);
        if (arg0 < 86) {
            method1303(null, null);
        }
        if (var4 != null && arg2 == 0 && !var4.field2555 && var4.field2557) {
            var4.method3045(true);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field2699 == null || this.field2692[arg1] == -1) {
                    if (this.field2706.method964((byte) 48)) {
                        return null;
                    }
                    var4 = this.field2706.method969(arg1, this.field2703, true, (byte) 82, (byte) 2);
                } else {
                    var4 = this.field2707.method3892(arg1, this.field2699, -106);
                }
            } else if (arg2 == 1) {
                if (this.field2699 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field2707.method3897(10426, arg1, this.field2699);
            } else if (arg2 == 2) {
                if (this.field2699 == null) {
                    throw new RuntimeException();
                }
                if (this.field2692[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field2706.method959(8)) {
                    return null;
                }
                var4 = this.field2706.method969(arg1, this.field2703, false, (byte) 82, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field2714.method3670((long) arg1, var4, (byte) 127);
        }
        if (var4.field2557) {
            return null;
        }
        byte[] var5 = var4.method917(-27362);
        if (!(var4 instanceof class139)) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class454.field6388.reset();
                class454.field6388.update(var5, 0, var5.length - 2);
                int var6 = (int) class454.field6388.getValue();
                if (this.field2717.field9557[arg1] != var6) {
                    throw new RuntimeException();
                }
                if (this.field2717.field9561 != null && this.field2717.field9561[arg1] != null) {
                    byte[] var7 = this.field2717.field9561[arg1];
                    byte[] var8 = class500.method2910((byte) 127, var5.length - 2, var5, 0);
                    for (int var9 = 0; var9 < 64; var9++) {
                        if (var7[var9] != var8[var9]) {
                            throw new RuntimeException();
                        }
                    }
                }
                this.field2706.field1856 = 0;
                this.field2706.field1853 = 0;
            } catch (RuntimeException var17) {
                this.field2706.method960((byte) -64);
                var4.method3045(true);
                if (var4.field2555 && !this.field2706.method964((byte) 45)) {
                    class447 var10 = this.field2706.method969(arg1, this.field2703, true, (byte) 82, (byte) 2);
                    this.field2714.method3670((long) arg1, var10, (byte) 127);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field2717.field9550[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field2717.field9550[arg1];
            if (this.field2699 != null) {
                this.field2707.method3894(2465, this.field2699, var5, arg1);
                if (this.field2692[arg1] != 1) {
                    this.field2701++;
                    this.field2692[arg1] = 1;
                }
            }
            if (!var4.field2555) {
                var4.method3045(true);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class454.field6388.reset();
            class454.field6388.update(var5, 0, var5.length - 2);
            int var11 = (int) class454.field6388.getValue();
            if (this.field2717.field9557[arg1] != var11) {
                throw new RuntimeException();
            }
            if (this.field2717.field9561 != null && this.field2717.field9561[arg1] != null) {
                byte[] var12 = this.field2717.field9561[arg1];
                byte[] var13 = class500.method2910((byte) 124, var5.length - 2, var5, 0);
                for (int var14 = 0; var14 < 64; var14++) {
                    if (var12[var14] != var13[var14]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var15 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field2717.field9550[arg1] & 0xFFFF) != var15) {
                throw new RuntimeException();
            }
            if (this.field2692[arg1] != 1) {
                this.field2701++;
                this.field2692[arg1] = 1;
            }
            if (!var4.field2555) {
                var4.method3045(true);
            }
            return var4;
        } catch (Exception var18) {
            this.field2692[arg1] = -1;
            var4.method3045(true);
            if (var4.field2555 && !this.field2706.method964((byte) 119)) {
                class447 var16 = this.field2706.method969(arg1, this.field2703, true, (byte) 82, (byte) 2);
                this.field2714.method3670((long) arg1, var16, (byte) 127);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "(B)V")
    public final void method1306(byte arg0) {
        field2716++;
        if (this.field2699 == null) {
            return;
        }
        this.field2723 = true;
        if (this.field2721 == null) {
            this.field2721 = new class183();
        }
        if (arg0 != 1) {
            field2718 = -65;
        }
    }

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "(I)V")
    public static void method1307(int arg0) {
        if (arg0 != -2) {
            field2719 = null;
        }
        field2729 = null;
        field2719 = null;
        field2693 = null;
        field2725 = null;
    }

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "(B)I")
    public final int method1308(byte arg0) {
        if (arg0 == -90) {
            field2697++;
            return this.field2717 == null ? 0 : this.field2717.field9552;
        } else {
            return -61;
        }
    }

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "(I)I")
    public final int method1309(int arg0) {
        if (arg0 != 100) {
            this.field2701 = -103;
        }
        field2709++;
        return this.field2701;
    }

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "(B)V")
    public final void method1310(byte arg0) {
        field2708++;
        if (this.field2721 != null) {
            if (this.method1301(18322) == null) {
                return;
            }
            if (this.field2724) {
                boolean var2 = true;
                for (class513 var3 = this.field2721.method1132((byte) 40); var3 != null; var3 = this.field2721.method1134(arg0 + 8533)) {
                    int var5 = (int) var3.field7519;
                    if (this.field2692[var5] == 0) {
                        this.method1305(110, var5, 1);
                    }
                    if (this.field2692[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method3045(true);
                    }
                }
                while (this.field2717.field9558.length > this.field2722) {
                    if (this.field2717.field9558[this.field2722] == 0) {
                        this.field2722++;
                    } else {
                        if (this.field2707.field9831 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field2692[this.field2722] == 0) {
                            this.method1305(110, this.field2722, 1);
                        }
                        if (this.field2692[this.field2722] == 0) {
                            class513 var4 = new class513();
                            var4.field7519 = this.field2722;
                            this.field2721.method1129(var4, arg0 ^ 0xFFFBFFA9);
                            var2 = false;
                        }
                        this.field2722++;
                    }
                }
                if (var2) {
                    this.field2724 = false;
                    this.field2722 = 0;
                }
            } else if (this.field2723) {
                boolean var6 = true;
                for (class513 var7 = this.field2721.method1132((byte) -102); var7 != null; var7 = this.field2721.method1134(8446)) {
                    int var9 = (int) var7.field7519;
                    if (this.field2692[var9] != 1) {
                        this.method1305(arg0 ^ 0xFFFFFFC4, var9, 2);
                    }
                    if (this.field2692[var9] == 1) {
                        var7.method3045(true);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field2722 < this.field2717.field9558.length) {
                    if (this.field2717.field9558[this.field2722] == 0) {
                        this.field2722++;
                    } else {
                        if (this.field2706.method959(8)) {
                            var6 = false;
                            break;
                        }
                        if (this.field2692[this.field2722] != 1) {
                            this.method1305(108, this.field2722, 2);
                        }
                        if (this.field2692[this.field2722] != 1) {
                            class513 var8 = new class513();
                            var8.field7519 = this.field2722;
                            var6 = false;
                            this.field2721.method1129(var8, 262144);
                        }
                        this.field2722++;
                    }
                }
                if (var6) {
                    this.field2722 = 0;
                    this.field2723 = false;
                }
            } else {
                this.field2721 = null;
            }
        }
        if (this.field2726 && class301.method1787((byte) -84) >= this.field2727) {
            for (class210 var10 = (class210) this.field2714.method3669((byte) 28); var10 != null; var10 = (class210) this.field2714.method3676((byte) -12)) {
                if (!var10.field2557) {
                    if (var10.field2554) {
                        if (!var10.field2555) {
                            throw new RuntimeException();
                        }
                        var10.method3045(true);
                    } else {
                        var10.field2554 = true;
                    }
                }
            }
            this.field2727 = class301.method1787((byte) 126) + 1000L;
        }
        if (arg0 != -87) {
            this.field2704 = null;
        }
    }

    @OriginalMember(owner = "client!ida", name = "f", descriptor = "(I)V")
    public final void method1311(int arg0) {
        field2728++;
        if (this.field2721 == null || this.method1301(18322) == null) {
            return;
        }
        class513 var2 = this.field2720.method1132((byte) -123);
        if (arg0 != 1000) {
            return;
        }
        while (var2 != null) {
            int var3 = (int) var2.field7519;
            if (var3 < 0 || var3 >= this.field2717.field9563 || this.field2717.field9558[var3] == 0) {
                var2.method3045(true);
            } else {
                if (this.field2692[var3] == 0) {
                    this.method1305(arg0 - 877, var3, 1);
                }
                if (this.field2692[var3] == -1) {
                    this.method1305(105, var3, 2);
                }
                if (this.field2692[var3] == 1) {
                    var2.method3045(true);
                }
            }
            var2 = this.field2720.method1134(arg0 + 7446);
        }
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(BI)[B")
    public final byte[] method1312(byte arg0, int arg1) {
        field2694++;
        if (arg0 != 110) {
            this.field2724 = true;
        }
        class210 var3 = this.method1305(123, arg1, 0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method917(-27362);
            var3.method3045(true);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(ILvp;Lvp;Luh;Lqc;I[BIZ)V")
    public class214(int arg0, class171 arg1, class171 arg2, class149 arg3, class689 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field2699 = arg1;
        this.field2703 = arg0;
        if (this.field2699 == null) {
            this.field2724 = false;
        } else {
            this.field2724 = true;
            this.field2721 = new class183();
        }
        this.field2710 = arg5;
        this.field2706 = arg3;
        this.field2698 = arg6;
        this.field2726 = arg8;
        this.field2704 = arg2;
        this.field2691 = arg7;
        this.field2707 = arg4;
        if (this.field2704 != null) {
            this.field2702 = this.field2707.method3892(this.field2703, this.field2704, -111);
        }
    }
}
