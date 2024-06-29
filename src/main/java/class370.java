import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class370 {

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "Lbh;")
    private class538 field4724 = new class538(64);

    @OriginalMember(owner = "client!uaa", name = "h", descriptor = "Lwu;")
    private class557 field4730;

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "Lju;")
    public static class102 field4728 = new class102(28, 3);

    @OriginalMember(owner = "client!uaa", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field4735 = new String[200];

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!uaa", name = "g", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!uaa", name = "j", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!uaa", name = "k", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!uaa", name = "l", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "[I")
    public static int[] field4727;

    @OriginalMember(owner = "client!uaa", name = "i", descriptor = "[Lcw;")
    public static class21[] field4731;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZIIIIZIJLjava/lang/String;JIZLjava/lang/String;)V")
    public static final void method2059(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, long arg7, String arg8, long arg9, int arg10, boolean arg11, String arg12) {
        if (arg2 != 28) {
            method2063(-53, 92);
        }
        field4723++;
        if (!class484.field6549 && class605.field8642 < 500) {
            int var15 = arg4 == -1 ? class565.field8033 : arg4;
            class6 var16 = new class6(arg8, arg12, var15, arg10, arg3, arg9, arg1, arg6, arg11, arg5, arg7, arg0);
            class712.method3995(11492, var16);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)V")
    public final void method2060(byte arg0) {
        if (arg0 != 97) {
            method2063(86, -30);
        }
        field4725++;
        class538 var2 = this.field4724;
        synchronized (this.field4724) {
            this.field4724.method3202((byte) 127);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)Lhq;")
    public final class365 method2061(int arg0, int arg1) {
        field4734++;
        class538 var3 = this.field4724;
        class365 var4;
        synchronized (this.field4724) {
            var4 = (class365) this.field4724.method3200((long) arg1, arg0 ^ 0xFFFFBB1F);
        }
        if (var4 != null) {
            return var4;
        }
        class557 var5 = this.field4730;
        byte[] var6;
        synchronized (this.field4730) {
            var6 = this.field4730.method3322(35, arg1, (byte) 94);
        }
        if (arg0 != 2798) {
            method2064(-79);
        }
        class365 var7 = new class365();
        if (var6 != null) {
            var7.method2049((byte) -98, new class26(var6));
        }
        var7.method2050(2);
        class538 var8 = this.field4724;
        synchronized (this.field4724) {
            this.field4724.method3199((byte) 78, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V")
    public final void method2062(int arg0) {
        class538 var2 = this.field4724;
        synchronized (this.field4724) {
            this.field4724.method3210(false);
            if (arg0 <= 86) {
                field4735 = null;
            }
        }
        field4733++;
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(II)V")
    public static final void method2063(int arg0, int arg1) {
        field4732++;
        if (class393.method2393(arg0, -1)) {
            class746.method4150(class491.field6599[arg0], arg1, (byte) -103);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)V")
    public static void method2064(int arg0) {
        field4731 = null;
        field4728 = null;
        field4735 = null;
        if (arg0 == 64) {
            field4727 = null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZI)V")
    public final void method2065(boolean arg0, int arg1) {
        if (arg0) {
            this.method2061(2, -94);
        }
        field4726++;
        class538 var3 = this.field4724;
        synchronized (this.field4724) {
            this.field4724.method3204((byte) -104, arg1);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)V")
    public static final void method2066(byte arg0) {
        class494.field6945 = 0;
        class244.field3395 = 0;
        class756.field10496 = 0;
        class60.field823 = 0;
        if (arg0 != 111) {
            field4727 = null;
        }
        field4729++;
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lwj;ILwu;)V")
    public class370(class121 arg0, int arg1, class557 arg2) {
        this.field4730 = arg2;
        if (this.field4730 != null) {
            this.field4730.method3333(35, 3443);
        }
    }
}
