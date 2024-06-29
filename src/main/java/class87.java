import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class87 {

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public int field1436 = 0;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Z")
    public boolean field1429 = false;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public int field1428 = -1;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public int field1445 = 1190717;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "Z")
    public boolean field1439 = true;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "I")
    public int field1453 = 8;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public int field1447 = 16;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public int field1431 = 128;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "Z")
    public boolean field1454 = true;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public int field1442 = -1;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field1435 = 0;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "Z")
    public static boolean field1444 = false;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "Z")
    public static boolean field1441 = false;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field1438 = 0;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field1427 = 7759444;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Lta;")
    public static class185 field1437;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "Z")
    public static boolean field1443;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 4)
    public static final void method695(int arg0) {
        field1434++;
        class225.method1656();
        class302.field5164 = new class243[7];
        class302.field5164[arg0] = new class131();
        class302.field5164[2] = new class23();
        class302.field5164[3] = new class160();
        class302.field5164[4] = new class107();
        class302.field5164[5] = new class83();
        class302.field5164[6] = new class84();
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IILja;B)V", line = 36)
    private final void method696(int arg0, int arg1, class60 arg2, byte arg3) {
        if (arg1 == 1) {
            this.field1436 = class259.method1854(arg2.method489(-118), false);
        } else if (arg1 == 2) {
            this.field1428 = arg2.method501(0);
        } else if (arg1 == 3) {
            this.field1428 = arg2.method485((byte) -2);
            if (this.field1428 == 65535) {
                this.field1428 = -1;
            }
        } else if (arg1 == 5) {
            this.field1454 = false;
        } else if (arg1 == 7) {
            this.field1442 = class259.method1854(arg2.method489(-126), false);
        } else if (arg1 == 8) {
            class253.field4242 = arg0;
        } else if (arg1 == 9) {
            this.field1431 = arg2.method485((byte) -2);
        } else if (arg1 == 10) {
            this.field1439 = false;
        } else if (arg1 == 11) {
            this.field1453 = arg2.method501(0);
        } else if (arg1 == 12) {
            this.field1429 = true;
        } else if (arg1 == 13) {
            this.field1445 = arg2.method489(-124);
        } else if (arg1 == 14) {
            this.field1447 = arg2.method501(0);
        }
        int var5 = 106 % ((21 - arg3) / 51);
        field1430++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V", line = 102)
    public static final void method697(byte arg0) {
        field1449++;
        class136.field2328.method88(true);
        int var1 = class136.field2328.method92(8, 8);
        if (class121.field2031 > var1) {
            for (int var2 = var1; var2 < class121.field2031; var2++) {
                class83.field1377[class281.field4848++] = class132.field2281[var2];
            }
        }
        if (class121.field2031 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class121.field2031 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class132.field2281[var3];
            class295 var5 = class35.field521[var4];
            int var6 = class136.field2328.method92(1, 8);
            if (var6 == 0) {
                class132.field2281[class121.field2031++] = var4;
                var5.field3271 = class143.field2463;
            } else {
                int var7 = class136.field2328.method92(2, 8);
                if (var7 == 0) {
                    class132.field2281[class121.field2031++] = var4;
                    var5.field3271 = class143.field2463;
                    class72.field1214[class173.field2924++] = var4;
                } else if (var7 == 1) {
                    class132.field2281[class121.field2031++] = var4;
                    var5.field3271 = class143.field2463;
                    int var8 = class136.field2328.method92(3, 8);
                    var5.method1455(false, var8, -108);
                    int var9 = class136.field2328.method92(1, 8);
                    if (var9 == 1) {
                        class72.field1214[class173.field2924++] = var4;
                    }
                } else if (var7 == 2) {
                    class132.field2281[class121.field2031++] = var4;
                    var5.field3271 = class143.field2463;
                    int var10 = class136.field2328.method92(3, 8);
                    var5.method1455(true, var10, -124);
                    int var11 = class136.field2328.method92(3, 8);
                    var5.method1455(true, var11, -96);
                    int var12 = class136.field2328.method92(1, 8);
                    if (var12 == 1) {
                        class72.field1214[class173.field2924++] = var4;
                    }
                } else if (var7 == 3) {
                    class83.field1377[class281.field4848++] = var4;
                }
            }
        }
        if (arg0 <= 86) {
            method697((byte) 84);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BLja;I)V", line = 203)
    public final void method698(byte arg0, class60 arg1, int arg2) {
        field1448++;
        int var4 = -106 % ((33 - arg0) / 62);
        while (true) {
            int var5 = arg1.method501(0);
            if (var5 == 0) {
                return;
            }
            this.method696(arg2, var5, arg1, (byte) 118);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([BI)[B", line = 224)
    public static final byte[] method699(byte[] arg0, int arg1) {
        field1440++;
        class60 var2 = new class60(arg0);
        int var3 = var2.method501(0);
        int var4 = var2.method505(255);
        int var5 = 33 % ((-arg1 - 11) / 38);
        if (var4 < 0 || class45.field732 != 0 && var4 > class45.field732) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var6 = new byte[var4];
            var2.method512(var4, 13, var6, 0);
            return var6;
        } else {
            int var7 = var2.method505(255);
            if (var7 < 0 || class45.field732 != 0 && class45.field732 < var7) {
                throw new RuntimeException();
            }
            byte[] var8 = new byte[var7];
            if (var3 == 1) {
                class148.method1141(var8, var7, arg0, var4, 9);
            } else {
                class134.field2310.method1996(var8, -4, var2);
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 280)
    public static final void method700(Component arg0, int arg1) {
        field1452++;
        Method var2 = class124.field2085;
        if (arg1 != 16) {
            return;
        }
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class13.field171);
        arg0.addFocusListener(class13.field171);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V", line = 301)
    public static void method701(int arg0) {
        field1437 = null;
        if (arg0 < 44) {
            method702(19, (class267) null);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILcb;)V", line = 328)
    public static final void method702(int arg0, class267 arg1) {
        field1450++;
        if (field1443) {
            return;
        }
        if (arg0 >= -14) {
            method697((byte) -27);
        }
        class222.method1639();
        class171.field2877 = class90.method710(class210.field3588, arg1, (byte) 70);
        int var2 = class244.field4111;
        int var3 = var2 * 956 / 503;
        class171.field2877.method1340((class188.field3141 - var3) / 2, 0, var3, var2);
        class7.field104 = class74.method605(arg1, (byte) -42, class271.field4687);
        class7.field104.method351(class188.field3141 / 2 - (class7.field104.field4007 / 2), 18);
        field1443 = true;
    }
}
