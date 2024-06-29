import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class58 {

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "Z")
    public boolean field1227 = true;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    public int field1235;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
    public int field1237;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public int field1232;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public int field1234;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public int field1229;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
    public int field1238;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "[I")
    public static int[] field1228 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "Lia;")
    public static class257 field1230 = class28.method234(91, "k");

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "[I")
    public static int[] field1233 = new int[2000];

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "Lba;")
    public static class211 field1231;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "[I")
    public static int[] field1236;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public static void method442(int arg0) {
        field1233 = null;
        field1230 = null;
        if (arg0 == 14169) {
            field1228 = null;
            field1231 = null;
            field1236 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1235 = arg3;
        this.field1237 = arg5;
        this.field1232 = arg0;
        this.field1234 = arg1;
        this.field1227 = arg6;
        this.field1229 = arg2;
        this.field1238 = arg4;
    }
}
