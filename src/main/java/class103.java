import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class103 {

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "Lrp;")
    private class288 field1828 = new class288(64);

    @OriginalMember(owner = "client!kt", name = "l", descriptor = "Lrp;")
    public class288 field1834 = new class288(2);

    @OriginalMember(owner = "client!kt", name = "k", descriptor = "Llt;")
    public class458 field1833;

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "Llt;")
    private class458 field1826;

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "Lsk;")
    public static class423 field1827 = new class423("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!kt", name = "j", descriptor = "I")
    public static int field1832 = 16777215;

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "I")
    public static int field1830 = 0;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!kt", name = "i", descriptor = "Luu;")
    public static class180 field1831;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V", line = 10)
    public final void method760(int arg0) {
        class288 var2 = this.field1828;
        synchronized (this.field1828) {
            if (arg0 != -32355) {
                return;
            }
            this.field1828.method1761(-113);
        }
        field1825++;
        class288 var3 = this.field1834;
        synchronized (this.field1834) {
            this.field1834.method1761(-126);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)Lkf;", line = 27)
    public final class159 method761(int arg0, int arg1) {
        field1824++;
        class288 var3 = this.field1828;
        class159 var4;
        synchronized (this.field1828) {
            var4 = (class159) this.field1828.method1752(arg0 ^ 0x21, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1826.method2715(arg1, arg0, false);
        class159 var6 = new class159();
        var6.field2497 = this;
        if (var5 != null) {
            var6.method1018(-1, new class40(var5));
        }
        class288 var7 = this.field1828;
        synchronized (this.field1828) {
            this.field1828.method1758(1, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)V", line = 57)
    public static void method762(int arg0) {
        if (arg0 == 16521) {
            field1827 = null;
            field1831 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)V", line = 68)
    public final void method763(int arg0) {
        field1823++;
        class288 var2 = this.field1828;
        synchronized (this.field1828) {
            if (arg0 > -18) {
                this.method760(-74);
            }
            this.field1828.method1749((byte) -45);
        }
        class288 var3 = this.field1834;
        synchronized (this.field1834) {
            this.field1834.method1749((byte) 125);
        }
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(II)I", line = 97)
    public static int method764(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lcm;ILlt;Llt;)V", line = 129)
    public class103(class491 arg0, int arg1, class458 arg2, class458 arg3) {
        this.field1833 = arg3;
        this.field1826 = arg2;
        this.field1826.method2726((byte) 113, 33);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZ)V", line = 107)
    public final void method765(int arg0, boolean arg1) {
        class288 var3 = this.field1828;
        synchronized (this.field1828) {
            this.field1828.method1760(arg0, 30398);
            if (!arg1) {
                this.field1833 = null;
            }
        }
        field1829++;
        class288 var4 = this.field1834;
        synchronized (this.field1834) {
            this.field1834.method1760(arg0, 30398);
        }
    }
}
