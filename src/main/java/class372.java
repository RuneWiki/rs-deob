import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class372 extends class569 implements class602 {

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "Z")
    private boolean field5418 = false;

    @OriginalMember(owner = "client!rb", name = "fb", descriptor = "Ljp;")
    public class374 field5440;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "Z")
    private boolean field5430;

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "[S")
    private static short[] field5417 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "[S")
    private static short[] field5428 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "[S")
    private static short[] field5433 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "[[S")
    public static short[][] field5435 = new short[][] { field5417, field5428, field5433 };

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!rb", name = "bb", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!rb", name = "cb", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!rb", name = "db", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!rb", name = "eb", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "J")
    public static long field5420;

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "Lln;")
    private class398 field5421;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(Lha;B)V", line = 4)
    public final void method1752(class66 arg0, byte arg1) {
        if (arg1 >= -17) {
            this.method131((class66) null, (byte) -118);
        }
        ++field5432;
        this.field5440.method2352((byte) -121, arg0);
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(Lha;B)Lln;", line = 16)
    public final class398 method119(class66 arg0, byte arg1) {
        ++field5416;
        if (arg1 > -35) {
            field5417 = null;
        }
        return this.field5421;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lha;B)V", line = 29)
    public final void method1742(class66 arg0, byte arg1) {
        ++field5423;
        this.field5440.method2343(arg0, false);
        if (arg1 <= 68) {
            this.field5421 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(Z)I", line = 42)
    public final int method767(boolean arg0) {
        ++field5437;
        if (arg0) {
            this.method767(false);
        }
        return this.field5440.method2342(true);
    }

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "(I)Z", line = 59)
    public final boolean method777(int arg0) {
        ++field5436;
        int var2 = -33 / ((arg0 - -34) / 59);
        return this.field5418;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)I", line = 75)
    public final int method774(byte arg0) {
        ++field5424;
        if (arg0 != 115) {
            field5433 = null;
        }
        return this.field5440.method2351(62);
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(Lha;B)V", line = 86)
    public final void method131(class66 arg0, byte arg1) {
        if (arg1 == 53) {
            ++field5427;
            class497 var3 = this.field5440.method2341(127, arg0, false, 262144, true);
            if (var3 != null) {
                int var4 = super.field2802 >> 9;
                int var5 = super.field2810 >> 9;
                class109 var6 = arg0.method475();
                var6.method814(super.field2802, super.field2815, super.field2810);
                this.field5440.method2347(false, var4, var4, var6, arg0, var5, var5, (byte) -118, var3);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILha;II)Z", line = 111)
    public final boolean method122(int arg0, class66 arg1, int arg2, int arg3) {
        ++field5439;
        class497 var5 = this.field5440.method2341(75, arg1, false, 131072, false);
        if (var5 == null) {
            return false;
        } else {
            if (arg2 != 6238) {
                this.method767(true);
            }
            class109 var6 = arg1.method475();
            var6.method814(super.field7762 + super.field2802, super.field2815, super.field7765 + super.field2810);
            return !class408.field5786 ? var5.method248(arg0, arg3, var6, false, 0) : var5.method245(arg0, arg3, var6, false, 0, class72.field972);
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)I", line = 131)
    public final int method1748(int arg0) {
        if (arg0 != 5875) {
            this.method131((class66) null, (byte) -102);
        }
        ++field5438;
        return this.field5440.field5447;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V", line = 143)
    public final void method1745(boolean arg0) {
        if (!arg0) {
            this.method122(-90, (class66) null, -38, 25);
        }
        ++field5422;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)I", line = 153)
    public final int method1750(int arg0) {
        ++field5429;
        if (arg0 != 29244) {
            this.method1747((byte) -82);
        }
        return this.field5440.field5456;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(Lha;B)Lpia;", line = 165)
    public final class104 method114(class66 arg0, byte arg1) {
        ++field5426;
        if (arg1 != 115) {
            field5420 = 83L;
        }
        class497 var3 = this.field5440.method2341(81, arg0, false, 2048, true);
        if (var3 == null) {
            return null;
        } else {
            class109 var4 = arg0.method475();
            var4.method814(super.field7762 + super.field2802, super.field2815, super.field7765 + super.field2810);
            class104 var5 = class568.method3241(1, (byte) 73, this.field5430);
            int var6 = super.field2802 >> 9;
            int var7 = super.field2810 >> 9;
            this.field5440.method2347(true, var6, var6, var4, arg0, var7, var7, (byte) -118, var3);
            if (!class408.field5786) {
                var3.method254(var4, var5.field1479[0], 0);
            } else {
                var3.method258(var4, var5.field1479[0], class72.field972, 0);
            }
            if (this.field5440.field5452 != null) {
                class586 var8 = this.field5440.field5452.method1057();
                if (!class408.field5786) {
                    arg0.method534(var8);
                } else {
                    arg0.method524(var8, class72.field972);
                }
            }
            this.field5418 = var3.method272() || this.field5440.field5452 != null;
            if (this.field5421 != null) {
                class478.method2827(true, super.field2802, var3, this.field5421, super.field2810, super.field2815);
            } else {
                this.field5421 = class122.method882(var3, super.field2810, super.field2802, super.field2815, 83);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "(I)V", line = 220)
    public static void method2334(int arg0) {
        if (arg0 >= -109) {
            field5428 = null;
        }
        field5417 = null;
        field5433 = null;
        field5428 = null;
        field5435 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Z", line = 234)
    public final boolean method1747(byte arg0) {
        ++field5425;
        int var2 = 61 % ((-41 - arg0) / 60);
        return this.field5440.method2353(-1);
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lha;Llp;IIIIIZIIIII)V", line = 289)
    public class372(class66 arg0, class412 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field5440 = new class374(arg0, arg1, arg10, arg11, super.field2813, arg3, this, arg7, arg12);
        this.field5430 = arg1.field5905 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "(I)Z", line = 248)
    public final boolean method769(int arg0) {
        if (arg0 > -70) {
            return false;
        } else {
            ++field5415;
            return false;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)I", line = 259)
    public final int method1744(int arg0) {
        ++field5434;
        return arg0 != 21215 ? 23 : this.field5440.field5474;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZLjca;)V", line = 270)
    public final void method2335(boolean arg0, class711 arg1) {
        ++field5419;
        this.field5440.method2349(arg1, true);
        if (arg0) {
            field5428 = null;
        }
    }
}
