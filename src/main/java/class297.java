import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class297 {

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field5055 = 0;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "Lok;")
    public static class146 field5058 = class235.method1724(-12908, "Okay");

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Lok;")
    public static class146 field5061 = class235.method1724(-12908, "violet:");

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "Lok;")
    private static class146 field5053 = class235.method1724(-12908, "shake:");

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field5059 = 0;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "Lok;")
    public static class146 field5057 = field5053;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "Lok;")
    public static class146 field5060 = field5053;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "F")
    public static float field5054;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "[I")
    public static int[] field5056;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "[[[I")
    public static int[][][] field5051;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V", line = 29)
    public static final void method2108(int arg0, int arg1) {
        field5052++;
        if (!class272.method1992(arg0 ^ 0x903, arg1)) {
            return;
        }
        if (arg0 != 1) {
            method2110((byte) -61);
        }
        class264[] var2 = class92.field1459[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class264 var4 = var2[var3];
            if (var4 != null) {
                var4.field4474 = 0;
                var4.field4448 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 64)
    public static final void method2109(int arg0) {
        field5062++;
        if (class43.field738 != null || class213.field3521 != null || arg0 >= -57) {
            return;
        }
        int var1 = class251.field4203;
        if (!class295.field4998) {
            if (var1 == 1 && class45.field763 > 0) {
                short var2 = class224.field3739[class45.field763 - 1];
                if (var2 == 60 || var2 == 44 || var2 == 46 || var2 == 31 || var2 == 16 || var2 == 15 || var2 == 36 || var2 == 35 || var2 == 17 || var2 == 4 || var2 == 48 || var2 == 1003) {
                    int var3 = class93.field1493[class45.field763 - 1];
                    int var4 = class259.field4308[class45.field763 - 1];
                    class264 var5 = class98.method680(var4, false);
                    if (class305.method2150(client.method1789(var5), 112) || class58.method458(false, client.method1789(var5))) {
                        class114.field1840 = false;
                        class217.field3576 = 0;
                        if (class43.field738 != null) {
                            class164.method1280(false, class43.field738);
                        }
                        class43.field738 = class98.method680(var4, false);
                        class237.field3953 = class120.field1974;
                        class296.field5037 = var3;
                        class57.field1008 = class215.field3542;
                        class164.method1280(false, class43.field738);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class98.field1581 == 1 && class45.field763 > 2 || class279.method2028(class45.field763 - 1, 2000))) {
                var1 = 2;
            }
            if (var1 == 2 && class45.field763 > 0 || class124.field2029 == 1) {
                class50.method413((byte) -29);
            }
            if (var1 == 1 && class45.field763 > 0 || class124.field2029 == 2) {
                class119.method813(-119);
            }
            return;
        }
        if (var1 != 1) {
            int var6 = class232.field3875;
            int var7 = class316.field5368;
            if (class113.field1821 - 10 > var6 || class113.field1821 + class283.field4851 + 10 < var6 || (class116.field1864 - 10) > var7 || (class171.field2889 + class116.field1864 + 10) < var7) {
                class295.field4998 = false;
                class112.method759(class171.field2889, class116.field1864, 8, class283.field4851, class113.field1821);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var8 = class116.field1864;
        int var9 = class283.field4851;
        int var10 = class113.field1821;
        int var11 = class215.field3542;
        int var12 = class120.field1974;
        int var13 = -1;
        for (int var14 = 0; var14 < class45.field763; var14++) {
            int var15;
            if (class177.field3003) {
                var15 = (class45.field763 - (var14 + 1)) * 15 + var8 + 35;
            } else {
                var15 = (class45.field763 - var14 - 1) * 15 + var8 + 31;
            }
            if (var12 > var10 && (var10 + var9) > var12 && var11 > (var15 - 13) && var15 + 3 > var11) {
                var13 = var14;
            }
        }
        if (var13 != -1) {
            class279.method2024(var13, (byte) -108);
        }
        class295.field4998 = false;
        class112.method759(class171.field2889, class116.field1864, 8, class283.field4851, class113.field1821);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 206)
    public static void method2110(byte arg0) {
        field5051 = (int[][][]) null;
        field5060 = null;
        field5061 = null;
        field5056 = null;
        field5053 = null;
        field5058 = null;
        if (arg0 == 65) {
            field5057 = null;
        }
    }
}
