import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class84 {

    @OriginalMember(owner = "client!fca", name = "d", descriptor = "Lqfa;")
    public static class98 field1044 = new class98(71, 10);

    @OriginalMember(owner = "client!fca", name = "f", descriptor = "Lgda;")
    public static class53 field1046 = new class53(67, 2);

    @OriginalMember(owner = "client!fca", name = "g", descriptor = "Lbd;")
    public static class60 field1047 = new class60(12, 16);

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!fca", name = "e", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!fca", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1048;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lip;Z)Z")
    public static final boolean method641(class706 arg0, boolean arg1) {
        field1041++;
        class10 var2 = class612.field8588.method558((byte) 5, arg0.method861((byte) -17));
        if (var2.field143 == -1) {
            return true;
        } else if (arg1) {
            return false;
        } else {
            class212 var3 = class48.field564.method1412(9, var2.field143);
            return var3.field2798 == -1 ? true : var3.method1305(79);
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method642(int arg0, int arg1, String[] arg2, int arg3) {
        field1045++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg2[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg3;
            int var6 = 0;
            for (int var7 = arg3; var7 < var5; var7++) {
                String var11 = arg2[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            if (arg0 >= -89) {
                return null;
            }
            for (int var9 = arg3; var9 < var5; var9++) {
                String var10 = arg2[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(B)V")
    public static void method643(byte arg0) {
        if (arg0 != 44) {
            field1048 = null;
        }
        field1046 = null;
        field1048 = null;
        field1044 = null;
        field1047 = null;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lha;B)V")
    public static final void method644(class58 arg0, byte arg1) {
        field1043++;
        class352.field4974 = class91.method685(class508.field7273, true, 0, arg0);
        class219.field2859 = class10.method63(101, arg0, class508.field7273);
        class478.field6780 = class91.method685(class279.field3941, true, 0, arg0);
        int var2 = 98 % ((arg1 + 37) / 56);
        class455.field6428 = class10.method63(125, arg0, class279.field3941);
        class505.field7241 = class91.method685(class20.field299, true, 0, arg0);
        class119.field1441 = class10.method63(-125, arg0, class20.field299);
    }
}
