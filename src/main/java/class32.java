import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class32 {

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "[Lcd;")
    public static class64[] field533 = new class64[1000];

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Lcd;")
    public static class64 field534 = null;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Lcd;")
    public static class64 field536 = class44.method335((byte) 71, "leuchten3:");

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Lcd;")
    public static class64 field537 = class44.method335((byte) 71, "blinken1:");

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Lqm;")
    public static class222 field540;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "Lqg;")
    public static class231 field532;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Component;III)Lsb;", line = 4)
    public static final class104 method273(Component arg0, int arg1, int arg2, int arg3) {
        field541++;
        try {
            Class var4 = Class.forName("n");
            if (arg2 == -51) {
                class104 var5 = (class104) var4.getDeclaredConstructor().newInstance();
                var5.method671((byte) -95, arg0, arg1, arg3);
                return var5;
            } else {
                return (class104) null;
            }
        } catch (Throwable var8) {
            class88 var7 = new class88();
            var7.method671((byte) -128, arg0, arg1, arg3);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Lrd;", line = 43)
    public static final class162 method274(int arg0, int arg1, int arg2) {
        class295 var3 = class304.field5203[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5092;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)Z", line = 51)
    public static final boolean method275(int arg0) {
        field539++;
        if (arg0 != -51) {
            return true;
        }
        try {
            return class156.method1126(30415);
        } catch (IOException var5) {
            class121.method851(0);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class274.field4709 + "," + class273.field4685 + "," + class299.field5163 + " - " + class26.field428 + "," + (class139.field2472.field1876[0] + class190.field3269) + "," + (class139.field2472.field1898[0] + class121.field2184) + " - ";
            for (int var4 = 0; var4 < class26.field428 && var4 < 50; var4++) {
                var3 = var3 + class108.field1991.field254[var4] + ",";
            }
            class309.method2146((byte) -99, var3, var6);
            class74.method596((byte) 27);
            return true;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V", line = 88)
    public static void method276(boolean arg0) {
        if (!arg0) {
            method276(true);
        }
        field536 = null;
        field534 = null;
        field533 = null;
        field537 = null;
        field540 = null;
        field532 = null;
    }
}
