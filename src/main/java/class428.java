import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class428 {

    @OriginalMember(owner = "client!mea", name = "f", descriptor = "Lof;")
    private class620 field6222 = new class620(64);

    @OriginalMember(owner = "client!mea", name = "g", descriptor = "Loh;")
    private class404 field6223;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
    public static int field6217 = -1;

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!mea", name = "d", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!mea", name = "e", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!mea", name = "h", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!mea", name = "i", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(II)V", line = 3)
    public final void method2675(int arg0, int arg1) {
        if (arg1 != 64) {
            return;
        }
        field6219++;
        class620 var3 = this.field6222;
        synchronized (this.field6222) {
            this.field6222.method3539((byte) 114, arg0);
        }
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(II)Lfga;", line = 18)
    public final class255 method2676(int arg0, int arg1) {
        field6225++;
        class620 var3 = this.field6222;
        class255 var4;
        synchronized (this.field6222) {
            var4 = (class255) this.field6222.method3538((long) arg0, 0);
            if (arg1 < 29) {
                field6217 = 93;
            }
        }
        if (var4 != null) {
            return var4;
        }
        class404 var5 = this.field6223;
        byte[] var6;
        synchronized (this.field6223) {
            var6 = this.field6223.method2481(32, arg0, (byte) 126);
        }
        class255 var7 = new class255();
        if (var6 != null) {
            var7.method1521(118, new class244(var6));
        }
        class620 var8 = this.field6222;
        synchronized (this.field6222) {
            this.field6222.method3537(-106, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Ltp;I)V", line = 49)
    public static final void method2677(class532 arg0, int arg1) {
        if (arg1 <= 49) {
            return;
        }
        field6220++;
        if (class643.field9206 != arg0.field7664) {
            return;
        }
        if (class90.field937.field2157 == null) {
            arg0.field7555 = 0;
            arg0.field7596 = 0;
            return;
        }
        arg0.field7594 = 150;
        arg0.field7654 = (int) (Math.sin((double) class392.field5398 / 40.0D) * 256.0D) & 0x7FF;
        arg0.field7685 = 5;
        arg0.field7596 = class701.field9893;
        arg0.field7555 = class478.method2877(class90.field937.field2157, (byte) -17);
        arg0.field7636 = 0;
        arg0.field7705 = class90.field937.field7147;
        arg0.field7547 = class90.field937.field7150;
        arg0.field7695 = class90.field937.field7175;
        class25 var2 = arg0.field7705 == -1 ? null : class637.field9158.method1905(103, arg0.field7705);
        if (var2 != null) {
            class339.method2014(var2, 5271, arg0.field7547);
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)V", line = 97)
    public static final void method2678(boolean arg0) {
        field6224++;
        if (!arg0) {
            method2678(true);
        }
        class471.field6718 = -1;
        class75.field796 = -1;
        class125.field1308 = 0;
        class85.field904 = -1;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)V", line = 112)
    public final void method2679(byte arg0) {
        field6221++;
        class620 var2 = this.field6222;
        synchronized (this.field6222) {
            int var3 = -59 % ((-arg0 - 32) / 44);
            this.field6222.method3549(0);
        }
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(B)V", line = 130)
    public final void method2680(byte arg0) {
        if (arg0 < 84) {
            this.method2676(55, 61);
        }
        class620 var2 = this.field6222;
        synchronized (this.field6222) {
            this.field6222.method3541(-647);
        }
        field6218++;
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lnb;ILoh;)V", line = 146)
    public class428(class301 arg0, int arg1, class404 arg2) {
        this.field6223 = arg2;
        this.field6223.method2482(0, 32);
    }
}
