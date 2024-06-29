import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class702 extends class627 {

    @OriginalMember(owner = "client!za", name = "n", descriptor = "Ldh;")
    public static class286 field9902 = null;

    @OriginalMember(owner = "client!za", name = "j", descriptor = "I")
    public static int field9898;

    @OriginalMember(owner = "client!za", name = "k", descriptor = "I")
    public static int field9899;

    @OriginalMember(owner = "client!za", name = "l", descriptor = "I")
    public static int field9900;

    @OriginalMember(owner = "client!za", name = "m", descriptor = "I")
    public static int field9901;

    @OriginalMember(owner = "client!za", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field9903;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3893(int arg0) {
        class593.field8251++;
        class440.field6180 = 0;
        field9899++;
        class9.field95 = 0;
        class90.method626((byte) 26);
        class694.method3867(-101);
        class589.method3276(false);
        boolean var1 = false;
        if (arg0 < 79) {
            method3894(125, -114, -29);
        }
        for (int var2 = 0; var2 < class440.field6180; var2++) {
            int var5 = class747.field10446[var2];
            class247 var6 = (class247) class563.field7875.method3248((long) var5, 0);
            class124 var7 = var6.field3158;
            if (class322.field4113 && class580.method3235(var5, (byte) -74)) {
                class266.method1602((byte) -112);
            }
            if (class593.field8251 != var7.field352) {
                if (var7.field1486.method965(-1)) {
                    class39.method336(var7, 31);
                }
                var7.method803(-88, null);
                var6.method3426((byte) -22);
                var1 = true;
            }
        }
        if (var1) {
            class676.field9195 = class563.field7875.method3244((byte) 126);
            class563.field7875.method3250(class38.field559, 0);
        }
        if (class677.field9199 != class24.field414.field2354) {
            throw new RuntimeException("gnp1 pos:" + class24.field414.field2354 + " psize:" + class677.field9199);
        }
        for (int var3 = 0; var3 < class443.field6200; var3++) {
            if (class563.field7875.method3248((long) class61.field832[var3], 0) == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class443.field6200);
            }
        }
        if ((class676.field9195 - class443.field6200) != 0) {
            throw new RuntimeException("gnp3 mis:" + (class676.field9195 - class443.field6200));
        }
        for (int var4 = 0; var4 < class676.field9195; var4++) {
            if (class593.field8251 != class38.field559[var4].field3158.field352) {
                throw new RuntimeException("gnp4 uk:" + class38.field559[var4].field3158.field354);
            }
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(III)V", line = 87)
    public static final void method3894(int arg0, int arg1, int arg2) {
        field9900++;
        if (arg2 > -126) {
            method3897(-10);
        }
        class548 var3 = class696.method3872(arg1, 16, -1633381944);
        var3.method3130(93);
        var3.field7725 = arg0;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IZIBI)Lub;", line = 103)
    public static final class157 method3895(int arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        field9901++;
        class157 var5 = new class157();
        var5.field2028 = arg4;
        var5.field2027 = arg0;
        class148.field1802.method3249((long) arg2, var5, (byte) -95);
        if (arg3 != 123) {
            return null;
        }
        class279.method1669((byte) -72, arg4);
        class460 var6 = class102.method684(5025, arg2);
        if (var6 != null) {
            class663.method3591(arg3 + 16763, var6);
        }
        if (class419.field5958 != null) {
            class663.method3591(arg3 + 16763, class419.field5958);
            class419.field5958 = null;
        }
        class421.method2498(6);
        if (var6 != null) {
            class146.method908(!arg1, 256, var6);
        }
        if (!arg1) {
            class445.method2628(arg4);
        }
        if (!arg1 && class638.field8834 != -1) {
            class677.method3641(1, class638.field8834, arg3 ^ 0x64);
        }
        return var5;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IZ)V", line = 142)
    public static final void method3896(int arg0, boolean arg1) {
        field9898++;
        int var2 = class581.field8076;
        if (arg0 >= -2) {
            return;
        }
        int var3 = class459.field6427;
        if (arg1 && class306.field3936) {
            var2 <<= 0x1;
            var3 = -var2;
        }
        class458.field6407.method118(var3, var2);
    }

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(I)V", line = 171)
    public static void method3897(int arg0) {
        field9902 = null;
        if (arg0 != 1) {
            method3895(-113, false, 13, (byte) -17, -11);
        }
        field9903 = null;
    }
}
