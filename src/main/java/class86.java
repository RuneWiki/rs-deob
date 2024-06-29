import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class86 extends class294 {

    @OriginalMember(owner = "client!ph", name = "uc", descriptor = "Ljava/lang/String;")
    public static String field1382 = "green:";

    @OriginalMember(owner = "client!ph", name = "vc", descriptor = "I")
    public static int field1383 = 0;

    @OriginalMember(owner = "client!ph", name = "Ac", descriptor = "F")
    public static float field1388 = 128.0F;

    @OriginalMember(owner = "client!ph", name = "pc", descriptor = "Ltk;")
    public static class266 field1377 = null;

    @OriginalMember(owner = "client!ph", name = "oc", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!ph", name = "qc", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!ph", name = "rc", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!ph", name = "sc", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!ph", name = "wc", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!ph", name = "xc", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!ph", name = "zc", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!ph", name = "Bc", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!ph", name = "Cc", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!ph", name = "Dc", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!ph", name = "tc", descriptor = "Lvm;")
    public class84 field1381;

    @OriginalMember(owner = "client!ph", name = "yc", descriptor = "[Len;")
    public static class47[] field1386;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIII)V", line = 8)
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1390++;
        if (this.field1381 != null) {
            ;
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)I", line = 23)
    public final int method680(int arg0) {
        field1391++;
        int var2 = -21 / ((52 - arg0) / 61);
        if (this.field1381.field1339 != null) {
            class84 var3 = this.field1381.method667(-65);
            if (var3 != null && var3.field1365 != -1) {
                return var3.field1365;
            }
        }
        return this.field4632;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)Z", line = 44)
    public final boolean method681(boolean arg0) {
        field1389++;
        if (arg0) {
            return this.field1381 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "()I", line = 62)
    public final int method137() {
        field1385++;
        return this.field4654;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILvm;)V", line = 77)
    public final void method682(int arg0, class84 arg1) {
        if (arg0 != 32090) {
            field1388 = 1.5595834F;
        }
        field1387++;
        this.field1381 = arg1;
        if (this.field4664 != null) {
            this.field4664.method1687();
        }
    }

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)V", line = 94)
    public static final void method683(int arg0) {
        class93.field1519++;
        if (arg0 != 9049) {
            method683(80);
        }
        class209.field3305.method1808((byte) -74, 208);
        field1379++;
        for (class24 var1 = (class24) class158.field2584.method71((byte) -93); var1 != null; var1 = (class24) class158.field2584.method84(1)) {
            if (var1.field413 == 0) {
                class190.method1367(arg0 - 9049, true, var1);
            }
        }
        if (class49.field757 != null) {
            class280.method1971((byte) 101, class49.field757);
            class49.field757 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIBILtk;)V", line = 126)
    public static final void method684(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, class266 arg7) {
        field1380++;
        int var8 = arg0 * arg0 + arg1 * arg1;
        if (arg4 < var8) {
            return;
        }
        int var9 = Math.min(arg7.field3941 / 2, arg7.field3939 / 2);
        if (arg5 != 36) {
            return;
        }
        if (var8 <= var9 * var9) {
            class96.method781(2, arg0, arg3, arg1, class158.field2578[arg2], arg6, arg7);
            return;
        }
        var9 -= 10;
        int var10 = (int) class171.field2747 + class150.field2455 & 0x7FF;
        int var11 = class40.field612[var10];
        int var12 = class40.field619[var10];
        int var13 = var11 * 256 / (class10.field242 + 256);
        int var14 = var12 * 256 / (class10.field242 + 256);
        int var15 = arg0 * var13 + arg1 * var14 >> 16;
        int var16 = arg0 * var14 - (arg1 * var13) >> 16;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var9);
        int var20 = (int) ((double) var9 * Math.cos(var17));
        if (class162.field2623) {
            ((class196) class259.field3845[arg2]).method1387(240, 240, (arg7.field3941 / 2 + arg6 + var19) * 16, (arg7.field3939 / 2 + arg3 - var20) * 16, (int) (var17 * 10430.378D), 4096);
        } else {
            ((class317) class259.field3845[arg2]).method1640(arg6 + var19 + (arg7.field3941 / 2) - 10, arg3 - (-(arg7.field3939 / 2) + var20 - -10), 20, 20, 15, 15, var17, 256);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIIIJILrb;)V", line = 174)
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class236 arg10) {
        field1384++;
        if (this.field1381 == null) {
            return;
        }
        class38 var13 = this.field4660 != -1 && this.field4667 == 0 ? class63.method503(this.field4660, (byte) 127) : null;
        class38 var14 = this.field4614 == -1 || this.field4614 == this.method2062((byte) -84).field1006 && var13 != null ? null : class63.method503(this.field4614, (byte) 126);
        class94 var15 = this.field1381.method671(this.field4674, this.field4655, this.field4687, true, var14, var13, this.field4676, this.field4656, this.field4636, this.field4649);
        if (var15 == null) {
            return;
        }
        this.field4654 = var15.method137();
        class84 var16 = this.field1381;
        if (var16.field1339 != null) {
            var16 = var16.method667(-107);
        }
        if (class56.field853 && var16.field1335) {
            class94 var17 = class226.method1655(this.field4671, var14 == null ? var13 : var14, this.field1381.field1363, this.field4635, arg0, this.field1381.field1341, var15, this.field1381.field1319, var14 == null ? this.field4655 : this.field4656, this.field1381.field1316, this.field1381.field1362, this.field4672, true, this.field4610);
            if (class162.field2623) {
                float var18 = class162.method1191();
                float var19 = class162.method1208();
                class162.method1196();
                class162.method1231(var18, var19 - 150.0F);
                var17.method117(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field4664);
                class162.method1203();
                class162.method1231(var18, var19);
            } else {
                var17.method117(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field4664);
            }
        }
        this.method2067(var15, (byte) 11);
        this.method2068((byte) 120, var15, arg0);
        class94 var20 = null;
        if (this.field4679 != -1 && this.field4681 != -1) {
            class74 var21 = class52.method429(4618, this.field4679);
            var20 = var21.method586(this.field4681, this.field4617, (byte) 120, this.field4678);
            if (var20 != null) {
                var20.method757(0, -this.field4647, 0);
                if (var21.field1130) {
                    if (class155.field2517 != 0) {
                        var20.method752(class155.field2517);
                    }
                    if (class294.field4692 != 0) {
                        var20.method745(class294.field4692);
                    }
                    if (class19.field352 != 0) {
                        var20.method757(0, class19.field352, 0);
                    }
                }
            }
        }
        if (!class162.field2623) {
            if (var20 != null) {
                var15 = ((class271) var15).method1937(var20);
            }
            if (this.field1381.field1363 == 1) {
                var15.field1524 = true;
            }
            var15.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4664);
            return;
        }
        if (this.field1381.field1363 == 1) {
            var15.field1524 = true;
        }
        var15.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4664);
        if (var20 != null) {
            if (this.field1381.field1363 == 1) {
                var20.field1524 = true;
            }
            var20.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4664);
        }
    }

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "(I)V", line = 297)
    public static void method685(int arg0) {
        field1377 = null;
        if (arg0 < 4) {
            method683(-10);
        }
        field1382 = null;
        field1386 = null;
    }

    @OriginalMember(owner = "client!ph", name = "finalize", descriptor = "()V", line = 320)
    protected final void finalize() {
        field1378++;
    }
}
