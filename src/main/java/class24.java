import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class24 {

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "Lwg;")
    private class58 field429 = new class58(64);

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "Lkr;")
    private class329 field430;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
    public static int field428 = 0;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "Lkr;")
    public static class329 field433;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
    public final void method145(int arg0) {
        field434++;
        if (arg0 == 57) {
            class58 var2 = this.field429;
            synchronized (this.field429) {
                this.field429.method317((byte) 21);
            }
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V")
    public final void method146(byte arg0) {
        class58 var2 = this.field429;
        synchronized (this.field429) {
            this.field429.method315(1);
            if (arg0 < 38) {
                method149(-128);
            }
        }
        field431++;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)V")
    public final void method147(int arg0, int arg1) {
        if (arg0 != -8369) {
            field428 = 5;
        }
        field427++;
        class58 var3 = this.field429;
        synchronized (this.field429) {
            this.field429.method320(arg1, -306674912);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I[FIIIIIFIIFIF)V")
    public static final void method148(int arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float arg7, int arg8, int arg9, float arg10, int arg11, float arg12) {
        int var13 = arg0 - arg11;
        field426++;
        int var14 = arg9 - arg8;
        int var15 = arg5 - arg6;
        float var16 = arg1[2] * (float) var14 + arg1[0] * (float) var15 + arg1[1] * (float) var13;
        float var17 = arg1[5] * (float) var14 + arg1[arg3] * (float) var13 + arg1[3] * (float) var15;
        float var18 = arg1[8] * (float) var14 + arg1[6] * (float) var15 + arg1[7] * (float) var13;
        float var19;
        float var20;
        if (arg2 == 0) {
            var19 = arg12 + 0.5F - var18;
            var20 = arg10 + var16 + 0.5F;
        } else if (arg2 == 1) {
            var20 = arg10 + var16 + 0.5F;
            var19 = arg12 + var18 + 0.5F;
        } else if (arg2 == 2) {
            var19 = arg7 + 0.5F - var17;
            var20 = arg10 + 0.5F - var16;
        } else if (arg2 == 3) {
            var19 = arg7 + 0.5F - var17;
            var20 = arg10 + var16 + 0.5F;
        } else if (arg2 == 4) {
            var20 = arg12 + var18 + 0.5F;
            var19 = arg7 + 0.5F - var17;
        } else {
            var19 = arg7 + 0.5F - var17;
            var20 = arg12 + 0.5F - var18;
        }
        if (arg4 == 1) {
            float var22 = var20;
            var20 = -var19;
            var19 = var22;
        } else if (arg4 == 2) {
            var20 = -var20;
            var19 = -var19;
        } else if (arg4 == 3) {
            float var21 = var20;
            var20 = var19;
            var19 = -var21;
        }
        class424.field5745 = var19;
        class334.field4670 = var20;
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)V")
    public static void method149(int arg0) {
        field433 = null;
        if (arg0 != -16894) {
            field428 = -108;
        }
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(I)V")
    public static final void method150(int arg0) {
        class264.field3373 = false;
        int var1 = -47 / ((arg0 + 73) / 36);
        field432++;
        class433.method2527(true, class81.field1095, class641.field9318, class431.field5868, class423.field5739);
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(II)Ldr;")
    public final class360 method151(int arg0, int arg1) {
        int var3 = -26 % ((arg1 + 45) / 45);
        field435++;
        class58 var4 = this.field429;
        class360 var5;
        synchronized (this.field429) {
            var5 = (class360) this.field429.method323((long) arg0, -19814);
        }
        if (var5 != null) {
            return var5;
        }
        class329 var6 = this.field430;
        byte[] var7;
        synchronized (this.field430) {
            var7 = this.field430.method2054(true, 11, arg0);
        }
        class360 var8 = new class360();
        if (var7 != null) {
            var8.method2231((byte) 119, new class551(var7));
        }
        class58 var9 = this.field429;
        synchronized (this.field429) {
            this.field429.method316((long) arg0, (byte) -117, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZLjava/lang/String;IB)I")
    public static final int method152(boolean arg0, String arg1, int arg2, byte arg3) {
        field436++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        int var8 = -126 / ((-arg3 - 8) / 57);
        for (int var9 = 0; var9 < var7; var9++) {
            char var10 = arg1.charAt(var9);
            if (var9 == 0) {
                if (var10 == '-') {
                    var4 = true;
                    continue;
                }
                if (var10 == '+' && arg0) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var12 >= arg2) {
                throw new NumberFormatException();
            }
            if (var4) {
                var12 = -var12;
            }
            int var11 = arg2 * var6 + var12;
            if ((var11 / arg2) != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var11;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lg;ILkr;)V")
    public class24(class513 arg0, int arg1, class329 arg2) {
        this.field430 = arg2;
        if (this.field430 != null) {
            this.field430.method2064(0, 11);
        }
    }
}
