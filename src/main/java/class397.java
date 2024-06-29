import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class397 {

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIBLma;)V", line = 8)
    public static final void method2483(int arg0, int arg1, int arg2, byte arg3, class306 arg4) {
        field5714++;
        if (arg3 != 108) {
            method2484(118, -108, -120, -35, 93, 24, -110, (byte) 45);
        }
        long var5 = (long) (arg1 | arg2 << 28 | arg0 << 14);
        class268 var7 = (class268) class419.field6102.method308(var5, (byte) -1);
        if (var7 == null) {
            class268 var8 = new class268();
            class419.field6102.method314(var5, var8, 7079);
            var8.field3647.method825(117, arg4);
            return;
        }
        class123 var9 = class65.method368(arg4.field4144, -117);
        int var10 = var9.field1588;
        if (var9.field1517 == 1) {
            var10 = (arg4.field4142 + 1) * var10;
        }
        for (class306 var11 = (class306) var7.field3647.method814((byte) 90); var11 != null; var11 = (class306) var7.field3647.method827(arg3 - 97)) {
            class123 var12 = class65.method368(var11.field4144, arg3 - 223);
            int var13 = var12.field1588;
            if (var12.field1517 == 1) {
                var13 = (var11.field4142 + 1) * var13;
            }
            if (var10 > var13) {
                class444.method2754(var11, -24521, arg4);
                return;
            }
        }
        var7.field3647.method825(63, arg4);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIIIIB)V", line = 64)
    public static final void method2484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        class24.method128(0, arg0, arg6, arg3, arg1, arg4, arg2, arg5, -129);
        field5713++;
        if (arg7 != -75) {
            method2484(-19, -117, 76, 84, 63, -84, 84, (byte) -29);
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)V", line = 79)
    public static final void method2485(boolean arg0) {
        field5716++;
        class131 var1 = class119.field1482;
        synchronized (class119.field1482) {
            class119.field1482.method703((byte) -32);
            if (arg0) {
                method2485(true);
            }
        }
    }
}
