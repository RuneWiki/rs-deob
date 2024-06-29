import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class119 extends class467 {

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public int field1667 = 0;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "[Lmb;")
    public static class285[] field1663 = new class285[16];

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "[I")
    public static int[] field1686 = new int[14];

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public int field1664;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public int field1666;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public int field1668;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    public int field1669;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public int field1671;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    public int field1673;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    public int field1675;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    public int field1676;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
    public int field1680;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
    public int field1682;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    public int field1685;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "Leu;")
    public class130 field1678;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "Lrb;")
    public class175 field1665;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "Lrb;")
    public class175 field1681;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "Lrk;")
    public class194 field1670;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "Lbp;")
    public class322 field1679;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "Lns;")
    public static class438 field1677;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "Z")
    public boolean field1672;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "[I")
    public int[] field1661;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Luf;IZILuf;)I", line = 6)
    public static final int method764(class349 arg0, int arg1, boolean arg2, int arg3, class349 arg4) {
        field1674++;
        if (arg1 != -1) {
            field1677 = null;
        }
        if (arg3 == 1) {
            int var5 = arg0.field6184;
            int var6 = arg4.field6184;
            if (!arg2) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 == 2) {
            return class34.method256(class288.field4292, arg0.method2219(-120).field451, -105, arg4.method2219(75).field451);
        } else if (arg3 == 3) {
            if (arg0.field5434.equals("-")) {
                if (arg4.field5434.equals("-")) {
                    return 0;
                } else if (arg2) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field5434.equals("-")) {
                return arg2 ? 1 : -1;
            } else {
                return class34.method256(class288.field4292, arg0.field5434, -92, arg4.field5434);
            }
        } else if (arg3 == 4) {
            if (arg0.method2502(0)) {
                return arg4.method2502(0) ? 0 : 1;
            } else if (arg4.method2502(0)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 5) {
            if (arg0.method2497(-3463)) {
                return arg4.method2497(-3463) ? 0 : 1;
            } else if (arg4.method2497(-3463)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 6) {
            if (arg0.method2496(arg1 + 1)) {
                return arg4.method2496(0) ? 0 : 1;
            } else if (arg4.method2496(0)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 7) {
            if (arg0.method2498((byte) -32)) {
                return arg4.method2498((byte) -32) ? 0 : 1;
            } else if (arg4.method2498((byte) -32)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 8) {
            int var7 = arg0.field5442;
            int var8 = arg4.field5442;
            if (arg2) {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (var7 == 1000) {
                    var7 = -1;
                }
            } else {
                if (var8 == -1) {
                    var8 = 1000;
                }
                if (var7 == -1) {
                    var7 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg0.field5438 - arg4.field5438;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V", line = 110)
    public static void method765(int arg0) {
        field1663 = null;
        if (arg0 == -3371) {
            field1677 = null;
            field1686 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)B", line = 127)
    public static final byte method766(int arg0, int arg1, int arg2) {
        field1662++;
        if (arg2 == 9) {
            if (arg0 != 3508) {
                method764(null, 17, false, 37, null);
            }
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BIIII)I", line = 152)
    public static final int method767(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1683++;
        if (arg0 != -119) {
            field1663 = null;
        }
        int var5 = arg3 & 0xF;
        int var6 = var5 >= 8 ? arg1 : arg2;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg2 : arg4) : arg1;
        return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V", line = 175)
    public final void method768(int arg0) {
        field1684++;
        int var2 = this.field1682;
        if (this.field1678 != null) {
            class130 var3 = this.field1678.method832((byte) -123, class36.field583);
            if (var3 == null) {
                this.field1664 = 0;
                this.field1676 = 0;
                this.field1661 = null;
                this.field1671 = 0;
                this.field1675 = 0;
                this.field1682 = -1;
            } else {
                this.field1675 = var3.field1824;
                this.field1671 = var3.field1829;
                this.field1664 = var3.field1859;
                this.field1676 = var3.field1906 << 7;
                this.field1682 = var3.field1871;
                this.field1661 = var3.field1850;
            }
        } else if (this.field1670 != null) {
            int var4 = class317.method2053(true, this.field1670);
            if (var2 != var4) {
                this.field1682 = var4;
                class329 var5 = this.field1670.field2768;
                if (var5.field5068 != null) {
                    var5 = var5.method2125(class36.field583, false);
                }
                if (var5 == null) {
                    this.field1671 = this.field1676 = 0;
                } else {
                    this.field1676 = var5.field5040 << 7;
                    this.field1671 = var5.field5071;
                }
            }
        } else if (this.field1679 != null) {
            this.field1682 = class328.method2116(this.field1679, (byte) -29);
            this.field1676 = this.field1679.field4942 << 7;
            this.field1671 = this.field1679.field4948;
        }
        if (this.field1682 != var2 && this.field1681 != null) {
            class325.field4996.method1274(this.field1681);
            this.field1681 = null;
        }
        if (arg0 != -30867) {
            method767((byte) 23, -81, 15, -76, 1);
        }
    }
}
