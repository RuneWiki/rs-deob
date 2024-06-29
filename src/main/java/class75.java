import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class75 extends class273 {

    @OriginalMember(owner = "client!ng", name = "S", descriptor = "I")
    private int field1485 = 4096;

    @OriginalMember(owner = "client!ng", name = "X", descriptor = "I")
    private int field1490 = 3216;

    @OriginalMember(owner = "client!ng", name = "eb", descriptor = "[I")
    private int[] field1497 = new int[3];

    @OriginalMember(owner = "client!ng", name = "gb", descriptor = "I")
    private int field1499 = 3216;

    @OriginalMember(owner = "client!ng", name = "T", descriptor = "Luk;")
    public static class96 field1486 = new class96(64);

    @OriginalMember(owner = "client!ng", name = "hb", descriptor = "Ljd;")
    public static class86 field1500 = class122.method868("", true);

    @OriginalMember(owner = "client!ng", name = "ab", descriptor = "Ljd;")
    private static class86 field1493 = class122.method868("Loaded title screen", true);

    @OriginalMember(owner = "client!ng", name = "ib", descriptor = "Ljd;")
    public static class86 field1501 = class122.method868("Okay", true);

    @OriginalMember(owner = "client!ng", name = "bb", descriptor = "Ljd;")
    public static class86 field1494 = field1493;

    @OriginalMember(owner = "client!ng", name = "db", descriptor = "[I")
    public static int[] field1496 = new int[50];

    @OriginalMember(owner = "client!ng", name = "jb", descriptor = "Ld;")
    public static class227 field1502 = new class227();

    @OriginalMember(owner = "client!ng", name = "mb", descriptor = "I")
    public static int field1505 = 0;

    @OriginalMember(owner = "client!ng", name = "U", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!ng", name = "V", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!ng", name = "W", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!ng", name = "Y", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!ng", name = "Z", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!ng", name = "cb", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!ng", name = "kb", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!ng", name = "lb", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!ng", name = "fb", descriptor = "[Ljd;")
    public static class86[] field1498;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)V")
    public static void method539(int arg0) {
        field1501 = null;
        if (arg0 == 2) {
            field1494 = null;
            field1493 = null;
            field1496 = null;
            field1498 = null;
            field1502 = null;
            field1486 = null;
            field1500 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZIIIIII)V")
    public static final void method540(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg4 - -arg0;
        int var9 = arg2 - arg0;
        ++field1504;
        int var10 = arg0 + arg3;
        if (!arg1) {
            int var11 = -arg0 + arg6;
            for (int var12 = arg4; var12 < var8; ++var12) {
                class56.method412(arg5, (byte) -118, arg6, class249.field4420[var12], arg3);
            }
            for (int var13 = arg2; ~var13 < ~var9; --var13) {
                class56.method412(arg5, (byte) -103, arg6, class249.field4420[var13], arg3);
            }
            for (int var14 = var8; var14 <= var9; ++var14) {
                int[] var15 = class249.field4420[var14];
                class56.method412(arg5, (byte) -101, var10, var15, arg3);
                class56.method412(arg7, (byte) -125, var11, var15, var10);
                class56.method412(arg5, (byte) -121, arg6, var15, var11);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
    public class75() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(III)Ls;")
    public static final class228 method541(int arg0, int arg1, int arg2) {
        class249 var3 = class248.field4406[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            for (int var4 = 0; var4 < var3.field4445; ++var4) {
                class228 var5 = var3.field4429[var4];
                if ((var5.field4122 >> 29 & 3L) == 2L && var5.field4137 == arg1 && var5.field4127 == arg2) {
                    class263.method1787(var5);
                    return var5;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        if (arg2 > -16) {
            this.field1485 = -87;
        }
        ++field1488;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field1499 = arg1.method1410(-111);
                }
            } else {
                this.field1490 = arg1.method1410(-122);
            }
        } else {
            this.field1485 = arg1.method1410(-70);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIII)V")
    public static final void method542(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1492;
        int var5 = 15 % ((52 - arg0) / 48);
        int var6 = 0;
        int var7 = arg3;
        int var8 = -arg3;
        int var9 = class171.method1221(class129.field2473, class49.field1044, 21419, arg1 + arg3);
        int var10 = -1;
        int var11 = class171.method1221(class129.field2473, class49.field1044, 21419, arg1 - arg3);
        class56.method412(arg2, (byte) -119, var9, class249.field4420[arg4], var11);
        while (var7 > var6) {
            var10 += 2;
            var8 += var10;
            if (~var8 < -1) {
                --var7;
                int var12 = -var7 + arg4;
                var8 -= var7 << 1;
                int var13 = arg4 + var7;
                if (~class50.field1050 >= ~var13 && class56.field1143 >= var12) {
                    int var14 = class171.method1221(class129.field2473, class49.field1044, 21419, arg1 + var6);
                    int var15 = class171.method1221(class129.field2473, class49.field1044, 21419, arg1 - var6);
                    if (~class56.field1143 <= ~var13) {
                        class56.method412(arg2, (byte) -92, var14, class249.field4420[var13], var15);
                    }
                    if (~class50.field1050 >= ~var12) {
                        class56.method412(arg2, (byte) -124, var14, class249.field4420[var12], var15);
                    }
                }
            }
            ++var6;
            int var16 = -var6 + arg4;
            int var17 = arg4 + var6;
            if (class50.field1050 <= var17 && ~var16 >= ~class56.field1143) {
                int var18 = class171.method1221(class129.field2473, class49.field1044, 21419, arg1 + var7);
                int var19 = class171.method1221(class129.field2473, class49.field1044, 21419, -var7 + arg1);
                if (class56.field1143 >= var17) {
                    class56.method412(arg2, (byte) -120, var18, class249.field4420[var17], var19);
                }
                if (var16 >= class50.field1050) {
                    class56.method412(arg2, (byte) -100, var18, class249.field4420[var16], var19);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        int[] var3 = super.field4800.method1224(arg1, 0);
        ++field1489;
        if (arg0 != -7420) {
            return null;
        } else {
            if (super.field4800.field3160) {
                int var4 = class138.field2625 * this.field1485 >> 12;
                int[] var5 = this.method1863(-101, 0, arg1 - 1 & class274.field4808);
                int[] var6 = this.method1863(-94, 0, arg1);
                int[] var7 = this.method1863(-105, 0, class274.field4808 & arg1 + 1);
                for (int var8 = 0; ~class176.field3200 < ~var8; ++var8) {
                    int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                    int var10 = (var6[class90.field1844 & var8 + -1] - var6[class90.field1844 & var8 - -1]) * var4 >> 12;
                    int var11 = var9 >> 4;
                    int var12 = var10 >> 4;
                    if (var11 < 0) {
                        var11 = -var11;
                    }
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    if (var11 > 255) {
                        var11 = 255;
                    }
                    if (~var12 < -256) {
                        var12 = 255;
                    }
                    int var13 = 255 & class213.field3848[((var11 - -1) * var11 >> 1) + var12];
                    int var14 = var10 * var13 >> 8;
                    int var15 = this.field1497[0] * var14 >> 12;
                    int var16 = var13 * 4096 >> 8;
                    int var17 = this.field1497[2] * var16 >> 12;
                    int var18 = var9 * var13 >> 8;
                    int var19 = this.field1497[1] * var18 >> 12;
                    var3[var8] = var15 + var17 + var19;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)V")
    public final void method84(int arg0) {
        if (arg0 == 4095) {
            this.method543((byte) 46);
            ++field1491;
        }
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(B)V")
    private final void method543(byte arg0) {
        double var2 = Math.cos((double) ((float) this.field1499 / 4096.0F));
        ++field1487;
        if (arg0 == 46) {
            this.field1497[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field1490 / 4096.0F)));
            this.field1497[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field1490 / 4096.0F)));
            this.field1497[2] = (int) (Math.sin((double) ((float) this.field1499 / 4096.0F)) * 4096.0D);
            int var4 = this.field1497[0] * this.field1497[0] >> 12;
            int var5 = this.field1497[1] * this.field1497[1] >> 12;
            int var6 = this.field1497[2] * this.field1497[2] >> 12;
            int var7 = (int) (4096.0D * Math.sqrt((double) (var4 - -var5 - -var6 >> 12)));
            if (var7 != 0) {
                this.field1497[2] = (this.field1497[2] << 12) / var7;
                this.field1497[0] = (this.field1497[0] << 12) / var7;
                this.field1497[1] = (this.field1497[1] << 12) / var7;
            }
        }
    }
}
