import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class10 {

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "Lb;")
    public static class11 field190 = new class11(64);

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "Lb;")
    public static class11 field191 = new class11(5);

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "Lk;")
    public static class90 field193 = new class90(5000);

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field194 = 0;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static void method57(byte arg0) {
        field193 = null;
        int var1 = 19 % ((arg0 + 23) / 48);
        field190 = null;
        field191 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
    public static final void method58(boolean arg0) {
        field185++;
        if (class48.field887 > 0) {
            class169.method1173((byte) 17);
            return;
        }
        class88.method695((byte) -125, 40);
        class103.field2018 = class47.field861;
        if (!arg0) {
            method62(-8, 116, 5);
        }
        class47.field861 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lf;Z)V")
    public static final void method59(class47 arg0, boolean arg1) {
        if (!arg1) {
            field194 = 14;
        }
        class27.field467 = arg0;
        field186++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)Z")
    public static final boolean method60(int arg0) {
        field188++;
        class125 var1 = class4.field80;
        synchronized (class4.field80) {
            if (arg0 != -1) {
                return false;
            } else if (class60.field1238 == class175.field3313) {
                return false;
            } else {
                class77.field1586 = class164.field3125[class60.field1238];
                class34.field644 = class132.field2586[class60.field1238];
                class60.field1238 = class60.field1238 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
    public static final void method61(byte arg0) {
        field189++;
        if (arg0 == 20) {
            class37.field676.method71(500);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)I")
    public static final int method62(int arg0, int arg1, int arg2) {
        if (arg0 != -28756) {
            field193 = null;
        }
        field187++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 / 128;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }
}
