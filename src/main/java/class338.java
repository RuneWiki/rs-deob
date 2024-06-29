import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class338 {

    @OriginalMember(owner = "client!al", name = "c", descriptor = "Lmd;")
    public static class266 field5241 = new class266();

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field5245 = 0;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "Ltl;")
    public static class222 field5249 = new class222(50);

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field5247;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "[Lug;")
    public static class321[] field5243;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V", line = 5)
    public static final void method2325(int arg0, int arg1) {
        class230 var2 = class251.field3996[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class230 var4 = class251.field3996[var3][arg0][arg1] = class251.field3996[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3683--;
                for (int var5 = 0; var5 < var4.field3680; var5++) {
                    class271 var6 = var4.field3687[var5];
                    if ((var6.field4294 >> 29 & 0x3L) == 2L && var6.field4285 == arg0 && var6.field4297 == arg1) {
                        var6.field4292--;
                    }
                }
            }
        }
        if (class251.field3996[0][arg0][arg1] == null) {
            class251.field3996[0][arg0][arg1] = new class230(0, arg0, arg1);
        }
        class251.field3996[0][arg0][arg1].field3672 = var2;
        class251.field3996[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIZIII)V", line = 47)
    public static final void method2326(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field5248++;
        class249[] var7 = class283.field4472;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class249 var9 = var7[var8];
            if (var9 != null && var9.field3967 == 2) {
                class264.method1882(var9.field3954 * 2, arg1, arg6 >> 1, arg0, (var9.field3953 - class24.field351 << 7) + var9.field3948, false, (var9.field3965 - class181.field2925 << 7) + var9.field3947, arg5 >> 1);
                if (class69.field900 > -1 && class48.field648 % 20 < 10) {
                    class158.field2431[var9.field3952].method84(arg2 + class69.field900 - 12, class329.field5122 + -28 + arg4);
                }
            }
        }
        if (arg3) {
            method2331((class320) null, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(JZLjava/lang/String;IIZLjava/lang/String;IIIZ)V", line = 77)
    public static final void method2327(long arg0, boolean arg1, String arg2, int arg3, int arg4, boolean arg5, String arg6, int arg7, int arg8, int arg9, boolean arg10) {
        field5250++;
        int[] var12 = new int[4];
        if (arg9 > -19) {
            return;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class192 var14 = new class192(128);
        var14.method1365(-32769, 10);
        var14.method1368((arg1 ? 4 : 0) | (arg10 ? 2 : 0) | (arg5 ? 1 : 0), 4796);
        var14.method1375(arg0, -100);
        var14.method1350(var12[0], -112);
        var14.method1374(arg6, (byte) -108);
        var14.method1350(var12[1], -72);
        var14.method1368(class240.field3807, 4796);
        var14.method1365(-32769, arg8);
        var14.method1365(-32769, arg4);
        var14.method1350(var12[2], -79);
        var14.method1368(arg3, 4796);
        var14.method1368(arg7, 4796);
        var14.method1350(var12[3], -105);
        var14.method1348(class151.field2315, (byte) 106, class39.field547);
        class192 var15 = new class192(350);
        var15.method1374(arg2, (byte) -89);
        int var16 = 8 - (class342.method2361(arg2, 23126) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1365(-32769, (int) (Math.random() * 255.0D));
        }
        var15.method1380(15961, var12);
        class21.field313.field3129 = 0;
        class21.field313.method1365(-32769, 22);
        class21.field313.method1368(var14.field3129 + var15.field3129 + 2, 4796);
        class21.field313.method1368(545, 4796);
        class21.field313.method1367(var14.field3129, 0, var14.field3128, 504526352);
        class21.field313.method1367(var15.field3129, 0, var15.field3128, 504526352);
        class102.field1568 = 0;
        class250.field3976 = -3;
        class329.field5116 = 1;
        class310.field4847 = 0;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Z", line = 137)
    public static final boolean method2328(int arg0) {
        field5239++;
        if (arg0 != 29788) {
            method2331((class320) null, (byte) 12);
        }
        try {
            if (class37.field497 == 2) {
                if (class255.field4050 == null) {
                    class255.field4050 = class332.method2292(class64.field853, class310.field4845, class305.field4753);
                    if (class255.field4050 == null) {
                        return false;
                    }
                }
                if (class327.field5100 == null) {
                    class327.field5100 = new class161(class91.field1384, class115.field1732);
                }
                if (class188.field3056.method1228(class327.field5100, class182.field2934, 22050, -1, class255.field4050)) {
                    class188.field3056.method1224(arg0 - 55728);
                    class188.field3056.method1203(class12.field147, arg0 - 29788);
                    class188.field3056.method1197(true, class59.field770, class255.field4050);
                    class37.field497 = 0;
                    class255.field4050 = null;
                    class64.field853 = null;
                    class327.field5100 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class188.field3056.method1205(-24516);
            class64.field853 = null;
            class327.field5100 = null;
            class255.field4050 = null;
            class37.field497 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V", line = 190)
    public static void method2329(int arg0) {
        if (arg0 != 20) {
            method2327(125L, false, (String) null, 60, -65, true, (String) null, -8, 20, -79, true);
        }
        field5249 = null;
        field5243 = null;
        field5241 = null;
        field5247 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V", line = 205)
    public static final void method2330(byte arg0) {
        class126.field1877 = 0;
        class225.field3584 = 0;
        class81.method600(125);
        field5240++;
        class222.method1617((byte) 13);
        class340.method2343(2047);
        class260.method1865(true);
        if (arg0 >= -105) {
            field5245 = 72;
        }
        for (int var1 = 0; var1 < class225.field3584; var1++) {
            int var2 = class292.field4597[var1];
            if (class48.field648 != class100.field1523[var2].field2008) {
                if (class100.field1523[var2].field4991 > 0) {
                    class271.method1936(class100.field1523[var2], 11741);
                }
                class100.field1523[var2] = null;
            }
        }
        if (class138.field2063 != class336.field5213.field3129) {
            throw new RuntimeException("gpp1 pos:" + class336.field5213.field3129 + " psize:" + class138.field2063);
        }
        for (int var3 = 0; var3 < class24.field350; var3++) {
            if (class100.field1523[class103.field1575[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class24.field350);
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lc;B)V", line = 272)
    public static final void method2331(class320 arg0, byte arg1) {
        field5242++;
        class197 var2 = (class197) class55.field722.method1743(class232.method1669(37, arg0.field5003), (byte) -4);
        if (var2 == null) {
            class7.method51(arg0.field1969[0], -22958, arg0, class148.field2209, (class149) null, arg0.field2006[0], 0, (class196) null);
        } else {
            var2.method1442(125);
        }
        int var3 = 44 / ((arg1 + 46) / 48);
    }
}
