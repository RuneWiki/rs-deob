import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class367 {

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "I")
    public int field4994 = 0;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public int field4995 = 0;

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "Lh;")
    private class571 field4999 = new class571(64);

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "Lsp;")
    private class545 field5001 = null;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "Lan;")
    private class21 field4991;

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "Lan;")
    private class21 field5000;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field4989 = 0;

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "[I")
    public static int[] field4998 = new int[13];

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "Lcba;")
    public static class471 field4996;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)Lsf;")
    public final class446 method2202(int arg0, int arg1) {
        field4993++;
        class446 var3 = (class446) this.field4999.method3252((long) arg0, (byte) 52);
        if (var3 != null) {
            return var3;
        }
        if (arg1 <= 112) {
            method2204(-25, null);
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field5000.method240(1, arg0 & 0x7FFF, (byte) -124);
        } else {
            var4 = this.field4991.method240(1, arg0, (byte) -124);
        }
        class446 var5 = new class446();
        var5.field6330 = this;
        if (var4 != null) {
            var5.method2641((byte) -50, new class11(var4));
        }
        if (arg0 >= 32768) {
            var5.method2637(true);
        }
        this.field4999.method3243(var5, (long) arg0, 64);
        return var5;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
    public static void method2203(int arg0) {
        if (arg0 != 0) {
            field4996 = null;
        }
        field4998 = null;
        field4996 = null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILdaa;)Lrk;")
    public static final class29 method2204(int arg0, class11 arg1) {
        if (arg0 == 1) {
            field4997++;
            return new class29(arg1.method111(-121), arg1.method111(-120), arg1.method111(-119), arg1.method111(-123), arg1.method111(-127), arg1.method111(-124), arg1.method111(-121), arg1.method111(arg0 - 126), arg1.method89((byte) -76), arg1.method110((byte) 120));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Loca;[IBJ)Ljava/lang/String;")
    public final String method2205(class221 arg0, int[] arg1, byte arg2, long arg3) {
        field4992++;
        if (this.field5001 != null) {
            String var6 = this.field5001.method908(arg0, arg3, (byte) 111, arg1);
            if (var6 != null) {
                return var6;
            }
        }
        return arg2 == -33 ? Long.toString(arg3) : null;
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(ILan;Lan;Lsp;)V")
    public class367(int arg0, class21 arg1, class21 arg2, class545 arg3) {
        this.field4991 = arg1;
        this.field5001 = arg3;
        this.field5000 = arg2;
        if (this.field4991 != null) {
            this.field4994 = this.field4991.method231(1, -125);
        }
        if (this.field5000 != null) {
            this.field4995 = this.field5000.method231(1, -127);
        }
    }
}
