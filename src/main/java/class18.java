import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class18 extends class128 {

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public int field212 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public int field216 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public int field211 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    public int field220 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public int field221 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
    public int field225 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public int field223 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
    public int field224 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "Ljh;")
    public class269 field219;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "[Lom;")
    public static class166[] field214 = new class166[4];

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field217 = 0;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V")
    public static final void method88(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class183.field3013; var3++) {
            for (int var4 = 0; var4 < class96.field1548; var4++) {
                for (int var5 = 0; var5 < class59.field972; var5++) {
                    class151 var6 = class218.field3584[var3][var4][var5];
                    if (var6 != null) {
                        class209 var7 = var6.field2352;
                        if (var7 != null && var7.field3305.method11()) {
                            class208.method1454(var7.field3305, var3, var4, var5, 1, 1);
                            if (var7.field3316 != null && var7.field3316.method11()) {
                                class208.method1454(var7.field3316, var3, var4, var5, 1, 1);
                                var7.field3305.method16(var7.field3316, 0, 0, 0, false);
                                var7.field3316 = var7.field3316.method17(arg0, arg1, arg2);
                            }
                            var7.field3305 = var7.field3305.method17(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field2357; var8++) {
                            class179 var10 = var6.field2347[var8];
                            if (var10 != null && var10.field2932.method11()) {
                                class208.method1454(var10.field2932, var3, var4, var5, var10.field2918 + 1 - var10.field2931, var10.field2925 - var10.field2915 + 1);
                                var10.field2932 = var10.field2932.method17(arg0, arg1, arg2);
                            }
                        }
                        class188 var9 = var6.field2364;
                        if (var9 != null && var9.field3057.method11()) {
                            class268.method1802(var9.field3057, var3, var4, var5);
                            var9.field3057 = var9.field3057.method17(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg0 >= class82.field1374 && arg2 <= class259.field4188 && class85.field1409 <= arg1 && class234.field3774 >= arg5) {
            if (arg3 == 1) {
                class286.method1908(arg1, arg0, arg4, arg2, 122, arg5);
            } else {
                class52.method363(arg1, arg2, arg3, arg0, 0, arg4, arg5);
            }
        } else if (arg3 == 1) {
            class15.method72(arg0, arg4, arg2, 0, arg5, arg1);
        } else {
            class101.method690(arg2, arg1, arg4, arg3, arg0, 90, arg5);
        }
        if (!arg6) {
            field214 = null;
        }
        field222++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static void method90(byte arg0) {
        field214 = null;
        if (arg0 <= 61) {
            method91((String) null, (byte) -111, 36, true);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/String;BIZ)I")
    public static final int method91(String arg0, byte arg1, int arg2, boolean arg3) {
        field213++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        int var8 = 0;
        if (arg1 > -106) {
            return 80;
        }
        while (var8 < var7) {
            label83: {
                char var9 = arg0.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        break label83;
                    }
                    if (var9 == '+' && arg3) {
                        break label83;
                    }
                }
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else if (var9 >= 'a' && var9 <= 'z') {
                    var11 = var9 - 'W';
                } else {
                    throw new NumberFormatException();
                }
                if (arg2 <= var11) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg2 * var6 + var11;
                if ((var10 / arg2) != var6) {
                    throw new NumberFormatException();
                }
                var6 = var10;
                var5 = true;
            }
            var8++;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
    public static final void method92(int arg0, int arg1) {
        class175 var2 = class182.method1317(1, arg1, false);
        field218++;
        if (arg0 <= -126) {
            var2.method1278((byte) -115);
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Ljh;)V")
    public class18(class269 arg0) {
        this.field219 = arg0;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIB)Z")
    public final boolean method93(int arg0, int arg1, byte arg2) {
        field215++;
        if (arg1 >= this.field225 && this.field216 >= arg1 && this.field212 <= arg0 && arg0 <= this.field220) {
            return true;
        } else if (arg1 >= this.field224 && arg1 <= this.field211 && this.field221 <= arg0 && arg0 <= this.field223) {
            return true;
        } else {
            int var4 = -69 % ((-arg2 - 46) / 33);
            return false;
        }
    }
}
