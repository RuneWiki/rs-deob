import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class2 extends class129 {

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "Lrc;")
    public static class9 field16 = new class9(64);

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "Lfc;")
    public static class148 field27 = null;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "C")
    private char field17;

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "I")
    public int field25;

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "Ljava/lang/String;")
    public String field18;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZLeh;)V")
    private final void method9(int arg0, boolean arg1, class101 arg2) {
        field26++;
        if (arg1) {
            this.method13(11, (class101) null);
        }
        if (arg0 == 1) {
            this.field17 = class104.method708(true, arg2.method646(81));
        } else if (arg0 == 2) {
            this.field25 = arg2.method655((byte) 92);
        } else if (arg0 == 5) {
            this.field18 = arg2.method662((byte) 1);
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
    public static final void method10(byte arg0) {
        field20++;
        int var1 = -47 / ((-arg0 - 34) / 53);
        class256.field4177.method426((byte) -7);
        for (int var2 = 0; var2 < 32; var2++) {
            class173.field2849[var2] = 0L;
        }
        for (int var3 = 0; var3 < 32; var3++) {
            class108.field1933[var3] = 0L;
        }
        class246.field4042 = 0;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILte;ZIIII)Z")
    public static final boolean method11(int arg0, class206 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field22++;
        class24 var7 = class175.method1168(arg1.field3402, (byte) -45);
        if (var7.field375 == -1) {
            return true;
        }
        int var8;
        if (arg1.field3381) {
            int var9 = arg1.field3429 + arg3;
            var8 = var9 & 0x3;
        } else {
            var8 = 0;
        }
        class148 var10 = var7.method170((byte) -17, arg1.field3391, var8);
        if (var10 == null) {
            return false;
        }
        int var11 = arg1.field3404;
        int var12 = arg1.field3377;
        int var13 = var10.field1721;
        if (!arg2) {
            return false;
        }
        if ((var8 & 0x1) == 1) {
            var12 = arg1.field3404;
            var11 = arg1.field3377;
        }
        int var14 = var10.field1712;
        if (var7.field377) {
            var14 = var11 * 4;
            var13 = var12 * 4;
        }
        if (var7.field371 == 0) {
            var10.method1025((arg4 * 4) + 48, (-arg0 + -var11 + 104) * 4 + 48, var13, var14);
        } else {
            var10.method1020(arg4 * 4 + 48, (-arg0 + 104 - var11) * 4 + 48, var13, var14, var7.field371);
        }
        return true;
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V")
    public static void method12(int arg0) {
        if (arg0 != 104) {
            field21 = -125;
        }
        field16 = null;
        field27 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILeh;)V")
    public final void method13(int arg0, class101 arg1) {
        if (arg0 > -89) {
            this.method14(true);
        }
        field24++;
        while (true) {
            int var3 = arg1.method669((byte) 36);
            if (var3 == 0) {
                return;
            }
            this.method9(var3, false, arg1);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)Z")
    public final boolean method14(boolean arg0) {
        field23++;
        if (arg0) {
            field16 = null;
        }
        return this.field17 == 's';
    }
}
