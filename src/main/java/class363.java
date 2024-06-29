import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class363 extends class103 {

    @OriginalMember(owner = "client!om", name = "x", descriptor = "[Lnh;")
    public static class680[] field4862 = new class680[35];

    @OriginalMember(owner = "client!om", name = "D", descriptor = "Lsq;")
    public static class485 field4868 = new class485(2);

    @OriginalMember(owner = "client!om", name = "I", descriptor = "I")
    public static int field4873 = -1;

    @OriginalMember(owner = "client!om", name = "v", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "I")
    public int field4865;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!om", name = "C", descriptor = "I")
    public int field4867;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "I")
    public int field4869;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "I")
    public int field4870;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "J")
    public long field4861;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "(B)I", line = 4)
    public final int method194(byte arg0) {
        field4860++;
        if (arg0 != -106) {
            this.field4865 = -122;
        }
        return this.field4869;
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(B)I", line = 17)
    public final int method193(byte arg0) {
        field4871++;
        if (arg0 >= -53) {
            this.field4861 = 0L;
        }
        return this.field4867;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(Z)J", line = 28)
    public final long method195(boolean arg0) {
        if (arg0) {
            return 62L;
        } else {
            field4866++;
            return this.field4861;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)I", line = 46)
    public final int method192(int arg0) {
        field4863++;
        if (arg0 != -58) {
            method2124((byte) 79, null);
        }
        return this.field4865;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BLjava/lang/String;)V", line = 66)
    public static final void method2124(byte arg0, String arg1) {
        field4872++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class6.method44(arg1, (byte) -83);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class699.field9804; var3++) {
            String var4 = class703.field9867[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class6.method44(var4, (byte) -83);
            if (var5 != null && var5.equals(var2)) {
                class699.field9804--;
                for (int var6 = var3; var6 < class699.field9804; var6++) {
                    class703.field9867[var6] = class703.field9867[var6 + 1];
                    class597.field8405[var6] = class597.field8405[var6 + 1];
                    class380.field5151[var6] = class380.field5151[var6 + 1];
                    class164.field1823[var6] = class164.field1823[var6 + 1];
                    class486.field7001[var6] = class486.field7001[var6 + 1];
                    class392.field5325[var6] = class392.field5325[var6 + 1];
                }
                class245.field3028 = class158.field1780;
                class480.field6913++;
                class653 var7 = class699.method3845((byte) 45, class39.field395, class362.field4856);
                var7.field9158.method658(class72.method382(2018672392, arg1), (byte) 108);
                var7.field9158.method672((byte) 87, arg1);
                class568.method3220(var7, (byte) 11);
                break;
            }
        }
        int var8 = 41 / ((14 - arg0) / 32);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)I", line = 128)
    public final int method196(byte arg0) {
        field4864++;
        if (arg0 != 49) {
            this.field4870 = -118;
        }
        return this.field4870;
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V", line = 145)
    public static void method2125(int arg0) {
        field4868 = null;
        if (arg0 < 79) {
            field4868 = null;
        }
        field4862 = null;
    }
}
