import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class165 {

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public int field2891 = -1;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field2889 = 0;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field2894 = 0;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "[[[Lbb;")
    public static class90[][][] field2896 = new class90[4][104][104];

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Lje;")
    public class182 field2893;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "[I")
    public int[] field2887;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "[Lp;")
    public class280[] field2892;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZZ)V")
    public static final void method1160(boolean arg0, boolean arg1) {
        class97.field1559 = new int[104];
        class279.field4884 = new int[104];
        class207.field3580 = new int[104];
        class153.field2653 = 99;
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class54.field882 = new byte[var2][104][104];
        if (!arg1) {
            field2894 = 69;
        }
        class105.field1753 = new int[104];
        class144.field2514 = new byte[var2][105][105];
        class252.field4401 = new byte[var2][104][104];
        class253.field4431 = new int[var2][105][105];
        field2888++;
        class37.field666 = new int[104];
        class219.field3754 = new byte[var2][104][104];
        class59.field954 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)Lde;")
    public static final class108 method1161(int arg0) {
        field2890++;
        int var1 = class97.field1562[0] * class57.field915[0];
        byte[] var2 = class182.field3178[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class16.field309[class214.method1432(255, var2[var4])];
        }
        class223 var5 = new class223(class93.field1512, class221.field3828, class243.field4263[0], class124.field2172[0], class97.field1562[0], class57.field915[0], var3);
        int var6 = 44 % ((63 - arg0) / 55);
        class126.method868(-15434);
        return var5;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
    public static void method1162(byte arg0) {
        field2896 = null;
        if (arg0 >= -13) {
            method1160(false, true);
        }
    }
}
