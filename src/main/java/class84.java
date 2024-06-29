import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class84 extends class283 {

    @OriginalMember(owner = "client!bi", name = "X", descriptor = "I")
    public int field1371 = 4;

    @OriginalMember(owner = "client!bi", name = "eb", descriptor = "I")
    public int field1378 = 4;

    @OriginalMember(owner = "client!bi", name = "kb", descriptor = "Z")
    public boolean field1384 = true;

    @OriginalMember(owner = "client!bi", name = "gb", descriptor = "I")
    public int field1380 = 1638;

    @OriginalMember(owner = "client!bi", name = "ab", descriptor = "[B")
    private byte[] field1374 = new byte[512];

    @OriginalMember(owner = "client!bi", name = "Z", descriptor = "I")
    public int field1373 = 4;

    @OriginalMember(owner = "client!bi", name = "mb", descriptor = "I")
    public int field1386 = 0;

    @OriginalMember(owner = "client!bi", name = "jb", descriptor = "Z")
    public static boolean field1383 = true;

    @OriginalMember(owner = "client!bi", name = "W", descriptor = "Lna;")
    public static class26 field1370 = class69.method505("k", (byte) -118);

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!bi", name = "bb", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!bi", name = "cb", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!bi", name = "db", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!bi", name = "fb", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!bi", name = "hb", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!bi", name = "ib", descriptor = "[S")
    private short[] field1382;

    @OriginalMember(owner = "client!bi", name = "lb", descriptor = "[S")
    private short[] field1385;

    @OriginalMember(owner = "client!bi", name = "Y", descriptor = "[[B")
    public static byte[][] field1372;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIII)Z", line = 4)
    public static final boolean method650(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZI[I)V", line = 31)
    public final void method651(boolean arg0, int arg1, int[] arg2) {
        field1375++;
        int var4 = class59.field955[arg1] * this.field1371;
        if (!arg0) {
            return;
        }
        if (this.field1373 == 1) {
            short var38 = this.field1385[0];
            int var39 = this.field1382[0] << 12;
            int var40 = var4 * var39 >> 12;
            int var41 = this.field1378 * var39 >> 12;
            int var42 = this.field1371 * var39 >> 12;
            int var43 = var40 >> 12;
            int var44 = this.field1374[var43 & 0xFF] & 0xFF;
            int var45 = var40 & 0xFFF;
            int var46 = class273.field4566[var45];
            int var47 = var43 + 1;
            if (var42 <= var47) {
                var47 = 0;
            }
            int var48 = this.field1374[var47 & 0xFF] & 0xFF;
            if (this.field1384) {
                for (int var49 = 0; var49 < class101.field1632; var49++) {
                    int var50 = class13.field184[var49] * this.field1378;
                    int var51 = this.method657(var39 * var50 >> 12, var48, var44, var41, 121, var45, var46);
                    int var52 = var38 * var51 >> 12;
                    arg2[var49] = (var52 >> 1) + 2048;
                }
            } else {
                for (int var53 = 0; var53 < class101.field1632; var53++) {
                    int var54 = class13.field184[var53] * this.field1378;
                    int var55 = this.method657(var39 * var54 >> 12, var48, var44, var41, 124, var45, var46);
                    arg2[var53] = var38 * var55 >> 12;
                }
            }
            return;
        }
        short var5 = this.field1385[0];
        if (var5 > 8 || var5 < -8) {
            int var6 = this.field1382[0] << 12;
            int var7 = this.field1371 * var6 >> 12;
            int var8 = this.field1378 * var6 >> 12;
            int var9 = var4 * var6 >> 12;
            int var10 = var9 >> 12;
            int var11 = var10 + 1;
            int var12 = this.field1374[var10 & 0xFF] & 0xFF;
            int var13 = var9 & 0xFFF;
            int var14 = class273.field4566[var13];
            if (var11 >= var7) {
                var11 = 0;
            }
            int var15 = this.field1374[var11 & 0xFF] & 0xFF;
            for (int var16 = 0; var16 < class101.field1632; var16++) {
                int var17 = class13.field184[var16] * this.field1378;
                int var18 = this.method657(var6 * var17 >> 12, var15, var12, var8, 122, var13, var14);
                arg2[var16] = var5 * var18 >> 12;
            }
        }
        for (int var19 = 1; var19 < this.field1373; var19++) {
            short var20 = this.field1385[var19];
            if (var20 > 8 || var20 < -8) {
                int var21 = this.field1382[var19] << 12;
                int var22 = var4 * var21 >> 12;
                int var23 = var22 >> 12;
                int var24 = this.field1374[var23 & 0xFF] & 0xFF;
                int var25 = this.field1378 * var21 >> 12;
                int var26 = var23 + 1;
                int var27 = var22 & 0xFFF;
                int var28 = class273.field4566[var27];
                int var29 = this.field1371 * var21 >> 12;
                if (var26 >= var29) {
                    var26 = 0;
                }
                int var30 = this.field1374[var26 & 0xFF] & 0xFF;
                if (this.field1384 && (this.field1373 - 1) == var19) {
                    for (int var31 = 0; var31 < class101.field1632; var31++) {
                        int var32 = class13.field184[var31] * this.field1378;
                        int var33 = this.method657(var21 * var32 >> 12, var30, var24, var25, 120, var27, var28);
                        int var34 = (var20 * var33 >> 12) + arg2[var31];
                        arg2[var31] = (var34 >> 1) + 2048;
                    }
                } else {
                    for (int var35 = 0; var35 < class101.field1632; var35++) {
                        int var36 = class13.field184[var35] * this.field1378;
                        int var37 = this.method657(var21 * var36 >> 12, var30, var24, var25, 126, var27, var28);
                        arg2[var35] += var20 * var37 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V", line = 189)
    public static void method652(boolean arg0) {
        field1372 = (byte[][]) null;
        if (arg0) {
            field1370 = (class26) null;
        }
        field1370 = null;
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V", line = 200)
    public final void method130(int arg0) {
        this.field1374 = class302.method2122(16711935, this.field1386);
        this.method656(true);
        for (int var2 = this.field1373 - 1; var2 >= 1; var2--) {
            short var3 = this.field1385[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field1373--;
        }
        field1369++;
        if (arg0 != 16251) {
            this.field1380 = 101;
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(II)V", line = 230)
    public static final void method653(int arg0, int arg1) {
        field1367++;
        if (arg1 != 0) {
            method653(38, 29);
        }
        class307.field5281.method1985(-125, arg0);
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(B)V", line = 247)
    public static final void method654(byte arg0) {
        int var1 = -18 / ((28 - arg0) / 32);
        for (int var2 = -1; var2 < class80.field1261; var2++) {
            int var3;
            if (var2 == -1) {
                var3 = 2047;
            } else {
                var3 = class95.field1550[var2];
            }
            class159 var4 = class268.field4427[var3];
            if (var4 != null && var4.field3957 > 0) {
                var4.field3957--;
                if (var4.field3957 == 0) {
                    var4.field3968 = null;
                }
            }
        }
        for (int var5 = 0; var5 < class81.field1270; var5++) {
            int var6 = class316.field5412[var5];
            class324 var7 = class185.field2877[var6];
            if (var7 != null && var7.field3957 > 0) {
                var7.field3957--;
                if (var7.field3957 == 0) {
                    var7.field3968 = null;
                }
            }
        }
        field1368++;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V", line = 642)
    public class84() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILwa;Z)V", line = 324)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        field1366++;
        if (!arg2) {
            this.method657(49, -110, -55, -117, 117, 10, -51);
        }
        if (arg0 == 0) {
            this.field1384 = arg1.method642((byte) -101) == 1;
        } else if (arg0 == 1) {
            this.field1373 = arg1.method642((byte) -96);
        } else if (arg0 == 2) {
            this.field1380 = arg1.method626((byte) 30);
            if (this.field1380 < 0) {
                this.field1385 = new short[this.field1373];
                for (int var5 = 0; var5 < this.field1373; var5++) {
                    this.field1385[var5] = (short) arg1.method626((byte) 19);
                }
            }
        } else if (arg0 == 3) {
            this.field1378 = this.field1371 = arg1.method642((byte) -38);
        } else if (arg0 == 4) {
            this.field1386 = arg1.method642((byte) -94);
        } else if (arg0 == 5) {
            this.field1378 = arg1.method642((byte) -124);
        } else if (arg0 == 6) {
            this.field1371 = arg1.method642((byte) -66);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIBI)I", line = 413)
    public static final int method655(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = -42 % ((-arg2 - 14) / 60);
        field1363++;
        int var5 = class200.field3098[class270.method1914(arg1, arg3)];
        if (arg0 > 0) {
            int var6 = class200.field3102.method98(111, arg0 & 0xFFFF);
            if (var6 != 0) {
                int var7;
                if (arg3 < 0) {
                    var7 = 0;
                } else if (arg3 > 127) {
                    var7 = 16777215;
                } else {
                    var7 = arg3 * 131586;
                }
                if (var6 == 256) {
                    var5 = var7;
                } else {
                    int var9 = 256 - var6;
                    var5 = ((var7 & 0xFF00FF) * var6 + ((var5 & 0xFF00FF) * var9) & 0xFF00FF00) + ((var5 & 0xFF00) * var9 + (var7 & 0xFF00) * var6 & 0xFF0000) >> 8;
                }
            }
            int var10 = class200.field3102.method91(106, arg0 & 0xFFFF);
            if (var10 != 0) {
                var10 += 256;
                int var11 = ((var5 & 0xFF0000) >> 16) * var10;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = ((var5 & 0xFF00) >> 8) * var10;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (var5 & 0xFF) * var10;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                var5 = (var11 << 8 & 0xFF001F) + (var13 >> 8) + (var12 & 0xFF00);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(Z)V", line = 485)
    private final void method656(boolean arg0) {
        if (this.field1380 > 0) {
            this.field1385 = new short[this.field1373];
            this.field1382 = new short[this.field1373];
            for (int var3 = 0; var3 < this.field1373; var3++) {
                this.field1385[var3] = (short) ((int) (Math.pow((double) ((float) this.field1380 / 4096.0F), (double) var3) * 4096.0D));
                this.field1382[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field1385 != null && this.field1385.length == this.field1373) {
            this.field1382 = new short[this.field1373];
            for (int var2 = 0; var2 < this.field1373; var2++) {
                this.field1382[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
        if (!arg0) {
            this.method657(54, 5, -23, 103, -114, -67, -27);
        }
        field1377++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIII)I", line = 539)
    private final int method657(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1376++;
        if (arg4 < 117) {
            this.method130(89);
        }
        int var8 = arg5 - 4096;
        int var9 = arg0 >> 12;
        int var10 = var9 + 1;
        int var11 = var9 & 0xFF;
        if (var10 >= arg3) {
            var10 = 0;
        }
        int var12 = arg0 & 0xFFF;
        int var13 = this.field1374[var11 + arg2] & 0x3;
        int var14 = class273.field4566[var12];
        int var15;
        if (var13 > 1) {
            var15 = var13 == 2 ? var12 - arg5 : -arg5 + -var12;
        } else {
            var15 = var13 == 0 ? arg5 + var12 : -var12 + arg5;
        }
        int var16 = var10 & 0xFF;
        int var17 = var12 - 4096;
        int var18 = this.field1374[arg2 + var16] & 0x3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? arg5 + var17 : -var17 + arg5;
        } else {
            var19 = var18 == 2 ? var17 - arg5 : -arg5 + -var17;
        }
        int var20 = this.field1374[var11 + arg1] & 0x3;
        int var21 = ((var19 - var15) * var14 >> 12) + var15;
        int var22;
        if (var20 > 1) {
            var22 = var20 == 2 ? var12 - var8 : -var12 - var8;
        } else {
            var22 = var20 == 0 ? var12 + var8 : -var12 + var8;
        }
        int var23 = this.field1374[arg1 + var16] & 0x3;
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? var17 - var8 : -var8 + -var17;
        } else {
            var24 = var23 == 0 ? var8 + var17 : -var17 + var8;
        }
        int var25 = ((var24 - var22) * var14 >> 12) + var22;
        return var21 + ((var25 - var21) * arg6 >> 12);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 614)
    public static final void method658(byte arg0, Component arg1) {
        if (arg0 < 49) {
            field1365 = 85;
        }
        field1381++;
        Method var2 = class156.field2440;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class320.field5503);
        arg1.addFocusListener(class320.field5503);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)[I", line = 655)
    public final int[] method8(int arg0, byte arg1) {
        field1364++;
        int var3 = 111 % ((30 - arg1) / 36);
        int[] var4 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            this.method651(true, arg0, var4);
        }
        return var4;
    }
}
