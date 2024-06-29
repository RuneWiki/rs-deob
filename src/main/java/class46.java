import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public abstract class class46 {

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "[S")
    private short[] field593 = new short[512];

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "I")
    private int field600 = 0;

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "I")
    private int field599 = 4;

    @OriginalMember(owner = "client!dt", name = "m", descriptor = "I")
    private int field603 = 4;

    @OriginalMember(owner = "client!dt", name = "n", descriptor = "I")
    public int field604 = 4;

    @OriginalMember(owner = "client!dt", name = "r", descriptor = "I")
    private int field608 = 4;

    @OriginalMember(owner = "client!dt", name = "q", descriptor = "[I")
    public static int[] field607 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "Lbn;")
    public static class160 field597 = new class160(48, 2);

    @OriginalMember(owner = "client!dt", name = "s", descriptor = "[S")
    public static short[] field609 = new short[256];

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "Lct;")
    public static class104 field596;

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "[S")
    private short[] field598;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)Lmj;", line = 9)
    public static final class177 method376(int arg0) {
        if (arg0 != -23072) {
            method377(-34);
        }
        field592++;
        return class223.field3277.length > class416.field6019 ? class223.field3277[class416.field6019++] : null;
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V", line = 28)
    public static void method377(int arg0) {
        field609 = null;
        field596 = null;
        field607 = null;
        if (arg0 >= -89) {
            field596 = null;
        }
        field597 = null;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IZZ)Lkj;", line = 47)
    public static final class243 method378(int arg0, boolean arg1, boolean arg2) {
        field601++;
        if (arg2) {
            field607 = null;
        }
        long var3 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
        return (class243) class278.field4104.method609(var3, 89);
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(IIIII)V", line = 428)
    public class46(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field600 = arg0;
        this.field604 = arg1;
        this.field608 = arg3;
        this.field603 = arg4;
        this.field599 = arg2;
        this.method379(-82);
        this.method381(0);
    }

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "(I)V", line = 64)
    private final void method379(int arg0) {
        this.field598 = new short[this.field604];
        field594++;
        if (arg0 < -64) {
            for (int var2 = 0; var2 < this.field604; var2++) {
                this.field598[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IBIZ)V", line = 84)
    public static final void method380(int arg0, byte arg1, int arg2, boolean arg3) {
        field595++;
        if (arg1 <= 99) {
            method376(78);
        }
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class36.field513 = arg0;
        class263.field3896 = arg3;
        class298.field4331 = arg2;
    }

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "(I)V", line = 107)
    private final void method381(int arg0) {
        field591++;
        Random var2 = new Random((long) this.field600);
        for (int var3 = arg0; var3 < 255; var3++) {
            this.field593[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class435.method2683(var2, (byte) -75, var5);
            short var7 = this.field593[var6];
            this.field593[var6] = this.field593[var5];
            this.field593[var5] = this.field593[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILgt;)V", line = 146)
    public static final void method382(int arg0, class341 arg1) {
        class52.field652 = 3;
        field606++;
        method383(true, (byte) 101);
        class403.field5834 = true;
        class275.field4077 = 0;
        class62.field826 = true;
        class367.field5307 = true;
        class307.field4535 = true;
        class213.field3010 = 2;
        class182.field2561 = true;
        class134.field1847 = true;
        class323.field4773 = true;
        class79.field993 = 0;
        class189.field2643 = 0;
        class178.field2539 = 127;
        class10.field134 = 0;
        class76.field969 = true;
        class231.field3482 = true;
        if (arg0 > -5) {
            field607 = null;
        }
        class13.field224 = true;
        class372.field5437 = 127;
        class337.field4974 = 1;
        class450.field6629 = 255;
        if (class451.field6661 < 96) {
            class106.method757(0, -1);
        } else {
            class106.method757(2, -1);
        }
        class29.field418 = true;
        class400.field5790 = false;
        class329.field4900 = class429.field6241 == 1 ? 2 : 4;
        class223.field3361 = 2;
        class436.field6366 = false;
        class322.field4739 = 2;
        class79.field990 = true;
        class376.field5491 = 0;
        class14.field234 = 0;
        class381.field5603 = false;
        class101 var2 = null;
        try {
            class350 var3 = arg1.method2217(-95);
            while (var3.field5134 == 0) {
                class418.method2587(false, 1L);
            }
            if (var3.field5134 == 1) {
                var2 = (class101) var3.field5129;
                byte[] var4 = new byte[(int) var2.method679((byte) 98)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method683(var5, 0, var4, var4.length - var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class302.method2011(111, new class256(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method681((byte) 65);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZB)V", line = 235)
    public static final void method383(boolean arg0, byte arg1) {
        if (arg1 != 101) {
            method378(123, true, false);
        }
        field605++;
        class349.field5124 = arg0;
        class345.field5075 = !class163.method1082((byte) 95);
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IBII)V", line = 253)
    public final void method384(int arg0, byte arg1, int arg2, int arg3) {
        field602++;
        if (arg1 <= 115) {
            return;
        }
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg2];
        int[] var7 = new int[arg0];
        for (int var8 = 0; var8 < arg3; var8++) {
            var5[var8] = (var8 << 12) / arg3;
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var6[var9] = (var9 << 12) / arg2;
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            var7[var10] = (var10 << 12) / arg0;
        }
        this.method27(false);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field604; var14++) {
                        int var15 = this.field598[var14] << 12;
                        int var16 = var7[var11] * var15 >> 12;
                        int var17 = var6[var12] * var15 >> 12;
                        int var18 = this.field608 * var15 >> 12;
                        int var19 = this.field603 * var15 >> 12;
                        int var20 = this.field599 * var15 >> 12;
                        int var21 = var5[var13] * var15 >> 12;
                        int var22 = this.field599 * var21;
                        int var23 = this.field603 * var16;
                        int var24 = this.field608 * var17;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var24 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var23 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var22 & 0xFFF;
                        int var34 = var23 & 0xFFF;
                        int var35 = var24 & 0xFFF;
                        int var36;
                        if (var19 > var32) {
                            var36 = var32 & 0xFF;
                        } else {
                            var36 = 0;
                        }
                        int var37 = var31 & 0xFF;
                        int var38;
                        if (var18 <= var29) {
                            var38 = 0;
                        } else {
                            var38 = var29 & 0xFF;
                        }
                        int var39;
                        if (var20 <= var26) {
                            var39 = 0;
                        } else {
                            var39 = var26 & 0xFF;
                        }
                        int var40 = var33 - 4096;
                        short var41 = this.field593[var36];
                        int var42 = var35 - 4096;
                        int var43 = class129.field1690[var35];
                        int var44 = class129.field1690[var34];
                        int var45 = var34 - 4096;
                        short var46 = this.field593[var37];
                        int var47 = class129.field1690[var33];
                        short var48 = this.field593[var38 + var46];
                        short var49 = this.field593[var30 + var41];
                        short var50 = this.field593[var30 + var46];
                        short var51 = this.field593[var38 + var41];
                        int var52 = class53.method417((byte) -124, var35, this.field593[var28 + var50], var33, var34);
                        int var53 = class53.method417((byte) 83, var35, this.field593[var39 + var50], var40, var34);
                        int var54 = ((var53 - var52) * var47 >> 12) + var52;
                        int var55 = class53.method417((byte) -112, var42, this.field593[var28 + var48], var33, var34);
                        int var56 = class53.method417((byte) 50, var42, this.field593[var39 + var48], var40, var34);
                        int var57 = var55 + ((var56 - var55) * var47 >> 12);
                        int var58 = ((var57 - var54) * var43 >> 12) + var54;
                        int var59 = class53.method417((byte) -110, var35, this.field593[var28 + var49], var33, var45);
                        int var60 = class53.method417((byte) -102, var35, this.field593[var39 + var49], var40, var45);
                        int var61 = ((var60 - var59) * var47 >> 12) + var59;
                        int var62 = class53.method417((byte) 28, var42, this.field593[var28 + var51], var33, var45);
                        int var63 = class53.method417((byte) -110, var42, this.field593[var39 + var51], var40, var45);
                        int var64 = var62 + ((var63 - var62) * var47 >> 12);
                        int var65 = ((var64 - var61) * var43 >> 12) + var61;
                        this.method29(var14, (byte) 115, ((var65 - var58) * var44 >> 12) + var58);
                    }
                    this.method25((byte) -97);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IBI)V")
    public abstract void method29(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V")
    public abstract void method25(byte arg0);

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)V")
    public abstract void method27(boolean arg0);
}
