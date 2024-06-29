import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class436 {

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "Ljo;")
    private class382 field6431 = new class382(64);

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "Lok;")
    private class74 field6435;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "Lkq;")
    public static class78 field6429 = new class78("WTWIP", 3);

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "Ldp;")
    public static class347 field6434 = new class347("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
    public static int field6437;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "[I")
    public static int[] field6436;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V", line = 7)
    public static void method2563(int arg0) {
        if (arg0 < 27) {
            method2565(-70);
        }
        field6436 = null;
        field6434 = null;
        field6429 = null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)I", line = 24)
    public static final int method2564(int arg0, int arg1, int arg2) {
        if (arg1 == 23408) {
            field6430++;
            return arg0 == 1 || arg0 == 3 ? class451.field6632[arg2 & 0x3] : class288.field4304[arg2 & 0x3];
        } else {
            return -103;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V", line = 39)
    public static final void method2565(int arg0) {
        if (arg0 > -38) {
            field6429 = null;
        }
        field6433++;
        if (class4.field37 != null) {
            class4.field37.method1634((byte) 107);
        }
        if (class72.field973 != null) {
            class72.field973.method1634((byte) 88);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IB)Lwb;", line = 57)
    public final class136 method2566(int arg0, byte arg1) {
        field6432++;
        if (arg1 < 27) {
            this.method2566(22, (byte) 107);
        }
        class382 var3 = this.field6431;
        class136 var4;
        synchronized (this.field6431) {
            var4 = (class136) this.field6431.method2288((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class74 var5 = this.field6435;
        byte[] var6;
        synchronized (this.field6435) {
            var6 = this.field6435.method541(arg0, 5, (byte) -122);
        }
        class136 var7 = new class136();
        if (var6 != null) {
            var7.method990(new class468(var6), 59);
        }
        class382 var8 = this.field6431;
        synchronized (this.field6431) {
            this.field6431.method2290((long) arg0, var7, 99);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lkr;ILok;)V", line = 118)
    public class436(class262 arg0, int arg1, class74 arg2) {
        this.field6435 = arg2;
        this.field6435.method536(false, 5);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 100)
    public static final String method2567(int arg0, String arg1) {
        if (arg0 != 3) {
            field6434 = null;
        }
        field6437++;
        String var2 = class318.method1984(class123.method915(arg1, (byte) 46), (byte) -120);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }
}
