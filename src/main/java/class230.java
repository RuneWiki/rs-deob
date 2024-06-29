import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class230 {

    @OriginalMember(owner = "client!or", name = "b", descriptor = "I")
    public int field2976 = -1;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "I")
    public int field2975 = -1;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "Leba;")
    public static class550 field2979 = new class550(93, 8);

    @OriginalMember(owner = "client!or", name = "g", descriptor = "Luf;")
    public static class380 field2981 = new class380(4);

    @OriginalMember(owner = "client!or", name = "h", descriptor = "I")
    public static int field2982 = 1;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "[I")
    public int[] field2978;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(II)I", line = 3)
    public static final int method1423(int arg0, int arg1) {
        return class582.field7958 == null ? 0 : class582.field7958[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILio;B)V", line = 6)
    private final void method1424(int arg0, class157 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field2976 = arg1.method963(-126);
        } else if (arg0 == 2) {
            this.field2978 = new int[arg1.method930(255)];
            for (int var4 = 0; var4 < this.field2978.length; var4++) {
                this.field2978[var4] = arg1.method963(-126);
            }
        } else if (arg0 == 3) {
            this.field2975 = arg1.method930(255);
        }
        if (arg2 > 105) {
            field2980++;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILio;)V", line = 40)
    public final void method1425(int arg0, class157 arg1) {
        if (arg0 != -1) {
            return;
        }
        field2977++;
        while (true) {
            int var3 = arg1.method930(255);
            if (var3 == 0) {
                return;
            }
            this.method1424(var3, arg1, (byte) 114);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V", line = 65)
    public static void method1426(int arg0) {
        if (arg0 < -92) {
            field2979 = null;
            field2981 = null;
        }
    }
}
