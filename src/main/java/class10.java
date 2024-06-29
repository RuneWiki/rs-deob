import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class10 {

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "[I")
    private int[] field137;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "Lnc;")
    public static class85 field135 = new class85(32);

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "Lid;")
    public static class149 field145 = class60.method382("Number of player models in cache:", (byte) 10);

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "Lid;")
    public static class149 field146 = class60.method382("k", (byte) 46);

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field147 = 1;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field143 = 0;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public static int field148 = -1;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "Ldd;")
    public static class133 field136;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "Lse;")
    public static class205 field144;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Lal;")
    public static class230 field142;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "Laj;")
    public static class47 field139;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Z")
    public static boolean field133;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static final void method56(int arg0) {
        field132++;
        if (arg0 != 1) {
            method59(-33, (byte) -112);
        }
        for (class104 var1 = (class104) class78.field1458.method1140(0); var1 != null; var1 = (class104) class78.field1458.method1127(0)) {
            class135 var2 = var1.field1817;
            if (class277.field4948 != var2.field2451 || var2.field2462) {
                var1.method401((byte) -118);
            } else if (class118.field2022 >= var2.field2463) {
                var2.method948(class149.field2683, -121);
                if (var2.field2462) {
                    var1.method401((byte) -118);
                } else {
                    class131.method927(var2.field2451, var2.field2467, var2.field2459, var2.field2452, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static void method57(byte arg0) {
        if (arg0 != -1) {
            return;
        }
        field139 = null;
        field135 = null;
        field144 = null;
        field146 = null;
        field145 = null;
        field142 = null;
        field136 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)I")
    public final int method58(int arg0, int arg1) {
        if (arg0 > -122) {
            method57((byte) -106);
        }
        field134++;
        int var3 = (this.field137.length >> 1) - 1;
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field137[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field137[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)V")
    public static final void method59(int arg0, byte arg1) {
        field138++;
        class77.field1443.method1289(arg0, 127);
        if (arg1 <= 21) {
            field148 = -83;
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "([I)V")
    public class10(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field137 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field137[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field137[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field137[var5 + var5] = arg0[var4];
            this.field137[var5 + var5 + 1] = var4++;
        }
    }
}
