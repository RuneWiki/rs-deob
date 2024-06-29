import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class582 {

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "Ljda;")
    private class239 field7775 = new class239(64);

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "Laj;")
    private class333 field7783;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "Z")
    public static boolean field7774 = false;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "Ltja;")
    public static class288 field7780 = new class288(7, 3);

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public static int field7776;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field7777;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public static int field7778;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    public static int field7779;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
    public static int field7781;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "I")
    public static int field7782;

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
    public static int field7784;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IB)V", line = 8)
    public final void method3236(int arg0, byte arg1) {
        field7782++;
        class239 var3 = this.field7775;
        synchronized (this.field7775) {
            this.field7775.method1546(arg0, (byte) -8);
            if (arg1 <= 2) {
                this.field7783 = null;
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V", line = 22)
    public final void method3237(int arg0) {
        class239 var2 = this.field7775;
        synchronized (this.field7775) {
            this.field7775.method1552(-124);
            if (arg0 != -1) {
                field7780 = null;
            }
        }
        field7776++;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)Lcca;", line = 36)
    public final class261 method3238(int arg0, int arg1) {
        field7784++;
        class239 var3 = this.field7775;
        class261 var4;
        synchronized (this.field7775) {
            var4 = (class261) this.field7775.method1541(-10, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class333 var5 = this.field7783;
        byte[] var6;
        synchronized (this.field7783) {
            var6 = this.field7783.method2095(class370.method2302(arg0, (byte) 35), class333.method2089(-2040428310, arg0), 1);
        }
        if (arg1 < 105) {
            this.method3236(-122, (byte) -55);
        }
        class261 var7 = new class261();
        if (var6 != null) {
            var7.method1728(new class376(var6), true);
        }
        class239 var8 = this.field7775;
        synchronized (this.field7775) {
            this.field7775.method1544(true, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZ)V", line = 75)
    public final void method3239(int arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field7777++;
        class239 var3 = this.field7775;
        synchronized (this.field7775) {
            this.field7775.method1555((byte) -3);
            this.field7775 = new class239(arg0);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)V", line = 90)
    public static void method3240(boolean arg0) {
        field7780 = null;
        if (!arg0) {
            method3243((byte) -83);
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(Z)V", line = 103)
    public static final void method3241(boolean arg0) {
        field7778++;
        if (!arg0) {
            class537.field7310 = "";
            class83.field1175 = "";
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V", line = 114)
    public final void method3242(byte arg0) {
        if (arg0 != 42) {
            method3241(false);
        }
        class239 var2 = this.field7775;
        synchronized (this.field7775) {
            this.field7775.method1555((byte) -3);
        }
        field7779++;
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lgia;ILaj;)V", line = 185)
    public class582(class285 arg0, int arg1, class333 arg2) {
        this.field7783 = arg2;
        if (this.field7783 != null) {
            int var4 = this.field7783.method2094((byte) -115) - 1;
            this.field7783.method2090(var4, false);
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)V", line = 133)
    public static final void method3243(byte arg0) {
        if (class517.field7061 != null) {
            for (int var1 = 0; var1 < class135.field1988; var1++) {
                class517.field7061[var1] = null;
            }
            class517.field7061 = null;
        }
        field7781++;
        if (class64.field906 != null) {
            for (int var2 = 0; var2 < class665.field9191; var2++) {
                class64.field906[var2] = null;
            }
            class64.field906 = null;
        }
        if (class537.field7312 != null) {
            for (int var3 = 0; var3 < class743.field10262; var3++) {
                class537.field7312[var3] = null;
            }
            class537.field7312 = null;
        }
        class598.field8138 = -1;
        class492.field6819 = -1;
        class268.field3958 = null;
        class719.field10030 = null;
        int var4 = -17 / ((21 - arg0) / 59);
        class280.field4140 = null;
    }
}
