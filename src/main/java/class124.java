import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class124 extends class61 {

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public int field2165 = 0;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "Lng;")
    public static class139 field2168 = new class139(30);

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "Llc;")
    public static class143 field2183 = class66.method374("Eingabeprozedur geladen)3", -1);

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "Lng;")
    public static class139 field2185 = new class139(64);

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "[I")
    public static int[] field2187 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "Lbg;")
    public static class177 field2186 = new class177(16);

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public int field2162;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public int field2163;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public int field2166;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public int field2169;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public int field2172;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "I")
    public int field2175;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public int field2176;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
    public int field2177;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "I")
    public int field2180;

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
    public int field2182;

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Li;")
    public class187 field2164;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "Lfj;")
    public class209 field2174;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "Lrc;")
    public class288 field2170;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "Lrc;")
    public class288 field2171;

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "Ldl;")
    public class32 field2181;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Z")
    public boolean field2167;

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "[I")
    public int[] field2179;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static void method747(byte arg0) {
        field2185 = null;
        field2168 = null;
        field2186 = null;
        field2187 = null;
        if (arg0 != -98) {
            field2186 = null;
        }
        field2183 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)I")
    public static final int method748(int arg0, int arg1, int arg2) {
        field2173++;
        class162 var3 = (class162) class143.field2518.method1824((long) arg2, arg0 + 8128);
        if (var3 == null) {
            return 0;
        } else if (arg0 == -8128) {
            return arg1 >= 0 && arg1 < var3.field2911.length ? var3.field2911[arg1] : 0;
        } else {
            return -44;
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
    public final void method749(int arg0) {
        field2178++;
        int var2 = this.field2175;
        if (this.field2174 != null) {
            class209 var3 = this.field2174.method1467((byte) -120);
            if (var3 == null) {
                this.field2166 = 0;
                this.field2177 = 0;
                this.field2175 = -1;
                this.field2172 = 0;
                this.field2179 = null;
            } else {
                this.field2179 = var3.field3858;
                this.field2172 = var3.field3878;
                this.field2177 = var3.field3864;
                this.field2166 = var3.field3880 * 128;
                this.field2175 = var3.field3873;
            }
        } else if (this.field2164 != null) {
            int var4 = class145.method921(-1, this.field2164);
            if (var2 != var4) {
                this.field2175 = var4;
                class85 var5 = this.field2164.field3384;
                if (var5.field1538 != null) {
                    var5 = var5.method489(-23677);
                }
                if (var5 == null) {
                    this.field2166 = 0;
                } else {
                    this.field2166 = var5.field1532 * 128;
                }
            }
        } else if (this.field2181 != null) {
            this.field2175 = class272.method1799(this.field2181, 29875);
            this.field2166 = this.field2181.field543 * 128;
        }
        if (arg0 >= 24 && this.field2175 != var2 && this.field2171 != null) {
            class86.field1578.method1000(this.field2171);
            this.field2171 = null;
        }
    }
}
