import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class63 extends class184 {

    @OriginalMember(owner = "client!de", name = "H", descriptor = "I")
    public int field1017;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "I")
    public int field1018;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "I")
    public int field1013;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public int field1007;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "[I")
    public static int[] field1011 = new int[1000];

    @OriginalMember(owner = "client!de", name = "G", descriptor = "Lsf;")
    public static class108 field1016 = class140.method973(255, "");

    @OriginalMember(owner = "client!de", name = "E", descriptor = "Lsf;")
    public static class108 field1014 = field1016;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "Lsf;")
    public static class108 field1009 = field1016;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "Lcd;")
    public static class69 field1008 = new class69(64);

    @OriginalMember(owner = "client!de", name = "J", descriptor = "Lsf;")
    public static class108 field1019 = class140.method973(255, ")3");

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    public static int field1020 = 0;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIII)V", line = 10)
    public static final void method436(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class166.field2984 = arg2;
        field1005++;
        class79.field1202 = arg1;
        if (arg3 != 4672) {
            field1009 = (class108) null;
        }
        class266.field4677 = arg4;
        class260.field4593 = arg0;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)V", line = 24)
    public static final void method437(boolean arg0) {
        if (arg0) {
            return;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class191.field3476[var1] = false;
        }
        field1021 = 1;
        class10.field128 = -1;
        field1006++;
        class98.field1637 = -1;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)Z", line = 57)
    public final boolean method438(int arg0, int arg1, int arg2) {
        if (arg2 != -2967) {
            method436(68, 69, -60, -26, -89);
        }
        field1010++;
        return arg0 >= this.field1013 && arg0 <= this.field1018 && arg1 >= this.field1017 && this.field1007 >= arg1;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(IIII)V", line = 84)
    public class63(int arg0, int arg1, int arg2, int arg3) {
        this.field1017 = arg1;
        this.field1018 = arg2;
        this.field1013 = arg0;
        this.field1007 = arg3;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V", line = 108)
    public static void method439(int arg0) {
        if (arg0 != 1) {
            field1019 = (class108) null;
        }
        field1019 = null;
        field1016 = null;
        field1014 = null;
        field1011 = null;
        field1009 = null;
        field1008 = null;
    }
}
