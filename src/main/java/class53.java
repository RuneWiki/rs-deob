import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class53 {

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field1058 = 0;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field1061 = 0;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1059 = "M";

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Z")
    public static boolean field1060 = true;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "Lqd;")
    public class53 field1062;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Lqd;")
    public class53 field1064;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V", line = 4)
    public final void method460(boolean arg0) {
        field1068++;
        if (this.field1062 == null) {
            return;
        }
        this.field1062.field1064 = this.field1064;
        if (!arg0) {
            this.field1064.field1062 = this.field1062;
            this.field1062 = null;
            this.field1064 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 22)
    public static void method461(int arg0) {
        field1059 = null;
        if (arg0 != -18898) {
            method464((byte) 84);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V", line = 32)
    public static final void method462(int arg0, int arg1) {
        field1057++;
        class347.field5542.method896(arg1, (byte) -106);
        if (arg0 != 48000) {
            method465(58, 118, true, (byte) 124);
        }
        class359.field5714.method896(arg1, (byte) -51);
        class176.field2907.method896(arg1, (byte) -20);
        class20.field517.method896(arg1, (byte) -22);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lek;BI)Lob;", line = 68)
    public static final class323 method463(class206 arg0, byte arg1, int arg2) {
        field1063++;
        if (arg1 >= -121) {
            field1056 = 28;
        }
        return class207.method1434(arg0, (byte) 41, arg2) ? class52.method452(12603) : null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V", line = 83)
    public static final void method464(byte arg0) {
        field1066++;
        class244.field4056.method39(true);
        if (arg0 != -122) {
            return;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class291.field4722[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class177.field2935[var2] = 0L;
        }
        class355.field5660 = 0;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIZB)V", line = 109)
    public static final void method465(int arg0, int arg1, boolean arg2, byte arg3) {
        field1067++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        } else if (arg3 < -95) {
            class194.field3261 = arg1;
            class143.field2403 = arg0;
            class277.field4510 = arg2;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)Lvk;", line = 138)
    public static final class192 method466(int arg0, int arg1) {
        class192 var2 = (class192) class358.field5694.method487(80, (long) arg1);
        if (arg0 != 32) {
            field1061 = -112;
        }
        field1065++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class345.field5506.method1404(26, arg1, (byte) -118);
        class192 var4 = new class192();
        if (var3 != null) {
            var4.method1327(new class146(var3), 1);
        }
        class358.field5694.method491((long) arg1, arg0 ^ 0xFFFFFFDF, var4);
        return var4;
    }
}
