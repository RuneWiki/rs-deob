import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kka")
public class class329 extends class152 {

    @OriginalMember(owner = "client!kka", name = "w", descriptor = "[[S")
    public short[][] field4064;

    @OriginalMember(owner = "client!kka", name = "C", descriptor = "D")
    public double field4070;

    @OriginalMember(owner = "client!kka", name = "y", descriptor = "Ljava/lang/String;")
    public static String field4066;

    @OriginalMember(owner = "client!kka", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4063;

    @OriginalMember(owner = "client!kka", name = "x", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!kka", name = "z", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!kka", name = "A", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!kka", name = "B", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(I)Z")
    public static final boolean method1951(int arg0) {
        class180.field2203 = true;
        field4067++;
        if (arg0 != 12044) {
            field4066 = null;
        }
        class756.field10477++;
        return true;
    }

    @OriginalMember(owner = "client!kka", name = "b", descriptor = "(B)V")
    public static void method1952(byte arg0) {
        field4066 = null;
        field4063 = null;
        int var1 = -15 % ((arg0 - 61) / 48);
    }

    @OriginalMember(owner = "client!kka", name = "d", descriptor = "(I)J")
    public final long method1953(int arg0) {
        if (arg0 != 0) {
            method1954(2);
        }
        field4065++;
        return (long) (this.field4064.length << 0 | this.field4064[0].length);
    }

    @OriginalMember(owner = "client!kka", name = "<init>", descriptor = "([[SD)V")
    public class329(short[][] arg0, double arg1) {
        this.field4064 = arg0;
        this.field4070 = arg1;
    }

    @OriginalMember(owner = "client!kka", name = "g", descriptor = "(I)Luea;")
    public static final class336 method1954(int arg0) {
        field4068++;
        return class137.field1724 == arg0 ? new class336() : class313.field3859[--class137.field1724];
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(III)V")
    public static final void method1955(int arg0, int arg1, int arg2) {
        field4069++;
        class714 var3 = class350.method2072((long) arg1, arg0, (byte) 120);
        var3.method4043(6380);
        var3.field10021 = arg2;
    }

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = "Unknown";
        try {
            var1 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var9) {
        }
        field4066 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field4063 = var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = "~/";
        try {
            var5 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
    }
}
