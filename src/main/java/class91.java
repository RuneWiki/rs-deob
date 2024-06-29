import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class91 extends class7 {

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
    private int field1814 = 2000;

    @OriginalMember(owner = "client!jb", name = "eb", descriptor = "I")
    private int field1824 = 16;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
    private int field1819 = 0;

    @OriginalMember(owner = "client!jb", name = "ib", descriptor = "I")
    private int field1828 = 0;

    @OriginalMember(owner = "client!jb", name = "lb", descriptor = "I")
    private int field1831 = 4096;

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "Lob;")
    public static class141 field1815 = class175.method1195(40, "rot:");

    @OriginalMember(owner = "client!jb", name = "gb", descriptor = "Lob;")
    private static class141 field1826 = class175.method1195(40, "Loaded textures");

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "Lob;")
    private static class141 field1821 = class175.method1195(40, "Existing User");

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "Lob;")
    public static class141 field1816 = field1826;

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "Lob;")
    private static class141 field1822 = class175.method1195(40, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!jb", name = "fb", descriptor = "Lob;")
    public static class141 field1825 = field1822;

    @OriginalMember(owner = "client!jb", name = "jb", descriptor = "Lob;")
    public static class141 field1829 = field1821;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "Lvc;")
    public static class212 field1813 = new class212(128);

    @OriginalMember(owner = "client!jb", name = "mb", descriptor = "Lob;")
    public static class141 field1832 = class175.method1195(40, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!jb", name = "nb", descriptor = "Lob;")
    private static class141 field1833 = class175.method1195(40, "Error connecting to server)3");

    @OriginalMember(owner = "client!jb", name = "ob", descriptor = "Lob;")
    public static class141 field1834 = field1833;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!jb", name = "db", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!jb", name = "hb", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!jb", name = "kb", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
    public class91() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "(I)V")
    public static void method623(int arg0) {
        if (arg0 != 25447) {
            method623(-108);
        }
        field1815 = null;
        field1829 = null;
        field1826 = null;
        field1822 = null;
        field1821 = null;
        field1833 = null;
        field1813 = null;
        field1825 = null;
        field1834 = null;
        field1816 = null;
        field1832 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            this.field1831 = arg2.method1007(121);
                        }
                    } else {
                        this.field1819 = arg2.method1007(70);
                    }
                } else {
                    this.field1824 = arg2.method991(255);
                }
            } else {
                this.field1814 = arg2.method1007(92);
            }
        } else {
            this.field1828 = arg2.method991(255);
        }
        int var5 = 51 % ((66 - arg1) / 57);
        ++field1820;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        ++field1817;
        if (arg0 < 13) {
            field1816 = null;
        }
        int[] var3 = super.field100.method842(arg1, 12);
        if (super.field100.field2534) {
            int var4 = this.field1831 >> 1;
            int[][] var5 = super.field100.method845(2);
            Random var6 = new Random((long) this.field1828);
            for (int var7 = 0; this.field1814 > var7; ++var7) {
                int var8 = ~this.field1831 < -1 ? this.field1819 - var4 - -class209.method1367((byte) 113, var6, this.field1831) : this.field1819;
                int var9 = class209.method1367((byte) 95, var6, class117.field2272);
                int var10 = (var8 & 4083) >> 4;
                int var11 = class209.method1367((byte) 125, var6, class60.field1174);
                int var12 = (class172.field3413[var10] * this.field1824 >> 12) + var11;
                int var13 = (class135.field2566[var10] * this.field1824 >> 12) + var9;
                int var14 = -var9 + var13;
                int var15 = -var11 + var12;
                if (~var14 != -1 || var15 != 0) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var14 > ~var15;
                    if (var16) {
                        int var17 = var13;
                        int var18 = var9;
                        var13 = var12;
                        var9 = var11;
                        var12 = var17;
                        var11 = var18;
                    }
                    if (~var13 > ~var9) {
                        int var19 = var9;
                        var9 = var13;
                        int var20 = var11;
                        var13 = var19;
                        var11 = var12;
                        var12 = var20;
                    }
                    int var21 = var11;
                    int var22 = var13 - var9;
                    int var23 = -var11 + var12;
                    int var24 = 2048 / var22;
                    int var25 = -var22 / 2;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var26 = var12 > var11 ? 1 : -1;
                    int var27 = 1024 - (class209.method1367((byte) 118, var6, 4096) >> 2);
                    for (int var28 = var9; ~var28 > ~var13; ++var28) {
                        var25 += var23;
                        int var29 = var27 - -1024 - -((-var9 + var28) * var24);
                        int var30 = var28 & class106.field2030;
                        int var31 = class54.field1050 & var21;
                        if (~var25 < -1) {
                            var21 += var26;
                            var25 += -var22;
                        }
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLpe;)V")
    public static final void method624(byte arg0, class154 arg1) {
        ++field1830;
        class123.field2356 = arg1;
        if (arg0 > -103) {
            field1826 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)V")
    public final void method47(int arg0) {
        ++field1812;
        class54.method359(arg0);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)V")
    public static final void method625(boolean arg0) {
        class29.field565 = false;
        if (!arg0) {
            field1821 = null;
        }
        ++field1818;
        class8.field128 = false;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BIII)I")
    public static final int method626(byte arg0, int arg1, int arg2, int arg3) {
        ++field1827;
        int var4 = arg2 & 3;
        if (var4 == 0) {
            return arg1;
        } else {
            if (arg0 <= 28) {
                field1829 = null;
            }
            if (~var4 == -2) {
                return arg3;
            } else {
                return ~var4 == -3 ? -arg1 + 7 : -arg3 + 7;
            }
        }
    }
}
