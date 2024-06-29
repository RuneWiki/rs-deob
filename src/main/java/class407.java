import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class407 extends class11 {

    @OriginalMember(owner = "client!iu", name = "G", descriptor = "Lwj;")
    public static class270 field5949 = new class270(11, -1);

    @OriginalMember(owner = "client!iu", name = "L", descriptor = "Lqp;")
    public static class466 field5954 = new class466("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!iu", name = "O", descriptor = "[I")
    public static int[] field5957 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!iu", name = "P", descriptor = "S")
    public static short field5958 = 32767;

    @OriginalMember(owner = "client!iu", name = "H", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!iu", name = "I", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!iu", name = "K", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!iu", name = "M", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!iu", name = "N", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!iu", name = "Q", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!iu", name = "J", descriptor = "Ldq;")
    public static class490 field5952;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)[[I")
    public final int[][] method41(int arg0, int arg1) {
        ++field5951;
        int[][] var3 = super.field156.method1719(arg1, 3);
        if (super.field156.field4001) {
            int[][] var4 = this.method49(arg1, 0, 115);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class90.field1316 > var11; ++var11) {
                var8[var11] = 4096 - var5[var11];
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        int var12 = -125 % ((arg0 - -75) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "(Z)V")
    public static void method2436(boolean arg0) {
        field5949 = null;
        if (!arg0) {
            field5952 = null;
            field5957 = null;
            field5954 = null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field5956;
        if (arg0 >= -42) {
            field5949 = null;
        }
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (super.field158.field2966) {
            int[] var4 = this.method48(arg1, 0, (byte) -126);
            for (int var5 = 0; ~var5 > ~class90.field1316; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "(II)I")
    public static final int method2437(int arg0, int arg1) {
        ++field5955;
        if (arg0 != 8287) {
            field5957 = null;
        }
        return (262039 & arg1) >> 11;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIZJLjava/lang/String;ILjava/lang/String;IIZI)V")
    public static final void method2438(int arg0, int arg1, boolean arg2, long arg3, String arg4, int arg5, String arg6, int arg7, int arg8, boolean arg9, int arg10) {
        if (arg8 != 500) {
            method2436(false);
        }
        ++field5953;
        if (!class181.field2659 && class274.field3764 < 500) {
            int var12 = arg1 == -1 ? class226.field3209 : arg1;
            class82 var13 = new class82(arg4, arg6, var12, arg0, arg7, arg3, arg5, arg10, arg2, arg9);
            class526.field7778.method2809(var13, 2);
            ++class274.field3764;
        }
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "()V")
    public class407() {
        super(1, false);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(BZ[B)Ljava/lang/Object;")
    public static final Object method2439(byte arg0, boolean arg1, byte[] arg2) {
        ++field5950;
        if (arg0 < 70) {
            method2436(false);
        }
        if (arg2 == null) {
            return null;
        } else {
            if (~arg2.length < -137 && !class318.field4373) {
                try {
                    class294 var3 = (class294) Class.forName("ao").newInstance();
                    var3.method1187(arg2, 101);
                    return var3;
                } catch (Throwable var4) {
                    class318.field4373 = true;
                }
            }
            return !arg1 ? arg2 : class244.method1481((byte) 4, arg2);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lsi;II)V")
    public final void method43(class391 arg0, int arg1, int arg2) {
        if (arg1 > -40) {
            this.method43((class391) null, 84, 80);
        }
        if (arg2 == 0) {
            super.field167 = ~arg0.method2348(-2) == -2;
        }
        ++field5959;
    }
}
