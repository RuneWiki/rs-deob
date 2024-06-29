import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class class9 {

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "[I")
    public static int[] field119 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "Ltj;")
    public static class108 field120;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "[I")
    public static int[] field124;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "[[Z")
    public static boolean[][] field125;

    static {
        new class349("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)Z", line = 5)
    public static final boolean method47(byte arg0) {
        int var1 = -53 % ((arg0 + 59) / 51);
        field118++;
        if (class264.field3879) {
            try {
                if ((Boolean) class348.method2282((byte) -93, "showingVideoAd", class401.field5628.field3154)) {
                    return false;
                }
                return true;
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 23)
    public static void method48(int arg0) {
        if (arg0 != 10) {
            field117 = 122;
        }
        field120 = null;
        field125 = null;
        field124 = null;
        field119 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BZ)V", line = 36)
    public static final void method49(byte arg0, boolean arg1) {
        if (arg0 > -39) {
            field120 = null;
        }
        if (arg1) {
            if (class265.field3898 != -1) {
                class248.method1729(103, class265.field3898);
            }
            for (class253 var2 = (class253) class318.field4662.method1383(118); var2 != null; var2 = (class253) class318.field4662.method1378((byte) 98)) {
                if (!var2.method2662((byte) 116)) {
                    var2 = (class253) class318.field4662.method1383(-63);
                    if (var2 == null) {
                        break;
                    }
                }
                class102.method596(true, true, var2, false);
            }
            class265.field3898 = -1;
            class318.field4662 = new class191(8);
            class209.method1484(true);
            class265.field3898 = class126.field1704;
            class378.method2411((byte) 90, false);
            class158.method1152(-116);
            class424.method2657(class265.field3898);
        }
        field122++;
        class168.method1204((byte) 124);
        class385.field5451 = -1;
        class63.method404(class2.field14, -62);
        class181.field2555 = new class128();
        class181.field2555.field4595[0] = 52;
        class181.field2555.field4463 = 6656;
        class181.field2555.field4466 = 6656;
        class181.field2555.field4601[0] = 52;
        class417.field5999 = 0;
        class386.field5469 = 0;
        if (class336.field4878 == 2) {
            class386.field5469 = class120.field1620 << 7;
            class417.field5999 = class96.field1234 << 7;
        } else {
            class266.method1823(true);
        }
        class349.method2289((byte) -80);
        if (class386.field5469 == 0 || class417.field5999 == 0) {
            class390.method2463(10, true);
        } else {
            class137.method1048(true);
            class390.method2463(28, true);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V", line = 115)
    public static final void method52(int arg0, int arg1) {
        field116++;
        class254.field3762 = arg1;
        if (arg0 == -30542) {
            class15 var2 = class245.field3656;
            synchronized (class245.field3656) {
                class245.field3656.method102((byte) -109);
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method50(byte arg0, Component arg1);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)I")
    public abstract int method51(boolean arg0);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method53(Component arg0, int arg1);
}
