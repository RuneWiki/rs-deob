import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class293 extends Canvas {

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "Ljava/awt/Component;")
    private Component field4603;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field4597 = 0;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "[I")
    public static int[] field4598 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "Leg;")
    public static class302 field4599;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V", line = 4)
    public static void method2064(byte arg0) {
        field4599 = null;
        field4598 = null;
        if (arg0 != -58) {
            method2068((class91) null);
        }
    }

    @OriginalMember(owner = "client!hi", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 18)
    public final void paint(Graphics arg0) {
        this.field4603.paint(arg0);
        field4604++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Llb;Llb;Z)V", line = 28)
    public static final void method2065(class211 arg0, class211 arg1, boolean arg2) {
        class136.field2119 = class298.method2097(arg0, 0, class181.field2719, 18573, arg1);
        if (!arg2) {
            return;
        }
        field4606++;
        if (class36.field534) {
            class159.field2371 = class90.method728(0, arg0, class181.field2719, -28809, arg1);
        } else {
            class159.field2371 = (class74) class136.field2119;
        }
        class182.field2726 = class298.method2097(arg0, 0, class72.field1045, 18573, arg1);
        class64.field956 = class298.method2097(arg0, 0, class197.field3123, 18573, arg1);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V", line = 49)
    public static final void method2066(int arg0, int arg1) {
        class34.field431.method1429((byte) 127, arg1);
        field4602++;
        class178.field2659.method1429((byte) 127, arg1);
        if (arg0 != -155576378) {
            field4597 = -92;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lhb;I)V", line = 64)
    public static final void method2067(class35 arg0, int arg1) {
        if (arg1 != 7510) {
            method2064((byte) 112);
        }
        while (true) {
            while (arg0.field455 < arg0.field437.length) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg0.method273(65280) == 1) {
                    var3 = true;
                    var2 = arg0.method273(65280);
                    var4 = arg0.method273(65280);
                }
                int var5 = arg0.method273(65280);
                int var6 = arg0.method273(65280);
                int var7 = -(var6 * 64) - (-class318.field4932 - (class193.field3089 - 1));
                int var8 = var5 * 64 - class69.field1018;
                if (var8 >= 0 && (var7 - 63) >= 0 && var8 + 63 < class87.field1280 && var7 < class193.field3089) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || (var2 * 8) <= var11 && var2 * 8 + 8 > var11 && var12 >= (var4 * 8) && (var4 * 8 + 8) > var12) {
                                int var13 = arg0.method273(65280);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method273(65280);
                                        if (class159.field2374[var9][var10] == null) {
                                            class159.field2374[var9][var10] = new byte[4096];
                                        }
                                        class159.field2374[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method269(false);
                                        if (class30.field383[var9][var10] == null) {
                                            class30.field383[var9][var10] = new int[4096];
                                        }
                                        class30.field383[var9][var10][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg0.method269(false);
                                        if (class124.field1961[var9][var10] == null) {
                                            class124.field1961[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class101 var17 = class281.method1984(var16, false);
                                        if (var17.field1542 != null) {
                                            var17 = var17.method784(true);
                                            if (var17 == null || var17.field1566 == -1) {
                                                continue;
                                            }
                                        }
                                        class124.field1961[var9][var10][(63 - var12 << 6) + var11] = var17.field1570 + 1;
                                        class113 var18 = new class113();
                                        var18.field1782 = var17.field1566;
                                        var18.field1774 = var8;
                                        var18.field1780 = var7;
                                        class95.field1363.method977(4, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var3 ? 64 : 4096); var19++) {
                        int var20 = arg0.method273(arg1 ^ 0xE256);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field455++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field455 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field455 += 3;
                            }
                        }
                    }
                }
            }
            field4605++;
            return;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lbb;)V", line = 213)
    public static final void method2068(class91 arg0) {
        for (int var1 = arg0.field1329; var1 <= arg0.field1317; var1++) {
            for (int var2 = arg0.field1323; var2 <= arg0.field1319; var2++) {
                class99 var3 = class250.field3746[arg0.field1331][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1488; var4++) {
                        if (var3.field1471[var4] == arg0) {
                            var3.field1488--;
                            for (int var5 = var4; var5 < var3.field1488; var5++) {
                                var3.field1471[var5] = var3.field1471[var5 + 1];
                                var3.field1477[var5] = var3.field1477[var5 + 1];
                            }
                            var3.field1471[var3.field1488] = null;
                            break;
                        }
                    }
                    var3.field1483 = 0;
                    for (int var6 = 0; var6 < var3.field1488; var6++) {
                        var3.field1483 |= var3.field1477[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 273)
    public final void update(Graphics arg0) {
        this.field4603.update(arg0);
        field4600++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZB)V", line = 287)
    public static final void method2069(boolean arg0, byte arg1) {
        field4596++;
        int var2 = class60.field892.length;
        byte[][] var3;
        if (class36.field534 && arg0) {
            var3 = class95.field1367;
        } else {
            var3 = class99.field1470;
        }
        if (arg1 != 47) {
            field4599 = (class302) null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            byte[] var5 = var3[var4];
            if (var5 != null) {
                int var6 = (class324.field5049[var4] & 0xFF) * 64 - class110.field1744;
                int var7 = (class324.field5049[var4] >> 8) * 64 - class302.field4735;
                client.method1774(arg1 - 159);
                class28.method190(class90.field1309, var6, var7, arg0, var5, true);
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 323)
    public class293(Component arg0) {
        this.field4603 = arg0;
    }
}
