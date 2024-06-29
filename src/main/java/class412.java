import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class412 {

    @OriginalMember(owner = "client!op", name = "b", descriptor = "Leda;")
    private class14 field6067 = new class14(16);

    @OriginalMember(owner = "client!op", name = "d", descriptor = "Lla;")
    private class422 field6069;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "Lcb;")
    public static class631 field6075 = new class631(51, 15);

    @OriginalMember(owner = "client!op", name = "l", descriptor = "[I")
    public static int[] field6077 = new int[200];

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "Lla;")
    public static class422 field6072;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V", line = 4)
    public final void method2535(byte arg0) {
        if (arg0 >= -126) {
            return;
        }
        class14 var2 = this.field6067;
        synchronized (this.field6067) {
            this.field6067.method71((byte) 44);
        }
        field6074++;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(II)V", line = 17)
    public final void method2536(int arg0, int arg1) {
        class14 var3 = this.field6067;
        synchronized (this.field6067) {
            this.field6067.method68(-16878, arg1);
        }
        field6068++;
        if (arg0 != -3924) {
            field6072 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(II)Ltea;", line = 30)
    private final class563 method2537(int arg0, int arg1) {
        field6073++;
        class14 var3 = this.field6067;
        class563 var4;
        synchronized (this.field6067) {
            var4 = (class563) this.field6067.method80((byte) -118, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class422 var5 = this.field6069;
        byte[] var6;
        synchronized (this.field6069) {
            var6 = this.field6069.method2624(arg0, 29, arg1);
        }
        class563 var7 = new class563();
        if (var6 != null) {
            var7.method3259(new class301(var6), ~arg0);
        }
        class14 var8 = this.field6067;
        synchronized (this.field6067) {
            this.field6067.method67((long) arg1, var7, -6772);
            return var7;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Z)V", line = 64)
    public final void method2538(boolean arg0) {
        field6071++;
        class14 var2 = this.field6067;
        synchronized (this.field6067) {
            this.field6067.method76(122);
        }
        if (arg0) {
            this.method2539(-40, null, 76, 74, 71, 120);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILkca;IIII)Lcs;", line = 77)
    public final class335 method2539(int arg0, class756 arg1, int arg2, int arg3, int arg4, int arg5) {
        field6076++;
        class287[] var7 = null;
        if (arg3 != 10647) {
            return null;
        }
        class563 var8 = this.method2537(arg3 - 10647, arg4);
        if (var8.field7975 != null) {
            var7 = new class287[var8.field7975.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class490 var10 = arg1.method4206((byte) 72, var8.field7975[var9]);
                var7[var9] = new class287(var10.field7064, var10.field7076, var10.field7065, var10.field7066, var10.field7070, var10.field7069, var10.field7071, var10.field7072);
            }
        }
        return new class335(var8.field7970, var7, var8.field7971, arg5, arg2, arg0);
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lcr;ILla;)V", line = 132)
    public class412(class292 arg0, int arg1, class422 arg2) {
        this.field6069 = arg2;
        this.field6069.method2615(0, 29);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V", line = 121)
    public static void method2540(int arg0) {
        field6077 = null;
        if (arg0 != 200) {
            method2540(-25);
        }
        field6075 = null;
        field6072 = null;
    }
}
