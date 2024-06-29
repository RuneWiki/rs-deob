import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public abstract class class42 {

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public int field771;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public int field773;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public int field768;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Z")
    public static boolean field761 = false;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field769 = 100;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Leb;")
    private static class230 field760 = class68.method589(0, "scroll:");

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Leb;")
    public static class230 field762 = class68.method589(0, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Leb;")
    public static class230 field766 = field760;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "[S")
    public static short[] field770 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Leb;")
    public static class230 field763 = field760;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "Z")
    public static boolean field774 = true;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "Leb;")
    public static class230 field772 = class68.method589(0, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)V")
    public static final void method366(int arg0, int arg1, int arg2) {
        field764++;
        class197 var3 = class164.method1228(1, arg2, arg1 ^ 0x9CB4925D);
        var3.method1402((byte) -102);
        if (arg1 != 22461) {
            field769 = 41;
        }
        var3.field3527 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(III)V")
    public abstract void method367(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(III)V")
    public abstract void method368(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static void method369(byte arg0) {
        field770 = null;
        field766 = null;
        int var1 = 115 % ((27 - arg0) / 33);
        field762 = null;
        field763 = null;
        field772 = null;
        field760 = null;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(III)V")
    public class42(int arg0, int arg1, int arg2) {
        this.field771 = arg2;
        this.field773 = arg0;
        this.field768 = arg1;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)V")
    public static final void method370(int arg0, int arg1) {
        if (arg1 < 90) {
            field763 = null;
        }
        class212 var2 = (class212) class75.field1366.method394((long) arg0, -21083);
        field767++;
        if (var2 != null) {
            var2.method518(84);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIB)V")
    public abstract void method371(int arg0, int arg1, byte arg2);
}
