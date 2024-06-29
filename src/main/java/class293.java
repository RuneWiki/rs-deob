import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class293 {

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
    public static int field4024 = -1;

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "[I")
    public static int[] field4027 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "I")
    public int field4022;

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
    public int field4023;

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!dba", name = "h", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "Lfw;")
    public static class215 field4026;

    @OriginalMember(owner = "client!dba", name = "i", descriptor = "[Lbia;")
    public class409[] field4030;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILsl;Lhr;)Lbia;")
    private final class409 method1837(int arg0, class479 arg1, class57 arg2) {
        field4028++;
        if (arg0 != 0) {
            return null;
        } else if (class165.field2341 == arg2) {
            return class216.method1532(5816, arg1);
        } else if (class457.field6509 == arg2) {
            return class647.method3737((byte) 121, arg1);
        } else if (class147.field2153 == arg2) {
            return class144.method1007(arg1, (byte) -114);
        } else if (class28.field260 == arg2) {
            return class451.method2764(arg1, -1);
        } else if (class153.field2228 == arg2) {
            return class744.method4153(arg1, (byte) -126);
        } else if (class438.field6242 == arg2) {
            return class159.method1133(arg1, arg0 - 30);
        } else if (class463.field6594 == arg2) {
            return class574.method3409(arg1, true);
        } else if (class438.field6249 == arg2) {
            return class157.method1121(arg1, (byte) -42);
        } else if (class758.field10545 == arg2) {
            return class397.method2409(6409, arg1);
        } else if (class556.field8079 == arg2) {
            return class207.method1478((byte) -128, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Z)V")
    public static void method1838(boolean arg0) {
        field4027 = null;
        if (!arg0) {
            field4024 = 122;
        }
        field4026 = null;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lsl;B)V")
    public final void method1839(class479 arg0, byte arg1) {
        this.field4023 = arg0.method2865(255);
        field4029++;
        this.field4022 = arg0.method2882(-1);
        if (arg1 != -121) {
            field4024 = -100;
        }
        this.field4030 = new class409[arg0.method2886(true)];
        class57[] var3 = class347.method2203((byte) 91);
        for (int var4 = 0; var4 < this.field4030.length; var4++) {
            this.field4030[var4] = this.method1837(0, arg0, var3[arg0.method2886(true)]);
        }
    }
}
