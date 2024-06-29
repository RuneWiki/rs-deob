import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class310 extends class149 {

    @OriginalMember(owner = "client!vv", name = "J", descriptor = "Lpg;")
    public static class492 field4639 = new class492(34, -2);

    @OriginalMember(owner = "client!vv", name = "I", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!vv", name = "K", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!vv", name = "L", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!vv", name = "M", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!vv", name = "O", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!vv", name = "N", descriptor = "[[B")
    public static byte[][] field4643;

    static {
        new class375("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
    }

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "(I)V", line = 4)
    public static void method1993(int arg0) {
        int var1 = 41 % ((arg0 - 17) / 48);
        field4639 = null;
        field4643 = null;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(BI[Ljb;)V", line = 26)
    public static final void method1994(byte arg0, int arg1, class499[] arg2) {
        if (arg0 <= 32) {
            method1994((byte) 48, -15, null);
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class499 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field7355 == 0) {
                    if (var4.field7423 != null) {
                        method1994((byte) 111, arg1, var4.field7423);
                    }
                    class407 var5 = (class407) class27.field449.method943((long) var4.field7312, -1);
                    if (var5 != null) {
                        class336.method2169(var5.field6155, 22590, arg1);
                    }
                }
                if (arg1 == 0 && var4.field7347 != null) {
                    class199 var6 = new class199();
                    var6.field2813 = var4.field7347;
                    var6.field2817 = var4;
                    class291.method1886(var6);
                }
                if (arg1 == 1 && var4.field7296 != null) {
                    if (var4.field7304 >= 0) {
                        class499 var7 = class211.method1457(var4.field7312, 6687);
                        if (var7 == null || var7.field7423 == null || var7.field7423.length <= var4.field7304 || var7.field7423[var4.field7304] != var4) {
                            continue;
                        }
                    }
                    class199 var8 = new class199();
                    var8.field2813 = var4.field7296;
                    var8.field2817 = var4;
                    class291.method1886(var8);
                }
            }
        }
        field4642++;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(ZI)V", line = 98)
    public static final void method1995(boolean arg0, int arg1) {
        class249.method1637(71);
        field4641++;
        class76.method501((byte) 125);
        class353.method2230((byte) 114, true, arg1);
        class520.method3096(class119.field1677, class113.field1576, class337.field5242, (byte) 104);
        class488.method2911(class337.field5242, class113.field1576, 0);
        class509.method3035(class41.field635, -12168);
        class220.method1493(arg0);
        class268.method1710(arg0);
        if (class144.field2077 == 10) {
            class152.method995(false, (byte) -92);
        } else if (class144.field2077 == 30) {
            class524.method3106(25, (byte) 62);
        } else if (class144.field2077 == 5) {
            class529.method3124(class113.field1576, (byte) 116, class337.field5242);
        }
    }

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "(III)Z", line = 125)
    public static final boolean method1996(int arg0, int arg1, int arg2) {
        field4638++;
        if (arg1 <= 32) {
            field4643 = null;
        }
        return (arg0 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "()V", line = 136)
    public class310() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)[I", line = 140)
    public final int[] method92(int arg0, int arg1) {
        if (arg0 != -10835) {
            field4643 = null;
        }
        field4644++;
        return class197.field2791;
    }
}
