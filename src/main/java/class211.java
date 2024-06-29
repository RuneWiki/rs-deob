import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class211 extends class42 {

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public int field3173 = 0;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "Lge;")
    public static class511 field3186 = new class511(4);

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    public static int field3189 = 0;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "F")
    public static float field3184;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public int field3167;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public int field3169;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public int field3170;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public int field3171;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public int field3175;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    public int field3177;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "I")
    public int field3178;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    public int field3180;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public int field3182;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
    public int field3187;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
    public int field3188;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "Lku;")
    public class261 field3172;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "Lsg;")
    public class279 field3168;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "Lki;")
    public class510 field3179;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "Lcg;")
    public class93 field3181;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "Lcg;")
    public class93 field3183;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "Z")
    public boolean field3166;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "[I")
    public int[] field3176;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 6)
    public final void method1421(int arg0) {
        field3185++;
        int var2 = this.field3178;
        if (this.field3172 != null) {
            class261 var3 = this.field3172.method1679(class84.field1335, 1349439392);
            if (var3 == null) {
                this.field3188 = 0;
                this.field3178 = -1;
                this.field3170 = 0;
                this.field3182 = 0;
                this.field3176 = null;
                this.field3187 = 0;
            } else {
                this.field3187 = var3.field3888;
                this.field3176 = var3.field3853;
                this.field3188 = var3.field3874 << 7;
                this.field3170 = var3.field3876;
                this.field3182 = var3.field3912;
                this.field3178 = var3.field3898;
            }
        } else if (this.field3168 != null) {
            int var4 = class173.method1218(this.field3168, true);
            if (var2 != var4) {
                this.field3178 = var4;
                class311 var5 = this.field3168.field4157;
                if (var5.field4631 != null) {
                    var5 = var5.method1972(class84.field1335, (byte) 102);
                }
                if (var5 == null) {
                    this.field3170 = this.field3188 = 0;
                } else {
                    this.field3188 = var5.field4617 << 7;
                    this.field3170 = var5.field4587;
                }
            }
        } else if (this.field3179 != null) {
            this.field3178 = class182.method1263(2048, this.field3179);
            this.field3170 = this.field3179.field7356;
            this.field3188 = this.field3179.field7405 << 7;
        }
        int var6 = -21 / ((53 - arg0) / 50);
        if (this.field3178 != var2 && this.field3183 != null) {
            class504.field7295.method1587(this.field3183);
            this.field3183 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V", line = 86)
    public static void method1422(byte arg0) {
        field3186 = null;
        int var1 = 82 % ((arg0 + 69) / 32);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZB)I", line = 97)
    public static final int method1423(int arg0, boolean arg1, byte arg2) {
        field3174++;
        if (arg1) {
            return 0;
        }
        class304 var3 = class75.method579(arg1, true, arg0);
        if (var3 == null) {
            return class106.field1598.method1666(1407, arg0).field2;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field4506.length; var5++) {
            if (var3.field4506[var5] == -1) {
                var4++;
            }
        }
        int var6 = var4 + (class106.field1598.method1666(1407, arg0).field2 - var3.field4506.length);
        if (arg2 >= -4) {
            return -36;
        } else {
            return var6;
        }
    }
}
