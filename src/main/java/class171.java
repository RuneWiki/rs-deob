import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class171 extends class296 {

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "I")
    private int field2503;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    private int field2496;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
    private int field2501;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
    private int field2502;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    private int field2495;

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "Lna;")
    private class211 field2506;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "I")
    private int field2500;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "Lqu;")
    public static class219 field2498 = new class219(78, 16);

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "I")
    public static int field2505 = 0;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "Lea;")
    private class15 field2491;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "Z")
    public static boolean field2494;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "[Lo;")
    public static class139[] field2493;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIII)V")
    public static final void method1079(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2497++;
        for (int var6 = arg1; var6 <= arg0; var6++) {
            class280.method1888(arg2, arg5, (byte) 82, class103.field1521[var6], arg4);
        }
        if (arg3 != 0) {
            method1081((byte) -2);
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)Lea;")
    public final class15 method1080(byte arg0) {
        field2499++;
        if (arg0 < 88) {
            method1082(-4, null);
        }
        if (this.field2491 == null) {
            class498.field7487[5] = this.field2501;
            class199 var2 = this.field2506.field7480;
            class498.field7487[1] = this.field2502;
            class498.field7487[4] = this.field2500;
            class498.field7487[3] = this.field2495;
            class498.field7487[0] = this.field2503;
            class498.field7487[2] = this.field2496;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1364((byte) 53, class498.field7487[var5])) {
                    return null;
                }
                class476 var7 = var2.method1366(class498.field7487[var5], (byte) -127);
                int var8 = var7.field7295 ? 64 : 128;
                if (var7.field7270 > 0) {
                    var3 = true;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class368.field5677[var6] = var2.method1367(false, 1.0F, class498.field7487[var6], var4, -25218, var4);
            }
            this.field2491 = new class15(this.field2506, 6407, var4, var3, class368.field5677);
        }
        return this.field2491;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)V")
    public static void method1081(byte arg0) {
        if (arg0 == 113) {
            field2498 = null;
            field2493 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILhw;)Lre;")
    public static final class228 method1082(int arg0, class208 arg1) {
        field2492++;
        if (arg0 != 0) {
            method1081((byte) -105);
        }
        return new class228(arg1.method1456(13329), arg1.method1456(arg0 + 13329), arg1.method1456(13329), arg1.method1456(13329), arg1.method1452(3), arg1.method1445(26));
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lna;IIIIII)V")
    public class171(class211 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2503 = arg1;
        this.field2496 = arg3;
        this.field2501 = arg6;
        this.field2502 = arg2;
        this.field2495 = arg4;
        this.field2506 = arg0;
        this.field2500 = arg5;
    }
}
