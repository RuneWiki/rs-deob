import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class339 {

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "Lku;")
    private class232 field4948 = new class232(128);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "Lb;")
    private class201 field4942;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field4945 = 0;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "Ldk;")
    public static class326 field4946 = new class326("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "Lus;")
    public static class1 field4949 = new class1(60, -1);

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "[I")
    public static int[] field4951 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "[I")
    public static int[] field4952 = new int[50];

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "Lus;")
    public static class1 field4950 = new class1(45, 12);

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field4954;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIII[[[BIIILnp;IIII)V")
    public static final void method2141(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int arg5, int arg6, int arg7, class313 arg8, int arg9, int arg10, int arg11, int arg12) {
        if (arg11 != -30698) {
            return;
        }
        field4947++;
        if (arg10 == 0 || arg3 == 0) {
            return;
        }
        if (arg10 == 9) {
            arg0 = arg0 + 1 & 0x3;
            arg10 = 1;
        }
        if (arg10 == 10) {
            arg0 = arg0 + 3 & 0x3;
            arg10 = 1;
        }
        if (arg10 == 11) {
            arg10 = 8;
            arg0 = arg0 + 3 & 0x3;
        }
        arg8.method629(arg1, arg7, arg5, arg12, arg9, arg6, arg4[arg10 - 1][arg0], arg3, arg2);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public static void method2142(int arg0) {
        field4946 = null;
        field4954 = null;
        field4949 = null;
        field4950 = null;
        if (arg0 != 12) {
            method2141(-115, -121, 6, -28, (byte[][][]) null, 10, 75, 36, (class313) null, -48, 90, -102, -78);
        }
        field4951 = null;
        field4952 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)Lli;")
    public final class271 method2143(int arg0, int arg1) {
        field4943++;
        class232 var3 = this.field4948;
        class271 var5;
        synchronized (this.field4948) {
            if (arg1 != -11) {
                return null;
            }
            var5 = (class271) this.field4948.method1479(0, (long) arg0);
        }
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = this.field4942.method1257(class52.method334(arg0, arg1 ^ 0xFFFFFF0A), class142.method894(arg0, (byte) 21), 24558);
        class271 var7 = new class271();
        if (var6 != null) {
            var7.method1667(new class276(var6), 100);
        }
        class232 var8 = this.field4948;
        synchronized (this.field4948) {
            this.field4948.method1473(var7, (long) arg0, arg1 ^ 0xFFFFFF87);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lea;ILb;)V")
    public class339(class353 arg0, int arg1, class201 arg2) {
        this.field4942 = arg2;
        if (this.field4942 != null) {
            int var4 = this.field4942.method1233(-1) - 1;
            this.field4942.method1235(0, var4);
        }
    }
}
