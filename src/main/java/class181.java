import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class181 extends class424 {

    @OriginalMember(owner = "client!km", name = "q", descriptor = "Ljava/lang/String;")
    public String field2232;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "[I")
    public static int[] field2231 = new int[4096];

    @OriginalMember(owner = "client!km", name = "r", descriptor = "[I")
    public static int[] field2233 = new int[8];

    @OriginalMember(owner = "client!km", name = "n", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!km", name = "s", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)I", line = 5)
    public static final int method1203(int arg0, int arg1) {
        field2234++;
        if (arg0 < 96) {
            return 0;
        } else {
            if (arg1 != 0) {
                method1206(35);
            }
            return arg0 < 128 ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BI)V", line = 24)
    public static final void method1204(byte arg0, int arg1) {
        class354.field4578 = new int[arg1];
        int var2 = 102 / ((arg0 - 28) / 47);
        class37.field544 = new int[arg1];
        class625.field8742 = new int[arg1];
        class457.field5991 = new int[arg1];
        field2230++;
        class505.field6644 = new int[arg1];
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)Z", line = 41)
    public static final boolean method1205(byte arg0) {
        field2229++;
        if (arg0 != -28) {
            field2233 = null;
        }
        return client.method709("jaclib", (byte) 95) ? client.method709("hw3d", (byte) 121) : false;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V", line = 58)
    public static void method1206(int arg0) {
        field2233 = null;
        field2231 = null;
        if (arg0 != 128) {
            method1204((byte) -35, -124);
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V", line = 68)
    public class181() {
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 70)
    public class181(String arg0) {
        this.field2232 = arg0;
    }
}
