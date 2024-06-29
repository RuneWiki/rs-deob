import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class464 {

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "Lkh;")
    private class13 field6718 = new class13(64);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Lul;")
    private class406 field6714;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "Lob;")
    public static class521 field6716 = new class521(18, -1);

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public static int field6720;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "[I")
    public static int[] field6723;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)I")
    public static final int method2805(int arg0, int arg1) {
        if (arg0 != -1) {
            field6723 = null;
        }
        field6722++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public final void method2806(int arg0) {
        int var2 = 39 % ((-arg0 - 13) / 37);
        class13 var3 = this.field6718;
        synchronized (this.field6718) {
            this.field6718.method93((byte) 108);
        }
        field6720++;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
    public final void method2807(boolean arg0) {
        if (arg0) {
            this.method2806(-85);
        }
        class13 var2 = this.field6718;
        synchronized (this.field6718) {
            this.field6718.method88(103);
        }
        field6721++;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)Lbf;")
    public final class376 method2808(int arg0, int arg1) {
        field6719++;
        class13 var3 = this.field6718;
        class376 var4;
        synchronized (this.field6718) {
            var4 = (class376) this.field6718.method87((long) arg0, -2062335807);
        }
        if (var4 != null) {
            return var4;
        }
        class406 var5 = this.field6714;
        byte[] var6;
        synchronized (this.field6714) {
            var6 = this.field6714.method2536(32, arg1 ^ arg1, arg0);
        }
        class376 var7 = new class376();
        if (var6 != null) {
            var7.method2361(new class217(var6), -1);
        }
        class13 var8 = this.field6718;
        synchronized (this.field6718) {
            this.field6718.method84((long) arg0, var7, (byte) 27);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
    public static final void method2809(int arg0) {
        class71.field1020.field3556 = 0;
        field6715++;
        class289.field4354 = null;
        if (arg0 != 26393) {
            return;
        }
        class150.field2247 = null;
        class131.field2010 = null;
        class142.field2164 = 0;
        class350.field5176 = 0;
        class119.field1801 = 0;
        class238.field3819.field3556 = 0;
        class274.field4194 = null;
        class134.method980(25);
        class116.method880(0);
        for (int var1 = 0; var1 < 2048; var1++) {
            class26.field319[var1] = null;
        }
        class398.field5947 = null;
        for (int var2 = 0; var2 < class153.field2265.length; var2++) {
            class116 var4 = class153.field2265[var2];
            if (var4 != null) {
                var4.field1968 = -1;
            }
        }
        class432.method2683(-93);
        class176.field2611 = 1;
        class74.method643(9, (byte) -102);
        for (int var3 = 0; var3 < 100; var3++) {
            class277.field4219[var3] = true;
        }
        class146.method1033(true);
        class94.field1329 = 0L;
        class304.field4595 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public static void method2810(byte arg0) {
        if (arg0 != -90) {
            field6716 = null;
        }
        field6723 = null;
        field6716 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)V")
    public final void method2811(int arg0, byte arg1) {
        field6717++;
        class13 var3 = this.field6718;
        synchronized (this.field6718) {
            this.field6718.method91(30, arg0);
        }
        if (arg1 >= -68) {
            this.field6718 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lee;ILul;)V")
    public class464(class480 arg0, int arg1, class406 arg2) {
        this.field6714 = arg2;
        this.field6714.method2551(32, -26070);
    }
}
