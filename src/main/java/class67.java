import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class67 extends class47 {

    @OriginalMember(owner = "client!g", name = "J", descriptor = "I")
    private final int field1116;

    @OriginalMember(owner = "client!g", name = "I", descriptor = "I")
    private final int field1115;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "I")
    private final int field1104;

    @OriginalMember(owner = "client!g", name = "H", descriptor = "I")
    private final int field1114;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "Lmb;")
    public static class132 field1109 = class166.method1092("auf der Hautpseite)3", 120);

    @OriginalMember(owner = "client!g", name = "F", descriptor = "Lmb;")
    public static class132 field1112 = class166.method1092("leuchten2:", 114);

    @OriginalMember(owner = "client!g", name = "G", descriptor = "[I")
    public static int[] field1113 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!g", name = "w", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!g", name = "E", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!g", name = "K", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "[[B")
    public static byte[][] field1106;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IBI)V")
    public final void method318(int arg0, byte arg1, int arg2) {
        ++field1108;
        if (arg1 < 29) {
            field1113 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(JB)V")
    public static final void method415(long arg0, byte arg1) {
        ++field1110;
        if (arg0 != 0L) {
            if (~class138.field2596 <= -101) {
                class169.method1108(arg1 ^ -123, class164.field2958, 0, class75.field1247);
            } else {
                class132 var3 = class164.method1057((byte) 11, arg0).method900(0);
                int var4 = 0;
                if (arg1 == 111) {
                    while (class138.field2596 > var4) {
                        if (class178.field3282[var4] == arg0) {
                            class169.method1108(-107, class187.method1197(new class132[] { var3, class84.field1468 }, -120), 0, class75.field1247);
                            return;
                        }
                        ++var4;
                    }
                    for (int var5 = 0; client.field537 > var5; ++var5) {
                        if (class137.field2575[var5] == arg0) {
                            class169.method1108(arg1 ^ -62, class187.method1197(new class132[] { class65.field1082, var3, class220.field4013 }, -112), 0, class75.field1247);
                            return;
                        }
                    }
                    if (var3.method894((byte) -87, class210.field3854.field2877)) {
                        class169.method1108(-91, class22.field314, 0, class75.field1247);
                    } else {
                        ++class115.field2200;
                        class178.field3282[class138.field2596] = arg0;
                        class94.field1651[class138.field2596++] = class164.method1057((byte) 11, arg0);
                        class113.field2183 = class13.field167;
                        class64.field1054.method660(90, 3);
                        class64.field1054.method709(-27341, arg0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
    public static void method416(byte arg0) {
        field1109 = null;
        if (arg0 == 40) {
            field1113 = null;
            field1106 = null;
            field1112 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IZI)V")
    public final void method310(int arg0, boolean arg1, int arg2) {
        ++field1103;
        int var4 = this.field1116 * arg0 >> 12;
        int var5 = this.field1114 * arg2 >> 12;
        int var6 = this.field1104 * arg0 >> 12;
        int var7 = this.field1115 * arg2 >> 12;
        class183.method1173(var4, (byte) -107, var7, var6, super.field817, var5);
        if (!arg1) {
            field1107 = -1;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(IIIIII)V")
    public class67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1116 = arg0;
        this.field1115 = arg3;
        this.field1104 = arg2;
        this.field1114 = arg1;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Ldf;")
    public static final class40 method417(int arg0, int arg1) {
        ++field1117;
        class40 var2 = (class40) class158.field2863.method777(-1, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class110.field2069.method1079(arg0, 105, arg1);
            class40 var4 = new class40();
            if (var3 != null) {
                var4.method279((byte) -106, arg1, new class112(var3));
            }
            class158.field2863.method774((long) arg1, var4, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)V")
    public final void method313(int arg0, int arg1, int arg2) {
        if (arg2 == 1832079585) {
            ++field1105;
        }
    }
}
