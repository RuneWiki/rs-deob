import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class105 implements class373 {

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public static int field1333 = 64;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "[I")
    public static int[] field1332 = new int[32];

    @OriginalMember(owner = "client!as", name = "h", descriptor = "[I")
    public static int[] field1338 = new int[2];

    @OriginalMember(owner = "client!as", name = "i", descriptor = "[[F")
    public static float[][] field1339 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!as", name = "e", descriptor = "Lkg;")
    public static class179 field1335 = new class179(15, -1);

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "Lqc;")
    public static class524 field1334;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "[Ll;")
    public static class16[] field1331;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lud;IJ[I)Ljava/lang/String;")
    public final String method778(class27 arg0, int arg1, long arg2, int[] arg3) {
        field1337++;
        if (class390.field5240 == arg0) {
            class299 var6 = class308.field3940.method1(arg3[0], 16);
            return var6.method1765((int) arg2, (byte) -108);
        } else if (class202.field2630 == arg0 || class229.field2924 == arg0) {
            class9 var7 = class376.field4949.method624((byte) -126, (int) arg2);
            return var7.field140;
        } else if (class338.field4245 == arg0 || class47.field609 == arg0 || class3.field27 == arg0) {
            return class308.field3940.method1(arg3[0], 16).method1765((int) arg2, (byte) -108);
        } else {
            if (arg1 > -65) {
                field1333 = 27;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)V")
    public static void method779(boolean arg0) {
        field1335 = null;
        field1331 = null;
        field1334 = null;
        field1332 = null;
        field1338 = null;
        field1339 = null;
        if (!arg0) {
            field1335 = null;
        }
    }
}
