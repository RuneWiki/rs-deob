import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class185 extends class190 {

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public int field3243 = 0;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
    public static int field3261 = 0;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "Lhe;")
    public static class47 field3252 = new class47();

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "I")
    public static int field3271 = 0;

    @OriginalMember(owner = "client!eb", name = "Z", descriptor = "Lqe;")
    private static class168 field3272 = class66.method448("Connection lost)3", -117);

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "Lqe;")
    public static class168 field3269 = field3272;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
    public int field3247;

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "I")
    public int field3248;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
    public int field3254;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
    public int field3256;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    public int field3257;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
    public int field3259;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "I")
    public int field3263;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
    public int field3264;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "I")
    public int field3267;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
    public int field3268;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "Lhh;")
    public class121 field3265;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "Lgg;")
    public class222 field3246;

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "Lwb;")
    public class24 field3250;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "Lwb;")
    public class24 field3266;

    @OriginalMember(owner = "client!eb", name = "ab", descriptor = "Lvb;")
    public static class251 field3273;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "Lkb;")
    public class70 field3244;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "Z")
    public boolean field3258;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "[I")
    public int[] field3253;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Log;B)V")
    public static final void method1209(class18 arg0, byte arg1) {
        arg0.field172 = 0;
        if (arg0.field178 == 0) {
            arg0.field193 = 1024;
        }
        field3251++;
        if (arg0.field178 == 1) {
            arg0.field193 = 1536;
        }
        if (arg0.field178 == 2) {
            arg0.field193 = 0;
        }
        if (arg1 >= -68) {
            return;
        }
        if (arg0.field178 == 3) {
            arg0.field193 = 512;
        }
        int var2 = arg0.field171 * 64 + arg0.field167 * 128;
        int var3 = arg0.field214 - class133.field2326;
        int var4 = arg0.field210 * 128 + arg0.field171 * 64;
        arg0.field190 += (var2 - arg0.field190) / var3;
        arg0.field166 += (var4 - arg0.field166) / var3;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
    public final void method1210(int arg0) {
        field3262++;
        int var2 = this.field3256;
        if (this.field3244 != null) {
            class70 var3 = this.field3244.method471(true);
            if (var3 == null) {
                this.field3264 = 0;
                this.field3253 = null;
                this.field3256 = -1;
                this.field3267 = 0;
                this.field3263 = 0;
            } else {
                this.field3256 = var3.field1021;
                this.field3253 = var3.field1014;
                this.field3263 = var3.field1058;
                this.field3264 = var3.field1061;
                this.field3267 = var3.field1057 * 128;
            }
        } else if (this.field3246 != null) {
            int var4 = class100.method657(4768, this.field3246);
            if (var2 != var4) {
                this.field3256 = var4;
                class180 var5 = this.field3246.field3814;
                if (var5.field3206 != null) {
                    var5 = var5.method1192(-1);
                }
                if (var5 == null) {
                    this.field3267 = 0;
                } else {
                    this.field3267 = var5.field3208 * 128;
                }
            }
        } else if (this.field3265 != null) {
            this.field3256 = class192.method1244(this.field3265, -1);
            this.field3267 = this.field3265.field1996 * 128;
        }
        int var6 = 73 % ((16 - arg0) / 40);
        if (this.field3256 != var2 && this.field3266 != null) {
            class86.field1341.method509(this.field3266);
            this.field3266 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
    public static void method1211(int arg0) {
        field3252 = null;
        field3273 = null;
        field3269 = null;
        if (arg0 != -1) {
            field3252 = null;
        }
        field3272 = null;
    }
}
