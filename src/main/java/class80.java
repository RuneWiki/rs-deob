import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class80 {

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Lme;")
    private class668 field1100 = new class668(64);

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Lpe;")
    private class615 field1099;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "[I")
    public static int[] field1098 = new int[1];

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Lnj;")
    public static class415 field1102 = new class415(3, -1);

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "F")
    public static float field1105;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Ldga;")
    public static class230 field1104;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "Lxa;")
    public static class511 field1103;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V", line = 6)
    public static void method630(byte arg0) {
        field1103 = null;
        field1104 = null;
        field1102 = null;
        field1098 = null;
        if (arg0 != -69) {
            field1104 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lew;", line = 23)
    public final class226 method631(int arg0, int arg1) {
        field1101++;
        class668 var3 = this.field1100;
        class226 var4;
        synchronized (this.field1100) {
            var4 = (class226) this.field1100.method3655(111, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class615 var5 = this.field1099;
        byte[] var6;
        synchronized (this.field1099) {
            var6 = this.field1099.method3346(-1, 5, arg0);
        }
        class226 var7 = new class226();
        if (var6 != null) {
            var7.method1418(new class418(var6), 0);
        }
        if (arg1 >= -105) {
            this.field1100 = null;
        }
        class668 var8 = this.field1100;
        synchronized (this.field1100) {
            this.field1100.method3650((long) arg0, -104, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lvd;ILpe;)V", line = 69)
    public class80(class635 arg0, int arg1, class615 arg2) {
        this.field1099 = arg2;
        this.field1099.method3341(5, -19046);
    }
}
