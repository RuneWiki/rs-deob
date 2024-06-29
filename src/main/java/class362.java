import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class362 {

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5163 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Ldp;")
    public static class174 field5159;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)I")
    public abstract int method2317(int arg0, int arg1);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)V")
    public static final void method2318(byte arg0, int arg1) {
        if (arg0 != 28) {
            field5159 = null;
        }
        field5164++;
        class221 var2 = class447.method2795(10, (byte) -49, arg1);
        var2.method1689(-65);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)V")
    public abstract void method2319(int arg0, byte arg1);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)Ll;")
    public abstract class260 method2320(int arg0);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lwk;")
    public static final class428 method2321(Throwable arg0, String arg1) {
        field5162++;
        class428 var2;
        if ((arg0 instanceof class428)) {
            var2 = (class428) arg0;
            var2.field6201 = var2.field6201 + ' ' + arg1;
        } else {
            var2 = new class428(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)[B")
    public abstract byte[] method2322(int arg0, int arg1);

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
    public static void method2323(int arg0) {
        field5163 = null;
        field5159 = null;
        if (arg0 != -31902) {
            method2321((Throwable) null, (String) null);
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public static final void method2324(int arg0) {
        if (arg0 != 32) {
            field5163 = null;
        }
        field5158++;
        class18 var1 = class398.field5858;
        synchronized (class398.field5858) {
            class398.field5858.method106((byte) -110);
        }
    }
}
