import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class518 {

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public int field7634 = 8;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public int field7639 = 16777215;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "Loq;")
    public static class242 field7636 = new class242("", 13);

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public int field7630;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public int field7633;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public int field7635;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public int field7637;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    public static int field7641;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public int field7643;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "Ljava/lang/String;")
    public static String field7631;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "Z")
    public boolean field7640;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILza;Ljk;IILta;IIB)V", line = 4)
    public static final void method3096(int arg0, class287 arg1, class450 arg2, int arg3, int arg4, class144 arg5, int arg6, int arg7, byte arg8) {
        field7632++;
        class48 var9 = class60.field698.method993(arg0, -21143);
        if (var9 != null && var9.field545 && var9.method271(class52.field606, (byte) -96)) {
            if (var9.field537 != null) {
                int[] var10 = new int[var9.field537.length];
                for (int var11 = 0; var11 < var10.length / 2; var11++) {
                    int var13;
                    if (class47.field491 == 4) {
                        var13 = (int) class143.field1907 & 0x3FFF;
                    } else {
                        var13 = (int) class143.field1907 + class299.field3928 & 0x3FFF;
                    }
                    int var14 = class456.field6812[var13];
                    int var15 = class456.field6811[var13];
                    if (class47.field491 != 4) {
                        var15 = var15 * 256 / (class420.field6099 + 256);
                        var14 = var14 * 256 / (class420.field6099 + 256);
                    }
                    var10[var11 * 2] = arg2.field6612 / 2 + (arg4 + ((arg7 + (var9.field537[var11 * 2] * 4)) * var15 + (var9.field537[var11 * 2 + 1] * 4 + arg6) * var14 >> 15));
                    var10[var11 * 2 + 1] = arg2.field6573 / 2 + arg3 - ((var9.field537[var11 * 2 + 1] * 4 + arg6) * var15 + -((var9.field537[var11 * 2] * 4 + arg7) * var14) >> 15);
                }
                class120.method723(arg1, var10, var9.field513, arg2.field6583, arg2.field6704);
                for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                    arg1.method1126(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[var12 * 2 + 2 + 1], var9.field527, 1, arg5, arg4, arg3);
                }
                arg1.method1126(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field527, 1, arg5, arg4, arg3);
            }
            class24 var16 = null;
            if (var9.field536 != -1) {
                var16 = var9.method277(0, false, arg1);
                if (var16 != null) {
                    class522.method3111(arg4, arg5, arg3, arg6, arg2, arg7, var16, (byte) 39);
                }
            }
            if (var9.field520 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method146();
                }
                class316 var18 = class161.field2096;
                class183 var19 = class328.field4362;
                if (var9.field509 == 1) {
                    var18 = class225.field3028;
                    var19 = class293.field3883;
                }
                if (var9.field509 == 2) {
                    var18 = class79.field976;
                    var19 = class121.field1570;
                }
                class184.method1073(arg6, var9.field520, arg4, arg5, arg2, (byte) -75, var19, var9.field519, var17, var18, arg3, arg7);
            }
        }
        if (arg8 < 62) {
            field7636 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lug;I)V", line = 105)
    public final void method3097(class396 arg0, int arg1) {
        field7641++;
        int var3 = -73 % ((arg1 + 59) / 47);
        while (true) {
            int var4 = arg0.method2388((byte) -111);
            if (var4 == 0) {
                return;
            }
            this.method3100(var4, (byte) -25, arg0);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 129)
    public static void method3098(int arg0) {
        if (arg0 >= 51) {
            field7636 = null;
            field7631 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZLjava/lang/Object;I)[B", line = 153)
    public static final byte[] method3099(boolean arg0, Object arg1, int arg2) {
        if (arg2 != 24160) {
            method3096(51, null, null, 18, 87, null, -20, 113, (byte) -21);
        }
        field7642++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class380.method2319(arg2 ^ 0x5E61, var3) : var3;
        } else if (arg1 instanceof class520) {
            class520 var4 = (class520) arg1;
            return var4.method1985(arg2 - 27088);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBLug;)V", line = 194)
    private final void method3100(int arg0, byte arg1, class396 arg2) {
        if (arg0 == 1) {
            this.field7634 = arg2.method2386(-23648);
        } else if (arg0 == 2) {
            this.field7640 = true;
        } else if (arg0 == 3) {
            this.field7630 = arg2.method2433((byte) 115);
            this.field7635 = arg2.method2433((byte) 115);
            this.field7637 = arg2.method2433((byte) 115);
        } else if (arg0 == 4) {
            this.field7643 = arg2.method2388((byte) -121);
        } else if (arg0 == 5) {
            this.field7633 = arg2.method2386(-23648);
        } else if (arg0 == 6) {
            this.field7639 = arg2.method2396((byte) 47);
        }
        field7638++;
        if (arg1 != -25) {
            this.method3097(null, -31);
        }
    }
}
