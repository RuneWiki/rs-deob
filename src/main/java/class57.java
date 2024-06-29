import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hka")
public class class57 extends class156 {

    @OriginalMember(owner = "client!hka", name = "f", descriptor = "Lwg;")
    public static class450 field803 = new class450(14, 0, 4, 1);

    @OriginalMember(owner = "client!hka", name = "g", descriptor = "[S")
    private static short[] field804 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!hka", name = "i", descriptor = "I")
    public static int field806 = 0;

    @OriginalMember(owner = "client!hka", name = "j", descriptor = "[S")
    private static short[] field807 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!hka", name = "k", descriptor = "[S")
    private static short[] field808 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!hka", name = "h", descriptor = "[[S")
    public static short[][] field805 = new short[][] { field804, field808, field807 };

    @OriginalMember(owner = "client!hka", name = "c", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!hka", name = "d", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!hka", name = "e", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(Lir;III)V")
    public static final void method405(class28 arg0, int arg1, int arg2, int arg3) {
        field800++;
        if (arg1 == 25485) {
            class378.field5161[arg2][arg3] = arg0;
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(I)V")
    public static void method406(int arg0) {
        field807 = null;
        int var1 = -36 % ((arg0 - 34) / 52);
        field805 = null;
        field803 = null;
        field804 = null;
        field808 = null;
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(Z)V")
    public static final void method407(boolean arg0) {
        field802++;
        if (class724.field9953 <= 0) {
            class741.field10225 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class238.field3400.length; var2++) {
                if (class238.field3400[var2].indexOf("--> ") != -1) {
                    int var10000 = ~class724.field9953;
                    var1++;
                    if (var10000 == ~var1) {
                        class741.field10225 = class238.field3400[var2].substring(class238.field3400[var2].indexOf(">") + 2);
                        break;
                    }
                }
            }
        }
        if (arg0) {
            method408((byte) 27, null);
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(B[I)Ljava/lang/String;")
    public static final String method408(byte arg0, int[] arg1) {
        field801++;
        if (arg0 != -99) {
            method405(null, -120, -39, -56);
        }
        StringBuffer var2 = new StringBuffer();
        int var3 = class66.field967;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class722 var5 = class769.field10604.method3677(-7533, arg1[var4]);
            if (var5.field9909 != -1) {
                class604 var6 = (class604) class287.field3962.method266((byte) -112, (long) var5.field9909);
                if (var6 == null) {
                    class49 var7 = class49.method366(class346.field4664, var5.field9909, 0);
                    if (var7 != null) {
                        var6 = class95.field1472.method498(var7, true);
                        class287.field3962.method270(var6, (long) var5.field9909, -127);
                    }
                }
                if (var6 != null) {
                    class146.field2462[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }
}
