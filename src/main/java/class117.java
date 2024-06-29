import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class117 {

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Lhp;")
    private class277 field1453 = new class277(256);

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "Lkea;")
    private class203 field1454;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Leea;")
    public static class114 field1451 = new class114();

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "Lea;")
    public static class474 field1459;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field1458;

    static {
        new class474("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
        field1459 = new class474("Loading JAGMISC - ", "Lade JAGMISC - ", "Chargement JAGMISC - ", "Carregando JAGMISC - ");
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 3)
    public final void method721(int arg0) {
        field1456++;
        class277 var2 = this.field1453;
        synchronized (this.field1453) {
            this.field1453.method1805(-123);
            if (arg0 > -12) {
                this.field1453 = null;
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IBI)Z", line = 17)
    public static final boolean method722(int arg0, byte arg1, int arg2) {
        field1458++;
        int var3 = -65 / ((-arg1 - 45) / 41);
        return class240.method1599((byte) -126, arg2, arg0) | (arg2 & 0x800) != 0 || class626.method3595(arg2, (byte) 72, arg0);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 31)
    public static void method723(byte arg0) {
        field1451 = null;
        field1459 = null;
        if (arg0 != 41) {
            field1451 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V", line = 45)
    public final void method724(byte arg0) {
        field1455++;
        if (arg0 != -118) {
            this.field1453 = null;
        }
        class277 var2 = this.field1453;
        synchronized (this.field1453) {
            this.field1453.method1810(false);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Lhba;", line = 64)
    public final class10 method725(int arg0, int arg1) {
        field1450++;
        class277 var3 = this.field1453;
        class10 var4;
        synchronized (this.field1453) {
            var4 = (class10) this.field1453.method1801(arg0 ^ 0x1A, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class203 var5 = this.field1454;
        byte[] var6;
        synchronized (this.field1454) {
            var6 = this.field1454.method1286(arg1, arg0, (byte) -49);
        }
        class10 var7 = new class10();
        if (var6 != null) {
            var7.method60(true, new class194(var6));
        }
        class277 var8 = this.field1453;
        synchronized (this.field1453) {
            this.field1453.method1808((long) arg1, var7, (byte) -36);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 99)
    public static final void method726(String arg0, int arg1, int arg2, String arg3, String arg4, int arg5, String arg6) {
        field1457++;
        class342.method2200(arg0, arg6, arg2, arg3, arg1, arg4, (byte) -53, arg5, null);
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)V", line = 107)
    public final void method727(int arg0, int arg1) {
        field1452++;
        class277 var3 = this.field1453;
        synchronized (this.field1453) {
            this.field1453.method1811((byte) 106, arg1);
        }
        if (arg0 != 26) {
            this.method725(31, 27);
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lcda;ILkea;)V", line = 124)
    public class117(class149 arg0, int arg1, class203 arg2) {
        this.field1454 = arg2;
        this.field1454.method1309(1675886592, 26);
    }
}
