import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class333 {

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "Lbu;")
    public static class21 field4702 = new class21(42, -1);

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "[I")
    public static int[] field4704 = new int[6];

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V", line = 12)
    public static void method2120(int arg0) {
        field4702 = null;
        if (arg0 > 113) {
            field4704 = null;
        }
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)V", line = 23)
    public static final void method2121(int arg0) {
        class637.field8936 = class368.field5111.field64 + class368.field5111.field56 + 2;
        field4701++;
        class353.field4964 = new String[arg0];
        class392.field5397 = class395.field5431.field64 + class395.field5431.field56 + 2;
        for (int var1 = 0; var1 < class353.field4964.length; var1++) {
            class353.field4964[var1] = "";
        }
        class587.method3423(class620.field8659.method3580(class140.field2081, arg0 - 488), -115);
    }

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "(I)V", line = 41)
    public static final void method2122(int arg0) {
        if (class378.field5220 != null) {
            class648.method3716(-49);
        } else if (class449.field6142 == -1) {
            class345.method2186(class691.field9661, -1, class694.field9678);
        } else {
            class249.method1641(1);
        }
        if (arg0 != 0) {
            field4704 = null;
        }
        field4703++;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lwia;Ljava/lang/String;IZ)Lraa;", line = 63)
    public static final class632 method2123(class791 arg0, String arg1, int arg2, boolean arg3) {
        field4705++;
        int var4 = arg0.method4356(59, arg1);
        if (var4 == -1) {
            return new class632(0);
        }
        if (arg2 != 2) {
            method2120(6);
        }
        int[] var5 = arg0.method4348((byte) -78, var4);
        class632 var6 = new class632(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var6.field8878 > var7) {
                class494 var9 = new class494(arg0.method4339(var5[var8++], 0, var4));
                int var10 = var9.method2976(arg2 ^ 0xFFFFFF82);
                int var11 = var9.method2998(true);
                int var12 = var9.method2964((byte) 120);
                if (!arg3 && var12 == 1) {
                    var6.field8878--;
                } else {
                    var6.field8880[var7] = var10;
                    var6.field8883[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }
}
