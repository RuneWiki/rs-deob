import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 extends class88 {

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "[I")
    public static int[] field52 = new int[32];

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "Ltd;")
    private static class136 field51 = class145.method1172(" has logged in)3", 45);

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "Ltd;")
    public static class136 field54 = class145.method1172(")4l", 45);

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    public static int field48 = 0;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
    public static int field62 = 500;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "Ltd;")
    public static class136 field65 = field51;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "Ltd;")
    public static class136 field64 = class145.method1172("Fallen lassen", 45);

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "Ltd;")
    public static class136 field56 = class145.method1172(" zuerst von Ihrer Ignorieren)2Liste(Q", 45);

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "B")
    public byte field58;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
    public int field61;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "Ltd;")
    public class136 field57;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "Lcd;")
    public static class19 field60;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "[I")
    public static int[] field50;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "[I")
    public static int[] field59;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLmd;Lmd;Z)V")
    public static final void method19(byte arg0, class87 arg1, class87 arg2, boolean arg3) {
        field53++;
        int var4 = -52 % ((-arg0 - 49) / 56);
        class19.field379 = arg1;
        class71.field1486 = arg2;
        class37.field856 = arg3;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)I")
    public static final int method20(int arg0, int arg1) {
        int var7 = arg0 - 1;
        field49++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        if (arg1 != 500) {
            method22(null, (byte) -50);
        }
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)V")
    public static void method21(boolean arg0) {
        field65 = null;
        field51 = null;
        if (arg0) {
            field51 = null;
        }
        field64 = null;
        field59 = null;
        field54 = null;
        field56 = null;
        field52 = null;
        field50 = null;
        field60 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ltd;B)I")
    public static final int method22(class136 arg0, byte arg1) {
        field55++;
        if (class54.field1194 == 1) {
            return 7;
        } else if (arg0.method1120(class33.field751, 0)) {
            return 1;
        } else if (arg0.method1120(class44.field1012, 0)) {
            return 1;
        } else if (arg0.method1120(class94.field2199, 0)) {
            return 2;
        } else if (arg0.method1120(class78.field1793, 0)) {
            return 2;
        } else if (arg0.method1120(class35.field822, 0)) {
            return 3;
        } else if (arg0.method1120(class81.field1928, 0)) {
            return 4;
        } else if (arg0.method1120(class121.field2768, 0)) {
            return 4;
        } else {
            if (arg1 <= 19) {
                method20(-33, 124);
            }
            if (arg0.method1120(class99.field2396, 0)) {
                return 5;
            } else if (arg0.method1120(class61.field1302, 0)) {
                return 6;
            } else {
                return 0;
            }
        }
    }
}
