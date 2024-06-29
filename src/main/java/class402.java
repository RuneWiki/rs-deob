import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class402 extends class119 {

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    private int field5976 = 0;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "I")
    private int field5978 = 0;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "Z")
    private boolean field5980 = true;

    @OriginalMember(owner = "client!df", name = "kb", descriptor = "Z")
    public boolean field5999 = false;

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "I")
    private int field5987 = 0;

    @OriginalMember(owner = "client!df", name = "ob", descriptor = "I")
    private int field6003 = -1;

    @OriginalMember(owner = "client!df", name = "mb", descriptor = "I")
    private int field6001 = 0;

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "I")
    private int field5989 = 0;

    @OriginalMember(owner = "client!df", name = "X", descriptor = "I")
    private int field5986;

    @OriginalMember(owner = "client!df", name = "eb", descriptor = "I")
    public int field5993;

    @OriginalMember(owner = "client!df", name = "jb", descriptor = "Lao;")
    private class288 field5998;

    @OriginalMember(owner = "client!df", name = "gb", descriptor = "[I")
    public static int[] field5995 = new int[14];

    @OriginalMember(owner = "client!df", name = "L", descriptor = "I")
    public static int field5974;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "I")
    public static int field5979;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!df", name = "T", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!df", name = "V", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!df", name = "W", descriptor = "I")
    public static int field5985;

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!df", name = "cb", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!df", name = "db", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!df", name = "fb", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!df", name = "hb", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!df", name = "ib", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!df", name = "lb", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!df", name = "nb", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!df", name = "bb", descriptor = "Lpaa;")
    private class626 field5990;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "(B)Z", line = 3)
    public final boolean method329(byte arg0) {
        ++field6002;
        int var2 = -72 / ((arg0 - -33) / 42);
        return this.field5980;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLql;Lka;Lha;)V", line = 13)
    private final void method2546(byte arg0, class738 arg1, class473 arg2, class60 arg3) {
        ++field5992;
        arg2.method244(arg1);
        class459[] var5 = arg2.method266();
        class285[] var6 = arg2.method285();
        if ((this.field5990 == null || this.field5990.field8759) && (var5 != null || var6 != null)) {
            this.field5990 = class626.method3604(class357.field5189, true);
        }
        if (arg0 != -81) {
            this.method738((byte) 25);
        }
        if (this.field5990 != null) {
            this.field5990.method3606(arg3, (long) class357.field5189, var5, var6, false);
            this.field5990.method3608(super.field8429, super.field1628, super.field1632, super.field1626, super.field1624);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 38)
    public final void method2547(int arg0) {
        if (arg0 >= -121) {
            this.method313((byte) -104);
        }
        ++field5991;
        if (this.field5990 != null) {
            this.field5990.method3605();
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 53)
    public class402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field5986 = arg0;
        this.field5976 = arg12;
        this.field5993 = arg1 + arg2;
        class321 var14 = class499.field7100.method172(this.field5986, 3128);
        int var15 = var14.field4528;
        if (~var15 == 0) {
            this.field5999 = true;
        } else {
            this.field5998 = class742.field10404.method2663(0, var15);
            this.field5999 = false;
        }
        if (~this.field5993 == ~arg2) {
            class294.method1865(this.field5978, this, this.field5998, -85);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V", line = 83)
    public final void method2548(int arg0, int arg1) {
        ++field6000;
        if (!this.field5999) {
            this.field5989 += arg1;
            while (this.field5998.field4087[this.field5978] < this.field5989) {
                this.field5989 -= this.field5998.field4087[this.field5978];
                ++this.field5978;
                if (~this.field5978 <= ~this.field5998.field4081.length) {
                    this.field5999 = true;
                    break;
                }
            }
            if (arg0 != -26266) {
                this.method315((byte) -97);
            }
            if (!this.field5999) {
                class294.method1865(this.field5978, this, this.field5998, arg0 ^ 26241);
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "h", descriptor = "(B)I", line = 119)
    public final int method315(byte arg0) {
        if (arg0 != 106) {
            return -2;
        } else {
            ++field5996;
            return this.field5987;
        }
    }

    @OriginalMember(owner = "client!df", name = "finalize", descriptor = "()V", line = 130)
    protected final void finalize() {
        if (this.field5990 != null) {
            this.field5990.method3605();
        }
        ++field5977;
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V", line = 142)
    public final void method741(int arg0) {
        if (arg0 >= -93) {
            this.method2550((byte) -33, (class60) null, 38, 65);
        }
        ++field5988;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILvs;ZILha;II)V", line = 154)
    public final void method737(int arg0, class593 arg1, boolean arg2, int arg3, class60 arg4, int arg5, int arg6) {
        if (arg0 == 8616) {
            ++field5981;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!df", name = "j", descriptor = "(B)I", line = 165)
    public final int method313(byte arg0) {
        if (arg0 != 3) {
            this.method737(-28, (class593) null, true, 127, (class60) null, 75, 102);
        }
        ++field5997;
        return this.field6001;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V", line = 177)
    public static void method2549(byte arg0) {
        field5995 = null;
        if (arg0 != 93) {
            method2549((byte) -13);
        }
    }

    @OriginalMember(owner = "client!df", name = "i", descriptor = "(B)Z", line = 188)
    public final boolean method320(byte arg0) {
        ++field5985;
        if (arg0 != 84) {
            this.field5978 = 52;
        }
        return false;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Lha;B)Lc;", line = 206)
    public final class187 method319(class60 arg0, byte arg1) {
        int var3 = -119 / ((-25 - arg1) / 60);
        ++field5975;
        class473 var4 = this.method2550((byte) -44, arg0, (this.field5976 == 0 ? 0 : 5) | 2048, this.field5986);
        if (var4 == null) {
            return null;
        } else {
            if (this.field5976 != 0) {
                var4.method257(this.field5976 * 2048);
            }
            class738 var5 = arg0.method442();
            var5.method774(super.field8423, super.field8421, super.field8428);
            this.method2546((byte) -81, var5, var4, arg0);
            class187 var6 = class650.method3774(109, false, 1);
            if (!class418.field6258) {
                var4.method265(var5, var6.field2851[0], 0);
            } else {
                var4.method235(var5, var6.field2851[0], class188.field2859, 0);
            }
            if (this.field5990 != null) {
                class624 var7 = this.field5990.method3603();
                if (!class418.field6258) {
                    arg0.method523(var7);
                } else {
                    arg0.method505(var7, class188.field2859);
                }
            }
            this.field5980 = var4.method275();
            this.field5987 = var4.method253();
            this.field6001 = var4.method269();
            return var6;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBLha;I)Z", line = 249)
    public final boolean method312(int arg0, byte arg1, class60 arg2, int arg3) {
        if (arg1 > -44) {
            this.method2546((byte) 90, (class738) null, (class473) null, (class60) null);
        }
        ++field5974;
        return false;
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(B)Z", line = 269)
    public final boolean method738(byte arg0) {
        ++field5982;
        if (arg0 != 88) {
            this.method2548(127, -105);
        }
        return false;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lha;Z)V", line = 292)
    public final void method314(class60 arg0, boolean arg1) {
        ++field5994;
        if (!arg1) {
            class473 var3 = this.method2550((byte) -44, arg0, 0, this.field5986);
            if (var3 != null) {
                class738 var4 = arg0.method442();
                var4.method774(super.field8423, super.field8421, super.field8428);
                this.method2546((byte) -81, var4, var3, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLha;II)Lka;", line = 313)
    private final class473 method2550(byte arg0, class60 arg1, int arg2, int arg3) {
        ++field5984;
        if (arg0 != -44) {
            this.method329((byte) -107);
        }
        class321 var5 = class499.field7100.method172(arg3, arg0 + 3172);
        class280 var6 = class531.field7566[super.field8429];
        class280 var7 = super.field8417 >= 3 ? null : class531.field7566[super.field8417 + 1];
        return !this.field5999 ? var5.method2028(true, super.field8421, this.field6003, super.field8423, this.field5989, var7, -2574, super.field8428, this.field5978, arg1, var6, class742.field10404, arg2) : var5.method2028(true, super.field8421, -1, super.field8423, 0, var7, -2574, super.field8428, -1, arg1, var6, class742.field10404, arg2);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lha;I)Lria;", line = 333)
    public final class286 method325(class60 arg0, int arg1) {
        if (arg1 != 92160000) {
            field5995 = null;
        }
        ++field5979;
        return null;
    }
}
