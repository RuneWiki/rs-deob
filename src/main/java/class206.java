import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class206 {

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "[Ljava/lang/String;")
    private String[] field2791;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Ls;")
    public static class169 field2790 = new class169(3, -1);

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Lmc;")
    public static class78 field2793 = new class78(3, 7);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Ljd;")
    public static class139 field2788;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Lrn;")
    public static class161 field2794;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lml;I)[Loi;")
    public static final class49[] method1174(class241 arg0, int arg1) {
        field2786++;
        if (!arg0.method1347(-8719)) {
            return new class49[0];
        } else if (arg1 <= 41) {
            return null;
        } else {
            class474 var2 = arg0.method1354((byte) 32);
            while (var2.field6534 == 0) {
                class374.method2298(-28114, 10L);
            }
            if (var2.field6534 == 2) {
                return new class49[0];
            }
            int[] var3 = (int[]) var2.field6529;
            class49[] var4 = new class49[var3.length >> 2];
            for (int var5 = 0; var5 < var4.length; var5++) {
                class49 var6 = new class49();
                var4[var5] = var6;
                var6.field651 = var3[var5 << 2];
                var6.field650 = var3[(var5 << 2) + 1];
                var6.field653 = var3[(var5 << 2) + 2];
                var6.field648 = var3[(var5 << 2) + 3];
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method1175(int arg0) {
        field2790 = null;
        field2788 = null;
        field2793 = null;
        field2794 = null;
        int var1 = -123 % ((arg0 + 73) / 43);
    }

    @OriginalMember(owner = "client!gd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2787++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public final String method1176(int arg0, byte arg1) {
        field2789++;
        if (arg1 >= -87) {
            field2790 = null;
        }
        return this.field2791[arg0];
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class206(String arg0, String arg1, String arg2, String arg3) {
        this.field2791 = new String[] { arg0, arg1, arg2, arg3 };
    }
}
