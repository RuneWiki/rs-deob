import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class241 extends class89 {

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "Lqe;")
    public static class179 field4427 = class206.method1380("(U3", (byte) 123);

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "Lqe;")
    public static class179 field4429 = class206.method1380("k", (byte) -126);

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "[S")
    public static short[] field4430 = new short[256];

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    public static int field4432 = 0;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "Lqe;")
    private static class179 field4431 = class206.method1380("glow2:", (byte) -126);

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field4424 = 0;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "Lqe;")
    public static class179 field4435 = field4431;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "Lqe;")
    public static class179 field4428 = field4431;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "Lqe;")
    public static class179 field4434 = class206.method1380("oder benutzen Sie eine andere Welt)3", (byte) -45);

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "B")
    public byte field4425;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    public int field4437;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "Lqe;")
    public class179 field4426;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "Lqe;")
    public class179 field4433;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILqa;)V")
    public static final void method1559(int arg0, class175 arg1) {
        if (class13.field322 == arg1.field3151 || arg1.field3182 == -1 || arg1.field3140 != 0 || arg1.field3148 + 1 > class239.method1550(arg1.field3182, (byte) 107).field2199[arg1.field3156]) {
            int var2 = arg1.field3151 - arg1.field3136;
            int var3 = class13.field322 - arg1.field3136;
            int var4 = arg1.field3178 * 64 + arg1.field3158 * 128;
            int var5 = arg1.field3178 * 64 + arg1.field3169 * 128;
            int var6 = arg1.field3178 * 64 + arg1.field3157 * 128;
            arg1.field3159 = ((var2 - var3) * var4 + var3 * var5) / var2;
            int var7 = arg1.field3175 * 128 + arg1.field3178 * 64;
            arg1.field3198 = ((var2 - var3) * var6 + var3 * var7) / var2;
        }
        field4423++;
        if (arg1.field3196 == 0) {
            arg1.field3162 = 1024;
        }
        if (arg0 != -23761) {
            method1559(-23, null);
        }
        arg1.field3186 = 0;
        if (arg1.field3196 == 1) {
            arg1.field3162 = 1536;
        }
        if (arg1.field3196 == 2) {
            arg1.field3162 = 0;
        }
        if (arg1.field3196 == 3) {
            arg1.field3162 = 512;
        }
        arg1.field3177 = arg1.field3162;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([BI)V")
    public static final void method1560(byte[] arg0, int arg1) {
        int var2 = 0;
        if (arg1 != 64) {
            method1560(null, 0);
        }
        field4436++;
        while (true) {
            while (var2 < arg0.length) {
                int var3 = (arg0[var2++] & 0xFF) * 64 - class176.field3209;
                int var4 = (arg0[var2++] & 0xFF) * 64 - class66.field1350;
                if (var3 > 0 && var4 > 0 && var3 + 64 < class146.field2655 && var4 + 64 < class202.field3736) {
                    int var5 = var3 >> 6;
                    int var6 = class202.field3736 - var4 - 1 >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            byte var9 = arg0[var2++];
                            if (var9 != 0) {
                                if (class102.field1951[var5][var6] == null) {
                                    class102.field1951[var5][var6] = new byte[4096];
                                }
                                class102.field1951[var5][var6][(-(var8 + 1) << 6) + var7] = var9;
                                byte var10 = arg0[var2++];
                                if (class201.field3728[var5][var6] == null) {
                                    class201.field3728[var5][var6] = new byte[4096];
                                }
                                class201.field3728[var5][var6][(-(var8 + 1) << 6) + var7] = var10;
                            }
                        }
                    }
                } else {
                    for (int var11 = -4096; var11 < 0; var11++) {
                        byte var12 = arg0[var2++];
                        if (var12 != 0) {
                            var2++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(B)V")
    public static void method1561(byte arg0) {
        field4431 = null;
        field4427 = null;
        field4428 = null;
        field4434 = null;
        field4430 = null;
        int var1 = -78 / ((-arg0 - 30) / 50);
        field4429 = null;
        field4435 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method1562(String arg0, int arg1) throws ClassNotFoundException {
        field4438++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else {
            if (arg1 != 128) {
                field4427 = null;
            }
            if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }
}
