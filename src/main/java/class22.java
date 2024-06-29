import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public abstract class class22 {

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field287 = 0;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field289 = -1;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field286 = 2;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Ltf;")
    public static class244 field284;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "[[B")
    public static byte[][] field285;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method14(int arg0, Component arg1);

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static void method119(int arg0) {
        field284 = null;
        if (arg0 < 98) {
            method121(92, -38);
        }
        field285 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)Lod;")
    public static final class24 method120(byte arg0, int arg1) {
        class24 var2 = (class24) class282.field4583.method1517((long) arg1, (byte) -120);
        field282++;
        if (arg0 != -51) {
            field289 = 97;
        }
        if (var2 != null) {
            return var2;
        }
        class24 var3 = class134.method845(false, class186.field2930, class159.field2381, arg1, -25101);
        if (var3 != null) {
            class282.field4583.method1518(var3, (long) arg1, (byte) 75);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)I")
    public abstract int method15(int arg0);

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)I")
    public static final int method121(int arg0, int arg1) {
        field283++;
        int var2 = -17 % ((5 - arg1) / 49);
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)I")
    public static final int method122(int arg0) {
        if (arg0 != 0) {
            method122(-33);
        }
        field290++;
        return 2;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method16(int arg0, Component arg1);
}
