import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class164 extends class329 {

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "I")
    public int field2160 = 0;

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "Lwp;")
    public static class453 field2161 = new class453(103, 10);

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public int field2145;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    public int field2148;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public int field2149;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
    public int field2150;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
    public int field2153;

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "I")
    public int field2158;

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
    public int field2159;

    @OriginalMember(owner = "client!ql", name = "C", descriptor = "I")
    public int field2162;

    @OriginalMember(owner = "client!ql", name = "D", descriptor = "I")
    public int field2163;

    @OriginalMember(owner = "client!ql", name = "G", descriptor = "I")
    public int field2166;

    @OriginalMember(owner = "client!ql", name = "J", descriptor = "I")
    public int field2169;

    @OriginalMember(owner = "client!ql", name = "H", descriptor = "Lac;")
    public class307 field2167;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "Lgo;")
    public class416 field2151;

    @OriginalMember(owner = "client!ql", name = "I", descriptor = "Lgo;")
    public class416 field2168;

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "Lbda;")
    public class441 field2155;

    @OriginalMember(owner = "client!ql", name = "F", descriptor = "Lqi;")
    public class514 field2165;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "Lhw;")
    public class519 field2156;

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "Lhw;")
    public class519 field2170;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "Loaa;")
    public class555 field2147;

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "Loaa;")
    public class555 field2171;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "Z")
    public boolean field2144;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "Z")
    public boolean field2154;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "Z")
    public boolean field2157;

    @OriginalMember(owner = "client!ql", name = "E", descriptor = "[I")
    public int[] field2164;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)I", line = 12)
    public static final int method936(int arg0) {
        if (arg0 != 0) {
            field2161 = null;
        }
        field2152++;
        return class608.field8541;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V", line = 29)
    public final void method937(byte arg0) {
        field2146++;
        if (arg0 != -99) {
            return;
        }
        int var2 = this.field2149;
        boolean var3 = this.field2157;
        if (this.field2155 != null) {
            class441 var4 = this.field2155.method2355(class684.field9606, -1643);
            if (var4 == null) {
                this.field2169 = 0;
                this.field2145 = 0;
                this.field2148 = 0;
                this.field2157 = false;
                this.field2164 = null;
                this.field2144 = false;
                this.field2149 = -1;
                this.field2153 = 0;
            } else {
                this.field2148 = var4.field5555;
                this.field2164 = var4.field5512;
                this.field2157 = var4.field5579;
                this.field2169 = var4.field5511;
                this.field2145 = var4.field5593;
                this.field2149 = var4.field5590;
                this.field2144 = var4.field5561;
                this.field2153 = var4.field5557 << 9;
            }
        } else if (this.field2167 != null) {
            int var5 = class494.method2667(false, this.field2167);
            if (var2 != var5) {
                this.field2149 = var5;
                class586 var6 = this.field2167.field3902;
                if (var6.field8205 != null) {
                    var6 = var6.method3220(-4261, class684.field9606);
                }
                if (var6 == null) {
                    this.field2169 = this.field2153 = 0;
                    this.field2157 = this.field2167.field3902.field8189;
                } else {
                    this.field2153 = var6.field8235 << 9;
                    this.field2169 = var6.field8175;
                    this.field2157 = var6.field8189;
                }
            }
        } else if (this.field2165 != null) {
            this.field2149 = class259.method1512(this.field2165, false);
            this.field2153 = this.field2165.field7006 << 9;
            this.field2169 = this.field2165.field7023;
            this.field2157 = this.field2165.field7001;
        }
        if (this.field2149 == var2 && this.field2157 == var3) {
            return;
        }
        if (this.field2170 == null) {
            return;
        }
        class480.field6387.method1295(this.field2170);
        this.field2147 = null;
        this.field2151 = null;
        this.field2170 = null;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V", line = 140)
    public static void method938(int arg0) {
        field2161 = null;
        if (arg0 != 103) {
            method938(-84);
        }
    }
}
