import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class600 extends class658 {

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
    private int field8659;

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "I")
    private int field8660;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
    private int field8653;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
    private int field8655;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "I")
    private int field8661;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "Lifa;")
    private class393 field8652;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    private int field8650;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "[I")
    public static int[] field8658 = new int[1024];

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "Ljk;")
    public static class585 field8654 = new class585(53, 3);

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public static int field8651;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
    public static int field8662;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "Lkv;")
    public static class245 field8656;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "Lgi;")
    private class629 field8657;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)Lgi;", line = 4)
    public final class629 method3464(int arg0) {
        if (arg0 > -115) {
            return null;
        }
        field8662++;
        if (this.field8657 == null) {
            class299.field4035[2] = this.field8655;
            class299.field4035[4] = this.field8650;
            class299.field4035[1] = this.field8659;
            class212 var2 = this.field8652.field2023;
            class299.field4035[3] = this.field8660;
            class299.field4035[5] = this.field8661;
            class299.field4035[0] = this.field8653;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method395(class299.field4035[var5], 28576)) {
                    return null;
                }
                class352 var7 = var2.method397(class299.field4035[var5], (byte) 37);
                int var8 = var7.field4708 ? 64 : 128;
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var7.field4710 > 0) {
                    var3 = 1;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class421.field5996[var6] = var2.method400(var4, false, var4, (byte) -73, class299.field4035[var6], 1.0F);
            }
            this.field8657 = this.field8652.method470(var4, var3 != 0, class421.field5996, 12482);
        }
        return this.field8657;
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(I)V", line = 64)
    public static void method3465(int arg0) {
        field8656 = null;
        if (arg0 == -25271) {
            field8654 = null;
            field8658 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lifa;IIIIII)V", line = 93)
    public class600(class393 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field8659 = arg2;
        this.field8660 = arg4;
        this.field8653 = arg1;
        this.field8655 = arg3;
        this.field8661 = arg6;
        this.field8652 = arg0;
        this.field8650 = arg5;
    }
}
