import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class584 extends class619 {

    @OriginalMember(owner = "client!nda", name = "L", descriptor = "S")
    public static short field8263 = 205;

    @OriginalMember(owner = "client!nda", name = "M", descriptor = "[F")
    public static float[] field8264 = new float[4];

    @OriginalMember(owner = "client!nda", name = "O", descriptor = "Z")
    public static boolean field8266 = false;

    @OriginalMember(owner = "client!nda", name = "H", descriptor = "I")
    public static int field8259;

    @OriginalMember(owner = "client!nda", name = "J", descriptor = "I")
    public static int field8261;

    @OriginalMember(owner = "client!nda", name = "K", descriptor = "I")
    public static int field8262;

    @OriginalMember(owner = "client!nda", name = "N", descriptor = "I")
    public static int field8265;

    @OriginalMember(owner = "client!nda", name = "P", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!nda", name = "Q", descriptor = "I")
    public static int field8268;

    @OriginalMember(owner = "client!nda", name = "R", descriptor = "I")
    public static int field8269;

    @OriginalMember(owner = "client!nda", name = "S", descriptor = "I")
    public static int field8270;

    @OriginalMember(owner = "client!nda", name = "I", descriptor = "[B")
    private byte[] field8260;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(BII)V", line = 3)
    public final void method392(byte arg0, int arg1, int arg2) {
        field8267++;
        int var4 = arg2 * 2;
        if (arg1 != 8232) {
            field8263 = -111;
        }
        int var5 = arg0 & 0xFF;
        this.field8260[var4++] = -1;
        this.field8260[var4] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "()V", line = 19)
    public class584() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIII[Lkh;Z)V", line = 23)
    public static final void method3353(int arg0, int arg1, int arg2, int arg3, class17[] arg4, boolean arg5) {
        field8269++;
        for (int var6 = arg2; var6 < arg4.length; var6++) {
            class17 var7 = arg4[var6];
            if (var7 != null && var7.field336 == arg0) {
                class708.method3952((byte) -119, var7, arg5, arg1, arg3);
                class206.method1462(arg3, var7, arg1, true);
                if (var7.field252 > var7.field277 - var7.field347) {
                    var7.field252 = var7.field277 - var7.field347;
                }
                if ((var7.field364 - var7.field330) < var7.field362) {
                    var7.field362 = var7.field364 - var7.field330;
                }
                if (var7.field252 < 0) {
                    var7.field252 = 0;
                }
                if (var7.field362 < 0) {
                    var7.field362 = 0;
                }
                if (var7.field352 == 0) {
                    class358.method2206(var7, 117, arg5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lkka;B)V", line = 67)
    public static final void method3354(class329 arg0, byte arg1) {
        arg0.method2079((byte) -51);
        field8262++;
        if (arg1 < 95) {
            method3353(-20, 125, -72, 2, null, true);
        }
        int var2 = class483.field6533;
        class771 var3 = class235.field3379 = class527.field7150[var2] = new class771();
        var3.field5288 = var2;
        int var4 = arg0.method2078(30, 15455);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 0x3FFF;
        int var7 = var4 & 0x3FFF;
        var3.field5304[0] = var6 - class217.field3198;
        var3.field7396 = (var3.field5304[0] << 9) + (var3.method2342((byte) 120) << 8);
        var3.field5308[0] = var7 - class400.field5510;
        var3.field7398 = (var3.field5308[0] << 9) + (var3.method2342((byte) -105) << 8);
        class282.field3917 = var3.field7391 = var3.field7404 = var5;
        if (class61.method425(var3.field5308[0], 16340, var3.field5304[0])) {
            var3.field7404++;
        }
        if (class341.field4601[var2] != null) {
            var3.method4245(-65536, class341.field4601[var2]);
        }
        class696.field9624 = 0;
        class417.field5700[class696.field9624++] = var2;
        class434.field5900[var2] = 0;
        class18.field418 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg0.method2078(18, 15455);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class593 var13 = class606.field8464[var8] = new class593();
                var13.field8333 = false;
                var13.field8335 = 0;
                var13.field8331 = (var10 << 28) + (var11 << 14) + var12;
                var13.field8328 = false;
                var13.field8330 = -1;
                class582.field8242[class18.field418++] = var8;
                class434.field5900[var8] = 0;
            }
        }
        arg0.method2081(false);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(BLfca;)Ljca;", line = 142)
    public static final class713 method3355(byte arg0, class93 arg1) {
        field8268++;
        class70 var2 = class111.method972((byte) 106, arg1);
        int var3 = arg1.method773(3);
        if (arg0 != -1) {
            field8266 = true;
        }
        int var4 = arg1.method773(3);
        return new class713(var2.field1041, var2.field1039, var2.field1035, var2.field1033, var2.field1031, var2.field1030, var2.field1032, var2.field1034, var2.field1040, var3, var4);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIZ)[B", line = 163)
    public final byte[] method3356(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            method3355((byte) 76, null);
        }
        this.field8260 = new byte[arg0 * arg1 * 2 * arg2];
        field8259++;
        this.method4164(255, arg2, arg1, arg0);
        return this.field8260;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IBIIIIII)V", line = 176)
    public static final void method3357(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8265++;
        int var8 = arg0 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class274.field3817 - class56.field797) * var8 / 100 + class56.field797;
        class90.field1369 = class90.field1367 * var9 >> 8;
        int var10 = arg5 * var9 >> 8;
        int var11 = 16384 - arg6 & 0x3FFF;
        int var12 = 16384 - arg4 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class191.field2937[var11] * -var10 >> 14;
            var15 = class191.field2936[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class191.field2937[var12] * var15 >> 14;
            var15 = class191.field2936[var12] * var15 >> 14;
        }
        class460.field6249 = arg4;
        class450.field6172 = arg2 - var15;
        if (arg1 > -121) {
            field8264 = null;
        }
        class605.field8452 = arg7 - var14;
        class463.field6307 = 0;
        class255.field3585 = arg6;
        class733.field10131 = arg3 - var13;
    }

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "(B)V", line = 230)
    public static void method3358(byte arg0) {
        if (arg0 != 0) {
            field8263 = -12;
        }
        field8264 = null;
    }

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "(I)V", line = 244)
    public static final void method3359(int arg0) {
        if (arg0 <= 78) {
            method3355((byte) -8, null);
        }
        field8261++;
        if (!class378.field5158) {
            class663.field9212 += (-12.0F - class663.field9212) / 2.0F;
            class429.field5846 = true;
            class378.field5158 = true;
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IZI)Z", line = 272)
    public static final boolean method3360(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field8270++;
            return (arg0 & 0x100) != 0;
        } else {
            return true;
        }
    }
}
