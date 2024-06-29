import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class125 extends class114 {

    @OriginalMember(owner = "client!fk", name = "M", descriptor = "Lia;")
    public static class257 field2238 = class28.method234(-83, "leuchten3:");

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "Lia;")
    private static class257 field2234 = class28.method234(-102, "Close");

    @OriginalMember(owner = "client!fk", name = "Q", descriptor = "Lia;")
    public static class257 field2242 = class28.method234(100, ")2");

    @OriginalMember(owner = "client!fk", name = "P", descriptor = "[I")
    public static int[] field2241 = new int[1000];

    @OriginalMember(owner = "client!fk", name = "U", descriptor = "I")
    public static int field2246 = 0;

    @OriginalMember(owner = "client!fk", name = "R", descriptor = "Lia;")
    public static class257 field2243 = field2234;

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
    public int field2237;

    @OriginalMember(owner = "client!fk", name = "N", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!fk", name = "O", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!fk", name = "T", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!fk", name = "V", descriptor = "I")
    private int field2247;

    @OriginalMember(owner = "client!fk", name = "X", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "Lk;")
    public static class152 field2232;

    @OriginalMember(owner = "client!fk", name = "W", descriptor = "Lia;")
    public class257 field2248;

    @OriginalMember(owner = "client!fk", name = "S", descriptor = "Lme;")
    public static class44 field2244;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)V")
    public static final void method868(int arg0, int arg1, int arg2) {
        class202 var3 = class222.method1466(1, -67, arg0);
        field2239++;
        if (arg1 <= 37) {
            field2238 = null;
        }
        var3.method1354(97);
        var3.field3450 = arg2;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)Z")
    public final boolean method869(boolean arg0) {
        field2240++;
        if (arg0) {
            return this.field2247 == 115;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILmb;)V")
    public static final void method870(int arg0, class178 arg1) {
        field2235++;
        class50.field1109 = arg1.method1211(class119.field2154, (byte) -118);
        class203.field3495 = arg1.method1211(class81.field1584, (byte) -123);
        class248.field4293 = arg1.method1211(class145.field2532, (byte) -54);
        class55.field1173 = arg1.method1211(class205.field3511, (byte) -121);
        class96.field1809 = arg1.method1211(class185.field3224, (byte) -99);
        class229.field3846 = arg1.method1211(class181.field3151, (byte) -120);
        class64.field1300 = arg1.method1211(class133.field2379, (byte) -74);
        class44.field1031 = arg1.method1211(class19.field403, (byte) -99);
        class213.field3640 = arg1.method1211(class53.field1140, (byte) -119);
        class152.field2642 = arg1.method1211(class31.field600, (byte) -63);
        class85.field1664 = arg1.method1211(class258.field4487, (byte) -109);
        class32.field614 = arg1.method1211(class157.field2752, (byte) -95);
        class9.field178 = arg1.method1211(class74.field1435, (byte) -116);
        class216.field3660 = arg1.method1211(class249.field4296, (byte) -102);
        class178.field3082 = arg1.method1211(class36.field719, (byte) -101);
        class204.field3505 = arg1.method1211(class204.field3506, (byte) -72);
        int var2 = 93 % ((37 - arg0) / 60);
        arg1.method1211(class154.field2689, (byte) -60);
        class161.field2827 = arg1.method1211(class222.field3757, (byte) -80);
        client.field1532 = arg1.method1211(class33.field651, (byte) -111);
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)V")
    public static void method871(int arg0) {
        field2238 = null;
        field2241 = null;
        field2242 = null;
        field2234 = null;
        if (arg0 != -21786) {
            method868(62, 74, -23);
        }
        field2243 = null;
        field2232 = null;
        field2244 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILk;)V")
    private final void method872(int arg0, int arg1, class152 arg2) {
        field2233++;
        if (arg1 != 7562) {
            return;
        }
        if (arg0 == 1) {
            this.field2247 = arg2.method1051((byte) -42);
        } else if (arg0 == 2) {
            this.field2237 = arg2.method1042(117);
            return;
        } else if (arg0 == 5) {
            this.field2248 = arg2.method1039(1995);
            return;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZLk;)V")
    public final void method873(boolean arg0, class152 arg1) {
        if (!arg0) {
            method870(-46, (class178) null);
        }
        field2245++;
        while (true) {
            int var3 = arg1.method1051((byte) -63);
            if (var3 == 0) {
                return;
            }
            this.method872(var3, 7562, arg1);
        }
    }
}
