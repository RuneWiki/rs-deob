import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public abstract class class28 {

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field579 = 0;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Ldd;")
    public static class35 field583 = class180.method1196((byte) 127, "weiss:");

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Ldd;")
    public static class35 field577 = class180.method1196((byte) 126, "Diese Betatest)2Welt ist nur f-Ur eingeladene");

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
    public static void method267(boolean arg0) {
        field577 = null;
        if (!arg0) {
            field583 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(Z)[B")
    public abstract byte[] method268(boolean arg0);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B[B)V")
    public abstract void method269(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIII)V")
    public static final void method270(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -11442) {
            method273(67, (byte) -41);
        }
        field578++;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BILdd;)V")
    public static final void method271(byte arg0, int arg1, class35 arg2) {
        field584++;
        boolean var3 = false;
        class35 var4 = arg2.method323(arg0 ^ 0xFFFFC8B1).method346(64);
        for (int var5 = 0; var5 < class72.field1714; var5++) {
            class102 var6 = class51.field1154[class35.field748[var5]];
            if (var6 != null && var6.field2254 != null && var6.field2254.method337(121, var4)) {
                class55.method476(false, class71.field1704.field1605[0], 1, 0, false, var6.field1603[0], var6.field1605[0], 2, 0, class71.field1704.field1603[0], 0, 1);
                if (arg1 == 1) {
                    class7.field111++;
                    class1.field11.method659(13, true);
                    class1.field11.method264(class35.field748[var5], -114);
                } else if (arg1 == 4) {
                    class1.field11.method659(118, true);
                    class1.field11.method228(class35.field748[var5], 15358);
                    class102.field2266++;
                } else if (arg1 == 6) {
                    class1.field11.method659(243, true);
                    class1.field11.method243(class35.field748[var5], -9440);
                    class175.field3575++;
                } else if (arg1 == 7) {
                    class69.field1640++;
                    class1.field11.method659(226, true);
                    class1.field11.method246(class35.field748[var5], false);
                }
                var3 = true;
                break;
            }
        }
        if (arg0 != -91) {
            field579 = -25;
        }
        if (!var3) {
            class190.method1252(class20.field387, 0, class63.method529(new class35[] { class90.field2013, var4 }, (byte) 67), 0);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class57.field1432[arg0][var8][var14] == -class101.field2232) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class126.field2746[arg0][arg1][arg3] + arg5;
            if (!class120.method857(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class120.method857(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class120.method857(var9, var11, var13)) {
                return false;
            } else if (class120.method857(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class1.method9(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class120.method857(var6 + 1, class126.field2746[arg0][arg1][arg3] + arg5, var7 + 1) && class120.method857(var6 + 128 - 1, class126.field2746[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class120.method857(var6 + 128 - 1, class126.field2746[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class120.method857(var6 + 1, class126.field2746[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IB)V")
    public static final void method273(int arg0, byte arg1) {
        field582++;
        if (!class193.method1261((byte) 111, arg0)) {
            return;
        }
        class55[] var2 = class163.field3299[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class55 var4 = var2[var3];
            if (var4 != null) {
                var4.field1289 = 0;
                var4.field1240 = 0;
            }
        }
        if (arg1 != 73) {
            field579 = 91;
        }
    }
}
