import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class35 extends class81 {

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "[Lmc;")
    public class191[] field755 = new class191[5];

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "I")
    public int field768 = 0;

    @OriginalMember(owner = "client!vk", name = "H", descriptor = "[I")
    public int[] field765 = new int[5];

    @OriginalMember(owner = "client!vk", name = "T", descriptor = "I")
    public int field777;

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "I")
    public int field761;

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "I")
    public int field771;

    @OriginalMember(owner = "client!vk", name = "A", descriptor = "I")
    public int field758;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "Lpj;")
    public static class237 field747 = class33.method353("RuneScape wird geladen )2 bitte warten)3)3)3", 107);

    @OriginalMember(owner = "client!vk", name = "C", descriptor = "[J")
    public static long[] field760 = new long[500];

    @OriginalMember(owner = "client!vk", name = "G", descriptor = "Lpj;")
    private static class237 field764 = class33.method353("Loaded update list", 55);

    @OriginalMember(owner = "client!vk", name = "S", descriptor = "Lpj;")
    public static class237 field776 = class33.method353("Suche nach Updates )2 ", 45);

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "Lpj;")
    public static class237 field752 = field764;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "I")
    public int field748;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!vk", name = "B", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "I")
    public int field766;

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "I")
    public int field769;

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "I")
    public int field772;

    @OriginalMember(owner = "client!vk", name = "F", descriptor = "Lm;")
    public class114 field763;

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "Lac;")
    public class132 field751;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "Lmd;")
    public class212 field749;

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "Lcb;")
    public class232 field753;

    @OriginalMember(owner = "client!vk", name = "E", descriptor = "Lta;")
    public class244 field762;

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "Lof;")
    public class254 field756;

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "Lvk;")
    public class35 field774;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "Z")
    public boolean field770;

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "Z")
    public boolean field773;

    @OriginalMember(owner = "client!vk", name = "R", descriptor = "Z")
    public boolean field775;

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "[Lnf;")
    public static class155[] field754;

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(III)V")
    public class35(int arg0, int arg1, int arg2) {
        this.field761 = this.field777 = arg0;
        this.field771 = arg1;
        this.field758 = arg2;
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)V")
    public static void method369(int arg0) {
        if (arg0 != 7704) {
            field754 = null;
        }
        field754 = null;
        field776 = null;
        field752 = null;
        field764 = null;
        field747 = null;
        field760 = null;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(IB)V")
    public static final void method370(int arg0, byte arg1) {
        field757++;
        if (arg1 != -112) {
            field764 = null;
        }
        class270 var2 = class202.method1368(-15, 8, arg0);
        var2.method1795(-2113);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)I")
    public static final int method371(int arg0, int arg1) {
        if (arg0 >= -13) {
            method371(-93, -76);
        }
        field750++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "(I)V")
    public static final void method372(int arg0) {
        field767++;
        for (int var1 = 0; var1 < class77.field1447; var1++) {
            class176 var2 = class181.method1241(arg0, var1);
            if (var2 != null && var2.field3089 == 0) {
                class108.field1925[var1] = 0;
                class202.field3471[var1] = 0;
            }
        }
        class28.field499 = new class69(arg0);
    }
}
