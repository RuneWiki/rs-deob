import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public abstract class class32 {

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "[I")
    public static int[] field249 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "[Ljava/awt/Color;")
    public static Color[] field250 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Lvj;")
    public static class373 field252 = new class373(53, 6);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "[I")
    public static int[] field251;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)Lvaa;")
    public abstract class397 method183(byte arg0);

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V")
    public static void method184(byte arg0) {
        field249 = null;
        if (arg0 < 74) {
            method184((byte) -125);
        }
        field251 = null;
        field252 = null;
        field250 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Z")
    public abstract boolean method185(int arg0, int arg1);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BII)V")
    public static final void method186(byte arg0, int arg1, int arg2) {
        field248++;
        class557 var3 = class93.method564(13, -14073, arg2);
        var3.method3257(1948);
        if (arg0 <= 116) {
            field249 = null;
        }
        var3.field8207 = arg1;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)V")
    public abstract void method187(byte arg0);

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(B)V")
    public abstract void method188(byte arg0);
}
