import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class51 {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "[I")
    public static int[] field693;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 9)
    public static void method349(int arg0) {
        field693 = null;
        if (arg0 != 0) {
            method351((class132) null, 89, -20, -8);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V", line = 19)
    public static final void method350(byte arg0) {
        field691++;
        if (class41.field469) {
            return;
        }
        class125.field1711 = true;
        if (class98.field1340) {
            class124.field1674 = (float) ((int) class124.field1674 - 17 & 0xFFFFFFF0);
        } else {
            class187.field2589 += (-12.0F - class187.field2589) / 2.0F;
        }
        if (arg0 < 37) {
            field693 = (int[]) null;
        }
        class41.field469 = true;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ldn;III)V", line = 46)
    public static final void method351(class132 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class245.field3524) {
            class202 var4 = class142.field1940[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2869 != null && var4.field2869.field4586.method943()) {
                arg0.method941(var4.field2869.field4586, 128, 0, 0, true);
            }
        }
        if (arg3 < class245.field3524) {
            class202 var5 = class142.field1940[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field2869 != null && var5.field2869.field4586.method943()) {
                arg0.method941(var5.field2869.field4586, 0, 0, 128, true);
            }
        }
        if (arg2 < class245.field3524 && arg3 < class99.field1356) {
            class202 var6 = class142.field1940[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field2869 != null && var6.field2869.field4586.method943()) {
                arg0.method941(var6.field2869.field4586, 128, 0, 128, true);
            }
        }
        if (arg2 < class245.field3524 && arg3 > 0) {
            class202 var7 = class142.field1940[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field2869 != null && var7.field2869.field4586.method943()) {
                arg0.method941(var7.field2869.field4586, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IZ)[B", line = 94)
    public static final synchronized byte[] method352(int arg0, boolean arg1) {
        field692++;
        if (arg0 == 100 && class112.field1537 > 0) {
            byte[] var2 = class289.field4314[--class112.field1537];
            class289.field4314[class112.field1537] = null;
            return var2;
        } else if (arg0 == 5000 && class218.field3128 > 0) {
            byte[] var3 = class186.field2560[--class218.field3128];
            class186.field2560[class218.field3128] = null;
            return var3;
        } else if (arg0 == 30000 && class73.field1005 > 0) {
            byte[] var4 = class187.field2593[--class73.field1005];
            class187.field2593[class73.field1005] = null;
            return var4;
        } else {
            if (arg1) {
                method351((class132) null, -54, -43, 33);
            }
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)Ljava/lang/String;", line = 130)
    public static final String method353(int arg0, int arg1) {
        field694++;
        int var2 = -16 % ((20 - arg0) / 36);
        return class88.field1251[arg1].length() <= 0 ? class111.field1487[arg1] : class111.field1487[arg1] + class112.field1530 + class88.field1251[arg1];
    }
}
