import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class21 {

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Lid;")
    public static class60 field492 = class11.method72("<img=1>", (byte) 122);

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Lid;")
    public static class60 field490 = class11.method72("mapdots", (byte) 110);

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field494 = 0;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field495 = 1;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lid;I)V")
    public static final void method162(class60 arg0, int arg1) {
        field491++;
        if (class107.field2629 >= 2) {
            if (arg0.method426(class10.field172, (byte) 37)) {
                System.gc();
            }
            if (arg0.method426(class135.field3070, (byte) 37)) {
                class98.method775(96);
            }
            if (arg0.method426(class77.field1885, (byte) 37)) {
                class34.field800 = true;
            }
            if (arg0.method426(class98.field2396, (byte) 37)) {
                class34.field800 = false;
            }
            if (arg0.method426(class64.field1595, (byte) 37)) {
                for (int var2 = 0; var2 < 4; var2++) {
                    for (int var3 = 1; var3 < 103; var3++) {
                        for (int var4 = 1; var4 < 103; var4++) {
                            class133.field3030[var2].field2602[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg0.method426(class106.field2622, (byte) 37) && class34.field785 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method450((byte) 88, class18.field454)) {
                class64.field1604 = arg0.method421(12, 0).method422(0).method424(-88);
                class43.method342(null, 0, class104.method853(-80, new class60[] { class80.field1999, class98.method774((byte) -121, class64.field1604) }), 2001);
            }
            if (arg0.method426(class121.field2774, (byte) 37)) {
                class40.field1000 = true;
            }
        }
        class22.field519.method1214(arg1, 0);
        class50.field1284++;
        class22.field519.method818(false, arg0.method447((byte) 39) - 1);
        class22.field519.method807((byte) 0, arg0.method421(2, 0));
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLfd;)Lid;")
    public static final class60 method163(byte arg0, class40 arg1) {
        if (arg0 < 27) {
            return null;
        }
        field493++;
        if (class140.method1092(class97.method770(arg1, -1370253216), (byte) -31) == 0) {
            return null;
        } else if (arg1.field1009 == null || arg1.field1009.method422(0).method447((byte) 39) == 0) {
            return class40.field1000 ? class125.field2877 : null;
        } else {
            return arg1.field1009;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method164(int arg0) {
        int var1 = -99 / ((-arg0 - 75) / 43);
        field492 = null;
        field490 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static final void method165(byte arg0) {
        class47.field1239.method920(arg0);
        field488++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIB)I")
    public static final int method166(int arg0, int arg1, byte arg2) {
        if (arg2 != -85) {
            field492 = null;
        }
        field489++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 / 128;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }
}
