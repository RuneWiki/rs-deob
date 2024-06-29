import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public abstract class class156 extends class224 {

    @OriginalMember(owner = "client!kt", name = "y", descriptor = "Z")
    public volatile boolean field2336 = true;

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "I")
    public static int field2337 = 0;

    @OriginalMember(owner = "client!kt", name = "x", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!kt", name = "A", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!kt", name = "B", descriptor = "Z")
    public boolean field2339;

    @OriginalMember(owner = "client!kt", name = "C", descriptor = "Z")
    public boolean field2340;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)I")
    public abstract int method1185(boolean arg0);

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
    public static final void method1186(int arg0) {
        class475.field6803 = arg0;
        for (int var1 = 0; var1 < class613.field8871; var1++) {
            for (int var2 = 0; var2 < class453.field6328; var2++) {
                if (class390.field5454[arg0][var1][var2] == null) {
                    class390.field5454[arg0][var1][var2] = new class416(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(B)[B")
    public abstract byte[] method1187(byte arg0);

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1188(String arg0, int arg1) {
        if (arg1 != 22202) {
            field2337 = -90;
        }
        field2338++;
        return arg0.length() + 2;
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(B)V")
    public static final void method1189(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class104.field1732[var1] = false;
        }
        field2335++;
        class411.field5689 = -1;
        class679.field9569 = -1;
        class589.field8280 = class260.field3810;
        class215.field3079 = class685.field9660;
        class259.field3807 = class239.field3371;
        class395.field5534 = class605.field8787;
        class399.field5586 = 0;
        class517.field7351 = class694.field9754;
        class84.field1533 = -1;
        class323.field4588 = -1;
        class641.field9118 = class136.field2118;
        int var2 = 108 / ((-arg0 - 49) / 36);
        class505.field7211 = 0;
        class666.field9338 = 5;
    }
}
