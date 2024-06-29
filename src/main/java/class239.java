import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class239 {

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3941 = "Loaded update list";

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field3944 = null;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Z")
    public static boolean field3945 = false;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "[[I")
    public static int[][] field3943;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZZ)V")
    public static final void method1682(boolean arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        byte[][] var2 = class281.field4451;
        field3946++;
        int var3 = class121.field1713.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class86.field1056[var4] >> 8) * 64 - class167.field2683;
                int var7 = (class86.field1056[var4] & 0xFF) * 64 - class181.field2883;
                class51.method294((byte) -127);
                class144.method995(2, var7, var6, arg0, class187.field2975, var5);
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)I")
    public static final int method1683(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method1684(int arg0) {
        field3941 = null;
        if (arg0 < 3) {
            method1685(125);
        }
        field3944 = null;
        field3943 = null;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)Lnf;")
    public static final class227 method1685(int arg0) {
        field3940++;
        byte[] var1 = class293.field4645[0];
        int var2 = class172.field2726[0] * class103.field1387[0];
        int[] var3 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class172.field2729[class173.method1186(var1[var4], 255)];
        }
        int var5 = -66 % ((arg0 - 52) / 35);
        class227 var6 = new class227(class286.field4562, class245.field4018, class40.field493[0], class129.field2072[0], class103.field1387[0], class172.field2726[0], var3);
        class24.method135(-99);
        return var6;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
    public static final void method1686(int arg0) {
        int var1 = -121 / ((38 - arg0) / 58);
        field3947++;
        class161.field2566.method1699(0);
        class118.field1677.method1699(0);
        class235.field3879.method1699(0);
    }
}
