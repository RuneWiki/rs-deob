import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public abstract class class261 {

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "Lih;")
    public class214 field4358;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "Lap;")
    public static class340 field4357 = new class340(5000);

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "Lnk;")
    public static class326 field4361 = new class326(80, -1);

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "Lit;")
    public static class514 field4363;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field4362;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
    public static final void method1746(int arg0) {
        class487.field7140.method1604(4);
        field4359++;
        if (arg0 >= -85) {
            method1748((byte) 26, 105, 108);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(III)V")
    public abstract void method1021(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZB)V")
    public abstract void method1020(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IZ)V")
    public abstract void method1022(int arg0, boolean arg1);

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V")
    public static void method1747(int arg0) {
        field4362 = null;
        if (arg0 != 3) {
            method1747(-68);
        }
        field4363 = null;
        field4357 = null;
        field4361 = null;
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)Z")
    public abstract boolean method1026(int arg0);

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BII)Ljava/lang/String;")
    public static final String method1748(byte arg0, int arg1, int arg2) {
        int var3 = 29 % ((-arg0 - 37) / 59);
        field4360++;
        int var4 = arg2 - arg1;
        if (var4 < -9) {
            return "<col=ff0000>";
        } else if (var4 < -6) {
            return "<col=ff3000>";
        } else if (var4 < -3) {
            return "<col=ff7000>";
        } else if (var4 < 0) {
            return "<col=ffb000>";
        } else if (var4 > 9) {
            return "<col=00ff00>";
        } else if (var4 > 6) {
            return "<col=40ff00>";
        } else if (var4 > 3) {
            return "<col=80ff00>";
        } else if (var4 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lih;)V")
    public class261(class214 arg0) {
        this.field4358 = arg0;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IILkk;)V")
    public abstract void method1024(int arg0, int arg1, class179 arg2);

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "(I)V")
    public abstract void method1023(int arg0);
}
