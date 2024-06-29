import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class23 extends class86 {

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "[I")
    public int[] field346 = new int[5];

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "[Laa;")
    public class172[] field358 = new class172[5];

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public int field340 = 0;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
    public int field350;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "I")
    public int field359;

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "I")
    public int field364;

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "I")
    public int field357;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public static int field331 = 0;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field333 = 2;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public static int field339 = 5063219;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "[I")
    public static int[] field335 = new int[2];

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "Z")
    public static boolean field336 = false;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "Ljava/lang/String;")
    public static String field354 = null;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "Ljava/lang/String;")
    public static String field348 = " more options";

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "B")
    public static byte field330;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
    public int field352;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
    public int field353;

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "I")
    public int field355;

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "I")
    public int field360;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "Lei;")
    public class175 field345;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "Luf;")
    public static class176 field361;

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "Lam;")
    public class180 field363;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "Lcl;")
    public class199 field342;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "Lre;")
    public class228 field344;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "Lwd;")
    public class23 field343;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "Ldc;")
    public class243 field347;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "Leb;")
    public class247 field356;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "Z")
    public boolean field349;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "Z")
    public boolean field351;

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "Z")
    public boolean field362;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)Lad;")
    public static final class259 method189(int arg0, byte arg1) {
        class259 var2 = (class259) class188.field2952.method1780((long) arg0, (byte) -127);
        field334++;
        int var3 = 93 % ((-arg1 - 55) / 59);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class63.field1013.method1163(class205.method1375(127, arg0), class153.method1029(255, arg0), 48);
        class259 var5 = new class259();
        var5.field3979 = arg0;
        if (var4 != null) {
            var5.method1714((byte) -79, new class37(var4));
        }
        class188.field2952.method1784(var5, false, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)V")
    public static final void method190(int arg0, boolean arg1) {
        class197.field3094 = -1;
        class250.field3848 = arg0;
        class197.field3094 = -1;
        if (arg1) {
            field354 = null;
        }
        class273.method1840((byte) -93);
        field337++;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(III)V")
    public class23(int arg0, int arg1, int arg2) {
        this.field350 = arg2;
        this.field364 = this.field359 = arg0;
        this.field357 = arg1;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method191(int arg0, String arg1, boolean arg2) {
        if (!arg2) {
            field338++;
            class295 var3 = class250.method1673(-109, 3, arg0);
            var3.method1980(1022716908);
            var3.field4634 = arg1;
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V")
    public static void method192(int arg0) {
        field335 = null;
        if (arg0 != 0) {
            field348 = null;
        }
        field361 = null;
        field348 = null;
        field354 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILuf;II)La;")
    public static final class49 method193(int arg0, class176 arg1, int arg2, int arg3) {
        if (arg0 != 2) {
            field333 = 49;
        }
        field332++;
        return class261.method1750(arg1, arg3, arg2, (byte) 55) ? class209.method1399(0) : null;
    }
}
