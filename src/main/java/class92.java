import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class92 extends class34 {

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    public int field1822 = 0;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "Z")
    public static boolean field1815 = false;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "[Lcc;")
    public static class209[] field1819 = new class209[1000];

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
    public static int field1824 = 0;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "Lcc;")
    public static class209 field1832 = class95.method669(110, "showVideoAd");

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public int field1810;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public int field1812;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public int field1813;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public int field1816;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
    public int field1820;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "I")
    public int field1825;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    public int field1826;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    public int field1827;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
    public int field1828;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
    public int field1831;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "Lde;")
    public class108 field1818;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "Lfd;")
    public class121 field1811;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "Lfd;")
    public class121 field1830;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "Lek;")
    public class163 field1829;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "Lck;")
    public class218 field1821;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "Z")
    public boolean field1814;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "[I")
    public int[] field1817;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V")
    public final void method647(int arg0) {
        field1823++;
        int var2 = this.field1812;
        if (arg0 != 0) {
            field1824 = -123;
        }
        if (this.field1821 != null) {
            class218 var3 = this.field1821.method1535((byte) -119);
            if (var3 == null) {
                this.field1816 = 0;
                this.field1831 = 0;
                this.field1812 = -1;
                this.field1826 = 0;
                this.field1817 = null;
            } else {
                this.field1817 = var3.field3980;
                this.field1826 = var3.field3934;
                this.field1816 = var3.field3931;
                this.field1831 = var3.field3976 * 128;
                this.field1812 = var3.field3923;
            }
        } else if (this.field1829 != null) {
            int var4 = class210.method1494(-124, this.field1829);
            if (var2 != var4) {
                this.field1812 = var4;
                class237 var5 = this.field1829.field2969;
                if (var5.field4295 != null) {
                    var5 = var5.method1636(93);
                }
                if (var5 == null) {
                    this.field1831 = 0;
                } else {
                    this.field1831 = var5.field4252 * 128;
                }
            }
        } else if (this.field1818 != null) {
            this.field1812 = class200.method1369(this.field1818, -104);
            this.field1831 = this.field1818.field2150 * 128;
        }
        if (this.field1812 != var2 && this.field1830 != null) {
            class47.field906.method1519(this.field1830);
            this.field1830 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)V")
    public static void method648(int arg0) {
        field1819 = null;
        if (arg0 == 0) {
            field1832 = null;
        }
    }
}
