import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class345 {

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "I")
    public int field5077;

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "[I")
    public static int[] field5079 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!ofa", name = "g", descriptor = "J")
    public static long field5083 = 20000000L;

    @OriginalMember(owner = "client!ofa", name = "f", descriptor = "Ljo;")
    public static class351 field5082 = new class351(11, 3);

    @OriginalMember(owner = "client!ofa", name = "i", descriptor = "I")
    public static int field5085 = -1;

    @OriginalMember(owner = "client!ofa", name = "h", descriptor = "D")
    public static double field5084;

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!ofa", name = "d", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!ofa", name = "e", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Z)V")
    public static void method2192(boolean arg0) {
        field5082 = null;
        if (!arg0) {
            field5079 = null;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(I)V")
    public class345(int arg0) {
        this.field5077 = arg0;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2193(int arg0, int arg1, byte arg2) {
        if (arg2 == -99) {
            field5078++;
            return (arg1 & 0x8000) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(B)V")
    public static final void method2194(byte arg0) {
        field5080++;
        int var1 = 0;
        if (arg0 != 64) {
            method2192(false);
        }
        if (class145.field1852 != null) {
            var1 = class145.field1852.field9010.method712((byte) -60);
        }
        if (var1 == 2) {
            int var4 = class133.field1735 > 800 ? 800 : class133.field1735;
            int var5 = class711.field10013 <= 600 ? class711.field10013 : 600;
            class638.field8980 = var4;
            class457.field6547 = (class133.field1735 - var4) / 2;
            class273.field3812 = 0;
            class512.field7325 = var5;
        } else if (var1 == 1) {
            int var2 = class133.field1735 <= 1024 ? class133.field1735 : 1024;
            class638.field8980 = var2;
            int var3 = class711.field10013 <= 768 ? class711.field10013 : 768;
            class457.field6547 = (class133.field1735 - var2) / 2;
            class273.field3812 = 0;
            class512.field7325 = var3;
        } else {
            class512.field7325 = class711.field10013;
            class457.field6547 = 0;
            class638.field8980 = class133.field1735;
            class273.field3812 = 0;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5081++;
        throw new IllegalStateException();
    }
}
