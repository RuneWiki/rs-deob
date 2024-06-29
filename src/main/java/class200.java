import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class200 {

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "[I")
    public static int[] field3453 = new int[2];

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field3454 = 0;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Lqe;")
    public static class168 field3455 = class66.method448(":assistreq:", -122);

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "[[I")
    public static int[][] field3456 = new int[104][104];

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "Lqe;")
    public static class168 field3449 = class66.method448(":duelstake:", -121);

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "Lrd;")
    public static class207 field3452;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lgj;B)V")
    public static final void method1277(class239 arg0, byte arg1) {
        field3451++;
        class20 var2 = null;
        try {
            class5 var3 = arg0.method1556("runescape", (byte) 83);
            while (var3.field57 == 0) {
                class38.method259(1L, arg1 ^ 0x7BBA);
            }
            if (var3.field57 == 1) {
                var2 = (class20) var3.field59;
                class112 var4 = class233.method1506(126);
                var2.method103((byte) 1, 0, var4.field1821, var4.field1780);
            }
            if (arg1 != 38) {
                field3454 = 78;
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method104(-109);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public static final void method1278(byte arg0) {
        if (arg0 != 89) {
            method1279(72);
        }
        field3450++;
        for (int var1 = 0; var1 < 100; var1++) {
            class194.field3372[var1] = true;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static void method1279(int arg0) {
        field3449 = null;
        field3456 = null;
        field3452 = null;
        if (arg0 != 11201) {
            field3456 = null;
        }
        field3455 = null;
        field3453 = null;
    }
}
