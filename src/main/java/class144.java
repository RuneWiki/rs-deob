import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class144 {

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static volatile int field1967 = 0;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "[S")
    public static short[] field1965;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public static final void method900(int arg0) {
        class7.field76++;
        field1969++;
        class231.field3614.method809(arg0, 0);
        for (class60 var1 = (class60) class186.field2821.method1458(0); var1 != null; var1 = (class60) class186.field2821.method1462(arg0 - 10000003)) {
            if (var1.field834 == 0) {
                class166.method1067(4, var1, true);
            }
        }
        if (class76.field1074 != null) {
            class312.method2108(false, class76.field1074);
            class76.field1074 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLnh;Lnh;)V")
    public static final void method901(byte arg0, class305 arg1, class305 arg2) {
        class58.field806 = arg2;
        field1970++;
        if (arg0 >= -72) {
            method902(-49, -98, true, true, -40);
        }
        class260.field4187 = arg1;
        class58.field806.method2067(36, (byte) 51);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIZZI)V")
    public static final void method902(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field1966++;
        class108.method687(78, arg2);
        class131.field1835 = arg1;
        class72.field1035 = arg3;
        class200.field3043 = arg4;
        class97.method621(arg0);
        class53.field750 = new class222(8);
        class307.field4942 = new class222(8);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
    public static void method903(byte arg0) {
        if (arg0 != 118) {
            method900(-42);
        }
        field1965 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)Lvh;")
    public static final class115 method904(int arg0, int arg1, int arg2) {
        class91 var3 = class246.field3856[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class115 var4 = var3.field1332;
            var3.field1332 = null;
            return var4;
        }
    }
}
