import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class204 extends class45 {

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "J")
    public long field3220;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "[I")
    public static int[] field3218 = new int[14];

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "I")
    public static int field3223 = 0;

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "I")
    public static int field3222 = 0;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "Ljava/util/Random;")
    public static Random field3221 = new Random();

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "[I")
    public static int[] field3224 = new int[4096];

    @OriginalMember(owner = "client!jm", name = "x", descriptor = "I")
    public static int field3227 = 1;

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "I")
    public static int field3226 = 0;

    @OriginalMember(owner = "client!jm", name = "y", descriptor = "Ljava/lang/String;")
    public static String field3228 = "Allocated memory";

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "[I")
    public static int[] field3229 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!jm", name = "A", descriptor = "Lcf;")
    public static class72 field3230 = null;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method1561(boolean arg0) {
        field3219++;
        for (class170 var1 = (class170) class314.field4984.method2300((byte) 97); var1 != null; var1 = (class170) class314.field4984.method2306(-23)) {
            if (var1.field2701) {
                var1.method1321(true);
            }
        }
        for (class170 var2 = (class170) class103.field1673.method2300((byte) 116); var2 != null; var2 = (class170) class103.field1673.method2306(-23)) {
            if (var2.field2701) {
                var2.method1321(true);
            }
        }
        if (arg0) {
            field3229 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(Z)V", line = 38)
    public static void method1562(boolean arg0) {
        field3221 = null;
        if (!arg0) {
            field3221 = (Random) null;
        }
        field3230 = null;
        field3228 = null;
        field3224 = null;
        field3218 = null;
        field3229 = null;
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V", line = 57)
    public class204() {
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIB)Ljava/lang/String;", line = 66)
    public static final String method1563(int arg0, int arg1, byte arg2) {
        field3225++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (arg2 < 97) {
            return (String) null;
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 <= 3) {
            return var3 <= 0 ? "<col=ffff00>" : "<col=c0ff00>";
        } else {
            return "<col=80ff00>";
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(J)V", line = 106)
    public class204(long arg0) {
        this.field3220 = arg0;
    }
}
