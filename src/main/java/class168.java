import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class168 {

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Lai;")
    private static class10 field3236 = class44.method278("Connection timed out)3", -48);

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Lai;")
    private static class10 field3234 = class44.method278("Loaded config", 115);

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Lai;")
    public static class10 field3242 = field3234;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "Lai;")
    public static class10 field3247 = field3236;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "Lai;")
    private static class10 field3248 = class44.method278("Please wait 1 minute and try again)3", 94);

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Lai;")
    public static class10 field3237 = field3248;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "[Lng;")
    public static class125[] field3249 = new class125[32768];

    @OriginalMember(owner = "client!se", name = "m", descriptor = "Lai;")
    private static class10 field3245 = class44.method278("You can(Wt add yourself to your own friend list)3", -115);

    @OriginalMember(owner = "client!se", name = "n", descriptor = "Lai;")
    public static class10 field3246 = field3248;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Lai;")
    public static class10 field3238 = field3245;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3233;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "[I")
    public static int[] field3244;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIZI)V")
    public static final void method1114(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            method1114(101, -118, 101, false, 23);
        }
        field3241++;
        for (int var5 = 0; var5 < class11.field175; var5++) {
            if (arg0 < class70.field1201[var5] + class67.field1176[var5] && class67.field1176[var5] < arg0 + arg1 && arg4 < class4.field32[var5] + class33.field499[var5] && class33.field499[var5] < arg2 + arg4) {
                class152.field2919[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lme;[BB)V")
    public final void method1115(class114 arg0, byte[] arg1, byte arg2) {
        int var4 = 58 / ((51 - arg2) / 50);
        field3235++;
        if (arg0.field2160[arg0.field2170] != 31 || arg0.field2160[arg0.field2170 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3233 == null) {
            this.field3233 = new Inflater(true);
        }
        try {
            this.field3233.setInput(arg0.field2160, arg0.field2170 + 10, -arg0.field2170 - 8 + arg0.field2160.length + -10);
            this.field3233.inflate(arg1);
        } catch (Exception var5) {
            this.field3233.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field3233.reset();
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
    public class168() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lwa;I)V")
    public static final void method1116(class200 arg0, int arg1) {
        if (class119.field2289 == arg0.field3797) {
            class98.field1810[arg0.field3781] = true;
        }
        if (arg1 > -72) {
            method1118(-42, (byte) -82, 33, 94);
        }
        field3240++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static void method1117(int arg0) {
        field3244 = null;
        field3236 = null;
        field3245 = null;
        field3242 = null;
        field3247 = null;
        field3246 = null;
        if (arg0 > -124) {
            method1119(-114, false);
        }
        field3249 = null;
        field3234 = null;
        field3238 = null;
        field3248 = null;
        field3237 = null;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(III)V")
    private class168(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IBII)V")
    public static final void method1118(int arg0, byte arg1, int arg2, int arg3) {
        field3239++;
        class200 var4 = class82.method507((byte) 119, arg2, arg0);
        if (var4 != null && var4.field3790 != null) {
            class5 var5 = new class5();
            var5.field53 = var4.field3790;
            var5.field55 = var4;
            class104.method681(200000, var5);
        }
        class32.field482 = true;
        class45.field741 = arg2;
        class163.field3131 = arg0;
        class49.field871 = arg3;
        int var6 = 63 % ((-arg1 - 12) / 62);
        method1116(var4, -119);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1119(int arg0, boolean arg1) {
        if (arg1) {
            field3244 = null;
        }
        field3250++;
        return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
    }
}
