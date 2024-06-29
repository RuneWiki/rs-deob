import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class201 {

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "Ljv;")
    private class55 field2938 = new class55(64);

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Lbu;")
    private class17 field2937;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Lan;")
    public static class20 field2939;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "Lug;")
    public static class392 field2942;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "Lbu;")
    public static class17 field2946;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field2945;

    static {
        new class342("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
        field2939 = new class20(16);
        field2944 = 1403;
        field2942 = new class392();
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V", line = 3)
    public final void method1385(int arg0, int arg1) {
        field2940++;
        class55 var3 = this.field2938;
        synchronized (this.field2938) {
            this.field2938.method488(-3);
            this.field2938 = new class55(arg1);
        }
        if (arg0 != 24805) {
            this.method1389(64, -99);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IF)F", line = 18)
    public static final float method1386(int arg0, float arg1) {
        field2941++;
        if (arg0 > -97) {
            field2944 = -96;
        }
        return arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 35)
    public static void method1387(int arg0) {
        field2945 = null;
        int var1 = -67 / ((-arg0 - 73) / 53);
        field2946 = null;
        field2939 = null;
        field2942 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 48)
    public final void method1388(byte arg0) {
        class55 var2 = this.field2938;
        synchronized (this.field2938) {
            this.field2938.method488(-3);
        }
        int var3 = 26 % (-arg0 / 50);
        field2932++;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)Lvs;", line = 65)
    public final class416 method1389(int arg0, int arg1) {
        field2943++;
        if (arg1 != 1403) {
            return null;
        }
        class55 var3 = this.field2938;
        class416 var4;
        synchronized (this.field2938) {
            var4 = (class416) this.field2938.method494(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2937.method114(class383.method2377(arg0, 1023), class165.method1220(arg0, 511970922), 122);
        class416 var6 = new class416();
        if (var5 != null) {
            var6.method2520(new class145(var5), (byte) 66);
        }
        class55 var7 = this.field2938;
        synchronized (this.field2938) {
            this.field2938.method485((long) arg0, (byte) -125, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)I", line = 93)
    public static final int method1390(int arg0, boolean arg1) {
        field2936++;
        return arg1 ? -1 : arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)V", line = 105)
    public final void method1391(int arg0, byte arg1) {
        class55 var3 = this.field2938;
        synchronized (this.field2938) {
            this.field2938.method493(false, arg0);
        }
        field2935++;
        if (arg1 != 105) {
            this.field2938 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V", line = 127)
    public final void method1392(int arg0) {
        class55 var2 = this.field2938;
        synchronized (this.field2938) {
            this.field2938.method484(77);
        }
        field2934++;
        if (arg0 != -3527) {
            this.method1391(35, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lcu;I)Ltn;", line = 144)
    public static final class58 method1393(class145 arg0, int arg1) {
        if (arg1 >= -20) {
            method1386(-45, -1.5534519F);
        }
        field2933++;
        return new class58(arg0.method1122(65280), arg0.method1122(65280), arg0.method1122(65280), arg0.method1122(65280), arg0.method1122(65280), arg0.method1122(65280), arg0.method1122(65280), arg0.method1122(65280), arg0.method1085(119), arg0.method1063((byte) 104));
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Loq;ILbu;)V", line = 162)
    public class201(class239 arg0, int arg1, class17 arg2) {
        this.field2937 = arg2;
        if (this.field2937 != null) {
            int var4 = this.field2937.method138(false) - 1;
            this.field2937.method119(29630, var4);
        }
    }
}
