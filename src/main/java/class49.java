import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class49 implements Runnable {

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "[Lef;")
    public volatile class241[] field891 = new class241[2];

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Z")
    public volatile boolean field899 = false;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "Z")
    public volatile boolean field892 = false;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "[I")
    public static int[] field893 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "[I")
    public static int[] field889 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "[I")
    public static int[] field901 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "Lne;")
    public class78 field903;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "[Lbf;")
    public static class102[] field890;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([II[Ljava/lang/Object;IB)V")
    public static final void method417(int[] arg0, int arg1, Object[] arg2, int arg3, byte arg4) {
        if (arg4 != 107) {
            return;
        }
        if (arg1 < arg3) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg1;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var7;
            Object var8 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var8;
            for (int var9 = arg1; var9 < arg3; var9++) {
                if (arg0[var9] < (var9 & 0x1) + var7) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    Object var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg0[arg3] = arg0[var6];
            arg0[var6] = var7;
            arg2[arg3] = arg2[var6];
            arg2[var6] = var8;
            method417(arg0, arg1, arg2, var6 - 1, (byte) 107);
            method417(arg0, var6 + 1, arg2, arg3, (byte) 107);
        }
        field894++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILkj;)Z")
    public static final boolean method418(int arg0, class114 arg1) {
        field896++;
        if (arg1.field1884 == null) {
            return false;
        } else if (arg0 == -1) {
            for (int var2 = 0; var2 < arg1.field1884.length; var2++) {
                int var3 = class77.method614(var2, 46, arg1);
                int var4 = arg1.field1860[var2];
                if (arg1.field1884[var2] == 2) {
                    if (var4 <= var3) {
                        return false;
                    }
                } else if (arg1.field1884[var2] == 3) {
                    if (var4 >= var3) {
                        return false;
                    }
                } else if (arg1.field1884[var2] == 4) {
                    if (var3 == var4) {
                        return false;
                    }
                } else if (var3 != var4) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ha", name = "run", descriptor = "()V")
    public final void run() {
        this.field892 = true;
        field897++;
        try {
            while (!this.field899) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class241 var2 = this.field891[var1];
                    if (var2 != null) {
                        var2.method1589(true);
                    }
                }
                class234.method1550(-28773, 10L);
                class66.method512(this.field903, (Object) null, (byte) 43);
            }
        } catch (Exception var9) {
            class161.method1167(var9, -123, (String) null);
        } finally {
            Object var6 = null;
            this.field892 = false;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lhf;I)V")
    public static final void method419(class263 arg0, int arg1) {
        if (arg1 != 0) {
            field889 = null;
        }
        field898++;
        class72.field1195 = arg0;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static final void method420(byte arg0) {
        if ((class170.field2791 < class199.field3249)) {
            class170.field2791 = (float) ((double) class170.field2791 / 30.0D + (double) class170.field2791);
            if (class199.field3249 < class170.field2791) {
                class170.field2791 = class199.field3249;
            }
            class11.method72(false);
        } else if (class199.field3249 < class170.field2791) {
            class170.field2791 = (float) ((double) class170.field2791 - (double) class170.field2791 / 30.0D);
            if (class170.field2791 < class199.field3249) {
                class170.field2791 = class199.field3249;
            }
            class11.method72(false);
        }
        field900++;
        if (client.field4564 != -1 && class80.field1326 != -1) {
            int var1 = class80.field1326 - class22.field343;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            int var2 = client.field4564 - class94.field1462;
            class22.field343 -= -var1;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class94.field1462 += var2;
            if (var2 == 0 && var1 == 0) {
                class80.field1326 = -1;
                client.field4564 = -1;
            }
            class11.method72(false);
        }
        if (arg0 >= -118) {
            field901 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method421(int arg0) {
        field889 = null;
        if (arg0 != -16760) {
            field890 = null;
        }
        field893 = null;
        field890 = null;
        field901 = null;
    }
}
