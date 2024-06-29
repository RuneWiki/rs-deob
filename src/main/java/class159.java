import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class159 {

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field2709 = 0;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field2711 = -1;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "Lf;")
    public static class121 field2710 = new class121(5000);

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "Lmb;")
    public static class172 field2712 = new class172(5);

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "Loh;")
    public static class258 field2714 = class153.method1046("<col=ffb000>", 122);

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "[I")
    public static int[] field2713 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BZ)V", line = 9)
    public static final void method1075(byte arg0, boolean arg1) {
        class172.method1164(70);
        field2707++;
        if (class280.field4818 != 30 && class280.field4818 != 25) {
            return;
        }
        class148.field2509++;
        if (class148.field2509 < 50 && !arg1) {
            return;
        }
        class148.field2509 = 0;
        if (!class36.field475 && class73.field1289 != null) {
            class138.field2356++;
            field2710.method885(115, -109);
            try {
                class73.field1289.method1123(4900, 0, field2710.field4051, field2710.field4066);
                field2710.field4051 = 0;
            } catch (IOException var3) {
                class36.field475 = true;
            }
        }
        if (arg0 != -116) {
            method1075((byte) 40, true);
        }
        class172.method1164(117);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 44)
    public static void method1076(int arg0) {
        field2710 = null;
        field2714 = null;
        field2712 = null;
        if (arg0 != 115) {
            method1075((byte) 114, false);
        }
        field2713 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BLs;)Loh;", line = 70)
    public static final class258 method1077(byte arg0, class171 arg1) {
        field2706++;
        if (class261.method1832((byte) 94, client.method354(arg1)) == 0) {
            return null;
        }
        int var2 = -110 / ((arg0 - 12) / 38);
        if (arg1.field3001 == null || arg1.field3001.method1817((byte) -48).method1816(false) == 0) {
            return class166.field2823 ? class208.field3574 : null;
        } else {
            return arg1.field3001;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V", line = 95)
    public static final void method1078(int arg0, int arg1) {
        class188.field3328 = arg1;
        field2705++;
        class271.method1915(3, arg0 - 15948);
        class271.method1915(4, -10948);
        if (arg0 != 5000) {
            method1078(-16, 116);
        }
    }
}
