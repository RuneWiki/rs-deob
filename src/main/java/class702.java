import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class702 implements class355 {

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "Lre;")
    private class563 field9815;

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "Lpfa;")
    private class275 field9817;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "I")
    public static int field9814 = -1;

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "I")
    public static int field9816 = 2;

    @OriginalMember(owner = "client!gfa", name = "j", descriptor = "Ldr;")
    public static class675 field9823 = new class675(26, 8);

    @OriginalMember(owner = "client!gfa", name = "k", descriptor = "I")
    public static int field9824 = 0;

    @OriginalMember(owner = "client!gfa", name = "f", descriptor = "I")
    public static int field9819;

    @OriginalMember(owner = "client!gfa", name = "g", descriptor = "I")
    public static int field9820;

    @OriginalMember(owner = "client!gfa", name = "h", descriptor = "I")
    public static int field9821;

    @OriginalMember(owner = "client!gfa", name = "i", descriptor = "I")
    public static int field9822;

    @OriginalMember(owner = "client!gfa", name = "l", descriptor = "Lpfa;")
    public static class275 field9825;

    @OriginalMember(owner = "client!gfa", name = "e", descriptor = "Lxa;")
    private class468 field9818;

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "(I)V", line = 3)
    public static void method3880(int arg0) {
        field9825 = null;
        field9823 = null;
        if (arg0 != 2) {
            field9823 = null;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIIII)V", line = 15)
    public static final void method3881(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class337.field4186 = arg3;
        class292.field3700 = arg2;
        class125.field1524 = arg0;
        field9820++;
        if (arg4 == 2) {
            class377.field4848 = arg1;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)V", line = 40)
    public final void method518(int arg0) {
        field9821++;
        if (arg0 != -841) {
            this.field9817 = null;
        }
        this.field9818 = class132.method853(arg0 + 841, this.field9817, this.field9815.field7032);
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lpfa;Lre;)V", line = 50)
    public class702(class275 arg0, class563 arg1) {
        this.field9815 = arg1;
        this.field9817 = arg0;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ZB)V", line = 60)
    public final void method513(boolean arg0, byte arg1) {
        if (arg0) {
            int var3 = class696.field9640 >= class309.field3890 ? class696.field9640 : class309.field3890;
            int var4 = class491.field6129 > class634.field8596 ? class491.field6129 : class634.field8596;
            int var5 = this.field9818.method1552();
            int var6 = this.field9818.method1549();
            int var7 = 0;
            int var8 = var3;
            int var9 = var3 * var6 / var5;
            int var10 = (var4 - var9) / 2;
            if (var4 < var9) {
                var8 = var4 * var5 / var6;
                var10 = 0;
                var9 = var4;
                var7 = (var3 - var8) / 2;
            }
            this.field9818.method2549(var7, var10, var8, var9);
        }
        field9819++;
        if (arg1 <= 57) {
            field9823 = null;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(I)Z", line = 111)
    public final boolean method516(int arg0) {
        if (arg0 != -6191) {
            this.method518(75);
        }
        field9822++;
        return this.field9817.method1669((byte) -118, this.field9815.field7032);
    }
}
