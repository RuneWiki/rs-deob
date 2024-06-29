import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class211 {

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "[I")
    public static int[] field2979 = new int[1];

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "Ldea;")
    public static class205 field2971 = new class205(8);

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "B")
    public byte field2968;

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "B")
    public byte field2972;

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "B")
    public byte field2973;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "B")
    public byte field2975;

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "B")
    public byte field2980;

    @OriginalMember(owner = "client!sr", name = "u", descriptor = "B")
    public byte field2984;

    @OriginalMember(owner = "client!sr", name = "w", descriptor = "B")
    public byte field2986;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public int field2966;

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "I")
    public int field2978;

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "S")
    public short field2967;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "Z")
    public boolean field2964;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "Z")
    public boolean field2965;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "Z")
    public boolean field2969;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "Z")
    public boolean field2970;

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "Z")
    public boolean field2974;

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "Z")
    public boolean field2977;

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "Z")
    public boolean field2982;

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "Z")
    public boolean field2983;

    @OriginalMember(owner = "client!sr", name = "v", descriptor = "Z")
    public boolean field2985;

    @OriginalMember(owner = "client!sr", name = "x", descriptor = "Z")
    public boolean field2987;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)I")
    public static final int method1383(int arg0, int arg1, int arg2) {
        if (arg0 >= -110) {
            method1383(-71, -76, 109);
        }
        field2981++;
        int var3 = arg1 >>> 24;
        int var4 = 255 - var3;
        int var5 = ((arg1 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg1 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        return (((arg2 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg2 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V")
    public static void method1384(byte arg0) {
        field2979 = null;
        if (arg0 != -84) {
            method1385((byte) 107, 116);
        }
        field2971 = null;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BI)V")
    public static final void method1385(byte arg0, int arg1) {
        if (arg0 != 14) {
            return;
        }
        if (class112.field1726 == 0) {
            class218.field3105.method3488((byte) 119, arg1);
        } else {
            class47.field903 = arg1;
        }
        field2976++;
    }
}
