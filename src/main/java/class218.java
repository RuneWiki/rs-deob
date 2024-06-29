import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class218 {

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
    private int field3068;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "[Lsk;")
    private class170[] field3067;

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "Lka;")
    public static class408 field3060 = new class408(5);

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "J")
    private long field3066;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "Lsk;")
    private class170 field3062;

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "Lgl;")
    public static class340 field3064;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lgg;IIIII)V", line = 7)
    public static final void method1447(class313 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field4247 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                int var8 = class296.field4069[arg1][var6][var7];
                int var9 = 0;
                while (true) {
                    label51: while (true) {
                        if (var9 > 24) {
                            continue label56;
                        }
                        int var10 = var8 >>> var9 & 0xFF;
                        if (var10 <= 0) {
                            continue label56;
                        }
                        class271 var11 = class122.field1838[var10 - 1];
                        for (int var12 = 0; var12 < arg0.field4247; var12++) {
                            if (arg0.field4242[var12] == var11) {
                                var9 += 8;
                                continue label51;
                            }
                        }
                        arg0.field4242[arg0.field4247++] = var11;
                        if (arg0.field4247 == 4) {
                            break label58;
                        }
                        var9 += 8;
                    }
                }
            }
        }
        for (int var13 = arg0.field4247; var13 < 4; var13++) {
            arg0.field4242[var13] = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)Lsk;", line = 73)
    public final class170 method1448(boolean arg0) {
        field3069++;
        if (this.field3062 == null) {
            return null;
        }
        class170 var2 = this.field3067[(int) ((long) (this.field3068 - 1) & this.field3066)];
        while (this.field3062 != var2) {
            if (this.field3062.field2411 == this.field3066) {
                class170 var3 = this.field3062;
                this.field3062 = this.field3062.field2409;
                return var3;
            }
            this.field3062 = this.field3062.field2409;
        }
        if (arg0) {
            this.field3062 = null;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V", line = 107)
    public static void method1449(int arg0) {
        if (arg0 != 0) {
            method1449(-22);
        }
        field3060 = null;
        field3064 = null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(JB)Lsk;", line = 118)
    public final class170 method1450(long arg0, byte arg1) {
        field3065++;
        this.field3066 = arg0;
        class170 var4 = this.field3067[(int) (arg0 & (long) (this.field3068 - 1))];
        if (arg1 < 78) {
            return null;
        }
        for (this.field3062 = var4.field2409; this.field3062 != var4; this.field3062 = this.field3062.field2409) {
            if (this.field3062.field2411 == arg0) {
                class170 var5 = this.field3062;
                this.field3062 = this.field3062.field2409;
                return var5;
            }
        }
        this.field3062 = null;
        return null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(JLsk;I)V", line = 147)
    public final void method1451(long arg0, class170 arg1, int arg2) {
        if (arg1.field2408 != null) {
            arg1.method1213((byte) 106);
        }
        int var5 = -54 / ((-arg2 - 47) / 34);
        field3058++;
        class170 var6 = this.field3067[(int) (arg0 & (long) (this.field3068 - 1))];
        arg1.field2408 = var6.field2408;
        arg1.field2409 = var6;
        arg1.field2408.field2409 = arg1;
        arg1.field2411 = arg0;
        arg1.field2409.field2408 = arg1;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIII)V", line = 178)
    public static final void method1452(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg3; var5 < class58.field751; var5++) {
            Rectangle var6 = class451.field6479[var5];
            if (var6.x + var6.width > arg2 && arg0 + arg2 > var6.x && var6.y + var6.height > arg4 && arg4 + arg1 > var6.y) {
                class53.field680[var5] = true;
            }
        }
        field3061++;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)Lib;", line = 205)
    public static final class249 method1453(int arg0) {
        field3059++;
        if (arg0 != 7868) {
            method1447((class313) null, -32, -49, -91, -47, -71);
        }
        try {
            return (class249) Class.forName("ro").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(I)V", line = 225)
    public class218(int arg0) {
        this.field3068 = arg0;
        this.field3067 = new class170[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class170 var3 = this.field3067[var2] = new class170();
            var3.field2408 = var3;
            var3.field2409 = var3;
        }
    }
}
