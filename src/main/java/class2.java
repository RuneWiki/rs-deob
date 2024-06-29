import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class2 extends class176 {

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "I")
    public static int field20 = 0;

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "Lob;")
    public static class141 field22 = class175.method1195(40, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "Lob;")
    public static class141 field25 = class175.method1195(40, "document)3cookie=(R");

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "I")
    public static int field28 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
    public static int field27 = 0;

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)V")
    public static void method9(int arg0) {
        field22 = null;
        if (arg0 != 128) {
            method9(52);
        }
        field25 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)I")
    public static final int method11(byte arg0, int arg1) {
        if (arg0 != 39) {
            method12((byte) 109, 24, 78, null, -68, -101);
        }
        field18++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BIILfc;II)V")
    public static final void method12(byte arg0, int arg1, int arg2, class54 arg3, int arg4, int arg5) {
        field23++;
        class165 var6 = new class165();
        var6.field3191 = arg3.field1064 * 128;
        var6.field3180 = arg3.field1054;
        var6.field3195 = arg3.field1068;
        var6.field3182 = arg2;
        var6.field3194 = arg5 * 128;
        var6.field3201 = arg1 * 128;
        var6.field3183 = arg3.field1074;
        if (arg0 < 123) {
            method9(-8);
        }
        var6.field3188 = arg3.field1059;
        int var7 = arg3.field1079;
        int var8 = arg3.field1073;
        if (arg4 == 1 || arg4 == 3) {
            var7 = arg3.field1073;
            var8 = arg3.field1079;
        }
        var6.field3193 = (arg5 + var7) * 128;
        var6.field3181 = (arg1 + var8) * 128;
        if (arg3.field1024 != null) {
            var6.field3189 = arg3;
            var6.method1140(0);
        }
        class210.field3994.method1098(0, var6);
        if (var6.field3180 != null) {
            var6.field3196 = var6.field3195 + (int) (Math.random() * (double) (var6.field3188 - var6.field3195));
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Laa;IIIZ)V")
    public void method13(class2 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field19++;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(III)Laa;")
    public class2 method14(int arg0, int arg1, int arg2) {
        field21++;
        return this;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()Z")
    public boolean method15() {
        field24++;
        return false;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "()I")
    public abstract int method16();
}
