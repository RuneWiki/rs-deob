import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class342 {

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public int field5326 = -1;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public int field5327 = 128;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "Z")
    public boolean field5337 = true;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    private int field5334 = 0;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5324 = "Loaded world list data";

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "[I")
    public static int[] field5333 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field5335 = 0;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public int field5319;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public int field5328;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public int field5329;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public int field5338;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Lgd;")
    public static class324 field5323;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Lkb;")
    public static class39 field5322;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V", line = 10)
    public static final void method2355(int arg0, int arg1) {
        field5339++;
        class227 var2 = (class227) class164.field2664.method1743((long) arg1, (byte) -10);
        if (arg0 == -2075 && var2 != null) {
            var2.method465((byte) -122);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 30)
    public static void method2356(int arg0) {
        field5333 = null;
        if (arg0 != 0) {
            field5323 = (class324) null;
        }
        field5323 = null;
        field5324 = null;
        field5322 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)V", line = 44)
    private final void method2357(int arg0, byte arg1) {
        field5332++;
        double var3 = (double) ((arg0 & 0xFFE0A2) >> 16) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF99) >> 8) / 256.0D;
        double var7 = var3;
        double var9 = (double) (arg0 & 0xFF) / 256.0D;
        double var11 = var3;
        if (var5 < var3) {
            var7 = var5;
        }
        double var13 = 0.0D;
        if (arg1 != 109) {
            this.field5327 = -71;
        }
        double var15 = 0.0D;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var9) {
            var11 = var9;
        }
        if (var7 > var9) {
            var7 = var9;
        }
        double var17 = (var7 + var11) / 2.0D;
        if (var7 != var11) {
            if (var17 < 0.5D) {
                var13 = (var11 - var7) / (var7 + var11);
            }
            if (var3 == var11) {
                var15 = (var5 - var9) / (var11 - var7);
            } else if (var5 == var11) {
                var15 = (var9 - var3) / (var11 - var7) + 2.0D;
            } else if (var9 == var11) {
                var15 = (var3 - var5) / (var11 - var7) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var7) / (2.0D - var11 - var7);
            }
        }
        this.field5329 = (int) (var13 * 256.0D);
        this.field5338 = (int) (var17 * 256.0D);
        if ((var17 > 0.5D)) {
            this.field5328 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field5328 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field5329 < 0) {
            this.field5329 = 0;
        } else if (this.field5329 > 255) {
            this.field5329 = 255;
        }
        if (this.field5328 < 1) {
            this.field5328 = 1;
        }
        if (this.field5338 < 0) {
            this.field5338 = 0;
        } else if (this.field5338 > 255) {
            this.field5338 = 255;
        }
        double var19 = var15 / 6.0D;
        this.field5319 = (int) ((double) this.field5328 * var19);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIZ)V", line = 141)
    public static final void method2358(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field5325++;
        int var6 = 0;
        int var7 = arg4;
        class245.method1738(48, class310.field4841[arg2], arg1 + arg3, -arg3 + arg1, arg0);
        int var8 = arg4 * arg4;
        int var9 = arg3 * arg3;
        int var10 = var8 << 1;
        int var11 = var9 << 1;
        if (arg5) {
            return;
        }
        int var12 = arg4 << 1;
        int var13 = var8 << 2;
        int var14 = (1 - var12) * var9 + var10;
        int var15 = var9 << 2;
        int var16 = ((var6 << 1) + 3) * var10;
        int var17 = (var6 + 1) * var13;
        int var18 = ((arg4 << 1) - 3) * var11;
        int var19 = var8 - ((var12 - 1) * var11);
        int var20 = (arg4 - 1) * var15;
        while (var7 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var6++;
                    var14 += var16;
                    var16 += var13;
                    var19 += var17;
                    var17 += var13;
                }
            }
            var7--;
            if (var19 < 0) {
                var19 += var17;
                var6++;
                var17 += var13;
                var14 += var16;
                var16 += var13;
            }
            var14 += -var20;
            int var21 = arg2 - var7;
            var20 -= var15;
            int var22 = arg1 - var6;
            var19 += -var18;
            int var23 = arg1 + var6;
            var18 -= var15;
            int var24 = arg2 + var7;
            class245.method1738(48, class310.field4841[var21], var23, var22, arg0);
            class245.method1738(48, class310.field4841[var24], var23, var22, arg0);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILim;)V", line = 224)
    private final void method2359(int arg0, int arg1, int arg2, class192 arg3) {
        field5320++;
        int var5 = 60 / ((arg0 - 5) / 35);
        if (arg2 == 1) {
            this.field5334 = arg3.method1378(false);
            this.method2357(this.field5334, (byte) 109);
        } else if (arg2 == 2) {
            this.field5326 = arg3.method1396(-40);
            if (this.field5326 == 65535) {
                this.field5326 = -1;
            }
        } else if (arg2 == 3) {
            this.field5327 = arg3.method1396(-18);
        } else if (arg2 == 4) {
            this.field5337 = false;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lim;II)V", line = 260)
    public final void method2360(class192 arg0, int arg1, int arg2) {
        field5330++;
        if (arg2 != -9535) {
            return;
        }
        while (true) {
            int var4 = arg0.method1399(-1172389784);
            if (var4 == 0) {
                return;
            }
            this.method2359(-77, arg1, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 311)
    public static final int method2361(String arg0, int arg1) {
        field5321++;
        if (arg1 != 23126) {
            method2355(-58, -60);
        }
        return arg0.length() + 1;
    }
}
