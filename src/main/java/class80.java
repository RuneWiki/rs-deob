import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public abstract class class80 {

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "Ljava/lang/String;")
    public static String field895;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(B)V")
    public abstract void method612(byte arg0);

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V")
    public static void method613(int arg0) {
        field895 = null;
        if (arg0 != -6) {
            field895 = null;
        }
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)V")
    public static final void method614(int arg0) {
        field894++;
        if (!class13.field255) {
            return;
        }
        if (arg0 != 0) {
            method618(47, (byte) -74, 30);
        }
        while (true) {
            while (class548.field7879 < class386.field5355.length) {
                class204 var1 = class386.field5355[class548.field7879];
                if (var1 != null && var1.field3173 == -1) {
                    if (class212.field3297 == null) {
                        class212.field3297 = class173.field2683.method2931(var1.field3169, -109);
                    }
                    int var2 = class212.field3297.field10565;
                    if (var2 == -1) {
                        return;
                    }
                    var1.field3173 = var2;
                    class548.field7879++;
                    class212.field3297 = null;
                } else {
                    class548.field7879++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(B[BII)V")
    public abstract void method615(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(II)Z")
    public abstract boolean method616(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(II)Z")
    public static final boolean method617(int arg0, int arg1) {
        if (arg0 > -20) {
            return false;
        } else {
            field892++;
            return arg1 == 3 || arg1 == 5 || arg1 == 6;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IBI)V")
    public static final void method618(int arg0, byte arg1, int arg2) {
        if (arg1 != 7) {
            field895 = null;
        }
        field893++;
        class313 var3 = class312.method1998((long) arg0, 17, arg1 - 8);
        var3.method2001((byte) 86);
        var3.field4464 = arg2;
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(B)V")
    public abstract void method619(byte arg0);

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(II[BI)I")
    public abstract int method620(int arg0, int arg1, byte[] arg2, int arg3) throws IOException;
}
