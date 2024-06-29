import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class353 extends class56 {

    @OriginalMember(owner = "client!b", name = "G", descriptor = "I")
    private int field4384 = 8192;

    @OriginalMember(owner = "client!b", name = "E", descriptor = "I")
    private int field4382 = 4096;

    @OriginalMember(owner = "client!b", name = "L", descriptor = "I")
    private int field4389 = 0;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "I")
    private int field4381 = 0;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "I")
    private int field4392 = 12288;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    private int field4395 = 2048;

    @OriginalMember(owner = "client!b", name = "I", descriptor = "I")
    private int field4386 = 2048;

    @OriginalMember(owner = "client!b", name = "F", descriptor = "[I")
    public static int[] field4383 = new int[2];

    @OriginalMember(owner = "client!b", name = "K", descriptor = "Lhj;")
    public static class596 field4388 = new class596(74, -2);

    @OriginalMember(owner = "client!b", name = "P", descriptor = "Lhj;")
    public static class596 field4393 = new class596(109, -2);

    @OriginalMember(owner = "client!b", name = "H", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!b", name = "J", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!b", name = "M", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!b", name = "N", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!b", name = "T", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public final void method493(byte arg0) {
        class120.method940((byte) -61);
        int var2 = 14 / ((arg0 - 37) / 62);
        ++field4387;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)[I")
    public final int[] method145(int arg0, int arg1) {
        ++field4394;
        int[] var3 = super.field752.method1308(false, arg1);
        if (arg0 != 0) {
            this.field4384 = -79;
        }
        if (super.field752.field2441) {
            int var4 = class349.field4354[arg1] + -2048;
            for (int var5 = 0; var5 < class642.field8759; ++var5) {
                int var6 = class648.field8837[var5] + -2048;
                int var7 = this.field4395 + var6;
                int var8 = ~var7 > 2047 ? var7 + 4096 : var7;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = this.field4389 + var4;
                int var11 = var10 < -2048 ? var10 + 4096 : var10;
                int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                int var13 = this.field4381 + var6;
                int var14 = ~var13 <= 2047 ? var13 : var13 + 4096;
                int var15 = ~var14 < -2049 ? var14 + -4096 : var14;
                int var16 = this.field4386 + var4;
                int var17 = var16 < -2048 ? var16 + 4096 : var16;
                int var18 = var17 > 2048 ? var17 - 4096 : var17;
                var3[var5] = !this.method2080((byte) 108, var9, var12) && !this.method2081(var18, var15, true) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
    public static void method2079(int arg0) {
        if (arg0 != 21440) {
            field4388 = null;
        }
        field4388 = null;
        field4393 = null;
        field4383 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BII)Z")
    private final boolean method2080(byte arg0, int arg1, int arg2) {
        ++field4385;
        int var4 = (-arg1 + arg2) * this.field4392 >> 12;
        int var5 = class285.field3332[(var4 * 255 & 1045872) >> 12];
        int var6 = (var5 << 12) / this.field4392;
        int var7 = (var6 << 12) / this.field4384;
        int var8 = this.field4382 * var7 >> 12;
        if (arg0 < 60) {
            this.field4382 = 52;
        }
        return arg1 + arg2 < var8 && -var8 < arg1 - -arg2;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BILes;)V")
    public final void method144(byte arg0, int arg1, class403 arg2) {
        ++field4396;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field4384 = arg2.method2390((byte) 73);
                                }
                            } else {
                                this.field4382 = arg2.method2390((byte) 118);
                            }
                        } else {
                            this.field4392 = arg2.method2390((byte) 102);
                        }
                    } else {
                        this.field4386 = arg2.method2390((byte) 109);
                    }
                } else {
                    this.field4381 = arg2.method2390((byte) -97);
                }
            } else {
                this.field4389 = arg2.method2390((byte) 20);
            }
        } else {
            this.field4395 = arg2.method2390((byte) -116);
        }
        if (arg0 > -44) {
            this.field4382 = 17;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class353() {
        super(0, true);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIZ)Z")
    private final boolean method2081(int arg0, int arg1, boolean arg2) {
        ++field4391;
        int var4 = (arg0 - -arg1) * this.field4392 >> 12;
        int var5 = class285.field3332[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field4392;
        if (!arg2) {
            method2079(-121);
        }
        int var7 = (var6 << 12) / this.field4384;
        int var8 = this.field4382 * var7 >> 12;
        return ~var8 < ~(-arg1 + arg0) && ~(-var8) > ~(-arg1 + arg0);
    }
}
