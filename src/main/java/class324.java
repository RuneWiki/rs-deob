import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class324 {

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field4678 = 0;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "J")
    public long field4676;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "Luj;")
    public class324 field4677;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "Luj;")
    public class324 field4681;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "[Lkw;")
    public static class211[] field4682;

    static {
        new class474("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V", line = 14)
    public static void method2106(int arg0) {
        field4682 = null;
        if (arg0 != -3901) {
            method2107(125, 89, false);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIZ)V", line = 25)
    public static final void method2107(int arg0, int arg1, boolean arg2) {
        field4675++;
        class467 var3 = class541.method3144(0, (byte) -105, 15);
        if (!arg2) {
            var3.method2851(true);
            var3.field6926 = arg1;
            var3.field6930 = arg0;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V", line = 45)
    public final void method2108(boolean arg0) {
        if (!arg0) {
            this.method2109(37);
        }
        field4680++;
        if (this.field4677 != null) {
            this.field4677.field4681 = this.field4681;
            this.field4681.field4677 = this.field4677;
            this.field4677 = null;
            this.field4681 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)Z", line = 64)
    public final boolean method2109(int arg0) {
        field4679++;
        if (this.field4677 == null) {
            return false;
        } else {
            return arg0 == 11574;
        }
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)V", line = 89)
    public static final void method2110(int arg0) {
        if (arg0 != -23199) {
            method2107(6, -77, false);
        }
        field4683++;
        try {
            if (class568.field8160 == 1) {
                int var1 = class224.field3145.method2475((byte) -108);
                if (var1 > 0 && class224.field3145.method2473((byte) 67)) {
                    int var2 = var1 - class190.field2345;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class224.field3145.method2498(var2, 128);
                } else {
                    class224.field3145.method2491(8192);
                    class224.field3145.method2470((byte) -81);
                    class623.field9002 = null;
                    class271.field3805 = null;
                    if (class195.field2647 == null) {
                        class568.field8160 = 0;
                    } else {
                        class568.field8160 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class224.field3145.method2491(arg0 + 31391);
            class271.field3805 = null;
            class568.field8160 = 0;
            class623.field9002 = null;
            class195.field2647 = null;
        }
    }
}
