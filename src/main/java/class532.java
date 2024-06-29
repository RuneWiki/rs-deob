import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class532 {

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "Z")
    public boolean field7253 = false;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    public int field7247;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
    public int field7248;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "Lwba;")
    public class54 field7251;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIZLha;)Lvr;")
    public final class147 method3046(int arg0, int arg1, boolean arg2, class65 arg3) {
        if (arg1 != -14563) {
            return null;
        }
        field7245++;
        long var5 = (long) (arg3.field913 << 19 | this.field7247 | arg0 << 16 | (arg2 ? 262144 : 0));
        class147 var7 = (class147) this.field7251.field773.method1541(-10, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field7251.field771.method2104(114, this.field7247)) {
            class508 var8 = class508.method2950(this.field7251.field771, this.field7247, 0);
            if (var8 != null) {
                var8.field7021 = var8.field7020 = var8.field7015 = var8.field7016 = 0;
                if (arg2) {
                    var8.method2949();
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    var8.method2948();
                }
            }
            class147 var10 = arg3.method477(var8, true);
            if (var10 != null) {
                this.field7251.field773.method1544(true, var10, var5);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)Z")
    public final boolean method3047(int arg0) {
        if (arg0 != 0) {
            this.field7251 = null;
        }
        field7249++;
        return this.field7251.field771.method2104(-105, this.field7247);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILjp;I)V")
    private final void method3048(int arg0, class376 arg1, int arg2) {
        field7246++;
        if (arg2 == 1) {
            this.field7247 = arg1.method2359(-1);
        } else if (arg2 == 2) {
            this.field7248 = arg1.method2373(1223262424);
        } else if (arg2 == 3) {
            this.field7253 = true;
        } else if (arg2 == 4) {
            this.field7247 = -1;
        }
        int var4 = 57 % ((-arg0 - 39) / 54);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIBLml;)Ltg;")
    public static final class244 method3049(int arg0, int arg1, byte arg2, class410 arg3) {
        field7252++;
        int var4 = arg1 << 10 | arg3.field5906;
        class244 var5 = (class244) class120.field1754.method713((long) var4 << 16, 47);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class383.field5606.method2114(class383.field5606.method2100((byte) 73, var4), false);
        if (var6 == null) {
            int var9 = arg0 + 65536 << 10 | arg3.field5906;
            class244 var10 = (class244) class120.field1754.method713((long) var9 << 16, 55);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class383.field5606.method2114(class383.field5606.method2100((byte) 81, var9), false);
            int var12 = 77 / ((-arg2 - 74) / 50);
            if (var11 == null) {
                int var15 = arg3.field5906 | 0x3FFFC00;
                class244 var16 = (class244) class120.field1754.method713((long) var15 << 16, 24);
                if (var16 != null) {
                    return var16;
                }
                byte[] var17 = class383.field5606.method2114(class383.field5606.method2100((byte) 111, var15), false);
                if (var17 == null) {
                    return null;
                } else if (var17.length <= 1) {
                    return null;
                } else {
                    class244 var18;
                    try {
                        var18 = class304.method1915(var17, -1);
                    } catch (Exception var22) {
                        throw new RuntimeException(var22.getMessage() + " S: " + var15);
                    }
                    var18.field3294 = arg3;
                    class120.field1754.method717(var18, 117, (long) var15 << 16);
                    return var18;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class244 var13;
                try {
                    var13 = class304.method1915(var11, -1);
                } catch (Exception var21) {
                    throw new RuntimeException(var21.getMessage() + " S: " + var9);
                }
                var13.field3294 = arg3;
                class120.field1754.method717(var13, 123, (long) var9 << 16);
                return var13;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class244 var7;
            try {
                var7 = class304.method1915(var6, -1);
            } catch (Exception var20) {
                throw new RuntimeException(var20.getMessage() + " S: " + var4);
            }
            var7.field3294 = arg3;
            class120.field1754.method717(var7, 115, (long) var4 << 16);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLjp;)V")
    public final void method3050(byte arg0, class376 arg1) {
        field7250++;
        if (arg0 != -19) {
            this.method3047(-12);
        }
        while (true) {
            int var3 = arg1.method2398(arg0 ^ 0x51D275E5);
            if (var3 == 0) {
                return;
            }
            this.method3048(112, arg1, var3);
        }
    }
}
