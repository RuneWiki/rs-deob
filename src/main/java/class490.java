import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class490 extends class623 {

    @OriginalMember(owner = "client!mw", name = "v", descriptor = "I")
    public static int field6981;

    @OriginalMember(owner = "client!mw", name = "w", descriptor = "I")
    public static int field6982;

    @OriginalMember(owner = "client!mw", name = "x", descriptor = "I")
    public static int field6983;

    @OriginalMember(owner = "client!mw", name = "y", descriptor = "I")
    public static int field6984;

    @OriginalMember(owner = "client!mw", name = "A", descriptor = "I")
    public static int field6986;

    @OriginalMember(owner = "client!mw", name = "z", descriptor = "Lpfa;")
    private class295 field6985;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;", line = 3)
    public final String method2944(int arg0, int arg1, String arg2) {
        field6981++;
        if (this.field6985 == null) {
            return arg2;
        }
        class551 var4 = (class551) this.field6985.method1754(false, (long) arg1);
        if (arg0 <= 53) {
            this.field6985 = null;
        }
        return var4 == null ? arg2 : var4.field7910;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lig;ZI)V", line = 23)
    private final void method2945(class244 arg0, boolean arg1, int arg2) {
        field6986++;
        if (arg1) {
            this.field6985 = null;
        }
        if (arg2 != 249) {
            return;
        }
        int var4 = arg0.method1423(-14);
        if (this.field6985 == null) {
            int var5 = class756.method4202(!arg1, var4);
            this.field6985 = new class295(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg0.method1423(-82) == 1;
            int var8 = arg0.method1458((byte) 114);
            class134 var9;
            if (var7) {
                var9 = new class551(arg0.method1468(-1468860088));
            } else {
                var9 = new class716(arg0.method1438(123));
            }
            this.field6985.method1751(var9, 3970, (long) var8);
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(III)I", line = 71)
    public final int method2946(int arg0, int arg1, int arg2) {
        field6982++;
        if (this.field6985 == null) {
            return arg0;
        }
        class716 var4 = (class716) this.field6985.method1754(false, (long) arg1);
        if (var4 == null) {
            return arg0;
        } else {
            if (arg2 != -12214) {
                this.method2944(25, -54, null);
            }
            return var4.field10054;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lig;I)V", line = 94)
    public final void method2947(class244 arg0, int arg1) {
        if (arg1 != 9014) {
            return;
        }
        field6983++;
        while (true) {
            int var3 = arg0.method1423(-44);
            if (var3 == 0) {
                return;
            }
            this.method2945(arg0, false, var3);
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(BLjava/lang/String;I)V", line = 115)
    public static final void method2948(byte arg0, String arg1, int arg2) {
        if (arg0 == -55) {
            class74.method536(arg1, "", arg2, 0, (byte) -95, "", "");
            field6984++;
        }
    }
}
