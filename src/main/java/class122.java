import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class122 extends class41 {

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    private int field1771 = 0;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Lpk;")
    private class100 field1779 = new class100(16);

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    private int field1800 = 0;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "Lrh;")
    private class46 field1798 = new class46();

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "J")
    private long field1803 = 0L;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    private int field1778;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "Ld;")
    private class237 field1795;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "Z")
    private boolean field1801;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "Lrh;")
    private class46 field1796;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "Ld;")
    private class237 field1787;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "Lrc;")
    private class67 field1780;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "Lrg;")
    private class227 field1785;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "Z")
    private boolean field1802;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
    private int field1790;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
    private int field1792;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "Lki;")
    private class62 field1794;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field1769 = 0;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "Lqh;")
    private class201 field1789;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "Z")
    private boolean field1799;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "[B")
    private byte[] field1768;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)[B")
    public final byte[] method323(int arg0, int arg1) {
        field1782++;
        class62 var3 = this.method795(arg0, 0, (byte) -1);
        if (var3 == null) {
            return null;
        } else if (arg1 == 100) {
            byte[] var4 = var3.method432(24977);
            var3.method784(false);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
    public final void method793(byte arg0) {
        field1797++;
        if (this.field1796 == null || this.method320(123) == null || arg0 < 73) {
            return;
        }
        for (class120 var2 = this.field1798.method350(8240); var2 != null; var2 = this.field1798.method353((byte) -123)) {
            int var3 = (int) var2.field1750;
            if (var3 < 0 || var3 >= this.field1789.field3135 || this.field1789.field3155[var3] == 0) {
                var2.method784(false);
            } else {
                if (this.field1768[var3] == 0) {
                    this.method795(var3, 1, (byte) -1);
                }
                if (this.field1768[var3] == -1) {
                    this.method795(var3, 2, (byte) -1);
                }
                if (this.field1768[var3] == 1) {
                    var2.method784(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)Loi;")
    public static final class80 method794(int arg0, int arg1) {
        field1777++;
        class80 var2 = (class80) class212.field3316.method765((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class1.field1.method807((byte) 91, arg0, 0);
        } else {
            var3 = class71.field999.method807((byte) 95, arg0 & 0x7FFF, 0);
        }
        class80 var4 = new class80();
        if (var3 != null) {
            var4.method559(arg1 ^ 0xFFFFC69E, new class25(var3));
        }
        if (arg1 != 14689) {
            field1769 = -121;
        }
        if (arg0 >= 32768) {
            var4.method552(-86);
        }
        class212.field3316.method763(-49, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIB)Lki;")
    private final class62 method795(int arg0, int arg1, byte arg2) {
        field1775++;
        class62 var4 = (class62) this.field1779.method665((byte) 121, (long) arg0);
        if (arg2 != -1) {
            this.method797((byte) -77);
        }
        if (var4 != null && arg1 == 0 && !var4.field857 && var4.field854) {
            var4.method784(false);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field1795 == null || this.field1768[arg0] == -1) {
                    if (this.field1785.method1557((byte) 93)) {
                        return null;
                    }
                    var4 = this.field1785.method1558(this.field1778, arg0, true, arg2 - 20, (byte) 2);
                } else {
                    var4 = this.field1780.method453(this.field1795, arg0, 10);
                }
            } else if (arg1 == 1) {
                if (this.field1795 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field1780.method454(arg0, true, this.field1795);
            } else if (arg1 == 2) {
                if (this.field1795 == null) {
                    throw new RuntimeException();
                }
                if (this.field1768[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field1785.method1552((byte) 61)) {
                    return null;
                }
                var4 = this.field1785.method1558(this.field1778, arg0, false, -21, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field1779.method662(0, var4, (long) arg0);
        }
        if (var4.field854) {
            return null;
        }
        byte[] var5 = var4.method432(24977);
        if (!var4 instanceof class175) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class157.field2425.reset();
                class157.field2425.update(var5, 0, var5.length - 2);
                int var9 = (int) class157.field2425.getValue();
                if (this.field1789.field3150[arg0] != var9) {
                    throw new RuntimeException();
                }
                this.field1785.field3683 = 0;
                this.field1785.field3686 = 0;
            } catch (RuntimeException var12) {
                this.field1785.method1556((byte) 122);
                var4.method784(false);
                if (var4.field857 && !this.field1785.method1557((byte) 93)) {
                    class167 var10 = this.field1785.method1558(this.field1778, arg0, true, -21, (byte) 2);
                    this.field1779.method662(0, var10, (long) arg0);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field1789.field3140[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field1789.field3140[arg0];
            if (this.field1795 != null) {
                this.field1780.method459(var5, arg0, 2, this.field1795);
                if (this.field1768[arg0] != 1) {
                    this.field1771++;
                    this.field1768[arg0] = 1;
                }
            }
            if (!var4.field857) {
                var4.method784(false);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class157.field2425.reset();
            class157.field2425.update(var5, 0, var5.length - 2);
            int var6 = (int) class157.field2425.getValue();
            if (this.field1789.field3150[arg0] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field1789.field3140[arg0] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field1768[arg0] != 1) {
                this.field1771++;
                this.field1768[arg0] = 1;
            }
            if (!var4.field857) {
                var4.method784(false);
            }
            return var4;
        } catch (Exception var11) {
            this.field1768[arg0] = -1;
            var4.method784(false);
            if (var4.field857 && !this.field1785.method1557((byte) 93)) {
                class167 var8 = this.field1785.method1558(this.field1778, arg0, true, -21, (byte) 2);
                this.field1779.method662(0, var8, (long) arg0);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
    public static final void method796(int arg0) {
        int var1 = -56 / ((arg0 - 8) / 46);
        field1786++;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var7 = 0; var7 < 104; var7++) {
                class262.field4232[var2][var7] = 0;
            }
        }
        for (int var3 = 0; var3 < class73.field1040; var3++) {
            class186 var6 = class153.field2277[class8.field117[var3]];
            if (var6 != null) {
                var6.field1235 = false;
            }
        }
        for (int var4 = 0; var4 < class236.field3774; var4++) {
            class56 var5 = class100.field1566[class248.field3967[var4]];
            if (var5 != null) {
                var5.field1235 = false;
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)I")
    public final int method797(byte arg0) {
        field1770++;
        if (this.method320(126) == null) {
            return this.field1794 == null ? 0 : this.field1794.method434((byte) -104);
        } else {
            int var2 = -106 / ((49 - arg0) / 58);
            return 100;
        }
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(B)I")
    public final int method798(byte arg0) {
        field1788++;
        if (arg0 != 9) {
            return 25;
        } else if (this.field1789 == null) {
            return 0;
        } else if (this.field1801) {
            class120 var2 = this.field1796.method350(8240);
            return var2 == null ? 0 : (int) var2.field1750;
        } else {
            return this.field1789.field3147;
        }
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(B)V")
    private final void method799(byte arg0) {
        field1783++;
        if (arg0 <= 43) {
            this.method804((byte) 16);
        }
        if (this.field1795 != null) {
            this.field1799 = true;
            if (this.field1796 == null) {
                this.field1796 = new class46();
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIBIIIII)Z")
    public static final boolean method800(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1767++;
        long var8 = class224.method1529(arg4, arg1 + arg0, arg5 + arg7);
        if (var8 != 0L) {
            int var10 = ((int) var8 & 0x316016) >> 20;
            int var11 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
            int var12 = ((int) var8 & 0x7DD9E) >> 14;
            class181 var13 = class25.method224(var11, 0);
            if (var13.field2860 == -1) {
                int[] var14 = class127.field1875;
                int var15 = arg3;
                if (var8 > 0L) {
                    var15 = arg6;
                }
                int var16 = (103 - arg5) * 2048 + arg1 * 4 + 24624;
                if (var12 == 0 || var12 == 2) {
                    if (var10 == 0) {
                        var14[var16] = var15;
                        var14[var16 + 512] = var15;
                        var14[var16 + 1024] = var15;
                        var14[var16 + 1536] = var15;
                    } else if (var10 == 1) {
                        var14[var16] = var15;
                        var14[var16 + 1] = var15;
                        var14[var16 + 2] = var15;
                        var14[var16 + 3] = var15;
                    } else if (var10 == 2) {
                        var14[var16 + 3] = var15;
                        var14[var16 + 3 + 512] = var15;
                        var14[var16 + 1024 + 3] = var15;
                        var14[var16 + 3 + 1536] = var15;
                    } else if (var10 == 3) {
                        var14[var16 + 1536] = var15;
                        var14[var16 + 1536 + 1] = var15;
                        var14[var16 + 1536 + 2] = var15;
                        var14[var16 + 1536 + 3] = var15;
                    }
                }
                if (var12 == 3) {
                    if (var10 == 0) {
                        var14[var16] = var15;
                    } else if (var10 == 1) {
                        var14[var16 + 3] = var15;
                    } else if (var10 == 2) {
                        var14[var16 + 1536 + 3] = var15;
                    } else if (var10 == 3) {
                        var14[var16 + 1536] = var15;
                    }
                }
                if (var12 == 2) {
                    if (var10 == 3) {
                        var14[var16] = var15;
                        var14[var16 + 512] = var15;
                        var14[var16 + 1024] = var15;
                        var14[var16 + 1536] = var15;
                    } else if (var10 == 0) {
                        var14[var16] = var15;
                        var14[var16 + 1] = var15;
                        var14[var16 + 2] = var15;
                        var14[var16 + 3] = var15;
                    } else if (var10 == 1) {
                        var14[var16 + 3] = var15;
                        var14[var16 + 3 + 512] = var15;
                        var14[var16 + 3 + 1024] = var15;
                        var14[var16 + 3 + 1536] = var15;
                    } else if (var10 == 2) {
                        var14[var16 + 1536] = var15;
                        var14[var16 + 1536 + 1] = var15;
                        var14[var16 + 2 + 1536] = var15;
                        var14[var16 + 1536 + 3] = var15;
                    }
                }
            } else if (!class72.method494(arg0, var13, 115, arg7, var10, arg1, arg5)) {
                return false;
            }
        }
        if (arg2 > -14) {
            field1769 = -115;
        }
        long var17 = class23.method161(arg4, arg1 + arg0, arg5 + arg7);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x34F6C6) >> 20;
            int var20 = ((int) var17 & 0x7C542) >> 14;
            int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            class181 var22 = class25.method224(var21, 0);
            if (var22.field2860 == -1) {
                if (var20 == 9) {
                    int[] var23 = class127.field1875;
                    int var24 = 15658734;
                    int var25 = (52736 - arg5 * 512) * 4 + arg1 * 4 + 24624;
                    if (var17 > 0L) {
                        var24 = 15597568;
                    }
                    if (var19 == 0 || var19 == 2) {
                        var23[var25 + 1536] = var24;
                        var23[var25 + 1 + 1024] = var24;
                        var23[var25 + 2 + 512] = var24;
                        var23[var25 + 3] = var24;
                    } else {
                        var23[var25] = var24;
                        var23[var25 + 513] = var24;
                        var23[var25 + 1026] = var24;
                        var23[var25 + 1539] = var24;
                    }
                }
            } else if (!class72.method494(arg0, var22, 93, arg7, var19, arg1, arg5)) {
                return false;
            }
        }
        long var26 = class87.method600(arg4, arg1 + arg0, arg5 - -arg7);
        if (var26 != 0L) {
            int var28 = ((int) var26 & 0x3F8BE7) >> 20;
            int var29 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            class181 var30 = class25.method224(var29, 0);
            if (var30.field2860 != -1 && !class72.method494(arg0, var30, 106, arg7, var28, arg1, arg5)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZZZZI)Ldl;")
    public static final class123 method801(boolean arg0, boolean arg1, boolean arg2, boolean arg3, int arg4) {
        field1791++;
        class237 var5 = null;
        if (class184.field2890 != null) {
            var5 = new class237(arg4, class184.field2890, class186.field2919[arg4], 1000000);
        }
        if (arg3) {
            field1769 = 8;
        }
        class175.field2742[arg4] = class50.field656.method1633(arg4, (byte) -85, class266.field4272, var5);
        if (arg0) {
            class175.field2742[arg4].method799((byte) 53);
        }
        return new class123(class175.field2742[arg4], arg2, arg1);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(BI)V")
    public final void method326(byte arg0, int arg1) {
        field1781++;
        if (this.field1795 == null) {
            return;
        }
        if (arg0 >= -5) {
            method796(-28);
        }
        for (class120 var3 = this.field1798.method350(8240); var3 != null; var3 = this.field1798.method353((byte) -127)) {
            if (((long) arg1) == var3.field1750) {
                return;
            }
        }
        class120 var4 = new class120();
        var4.field1750 = (long) arg1;
        this.field1798.method349(var4, true);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)I")
    public final int method322(byte arg0, int arg1) {
        class62 var3 = (class62) this.field1779.method665((byte) -66, (long) arg1);
        field1772++;
        if (arg0 >= -110) {
            field1769 = -39;
        }
        return var3 == null ? 0 : var3.method434((byte) -104);
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
    public final void method802(int arg0) {
        field1784++;
        if (this.field1796 != null) {
            if (this.method320(arg0 + 15400) == null) {
                return;
            }
            if (this.field1801) {
                boolean var6 = true;
                for (class120 var7 = this.field1796.method350(8240); var7 != null; var7 = this.field1796.method353((byte) -123)) {
                    int var9 = (int) var7.field1750;
                    if (this.field1768[var9] == 0) {
                        this.method795(var9, 1, (byte) -1);
                    }
                    if (this.field1768[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method784(false);
                    }
                }
                while (this.field1789.field3155.length > this.field1800) {
                    if (this.field1789.field3155[this.field1800] == 0) {
                        this.field1800++;
                    } else {
                        if (this.field1780.field940 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field1768[this.field1800] == 0) {
                            this.method795(this.field1800, 1, (byte) -1);
                        }
                        if (this.field1768[this.field1800] == 0) {
                            var6 = false;
                            class120 var8 = new class120();
                            var8.field1750 = (long) this.field1800;
                            this.field1796.method349(var8, true);
                        }
                        this.field1800++;
                    }
                }
                if (var6) {
                    this.field1801 = false;
                    this.field1800 = 0;
                }
            } else if (this.field1799) {
                boolean var2 = true;
                for (class120 var3 = this.field1796.method350(8240); var3 != null; var3 = this.field1796.method353((byte) -127)) {
                    int var5 = (int) var3.field1750;
                    if (this.field1768[var5] != 1) {
                        this.method795(var5, 2, (byte) -1);
                    }
                    if (this.field1768[var5] == 1) {
                        var3.method784(false);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field1789.field3155.length > this.field1800) {
                    if (this.field1789.field3155[this.field1800] == 0) {
                        this.field1800++;
                    } else {
                        if (this.field1785.method1552((byte) 61)) {
                            var2 = false;
                            break;
                        }
                        if (this.field1768[this.field1800] != 1) {
                            this.method795(this.field1800, 2, (byte) -1);
                        }
                        if (this.field1768[this.field1800] != 1) {
                            var2 = false;
                            class120 var4 = new class120();
                            var4.field1750 = (long) this.field1800;
                            this.field1796.method349(var4, true);
                        }
                        this.field1800++;
                    }
                }
                if (var2) {
                    this.field1800 = 0;
                    this.field1799 = false;
                }
            } else {
                this.field1796 = null;
            }
        }
        if (arg0 != -15274) {
            method796(8);
        }
        if (!this.field1802 || class260.method1785((byte) -115) < this.field1803) {
            return;
        }
        for (class62 var10 = (class62) this.field1779.method671(0); var10 != null; var10 = (class62) this.field1779.method666(-127)) {
            if (!var10.field854) {
                if (var10.field850) {
                    if (!var10.field857) {
                        throw new RuntimeException();
                    }
                    var10.method784(false);
                } else {
                    var10.field850 = true;
                }
            }
        }
        this.field1803 = class260.method1785((byte) -117) + 1000L;
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(B)I")
    public final int method803(byte arg0) {
        if (arg0 != 104) {
            this.method326((byte) 51, 106);
        }
        field1776++;
        return this.field1789 == null ? 0 : this.field1789.field3147;
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(B)I")
    public final int method804(byte arg0) {
        field1774++;
        return arg0 == -68 ? this.field1771 : 121;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)Lqh;")
    public final class201 method320(int arg0) {
        field1793++;
        if (this.field1789 != null) {
            return this.field1789;
        }
        if (this.field1794 == null) {
            if (this.field1785.method1557((byte) 93)) {
                return null;
            }
            this.field1794 = this.field1785.method1558(255, this.field1778, true, -21, (byte) 0);
        }
        if (this.field1794.field854) {
            return null;
        }
        byte[] var2 = this.field1794.method432(24977);
        if (this.field1794 instanceof class175) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field1789 = new class201(var2, this.field1792);
                if (this.field1789.field3157 != this.field1790) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var4) {
                this.field1789 = null;
                if (this.field1785.method1557((byte) 93)) {
                    this.field1794 = null;
                } else {
                    this.field1794 = this.field1785.method1558(255, this.field1778, true, -21, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field1789 = new class201(var2, this.field1792);
            } catch (RuntimeException var5) {
                this.field1785.method1556((byte) 122);
                this.field1789 = null;
                if (this.field1785.method1557((byte) 93)) {
                    this.field1794 = null;
                } else {
                    this.field1794 = this.field1785.method1558(255, this.field1778, true, -21, (byte) 0);
                }
                return null;
            }
            if (this.field1787 != null) {
                this.field1780.method459(var2, this.field1778, 2, this.field1787);
            }
        }
        this.field1794 = null;
        if (this.field1795 != null) {
            this.field1768 = new byte[this.field1789.field3135];
            this.field1771 = 0;
        }
        int var3 = 90 % ((-arg0 - 30) / 47);
        return this.field1789;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(ILd;Ld;Lrg;Lrc;IIZ)V")
    public class122(int arg0, class237 arg1, class237 arg2, class227 arg3, class67 arg4, int arg5, int arg6, boolean arg7) {
        this.field1778 = arg0;
        this.field1795 = arg1;
        if (this.field1795 == null) {
            this.field1801 = false;
        } else {
            this.field1801 = true;
            this.field1796 = new class46();
        }
        this.field1787 = arg2;
        this.field1780 = arg4;
        this.field1785 = arg3;
        this.field1802 = arg7;
        this.field1790 = arg6;
        this.field1792 = arg5;
        if (this.field1787 != null) {
            this.field1794 = this.field1780.method453(this.field1787, this.field1778, 10);
        }
    }
}
