import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class558 {

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public int field7837;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "Leea;")
    private class131 field7843;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "[I")
    public static int[] field7840 = new int[1000];

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public static int field7842 = 0;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field7838;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field7839;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    public static int field7841;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIII)I", line = 4)
    public static final int method3216(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field7838++;
        if (var4 == 0) {
            return arg2;
        }
        if (arg0 >= -93) {
            method3218(-37);
        }
        if (var4 == 1) {
            return 4095 - arg3;
        } else if (var4 == 2) {
            return 4095 - arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V", line = 30)
    public static final void method3217(int arg0) {
        class89.field1072.method3831(7);
        field7839++;
        int var1 = class89.field1072.method3821(8, (byte) 108);
        if (arg0 != 29921) {
            method3217(68);
        }
        if (class344.field4849 > var1) {
            for (int var2 = var1; var2 < class344.field4849; var2++) {
                class673.field9115[class674.field9141++] = class100.field1196[var2];
            }
        }
        if (var1 > class344.field4849) {
            throw new RuntimeException("gnpov1");
        }
        class344.field4849 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class100.field1196[var3];
            class468 var5 = ((class740) class373.field5230.method1180((byte) 26, (long) var4)).field10289;
            int var6 = class89.field1072.method3821(1, (byte) 108);
            if (var6 == 0) {
                class100.field1196[class344.field4849++] = var4;
                var5.field7961 = class199.field2625;
            } else {
                int var7 = class89.field1072.method3821(2, (byte) 108);
                if (var7 == 0) {
                    class100.field1196[class344.field4849++] = var4;
                    var5.field7961 = class199.field2625;
                    class133.field1949[class504.field7232++] = var4;
                } else if (var7 == 1) {
                    class100.field1196[class344.field4849++] = var4;
                    var5.field7961 = class199.field2625;
                    int var8 = class89.field1072.method3821(3, (byte) 108);
                    var5.method2791(var8, 1, -1);
                    int var9 = class89.field1072.method3821(1, (byte) 108);
                    if (var9 == 1) {
                        class133.field1949[class504.field7232++] = var4;
                    }
                } else if (var7 == 2) {
                    class100.field1196[class344.field4849++] = var4;
                    var5.field7961 = class199.field2625;
                    if (class89.field1072.method3821(1, (byte) 108) == 1) {
                        int var10 = class89.field1072.method3821(3, (byte) 108);
                        var5.method2791(var10, 2, -1);
                        int var11 = class89.field1072.method3821(3, (byte) 108);
                        var5.method2791(var11, 2, -1);
                    } else {
                        int var12 = class89.field1072.method3821(3, (byte) 108);
                        var5.method2791(var12, 0, -1);
                    }
                    int var13 = class89.field1072.method3821(1, (byte) 108);
                    if (var13 == 1) {
                        class133.field1949[class504.field7232++] = var4;
                    }
                } else if (var7 == 3) {
                    class673.field9115[class674.field9141++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V", line = 148)
    public static void method3218(int arg0) {
        if (arg0 == -22339) {
            field7840 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "finalize", descriptor = "()V", line = 158)
    protected final void finalize() throws Throwable {
        this.field7843.method937(this.field7837, 905);
        field7841++;
        super.finalize();
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Leea;II)V", line = 174)
    public class558(class131 arg0, int arg1, int arg2) {
        this.field7837 = arg2;
        this.field7843 = arg0;
    }
}
