import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class552 {

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Z")
    public boolean field7614;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "[I")
    public static int[] field7613 = new int[13];

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "Lcba;")
    public static class471 field7620 = new class471(1, 8);

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field7625 = 0;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "Ldv;")
    public static class566 field7626 = new class566(41, -1);

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "F")
    public static float field7624;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field7617;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field7619;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field7621;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Llu;")
    public class609 field7616;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "Llu;")
    public class609 field7622;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "Z")
    public boolean field7615;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "[Z")
    public static boolean[] field7627;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII[BI[BII)V")
    public static final void method3132(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        field7617++;
        if (arg8 != -1) {
            field7624 = -1.0498016F;
        }
        int var9 = -(arg3 >> 2);
        int var10 = -(arg3 & 0x3);
        for (int var11 = -arg7; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg2++;
                arg6[var10001] += arg4[arg1++];
                int var14 = arg2++;
                arg6[var14] += arg4[arg1++];
                int var15 = arg2++;
                arg6[var15] += arg4[arg1++];
                int var16 = arg2++;
                arg6[var16] += arg4[arg1++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg2++;
                arg6[var10001] += arg4[arg1++];
            }
            arg2 += arg5;
            arg1 += arg0;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public static void method3133(int arg0) {
        field7620 = null;
        field7626 = null;
        int var1 = -70 % ((-arg0 - 60) / 51);
        field7613 = null;
        field7627 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public final void method3134(byte arg0) {
        if (arg0 != 88) {
            field7620 = null;
        }
        if (this.field7622 != null) {
            this.field7622.method618((byte) 35);
        }
        field7618++;
        this.field7615 = false;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)Z")
    public final boolean method3135(int arg0) {
        field7619++;
        if (arg0 != 19405) {
            this.method3134((byte) 102);
        }
        return this.field7615 && !this.field7614;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II[S)[S")
    public static final short[] method3136(int arg0, int arg1, short[] arg2) {
        field7621++;
        short[] var3 = new short[arg0];
        if (arg1 != -1462) {
            field7625 = -30;
        }
        class416.method2501(arg2, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([BBZ)Ljava/lang/Object;")
    public static final Object method3137(byte[] arg0, byte arg1, boolean arg2) {
        field7623++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class340.field4581) {
            try {
                class271 var3 = (class271) Class.forName("mt").getDeclaredConstructor().newInstance();
                var3.method1763(arg0, 1000);
                return var3;
            } catch (Throwable var4) {
                class340.field4581 = true;
            }
        }
        if (arg1 < 7) {
            return null;
        } else if (arg2) {
            return class524.method3019(arg0, false);
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Z)V")
    public class552(boolean arg0) {
        this.field7614 = arg0;
    }
}
