import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class206 {

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "Ltl;")
    private class400 field3115 = new class400(64);

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "Lui;")
    private class451 field3119;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "[I")
    public static int[] field3117 = new int[500];

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "Lfa;")
    public static class371 field3111 = new class371(512);

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "Z")
    public static boolean field3122 = false;

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "Z")
    public static boolean field3125 = false;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "Lmf;")
    public static class46 field3124;

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "[[B")
    public static byte[][] field3123;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "[[Z")
    public static boolean[][] field3116;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
    public final void method1397(byte arg0) {
        class400 var2 = this.field3115;
        synchronized (this.field3115) {
            if (arg0 < 17) {
                field3124 = null;
            }
            this.field3115.method2401((byte) -41);
        }
        field3112++;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)Lbf;")
    public final class170 method1398(int arg0, int arg1) {
        field3121++;
        class400 var3 = this.field3115;
        class170 var4;
        synchronized (this.field3115) {
            var4 = (class170) this.field3115.method2393(-126, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3119.method2691(arg1, 11, 0);
        class170 var6 = new class170();
        if (var5 != null) {
            var6.method1176(new class446(var5), 0);
        }
        class400 var7 = this.field3115;
        synchronized (this.field3115) {
            this.field3115.method2395(0, var6, (long) arg1);
            if (arg0 >= -67) {
                field3117 = null;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILjava/lang/String;IIBIII)V")
    public static final void method1399(int arg0, String arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg4 <= 19) {
            return;
        }
        field3114++;
        class6 var8 = new class6();
        var8.field108 = arg3;
        var8.field94 = arg1;
        var8.field99 = arg7;
        var8.field104 = class452.field6418 + arg2;
        var8.field98 = arg5;
        var8.field101 = arg0;
        var8.field105 = arg6;
        class322.field4845.method1597(var8, (byte) -79);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BI)V")
    public final void method1400(byte arg0, int arg1) {
        int var3 = -78 / ((-arg0 - 17) / 54);
        class400 var4 = this.field3115;
        synchronized (this.field3115) {
            this.field3115.method2389(false, arg1);
        }
        field3113++;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1401(int arg0, String arg1, int arg2) {
        class33.field427++;
        class378.method2320(class415.field5985, (byte) 119);
        field3118++;
        class230.field3390.method2619((byte) -126, class330.method2021((byte) 117, arg1) + arg2);
        class230.field3390.method2607(arg0, (byte) 110);
        class230.field3390.method2597(arg1, (byte) -88);
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(B)V")
    public final void method1402(byte arg0) {
        class400 var2 = this.field3115;
        synchronized (this.field3115) {
            this.field3115.method2388(8);
        }
        field3120++;
        if (arg0 != -37) {
            method1401(-54, (String) null, -72);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
    public static void method1403(int arg0) {
        field3116 = null;
        if (arg0 != -29472) {
            field3111 = null;
        }
        field3124 = null;
        field3123 = null;
        field3117 = null;
        field3111 = null;
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lgp;ILui;)V")
    public class206(class430 arg0, int arg1, class451 arg2) {
        this.field3119 = arg2;
        if (this.field3119 != null) {
            this.field3119.method2662(11, (byte) -7);
        }
    }

    static {
        new class332("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
    }
}
