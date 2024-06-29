import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class99 extends Canvas {

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field1648;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field1642 = 0;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "Lwa;")
    public static class75 field1645 = class66.method560("unzap", false);

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field1640 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "[S")
    public static short[] field1646 = new short[500];

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "[Lqj;")
    public static class238[] field1643;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILre;I)I", line = 13)
    public static final int method757(int arg0, class262 arg1, int arg2) {
        field1649++;
        if (arg1.field4394 == null || arg2 >= arg1.field4394.length) {
            return -2;
        }
        try {
            int[] var3 = arg1.field4394[arg2];
            int var4 = 0;
            int var5 = arg0;
            byte var6 = 0;
            while (true) {
                int var7 = 0;
                int var8 = var3[var5++];
                byte var9 = 0;
                if (var8 == 0) {
                    return var4;
                }
                if (var8 == 1) {
                    var7 = class187.field3124[var3[var5++]];
                }
                if (var8 == 15) {
                    var9 = 1;
                }
                if (var8 == 16) {
                    var9 = 2;
                }
                if (var8 == 17) {
                    var9 = 3;
                }
                if (var8 == 2) {
                    var7 = class127.field2206[var3[var5++]];
                }
                if (var8 == 3) {
                    var7 = class267.field4596[var3[var5++]];
                }
                if (var8 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class262 var12 = class51.method374(-103, var11);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class199.method1475(var13, (byte) 122).field4804 || class120.field2016)) {
                        for (int var14 = 0; var14 < var12.field4410.length; var14++) {
                            if (var13 + 1 == var12.field4410[var14]) {
                                var7 += var12.field4496[var14];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var7 = class286.field4920[var3[var5++]];
                }
                if (var8 == 6) {
                    var7 = class292.field5014[class127.field2206[var3[var5++]] - 1];
                }
                if (var8 == 7) {
                    var7 = class286.field4920[var3[var5++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var7 = class279.field4831.field1576;
                }
                if (var8 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class136.field2336[var15]) {
                            var7 += class127.field2206[var15];
                        }
                    }
                }
                if (var8 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class262 var18 = class51.method374(arg0 - 42, var17);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class199.method1475(var19, (byte) 112).field4804 || class120.field2016)) {
                        for (int var20 = 0; var20 < var18.field4410.length; var20++) {
                            if ((var19 + 1) == var18.field4410[var20]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var7 = class194.field3233;
                }
                if (var8 == 12) {
                    var7 = class154.field2648;
                }
                if (var8 == 13) {
                    int var21 = class286.field4920[var3[var5++]];
                    int var22 = var3[var5++];
                    var7 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var23 = var3[var5++];
                    var7 = class149.method1149(arg0, var23);
                }
                if (var8 == 18) {
                    var7 = (class279.field4831.field3259 >> 7) + class275.field4737;
                }
                if (var8 == 19) {
                    var7 = (class279.field4831.field3218 >> 7) + class175.field2939;
                }
                if (var8 == 20) {
                    var7 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var7;
                    }
                    if (var6 == 1) {
                        var4 -= var7;
                    }
                    if (var6 == 2 && var7 != 0) {
                        var4 /= var7;
                    }
                    if (var6 == 3) {
                        var4 *= var7;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V", line = 216)
    public static void method758(byte arg0) {
        if (arg0 != -111) {
            field1640 = -119;
        }
        field1645 = null;
        field1646 = null;
        field1643 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lcb;ILcb;BZ)Lme;", line = 232)
    public static final class176 method759(class267 arg0, int arg1, class267 arg2, byte arg3, boolean arg4) {
        int[] var5 = arg2.method1903(100, arg1);
        field1641++;
        boolean var6 = true;
        for (int var7 = 0; var7 < var5.length; var7++) {
            byte[] var8 = arg2.method1897((byte) -124, var5[var7], arg1);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[0] & 0xFF << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg4) {
                    var10 = arg0.method1897((byte) -81, var9, 0);
                } else {
                    var10 = arg0.method1897((byte) -72, 0, var9);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (arg3 != -76) {
            method759((class267) null, 6, (class267) null, (byte) -9, false);
        }
        if (!var6) {
            return null;
        }
        try {
            return new class176(arg2, arg0, arg1, arg4);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 284)
    public final void update(Graphics arg0) {
        field1639++;
        this.field1648.update(arg0);
    }

    @OriginalMember(owner = "client!vj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 295)
    public final void paint(Graphics arg0) {
        this.field1648.paint(arg0);
        field1638++;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)[Lbh;", line = 316)
    public static final class258[] method760(int arg0) {
        field1647++;
        class258[] var1 = new class258[class149.field2563];
        for (int var2 = 0; var2 < class149.field2563; var2++) {
            int var3 = class287.field4936[var2] * class210.field3590[var2];
            byte[] var4 = class42.field687[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class191.field3184[class235.method1710(var4[var6], 255)];
            }
            var1[var2] = new class277(class263.field4571, class76.field1321, class85.field1404[var2], class232.field3934[var2], class210.field3590[var2], class287.field4936[var2], var5);
        }
        class235.method1713(arg0 ^ arg0);
        return var1;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 351)
    public class99(Component arg0) {
        this.field1648 = arg0;
    }
}
