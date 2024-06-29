import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class71 {

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field1639 = 0;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Lv;")
    public static class146 field1641 = class159.method1226((byte) -37, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Lv;")
    public static class146 field1643 = class159.method1226((byte) -37, "::");

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field1644 = 0;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "Lv;")
    public static class146 field1645 = null;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Lv;")
    private static class146 field1650 = class159.method1226((byte) -37, "Loaded wordpack");

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "Lv;")
    public static class146 field1642 = field1650;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "Z")
    public static boolean field1649;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static void method507(byte arg0) {
        if (arg0 != -51) {
            field1649 = false;
        }
        field1645 = null;
        field1641 = null;
        field1642 = null;
        field1650 = null;
        field1643 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIBZ)Lv;")
    public static final class146 method508(int arg0, int arg1, byte arg2, boolean arg3) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        int var4 = arg1 / arg0;
        int var5 = 1;
        while (var4 != 0) {
            var5++;
            var4 /= arg0;
        }
        field1648++;
        int var6 = var5;
        int var7 = -19 / ((arg2 - 89) / 34);
        if (arg1 < 0 || arg3) {
            var6 = var5 + 1;
        }
        byte[] var8 = new byte[var6];
        if (arg1 < 0) {
            var8[0] = 45;
        } else if (arg3) {
            var8[0] = 43;
        }
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = arg1 % arg0;
            arg1 /= arg0;
            if (var11 < 0) {
                var11 = -var11;
            }
            if (var11 > 9) {
                var11 += 39;
            }
            var8[var6 - var9 - 1] = (byte) (var11 + 48);
        }
        class146 var10 = new class146();
        var10.field3372 = var6;
        var10.field3365 = var8;
        return var10;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([Lv;B)Lv;")
    public static final class146 method509(class146[] arg0, byte arg1) {
        field1646++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        int var2 = -22 % ((-arg1 - 11) / 62);
        return class9.method63(arg0.length, false, 0, arg0);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZLef;I)V")
    public static final void method510(boolean arg0, class35 arg1, int arg2) {
        field1640++;
        if (arg1.field766 > class94.field2229) {
            class90.method712((byte) 118, arg1);
        } else if (class94.field2229 > arg1.field803) {
            class157.method1220(arg1, (byte) 115);
        } else {
            class120.method912(arg1, 83);
        }
        if (arg1.field757 < 128 || arg1.field790 < 128 || arg1.field757 >= 13184 || arg1.field790 >= 13184) {
            arg1.field766 = 0;
            arg1.field803 = 0;
            arg1.field790 = arg1.field738[0] * 128 + arg1.field742 * 64;
            arg1.field817 = -1;
            arg1.field757 = arg1.field788[0] * 128 + arg1.field742 * 64;
            arg1.field753 = -1;
            arg1.method241((byte) 52);
        }
        if (class116.field2696 == arg1 && (arg1.field757 < 1536 || arg1.field790 < 1536 || arg1.field757 >= 11776 || arg1.field790 >= 11776)) {
            arg1.field757 = arg1.field788[0] * 128 + arg1.field742 * 64;
            arg1.field790 = arg1.field738[0] * 128 + arg1.field742 * 64;
            arg1.field753 = -1;
            arg1.field766 = 0;
            arg1.field803 = 0;
            arg1.field817 = -1;
            arg1.method241((byte) 56);
        }
        class25.method164(-116, arg1);
        if (!arg0) {
            method509(null, (byte) 20);
        }
        class15.method94(-1, arg1);
    }
}
