import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class424 {

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Ljava/lang/String;")
    private String field5724 = "null";

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "Lada;")
    public static class144 field5735 = new class144(1, 8);

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "Lada;")
    public static class144 field5737 = new class144(107, -1);

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "Lada;")
    public static class144 field5738 = new class144(108, -2);

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "C")
    public char field5727;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "C")
    public char field5734;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    private int field5731;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "Llb;")
    private class465 field5730;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "Llb;")
    public class465 field5732;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "Lha;")
    public static class53 field5739;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method2487(String arg0, int arg1) {
        if (arg1 > -43) {
            return true;
        }
        field5725++;
        if (this.field5732 == null) {
            return false;
        }
        if (this.field5730 == null) {
            this.method2488(true);
        }
        for (class166 var3 = (class166) this.field5730.method2799(class163.method1174(arg0, -126), true); var3 != null; var3 = (class166) this.field5730.method2801(118)) {
            if (var3.field2612.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V")
    private final void method2488(boolean arg0) {
        this.field5730 = new class465(this.field5732.method2805(0));
        field5720++;
        for (class528 var2 = (class528) this.field5732.method2798((byte) -78); var2 != null; var2 = (class528) this.field5732.method2806(arg0)) {
            class166 var3 = new class166(var2.field7892, (int) var2.field5651);
            this.field5730.method2797(-4234, var3, class163.method1174(var2.field7892, 110));
        }
        if (!arg0) {
            this.method2493(-111, -22);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    private final void method2489(byte arg0) {
        this.field5730 = new class465(this.field5732.method2805(0));
        if (arg0 != 59) {
            return;
        }
        field5728++;
        for (class556 var2 = (class556) this.field5732.method2798((byte) -113); var2 != null; var2 = (class556) this.field5732.method2806(true)) {
            class556 var3 = new class556((int) var2.field5651);
            this.field5730.method2797(-4234, var3, (long) var2.field8278);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILgw;)V")
    private final void method2490(int arg0, int arg1, class148 arg2) {
        field5733++;
        if (arg0 == 1) {
            this.field5727 = class387.method2305((byte) -106, arg2.method1062(-21188));
        } else if (arg0 == 2) {
            this.field5734 = class387.method2305((byte) -119, arg2.method1062(-21188));
        } else if (arg0 == 3) {
            this.field5724 = arg2.method1023(-29153);
        } else if (arg0 == 4) {
            this.field5731 = arg2.method1026(-917302120);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg2.method1045(true);
            this.field5732 = new class465(class322.method1938(var4, 92));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1026(-917302120);
                class417 var7;
                if (arg0 == 5) {
                    var7 = new class528(arg2.method1023(-29153));
                } else {
                    var7 = new class556(arg2.method1026(-917302120));
                }
                this.field5732.method2797(-4234, var7, (long) var6);
            }
        }
        if (arg1 > -26) {
            this.method2488(true);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method2491(int arg0, int arg1) {
        field5723++;
        if (this.field5732 == null) {
            return this.field5724;
        }
        if (arg0 != 10851) {
            this.field5734 = (char) 65469;
        }
        class528 var3 = (class528) this.field5732.method2799((long) arg1, true);
        return var3 == null ? this.field5724 : var3.field7892;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)V")
    public static final void method2492(byte arg0) {
        field5721++;
        class317.field4370.method837(127);
        class496.field7054.method837(arg0 ^ 0xFFFFFF98);
        class111.field1575.method837(arg0 + 154);
        class304.field4183.method837(127);
        class145.field2027.method837(127);
        if (arg0 != -27) {
            method2492((byte) -84);
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)I")
    public final int method2493(int arg0, int arg1) {
        field5722++;
        if (this.field5732 == null) {
            return this.field5731;
        } else {
            class556 var3 = (class556) this.field5732.method2799((long) arg1, true);
            int var4 = -61 % ((34 - arg0) / 38);
            return var3 == null ? this.field5731 : var3.field8278;
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(II)Z")
    public final boolean method2494(int arg0, int arg1) {
        field5729++;
        if (this.field5732 == null) {
            return false;
        }
        if (arg1 != 0) {
            field5739 = null;
        }
        if (this.field5730 == null) {
            this.method2489((byte) 59);
        }
        class556 var3 = (class556) this.field5730.method2799((long) arg0, true);
        return var3 != null;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)V")
    public static void method2495(byte arg0) {
        field5738 = null;
        field5739 = null;
        field5735 = null;
        if (arg0 > -127) {
            method2495((byte) 59);
        }
        field5737 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lgw;B)V")
    public final void method2496(class148 arg0, byte arg1) {
        field5726++;
        while (true) {
            int var3 = arg0.method1032((byte) -33);
            if (var3 == 0) {
                if (arg1 == 57) {
                    return;
                } else {
                    field5738 = null;
                    return;
                }
            }
            this.method2490(var3, -93, arg0);
        }
    }
}
