import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class83 {

    @OriginalMember(owner = "client!el", name = "b", descriptor = "Lok;")
    public static class41 field1205 = class137.method956("Benutzeroberfl-=che geladen)3", 45);

    @OriginalMember(owner = "client!el", name = "g", descriptor = "Lok;")
    public static class41 field1210 = class137.method956("blinken2:", 45);

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public int field1206;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public int field1207;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public int field1209;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 11)
    public static void method586(int arg0) {
        field1205 = null;
        field1210 = null;
        if (arg0 != 0) {
            field1205 = (class41) null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)V", line = 25)
    public static final void method587(int arg0, int arg1) {
        field1208++;
        if (arg0 == -1 || !class32.method223(arg0, 255)) {
            return;
        }
        class302[] var2 = class273.field4446[arg0];
        int var3 = 0;
        if (arg1 != 8981) {
            field1210 = (class41) null;
        }
        while (var3 < var2.length) {
            class302 var4 = var2[var3];
            if (var4.field4948 != null) {
                class73 var5 = new class73();
                var5.field1079 = var4;
                var5.field1083 = var4.field4948;
                class9.method36(2000000, true, var5);
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)I", line = 74)
    public static final int method588(int arg0, int arg1, int arg2) {
        field1211++;
        class306 var3 = (class306) class186.field3031.method617((long) arg0, false);
        if (arg2 >= -122) {
            method587(-28, -19);
        }
        if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var3.field5125.length) {
            return var3.field5125[arg1];
        } else {
            return -1;
        }
    }
}
