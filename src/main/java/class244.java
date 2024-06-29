import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class244 extends class499 {

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public int field3886;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "I")
    public int field3889;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "F")
    public static float field3885;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V", line = 3)
    public static final void method1742(int arg0) {
        field3888++;
        int var1 = class101.field1681 * 512 + 256;
        int var2 = class31.field455 * 512 + 256;
        int var3 = class202.method1568(var1, class423.field6439, var2, 2) - class167.field2815;
        if (class319.field5005 < 100) {
            if (class675.field9521 < var1) {
                class675.field9521 += (var1 - class675.field9521) * class319.field5005 / 1000 + class180.field3035;
                if (var1 < class675.field9521) {
                    class675.field9521 = var1;
                }
            }
            if (var1 < class675.field9521) {
                class675.field9521 -= (class675.field9521 - var1) * class319.field5005 / 1000 + class180.field3035;
                if (class675.field9521 < var1) {
                    class675.field9521 = var1;
                }
            }
            if (var3 > class607.field8638) {
                class607.field8638 += (var3 - class607.field8638) * class319.field5005 / 1000 + class180.field3035;
                if (class607.field8638 > var3) {
                    class607.field8638 = var3;
                }
            }
            if (var2 > class412.field6318) {
                class412.field6318 += (var2 - class412.field6318) * class319.field5005 / 1000 + class180.field3035;
                if (class412.field6318 > var2) {
                    class412.field6318 = var2;
                }
            }
            if (class607.field8638 > var3) {
                class607.field8638 -= class180.field3035 + ((class607.field8638 - var3) * class319.field5005 / 1000);
                if (class607.field8638 < var3) {
                    class607.field8638 = var3;
                }
            }
            if (class412.field6318 > var2) {
                class412.field6318 -= (class412.field6318 - var2) * class319.field5005 / 1000 + class180.field3035;
                if (var2 > class412.field6318) {
                    class412.field6318 = var2;
                }
            }
        } else {
            class412.field6318 = class31.field455 * 512 + 256;
            class675.field9521 = class101.field1681 * 512 + 256;
            class607.field8638 = class202.method1568(class675.field9521, class423.field6439, class412.field6318, 2) - class167.field2815;
        }
        int var4 = class640.field8986 * 512 + 256;
        int var5 = class177.field2910 * 512 + 256;
        int var6 = class202.method1568(var5, class423.field6439, var4, 2) - class131.field2151;
        int var7 = var5 - class675.field9521;
        int var8 = var6 - class607.field8638;
        int var9 = var4 - class412.field6318;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (arg0 >= -126) {
            return;
        }
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class13.field197 < var11) {
            class13.field197 += (var11 - class13.field197 >> 3) * class556.field8042 / 1000 + class503.field7364 << 3;
            if (var11 < class13.field197) {
                class13.field197 = var11;
            }
        }
        if (class13.field197 > var11) {
            class13.field197 -= (class13.field197 - var11 >> 3) * class556.field8042 / 1000 + class503.field7364 << 3;
            if (class13.field197 < var11) {
                class13.field197 = var11;
            }
        }
        int var13 = var12 - class523.field7598;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class523.field7598 += class503.field7364 + (class556.field8042 * var14 / 1000) << 3;
            class523.field7598 &= 0x3FFF;
        }
        if (var14 < 0) {
            class523.field7598 -= class503.field7364 + (-var14 * class556.field8042 / 1000) << 3;
            class523.field7598 &= 0x3FFF;
        }
        int var15 = var12 - class523.field7598;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class617.field8744 = 0;
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class523.field7598 = var12;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BIIIIIIIII)V", line = 166)
    public static final void method1743(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3884++;
        if (arg0 >= -99) {
            method1743((byte) -118, -65, -117, -36, -43, -7, 108, 66, 27, -101);
        }
        if (!class107.method1016(arg7, (byte) 118)) {
            return;
        }
        if (class575.field8192[arg7] == null) {
            client.method1944(class564.field8105[arg7], -1, arg5, arg2, arg4, arg3, arg6, arg8, arg1, arg9);
        } else {
            client.method1944(class575.field8192[arg7], -1, arg5, arg2, arg4, arg3, arg6, arg8, arg1, arg9);
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lja;Lmea;IIIIIIIIII)V", line = 185)
    public class244(class254 arg0, class395 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field3886 = arg10;
        this.field3889 = arg11;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)Leu;", line = 198)
    public final class444 method1247(int arg0) {
        if (arg0 != 3848) {
            this.field3886 = -42;
        }
        field3883++;
        return class355.field5664;
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)V", line = 212)
    public static final void method1744(int arg0) {
        class453.field6807 = arg0;
        for (int var1 = 0; var1 < class43.field597; var1++) {
            for (int var2 = 0; var2 < class541.field7896; var2++) {
                if (class454.field6818[arg0][var1][var2] == null) {
                    class454.field6818[arg0][var1][var2] = new class252(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([ILpba;I[I[I)V", line = 234)
    public static final void method1745(int[] arg0, class304 arg1, int arg2, int[] arg3, int[] arg4) {
        field3887++;
        for (int var5 = arg2; var5 < arg0.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg4[var5];
            int var8 = arg3[var5];
            for (int var9 = 0; var7 != 0 && arg1.field4201.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field4201[var9] = null;
                    } else {
                        class428 var10 = class636.field8942.method2872((byte) 11, var6);
                        int var11 = var10.field6513;
                        class684 var12 = arg1.field4201[var9];
                        if (var12 != null) {
                            if (var12.field9590 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field4201[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field9596 = 0;
                                    var12.field9592 = var8;
                                    var12.field9588 = 0;
                                    var12.field9591 = 0;
                                    var12.field9595 = 1;
                                    if (!arg1.field4180) {
                                        class216.method1622(0, arg1, (byte) -86, var10);
                                    }
                                } else if (var11 == 2) {
                                    var12.field9591 = 0;
                                }
                            } else if (var10.field6527 >= class636.field8942.method2872((byte) 11, var12.field9590).field6527) {
                                var12 = arg1.field4201[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class684 var13 = arg1.field4201[var9] = new class684();
                            var13.field9595 = 1;
                            var13.field9592 = var8;
                            var13.field9590 = var6;
                            var13.field9591 = 0;
                            var13.field9596 = 0;
                            var13.field9588 = 0;
                            if (!arg1.field4180) {
                                class216.method1622(0, arg1, (byte) -34, var10);
                            }
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }
}
