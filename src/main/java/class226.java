import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class226 extends class139 {

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "Ldk;")
    public static class326 field3422 = new class326("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!mn", name = "H", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!mn", name = "I", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!mn", name = "M", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!mn", name = "N", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!mn", name = "L", descriptor = "Lus;")
    public static class1 field3424;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIB)I")
    public static final int method1451(int arg0, int arg1, byte arg2) {
        if (~arg0 > ~arg1) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        ++field3426;
        if (arg2 < 3) {
            return 117;
        } else {
            while (arg1 != 0) {
                int var4 = arg0 % arg1;
                arg0 = arg1;
                arg1 = var4;
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
    public class226() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        if (arg1 != 27782) {
            return null;
        } else {
            ++field3421;
            int[] var3 = super.field1844.method2176(arg0, 0);
            if (super.field1844.field5045) {
                int var4 = class237.field3559[arg0];
                for (int var5 = 0; class356.field5147 > var5; ++var5) {
                    var3[var5] = this.method1453(-1376312589, class216.field3245[var5], var4) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(II)Lfc;")
    public static final class156 method1452(int arg0, int arg1) {
        ++field3420;
        class156 var2 = (class156) class258.field3782.method1524(false, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3;
            if (~arg1 <= -32769) {
                var3 = class65.field841.method1257(arg1 & 32767, 1, arg0 ^ -57327);
            } else {
                var3 = class187.field2802.method1257(arg1, 1, 24558);
            }
            class156 var4 = new class156();
            if (var3 != null) {
                var4.method982(0, new class276(var3));
            }
            if (~arg1 <= arg0) {
                var4.method981((byte) -121);
            }
            class258.field3782.method1522((long) arg1, false, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(III)I")
    private final int method1453(int arg0, int arg1, int arg2) {
        ++field3423;
        if (arg0 != -1376312589) {
            this.method22(83, 17);
        }
        int var4 = arg2 * 57 + arg1;
        int var5 = var4 << 1 ^ var4;
        return 4096 - ((var5 * 15731 * var5 + 789221) * var5 - -1376312589 & Integer.MAX_VALUE) / 262144;
    }

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "(B)V")
    public static void method1454(byte arg0) {
        int var1 = -71 / ((arg0 - 30) / 34);
        field3422 = null;
        field3424 = null;
    }
}
