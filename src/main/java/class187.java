import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class187 extends class163 {

    @OriginalMember(owner = "client!ci", name = "J", descriptor = "I")
    public int field3292 = 0;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "[Log;")
    public static class279[] field3281 = new class279[32768];

    @OriginalMember(owner = "client!ci", name = "G", descriptor = "Lke;")
    public static class256 field3289 = class316.method2202("Lade Liste der Welten", 27626);

    @OriginalMember(owner = "client!ci", name = "Q", descriptor = "[[Z")
    public static boolean[][] field3299 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "I")
    public static int field3287 = 0;

    @OriginalMember(owner = "client!ci", name = "R", descriptor = "Z")
    public static boolean field3300 = false;

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "Lke;")
    public static class256 field3283 = class316.method2202("blaugr-Un:", 27626);

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    public int field3274;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    public int field3275;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "I")
    public int field3280;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
    public int field3282;

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "I")
    public int field3285;

    @OriginalMember(owner = "client!ci", name = "D", descriptor = "I")
    public int field3286;

    @OriginalMember(owner = "client!ci", name = "F", descriptor = "I")
    public int field3288;

    @OriginalMember(owner = "client!ci", name = "L", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!ci", name = "N", descriptor = "I")
    public int field3296;

    @OriginalMember(owner = "client!ci", name = "O", descriptor = "I")
    public int field3297;

    @OriginalMember(owner = "client!ci", name = "P", descriptor = "I")
    public int field3298;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "Lbb;")
    public class133 field3276;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "Lbb;")
    public class133 field3279;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "Lrb;")
    public class144 field3277;

    @OriginalMember(owner = "client!ci", name = "H", descriptor = "Ljk;")
    public class273 field3290;

    @OriginalMember(owner = "client!ci", name = "K", descriptor = "Log;")
    public class279 field3293;

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "Z")
    public boolean field3291;

    @OriginalMember(owner = "client!ci", name = "M", descriptor = "[I")
    public int[] field3295;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V", line = 14)
    public static void method1351(byte arg0) {
        field3283 = null;
        field3299 = (boolean[][]) null;
        field3289 = null;
        field3281 = null;
        if (arg0 != 120) {
            field3283 = (class256) null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)V", line = 29)
    public final void method1352(int arg0) {
        field3294++;
        int var2 = this.field3288;
        if (this.field3290 != null) {
            class273 var5 = this.field3290.method1887(-73);
            if (var5 == null) {
                this.field3288 = -1;
                this.field3274 = 0;
                this.field3298 = 0;
                this.field3296 = 0;
                this.field3295 = null;
            } else {
                this.field3295 = var5.field4708;
                this.field3296 = var5.field4721 * 128;
                this.field3274 = var5.field4716;
                this.field3288 = var5.field4732;
                this.field3298 = var5.field4735;
            }
        } else if (this.field3293 != null) {
            int var3 = class269.method1860(this.field3293, 101);
            if (var2 != var3) {
                class74 var4 = this.field3293.field4860;
                this.field3288 = var3;
                if (var4.field1381 != null) {
                    var4 = var4.method553(4175);
                }
                if (var4 == null) {
                    this.field3296 = 0;
                } else {
                    this.field3296 = var4.field1407 * 128;
                }
            }
        } else if (this.field3277 != null) {
            this.field3288 = class1.method10(this.field3277, arg0 ^ 0xFF);
            this.field3296 = this.field3277.field2545 * 128;
        }
        if (arg0 == 128 && this.field3288 != var2 && this.field3276 != null) {
            class197.field3603.method2237(this.field3276);
            this.field3276 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lke;I)Lke;", line = 128)
    public static final class256 method1353(class256 arg0, int arg1) {
        field3278++;
        int var2 = method1354(arg0, (byte) 121);
        if (var2 == -1) {
            return class134.field2337;
        } else {
            if (arg1 < 96) {
                method1354((class256) null, (byte) -3);
            }
            return class301.field5189.field4124[var2].method1782((byte) 61, class86.field1556, class238.field4058);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lke;B)I", line = 162)
    public static final int method1354(class256 arg0, byte arg1) {
        field3284++;
        if (class301.field5189 == null || arg0.method1799(127) == 0) {
            return -1;
        }
        int var2 = 43 % ((arg1 + 37) / 54);
        for (int var3 = 0; var3 < class301.field5189.field4113; var3++) {
            if (class301.field5189.field4124[var3].method1782((byte) 21, class86.field1556, class238.field4058).method1796(-9743, arg0)) {
                return var3;
            }
        }
        return -1;
    }
}
