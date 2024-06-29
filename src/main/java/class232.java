import java.io.IOException;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class232 extends class351 {

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "[I")
    private int[] field3486 = new int[512];

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "Z")
    public static volatile boolean field3491 = true;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "[I")
    public static int[] field3488 = new int[500];

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field3492 = 0;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field3493 = 100;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "Lqj;")
    public static class421 field3490;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method1563(boolean arg0) {
        field3487++;
        class95 var1 = null;
        try {
            class329 var2 = class122.field1844.method472("2", true, (byte) 12);
            while (var2.field4974 == 0) {
                class468.method2848(1L, (byte) 60);
            }
            if (arg0) {
                method1563(true);
            }
            if (var2.field4974 == 1) {
                var1 = (class95) var2.field4975;
                byte[] var3 = new byte[(int) var1.method803((byte) 78)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method801(var3.length - var4, (byte) 91, var4, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class109.method854(1, new class194(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method800(false);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILjava/lang/String;Lgt;)Lwk;", line = 54)
    public static final class329 method1564(int arg0, int arg1, String arg2, class66 arg3) {
        field3489++;
        if (arg0 == arg1) {
            return arg3.method456(arg2, arg1);
        } else if (arg0 == 1) {
            try {
                class220.method1512(arg3.field1062, (byte) 58, new Object[] { (new URL(arg3.field1062.getCodeBase(), arg2)).toString() }, "openjs");
                class329 var4 = new class329();
                var4.field4974 = 1;
                return var4;
            } catch (Throwable var10) {
                class329 var5 = new class329();
                var5.field4974 = 2;
                return var5;
            }
        } else if (arg0 == 2) {
            try {
                arg3.field1062.getAppletContext().showDocument(new URL(arg3.field1062.getCodeBase(), arg2), "_blank");
                class329 var6 = new class329();
                var6.field4974 = 1;
                return var6;
            } catch (Exception var11) {
                class329 var7 = new class329();
                var7.field4974 = 2;
                return var7;
            }
        } else if (arg0 == 3) {
            try {
                class220.method1510(121, "loggedout", arg3.field1062);
            } catch (Throwable var13) {
            }
            try {
                arg3.field1062.getAppletContext().showDocument(new URL(arg3.field1062.getCodeBase(), arg2), "_top");
                class329 var8 = new class329();
                var8.field4974 = 1;
                return var8;
            } catch (Exception var12) {
                class329 var9 = new class329();
                var9.field4974 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(F[FBFFFIIIII)V", line = 131)
    public final void method1565(float arg0, float[] arg1, byte arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3485++;
        int var12 = (int) ((float) arg10 * arg0 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg9 * arg4 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg6 * arg3 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg7 * arg3;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        float var23 = class367.method2335(-126, var21);
        int var24 = var20 & var17;
        int var25 = var19 & var17;
        int var26 = this.field3486[var25];
        int var27 = this.field3486[var24];
        if (arg2 > -35) {
            field3488 = null;
        }
        for (int var28 = 0; var28 < arg9; var28++) {
            float var29 = (float) var28 * arg4;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            int var34 = var31 & var15;
            int var35 = var30 & var15;
            float var36 = class367.method2335(-112, var32);
            int var37 = this.field3486[var35 + var26];
            int var38 = this.field3486[var26 + var34];
            int var39 = this.field3486[var27 + var35];
            int var40 = this.field3486[var27 + var34];
            for (int var41 = 0; var41 < arg10; var41++) {
                float var42 = (float) var41 * arg0;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                int var47 = var44 & var13;
                int var48 = var43 & var13;
                float var49 = class367.method2335(-102, var45);
                arg1[arg8++] = arg5 * class59.method388(class59.method388(class59.method388(class242.method1626(var22, var46, (byte) -101, var33, class307.method2028(this.field3486[var37 + var48], 7)), (byte) 37, var49, class242.method1626(var22, var45, (byte) -58, var33, class307.method2028(this.field3486[var47 + var37], 7))), (byte) 64, var36, class59.method388(class242.method1626(var22, var46, (byte) -80, var32, class307.method2028(this.field3486[var38 + var48], 7)), (byte) -123, var49, class242.method1626(var22, var45, (byte) -84, var32, class307.method2028(7, this.field3486[var38 + var47])))), (byte) -121, var23, class59.method388(class59.method388(class242.method1626(var21, var46, (byte) -62, var33, class307.method2028(7, this.field3486[var39 + var48])), (byte) -125, var49, class242.method1626(var21, var45, (byte) -64, var33, class307.method2028(this.field3486[var39 + var47], 7))), (byte) 43, var36, class59.method388(class242.method1626(var21, var46, (byte) -117, var32, class307.method2028(7, this.field3486[var48 + var40])), (byte) 39, var49, class242.method1626(var21, var45, (byte) -90, var32, class307.method2028(7, this.field3486[var47 + var40])))));
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)I", line = 223)
    public static int method1566(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 236)
    public static void method1567(int arg0) {
        field3490 = null;
        int var1 = 109 / ((arg0 + 11) / 60);
        field3488 = null;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(I)V", line = 249)
    public class232(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field3486[var3] = this.field3486[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field3486[var5];
            this.field3486[var5] = this.field3486[var5 + 256] = this.field3486[var4];
            this.field3486[var4] = this.field3486[var4 + 256] = var6;
        }
    }
}
