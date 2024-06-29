import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class307 extends class35 {

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public int field4477 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public int field4481 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public int field4483 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public int field4480 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public int field4482 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public int field4486 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public int field4479 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public int field4491 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "Lrr;")
    public class198 field4487;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field4484 = new String[200];

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public static int field4490 = 0;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
    public static void method2098(boolean arg0) {
        if (!arg0) {
            field4484 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIII)V")
    public static final void method2099(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4485++;
        if (arg4 == 22721 && class308.field4507 <= arg1 && arg1 <= class383.field5497) {
            int var5 = class102.method843(arg0, class278.field4184, class185.field2727, 0);
            int var6 = class102.method843(arg3, class278.field4184, class185.field2727, arg4 ^ 0x58C1);
            class417.method2614(390087964, arg2, arg1, var6, var5);
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
    public static final void method2100(int arg0) {
        field4489++;
        int var1 = class150.field2295.method1448(class391.field5712, -20814);
        if (arg0 != 21633) {
            field4484 = null;
        }
        for (class278 var2 = (class278) class276.field4153.method157((byte) -125); var2 != null; var2 = (class278) class276.field4153.method145(63)) {
            int var6 = class144.method1137(101, var2);
            if (var1 < var6) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class389.field5591 * 16 + 21;
        int var4 = class129.field2111 - (var1 / 2);
        if (class113.field1819 < var1 + var4) {
            var4 = class113.field1819 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class291.field4327;
        if (var3 + var5 > class277.field4170) {
            var5 = class277.field4170 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        class169.field2512 = var4;
        class84.field1365 = true;
        class32.field452 = var1;
        class63.field1024 = var5;
        class305.field4451 = (class369.field5242 ? 26 : 22) + class389.field5591 * 16;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II[Ljava/lang/String;[SI)V")
    public static final void method2101(int arg0, int arg1, String[] arg2, short[] arg3, int arg4) {
        if (arg1 != 8) {
            field4490 = 32;
        }
        field4488++;
        if (arg0 <= arg4) {
            return;
        }
        int var5 = (arg4 + arg0) / 2;
        int var6 = arg4;
        String var7 = arg2[var5];
        arg2[var5] = arg2[arg0];
        arg2[arg0] = var7;
        short var8 = arg3[var5];
        arg3[var5] = arg3[arg0];
        arg3[arg0] = var8;
        for (int var9 = arg4; var9 < arg0; var9++) {
            if (var7 == null || arg2[var9] != null && arg2[var9].compareTo(var7) < (var9 & 0x1)) {
                String var10 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6] = var10;
                short var11 = arg3[var9];
                arg3[var9] = arg3[var6];
                arg3[var6++] = var11;
            }
        }
        arg2[arg0] = arg2[var6];
        arg2[var6] = var7;
        arg3[arg0] = arg3[var6];
        arg3[var6] = var8;
        method2101(var6 - 1, 8, arg2, arg3, arg4);
        method2101(arg0, 8, arg2, arg3, var6 + 1);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method2102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        class382.field5466 = arg3;
        int var7 = -92 % ((arg6 - 53) / 58);
        class162.field2452 = arg0;
        class358.field5110 = arg5;
        class322.field4647 = arg2;
        field4478++;
        class11.field130 = arg1;
        class60.field972 = arg4;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)Z")
    public final boolean method2103(int arg0, int arg1, int arg2) {
        field4476++;
        if (this.field4482 <= arg1 && this.field4486 >= arg1 && this.field4483 <= arg2 && this.field4491 >= arg2) {
            return true;
        } else if (arg1 >= this.field4480 && this.field4479 >= arg1 && arg2 >= this.field4477 && this.field4481 >= arg2) {
            return true;
        } else {
            if (arg0 != -13297) {
                method2098(true);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lrr;)V")
    public class307(class198 arg0) {
        this.field4487 = arg0;
    }
}
