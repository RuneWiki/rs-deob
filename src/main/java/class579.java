import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class579 implements class688 {

    @OriginalMember(owner = "client!go", name = "k", descriptor = "Lne;")
    private class290 field8455;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "[Ld;")
    private class134[] field8448;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "F")
    public static float field8449;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field8445;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public static int field8447;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    public static int field8450;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    public static int field8451;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    public static int field8453;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "I")
    public static int field8454;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "I")
    public static int field8456;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "I")
    public static int field8457;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "Lr;")
    private class165 field8452;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "Z")
    private boolean field8446;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)I", line = 6)
    public final int method3081(boolean arg0) {
        if (arg0) {
            this.field8455 = null;
        }
        field8451++;
        return this.field8455.field3937;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BZ)V", line = 18)
    public final void method3083(byte arg0, boolean arg1) {
        field8445++;
        if (arg0 > -30) {
            this.method3081(false);
        }
        boolean var3 = true;
        class134[] var4 = this.field8448;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class134 var6 = var4[var5];
            if (var6 != null) {
                var6.method893((byte) -61, var3 || this.field8446);
            }
        }
        this.field8446 = false;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIIIB)V", line = 44)
    public static final void method3379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field8457++;
        int var7 = arg2 + arg5;
        int var8 = arg3 - arg2;
        for (int var9 = arg5; var9 < var7; var9++) {
            class359.method2018(class678.field9722[var9], arg4, -124, arg1, arg0);
        }
        int var10 = arg4 - arg2;
        int var11 = arg0 + arg2;
        for (int var12 = arg3; var12 > var8; var12--) {
            class359.method2018(class678.field9722[var12], arg4, arg6 - 27, arg1, arg0);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class678.field9722[var13];
            class359.method2018(var14, var11, 78, arg1, arg0);
            class359.method2018(var14, arg4, 96, arg1, var10);
        }
        if (arg6 != -76) {
            field8449 = -2.232494F;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BJ)Z", line = 90)
    public final boolean method3074(byte arg0, long arg1) {
        field8450++;
        if (arg0 == 117) {
            return (arg1 + ((long) this.field8455.field3940)) <= class301.method1787((byte) 108);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)I", line = 102)
    public final int method3077(int arg0) {
        if (arg0 != 14949) {
            this.method3083((byte) -87, true);
        }
        field8447++;
        int var2 = 0;
        class134[] var3 = this.field8448;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class134 var5 = var3[var4];
            if (var5 == null || var5.method753(-29791)) {
                var2++;
            }
        }
        return var2 * 100 / this.field8448.length;
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lne;Laj;)V", line = 132)
    public class579(class290 arg0, class285 arg1) {
        this.field8455 = arg0;
        this.field8448 = new class134[this.field8455.field3935.length];
        for (int var3 = 0; var3 < this.field8448.length; var3++) {
            this.field8448[var3] = arg1.method1705(this.field8455.field3935[var3], -6423);
        }
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V", line = 151)
    public final void method3073(int arg0) {
        if (arg0 != -16775) {
            this.field8448 = null;
        }
        field8456++;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V", line = 161)
    public final void method3084(int arg0) {
        field8453++;
        if (class68.field1045 != this.field8452) {
            this.field8452 = class68.field1045;
            this.field8446 = true;
        }
        this.field8452.method323(0);
        class134[] var2 = this.field8448;
        if (arg0 != 2280) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class134 var4 = var2[var3];
            if (var4 != null) {
                var4.method749(27471);
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IBIII)Z", line = 192)
    public static final boolean method3380(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field8454++;
        if (!class186.field2276) {
            return false;
        } else if (class86.field1213 < 100) {
            return false;
        } else if (class124.method860(arg3, false, arg0, arg4)) {
            int var5 = arg4 << class295.field3981;
            int var6 = arg3 << class295.field3981;
            if (arg1 != -58) {
                field8449 = 0.19362721F;
            }
            if (class281.method1691(class454.field6392, class155.field1899[arg0].method437(93, arg3, arg4), -6, var6, arg2, class454.field6392, var5)) {
                class408.field5788++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
