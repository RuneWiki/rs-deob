import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class308 {

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "Lad;")
    private class11 field3958 = new class11(64);

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "Ldn;")
    private class201 field3960;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "Loi;")
    public static class169 field3957 = new class169("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "Ljd;")
    public static class408 field3961 = new class408(12, 0, 1, 0);

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "Lad;")
    public static class11 field3963 = new class11(8);

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "F")
    public static float field3965;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V", line = 7)
    public final void method1834(byte arg0) {
        if (arg0 <= 100) {
            this.field3958 = null;
        }
        class11 var2 = this.field3958;
        synchronized (this.field3958) {
            this.field3958.method90((byte) -27);
        }
        field3964++;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(B)V", line = 22)
    public final void method1835(byte arg0) {
        if (arg0 != -76) {
            this.method1835((byte) -11);
        }
        class11 var2 = this.field3958;
        synchronized (this.field3958) {
            this.field3958.method84(arg0 - 27);
        }
        field3959++;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IB)V", line = 37)
    public final void method1836(int arg0, byte arg1) {
        class11 var3 = this.field3958;
        synchronized (this.field3958) {
            this.field3958.method80(-51, arg0);
        }
        field3962++;
        if (arg1 < 76) {
            method1838(93);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)Lui;", line = 58)
    public final class483 method1837(int arg0, int arg1) {
        field3956++;
        class11 var3 = this.field3958;
        class483 var4;
        synchronized (this.field3958) {
            var4 = (class483) this.field3958.method78((long) arg1, (byte) -121);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3960.method1313((byte) -109, arg0, arg1);
        class483 var6 = new class483();
        if (var5 != null) {
            var6.method2898(new class88(var5), 0);
        }
        class11 var7 = this.field3958;
        synchronized (this.field3958) {
            this.field3958.method88((long) arg1, 38, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V", line = 83)
    public static void method1838(int arg0) {
        field3961 = null;
        field3957 = null;
        if (arg0 != 8) {
            field3961 = null;
        }
        field3963 = null;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lgt;ILdn;)V", line = 108)
    public class308(class65 arg0, int arg1, class201 arg2) {
        this.field3960 = arg2;
        if (this.field3960 != null) {
            this.field3960.method1302(-68, 11);
        }
    }
}
