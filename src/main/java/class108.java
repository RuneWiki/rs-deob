import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class108 implements class343 {

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "Ljava/lang/String;")
    private String field1162;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "[F")
    public static float[] field1163 = new float[16384];

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "[F")
    public static float[] field1169 = new float[16384];

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "F")
    public static float field1167;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "F")
    public static float field1172;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "Lek;")
    public static class566 field1166;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "Z")
    private boolean field1171;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field1169[var2] = (float) Math.sin((double) var2 * var0);
            field1163[var2] = (float) Math.cos((double) var2 * var0);
        }
        field1173 = 0;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)Ldea;", line = 10)
    public final class446 method584(byte arg0) {
        if (arg0 >= -64) {
            field1173 = 123;
        }
        field1168++;
        return class446.field6291;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)Z", line = 29)
    public final boolean method585(int arg0) {
        if (arg0 != 26152) {
            method586(-124, -30);
        }
        field1164++;
        return this.field1171;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)V", line = 40)
    public static final void method586(int arg0, int arg1) {
        if (arg1 != -16883) {
            field1163 = null;
        }
        field1170++;
        class76 var2 = class3.method28(16, (byte) 42, arg0);
        var2.method406(-975503968);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)I", line = 55)
    public final int method587(int arg0) {
        field1165++;
        if (arg0 != 9856) {
            return -68;
        }
        int var2 = class688.method3805(-118, this.field1162);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        } else {
            this.field1171 = true;
            return 100;
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)V", line = 88)
    public static void method588(byte arg0) {
        field1166 = null;
        field1163 = null;
        if (arg0 == -73) {
            field1169 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 99)
    public class108(String arg0) {
        this.field1162 = arg0;
    }
}
