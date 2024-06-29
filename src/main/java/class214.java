import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class214 extends class95 {

    @OriginalMember(owner = "client!fp", name = "F", descriptor = "Ljava/lang/Object;")
    private Object field3389;

    @OriginalMember(owner = "client!fp", name = "K", descriptor = "[[I")
    public static int[][] field3394 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!fp", name = "G", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!fp", name = "H", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!fp", name = "I", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!fp", name = "L", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!fp", name = "M", descriptor = "Ljf;")
    public static class146 field3396;

    @OriginalMember(owner = "client!fp", name = "J", descriptor = "[[B")
    public static byte[][] field3393;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(I)Z", line = 4)
    public final boolean method855(int arg0) {
        field3392++;
        return arg0 != 8639;
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lws;Ljava/lang/Object;I)V", line = 15)
    public class214(class241 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field3389 = arg1;
    }

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "(B)V", line = 25)
    public static void method1444(byte arg0) {
        field3393 = null;
        field3396 = null;
        if (arg0 != -44) {
            field3394 = null;
        }
        field3394 = null;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 38)
    public static final boolean method1445(String arg0, int arg1) {
        field3390++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class513.field7453; var2++) {
            if (arg0.equalsIgnoreCase(class330.field5008[var2])) {
                return true;
            }
        }
        int var3 = 82 % ((61 - arg1) / 59);
        return arg0.equalsIgnoreCase(class15.field266.field5381);
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 69)
    public final Object method854(int arg0) {
        field3391++;
        if (arg0 != 0) {
            this.method855(-27);
        }
        return this.field3389;
    }
}
