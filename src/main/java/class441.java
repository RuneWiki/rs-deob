import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class441 {

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "Ler;")
    private class157 field6557 = new class157(256);

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "Lns;")
    private class438 field6560;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "Z")
    public static boolean field6559 = false;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field6562 = -1;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Lpg;")
    public static class492 field6554 = new class492(85, 2);

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field6563 = -1;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field6564 = 0;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 3)
    public final void method2662(int arg0) {
        field6555++;
        class157 var2 = this.field6557;
        synchronized (this.field6557) {
            this.field6557.method1015((byte) 119);
            if (arg0 != -1008) {
                field6563 = 37;
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V", line = 16)
    public static void method2663(byte arg0) {
        field6554 = null;
        if (arg0 < 57) {
            method2663((byte) -116);
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V", line = 33)
    public final void method2664(byte arg0) {
        int var2 = 85 / ((-arg0 - 18) / 44);
        class157 var3 = this.field6557;
        synchronized (this.field6557) {
            this.field6557.method1022((byte) -34);
        }
        field6556++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Z", line = 45)
    public static final boolean method2665(int arg0, int arg1) {
        if (arg1 != -26) {
            field6563 = 117;
        }
        field6553++;
        if (arg0 == 11 || arg0 == 51 || arg0 == 6 || arg0 == 25 || arg0 == 1007) {
            return true;
        } else {
            return arg0 == 4 || arg0 == 1006;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZ)Lsq;", line = 66)
    public final class145 method2666(int arg0, boolean arg1) {
        field6561++;
        class157 var3 = this.field6557;
        class145 var4;
        synchronized (this.field6557) {
            var4 = (class145) this.field6557.method1013((long) arg0, (byte) -106);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6560.method2650(arg0, -107, 26);
        class145 var6 = new class145();
        if (var5 != null) {
            var6.method965(new class91(var5), (byte) -105);
        }
        class157 var7 = this.field6557;
        synchronized (this.field6557) {
            if (!arg1) {
                this.field6557 = null;
            }
            this.field6557.method1012(-125, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)V", line = 97)
    public final void method2667(int arg0, int arg1) {
        if (arg0 >= -15) {
            field6559 = false;
        }
        class157 var3 = this.field6557;
        synchronized (this.field6557) {
            this.field6557.method1016(arg1, (byte) 120);
        }
        field6558++;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lgo;ILns;)V", line = 116)
    public class441(class331 arg0, int arg1, class438 arg2) {
        this.field6560 = arg2;
        this.field6560.method2645(1, 26);
    }
}
