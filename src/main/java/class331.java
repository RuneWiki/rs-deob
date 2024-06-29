import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class331 {

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
    private int field4784 = -1;

    @OriginalMember(owner = "client!fs", name = "v", descriptor = "Z")
    private boolean field4793 = true;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
    private int field4778;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "[Lcr;")
    private class344[] field4787;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    private int field4772;

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
    private int field4782;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    private int field4777;

    @OriginalMember(owner = "client!fs", name = "t", descriptor = "[Lcr;")
    private class344[] field4791;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "Lcr;")
    private class344 field4786;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
    private int field4789;

    @OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!fs", name = "u", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!fs", name = "y", descriptor = "I")
    private int field4796;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "Ltj;")
    public static class108 field4779;

    @OriginalMember(owner = "client!fs", name = "w", descriptor = "Ltj;")
    public static class108 field4794;

    @OriginalMember(owner = "client!fs", name = "x", descriptor = "Ltj;")
    public static class108 field4795;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "Lvj;")
    private class256 field4780;

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "[I")
    public static int[] field4788;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILvq;Z)Z", line = 4)
    public final boolean method2166(int arg0, class269 arg1, boolean arg2) {
        field4785++;
        if (this.field4784 != arg0) {
            this.field4784 = arg0;
            int var4 = class258.method1787(-115, arg0);
            if (var4 > arg0) {
                var4 = class434.method2709(arg0, (byte) 105);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field4789 != var4) {
                this.field4789 = var4;
                this.field4780 = null;
            }
            if (this.field4787 != null) {
                this.field4796 = 0;
                int[] var5 = new int[this.field4787.length];
                for (int var6 = 0; var6 < this.field4787.length; var6++) {
                    class344 var7 = this.field4787[var6];
                    if (var7.method2255(this.field4782, this.field4772, this.field4777, this.field4784)) {
                        var5[this.field4796] = var7.field4980;
                        this.field4791[this.field4796++] = var7;
                    }
                }
                class349.method2286(var5, 0, this.field4791, this.field4796 - 1, (byte) 116);
            }
            this.field4793 = true;
        }
        boolean var8 = arg2;
        if (this.field4793) {
            this.field4793 = false;
            for (int var9 = this.field4796 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field4791[var9].method2256(arg1, this.field4786);
                var8 |= var10;
                this.field4793 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BI)V", line = 80)
    public static final void method2167(byte arg0, int arg1) {
        class390.field5488 = 1000 / arg1;
        field4773++;
        if (arg0 != -103) {
            method2171(-4);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V", line = 100)
    public static final void method2168(int arg0) {
        field4792++;
        int var1 = class120.field1620 * 128 + 64;
        int var2 = class96.field1234 * 128 + 64;
        int var3 = class452.method2820(class158.field2302, var2, false, var1) - class215.field3081;
        if (class158.field2308 >= 100) {
            class386.field5469 = class120.field1620 * 128 + 64;
            class417.field5999 = class96.field1234 * 128 + 64;
            class249.field3707 = class452.method2820(class158.field2302, class417.field5999, false, class386.field5469) - class215.field3081;
        } else {
            if (class386.field5469 < var1) {
                class386.field5469 += class137.field2114 + ((var1 - class386.field5469) * class158.field2308 / 1000);
                if (var1 < class386.field5469) {
                    class386.field5469 = var1;
                }
            }
            if (class249.field3707 < var3) {
                class249.field3707 += class137.field2114 + ((var3 - class249.field3707) * class158.field2308 / 1000);
                if (class249.field3707 > var3) {
                    class249.field3707 = var3;
                }
            }
            if (var1 < class386.field5469) {
                class386.field5469 -= class137.field2114 + ((class386.field5469 - var1) * class158.field2308 / 1000);
                if (var1 > class386.field5469) {
                    class386.field5469 = var1;
                }
            }
            if (var3 < class249.field3707) {
                class249.field3707 -= (class249.field3707 - var3) * class158.field2308 / 1000 + class137.field2114;
                if (var3 > class249.field3707) {
                    class249.field3707 = var3;
                }
            }
            if (class417.field5999 < var2) {
                class417.field5999 += (var2 - class417.field5999) * class158.field2308 / 1000 + class137.field2114;
                if (var2 < class417.field5999) {
                    class417.field5999 = var2;
                }
            }
            if (class417.field5999 > var2) {
                class417.field5999 -= class137.field2114 + ((class417.field5999 - var2) * class158.field2308 / 1000);
                if (class417.field5999 < var2) {
                    class417.field5999 = var2;
                }
            }
        }
        int var4 = class308.field4486 * 128 + 64;
        int var5 = class32.field397 * 128 + 64;
        int var6 = class452.method2820(class158.field2302, var4, false, var5) - class365.field5228;
        int var7 = var5 - class386.field5469;
        int var8 = var6 - class249.field3707;
        int var9 = var4 - class417.field5999;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (~var11 < arg0) {
            var11 = 3072;
        }
        if (class319.field4676 < var11) {
            class319.field4676 += (var11 - class319.field4676 >> 3) * class223.field3324 / 1000 + class316.field4637 << 3;
            if (var11 < class319.field4676) {
                class319.field4676 = var11;
            }
        }
        if (var11 < class319.field4676) {
            class319.field4676 -= (class319.field4676 - var11 >> 3) * class223.field3324 / 1000 + class316.field4637 << 3;
            if (class319.field4676 < var11) {
                class319.field4676 = var11;
            }
        }
        int var13 = var12 - class278.field3990;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class278.field3990 += class316.field4637 + (class223.field3324 * var14 / 1000) << 3;
            class278.field3990 &= 0x3FFF;
        }
        if (var14 < 0) {
            class278.field3990 -= -var14 * class223.field3324 / 1000 + class316.field4637 << 3;
            class278.field3990 &= 0x3FFF;
        }
        int var15 = var12 - class278.field3990;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class278.field3990 = var12;
        }
        class214.field3072 = 0;
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V", line = 254)
    public final void method2169(int arg0) {
        field4783++;
        if (arg0 < 84) {
            return;
        }
        if (this.field4787 != null) {
            for (int var2 = 0; var2 < this.field4787.length; var2++) {
                this.field4787[var2].method2261();
            }
        }
        this.field4780 = null;
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)V", line = 279)
    public static final void method2170(int arg0) {
        if (class137.field2111 <= 0) {
            class284.field4139 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class1.field4.length; var2++) {
                if (class1.field4[var2].startsWith("--> ")) {
                    var1++;
                    if (class137.field2111 == var1) {
                        class284.field4139 = class1.field4[var2].substring(4);
                        break;
                    }
                }
            }
        }
        field4774++;
        if (arg0 != 128) {
            field4794 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "(I)V", line = 314)
    public static void method2171(int arg0) {
        field4779 = null;
        field4794 = null;
        if (arg0 != 0) {
            field4779 = null;
        }
        field4795 = null;
        field4788 = null;
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(I[Lcr;IIII)V", line = 489)
    public class331(int arg0, class344[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4778 = arg0;
        this.field4787 = arg1;
        this.field4772 = arg4;
        this.field4782 = arg3;
        this.field4777 = arg5;
        if (arg1 == null) {
            this.field4786 = null;
            this.field4791 = null;
        } else {
            this.field4791 = new class344[arg1.length];
            this.field4786 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIIIIILvq;I)V", line = 344)
    public final void method2172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class269 arg8, int arg9) {
        field4776++;
        int var11 = arg6 + arg7 & 0x3FFF;
        if (this.field4778 == -1) {
            arg8.method1012(arg5, arg4, arg1, arg2, arg9, 0);
        } else {
            class287 var12 = class119.field1611.method1475(this.field4778, 17673);
            if (this.field4780 == null && class119.field1611.method1471(-31571, this.field4778)) {
                int[] var13 = var12.field4170 ? class119.field1611.method1474(this.field4789, false, 0.7F, this.field4789, (byte) -20, this.field4778) : class119.field1611.method1470(0.7F, this.field4778, this.field4789, 3962, this.field4789, false);
                this.field4780 = arg8.method876(var13, 0, this.field4789, this.field4789, this.field4789);
            }
            if (!var12.field4170) {
                arg8.method1012(arg5, arg4, arg1, arg2, arg9, 0);
            }
            if (this.field4780 != null) {
                int var14 = var12.field4170 ? 0 : 1;
                int var15 = arg2 * arg3 / -4096;
                int var16;
                for (var16 = arg2 * var11 / 4096 + (arg1 - arg2) / 2; var16 > arg2; var16 -= arg2) {
                }
                while (var16 < 0) {
                    var16 += arg2;
                }
                while (var15 > arg2) {
                    var15 -= arg2;
                }
                while (var15 < 0) {
                    var15 += arg2;
                }
                for (int var17 = var16 - arg2; var17 < arg1; var17 += arg2) {
                    for (int var18 = var15 - arg2; var18 < arg2; var18 += arg2) {
                        this.field4780.method74(arg5 + var17, var18 - -arg4, arg2, arg2, 0, 0, var14);
                    }
                }
            }
        }
        if (arg0 < 48) {
            this.field4780 = null;
        }
        for (int var19 = this.field4796 - 1; var19 >= 0; var19--) {
            this.field4791[var19].method2254(arg8, arg5, arg4, arg1, arg2, arg3, var11);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZ)V", line = 422)
    public static final void method2173(int arg0, boolean arg1) {
        field4790++;
        for (class13 var2 = (class13) class266.field3900.method2752(-63); var2 != null; var2 = (class13) class266.field3900.method2754(-1)) {
            if (var2.field178 != null) {
                class378.field5380.method2296(var2.field178);
                var2.field178 = null;
            }
            if (var2.field183 != null) {
                class378.field5380.method2296(var2.field183);
                var2.field183 = null;
            }
            var2.method2660((byte) 118);
        }
        if (arg0 > -54) {
            field4788 = null;
        }
        if (!arg1) {
            return;
        }
        for (class13 var3 = (class13) class433.field6188.method2752(-79); var3 != null; var3 = (class13) class433.field6188.method2754(-1)) {
            if (var3.field178 != null) {
                class378.field5380.method2296(var3.field178);
                var3.field178 = null;
            }
            var3.method2660((byte) 115);
        }
        for (class13 var4 = (class13) class96.field1233.method1383(102); var4 != null; var4 = (class13) class96.field1233.method1378((byte) 98)) {
            if (var4.field178 != null) {
                class378.field5380.method2296(var4.field178);
                var4.field178 = null;
            }
            var4.method2660((byte) 122);
        }
    }
}
