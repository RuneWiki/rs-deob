import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class577 {

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public static int field7864 = -1;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "[I")
    public static int[] field7871 = new int[8];

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "B")
    public byte field7852;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "B")
    public byte field7855;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "B")
    public byte field7857;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "B")
    public byte field7861;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "B")
    public byte field7865;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "B")
    public byte field7867;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "B")
    public byte field7874;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field7851;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field7856;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public int field7860;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public static int field7866;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
    public int field7869;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
    public int field7876;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "Luq;")
    public static class172 field7862;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "Lef;")
    public static class513 field7875;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "S")
    public short field7854;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "Z")
    public boolean field7853;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "Z")
    public boolean field7858;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "Z")
    public boolean field7859;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "Z")
    public boolean field7863;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "Z")
    public boolean field7868;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "Z")
    public boolean field7870;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "Z")
    public boolean field7872;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "Z")
    public boolean field7873;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lofa;IIZ)V", line = 3)
    public static final void method3270(class347 arg0, int arg1, int arg2, boolean arg3) {
        field7851++;
        if (class506.field7094) {
            class560 var4 = class503.field7077 == -1 ? null : class315.field4447.method3515(class503.field7077, 0);
            if (client.method2055(arg0).method2118((byte) -36) && (class384.field5578 & 0x20) != 0 && (var4 == null || arg0.method2226(true, var4.field7679, class503.field7077) != var4.field7679)) {
                class272.field3963++;
                class26.method147(arg0.field4956, true, class385.field5594, 0L, 57, arg0.field5003, class545.field7534 + " -> " + arg0.field5036, (long) (arg0.field5003 | arg0.field4955 << 0), false, arg0.field4955, -1, class182.field2384, false);
            }
        }
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class12.method83(-114, var5, arg0);
            if (var9 != null) {
                class26.method147(arg0.field4956, true, var9, (long) (var5 + 1), 1002, arg0.field5003, arg0.field5036, (long) (arg0.field5003 | arg0.field4955 << 0), false, arg0.field4955, -1, class230.method1447(var5, (byte) -116, arg0), false);
                class325.field4618++;
            }
        }
        String var6 = class87.method699(-18920, arg0);
        if (var6 != null) {
            class502.field7072++;
            class26.method147(arg0.field4956, true, var6, 0L, 17, arg0.field5003, arg0.field5036, (long) (arg0.field4955 << 0 | arg0.field5003), false, arg0.field4955, -1, arg0.field4902, false);
        }
        if (!arg3) {
            field7864 = -114;
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class12.method83(-125, var7, arg0);
            if (var8 != null) {
                class26.method147(arg0.field4956, true, var8, (long) (var7 + 1), 19, arg0.field5003, arg0.field5036, (long) (arg0.field5003 | arg0.field4955 << 0), false, arg0.field4955, -1, class230.method1447(var7, (byte) -116, arg0), false);
                class325.field4618++;
            }
        }
        if (!client.method2055(arg0).method2110(1)) {
            return;
        }
        if (arg0.field4990 == null) {
            class26.method147(arg0.field4956, true, class58.field707.method365(class55.field647, (byte) 54), 0L, 16, arg0.field5003, "", (long) (arg0.field4955 << 0 | arg0.field5003), false, arg0.field4955, -1, -1, false);
        } else {
            class26.method147(arg0.field4956, true, arg0.field4990, 0L, 16, arg0.field5003, "", (long) (arg0.field4955 << 0 | arg0.field5003), false, arg0.field4955, -1, -1, false);
        }
        class761.field10460++;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILpja;)[I", line = 100)
    public static final int[] method3271(int arg0, class43 arg1) {
        field7856++;
        class254 var2 = new class254(518);
        int[] var3 = new int[4];
        for (int var4 = 0; var4 < 4; var4++) {
            var3[var4] = (int) (Math.random() * 9.9999999E7D);
        }
        var2.method1725(10, 62);
        var2.method1686(68, var3[0]);
        var2.method1686(arg0 ^ 0xFFFFD309, var3[1]);
        var2.method1686(arg0 ^ 0x2CED, var3[2]);
        var2.method1686(127, var3[3]);
        for (int var5 = 0; var5 < 10; var5++) {
            var2.method1686(-79, (int) (Math.random() * 9.9999999E7D));
        }
        var2.method1733((int) (Math.random() * 9.9999999E7D), -32466);
        var2.method1727(class784.field10781, (byte) 79, class85.field1205);
        arg1.field457.method1716(var2.field3789, var2.field3725, 0, true);
        if (arg0 != -11416) {
            field7862 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIC)I", line = 138)
    public static final int method3272(int arg0, int arg1, char arg2) {
        field7866++;
        int var3 = arg2 << 4;
        int var4 = 55 / ((arg0 + 51) / 38);
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            char var5 = Character.toLowerCase(arg2);
            var3 = (var5 << 4) + 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V", line = 158)
    public static void method3273(byte arg0) {
        field7871 = null;
        field7862 = null;
        int var1 = -48 % ((arg0 - 12) / 49);
        field7875 = null;
    }
}
