import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class124 {

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "I")
    public int field1564 = 1;

    @OriginalMember(owner = "client!wq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1569 = new String[] { method1113(method1112("Pf9$g")), method1113(method1112("Ib{\u000b")), method1113(method1112("Pf9%g")), method1113(method1112("\\99I2")), method1113(method1112("Pf9&g")), method1113(method1112("Pf9#g")) };

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "[I")
    public static int[] field1561 = new int[13];

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "[I")
    public static int[] field1565 = new int[5];

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "Lmv;")
    public static class125 field1566 = new class125(79, -1);

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "C")
    public char field1562;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "D")
    public static double field1568;

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public static final void method1108(Canvas arg0, byte arg1) {
        try {
            field1567++;
            Dimension var2 = arg0.getSize();
            class260.method2162(var2.width, 12, var2.height);
            if (arg1 < 49) {
                method1108(null, (byte) 1);
            }
            if (class101.field1360 == 1) {
                class349.field5060.method148(arg0, class576.field8332, class5.field63);
            } else {
                class349.field5060.method148(arg0, class608.field8720, class63.field971);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1569[5] + (arg0 == null ? field1569[1] : field1569[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BILjc;)V")
    private final void method1109(byte arg0, int arg1, class711 arg2) {
        try {
            if (arg1 == 1) {
                this.field1562 = class365.method2901((byte) 87, arg2.method5125((byte) 121));
            } else if (arg1 == 2) {
                this.field1564 = 0;
            }
            field1560++;
            int var4 = 80 / ((-arg0 - 35) / 55);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field1569[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1569[1] : field1569[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
    public static void method1110(int arg0) {
        try {
            field1565 = null;
            field1561 = null;
            field1566 = null;
            int var1 = 79 % ((-arg0 - 16) / 33);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1569[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BLjc;)V")
    public final void method1111(byte arg0, class711 arg1) {
        try {
            while (true) {
                int var3 = arg1.method5128(0);
                if (var3 == 0) {
                    field1563++;
                    if (arg0 != 85) {
                        this.field1562 = 'J';
                        return;
                    }
                    return;
                }
                this.method1109((byte) 93, var3, arg1);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1569[4] + arg0 + ',' + (arg1 == null ? field1569[1] : field1569[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!wq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1112(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1113(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 39;
                    break;
                case 1:
                    var10005 = 23;
                    break;
                case 2:
                    var10005 = 23;
                    break;
                case 3:
                    var10005 = 103;
                    break;
                default:
                    var10005 = 79;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
