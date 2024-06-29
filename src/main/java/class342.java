import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class342 extends class514 {

    @OriginalMember(owner = "client!bq", name = "H", descriptor = "B")
    public byte field5265 = 5;

    @OriginalMember(owner = "client!bq", name = "F", descriptor = "I")
    public static int field5263 = 0;

    @OriginalMember(owner = "client!bq", name = "t", descriptor = "I")
    public int field5251;

    @OriginalMember(owner = "client!bq", name = "v", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!bq", name = "w", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!bq", name = "x", descriptor = "I")
    public int field5255;

    @OriginalMember(owner = "client!bq", name = "y", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!bq", name = "z", descriptor = "I")
    public int field5257;

    @OriginalMember(owner = "client!bq", name = "B", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!bq", name = "C", descriptor = "I")
    public int field5260;

    @OriginalMember(owner = "client!bq", name = "E", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!bq", name = "G", descriptor = "I")
    public int field5264;

    @OriginalMember(owner = "client!bq", name = "I", descriptor = "I")
    public int field5266;

    @OriginalMember(owner = "client!bq", name = "A", descriptor = "Lhv;")
    public static class149 field5258;

    @OriginalMember(owner = "client!bq", name = "u", descriptor = "Ldu;")
    public static class443 field5252;

    @OriginalMember(owner = "client!bq", name = "D", descriptor = "Z")
    public boolean field5261;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lgk;I)V")
    public static final void method2083(class468 arg0, int arg1) {
        field5259++;
        for (int var2 = arg1; var2 < class367.field5584; var2++) {
            int var3 = arg0.method2724(arg1 ^ 0xFF);
            int var4 = arg0.method2727((byte) 43);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class295.field4418[var3] != null) {
                class295.field4418[var3].field7480 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lok;IZ)Ldu;")
    public static final class443 method2084(class74 arg0, int arg1, boolean arg2) {
        if (arg2) {
            field5256++;
            byte[] var3 = arg0.method526(arg1, 1);
            return var3 == null ? null : new class443(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(I)I")
    public static final int method2085(int arg0) {
        if (arg0 > -125) {
            field5252 = null;
        }
        field5253++;
        return class111.field1696;
    }

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "(I)V")
    public static void method2086(int arg0) {
        field5252 = null;
        if (arg0 != 32487) {
            method2086(-17);
        }
        field5258 = null;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IBLjava/lang/String;)I")
    public static final int method2087(int arg0, byte arg1, String arg2) {
        field5262++;
        return arg1 == 5 ? class152.method1101(arg2, arg0, false, true) : -33;
    }
}
