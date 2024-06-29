import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class208 {

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "Lhu;")
    private class76 field2805 = new class76(16);

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Lr;")
    private class110 field2800;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "Lad;")
    public static class268 field2806 = new class268(16);

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field2811 = 0;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "Lrt;")
    public static class137 field2812 = new class137("LIVE", 0);

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "Z")
    public static boolean field2815 = false;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "Lon;")
    public static class203 field2814;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "[Ljd;")
    public static class139[] field2816;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "[Loi;")
    public static class49[] field2810;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "[[B")
    public static byte[][] field2813;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)V")
    public static final void method1182(byte arg0, int arg1) {
        class308.field4076 = 100;
        field2801++;
        if (arg0 == 32) {
            class134.field1953 = 3;
            class464.field6405 = arg1;
            class15.field215 = -1;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
    public static final void method1183(int arg0, int arg1) {
        field2804++;
        if (arg0 != 5173) {
            method1187(true);
        }
        if (class492.method2867(arg1, (byte) 98)) {
            class461.method2709(class146.field2099[arg1], -1, -122);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)V")
    public final void method1184(int arg0, boolean arg1) {
        if (!arg1) {
            field2811 = -64;
        }
        field2802++;
        class76 var3 = this.field2805;
        synchronized (this.field2805) {
            this.field2805.method496(arg0, -58);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
    public final void method1185(byte arg0) {
        field2809++;
        class76 var2 = this.field2805;
        synchronized (this.field2805) {
            this.field2805.method502(0);
        }
        int var3 = 6 % ((arg0 - 18) / 40);
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)Lie;")
    public final class6 method1186(int arg0, int arg1) {
        field2803++;
        class76 var3 = this.field2805;
        class6 var4;
        synchronized (this.field2805) {
            var4 = (class6) this.field2805.method493((byte) 19, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        } else if (arg1 == 7008) {
            byte[] var5 = this.field2800.method702((byte) 103, arg0, 30);
            class6 var6 = new class6();
            if (var5 != null) {
                var6.method43(arg1 - 7107, new class32(var5));
            }
            class76 var7 = this.field2805;
            synchronized (this.field2805) {
                this.field2805.method505((long) arg0, var6, arg1 ^ 0x1B19);
                return var6;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V")
    public static void method1187(boolean arg0) {
        field2810 = null;
        field2812 = null;
        field2813 = null;
        field2806 = null;
        if (!arg0) {
            field2812 = null;
        }
        field2814 = null;
        field2816 = null;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V")
    public final void method1188(byte arg0) {
        if (arg0 >= -17) {
            field2815 = false;
        }
        class76 var2 = this.field2805;
        synchronized (this.field2805) {
            this.field2805.method495(-113);
        }
        field2808++;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Ldn;ILr;)V")
    public class208(class329 arg0, int arg1, class110 arg2) {
        this.field2800 = arg2;
        this.field2800.method694(30, (byte) 119);
    }
}
