import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class120 {

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field1956 = 0;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "Lrk;")
    public static class270 field1957 = new class270(128);

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "[I")
    public static int[] field1959 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)I")
    public static final int method871(int arg0, int arg1) {
        field1960++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        if (arg1 != -621722364) {
            method871(87, -39);
        }
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method872(int arg0) {
        field1959 = null;
        if (arg0 != 0) {
            method873((String) null, (byte) -19);
        }
        field1957 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method873(String arg0, byte arg1) {
        field1955++;
        int var2 = class12.method90(arg0, 76);
        if (arg1 != -55) {
            method873((String) null, (byte) 77);
        }
        return var2 == -1 ? "" : class154.method1070("<br>", (byte) 55, class153.field2479.field266[var2], " ");
    }
}
