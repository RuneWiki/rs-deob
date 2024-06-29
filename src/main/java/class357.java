import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class357 {

    @OriginalMember(owner = "client!mea", name = "o", descriptor = "I")
    public int field4632;

    @OriginalMember(owner = "client!mea", name = "m", descriptor = "Z")
    public boolean field4630;

    @OriginalMember(owner = "client!mea", name = "p", descriptor = "Z")
    public boolean field4633;

    @OriginalMember(owner = "client!mea", name = "l", descriptor = "[S")
    public short[] field4629;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
    public int field4618;

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "I")
    private int field4619;

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "Lca;")
    public static class119 field4620 = new class119();

    @OriginalMember(owner = "client!mea", name = "s", descriptor = "Ltc;")
    public static class477 field4636 = null;

    @OriginalMember(owner = "client!mea", name = "d", descriptor = "I")
    private int field4621;

    @OriginalMember(owner = "client!mea", name = "e", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!mea", name = "f", descriptor = "I")
    private int field4623;

    @OriginalMember(owner = "client!mea", name = "g", descriptor = "I")
    private int field4624;

    @OriginalMember(owner = "client!mea", name = "h", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!mea", name = "i", descriptor = "I")
    private int field4626;

    @OriginalMember(owner = "client!mea", name = "j", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!mea", name = "k", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!mea", name = "q", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!mea", name = "r", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!mea", name = "n", descriptor = "Lpn;")
    public class296 field4631;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(BI)V")
    public static final void method2052(byte arg0, int arg1) {
        field4634++;
        if (arg0 != 88) {
            field4620 = null;
        }
        class367 var2 = class573.method3057(10, arg1, 2);
        var2.method2113(121);
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(BIIII)V")
    public final void method2053(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field4622++;
        this.field4626 = arg3;
        this.field4623 = arg4;
        if (arg0 > 61) {
            this.field4621 = arg2;
            this.field4624 = arg1;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(BIIIII)V")
    public static final void method2054(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4635++;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg2 * arg2;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg1 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (arg0 > -2) {
            field4620 = null;
        }
        class349.method2008(arg4 + arg2, (byte) 20, class213.field2746[arg3], arg4 - arg2, arg5);
        int var20 = (arg1 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var6++;
                    var17 += var16;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var17 += var16;
                var19 += var16;
                var6++;
            }
            var14 += -var18;
            var13 += -var20;
            var20 -= var15;
            var7--;
            var18 -= var15;
            int var21 = arg3 - var7;
            int var22 = arg3 + var7;
            int var23 = arg4 + var6;
            int var24 = arg4 - var6;
            class349.method2008(var23, (byte) 54, class213.field2746[var21], var24, arg5);
            class349.method2008(var23, (byte) 89, class213.field2746[var22], var24, arg5);
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)V")
    public static void method2055(int arg0) {
        field4636 = null;
        if (arg0 == 0) {
            field4620 = null;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIIIIILoa;)V")
    private final void method2056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class43 arg6) {
        if (arg3 != 1543) {
            this.method2056(-41, 25, -109, -78, -51, 72, null);
        }
        this.field4631 = arg6.method385(arg0, arg2, arg5, arg1, arg4, 1.0F);
        field4628++;
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(I)V")
    private final void method2057(int arg0) {
        if (arg0 != 12) {
            return;
        }
        int var2 = this.field4618;
        if (var2 == 2) {
            this.field4626 = 0;
            this.field4623 = 1;
            this.field4624 = 2048;
            this.field4621 = 2048;
        } else if (var2 == 3) {
            this.field4626 = 0;
            this.field4624 = 4096;
            this.field4623 = 1;
            this.field4621 = 2048;
        } else if (var2 == 4) {
            this.field4623 = 4;
            this.field4621 = 2048;
            this.field4624 = 2048;
            this.field4626 = 0;
        } else if (var2 == 5) {
            this.field4621 = 2048;
            this.field4626 = 0;
            this.field4624 = 8192;
            this.field4623 = 4;
        } else if (var2 == 12) {
            this.field4621 = 2048;
            this.field4623 = 2;
            this.field4624 = 2048;
            this.field4626 = 0;
        } else if (var2 == 13) {
            this.field4623 = 2;
            this.field4626 = 0;
            this.field4624 = 8192;
            this.field4621 = 2048;
        } else if (var2 == 10) {
            this.field4624 = 2048;
            this.field4626 = 1536;
            this.field4621 = 512;
            this.field4623 = 3;
        } else if (var2 == 11) {
            this.field4623 = 3;
            this.field4624 = 4096;
            this.field4626 = 1536;
            this.field4621 = 512;
        } else if (var2 == 6) {
            this.field4623 = 3;
            this.field4621 = 768;
            this.field4624 = 2048;
            this.field4626 = 1280;
        } else if (var2 == 7) {
            this.field4623 = 3;
            this.field4621 = 768;
            this.field4624 = 4096;
            this.field4626 = 1280;
        } else if (var2 == 8) {
            this.field4621 = 1024;
            this.field4626 = 1024;
            this.field4624 = 2048;
            this.field4623 = 3;
        } else if (var2 == 9) {
            this.field4624 = 4096;
            this.field4623 = 3;
            this.field4626 = 1024;
            this.field4621 = 1024;
        } else if (var2 == 14) {
            this.field4624 = 2048;
            this.field4626 = 1280;
            this.field4623 = 1;
            this.field4621 = 768;
        } else if (var2 == 15) {
            this.field4621 = 512;
            this.field4624 = 4096;
            this.field4626 = 1536;
            this.field4623 = 1;
        } else if (var2 == 16) {
            this.field4623 = 1;
            this.field4626 = 1792;
            this.field4624 = 8192;
            this.field4621 = 256;
        } else {
            this.field4623 = 0;
            this.field4626 = 0;
            this.field4621 = 2048;
            this.field4624 = 2048;
        }
        field4627++;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IZZ)V")
    public final void method2058(int arg0, boolean arg1, boolean arg2) {
        field4625++;
        int var6;
        if (arg1) {
            var6 = 2048;
        } else {
            int var4 = this.field4619 + (this.field4624 * arg0 / 50) & 0x7FF;
            int var5 = this.field4623;
            if (var5 == 1) {
                var6 = (class237.field3193[var4 << 3] >> 4) + 1024;
            } else if (var5 == 3) {
                var6 = class646.field9002[var4] >> 1;
            } else if (var5 == 4) {
                var6 = var4 >> 10 << 11;
            } else if (var5 == 2) {
                var6 = var4;
            } else if (var5 == 5) {
                var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
            } else {
                var6 = 2048;
            }
        }
        if (arg2) {
            this.field4633 = true;
        }
        this.field4631.method1308((float) ((this.field4621 * var6 >> 11) + this.field4626) / 2048.0F, 123);
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "()V")
    protected class357() {
        if (class646.field9002 == null) {
            class326.method1888((byte) 24);
        }
        this.method2057(12);
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Loa;Lfd;I)V")
    public class357(class43 arg0, class418 arg1, int arg2) {
        if (class646.field9002 == null) {
            class326.method1888((byte) 24);
        }
        this.field4632 = arg1.method2396(-7);
        this.field4630 = (this.field4632 & 0x10) != 0;
        this.field4633 = (this.field4632 & 0x8) != 0;
        this.field4632 &= 0x7;
        int var4 = arg1.method2393(-30727) << arg2;
        int var5 = arg1.method2393(-30727) << arg2;
        int var6 = arg1.method2393(-30727) << arg2;
        int var7 = arg1.method2396(22);
        int var8 = var7 * 2 + 1;
        this.field4629 = new short[var8];
        for (int var9 = 0; var9 < this.field4629.length; var9++) {
            short var13 = (short) arg1.method2393(-30727);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            if (var15 > (var8 - var14)) {
                var15 = var8 - var14;
            }
            this.field4629[var9] = (short) class131.method954(var15, var14 << 8);
        }
        int var10 = (var7 << class291.field3760) + class57.field768;
        int var11 = class505.field6642 == null ? class127.field1637[class111.method855(arg1.method2393(-30727), -3159) & 0xFFFF] : class505.field6642[arg1.method2393(-30727)];
        int var12 = arg1.method2396(-15);
        this.field4618 = var12 & 0x1F;
        this.field4619 = var12 & 0xE0 << 3;
        if (this.field4618 != 31) {
            this.method2057(12);
        }
        this.method2056(var4, var10, var6, 1543, var11, var5, arg0);
    }
}
