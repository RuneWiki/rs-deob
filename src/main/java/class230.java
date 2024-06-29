import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class230 {

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "[I")
    private int[] field4006;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field4003 = 0;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Lha;")
    public static class46 field4004 = class271.method1828("Bitte entfernen Sie ", -46);

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "Lha;")
    private static class46 field4011 = class271.method1828(" has logged in)3", -46);

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Lha;")
    public static class46 field4009 = field4011;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "Lpi;")
    public static class181 field4002;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1561(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class109.field2037[arg0][var8][var14] == -class61.field1027) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class119.field2228[arg0][arg1][arg3] + arg5;
            if (!class128.method993(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class128.method993(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class128.method993(var9, var11, var13)) {
                return false;
            } else if (class128.method993(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class273.method1843(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class128.method993(var6 + 1, class119.field2228[arg0][arg1][arg3] + arg5, var7 + 1) && class128.method993(var6 + 128 - 1, class119.field2228[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class128.method993(var6 + 128 - 1, class119.field2228[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class128.method993(var6 + 1, class119.field2228[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)I")
    public final int method1562(int arg0, int arg1) {
        int var3 = 89 / ((-arg0 - 78) / 37);
        int var4 = (this.field4006.length >> 1) - 1;
        field4005++;
        int var5 = var4 & arg1;
        while (true) {
            int var6 = this.field4006[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field4006[var5 + var5] == arg1) {
                return var6;
            }
            var5 = var5 + 1 & var4;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
    public static final void method1563(boolean arg0) {
        class147.field2651.method287(8);
        int var1 = class147.field2651.method283((byte) 0, 1);
        field4008++;
        if (var1 == 0) {
            return;
        }
        int var2 = class147.field2651.method283((byte) 0, 2);
        if (var2 == 0) {
            class93.field1758[class111.field2082++] = 2047;
        } else if (var2 == 1) {
            int var3 = class147.field2651.method283((byte) 0, 3);
            class277.field4824.method1062(false, false, var3);
            int var4 = class147.field2651.method283((byte) 0, 1);
            if (var4 == 1) {
                class93.field1758[class111.field2082++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class147.field2651.method283((byte) 0, 3);
            class277.field4824.method1062(true, false, var5);
            int var6 = class147.field2651.method283((byte) 0, 3);
            class277.field4824.method1062(true, false, var6);
            int var7 = class147.field2651.method283((byte) 0, 1);
            if (var7 == 1) {
                class93.field1758[class111.field2082++] = 2047;
            }
        } else {
            if (arg0) {
                field4003 = 40;
            }
            if (var2 == 3) {
                class135.field2450 = class147.field2651.method283((byte) 0, 2);
                int var8 = class147.field2651.method283((byte) 0, 1);
                int var9 = class147.field2651.method283((byte) 0, 7);
                int var10 = class147.field2651.method283((byte) 0, 7);
                int var11 = class147.field2651.method283((byte) 0, 1);
                if (var11 == 1) {
                    class93.field1758[class111.field2082++] = 2047;
                }
                class277.field4824.method643(var8 == 1, var10, 27512, var9);
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "([I)V")
    public class230(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field4006 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field4006[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field4006[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field4006[var5 + var5] = arg0[var4];
            this.field4006[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILjava/awt/Component;IZLrc;)Le;")
    public static final class155 method1564(int arg0, Component arg1, int arg2, boolean arg3, class9 arg4) {
        field4010++;
        if (class265.field4606 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class155 var5 = (class155) Class.forName("fb").getDeclaredConstructor().newInstance();
                var5.field2779 = arg0;
                var5.field2754 = new int[(class60.field997 ? 2 : 1) * 256];
                var5.method98(arg1);
                var5.field2774 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field2774 > 16384) {
                    var5.field2774 = 16384;
                }
                var5.method101(var5.field2774);
                if (class124.field2287 > 0 && client.field4696 == null) {
                    client.field4696 = new class251();
                    client.field4696.field4436 = arg4;
                    arg4.method36(client.field4696, 73, class124.field2287);
                }
                if (client.field4696 != null) {
                    if (client.field4696.field4433[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    client.field4696.field4433[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class136 var6 = new class136(arg4, arg2);
                    var6.field2779 = arg0;
                    var6.field2754 = new int[(class60.field997 ? 2 : 1) * 256];
                    var6.method98(arg1);
                    var6.field2774 = 16384;
                    if (arg3) {
                        method1563(true);
                    }
                    var6.method101(var6.field2774);
                    if (class124.field2287 > 0 && client.field4696 == null) {
                        client.field4696 = new class251();
                        client.field4696.field4436 = arg4;
                        arg4.method36(client.field4696, 85, class124.field2287);
                    }
                    if (client.field4696 != null) {
                        if (client.field4696.field4433[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        client.field4696.field4433[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class155();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method1565(int arg0) {
        field4004 = null;
        field4009 = null;
        if (arg0 != 8813) {
            method1563(true);
        }
        field4002 = null;
        field4011 = null;
    }
}
