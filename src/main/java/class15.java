import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class15 {

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "Lgk;")
    private class503 field229 = new class503();

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    public static int field232 = 0;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "Laj;")
    public static class333 field226;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "Lgk;")
    private class503 field234;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "Ljw;")
    public static class581 field225;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lgk;B)V", line = 7)
    public final void method106(class503 arg0, byte arg1) {
        field228++;
        if (arg0.field6967 != null) {
            arg0.method2922((byte) -92);
        }
        arg0.field6970 = this.field229;
        if (arg1 == 119) {
            arg0.field6967 = this.field229.field6967;
            arg0.field6967.field6970 = arg0;
            arg0.field6970.field6967 = arg0;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 24)
    public static final int method107(String arg0, int arg1) {
        field222++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 == 6) {
            for (int var4 = 0; var4 < var2; var4++) {
                var3 = class521.method3010(-117, arg0.charAt(var4)) + (var3 << 5) - var3;
            }
            return var3;
        } else {
            return 42;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V", line = 46)
    public static void method108(byte arg0) {
        if (arg0 > -21) {
            field226 = null;
        }
        field225 = null;
        field226 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)Lgk;", line = 60)
    public final class503 method109(int arg0) {
        field223++;
        class503 var2 = this.field229.field6970;
        if (this.field229 == var2) {
            this.field234 = null;
            return null;
        } else {
            this.field234 = var2.field6970;
            return arg0 == 0 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)Z", line = 81)
    public final boolean method110(int arg0) {
        if (arg0 != 0) {
            this.field234 = null;
        }
        field231++;
        return this.field229.field6970 == this.field229;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)Lgk;", line = 96)
    public final class503 method111(byte arg0) {
        field220++;
        if (arg0 != -7) {
            this.field234 = null;
        }
        class503 var2 = this.field229.field6970;
        if (this.field229 == var2) {
            return null;
        } else {
            var2.method2922((byte) -88);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)I", line = 121)
    public final int method112(int arg0) {
        field221++;
        if (arg0 != 1318812549) {
            return -57;
        }
        int var2 = 0;
        class503 var3 = this.field229.field6970;
        while (this.field229 != var3) {
            var3 = var3.field6970;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V", line = 143)
    public final void method113(int arg0) {
        if (arg0 != 0) {
            method114(null, 95, -87, null);
        }
        while (true) {
            class503 var2 = this.field229.field6970;
            if (this.field229 == var2) {
                field233++;
                this.field234 = null;
                return;
            }
            var2.method2922((byte) -93);
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V", line = 230)
    public class15() {
        this.field229.field6967 = this.field229;
        this.field229.field6970 = this.field229;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V", line = 168)
    public static final void method114(String arg0, int arg1, int arg2, String arg3) {
        field227++;
        if (arg3.length() > 320 || !class302.method1905((byte) -48)) {
            return;
        }
        class159.method1167((byte) 44);
        class537.field7310 = arg0;
        class83.field1175 = arg3;
        class39.field623 = arg1;
        class300.method1901(arg2, 2);
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)Lgk;", line = 188)
    public final class503 method115(byte arg0) {
        field224++;
        class503 var2 = this.field234;
        if (this.field229 == var2) {
            this.field234 = null;
            return null;
        } else {
            this.field234 = var2.field6970;
            int var3 = 99 % ((arg0 + 45) / 45);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(B)Lgk;", line = 211)
    public final class503 method116(byte arg0) {
        field230++;
        int var2 = -40 % ((arg0 - 54) / 63);
        class503 var3 = this.field229.field6967;
        if (this.field229 == var3) {
            this.field234 = null;
            return null;
        } else {
            this.field234 = var3.field6967;
            return var3;
        }
    }
}
