import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class162 extends class40 {

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "Lkq;")
    public static class353 field2319;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)[I")
    public final int[] method44(byte arg0, int arg1) {
        if (arg0 >= -20) {
            return null;
        } else {
            ++field2318;
            int[] var3 = super.field551.method185(65280, arg1);
            if (super.field551.field441) {
                int[][] var4 = this.method261(0, 28552, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; class410.field5886 > var8; ++var8) {
                    var3[var8] = (var5[var8] - -var7[var8] + var6[var8]) / 3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
    public static void method1163(int arg0) {
        field2319 = null;
        if (arg0 != 2) {
            field2319 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lvq;Z)V")
    public static final void method1164(class269 arg0, boolean arg1) {
        ++field2320;
        if (class356.field5156.method2757(-11567) != 0) {
            if (arg1) {
                field2319 = null;
            }
            if (~class110.field1418 != -1 && class110.field1418 != 2) {
                if (class452.field6482 == null) {
                    Canvas var2 = new Canvas();
                    var2.setSize(36, 32);
                    class452.field6482 = class269.method1830(0, class321.field4701, var2, (byte) -87, class401.field5628, 0);
                    class97.field1239 = class452.field6482.method1024(class432.method2699(0, class327.field4745, class110.field1417, (byte) -90), class337.method2215(class15.field216, class110.field1417, 0), true);
                }
                for (class114 var3 = (class114) class356.field5156.method2752(-56); var3 != null; var3 = (class114) class356.field5156.method2754(-1)) {
                    class301.method2029(var3.field1476, var3.field1480 ? class181.field2555.field1778 : null, var3.field1482, false, arg0, var3.field1477, var3.field1479, class97.field1239, var3.field1478, (byte) -103, false, class452.field6482);
                    var3.method2660((byte) 127);
                }
            } else {
                for (class114 var4 = (class114) class356.field5156.method2752(-91); var4 != null; var4 = (class114) class356.field5156.method2754(-1)) {
                    class301.method2029(var4.field1476, !var4.field1480 ? null : class181.field2555.field1778, var4.field1482, false, arg0, var4.field1477, var4.field1479, class32.field409, var4.field1478, (byte) -69, false, arg0);
                    var4.method2660((byte) 117);
                }
                class158.method1152(-125);
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
    public class162() {
        super(1, true);
    }
}
