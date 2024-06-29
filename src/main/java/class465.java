import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class465 {

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public int field6708 = -1;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
    private int field6712 = -1;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
    private int field6717 = 128;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
    private int field6721 = 0;

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
    private int field6727 = 0;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "I")
    private int field6724 = 0;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "Z")
    public boolean field6723 = false;

    @OriginalMember(owner = "client!pp", name = "y", descriptor = "B")
    public byte field6731 = 0;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
    private int field6714 = 128;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "Lqu;")
    public static class364 field6711 = new class364(26, 8);

    @OriginalMember(owner = "client!pp", name = "x", descriptor = "Lpn;")
    public static class68 field6730 = new class68();

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "I")
    public static int field6732 = 0;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
    public int field6709;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "I")
    private int field6726;

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!pp", name = "w", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!pp", name = "A", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!pp", name = "B", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "Lao;")
    public class369 field6710;

    @OriginalMember(owner = "client!pp", name = "C", descriptor = "[I")
    public static int[] field6735;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "[Lha;")
    public static class116[] field6720;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "[S")
    private short[] field6713;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "[S")
    private short[] field6716;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "[S")
    private short[] field6719;

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "[S")
    private short[] field6725;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V", line = 10)
    public static final void method2756(int arg0) {
        field6733++;
        class264.field3925 = 0;
        if (arg0 != -7398) {
            method2757(null, (byte) 1);
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class156.field1996[var1] = null;
            class139.field1830[var1] = 1;
            class442.field6468[var1] = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lcd;B)I", line = 33)
    public static final int method2757(class86 arg0, byte arg1) {
        field6734++;
        if (arg1 != 5) {
            method2757(null, (byte) -61);
        }
        if (arg0.field1059 == 0) {
            return 0;
        }
        if (arg0.field1037 != -1) {
            class86 var2 = null;
            if (arg0.field1037 < 32768) {
                class234 var3 = (class234) class627.field9185.method1333((long) arg0.field1037, false);
                if (var3 != null) {
                    var2 = var3.field3443;
                }
            } else if (arg0.field1037 >= 32768) {
                var2 = class383.field5604[arg0.field1037 - 32768];
            }
            if (var2 != null) {
                int var4 = arg0.field3464 - var2.field3464;
                int var5 = arg0.field3463 - var2.field3463;
                if (var4 != 0 || var5 != 0) {
                    arg0.method499(-3569, (int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if ((arg0 instanceof class179)) {
            class179 var9 = (class179) arg0;
            if (var9.field2739 != -1 && (var9.field1091 == 0 || var9.field1096 > 0)) {
                var9.method499(-3569, var9.field2739);
                var9.field2739 = -1;
            }
        } else if (arg0 instanceof class383) {
            class383 var6 = (class383) arg0;
            if (var6.field5588 != -1 && (var6.field1091 == 0 || var6.field1096 > 0)) {
                int var7 = var6.field3464 - ((var6.field5588 - class584.field8677 - class584.field8677) * 64);
                int var8 = var6.field3463 - (var6.field5603 - class424.field6061 - class424.field6061) * 64;
                if (var7 != 0 || var8 != 0) {
                    var6.method499(-3569, (int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF);
                }
                var6.field5588 = -1;
            }
        }
        return arg0.method500(0);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILqa;IIIILkca;)Lr;", line = 116)
    public final class520 method2758(int arg0, class167 arg1, int arg2, int arg3, int arg4, int arg5, class601 arg6) {
        if (arg4 == 8) {
            field6718++;
            return this.method2763(arg5, arg3, null, 0, arg1, 0, arg2, null, arg6, (byte) 5, false, arg0, 0, true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lqa;IILkca;Lsa;IZBIIILsa;I)Lr;", line = 127)
    public final class520 method2759(class167 arg0, int arg1, int arg2, class601 arg3, class543 arg4, int arg5, boolean arg6, byte arg7, int arg8, int arg9, int arg10, class543 arg11, int arg12) {
        field6707++;
        if (arg7 != -29) {
            this.field6709 = 7;
        }
        return this.method2763(arg1, arg10, arg4, arg8, arg0, arg12, arg2, arg11, arg3, (byte) 2, arg6, arg9, arg5, true);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lqa;IILkca;IBI)Lr;", line = 151)
    public final class520 method2760(class167 arg0, int arg1, int arg2, class601 arg3, int arg4, byte arg5, int arg6) {
        if (arg5 != -60) {
            method2756(-24);
        }
        field6728++;
        return this.method2763(arg1, arg6, null, 0, arg0, 0, arg2, null, arg3, (byte) 2, false, arg4, 0, true);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lps;BI)V", line = 174)
    private final void method2761(class428 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field6726 = arg0.method2620(50);
        } else if (arg2 == 2) {
            this.field6708 = arg0.method2620(22);
        } else if (arg2 == 4) {
            this.field6714 = arg0.method2620(93);
        } else if (arg2 == 5) {
            this.field6717 = arg0.method2620(96);
        } else if (arg2 == 6) {
            this.field6727 = arg0.method2620(21);
        } else if (arg2 == 7) {
            this.field6721 = arg0.method2561((byte) -81);
        } else if (arg2 == 8) {
            this.field6724 = arg0.method2561((byte) 114);
        } else if (arg2 == 9) {
            this.field6712 = 8224;
            this.field6731 = 3;
        } else if (arg2 == 10) {
            this.field6723 = true;
        } else if (arg2 == 11) {
            this.field6731 = 1;
        } else if (arg2 == 12) {
            this.field6731 = 4;
        } else if (arg2 == 13) {
            this.field6731 = 5;
        } else if (arg2 == 14) {
            this.field6731 = 2;
            this.field6712 = arg0.method2561((byte) 118) * 256;
        } else if (arg2 == 15) {
            this.field6731 = 3;
            this.field6712 = arg0.method2620(75);
        } else if (arg2 == 16) {
            this.field6731 = 3;
            this.field6712 = arg0.method2589(-11179);
        } else if (arg2 == 40) {
            int var6 = arg0.method2561((byte) -125);
            this.field6719 = new short[var6];
            this.field6713 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field6713[var7] = (short) arg0.method2620(21);
                this.field6719[var7] = (short) arg0.method2620(70);
            }
        } else if (arg2 == 41) {
            int var4 = arg0.method2561((byte) -108);
            this.field6725 = new short[var4];
            this.field6716 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6725[var5] = (short) arg0.method2620(71);
                this.field6716[var5] = (short) arg0.method2620(82);
            }
        }
        field6729++;
        if (arg1 < 94) {
            this.field6708 = -32;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BLps;)V", line = 302)
    public final void method2762(byte arg0, class428 arg1) {
        while (true) {
            int var3 = arg1.method2561((byte) -116);
            if (var3 == 0) {
                field6722++;
                if (arg0 <= 86) {
                    this.field6725 = null;
                    return;
                }
                return;
            }
            this.method2761(arg1, (byte) 109, var3);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IILsa;ILqa;IILsa;Lkca;BZIIZ)Lr;", line = 325)
    private final class520 method2763(int arg0, int arg1, class543 arg2, int arg3, class167 arg4, int arg5, int arg6, class543 arg7, class601 arg8, byte arg9, boolean arg10, int arg11, int arg12, boolean arg13) {
        field6715++;
        int var15 = arg0;
        class224 var16 = this.field6708 == -1 || arg11 == -1 ? null : arg8.method3498(false, this.field6708);
        boolean var17 = arg10 & this.field6731 != 0;
        if (var16 != null) {
            var15 = arg0 | var16.method1475((byte) -94, false, arg11, arg1);
        }
        if (var17) {
            var15 |= this.field6731 == 3 ? 7 : 2;
        }
        if (!arg13) {
            return null;
        }
        if (this.field6717 != 128) {
            var15 |= 0x2;
        }
        if (this.field6714 != 128 || this.field6727 != 0) {
            var15 |= 0x5;
        }
        class325 var18 = this.field6710.field5340;
        class520 var19;
        synchronized (this.field6710.field5340) {
            var19 = (class520) this.field6710.field5340.method2025((long) (this.field6709 |= arg4.field2264 << 29), 2);
        }
        if (var19 == null || arg4.method1026(var19.method1950(), var15) != 0) {
            if (var19 != null) {
                var15 = arg4.method978(var15, var19.method1950());
            }
            int var20 = var15;
            if (this.field6713 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field6725 != null) {
                var20 |= 0x8000;
            }
            class114 var21 = class559.method3271(80, 0, this.field6726, this.field6710.field5339);
            if (var21 == null) {
                return null;
            }
            if (var21.field1459 < 13) {
                var21.method699((byte) -79, 0);
            }
            var19 = arg4.method954(var21, var20, this.field6710.field5341, this.field6721 + 64, this.field6724 + 850);
            if (this.field6713 != null) {
                for (int var22 = 0; var22 < this.field6713.length; var22++) {
                    var19.method1957(this.field6713[var22], this.field6719[var22]);
                }
            }
            if (this.field6725 != null) {
                for (int var23 = 0; var23 < this.field6725.length; var23++) {
                    var19.method1947(this.field6725[var23], this.field6716[var23]);
                }
            }
            var19.method1973(var15);
            class325 var24 = this.field6710.field5340;
            synchronized (this.field6710.field5340) {
                this.field6710.field5340.method2029(false, var19, (long) (this.field6709 |= arg4.field2264 << 29));
            }
        }
        class520 var25 = var16 == null ? var19.method369(arg9, var15, true) : var16.method1470((byte) -106, arg6, var19, var15, arg9, arg1, 0, arg11);
        if (this.field6714 != 128 || this.field6717 != 128) {
            var25.method1974(this.field6714, this.field6717, this.field6714);
        }
        if (this.field6727 != 0) {
            if (this.field6727 == 90) {
                var25.method1979(4096);
            }
            if (this.field6727 == 180) {
                var25.method1979(8192);
            }
            if (this.field6727 == 270) {
                var25.method1979(12288);
            }
        }
        if (var17) {
            var25.method1945(this.field6731, this.field6712, arg2, arg7, arg3, arg12, arg5);
        }
        var25.method1973(arg0);
        return var25;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V", line = 447)
    public static void method2764(int arg0) {
        field6711 = null;
        field6735 = null;
        field6730 = null;
        if (arg0 != -8527) {
            field6730 = null;
        }
        field6720 = null;
    }
}
