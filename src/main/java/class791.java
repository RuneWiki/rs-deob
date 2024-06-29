import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class791 {

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "Lpja;")
    private class43 field10831 = new class43(64);

    @OriginalMember(owner = "client!wia", name = "d", descriptor = "Lgj;")
    private class662 field10834;

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "I")
    public int field10833;

    @OriginalMember(owner = "client!wia", name = "f", descriptor = "Lfja;")
    public static class783 field10836 = new class783(64, 12);

    @OriginalMember(owner = "client!wia", name = "m", descriptor = "Lwm;")
    public static class591 field10843 = new class591();

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "I")
    public static int field10832;

    @OriginalMember(owner = "client!wia", name = "e", descriptor = "I")
    public static int field10835;

    @OriginalMember(owner = "client!wia", name = "h", descriptor = "I")
    public static int field10838;

    @OriginalMember(owner = "client!wia", name = "i", descriptor = "I")
    public static int field10839;

    @OriginalMember(owner = "client!wia", name = "j", descriptor = "I")
    public static int field10840;

    @OriginalMember(owner = "client!wia", name = "k", descriptor = "I")
    public static int field10841;

    @OriginalMember(owner = "client!wia", name = "l", descriptor = "I")
    public static int field10842;

    @OriginalMember(owner = "client!wia", name = "g", descriptor = "Ljava/lang/Object;")
    public static Object field10837;

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(II)Lkha;", line = 3)
    public final class610 method4313(int arg0, int arg1) {
        field10832++;
        class43 var3 = this.field10831;
        class610 var4;
        synchronized (this.field10831) {
            var4 = (class610) this.field10831.method266((byte) -109, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class662 var5 = this.field10834;
        byte[] var6;
        synchronized (this.field10834) {
            var6 = this.field10834.method3732(arg1, arg0 - 10594, 16);
        }
        if (arg0 != 19500) {
            method4314((byte) 5);
        }
        class610 var7 = new class610();
        if (var6 != null) {
            var7.method3460(new class93(var6), (byte) 104);
        }
        class43 var8 = this.field10831;
        synchronized (this.field10831) {
            this.field10831.method270(var7, (long) arg1, arg0 ^ 0xFFFFB3AC);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)Lbi;", line = 34)
    public static final class508 method4314(byte arg0) {
        field10835++;
        if (class64.field888 == null || class552.field7812 == null) {
            return null;
        }
        if (arg0 >= -51) {
            field10837 = null;
        }
        for (class508 var1 = (class508) class552.field7812.method2212(-71); var1 != null; var1 = (class508) class552.field7812.method2212(123)) {
            class393 var2 = class64.field882.method4031(36, var1.field6973);
            if (var2 != null && var2.field5429 && var2.method2382(2260, class64.field881)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(IILkh;)I", line = 63)
    public static final int method4315(int arg0, int arg1, class17 arg2) {
        field10841++;
        if (!client.method2010(arg2).method3887(arg1, 8616) && arg2.field246 == null) {
            return -1;
        } else if (arg0 == 16) {
            return arg2.field265 == null || arg1 >= arg2.field265.length ? -1 : arg2.field265[arg1];
        } else {
            return -11;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(IZ)V", line = 86)
    public final void method4316(int arg0, boolean arg1) {
        class43 var3 = this.field10831;
        synchronized (this.field10831) {
            this.field10831.method265(arg0, -12);
            if (!arg1) {
                this.method4316(-95, true);
            }
        }
        field10839++;
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(B)V", line = 99)
    public static final void method4317(byte arg0) {
        int var1 = -30 % ((arg0 - 51) / 53);
        class57.field806 = 0;
        field10838++;
        class531.field7189 = new class481[50];
    }

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "(B)V", line = 111)
    public final void method4318(byte arg0) {
        field10840++;
        class43 var2 = this.field10831;
        synchronized (this.field10831) {
            this.field10831.method272(20);
        }
        if (arg0 > -105) {
            this.method4316(35, false);
        }
    }

    @OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(Lim;ILgj;)V", line = 126)
    public class791(class598 arg0, int arg1, class662 arg2) {
        this.field10834 = arg2;
        if (this.field10834 == null) {
            this.field10833 = 0;
        } else {
            this.field10833 = this.field10834.method3730((byte) 29, 16);
        }
    }

    @OriginalMember(owner = "client!wia", name = "d", descriptor = "(B)V", line = 149)
    public static void method4319(byte arg0) {
        int var1 = 47 % ((arg0 + 23) / 45);
        field10836 = null;
        field10843 = null;
        field10837 = null;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(I)V", line = 164)
    public final void method4320(int arg0) {
        class43 var2 = this.field10831;
        synchronized (this.field10831) {
            this.field10831.method273(126);
        }
        if (arg0 != 16) {
            this.field10834 = null;
        }
        field10842++;
    }
}
