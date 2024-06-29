import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class104 extends class597 {

    @OriginalMember(owner = "client!pia", name = "M", descriptor = "I")
    private int field1661 = 0;

    @OriginalMember(owner = "client!pia", name = "Y", descriptor = "I")
    private int field1673 = 0;

    @OriginalMember(owner = "client!pia", name = "X", descriptor = "Z")
    private boolean field1672 = true;

    @OriginalMember(owner = "client!pia", name = "bb", descriptor = "Z")
    public boolean field1676 = false;

    @OriginalMember(owner = "client!pia", name = "db", descriptor = "I")
    private int field1678 = -1;

    @OriginalMember(owner = "client!pia", name = "cb", descriptor = "I")
    private int field1677 = 0;

    @OriginalMember(owner = "client!pia", name = "gb", descriptor = "I")
    private int field1681 = 0;

    @OriginalMember(owner = "client!pia", name = "ib", descriptor = "I")
    private int field1683 = 0;

    @OriginalMember(owner = "client!pia", name = "L", descriptor = "I")
    public int field1660;

    @OriginalMember(owner = "client!pia", name = "hb", descriptor = "I")
    private int field1682;

    @OriginalMember(owner = "client!pia", name = "N", descriptor = "Lc;")
    private class200 field1662;

    @OriginalMember(owner = "client!pia", name = "eb", descriptor = "[B")
    public static byte[] field1679 = new byte[2048];

    @OriginalMember(owner = "client!pia", name = "J", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!pia", name = "K", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!pia", name = "O", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!pia", name = "P", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!pia", name = "Q", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!pia", name = "R", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!pia", name = "S", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!pia", name = "T", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!pia", name = "U", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!pia", name = "V", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!pia", name = "W", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!pia", name = "Z", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!pia", name = "fb", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!pia", name = "jb", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!pia", name = "kb", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!pia", name = "lb", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!pia", name = "mb", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!pia", name = "nb", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!pia", name = "ab", descriptor = "Lf;")
    private class788 field1675;

    @OriginalMember(owner = "client!pia", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 3)
    public class104(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field1660 = arg1 + arg2;
        this.field1682 = arg0;
        this.field1677 = arg12;
        class491 var14 = class707.field9727.method2143(-2, this.field1682);
        int var15 = var14.field6695;
        if (~var15 == 0) {
            this.field1676 = true;
        } else {
            this.field1662 = class108.field1696.method1279((byte) 92, var15);
            this.field1676 = false;
        }
        if (this.field1660 == arg2) {
            class189.method1394(this, 256, this.field1662, this.field1681);
        }
    }

    @OriginalMember(owner = "client!pia", name = "finalize", descriptor = "()V", line = 29)
    protected final void finalize() {
        if (this.field1675 != null) {
            this.field1675.method4291();
        }
        ++field1664;
    }

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "(Lha;B)Ldg;", line = 39)
    public final class435 method894(class66 arg0, byte arg1) {
        if (arg1 >= -38) {
            this.field1681 = -78;
        }
        ++field1674;
        return null;
    }

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "(III)Z", line = 50)
    public static final boolean method895(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field1679 = null;
        }
        ++field1667;
        if (!class620.method3491(32720, arg1, arg0)) {
            return false;
        } else {
            return ~(36864 & arg0) != -1 | class586.method3370(arg0, arg1, (byte) -33) | class584.method3360(arg0, true, arg1) ? true : (class303.method1937(arg1, (byte) 125, arg0) | (8192 & arg0) != 0 | class142.method1153(arg0, 111, arg1)) & ~(arg1 & 55) == -1;
        }
    }

    @OriginalMember(owner = "client!pia", name = "c", descriptor = "(III)Z", line = 74)
    public static final boolean method896(int arg0, int arg1, int arg2) {
        ++field1659;
        if (arg0 != 12992) {
            field1679 = null;
        }
        return ~(52 & arg1) != -1;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V", line = 88)
    public final void method897(int arg0) {
        if (this.field1675 != null) {
            this.field1675.method4291();
        }
        ++field1687;
        if (arg0 != 0) {
            this.method901((byte) 124, (class66) null);
        }
    }

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "(BLha;)Lhga;", line = 101)
    public final class186 method898(byte arg0, class66 arg1) {
        ++field1688;
        class499 var3 = this.method909(this.field1682, 3, (this.field1677 == 0 ? 0 : 5) | 2048, arg1);
        if (var3 == null) {
            return null;
        } else {
            if (this.field1677 != 0) {
                var3.method320(this.field1677 * 2048);
            }
            class650 var4 = arg1.method533();
            var4.method1868(super.field7396, super.field7405, super.field7398);
            this.method899(-116, arg1, var4, var3);
            class186 var5 = class174.method1320(1, false, 17832);
            if (!class507.field6967) {
                var3.method301(var4, var5.field2877[0], 0);
            } else {
                var3.method310(var4, var5.field2877[0], class90.field1369, 0);
            }
            if (this.field1675 != null) {
                class442 var6 = this.field1675.method4299();
                if (!class507.field6967) {
                    arg1.method478(var6);
                } else {
                    arg1.method474(var6, class90.field1369);
                }
            }
            this.field1672 = var3.method327();
            if (arg0 < 123) {
                this.method901((byte) 53, (class66) null);
            }
            this.field1683 = var3.method276();
            this.field1661 = var3.method298();
            return var5;
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(ILha;Lsk;Lka;)V", line = 145)
    private final void method899(int arg0, class66 arg1, class650 arg2, class499 arg3) {
        arg3.method312(arg2);
        ++field1665;
        class624[] var5 = arg3.method311();
        class72[] var6 = arg3.method322();
        if ((this.field1675 == null || this.field1675.field10807) && (var5 != null || var6 != null)) {
            this.field1675 = class788.method4295(class440.field5977, true);
        }
        if (this.field1675 != null) {
            this.field1675.method4305(arg1, (long) class440.field5977, var5, var6, false);
            this.field1675.method4303(super.field7391, super.field8368, super.field8372, super.field8369, super.field8365);
        }
        if (arg0 > -8) {
            this.field1678 = -116;
        }
    }

    @OriginalMember(owner = "client!pia", name = "h", descriptor = "(I)I", line = 176)
    public final int method900(int arg0) {
        ++field1671;
        if (arg0 != 0) {
            this.method910(false);
        }
        return this.field1661;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(BLha;)V", line = 189)
    public final void method901(byte arg0, class66 arg1) {
        ++field1663;
        class499 var3 = this.method909(this.field1682, 3, 0, arg1);
        if (var3 != null) {
            class650 var4 = arg1.method533();
            var4.method1868(super.field7396, super.field7405, super.field7398);
            this.method899(-27, arg1, var4, var3);
        }
        if (arg0 < 114) {
            this.field1683 = -94;
        }
    }

    @OriginalMember(owner = "client!pia", name = "j", descriptor = "(I)Z", line = 209)
    public final boolean method902(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field1686;
            return false;
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(Lha;Lcn;IIBZI)V", line = 220)
    public final void method903(class66 arg0, class543 arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6) {
        if (arg4 <= 41) {
            this.field1683 = 122;
        }
        ++field1685;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pia", name = "i", descriptor = "(I)Z", line = 237)
    public final boolean method904(int arg0) {
        if (arg0 != 0) {
            field1679 = null;
        }
        ++field1684;
        return false;
    }

    @OriginalMember(owner = "client!pia", name = "d", descriptor = "(I)V", line = 263)
    public final void method905(int arg0) {
        if (arg0 != -16665) {
            this.method903((class66) null, (class543) null, 48, -70, (byte) -10, true, 123);
        }
        ++field1658;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "(I)V", line = 279)
    public static void method906(int arg0) {
        field1679 = null;
        if (arg0 != 5) {
            field1679 = null;
        }
    }

    @OriginalMember(owner = "client!pia", name = "g", descriptor = "(I)I", line = 292)
    public final int method907(int arg0) {
        if (arg0 != -20425) {
            this.field1675 = null;
        }
        ++field1670;
        return this.field1683;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(Lha;III)Z", line = 306)
    public final boolean method908(class66 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 131072) {
            return true;
        } else {
            ++field1668;
            return false;
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIILha;)Lka;", line = 317)
    private final class499 method909(int arg0, int arg1, int arg2, class66 arg3) {
        ++field1669;
        class491 var5 = class707.field9727.method2143(-2, arg0);
        class296 var6 = class142.field2418[super.field7391];
        class296 var7 = arg1 > super.field7404 ? class142.field2418[super.field7404 + 1] : null;
        return !this.field1676 ? var5.method2818(super.field7405, var6, super.field7398, this.field1673, var7, true, (byte) 2, this.field1681, this.field1678, arg2, arg3, class108.field1696, super.field7396) : var5.method2818(super.field7405, var6, super.field7398, 0, var7, true, (byte) 2, -1, -1, arg2, arg3, class108.field1696, super.field7396);
    }

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "(Z)Z", line = 336)
    public final boolean method910(boolean arg0) {
        if (arg0) {
            this.method911((byte) -36, -76);
        }
        ++field1680;
        return this.field1672;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(BI)V", line = 350)
    public final void method911(byte arg0, int arg1) {
        ++field1666;
        if (arg0 >= -82) {
            this.field1683 = -91;
        }
        if (!this.field1676) {
            this.field1673 += arg1;
            while (this.field1662.field3024[this.field1681] < this.field1673) {
                this.field1673 -= this.field1662.field3024[this.field1681];
                ++this.field1681;
                if (this.field1662.field3040.length <= this.field1681) {
                    this.field1676 = true;
                    break;
                }
            }
            if (!this.field1676) {
                class189.method1394(this, 256, this.field1662, this.field1681);
            }
        }
    }
}
