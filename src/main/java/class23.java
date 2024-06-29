import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class23 {

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "Ldu;")
    private class373 field337 = null;

    @OriginalMember(owner = "client!qia", name = "d", descriptor = "Ldu;")
    private class373 field339 = null;

    @OriginalMember(owner = "client!qia", name = "e", descriptor = "I")
    private int field340 = 65000;

    @OriginalMember(owner = "client!qia", name = "j", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client!qia", name = "i", descriptor = "Liv;")
    public static class106 field344 = new class106("stellardawn", 1);

    @OriginalMember(owner = "client!qia", name = "k", descriptor = "Z")
    public static boolean field346 = false;

    @OriginalMember(owner = "client!qia", name = "l", descriptor = "I")
    public static int field347 = -1;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!qia", name = "c", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!qia", name = "f", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!qia", name = "g", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!qia", name = "h", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(IIIIIBII)V", line = 6)
    public static final void method170(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        int var8 = 87 / ((arg5 + 42) / 34);
        field343++;
        class455 var9 = null;
        for (class455 var10 = (class455) class715.field10079.method2508((byte) 110); var10 != null; var10 = (class455) class715.field10079.method2505((byte) -55)) {
            if (var10.field6524 == arg3 && var10.field6529 == arg0 && var10.field6523 == arg6 && var10.field6525 == arg4) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class455();
            var9.field6523 = arg6;
            var9.field6524 = arg3;
            var9.field6525 = arg4;
            var9.field6529 = arg0;
            if (arg0 >= 0 && arg6 >= 0 && class109.field1314 > arg0 && class760.field10479 > arg6) {
                class729.method4091(var9, (byte) -62);
            }
            class715.field10079.method2510(var9, false);
        }
        var9.field6528 = true;
        var9.field6533 = arg2;
        var9.field6532 = false;
        var9.field6531 = arg7;
        var9.field6527 = arg1;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(III[B)Z", line = 54)
    public final boolean method171(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 != 519) {
            return false;
        }
        field342++;
        class373 var5 = this.field337;
        synchronized (this.field337) {
            if (arg2 < 0 || arg2 > this.field340) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method174(arg3, arg1, arg2, arg0 + 2029191593, true);
            if (!var6) {
                var6 = this.method174(arg3, arg1, arg2, 2029192112, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!qia", name = "toString", descriptor = "()Ljava/lang/String;", line = 81)
    public final String toString() {
        field341++;
        return "Cache:" + this.field345;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(II)[B", line = 89)
    public final byte[] method172(int arg0, int arg1) {
        field336++;
        class373 var3 = this.field337;
        synchronized (this.field337) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field339.method2320((byte) 113)) {
                    return null;
                }
                this.field339.method2316((long) (arg0 * 6), true);
                this.field339.method2312(0, false, 6, class423.field5969);
                int var5 = ((class423.field5969[0] & arg1) << 16) + (class423.field5969[1] & 0xFF << 8) + (class423.field5969[2] & 0xFF);
                int var6 = (class423.field5969[5] & 0xFF) + (class423.field5969[4] & 0xFF << 8) + (class423.field5969[3] & 0xFF << 16);
                if (var5 < 0 || var5 > this.field340) {
                    return null;
                } else if (var6 > 0 && this.field337.method2320((byte) 110) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field337.method2316((long) (var6 * 520), true);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field337.method2312(0, false, var13 + 8, class423.field5969);
                        int var14 = (class423.field5969[0] & 0xFF << 8) + (class423.field5969[1] & 0xFF);
                        int var15 = ((class423.field5969[2] & 0xFF) << 8) + (class423.field5969[3] & 0xFF);
                        int var16 = (class423.field5969[6] & 0xFF) + ((class423.field5969[5] & 0xFF) << 8) + (class423.field5969[4] & 0xFF << 16);
                        int var17 = class423.field5969[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field345 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field337.method2320((byte) 84) / 520L) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class423.field5969[var20 + 8];
                                }
                                var6 = var16;
                                var11++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(ILdu;Ldu;I)V", line = 326)
    public class23(int arg0, class373 arg1, class373 arg2, int arg3) {
        this.field345 = arg0;
        this.field339 = arg2;
        this.field337 = arg1;
        this.field340 = arg3;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(B)V", line = 177)
    public static void method173(byte arg0) {
        field344 = null;
        if (arg0 != 106) {
            field347 = 64;
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "([BIIIZ)Z", line = 189)
    private final boolean method174(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field338++;
        class373 var6 = this.field337;
        synchronized (this.field337) {
            try {
                int var7;
                if (arg4) {
                    if ((long) (arg1 * 6 + 6) > this.field339.method2320((byte) 78)) {
                        return false;
                    }
                    this.field339.method2316((long) (arg1 * 6), true);
                    this.field339.method2312(0, false, 6, class423.field5969);
                    var7 = (class423.field5969[5] & 0xFF) + (class423.field5969[3] & 0xFF << 16) + (class423.field5969[4] & 0xFF << 8);
                    if (var7 <= 0 || ((long) var7) > (this.field337.method2320((byte) 78) / 520L)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field337.method2320((byte) 126) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class423.field5969[5] = (byte) var7;
                class423.field5969[2] = (byte) arg2;
                class423.field5969[3] = (byte) (var7 >> 16);
                class423.field5969[4] = (byte) (var7 >> 8);
                class423.field5969[0] = (byte) (arg2 >> 16);
                class423.field5969[1] = (byte) (arg2 >> 8);
                this.field339.method2316((long) (arg1 * 6), true);
                this.field339.method2318(6, class423.field5969, (byte) -84, 0);
                if (arg3 != 2029192112) {
                    return true;
                }
                int var11 = 0;
                int var12 = 0;
                while (arg2 > var11) {
                    int var13 = 0;
                    if (arg4) {
                        label110: {
                            this.field337.method2316((long) (var7 * 520), true);
                            try {
                                this.field337.method2312(0, false, 8, class423.field5969);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = ((class423.field5969[0] & 0xFF) << 8) + (class423.field5969[1] & 0xFF);
                            var13 = ((class423.field5969[5] & 0xFF) << 8) + ((class423.field5969[4] & 0xFF << 16) + (class423.field5969[6] & 0xFF));
                            int var15 = ((class423.field5969[2] & 0xFF) << 8) + (class423.field5969[3] & 0xFF);
                            int var16 = class423.field5969[7] & 0xFF;
                            if (arg1 == var14 && var12 == var15 && this.field345 == var16) {
                                if (var13 >= 0 && (long) var13 <= this.field337.method2320((byte) 114) / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg4 = false;
                        var13 = (int) ((this.field337.method2320((byte) 91) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    if (arg2 - var11 <= 512) {
                        var13 = 0;
                    }
                    class423.field5969[1] = (byte) arg1;
                    class423.field5969[0] = (byte) (arg1 >> 8);
                    class423.field5969[2] = (byte) (var12 >> 8);
                    class423.field5969[3] = (byte) var12;
                    class423.field5969[5] = (byte) (var13 >> 8);
                    class423.field5969[6] = (byte) var13;
                    class423.field5969[7] = (byte) this.field345;
                    class423.field5969[4] = (byte) (var13 >> 16);
                    this.field337.method2316((long) (var7 * 520), true);
                    this.field337.method2318(8, class423.field5969, (byte) 45, 0);
                    int var19 = arg2 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field337.method2318(var19, arg0, (byte) 105, var11);
                    var12++;
                    var7 = var13;
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }
}
