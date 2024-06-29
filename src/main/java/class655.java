import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class655 extends class415 {

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    private int field9187;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    private int field9193;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Lhea;")
    private class387 field9188;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    private int field9189;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    private int field9186;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    private int field9184;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    private int field9190;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "Ldg;")
    public static class376 field9191 = new class376(20, 8);

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "Lgm;")
    public static class108 field9192 = new class108();

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field9183;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field9185;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Lgp;")
    private class45 field9182;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)V", line = 3)
    public static void method3610(byte arg0) {
        if (arg0 < 56) {
            field9192 = null;
        }
        field9191 = null;
        field9192 = null;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)Lgp;", line = 34)
    public final class45 method2488(byte arg0) {
        field9185++;
        if (arg0 > -1) {
            this.field9188 = null;
        }
        if (this.field9182 == null) {
            class119.field1805[1] = this.field9186;
            class119.field1805[5] = this.field9189;
            class209 var2 = this.field9188.field2384;
            class119.field1805[3] = this.field9184;
            class119.field1805[0] = this.field9193;
            class119.field1805[4] = this.field9187;
            class119.field1805[2] = this.field9190;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1383(class119.field1805[var5], -24)) {
                    return null;
                }
                class159 var7 = var2.method1386(class119.field1805[var5], -6514);
                int var8 = var7.field2304 ? 64 : 128;
                if (var7.field2296 > 0) {
                    var3 = true;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class588.field8241[var6] = var2.method1381(var4, class119.field1805[var6], 1.0F, var4, -123, false);
            }
            this.field9182 = this.field9188.method1906(class588.field8241, var3, var4, (byte) -57);
        }
        return this.field9182;
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)Llt;", line = 97)
    public static final class627 method3611(byte arg0) {
        field9183++;
        if (class25.field346 == null || class192.field2780 == null) {
            return null;
        }
        for (class627 var1 = (class627) class192.field2780.method1204(0); var1 != null; var1 = (class627) class192.field2780.method1204(0)) {
            class588 var2 = class25.field339.method812((byte) -67, var1.field8781);
            if (var2 != null && var2.field8259 && var2.method3329(34379, class25.field338)) {
                return var1;
            }
        }
        if (arg0 < 74) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lhea;IIIIII)V", line = 122)
    public class655(class387 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field9187 = arg5;
        this.field9193 = arg1;
        this.field9188 = arg0;
        this.field9189 = arg6;
        this.field9186 = arg2;
        this.field9184 = arg4;
        this.field9190 = arg3;
    }
}
