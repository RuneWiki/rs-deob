import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class435 extends class261 {

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "Lig;")
    public class163 field6471;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "F")
    public static float field6475 = 0.0F;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "Lqg;")
    public static class325 field6470;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "[S")
    public static short[] field6474;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)Z")
    public static final boolean method2607(byte arg0) {
        field6472++;
        int var1 = -39 / ((-arg0 - 2) / 53);
        try {
            return class283.method1770(-65536);
        } catch (IOException var5) {
            class479.method2856((byte) -27);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + (class523.field7592 == null ? -1 : class523.field7592.method1272(1)) + "," + (class363.field5302 == null ? -1 : class363.field5302.method1272(1)) + "," + (class398.field6039 == null ? -1 : class398.field6039.method1272(1)) + " - " + class234.field3606 + "," + (class15.field266.field7866[0] + class496.field7292) + "," + (class212.field3378 + class15.field266.field7870[0]) + " - ";
            for (int var4 = 0; class234.field3606 > var4 && var4 < 50; var4++) {
                var3 = var3 + class219.field3446.field4408[var4] + ",";
            }
            class486.method2913(var3, var6, (byte) -115);
            class391.method2414(false, 5424);
            return true;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method2608(int arg0) {
        if (arg0 > 87) {
            field6470 = null;
            field6474 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lig;)V")
    public class435(class163 arg0) {
        this.field6471 = arg0;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)Ltc;")
    public static final class236 method2609(int arg0, int arg1) {
        field6473++;
        class236 var2 = (class236) class19.field311.method2478(1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class442.field6569.method2757(arg0, arg1, (byte) -124);
        class236 var4 = new class236();
        if (var3 != null) {
            var4.method1548(false, new class289(var3), arg1);
        }
        class19.field311.method2472(arg0 ^ 0xFFFFFF88, var4, (long) arg1);
        return var4;
    }
}
