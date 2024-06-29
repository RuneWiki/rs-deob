import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class357 extends class144 {

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "Lal;")
    public class67 field4863;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "Lsd;")
    public static class63 field4861 = new class63(4, 1, 1, 1);

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "Loq;")
    public static class242 field4862 = new class242("", 11);

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "Lao;")
    public static class191 field4866 = new class191(91, -1);

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "I")
    public static int field4869 = 1407;

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4868 = null;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "Lgb;")
    public static class145 field4870;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
    public static void method2118(int arg0) {
        if (arg0 >= -26) {
            method2119((byte) 16);
        }
        field4866 = null;
        field4861 = null;
        field4862 = null;
        field4868 = null;
        field4870 = null;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)[Lit;")
    public static final class459[] method2119(byte arg0) {
        int var1 = -31 / ((-arg0 - 73) / 49);
        if (class505.field7337 == null) {
            class459[] var2 = class223.method1405((byte) 125, class381.field5518);
            class459[] var3 = new class459[var2.length];
            int var4 = 0;
            label63: for (int var5 = 0; var5 < var2.length; var5++) {
                class459 var9 = var2[var5];
                if ((var9.field6839 <= 0 || var9.field6839 >= 24) && var9.field6842 >= 800 && var9.field6845 >= 600 && (class164.field2144 >= 96 || class20.field183 != 0 || var9.field6842 <= 1024 && var9.field6845 <= 768)) {
                    for (int var10 = 0; var10 < var4; var10++) {
                        class459 var11 = var3[var10];
                        if (var9.field6842 == var11.field6842 && var9.field6845 == var11.field6845) {
                            if (var9.field6839 > var11.field6839) {
                                var3[var10] = var9;
                            }
                            continue label63;
                        }
                    }
                    var3[var4] = var9;
                    var4++;
                }
            }
            class505.field7337 = new class459[var4];
            class438.method2690(var3, 0, class505.field7337, 0, var4);
            int[] var6 = new int[class505.field7337.length];
            for (int var7 = 0; var7 < class505.field7337.length; var7++) {
                class459 var8 = class505.field7337[var7];
                var6[var7] = var8.field6845 * var8.field6842;
            }
            class524.method3120(class505.field7337, var6, (byte) 74);
        }
        field4864++;
        return class505.field7337;
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lur;II[B)V")
    public class357(class377 arg0, int arg1, int arg2, byte[] arg3) {
        this.field4863 = class384.method2336(arg2, 6406, arg1, false, 6406, arg0, arg3, -119);
        this.field4863.method1499(false, 0, false);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IBIZZ)I")
    public static final int method2120(int arg0, byte arg1, int arg2, boolean arg3, boolean arg4) {
        field4865++;
        class327 var5 = class457.method2813(arg0, arg4, -21);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field4350.length; var7++) {
            if (var5.field4350[var7] >= 0 && class237.field3158.field416 > var5.field4350[var7]) {
                class199 var8 = class237.field3158.method236(-18315, var5.field4350[var7]);
                int var9 = var8.method1285(477, class104.field1405.method449((byte) 1, arg2).field1031, arg2);
                if (arg3) {
                    var6 += var5.field4346[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        if (arg1 <= 38) {
            return 50;
        } else {
            return var6;
        }
    }
}
