import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class219 extends class115 {

    @OriginalMember(owner = "client!cs", name = "p", descriptor = "I")
    public int field3137 = -1;

    @OriginalMember(owner = "client!cs", name = "q", descriptor = "Z")
    public boolean field3138 = false;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "Lro;")
    public static class126 field3131 = new class126();

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "[S")
    public static short[] field3133 = new short[256];

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "I")
    public static int field3135 = 0;

    @OriginalMember(owner = "client!cs", name = "s", descriptor = "Lfs;")
    public static class288 field3140 = new class288(16);

    @OriginalMember(owner = "client!cs", name = "v", descriptor = "I")
    public static int field3143 = -1;

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "I")
    public int field3130;

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
    public int field3132;

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "I")
    public int field3134;

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!cs", name = "r", descriptor = "I")
    public int field3139;

    @OriginalMember(owner = "client!cs", name = "t", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!cs", name = "u", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!cs", name = "w", descriptor = "I")
    public int field3144;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(B)V")
    public static void method1382(byte arg0) {
        if (arg0 > -84) {
            method1382((byte) -95);
        }
        field3133 = null;
        field3140 = null;
        field3131 = null;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)Z")
    public static final boolean method1383(int arg0, int arg1) {
        if (arg1 < 4) {
            field3135 = 26;
        }
        field3141++;
        if (arg0 == 8 || arg0 == 30 || arg0 == 12 || arg0 == 44 || arg0 == 50) {
            return true;
        } else {
            return arg0 == 15 || arg0 == 1009;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IB)V")
    public static final void method1384(int arg0, byte arg1) {
        int var2 = 117 % ((arg1 - 66) / 36);
        class38.method314(false);
        field3136++;
        int var3 = class233.field3279.method215(-123, arg0).field7341;
        if (var3 == 0) {
            return;
        }
        int var4 = class307.field4619.field2120[arg0];
        if (var3 == 6) {
            class352.field5425 = var4;
        }
        if (var3 == 5) {
            class301.field4483 = var4;
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(I)V")
    public class219(int arg0) {
        this.field3137 = arg0;
    }
}
