import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class89 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Lhn;")
    public static class509 field1270 = new class509(88, -1);

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "[[F")
    public static float[][] field1275 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "Lqu;")
    public static class65 field1276 = new class65(9, 0, 4, 1);

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Lak;")
    public static class234 field1277 = new class234("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public int field1271;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Lul;")
    public static class406 field1278;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "Ljava/lang/Object;")
    public static Object field1273;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "Ljava/lang/String;")
    public String field1272;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)Lie;")
    public static final class6 method731(boolean arg0, int arg1) {
        field1274++;
        if (arg0) {
            return null;
        }
        class6[] var2 = class40.method380((byte) 125);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class6 var4 = var2[var3];
            if (var4.field67 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static void method732(byte arg0) {
        if (arg0 > 0) {
            field1275 = null;
        }
        field1275 = null;
        field1278 = null;
        field1270 = null;
        field1276 = null;
        field1273 = null;
        field1277 = null;
    }
}
