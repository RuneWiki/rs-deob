import java.awt.Component;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class159 {

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Ljd;")
    public static class92 field3153 = class202.method1325((byte) 90, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Ljd;")
    private static class92 field3154 = class202.method1325((byte) 90, "Loading sprites )2 ");

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Ljd;")
    public static class92 field3157 = class202.method1325((byte) 90, "headicons_pk");

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "Ljd;")
    public static class92 field3161 = field3154;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field3164 = 0;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "Ljd;")
    private static class92 field3160 = class202.method1325((byte) 90, "Sorry invited players only)3");

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "Ljd;")
    public static class92 field3156 = field3160;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3159 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field3169 = 0;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "[J")
    public static long[] field3166 = new long[32];

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "Ljd;")
    private static class92 field3167 = class202.method1325((byte) 90, "Your account is already logged in)3");

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "Ljd;")
    public static class92 field3168 = field3167;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    public static int field3171 = -1;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "La;")
    public static class1 field3163;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method1025(int arg0) {
        field3159 = null;
        field3157 = null;
        field3168 = null;
        field3166 = null;
        if (arg0 != 0) {
            method1027(false, null, -77);
        }
        field3167 = null;
        field3156 = null;
        field3153 = null;
        field3161 = null;
        field3154 = null;
        field3163 = null;
        field3160 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1026(int arg0, Component arg1) {
        arg1.removeMouseListener(class66.field1340);
        arg1.removeMouseMotionListener(class66.field1340);
        arg1.removeFocusListener(class66.field1340);
        if (arg0 <= 60) {
            field3156 = null;
        }
        class162.field3174 = 0;
        field3152++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZLa;I)Ljd;")
    public static final class92 method1027(boolean arg0, class1 arg1, int arg2) {
        if (!arg0) {
            method1028(41);
        }
        field3158++;
        if (!class21.method131(-92, arg2, class114.method766(107, arg1)) && arg1.field35 == null) {
            return null;
        } else if (arg1.field52 == null || arg2 >= arg1.field52.length || arg1.field52[arg2] == null || arg1.field52[arg2].method607((byte) -92).method640(true) == 0) {
            return class133.field2694 ? class77.method529(-3, new class92[] { class18.field457, class142.method938(arg2, false) }) : null;
        } else {
            return arg1.field52[arg2];
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
    public static final void method1028(int arg0) {
        field3165++;
        if (arg0 != 0) {
            field3171 = 78;
        }
        while (true) {
            class18 var1 = class189.field3595;
            class150 var2;
            synchronized (class189.field3595) {
                var2 = (class150) class209.field4006.method105(-123);
            }
            if (var2 == null) {
                return;
            }
            var2.field2977.method1270(false, var2.field2974, (byte) 0, (int) var2.field4079, var2.field2975);
        }
    }
}
