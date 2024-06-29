import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class405 extends class446 {

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public int field5745 = 0;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "Z")
    public boolean field5747 = true;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "I")
    public int field5758 = -1;

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
    public int field5761 = 0;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
    public int field5751 = -1;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
    public int field5755 = 12800;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
    public int field5756 = 12800;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
    public int field5749;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
    public int field5750;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "Ljava/lang/String;")
    public String field5748;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "Ljava/lang/String;")
    public String field5746;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "Laq;")
    public class90 field5752;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "I")
    public static int field5762 = 0;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "Lkn;")
    public static class442 field5757 = new class442("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
    public static int field5769 = 0;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!gi", name = "T", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "([IIIII)Z", line = 5)
    public final boolean method2539(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field5763++;
        for (class278 var6 = (class278) this.field5752.method646(48); var6 != null; var6 = (class278) this.field5752.method641(false)) {
            if (var6.method1816(arg4, true, arg3, arg2)) {
                var6.method1814(arg0, arg4, 26582, arg2);
                return true;
            }
        }
        if (arg1 != Integer.MAX_VALUE) {
            this.method2546(53);
        }
        return false;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "([IIII)Z", line = 33)
    public final boolean method2540(int[] arg0, int arg1, int arg2, int arg3) {
        field5767++;
        class278 var5 = (class278) this.field5752.method646(48);
        if (arg3 < 3) {
            this.field5747 = false;
        }
        while (var5 != null) {
            if (var5.method1810(arg2, -1, arg1)) {
                var5.method1814(arg0, arg1, 26582, arg2);
                return true;
            }
            var5 = (class278) this.field5752.method641(false);
        }
        return false;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 244)
    public class405(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field5749 = arg3;
        this.field5750 = arg0;
        this.field5751 = arg6;
        this.field5748 = arg1;
        this.field5747 = arg5;
        this.field5758 = arg4;
        this.field5746 = arg2;
        if (this.field5751 == 255) {
            this.field5751 = 0;
        }
        this.field5752 = new class90();
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BII)Z", line = 64)
    public final boolean method2541(byte arg0, int arg1, int arg2) {
        if (arg0 != 47) {
            this.method2545((int[]) null, true, -49, -6);
        }
        field5753++;
        for (class278 var4 = (class278) this.field5752.method646(48); var4 != null; var4 = (class278) this.field5752.method641(false)) {
            if (var4.method1810(arg1, -1, arg2)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)I", line = 91)
    public static final int method2542(int arg0) {
        if (arg0 != -1) {
            method2542(38);
        }
        field5760++;
        if (class217.field2997 == null) {
            return class92.field1287 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBI)I", line = 106)
    public static final int method2543(int arg0, byte arg1, int arg2) {
        field5765++;
        int var3 = arg2 * 57 + arg0;
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        if (arg1 > -92) {
            field5768 = -122;
        }
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(III)V", line = 130)
    public static final void method2544(int arg0, int arg1, int arg2) {
        field5766++;
        class239 var3 = class436.method2740(arg1, arg0, -323285792);
        var3.method1622(48);
        var3.field3399 = arg2;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "([IZII)Z", line = 144)
    public final boolean method2545(int[] arg0, boolean arg1, int arg2, int arg3) {
        field5759++;
        class278 var5 = (class278) this.field5752.method646(48);
        if (!arg1) {
            method2542(41);
        }
        while (var5 != null) {
            if (var5.method1813(arg3, arg2, true)) {
                var5.method1815((byte) -24, arg3, arg0, arg2);
                return true;
            }
            var5 = (class278) this.field5752.method641(false);
        }
        return false;
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V", line = 174)
    public final void method2546(int arg0) {
        this.field5755 = 12800;
        this.field5756 = 12800;
        field5764++;
        if (arg0 != -1777) {
            this.method2539((int[]) null, -52, 57, 66, 13);
        }
        this.field5761 = 0;
        this.field5745 = 0;
        for (class278 var2 = (class278) this.field5752.method646(48); var2 != null; var2 = (class278) this.field5752.method641(false)) {
            if (this.field5745 < var2.field3893) {
                this.field5745 = var2.field3893;
            }
            if (var2.field3896 < this.field5756) {
                this.field5756 = var2.field3896;
            }
            if (var2.field3903 > this.field5761) {
                this.field5761 = var2.field3903;
            }
            if (this.field5755 > var2.field3892) {
                this.field5755 = var2.field3892;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V", line = 214)
    public static void method2547(boolean arg0) {
        field5757 = null;
        if (arg0) {
            field5762 = 59;
        }
    }
}
