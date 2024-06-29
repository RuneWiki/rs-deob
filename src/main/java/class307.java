import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class307 {

    @OriginalMember(owner = "client!vw", name = "i", descriptor = "Lfc;")
    private class262 field4173 = new class262(256);

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "Ld;")
    private class152 field4165;

    @OriginalMember(owner = "client!vw", name = "h", descriptor = "Lac;")
    private class541 field4172;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!vw", name = "e", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!vw", name = "f", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!vw", name = "j", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "Lfl;")
    public static class739 field4171;

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "[I")
    public static int[] field4168;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(II)Laaa;", line = 7)
    public final class616 method1855(int arg0, int arg1) {
        field4174++;
        Object var3 = this.field4173.method1571(-121, (long) arg1);
        if (var3 != null) {
            return (class616) var3;
        } else if (this.field4165.method922(-117, arg1)) {
            if (arg0 <= 122) {
                field4168 = null;
            }
            class335 var4 = this.field4165.method925(arg1, -28755);
            int var5 = var4.field4524 ? 64 : this.field4172.field7520;
            class616 var7;
            if (var4.field4519 && this.field4172.method377()) {
                float[] var6 = this.field4165.method924((byte) -126, false, arg1, var5, 0.7F, var5);
                var7 = new class616(this.field4172, 3553, 34842, var5, var5, var4.field4536 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field4520 != 2 && class3.method7(1, var4.field4522)) {
                    var8 = this.field4165.method923(arg1, (byte) -120, var5, 0.7F, true, var5);
                } else {
                    var8 = this.field4165.method927(127, var5, arg1, 0.7F, false, var5);
                }
                var7 = new class616(this.field4172, 3553, 6408, var5, var5, var4.field4536 != 0, var8, 0, 0, false);
            }
            var7.method3471(var4.field4521, 10242, var4.field4528);
            this.field4173.method1574((long) arg1, var7, (byte) -80);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ZB)I", line = 58)
    public static final int method1856(boolean arg0, byte arg1) {
        if (arg1 != -67) {
            field4171 = null;
        }
        field4166++;
        int var2 = class392.field5553;
        if (var2 == 0) {
            return arg0 ? 0 : class99.field1312;
        } else if (var2 == 1) {
            return class99.field1312;
        } else if (var2 == 2) {
            return 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V", line = 101)
    public final void method1857(int arg0) {
        field4167++;
        if (arg0 != 0) {
            field4171 = null;
        }
        this.field4173.method1569((byte) 62, 5);
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)V", line = 112)
    public final void method1858(byte arg0) {
        if (arg0 != 100) {
            this.field4172 = null;
        }
        field4169++;
        this.field4173.method1563(arg0 + 13);
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "()V", line = 124)
    public static final void method1859() {
        class233.method1394(1, field4170);
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(B)V", line = 127)
    public static void method1860(byte arg0) {
        field4168 = null;
        int var1 = -19 / ((arg0 - 62) / 47);
        field4171 = null;
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lac;Ld;)V", line = 142)
    public class307(class541 arg0, class152 arg1) {
        this.field4165 = arg1;
        this.field4172 = arg0;
    }
}
