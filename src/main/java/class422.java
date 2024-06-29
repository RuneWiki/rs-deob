import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class422 {

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "Ljo;")
    private class382 field6308 = new class382(64);

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Lok;")
    private class74 field6303;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field6307 = new String[200];

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "Ldp;")
    public static class347 field6306 = new class347("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "Lok;")
    public static class74 field6304;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V", line = 5)
    public final void method2509(byte arg0) {
        field6305++;
        class382 var2 = this.field6308;
        synchronized (this.field6308) {
            if (arg0 == 67) {
                this.field6308.method2287(110);
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)V", line = 19)
    public final void method2510(int arg0, byte arg1) {
        if (arg1 < 5) {
            this.field6308 = null;
        }
        field6302++;
        class382 var3 = this.field6308;
        synchronized (this.field6308) {
            this.field6308.method2293(false);
            this.field6308 = new class382(arg0);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZ)Lls;", line = 39)
    public final class339 method2511(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        }
        field6309++;
        class382 var3 = this.field6308;
        class339 var4;
        synchronized (this.field6308) {
            var4 = (class339) this.field6308.method2288((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class74 var5 = this.field6303;
        byte[] var6;
        synchronized (this.field6303) {
            var6 = this.field6303.method541(class96.method756(-4084, arg0), class263.method1648(arg0, 0), (byte) -122);
        }
        class339 var7 = new class339();
        if (var6 != null) {
            var7.method2074(-125, new class468(var6));
        }
        class382 var8 = this.field6308;
        synchronized (this.field6308) {
            this.field6308.method2290((long) arg0, var7, 118);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 70)
    public final void method2512(int arg0) {
        int var2 = 46 / ((arg0 - 53) / 54);
        class382 var3 = this.field6308;
        synchronized (this.field6308) {
            this.field6308.method2293(false);
        }
        field6300++;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)V", line = 82)
    public final void method2513(int arg0, int arg1) {
        field6301++;
        class382 var3 = this.field6308;
        synchronized (this.field6308) {
            this.field6308.method2294(arg1, true);
        }
        if (arg0 != 64) {
            field6306 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V", line = 100)
    public static void method2514(int arg0) {
        if (arg0 != 200) {
            method2514(42);
        }
        field6307 = null;
        field6306 = null;
        field6304 = null;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lkr;ILok;)V", line = 119)
    public class422(class262 arg0, int arg1, class74 arg2) {
        this.field6303 = arg2;
        if (this.field6303 != null) {
            int var4 = this.field6303.method535((byte) 117) - 1;
            this.field6303.method536(false, var4);
        }
    }
}
