import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class212 {

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field3511 = 0;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field3516 = 0;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Ljj;")
    public static class168 field3513;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "[Lgb;")
    public static class191[] field3509;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method1460(boolean arg0) {
        if (!arg0) {
            field3516 = -11;
        }
        while (class354.field5652 >= 2048.0F) {
            class354.field5652 -= 2048.0F;
        }
        if (class87.field1523 < 128.0F) {
            class87.field1523 = 128.0F;
        }
        if (class87.field1523 > 383.0F) {
            class87.field1523 = 383.0F;
        }
        field3514++;
        int var1 = class33.field724 >> 7;
        while (class354.field5652 < 0.0F) {
            class354.field5652 += 2048.0F;
        }
        int var2 = class244.field4052 >> 7;
        int var3 = class21.method189((byte) 116, class244.field4052, class33.field724, class276.field4506);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class276.field4506;
                    if (var7 < 3 && (class282.field4615[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class271.field4409[var7][var5][var6] & 0xFF) * 8 + var3 - class144.field2427[var7][var5][var6];
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class284.field4656 < var9) {
            class284.field4656 += (var9 - class284.field4656) / 24;
        } else if (class284.field4656 > var9) {
            class284.field4656 += (var9 - class284.field4656) / 80;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BZ)V", line = 86)
    public static final void method1461(byte arg0, boolean arg1) {
        if (arg0 != 117) {
            method1462((int[]) null, true);
        }
        field3512++;
        if (class122.field2151 != arg1) {
            class122.field2151 = arg1;
            class335.method2358((byte) -33);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([IZ)[I", line = 103)
    public static final int[] method1462(int[] arg0, boolean arg1) {
        field3510++;
        if (arg0 == null) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            class89.method685(arg0, 0, var2, 0, arg0.length);
            return arg1 ? (int[]) null : var2;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III[B)I", line = 124)
    public static final int method1463(int arg0, int arg1, int arg2, byte[] arg3) {
        field3519++;
        int var4 = -1;
        for (int var5 = arg2; var5 < arg1; var5++) {
            var4 = class13.field386[(arg3[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        int var6 = ~var4;
        if (arg0 != -50) {
            field3509 = (class191[]) null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 147)
    public static void method1464(int arg0) {
        field3513 = null;
        if (arg0 != 0) {
            method1467((Object) null, false, (byte) 80);
        }
        field3509 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 164)
    public static final void method1465(int arg0, String arg1, boolean arg2) {
        field3515++;
        if (arg1 == null) {
            return;
        }
        if (class317.field5171 >= 100) {
            class172.method1225(class19.field508, 0);
            return;
        }
        if (arg0 != 30597) {
            field3511 = -35;
        }
        String var3 = class310.method2259(arg1, -22);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class317.field5171; var4++) {
            String var5 = class310.method2259(class306.field4974[var4], -98);
            if (var5 != null && var5.equals(var3)) {
                class172.method1225(arg1 + class180.field2959, 0);
                return;
            }
            if (class178.field2945[var4] != null) {
                String var6 = class310.method2259(class178.field2945[var4], -35);
                if (var6 != null && var6.equals(var3)) {
                    class172.method1225(arg1 + class180.field2959, arg0 ^ 0x7785);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < class151.field2550; var7++) {
            String var8 = class310.method2259(class91.field1610[var7], -126);
            if (var8 != null && var8.equals(var3)) {
                class172.method1225(class47.field951 + arg1 + class111.field2034, 0);
                return;
            }
            if (class18.field499[var7] != null) {
                String var9 = class310.method2259(class18.field499[var7], arg0 - 30714);
                if (var9 != null && var9.equals(var3)) {
                    class172.method1225(class47.field951 + arg1 + class111.field2034, 0);
                    return;
                }
            }
        }
        if (class310.method2259(class96.field1750.field1779, -47).equals(var3)) {
            class172.method1225(class339.field5378, arg0 - 30597);
            return;
        }
        class349.field5580++;
        class51.field1038.method291((byte) 122, 68);
        class51.field1038.method1027(class148.method1066(arg1, (byte) 57) + 1, arg0 + -50971);
        class51.field1038.method1012(arg1, (byte) 51);
        class51.field1038.method1027(arg2 ? 1 : 0, -20374);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)V", line = 264)
    public static final void method1466(int arg0, byte arg1) {
        field3517++;
        class259.method1821(class259.field4239, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        if (arg1 != -3) {
            method1461((byte) 92, true);
        }
        class259.method1814(-50.0F, -60.0F, -50.0F);
        class259.method1815(class259.field4243, 0, false);
        class259.method1822();
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/Object;ZB)[B", line = 283)
    public static final byte[] method1467(Object arg0, boolean arg1, byte arg2) {
        field3518++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) ((byte[]) arg0);
            return arg1 ? class76.method582(var3, -1) : var3;
        } else {
            if (arg2 != 76) {
                field3509 = (class191[]) null;
            }
            if (!(arg0 instanceof class61)) {
                throw new IllegalArgumentException();
            }
            class61 var4 = (class61) arg0;
            return var4.method498((byte) -69);
        }
    }
}
