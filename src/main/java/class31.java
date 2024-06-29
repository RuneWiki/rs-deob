import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class31 {

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    private int field430 = 0;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "Lsi;")
    private class237 field429;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "[[Z")
    public static boolean[][] field432 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "B")
    public static byte field437;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "Lei;")
    private class68 field433;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "[I")
    public static int[] field427;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "[Z")
    public static boolean[] field434;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)Lei;", line = 5)
    public final class68 method148(int arg0) {
        field435++;
        if (this.field430 > 0 && this.field429.field3998[this.field430 - 1] != this.field433) {
            class68 var2 = this.field433;
            this.field433 = var2.field1129;
            return var2;
        }
        int var3 = 4 / ((17 - arg0) / 48);
        class68 var4;
        do {
            if (this.field429.field3990 <= this.field430) {
                return null;
            }
            var4 = this.field429.field3998[this.field430++].field1129;
        } while (this.field429.field3998[this.field430 - 1] == var4);
        this.field433 = var4.field1129;
        return var4;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)Leg;", line = 42)
    public static final class40 method149(int arg0, int arg1) {
        field431++;
        class40 var2 = (class40) class232.field3924.method303((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class160.field2901.method2173(arg0, arg1, (byte) -76);
        class40 var4 = new class40();
        if (var3 != null) {
            var4.method252(128, new class134(var3));
        }
        class232.field3924.method308(var4, (long) arg1, (byte) 125);
        return var4;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)Lei;", line = 63)
    public final class68 method150(byte arg0) {
        field426++;
        if (arg0 < 19) {
            return (class68) null;
        } else {
            this.field430 = 0;
            return this.method148(-63);
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V", line = 75)
    public static void method151(byte arg0) {
        if (arg0 != 80) {
            method149(24, -38);
        }
        field427 = null;
        field434 = null;
        field432 = (boolean[][]) null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 107)
    public static final void method152(int arg0, Component arg1) {
        field436++;
        arg1.addMouseListener(class294.field4879);
        arg1.addMouseMotionListener(class294.field4879);
        if (arg0 != 1) {
            field434 = (boolean[]) null;
        }
        arg1.addFocusListener(class294.field4879);
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lsi;)V", line = 141)
    public class31(class237 arg0) {
        this.field429 = arg0;
    }
}
