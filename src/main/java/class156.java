import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class156 {

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "[I")
    private int[] field2652;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Z")
    public static boolean field2651 = false;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field2657 = 2;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2655 = new CRC32();

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field2658 = -1;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "Lve;")
    public static class255 field2660 = class87.method607(125, "Hidden)2");

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field2659 = 0;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)I", line = 10)
    public final int method1149(int arg0, int arg1) {
        if (arg0 != 1) {
            return 54;
        }
        field2656++;
        int var3 = (this.field2652.length >> 1) - 1;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field2652[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2652[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "([I)V", line = 37)
    public class156(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field2652 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2652[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field2652[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field2652[var5 + var5] = arg0[var4];
            this.field2652[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 81)
    public static void method1150(int arg0) {
        field2660 = null;
        field2655 = null;
        if (arg0 != 5) {
            method1151((byte) -72, 86);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)V", line = 94)
    public static final void method1151(byte arg0, int arg1) {
        class264.method1842((byte) 111);
        if (arg0 != 7) {
            return;
        }
        field2653++;
        class47.method274(-29617);
        int var2 = class2.method10(arg1, arg0 + 9).field1721;
        if (var2 == 0) {
            return;
        }
        int var3 = class76.field1246[arg1];
        if (var2 == 5) {
            class195.field3220 = var3;
        }
        if (var2 == 6) {
            class260.field4414 = var3;
        }
        if (var2 == 9) {
            class218.field3691 = var3;
        }
    }
}
