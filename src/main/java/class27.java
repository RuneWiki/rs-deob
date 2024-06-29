import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class class27 {

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public int field424;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public int field423;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "Ljava/lang/String;")
    public static String field430 = "Loading fonts - ";

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "Laf;")
    public static class68 field433 = new class68(500);

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "Lqh;")
    public static class201 field429;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "Lqh;")
    public static class201 field435;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "[[B")
    public static byte[][] field426;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBI)V")
    public abstract void method234(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BZ)V")
    public static final void method235(byte arg0, boolean arg1) {
        if (arg0 != 16) {
            return;
        }
        field431++;
        for (class97 var2 = (class97) class247.field3937.method843(arg0 ^ 0xFFFFFFA9); var2 != null; var2 = (class97) class247.field3937.method852((byte) 123)) {
            if (var2.field1596 != null) {
                class195.field3123.method1707(var2.field1596);
                var2.field1596 = null;
            }
            if (var2.field1595 != null) {
                class195.field3123.method1707(var2.field1595);
                var2.field1595 = null;
            }
            var2.method1388(arg0 + 87);
        }
        if (!arg1) {
            return;
        }
        for (class97 var3 = (class97) class263.field4188.method843(118); var3 != null; var3 = (class97) class263.field4188.method852((byte) 123)) {
            if (var3.field1596 != null) {
                class195.field3123.method1707(var3.field1596);
                var3.field1596 = null;
            }
            var3.method1388(86);
        }
        for (class97 var4 = (class97) class220.field3593.method1404(103); var4 != null; var4 = (class97) class220.field3593.method1412(-76)) {
            if (var4.field1596 != null) {
                class195.field3123.method1707(var4.field1596);
                var4.field1596 = null;
            }
            var4.method1388(-100);
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(III)V")
    public class27(int arg0, int arg1, int arg2) {
        this.field424 = arg2;
        this.field427 = arg0;
        this.field423 = arg1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIB)V")
    public abstract void method236(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static void method237(byte arg0) {
        if (arg0 >= -21) {
            field433 = null;
        }
        field435 = null;
        field433 = null;
        field430 = null;
        field429 = null;
        field426 = null;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(IBI)V")
    public abstract void method238(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static final void method239(int arg0) {
        class96.field1569.method472((byte) -63);
        class15.field260.method472((byte) -63);
        field428++;
        if (arg0 != 500) {
            field433 = null;
        }
    }
}
