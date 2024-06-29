import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class286 extends class23 {

    @OriginalMember(owner = "client!l", name = "bb", descriptor = "I")
    public static int field4816 = -1;

    @OriginalMember(owner = "client!l", name = "cb", descriptor = "Lqd;")
    public static class40 field4817 = class147.method1106("(R", (byte) -120);

    @OriginalMember(owner = "client!l", name = "Y", descriptor = "Lqd;")
    public static class40 field4813 = class147.method1106(" zuerst von Ihrer Ignorieren)2Liste(Q", (byte) -102);

    @OriginalMember(owner = "client!l", name = "db", descriptor = "[B")
    public static byte[] field4818 = new byte[32896];

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!l", name = "ab", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!l", name = "fb", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!l", name = "gb", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!l", name = "hb", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!l", name = "eb", descriptor = "[I")
    public static int[] field4819;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V", line = 10)
    public static void method1987(int arg0) {
        field4813 = null;
        field4818 = null;
        if (arg0 > -38) {
            method1990(-109, -68, 34);
        }
        field4817 = null;
        field4819 = null;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V", line = 31)
    public static final void method1988(boolean arg0) {
        field4822++;
        class177.field2920.method1347(0);
        if (!arg0) {
            method1989(23, 61, 106, -12, false, 5);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)[I", line = 44)
    public final int[] method32(byte arg0, int arg1) {
        field4820++;
        if (arg0 != -94) {
            field4819 = (int[]) null;
        }
        int[] var3 = this.field403.method724((byte) 127, arg1);
        if (this.field403.field1760) {
            class234.method1625(var3, 0, class52.field1007, class150.field2509[arg1]);
        }
        return var3;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field4818[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZI)V", line = 72)
    public static final void method1989(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var6 = arg3;
        if (arg4) {
            method1988(true);
        }
        while (arg1 >= var6) {
            class150.method1124(arg5, arg0, arg2, true, class37.field694[var6]);
            var6++;
        }
        field4814++;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(III)V", line = 91)
    public static final void method1990(int arg0, int arg1, int arg2) {
        class55.field1070 = true;
        class116.field1989 = arg0;
        class76.field1308 = arg1;
        class106.field1863 = arg2;
        class42.field801 = -1;
        class294.field4936 = -1;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V", line = 102)
    public class286() {
        super(0, true);
    }
}
