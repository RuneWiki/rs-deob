import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class667 {

    @OriginalMember(owner = "client!aca", name = "g", descriptor = "F")
    public float field9385 = 1.0F;

    @OriginalMember(owner = "client!aca", name = "k", descriptor = "F")
    public float field9389 = 1.0F;

    @OriginalMember(owner = "client!aca", name = "o", descriptor = "F")
    public float field9393 = 0.25F;

    @OriginalMember(owner = "client!aca", name = "l", descriptor = "F")
    public float field9390;

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "I")
    public int field9380;

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "Lka;")
    public class434 field9381;

    @OriginalMember(owner = "client!aca", name = "i", descriptor = "I")
    public int field9387;

    @OriginalMember(owner = "client!aca", name = "j", descriptor = "I")
    public int field9388;

    @OriginalMember(owner = "client!aca", name = "d", descriptor = "F")
    public float field9382;

    @OriginalMember(owner = "client!aca", name = "t", descriptor = "I")
    public int field9398;

    @OriginalMember(owner = "client!aca", name = "p", descriptor = "F")
    public float field9394;

    @OriginalMember(owner = "client!aca", name = "r", descriptor = "I")
    public int field9396;

    @OriginalMember(owner = "client!aca", name = "m", descriptor = "I")
    public int field9391;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "Lfc;")
    public static class235 field9379 = new class235(42, -2);

    @OriginalMember(owner = "client!aca", name = "f", descriptor = "I")
    public static int field9384 = -1;

    @OriginalMember(owner = "client!aca", name = "n", descriptor = "Lfc;")
    public static class235 field9392 = new class235(71, 12);

    @OriginalMember(owner = "client!aca", name = "s", descriptor = "[J")
    public static long[] field9397 = new long[256];

    @OriginalMember(owner = "client!aca", name = "e", descriptor = "I")
    public static int field9383;

    @OriginalMember(owner = "client!aca", name = "h", descriptor = "I")
    public static int field9386;

    @OriginalMember(owner = "client!aca", name = "q", descriptor = "I")
    public static int field9395;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field9397[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 4)
    public static final int method3695(String arg0, int arg1) {
        field9386++;
        if (!class591.field8235.field1084) {
            return -1;
        } else if (class210.field3095.containsKey(arg0)) {
            return 100;
        } else {
            String var2 = class563.method3120(arg0, (byte) 119);
            if (var2 == null) {
                return -1;
            }
            String var3 = class605.field8438 + var2;
            if (!class370.field5276.method943(-1, var3, "")) {
                return -1;
            } else if (class370.field5276.method946(var3, (byte) 3)) {
                byte[] var4 = class370.field5276.method937("", var3, arg1);
                File var5 = class510.method2837(var2, 117);
                if (var4 == null || var5 == null) {
                    return -1;
                }
                boolean var6 = true;
                byte[] var7 = class115.method851(var5, -113);
                if (var7 != null && var4.length == var7.length) {
                    for (int var8 = 0; var8 < var7.length; var8++) {
                        if (var4[var8] != var7[var8]) {
                            var6 = false;
                            break;
                        }
                    }
                } else {
                    var6 = false;
                }
                try {
                    if (!var6) {
                        class591.field8235.method627(var4, 68, var5);
                    }
                } catch (Throwable var9) {
                    return -1;
                }
                class515.method2861(var5, arg0, (byte) 22);
                return 100;
            } else {
                return class370.field5276.method923(var3, (byte) 68);
            }
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)V", line = 86)
    public static void method3696(int arg0) {
        field9397 = null;
        if (arg0 == 3296) {
            field9392 = null;
            field9379 = null;
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILjr;)V", line = 107)
    public final void method3697(int arg0, class96 arg1) {
        if (arg0 != -1) {
            this.method3698(null, 104);
        }
        this.field9385 = (float) (arg1.method718(-88) * 8) / 255.0F;
        field9395++;
        this.field9393 = (float) (arg1.method718(-81) * 8) / 255.0F;
        this.field9389 = (float) (arg1.method718(-121) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "()V", line = 191)
    public class667() {
        this.field9390 = 1.2F;
        this.field9380 = -60;
        this.field9381 = class421.field5949;
        this.field9387 = class448.field6270;
        this.field9388 = class137.field1930;
        this.field9382 = 1.1523438F;
        this.field9398 = -50;
        this.field9394 = 0.69921875F;
        this.field9396 = 0;
        this.field9391 = -50;
    }

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Ljr;)V", line = 207)
    public class667(class96 arg0) {
        int var2 = arg0.method718(-67);
        if (class274.field3872.method546((byte) -110, class429.field6020) && class292.field4399.method473() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field9388 = class137.field1930;
            } else {
                this.field9388 = arg0.method714(false);
            }
            if ((var2 & 0x2) == 0) {
                this.field9382 = 1.1523438F;
            } else {
                this.field9382 = (float) arg0.method743((byte) -19) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field9394 = 0.69921875F;
            } else {
                this.field9394 = (float) arg0.method743((byte) -91) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field9390 = 1.2F;
            } else {
                this.field9390 = (float) arg0.method743((byte) -86) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method714(false);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method743((byte) -119);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method743((byte) -49);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method743((byte) -103);
            }
            this.field9390 = 1.2F;
            this.field9394 = 0.69921875F;
            this.field9382 = 1.1523438F;
            this.field9388 = class137.field1930;
        }
        if ((var2 & 0x10) == 0) {
            this.field9391 = -50;
            this.field9398 = -50;
            this.field9380 = -60;
        } else {
            this.field9398 = arg0.method722(4);
            this.field9380 = arg0.method722(4);
            this.field9391 = arg0.method722(4);
        }
        if ((var2 & 0x20) == 0) {
            this.field9387 = class448.field6270;
        } else {
            this.field9387 = arg0.method714(false);
        }
        if ((var2 & 0x40) == 0) {
            this.field9396 = 0;
        } else {
            this.field9396 = arg0.method743((byte) -53);
        }
        if ((var2 & 0x80) == 0) {
            this.field9381 = class421.field5949;
        } else {
            int var3 = arg0.method743((byte) -119);
            int var4 = arg0.method743((byte) -53);
            int var5 = arg0.method743((byte) -83);
            int var6 = arg0.method743((byte) -30);
            int var7 = arg0.method743((byte) -68);
            int var8 = arg0.method743((byte) -46);
            this.field9381 = class608.method3361(var4, var6, var7, (byte) 114, var8, var5, var3);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Laca;I)Z", line = 178)
    public final boolean method3698(class667 arg0, int arg1) {
        field9383++;
        if (arg1 >= -54) {
            this.field9398 = 29;
        }
        return this.field9388 == arg0.field9388 && this.field9382 == arg0.field9382 && this.field9394 == arg0.field9394 && this.field9390 == arg0.field9390 && this.field9393 == arg0.field9393 && this.field9385 == arg0.field9385 && this.field9389 == arg0.field9389 && this.field9387 == arg0.field9387 && this.field9396 == arg0.field9396 && this.field9381 == arg0.field9381;
    }
}
