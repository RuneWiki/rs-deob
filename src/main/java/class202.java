import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class202 {

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "Luf;")
    private class380 field2714 = new class380(64);

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
    public int field2722 = 0;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "Lga;")
    private class332 field2717;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public int field2713;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "Lsfa;")
    public static class289 field2719;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field2718;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IB)V", line = 7)
    public final void method1289(int arg0, byte arg1) {
        class380 var3 = this.field2714;
        synchronized (this.field2714) {
            this.field2714.method2179(false, arg0);
            if (arg1 != 104) {
                this.field2713 = -30;
            }
        }
        field2716++;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)Lsv;", line = 21)
    public final class425 method1290(int arg0, int arg1) {
        field2720++;
        class380 var3 = this.field2714;
        class425 var4;
        synchronized (this.field2714) {
            var4 = (class425) this.field2714.method2176(-128, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class332 var5 = this.field2717;
        byte[] var6;
        synchronized (this.field2717) {
            var6 = this.field2717.method1938(arg1, 4, -17);
        }
        class425 var7 = new class425();
        var7.field5731 = arg1;
        if (arg0 != 4) {
            return null;
        }
        var7.field5738 = this;
        if (var6 != null) {
            var7.method2410((byte) -106, new class157(var6));
        }
        var7.method2411(true);
        class380 var8 = this.field2714;
        synchronized (this.field2714) {
            this.field2714.method2174(var7, (long) arg1, (byte) 40);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V", line = 56)
    public final void method1291(int arg0) {
        class380 var2 = this.field2714;
        synchronized (this.field2714) {
            if (arg0 != 26878) {
                this.method1292((byte) 104);
            }
            this.field2714.method2172(-15112);
        }
        field2715++;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V", line = 69)
    public final void method1292(byte arg0) {
        if (arg0 <= 7) {
            this.field2714 = null;
        }
        field2721++;
        class380 var2 = this.field2714;
        synchronized (this.field2714) {
            this.field2714.method2168((byte) -78);
        }
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lnq;ILga;)V", line = 94)
    public class202(class650 arg0, int arg1, class332 arg2) {
        this.field2717 = arg2;
        this.field2713 = this.field2717.method1939(0, 4);
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)V", line = 107)
    public static void method1293(byte arg0) {
        if (arg0 != -75) {
            method1293((byte) 87);
        }
        field2719 = null;
        field2718 = null;
    }
}
