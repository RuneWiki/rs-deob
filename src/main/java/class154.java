import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class154 extends class7 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "Lnv;")
    private class44 field2358 = new class44();

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "Lnv;")
    private class44 field2374 = new class44();

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "[Z")
    private boolean[] field2375 = new boolean[112];

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "[Lmd;")
    public static class214[] field2356 = new class214[75];

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "Lnv;")
    public static class44 field2370 = new class44();

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "Ljava/awt/Component;")
    private Component field2376;

    @OriginalMember(owner = "client!fm", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 4)
    public final void focusGained(FocusEvent arg0) {
        field2371++;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V", line = 11)
    public final void method33(byte arg0) {
        int var2 = -69 / ((-arg0 - 20) / 53);
        field2359++;
        this.method1123(-113);
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)I", line = 24)
    private final int method1119(int arg0) {
        field2361++;
        int var2 = 0;
        if (this.field2375[81]) {
            var2 |= 0x1;
        }
        if (arg0 != 1) {
            return -10;
        }
        if (this.field2375[82]) {
            var2 |= 0x4;
        }
        if (this.field2375[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZLjava/lang/String;ILum;)Llq;", line = 51)
    public static final class6 method1120(boolean arg0, String arg1, int arg2, class83 arg3) {
        field2362++;
        int var4 = arg3.method737(arg1, arg2 - 3);
        if (var4 == -1) {
            return new class6(0);
        }
        int[] var5 = arg3.method743(var4, arg2 ^ 0xFFFFFE4B);
        class6 var6 = new class6(var5.length);
        int var7 = 0;
        if (arg2 != 2) {
            field2356 = null;
        }
        int var8 = 0;
        while (true) {
            while (var6.field77 > var7) {
                class194 var9 = new class194(arg3.method731(0, var5[var8++], var4));
                int var10 = var9.method1401(123);
                int var11 = var9.method1396(98);
                int var12 = var9.method1337((byte) 25);
                if (!arg0 && var12 == 1) {
                    var6.field77--;
                } else {
                    var6.field74[var7] = var10;
                    var6.field81[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;BI)V", line = 98)
    private final void method1121(KeyEvent arg0, byte arg1, int arg2) {
        field2363++;
        if (arg1 != 80) {
            return;
        }
        int var4 = arg0.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && var4 < class402.field5945.length) {
            int var6 = class402.field5945[var4];
            if (arg2 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 != 0) {
            this.method1126('\u0000', var5, false, arg2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIILue;)V", line = 134)
    public static final void method1122(int arg0, int arg1, int arg2, class376 arg3) {
        if (arg1 != 0) {
            return;
        }
        field2368++;
        if (arg3 == null || field2370.field690 == arg3) {
            return;
        }
        int var4 = arg3.field5550;
        int var5 = arg3.field5551;
        int var6 = arg3.field5546;
        int var7 = (int) arg3.field5553;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg3.field5553;
        if (var6 == 2) {
            class38 var10 = class327.method2148(var5, -7153, var4);
            if (var10 != null) {
                class62.method415(false);
                class94 var11 = client.method3078(var10);
                class370.method2371(var11.method797(-82), var10, arg1 + 28, var11.field1498);
                class218.field3297 = class394.method2475(94, var10);
                class447.field6638 = var10.field543 + "<col=ffffff>";
                if (class218.field3297 == null) {
                    class218.field3297 = "Null";
                }
            }
            return;
        }
        if (var6 == 47 && class416.field6108 == null) {
            class437.method2711(81, var4, var5);
            class416.field6108 = class327.method2148(var5, -7153, var4);
            class5.method27(class416.field6108, -208246073);
        }
        if (var6 == 8) {
            class511 var12 = class530.field7747[var7];
            if (var12 != null) {
                class116.field1785++;
                class402.field5935 = 2;
                class307.field4695 = arg0;
                class381.field5600 = 0;
                class537.field7882 = arg2;
                class110.method857(4095, class299.field4599);
                class312.field4752.method1381(class259.field4151.method30(-7951, 82) ? 1 : 0, (byte) 105);
                class312.field4752.method1386(true, var7);
                class64.method432(-2, var12.method3045(arg1), (byte) -55, 0, var12.field7654[0], var12.method3045(arg1), true, var12.field7653[0], 0);
            }
        }
        if (var6 == 1004) {
            class381.field5600 = 0;
            class307.field4695 = arg0;
            class345.field5142++;
            class402.field5935 = 2;
            class537.field7882 = arg2;
            class110.method857(4095, class25.field289);
            class312.field4752.method1386(true, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class312.field4752.method1360(class259.field4151.method30(arg1 ^ 0xFFFFE0F1, 82) ? 1 : 0, (byte) 125);
            class312.field4752.method1362(class422.field6201 + var4, arg1 ^ 0xFFFFFFBE);
            class312.field4752.method1362(var5 + class23.field273, -66);
            class7.method34(false, var8, var4, var5);
        }
        if (var6 == 22) {
            class381.field5600 = 0;
            class307.field4695 = arg0;
            class537.field7882 = arg2;
            class402.field5935 = 2;
            class94.field1502++;
            class110.method857(arg1 + 4095, class93.field1492);
            class312.field4752.method1400(class259.field4151.method30(-7951, 82) ? 1 : 0, true);
            class312.field4752.method1386(true, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class312.field4752.method1350(class422.field6201 + var4, (byte) 105);
            class312.field4752.method1364(class23.field273 + var5, true);
            class7.method34(false, var8, var4, var5);
        }
        if (var6 == 50) {
            class511 var13 = class530.field7747[var7];
            if (var13 != null) {
                class251.field4088++;
                class381.field5600 = 0;
                class537.field7882 = arg2;
                class402.field5935 = 2;
                class307.field4695 = arg0;
                class110.method857(4095, class186.field2859);
                class312.field4752.method1364(var7, true);
                class312.field4752.method1381(class259.field4151.method30(arg1 - 7951, 82) ? 1 : 0, (byte) 91);
                class64.method432(-2, var13.method3045(0), (byte) 56, 0, var13.field7654[0], var13.method3045(0), true, var13.field7653[0], 0);
            }
        }
        if (var6 == 30) {
            class307.field4695 = arg0;
            class381.field5600 = 0;
            class537.field7882 = arg2;
            class357.field5294++;
            class402.field5935 = 2;
            class110.method857(4095, class280.field4357);
            class312.field4752.method1360(class259.field4151.method30(-7951, 82) ? 1 : 0, (byte) 121);
            class312.field4752.method1386(true, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class312.field4752.method1386(true, class23.field273 + var5);
            class312.field4752.method1362(var4 + class422.field6201, arg1 + -66);
            class7.method34(false, var8, var4, var5);
        }
        if (var6 == 10) {
            class307.field4695 = arg0;
            class537.field7882 = arg2;
            class381.field5600 = 0;
            class202.field3113++;
            class402.field5935 = 2;
            class110.method857(arg1 + 4095, class437.field6511);
            class312.field4752.method1364(class422.field6201 + var4, true);
            class312.field4752.method1394(class259.field4151.method30(arg1 - 7951, 82) ? 1 : 0, false);
            class312.field4752.method1362(class23.field273 + var5, arg1 ^ 0xFFFFFFBE);
            class312.field4752.method1386(true, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class7.method34(false, var8, var4, var5);
        }
        if (var6 == 1003) {
            class1.field1++;
            class381.field5600 = 0;
            class307.field4695 = arg0;
            class402.field5935 = 2;
            class537.field7882 = arg2;
            class110.method857(arg1 + 4095, client.field7530);
            class312.field4752.method1364(var7, true);
        }
        if (var6 == 59) {
            class402.field5935 = 2;
            class307.field4695 = arg0;
            class537.field7882 = arg2;
            class381.field5600 = 0;
            class500.field7272++;
            class110.method857(4095, class62.field993);
            class312.field4752.method1350(class23.field273 + var5, (byte) 125);
            class312.field4752.method1350(class422.field6201 + var4, (byte) 127);
            class312.field4752.method1364(var7, true);
            class312.field4752.method1360(class259.field4151.method30(-7951, 82) ? 1 : 0, (byte) 122);
            class441.method2724(var5, 3, var4);
        }
        if (var6 == 48) {
            class511 var14 = class530.field7747[var7];
            if (var14 != null) {
                class307.field4695 = arg0;
                class402.field5935 = 2;
                class537.field7882 = arg2;
                class381.field5600 = 0;
                class433.field6426++;
                class110.method857(4095, class515.field7497);
                class312.field4752.method1386(true, var7);
                class312.field4752.method1381(class259.field4151.method30(-7951, 82) ? 1 : 0, (byte) 110);
                class64.method432(-2, var14.method3045(arg1), (byte) -118, 0, var14.field7654[0], var14.method3045(arg1), true, var14.field7653[0], 0);
            }
        }
        if (var6 == 4) {
            class537.field7882 = arg2;
            class381.field5600 = 0;
            class241.field3618++;
            class402.field5935 = 2;
            class307.field4695 = arg0;
            class110.method857(4095, class179.field2762);
            class312.field4752.method1394(class259.field4151.method30(-7951, 82) ? 1 : 0, false);
            class312.field4752.method1350(var4 + class422.field6201, (byte) 116);
            class312.field4752.method1364(var5 + class23.field273, true);
            class312.field4752.method1362(var7, -66);
            class441.method2724(var5, arg1 - 98, var4);
        }
        if (var6 == 46) {
            class537.field7882 = arg2;
            class381.field5600 = 0;
            class307.field4695 = arg0;
            class485.field7100++;
            class402.field5935 = 2;
            class110.method857(4095, class21.field238);
            class312.field4752.method1386(true, class422.field6201 + var4);
            class312.field4752.method1386(true, class23.field273 + var5);
            class312.field4752.method1386(true, var7);
            class312.field4752.method1381(class259.field4151.method30(-7951, 82) ? 1 : 0, (byte) 102);
            class441.method2724(var5, -83, var4);
        }
        if (var6 == 23 || var6 == 1008) {
            class487.method2943(arg3.field5543, var4, -119, var5, var7);
        }
        if (var6 == 25) {
            class38 var15 = class327.method2148(var5, -7153, var4);
            if (var15 != null) {
                class334.method2172((byte) -75, var15);
            }
        }
        if (var6 == 1012) {
            class381.field5600 = 0;
            class402.field5935 = 2;
            class307.field4695 = arg0;
            class537.field7882 = arg2;
            class5 var16 = (class5) class366.field5398.method358((byte) -118, (long) var7);
            if (var16 != null) {
                class46 var17 = var16.field65;
                class171 var18 = var17.field718;
                if (var18.field2611 != null) {
                    var18 = var18.method1221(class288.field4476, 0);
                }
                if (var18 != null) {
                    class337.field5068++;
                    class110.method857(4095, class435.field6472);
                    class312.field4752.method1364(var18.field2618, true);
                }
            }
        }
        if (var6 == 3) {
            class511 var19 = class530.field7747[var7];
            if (var19 != null) {
                class317.field4828++;
                class381.field5600 = 0;
                class402.field5935 = 2;
                class537.field7882 = arg2;
                class307.field4695 = arg0;
                class110.method857(arg1 ^ 0xFFF, class47.field752);
                class312.field4752.method1360(class259.field4151.method30(arg1 ^ 0xFFFFE0F1, 82) ? 1 : 0, (byte) 116);
                class312.field4752.method1364(var7, true);
                class64.method432(-2, var19.method3045(0), (byte) -41, 0, var19.field7654[0], var19.method3045(0), true, var19.field7653[0], 0);
            }
        }
        if (var6 == 16) {
            class5 var20 = (class5) class366.field5398.method358((byte) 113, (long) var7);
            if (var20 != null) {
                class402.field5935 = 2;
                class537.field7882 = arg2;
                class307.field4695 = arg0;
                class381.field5600 = 0;
                class46 var21 = var20.field65;
                class404.field5963++;
                class110.method857(4095, class294.field4535);
                class312.field4752.method1364(var7, true);
                class312.field4752.method1394(class259.field4151.method30(-7951, 82) ? 1 : 0, false);
                class64.method432(-2, var21.method3045(arg1), (byte) -47, 0, var21.field7654[0], var21.method3045(0), true, var21.field7653[0], 0);
            }
        }
        if (var6 == 13) {
            class402.field5935 = 2;
            class381.field5600 = 0;
            class307.field4695 = arg0;
            class537.field7882 = arg2;
            class37.field461++;
            class110.method857(4095, class47.field746);
            class312.field4752.method1400(class259.field4151.method30(-7951, 82) ? 1 : 0, true);
            class312.field4752.method1348((byte) -65, class442.field6585);
            class312.field4752.method1364(class291.field4510, true);
            class312.field4752.method1386(true, class511.field7481);
            class312.field4752.method1364(class116.field1781.field7562, true);
        }
        if (var6 == 6) {
            if (class224.field3421 > 0 && class259.field4151.method30(-7951, 82) && class259.field4151.method30(arg1 ^ 0xFFFFE0F1, 81)) {
                class303.method2011(class23.field273 + var5, 120, class422.field6201 + var4, class116.field1781.field1274);
            } else {
                class32.method193(var7, (byte) -85, var4, var5);
                if (var7 == 1) {
                    class312.field4752.method1381(-1, (byte) 85);
                    class312.field4752.method1381(-1, (byte) 86);
                    class312.field4752.method1364((int) class434.field6466, true);
                    class312.field4752.method1381(57, (byte) 92);
                    class312.field4752.method1381(class484.field7096, (byte) 106);
                    class312.field4752.method1381(class195.field3064, (byte) 123);
                    class312.field4752.method1381(89, (byte) 85);
                    class312.field4752.method1364(class116.field1781.field1275, true);
                    class312.field4752.method1364(class116.field1781.field1279, true);
                    class312.field4752.method1381(63, (byte) 100);
                } else {
                    class402.field5935 = 1;
                    class537.field7882 = arg2;
                    class381.field5600 = 0;
                    class307.field4695 = arg0;
                }
                class64.method432(-4, 1, (byte) 94, 0, var4, 1, true, var5, 0);
            }
        }
        if (var6 == 60) {
            class307.field4695 = arg0;
            class462.field6839++;
            class381.field5600 = 0;
            class402.field5935 = 2;
            class537.field7882 = arg2;
            class110.method857(4095, class171.field2609);
            class312.field4752.method1400(class259.field4151.method30(-7951, 82) ? 1 : 0, true);
            class312.field4752.method1386(true, class23.field273 + var5);
            class312.field4752.method1350(var7, (byte) 91);
            class312.field4752.method1362(var4 + class422.field6201, arg1 + -66);
            class441.method2724(var5, 125, var4);
        }
        if (var6 == 44) {
            class5 var22 = (class5) class366.field5398.method358((byte) -117, (long) var7);
            if (var22 != null) {
                class307.field4695 = arg0;
                class438.field6517++;
                class537.field7882 = arg2;
                class402.field5935 = 2;
                class46 var23 = var22.field65;
                class381.field5600 = 0;
                class110.method857(4095, class454.field6745);
                class312.field4752.method1362(var7, -66);
                class312.field4752.method1400(class259.field4151.method30(-7951, 82) ? 1 : 0, true);
                class64.method432(-2, var23.method3045(0), (byte) 104, 0, var23.field7654[0], var23.method3045(arg1), true, var23.field7653[0], 0);
            }
        }
        if (var6 == 1007) {
            class402.field5935 = 2;
            class537.field7882 = arg2;
            class432.field6423++;
            class381.field5600 = 0;
            class307.field4695 = arg0;
            class110.method857(4095, class14.field150);
            class312.field4752.method1364(var7, true);
        }
        if (var6 == 21) {
            class381.field5600 = 0;
            class402.field5935 = 1;
            class40.field665++;
            class537.field7882 = arg2;
            class307.field4695 = arg0;
            class110.method857(arg1 + 4095, class367.field5412);
            class312.field4752.method1348((byte) -65, class442.field6585);
            class312.field4752.method1364(class23.field273 + var5, true);
            class312.field4752.method1386(true, class291.field4510);
            class312.field4752.method1364(class422.field6201 + var4, true);
            class312.field4752.method1386(true, class511.field7481);
            class64.method432(-4, 1, (byte) 119, 0, var4, 1, true, var5, 0);
        }
        if (var6 == 9) {
            class537.field7882 = arg2;
            class307.field4695 = arg0;
            class402.field5935 = 2;
            class202.field3125++;
            class381.field5600 = 0;
            class110.method857(arg1 + 4095, class142.field2107);
            class312.field4752.method1386(true, class511.field7481);
            class312.field4752.method1386(true, class422.field6201 + var4);
            class312.field4752.method1386(true, var7);
            class312.field4752.method1348((byte) -65, class442.field6585);
            class312.field4752.method1350(class291.field4510, (byte) 123);
            class312.field4752.method1394(class259.field4151.method30(-7951, 82) ? 1 : 0, false);
            class312.field4752.method1362(var5 + class23.field273, -66);
            class441.method2724(var5, -11, var4);
        }
        if (var6 == 1010 || var6 == 1006 || var6 == 1001 || var6 == 1009 || var6 == 1002) {
            class311.method2065(var4, var6, 22993, var7);
        }
        if (var6 == 17) {
            class511 var24 = class530.field7747[var7];
            if (var24 != null) {
                class381.field5600 = 0;
                class402.field5935 = 2;
                class21.field236++;
                class537.field7882 = arg2;
                class307.field4695 = arg0;
                class110.method857(4095, class503.field7309);
                class312.field4752.method1362(var7, -66);
                class312.field4752.method1381(class259.field4151.method30(-7951, 82) ? 1 : 0, (byte) 83);
                class64.method432(-2, var24.method3045(0), (byte) 60, 0, var24.field7654[0], var24.method3045(0), true, var24.field7653[0], 0);
            }
        }
        if (var6 == 58) {
            class5 var25 = (class5) class366.field5398.method358((byte) -124, (long) var7);
            if (var25 != null) {
                class381.field5600 = 0;
                class537.field7882 = arg2;
                class378.field5575++;
                class46 var26 = var25.field65;
                class402.field5935 = 2;
                class307.field4695 = arg0;
                class110.method857(4095, class335.field5052);
                class312.field4752.method1394(class259.field4151.method30(-7951, 82) ? 1 : 0, false);
                class312.field4752.method1364(var7, true);
                class64.method432(-2, var26.method3045(arg1), (byte) -98, 0, var26.field7654[0], var26.method3045(0), true, var26.field7653[0], 0);
            }
        }
        if (var6 == 15) {
            class511 var27 = class530.field7747[var7];
            if (var27 != null) {
                class381.field5600 = 0;
                class537.field7882 = arg2;
                class246.field3690++;
                class307.field4695 = arg0;
                class402.field5935 = 2;
                class110.method857(arg1 + 4095, class395.field5765);
                class312.field4752.method1360(class259.field4151.method30(-7951, 82) ? 1 : 0, (byte) 109);
                class312.field4752.method1364(var7, true);
                class64.method432(-2, var27.method3045(0), (byte) 103, 0, var27.field7654[0], var27.method3045(0), true, var27.field7653[0], 0);
            }
        }
        if (var6 == 11) {
            class5 var28 = (class5) class366.field5398.method358((byte) -123, (long) var7);
            if (var28 != null) {
                class307.field4695 = arg0;
                class310.field4733++;
                class46 var29 = var28.field65;
                class402.field5935 = 2;
                class381.field5600 = 0;
                class537.field7882 = arg2;
                class110.method857(4095, class383.field5642);
                class312.field4752.method1360(class259.field4151.method30(-7951, 82) ? 1 : 0, (byte) 116);
                class312.field4752.method1359(false, class442.field6585);
                class312.field4752.method1362(class291.field4510, -66);
                class312.field4752.method1364(class511.field7481, true);
                class312.field4752.method1386(true, var7);
                class64.method432(-2, var29.method3045(0), (byte) -47, 0, var29.field7654[0], var29.method3045(0), true, var29.field7653[0], 0);
            }
        }
        if (var6 == 5) {
            class299.field4602++;
            class537.field7882 = arg2;
            class402.field5935 = 2;
            class307.field4695 = arg0;
            class381.field5600 = 0;
            class110.method857(4095, class366.field5401);
            class312.field4752.method1381(class259.field4151.method30(arg1 ^ 0xFFFFE0F1, 82) ? 1 : 0, (byte) 116);
            class312.field4752.method1362(var4 + class422.field6201, -66);
            class312.field4752.method1362(var5 + class23.field273, -66);
            class312.field4752.method1362(var7, -66);
            class441.method2724(var5, 118, var4);
        }
        if (var6 == 49) {
            class381.field5600 = 0;
            class402.field5935 = 2;
            class103.field1601++;
            class537.field7882 = arg2;
            class307.field4695 = arg0;
            class110.method857(4095, class53.field814);
            class312.field4752.method1386(true, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class312.field4752.method1362(class291.field4510, -66);
            class312.field4752.method1386(true, class23.field273 + var5);
            class312.field4752.method1381(class259.field4151.method30(-7951, 82) ? 1 : 0, (byte) 103);
            class312.field4752.method1378(class442.field6585, (byte) 29);
            class312.field4752.method1362(class422.field6201 + var4, -66);
            class312.field4752.method1362(class511.field7481, arg1 - 66);
            class7.method34(false, var8, var4, var5);
        }
        if (var6 == 45) {
            if (class224.field3421 > 0 && class259.field4151.method30(-7951, 82) && class259.field4151.method30(-7951, 81)) {
                class303.method2011(class23.field273 + var5, arg1 ^ 0xFFFFFFAE, class422.field6201 + var4, class116.field1781.field1274);
            } else {
                class537.field7882 = arg2;
                class275.field4315++;
                class307.field4695 = arg0;
                class381.field5600 = 0;
                class402.field5935 = 1;
                class110.method857(4095, class78.field1297);
                class312.field4752.method1364(class422.field6201 + var4, true);
                class312.field4752.method1386(true, class23.field273 + var5);
            }
        }
        if (var6 == 20) {
            class537.field7882 = arg2;
            class381.field5600 = 0;
            class283.field4411++;
            class307.field4695 = arg0;
            class402.field5935 = 2;
            class110.method857(4095, class201.field3111);
            class312.field4752.method1400(class259.field4151.method30(-7951, 82) ? 1 : 0, true);
            class312.field4752.method1364((int) (var8 >>> 32) & Integer.MAX_VALUE, true);
            class312.field4752.method1386(true, class422.field6201 + var4);
            class312.field4752.method1350(class23.field273 + var5, (byte) 118);
            class7.method34(false, var8, var4, var5);
        }
        if (var6 == 19) {
            class511 var30 = class530.field7747[var7];
            if (var30 != null) {
                class537.field7882 = arg2;
                class307.field4695 = arg0;
                class402.field5935 = 2;
                class381.field5600 = 0;
                class410.field6053++;
                class110.method857(4095, class225.field3432);
                class312.field4752.method1364(var7, true);
                class312.field4752.method1400(class259.field4151.method30(-7951, 82) ? 1 : 0, true);
                class64.method432(-2, var30.method3045(0), (byte) 64, 0, var30.field7654[0], var30.method3045(0), true, var30.field7653[0], 0);
            }
        }
        if (var6 == 51) {
            class5 var31 = (class5) class366.field5398.method358((byte) -120, (long) var7);
            if (var31 != null) {
                class537.field7882 = arg2;
                class307.field4695 = arg0;
                class481.field7060++;
                class381.field5600 = 0;
                class46 var32 = var31.field65;
                class402.field5935 = 2;
                class110.method857(4095, class64.field1006);
                class312.field4752.method1400(class259.field4151.method30(arg1 ^ 0xFFFFE0F1, 82) ? 1 : 0, true);
                class312.field4752.method1350(var7, (byte) 90);
                class64.method432(-2, var32.method3045(arg1), (byte) 80, 0, var32.field7654[0], var32.method3045(arg1), true, var32.field7653[0], 0);
            }
        }
        if (var6 == 18) {
            class511 var33 = class530.field7747[var7];
            if (var33 != null) {
                class307.field4695 = arg0;
                class354.field5243++;
                class381.field5600 = 0;
                class537.field7882 = arg2;
                class402.field5935 = 2;
                class110.method857(arg1 ^ 0xFFF, class401.field5898);
                class312.field4752.method1364(var7, true);
                class312.field4752.method1394(class259.field4151.method30(-7951, 82) ? 1 : 0, false);
                class64.method432(-2, var33.method3045(arg1), (byte) 110, 0, var33.field7654[0], var33.method3045(arg1), true, var33.field7653[0], 0);
            }
        }
        if (var6 == 12) {
            class511 var34 = class530.field7747[var7];
            if (var34 != null) {
                class402.field5935 = 2;
                class307.field4695 = arg0;
                class37.field461++;
                class537.field7882 = arg2;
                class381.field5600 = 0;
                class110.method857(arg1 ^ 0xFFF, class47.field746);
                class312.field4752.method1400(class259.field4151.method30(-7951, 82) ? 1 : 0, true);
                class312.field4752.method1348((byte) -65, class442.field6585);
                class312.field4752.method1364(class291.field4510, true);
                class312.field4752.method1386(true, class511.field7481);
                class312.field4752.method1364(var7, true);
                class64.method432(-2, var34.method3045(0), (byte) 81, 0, var34.field7654[0], var34.method3045(0), true, var34.field7653[0], 0);
            }
        }
        if (var6 == 57) {
            class5 var35 = (class5) class366.field5398.method358((byte) 31, (long) var7);
            if (var35 != null) {
                class156.field2390++;
                class381.field5600 = 0;
                class402.field5935 = 2;
                class307.field4695 = arg0;
                class46 var36 = var35.field65;
                class537.field7882 = arg2;
                class110.method857(4095, class50.field770);
                class312.field4752.method1362(var7, -66);
                class312.field4752.method1400(class259.field4151.method30(-7951, 82) ? 1 : 0, true);
                class64.method432(-2, var36.method3045(0), (byte) 53, 0, var36.field7654[0], var36.method3045(0), true, var36.field7653[0], 0);
            }
        }
        if (class2.field17) {
            class62.method415(false);
        }
        if (class304.field4659 != null && class404.field5978 == 0) {
            class5.method27(class304.field4659, -208246073);
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V", line = 868)
    public final synchronized void method36(byte arg0) {
        if (arg0 != 8) {
            return;
        }
        this.field2358.method291(false);
        field2365++;
        for (class446 var2 = (class446) this.field2374.method298(arg0 ^ 0xFFFFFFD1); var2 != null; var2 = (class446) this.field2374.method298(-76)) {
            var2.field6630 = this.method1119(1);
            if (var2.field6632 == 0) {
                if (!this.field2375[var2.field6624]) {
                    class446 var5 = new class446();
                    var5.field6632 = 0;
                    var5.field6630 = var2.field6630;
                    var5.field6624 = var2.field6624;
                    var5.field6636 = var2.field6636;
                    var5.field6631 = '\u0000';
                    this.field2358.method292((byte) 121, var5);
                    this.field2375[var2.field6624] = true;
                }
                var2.field6632 = 2;
                this.field2358.method292((byte) 121, var2);
            } else if (var2.field6632 == 1) {
                if (this.field2375[var2.field6624]) {
                    this.field2358.method292((byte) 121, var2);
                    this.field2375[var2.field6624] = false;
                }
            } else if (var2.field6632 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    if (this.field2375[var3]) {
                        class446 var4 = new class446();
                        var4.field6630 = var2.field6630;
                        var4.field6636 = var2.field6636;
                        var4.field6624 = var3;
                        var4.field6632 = 1;
                        var4.field6631 = '\u0000';
                        this.field2358.method292((byte) 121, var4);
                        this.field2375[var3] = false;
                    }
                }
            } else if (var2.field6632 == 3) {
                this.field2358.method292((byte) 121, var2);
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 961)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field2357++;
        this.method1121(arg0, (byte) 80, 1);
    }

    @OriginalMember(owner = "client!fm", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 969)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2360++;
        this.method1121(arg0, (byte) 80, 0);
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)V", line = 979)
    private final void method1123(int arg0) {
        field2367++;
        if (this.field2376 == null) {
            return;
        }
        this.field2376.removeKeyListener(this);
        this.field2376.removeFocusListener(this);
        this.field2376 = null;
        int var2 = 0;
        if (arg0 != -113) {
            return;
        }
        while (var2 < 112) {
            this.field2375[var2] = false;
            var2++;
        }
        this.field2358.method291(false);
        this.field2374.method291(false);
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)Lmd;", line = 1007)
    public final class214 method32(int arg0) {
        field2373++;
        if (arg0 != 3993493) {
            method1120(true, null, 46, null);
        }
        return (class214) this.field2358.method298(-126);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)Z", line = 1024)
    public final boolean method30(int arg0, int arg1) {
        field2369++;
        if (arg1 >= 0 && arg1 < 112) {
            if (arg0 != -7951) {
                this.field2375 = null;
            }
            return this.field2375[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fm", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 1039)
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method1126('\u0000', 0, false, -1);
        field2366++;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 1136)
    public class154(Component arg0) {
        class355.method2264((byte) -89);
        this.method1125(arg0, (byte) 126);
    }

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "(I)V", line = 1056)
    public static void method1124(int arg0) {
        field2356 = null;
        field2370 = null;
        if (arg0 <= 43) {
            field2356 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 1067)
    private final void method1125(Component arg0, byte arg1) {
        this.method1123(-113);
        field2355++;
        this.field2376 = arg0;
        if (arg1 != 126) {
            return;
        }
        Method var3 = class66.field1059;
        if (var3 != null) {
            try {
                var3.invoke(this.field2376, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field2376.addKeyListener(this);
        this.field2376.addFocusListener(this);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(CIZI)V", line = 1092)
    private final void method1126(char arg0, int arg1, boolean arg2, int arg3) {
        field2372++;
        class446 var5 = new class446();
        if (arg2) {
            return;
        }
        var5.field6632 = arg3;
        var5.field6631 = arg0;
        var5.field6624 = arg1;
        var5.field6636 = class375.method2397((byte) -75);
        this.field2374.method292((byte) 121, var5);
    }

    @OriginalMember(owner = "client!fm", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 1109)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field2364++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class202.method1425(var2, 103)) {
            this.method1126(var2, -1, false, 3);
            arg0.consume();
        }
    }
}
