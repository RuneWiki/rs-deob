import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class18 {

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "Z")
    public static boolean field189 = false;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Ljava/lang/String;")
    public static String field190 = "";

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field192 = 0;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static final void method108(int arg0) {
        field187++;
        int[] var1 = new int[class556.field7917.field1228];
        int var2 = 0;
        for (int var3 = 0; var3 < class556.field7917.field1228; var3++) {
            class688 var5 = class556.field7917.method741(126, var3);
            if (var5.field9746 >= 0 || var5.field9703 >= 0) {
                var1[var2++] = var3;
            }
        }
        if (arg0 > 103) {
            class317.field4742 = new int[var2];
            for (int var4 = 0; var4 < var2; var4++) {
                class317.field4742[var4] = var1[var4];
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)J")
    public static final synchronized long method109(int arg0) {
        field191++;
        if (arg0 != -11121) {
            return -88L;
        }
        long var1 = System.currentTimeMillis();
        if (var1 < class453.field6591) {
            class40.field710 += class453.field6591 - var1;
        }
        class453.field6591 = var1;
        return class40.field710 + var1;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V")
    public static void method110(int arg0) {
        if (arg0 != -27940) {
            method110(-101);
        }
        field190 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)I")
    public static final int method111(byte arg0, int arg1) {
        if (arg0 != 53) {
            method111((byte) 38, 6);
        }
        field188++;
        return arg1 & 0xFF;
    }
}
