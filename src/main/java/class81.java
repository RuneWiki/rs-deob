import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class81 {

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "Z")
    public boolean field1096;

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "[J")
    public static long[] field1100 = new long[256];

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "[I")
    public static int[] field1097 = new int[5];

    @OriginalMember(owner = "client!kt", name = "k", descriptor = "Luv;")
    public static class3 field1103;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!kt", name = "i", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "Llca;")
    public class133 field1099;

    @OriginalMember(owner = "client!kt", name = "j", descriptor = "Llca;")
    public class133 field1102;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "Z")
    public boolean field1094;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)V")
    public static void method455(boolean arg0) {
        field1103 = null;
        field1097 = null;
        if (arg0) {
            field1100 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)Z")
    public final boolean method456(int arg0) {
        field1098++;
        if (arg0 != 5) {
            this.field1102 = null;
        }
        return this.field1094 && !this.field1096;
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)V")
    public static final void method457(int arg0) {
        field1093++;
        class552.field7724.method3102(5, 20302);
        class39.field585.method897(-31360, 5);
        class10.field104.method2710(117, 5);
        class626.field9084.method1091(0, 5);
        class579.field8053.method3621((byte) -121, 5);
        class98.field1307.method3383(5, 1);
        class609.field8754.method538(5, 38);
        class410.field5636.method344((byte) 80, 5);
        class643.field9328.method1295(false, 5);
        class642.field9326.method3407(16, 5);
        class217.field2772.method1471(5, arg0 - 24395);
        class494.field6893.method1543(5, (byte) 116);
        class376.field5232.method2487((byte) 91, 5);
        class132.field1621.method147(-8369, 5);
        class33.field508.method541(5, 108);
        class1.field5.method1480(5, arg0 ^ 0xFFFFF6CD);
        class369.field5136.method1065((byte) -79, 5);
        class192.field2492.method1318(5, (byte) -23);
        class104.field1365.method646(897197984, 5);
        class452.field6400.method686(5, 32);
        class273.method1672((byte) -126, 5);
        class140.method748(50, false);
        class17.method81(5, 0);
        class486.method2744(5, (byte) -19);
        class624.field9027.method320(5, -306674912);
        class600.field8677.method320(arg0, -306674912);
        class26.field449.method320(5, -306674912);
        class616.field8878.method320(5, -306674912);
        class218.field2799.method320(5, -306674912);
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)V")
    public final void method458(int arg0) {
        field1101++;
        if (this.field1099 != null) {
            this.field1099.method296((byte) 36);
        }
        if (arg0 != 5) {
            this.field1096 = true;
        }
        this.field1094 = false;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Z)V")
    public class81(boolean arg0) {
        this.field1096 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1100[var0] = var1;
        }
        field1103 = new class3(45, 1);
    }
}
