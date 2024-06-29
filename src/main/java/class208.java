import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class208 {

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "Lkh;")
    private class13 field3402 = new class13(64);

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "Lul;")
    private class406 field3406;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field3400 = 0;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "Lob;")
    public static class521 field3404 = new class521(9, 7);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 3)
    public final void method1439(int arg0) {
        class13 var2 = this.field3402;
        synchronized (this.field3402) {
            this.field3402.method93((byte) 108);
            int var3 = -26 % ((arg0 - 58) / 41);
        }
        field3398++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V", line = 20)
    public final void method1440(int arg0, int arg1) {
        field3403++;
        class13 var3 = this.field3402;
        synchronized (this.field3402) {
            this.field3402.method93((byte) 119);
            this.field3402 = new class13(arg0);
            if (arg1 != 1) {
                this.field3406 = null;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)Lnh;", line = 35)
    public final class529 method1441(int arg0, int arg1) {
        field3399++;
        class13 var3 = this.field3402;
        class529 var4;
        synchronized (this.field3402) {
            var4 = (class529) this.field3402.method87((long) arg1, -2062335807);
        }
        if (var4 != null) {
            return var4;
        }
        class406 var5 = this.field3406;
        byte[] var6;
        synchronized (this.field3406) {
            var6 = this.field3406.method2536(class85.method709(arg1, 1402653130), 0, class112.method852(arg1, arg0));
        }
        class529 var7 = new class529();
        if (var6 != null) {
            var7.method3136(0, new class217(var6));
        }
        class13 var8 = this.field3402;
        synchronized (this.field3402) {
            this.field3402.method84((long) arg1, var7, (byte) 27);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(II)V", line = 64)
    public final void method1442(int arg0, int arg1) {
        if (arg0 >= -66) {
            return;
        }
        class13 var3 = this.field3402;
        synchronized (this.field3402) {
            this.field3402.method91(56, arg1);
        }
        field3405++;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V", line = 82)
    public final void method1443(int arg0) {
        if (arg0 != -31680) {
            this.field3402 = null;
        }
        field3407++;
        class13 var2 = this.field3402;
        synchronized (this.field3402) {
            this.field3402.method88(88);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V", line = 97)
    public static void method1444(byte arg0) {
        if (arg0 != 44) {
            method1444((byte) 126);
        }
        field3404 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 109)
    public static final boolean method1445(int arg0, String arg1) {
        field3401++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class64.field785; var2++) {
            if (arg1.equalsIgnoreCase(class221.field3622[var2])) {
                return true;
            }
        }
        if (arg0 <= 120) {
            field3400 = -127;
        }
        return arg1.equalsIgnoreCase(class398.field5947.field2660);
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lee;ILul;)V", line = 147)
    public class208(class480 arg0, int arg1, class406 arg2) {
        this.field3406 = arg2;
        if (this.field3406 != null) {
            int var4 = this.field3406.method2561(-81) - 1;
            this.field3406.method2551(var4, -26070);
        }
    }
}
