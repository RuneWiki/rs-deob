import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class73 {

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Lpa;")
    private class258 field1292 = null;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Lpa;")
    private class258 field1289 = null;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    private int field1300 = 65000;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    private int field1291;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "[I")
    public static int[] field1293 = new int[256];

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field1297 = 0;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "Lha;")
    public static class46 field1298 = class271.method1828(")4p=", -46);

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "Lha;")
    public static class46 field1306;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Laa;")
    public static class39 field1301;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "Lha;")
    public static class46 field1308;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "Lha;")
    public static class46 field1307;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "Lha;")
    public static class46 field1310;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method526(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class61.field1027++;
        class167.field2946 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class173.field3093; var12 < class198.field3545; var12++) {
            class201[][] var38 = class111.field2080[var12];
            for (int var39 = class127.field2323; var39 < class42.field716; var39++) {
                for (int var40 = class53.field923; var40 < class113.field2141; var40++) {
                    class201 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class122.field2276[var39 + class81.field1538 - class258.field4503][var40 + class81.field1538 - class267.field4623] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field3592 = true;
                            var41.field3593 = true;
                            if (var41.field3585 > 0) {
                                var41.field3588 = true;
                            } else {
                                var41.field3588 = false;
                            }
                            class167.field2946++;
                        } else {
                            var41.field3592 = false;
                            var41.field3593 = false;
                            var41.field3587 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field3589 != null) {
                                    class255 var42 = var41.field3589;
                                    var42.field4466.method982(var42.field4469, var42.field4469, var42.field4460, var42.field4460, (byte) -89);
                                    if (var42.field4463 != null) {
                                        var42.field4463.method982(var42.field4469, var42.field4469, var42.field4460, var42.field4460, (byte) -101);
                                    }
                                }
                                if (var41.field3606 != null) {
                                    class168 var43 = var41.field3606;
                                    var43.field2951.method982(var43.field2961, var43.field2961, var43.field2967, var43.field2967, (byte) -123);
                                    if (var43.field2964 != null) {
                                        var43.field2964.method982(var43.field2961, var43.field2961, var43.field2967, var43.field2967, (byte) -92);
                                    }
                                }
                                if (var41.field3607 != null) {
                                    class182 var44 = var41.field3607;
                                    var44.field3269.method982(var44.field3271, var44.field3271, var44.field3277, var44.field3277, (byte) -98);
                                }
                                if (var41.field3600 != null) {
                                    for (int var45 = 0; var45 < var41.field3585; var45++) {
                                        class197 var46 = var41.field3600[var45];
                                        var46.field3532.method982(var46.field3540, var46.field3541, var46.field3530, var46.field3533, (byte) -99);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class258.field4491 == class119.field2228;
        for (int var14 = class173.field3093; var14 < class198.field3545; var14++) {
            class201[][] var27 = class111.field2080[var14];
            for (int var28 = -class81.field1538; var28 <= 0; var28++) {
                int var29 = class258.field4503 + var28;
                int var30 = class258.field4503 - var28;
                if (var29 >= class127.field2323 || var30 < class42.field716) {
                    for (int var31 = -class81.field1538; var31 <= 0; var31++) {
                        int var32 = class267.field4623 + var31;
                        int var33 = class267.field4623 - var31;
                        if (var29 >= class127.field2323) {
                            if (var32 >= class53.field923) {
                                class201 var34 = var27[var29][var32];
                                if (var34 != null && var34.field3592) {
                                    class239.method1643(var34, true);
                                }
                            }
                            if (var33 < class113.field2141) {
                                class201 var35 = var27[var29][var33];
                                if (var35 != null && var35.field3592) {
                                    class239.method1643(var35, true);
                                }
                            }
                        }
                        if (var30 < class42.field716) {
                            if (var32 >= class53.field923) {
                                class201 var36 = var27[var30][var32];
                                if (var36 != null && var36.field3592) {
                                    class239.method1643(var36, true);
                                }
                            }
                            if (var33 < class113.field2141) {
                                class201 var37 = var27[var30][var33];
                                if (var37 != null && var37.field3592) {
                                    class239.method1643(var37, true);
                                }
                            }
                        }
                        if (class167.field2946 == 0) {
                            if (!var13) {
                                class240.field4278 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class173.field3093; var15 < class198.field3545; var15++) {
            class201[][] var16 = class111.field2080[var15];
            for (int var17 = -class81.field1538; var17 <= 0; var17++) {
                int var18 = class258.field4503 + var17;
                int var19 = class258.field4503 - var17;
                if (var18 >= class127.field2323 || var19 < class42.field716) {
                    for (int var20 = -class81.field1538; var20 <= 0; var20++) {
                        int var21 = class267.field4623 + var20;
                        int var22 = class267.field4623 - var20;
                        if (var18 >= class127.field2323) {
                            if (var21 >= class53.field923) {
                                class201 var23 = var16[var18][var21];
                                if (var23 != null && var23.field3592) {
                                    class239.method1643(var23, false);
                                }
                            }
                            if (var22 < class113.field2141) {
                                class201 var24 = var16[var18][var22];
                                if (var24 != null && var24.field3592) {
                                    class239.method1643(var24, false);
                                }
                            }
                        }
                        if (var19 < class42.field716) {
                            if (var21 >= class53.field923) {
                                class201 var25 = var16[var19][var21];
                                if (var25 != null && var25.field3592) {
                                    class239.method1643(var25, false);
                                }
                            }
                            if (var22 < class113.field2141) {
                                class201 var26 = var16[var19][var22];
                                if (var26 != null && var26.field3592) {
                                    class239.method1643(var26, false);
                                }
                            }
                        }
                        if (class167.field2946 == 0) {
                            if (!var13) {
                                class240.field4278 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class240.field4278 = false;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB[BI)Z")
    public final boolean method527(int arg0, byte arg1, byte[] arg2, int arg3) {
        field1302++;
        class258 var5 = this.field1292;
        synchronized (this.field1292) {
            if (arg3 < 0 || this.field1300 < arg3) {
                throw new IllegalArgumentException();
            }
            if (arg1 != 120) {
                this.toString();
            }
            boolean var6 = this.method528(true, arg2, arg0, arg3, false);
            if (!var6) {
                var6 = this.method528(false, arg2, arg0, arg3, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!kb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1295++;
        return "Cache:" + this.field1291;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z[BIIZ)Z")
    private final boolean method528(boolean arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        field1288++;
        class258 var6 = this.field1292;
        synchronized (this.field1292) {
            try {
                int var7;
                if (arg0) {
                    if (this.field1289.method1725(12742) < (long) (arg2 * 6 + 6)) {
                        return false;
                    }
                    this.field1289.method1736(120, (long) (arg2 * 6));
                    this.field1289.method1726(-20667, 0, 6, class142.field2602);
                    var7 = (class142.field2602[3] & 0xFF << 16) + ((class142.field2602[4] & 0xFF << 8) + (class142.field2602[5] & 0xFF));
                    if (var7 <= 0 || (long) var7 > this.field1292.method1725(12742) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field1292.method1725(12742) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class142.field2602[0] = (byte) (arg3 >> 16);
                class142.field2602[3] = (byte) (var7 >> 16);
                class142.field2602[4] = (byte) (var7 >> 8);
                class142.field2602[5] = (byte) var7;
                class142.field2602[2] = (byte) arg3;
                int var10 = 0;
                class142.field2602[1] = (byte) (arg3 >> 8);
                this.field1289.method1736(106, (long) (arg2 * 6));
                this.field1289.method1735(6, 0, class142.field2602, arg4);
                int var11 = 0;
                while (var10 < arg3) {
                    int var12 = 0;
                    if (arg0) {
                        label105: {
                            this.field1292.method1736(110, (long) (var7 * 520));
                            try {
                                this.field1292.method1726(-20667, 0, 8, class142.field2602);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class142.field2602[4] & 0xFF << 16) + (((class142.field2602[5] & 0xFF) << 8) + (class142.field2602[6] & 0xFF));
                            int var13 = (class142.field2602[0] & 0xFF << 8) + (class142.field2602[1] & 0xFF);
                            int var14 = ((class142.field2602[2] & 0xFF) << 8) + (class142.field2602[3] & 0xFF);
                            int var15 = class142.field2602[7] & 0xFF;
                            if (arg2 == var13 && var11 == var14 && this.field1291 == var15) {
                                if (var12 >= 0 && ((long) var12) <= (this.field1292.method1725(12742) / 520L)) {
                                    break label105;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg0 = false;
                        var12 = (int) ((this.field1292.method1725(12742) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class142.field2602[3] = (byte) var11;
                    class142.field2602[2] = (byte) (var11 >> 8);
                    class142.field2602[7] = (byte) this.field1291;
                    if (arg3 - var10 <= 512) {
                        var12 = 0;
                    }
                    class142.field2602[4] = (byte) (var12 >> 16);
                    class142.field2602[6] = (byte) var12;
                    class142.field2602[5] = (byte) (var12 >> 8);
                    int var18 = arg3 - var10;
                    var11++;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class142.field2602[0] = (byte) (arg2 >> 8);
                    class142.field2602[1] = (byte) arg2;
                    this.field1292.method1736(96, (long) (var7 * 520));
                    var7 = var12;
                    this.field1292.method1735(8, 0, class142.field2602, arg4);
                    this.field1292.method1735(var18, var10, arg1, arg4);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static void method529(byte arg0) {
        field1306 = null;
        field1293 = null;
        field1298 = null;
        field1308 = null;
        field1307 = null;
        if (arg0 > -8) {
            method526(61, -18, -115, (byte[][][]) null, 123, (byte) -126, 27, -71);
        }
        field1301 = null;
        field1310 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        class171.method1224(32625, arg3);
        field1294++;
        int var7 = 0;
        int var8 = arg3;
        int var9 = arg3 - arg0;
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = -arg3;
        int var11 = var9;
        int var12 = -var9;
        int var13 = -1;
        int var14 = -1;
        int var15 = arg5 - var9;
        int var16 = arg5 + var9;
        int[] var17 = class6.field100[arg4];
        class24.method170((byte) 33, arg5 - arg3, var17, var15, arg2);
        class24.method170((byte) 33, var15, var17, var16, arg1);
        class24.method170((byte) 33, var16, var17, arg3 + arg5, arg2);
        if (arg6 != 125) {
            method533(-116, 10L, 0, 50, true);
        }
        while (var8 > var7) {
            var14 += 2;
            var10 += var14;
            var13 += 2;
            var12 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class96.field1796[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var8--;
                var10 -= var8 << 1;
                if (var8 < var9) {
                    int[] var18 = class6.field100[arg4 + var8];
                    int var19 = class96.field1796[var8];
                    int[] var20 = class6.field100[arg4 - var8];
                    int var21 = arg5 + var19;
                    int var22 = arg5 - var19;
                    int var23 = arg5 - var7;
                    int var24 = arg5 + var7;
                    class24.method170((byte) 33, var23, var18, var22, arg2);
                    class24.method170((byte) 33, var22, var18, var21, arg1);
                    class24.method170((byte) 33, var21, var18, var24, arg2);
                    class24.method170((byte) 33, var23, var20, var22, arg2);
                    class24.method170((byte) 33, var22, var20, var21, arg1);
                    class24.method170((byte) 33, var21, var20, var24, arg2);
                } else {
                    int[] var25 = class6.field100[arg4 + var8];
                    int var26 = arg5 - var7;
                    int[] var27 = class6.field100[arg4 - var8];
                    int var28 = arg5 + var7;
                    class24.method170((byte) 33, var26, var25, var28, arg2);
                    class24.method170((byte) 33, var26, var27, var28, arg2);
                }
            }
            int[] var29 = class6.field100[arg4 + var7];
            int[] var30 = class6.field100[arg4 - var7];
            int var31 = arg5 + var8;
            int var32 = arg5 - var8;
            if (var7 >= var9) {
                class24.method170((byte) 33, var32, var29, var31, arg2);
                class24.method170((byte) 33, var32, var30, var31, arg2);
            } else {
                int var33 = var7 <= var11 ? var11 : class96.field1796[var7];
                int var34 = arg5 + var33;
                int var35 = arg5 - var33;
                class24.method170((byte) 33, var32, var29, var35, arg2);
                class24.method170((byte) 33, var35, var29, var34, arg1);
                class24.method170((byte) 33, var34, var29, var31, arg2);
                class24.method170((byte) 33, var32, var30, var35, arg2);
                class24.method170((byte) 33, var35, var30, var34, arg1);
                class24.method170((byte) 33, var34, var30, var31, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljj;Lpi;ILpi;)V")
    public static final void method531(class25 arg0, class181 arg1, int arg2, class181 arg3) {
        field1299++;
        class61.field1015 = arg3;
        class128.field2350 = arg0;
        class109.field2044 = arg1;
        if (arg2 > -86) {
            method529((byte) -52);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)[B")
    public final byte[] method532(boolean arg0, int arg1) {
        field1303++;
        class258 var3 = this.field1292;
        synchronized (this.field1292) {
            try {
                if (this.field1289.method1725(12742) < ((long) (arg1 * 6 + 6))) {
                    return null;
                }
                this.field1289.method1736(100, (long) (arg1 * 6));
                this.field1289.method1726(-20667, 0, 6, class142.field2602);
                int var5 = ((class142.field2602[3] & 0xFF) << 16) + ((class142.field2602[4] & 0xFF) << 8) + (class142.field2602[5] & 0xFF);
                int var6 = (class142.field2602[2] & 0xFF) + (((class142.field2602[0] & 0xFF) << 16) + (class142.field2602[1] & 0xFF << 8));
                if (var6 < 0 || var6 > this.field1300) {
                    return null;
                } else if (var5 > 0 && this.field1292.method1725(12742) / 520L >= (long) var5) {
                    if (arg0) {
                        method531((class25) null, (class181) null, -18, (class181) null);
                    }
                    byte[] var9 = new byte[var6];
                    int var10 = 0;
                    int var11 = 0;
                    label74: while (var6 > var11) {
                        if (var5 == 0) {
                            return null;
                        }
                        int var13 = var6 - var11;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field1292.method1736(104, (long) (var5 * 520));
                        this.field1292.method1726(-20667, 0, var13 + 8, class142.field2602);
                        int var14 = (class142.field2602[2] & 0xFF << 8) + (class142.field2602[3] & 0xFF);
                        int var15 = (class142.field2602[6] & 0xFF) + (class142.field2602[4] & 0xFF << 16) + (class142.field2602[5] & 0xFF << 8);
                        int var16 = class142.field2602[7] & 0xFF;
                        int var17 = ((class142.field2602[0] & 0xFF) << 8) + (class142.field2602[1] & 0xFF);
                        if (arg1 == var17 && var10 == var14 && this.field1291 == var16) {
                            if (var15 >= 0 && (long) var15 <= this.field1292.method1725(12742) / 520L) {
                                var5 = var15;
                                var10++;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label74;
                                    }
                                    var9[var11++] = class142.field2602[var20 + 8];
                                    var20++;
                                }
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

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IJIIZ)Lha;")
    public static final class46 method533(int arg0, long arg1, int arg2, int arg3, boolean arg4) {
        field1290++;
        class46 var6 = class181.method1305(25127, 0);
        if (arg1 < 0L) {
            arg1 = -arg1;
            var6.method348(class115.field2166, -123);
        }
        class46 var7 = class202.field3608;
        class46 var8 = class34.field625;
        if (arg2 == 1) {
            var8 = class202.field3608;
            var7 = class34.field625;
        }
        if (arg2 == 2) {
            var8 = class210.field3752;
            var7 = class34.field625;
        }
        class46 var9 = class181.method1305(25127, 0);
        class46 var10 = class181.method1305(arg0 + 24872, 0);
        if (arg0 != 255) {
            return null;
        }
        for (int var11 = 0; var11 < arg3; var11++) {
            var10.method348(class115.method932(false, (int) (arg1 % 10L)), -33);
            arg1 /= 10L;
        }
        if (arg1 == 0L) {
            var9 = class188.field3367;
        }
        int var12 = 0;
        while (arg1 > 0L) {
            if (arg4 && var12 != 0 && (var12 % 3) == 0) {
                var9.method348(var8, -41);
            }
            var12++;
            var9.method348(class115.method932(false, (int) (arg1 % 10L)), -85);
            arg1 /= 10L;
        }
        if (var10.method314(22) > 0) {
            var10.method348(var7, -72);
        }
        return class109.method855(0, new class46[] { var6, var9.method331((byte) -3), var10.method331((byte) -3) });
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(ILpa;Lpa;I)V")
    public class73(int arg0, class258 arg1, class258 arg2, int arg3) {
        this.field1289 = arg2;
        this.field1292 = arg1;
        this.field1300 = arg3;
        this.field1291 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1293[var0] = var1;
        }
        field1306 = class271.method1828("m-Ochte mit Ihnen handeln)3", -46);
        field1304 = 0;
        field1305 = 0;
        field1301 = new class39();
        field1308 = class271.method1828("cookiehost", -46);
        field1307 = class271.method1828("m-Ochte mit Ihnen handeln)3", -46);
        field1309 = 100;
        field1310 = class271.method1828("<img=1>", -46);
    }
}
