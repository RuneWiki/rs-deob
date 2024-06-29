import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class64 extends class90 {

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
    public int field1352 = -1;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
    public int field1361 = 0;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Lrf;")
    public static class163 field1340 = class53.method392(-118, "gelb:");

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "Lrf;")
    public static class163 field1347 = class53.method392(-74, ":assistreq:");

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "Lrf;")
    private static class163 field1358 = class53.method392(-72, "This world is running a closed Beta)3");

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "I")
    public static int field1359 = 0;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "Lrf;")
    public static class163 field1348 = field1358;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public int field1339;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public int field1341;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    public int field1344;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
    public int field1349;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    public int field1351;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
    public int field1355;

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "I")
    public int field1356;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "I")
    public int field1363;

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "I")
    public int field1364;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "Lrh;")
    public static class165 field1346;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "Lu;")
    public static class184 field1360;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "[[[B")
    public static byte[][][] field1362;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
    public static final void method457(int arg0) {
        class194.field3810.method399(false);
        field1353++;
        if (arg0 > -94) {
            method457(55);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLme;)V")
    public static final void method458(byte arg0, class118 arg1) {
        class185.method1257(200000, arg1, 4200);
        if (arg0 > -66) {
            field1346 = null;
        }
        field1342++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIZI)V")
    public static final void method459(int arg0, int arg1, boolean arg2, int arg3) {
        field1357++;
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class154.field3199[arg1][arg3 + var4][arg0 + var7] = 0;
            }
        }
        if (arg3 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class154.field3199[arg1][arg3][arg0 + var5] = class154.field3199[arg1][arg3 - 1][arg0 + var5];
            }
        }
        if (arg2) {
            field1347 = null;
        }
        if (arg0 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class154.field3199[arg1][arg3 + var6][arg0] = class154.field3199[arg1][arg3 + var6][arg0 - 1];
            }
        }
        if (arg3 > 0 && class154.field3199[arg1][arg3 - 1][arg0] != 0) {
            class154.field3199[arg1][arg3][arg0] = class154.field3199[arg1][arg3 - 1][arg0];
        } else if (arg0 > 0 && class154.field3199[arg1][arg3][arg0 - 1] != 0) {
            class154.field3199[arg1][arg3][arg0] = class154.field3199[arg1][arg3][arg0 - 1];
        } else if (arg3 > 0 && arg0 > 0 && class154.field3199[arg1][arg3 - 1][arg0 - 1] != 0) {
            class154.field3199[arg1][arg3][arg0] = class154.field3199[arg1][arg3 - 1][arg0 - 1];
        }
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
    public static void method460(int arg0) {
        field1340 = null;
        field1362 = null;
        field1360 = null;
        field1347 = null;
        if (arg0 >= 87) {
            field1346 = null;
            field1348 = null;
            field1358 = null;
        }
    }
}
