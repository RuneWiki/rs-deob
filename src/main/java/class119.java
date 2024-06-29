import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class119 extends class66 {

    @OriginalMember(owner = "client!kc", name = "V", descriptor = "I")
    public int field1930 = 0;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "Z")
    public static boolean field1921 = false;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "Lor;")
    public static class594 field1909 = new class594();

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public int field1901;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public int field1902;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    public int field1904;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public int field1905;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
    public int field1910;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
    public int field1914;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
    public int field1916;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    public int field1920;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    public int field1923;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
    public int field1924;

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
    public int field1925;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "I")
    public int field1926;

    @OriginalMember(owner = "client!kc", name = "U", descriptor = "I")
    public int field1929;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "Lqga;")
    public class169 field1911;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "Lqga;")
    public class169 field1917;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "Lkg;")
    public class249 field1912;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "Lkg;")
    public class249 field1922;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "Lpba;")
    public class304 field1907;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "Lsp;")
    public class589 field1918;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "Lqr;")
    public class59 field1903;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "Lqr;")
    public class59 field1908;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "Llr;")
    public class698 field1906;

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "Z")
    public boolean field1913;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "Z")
    public boolean field1927;

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "Z")
    public boolean field1928;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "[I")
    public int[] field1919;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static void method1068(int arg0) {
        if (arg0 != 0) {
            method1068(-30);
        }
        field1909 = null;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
    public final void method1069(int arg0) {
        field1915++;
        int var2 = this.field1923;
        boolean var3 = this.field1928;
        if (this.field1906 != null) {
            class698 var6 = this.field1906.method3934(class539.field7869, -27);
            if (var6 == null) {
                this.field1923 = -1;
                this.field1901 = 0;
                this.field1928 = false;
                this.field1926 = 0;
                this.field1916 = 256;
                this.field1910 = 256;
                this.field1920 = 0;
                this.field1919 = null;
                this.field1913 = false;
                this.field1929 = 0;
            } else {
                this.field1919 = var6.field9779;
                this.field1910 = var6.field9833;
                this.field1929 = var6.field9781 << 9;
                this.field1923 = var6.field9800;
                this.field1913 = var6.field9789;
                this.field1926 = var6.field9797;
                this.field1901 = var6.field9817;
                this.field1928 = var6.field9815;
                this.field1916 = var6.field9814;
                this.field1920 = var6.field9795;
            }
        } else if (this.field1918 != null) {
            int var4 = class20.method361(115, this.field1918);
            if (var2 != var4) {
                this.field1923 = var4;
                class705 var5 = this.field1918.field8354;
                if (var5.field9912 != null) {
                    var5 = var5.method3973(true, class539.field7869);
                }
                if (var5 == null) {
                    this.field1916 = 256;
                    this.field1928 = this.field1918.field8354.field9976;
                    this.field1920 = this.field1929 = 0;
                    this.field1910 = 256;
                } else {
                    this.field1910 = var5.field9963;
                    this.field1916 = var5.field9977;
                    this.field1928 = var5.field9976;
                    this.field1929 = var5.field9932 << 9;
                    this.field1920 = var5.field9933;
                }
            }
        } else if (this.field1907 != null) {
            this.field1923 = class174.method1418((byte) -91, this.field1907);
            this.field1916 = 256;
            this.field1928 = this.field1907.field4766;
            this.field1910 = 256;
            this.field1920 = this.field1907.field4786;
            this.field1929 = this.field1907.field4761 << 9;
        }
        if ((this.field1923 != var2 || this.field1928 != var3) && this.field1911 != null) {
            class505.field7381.method1985(this.field1911);
            this.field1908 = null;
            this.field1911 = null;
            this.field1922 = null;
        }
        if (arg0 >= -48) {
            method1068(-50);
        }
    }
}
