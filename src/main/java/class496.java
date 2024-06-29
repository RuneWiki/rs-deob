import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class496 {

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "Lgw;")
    private class690 field6945 = new class690(64);

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "Lgw;")
    public class690 field6950 = new class690(64);

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "Luu;")
    private class237 field6947;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "Luu;")
    public class237 field6944;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field6942;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field6943;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field6946;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field6949;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Lha;")
    public static class548 field6948;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V", line = 3)
    public final void method3003(byte arg0) {
        field6940++;
        class690 var2 = this.field6945;
        synchronized (this.field6945) {
            this.field6945.method3906(-97);
            if (arg0 <= 23) {
                this.method3005(10);
            }
        }
        class690 var3 = this.field6950;
        synchronized (this.field6950) {
            this.field6950.method3906(-126);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIZ)V", line = 20)
    public final void method3004(int arg0, int arg1, boolean arg2) {
        this.field6945 = new class690(arg0);
        field6951++;
        this.field6950 = new class690(arg1);
        if (!arg2) {
            this.field6950 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 33)
    public final void method3005(int arg0) {
        if (arg0 != 34) {
            this.method3005(-12);
        }
        class690 var2 = this.field6945;
        synchronized (this.field6945) {
            this.field6945.method3902(0);
        }
        field6943++;
        class690 var3 = this.field6950;
        synchronized (this.field6950) {
            this.field6950.method3902(0);
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)V", line = 51)
    public static final void method3006(byte arg0) {
        field6949++;
        for (int var1 = 0; var1 < 5; var1++) {
            class396.field5692[var1] = false;
        }
        class204.field2693 = 0;
        class221.field2987 = -1;
        class388.field5597 = -1;
        class747.field10287 = class206.field2702;
        class688.field9580 = class483.field6741;
        class355.field5109 = 0;
        class521.field7256 = class671.field9282;
        if (arg0 != -46) {
            field6948 = null;
        }
        class720.field10023 = 5;
        class103.field1409 = class25.field318;
        class720.field10026 = class123.field1680;
        class712.field9954 = -1;
        class636.field8550 = class230.field3118;
        class299.field4237 = -1;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(B)V", line = 83)
    public static void method3007(byte arg0) {
        field6948 = null;
        if (arg0 != -71) {
            field6948 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Ldb;", line = 94)
    public final class7 method3008(int arg0, int arg1) {
        field6946++;
        class690 var3 = this.field6945;
        class7 var4;
        synchronized (this.field6945) {
            var4 = (class7) this.field6945.method3898((byte) -42, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class237 var5 = this.field6947;
        byte[] var6;
        synchronized (this.field6947) {
            var6 = this.field6947.method1572(34, arg0 ^ arg0, arg1);
        }
        class7 var7 = new class7();
        var7.field62 = this;
        if (var6 != null) {
            var7.method32(-29579, new class63(var6));
        }
        class690 var8 = this.field6945;
        synchronized (this.field6945) {
            this.field6945.method3899(-101, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lgp;ILuu;Luu;)V", line = 158)
    public class496(class553 arg0, int arg1, class237 arg2, class237 arg3) {
        this.field6947 = arg2;
        this.field6944 = arg3;
        this.field6947.method1597(34, 0);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)V", line = 143)
    public final void method3009(int arg0, int arg1) {
        field6942++;
        class690 var3 = this.field6945;
        synchronized (this.field6945) {
            this.field6945.method3896(1, arg1);
        }
        class690 var4 = this.field6950;
        synchronized (this.field6950) {
            if (arg0 != 0) {
                this.method3005(51);
            }
            this.field6950.method3896(1, arg1);
        }
    }
}
