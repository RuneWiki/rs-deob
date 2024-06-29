import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class130 extends RuntimeException {

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "Ljava/lang/String;")
    public String field3128;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3111;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Lu;")
    public static class135 field3119 = class87.method676((byte) -82, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Lu;")
    public static class135 field3118 = class87.method676((byte) -121, "Handel akzeptieren");

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "Lu;")
    private static class135 field3110 = class87.method676((byte) -88, "This world is running a closed Beta)3");

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "Lu;")
    public static class135 field3123 = class87.method676((byte) -75, "Nehmen");

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "[I")
    public static int[] field3124 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Lu;")
    public static class135 field3122 = class87.method676((byte) -41, " )2> @whi@");

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "Lu;")
    public static class135 field3120 = class87.method676((byte) -77, "Neuer Benutzer");

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "Lu;")
    public static class135 field3121 = field3110;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "Lae;")
    public static class6 field3113;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "Lae;")
    public static class6 field3127;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lic;B)Lu;")
    public static final class135 method1045(class59 arg0, byte arg1) {
        field3126++;
        int var2 = -66 / ((35 - arg1) / 47);
        return class85.method663(arg0, 32767, 128);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)I")
    public static final int method1046(int arg0, int arg1, int arg2) {
        int var3 = -10 % ((-arg0 - 78) / 41);
        int var4 = arg1 * 57 + arg2;
        int var5 = var4 << 13 ^ var4;
        int var6 = Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589;
        field3125++;
        return var6 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)Ls;")
    public static final class123 method1047(int arg0) {
        if (arg0 > -9) {
            return null;
        }
        field3115++;
        try {
            return (class123) Class.forName("w").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public static void method1048(int arg0) {
        field3122 = null;
        field3120 = null;
        field3121 = null;
        field3110 = null;
        field3127 = null;
        field3123 = null;
        int var1 = -75 % ((arg0 - 26) / 63);
        field3124 = null;
        field3113 = null;
        field3119 = null;
        field3118 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILve;Lve;)Lve;")
    public static final class146 method1049(int arg0, int arg1, int arg2, class146 arg3, class146 arg4) {
        if (arg0 != 4) {
            method1048(70);
        }
        field3112++;
        class146 var5 = class9.method49(0, arg1, arg2, arg3.field3661, arg3.field3623, class105.field2528[arg3.field3595 >> 16], arg4, 0, 0, 0, arg3.field3595, arg0 ^ 0xC);
        if (var5 == null) {
            if (arg3.field3574 != null) {
                var5 = class9.method49(0, arg1, arg2, arg3.field3661, arg3.field3623, arg3.field3574, arg4, 0, 0, 0, arg3.field3595, 8);
            }
            return var5;
        } else {
            return var5;
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class130(Throwable arg0, String arg1) {
        this.field3128 = arg1;
        this.field3111 = arg0;
    }
}
