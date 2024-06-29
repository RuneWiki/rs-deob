import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class317 extends class70 {

    @OriginalMember(owner = "client!ft", name = "r", descriptor = "I")
    private int field4529;

    @OriginalMember(owner = "client!ft", name = "s", descriptor = "I")
    private int field4530;

    @OriginalMember(owner = "client!ft", name = "m", descriptor = "I")
    private int field4524;

    @OriginalMember(owner = "client!ft", name = "w", descriptor = "I")
    private int field4534;

    @OriginalMember(owner = "client!ft", name = "t", descriptor = "I")
    private int field4531;

    @OriginalMember(owner = "client!ft", name = "p", descriptor = "Lmj;")
    private class114 field4527;

    @OriginalMember(owner = "client!ft", name = "q", descriptor = "I")
    private int field4528;

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "Lvt;")
    public static class768 field4523 = new class768();

    @OriginalMember(owner = "client!ft", name = "x", descriptor = "Lgca;")
    public static class705 field4535 = new class705();

    @OriginalMember(owner = "client!ft", name = "z", descriptor = "Z")
    public static boolean field4537 = true;

    @OriginalMember(owner = "client!ft", name = "n", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!ft", name = "o", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!ft", name = "v", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!ft", name = "y", descriptor = "J")
    public static long field4536;

    @OriginalMember(owner = "client!ft", name = "u", descriptor = "Lwf;")
    private class540 field4532;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)V")
    public static void method1927(int arg0) {
        field4535 = null;
        field4523 = null;
        if (arg0 != 15601) {
            method1930(78, -19, -91, null, null);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(III)Z")
    public static final boolean method1928(int arg0, int arg1, int arg2) {
        if (arg2 != 29381) {
            field4523 = null;
        }
        field4525++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "(I)V")
    public static final void method1929(int arg0) {
        field4533++;
        if (class141.field2306 == 7) {
            class477.method2832(false, (byte) -83);
        } else {
            class94.field1347 = class600.field8551;
            class600.field8551 = null;
            class75.method690(true, arg0);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIILww;Lww;)V")
    public static final void method1930(int arg0, int arg1, int arg2, class338 arg3, class338 arg4) {
        class172 var5 = class134.method1114(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field2593 = arg3;
        var5.field2600 = arg4;
        int var6 = class678.field9594 == class454.field6207 ? 1 : 0;
        if (!arg3.method1170(16383)) {
            arg3.field10360 = class407.field5602[var6];
            class407.field5602[var6] = arg3;
        } else if (arg3.method1175((byte) 93)) {
            arg3.field10360 = class277.field3997[var6];
            class277.field3997[var6] = arg3;
        } else {
            arg3.field10360 = class5.field74[var6];
            class5.field74[var6] = arg3;
            class87.field1297 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method1170(16383)) {
            if (arg4.method1175((byte) 99)) {
                arg4.field10360 = class277.field3997[var6];
                class277.field3997[var6] = arg4;
                return;
            }
            arg4.field10360 = class5.field74[var6];
            class5.field74[var6] = arg4;
            class87.field1297 = true;
            return;
        }
        arg4.field10360 = class407.field5602[var6];
        class407.field5602[var6] = arg4;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)Lwf;")
    public final class540 method676(int arg0) {
        if (arg0 != -1150) {
            this.field4531 = -108;
        }
        field4526++;
        if (this.field4532 == null) {
            class61.field944[0] = this.field4534;
            class61.field944[3] = this.field4529;
            class61.field944[1] = this.field4530;
            class61.field944[5] = this.field4528;
            class61.field944[2] = this.field4531;
            class103 var2 = this.field4527.field6447;
            class61.field944[4] = this.field4524;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method846(class61.field944[var5], true)) {
                    return null;
                }
                class719 var7 = var2.method847(class61.field944[var5], arg0 + 1039);
                int var8 = var7.field10044 ? 64 : 128;
                if (var7.field10034 > 0) {
                    var3 = true;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class720.field10050[var6] = var2.method844(false, (byte) 112, 1.0F, var4, class61.field944[var6], var4);
            }
            this.field4532 = this.field4527.method81(var3, class720.field10050, var4, false);
        }
        return this.field4532;
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lmj;IIIIII)V")
    public class317(class114 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4529 = arg4;
        this.field4530 = arg2;
        this.field4524 = arg5;
        this.field4534 = arg1;
        this.field4531 = arg3;
        this.field4527 = arg0;
        this.field4528 = arg6;
    }
}
