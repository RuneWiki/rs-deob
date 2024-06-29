import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class57 extends class320 {

    @OriginalMember(owner = "client!jo", name = "B", descriptor = "Z")
    public boolean field884 = true;

    @OriginalMember(owner = "client!jo", name = "I", descriptor = "I")
    public int field891 = -1;

    @OriginalMember(owner = "client!jo", name = "D", descriptor = "I")
    public int field886 = 12800;

    @OriginalMember(owner = "client!jo", name = "M", descriptor = "I")
    public int field895 = 0;

    @OriginalMember(owner = "client!jo", name = "F", descriptor = "I")
    public int field888 = 0;

    @OriginalMember(owner = "client!jo", name = "W", descriptor = "I")
    public int field904 = 12800;

    @OriginalMember(owner = "client!jo", name = "G", descriptor = "I")
    public int field889 = -1;

    @OriginalMember(owner = "client!jo", name = "N", descriptor = "Ljava/lang/String;")
    public String field896;

    @OriginalMember(owner = "client!jo", name = "C", descriptor = "I")
    public int field885;

    @OriginalMember(owner = "client!jo", name = "E", descriptor = "I")
    public int field887;

    @OriginalMember(owner = "client!jo", name = "Q", descriptor = "Ljava/lang/String;")
    public String field898;

    @OriginalMember(owner = "client!jo", name = "V", descriptor = "Lfk;")
    public class317 field903;

    @OriginalMember(owner = "client!jo", name = "H", descriptor = "I")
    public static int field890 = 0;

    @OriginalMember(owner = "client!jo", name = "K", descriptor = "I")
    public static int field893 = 0;

    @OriginalMember(owner = "client!jo", name = "X", descriptor = "[Lrk;")
    public static class290[] field905 = new class290[4];

    @OriginalMember(owner = "client!jo", name = "A", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!jo", name = "L", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!jo", name = "O", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!jo", name = "R", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!jo", name = "S", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!jo", name = "T", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!jo", name = "U", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!jo", name = "J", descriptor = "Lrn;")
    public static class18 field892;

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V", line = 226)
    public class57(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field884 = arg5;
        this.field891 = arg6;
        this.field889 = arg4;
        this.field896 = arg2;
        if (this.field891 == 255) {
            this.field891 = 0;
        }
        this.field885 = arg0;
        this.field887 = arg3;
        this.field898 = arg1;
        this.field903 = new class317();
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(III[IB)Z", line = 18)
    public final boolean method568(int arg0, int arg1, int arg2, int[] arg3, byte arg4) {
        field901++;
        if (arg4 <= 44) {
            this.method574(-18);
        }
        for (class338 var6 = (class338) this.field903.method2244((byte) -126); var6 != null; var6 = (class338) this.field903.method2241(-1)) {
            if (var6.method2378(arg2, (byte) -6, arg1, arg0)) {
                var6.method2375(arg3, arg1, false, arg0);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(B)V", line = 43)
    public static void method569(byte arg0) {
        field905 = null;
        field892 = null;
        if (arg0 != 14) {
            method570(-31);
        }
    }

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "(I)V", line = 55)
    public static final void method570(int arg0) {
        if (arg0 != 29311) {
            field893 = 24;
        }
        if (class307.field4755 == 2) {
            if (class344.field5479 == class215.field3364 && class317.field4880 == class191.field3003) {
                class307.field4755 = 0;
                if (class208.field3205 && class116.field1774[81] && class66.field1006 > 2) {
                    class83.method746(true, class66.field1006 - 2);
                } else {
                    class83.method746(true, class66.field1006 - 1);
                }
            }
        } else if (class344.field5479 == class305.field4745 && class254.field3916 == class191.field3003) {
            class307.field4755 = 0;
            if (class208.field3205 && class116.field1774[81] && class66.field1006 > 2) {
                class83.method746(true, class66.field1006 - 2);
            } else {
                class83.method746(true, class66.field1006 - 1);
            }
        } else {
            class307.field4755 = 2;
            class317.field4880 = class254.field3916;
            class215.field3364 = class305.field4745;
        }
        field894++;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "([IIII)Z", line = 113)
    public final boolean method571(int[] arg0, int arg1, int arg2, int arg3) {
        field902++;
        for (class338 var5 = (class338) this.field903.method2244((byte) -127); var5 != null; var5 = (class338) this.field903.method2241(-1)) {
            if (var5.method2371(arg3, 106, arg1)) {
                var5.method2379(arg1, arg3, arg0, (byte) 123);
                return true;
            }
        }
        if (arg2 != 2203) {
            this.method572(-71, -124, -21);
        }
        return false;
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(III)Z", line = 141)
    public final boolean method572(int arg0, int arg1, int arg2) {
        field897++;
        for (class338 var4 = (class338) this.field903.method2244((byte) -125); var4 != null; var4 = (class338) this.field903.method2241(-1)) {
            if (var4.method2372(true, arg0, arg1)) {
                return true;
            }
        }
        if (arg2 == 12800) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I[IIB)Z", line = 188)
    public final boolean method573(int arg0, int[] arg1, int arg2, byte arg3) {
        field899++;
        int var5 = 38 % ((arg3 - 2) / 61);
        for (class338 var6 = (class338) this.field903.method2244((byte) -127); var6 != null; var6 = (class338) this.field903.method2241(-1)) {
            if (var6.method2372(true, arg0, arg2)) {
                var6.method2375(arg1, arg0, false, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "(I)V", line = 246)
    public final void method574(int arg0) {
        this.field888 = 0;
        this.field886 = 12800;
        this.field895 = arg0;
        this.field904 = 12800;
        for (class338 var2 = (class338) this.field903.method2244((byte) -125); var2 != null; var2 = (class338) this.field903.method2241(-1)) {
            if (var2.field5194 < this.field904) {
                this.field904 = var2.field5194;
            }
            if (this.field895 < var2.field5209) {
                this.field895 = var2.field5209;
            }
            if (this.field886 > var2.field5206) {
                this.field886 = var2.field5206;
            }
            if (var2.field5192 > this.field888) {
                this.field888 = var2.field5192;
            }
        }
        field900++;
    }
}
