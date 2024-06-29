import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public abstract class class404 extends class179 {

    @OriginalMember(owner = "client!et", name = "n", descriptor = "Z")
    public boolean field5873;

    @OriginalMember(owner = "client!et", name = "q", descriptor = "[Let;")
    public class404[] field5876;

    @OriginalMember(owner = "client!et", name = "l", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!et", name = "m", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!et", name = "o", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!et", name = "p", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!et", name = "r", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!et", name = "s", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!et", name = "t", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!et", name = "u", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!et", name = "v", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!et", name = "w", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!et", name = "x", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!et", name = "y", descriptor = "I")
    public int field5884;

    @OriginalMember(owner = "client!et", name = "j", descriptor = "Ljm;")
    public class466 field5869;

    @OriginalMember(owner = "client!et", name = "k", descriptor = "Lgv;")
    public class53 field5870;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IBI)[I")
    public final int[] method2394(int arg0, byte arg1, int arg2) {
        field5878++;
        if (arg1 != 64) {
            this.field5876 = null;
        }
        return this.field5876[arg0].field5873 ? this.field5876[arg0].method90(-48, arg2) : this.field5876[arg0].method89(-1, arg2)[0];
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II)[I")
    public int[] method90(int arg0, int arg1) {
        field5882++;
        if (arg0 <= -47) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(BII)V")
    public void method2395(byte arg0, int arg1, int arg2) {
        field5883++;
        int var4 = this.field5884 == 255 ? arg2 : this.field5884;
        if (this.field5873) {
            this.field5870 = new class53(var4, arg2, arg1);
        } else {
            this.field5869 = new class466(var4, arg2, arg1);
        }
        int var5 = 93 % ((74 - arg0) / 45);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILha;I)V")
    public void method87(int arg0, class40 arg1, int arg2) {
        if (arg0 != 0) {
            this.field5884 = 48;
        }
        field5879++;
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(I)V")
    public void method211(int arg0) {
        if (arg0 != -3) {
            this.field5876 = null;
        }
        field5871++;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2396(String arg0, int arg1) {
        field5881++;
        if (class105.field1855 == null) {
            class1.method1(-2);
        }
        String[] var2 = class499.method3003((char) arg1, 1, arg0);
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class178.field2785; var4 > 0; var4--) {
                class105.field1855[var4] = class105.field1855[var4 - 1];
            }
            class105.field1855[0] = var2[var3];
            if (class178.field2785 < (class105.field1855.length - 1)) {
                if (class388.field5619 > 0) {
                    class388.field5619++;
                }
                class178.field2785++;
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "e", descriptor = "(I)V")
    public void method2397(int arg0) {
        field5877++;
        if (arg0 <= 13) {
            return;
        }
        if (this.field5873) {
            this.field5870.method370(-51);
            this.field5870 = null;
        } else {
            this.field5869.method2821((byte) -128);
            this.field5869 = null;
        }
    }

    @OriginalMember(owner = "client!et", name = "f", descriptor = "(I)I")
    public int method2398(int arg0) {
        field5880++;
        if (arg0 != 0) {
            this.method2400(-65, -59, -79);
        }
        return -1;
    }

    @OriginalMember(owner = "client!et", name = "g", descriptor = "(I)I")
    public int method2399(int arg0) {
        field5875++;
        return arg0 < 119 ? -77 : -1;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(III)[[I")
    public final int[][] method2400(int arg0, int arg1, int arg2) {
        if (arg0 != -11872) {
            this.field5873 = false;
        }
        field5872++;
        if (this.field5876[arg2].field5873) {
            int[] var4 = this.field5876[arg2].method90(-100, arg1);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field5876[arg2].method89(-1, arg1);
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(II)[[I")
    public int[][] method89(int arg0, int arg1) {
        field5874++;
        if (arg0 != -1) {
            this.field5869 = null;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(IZ)V")
    public class404(int arg0, boolean arg1) {
        this.field5873 = arg1;
        this.field5876 = new class404[arg0];
    }
}
