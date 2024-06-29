import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class78 extends InputStream {

    @OriginalMember(owner = "client!in", name = "c", descriptor = "Lqfa;")
    public static class85 field1568 = new class85(92, 6);

    @OriginalMember(owner = "client!in", name = "f", descriptor = "[[I")
    public static int[][] field1571 = new int[128][128];

    @OriginalMember(owner = "client!in", name = "g", descriptor = "Lsl;")
    public static class427 field1572 = new class427(8);

    @OriginalMember(owner = "client!in", name = "h", descriptor = "Lmea;")
    public static class398 field1573 = null;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!in", name = "read", descriptor = "()I")
    public final int read() {
        class185.method1354(30000L, 10);
        field1570++;
        return -1;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZLr;)V")
    public static final void method822(boolean arg0, class167 arg1) {
        field1567++;
        if (!(class481.field6904 >= 2 || class65.field1435) || class44.field1094 != null) {
            return;
        }
        String var2;
        if (class65.field1435 && class481.field6904 < 2) {
            var2 = class578.field8409 + class265.field3907.method1733(255, class140.field2466) + class177.field2892 + " ->";
        } else if (class66.field1450 && class486.field6965.method2194(81, (byte) 117) && class481.field6904 > 2) {
            var2 = class121.method1047((class300) class126.field2292.field2700.field6139.field6139, !arg0);
        } else {
            class300 var3 = (class300) class126.field2292.field2700.field6139;
            var2 = class121.method1047(var3, false);
            int[] var4 = null;
            if (class129.method1095(-45, var3.field4465)) {
                var4 = class268.field3985.method258((int) var3.field4472, (byte) -67).field1971;
            } else if (var3.field4471 != -1) {
                var4 = class268.field3985.method258(var3.field4471, (byte) -67).field1971;
            } else if (class219.method1522(72, var3.field4465)) {
                class436 var5 = (class436) class208.field3179.method2596((long) ((int) var3.field4472), 59);
                if (var5 != null) {
                    class22 var6 = var5.field6298;
                    class334 var7 = var6.field880;
                    if (var7.field4984 != null) {
                        var7 = var7.method2150(class113.field2038, -32224);
                    }
                    if (var7 != null) {
                        var4 = var7.field4996;
                    }
                }
            } else if (class602.method3438(var3.field4465, -116)) {
                Object var8 = null;
                class56 var9;
                if (var3.field4465 == 1001) {
                    var9 = class237.field3521.method3515((int) var3.field4472, 50);
                } else {
                    var9 = class237.field3521.method3515((int) (var3.field4472 >>> 32 & 0x7FFFFFFFL), 50);
                }
                if (var9.field1248 != null) {
                    var9 = var9.method662(3433, class113.field2038);
                }
                if (var9 != null) {
                    var4 = var9.field1309;
                }
            }
            if (var4 != null) {
                var2 = var2 + class367.method2319((byte) -85, var4);
            }
        }
        if (!arg0) {
            return;
        }
        if (class481.field6904 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class481.field6904 - 2) + class265.field3900.method1733(255, class140.field2466);
        }
        if (class225.field3373 != null) {
            class421 var11 = class225.field3373.method3134(13, arg1);
            if (var11 == null) {
                var11 = class367.field5445;
            }
            var11.method2564(class675.field9603, class225.field3373.field7617, class225.field3373.field7668, class225.field3373.field7608, var2, class242.field3664, class225.field3373.field7620, class126.field2308, class225.field3373.field7652, class682.field9673, class498.field7090, (byte) 87, class240.field3544, class301.field4493, class225.field3373.field7718);
            class521.method3066(class498.field7090[3], class498.field7090[0], (byte) 79, class498.field7090[2], class498.field7090[1]);
        } else if (class691.field9760 != null && field1573 == class568.field8275) {
            int var10 = class367.field5445.method2561(class348.field5183 + 16, 0, var2, -1, class126.field2308, class569.field8294 + 4, class682.field9673, class301.field4493, class240.field3544, 16777215);
            class521.method3066(16, class569.field8294 + 4, (byte) 82, var10 + class141.field2478.method286(var2, -5113), class348.field5183);
            return;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II)I")
    public static final int method823(int arg0, int arg1) {
        return class6.field501 == null ? 0 : class6.field501[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V")
    public static void method824(byte arg0) {
        if (arg0 > 90) {
            field1571 = null;
            field1572 = null;
            field1573 = null;
            field1568 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V")
    public static final void method825(byte arg0) {
        class99.field1767.method3701((byte) 68);
        field1566++;
        class1.field54.method1511(false);
        class467.field6618.method1897((byte) 36);
        class237.field3521.method3514((byte) 56);
        class317.field4681.method809((byte) 39);
        if (arg0 != 117) {
            return;
        }
        class268.field3985.method249(36);
        class357.field5338.method2098((byte) -100);
        class261.field3825.method1311(arg0 - 57);
        class661.field9519.method624((byte) 71);
        class107.field1851.method1666(64);
        class373.field5557.method1156(true);
        class597.field8568.method2799(0);
        class342.field5099.method3357(false);
        class119.field2137.method2827(arg0 ^ 0xFFFFBEB2);
        client.field4124.method979(2048);
        class475.field6813.method1517((byte) -26);
        class92.field1672.method3564(119);
        class428.field6168.method2734(11469);
        class589.field8478.method2250(true);
        class598.field8575.method3332(-14612);
        class148.method1176((byte) -30);
        class385.method2381(false);
        class522.method3068((byte) -111);
        class613.method3523(0);
        class3.method203((byte) 125);
        class206.field3155.method1912(arg0 ^ 0xFFFFF67D);
        class183.field2943.method1912(arg0 - 2669);
        class37.field1048.method1912(-2552);
        class192.field3025.method1912(arg0 - 2669);
        class683.field9703.method1912(-2552);
    }
}
