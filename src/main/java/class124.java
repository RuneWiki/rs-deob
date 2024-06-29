import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class124 extends class5 {

    @OriginalMember(owner = "client!nk", name = "I", descriptor = "Lta;")
    public static class241 field2299 = new class241(260);

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "Lhb;")
    public static class206 field2304 = new class206(0, 0);

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "I")
    public static int field2308 = 0;

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "[I")
    public static int[] field2309 = new int[50];

    @OriginalMember(owner = "client!nk", name = "D", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!nk", name = "H", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!nk", name = "M", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "Lhj;")
    public class69 field2297;

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "Lnc;")
    public static class83 field2307;

    @OriginalMember(owner = "client!nk", name = "J", descriptor = "[I")
    public int[] field2300;

    @OriginalMember(owner = "client!nk", name = "L", descriptor = "[I")
    public int[] field2301;

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "[I")
    public int[] field2303;

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "[I")
    public int[] field2305;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(B)V")
    public final void method888(byte arg0) {
        if (this.field2301 != null) {
            for (int var2 = 0; var2 < this.field2301.length; var2++) {
                this.field2301[var2] = class230.method1644(this.field2301[var2], 32768);
            }
        }
        if (arg0 != 46) {
            return;
        }
        field2306++;
        if (this.field2305 != null) {
            for (int var3 = 0; var3 < this.field2305.length; var3++) {
                this.field2305[var3] = class230.method1644(this.field2305[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)I")
    public final int method889(int arg0, int arg1) {
        field2294++;
        if (this.field2301 == null) {
            return -1;
        }
        if (arg1 <= 126) {
            this.method893((byte) -110, (class128) null);
        }
        for (int var3 = 0; var3 < this.field2301.length; var3++) {
            if (this.field2300[var3] == arg0) {
                return this.field2301[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIILed;IJ)Z")
    public static final boolean method890(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class177 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class193.method1398(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILfh;I)V")
    private final void method891(int arg0, class128 arg1, int arg2) {
        field2295++;
        int var4 = -3 % ((arg2 + 34) / 53);
        if (arg0 == 1) {
            this.field2297 = arg1.method963(false);
        } else if (arg0 == 2) {
            int var5 = arg1.method937(false);
            this.field2303 = new int[var5];
            this.field2305 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2305[var6] = arg1.method912(116);
                int var7 = arg1.method937(false);
                if (var7 == 0) {
                    this.field2303[var6] = -1;
                } else {
                    this.field2303[var6] = var7;
                }
            }
        } else if (arg0 == 3) {
            int var8 = arg1.method937(false);
            this.field2301 = new int[var8];
            this.field2300 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2301[var9] = arg1.method912(113);
                int var10 = arg1.method937(false);
                if (var10 == 0) {
                    this.field2300[var9] = -1;
                } else {
                    this.field2300[var9] = var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(JI)V")
    public static final void method892(long arg0, int arg1) {
        field2302++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class149.field2778; var3++) {
            if (class159.field2959[var3] == arg0) {
                class165.field3043++;
                class149.field2778--;
                for (int var4 = var3; var4 < class149.field2778; var4++) {
                    class159.field2959[var4] = class159.field2959[var4 + 1];
                    class105.field1977[var4] = class105.field1977[var4 + 1];
                }
                class208.field3795 = class81.field1564;
                class48.field692.method301(86, -104);
                class48.field692.method918(arg0, 18820);
                break;
            }
        }
        if (arg1 > -17) {
            field2307 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BLfh;)V")
    public final void method893(byte arg0, class128 arg1) {
        if (arg0 < 46) {
            return;
        }
        field2296++;
        while (true) {
            int var3 = arg1.method937(false);
            if (var3 == 0) {
                return;
            }
            this.method891(var3, arg1, 113);
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)V")
    public static void method894(int arg0) {
        field2299 = null;
        field2307 = null;
        field2309 = null;
        field2304 = null;
        if (arg0 != 260) {
            field2304 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)I")
    public final int method895(int arg0, int arg1) {
        field2298++;
        if (this.field2305 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg1 != 2529) {
            this.method891(113, (class128) null, -8);
        }
        while (this.field2305.length > var3) {
            if (this.field2303[var3] == arg0) {
                return this.field2305[var3];
            }
            var3++;
        }
        return -1;
    }
}
