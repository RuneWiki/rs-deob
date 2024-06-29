import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class634 {

    @OriginalMember(owner = "client!co", name = "d", descriptor = "Lgg;")
    private class114 field8787 = new class114(64);

    @OriginalMember(owner = "client!co", name = "i", descriptor = "Lkha;")
    private class687 field8792;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public static int field8784;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field8785;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public static int field8786;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public static int field8788;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "I")
    public static int field8789;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    public static int field8790;

    @OriginalMember(owner = "client!co", name = "h", descriptor = "I")
    public static int field8791;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "I")
    public static int field8793;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "I")
    public static int field8795;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "Ljava/lang/String;")
    public static String field8794;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
    public final void method3442(byte arg0) {
        int var2 = 85 % ((arg0 - 8) / 34);
        class114 var3 = this.field8787;
        synchronized (this.field8787) {
            this.field8787.method781((byte) 47);
        }
        field8788++;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILkha;IB)Lng;")
    public static final class377 method3443(int arg0, class687 arg1, int arg2, byte arg3) {
        field8786++;
        class179 var4 = new class179(arg1.method3810(arg2, -23360, arg0));
        class377 var5 = new class377(arg0, var4.method1106(arg3 ^ 0x6E), var4.method1106(arg3 ^ 0x6E), var4.method1095((byte) 127), var4.method1095((byte) 127), var4.method1094(255) == 1, var4.method1094(255), var4.method1094(255));
        int var6 = var4.method1094(255);
        int var7 = 0;
        if (arg3 != -111) {
            return null;
        }
        while (var7 < var6) {
            var5.field5272.method3110(new class477(var4.method1094(255), var4.method1107(false), var4.method1107(false), var4.method1107(false), var4.method1107(false), var4.method1107(false), var4.method1107(false), var4.method1107(false), var4.method1107(false)), 1);
            var7++;
        }
        var5.method2292((byte) -120);
        return var5;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
    public static final void method3444(int arg0) {
        class218.field2774 = null;
        field8789++;
        class581.field8074 = null;
        if (arg0 != 0) {
            method3444(82);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)V")
    public final void method3445(int arg0, int arg1) {
        field8790++;
        class114 var3 = this.field8787;
        synchronized (this.field8787) {
            if (arg1 != -18328) {
                field8785 = -83;
            }
            this.field8787.method775(1, arg0);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
    public final void method3446(boolean arg0) {
        class114 var2 = this.field8787;
        synchronized (this.field8787) {
            this.field8787.method776((byte) 73);
        }
        if (!arg0) {
            field8785 = 17;
        }
        field8791++;
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V")
    public static void method3447(int arg0) {
        if (arg0 != 0) {
            method3448(21, false, null, null);
        }
        field8794 = null;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IZLkha;Ljava/lang/String;)Ldca;")
    public static final class660 method3448(int arg0, boolean arg1, class687 arg2, String arg3) {
        field8795++;
        int var4 = arg2.method3820(arg3, -1);
        if (var4 == -1) {
            return new class660(0);
        }
        int[] var5 = arg2.method3817(var4, 0);
        if (arg0 != 1) {
            return null;
        }
        class660 var6 = new class660(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field9055) {
                class179 var9 = new class179(arg2.method3810(var4, arg0 ^ 0xFFFFA4C1, var5[var8++]));
                int var10 = var9.method1095((byte) 114);
                int var11 = var9.method1107(false);
                int var12 = var9.method1094(255);
                if (!arg1 && var12 == 1) {
                    var6.field9055--;
                } else {
                    var6.field9054[var7] = var10;
                    var6.field9056[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(II)Lic;")
    public final class49 method3449(int arg0, int arg1) {
        field8784++;
        class114 var3 = this.field8787;
        class49 var4;
        synchronized (this.field8787) {
            var4 = (class49) this.field8787.method778((long) arg1, -70);
        }
        if (var4 != null) {
            return var4;
        }
        class687 var5 = this.field8792;
        byte[] var6;
        synchronized (this.field8792) {
            var6 = this.field8792.method3810(11, -23360, arg1);
        }
        class49 var7 = new class49();
        if (arg0 != 2529) {
            method3443(-3, null, 7, (byte) -90);
        }
        if (var6 != null) {
            var7.method403(new class179(var6), arg0 - 2530);
        }
        class114 var8 = this.field8787;
        synchronized (this.field8787) {
            this.field8787.method774((long) arg1, -96, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Ldh;ILkha;)V")
    public class634(class286 arg0, int arg1, class687 arg2) {
        this.field8792 = arg2;
        if (this.field8792 != null) {
            this.field8792.method3812(0, 11);
        }
    }
}
