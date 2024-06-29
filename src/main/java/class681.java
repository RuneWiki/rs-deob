import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class681 {

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "Z")
    public static boolean field9598 = true;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "Lgf;")
    public static class256 field9596 = new class256();

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field9595;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field9597;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field9599;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field9600;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field9601;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 5)
    public static final void method3800(String arg0, byte arg1) {
        if (arg1 < 36) {
            method3802(-90);
        }
        field9595++;
        if (arg0 == null) {
            return;
        }
        if (!(class408.field5515 < 200 || class221.field3125) || class408.field5515 >= 200) {
            class315.method1881(class72.field1074.method546(class516.field6892, (byte) -35), 0, 4);
            String var2 = class72.field1075.method546(class516.field6892, (byte) -35);
            if (var2 != null) {
                class315.method1881(var2, 0, 4);
            }
            return;
        }
        String var3 = class166.method1138(arg0, 3317);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class408.field5515; var4++) {
            String var9 = class166.method1138(class398.field5296[var4], 3317);
            if (var9 != null && var9.equals(var3)) {
                class315.method1881(arg0 + class72.field1102.method546(class516.field6892, (byte) -35), 0, 4);
                return;
            }
            if (class34.field529[var4] != null) {
                String var10 = class166.method1138(class34.field529[var4], 3317);
                if (var10 != null && var10.equals(var3)) {
                    class315.method1881(arg0 + class72.field1102.method546(class516.field6892, (byte) -35), 0, 4);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class18.field311; var5++) {
            String var7 = class166.method1138(class3.field38[var5], 3317);
            if (var7 != null && var7.equals(var3)) {
                class315.method1881(class72.field1107.method546(class516.field6892, (byte) -35) + arg0 + class72.field1108.method546(class516.field6892, (byte) -35), 0, 4);
                return;
            }
            if (class260.field3574[var5] != null) {
                String var8 = class166.method1138(class260.field3574[var5], 3317);
                if (var8 != null && var8.equals(var3)) {
                    class315.method1881(class72.field1107.method546(class516.field6892, (byte) -35) + arg0 + class72.field1108.method546(class516.field6892, (byte) -35), 0, 4);
                    return;
                }
            }
        }
        if (class166.method1138(class199.field2897.field5398, 3317).equals(var3)) {
            class315.method1881(class72.field1105.method546(class516.field6892, (byte) -35), 0, 4);
            return;
        }
        class176.field2709++;
        class402 var6 = class390.method2252(class280.field3985, -91, class262.field3644);
        var6.field5354.method1980(-345277664, class580.method3186(105, arg0));
        var6.field5354.method2019(-91, arg0);
        class36.method278(0, var6);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLvj;)V", line = 114)
    public static final void method3801(boolean arg0, class411 arg1) {
        field9599++;
        if (!arg0) {
            return;
        }
        boolean var2 = false;
        if (class642.field8626 == arg1.field5610 || arg1.field5575 == -1 || arg1.field5611 != 0) {
            var2 = true;
        } else {
            class616 var3 = class636.field8570.method231(arg1.field5575, -11764);
            if (var3.field8156 || var3.field8163[arg1.field5623] < (arg1.field5554 + 1)) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field5610 - arg1.field5548;
            int var5 = class642.field8626 - arg1.field5548;
            int var6 = arg1.field5589 * 512 + arg1.method2317((byte) 40) * 256;
            int var7 = arg1.field5578 * 512 + arg1.method2317((byte) 40) * 256;
            int var8 = arg1.field5632 * 512 + arg1.method2317((byte) 40) * 256;
            int var9 = arg1.field5601 * 512 + (arg1.method2317((byte) 40) * 256);
            arg1.field8612 = ((var4 - var5) * var7 + var5 * var9) / var4;
            arg1.field8620 = ((var4 - var5) * var6 + (var5 * var8)) / var4;
        }
        arg1.field5644 = 0;
        if (arg1.field5627 == 0) {
            arg1.method2359(8192, (byte) -126, false);
        }
        if (arg1.field5627 == 1) {
            arg1.method2359(12288, (byte) -126, false);
        }
        if (arg1.field5627 == 2) {
            arg1.method2359(0, (byte) -126, false);
        }
        if (arg1.field5627 == 3) {
            arg1.method2359(4096, (byte) -126, false);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)J", line = 169)
    public static final synchronized long method3802(int arg0) {
        field9600++;
        long var1 = System.currentTimeMillis();
        if (class641.field8621 > var1) {
            class418.field5724 += class641.field8621 - var1;
        }
        class641.field8621 = var1;
        if (arg0 != -23600) {
            field9601 = 127;
        }
        return class418.field5724 + var1;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V", line = 191)
    public static void method3803(int arg0) {
        if (arg0 != -1) {
            field9596 = null;
        }
        field9596 = null;
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V", line = 206)
    public static final void method3804(int arg0) {
        field9597++;
        if (class576.field7613) {
            return;
        }
        if (class344.field4718.field5425) {
            class42.field602 = ((int) class42.field602 - 65 & 0xFFFFFF80);
        } else {
            class432.field5908 += (-24.0F - class432.field5908) / 2.0F;
        }
        if (arg0 != -201) {
            method3803(126);
        }
        class576.field7613 = true;
        class457.field6204 = true;
    }
}
