import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class265 {

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "[I")
    public static int[] field4360 = new int[100];

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field4361 = 0;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "Lme;")
    public static class82 field4365;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([IZ)[I", line = 11)
    public static final int[] method1869(int[] arg0, boolean arg1) {
        field4359++;
        if (arg0 == null) {
            return null;
        }
        int[] var2 = new int[arg0.length];
        if (arg1) {
            class298.method2100(arg0, 0, var2, 0, arg0.length);
            return var2;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIIILkm;IZJ)Z", line = 36)
    public static final boolean method1870(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class162 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class203.field3110 == class101.field1457;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class263.field4155 || var16 >= class163.field2590) {
                    return false;
                }
                class50 var17 = class264.field4230[arg0][var15][var16];
                if (var17 != null && var17.field735 >= 5) {
                    return false;
                }
            }
        }
        class258 var18 = new class258();
        var18.field4076 = arg11;
        var18.field4085 = arg0;
        var18.field4083 = arg5;
        var18.field4075 = arg6;
        var18.field4080 = arg7;
        var18.field4071 = arg8;
        var18.field4073 = arg9;
        var18.field4082 = arg1;
        var18.field4081 = arg2;
        var18.field4084 = arg1 + arg3 - 1;
        var18.field4077 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class264.field4230[var22][var19][var20] == null) {
                        class264.field4230[var22][var19][var20] = new class50(var22, var19, var20);
                    }
                }
                class50 var23 = class264.field4230[arg0][var19][var20];
                var23.field752[var23.field735] = var18;
                var23.field753[var23.field735] = var21;
                var23.field736 |= var21;
                var23.field735++;
                if (var13 && class91.field1317[var19][var20] != 0) {
                    var14 = class91.field1317[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class91.field1317[var24][var25] == 0) {
                        class91.field1317[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class48.field695[class61.field931++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V", line = 154)
    public static void method1871(boolean arg0) {
        if (arg0) {
            field4361 = -23;
        }
        field4365 = null;
        field4360 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 166)
    public static final long method1872(String arg0, int arg1) {
        long var2 = 0L;
        field4364++;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            char var6 = arg0.charAt(var5);
            var2 *= 37L;
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 - 64);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        if (arg1 < 50) {
            method1871(false);
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }
}
