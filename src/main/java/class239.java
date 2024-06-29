import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class239 {

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    private int field3762 = 65000;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "Lqi;")
    private class217 field3771 = null;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "Lqi;")
    private class217 field3772 = null;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    private int field3769;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Z")
    public static boolean field3761 = false;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3760 = "Checking for updates - ";

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "Ltj;")
    public static class10 field3773 = new class10();

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field3775 = new String[100];

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public static int field3776 = -1;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "Luc;")
    public static class115 field3767;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)I")
    public static final int method1576(int arg0, int arg1, int arg2) {
        if (arg2 > arg0) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        if (arg1 != -32055) {
            method1576(-29, -20, -55);
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        field3765++;
        return arg0;
    }

    @OriginalMember(owner = "client!ek", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3774++;
        return "Cache:" + this.field3769;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZII[B)Z")
    public final boolean method1577(boolean arg0, int arg1, int arg2, byte[] arg3) {
        field3770++;
        if (arg0) {
            return true;
        }
        class217 var5 = this.field3772;
        synchronized (this.field3772) {
            if (arg1 < 0 || arg1 > this.field3762) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1578(arg1, true, arg3, 6, arg2);
            if (!var6) {
                var6 = this.method1578(arg1, false, arg3, 6, arg2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ[BII)Z")
    private final boolean method1578(int arg0, boolean arg1, byte[] arg2, int arg3, int arg4) {
        field3763++;
        class217 var6 = this.field3772;
        synchronized (this.field3772) {
            try {
                int var8;
                if (arg1) {
                    if (this.field3771.method1438(72) < (long) (arg4 * 6 + 6)) {
                        return false;
                    }
                    this.field3771.method1437(74, (long) (arg4 * 6));
                    this.field3771.method1442(0, (byte) 111, class69.field1165, 6);
                    var8 = ((class69.field1165[4] & 0xFF) << 8) + ((class69.field1165[3] & 0xFF << 16) + (class69.field1165[5] & 0xFF));
                    if (var8 <= 0 || ((long) var8) > (this.field3772.method1438(47) / 520L)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field3772.method1438(77) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class69.field1165[0] = (byte) (arg0 >> 16);
                class69.field1165[3] = (byte) (var8 >> 16);
                class69.field1165[5] = (byte) var8;
                class69.field1165[4] = (byte) (var8 >> 8);
                class69.field1165[1] = (byte) (arg0 >> 8);
                int var10 = 0;
                int var11 = 0;
                class69.field1165[2] = (byte) arg0;
                this.field3771.method1437(arg3 + 73, (long) (arg3 * arg4));
                this.field3771.method1444(6, false, class69.field1165, 0);
                while (var10 < arg0) {
                    int var12 = 0;
                    if (arg1) {
                        label104: {
                            this.field3772.method1437(105, (long) (var8 * 520));
                            try {
                                this.field3772.method1442(0, (byte) 111, class69.field1165, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = ((class69.field1165[5] & 0xFF) << 8) + (class69.field1165[4] & 0xFF << 16) + (class69.field1165[6] & 0xFF);
                            int var13 = ((class69.field1165[0] & 0xFF) << 8) + (class69.field1165[1] & 0xFF);
                            int var14 = (class69.field1165[2] & 0xFF << 8) + (class69.field1165[3] & 0xFF);
                            int var15 = class69.field1165[7] & 0xFF;
                            if (arg4 == var13 && var11 == var14 && this.field3769 == var15) {
                                if (var12 >= 0 && (this.field3772.method1438(50) / 520L) >= ((long) var12)) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var18 = arg0 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field3772.method1438(arg3 ^ 0x5E) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        arg1 = false;
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class69.field1165[3] = (byte) var11;
                    class69.field1165[0] = (byte) (arg4 >> 8);
                    class69.field1165[2] = (byte) (var11 >> 8);
                    class69.field1165[1] = (byte) arg4;
                    if ((arg0 - var10) <= 512) {
                        var12 = 0;
                    }
                    var11++;
                    class69.field1165[5] = (byte) (var12 >> 8);
                    class69.field1165[7] = (byte) this.field3769;
                    class69.field1165[6] = (byte) var12;
                    class69.field1165[4] = (byte) (var12 >> 16);
                    this.field3772.method1437(arg3 ^ 0x6E, (long) (var8 * 520));
                    this.field3772.method1444(8, false, class69.field1165, 0);
                    this.field3772.method1444(var18, false, arg2, var10);
                    var8 = var12;
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public static void method1579(byte arg0) {
        field3773 = null;
        field3767 = null;
        field3775 = null;
        field3760 = null;
        if (arg0 <= 97) {
            field3776 = 64;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Llb;IIIIIIIZ)V")
    public static final void method1580(class105 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class282.field4477;
        int var11;
        int var12 = var11 = (arg7 << 7) - class271.field4346;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class21.field327[arg1][arg6][arg7] - class89.field1421;
        int var18 = class21.field327[arg1][arg6 + 1][arg7] - class89.field1421;
        int var19 = class21.field327[arg1][arg6 + 1][arg7 + 1] - class89.field1421;
        int var20 = class21.field327[arg1][arg6][arg7 + 1] - class89.field1421;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class95.field1479;
        int var46 = (var24 << 9) / var25 + class95.field1478;
        int var47 = (var27 << 9) / var31 + class95.field1479;
        int var48 = (var30 << 9) / var31 + class95.field1478;
        int var49 = (var33 << 9) / var37 + class95.field1479;
        int var50 = (var36 << 9) / var37 + class95.field1478;
        int var51 = (var39 << 9) / var43 + class95.field1479;
        int var52 = (var42 << 9) / var43 + class95.field1478;
        class95.field1489 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class285.field4537 && class22.method176(class95.field1479 + class211.field3382, class95.field1478 + class114.field1748, var50, var52, var48, var49, var51, var47)) {
                class279.field4421 = arg6;
                class287.field4586 = arg7;
            }
            if (!arg8) {
                class95.field1476 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class95.field1480 || var51 > class95.field1480 || var47 > class95.field1480) {
                    class95.field1476 = true;
                }
                if (arg0.field1601 == -1) {
                    if (arg0.field1597 != 12345678) {
                        class95.method728(var50, var52, var48, var49, var51, var47, arg0.field1597, arg0.field1610, arg0.field1605);
                    }
                } else if (!class150.field2463) {
                    int var53 = class95.field1483.method1612(-122, arg0.field1601);
                    class95.method728(var50, var52, var48, var49, var51, var47, class52.method436(var53, arg0.field1597), class52.method436(var53, arg0.field1610), class52.method436(var53, arg0.field1605));
                } else if (arg0.field1611) {
                    class95.method723(var50, var52, var48, var49, var51, var47, arg0.field1597, arg0.field1610, arg0.field1605, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1601);
                } else {
                    class95.method723(var50, var52, var48, var49, var51, var47, arg0.field1597, arg0.field1610, arg0.field1605, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field1601);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class285.field4537 && class22.method176(class95.field1479 + class211.field3382, class95.field1478 + class114.field1748, var46, var48, var52, var45, var47, var51)) {
            class279.field4421 = arg6;
            class287.field4586 = arg7;
        }
        if (arg8) {
            return;
        }
        class95.field1476 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class95.field1480 || var47 > class95.field1480 || var51 > class95.field1480) {
            class95.field1476 = true;
        }
        if (arg0.field1601 != -1) {
            if (class150.field2463) {
                class95.method723(var46, var48, var52, var45, var47, var51, arg0.field1608, arg0.field1605, arg0.field1610, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1601);
                return;
            }
            int var54 = class95.field1483.method1612(-57, arg0.field1601);
            class95.method728(var46, var48, var52, var45, var47, var51, class52.method436(var54, arg0.field1608), class52.method436(var54, arg0.field1605), class52.method436(var54, arg0.field1610));
        } else if (arg0.field1608 != 12345678) {
            class95.method728(var46, var48, var52, var45, var47, var51, arg0.field1608, arg0.field1605, arg0.field1610);
            return;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)[B")
    public final byte[] method1581(int arg0, int arg1) {
        field3768++;
        class217 var3 = this.field3772;
        synchronized (this.field3772) {
            try {
                if (this.field3771.method1438(arg0 ^ 0xFFFFEF37) < ((long) (arg1 * 6 + 6))) {
                    return null;
                }
                this.field3771.method1437(98, (long) (arg1 * 6));
                this.field3771.method1442(0, (byte) 111, class69.field1165, 6);
                int var5 = (class69.field1165[3] & 0xFF << 16) + ((class69.field1165[4] & 0xFF) << 8) + (class69.field1165[5] & 0xFF);
                if (arg0 != -4229) {
                    this.method1577(false, -46, -56, (byte[]) null);
                }
                int var6 = ((class69.field1165[1] & 0xFF) << 8) + (class69.field1165[0] & 0xFF << 16) + (class69.field1165[2] & 0xFF);
                if (var6 < 0 || var6 > this.field3762) {
                    return null;
                } else if (var5 > 0 && ((long) var5) <= (this.field3772.method1438(112) / 520L)) {
                    byte[] var9 = new byte[var6];
                    int var10 = 0;
                    int var11 = 0;
                    while (var6 > var10) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field3772.method1437(arg0 ^ 0xFFFFEF1C, (long) (var5 * 520));
                        int var13 = var6 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3772.method1442(0, (byte) 111, class69.field1165, var13 + 8);
                        int var14 = (class69.field1165[0] & 0xFF << 8) + (class69.field1165[1] & 0xFF);
                        int var15 = (class69.field1165[6] & 0xFF) + ((class69.field1165[5] & 0xFF) << 8) + ((class69.field1165[4] & 0xFF) << 16);
                        int var16 = (class69.field1165[2] & 0xFF << 8) + (class69.field1165[3] & 0xFF);
                        int var17 = class69.field1165[7] & 0xFF;
                        if (arg1 == var14 && var11 == var16 && this.field3769 == var17) {
                            if (var15 >= 0 && this.field3772.method1438(50) / 520L >= (long) var15) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class69.field1165[var20 + 8];
                                }
                                var11++;
                                var5 = var15;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(ILqi;Lqi;I)V")
    public class239(int arg0, class217 arg1, class217 arg2, int arg3) {
        this.field3762 = arg3;
        this.field3771 = arg2;
        this.field3769 = arg0;
        this.field3772 = arg1;
    }
}
