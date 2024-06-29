import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class77 {

    @OriginalMember(owner = "client!bea", name = "e", descriptor = "I")
    public int field959 = 64;

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "I")
    public int field958 = 64;

    @OriginalMember(owner = "client!bea", name = "l", descriptor = "Z")
    public boolean field966 = false;

    @OriginalMember(owner = "client!bea", name = "j", descriptor = "Z")
    public boolean field964 = false;

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "I")
    public int field956 = 2;

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "I")
    public int field957 = 1;

    @OriginalMember(owner = "client!bea", name = "m", descriptor = "I")
    public int field967 = -1;

    @OriginalMember(owner = "client!bea", name = "g", descriptor = "[I")
    public static int[] field961 = new int[32];

    @OriginalMember(owner = "client!bea", name = "n", descriptor = "Z")
    public static boolean field968 = true;

    @OriginalMember(owner = "client!bea", name = "o", descriptor = "I")
    public static int field969 = 64;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "Lnj;")
    public static class436 field955 = new class436(64);

    @OriginalMember(owner = "client!bea", name = "p", descriptor = "I")
    public static int field970 = -1;

    @OriginalMember(owner = "client!bea", name = "f", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!bea", name = "h", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!bea", name = "i", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!bea", name = "k", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!bea", name = "q", descriptor = "Lwm;")
    public static class129 field971;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(B)V")
    public static void method436(byte arg0) {
        field955 = null;
        field961 = null;
        if (arg0 > 40) {
            field971 = null;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Z)V")
    public static final void method437(boolean arg0) {
        field960++;
        class319.method2069(2, (byte) 82, class72.field935.field6494, 22050);
        class451.field6153 = new class54();
        if (arg0) {
            return;
        }
        class451.field6153.method340(0, 128, 9);
        class571.field7908 = class325.method2085(22050, class495.field6687, class249.field3351, 84, 0);
        class571.field7908.method3602((byte) -105, class451.field6153);
        class198.method1259(class451.field6153, (byte) -128, class16.field132, class360.field5194, class589.field8086);
        class304.field4096 = class325.method2085(2048, class495.field6687, class249.field3351, 66, 1);
        class285.field3866 = new class567();
        class304.field4096.method3602((byte) -105, class285.field3866);
        class606.field8277 = new class445(22050, class519.field7166);
        class425.field5918 = class328.field4812.method1090("scape main", (byte) 87);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(BIILdga;)V")
    private final void method438(byte arg0, int arg1, int arg2, class138 arg3) {
        if (arg1 == 1) {
            this.field967 = arg3.method922((byte) -115);
            if (this.field967 == 65535) {
                this.field967 = -1;
            }
        } else if (arg1 == 2) {
            this.field958 = arg3.method922((byte) -122) + 1;
            this.field959 = arg3.method922((byte) -118) + 1;
        } else if (arg1 == 3) {
            arg3.method950(false);
        } else if (arg1 == 4) {
            this.field956 = arg3.method957((byte) -98);
        } else if (arg1 == 5) {
            this.field957 = arg3.method957((byte) -128);
        } else if (arg1 == 6) {
            this.field966 = true;
        } else if (arg1 == 7) {
            this.field964 = true;
        }
        field962++;
        if (arg0 != 39) {
            method437(false);
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Ldga;II)V")
    public final void method439(class138 arg0, int arg1, int arg2) {
        field965++;
        if (arg1 != 16470) {
            return;
        }
        while (true) {
            int var4 = arg0.method957((byte) -82);
            if (var4 == 0) {
                return;
            }
            this.method438((byte) 39, var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(B)V")
    public static final void method440(byte arg0) {
        field963++;
        if (arg0 > -117) {
            field955 = null;
        }
        if (!class3.method14(-2)) {
            return;
        }
        if (class603.field8242 == null) {
            class193.method1234((byte) 118);
        }
        class69.field912 = 0;
        class426.field5921 = true;
        try {
            class327.field4791 = class167.field2083.getToolkit().getSystemClipboard();
        } catch (Exception var1) {
        }
    }
}
