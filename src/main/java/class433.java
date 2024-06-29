import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class433 extends class80 {

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "I")
    public int field6300 = 0;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
    public int field6294 = 12800;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
    public int field6295 = 0;

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
    public int field6304 = -1;

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
    public int field6305 = -1;

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "Z")
    public boolean field6311 = true;

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "I")
    public int field6312 = 12800;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    public int field6290;

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "Ljava/lang/String;")
    public String field6299;

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "Ljava/lang/String;")
    public String field6296;

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "I")
    public int field6297;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "Lwo;")
    public class522 field6293;

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "Z")
    public static boolean field6302 = false;

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6307 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "[I")
    public static int[] field6310 = new int[1000];

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "I")
    public static int field6298;

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!ji", name = "O", descriptor = "[Lf;")
    public static class529[] field6309;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V", line = 3)
    public static void method2581(int arg0) {
        if (arg0 != -1887993940) {
            field6309 = null;
        }
        field6309 = null;
        field6307 = null;
        field6310 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ltf;I)I", line = 22)
    public static final int method2582(class192 arg0, int arg1) {
        if (arg1 != 3) {
            field6310 = null;
        }
        field6291++;
        int var2 = arg0.field2695;
        class21 var3 = arg0.method165((byte) -91);
        if (arg0.field317) {
            var2 = arg0.field2737;
        } else if (arg0.field328 == var3.field257 || arg0.field328 == var3.field236 || arg0.field328 == var3.field232 || arg0.field328 == var3.field260) {
            var2 = arg0.field2706;
        } else if (arg0.field328 == var3.field259 || arg0.field328 == var3.field263 || arg0.field328 == var3.field225 || arg0.field328 == var3.field222) {
            var2 = arg0.field2718;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I[IBI)Z", line = 51)
    public final boolean method2583(int arg0, int[] arg1, byte arg2, int arg3) {
        field6308++;
        if (arg2 != -113) {
            field6313 = 113;
        }
        for (class45 var5 = (class45) this.field6293.method3072((byte) 87); var5 != null; var5 = (class45) this.field6293.method3066(2)) {
            if (var5.method282(-1, arg3, arg0)) {
                var5.method288(0, arg3, arg0, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([IIII)Z", line = 78)
    public final boolean method2584(int[] arg0, int arg1, int arg2, int arg3) {
        field6306++;
        int var5 = -112 / ((arg1 + 43) / 35);
        for (class45 var6 = (class45) this.field6293.method3072((byte) 59); var6 != null; var6 = (class45) this.field6293.method3066(2)) {
            if (var6.method283(arg2, arg3, -31767)) {
                var6.method286(arg3, arg0, -115, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 308)
    public class433(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field6304 = arg4;
        this.field6290 = arg0;
        this.field6299 = arg2;
        this.field6311 = arg5;
        this.field6296 = arg1;
        this.field6297 = arg3;
        this.field6305 = arg6;
        if (this.field6305 == 255) {
            this.field6305 = 0;
        }
        this.field6293 = new class522();
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)V", line = 121)
    public final void method2585(int arg0) {
        this.field6294 = 12800;
        this.field6312 = 12800;
        this.field6295 = arg0;
        field6301++;
        this.field6300 = 0;
        for (class45 var2 = (class45) this.field6293.method3072((byte) 18); var2 != null; var2 = (class45) this.field6293.method3066(2)) {
            if (var2.field636 < this.field6312) {
                this.field6312 = var2.field636;
            }
            if (var2.field628 < this.field6294) {
                this.field6294 = var2.field628;
            }
            if (this.field6300 < var2.field629) {
                this.field6300 = var2.field629;
            }
            if (this.field6295 < var2.field632) {
                this.field6295 = var2.field632;
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIIIIII)V", line = 160)
    public static final void method2586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6303++;
        if (arg4 == arg8 && arg0 == arg1 && arg3 == arg7 && arg2 == arg9) {
            class485.method2860(arg9, arg1, 0, arg5, arg8, arg3);
        } else {
            int var10 = arg8;
            int var11 = arg1;
            int var12 = arg8 * 3;
            int var13 = arg1 * 3;
            int var14 = arg4 * 3;
            int var15 = arg0 * 3;
            int var16 = arg7 * 3;
            int var17 = arg2 * 3;
            int var18 = arg3 - (var16 - (var14 - arg8));
            int var19 = arg9 + var15 - arg1 - var17;
            int var20 = var16 - var14 - (-var12 + var14);
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg8 + (var27 + var29 + var31 >> 12);
                int var34 = arg1 + (var28 + var30 + var32 >> 12);
                class485.method2860(var34, var11, 0, arg5, var10, var33);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg6 != 12970) {
            field6313 = 16;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)Z", line = 239)
    public final boolean method2587(int arg0, int arg1, int arg2) {
        field6298++;
        if (arg1 != 2047739788) {
            return false;
        }
        for (class45 var4 = (class45) this.field6293.method3072((byte) 26); var4 != null; var4 = (class45) this.field6293.method3066(arg1 ^ 0x7A0E078E)) {
            if (var4.method282(arg1 ^ 0x85F1F873, arg2, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII[I)Z", line = 270)
    public final boolean method2588(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field6292++;
        if (arg3 != 0) {
            this.field6299 = null;
        }
        for (class45 var6 = (class45) this.field6293.method3072((byte) 48); var6 != null; var6 = (class45) this.field6293.method3066(2)) {
            if (var6.method281(arg0, arg2, arg1, 4096)) {
                var6.method288(arg3, arg1, arg2, arg4);
                return true;
            }
        }
        return false;
    }
}
