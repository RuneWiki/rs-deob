import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class37 {

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "Ljava/lang/String;")
    private String field768 = "null";

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "Lhu;")
    public static class111 field767 = new class111("stellardawn", 1);

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "[I")
    public static int[] field776 = new int[1000];

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "Z")
    public static boolean field781 = true;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "C")
    public char field770;

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "C")
    public char field778;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!vo", name = "q", descriptor = "I")
    private int field780;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "Ldea;")
    private class205 field771;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "Ldea;")
    public class205 field775;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "[I")
    public static int[] field772;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V")
    public static void method385(byte arg0) {
        field772 = null;
        int var1 = 83 % ((28 - arg0) / 37);
        field767 = null;
        field776 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI)I")
    public final int method386(byte arg0, int arg1) {
        field766++;
        if (arg0 >= -73) {
            return 47;
        } else if (this.field775 == null) {
            return this.field780;
        } else {
            class10 var3 = (class10) this.field775.method1242(0, (long) arg1);
            return var3 == null ? this.field780 : var3.field106;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
    private final void method387(int arg0) {
        field765++;
        this.field771 = new class205(this.field775.method1244(9));
        for (class118 var2 = (class118) this.field775.method1248(-1); var2 != null; var2 = (class118) this.field775.method1245((byte) 95)) {
            class568 var3 = new class568(var2.field1939, (int) var2.field2524);
            this.field771.method1241(var3, class95.method687(0, var2.field1939), -124);
        }
        if (arg0 < 28) {
            this.method392((byte) 90, null, 27);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ldaa;I)V")
    public final void method388(class11 arg0, int arg1) {
        field769++;
        while (true) {
            int var3 = arg0.method110((byte) 53);
            if (var3 == 0) {
                if (arg1 == 2730) {
                    return;
                } else {
                    this.method390(-100, -12);
                    return;
                }
            }
            this.method392((byte) -119, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)V")
    private final void method389(byte arg0) {
        field764++;
        int var2 = 56 / ((-arg0 - 16) / 39);
        this.field771 = new class205(this.field775.method1244(9));
        for (class10 var3 = (class10) this.field775.method1248(-1); var3 != null; var3 = (class10) this.field775.method1245((byte) 95)) {
            class10 var4 = new class10((int) var3.field2524);
            this.field771.method1241(var4, (long) var3.field106, -116);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)Z")
    public final boolean method390(int arg0, int arg1) {
        field773++;
        if (this.field775 == null) {
            return false;
        }
        if (this.field771 == null) {
            this.method389((byte) -85);
        }
        class10 var3 = (class10) this.field771.method1242(0, (long) arg1);
        if (arg0 <= 106) {
            this.field780 = 127;
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(BI)Ljava/lang/String;")
    public final String method391(byte arg0, int arg1) {
        field774++;
        if (this.field775 == null) {
            return this.field768;
        }
        class118 var3 = (class118) this.field775.method1242(0, (long) arg1);
        if (arg0 < 82) {
            return null;
        } else if (var3 == null) {
            return this.field768;
        } else {
            return var3.field1939;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLdaa;I)V")
    private final void method392(byte arg0, class11 arg1, int arg2) {
        int var4 = -52 % ((arg0 + 80) / 39);
        field779++;
        if (arg2 == 1) {
            this.field770 = class363.method2173(arg1.method67(65280), true);
        } else if (arg2 == 2) {
            this.field778 = class363.method2173(arg1.method67(65280), true);
        } else if (arg2 == 3) {
            this.field768 = arg1.method100((byte) 114);
        } else if (arg2 == 4) {
            this.field780 = arg1.method119(-113);
        } else if (arg2 == 5 || arg2 == 6) {
            int var5 = arg1.method93((byte) 109);
            this.field775 = new class205(class32.method326(var5, false));
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = arg1.method119(-93);
                class176 var8;
                if (arg2 == 5) {
                    var8 = new class118(arg1.method100((byte) 100));
                } else {
                    var8 = new class10(arg1.method119(-116));
                }
                this.field775.method1241(var8, (long) var7, -107);
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method393(String arg0, int arg1) {
        field777++;
        if (this.field775 == null) {
            return false;
        }
        if (this.field771 == null) {
            this.method387(76);
        }
        for (class568 var3 = (class568) this.field771.method1242(arg1 ^ arg1, class95.method687(0, arg0)); var3 != null; var3 = (class568) this.field771.method1243(arg1 ^ 0xFFFFFFFE)) {
            if (var3.field7839.equals(arg0)) {
                return true;
            }
        }
        return false;
    }
}
