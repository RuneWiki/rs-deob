import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class138 {

    @OriginalMember(owner = "client!om", name = "g", descriptor = "Lco;")
    private class210 field1672 = new class210(256);

    @OriginalMember(owner = "client!om", name = "h", descriptor = "Lg;")
    private class470 field1673;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "Lsd;")
    public static class74 field1667 = new class74(22, 2);

    @OriginalMember(owner = "client!om", name = "e", descriptor = "Lec;")
    public static class40 field1670 = new class40("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!om", name = "f", descriptor = "[I")
    public static int[] field1671 = new int[2048];

    @OriginalMember(owner = "client!om", name = "l", descriptor = "[S")
    public static short[] field1677 = new short[256];

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)V")
    public final void method656(int arg0, byte arg1) {
        if (arg1 < 23) {
            this.field1672 = null;
        }
        field1676++;
        class210 var3 = this.field1672;
        synchronized (this.field1672) {
            this.field1672.method1166(arg0, (byte) -52);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
    public final void method657(int arg0) {
        field1669++;
        class210 var2 = this.field1672;
        synchronized (this.field1672) {
            int var3 = 61 % ((arg0 + 67) / 55);
            this.field1672.method1165((byte) 118);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V")
    public static final void method658(int arg0, int arg1) {
        field1668++;
        class325.field4690 = -1;
        class17.field218 = arg1;
        if (arg0 != -13903) {
            method658(-18, 63);
        }
        class325.field4690 = -1;
        class184.method1003(arg0 ^ 0x3630);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
    public final void method659(byte arg0) {
        field1666++;
        if (arg0 == 126) {
            class210 var2 = this.field1672;
            synchronized (this.field1672) {
                this.field1672.method1169(1076);
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BC)C")
    public static final char method660(byte arg0, char arg1) {
        if (arg0 != 5) {
            field1667 = null;
        }
        field1675++;
        return arg1 == 'µ' || arg1 == 'ƒ' ? arg1 : Character.toTitleCase(arg1);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(II)Lje;")
    public final class323 method661(int arg0, int arg1) {
        field1674++;
        class210 var3 = this.field1672;
        class323 var4;
        synchronized (this.field1672) {
            var4 = (class323) this.field1672.method1163((byte) -110, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1673.method2768(-20472, arg0, arg1);
        class323 var6 = new class323();
        if (var5 != null) {
            var6.method1972((byte) 11, new class179(var5));
        }
        class210 var7 = this.field1672;
        synchronized (this.field1672) {
            this.field1672.method1172((long) arg0, 1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lci;ILg;)V")
    public class138(class421 arg0, int arg1, class470 arg2) {
        this.field1673 = arg2;
        this.field1673.method2755(-79, 26);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
    public static void method662(int arg0) {
        field1670 = null;
        field1667 = null;
        field1671 = null;
        if (arg0 != -28594) {
            field1667 = null;
        }
        field1677 = null;
    }
}
