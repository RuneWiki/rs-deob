import jaclib.memory.Buffer;
import jaggl.OpenGL;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public abstract class class793 {

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    private int field10896;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "Lpc;")
    public class700 field10898;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    private int field10895;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "Z")
    private boolean field10899;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public int field10894;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public static int field10892;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public static int field10893;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    public static int field10897;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    public static int field10900;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
    public static int field10901;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "I")
    public static int field10902;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "([BII)V")
    public final void method4370(byte[] arg0, int arg1, int arg2) {
        this.method465((byte) 62);
        if (arg2 != 35040) {
            this.field10895 = 66;
        }
        field10892++;
        if (this.field10895 < arg1) {
            OpenGL.glBufferDataARBub(this.field10896, arg1, arg0, 0, this.field10899 ? 35040 : 35044);
            this.field10898.field9741 += arg1 - this.field10895;
            this.field10895 = arg1;
        } else {
            OpenGL.glBufferSubDataARBub(this.field10896, 0, arg1, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lr;III[Z)Z")
    public static final boolean method4371(class196 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class704.field9910 != class621.field8523) {
            int var6 = class707.field9933[arg1].method1730(arg2, arg3, -1);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class296 var8 = class707.field9933[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1730(arg2, arg3, -1);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1403(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1402(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)V")
    public static final void method4372(int arg0) {
        class571.method3315(false, -25849);
        field10902++;
        class430.field5666 = 0;
        if (arg0 >= -109) {
            field10893 = -65;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < class786.field10842.length; var2++) {
            if (class610.field8194[var2] != -1 && class786.field10842[var2] == null) {
                class786.field10842[var2] = class340.field4208.method437(class610.field8194[var2], (byte) 124, 0);
                if (class786.field10842[var2] == null) {
                    var1 = false;
                    class430.field5666++;
                }
            }
            if (class152.field1904[var2] != -1 && class204.field2445[var2] == null) {
                class204.field2445[var2] = class340.field4208.method428(0, class233.field2781[var2], class152.field1904[var2], -81);
                if (class204.field2445[var2] == null) {
                    class430.field5666++;
                    var1 = false;
                }
            }
            if (class253.field2955[var2] != -1 && class449.field6220[var2] == null) {
                class449.field6220[var2] = class340.field4208.method437(class253.field2955[var2], (byte) -69, 0);
                if (class449.field6220[var2] == null) {
                    class430.field5666++;
                    var1 = false;
                }
            }
            if (class722.field10134[var2] != -1 && class266.field3146[var2] == null) {
                class266.field3146[var2] = class340.field4208.method437(class722.field10134[var2], (byte) -70, 0);
                if (class266.field3146[var2] == null) {
                    var1 = false;
                    class430.field5666++;
                }
            }
            if (class704.field9907 != null && class229.field2709[var2] == null && class704.field9907[var2] != -1) {
                class229.field2709[var2] = class340.field4208.method428(0, class233.field2781[var2], class704.field9907[var2], 97);
                if (class229.field2709[var2] == null) {
                    class430.field5666++;
                    var1 = false;
                }
            }
        }
        if (class418.field5453 == null) {
            if (class289.field3494 == null || !class132.field1645.method440(class289.field3494.field3042 + "_staticelements", 162)) {
                class418.field5453 = new class146(0);
            } else if (class132.field1645.method444((byte) -24, class289.field3494.field3042 + "_staticelements")) {
                class418.field5453 = class286.method1660(class289.field3494.field3042 + "_staticelements", class132.field1645, class629.field8601, 0);
            } else {
                var1 = false;
                class430.field5666++;
            }
        }
        if (!var1) {
            class783.field10805 = 1;
            return;
        }
        class427.field5654 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class786.field10842.length; var4++) {
            byte[] var21 = class204.field2445[var4];
            if (var21 != null) {
                int var22 = (class471.field6569[var4] >> 8) * 64 - class632.field8626;
                int var23 = (class471.field6569[var4] & 0xFF) * 64 - class620.field8435;
                if (class118.field1502 != 0) {
                    var22 = 10;
                    var23 = 10;
                }
                var3 &= class213.method1340(var21, var22, var23, class107.field1350, (byte) 122, class596.field8090);
            }
            byte[] var24 = class266.field3146[var4];
            if (var24 != null) {
                int var25 = (class471.field6569[var4] >> 8) * 64 - class632.field8626;
                int var26 = (class471.field6569[var4] & 0xFF) * 64 - class620.field8435;
                if (class118.field1502 != 0) {
                    var26 = 10;
                    var25 = 10;
                }
                var3 &= class213.method1340(var24, var25, var26, class107.field1350, (byte) 122, class596.field8090);
            }
        }
        if (!var3) {
            class783.field10805 = 2;
            return;
        }
        if (class783.field10805 != 0) {
            class671.method3764(-86, class637.field8687.method3584(class770.field10592, true) + "<br>(100%)", class466.field6523, class363.field4526, true, class708.field9946);
        }
        class580.method3339((byte) -58);
        class276.method1611(113);
        class503.method3017(-91);
        boolean var5 = false;
        if (class363.field4526.method622() && class118.field1503.field10675.method4155(0) == 2) {
            for (int var6 = 0; var6 < class786.field10842.length; var6++) {
                if (class266.field3146[var6] != null || class449.field6220[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class118.field1503.field10657.method3370(0) == 1) {
            var7 = class28.field436[class226.field2635];
        } else {
            var7 = class247.field2909[class226.field2635];
        }
        if (class363.field4526.method604()) {
            var7++;
        }
        class132.method979(class363.field4526, client.field3930, 9, 4, class596.field8090, class107.field1350, var7, var5, class363.field4526.method583() > 0);
        class255.method1519(class137.field1717);
        if (class137.field1717 == 0) {
            class754.method4214(null);
        } else {
            class754.method4214(class145.field1820);
        }
        for (int var8 = 0; var8 < 4; var8++) {
            class633.field8649[var8].method2487(19666);
        }
        class108.method877((byte) -128);
        class446.method2625(false, (byte) 110);
        class89.method814((byte) -75);
        class346.field4335 = false;
        class454.field6403 = null;
        class580.method3339((byte) -58);
        System.gc();
        class571.method3315(true, -25849);
        class668.method3749((byte) -31);
        class566.field7799 = class118.field1503.field10672.method4113(0);
        class774.field10682 = class730.field10230 >= 96;
        class117.field1485 = class118.field1503.field10675.method4155(0) == 2;
        class207.field2454 = class118.field1503.field10628.method1580(0) == 1;
        class774.field10679 = class118.field1503.field10632.method3881(0) == 1 ? -1 : class500.field7013;
        class194.field2310 = class118.field1503.field10677.method3451(0) == 1;
        class388.field4987 = class118.field1503.field10641.method1572(0) == 1;
        class441.field5923 = new class117(4, class596.field8090, class107.field1350, false);
        if (class118.field1502 == 0) {
            class173.method1172(class786.field10842, true, class441.field5923);
        } else {
            class380.method2223((byte) 2, class441.field5923, class786.field10842);
        }
        class197.method1287(class596.field8090 >> 4, -89, class107.field1350 >> 4);
        class425.method2538((byte) 104);
        if (var5) {
            class146.method1064(true);
            class468.field6539 = new class117(1, class596.field8090, class107.field1350, true);
            if (class118.field1502 == 0) {
                class173.method1172(class449.field6220, true, class468.field6539);
                class571.method3315(true, -25849);
            } else {
                class380.method2223((byte) 2, class468.field6539, class449.field6220);
                class571.method3315(true, -25849);
            }
            class468.field6539.method1651((byte) -41, 0, class441.field5923.field3331[0]);
            class468.field6539.method1650(null, class363.field4526, 0, null);
            class146.method1064(false);
        }
        class441.field5923.method1650(var5 ? class468.field6539.field3331 : null, class363.field4526, 0, class633.field8649);
        if (class118.field1502 == 0) {
            class571.method3315(true, -25849);
            class532.method3169(class204.field2445, class441.field5923, (byte) 101);
            if (class229.field2709 != null) {
                class522.method3131((byte) 73);
            }
        } else {
            class571.method3315(true, -25849);
            class617.method3493(class441.field5923, -1, class204.field2445);
        }
        class276.method1611(113);
        if (class730.field10230 < 96) {
            class85.method787(1);
        }
        class571.method3315(true, -25849);
        class441.field5923.method1649(class363.field4526, (byte) 77, null, var5 ? class704.field9910[0] : null);
        class441.field5923.method917(class363.field4526, -55, false);
        class571.method3315(true, -25849);
        if (var5) {
            class146.method1064(true);
            class571.method3315(true, -25849);
            if (class118.field1502 == 0) {
                class532.method3169(class266.field3146, class468.field6539, (byte) 101);
            } else {
                class617.method3493(class468.field6539, -1, class266.field3146);
            }
            class276.method1611(113);
            class571.method3315(true, -25849);
            class468.field6539.method1649(class363.field4526, (byte) 77, class707.field9933[0], null);
            class468.field6539.method917(class363.field4526, -14, true);
            class571.method3315(true, -25849);
            class146.method1064(false);
        }
        class438.method2582(1024);
        int var9 = class441.field5923.field1482;
        if (class581.field7921 < var9) {
            var9 = class581.field7921;
        }
        if (var9 < (class581.field7921 - 1)) {
            var9 = class581.field7921 - 1;
        }
        if (class118.field1503.field10632.method3881(0) == 0) {
            class613.method3474(var9);
        } else {
            class613.method3474(0);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var19 = 0; var19 < class596.field8090; var19++) {
                for (int var20 = 0; var20 < class107.field1350; var20++) {
                    class650.method3676(var19, -2058232919, var10, var20);
                }
            }
        }
        class615.method3483((byte) -51);
        class580.method3339((byte) -58);
        class741.method4159(105);
        class276.method1611(113);
        class10.method171(0);
        if (class645.field8790 != null && class436.field5748 != null && class289.field3493 == 11) {
            class120.field1533++;
            class336 var11 = class512.method3076(class105.field1348, class591.field8030, (byte) 95);
            var11.field4150.method2391(-101, 1057001181);
            class578.method3334(4, var11);
        }
        if (class118.field1502 == 0) {
            int var12 = (class226.field2638 - (class596.field8090 >> 4)) / 8;
            int var13 = ((class596.field8090 >> 4) + class226.field2638) / 8;
            int var14 = (class518.field7310 - (class107.field1350 >> 4)) / 8;
            int var15 = ((class107.field1350 >> 4) + class518.field7310) / 8;
            for (int var16 = var12 - 1; var16 <= (var13 + 1); var16++) {
                for (int var17 = var14 - 1; var17 <= var15 + 1; var17++) {
                    if (var12 > var16 || var16 > var13 || var17 < var14 || var17 > var15) {
                        class340.field4208.method424(112, "m" + var16 + "_" + var17);
                        class340.field4208.method424(122, "l" + var16 + "_" + var17);
                    }
                }
            }
        }
        if (class289.field3493 == 4) {
            class48.method454(3, -1);
        } else if (class289.field3493 == 8) {
            class48.method454(7, -1);
        } else {
            class48.method454(10, -1);
            if (class436.field5748 != null) {
                class336 var18 = class512.method3076(class127.field1599, class591.field8030, (byte) 87);
                class578.method3334(4, var18);
            }
        }
        class690.method3853(-1);
        class580.method3339((byte) -58);
        class750.method4194(0);
        class257.field3034 = true;
        if (class219.field2574) {
            method4374(0, "Took: " + (class349.method2069(true) - class291.field3501) + "ms");
            class219.field2574 = false;
        }
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(B)I")
    public static final int method4373(byte arg0) {
        field10900++;
        if (class727.field10184 == 1) {
            return class168.field2025;
        } else {
            if (arg0 < 46) {
                method4374(26, null);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(B)V")
    public abstract void method465(byte arg0);

    @OriginalMember(owner = "client!mp", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field10898.method3938(this.field10894, this.field10895, -128);
        field10897++;
        super.finalize();
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method4374(int arg0, String arg1) {
        if (class75.field1041 == null) {
            class113.method903(arg0 + 11931);
        }
        field10901++;
        class255.field2976.setTime(new Date(class349.method2069(true)));
        int var2 = class255.field2976.get(11);
        int var3 = class255.field2976.get(12);
        int var4 = class255.field2976.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class708.method4017('\n', (byte) 32, arg1);
        for (int var7 = arg0; var7 < var6.length; var7++) {
            for (int var8 = class259.field3066; var8 > 0; var8--) {
                class75.field1041[var8] = class75.field1041[var8 - 1];
            }
            class75.field1041[0] = var5 + ": " + var6[var7];
            if (class612.field8225 != null) {
                try {
                    class612.field8225.write(class72.method686(class75.field1041[0] + "\n", -30189));
                } catch (IOException var9) {
                }
            }
            if (class75.field1041.length - 1 > class259.field3066) {
                if (class531.field7487 > 0) {
                    class531.field7487++;
                }
                class259.field3066++;
            }
        }
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lpc;I[BIZ)V")
    public class793(class700 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field10896 = arg1;
        this.field10898 = arg0;
        this.field10895 = arg3;
        this.field10899 = arg4;
        OpenGL.glGenBuffersARB(1, class82.field1114, 0);
        this.field10894 = class82.field1114[0];
        this.method465((byte) 62);
        OpenGL.glBufferDataARBub(arg1, this.field10895, arg2, 0, this.field10899 ? 35040 : 35044);
        this.field10898.field9741 += this.field10895;
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lpc;ILjaclib/memory/Buffer;IZ)V")
    public class793(class700 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field10895 = arg3;
        this.field10896 = arg1;
        this.field10899 = arg4;
        this.field10898 = arg0;
        OpenGL.glGenBuffersARB(1, class82.field1114, 0);
        this.field10894 = class82.field1114[0];
        this.method465((byte) 62);
        OpenGL.glBufferDataARBa(arg1, this.field10895, arg2.getAddress(), this.field10899 ? 35040 : 35044);
        this.field10898.field9741 += this.field10895;
    }
}
