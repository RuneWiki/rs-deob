import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class50 {

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public int field704 = 0;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
    public int field718 = -1;

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "I")
    public int field721 = -1;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "Ljava/lang/String;")
    public String field702 = null;

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "Lmaa;")
    public static class461 field716 = new class461();

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "B")
    public byte field688;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "B")
    public byte field690;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "B")
    public byte field693;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "B")
    public byte field710;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public int field700;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "I")
    public int field722;

    @OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!lm", name = "O", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!lm", name = "P", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!lm", name = "Q", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "J")
    public long field707;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "Lsi;")
    private class769 field706;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "Z")
    private boolean field701;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "Z")
    private boolean field713;

    @OriginalMember(owner = "client!lm", name = "N", descriptor = "Z")
    public boolean field725;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "[B")
    public byte[] field694;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "[I")
    private int[] field714;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "[J")
    private long[] field692;

    @OriginalMember(owner = "client!lm", name = "M", descriptor = "[J")
    private long[] field724;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "[Ljava/lang/String;")
    public String[] field689;

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "[Ljava/lang/String;")
    public String[] field719;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(JII)Z")
    public final boolean method388(long arg0, int arg1, int arg2) {
        field691++;
        if (this.field706 == null) {
            this.field706 = new class769(4);
        } else {
            class766 var5 = this.field706.method4253((long) arg1, -1);
            if (var5 != null) {
                if (var5 instanceof class194) {
                    class194 var6 = (class194) var5;
                    if (var6.field2906 == arg0) {
                        return false;
                    }
                    var6.field2906 = arg0;
                    return true;
                }
                var5.method4237(-1);
            }
        }
        if (arg2 != 4) {
            this.field725 = true;
        }
        this.field706.method4252(false, new class194(arg0), (long) arg1);
        return true;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public final String method389(byte arg0, int arg1) {
        field715++;
        if (this.field706 == null) {
            return null;
        }
        if (arg0 <= 107) {
            this.field704 = -84;
        }
        class766 var3 = this.field706.method4253((long) arg1, -1);
        return var3 != null && var3 instanceof class662 ? ((class662) var3).field9327 : null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IJLjava/lang/String;)V")
    public final void method390(int arg0, long arg1, String arg2) {
        field720++;
        if (arg2 != null && arg2.length() == 0) {
            arg2 = null;
        }
        if (this.field701 != arg1 > 0L) {
            throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.field701 + " but userhash:" + arg1);
        } else if (arg0 >= 21) {
            if (arg2 == null == this.field713) {
                throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.field713 + " but displayname:" + arg2);
            }
            if (arg1 > 0L && (this.field692 == null || this.field700 >= this.field692.length) || arg2 != null && (this.field719 == null || this.field700 >= this.field719.length)) {
                this.method409(this.field700 + 5, false);
            }
            if (this.field692 != null) {
                this.field692[this.field700] = arg1;
            }
            if (this.field719 != null) {
                this.field719[this.field700] = arg2;
            }
            this.field700++;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(BI)V")
    public final void method391(byte arg0, int arg1) {
        field703++;
        if (arg1 < 0 || arg1 >= this.field722) {
            throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + arg1 + " memberCount:" + this.field722);
        }
        this.field722--;
        if (arg0 >= -102) {
            this.method397(50, -104);
        }
        if (this.field722 == 0) {
            this.field718 = -1;
            this.field689 = null;
            this.field721 = -1;
            this.field724 = null;
            this.field714 = null;
            this.field694 = null;
            return;
        }
        class171.method1263(this.field694, arg1 + 1, this.field694, arg1, this.field722 - arg1);
        class171.method1262(this.field714, arg1 + 1, this.field714, arg1, this.field722 - arg1);
        if (this.field724 != null) {
            class171.method1261(this.field724, arg1 + 1, this.field724, arg1, this.field722 - arg1);
        }
        if (this.field689 != null) {
            class171.method1265(this.field689, arg1 + 1, this.field689, arg1, this.field722 - arg1);
        }
        if (this.field718 == arg1 || this.field721 == arg1) {
            this.method406(false);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)I")
    public static final int method392(int arg0, int arg1) {
        field696++;
        if (arg0 != -1) {
            field716 = null;
        }
        if (arg1 < 96) {
            return 0;
        } else if (arg1 < 128) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/lang/String;J)V")
    public final void method393(int arg0, String arg1, long arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        field723++;
        if (arg2 <= 0L == this.field701) {
            throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.field701 + " but userhash:" + arg2);
        } else if (this.field713 == (arg1 == null)) {
            throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.field713 + " but displayname:" + arg1);
        } else {
            int var5 = -121 % ((15 - arg0) / 42);
            if (arg2 > 0L && (this.field724 == null || this.field724.length <= this.field722) || arg1 != null && (this.field689 == null || this.field689.length <= this.field722)) {
                this.method403((byte) -84, this.field722 + 5);
            }
            if (this.field724 != null) {
                this.field724[this.field722] = arg2;
            }
            if (this.field689 != null) {
                this.field689[this.field722] = arg1;
            }
            if (this.field718 == -1) {
                this.field718 = this.field722;
                this.field694[this.field722] = 126;
            } else {
                this.field694[this.field722] = 0;
            }
            this.field714[this.field722] = 0;
            this.field722++;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(JII)Ljava/lang/String;")
    public static final String method394(long arg0, int arg1, int arg2) {
        if (arg2 != 100) {
            field716 = null;
        }
        field695++;
        class724.method4017((byte) 126, arg0);
        int var4 = class99.field1449.get(5);
        int var5 = class99.field1449.get(2) + 1;
        int var6 = class99.field1449.get(1);
        return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIII)Z")
    public final boolean method395(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field708++;
        int var6 = (0x1 << arg0) + arg2;
        int var7 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var8 = var6 ^ var7;
        int var9 = arg4 << arg0;
        int var10 = var9 & var8;
        if (this.field706 == null) {
            this.field706 = new class769(4);
        } else {
            class766 var11 = this.field706.method4253((long) arg1, -1);
            if (var11 != null) {
                if (var11 instanceof class725) {
                    class725 var12 = (class725) var11;
                    if ((var8 & var12.field10098) == var10) {
                        return false;
                    }
                    var12.field10098 &= ~var8;
                    var12.field10098 |= var10;
                    return true;
                }
                var11.method4237(-1);
            }
        }
        this.field706.method4252(false, new class725(var10), (long) arg1);
        return true;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(IIIII)I")
    public final int method396(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field705++;
        int var6 = (0x1 << arg0) - 1;
        int var7 = arg4 == 31 ? -1 : (0x1 << arg4 + 1) - 1;
        int var8 = var6 ^ var7;
        int var9 = arg3 << arg0;
        int var10 = var9 & var8;
        int var11 = this.field714[arg2];
        if ((var8 & var11) == var10) {
            return -1;
        }
        int var12 = var11 & ~var8;
        this.field714[arg2] = class694.method3895(var10, var12);
        if (arg1 != 14950) {
            this.method400(84, 36);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)Ljava/lang/Integer;")
    public final Integer method397(int arg0, int arg1) {
        field709++;
        if (this.field706 == null) {
            return null;
        }
        class766 var3 = this.field706.method4253((long) arg0, -1);
        if (var3 != null && var3 instanceof class725) {
            if (arg1 != 1) {
                this.method390(116, -29L, null);
            }
            return Integer.valueOf(((class725) var3).field10098);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(II)V")
    public final void method398(int arg0, int arg1) {
        this.field700--;
        field726++;
        if (this.field700 == 0) {
            this.field692 = null;
            this.field719 = null;
        } else {
            if (this.field692 != null) {
                class171.method1261(this.field692, arg1 + 1, this.field692, arg1, this.field700 - arg1);
            }
            if (this.field719 != null) {
                class171.method1265(this.field719, arg1 + 1, this.field719, arg1, this.field700 - arg1);
            }
        }
        if (arg0 != 11449) {
            this.method393(-97, null, 52L);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
    public static void method399(byte arg0) {
        if (arg0 < -94) {
            field716 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(II)Ljava/lang/Long;")
    public final Long method400(int arg0, int arg1) {
        field711++;
        if (this.field706 == null) {
            return null;
        } else if (arg0 == 4) {
            class766 var3 = this.field706.method4253((long) arg1, -1);
            return var3 != null && var3 instanceof class194 ? Long.valueOf(((class194) var3).field2906) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IBI)I")
    public final int method401(int arg0, byte arg1, int arg2) {
        field712++;
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (arg2 != -24707) {
            return 101;
        } else if (this.field718 == arg0 && (this.field721 == -1 || this.field694[this.field721] < 125)) {
            return -1;
        } else if (this.field694[arg0] == arg1) {
            return -1;
        } else {
            this.field694[arg0] = arg1;
            this.method406(false);
            return arg0;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;II)Z")
    public final boolean method402(String arg0, int arg1, int arg2) {
        field727++;
        if (arg1 != 0) {
            method399((byte) 64);
        }
        if (arg0 == null) {
            arg0 = "";
        } else if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        if (this.field706 == null) {
            this.field706 = new class769(4);
        } else {
            class766 var4 = this.field706.method4253((long) arg2, -1);
            if (var4 != null) {
                if (var4 instanceof class662) {
                    class662 var5 = (class662) var4;
                    if (var5.field9327.equals(arg0)) {
                        return false;
                    }
                    var5.field9327 = arg0;
                    return true;
                }
                var4.method4237(-1);
            }
        }
        this.field706.method4252(false, new class662(arg0), (long) arg2);
        return true;
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(BI)V")
    private final void method403(byte arg0, int arg1) {
        field687++;
        if (this.field701) {
            if (this.field724 == null) {
                this.field724 = new long[arg1];
            } else {
                class171.method1261(this.field724, 0, this.field724 = new long[arg1], 0, this.field722);
            }
        }
        if (this.field713) {
            if (this.field689 == null) {
                this.field689 = new String[arg1];
            } else {
                class171.method1265(this.field689, 0, this.field689 = new String[arg1], 0, this.field722);
            }
        }
        if (arg0 >= -42) {
            this.method405(108, 25, 40);
        }
        if (this.field694 == null) {
            this.field694 = new byte[arg1];
        } else {
            class171.method1263(this.field694, 0, this.field694 = new byte[arg1], 0, this.field722);
        }
        if (this.field714 == null) {
            this.field714 = new int[arg1];
        } else {
            class171.method1262(this.field714, 0, this.field714 = new int[arg1], 0, this.field722);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIBI)I")
    public final int method404(int arg0, int arg1, byte arg2, int arg3) {
        field699++;
        int var5 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        return arg2 < 16 ? -109 : (this.field714[arg1] & var5) >>> arg0;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)Z")
    public final boolean method405(int arg0, int arg1, int arg2) {
        field728++;
        if (this.field706 == null) {
            this.field706 = new class769(4);
        } else {
            class766 var4 = this.field706.method4253((long) arg2, -1);
            if (var4 != null) {
                if (var4 instanceof class725) {
                    class725 var5 = (class725) var4;
                    if (var5.field10098 == arg1) {
                        return false;
                    }
                    var5.field10098 = arg1;
                    return true;
                }
                var4.method4237(arg0 - 5);
            }
        }
        this.field706.method4252(false, new class725(arg1), (long) arg2);
        return arg0 == 4;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)V")
    private final void method406(boolean arg0) {
        field717++;
        if (this.field722 == 0) {
            this.field718 = -1;
            this.field721 = -1;
            return;
        }
        this.field718 = -1;
        this.field721 = -1;
        int var2 = 0;
        byte var3 = this.field694[0];
        for (int var4 = 1; var4 < this.field722; var4++) {
            if (var3 < this.field694[var4]) {
                if (var3 == 125) {
                    this.field721 = var2;
                }
                var3 = this.field694[var4];
                var2 = var4;
            } else if (this.field721 == -1 && this.field694[var4] == 125) {
                this.field721 = var4;
            }
        }
        if (!arg0) {
            this.field718 = var2;
            if (this.field718 != -1) {
                this.field694[this.field718] = 126;
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIII)Ljava/lang/Integer;")
    public final Integer method407(int arg0, int arg1, int arg2, int arg3) {
        field697++;
        if (this.field706 == null) {
            return null;
        }
        class766 var5 = this.field706.method4253((long) arg3, -1);
        if (var5 == null || !var5 instanceof class725) {
            return null;
        }
        if (arg1 != 1) {
            this.field702 = null;
        }
        int var6 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return Integer.valueOf((((class725) var5).field10098 & var6) >>> arg0);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BLol;)V")
    private final void method408(byte arg0, class431 arg1) {
        field698++;
        int var3 = arg1.method2557(14929);
        if (var3 < 1 || var3 > 3) {
            throw new RuntimeException("Unsupported ClanSettings version: " + var3);
        }
        int var4 = arg1.method2557(14929);
        if ((var4 & 0x2) != 0) {
            this.field713 = true;
        }
        if ((var4 & 0x1) != 0) {
            this.field701 = true;
        }
        if (!this.field701) {
            this.field724 = null;
            this.field692 = null;
        }
        if (!this.field713) {
            this.field689 = null;
            this.field719 = null;
        }
        this.field704 = arg1.method2526(17);
        arg1.method2526(17);
        this.field722 = arg1.method2565((byte) -103);
        this.field700 = arg1.method2557(14929);
        this.field702 = arg1.method2532((byte) -116);
        this.field725 = arg1.method2557(14929) == 1;
        this.field690 = arg1.method2529(38);
        this.field693 = arg1.method2529(48);
        this.field688 = arg1.method2529(arg0 + 43);
        if (arg0 != 18) {
            this.method408((byte) -69, null);
        }
        this.field710 = arg1.method2529(99);
        if (this.field722 > 0) {
            if (this.field701 && (this.field724 == null || this.field724.length < this.field722)) {
                this.field724 = new long[this.field722];
            }
            if (this.field713 && (this.field689 == null || this.field689.length < this.field722)) {
                this.field689 = new String[this.field722];
            }
            if (this.field694 == null || this.field694.length < this.field722) {
                this.field694 = new byte[this.field722];
            }
            if (this.field714 == null || this.field722 > this.field714.length) {
                this.field714 = new int[this.field722];
            }
            for (int var5 = 0; var5 < this.field722; var5++) {
                if (this.field701) {
                    this.field724[var5] = arg1.method2567((byte) -127);
                }
                if (this.field713) {
                    this.field689[var5] = arg1.method2578(1712145680);
                }
                this.field694[var5] = arg1.method2529(112);
                if (var3 >= 2) {
                    this.field714[var5] = arg1.method2526(17);
                }
            }
            this.method406(false);
        }
        if (this.field700 > 0) {
            if (this.field701 && (this.field692 == null || this.field692.length < this.field700)) {
                this.field692 = new long[this.field700];
            }
            if (this.field713 && (this.field719 == null || this.field719.length < this.field700)) {
                this.field719 = new String[this.field700];
            }
            for (int var6 = 0; var6 < this.field700; var6++) {
                if (this.field701) {
                    this.field692[var6] = arg1.method2567((byte) -128);
                }
                if (this.field713) {
                    this.field719[var6] = arg1.method2578(1712145680);
                }
            }
        }
        if (var3 < 3) {
            return;
        }
        int var7 = arg1.method2565((byte) -96);
        if (var7 <= 0) {
            return;
        }
        this.field706 = new class769(var7 >= 16 ? 16 : class661.method3706(var7, true));
        while ((var7--) > 0) {
            int var8 = arg1.method2526(17);
            int var9 = var8 & 0x3FFFFFFF;
            int var10 = var8 >>> 30;
            if (var10 == 0) {
                int var11 = arg1.method2526(17);
                this.field706.method4252(false, new class725(var11), (long) var9);
            } else if (var10 == 1) {
                long var13 = arg1.method2567((byte) -123);
                this.field706.method4252(false, new class194(var13), (long) var9);
            } else if (var10 == 2) {
                String var12 = arg1.method2532((byte) -111);
                this.field706.method4252(false, new class662(var12), (long) var9);
            }
        }
        return;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)V")
    private final void method409(int arg0, boolean arg1) {
        if (this.field701) {
            if (this.field692 == null) {
                this.field692 = new long[arg0];
            } else {
                class171.method1261(this.field692, 0, this.field692 = new long[arg0], 0, this.field700);
            }
        }
        if (arg1) {
            return;
        }
        field686++;
        if (!this.field713) {
            return;
        }
        if (this.field719 == null) {
            this.field719 = new String[arg0];
        } else {
            class171.method1265(this.field719, 0, this.field719 = new String[arg0], 0, this.field700);
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lol;)V")
    public class50(class431 arg0) {
        this.method408((byte) 18, arg0);
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V")
    private class50() {
    }
}
