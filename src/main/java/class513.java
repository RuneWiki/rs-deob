import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class513 extends class577 {

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
    public int field7237 = 0;

    @OriginalMember(owner = "client!kp", name = "C", descriptor = "B")
    public static byte field7251 = -6;

    @OriginalMember(owner = "client!kp", name = "F", descriptor = "Lfba;")
    public static class27 field7254 = new class27(50, 8);

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
    public int field7234;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
    public int field7235;

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "I")
    public int field7243;

    @OriginalMember(owner = "client!kp", name = "w", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!kp", name = "y", descriptor = "I")
    public int field7247;

    @OriginalMember(owner = "client!kp", name = "A", descriptor = "I")
    public int field7249;

    @OriginalMember(owner = "client!kp", name = "B", descriptor = "I")
    public int field7250;

    @OriginalMember(owner = "client!kp", name = "E", descriptor = "I")
    public int field7253;

    @OriginalMember(owner = "client!kp", name = "H", descriptor = "I")
    public int field7256;

    @OriginalMember(owner = "client!kp", name = "J", descriptor = "I")
    public int field7258;

    @OriginalMember(owner = "client!kp", name = "K", descriptor = "I")
    public int field7259;

    @OriginalMember(owner = "client!kp", name = "N", descriptor = "I")
    public int field7262;

    @OriginalMember(owner = "client!kp", name = "O", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!kp", name = "P", descriptor = "I")
    public int field7264;

    @OriginalMember(owner = "client!kp", name = "Q", descriptor = "I")
    public int field7265;

    @OriginalMember(owner = "client!kp", name = "S", descriptor = "I")
    public int field7266;

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "Ldfa;")
    public class175 field7238;

    @OriginalMember(owner = "client!kp", name = "x", descriptor = "Ldfa;")
    public class175 field7246;

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "Lqk;")
    public class18 field7236;

    @OriginalMember(owner = "client!kp", name = "D", descriptor = "Lqk;")
    public class18 field7252;

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "Ldga;")
    public class218 field7240;

    @OriginalMember(owner = "client!kp", name = "L", descriptor = "Ldga;")
    public class218 field7260;

    @OriginalMember(owner = "client!kp", name = "M", descriptor = "Lkv;")
    public class282 field7261;

    @OriginalMember(owner = "client!kp", name = "z", descriptor = "Lav;")
    public class665 field7248;

    @OriginalMember(owner = "client!kp", name = "I", descriptor = "Lfb;")
    public class702 field7257;

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "Z")
    public boolean field7241;

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "Z")
    public boolean field7242;

    @OriginalMember(owner = "client!kp", name = "v", descriptor = "Z")
    public boolean field7244;

    @OriginalMember(owner = "client!kp", name = "G", descriptor = "[I")
    public int[] field7255;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V", line = 9)
    public static final void method3094(int arg0) {
        if (~class632.field8877 != arg0) {
            if (class527.field7529 != null) {
                class527.field7529.method612((byte) 114);
                class527.field7529 = null;
            }
            class613.method3559(-6878);
            class107.method825((byte) -113);
        }
        field7239++;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V", line = 60)
    public final void method3095(int arg0) {
        field7245++;
        if (arg0 < 59) {
            method3096(-54);
        }
        int var2 = this.field7266;
        boolean var3 = this.field7244;
        if (this.field7261 != null) {
            class282 var6 = this.field7261.method1826(class537.field7727, 51);
            if (var6 == null) {
                this.field7249 = 0;
                this.field7253 = 0;
                this.field7255 = null;
                this.field7244 = false;
                this.field7250 = 0;
                this.field7247 = 256;
                this.field7234 = 0;
                this.field7243 = 0;
                this.field7266 = -1;
                this.field7265 = 256;
                this.field7242 = false;
            } else {
                this.field7265 = var6.field4152;
                this.field7266 = var6.field4148;
                this.field7234 = var6.field4140;
                this.field7250 = var6.field4096;
                this.field7244 = var6.field4173;
                this.field7255 = var6.field4167;
                this.field7253 = var6.field4170 << 9;
                this.field7242 = var6.field4146;
                this.field7243 = var6.field4132;
                this.field7247 = var6.field4136;
            }
        } else if (this.field7248 != null) {
            int var4 = class48.method339(this.field7248, true);
            if (var2 != var4) {
                this.field7266 = var4;
                class110 var5 = this.field7248.field9240;
                if (var5.field1657 != null) {
                    var5 = var5.method840(class537.field7727, -31);
                }
                if (var5 == null) {
                    this.field7247 = 256;
                    this.field7244 = this.field7248.field9240.field1625;
                    this.field7265 = 256;
                    this.field7234 = this.field7253 = this.field7249 = 0;
                } else {
                    this.field7247 = var5.field1668;
                    this.field7265 = var5.field1627;
                    this.field7249 = var5.field1650 << 9;
                    this.field7244 = var5.field1625;
                    this.field7253 = var5.field1628 << 9;
                    this.field7234 = var5.field1647;
                }
            }
        } else if (this.field7257 != null) {
            this.field7266 = class680.method3854(false, this.field7257);
            this.field7247 = 256;
            this.field7234 = this.field7257.field9782;
            this.field7253 = this.field7257.field9760 << 9;
            this.field7265 = 256;
            this.field7244 = this.field7257.field9759;
            this.field7249 = 0;
        }
        if (this.field7266 == var2 && this.field7244 == var3) {
            return;
        }
        if (this.field7236 == null) {
            return;
        }
        class184.field2828.method426(this.field7236);
        this.field7238 = null;
        this.field7240 = null;
        this.field7236 = null;
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)V", line = 181)
    public static void method3096(int arg0) {
        field7254 = null;
        if (arg0 != 1) {
            method3094(2);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIII)I", line = 197)
    public static final int method3097(int arg0, int arg1, int arg2, int arg3) {
        field7263++;
        int var4 = arg2 / arg0;
        int var5 = arg0 - 1 & arg2;
        if (arg1 != -1640) {
            field7251 = -47;
        }
        int var6 = arg3 / arg0;
        int var7 = arg3 & arg0 - 1;
        int var8 = class571.method3362(var6, var4, 111);
        int var9 = class571.method3362(var6, var4 + 1, 77);
        int var10 = class571.method3362(var6 + 1, var4, 99);
        int var11 = class571.method3362(var6 + 1, var4 + 1, 106);
        int var12 = class492.method2930(22666, var9, var8, arg0, var5);
        int var13 = class492.method2930(22666, var11, var10, arg0, var5);
        return class492.method2930(22666, var13, var12, arg0, var7);
    }
}
