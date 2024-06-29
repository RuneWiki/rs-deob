import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class468 {

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "[Leea;")
    private class112[] field6537 = null;

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "[Leea;")
    public class112[] field6541 = null;

    @OriginalMember(owner = "client!lba", name = "i", descriptor = "Law;")
    public class65 field6545 = null;

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "Z")
    public boolean field6540;

    @OriginalMember(owner = "client!lba", name = "h", descriptor = "[I")
    public static int[] field6544 = new int[4096];

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "[Z")
    public static boolean[] field6543 = new boolean[100];

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "Lcea;")
    public static class180 field6539 = new class180("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!lba", name = "j", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!lba", name = "k", descriptor = "Lbj;")
    public static class201 field6547;

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(Lbda;)V", line = 62)
    public class468(class428 arg0) {
        this.field6540 = arg0.field5739;
        if (this.field6540 && !arg0.method1845((byte) 111, class127.field1570, class160.field1932)) {
            this.field6540 = false;
        }
        if (this.field6540 || arg0.method1805(-94, class160.field1932, class127.field1570)) {
            class41.method217(false);
            if (this.field6540) {
                byte[] var6 = class258.method1451(false, class24.field172, 15);
                this.field6545 = arg0.method1790(class127.field1570, 16, 128, 128, var6, true);
                byte[] var7 = class258.method1451(false, class557.field8215, 15);
                arg0.method1790(class127.field1570, 16, 128, 128, var7, true);
            } else {
                this.field6541 = new class112[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class167.method928(class24.field172, 32768, var2 * 128 * 128 * 2, -104);
                    this.field6541[var2] = arg0.method2477(128, var5, 0, true, class127.field1570, 128);
                }
                this.field6537 = new class112[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class167.method928(class557.field8215, 32768, var3 * 16384 * 2, -104);
                    this.field6537[var3] = arg0.method2477(128, var4, 0, true, class127.field1570, 128);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V", line = 21)
    public static void method2728(int arg0) {
        field6543 = null;
        if (arg0 > -94) {
            field6543 = null;
        }
        field6539 = null;
        field6544 = null;
        field6547 = null;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Z)Z", line = 38)
    public final boolean method2729(boolean arg0) {
        if (arg0) {
            this.method2729(true);
        }
        field6538++;
        if (this.field6540) {
            return this.field6545 != null;
        } else {
            return this.field6541 != null;
        }
    }
}
