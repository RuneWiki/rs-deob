import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class467 {

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field6570 = -1;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Lct;")
    public static class285 field6567 = new class285(80, 3);

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "J")
    public static long field6576 = 0L;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "Lat;")
    public static class412 field6578 = new class412();

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field6579 = 0;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    private int field6568;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public int field6571;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "[[Lje;")
    public static class178[][] field6572;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", line = 4)
    public static final String method2739(String arg0, String arg1, int arg2, String arg3) {
        if (arg2 != 17186) {
            return null;
        }
        field6577++;
        for (int var4 = arg1.indexOf(arg3); var4 != -1; var4 = arg1.indexOf(arg3, arg0.length() + var4)) {
            arg1 = arg1.substring(0, var4) + arg0 + arg1.substring(arg3.length() + var4);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 23)
    public static void method2740(int arg0) {
        if (arg0 < 84) {
            method2740(102);
        }
        field6572 = null;
        field6578 = null;
        field6567 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI)V", line = 37)
    public final void method2741(byte arg0, int arg1) {
        this.field6571 = arg1;
        field6573++;
        this.field6568 = 0;
        if (arg0 != -14) {
            method2739((String) null, (String) null, 124, (String) null);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII)Z", line = 56)
    public final boolean method2742(int arg0, int arg1, int arg2, int arg3) {
        field6575++;
        if (arg0 >= -3) {
            field6570 = 119;
        }
        int var5 = this.field6568;
        if (this.field6571 == arg1 && this.field6568 == 0) {
            return false;
        }
        boolean var8;
        if (this.field6568 == 0) {
            if (this.field6571 < arg1 && (this.field6571 + arg2) >= arg1 || arg1 < this.field6571 && (this.field6571 - arg2) <= arg1) {
                this.field6571 = arg1;
                return false;
            }
            var8 = true;
        } else if (this.field6568 > 0 && arg1 > this.field6571) {
            int var6 = this.field6568 * this.field6568 / (arg2 * 2);
            int var7 = this.field6571 + var6;
            if (arg1 > var7 && var7 >= this.field6571) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field6568 < 0 && this.field6571 > arg1) {
            int var9 = this.field6568 * this.field6568 / (arg2 * 2);
            int var10 = this.field6571 - var9;
            if (arg1 < var10 && var10 <= this.field6571) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (this.field6571 >= arg1) {
                this.field6568 -= arg2;
                if (arg3 != 0 && (-arg3) > this.field6568) {
                    this.field6568 = -arg3;
                }
            } else {
                this.field6568 += arg2;
                if (arg3 != 0 && this.field6568 > arg3) {
                    this.field6568 = arg3;
                }
            }
            if (this.field6568 != var5) {
                int var11 = this.field6568 * this.field6568 / (arg2 * 2);
                if (this.field6571 < arg1) {
                    if (arg1 < this.field6571 + var11) {
                        this.field6568 = var5;
                    }
                } else if (arg1 < this.field6571 && arg1 > (this.field6571 - var11)) {
                    this.field6568 = var5;
                }
            }
        } else if (this.field6568 > 0) {
            this.field6568 -= arg2;
            if (this.field6568 < 0) {
                this.field6568 = 0;
            }
        } else {
            this.field6568 += arg2;
            if (this.field6568 > 0) {
                this.field6568 = 0;
            }
        }
        this.field6571 += this.field6568 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)I", line = 191)
    public final int method2743(boolean arg0) {
        field6574++;
        return arg0 ? this.field6571 & 0x3FFF : -10;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V", line = 202)
    public final void method2744(byte arg0) {
        field6569++;
        int var2 = 74 / ((47 - arg0) / 55);
        this.field6571 &= 0x3FFF;
    }
}
