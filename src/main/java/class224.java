import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class224 extends class87 {

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3159 = Calendar.getInstance();

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "Lc;")
    public static class284 field3161 = new class284(32);

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
    public static int field3164 = 0;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3162 = "cyan:";

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
    public static int field3163 = 64;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "Ldi;")
    public static class99 field3166;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILqi;)Ljava/lang/String;")
    public static final String method1449(int arg0, class216 arg1) {
        if (arg0 > -84) {
            method1452(83, 48);
        }
        field3158++;
        return class112.method690(4, 32767, arg1);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static void method1450(int arg0) {
        field3161 = null;
        field3159 = null;
        if (arg0 == 4) {
            field3162 = null;
            field3166 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V")
    public static final void method1451(int arg0, int arg1) {
        field3160++;
        class94 var2 = (class94) field3161.method1895((long) arg1, -112);
        if (var2 != null) {
            if (arg0 != 0) {
                method1449(-69, (class216) null);
            }
            var2.method1935(109);
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)Lj;")
    public static final class150 method1452(int arg0, int arg1) {
        field3157++;
        class150 var2 = (class150) class204.field2898.method65((byte) -90, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class245.field3561.method1861(arg0, arg1, arg1 ^ 0x5);
        class150 var4 = new class150();
        if (var3 != null) {
            var4.method989(25412, new class216(var3), arg0);
        }
        class204.field2898.method64((long) arg0, arg1 - 5, var4);
        return var4;
    }
}
