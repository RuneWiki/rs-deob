import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class80 {

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "[I")
    private int[] field1334;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "[I")
    private int[] field1336;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "[B")
    private byte[] field1331;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "[S")
    public static short[] field1333 = new short[256];

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "Z")
    public static boolean field1340 = false;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BILhc;)Lh;")
    public static final class278 method570(byte arg0, int arg1, class235 arg2) {
        byte[] var3 = arg2.method1601(17055, arg1);
        int var4 = -73 / ((63 - arg0) / 46);
        field1339++;
        return var3 == null ? null : new class278(var3);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)I")
    public static final int method571(byte arg0) {
        if (arg0 != -105) {
            method571((byte) -69);
        }
        field1335++;
        return class241.field3922.method1895(true);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)V")
    public static final void method572(byte arg0, int arg1) {
        field1342++;
        if (arg1 >= 0 && arg1 < class152.field2378.length) {
            if (arg0 != 115) {
                method572((byte) 47, -78);
            }
            class152.field2378[arg1] = !class152.field2378[arg1];
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IBI[BI[B)I")
    public final int method573(int arg0, byte arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
        field1338++;
        if (arg2 == 0) {
            return 0;
        }
        int var7 = arg2 + arg4;
        int var8 = 0;
        if (arg1 <= 32) {
            this.method573(113, (byte) 93, -8, (byte[]) null, -111, (byte[]) null);
        }
        int var9 = arg0;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field1336[var8];
            }
            int var11;
            if ((var11 = this.field1336[var8]) < 0) {
                arg5[arg4++] = (byte) (~var11);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1336[var8];
            }
            int var12;
            if ((var12 = this.field1336[var8]) < 0) {
                arg5[arg4++] = (byte) (~var12);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1336[var8];
            }
            int var13;
            if ((var13 = this.field1336[var8]) < 0) {
                arg5[arg4++] = (byte) (~var13);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1336[var8];
            }
            int var14;
            if ((var14 = this.field1336[var8]) < 0) {
                arg5[arg4++] = (byte) (~var14);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1336[var8];
            }
            int var15;
            if ((var15 = this.field1336[var8]) < 0) {
                arg5[arg4++] = (byte) (~var15);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1336[var8];
            }
            int var16;
            if ((var16 = this.field1336[var8]) < 0) {
                arg5[arg4++] = (byte) (~var16);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1336[var8];
            }
            int var17;
            if ((var17 = this.field1336[var8]) < 0) {
                arg5[arg4++] = (byte) (~var17);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1336[var8];
            }
            int var18;
            if ((var18 = this.field1336[var8]) < 0) {
                arg5[arg4++] = (byte) (~var18);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([BIII[BI)I")
    public final int method574(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = arg2 + arg5;
        field1332++;
        int var8 = 0;
        int var9 = arg3 << 3;
        while (var7 > arg5) {
            int var10 = arg0[arg5] & 0xFF;
            int var11 = this.field1334[var10];
            byte var12 = this.field1331[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 & 0x7;
            int var14 = var9 >> 3;
            var9 += var12;
            int var15 = var8 & -var13 >> 31;
            int var16 = (var12 + var13 - 1 >> 3) + var14;
            int var17 = var13 + 24;
            arg4[var14] = (byte) (var8 = class45.method330(var15, var11 >>> var17));
            if (var14 < var16) {
                var13 = var17 - 8;
                var14++;
                arg4[var14] = (byte) (var8 = var11 >>> var13);
                if (var16 > var14) {
                    var14++;
                    var13 -= 8;
                    arg4[var14] = (byte) (var8 = var11 >>> var13);
                    if (var16 > var14) {
                        var13 -= 8;
                        var14++;
                        arg4[var14] = (byte) (var8 = var11 >>> var13);
                        if (var16 > var14) {
                            var14++;
                            var13 -= 8;
                            arg4[var14] = (byte) (var8 = var11 << -var13);
                        }
                    }
                }
            }
            arg5++;
        }
        if (arg1 != -1) {
            this.field1334 = null;
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static void method575(int arg0) {
        field1333 = null;
        if (arg0 != -14673) {
            method576(51L, false, true, (String) null, 112, false, -25, 28, (String) null, -120, -83);
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "([B)V")
    public class80(byte[] arg0) {
        int var2 = arg0.length;
        this.field1334 = new int[var2];
        this.field1336 = new int[8];
        this.field1331 = arg0;
        int var3 = 0;
        int[] var4 = new int[33];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field1334[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var4[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var4[var10] = var4[var10 - 1];
                            break;
                        }
                        var4[var10] = class45.method330(var11, var12);
                    }
                    var9 = var7 | var8;
                } else {
                    var9 = var4[var6 - 1];
                }
                var4[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field1336[var14] == 0) {
                            this.field1336[var14] = var3;
                        }
                        var14 = this.field1336[var14];
                    }
                    if (this.field1336.length <= var14) {
                        int[] var17 = new int[this.field1336.length * 2];
                        for (int var18 = 0; var18 < this.field1336.length; var18++) {
                            var17[var18] = this.field1336[var18];
                        }
                        this.field1336 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var3) {
                    var3 = var14 + 1;
                }
                this.field1336[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(JZZLjava/lang/String;IZIILjava/lang/String;II)V")
    public static final void method576(long arg0, boolean arg1, boolean arg2, String arg3, int arg4, boolean arg5, int arg6, int arg7, String arg8, int arg9, int arg10) {
        field1337++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class88 var14 = new class88(128);
        var14.method654((byte) -97, 10);
        var14.method634((arg5 ? 4 : 0) | (arg2 ? 2 : 0) | (arg1 ? 1 : 0), 46);
        var14.method638(arg0, false);
        var14.method639(var12[0], (byte) -108);
        var14.method680(arg8, (byte) 101);
        var14.method639(var12[1], (byte) -107);
        var14.method634(class232.field3696, 105);
        var14.method654((byte) -107, arg9);
        var14.method654((byte) -113, arg10);
        var14.method639(var12[2], (byte) -115);
        var14.method634(arg4, arg7 ^ 0x15);
        var14.method634(arg6, 100);
        var14.method639(var12[3], (byte) -102);
        var14.method632(-32106, class29.field407, class11.field189);
        class88 var15 = new class88(350);
        var15.method680(arg3, (byte) 101);
        int var16 = 8 - (class125.method871(arg3, true) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method654((byte) -125, (int) (Math.random() * 255.0D));
        }
        var15.method626(var12, 0);
        client.field2435.field1535 = 0;
        client.field2435.method654((byte) -116, 22);
        client.field2435.method634(2 - (-var14.field1535 - var15.field1535), 96);
        client.field2435.method634(536, 21);
        client.field2435.method669(0, var14.field1471, var14.field1535, -1);
        client.field2435.method669(arg7, var15.field1471, var15.field1535, -1);
        class171.field2677 = -3;
        class47.field688 = 0;
        class255.field4087 = 1;
        class15.field234 = 0;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V")
    public static final void method577(int arg0, int arg1, int arg2) {
        field1341++;
        class31.field462[arg2] = arg0;
        class70 var3 = (class70) class183.field2842.method285((long) arg2, 13821);
        if (arg1 != 2) {
            field1340 = true;
        }
        if (var3 == null) {
            class70 var4 = new class70(class134.method924(false) + 500L);
            class183.field2842.method281(1, (long) arg2, var4);
        } else {
            var3.field1120 = class134.method924(false) + 500L;
        }
    }
}
