import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class305 {

    @OriginalMember(owner = "client!oaa", name = "i", descriptor = "Llda;")
    public class513 field4189 = new class513();

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "[B")
    public static byte[] field4187;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!oaa", name = "h", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!oaa", name = "j", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!oaa", name = "l", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!oaa", name = "k", descriptor = "Llda;")
    private class513 field4191;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)Llda;")
    public final class513 method1946(int arg0) {
        field4181++;
        class513 var2 = this.field4191;
        if (this.field4189 == var2) {
            this.field4191 = null;
            return null;
        } else if (arg0 == -6974) {
            this.field4191 = var2.field7006;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)V")
    public static void method1947(byte arg0) {
        field4187 = null;
        if (arg0 < 53) {
            method1952(-119);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Z)Llda;")
    public final class513 method1948(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field4184++;
        class513 var2 = this.field4189.field7006;
        if (this.field4189 == var2) {
            return null;
        } else {
            var2.method2942(false);
            return var2;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(B)I")
    public final int method1949(byte arg0) {
        field4186++;
        int var2 = 0;
        class513 var3 = this.field4189.field7006;
        if (arg0 != -29) {
            return -50;
        }
        while (this.field4189 != var3) {
            var2++;
            var3 = var3.field7006;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)V")
    public final void method1950(int arg0) {
        if (arg0 != 0) {
            this.method1953((byte) -95, null);
        }
        field4185++;
        while (true) {
            class513 var2 = this.field4189.field7006;
            if (this.field4189 == var2) {
                this.field4191 = null;
                return;
            }
            var2.method2942(false);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "(I)Llda;")
    public final class513 method1951(int arg0) {
        field4182++;
        class513 var2 = this.field4189.field7006;
        if (this.field4189 == var2) {
            this.field4191 = null;
            return null;
        }
        this.field4191 = var2.field7006;
        if (arg0 != -723780560) {
            this.method1950(29);
        }
        return var2;
    }

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "(I)V")
    public static final void method1952(int arg0) {
        field4192++;
        for (class430 var1 = (class430) class524.field7128.method335(-29067); var1 != null; var1 = (class430) class524.field7128.method336(88)) {
            if (var1.field5864) {
                var1.field5864 = false;
            } else {
                class768.method4227(-18974, var1.field5867);
            }
        }
        if (arg0 >= -54) {
            field4187 = null;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BLlda;)V")
    public final void method1953(byte arg0, class513 arg1) {
        field4188++;
        if (arg1.field7004 != null) {
            arg1.method2942(false);
        }
        if (arg0 == 83) {
            arg1.field7004 = this.field4189.field7004;
            arg1.field7006 = this.field4189;
            arg1.field7004.field7006 = arg1;
            arg1.field7006.field7004 = arg1;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "()V")
    public class305() {
        this.field4189.field7004 = this.field4189;
        this.field4189.field7006 = this.field4189;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZLji;ZB)V")
    public static final void method1954(boolean arg0, class637 arg1, boolean arg2, byte arg3) {
        field4183++;
        int var4 = arg1.field8789;
        int var5 = (int) arg1.field2528;
        if (arg3 != -24) {
            field4190 = -99;
        }
        arg1.method1207(arg3 ^ 0xFFFFFF84);
        if (arg0) {
            class657.method3694(var4, true);
        }
        class25.method166(var4, arg3 - 691366136);
        class17 var6 = class379.method2309(var5, 192);
        if (var6 != null) {
            class410.method2433(var6, 14049);
        }
        class405.method2424(true);
        if (!arg2 && class359.field4911 != -1) {
            class478.method2739(1, false, class359.field4911);
        }
        class194 var7 = new class194(class186.field2881);
        for (class637 var8 = (class637) var7.method1406((byte) 121); var8 != null; var8 = (class637) var7.method1407((byte) -18)) {
            if (!var8.method1208(arg3 ^ 0x65)) {
                var8 = (class637) var7.method1406((byte) 121);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field8790 == 3) {
                int var9 = (int) var8.field2528;
                if ((var9 >>> 16) == var4) {
                    method1954(true, var8, arg2, (byte) -24);
                }
            }
        }
    }

    static {
        int var0 = 0;
        field4187 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field4187[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }
}
