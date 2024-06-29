import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class91 extends class236 {

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    public int field1832 = 0;

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "Lsg;")
    public static class30 field1842 = class167.method1221((byte) 33, "hint_mapmarkers");

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "Lsg;")
    public static class30 field1847 = class167.method1221((byte) 33, "<)4col> x");

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "I")
    public static int field1851 = 128;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public int field1828;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
    public int field1834;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "I")
    public int field1836;

    @OriginalMember(owner = "client!pk", name = "D", descriptor = "I")
    public int field1839;

    @OriginalMember(owner = "client!pk", name = "F", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
    public int field1844;

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "I")
    public int field1845;

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
    public int field1846;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
    public int field1850;

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "I")
    public int field1852;

    @OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
    public int field1854;

    @OriginalMember(owner = "client!pk", name = "H", descriptor = "Lva;")
    public class120 field1843;

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "Lmc;")
    public static class151 field1837;

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "Lrc;")
    public class275 field1838;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "Lm;")
    public class38 field1829;

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "Lm;")
    public class38 field1848;

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "Lwe;")
    public class40 field1853;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "Z")
    public boolean field1830;

    @OriginalMember(owner = "client!pk", name = "E", descriptor = "[I")
    public int[] field1840;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
    public final void method740(byte arg0) {
        field1835++;
        int var2 = this.field1836;
        if (arg0 != -40) {
            method741(78, -5, -87, 122, 22, -57, true, 15, 47);
        }
        if (this.field1853 != null) {
            class40 var5 = this.field1853.method418((byte) 120);
            if (var5 == null) {
                this.field1840 = null;
                this.field1845 = 0;
                this.field1854 = 0;
                this.field1852 = 0;
                this.field1836 = -1;
            } else {
                this.field1836 = var5.field950;
                this.field1840 = var5.field993;
                this.field1854 = var5.field942;
                this.field1845 = var5.field946 * 128;
                this.field1852 = var5.field940;
            }
        } else if (this.field1838 != null) {
            int var3 = class31.method316(this.field1838, arg0 + 39);
            if (var2 != var3) {
                this.field1836 = var3;
                class241 var4 = this.field1838.field4805;
                if (var4.field4295 != null) {
                    var4 = var4.method1700((byte) 59);
                }
                if (var4 == null) {
                    this.field1845 = 0;
                } else {
                    this.field1845 = var4.field4273 * 128;
                }
            }
        } else if (this.field1843 != null) {
            this.field1836 = class201.method1426(92, this.field1843);
            this.field1845 = this.field1843.field2358 * 128;
        }
        if (this.field1836 != var2 && this.field1829 != null) {
            class127.field2469.method186(this.field1829);
            this.field1829 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIZII)V")
    public static final void method741(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field1831++;
        int var9 = arg3 - arg7;
        int var10 = (arg8 - arg2 << 16) / var9;
        if (arg6) {
            int var11 = arg5 - arg0;
            int var12 = (arg1 - arg4 << 16) / var11;
            class88.method733(arg7, var10, 0, arg3, arg2, arg4, 0, arg0, arg5, var12, 80);
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)V")
    public static void method742(byte arg0) {
        field1842 = null;
        field1847 = null;
        int var1 = -119 % ((6 - arg0) / 53);
        field1837 = null;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)Z")
    public static final boolean method743(int arg0, int arg1) {
        if (arg1 != 128) {
            method743(24, 125);
        }
        field1849++;
        return ((arg0 & 0x3FDB7B3F) >> 29) != 0;
    }
}
