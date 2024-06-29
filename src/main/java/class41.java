import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class41 {

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILji;)Leo;")
    public static final class276 method256(int arg0, class572 arg1) {
        field581++;
        if (arg0 != 7) {
            field583 = 122;
        }
        class690 var2 = class555.method2957((byte) 67, arg1);
        int var3 = arg1.method3064(-2031091464);
        int var4 = arg1.method3064(-2031091464);
        int var5 = arg1.method3031(-1);
        return new class276(var2.field9578, var2.field9576, var2.field9571, var2.field9577, var2.field9574, var2.field9572, var2.field9568, var2.field9570, var2.field9569, var3, var4, var5);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method257(String arg0, int arg1, int arg2) {
        class228.method1376(19522);
        field582++;
        class17.method99(arg1 ^ arg1);
        class384.method2205((byte) 80);
        class431.method2371(arg2, arg1 - 19851, arg0);
        class416.method2316(true);
        class588.method3268(arg1 - 34598, class309.field3898);
        class362.method2104(class309.field3898, -63);
        class671.method3723(class136.field1656, (byte) 126, class309.field3898);
        class416.method2314(false);
        class374.method2165(-30020, class94.field1201);
        class377.method2172(100);
        class305.method1816((byte) 2);
        if (class470.field5804 == 3) {
            class78.method609(10503, 4);
        } else if (class470.field5804 == 7) {
            class78.method609(10503, 8);
        } else if (class470.field5804 == 10) {
            class78.method609(10503, 11);
        } else if (class470.field5804 == 1 || class470.field5804 == 2) {
            class466.method2542(-11112);
        }
    }
}
