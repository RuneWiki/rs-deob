import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class90 extends class85 {

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "Lot;")
    public class165 field1252;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "Lit;")
    public class388 field1256;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "Lgp;")
    public static class459 field1255 = new class459(13, 18);

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "Lgp;")
    public static class459 field1257 = new class459(6, 2);

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "Lvg;")
    public static class55 field1259 = new class55("RC", 1);

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
    public int field1248;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    public int field1250;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    public int field1253;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
    public int field1254;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
    public int field1258;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)Z")
    public static final boolean method621(int arg0, int arg1, int arg2) {
        if (arg2 >= -127) {
            method623((byte) 52);
        }
        field1251++;
        return class365.method2144((byte) 57, arg0, arg1) || class363.method2135(arg1, 16383, arg0);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()V")
    public static final void method622() {
        for (int var0 = 0; var0 < class171.field2218; var0++) {
            class448 var1 = class179.field2305[var0];
            class122.method779(var1);
            class179.field2305[var0] = null;
        }
        class171.field2218 = 0;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(B)V")
    public static void method623(byte arg0) {
        field1255 = null;
        field1257 = null;
        if (arg0 >= 51) {
            field1259 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(B)V")
    public static final void method624(byte arg0) {
        if (class441.field6150 != 3) {
            class375.field4875 = -1;
        }
        if (arg0 < 94) {
            field1259 = null;
        }
        field1247++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public final void method625(int arg0) {
        field1249++;
        this.field1254 = this.field1252.field2130;
        this.field1253 = this.field1252.field2138;
        this.field1250 = this.field1252.field2137;
        if (this.field1252.field2134 != null) {
            this.field1252.field2134.method980(this.field1256.field5087, this.field1256.field5097, this.field1256.field5079, class398.field5294);
        }
        this.field1258 = class398.field5294[0];
        this.field1248 = class398.field5294[2];
        if (arg0 > -34) {
            method622();
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lot;Lwp;)V")
    public class90(class165 arg0, class330 arg1) {
        this.field1252 = arg0;
        this.field1256 = this.field1252.method1096(2);
        this.method625(-49);
    }
}
