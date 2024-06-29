import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class314 {

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Lcea;")
    public static class180 field4005 = new class180("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "Lvj;")
    public static class373 field4006 = new class373(38, 8);

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "Lcea;")
    public static class180 field4008;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "F")
    public static float field4011;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static final void method1739(int arg0) {
        field4001++;
        if (class110.field1367 != null) {
            return;
        }
        Container var1;
        if (class431.field5843 == null) {
            var1 = class74.field873.field2014;
        } else {
            var1 = class431.field5843;
        }
        class7.field56 = var1.getSize().width;
        class202.field2423 = var1.getSize().height;
        if (class431.field5843 == var1) {
            Insets var2 = class431.field5843.getInsets();
            class202.field2423 -= var2.top + var2.bottom;
            class7.field56 -= var2.right + var2.left;
        }
        if (class99.method608(false) == 1) {
            class157.field1906 = (class7.field56 - class168.field2051) / 2;
            class185.field2239 = class168.field2051;
            class244.field3133 = 0;
            class426.field5495 = class381.field5050;
        } else if (class252.field3258 < 96 && class529.field7429 == 0) {
            int var3 = class7.field56 > 1024 ? 1024 : class7.field56;
            class157.field1906 = (class7.field56 - var3) / 2;
            class185.field2239 = var3;
            int var4 = class202.field2423 > 768 ? 768 : class202.field2423;
            class244.field3133 = 0;
            class426.field5495 = var4;
        } else {
            class157.field1906 = 0;
            class244.field3133 = 0;
            class426.field5495 = class202.field2423;
            class185.field2239 = class7.field56;
        }
        if (class507.field7033 != class36.field282) {
            boolean var10000;
            if (class185.field2239 < 1024 && class426.field5495 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class41.field331.setSize(class185.field2239, class426.field5495);
        if (class210.field2560 != null) {
            class210.field2560.method268(class41.field331);
        }
        if (class431.field5843 == var1) {
            Insets var5 = class431.field5843.getInsets();
            class41.field331.setLocation(var5.left + class157.field1906, var5.top - -class244.field3133);
        } else {
            class41.field331.setLocation(class157.field1906, class244.field3133);
        }
        if (class599.field8668 != -1) {
            class194.method1059(true, true);
        }
        if (arg0 != 2) {
            method1742((byte) 20, null, 38);
        }
        class416.method2373(0);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
    public static void method1740(byte arg0) {
        field4005 = null;
        field4006 = null;
        field4008 = null;
        if (arg0 != -107) {
            field4002 = -72;
        }
    }

    @OriginalMember(owner = "client!bk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4007++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)Lil;")
    public static final class7 method1741(int arg0, int arg1) {
        field4004++;
        if (arg1 <= 16) {
            field4006 = null;
        }
        class7[] var2 = class316.method1758(-13806);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class7 var4 = var2[var3];
            if (var4.field57 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLos;I)V")
    public static final void method1742(byte arg0, class374 arg1, int arg2) {
        if (class228.field2801 != null) {
            try {
                class228.field2801.method1218(0L, 0);
                class228.field2801.method1223(arg1.field4929, 24, (byte) -95, arg2);
            } catch (Exception var3) {
            }
        }
        field4000++;
        if (arg0 < 32) {
            method1739(-77);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)V")
    public static final void method1743(int arg0, int arg1, int arg2) {
        class349 var3 = class383.field5070[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field4507 != null) {
            var3.field4507 = null;
        }
        if (var3.field4498 != null) {
            var3.field4498 = null;
        }
    }

    static {
        new class180("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field4009 = -1;
        field4008 = new class180("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");
    }
}
