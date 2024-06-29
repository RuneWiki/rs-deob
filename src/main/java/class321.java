import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class321 extends class361 {

    @OriginalMember(owner = "client!gt", name = "y", descriptor = "Ltn;")
    public static class60 field4632 = new class60(11, 8);

    @OriginalMember(owner = "client!gt", name = "E", descriptor = "Lkn;")
    public static class530 field4636 = new class530(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!gt", name = "x", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!gt", name = "A", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!gt", name = "C", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!gt", name = "w", descriptor = "Lqi;")
    private class406 field4630;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V", line = 4)
    public static void method1932(byte arg0) {
        field4636 = null;
        if (arg0 <= 84) {
            field4636 = null;
        }
        field4632 = null;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILwm;B)V", line = 16)
    private final void method1933(int arg0, class403 arg1, byte arg2) {
        if (arg2 < 10) {
            this.method1933(-45, null, (byte) -27);
        }
        field4633++;
        if (arg0 != 249) {
            return;
        }
        int var4 = arg1.method2357((byte) 112);
        if (this.field4630 == null) {
            int var5 = class280.method1749(-31679, var4);
            this.field4630 = new class406(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg1.method2357((byte) 104) == 1;
            int var8 = arg1.method2323((byte) 109);
            class498 var9;
            if (var7) {
                var9 = new class74(arg1.method2356(-25178));
            } else {
                var9 = new class254(arg1.method2319((byte) 85));
            }
            this.field4630.method2413((long) var8, var9, -1);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IBLjava/lang/String;)Ljava/lang/String;", line = 64)
    public final String method1934(int arg0, byte arg1, String arg2) {
        field4634++;
        if (this.field4630 == null) {
            return arg2;
        }
        class74 var4 = (class74) this.field4630.method2405((long) arg0, -114);
        if (arg1 > -22) {
            return null;
        } else if (var4 == null) {
            return arg2;
        } else {
            return var4.field898;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIZ)I", line = 85)
    public final int method1935(int arg0, int arg1, boolean arg2) {
        field4631++;
        if (this.field4630 == null) {
            return arg0;
        }
        class254 var4 = (class254) this.field4630.method2405((long) arg1, -77);
        if (arg2) {
            return var4 == null ? arg0 : var4.field3757;
        } else {
            return 7;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lwm;B)V", line = 106)
    public final void method1936(class403 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2357((byte) 124);
            if (var3 == 0) {
                int var4 = 65 / ((arg1 - 53) / 40);
                field4635++;
                return;
            }
            this.method1933(var3, arg0, (byte) 26);
        }
    }
}
