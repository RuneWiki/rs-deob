import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class118 extends class454 {

    @OriginalMember(owner = "client!iaa", name = "I", descriptor = "Z")
    public boolean field2008 = true;

    @OriginalMember(owner = "client!iaa", name = "A", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!iaa", name = "B", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!iaa", name = "C", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!iaa", name = "D", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!iaa", name = "E", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!iaa", name = "F", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!iaa", name = "G", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!iaa", name = "H", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!iaa", name = "J", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!iaa", name = "M", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!iaa", name = "O", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!iaa", name = "P", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!iaa", name = "Q", descriptor = "Ljp;")
    public class402 field2016;

    @OriginalMember(owner = "client!iaa", name = "K", descriptor = "[I")
    private int[] field2010;

    @OriginalMember(owner = "client!iaa", name = "N", descriptor = "[I")
    public int[] field2013;

    @OriginalMember(owner = "client!iaa", name = "R", descriptor = "[Ljava/lang/String;")
    private String[] field2017;

    @OriginalMember(owner = "client!iaa", name = "L", descriptor = "[[I")
    private int[][] field2011;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Z)I", line = 5)
    public final int method1035(boolean arg0) {
        field2001++;
        if (arg0) {
            return 52;
        } else if (this.field2010 == null) {
            return 0;
        } else {
            return this.field2010.length;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)Ljava/lang/String;", line = 19)
    public final String method1036(int arg0) {
        field2015++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field2017 == null) {
            return "";
        }
        var2.append(this.field2017[0]);
        int var3 = 1;
        if (arg0 != -1) {
            this.method1035(true);
        }
        while (var3 < this.field2017.length) {
            var2.append("...");
            var2.append(this.field2017[var3]);
            var3++;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "([IBLol;)V", line = 46)
    public final void method1037(int[] arg0, byte arg1, class431 arg2) {
        field2005++;
        if (this.field2010 == null) {
            return;
        }
        int var4 = 0;
        if (arg1 != 110) {
            this.field2011 = null;
        }
        while (var4 < this.field2010.length) {
            if (var4 >= arg0.length) {
                return;
            }
            int var5 = this.method1038(var4, -25256).field2438;
            if (var5 > 0) {
                arg2.method2536(var5, 104, (long) arg0[var4]);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(II)Lhk;", line = 78)
    public final class153 method1038(int arg0, int arg1) {
        field2000++;
        if (arg1 != -25256) {
            method1044(null, true, null, 81, (byte) -5);
        }
        return this.field2010 == null || arg0 < 0 || this.field2010.length < arg0 ? null : class505.method2955(this.field2010[arg0], 16);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(BLol;)V", line = 95)
    public final void method1039(byte arg0, class431 arg1) {
        field2007++;
        int var3 = 108 % ((arg0 - 23) / 54);
        while (true) {
            int var4 = arg1.method2557(14929);
            if (var4 == 0) {
                return;
            }
            this.method1045(arg1, var4, -105);
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(III)I", line = 115)
    public final int method1040(int arg0, int arg1, int arg2) {
        int var4 = -38 % ((arg2 + 50) / 41);
        field2014++;
        if (this.field2010 == null || arg0 < 0 || arg0 > this.field2010.length) {
            return -1;
        } else if (this.field2011[arg0] == null || arg1 < 0 || this.field2011[arg0].length < arg1) {
            return -1;
        } else {
            return this.field2011[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 133)
    public static final void method1041(int arg0, String arg1, int arg2) {
        if (arg0 != 27961) {
            method1041(-59, null, -37);
        }
        field2012++;
        int var3 = class469.field6382;
        int[] var4 = class464.field6311;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class21 var7 = class588.field8451[var4[var6]];
            if (var7 != null && class719.field10041 != var7 && var7.field212 != null && var7.field212.equalsIgnoreCase(arg1)) {
                var5 = true;
                if (arg2 == 1) {
                    class754.field10484++;
                    class302 var8 = class582.method3419(class387.field5418, (byte) 127, class626.field8901);
                    var8.field4341.method2524(false, 0);
                    var8.field4341.method2572(var4[var6], (byte) 105);
                    class501.method2928(0, var8);
                } else if (arg2 == 4) {
                    class281.field4041++;
                    class302 var9 = class582.method3419(class414.field5676, (byte) 126, class626.field8901);
                    var9.field4341.method2543(127, 0);
                    var9.field4341.method2572(var4[var6], (byte) 98);
                    class501.method2928(0, var9);
                } else if (arg2 == 5) {
                    class590.field8474++;
                    class302 var13 = class582.method3419(class102.field1501, (byte) 126, class626.field8901);
                    var13.field4341.method2572(var4[var6], (byte) 127);
                    var13.field4341.method2543(-120, 0);
                    class501.method2928(arg0 ^ 0x6D39, var13);
                } else if (arg2 == 6) {
                    class110.field1558++;
                    class302 var12 = class582.method3419(class68.field1083, (byte) 126, class626.field8901);
                    var12.field4341.method2546(true, var4[var6]);
                    var12.field4341.method2524(false, 0);
                    class501.method2928(0, var12);
                } else if (arg2 == 7) {
                    class409.field5608++;
                    class302 var11 = class582.method3419(class300.field4326, (byte) 127, class626.field8901);
                    var11.field4341.method2562(arg0 ^ 0x6D39, 0);
                    var11.field4341.method2559(var4[var6], 118);
                    class501.method2928(arg0 ^ 0x6D39, var11);
                } else if (arg2 == 9) {
                    class302 var10 = class582.method3419(class369.field5215, (byte) 125, class626.field8901);
                    var10.field4341.method2572(var4[var6], (byte) 111);
                    var10.field4341.method2579(false, 0);
                    class501.method2928(0, var10);
                }
                break;
            }
        }
        if (!var5) {
            class446.method2645(class563.field7819.method3281(class423.field5892, -1) + arg1, arg0 - 27961, 4);
        }
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(BLol;)Ljava/lang/String;", line = 244)
    public final String method1042(byte arg0, class431 arg1) {
        field2004++;
        StringBuffer var3 = new StringBuffer(80);
        if (arg0 != 112) {
            this.method1035(false);
        }
        if (this.field2010 != null) {
            for (int var4 = 0; var4 < this.field2010.length; var4++) {
                var3.append(this.field2017[var4]);
                var3.append(this.field2016.method2390(this.method1038(var4, -25256), this.field2011[var4], arg1.method2556(11645, class505.method2955(this.field2010[var4], 16).field2445), true));
            }
        }
        var3.append(this.field2017[this.field2017.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B)V", line = 275)
    public final void method1043(byte arg0) {
        if (arg0 != -17) {
            return;
        }
        field2006++;
        if (this.field2013 != null) {
            for (int var2 = 0; var2 < this.field2013.length; var2++) {
                this.field2013[var2] = class694.method3895(this.field2013[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lnfa;Z[[[BIB)Z", line = 297)
    public static final boolean method1044(class745 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class721.field10072) {
            return false;
        }
        int var5 = arg0.field10347 >> class679.field9600;
        int var6 = var5;
        int var7 = arg0.field10350 >> class679.field9600;
        int var8 = var7;
        if (arg0 instanceof class208) {
            var6 = ((class208) arg0).field3030;
            var8 = ((class208) arg0).field3038;
            var5 = ((class208) arg0).field3027;
            var7 = ((class208) arg0).field3035;
        }
        for (int var9 = var5; var9 <= var6; var9++) {
            for (int var10 = var7; var10 <= var8; var10++) {
                if (arg0.field10349 < class169.field2565 && var9 >= class483.field6677 && var9 < class163.field2503 && var10 >= class62.field946 && var10 < class350.field4965) {
                    if ((arg2 == null || arg0.field10361 < arg3 || arg2[arg0.field10361][var9][var10] != arg4) && arg0.method1429((byte) 124) && !arg0.method1428((byte) -97, class29.field307)) {
                        return false;
                    }
                    if (!arg1 && var9 >= class277.field3995 - 16 && var9 <= class277.field3995 + 16 && var10 >= class3.field47 - 16 && var10 <= class3.field47 + 16) {
                        if (class494.field6789) {
                            class604.field8584[class621.field8764++].method3147(true, arg0);
                            class621.field8764 %= class402.field5541;
                        } else {
                            arg0.method192(100, class29.field307);
                        }
                    }
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lol;II)V", line = 362)
    private final void method1045(class431 arg0, int arg1, int arg2) {
        if (arg2 > -93) {
            this.method1043((byte) 50);
        }
        field2009++;
        if (arg1 == 1) {
            this.field2017 = class544.method3151((byte) -35, '<', arg0.method2532((byte) -120));
        } else if (arg1 == 2) {
            int var4 = arg0.method2557(14929);
            this.field2013 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2013[var5] = arg0.method2565((byte) -86);
            }
            return;
        } else if (arg1 == 3) {
            int var6 = arg0.method2557(14929);
            this.field2010 = new int[var6];
            this.field2011 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method2565((byte) -103);
                class153 var9 = class505.method2955(var8, 16);
                if (var9 != null) {
                    this.field2010[var7] = var8;
                    this.field2011[var7] = new int[var9.field2448];
                    for (int var10 = 0; var10 < var9.field2448; var10++) {
                        this.field2011[var7][var10] = arg0.method2565((byte) -119);
                    }
                }
            }
            return;
        } else if (arg1 == 4) {
            this.field2008 = false;
            return;
        }
    }
}
