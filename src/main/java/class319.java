import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class319 extends class232 {

    @OriginalMember(owner = "client!km", name = "G", descriptor = "Z")
    public static boolean field5448 = true;

    @OriginalMember(owner = "client!km", name = "N", descriptor = "Lok;")
    public static class146 field5455 = class235.method1724(-12908, "clignotant3:");

    @OriginalMember(owner = "client!km", name = "U", descriptor = "Z")
    public static boolean field5461 = false;

    @OriginalMember(owner = "client!km", name = "M", descriptor = "F")
    public static float field5454;

    @OriginalMember(owner = "client!km", name = "F", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!km", name = "H", descriptor = "I")
    public int field5449;

    @OriginalMember(owner = "client!km", name = "I", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!km", name = "J", descriptor = "I")
    private int field5451;

    @OriginalMember(owner = "client!km", name = "K", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!km", name = "L", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!km", name = "P", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!km", name = "Q", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!km", name = "S", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!km", name = "T", descriptor = "Lok;")
    public class146 field5460;

    @OriginalMember(owner = "client!km", name = "R", descriptor = "Ltg;")
    public static class307 field5458;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(B)Z", line = 4)
    public final boolean method2220(byte arg0) {
        if (arg0 == 119) {
            field5452++;
            return this.field5451 == 115;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILwe;)V", line = 16)
    public final void method2221(int arg0, class47 arg1) {
        int var3 = -63 / ((arg0 - 20) / 37);
        field5453++;
        while (true) {
            int var4 = arg1.method368(-128);
            if (var4 == 0) {
                return;
            }
            this.method2225(0, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IZ)V", line = 38)
    public static final void method2222(int arg0, boolean arg1) {
        field5456++;
        class158 var2 = class206.method1564(arg0, 1, -113);
        var2.method1238(-122);
        if (!arg1) {
            field5461 = true;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILoh;II)[Ltg;", line = 56)
    public static final class307[] method2223(int arg0, class15 arg1, int arg2, int arg3) {
        field5450++;
        if (class230.method1688(arg0, arg3, 1221, arg1)) {
            if (arg2 < 66) {
                method2224((byte) 43);
            }
            return class66.method498((byte) -96);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!km", name = "e", descriptor = "(B)V", line = 70)
    public static final void method2224(byte arg0) {
        class177.field3000.method791(8);
        field5457++;
        if (arg0 != 40) {
            field5455 = (class146) null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILwe;I)V", line = 101)
    private final void method2225(int arg0, class47 arg1, int arg2) {
        field5459++;
        if (arg0 != 0) {
            this.method2220((byte) -114);
        }
        if (arg2 == 1) {
            this.field5451 = arg1.method368(-113);
        } else if (arg2 == 2) {
            this.field5449 = arg1.method373((byte) 36);
        } else if (arg2 == 5) {
            this.field5460 = arg1.method337(-1);
        }
    }

    @OriginalMember(owner = "client!km", name = "e", descriptor = "(I)V", line = 134)
    public static void method2226(int arg0) {
        if (arg0 != 115) {
            field5461 = false;
        }
        field5458 = null;
        field5455 = null;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(II)Lhe;", line = 155)
    public static final class90 method2227(int arg0, int arg1) {
        class90 var2 = (class90) class281.field4821.method799((byte) 52, (long) arg0);
        field5447++;
        if (var2 != null) {
            return var2;
        }
        int var3 = 45 / ((-arg1 - 68) / 49);
        byte[] var4 = class269.field4619.method92(arg0, 0, 0);
        class90 var5 = new class90(var4);
        var5.method219(class102.field1651, (int[]) null);
        class281.field4821.method797(var5, 0, (long) arg0);
        return var5;
    }
}
