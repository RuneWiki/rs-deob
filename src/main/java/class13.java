import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class13 {

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public int field215 = 0;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Lpe;")
    public static class237 field207 = null;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "S")
    public static short field208 = 1;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "Leg;")
    public static class37 field210 = class174.method1167("K", 61);

    @OriginalMember(owner = "client!o", name = "i", descriptor = "[I")
    public static int[] field213 = new int[100];

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Ljl;")
    public static class101 field206;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public static void method96(byte arg0) {
        field206 = null;
        field213 = null;
        field210 = null;
        if (arg0 < 93) {
            method100(true, 18);
        }
        field207 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljl;I)V")
    public static final void method97(class101 arg0, int arg1) {
        field209++;
        if (arg1 != -1) {
            method97((class101) null, -41);
        }
        class88.field1384 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILva;I)V")
    private final void method98(int arg0, class187 arg1, int arg2) {
        field214++;
        if (arg0 == 5) {
            this.field215 = arg1.method1244(false);
        }
        if (arg2 > -126) {
            field213 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lva;I)V")
    public final void method99(class187 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1268(255);
            if (var3 == 0) {
                if (arg1 != -1) {
                    this.method98(-11, (class187) null, -95);
                }
                field211++;
                return;
            }
            this.method98(var3, arg0, -127);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)V")
    public static final void method100(boolean arg0, int arg1) {
        class82.field1291 = -1;
        field212++;
        if (!arg0) {
            return;
        }
        if (arg1 == 37) {
            class19.field252 = 3.0F;
        } else if (arg1 == 50) {
            class19.field252 = 4.0F;
        } else if (arg1 == 75) {
            class19.field252 = 6.0F;
        } else {
            class19.field252 = 8.0F;
        }
        class82.field1291 = -1;
    }
}
