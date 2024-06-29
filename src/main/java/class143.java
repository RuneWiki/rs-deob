import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class143 {

    @OriginalMember(owner = "client!at", name = "c", descriptor = "Lme;")
    private class668 field1871 = new class668(64);

    @OriginalMember(owner = "client!at", name = "f", descriptor = "Lpe;")
    private class615 field1874;

    @OriginalMember(owner = "client!at", name = "g", descriptor = "Lra;")
    public static class361 field1875 = new class361(90, 20);

    @OriginalMember(owner = "client!at", name = "j", descriptor = "I")
    public static int field1878 = 0;

    @OriginalMember(owner = "client!at", name = "i", descriptor = "[I")
    public static int[] field1877 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!at", name = "a", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!at", name = "b", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!at", name = "e", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!at", name = "h", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!at", name = "l", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "[I")
    public static int[] field1879;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V", line = 6)
    public final void method1072(byte arg0) {
        field1870++;
        if (arg0 >= -11) {
            this.method1072((byte) -30);
        }
        class668 var2 = this.field1871;
        synchronized (this.field1871) {
            this.field1871.method3658(0);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(II)V", line = 22)
    public final void method1073(int arg0, int arg1) {
        class668 var3 = this.field1871;
        synchronized (this.field1871) {
            this.field1871.method3659(-114, arg0);
        }
        field1880++;
        if (arg1 != 104) {
            this.field1874 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(B)V", line = 35)
    public final void method1074(byte arg0) {
        class668 var2 = this.field1871;
        synchronized (this.field1871) {
            this.field1871.method3656((byte) 0);
        }
        if (arg0 >= -66) {
            this.method1072((byte) 49);
        }
        field1872++;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(BI)Lof;", line = 49)
    public final class428 method1075(byte arg0, int arg1) {
        field1873++;
        class668 var3 = this.field1871;
        class428 var4;
        synchronized (this.field1871) {
            var4 = (class428) this.field1871.method3655(31, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class615 var5 = this.field1874;
        byte[] var6;
        synchronized (this.field1874) {
            var6 = this.field1874.method3346(-1, 11, arg1);
        }
        class428 var7 = new class428();
        if (var6 != null) {
            var7.method2457(new class418(var6), (byte) 56);
        }
        if (arg0 != -65) {
            return null;
        }
        class668 var8 = this.field1871;
        synchronized (this.field1871) {
            this.field1871.method3650((long) arg1, -101, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(B)V", line = 80)
    public static void method1076(byte arg0) {
        field1877 = null;
        int var1 = -110 / ((arg0 + 7) / 38);
        field1875 = null;
        field1879 = null;
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lvd;ILpe;)V", line = 97)
    public class143(class635 arg0, int arg1, class615 arg2) {
        this.field1874 = arg2;
        if (this.field1874 != null) {
            this.field1874.method3341(11, -19046);
        }
    }
}
