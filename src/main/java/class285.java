import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class285 {

    @OriginalMember(owner = "client!wo", name = "S", descriptor = "Lop;")
    private class258 field3761 = null;

    @OriginalMember(owner = "client!wo", name = "Q", descriptor = "I")
    public int field3759;

    @OriginalMember(owner = "client!wo", name = "G", descriptor = "Z")
    private boolean field3749;

    @OriginalMember(owner = "client!wo", name = "M", descriptor = "Lec;")
    private class94 field3755;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "J")
    public static long field3729 = 0L;

    @OriginalMember(owner = "client!wo", name = "D", descriptor = "I")
    public static int field3746 = 0;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!wo", name = "v", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!wo", name = "w", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!wo", name = "x", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!wo", name = "y", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!wo", name = "z", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!wo", name = "A", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!wo", name = "B", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!wo", name = "C", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!wo", name = "E", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!wo", name = "H", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!wo", name = "I", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!wo", name = "J", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!wo", name = "K", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!wo", name = "L", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!wo", name = "N", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!wo", name = "O", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!wo", name = "P", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!wo", name = "R", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "[Ljava/lang/Object;")
    private Object[] field3719;

    @OriginalMember(owner = "client!wo", name = "F", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field3748;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method1790(String arg0, int arg1) {
        field3733++;
        if (!this.method1820(100)) {
            return 0;
        }
        if (arg1 != 0) {
            this.method1816(true);
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field3761.field3320.method2459((byte) 35, class116.method677(var3, (byte) -99));
        return this.method1811(var4, false);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
    public final void method1791(int arg0) {
        field3737++;
        if (this.field3719 != null) {
            for (int var2 = 0; var2 < this.field3719.length; var2++) {
                this.field3719[var2] = null;
            }
        }
        if (arg0 != 0) {
            this.method1791(-35);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "([IIII)[B")
    public final byte[] method1792(int[] arg0, int arg1, int arg2, int arg3) {
        field3747++;
        if (!this.method1809(arg2, 6449, arg1)) {
            return null;
        }
        if (this.field3748[arg2] == null || this.field3748[arg2][arg1] == null) {
            boolean var5 = this.method1819(arg0, arg1, arg2, arg3 ^ 0x45E4);
            if (!var5) {
                this.method1795(arg2, -85);
                boolean var6 = this.method1819(arg0, arg1, arg2, 25301);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg3 != 10033) {
            this.method1806((byte) -92, (String) null);
        }
        byte[] var7 = class217.method1319(false, this.field3748[arg2][arg1], (byte) 127);
        if (this.field3759 == 1) {
            this.field3748[arg2][arg1] = null;
            if (this.field3761.field3337[arg2] == 1) {
                this.field3748[arg2] = null;
            }
        } else if (this.field3759 == 2) {
            this.field3748[arg2] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)I")
    public final int method1793(int arg0) {
        if (arg0 != 0) {
            field3729 = -71L;
        }
        field3724++;
        return this.method1820(100) ? this.field3761.field3337.length : -1;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)[B")
    public final byte[] method1794(int arg0, int arg1, int arg2) {
        if (arg0 != 5860) {
            this.method1791(-88);
        }
        field3723++;
        return this.method1792((int[]) null, arg2, arg1, arg0 + 4173);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)V")
    private final void method1795(int arg0, int arg1) {
        field3718++;
        int var3 = 97 / ((71 - arg1) / 45);
        if (this.field3749) {
            this.field3719[arg0] = this.field3755.method592(arg0, 98);
        } else {
            this.field3719[arg0] = class439.method2684(false, -121, this.field3755.method592(arg0, 116));
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method1796(byte arg0, String arg1) {
        field3738++;
        if (!this.method1820(100)) {
            return;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field3761.field3320.method2459((byte) 35, class116.method677(var3, (byte) -114));
        if (arg0 <= -18) {
            this.method1822(var4, 144);
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(II)Z")
    public final boolean method1797(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method1818((byte) -44, (String) null);
        }
        field3739++;
        if (!this.method1820(100)) {
            return false;
        } else if (this.field3761.field3337.length == 1) {
            return this.method1803(true, arg1, 0);
        } else if (!this.method1812(true, arg1)) {
            return false;
        } else if (this.field3761.field3337[arg1] == 1) {
            return this.method1803(true, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
    public final boolean method1798(String arg0, byte arg1, String arg2) {
        field3734++;
        if (!this.method1820(100)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field3761.field3320.method2459((byte) 35, class116.method677(var4, (byte) -91));
        if (!this.method1812(true, var6)) {
            return false;
        }
        int var7 = this.field3761.field3328[var6].method2459((byte) 35, class116.method677(var5, (byte) -103));
        if (arg1 != 86) {
            this.field3748 = null;
        }
        return this.method1803(true, var7, var6);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZZB)V")
    public final void method1799(boolean arg0, boolean arg1, byte arg2) {
        field3731++;
        if (!this.method1820(100)) {
            return;
        }
        if (arg0) {
            this.field3761.field3334 = null;
            this.field3761.field3328 = null;
        }
        if (arg1) {
            this.field3761.field3329 = null;
            this.field3761.field3320 = null;
        }
        if (arg2 < 95) {
            this.method1803(true, -100, -40);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)[B")
    public final byte[] method1800(String arg0, String arg1, boolean arg2) {
        field3757++;
        if (!this.method1820(100)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field3761.field3320.method2459((byte) 35, class116.method677(var4, (byte) -104));
        if (this.method1812(arg2, var6)) {
            int var7 = this.field3761.field3328[var6].method2459((byte) 35, class116.method677(var5, (byte) -112));
            return this.method1794(5860, var6, var7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method1801(int arg0, String arg1) {
        field3717++;
        if (!this.method1820(100)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field3761.field3320.method2459((byte) 35, class116.method677(var3, (byte) -104));
        if (var4 < 0) {
            return false;
        } else {
            return arg0 == 30441;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V")
    public final void method1802(byte arg0) {
        if (this.field3748 != null) {
            for (int var2 = 0; var2 < this.field3748.length; var2++) {
                this.field3748[var2] = null;
            }
        }
        int var3 = 105 % ((-arg0 - 43) / 57);
        field3720++;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZII)Z")
    public final boolean method1803(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.method1819((int[]) null, -91, 90, -11);
        }
        field3752++;
        if (!this.method1809(arg2, 6449, arg1)) {
            return false;
        } else if (this.field3748[arg2] != null && this.field3748[arg2][arg1] != null) {
            return true;
        } else if (this.field3719[arg2] == null) {
            this.method1795(arg2, 118);
            return this.field3719[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)Z")
    public final boolean method1804(int arg0) {
        field3745++;
        if (!this.method1820(100)) {
            return false;
        }
        boolean var2 = true;
        int var3 = -12 / ((-arg0 - 62) / 41);
        for (int var4 = 0; var4 < this.field3761.field3336.length; var4++) {
            int var5 = this.field3761.field3336[var4];
            if (this.field3719[var5] == null) {
                this.method1795(var5, 5);
                if (this.field3719[var5] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZ)[B")
    public final byte[] method1805(int arg0, boolean arg1) {
        field3727++;
        if (!arg1) {
            this.method1822(-23, 116);
        }
        if (!this.method1820(100)) {
            return null;
        } else if (this.field3761.field3337.length == 1) {
            return this.method1794(5860, 0, arg0);
        } else if (!this.method1812(arg1, arg0)) {
            return null;
        } else if (this.field3761.field3337[arg0] == 1) {
            return this.method1794(5860, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(BLjava/lang/String;)I")
    public final int method1806(byte arg0, String arg1) {
        field3753++;
        if (!this.method1820(100)) {
            return -1;
        } else if (arg0 >= -89) {
            return 0;
        } else {
            String var3 = arg1.toLowerCase();
            int var4 = this.field3761.field3320.method2459((byte) 35, class116.method677(var3, (byte) -119));
            return this.method1812(true, var4) ? var4 : -1;
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(III)V")
    public static final void method1807(int arg0, int arg1, int arg2) {
        class139.field1598++;
        field3741++;
        class427.field5837.method2162(false, 82);
        if (arg1 <= 84) {
            method1814((byte) 53);
        }
        class427.field5837.method1592(arg2, (byte) 18);
        class427.field5837.method1558((byte) 32, arg0);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)I")
    public static final int method1808(boolean arg0) {
        if (!arg0) {
            method1807(-62, -125, 47);
        }
        field3756++;
        return 15;
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(III)Z")
    private final boolean method1809(int arg0, int arg1, int arg2) {
        field3744++;
        if (arg1 != 6449) {
            this.method1800((String) null, (String) null, true);
        }
        if (!this.method1820(arg1 ^ 0x1955)) {
            return false;
        } else if (arg0 >= 0 && arg2 >= 0 && this.field3761.field3337.length > arg0 && this.field3761.field3337[arg0] > arg2) {
            return true;
        } else if (class340.field4644) {
            throw new IllegalArgumentException(arg0 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(II)[I")
    public final int[] method1810(int arg0, int arg1) {
        if (arg0 < 60) {
            return null;
        }
        field3743++;
        if (!this.method1812(true, arg1)) {
            return null;
        }
        int[] var3 = this.field3761.field3321[arg1];
        if (var3 == null) {
            var3 = new int[this.field3761.field3331[arg1]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(IZ)I")
    private final int method1811(int arg0, boolean arg1) {
        field3721++;
        if (arg1) {
            this.field3748 = null;
        }
        if (this.method1812(true, arg0)) {
            return this.field3719[arg0] == null ? this.field3755.method584(arg0, arg1) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZI)Z")
    private final boolean method1812(boolean arg0, int arg1) {
        field3735++;
        if (!this.method1820(100)) {
            return false;
        } else if (arg1 >= 0 && this.field3761.field3337.length > arg1 && this.field3761.field3337[arg1] != 0) {
            if (!arg0) {
                this.method1797(125, -92);
            }
            return true;
        } else if (class340.field4644) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "(II)Z")
    public final boolean method1813(int arg0, int arg1) {
        field3751++;
        if (!this.method1812(true, arg1)) {
            return false;
        } else if (this.field3719[arg1] == null) {
            this.method1795(arg1, 120);
            if (this.field3719[arg1] == null) {
                if (arg0 != 0) {
                    this.method1813(34, -43);
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)V")
    public static final void method1814(byte arg0) {
        int var1 = 49 % (arg0 / 47);
        for (int var2 = 0; var2 < class420.field5754; var2++) {
            int var10002 = class30.field329[var2]--;
            if (class30.field329[var2] >= -10) {
                class417 var4 = class92.field1074[var2];
                if (var4 == null) {
                    var4 = class417.method2566(class349.field4759, class107.field1286[var2], 0);
                    if (var4 == null) {
                        continue;
                    }
                    class30.field329[var2] += var4.method2567();
                    class92.field1074[var2] = var4;
                }
                if (class30.field329[var2] < 0) {
                    int var5;
                    if (class186.field2158[var2] == 0) {
                        var5 = class330.field4504[var2] * class96.field1136 >> 8;
                    } else {
                        int var6 = (class186.field2158[var2] & 0xFF) * 128;
                        int var7 = (class186.field2158[var2] & 0xFFF73A) >> 16;
                        int var8 = var7 * 128 + 64 - class143.field1684.field1516;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = (class186.field2158[var2] & 0xFF6F) >> 8;
                        int var10 = var9 * 128 + 64 - class143.field1684.field1514;
                        if (var10 < 0) {
                            var10 = -var10;
                        }
                        int var11 = var8 + var10 - 128;
                        if (var6 < var11) {
                            class30.field329[var2] = -100;
                            continue;
                        }
                        if (var11 < 0) {
                            var11 = 0;
                        }
                        var5 = class330.field4504[var2] * class330.field4500 * (var6 - var11) / var6 >> 8;
                    }
                    if (var5 > 0) {
                        class159 var12 = var4.method2565().method1017(class265.field3418);
                        class77 var13 = class77.method496(var12, 100, var5);
                        var13.method488(class195.field2317[var2] - 1);
                        class352.field4781.method1869(var13);
                    }
                    class30.field329[var2] = -100;
                }
            } else {
                class420.field5754--;
                for (int var3 = var2; var3 < class420.field5754; var3++) {
                    class107.field1286[var3] = class107.field1286[var3 + 1];
                    class92.field1074[var3] = class92.field1074[var3 + 1];
                    class195.field2317[var3] = class195.field2317[var3 + 1];
                    class30.field329[var3] = class30.field329[var3 + 1];
                    class186.field2158[var3] = class186.field2158[var3 + 1];
                    class330.field4504[var3] = class330.field4504[var3 + 1];
                }
                var2--;
            }
        }
        field3750++;
        if (class344.field4679 && !class384.method2395(true)) {
            if (class162.field1895 != 0 && class346.field4702 != -1) {
                class150.method967(false, -3063, 0, class346.field4702, class150.field1738, class162.field1895);
            }
            class344.field4679 = false;
        } else if (class162.field1895 != 0 && class346.field4702 != -1 && !class384.method2395(true)) {
            class14.field172++;
            class427.field5837.method2162(false, 144);
            class427.field5837.method1560(-26356, class346.field4702);
            class346.field4702 = -1;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(BI)V")
    public final void method1815(byte arg0, int arg1) {
        field3730++;
        int var3 = 66 / ((-arg0 - 38) / 55);
        if (this.method1812(true, arg1) && this.field3748 != null) {
            this.field3748[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(Z)I")
    public final int method1816(boolean arg0) {
        field3725++;
        if (!this.method1820(100)) {
            throw new IllegalStateException("");
        }
        if (arg0) {
            field3726 = 60;
        }
        return this.field3761.field3333;
    }

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "(II)I")
    public final int method1817(int arg0, int arg1) {
        field3728++;
        if (this.method1820(100)) {
            int var3 = 86 / ((55 - arg0) / 62);
            int var4 = this.field3761.field3320.method2459((byte) 35, arg1);
            return this.method1812(true, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method1818(byte arg0, String arg1) {
        field3732++;
        if (!this.method1820(100)) {
            return false;
        }
        if (arg0 <= 15) {
            this.method1798((String) null, (byte) 84, (String) null);
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field3761.field3320.method2459((byte) 35, class116.method677(var3, (byte) -120));
        return this.method1813(0, var4);
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "([IIII)Z")
    private final boolean method1819(int[] arg0, int arg1, int arg2, int arg3) {
        field3740++;
        if (!this.method1812(true, arg2)) {
            return false;
        } else if (this.field3719[arg2] == null) {
            return false;
        } else {
            int var5 = this.field3761.field3331[arg2];
            int[] var6 = this.field3761.field3321[arg2];
            if (this.field3748[arg2] == null) {
                this.field3748[arg2] = new Object[this.field3761.field3337[arg2]];
            }
            Object[] var7 = this.field3748[arg2];
            if (arg3 != 25301) {
                return true;
            }
            boolean var8 = true;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg0 != null && (arg0[0] != 0 || arg0[1] != 0 || arg0[2] != 0 || arg0[3] != 0)) {
                var11 = class217.method1319(true, this.field3719[arg2], (byte) 120);
                class242 var12 = new class242(var11);
                var12.method1552(arg0, arg3 - 16417, 5, var12.field3188.length);
            } else {
                var11 = class217.method1319(false, this.field3719[arg2], (byte) 127);
            }
            byte[] var13;
            try {
                var13 = class97.method601(var11, arg3 ^ 0xFFFF9D2B);
            } catch (RuntimeException var49) {
                throw class3.method15(var49, "T3 - " + (arg0 != null) + "," + arg2 + "," + var11.length + "," + class106.method637(var11, var11.length, 102) + "," + class106.method637(var11, var11.length - 2, arg3 + -25377) + "," + this.field3761.field3330[arg2] + "," + this.field3761.field3333);
            }
            if (this.field3749) {
                this.field3719[arg2] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field3759 == 0) {
                    var7[var15] = class439.method2684(false, -35, var13);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field3759 == 2) {
                int var32 = var13.length;
                int var51 = var32 - 1;
                int var33 = var13[var51] & 0xFF;
                int var34 = var51 - var33 * 4 * var5;
                class242 var35 = new class242(var13);
                int var36 = 0;
                int var37 = 0;
                var35.field3211 = var34;
                for (int var38 = 0; var38 < var33; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var35.method1576((byte) 122);
                        int var41;
                        if (var6 == null) {
                            var41 = var40;
                        } else {
                            var41 = var6[var40];
                        }
                        if (arg1 == var41) {
                            var37 = var41;
                            var36 += var39;
                        }
                    }
                }
                if (var36 == 0) {
                    return true;
                }
                byte[] var42 = new byte[var36];
                int var43 = 0;
                var35.field3211 = var34;
                int var44 = 0;
                for (int var45 = 0; var45 < var33; var45++) {
                    int var46 = 0;
                    for (int var47 = 0; var47 < var5; var47++) {
                        var46 += var35.method1576((byte) 125);
                        int var48;
                        if (var6 == null) {
                            var48 = var47;
                        } else {
                            var48 = var6[var47];
                        }
                        if (arg1 == var48) {
                            class114.method667(var13, var44, var42, var43, var46);
                            var43 += var46;
                        }
                        var44 += var46;
                    }
                }
                var7[var37] = var42;
            } else {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var5 * var17 * 4;
                class242 var19 = new class242(var13);
                var19.field3211 = var18;
                int[] var20 = new int[var5];
                for (int var21 = 0; var21 < var17; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var19.method1576((byte) 124);
                        var20[var23] += var22;
                    }
                }
                byte[][] var24 = new byte[var5][];
                for (int var25 = 0; var25 < var5; var25++) {
                    var24[var25] = new byte[var20[var25]];
                    var20[var25] = 0;
                }
                var19.field3211 = var18;
                int var26 = 0;
                for (int var27 = 0; var27 < var17; var27++) {
                    int var28 = 0;
                    for (int var29 = 0; var29 < var5; var29++) {
                        var28 += var19.method1576((byte) 125);
                        class114.method667(var13, var26, var24[var29], var20[var29], var28);
                        var20[var29] += var28;
                        var26 += var28;
                    }
                }
                for (int var30 = 0; var30 < var5; var30++) {
                    int var31;
                    if (var6 == null) {
                        var31 = var30;
                    } else {
                        var31 = var6[var30];
                    }
                    if (this.field3759 == 0) {
                        var7[var31] = class439.method2684(false, -50, var24[var30]);
                    } else {
                        var7[var31] = var24[var30];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "(I)Z")
    private final boolean method1820(int arg0) {
        field3758++;
        if (this.field3761 == null) {
            this.field3761 = this.field3755.method583(10314);
            if (this.field3761 == null) {
                return false;
            }
            this.field3719 = new Object[this.field3761.field3335];
            this.field3748 = new Object[this.field3761.field3335][];
        }
        return arg0 == 100;
    }

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "(II)I")
    public final int method1821(int arg0, int arg1) {
        field3754++;
        int var3 = -127 % ((arg0 + 37) / 63);
        return this.method1812(true, arg1) ? this.field3761.field3337[arg1] : 0;
    }

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "(II)V")
    private final void method1822(int arg0, int arg1) {
        field3760++;
        this.field3755.method585((byte) 122, arg0);
        if (arg1 != 144) {
            this.method1794(15, 107, -126);
        }
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(B)I")
    public final int method1823(byte arg0) {
        field3736++;
        if (!this.method1820(100)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3719.length; var4++) {
            if (this.field3761.field3331[var4] > 0) {
                var2 += 100;
                var3 += this.method1811(var4, false);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            if (arg0 >= -89) {
                field3746 = -126;
            }
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lec;ZI)V")
    public class285(class94 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field3759 = arg2;
        this.field3749 = arg1;
        this.field3755 = arg0;
    }

    static {
        new class72("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
    }
}
