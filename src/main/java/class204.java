import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class204 {

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Lfj;")
    public class240 field3233 = new class240();

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field3234 = 0;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3239 = "Opened title screen";

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field3237 = 0;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3238 = "Loading fonts - ";

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "Z")
    public static boolean field3242 = false;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3236 = "Loading textures - ";

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field3235 = -1;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "[I")
    public static int[] field3246 = new int[200];

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "Lfj;")
    private class240 field3245;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)Lfj;", line = 23)
    public final class240 method1487(byte arg0) {
        class240 var2 = this.field3245;
        field3231++;
        if (this.field3233 == var2) {
            this.field3245 = null;
            return null;
        } else {
            this.field3245 = var2.field3739;
            return arg0 == 117 ? var2 : (class240) null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)Lfj;", line = 47)
    public final class240 method1488(int arg0) {
        field3232++;
        if (arg0 != -1) {
            return (class240) null;
        }
        class240 var2 = this.field3233.field3736;
        if (this.field3233 == var2) {
            this.field3245 = null;
            return null;
        } else {
            this.field3245 = var2.field3736;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V", line = 67)
    public final void method1489(int arg0) {
        if (arg0 != 200) {
            this.field3245 = (class240) null;
        }
        while (true) {
            class240 var2 = this.field3233.field3739;
            if (this.field3233 == var2) {
                this.field3245 = null;
                field3243++;
                return;
            }
            var2.method1701(-77);
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)Lfj;", line = 91)
    public final class240 method1490(int arg0) {
        field3241++;
        if (arg0 != 200) {
            this.method1488(84);
        }
        class240 var2 = this.field3233.field3739;
        if (this.field3233 == var2) {
            this.field3245 = null;
            return null;
        } else {
            this.field3245 = var2.field3739;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V", line = 262)
    public class204() {
        this.field3233.field3736 = this.field3233;
        this.field3233.field3739 = this.field3233;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)Lfj;", line = 125)
    public final class240 method1491(int arg0) {
        class240 var2 = this.field3245;
        field3244++;
        if (this.field3233 == var2) {
            this.field3245 = null;
            return null;
        }
        if (arg0 <= 51) {
            field3236 = (String) null;
        }
        this.field3245 = var2.field3736;
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)Lfn;", line = 146)
    public static final class31 method1492(int arg0, int arg1) {
        class31 var2 = (class31) class219.field3511.method1830((long) arg1, (byte) 52);
        field3228++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 > -42) {
            field3236 = (String) null;
        }
        byte[] var3 = class324.field5030.method467(arg1, 79, 3);
        class31 var4 = new class31();
        if (var3 != null) {
            var4.method210(new class101(var3), -20231);
        }
        class219.field3511.method1831((long) arg1, var4, -13897);
        return var4;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILfj;)V", line = 173)
    public final void method1493(int arg0, class240 arg1) {
        field3227++;
        if (arg0 > -65) {
            this.method1490(-104);
        }
        if (arg1.field3736 != null) {
            arg1.method1701(-84);
        }
        arg1.field3736 = this.field3233.field3736;
        arg1.field3739 = this.field3233;
        arg1.field3736.field3739 = arg1;
        arg1.field3739.field3736 = arg1;
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V", line = 191)
    public static void method1494(int arg0) {
        field3236 = null;
        field3238 = null;
        if (arg0 == 3) {
            field3246 = null;
            field3239 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lfj;I)V", line = 207)
    public final void method1495(class240 arg0, int arg1) {
        if (arg0.field3736 != null) {
            arg0.method1701(-125);
        }
        field3240++;
        arg0.field3739 = this.field3233.field3739;
        arg0.field3736 = this.field3233;
        arg0.field3736.field3739 = arg0;
        arg0.field3739.field3736 = arg0;
        if (arg1 != -1) {
            field3235 = -84;
        }
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)Lfj;", line = 244)
    public final class240 method1496(int arg0) {
        if (arg0 != -29960) {
            this.method1489(100);
        }
        class240 var2 = this.field3233.field3739;
        field3229++;
        if (this.field3233 == var2) {
            return null;
        } else {
            var2.method1701(-114);
            return var2;
        }
    }
}
