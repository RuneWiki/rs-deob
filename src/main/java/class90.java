import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class90 extends class224 {

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "Ljava/lang/String;")
    public static String field1377 = "Discard";

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
    public static int field1378 = 0;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "[[[Lsj;")
    public static class49[][][] field1382;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZLdl;)V")
    public static final void method604(boolean arg0, class123 arg1) {
        if (!arg0) {
            class201.field3158 = arg1;
            class204.field3191 = class201.field3158.method820(4, 112);
            ++field1384;
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
    public class90() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        ++field1383;
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        if (!arg1) {
            field1382 = null;
        }
        if (super.field3625.field4425) {
            class196.method1356(var3, 0, class78.field1108, class251.field4018[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
    public static final boolean method605(String arg0, String arg1, int arg2) {
        ++field1379;
        if (arg2 < 110) {
            method605((String) null, (String) null, 67);
        }
        int var3 = arg0.length();
        int var4 = arg1.length();
        if (var4 > var3) {
            return false;
        } else {
            for (int var5 = 0; var5 < var4; ++var5) {
                char var6 = arg0.charAt(var5);
                char var7 = arg1.charAt(var5);
                if (~var6 != ~var7 && Character.toLowerCase(var6) != Character.toLowerCase(var7) && Character.toUpperCase(var6) != Character.toUpperCase(var7)) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(II)Z")
    public static final boolean method606(int arg0, int arg1) {
        ++field1381;
        if (~arg1 > -1) {
            return false;
        } else {
            if (arg0 != 4626) {
                method607(-55, -4, -40);
            }
            int var2 = class2.field21[arg1];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return ~var2 == -1007;
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(III)J")
    public static final long method607(int arg0, int arg1, int arg2) {
        class49 var3 = field1382[arg0][arg1][arg2];
        return var3 != null && var3.field631 != null ? var3.field631.field4265 : 0L;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(Z)V")
    public static void method608(boolean arg0) {
        if (arg0) {
            field1377 = null;
            field1382 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BIIII)V")
    public static final void method609(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -8 / ((arg0 - 66) / 34);
        ++field1380;
        class287 var6 = class261.method1786(arg2, false, 10);
        var6.method1914((byte) 46);
        var6.field4547 = arg1;
        var6.field4550 = arg4;
        var6.field4549 = arg3;
    }
}
