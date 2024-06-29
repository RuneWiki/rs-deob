import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class378 {

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "[S")
    public static short[] field5400 = new short[] { 20, 30, 5, 13, 18, 8, 21, 46 };

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "J")
    public static volatile long field5409 = 0L;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    private int field5402;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public int field5407;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public int field5410;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field5405;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "[Z")
    public static boolean[] field5403;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILkh;)V")
    public final void method2416(int arg0, int arg1, class11 arg2) {
        if (arg0 != -16711) {
            field5400 = null;
        }
        field5411++;
        while (true) {
            int var4 = arg2.method172((byte) 52);
            if (var4 == 0) {
                return;
            }
            this.method2421(var4, arg1, arg2, -13378);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class34.field530 = arg0;
        class416.field5923 = arg6;
        class91.field1281 = arg1;
        class130.field1840 = arg5;
        if (arg2 != 0) {
            field5398 = 0;
        }
        class198.field2743 = arg4;
        class445.field6240 = arg3;
        field5399++;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static void method2418(int arg0) {
        field5400 = null;
        field5403 = null;
        if (arg0 != 8) {
            method2418(89);
        }
        field5405 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)Llg;")
    public final class238 method2419(byte arg0) {
        field5401++;
        if (arg0 < 104) {
            this.method2421(100, 123, (class11) null, -69);
        }
        class238 var2 = (class238) class212.field2966.method904(false, (long) this.field5402);
        if (var2 != null) {
            return var2;
        }
        class238 var3 = class238.method1606(class44.field622, this.field5402, 0);
        if (var3 != null) {
            class212.field2966.method902((long) this.field5402, (byte) 112, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V")
    public static final void method2420(byte arg0) {
        field5406++;
        class131 var1 = class67.field1004;
        synchronized (class67.field1004) {
            if (arg0 != 101) {
                method2417(-70, -27, -29, -109, -104, -42, 57);
            }
            class67.field1004.method900(arg0 - 101);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILkh;I)V")
    private final void method2421(int arg0, int arg1, class11 arg2, int arg3) {
        if (arg3 != -13378) {
            field5398 = -3;
        }
        field5408++;
        if (arg0 == 1) {
            this.field5402 = arg2.method174(255);
        } else if (arg0 == 2) {
            this.field5410 = arg2.method172((byte) 52);
            this.field5407 = arg2.method172((byte) 52);
        }
    }
}
