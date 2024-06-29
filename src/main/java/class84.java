import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public class class84 {

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "Ltia;")
    public class281 field1176 = new class281();

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "J")
    public static long field1177 = 0L;

    @OriginalMember(owner = "client!dha", name = "c", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!dha", name = "d", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!dha", name = "f", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!dha", name = "g", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!dha", name = "h", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!dha", name = "i", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!dha", name = "e", descriptor = "Ltia;")
    private class281 field1180;

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(ILtia;)V")
    public final void method695(int arg0, class281 arg1) {
        field1179++;
        if (arg1.field4145 != null) {
            arg1.method1811(28064);
        }
        arg1.field4146 = this.field1176;
        arg1.field4145 = this.field1176.field4145;
        arg1.field4145.field4146 = arg1;
        if (arg0 <= -81) {
            arg1.field4146.field4145 = arg1;
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(I)I")
    public final int method696(int arg0) {
        if (arg0 != -14980) {
            this.field1176 = null;
        }
        field1178++;
        int var2 = 0;
        for (class281 var3 = this.field1176.field4146; var3 != this.field1176; var3 = var3.field4146) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "(I)Ltia;")
    public final class281 method697(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field1183++;
        class281 var2 = this.field1176.field4146;
        if (this.field1176 == var2) {
            this.field1180 = null;
            return null;
        } else {
            this.field1180 = var2.field4146;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dha", name = "c", descriptor = "(I)Ltia;")
    public final class281 method698(int arg0) {
        field1184++;
        class281 var2 = this.field1176.field4146;
        if (this.field1176 == var2) {
            return null;
        } else {
            var2.method1811(28064);
            int var3 = -96 / ((arg0 + 41) / 50);
            return var2;
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(Z)Ltia;")
    public final class281 method699(boolean arg0) {
        field1181++;
        if (!arg0) {
            this.method698(32);
        }
        class281 var2 = this.field1180;
        if (this.field1176 == var2) {
            this.field1180 = null;
            return null;
        } else {
            this.field1180 = var2.field4146;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dha", name = "d", descriptor = "(I)V")
    public final void method700(int arg0) {
        while (true) {
            class281 var2 = this.field1176.field4146;
            if (this.field1176 == var2) {
                field1182++;
                if (arg0 <= 77) {
                    this.method696(51);
                }
                this.field1180 = null;
                return;
            }
            var2.method1811(28064);
        }
    }

    @OriginalMember(owner = "client!dha", name = "<init>", descriptor = "()V")
    public class84() {
        this.field1176.field4145 = this.field1176;
        this.field1176.field4146 = this.field1176;
    }
}
