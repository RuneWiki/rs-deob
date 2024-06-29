import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public abstract class class141 extends class269 {

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "S")
    public short field1889;

    @OriginalMember(owner = "client!bs", name = "r", descriptor = "Z")
    public boolean field1896;

    @OriginalMember(owner = "client!bs", name = "v", descriptor = "I")
    public int field1900;

    @OriginalMember(owner = "client!bs", name = "w", descriptor = "S")
    public short field1901;

    @OriginalMember(owner = "client!bs", name = "x", descriptor = "B")
    public byte field1902;

    @OriginalMember(owner = "client!bs", name = "q", descriptor = "S")
    public short field1895;

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "S")
    public short field1890;

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "I")
    public int field1888;

    @OriginalMember(owner = "client!bs", name = "n", descriptor = "I")
    public int field1892;

    @OriginalMember(owner = "client!bs", name = "u", descriptor = "B")
    public byte field1899;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!bs", name = "o", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!bs", name = "p", descriptor = "I")
    public int field1894;

    @OriginalMember(owner = "client!bs", name = "s", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!bs", name = "t", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "()V")
    public static final void method885() {
        class453.field6723 = 0;
        label191: for (int var0 = 0; var0 < class377.field5496; var0++) {
            class112 var1 = class176.field2676[var0];
            if (class56.field748 != null) {
                for (int var2 = 0; var2 < class56.field748.length; var2++) {
                    if (class56.field748[var2] != -1000000 && (var1.field1464 <= class56.field748[var2] || var1.field1465 <= class56.field748[var2]) && (var1.field1478 <= class371.field5418[var2] || var1.field1472 <= class371.field5418[var2]) && (var1.field1478 >= class328.field4931[var2] || var1.field1472 >= class328.field4931[var2]) && (var1.field1481 <= class39.field498[var2] || var1.field1483 <= class39.field498[var2]) && (var1.field1481 >= class112.field1484[var2] || var1.field1483 >= class112.field1484[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field1480 == 1) {
                int var3 = var1.field1466 + class246.field3690 - class319.field4825;
                if (var3 >= 0 && var3 <= class246.field3690 + class246.field3690) {
                    int var4 = var1.field1471 + class246.field3690 - class426.field6265;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field1470 + class246.field3690 - class426.field6265;
                    if (var5 > class246.field3690 + class246.field3690) {
                        var5 = class246.field3690 + class246.field3690;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class423.field6230[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class121.field1596 - var1.field1478;
                        if (var7 > class26.field336) {
                            var1.field1475 = 1;
                        } else {
                            if (var7 >= -class26.field336) {
                                continue;
                            }
                            var1.field1475 = 2;
                            var7 = -var7;
                        }
                        var1.field1469 = (var1.field1481 - class446.field6573 << 8) / var7;
                        var1.field1473 = (var1.field1483 - class446.field6573 << 8) / var7;
                        var1.field1468 = (var1.field1464 - class273.field4192 << 8) / var7;
                        var1.field1476 = (var1.field1465 - class273.field4192 << 8) / var7;
                        class191.field2848[class453.field6723++] = var1;
                    }
                }
            } else if (var1.field1480 == 2) {
                int var8 = var1.field1471 + class246.field3690 - class426.field6265;
                if (var8 >= 0 && var8 <= class246.field3690 + class246.field3690) {
                    int var9 = var1.field1466 + class246.field3690 - class319.field4825;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field1479 + class246.field3690 - class319.field4825;
                    if (var10 > class246.field3690 + class246.field3690) {
                        var10 = class246.field3690 + class246.field3690;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class423.field6230[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class446.field6573 - var1.field1481;
                        if (var12 > class26.field336) {
                            var1.field1475 = 3;
                        } else {
                            if (var12 >= -class26.field336) {
                                continue;
                            }
                            var1.field1475 = 4;
                            var12 = -var12;
                        }
                        var1.field1467 = (var1.field1478 - class121.field1596 << 8) / var12;
                        var1.field1482 = (var1.field1472 - class121.field1596 << 8) / var12;
                        var1.field1468 = (var1.field1464 - class273.field4192 << 8) / var12;
                        var1.field1476 = (var1.field1465 - class273.field4192 << 8) / var12;
                        class191.field2848[class453.field6723++] = var1;
                    }
                }
            } else if (var1.field1480 == 4) {
                int var13 = var1.field1464 - class273.field4192;
                if (var13 > class26.field334) {
                    int var14 = var1.field1471 + class246.field3690 - class426.field6265;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field1470 + class246.field3690 - class426.field6265;
                    if (var15 > class246.field3690 + class246.field3690) {
                        var15 = class246.field3690 + class246.field3690;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field1466 + class246.field3690 - class319.field4825;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field1479 + class246.field3690 - class319.field4825;
                        if (var17 > class246.field3690 + class246.field3690) {
                            var17 = class246.field3690 + class246.field3690;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class423.field6230[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field1475 = 5;
                            var1.field1467 = (var1.field1478 - class121.field1596 << 8) / var13;
                            var1.field1482 = (var1.field1472 - class121.field1596 << 8) / var13;
                            var1.field1469 = (var1.field1481 - class446.field6573 << 8) / var13;
                            var1.field1473 = (var1.field1483 - class446.field6573 << 8) / var13;
                            class191.field2848[class453.field6723++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method886(int arg0, String arg1) {
        field1887++;
        if (class314.field4766 == null) {
            class21.method132((byte) 126);
        }
        String[] var2 = class110.method677('\n', arg1, (byte) -107);
        if (arg0 != -1) {
            method887((byte) 60);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class57.field760; var4 > 0; var4--) {
                class314.field4766[var4] = class314.field4766[var4 - 1];
            }
            class314.field4766[0] = var2[var3];
            if (class57.field760 < (class314.field4766.length - 1)) {
                class57.field760++;
                if (class319.field4819 > 0) {
                    class319.field4819++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(B)V")
    public static final void method887(byte arg0) {
        if (arg0 >= -77) {
            method886(-87, (String) null);
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class6.field71[var1] = true;
        }
        field1891++;
    }

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(Z)I")
    public abstract int method120(boolean arg0);

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "(I)V")
    public void method489(int arg0) {
        if (arg0 == 28155) {
            field1897++;
        }
    }

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "(I)V")
    public static final void method888(int arg0) {
        field1893++;
        if (class426.field6269 == 0) {
            return;
        }
        if (arg0 < 73) {
            field1898 = 30;
        }
        try {
            if (++class350.field5201 > 2000) {
                if (class301.field4543 != null) {
                    class301.field4543.method2163(true);
                    class301.field4543 = null;
                }
                if (class121.field1595 >= 1) {
                    class426.field6269 = 0;
                    class98.field1353 = -5;
                    return;
                }
                if (class432.field6334 == class284.field4336) {
                    class284.field4336 = class109.field1443;
                } else {
                    class284.field4336 = class432.field6334;
                }
                class350.field5201 = 0;
                class121.field1595++;
                class426.field6269 = 1;
            }
            if (class426.field6269 == 1) {
                class1.field22 = class79.field1043.method1450((byte) -71, class284.field4336, class228.field3490);
                class426.field6269 = 2;
            }
            if (class426.field6269 == 2) {
                if (class1.field22.field3172 == 2) {
                    throw new IOException();
                }
                if (class1.field22.field3172 != 1) {
                    return;
                }
                class301.field4543 = new class359((Socket) class1.field22.field3175, class79.field1043);
                class1.field22 = null;
                class301.field4543.method2164(0, (byte) -35, class189.field2840.field5666, class189.field2840.field5685);
                if (class245.field3670 != null) {
                    class245.field3670.method247(2000);
                }
                if (class236.field3536 != null) {
                    class236.field3536.method247(2000);
                }
                int var1 = class301.field4543.method2156(true);
                if (class245.field3670 != null) {
                    class245.field3670.method247(2000);
                }
                if (class236.field3536 != null) {
                    class236.field3536.method247(2000);
                }
                if (var1 != 21) {
                    class426.field6269 = 0;
                    class98.field1353 = var1;
                    class301.field4543.method2163(true);
                    class301.field4543 = null;
                    return;
                }
                class426.field6269 = 3;
            }
            if (class426.field6269 == 3) {
                if (class301.field4543.method2158(false) < 1) {
                    return;
                }
                class372.field5431 = new String[class301.field4543.method2156(true)];
                class426.field6269 = 4;
            }
            if (class426.field6269 == 4 && class301.field4543.method2158(false) >= (class372.field5431.length * 8)) {
                class424.field6232.field5666 = 0;
                class301.field4543.method2159((byte) -128, 0, class372.field5431.length * 8, class424.field6232.field5685);
                for (int var2 = 0; var2 < class372.field5431.length; var2++) {
                    class372.field5431[var2] = class437.method2681(true, class424.field6232.method2361((byte) -84));
                }
                class426.field6269 = 0;
                class98.field1353 = 21;
                class301.field4543.method2163(true);
                class301.field4543 = null;
            }
        } catch (IOException var3) {
            if (class301.field4543 != null) {
                class301.field4543.method2163(true);
                class301.field4543 = null;
            }
            if (class121.field1595 < 1) {
                class426.field6269 = 1;
                if (class432.field6334 == class284.field4336) {
                    class284.field4336 = class109.field1443;
                } else {
                    class284.field4336 = class432.field6334;
                }
                class121.field1595++;
                class350.field5201 = 0;
            } else {
                class98.field1353 = -4;
                class426.field6269 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field1889 = (short) arg7;
        this.field1896 = arg8;
        this.field1900 = (short) arg1;
        this.field1901 = (short) arg6;
        this.field1902 = (byte) arg0;
        this.field1895 = (short) arg4;
        this.field1890 = (short) arg5;
        this.field1888 = (short) arg2;
        this.field1892 = (short) arg3;
        this.field1899 = arg9;
    }
}
