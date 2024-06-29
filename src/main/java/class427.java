import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class427 {

    @OriginalMember(owner = "client!is", name = "j", descriptor = "Lh;")
    private class571 field6066 = new class571(64);

    @OriginalMember(owner = "client!is", name = "l", descriptor = "Lh;")
    public class571 field6068 = new class571(2);

    @OriginalMember(owner = "client!is", name = "f", descriptor = "Lan;")
    private class21 field6062;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "Lan;")
    public class21 field6059;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "[[Z")
    public static boolean[][] field6057 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!is", name = "i", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6065;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "Lha;")
    public static class52 field6061;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(II)Lth;")
    public final class513 method2537(int arg0, int arg1) {
        field6063++;
        class571 var3 = this.field6066;
        class513 var4;
        synchronized (this.field6066) {
            var4 = (class513) this.field6066.method3252((long) arg0, (byte) -119);
        }
        if (var4 != null) {
            return var4;
        }
        class21 var5 = this.field6062;
        byte[] var6;
        synchronized (this.field6062) {
            var6 = this.field6062.method240(33, arg0, (byte) -124);
        }
        class513 var7 = new class513();
        var7.field7221 = this;
        if (var6 != null) {
            var7.method2970(new class11(var6), false);
        }
        class571 var8 = this.field6066;
        synchronized (this.field6066) {
            if (arg1 == 1) {
                this.field6066.method3243(var7, (long) arg0, -99);
                return var7;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(III)Z")
    public static final boolean method2538(int arg0, int arg1, int arg2) {
        int var3 = class277.field3830[arg0][arg1][arg2];
        if (-class439.field6235 == var3) {
            return false;
        } else if (class439.field6235 == var3) {
            return true;
        } else {
            int var4 = arg1 << class272.field3786;
            int var5 = arg2 << class272.field3786;
            if (class239.method1492(var4 + 1, class590.field8430[arg0].method1104(arg1, arg2), var5 + 1) && class239.method1492(class41.field808 + var4 - 1, class590.field8430[arg0].method1104(arg1 + 1, arg2), var5 + 1) && class239.method1492(class41.field808 + var4 - 1, class590.field8430[arg0].method1104(arg1 + 1, arg2 + 1), class41.field808 + var5 - 1) && class239.method1492(var4 + 1, class590.field8430[arg0].method1104(arg1, arg2 + 1), class41.field808 + var5 - 1) && class239.method1492(class194.field2745 + var4, class590.field8430[arg0].method1104(arg1, arg2), var5 + 1) && class239.method1492(class41.field808 + var4 - 1, class590.field8430[arg0].method1104(arg1 + 1, arg2), class194.field2745 + var5) && class239.method1492(class194.field2745 + var4, class590.field8430[arg0].method1104(arg1, arg2 + 1), class41.field808 + var5 - 1) && class239.method1492(class41.field808 + var4 - 1, class590.field8430[arg0].method1104(arg1, arg2), class194.field2745 + var5) && class239.method1492(class194.field2745 + var4, class590.field8430[arg0].method1104(arg1, arg2), class194.field2745 + var5)) {
                class277.field3830[arg0][arg1][arg2] = class439.field6235;
                return true;
            } else {
                class277.field3830[arg0][arg1][arg2] = -class439.field6235;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
    public final void method2539(int arg0) {
        if (arg0 <= 84) {
            this.field6059 = null;
        }
        field6058++;
        class571 var2 = this.field6066;
        synchronized (this.field6066) {
            this.field6066.method3248(0);
        }
        class571 var3 = this.field6068;
        synchronized (this.field6068) {
            this.field6068.method3248(0);
        }
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(II)V")
    public final void method2540(int arg0, int arg1) {
        class571 var3 = this.field6066;
        synchronized (this.field6066) {
            this.field6066.method3253(arg1, -119);
            int var4 = 1 / ((arg0 - 59) / 41);
        }
        field6064++;
        class571 var5 = this.field6068;
        synchronized (this.field6068) {
            this.field6068.method3253(arg1, -123);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(B)V")
    public final void method2541(byte arg0) {
        field6060++;
        class571 var2 = this.field6066;
        synchronized (this.field6066) {
            this.field6066.method3246(false);
        }
        class571 var3 = this.field6068;
        synchronized (this.field6068) {
            if (arg0 == -120) {
                this.field6068.method3246(false);
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(B)V")
    public static void method2542(byte arg0) {
        field6057 = null;
        field6065 = null;
        if (arg0 != 3) {
            field6067 = -93;
        }
        field6061 = null;
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lhu;ILan;Lan;)V")
    public class427(class111 arg0, int arg1, class21 arg2, class21 arg3) {
        this.field6062 = arg2;
        this.field6059 = arg3;
        this.field6062.method231(33, -118);
    }

    static {
        new class104("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field6065 = new Rectangle[100];
        field6067 = -1;
    }
}
