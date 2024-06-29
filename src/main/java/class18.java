import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class18 {

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field215 = 0;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Ltd;")
    public static class72 field213 = new class72(0, -1);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)Ljh;")
    public static final class284 method121(int arg0, int arg1, int arg2) {
        class49 var3 = class90.field1382[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field639; var4++) {
            class284 var5 = var3.field643[var4];
            if ((var5.field4497 >> 29 & 0x3L) == 2L && var5.field4494 == arg1 && var5.field4498 == arg2) {
                class268.method1821(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILdl;II)[Lkj;")
    public static final class145[] method122(int arg0, class123 arg1, int arg2, int arg3) {
        field216++;
        int var4 = -46 % ((arg0 + 7) / 58);
        return class214.method1445((byte) 79, arg1, arg3, arg2) ? class118.method782((byte) 2) : null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public static void method123(byte arg0) {
        field213 = null;
        if (arg0 != -121) {
            field219 = 105;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILef;IIIIII)V")
    public static final void method124(int arg0, class214 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field217++;
        if (class125.field1865) {
            class23.field289 = 32;
        } else {
            class23.field289 = 0;
        }
        class125.field1865 = false;
        if (class106.field1638 != 0) {
            if (arg4 <= arg6 && arg6 < (arg4 + 16) && arg7 <= arg5 && arg5 < (arg7 + 16)) {
                arg1.field3455 -= 4;
                class55.method397(0, arg1);
            } else if (arg6 >= arg4 && arg4 + 16 > arg6 && arg5 >= (arg7 + arg2 - 16) && arg5 < (arg7 + arg2)) {
                arg1.field3455 += 4;
                class55.method397(0, arg1);
            } else if ((arg4 - class23.field289) <= arg6 && arg6 < (class23.field289 + arg4 + 16) && arg5 >= arg7 + 16 && (arg7 + arg2 - 16) > arg5) {
                int var8 = (arg2 - 32) * arg2 / arg3;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg5 - arg7 - var8 / 2 - 16;
                int var10 = arg2 - var8 - 32;
                arg1.field3455 = (arg3 - arg2) * var9 / var10;
                class55.method397(arg0 + 19103, arg1);
                class125.field1865 = true;
            }
        }
        if (arg0 != -19103) {
            field219 = -47;
        }
        if (class232.field3728 == 0) {
            return;
        }
        int var11 = arg1.field3473;
        if (arg6 >= (arg4 - var11) && arg7 <= arg5 && arg6 < arg4 + 16 && (arg2 + arg7) >= arg5) {
            arg1.field3455 += class232.field3728 * 45;
            class55.method397(0, arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILdl;)V")
    public static final void method125(int arg0, class123 arg1) {
        class282.field4468 = arg1;
        field214++;
        if (arg0 != 1) {
            method122(-36, (class123) null, -11, -33);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BJ)V")
    public static final void method126(byte arg0, long arg1) {
        field218++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 <= 92) {
            field213 = null;
        }
        for (int var3 = 0; var3 < class141.field2066; var3++) {
            if (class46.field590[var3] == arg1) {
                class36.field463++;
                class141.field2066--;
                for (int var4 = var3; var4 < class141.field2066; var4++) {
                    class46.field590[var4] = class46.field590[var4 + 1];
                    class139.field2053[var4] = class139.field2053[var4 + 1];
                }
                class111.field1681 = class141.field2067;
                class13.field165.method892(100, (byte) -114);
                class13.field165.method206(-5061, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII)I")
    public static final int method127(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 / arg3;
        field212++;
        int var5 = arg2 / arg3;
        int var6 = arg0 & arg3 - 1;
        int var7 = arg3 - 1 & arg2;
        int var8 = class285.method1901(true, var5, var4);
        int var9 = class285.method1901(true, var5, var4 + 1);
        int var10 = class285.method1901(true, var5 + 1, var4);
        int var11 = class285.method1901(true, var5 + 1, var4 + 1);
        int var12 = class144.method959(var9, arg3, true, var8, var6);
        int var13 = class144.method959(var11, arg3, true, var10, var6);
        if (arg1 != 0) {
            field215 = 31;
        }
        return class144.method959(var13, arg3, true, var12, var7);
    }
}
