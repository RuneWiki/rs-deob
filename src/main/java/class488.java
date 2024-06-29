import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class488 {

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "Ljava/lang/String;")
    private String field7063 = "null";

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Lkc;")
    public static class157 field7062 = new class157("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "[F")
    public static float[] field7075 = new float[4];

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "C")
    public char field7059;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "C")
    public char field7064;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    private int field7058;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field7061;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field7065;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field7066;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field7070;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field7071;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    public static int field7072;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Lew;")
    private class270 field7057;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "Lew;")
    public class270 field7073;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "Ldk;")
    public static class421 field7069;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public final String method2894(int arg0, boolean arg1) {
        field7068++;
        if (this.field7073 == null) {
            return this.field7063;
        }
        class189 var3 = (class189) this.field7073.method1592((byte) -25, (long) arg0);
        if (arg1) {
            return null;
        } else if (var3 == null) {
            return this.field7063;
        } else {
            return var3.field2777;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLsv;)V")
    public final void method2895(byte arg0, class319 arg1) {
        if (arg0 >= -46) {
            method2898((byte) -114, null);
        }
        while (true) {
            int var3 = arg1.method1869(-77);
            if (var3 == 0) {
                field7070++;
                return;
            }
            this.method2896(27405, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILsv;I)V")
    private final void method2896(int arg0, class319 arg1, int arg2) {
        field7071++;
        if (arg2 == 1) {
            this.field7064 = class294.method1703(arg1.method1894(-2018), -833419040);
        } else if (arg2 == 2) {
            this.field7059 = class294.method1703(arg1.method1894(arg0 - 29423), -833419040);
        } else if (arg2 == 3) {
            this.field7063 = arg1.method1871(104);
        } else if (arg2 == 4) {
            this.field7058 = arg1.method1863(-1);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method1844(-118);
            this.field7073 = new class270(class274.method1604(var4, (byte) -105));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1863(arg0 - 27406);
                class476 var7;
                if (arg2 == 5) {
                    var7 = new class189(arg1.method1871(26));
                } else {
                    var7 = new class437(arg1.method1863(-1));
                }
                this.field7073.method1586(var7, (long) var6, 1);
            }
        }
        if (arg0 != 27405) {
            this.method2900(false, 67);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    private final void method2897(int arg0) {
        this.field7057 = new class270(this.field7073.method1587((byte) -127));
        if (arg0 != 0) {
            this.field7073 = null;
        }
        field7074++;
        for (class437 var2 = (class437) this.field7073.method1588(34); var2 != null; var2 = (class437) this.field7073.method1582(-116)) {
            class437 var3 = new class437((int) var2.field6883);
            this.field7057.method1586(var3, (long) var2.field6308, arg0 ^ 0x1);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method2898(byte arg0, String arg1) {
        field7072++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class399.field5724; var2++) {
            if (arg1.equalsIgnoreCase(class494.field7148[var2])) {
                return true;
            }
        }
        if (arg0 != -71) {
            field7069 = null;
        }
        return arg1.equalsIgnoreCase(class81.field1158.field7036);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method2899(String arg0, int arg1) {
        field7067++;
        if (this.field7073 == null) {
            return false;
        }
        if (this.field7057 == null) {
            this.method2902((byte) 127);
        }
        if (arg1 != -6) {
            this.method2902((byte) 96);
        }
        for (class95 var3 = (class95) this.field7057.method1592((byte) -25, class187.method1251((byte) 108, arg0)); var3 != null; var3 = (class95) this.field7057.method1590((byte) 34)) {
            if (var3.field1539.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)I")
    public final int method2900(boolean arg0, int arg1) {
        field7060++;
        if (this.field7073 == null) {
            return this.field7058;
        }
        class437 var3 = (class437) this.field7073.method1592((byte) -25, (long) arg1);
        if (arg0) {
            return var3 == null ? this.field7058 : var3.field6308;
        } else {
            return -124;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
    public static void method2901(int arg0) {
        field7075 = null;
        field7062 = null;
        if (arg0 != -1) {
            field7075 = null;
        }
        field7069 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    private final void method2902(byte arg0) {
        int var2 = -30 / ((66 - arg0) / 60);
        field7066++;
        this.field7057 = new class270(this.field7073.method1587((byte) -87));
        for (class189 var3 = (class189) this.field7073.method1588(53); var3 != null; var3 = (class189) this.field7073.method1582(-115)) {
            class95 var4 = new class95(var3.field2777, (int) var3.field6883);
            this.field7057.method1586(var4, class187.method1251((byte) 108, var3.field2777), 1);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)Z")
    public final boolean method2903(int arg0, int arg1) {
        field7061++;
        if (this.field7073 == null) {
            return false;
        }
        if (this.field7057 == null) {
            this.method2897(0);
        }
        class437 var3 = (class437) this.field7057.method1592((byte) -25, (long) arg1);
        if (arg0 > -107) {
            return true;
        } else {
            return var3 != null;
        }
    }
}
