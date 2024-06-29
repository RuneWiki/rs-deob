import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class484 extends class136 {

    @OriginalMember(owner = "client!jm", name = "H", descriptor = "Lgk;")
    public static class331 field7117 = new class331("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!jm", name = "I", descriptor = "Lfa;")
    public static class156 field7118 = new class156(5);

    @OriginalMember(owner = "client!jm", name = "L", descriptor = "Lho;")
    public static class102 field7121 = new class102(9, 0, 4, 1);

    @OriginalMember(owner = "client!jm", name = "M", descriptor = "I")
    public static int field7122 = 0;

    @OriginalMember(owner = "client!jm", name = "C", descriptor = "I")
    public static int field7113;

    @OriginalMember(owner = "client!jm", name = "E", descriptor = "I")
    public static int field7114;

    @OriginalMember(owner = "client!jm", name = "F", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!jm", name = "G", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!jm", name = "K", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!jm", name = "J", descriptor = "Ljava/lang/Object;")
    public static Object field7119;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(III)Z", line = 3)
    public static final boolean method2911(int arg0, int arg1, int arg2) {
        ++field7113;
        if (arg1 != -1376312589) {
            method2911(109, 32, -43);
        }
        return ~(34 & arg0) != -1;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)[I", line = 14)
    public final int[] method82(int arg0, int arg1) {
        ++field7116;
        int[] var3 = super.field1957.method2887((byte) -112, arg1);
        int var4 = 38 / ((67 - arg0) / 50);
        if (super.field1957.field7031) {
            int var5 = class290.field4168[arg1];
            for (int var6 = 0; var6 < class467.field6889; ++var6) {
                var3[var6] = this.method2915((byte) 40, var5, class453.field6672[var6]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "(III)I", line = 47)
    public static final int method2912(int arg0, int arg1, int arg2) {
        if (arg0 != 18059) {
            method2914((class431) null);
        }
        ++field7115;
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg2 + -var3;
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(B)V", line = 62)
    public static void method2913(byte arg0) {
        field7118 = null;
        field7117 = null;
        field7121 = null;
        field7119 = null;
        if (arg0 <= 76) {
            field7120 = 34;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lpe;)V", line = 78)
    public static final void method2914(class431 arg0) {
        for (int var1 = arg0.field6332; var1 <= arg0.field6340; ++var1) {
            for (int var2 = arg0.field6339; var2 <= arg0.field6337; ++var2) {
                class148 var3 = class422.field6240[arg0.field6328][var1][var2];
                if (var3 != null) {
                    class480 var4 = var3.field2086;
                    class480 var5 = null;
                    while (var4 != null) {
                        if (var4.field7054 == arg0) {
                            if (var5 != null) {
                                var5.field7058 = var4.field7058;
                            } else {
                                var3.field2086 = var4.field7058;
                            }
                            var4.method2894(35);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field7058;
                    }
                    var3.field2094 = 0;
                    for (class480 var6 = var3.field2086; var6 != null; var6 = var6.field7058) {
                        var3.field2094 = (byte) (var3.field2094 | var6.field7061);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V", line = 129)
    public class484() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BII)I", line = 146)
    private final int method2915(byte arg0, int arg1, int arg2) {
        ++field7114;
        int var4 = arg1 * 57 + arg2;
        if (arg0 <= 1) {
            return -98;
        } else {
            int var5 = var4 << 1 ^ var4;
            return -((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 - -1376312589) / 262144) + 4096;
        }
    }
}
