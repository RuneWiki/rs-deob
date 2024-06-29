import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class65 {

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "Leda;")
    public static class14 field1041 = new class14(8);

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "J")
    public long field1039;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "Lds;")
    public class65 field1042;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "Lds;")
    public class65 field1044;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(I)V", line = 5)
    public static final void method635(int arg0) {
        field1040++;
        int var1 = class472.field6857;
        int[] var2 = class96.field1419;
        if (arg0 < 10) {
            method638(22, -62);
        }
        for (int var3 = 0; var3 < var1; var3++) {
            class573 var4 = class279.field4271[var2[var3]];
            if (var4 != null) {
                class23.method124(95, var4.method878(-5740), var4);
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(B)V", line = 34)
    public final void method636(byte arg0) {
        field1037++;
        if (this.field1042 == null) {
            return;
        }
        this.field1042.field1044 = this.field1044;
        this.field1044.field1042 = this.field1042;
        if (arg0 != 97) {
            this.field1039 = 17L;
        }
        this.field1042 = null;
        this.field1044 = null;
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(B)Z", line = 51)
    public final boolean method637(byte arg0) {
        field1038++;
        if (arg0 != 115) {
            this.method637((byte) 61);
        }
        return this.field1042 != null;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)Lraa;", line = 76)
    public static final class353 method638(int arg0, int arg1) {
        field1043++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (arg1 != 1668949296) {
            field1041 = null;
        }
        if (class158.field2453[var2] == null || class158.field2453[var2][var3] == null) {
            boolean var4 = class118.method934(var2, 110);
            if (!var4) {
                return null;
            }
        }
        return class158.field2453[var2][var3];
    }

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(B)V", line = 101)
    public static void method639(byte arg0) {
        field1041 = null;
        if (arg0 != 30) {
            method638(-102, -105);
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(II)Z", line = 111)
    public static final boolean method640(int arg0, int arg1) {
        if (arg1 != 31754) {
            method640(100, 126);
        }
        field1045++;
        return arg0 == 3 || arg0 == 5 || arg0 == 6;
    }

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "(I)V", line = 126)
    public static final void method641(int arg0) {
        field1036++;
        if (class372.field5643 != null) {
            if (class372.field5643.field2512 == 1) {
                class372.field5643 = null;
                return;
            }
            if (class372.field5643.field2512 == 2) {
                class569.method3300(class304.field4629, 91, 2, class733.field10316);
                class372.field5643 = null;
                return;
            }
        }
        if (arg0 != 2) {
            method639((byte) 1);
        }
    }
}
