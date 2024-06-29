import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class532 extends class628 {

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
    private int field7480;

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "Lbda;")
    private class428 field7482;

    @OriginalMember(owner = "client!oo", name = "q", descriptor = "I")
    private int field7485;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    private int field7475;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
    private int field7479;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
    private int field7478;

    @OriginalMember(owner = "client!oo", name = "t", descriptor = "I")
    private int field7488;

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "Lkj;")
    public static class484 field7483 = new class484(5000);

    @OriginalMember(owner = "client!oo", name = "s", descriptor = "Lhba;")
    public static class10 field7487 = new class10(0);

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "Llm;")
    private class423 field7476;

    @OriginalMember(owner = "client!oo", name = "u", descriptor = "Ldn;")
    public static class438 field7489;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IJ)V", line = 4)
    public static final void method3041(int arg0, long arg1) {
        class136.field1663.field4966 = 0;
        field7484++;
        class136.field1663.method2093(class368.field4849.field3279, -111);
        class136.field1663.method2094(arg1, -20439);
        class136.field1663.method2093(class31.field247, -112);
        class585.field8495 = 0;
        int var3 = 91 / ((-arg0 - 60) / 35);
        class137.field1672 = 1;
        class197.field2379 = -3;
        class71.field687 = 0;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ldn;Ldn;BLwb;Ldn;)Z", line = 21)
    public static final boolean method3042(class438 arg0, class438 arg1, byte arg2, class274 arg3, class438 arg4) {
        class390.field5159 = arg3;
        int var5 = -122 % ((arg2 + 49) / 32);
        field7477++;
        class471.field6599 = arg1;
        class443.field6119 = arg4;
        class184.field2233 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "(I)V", line = 47)
    public static void method3043(int arg0) {
        if (arg0 != 1) {
            field7489 = null;
        }
        field7483 = null;
        field7489 = null;
        field7487 = null;
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)Llm;", line = 59)
    public final class423 method3044(int arg0) {
        field7486++;
        if (arg0 >= -79) {
            return null;
        }
        if (this.field7476 == null) {
            class548.field8059[2] = this.field7479;
            class17 var2 = this.field7482.field2481;
            class548.field8059[3] = this.field7475;
            class548.field8059[4] = this.field7478;
            class548.field8059[0] = this.field7485;
            class548.field8059[5] = this.field7480;
            class548.field8059[1] = this.field7488;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method118(class548.field8059[var5], (byte) 85)) {
                    return null;
                }
                class217 var7 = var2.method119(-120, class548.field8059[var5]);
                int var8 = var7.field2642 ? 64 : 128;
                if (var7.field2654 > 0) {
                    var3 = 1;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class259.field3347[var6] = var2.method120(var4, false, 1.0F, class548.field8059[var6], var4, 122);
            }
            this.field7476 = this.field7482.method1789(true, var4, class259.field3347, var3 != 0);
        }
        return this.field7476;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lbda;IIIIII)V", line = 130)
    public class532(class428 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7480 = arg6;
        this.field7482 = arg0;
        this.field7485 = arg1;
        this.field7475 = arg4;
        this.field7479 = arg3;
        this.field7478 = arg5;
        this.field7488 = arg2;
    }
}
