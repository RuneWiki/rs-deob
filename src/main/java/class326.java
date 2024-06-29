import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class326 extends class446 {

    @OriginalMember(owner = "client!el", name = "z", descriptor = "I")
    public int field4456 = 0;

    @OriginalMember(owner = "client!el", name = "C", descriptor = "I")
    public static int field4459 = -1;

    @OriginalMember(owner = "client!el", name = "F", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!el", name = "A", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!el", name = "B", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!el", name = "D", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!el", name = "E", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "Lde;")
    public static class312 field4453;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIZ)Ljava/lang/String;")
    public static final String method2092(int arg0, int arg1, int arg2, boolean arg3) {
        field4457++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg3 && arg0 >= 0) {
            int var4 = 2;
            int var5 = arg0 / arg2;
            while (var5 != 0) {
                var5 /= arg2;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            if (arg1 != 918) {
                field4459 = -65;
            }
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg0;
                arg0 /= arg2;
                int var9 = var8 - (arg0 * arg2);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lkh;I)V")
    public final void method2093(class11 arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        while (true) {
            int var3 = arg0.method172((byte) 52);
            if (var3 == 0) {
                field4460++;
                return;
            }
            this.method2098(var3, -123, arg0);
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(III)Les;")
    public static final class214 method2094(int arg0, int arg1, int arg2) {
        class125 var3 = class328.field4549[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1740;
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(B)V")
    public static void method2095(byte arg0) {
        if (arg0 > -15) {
            method2095((byte) -113);
        }
        field4453 = null;
    }

    @OriginalMember(owner = "client!el", name = "e", descriptor = "(B)Z")
    public static final boolean method2096(byte arg0) {
        int var1 = -16 / ((arg0 - 78) / 40);
        field4458++;
        return class347.field4737 == 0 ? class314.field4303.method1353(25967) : true;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method2097(String arg0, boolean arg1) {
        System.out.println("Error: " + class292.method1890("%0a", arg0, (byte) -60, "\n"));
        if (!arg1) {
            field4454++;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IILkh;)V")
    private final void method2098(int arg0, int arg1, class11 arg2) {
        if (arg0 == 2) {
            this.field4456 = arg2.method174(255);
        }
        int var4 = 12 % ((34 - arg1) / 36);
        field4455++;
    }

    static {
        new class442("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field4462 = 0;
    }
}
