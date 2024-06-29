import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class370 extends class220 {

    @OriginalMember(owner = "client!bfa", name = "K", descriptor = "Lbh;")
    public static class37 field5322 = new class37("WTWIP", "office", "_wip", 3);

    @OriginalMember(owner = "client!bfa", name = "C", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!bfa", name = "F", descriptor = "I")
    public int field5317;

    @OriginalMember(owner = "client!bfa", name = "H", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!bfa", name = "J", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!bfa", name = "L", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!bfa", name = "G", descriptor = "Lnp;")
    public class492 field5318;

    @OriginalMember(owner = "client!bfa", name = "I", descriptor = "[B")
    public byte[] field5320;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)I", line = 5)
    public final int method1475(int arg0) {
        ++field5316;
        if (arg0 != -554) {
            this.field5318 = null;
        }
        return super.field3226 ? 0 : 100;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Z)[B", line = 20)
    public final byte[] method1476(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            ++field5323;
            if (super.field3226) {
                throw new RuntimeException();
            } else {
                return this.field5320;
            }
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(BZ)V", line = 39)
    public static final void method2273(byte arg0, boolean arg1) {
        if (arg1) {
            if (class87.field1249 != -1) {
                class594.method3466(class87.field1249, (byte) -64);
            }
            for (class421 var2 = (class421) class291.field4168.method2283(false); var2 != null; var2 = (class421) class291.field4168.method2282((byte) 17)) {
                if (!var2.method1303((byte) 26)) {
                    var2 = (class421) class291.field4168.method2283(false);
                    if (var2 == null) {
                        break;
                    }
                }
                class327.method2074(false, false, var2, true);
            }
            class87.field1249 = -1;
            class291.field4168 = new class372(8);
            class271.method1724((byte) -122);
            class87.field1249 = class574.field8116;
            class483.method2891(false, false);
            class459.method2805(50);
            class709.method4037(class87.field1249);
        }
        ++field5319;
        class273.field3888 = "";
        class100.field1424 = "";
        class523.field7476 = false;
        class305.method1928(3);
        class389.field5865 = -1;
        class462.method2819(-21356, class734.field10270);
        class130.field1749 = new class689();
        class130.field1749.field8423 = class194.field2946 * 512 / 2;
        if (arg0 != 116) {
            method2274((byte) -96);
        }
        class130.field1749.field8428 = class255.field3656 * 512 / 2;
        class130.field1749.field6133[0] = class194.field2946 / 2;
        class460.field6783 = 0;
        class364.field5254 = 0;
        class130.field1749.field6139[0] = class255.field3656 / 2;
        if (class264.field3784 != 2) {
            class233.method1552(124);
        } else {
            class460.field6783 = class601.field8509 << 9;
            class364.field5254 = class396.field5946 << 9;
        }
        class608.method3528(arg0 ^ 117);
    }

    @OriginalMember(owner = "client!bfa", name = "e", descriptor = "(B)V", line = 101)
    public static void method2274(byte arg0) {
        field5322 = null;
        int var1 = 55 % ((-12 - arg0) / 32);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZCI)I", line = 111)
    public static final int method2275(boolean arg0, char arg1, int arg2) {
        ++field5321;
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            char var4 = Character.toLowerCase(arg1);
            var3 = (var4 << 4) + 1;
        }
        if (!arg0) {
            method2274((byte) 52);
        }
        return var3;
    }
}
