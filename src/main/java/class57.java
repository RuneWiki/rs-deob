import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class57 {

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public static int field760 = 0;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "Z")
    public static volatile boolean field758 = false;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "[[I")
    public static int[][] field752 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "[J")
    public static long[] field765;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "Z")
    public static boolean field768;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public int field754;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public int field757;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    private int field759;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "Lbl;")
    public static class211 field751;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "Ltc;")
    public static class396 field763;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lef;IB)V")
    public final void method323(class385 arg0, int arg1, byte arg2) {
        while (true) {
            int var4 = arg0.method2343(255);
            if (var4 == 0) {
                field761++;
                int var5 = -37 % ((57 - arg2) / 49);
                return;
            }
            this.method326(true, arg0, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
    public static void method324(byte arg0) {
        field763 = null;
        if (arg0 >= -121) {
            method324((byte) -116);
        }
        field765 = null;
        field752 = null;
        field751 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)Lck;")
    public final class4 method325(int arg0) {
        if (arg0 != -7702) {
            field767 = 7;
        }
        field762++;
        class4 var2 = (class4) class87.field1234.method1491((long) this.field759, 0);
        if (var2 != null) {
            return var2;
        }
        class4 var3 = class4.method36(class99.field1368, this.field759, 0);
        if (var3 != null) {
            class87.field1234.method1488(arg0 ^ 0xFFFFE16A, (long) this.field759, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZLef;II)V")
    private final void method326(boolean arg0, class385 arg1, int arg2, int arg3) {
        if (!arg0) {
            this.method326(true, (class385) null, -24, -44);
        }
        field756++;
        if (arg2 == 1) {
            this.field759 = arg1.method2323(-27);
        } else if (arg2 == 2) {
            this.field754 = arg1.method2343(255);
            this.field757 = arg1.method2343(255);
            return;
        }
    }

    static {
        new class151("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field767 = 0;
        field765 = new long[32];
        field768 = true;
        field764 = -1;
    }
}
