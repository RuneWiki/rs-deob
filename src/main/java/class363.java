import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public abstract class class363 {

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "Lod;")
    public class349 field5564;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "Lwt;")
    public static class202 field5567;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field5569;

    static {
        new class475("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field5567 = new class202("", 17);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLoq;)V", line = 3)
    public static final void method2261(byte arg0, class239 arg1) {
        int var2 = -19 % ((-arg0 - 51) / 62);
        field5566++;
        class404 var3 = (class404) class164.field2414.method2605(false, (long) arg1.field1942);
        if (var3 == null) {
            class102.method624(null, arg1, 0, arg1.field1996[0], null, (byte) 19, arg1.field1997[0], arg1.field1768);
        } else {
            var3.method2434(-1);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V", line = 21)
    public static void method2262(int arg0) {
        field5567 = null;
        if (arg0 <= 4) {
            field5567 = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 33)
    public static final void method2263(String arg0, byte arg1) {
        field5565++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class14.method93(arg0, 3841);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (arg1 != -52) {
            method2261((byte) 125, null);
        }
        while (class61.field927 > var3) {
            String var4 = class3.field41[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class14.method93(var4, 3841);
            if (var5 != null && var5.equals(var2)) {
                class61.field927--;
                for (int var6 = var3; var6 < class61.field927; var6++) {
                    class3.field41[var6] = class3.field41[var6 + 1];
                    class359.field5515[var6] = class359.field5515[var6 + 1];
                    class231.field3446[var6] = class231.field3446[var6 + 1];
                    class338.field4750[var6] = class338.field4750[var6 + 1];
                    class431.field6440[var6] = class431.field6440[var6 + 1];
                }
                class83.field1285++;
                class447.field6663 = class99.field1453;
                class291.method1861((byte) -104, class357.field5485);
                class356.field5471.method1410(class456.method2739((byte) 5, arg0), -27645);
                class356.field5471.method1418(true, arg0);
                return;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lod;)V", line = 105)
    public class363(class349 arg0) {
        this.field5564 = arg0;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZI)V")
    public abstract void method125(boolean arg0, int arg1);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZB)V")
    public abstract void method122(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljk;IB)V")
    public abstract void method121(class446 arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)V")
    public abstract void method120(boolean arg0);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(III)V")
    public abstract void method128(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)Z")
    public abstract boolean method126(int arg0);
}
