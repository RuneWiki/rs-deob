import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class118 {

    @OriginalMember(owner = "client!io", name = "b", descriptor = "Ld;")
    private class242 field1814 = new class242(128);

    @OriginalMember(owner = "client!io", name = "h", descriptor = "Lum;")
    private class83 field1820;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "Z")
    public static boolean field1821 = false;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "Ljp;")
    public static class55 field1817 = new class55(95, 8);

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!io", name = "j", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "Lio;")
    public static class118 field1813;

    @OriginalMember(owner = "client!io", name = "k", descriptor = "[[I")
    public static int[][] field1823;

    static {
        new class179("From", "Von:", "De", "De");
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)Lgj;", line = 5)
    public final class70 method886(byte arg0, int arg1) {
        if (arg0 <= 3) {
            this.method886((byte) 92, -37);
        }
        field1822++;
        class242 var3 = this.field1814;
        class70 var4;
        synchronized (this.field1814) {
            var4 = (class70) this.field1814.method1634((long) arg1, 64);
        }
        if (var4 != null) {
            return var4;
        }
        class83 var5 = this.field1820;
        byte[] var6;
        synchronized (this.field1820) {
            var6 = this.field1820.method731(0, arg1, 1);
        }
        class70 var7 = new class70();
        if (var6 != null) {
            var7.method608(-88, new class194(var6));
        }
        class242 var8 = this.field1814;
        synchronized (this.field1814) {
            this.field1814.method1623((long) arg1, 17621, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V", line = 36)
    public static void method887(boolean arg0) {
        field1813 = null;
        field1817 = null;
        if (!arg0) {
            method890((byte) 74);
        }
        field1823 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IB)V", line = 49)
    public final void method888(int arg0, byte arg1) {
        class242 var3 = this.field1814;
        synchronized (this.field1814) {
            this.field1814.method1631(arg0, (byte) -19);
        }
        if (arg1 > -113) {
            this.method888(-43, (byte) 102);
        }
        field1819++;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(Z)V", line = 70)
    public final void method889(boolean arg0) {
        field1818++;
        class242 var2 = this.field1814;
        synchronized (this.field1814) {
            this.field1814.method1637((byte) 13);
        }
        if (arg0) {
            method890((byte) 85);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V", line = 84)
    public static final void method890(byte arg0) {
        if (arg0 != 101) {
            field1817 = null;
        }
        class521.field7646 = -1;
        field1815++;
        class488.field7136 = -1;
        class378.field5573 = 0;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V", line = 97)
    public final void method891(int arg0) {
        field1816++;
        class242 var2 = this.field1814;
        synchronized (this.field1814) {
            this.field1814.method1630(-20);
        }
        if (arg0 >= -84) {
            this.method888(-55, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lpt;ILum;)V", line = 122)
    public class118(class308 arg0, int arg1, class83 arg2) {
        this.field1820 = arg2;
        this.field1820.method748(1, 12408);
    }
}
