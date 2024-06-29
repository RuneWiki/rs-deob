import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class25 {

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "Lnj;")
    private class162 field321 = new class162(128);

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "Lnj;")
    public class162 field332 = new class162(64);

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "Lmg;")
    private class101 field331;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "Lmg;")
    public class101 field326;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "Ldi;")
    public static class83 field329 = new class83(11, 16);

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "[Z")
    public static boolean[] field330 = new boolean[100];

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "F")
    public static float field324;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZ)Lcu;")
    public final class146 method141(int arg0, boolean arg1) {
        field328++;
        class162 var3 = this.field321;
        class146 var4;
        synchronized (this.field321) {
            var4 = (class146) this.field321.method1073((long) arg0, arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field331.method727(arg0, 36, -120);
        class146 var6 = new class146();
        var6.field2098 = this;
        var6.field2107 = arg0;
        if (var5 != null) {
            var6.method978((byte) -67, new class391(var5));
        }
        var6.method980(-1);
        class162 var7 = this.field321;
        synchronized (this.field321) {
            this.field321.method1072((long) arg0, var6, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public final void method142(int arg0) {
        field327++;
        class162 var2 = this.field321;
        synchronized (this.field321) {
            int var3 = -19 % ((arg0 - 70) / 42);
            this.field321.method1066(4080);
        }
        class162 var4 = this.field332;
        synchronized (this.field332) {
            this.field332.method1066(4080);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)V")
    public final void method143(int arg0, byte arg1) {
        if (arg1 < 47) {
            this.field332 = null;
        }
        field323++;
        class162 var3 = this.field321;
        synchronized (this.field321) {
            this.field321.method1065((byte) -95, arg0);
        }
        class162 var4 = this.field332;
        synchronized (this.field332) {
            this.field332.method1065((byte) -95, arg0);
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
    public static void method144(int arg0) {
        if (arg0 <= -28) {
            field330 = null;
            field329 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
    public final void method145(byte arg0) {
        field322++;
        class162 var2 = this.field321;
        synchronized (this.field321) {
            this.field321.method1068(0);
        }
        class162 var3 = this.field332;
        synchronized (this.field332) {
            this.field332.method1068(0);
        }
        if (arg0 <= 123) {
            this.method143(79, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V")
    public final void method146(int arg0, int arg1, int arg2) {
        field325++;
        this.field321 = new class162(arg1);
        int var4 = -94 % ((9 - arg2) / 50);
        this.field332 = new class162(arg0);
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lal;ILmg;Lmg;)V")
    public class25(class66 arg0, int arg1, class101 arg2, class101 arg3) {
        this.field331 = arg2;
        this.field326 = arg3;
        this.field331.method753(36, -113);
    }
}
