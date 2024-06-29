import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class226 {

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "Z")
    public boolean field3219 = true;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
    public int field3223 = 128;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
    public int field3227 = -1;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    private int field3222 = 0;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3226 = " from your ignore list first.";

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "Lcc;")
    public static class263 field3230 = null;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "[I")
    public static int[] field3235 = new int[2500];

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    public int field3220;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
    public int field3224;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
    public int field3228;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
    public int field3231;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V", line = 7)
    public static final void method1553(int arg0) {
        field3229++;
        try {
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class340.field5274 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var6) {
                }
            }
        } catch (Exception var7) {
        }
        if (arg0 != 11111) {
            field3226 = (String) null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZI)V", line = 45)
    private final void method1554(boolean arg0, int arg1) {
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        field3232++;
        double var5 = (double) (arg1 & 0xFF) / 256.0D;
        double var7 = var3;
        double var9 = var3;
        double var11 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        if (var3 > var11) {
            var7 = var11;
        }
        double var13 = 0.0D;
        if (var3 < var11) {
            var9 = var11;
        }
        if (var5 < var7) {
            var7 = var5;
        }
        double var15 = 0.0D;
        if (var9 < var5) {
            var9 = var5;
        }
        double var17 = (var7 + var9) / 2.0D;
        if (var7 != var9) {
            if (var17 < 0.5D) {
                var13 = (var9 - var7) / (var7 + var9);
            }
            if (var3 == var9) {
                var15 = (var11 - var5) / (var9 - var7);
            } else if (var9 == var11) {
                var15 = (var5 - var3) / (var9 - var7) + 2.0D;
            } else if (var5 == var9) {
                var15 = (var3 - var11) / (var9 - var7) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var13 = (var9 - var7) / (2.0D - var9 - var7);
            }
        }
        this.field3224 = (int) (var13 * 256.0D);
        this.field3220 = (int) (var17 * 256.0D);
        if (this.field3220 < 0) {
            this.field3220 = 0;
        } else if (this.field3220 > 255) {
            this.field3220 = 255;
        }
        if (arg0) {
            this.field3228 = -35;
        }
        if (var17 > 0.5D) {
            this.field3231 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field3231 = (int) (var13 * var17 * 512.0D);
        }
        double var19 = var15 / 6.0D;
        if (this.field3231 < 1) {
            this.field3231 = 1;
        }
        if (this.field3224 < 0) {
            this.field3224 = 0;
        } else if (this.field3224 > 255) {
            this.field3224 = 255;
        }
        this.field3228 = (int) ((double) this.field3231 * var19);
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V", line = 137)
    public static void method1555(int arg0) {
        field3235 = null;
        if (arg0 != 1087616432) {
            method1553(8);
        }
        field3230 = null;
        field3226 = null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILp;BI)V", line = 160)
    private final void method1556(int arg0, class107 arg1, byte arg2, int arg3) {
        if (arg2 <= 2) {
            this.field3223 = -25;
        }
        field3221++;
        if (arg3 == 1) {
            this.field3222 = arg1.method622((byte) -120);
            this.method1554(false, this.field3222);
        } else if (arg3 == 2) {
            this.field3227 = arg1.method624(14612);
            if (this.field3227 == 65535) {
                this.field3227 = -1;
            }
        } else if (arg3 == 3) {
            this.field3223 = arg1.method624(14612);
        } else if (arg3 == 4) {
            this.field3219 = false;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIII)V", line = 201)
    public static final void method1557(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class109.field1494 <= arg3 && arg3 <= class56.field678) {
            int var5 = class140.method930(24918, arg0, class248.field3759, class272.field4273);
            int var6 = class140.method930(24918, arg2, class248.field3759, class272.field4273);
            class214.method1459(arg1, 80, var5, var6, arg3);
        }
        field3233++;
        if (arg4 > -56) {
            method1555(-55);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lp;BI)V", line = 229)
    public final void method1558(class107 arg0, byte arg1, int arg2) {
        while (true) {
            int var4 = arg0.method661(-1);
            if (var4 == 0) {
                if (arg1 <= 107) {
                    return;
                }
                field3234++;
                return;
            }
            this.method1556(arg2, arg0, (byte) 86, var4);
        }
    }
}
