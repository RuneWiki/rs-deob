import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class36 {

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "F")
    public float field513 = 1.0F;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "F")
    public float field517 = 0.25F;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "F")
    public float field523 = 1.0F;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public int field515;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "F")
    public float field512;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "F")
    public float field521;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "F")
    public float field519;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public int field518;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "I")
    public int field528;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "I")
    public int field525;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    public int field522;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "Ljg;")
    public class326 field524;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "Z")
    public static boolean field527 = false;

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "Lul;")
    public static class51 field529 = new class51(64);

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "Ljava/lang/String;")
    public static String field531 = "Connecting to update server";

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    public static int field530 = 500;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "[Lwb;")
    public static class171[] field534;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)I", line = 11)
    public static final int method317(int arg0) {
        if (arg0 == 3) {
            field533++;
            return class18.field299;
        } else {
            return 84;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLpi;)V", line = 26)
    public final void method318(byte arg0, class336 arg1) {
        this.field513 = (float) (arg1.method2364(-9069) * 8) / 255.0F;
        field514++;
        if (arg0 != -88) {
            method322(93, 12, -104);
        }
        this.field517 = (float) (arg1.method2364(arg0 - 8981) * 8) / 255.0F;
        this.field523 = (float) (arg1.method2364(-9069) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)I", line = 41)
    public static int method319(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "([IIIIII)V", line = 50)
    public static final void method320(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class257 var6 = class279.field4430[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class95 var7 = var6.field4156;
        if (var7 != null) {
            int var8 = var7.field1481;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class192 var10 = var6.field4141;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field3206;
        int var12 = var10.field3212;
        int var13 = var10.field3227;
        int var14 = var10.field3225;
        int[] var15 = class90.field1435[var11];
        int[] var16 = class347.field5535[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V", line = 193)
    public class36() {
        this.field515 = -60;
        this.field512 = 1.2F;
        this.field521 = 1.1523438F;
        this.field520 = 0;
        this.field519 = 0.69921875F;
        this.field518 = class9.field123;
        this.field528 = class9.field117;
        this.field525 = -50;
        this.field522 = -50;
        if (class166.field2900 != null) {
            this.field524 = class326.method2266(class166.field2900[0], class166.field2900[1], class166.field2900[2], class166.field2900[3], class166.field2900[4], class166.field2900[5]);
        }
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lpi;)V", line = 254)
    public class36(class336 arg0) {
        int var2 = arg0.method2364(-9069);
        if ((var2 & 0x1) == 0) {
            this.field518 = class9.field123;
        } else {
            this.field518 = arg0.method2338((byte) 60);
        }
        if ((var2 & 0x2) == 0) {
            this.field521 = 1.1523438F;
        } else {
            this.field521 = (float) arg0.method2339((byte) -46) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field519 = 0.69921875F;
        } else {
            this.field519 = (float) arg0.method2339((byte) -46) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field512 = 1.2F;
        } else {
            this.field512 = (float) arg0.method2339((byte) -46) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field515 = -60;
            this.field525 = -50;
            this.field522 = -50;
        } else {
            this.field522 = arg0.method2326(-75);
            this.field515 = arg0.method2326(-128);
            this.field525 = arg0.method2326(-119);
        }
        if ((var2 & 0x20) == 0) {
            this.field528 = class9.field117;
        } else {
            this.field528 = arg0.method2338((byte) 26);
        }
        if ((var2 & 0x40) == 0) {
            this.field520 = 0;
        } else {
            this.field520 = arg0.method2339((byte) -46);
        }
        if ((var2 & 0x80) != 0) {
            this.field524 = class326.method2266(arg0.method2339((byte) -46), arg0.method2339((byte) -46), arg0.method2339((byte) -46), arg0.method2339((byte) -46), arg0.method2339((byte) -46), arg0.method2339((byte) -46));
        } else if (class166.field2900 != null) {
            this.field524 = class326.method2266(class166.field2900[0], class166.field2900[1], class166.field2900[2], class166.field2900[3], class166.field2900[4], class166.field2900[5]);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V", line = 173)
    public static void method321(byte arg0) {
        if (arg0 < 78) {
            field534 = (class171[]) null;
        }
        field529 = null;
        field531 = null;
        field534 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)Ljava/lang/String;", line = 217)
    public static final String method322(int arg0, int arg1, int arg2) {
        int var3 = arg0 - arg1;
        field526++;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else {
            if (arg2 > -57) {
                method321((byte) 116);
            }
            if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 <= 3) {
                return var3 > 0 ? "<col=c0ff00>" : "<col=ffff00>";
            } else {
                return "<col=80ff00>";
            }
        }
    }
}
