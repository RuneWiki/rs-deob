import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class338 {

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "Lka;")
    private class473 field4909 = new class473(64);

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "Ldk;")
    private class421 field4907;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
    public static int field4906 = -1;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    public static int field4903 = 0;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "Z")
    public static boolean field4904 = false;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "[[I")
    public static int[][] field4911 = new int[128][128];

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)V")
    public static void method2056(boolean arg0) {
        if (arg0) {
            field4904 = false;
        }
        field4911 = null;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)V")
    public final void method2057(int arg0, int arg1) {
        class473 var3 = this.field4909;
        synchronized (this.field4909) {
            this.field4909.method2779(14896, arg1);
        }
        field4902++;
        if (arg0 != -12548) {
            field4911 = null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(II)Lnq;")
    public final class495 method2058(int arg0, int arg1) {
        field4908++;
        class473 var3 = this.field4909;
        class495 var4;
        synchronized (this.field4909) {
            var4 = (class495) this.field4909.method2767((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = 33 % ((-arg0 - 12) / 50);
        class421 var6 = this.field4907;
        byte[] var7;
        synchronized (this.field4907) {
            var7 = this.field4907.method2512(32, (byte) -93, arg1);
        }
        class495 var8 = new class495();
        if (var7 != null) {
            var8.method2927((byte) -96, new class319(var7));
        }
        class473 var9 = this.field4909;
        synchronized (this.field4909) {
            this.field4909.method2777(-1025, var8, (long) arg1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
    public final void method2059(int arg0) {
        field4905++;
        class473 var2 = this.field4909;
        synchronized (this.field4909) {
            this.field4909.method2764(arg0 ^ 0xFFFFFCDF);
        }
        if (arg0 != 32) {
            this.method2057(-122, -60);
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)V")
    public final void method2060(int arg0) {
        field4910++;
        if (arg0 != 64) {
            this.field4907 = null;
        }
        class473 var2 = this.field4909;
        synchronized (this.field4909) {
            this.field4909.method2774((byte) -104);
        }
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lad;ILdk;)V")
    public class338(class12 arg0, int arg1, class421 arg2) {
        this.field4907 = arg2;
        this.field4907.method2509(0, 32);
    }
}
