import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class291 extends class123 {

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "[B")
    public byte[] field4567;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    public static int field4563 = 0;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILtk;)Z", line = 4)
    public static final boolean method2041(int arg0, class266 arg1) {
        field4564++;
        if (arg0 >= -66) {
            field4570 = -40;
        }
        if (arg1.field4064 == 205) {
            class82.field1281 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLtk;)V", line = 28)
    public static final void method2042(byte arg0, class266 arg1) {
        int var2 = -52 % ((arg0 + 83) / 35);
        field4565++;
        class266 var3 = class315.method2226(-1, arg1);
        int var4;
        int var5;
        if (var3 == null) {
            var4 = class338.field5219;
            var5 = class211.field3314;
        } else {
            var4 = var3.field3939;
            var5 = var3.field3941;
        }
        class220.method1600(arg1, var4, (byte) -92, var5, false);
        class303.method2157(var5, -1, arg1, var4);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lpk;I)V", line = 54)
    public static final void method2043(class120 arg0, int arg1) {
        field4568++;
        class11.field253 = arg0;
        class25.field422 = class11.field253.method962((byte) -123, 16);
        if (arg1 != 2371) {
            field4569 = 108;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(JB)V", line = 69)
    public static final void method2044(long arg0, byte arg1) {
        field4572++;
        if (arg0 == 0L) {
            return;
        }
        int var3 = 0;
        int var4 = 30 / ((34 - arg1) / 41);
        while (class172.field2763 > var3) {
            if (class130.field2080[var3] == arg0) {
                class172.field2763--;
                for (int var5 = var3; var5 < class172.field2763; var5++) {
                    class129.field2066[var5] = class129.field2066[var5 + 1];
                    class296.field4725[var5] = class296.field4725[var5 + 1];
                    class172.field2759[var5] = class172.field2759[var5 + 1];
                    class130.field2080[var5] = class130.field2080[var5 + 1];
                    class227.field3506[var5] = class227.field3506[var5 + 1];
                    class301.field4799[var5] = class301.field4799[var5 + 1];
                }
                class178.field2844++;
                class11.field254 = class200.field3060;
                class209.field3305.method1808((byte) -74, 243);
                class209.field3305.method59(arg0, false);
                break;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIIII)Z", line = 121)
    public static final boolean method2045(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4566++;
        long var8 = class55.method470(arg1, arg2 + arg4, arg6 + arg7);
        if (arg0 != 2) {
            field4563 = 9;
        }
        if (var8 != 0L) {
            int var10 = ((int) var8 & 0x3D9A8D) >> 20;
            int var11 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            int var12 = ((int) var8 & 0x7DDBC) >> 14;
            class101 var13 = class288.method2025(var11, -1);
            if (var13.field1681 == -1) {
                int[] var14 = class33.field503;
                int var15 = (52736 - (arg6 * 512)) * 4 + ((arg4 * 4) + 24624);
                int var16 = arg3;
                if (var8 > 0L) {
                    var16 = arg5;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var10 == 0) {
                        var14[var15] = var16;
                        var14[var15 + 512] = var16;
                        var14[var15 + 1024] = var16;
                        var14[var15 + 1536] = var16;
                    } else if (var10 == 1) {
                        var14[var15] = var16;
                        var14[var15 + 1] = var16;
                        var14[var15 + 2] = var16;
                        var14[var15 + 3] = var16;
                    } else if (var10 == 2) {
                        var14[var15 + 3] = var16;
                        var14[var15 + 512 + 3] = var16;
                        var14[var15 + 3 + 1024] = var16;
                        var14[var15 + 3 + 1536] = var16;
                    } else if (var10 == 3) {
                        var14[var15 + 1536] = var16;
                        var14[var15 + 1536 + 1] = var16;
                        var14[var15 + 2 + 1536] = var16;
                        var14[var15 + 1536 + 3] = var16;
                    }
                }
                if (var12 == 3) {
                    if (var10 == 0) {
                        var14[var15] = var16;
                    } else if (var10 == 1) {
                        var14[var15 + 3] = var16;
                    } else if (var10 == 2) {
                        var14[var15 + 1539] = var16;
                    } else if (var10 == 3) {
                        var14[var15 + 1536] = var16;
                    }
                }
                if (var12 == 2) {
                    if (var10 == 3) {
                        var14[var15] = var16;
                        var14[var15 + 512] = var16;
                        var14[var15 + 1024] = var16;
                        var14[var15 + 1536] = var16;
                    } else if (var10 == 0) {
                        var14[var15] = var16;
                        var14[var15 + 1] = var16;
                        var14[var15 + 2] = var16;
                        var14[var15 + 3] = var16;
                    } else if (var10 == 1) {
                        var14[var15 + 3] = var16;
                        var14[var15 + 515] = var16;
                        var14[var15 + 1024 + 3] = var16;
                        var14[var15 + 1536 + 3] = var16;
                    } else if (var10 == 2) {
                        var14[var15 + 1536] = var16;
                        var14[var15 + 1536 + 1] = var16;
                        var14[var15 + 1536 + 2] = var16;
                        var14[var15 + 1539] = var16;
                    }
                }
            } else if (!class126.method995(var13, arg7, 52, arg2, arg6, arg4, var10)) {
                return false;
            }
        }
        long var17 = class122.method973(arg1, arg2 + arg4, arg6 + arg7);
        if (var17 != 0L) {
            int var19 = (int) var17 >> 20 & 0x3;
            int var20 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            int var21 = ((int) var17 & 0x7DB37) >> 14;
            class101 var22 = class288.method2025(var20, -1);
            if (var22.field1681 == -1) {
                if (var21 == 9) {
                    int var23 = 15658734;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int var24 = arg4 * 4 + (103 - arg6) * 512 * 4 + 24624;
                    int[] var25 = class33.field503;
                    if (var19 == 0 || var19 == 2) {
                        var25[var24 + 1536] = var23;
                        var25[var24 + 1 + 1024] = var23;
                        var25[var24 + 2 + 512] = var23;
                        var25[var24 + 3] = var23;
                    } else {
                        var25[var24] = var23;
                        var25[var24 + 512 + 1] = var23;
                        var25[var24 + 1024 + 2] = var23;
                        var25[var24 + 1536 + 3] = var23;
                    }
                }
            } else if (!class126.method995(var22, arg7, 78, arg2, arg6, arg4, var19)) {
                return false;
            }
        }
        long var26 = class110.method865(arg1, arg2 + arg4, arg6 - -arg7);
        if (var26 != 0L) {
            int var28 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            int var29 = ((int) var26 & 0x3D957A) >> 20;
            class101 var30 = class288.method2025(var28, -1);
            if (var30.field1681 != -1 && !class126.method995(var30, arg7, 66, arg2, arg6, arg4, var29)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "([B)V", line = 331)
    public class291(byte[] arg0) {
        this.field4567 = arg0;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IC)C", line = 340)
    public static final char method2046(int arg0, char arg1) {
        if (arg0 != 17286) {
            return (char) 65515;
        }
        field4571++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }
}
