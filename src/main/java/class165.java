import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public abstract class class165 extends class540 {

    @OriginalMember(owner = "client!wea", name = "k", descriptor = "Z")
    public static boolean field2418 = false;

    @OriginalMember(owner = "client!wea", name = "l", descriptor = "I")
    public static int field2419 = 0;

    @OriginalMember(owner = "client!wea", name = "i", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!wea", name = "j", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!wea", name = "m", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!wea", name = "n", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!wea", name = "o", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lrv;B)V")
    public static final void method1286(class120 arg0, byte arg1) {
        field2416++;
        byte[] var2 = new byte[24];
        if (class421.field5942 != null) {
            try {
                class421.field5942.method2316(0L, true);
                class421.field5942.method2315(var2, 0);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        if (arg1 != 112) {
            method1290(-90, null, null, null, null);
        }
        arg0.method885(var2, -18983, 24, 0);
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(ILada;)I")
    public static final int method1287(int arg0, class171 arg1) {
        field2420++;
        if (class438.field6278 == arg1) {
            return 7681;
        } else if (class174.field2460 == arg1) {
            return 8448;
        } else if (class468.field6696 == arg1) {
            return 34165;
        } else if (class576.field8141 == arg1) {
            return 260;
        } else if (class730.field10204 == arg1) {
            return 34023;
        } else {
            if (arg0 >= -67) {
                field2418 = false;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(ILmia;)V")
    public abstract void method612(int arg0, class69 arg1);

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIILwq;ILaa;IJI)V")
    public static final void method1288(int arg0, int arg1, int arg2, class176 arg3, int arg4, class510 arg5, int arg6, long arg7, int arg8) {
        field2417++;
        int var10 = arg0 * arg0 + arg6 * arg6;
        if (((long) var10) > arg7) {
            return;
        }
        int var11 = Math.min(arg3.field2673 / 2, arg3.field2664 / 2);
        if (var11 * var11 >= var10) {
            class395.method2411(arg5, arg6, arg4, class170.field2440[arg2], arg0, arg8, 1, arg3);
        } else {
            var11 -= 10;
            int var12;
            if (class763.field10510 == 4) {
                var12 = (int) class562.field8001 & 0x3FFF;
            } else {
                var12 = (int) class562.field8001 + class77.field1042 & 0x3FFF;
            }
            int var13 = class601.field8476[var12];
            int var14 = class601.field8473[var12];
            if (class763.field10510 != 4) {
                var14 = var14 * 256 / (class611.field8630 + 256);
                var13 = var13 * 256 / (class611.field8630 + 256);
            }
            int var15 = arg0 * var14 + arg6 * var13 >> 14;
            int var16 = arg6 * var14 - (arg0 * var13) >> 14;
            double var17 = Math.atan2((double) var15, (double) var16);
            int var19 = (int) (Math.sin(var17) * (double) var11);
            int var20 = (int) ((double) var11 * Math.cos(var17));
            class300.field4518[arg2].method799((float) arg3.field2673 / 2.0F + (float) arg8 + (float) var19, (float) arg3.field2664 / 2.0F + (float) arg4 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
        }
        if (arg1 >= -12) {
            method1289(null, (byte) -128, -32, -87, null, -56);
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "([BBIILjava/lang/String;I)I")
    public static final int method1289(byte[] arg0, byte arg1, int arg2, int arg3, String arg4, int arg5) {
        field2422++;
        int var6 = arg3 - arg5;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg4.charAt(arg5 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg0[arg2 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg0[arg2 + var7] = -128;
            } else if (var8 == '‚') {
                arg0[arg2 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg0[arg2 + var7] = -125;
            } else if (var8 == '„') {
                arg0[arg2 + var7] = -124;
            } else if (var8 == '…') {
                arg0[arg2 + var7] = -123;
            } else if (var8 == '†') {
                arg0[arg2 + var7] = -122;
            } else if (var8 == '‡') {
                arg0[arg2 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg0[arg2 + var7] = -120;
            } else if (var8 == '‰') {
                arg0[arg2 + var7] = -119;
            } else if (var8 == 'Š') {
                arg0[arg2 + var7] = -118;
            } else if (var8 == '‹') {
                arg0[arg2 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg0[arg2 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg0[arg2 + var7] = -114;
            } else if (var8 == '‘') {
                arg0[arg2 + var7] = -111;
            } else if (var8 == '’') {
                arg0[arg2 + var7] = -110;
            } else if (var8 == '“') {
                arg0[arg2 + var7] = -109;
            } else if (var8 == '”') {
                arg0[arg2 + var7] = -108;
            } else if (var8 == '•') {
                arg0[arg2 + var7] = -107;
            } else if (var8 == '–') {
                arg0[arg2 + var7] = -106;
            } else if (var8 == '—') {
                arg0[arg2 + var7] = -105;
            } else if (var8 == '˜') {
                arg0[arg2 + var7] = -104;
            } else if (var8 == '™') {
                arg0[arg2 + var7] = -103;
            } else if (var8 == 'š') {
                arg0[arg2 + var7] = -102;
            } else if (var8 == '›') {
                arg0[arg2 + var7] = -101;
            } else if (var8 == 'œ') {
                arg0[arg2 + var7] = -100;
            } else if (var8 == 'ž') {
                arg0[arg2 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg0[arg2 + var7] = -97;
            } else {
                arg0[arg2 + var7] = 63;
            }
        }
        if (arg1 != -125) {
            method1290(-48, null, null, null, null);
        }
        return var6;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I[ILkia;[I[I)V")
    public static final void method1290(int arg0, int[] arg1, class645 arg2, int[] arg3, int[] arg4) {
        field2421++;
        if (arg0 != 8482) {
            method1289(null, (byte) 14, -92, 12, null, 116);
        }
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg3[var5];
            int var8 = arg1[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg2.field6432.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field6432[var9] = null;
                    } else {
                        class129 var10 = class203.field2975.method1931((byte) -81, var6);
                        int var11 = var10.field1679;
                        class61 var12 = arg2.field6432[var9];
                        if (var12 != null) {
                            if (var12.field837 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field6432[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field836 = 1;
                                    var12.field832 = 0;
                                    var12.field834 = var8;
                                    var12.field835 = 0;
                                    var12.field833 = 0;
                                    if (!arg2.field6430) {
                                        class524.method3048((byte) 17, 0, arg2, var10);
                                    }
                                } else if (var11 == 2) {
                                    var12.field832 = 0;
                                }
                            } else if (var10.field1667 >= class203.field2975.method1931((byte) -81, var12.field837).field1667) {
                                var12 = arg2.field6432[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class61 var13 = arg2.field6432[var9] = new class61();
                            var13.field833 = 0;
                            var13.field837 = var6;
                            var13.field834 = var8;
                            var13.field832 = 0;
                            var13.field835 = 0;
                            var13.field836 = 1;
                            if (!arg2.field6430) {
                                class524.method3048((byte) 17, 0, arg2, var10);
                            }
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lrv;I)V")
    public abstract void method614(class120 arg0, int arg1);
}
