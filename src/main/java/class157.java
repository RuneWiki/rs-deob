import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public abstract class class157 extends class86 {

    @OriginalMember(owner = "client!sr", name = "x", descriptor = "[I")
    public static int[] field2058 = new int[2];

    @OriginalMember(owner = "client!sr", name = "y", descriptor = "Liu;")
    public static class390 field2059;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "I")
    public int field2049;

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "I")
    public int field2054;

    @OriginalMember(owner = "client!sr", name = "u", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!sr", name = "w", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "[I")
    public int[] field2052;

    @OriginalMember(owner = "client!sr", name = "v", descriptor = "[[S")
    public static short[][] field2056;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Leq;Lbp;III)V")
    public static final void method1000(class134 arg0, class250 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class282.field4031) {
            class468 var5 = class358.field5312[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field6761 != null && var5.field6761.method723(17774)) {
                arg1.method719(0, 0, -1, var5.field6761, class153.field1965, true, arg0);
            }
        }
        if (arg4 < class282.field4031) {
            class468 var6 = class358.field5312[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field6761 != null && var6.field6761.method723(17774)) {
                arg1.method719(class153.field1965, 0, -1, var6.field6761, 0, true, arg0);
            }
        }
        if (arg3 < class282.field4031 && arg4 < class98.field1339) {
            class468 var7 = class358.field5312[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field6761 != null && var7.field6761.method723(17774)) {
                arg1.method719(class153.field1965, 0, -1, var7.field6761, class153.field1965, true, arg0);
            }
        }
        if (arg3 < class282.field4031 && arg4 > 0) {
            class468 var8 = class358.field5312[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field6761 != null && var8.field6761.method723(17774)) {
                arg1.method719(-class153.field1965, 0, -1, var8.field6761, class153.field1965, true, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/awt/Graphics;IBIII)V")
    public abstract void method1001(Graphics arg0, int arg1, byte arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILqn;ILae;)V")
    public static final void method1002(int arg0, class44 arg1, int arg2, class156 arg3) {
        field2055++;
        class116 var4 = new class116();
        var4.field1489 = arg3.method941((byte) 127);
        var4.field1493 = arg3.method950(186);
        var4.field1498 = new class439[var4.field1489];
        var4.field1492 = new int[var4.field1489];
        var4.field1488 = new byte[var4.field1489][][];
        var4.field1490 = new int[var4.field1489];
        var4.field1496 = new int[var4.field1489];
        var4.field1495 = new class439[var4.field1489];
        if (arg0 != 30132) {
            return;
        }
        for (int var5 = 0; var5 < var4.field1489; var5++) {
            try {
                int var6 = arg3.method941((byte) 125);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg3.method981(false);
                    String var18 = arg3.method981(false);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg3.method950(arg0 - 29946);
                    }
                    var4.field1490[var5] = var6;
                    var4.field1492[var5] = var19;
                    var4.field1498[var5] = arg1.method322(var18, class406.method2433(arg0 - 30235, var17), 0);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg3.method981(false);
                    String var8 = arg3.method981(false);
                    int var9 = arg3.method941((byte) 126);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg3.method981(false);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg3.method950(arg0 - 29946);
                            var12[var13] = new byte[var14];
                            arg3.method942(var12[var13], -5403, var14, 0);
                        }
                    }
                    var4.field1490[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class406.method2433(79, var10[var16]);
                    }
                    var4.field1495[var5] = arg1.method339(var15, var8, 1983, class406.method2433(78, var7));
                    var4.field1488[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field1496[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1496[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1496[var5] = -3;
            } catch (Exception var23) {
                var4.field1496[var5] = -4;
            } catch (Throwable var24) {
                var4.field1496[var5] = -5;
            }
        }
        class305.field4419.method2086((byte) -111, var4);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(JB)V")
    public static final void method1003(long arg0, byte arg1) {
        field2057++;
        int var3 = class365.field5493;
        if (arg1 <= 58) {
            return;
        }
        int var4 = class52.field780;
        if (class318.field4665 != var3) {
            int var5 = var3 - class318.field4665;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class318.field4665 += var6;
        }
        if (!class118.field1533.field6908) {
            class506.field7722 += (float) arg0 * class242.field3485 / 40.0F * 8.0F;
            class473.field6841 += (float) arg0 * class107.field1432 / 40.0F * 8.0F;
        }
        if (class356.field5150 != var4) {
            int var7 = var4 - class356.field5150;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class356.field5150 += var8;
        }
        class493.method2965((byte) 124);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
    public abstract void method1004(Graphics arg0, byte arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BII)Z")
    public static final boolean method1005(byte arg0, int arg1, int arg2) {
        if (arg0 <= 2) {
            return true;
        } else {
            field2051++;
            return (arg1 & 0x800) != 0 && (arg2 & 0x37) != 0;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)[Liu;")
    public static final class390[] method1006(int arg0) {
        if (arg0 != 0) {
            method1005((byte) -19, -73, -79);
        }
        field2053++;
        return new class390[] { class259.field3718, class86.field1180, class399.field5878, class442.field6446, class128.field1640, class477.field6866, class206.field2846, class454.field6611, class503.field7681, class15.field226, class331.field4816, class71.field1040, class202.field2810, class341.field4962, class233.field3260, class146.field1891, class67.field993, class6.field114, class216.field3036, class275.field3936, class482.field6954, class161.field2096, class372.field5575, class480.field6933, class77.field1091, class56.field882, class86.field1170, class407.field5973, class149.field1931, class473.field6840, class488.field7468, class199.field2775, class121.field1591, class186.field2647, class471.field6801, class355.field5127, class83.field1129, class453.field6589, class209.field2948, class283.field4038, class467.field6749, class214.field3023, class224.field3164, class481.field6936, class131.field1668, class256.field3678, class187.field2651, class325.field4743, class399.field5879, class231.field3232, class224.field3169, class58.field901, class358.field5310, class315.field4619, class150.field1938, class389.field5774, class233.field3269, class347.field5013, class46.field699, class337.field4886, class236.field3316, class234.field3287, class378.field5656, class444.field6474, class276.field3951, class463.field6716, class20.field283, class55.field858, class193.field2736, class100.field1367, class488.field7471, class267.field3768, class368.field5530, class424.field6263, class434.field6359, class78.field1093, class162.field2100, class141.field1845, class48.field727, class373.field5583, class223.field3149, class85.field1167, class137.field1794, class53.field806, class254.field3670, class502.field7665, class46.field700, class259.field3707, class22.field293, class292.field4169, class441.field6437, client.field2663, class459.field6682, class41.field627, field2059, class384.field5715, class96.field1294, class224.field3170, class501.field7656, class409.field5998, class472.field6814, class235.field3302, class355.field5128, class256.field3677, class262.field3741, class202.field2807, class319.field4691, class505.field7705, class205.field2841, class166.field2167 };
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public abstract void method1007(Canvas arg0, byte arg1);

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)V")
    public static void method1008(int arg0) {
        field2058 = null;
        field2059 = null;
        field2056 = null;
        if (arg0 != 10) {
            method1008(-6);
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(BII)I")
    public static final int method1009(byte arg0, int arg1, int arg2) {
        field2050++;
        int var3 = 0;
        while (arg1 > 0) {
            var3 = var3 << 1 | arg2 & 0x1;
            arg1--;
            arg2 >>>= 0x1;
        }
        if (arg0 != 40) {
            field2059 = null;
        }
        return var3;
    }

    static {
        new class194(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
        field2059 = new class390(94, 10);
    }
}
