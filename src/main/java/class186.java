import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class186 {

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Lfc;")
    private class174 field2686 = new class174(16);

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "Loi;")
    private class53 field2687;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "Z")
    public static volatile boolean field2688 = true;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Ltn;")
    public static class60 field2681 = new class60(17, 4);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "Lo;")
    public static class24 field2682;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Lal;")
    public static class67 field2679;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Ljv;")
    public final class57 method1182(int arg0, int arg1) {
        field2684++;
        class174 var3 = this.field2686;
        class57 var4;
        synchronized (this.field2686) {
            var4 = (class57) this.field2686.method1088((long) arg0, (byte) -125);
        }
        if (var4 != null) {
            return var4;
        }
        class53 var5 = this.field2687;
        byte[] var6;
        synchronized (this.field2687) {
            var6 = this.field2687.method426(arg1, (byte) 9, arg0);
        }
        class57 var7 = new class57();
        if (var6 != null) {
            var7.method472(new class403(var6), (byte) -16);
        }
        class174 var8 = this.field2686;
        synchronized (this.field2686) {
            this.field2686.method1097(arg1 + 19597, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public final void method1183(byte arg0) {
        class174 var2 = this.field2686;
        synchronized (this.field2686) {
            this.field2686.method1095(0);
        }
        field2683++;
        int var3 = -19 % ((6 - arg0) / 46);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)V")
    public final void method1184(int arg0, byte arg1) {
        if (arg1 > -25) {
            this.method1186(-96);
        }
        class174 var3 = this.field2686;
        synchronized (this.field2686) {
            this.field2686.method1087(1, arg0);
        }
        field2680++;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
    public static void method1185(byte arg0) {
        int var1 = 111 % ((9 - arg0) / 50);
        field2681 = null;
        field2679 = null;
        field2682 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public final void method1186(int arg0) {
        class174 var2 = this.field2686;
        synchronized (this.field2686) {
            this.field2686.method1096((byte) 116);
        }
        field2685++;
        if (arg0 != 30) {
            method1185((byte) 88);
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lle;ILoi;)V")
    public class186(class205 arg0, int arg1, class53 arg2) {
        this.field2687 = arg2;
        this.field2687.method435(30, 0);
    }
}
