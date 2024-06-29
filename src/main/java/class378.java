import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class378 extends class436 {

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    private int field4963;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    private int field4968;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
    private int field4970;

    @OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
    private int field4978;

    @OriginalMember(owner = "client!vi", name = "H", descriptor = "Lpp;")
    public static class269 field4979 = new class269("LIVE", 0);

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "F")
    public static float field4975;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    private int field4964;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    private int field4966;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
    private int field4971;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "I")
    private int field4973;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!vi", name = "F", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "[B")
    private byte[] field4965;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "[I")
    public static int[] field4967;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIB)V")
    public final void method1716(int arg0, int arg1, byte arg2) {
        if (arg2 != 41) {
            return;
        }
        if (arg1 == 0) {
            this.field4966 = this.field4963 - (arg0 < 0 ? -arg0 : arg0);
            this.field4966 = this.field4966 * this.field4966 >> 12;
            this.field4964 = 4096;
            this.field4971 = this.field4966;
        } else {
            this.field4964 = this.field4968 * this.field4966 >> 12;
            if (this.field4964 < 0) {
                this.field4964 = 0;
            } else if (this.field4964 > 4096) {
                this.field4964 = 4096;
            }
            this.field4966 = this.field4963 - (arg0 >= 0 ? arg0 : -arg0);
            this.field4966 = this.field4966 * this.field4966 >> 12;
            this.field4966 = this.field4966 * this.field4964 >> 12;
            this.field4971 += this.field4978 * this.field4966 >> 12;
            this.field4978 = this.field4978 * this.field4970 >> 12;
        }
        field4969++;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V")
    public final void method1711(boolean arg0) {
        this.field4971 >>= 0x4;
        field4976++;
        this.field4978 = this.field4970;
        if (!arg0) {
            method2143((byte) 111);
        }
        if (this.field4971 < 0) {
            this.field4971 = 0;
        } else if (this.field4971 > 255) {
            this.field4971 = 255;
        }
        this.method982(102, (byte) this.field4971, this.field4973++);
        this.field4971 = 0;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
    public static final void method2143(byte arg0) {
        field4972++;
        int var1 = class212.field2731 * 128 + 64;
        int var2 = class450.field6452 * 128 + 64;
        int var3 = class151.method991(var2, false, class276.field3488, var1) - class80.field1029;
        if (class186.field2427 < 100) {
            if (var1 > class310.field3971) {
                class310.field3971 += (var1 - class310.field3971) * class186.field2427 / 1000 + class475.field6884;
                if (class310.field3971 > var1) {
                    class310.field3971 = var1;
                }
            }
            if (class310.field3971 > var1) {
                class310.field3971 -= (class310.field3971 - var1) * class186.field2427 / 1000 + class475.field6884;
                if (class310.field3971 < var1) {
                    class310.field3971 = var1;
                }
            }
            if (class286.field3665 < var3) {
                class286.field3665 += (var3 - class286.field3665) * class186.field2427 / 1000 + class475.field6884;
                if (var3 < class286.field3665) {
                    class286.field3665 = var3;
                }
            }
            if (var3 < class286.field3665) {
                class286.field3665 -= class475.field6884 + ((class286.field3665 - var3) * class186.field2427 / 1000);
                if (class286.field3665 < var3) {
                    class286.field3665 = var3;
                }
            }
            if (class193.field2500 < var2) {
                class193.field2500 += class475.field6884 + ((var2 - class193.field2500) * class186.field2427 / 1000);
                if (class193.field2500 > var2) {
                    class193.field2500 = var2;
                }
            }
            if (class193.field2500 > var2) {
                class193.field2500 -= (class193.field2500 - var2) * class186.field2427 / 1000 + class475.field6884;
                if (class193.field2500 < var2) {
                    class193.field2500 = var2;
                }
            }
        } else {
            class193.field2500 = class450.field6452 * 128 + 64;
            class310.field3971 = class212.field2731 * 128 + 64;
            class286.field3665 = class151.method991(class193.field2500, false, class276.field3488, class310.field3971) - class80.field1029;
        }
        int var4 = class445.field6382 * 128 + 64;
        int var5 = class253.field3222 * 128 + 64;
        int var6 = class151.method991(var5, false, class276.field3488, var4) - class116.field1571;
        int var7 = var4 - class310.field3971;
        if (arg0 < 46) {
            field4979 = null;
        }
        int var8 = var6 - class286.field3665;
        int var9 = var5 - class193.field2500;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class80.field1030 < var11) {
            class80.field1030 += (var11 - class80.field1030 >> 3) * class320.field4063 / 1000 + class125.field1670 << 3;
            if (var11 < class80.field1030) {
                class80.field1030 = var11;
            }
        }
        if (class80.field1030 > var11) {
            class80.field1030 -= class125.field1670 + ((class80.field1030 - var11 >> 3) * class320.field4063 / 1000) << 3;
            if (class80.field1030 < var11) {
                class80.field1030 = var11;
            }
        }
        int var13 = var12 - class365.field4747;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class365.field4747 += class125.field1670 + (class320.field4063 * var14 / 1000) << 3;
            class365.field4747 &= 0x3FFF;
        }
        if (var14 < 0) {
            class365.field4747 -= -var14 * class320.field4063 / 1000 + class125.field1670 << 3;
            class365.field4747 &= 0x3FFF;
        }
        int var15 = var12 - class365.field4747;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class365.field4747 = var12;
        }
        class347.field4462 = 0;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)V")
    public static void method2144(boolean arg0) {
        field4979 = null;
        if (arg0) {
            field4967 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public final void method1713(int arg0) {
        this.field4973 = 0;
        field4974++;
        if (arg0 != -32685) {
            this.method1711(true);
        }
        this.field4971 = 0;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IBI)V")
    public void method982(int arg0, byte arg1, int arg2) {
        field4977++;
        if (arg0 > 100) {
            this.field4965[arg2] = arg1;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class378(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4963 = (int) (arg6 * 4096.0F);
        this.field4968 = (int) (arg7 * 4096.0F);
        this.field4978 = this.field4970 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)I")
    public static int method2145(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
