import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class276 extends OutputStream {

    @OriginalMember(owner = "client!no", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field3995 = null;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "I")
    public static int field3998 = -1;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "I")
    public static int field3999 = 0;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4000 = "";

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "Llm;")
    public static class347 field3991;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V")
    public static final void method1900(byte arg0) {
        class300.field4397 = null;
        class447.field6559 = null;
        field3997++;
        class115.field1606 = null;
        int var1 = 27 / (arg0 / 44);
        class229.field3066 = null;
        class169.field2269 = null;
        class61.field802 = null;
        class422.field6218 = null;
        class313.field4582 = null;
    }

    @OriginalMember(owner = "client!no", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field3996++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)V")
    public static final void method1901(boolean arg0) {
        field3993++;
        int[] var1 = new int[class16.field220];
        int var2 = 0;
        if (arg0) {
            method1901(true);
        }
        for (int var3 = 0; var3 < class16.field220; var3++) {
            class83 var5 = class9.method74(var3, (byte) -115);
            if (var5.field1145 >= 0 || var5.field1185 >= 0) {
                var1[var2++] = var3;
            }
        }
        class288.field4157 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class288.field4157[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(Z)V")
    public static final void method1902(boolean arg0) {
        if (!arg0) {
            method1902(true);
        }
        if (class445.field6523 != null) {
            class236 var1 = class445.field6523;
            synchronized (class445.field6523) {
                class445.field6523 = null;
            }
        }
        field3990++;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
    public static void method1903(int arg0) {
        if (arg0 != -1) {
            field3999 = -19;
        }
        field3991 = null;
        field4000 = null;
        field3995 = null;
    }
}
