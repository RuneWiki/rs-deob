import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class17 {

    @OriginalMember(owner = "client!as", name = "c", descriptor = "F")
    public float field276 = 1.0F;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "F")
    public float field277 = 1.0F;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "F")
    public float field281 = 0.25F;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "F")
    public float field285;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    public int field283;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "F")
    public float field288;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public int field275;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public int field280;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "F")
    public float field274;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "I")
    public int field282;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "Lvh;")
    public class191 field286;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "I")
    public int field289;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "I")
    public int field284;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public static int field279 = 0;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!as", name = "q", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "()V", line = 91)
    public class17() {
        this.field285 = 0.69921875F;
        this.field283 = 0;
        this.field288 = 1.1523438F;
        this.field275 = class344.field4380;
        this.field280 = -50;
        this.field274 = 1.2F;
        this.field282 = -50;
        this.field286 = class200.field2584;
        this.field289 = -60;
        this.field284 = class343.field4370;
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lbt;)V", line = 108)
    public class17(class88 arg0) {
        int var2 = arg0.method617(2);
        if (class421.field5647.method3102(class520.field7690, (byte) 48) && class91.field1263.method843() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field284 = class343.field4370;
            } else {
                this.field284 = arg0.method578(103);
            }
            if ((var2 & 0x2) == 0) {
                this.field288 = 1.1523438F;
            } else {
                this.field288 = (float) arg0.method568((byte) 110) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field285 = 0.69921875F;
            } else {
                this.field285 = (float) arg0.method568((byte) 110) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field274 = 1.2F;
            } else {
                this.field274 = (float) arg0.method568((byte) 110) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method578(99);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method568((byte) 110);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method568((byte) 110);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method568((byte) 110);
            }
            this.field274 = 1.2F;
            this.field285 = 0.69921875F;
            this.field284 = class343.field4370;
            this.field288 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field282 = -50;
            this.field280 = -50;
            this.field289 = -60;
        } else {
            this.field282 = arg0.method603((byte) -91);
            this.field289 = arg0.method603((byte) 119);
            this.field280 = arg0.method603((byte) -31);
        }
        if ((var2 & 0x20) == 0) {
            this.field275 = class344.field4380;
        } else {
            this.field275 = arg0.method578(124);
        }
        if ((var2 & 0x40) == 0) {
            this.field283 = 0;
        } else {
            this.field283 = arg0.method568((byte) 110);
        }
        if ((var2 & 0x80) == 0) {
            this.field286 = class200.field2584;
        } else {
            int var3 = arg0.method568((byte) 110);
            int var4 = arg0.method568((byte) 110);
            int var5 = arg0.method568((byte) 110);
            int var6 = arg0.method568((byte) 110);
            int var7 = arg0.method568((byte) 110);
            int var8 = arg0.method568((byte) 110);
            this.field286 = class261.method1633(var5, var3, var7, var6, var8, var4, 0);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Las;Z)Z", line = 18)
    public final boolean method108(class17 arg0, boolean arg1) {
        if (arg1) {
            field290++;
            return this.field284 == arg0.field284 && this.field288 == arg0.field288 && this.field285 == arg0.field285 && this.field274 == arg0.field274 && this.field281 == arg0.field281 && this.field277 == arg0.field277 && this.field276 == arg0.field276 && this.field275 == arg0.field275 && this.field283 == arg0.field283 && this.field286 == arg0.field286;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BLbt;)V", line = 32)
    public final void method109(byte arg0, class88 arg1) {
        field287++;
        this.field277 = (float) (arg1.method617(2) * 8) / 255.0F;
        this.field281 = (float) (arg1.method617(2) * 8) / 255.0F;
        if (arg0 < 65) {
            this.field280 = -63;
        }
        this.field276 = (float) (arg1.method617(2) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIII)I", line = 64)
    public static final int method110(int arg0, int arg1, int arg2, int arg3) {
        field278++;
        int var4 = arg0 / arg3;
        int var5 = arg3 - 1 & arg0;
        int var6 = arg1 / arg3;
        int var7 = arg2 + arg3 & arg1;
        int var8 = class103.method690(var4, 1, var6);
        int var9 = class103.method690(var4 + 1, 1, var6);
        int var10 = class103.method690(var4, 1, var6 + 1);
        int var11 = class103.method690(var4 + 1, arg2 ^ 0xFFFFFFFE, var6 + 1);
        int var12 = class418.method2459(var8, var5, var9, arg3, (byte) -29);
        int var13 = class418.method2459(var10, var5, var11, arg3, (byte) -73);
        return class418.method2459(var12, var7, var13, arg3, (byte) -43);
    }
}
