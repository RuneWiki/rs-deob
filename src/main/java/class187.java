import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class187 extends class91 {

    @OriginalMember(owner = "client!nn", name = "r", descriptor = "Ldm;")
    public static class23 field3010 = new class23(0, 0);

    @OriginalMember(owner = "client!nn", name = "w", descriptor = "[S")
    public static short[] field3015 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!nn", name = "z", descriptor = "Z")
    public static boolean field3018 = true;

    @OriginalMember(owner = "client!nn", name = "q", descriptor = "I")
    public int field3009;

    @OriginalMember(owner = "client!nn", name = "s", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!nn", name = "x", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!nn", name = "y", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!nn", name = "A", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!nn", name = "t", descriptor = "Ljava/lang/String;")
    public String field3012;

    @OriginalMember(owner = "client!nn", name = "v", descriptor = "Ljava/lang/String;")
    public String field3014;

    @OriginalMember(owner = "client!nn", name = "u", descriptor = "[[[I")
    public static int[][][] field3013;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "(I)Lg;", line = 10)
    public final class68 method1374(int arg0) {
        field3016++;
        if (arg0 != 0) {
            field3013 = (int[][][]) ((int[][][]) null);
        }
        return class145.field2291[this.field1209];
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IBIII)V", line = 22)
    public static final void method1375(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class210.field3309 = arg3;
        class291.field4490 = arg0;
        field3019++;
        class42.field579 = arg2;
        int var5 = 41 / ((-arg1 - 17) / 32);
        class334.field5205 = arg4;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIII)V", line = 35)
    public static final void method1376(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class183.field2965.field111 = 0;
        class183.field2965.method81((byte) -105, 20);
        field3011++;
        class183.field2965.method81((byte) -100, arg4);
        class183.field2965.method81((byte) -126, arg3);
        class183.field2965.method65((byte) -9, arg2);
        class183.field2965.method65((byte) -9, arg1);
        class150.field2354 = -3;
        class2.field24 = 0;
        int var5 = -67 % ((arg0 + 79) / 34);
        class46.field605 = 0;
        class52.field665 = 1;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)V", line = 54)
    public static void method1377(boolean arg0) {
        field3010 = null;
        field3013 = (int[][][]) null;
        field3015 = null;
        if (arg0) {
            method1376(-72, -18, -42, 112, -5);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IILug;I)Lun;", line = 77)
    public static final class190 method1378(int arg0, int arg1, class253 arg2, int arg3) {
        field3017++;
        if (class287.method2029(arg2, arg0, 2, arg3)) {
            if (arg1 > -101) {
                field3018 = true;
            }
            return class183.method1339((byte) 109);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)I", line = 90)
    public static final int method1379(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }
}
