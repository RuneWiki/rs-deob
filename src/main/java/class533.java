import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class533 {

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "Lkf;")
    public static class235 field7082 = new class235();

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "I")
    public static int field7085;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V")
    public static final void method2966(byte arg0) {
        field7085++;
        if (arg0 != -53) {
            field7082 = null;
        }
        if (class253.field3477) {
            return;
        }
        class253.field3477 = true;
        if (class344.field4718.field5425) {
            class463.field6263 = ((int) class463.field6263 - 17 & 0xFFFFFFF0);
        } else {
            class344.field4710 += (-12.0F - class344.field4710) / 2.0F;
        }
        class457.field6204 = true;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V")
    public static void method2967(int arg0) {
        field7082 = null;
        int var1 = 29 / ((arg0 + 5) / 48);
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Leh;I)Loq;")
    public static final class333 method2968(class335 arg0, int arg1) {
        field7084++;
        String var2 = arg0.method2029((byte) -78);
        class212 var3 = class287.method1770(true)[arg0.method2034(255)];
        class679 var4 = class601.method3318(true)[arg0.method2034(255)];
        int var5 = arg0.method2022(arg1 ^ 0xFFFFC30D);
        int var6 = arg0.method2022(arg1 ^ 0xFFFFC30D);
        if (arg1 != 19794) {
            field7082 = null;
        }
        int var7 = arg0.method2034(arg1 - 19539);
        int var8 = arg0.method2034(255);
        int var9 = arg0.method2034(255);
        int var10 = arg0.method2001((byte) -83);
        int var11 = arg0.method2001((byte) -83);
        int var12 = arg0.method2045(-98);
        int var13 = arg0.method2045(-98);
        int var14 = arg0.method2045(arg1 ^ 0xFFFFB2CC);
        return new class333(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
    }
}
