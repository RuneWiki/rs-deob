import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class591 {

    @OriginalMember(owner = "client!am", name = "i", descriptor = "Lmga;")
    private class666 field7821 = new class666(64);

    @OriginalMember(owner = "client!am", name = "k", descriptor = "Lmga;")
    public class666 field7823 = new class666(2);

    @OriginalMember(owner = "client!am", name = "e", descriptor = "Lbi;")
    public class449 field7817;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "Lbi;")
    private class449 field7818;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "Lcp;")
    public static class679 field7814 = new class679();

    @OriginalMember(owner = "client!am", name = "h", descriptor = "[Led;")
    public static class661[] field7820 = new class661[4];

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field7815;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field7816;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field7819;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field7822;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 8)
    public static void method3244(int arg0) {
        field7814 = null;
        if (arg0 < 17) {
            method3244(91);
        }
        field7820 = null;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V", line = 24)
    public final void method3245(int arg0) {
        field7815++;
        class666 var2 = this.field7821;
        synchronized (this.field7821) {
            this.field7821.method3748(6);
        }
        if (arg0 != 33) {
            this.method3248(-4, (byte) -74);
        }
        class666 var3 = this.field7823;
        synchronized (this.field7823) {
            this.field7823.method3748(6);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)V", line = 40)
    public final void method3246(byte arg0, int arg1) {
        class666 var3 = this.field7821;
        synchronized (this.field7821) {
            this.field7821.method3740((byte) 60, arg1);
        }
        field7819++;
        class666 var4 = this.field7823;
        synchronized (this.field7823) {
            this.field7823.method3740((byte) 60, arg1);
            if (arg0 != -96) {
                this.field7821 = null;
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V", line = 56)
    public final void method3247(boolean arg0) {
        class666 var2 = this.field7821;
        synchronized (this.field7821) {
            this.field7821.method3739(0);
        }
        field7813++;
        class666 var3 = this.field7823;
        synchronized (this.field7823) {
            if (arg0) {
                field7820 = null;
            }
            this.field7823.method3739(0);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)Lpc;", line = 78)
    public final class628 method3248(int arg0, byte arg1) {
        field7822++;
        class666 var3 = this.field7821;
        class628 var4;
        synchronized (this.field7821) {
            var4 = (class628) this.field7821.method3750((long) arg0, false);
        }
        if (var4 != null) {
            return var4;
        }
        class449 var5 = this.field7818;
        byte[] var6;
        synchronized (this.field7818) {
            var6 = this.field7818.method2537(false, 33, arg0);
        }
        if (arg1 != -87) {
            return null;
        }
        class628 var7 = new class628();
        var7.field8465 = this;
        if (var6 != null) {
            var7.method3459(new class335(var6), true);
        }
        class666 var8 = this.field7821;
        synchronized (this.field7821) {
            this.field7821.method3745(arg1 + 88, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 111)
    public static final boolean method3249(String arg0, int arg1) {
        if (arg1 <= 27) {
            method3244(-95);
        }
        field7816++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class18.field311; var2++) {
            if (arg0.equalsIgnoreCase(class236.field3318[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class25.field426[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lpca;ILbi;Lbi;)V", line = 151)
    public class591(class671 arg0, int arg1, class449 arg2, class449 arg3) {
        this.field7817 = arg3;
        this.field7818 = arg2;
        this.field7818.method2527(0, 33);
    }
}
