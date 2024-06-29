import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class93 extends class96 {

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
    private int field1290 = 2048;

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "I")
    private int field1294 = 5;

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "[B")
    private byte[] field1292 = new byte[512];

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "[S")
    private short[] field1295 = new short[512];

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
    private int field1289 = 0;

    @OriginalMember(owner = "client!ud", name = "W", descriptor = "I")
    private int field1297 = 5;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
    private int field1288 = 1;

    @OriginalMember(owner = "client!ud", name = "V", descriptor = "I")
    private int field1296 = 2;

    @OriginalMember(owner = "client!ud", name = "Z", descriptor = "Lpi;")
    public static class340 field1300 = new class340(4, -1);

    @OriginalMember(owner = "client!ud", name = "bb", descriptor = "Lhb;")
    public static class250 field1302 = new class250(59, 8);

    @OriginalMember(owner = "client!ud", name = "cb", descriptor = "J")
    public static long field1303 = 0L;

    @OriginalMember(owner = "client!ud", name = "eb", descriptor = "[Z")
    public static boolean[] field1305 = new boolean[100];

    @OriginalMember(owner = "client!ud", name = "fb", descriptor = "I")
    public static int field1306 = 1400;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!ud", name = "X", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!ud", name = "Y", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!ud", name = "ab", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!ud", name = "db", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!ud", name = "gb", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V", line = 4)
    public class93() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILbt;)V", line = 8)
    public final void method31(int arg0, int arg1, class88 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field1297 = arg2.method617(2);
                                }
                            } else {
                                this.field1294 = arg2.method617(2);
                            }
                        } else {
                            this.field1288 = arg2.method617(2);
                        }
                    } else {
                        this.field1296 = arg2.method617(2);
                    }
                } else {
                    this.field1290 = arg2.method568((byte) 110);
                }
            } else {
                this.field1289 = arg2.method617(arg1 + 3);
            }
        } else {
            this.field1294 = this.field1297 = arg2.method617(arg1 + 3);
        }
        if (arg1 == -1) {
            ++field1298;
        }
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V", line = 87)
    public final void method390(int arg0) {
        ++field1291;
        this.field1292 = class486.method2904(this.field1289, false);
        this.method639((byte) -56);
        if (arg0 < 15) {
            field1306 = 100;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/String;Leo;Loa;IIIILov;Lea;III)V", line = 101)
    public static final void method636(String arg0, class423 arg1, class167 arg2, int arg3, int arg4, int arg5, int arg6, class278 arg7, class113 arg8, int arg9, int arg10, int arg11) {
        ++field1286;
        int var12;
        if (~class396.field5271 != -5) {
            var12 = 16383 & (int) class244.field3138 + class446.field6192;
        } else {
            var12 = (int) class244.field3138 & 16383;
        }
        int var13 = Math.max(arg1.field5735 / 2, arg1.field5726 / 2) + 10;
        int var14 = arg3 * arg3 + arg11 * arg11;
        if (var14 <= var13 * var13) {
            int var15 = class21.field385[var12];
            int var16 = class21.field397[var12];
            if (~class396.field5271 != -5) {
                var16 = var16 * 256 / (class364.field4694 + 256);
                var15 = var15 * 256 / (class364.field4694 - -256);
            }
            int var17 = arg3 * var15 + arg11 * var16 >> 15;
            if (arg9 != 121532524) {
                field1306 = 72;
            }
            int var18 = arg3 * var16 + -(arg11 * var15) >> 15;
            int var19 = arg7.method1711(100, arg0, 86, (class404[]) null);
            int var20 = var17 - var19 / 2;
            int var21 = arg7.method1706(0, -1, arg0, 100, (class404[]) null);
            if (~(-arg1.field5735) >= ~var20 && var20 <= arg1.field5735 && ~var18 <= ~(-arg1.field5726) && ~var18 >= ~arg1.field5726) {
                arg2.method1109((byte) 84, 0, arg8, 1, arg0, arg4, 0, arg1.field5726 / 2 - var18 + arg6 + -arg5 - var21, (int[]) null, arg6, arg1.field5735 / 2 + var20 + arg10, var19, (class404[]) null, 0, 50, arg10);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILqa;)V", line = 152)
    public static final void method637(int arg0, class129 arg1) {
        ++field1293;
        int var2 = class115.field1574;
        int var3 = class44.field642;
        int var4 = class98.field1374;
        int var5 = class129.field1756;
        int var6 = -10660793;
        arg1.method866(var5, -5152, var2, var4, var3, var6);
        arg1.method866(16, -5152, arg0 + var2, var4 + -2, var3 + 1, -16777216);
        arg1.method902(-16777216, var3 - -18, var5 + -19, var4 + -2, var2 + 1, 4);
        class200.field2590.method1118(var3 + 14, var2 + 3, -1, var6, arg0 ^ -8633, class457.field6383.method1127(class379.field4920, false));
        int var7 = class268.field3397.method717((byte) 82);
        int var8 = class268.field3397.method721((byte) 74);
        int var9 = 0;
        for (class502 var10 = (class502) class103.field1421.method49(arg0 ^ -101); var10 != null; var10 = (class502) class103.field1421.method46((byte) 2)) {
            int var11 = (class271.field3433 + -1 + -var9) * 16 + var3 + 31;
            short var12 = -1;
            if (~var7 < ~var2 && var7 < var2 + var4 && ~(var11 + -13) > ~var8 && ~var8 > ~(var11 + 3) && var10.field7382) {
                var12 = -256;
            }
            int[] var13 = null;
            if (!class5.method27(var10.field7390, (byte) 113)) {
                if (var10.field7384 == -1) {
                    if (!class138.method962(var10.field7390, 97)) {
                        if (class215.method1369(var10.field7390, 121)) {
                            Object var14 = null;
                            class402 var15;
                            if (var10.field7390 != 1004) {
                                var15 = class52.field715.method1164((int) (var10.field7388 >>> 32 & 2147483647L), 0);
                            } else {
                                var15 = class52.field715.method1164((int) var10.field7388, arg0 + -1);
                            }
                            if (var15.field5419 != null) {
                                var15 = var15.method2393(class198.field2555, (byte) 32);
                            }
                            if (var15 != null) {
                                var13 = var15.field5375;
                            }
                        }
                    } else {
                        class295 var16 = class527.field7791[(int) var10.field7388];
                        if (var16 != null) {
                            class10 var17 = var16.field3831;
                            if (var17.field111 != null) {
                                var17 = var17.method63(false, class198.field2555);
                            }
                            if (var17 != null) {
                                var13 = var17.field126;
                            }
                        }
                    }
                } else {
                    var13 = class89.field1238.method111(var10.field7384, -107).field7288;
                }
            } else {
                var13 = class89.field1238.method111((int) var10.field7388, 49).field7288;
            }
            String var18 = class440.method2599(var10, (byte) 101);
            if (var13 != null) {
                var18 = var18 + class158.method1065((byte) -67, var13);
            }
            class200.field2590.method1103(class270.field3427, class374.field4857, true, var2 - -3, 0, var18, var12, var11);
            ++var9;
            if (var10.field7387) {
                class52.field716.method2406(var2 - (-5 + -class157.field2070.method1704((byte) 98, var18)), var11 - 12);
            }
        }
        class188.method1239(class44.field642, (byte) -126, class129.field1756, class98.field1374, class115.field1574);
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V", line = 260)
    public static void method638(int arg0) {
        if (arg0 >= -9) {
            method636((String) null, (class423) null, (class167) null, 57, -121, -66, 18, (class278) null, (class113) null, 98, -116, 52);
        }
        field1302 = null;
        field1300 = null;
        field1305 = null;
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(B)V", line = 272)
    private final void method639(byte arg0) {
        ++field1287;
        Random var2 = new Random((long) this.field1289);
        this.field1295 = new short[512];
        if (arg0 != -56) {
            this.field1297 = -42;
        }
        if (this.field1290 > 0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field1295[var3] = (short) class179.method1160(Integer.MIN_VALUE, var2, this.field1290);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)[I", line = 309)
    public final int[] method37(int arg0, int arg1) {
        ++field1299;
        if (arg1 != 255) {
            return null;
        } else {
            int[] var3 = super.field1331.method397((byte) -110, arg0);
            if (super.field1331.field863) {
                int var4 = class74.field933[arg0] * this.field1297 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; var7 < class269.field3403; ++var7) {
                    class458.field6393 = Integer.MAX_VALUE;
                    class77.field986 = Integer.MAX_VALUE;
                    class428.field5870 = Integer.MAX_VALUE;
                    class485.field7055 = Integer.MAX_VALUE;
                    int var8 = class510.field7476[var7] * this.field1294 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 - -1;
                    for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                        int var13 = this.field1292[(~var11 <= ~this.field1297 ? -this.field1297 + var11 : var11) & 255] & 255;
                        for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                            int var15 = (255 & this.field1292[255 & var13 - -(this.field1294 > var14 ? var14 : -this.field1294 + var14)]) * 2;
                            int var27 = var15 + 1;
                            int var16 = -this.field1295[var15] + -(var14 << 12) + var8;
                            int var17 = -this.field1295[var27] - ((var11 << 12) - var4);
                            int var18 = this.field1288;
                            int var19;
                            if (~var18 != -2) {
                                if (var18 != 3) {
                                    if (var18 != 4) {
                                        if (~var18 != -6) {
                                            if (~var18 == -3) {
                                                var19 = (var16 >= 0 ? var16 : -var16) + (var17 >= 0 ? var17 : -var17);
                                            } else {
                                                var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                            }
                                        } else {
                                            int var20 = var17 * var17;
                                            int var21 = var16 * var16;
                                            var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                        }
                                    } else {
                                        int var22 = (int) (Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                        int var23 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = ~var17 > -1 ? -var17 : var17;
                                    int var26 = ~var16 <= -1 ? var16 : -var16;
                                    var19 = var25 >= var26 ? var25 : var26;
                                }
                            } else {
                                var19 = var16 * var16 + var17 * var17 >> 12;
                            }
                            if (~class485.field7055 < ~var19) {
                                class458.field6393 = class77.field986;
                                class77.field986 = class428.field5870;
                                class428.field5870 = class485.field7055;
                                class485.field7055 = var19;
                            } else if (var19 >= class428.field5870) {
                                if (class77.field986 > var19) {
                                    class458.field6393 = class77.field986;
                                    class77.field986 = var19;
                                } else if (var19 < class458.field6393) {
                                    class458.field6393 = var19;
                                }
                            } else {
                                class458.field6393 = class77.field986;
                                class77.field986 = class428.field5870;
                                class428.field5870 = var19;
                            }
                        }
                    }
                    int var12 = this.field1296;
                    if (var12 != 0) {
                        if (var12 != 1) {
                            if (var12 != 3) {
                                if (var12 != 4) {
                                    if (~var12 == -3) {
                                        var3[var7] = -class485.field7055 + class428.field5870;
                                    }
                                } else {
                                    var3[var7] = class458.field6393;
                                }
                            } else {
                                var3[var7] = class77.field986;
                            }
                        } else {
                            var3[var7] = class428.field5870;
                        }
                    } else {
                        var3[var7] = class485.field7055;
                    }
                }
            }
            return var3;
        }
    }
}
