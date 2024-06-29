import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class252 {

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "Lfi;")
    public static class331 field3405 = new class331(8);

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field3408 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "Z")
    public static boolean field3407 = false;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "Lkh;")
    public static class11 field3409;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "Ljava/awt/Frame;")
    public static Frame field3406;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V", line = 14)
    public static final void method1575(byte arg0) {
        if (arg0 == 32) {
            class93.field1031.method2043(-109);
            field3402++;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V", line = 25)
    public static final void method1576(int arg0) {
        class331 var1 = class139.field1976;
        synchronized (class139.field1976) {
            class139.field1976.method2043(-113);
        }
        field3403++;
        int var2 = 108 / ((66 - arg0) / 50);
        class331 var3 = class444.field6487;
        synchronized (class444.field6487) {
            class444.field6487.method2043(-122);
        }
        class331 var4 = class360.field5262;
        synchronized (class360.field5262) {
            class360.field5262.method2043(-105);
        }
        class331 var5 = class173.field2412;
        synchronized (class173.field2412) {
            class173.field2412.method2043(-47);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(III)V", line = 47)
    public static final void method1577(int arg0, int arg1, int arg2) {
        class282.field3967[arg0] = arg1;
        field3404++;
        int var3 = -70 / ((arg2 - 20) / 43);
        class338 var4 = (class338) class443.field6474.method1204((byte) -68, (long) arg0);
        if (var4 == null) {
            class338 var5 = new class338(4611686018427387905L);
            class443.field6474.method1202(-1, (long) arg0, var5);
        } else if (var4.field5003 != 4611686018427387905L) {
            var4.field5003 = class203.method1299((byte) 5) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(III)V", line = 76)
    public static final void method1578(int arg0, int arg1, int arg2) {
        boolean var3 = class19.field202[0][arg1][arg2] != null && class19.field202[0][arg1][arg2].field4327 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class19.field202[var4][arg1][arg2] == null) {
                class302 var5 = class19.field202[var4][arg1][arg2] = new class302(var4, arg1, arg2);
                if (var3) {
                    var5.field4303++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V", line = 99)
    public static void method1579(int arg0) {
        field3409 = null;
        field3408 = null;
        field3405 = null;
        field3406 = null;
        if (arg0 != 7251) {
            field3405 = null;
        }
    }
}
