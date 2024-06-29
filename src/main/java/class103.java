import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class103 {

    @OriginalMember(owner = "client!qda", name = "f", descriptor = "Lnga;")
    private class510 field1727 = new class510(64);

    @OriginalMember(owner = "client!qda", name = "i", descriptor = "Lnga;")
    public class510 field1730 = new class510(2);

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "Leq;")
    public class209 field1725;

    @OriginalMember(owner = "client!qda", name = "e", descriptor = "Leq;")
    private class209 field1726;

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1724 = new String[100];

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!qda", name = "g", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!qda", name = "h", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V")
    public static void method895(int arg0) {
        int var1 = -9 / ((41 - arg0) / 55);
        field1724 = null;
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(I)V")
    public final void method896(int arg0) {
        field1723++;
        class510 var2 = this.field1727;
        synchronized (this.field1727) {
            this.field1727.method3048(false);
        }
        class510 var3 = this.field1730;
        synchronized (this.field1730) {
            this.field1730.method3048(false);
            if (arg0 != 11786) {
                field1724 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(II)V")
    public final void method897(int arg0, int arg1) {
        class510 var3 = this.field1727;
        synchronized (this.field1727) {
            this.field1727.method3049(arg1, (byte) 126);
        }
        field1729++;
        class510 var4 = this.field1730;
        synchronized (this.field1730) {
            this.field1730.method3049(arg1, (byte) 126);
            if (arg0 >= -111) {
                this.field1726 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(II)Ltga;")
    public final class56 method898(int arg0, int arg1) {
        if (arg1 <= 76) {
            field1724 = null;
        }
        field1728++;
        class510 var3 = this.field1727;
        class56 var4;
        synchronized (this.field1727) {
            var4 = (class56) this.field1727.method3054((byte) -122, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class209 var5 = this.field1726;
        byte[] var6;
        synchronized (this.field1726) {
            var6 = this.field1726.method1453(arg0, 7, 33);
        }
        class56 var7 = new class56();
        var7.field1050 = this;
        if (var6 != null) {
            var7.method516(new class35(var6), (byte) -107);
        }
        class510 var8 = this.field1727;
        synchronized (this.field1727) {
            this.field1727.method3047(false, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lcw;ILeq;Leq;)V")
    public class103(class179 arg0, int arg1, class209 arg2, class209 arg3) {
        this.field1725 = arg3;
        this.field1726 = arg2;
        this.field1726.method1477(0, 33);
    }

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "(I)V")
    public final void method899(int arg0) {
        class510 var2 = this.field1727;
        synchronized (this.field1727) {
            this.field1727.method3050(false);
        }
        int var3 = -98 % ((42 - arg0) / 51);
        field1722++;
        class510 var4 = this.field1730;
        synchronized (this.field1730) {
            this.field1730.method3050(false);
        }
    }
}
