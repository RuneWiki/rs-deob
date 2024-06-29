import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class class214 {

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3060 = null;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Lgj;")
    public static class593 field3063 = new class593();

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "Lob;")
    public static class691 field3067 = new class691();

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Lsba;")
    public static class204 field3059;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "[[B")
    public static byte[][] field3061;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 3)
    public static void method1368(int arg0) {
        field3059 = null;
        field3063 = null;
        field3061 = null;
        field3060 = null;
        if (arg0 > 108) {
            field3067 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 29)
    public static final void method1370(int arg0) {
        field3066++;
        class613.method3353(101, (long) class642.field8626, class10.field197);
        if (class251.field3463 != -1) {
            class397.method2279(class251.field3463, 2);
        }
        int var1 = 0 / ((44 - arg0) / 57);
        for (int var2 = 0; var2 < class172.field2661; var2++) {
            if (class511.field6834[var2]) {
                class209.field2994[var2] = true;
            }
            class87.field1313[var2] = class511.field6834[var2];
            class511.field6834[var2] = false;
        }
        class546.field7285 = class642.field8626;
        if (class10.field197.method396()) {
            class703.field9904 = true;
        }
        if (class251.field3463 != -1) {
            class172.field2661 = 0;
            class415.method2376(0);
        }
        class10.field197.method435();
        class639.method3525((byte) 121, class10.field197);
        int var3 = class221.method1396((byte) 81);
        if (var3 == -1) {
            var3 = class428.field5883;
        }
        if (var3 == -1) {
            var3 = class587.field7786;
        }
        class16.method169(var3, -1);
        class104.field1561 = 0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)I", line = 88)
    public static final int method1371(int arg0, int arg1, int arg2, int arg3) {
        field3064++;
        if (arg2 == arg3) {
            return arg3;
        }
        int var4 = 128 - arg0;
        int var5 = (arg2 & 0x7F) * arg0 + (arg3 & 0x7F) * var4 >> 7;
        int var6 = (arg3 & 0x380) * var4 + ((arg2 & 0x380) * arg0) >> 7;
        if (arg1 <= 75) {
            return -55;
        } else {
            int var7 = (arg2 & 0xFC00) * arg0 + (arg3 & 0xFC00) * var4 >> 7;
            return var5 & 0x7F | var6 & 0x380 | var7 & 0xFC00;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lhba;B)Lhba;")
    public abstract class10 method1369(class10 arg0, byte arg1);
}
