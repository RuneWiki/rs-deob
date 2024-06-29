import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class314 extends class183 {

    @OriginalMember(owner = "client!bl", name = "V", descriptor = "I")
    public static int field5334 = 0;

    @OriginalMember(owner = "client!bl", name = "T", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!bl", name = "U", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!bl", name = "W", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIII)V", line = 30)
    public static final void method2134(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5332++;
        class56.field991 = arg0;
        class142.field2458 = arg2;
        if (arg1 == -1) {
            class149.field2578 = arg4;
            class327.field5490 = arg3;
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(II)[I", line = 48)
    public final int[] method10(int arg0, int arg1) {
        field5333++;
        if (arg1 != -1) {
            field5334 = 52;
        }
        int[] var3 = this.field3161.method664(arg0, 0);
        if (this.field3161.field1736) {
            int[][] var4 = this.method1250(arg0, 0, (byte) 72);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            for (int var8 = 0; var8 < class22.field393; var8++) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V", line = 82)
    public class314() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(I)V", line = 86)
    public static final void method2135(int arg0) {
        field5335++;
        if (arg0 != 6573) {
            return;
        }
        for (class89 var1 = (class89) class83.field1532.method2078(arg0 - 6677); var1 != null; var1 = (class89) class83.field1532.method2080(5)) {
            if (var1.field1626 > 0) {
                var1.field1626--;
            }
            if (var1.field1626 != 0) {
                if (var1.field1632 > 0) {
                    var1.field1632--;
                }
                if (var1.field1632 == 0 && var1.field1641 >= 1 && var1.field1633 >= 1 && var1.field1641 <= 102 && var1.field1633 <= 102 && (var1.field1634 < 0 || class320.method2154(var1.field1634, var1.field1638, arg0 ^ 0x19AC))) {
                    class221.method1528(var1.field1628, var1.field1624, var1.field1635, var1.field1633, var1.field1634, (byte) 50, var1.field1638, var1.field1641);
                    var1.field1632 = -1;
                    if (var1.field1639 == var1.field1634 && var1.field1639 == -1) {
                        var1.method1747((byte) -85);
                    } else if (var1.field1639 == var1.field1634 && var1.field1636 == var1.field1624 && var1.field1638 == var1.field1637) {
                        var1.method1747((byte) -95);
                    }
                }
            } else if (var1.field1639 < 0 || class320.method2154(var1.field1639, var1.field1637, 1)) {
                class221.method1528(var1.field1628, var1.field1636, var1.field1635, var1.field1633, var1.field1639, (byte) 105, var1.field1637, var1.field1641);
                var1.method1747((byte) -125);
            }
        }
    }
}
