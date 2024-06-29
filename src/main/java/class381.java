import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class381 {

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "Lof;")
    private class620 field5212 = new class620(64);

    @OriginalMember(owner = "client!dda", name = "m", descriptor = "Lof;")
    public class620 field5220 = new class620(64);

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "Loh;")
    private class404 field5209;

    @OriginalMember(owner = "client!dda", name = "k", descriptor = "Loh;")
    public class404 field5218;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "[[I")
    public static int[][] field5208 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "I")
    public static int field5214 = 0;

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!dda", name = "l", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IB)Llc;")
    public final class645 method2338(int arg0, byte arg1) {
        field5219++;
        class620 var3 = this.field5212;
        class645 var4;
        synchronized (this.field5212) {
            var4 = (class645) this.field5212.method3538((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class404 var5 = this.field5209;
        byte[] var6;
        synchronized (this.field5209) {
            var6 = this.field5209.method2481(34, arg0, (byte) 116);
        }
        class645 var7 = new class645();
        var7.field9220 = this;
        if (var6 != null) {
            var7.method3669(new class244(var6), true);
        }
        class620 var8 = this.field5212;
        synchronized (this.field5212) {
            this.field5212.method3537(-73, (long) arg0, var7);
            if (arg1 > -31) {
                this.field5212 = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)V")
    public final void method2339(byte arg0) {
        class620 var2 = this.field5212;
        synchronized (this.field5212) {
            this.field5212.method3541(-647);
        }
        field5210++;
        class620 var3 = this.field5220;
        synchronized (this.field5220) {
            this.field5220.method3541(-647);
        }
        if (arg0 >= -59) {
            field5214 = -17;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Z)V")
    public final void method2340(boolean arg0) {
        field5215++;
        if (arg0) {
            field5208 = null;
        }
        class620 var2 = this.field5212;
        synchronized (this.field5212) {
            this.field5212.method3549(0);
        }
        class620 var3 = this.field5220;
        synchronized (this.field5220) {
            this.field5220.method3549(0);
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(B)Z")
    public static final boolean method2341(byte arg0) {
        field5217++;
        try {
            class70 var1 = new class70();
            byte[] var2 = var1.method520(false, class535.field7724);
            class631.method3620(var2, arg0 ^ 0xEE);
            if (arg0 != 110) {
                method2341((byte) -97);
            }
            return true;
        } catch (Exception var3) {
            return false;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(III)V")
    public final void method2342(int arg0, int arg1, int arg2) {
        field5216++;
        this.field5212 = new class620(arg1);
        int var4 = 123 % ((arg0 - 76) / 45);
        this.field5220 = new class620(arg2);
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(Z)V")
    public static final void method2343(boolean arg0) {
        if (class167.field1857 != null) {
            class167.field1857.method113(-124);
        }
        if (!arg0) {
            field5211++;
            if (class637.field9160 != null) {
                class637.field9160.method113(-106);
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V")
    public static void method2344(int arg0) {
        if (arg0 != 4) {
            method2343(true);
        }
        field5208 = null;
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(IB)V")
    public final void method2345(int arg0, byte arg1) {
        field5213++;
        class620 var3 = this.field5212;
        synchronized (this.field5212) {
            this.field5212.method3539((byte) 117, arg0);
            int var4 = -91 / ((arg1 - 65) / 42);
        }
        class620 var5 = this.field5220;
        synchronized (this.field5220) {
            this.field5220.method3539((byte) -63, arg0);
        }
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lnb;ILoh;Loh;)V")
    public class381(class301 arg0, int arg1, class404 arg2, class404 arg3) {
        this.field5209 = arg2;
        this.field5218 = arg3;
        this.field5209.method2482(0, 34);
    }
}
