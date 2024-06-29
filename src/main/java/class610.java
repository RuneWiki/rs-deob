import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class610 {

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "Lln;")
    private class349 field8880 = null;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Lln;")
    private class349 field8876 = null;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    private int field8881 = 65000;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    private int field8878;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "Lfda;")
    public static class294 field8884 = new class294(3);

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "Lhga;")
    public static class158 field8886 = new class158();

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field8875;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field8877;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field8879;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field8883;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field8885;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZI[BII)Z")
    private final boolean method3502(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        field8882++;
        class349 var6 = this.field8880;
        synchronized (this.field8880) {
            try {
                int var7;
                if (arg0) {
                    if ((long) (arg4 * 6 + 6) > this.field8876.method2261((byte) -100)) {
                        return false;
                    }
                    this.field8876.method2260((byte) 14, (long) (arg4 * 6));
                    this.field8876.method2257(-1, class34.field971, 6, 0);
                    var7 = (class34.field971[5] & 0xFF) + ((class34.field971[3] & 0xFF << 16) + (class34.field971[4] & 0xFF << 8));
                    if (var7 <= 0 || ((long) var7) > (this.field8880.method2261((byte) -69) / 520L)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field8880.method2261((byte) -58) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class34.field971[arg1] = (byte) var7;
                class34.field971[2] = (byte) arg3;
                class34.field971[4] = (byte) (var7 >> 8);
                class34.field971[3] = (byte) (var7 >> 16);
                class34.field971[1] = (byte) (arg3 >> 8);
                class34.field971[0] = (byte) (arg3 >> 16);
                this.field8876.method2260((byte) -94, (long) (arg4 * 6));
                this.field8876.method2259(class34.field971, 0, 6, false);
                int var10 = 0;
                int var11 = 0;
                while (arg3 > var10) {
                    int var12 = 0;
                    if (arg0) {
                        label105: {
                            this.field8880.method2260((byte) 108, (long) (var7 * 520));
                            try {
                                this.field8880.method2257(arg1 ^ 0xFFFFFFFA, class34.field971, 8, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class34.field971[0] & 0xFF) << 8) + (class34.field971[1] & 0xFF);
                            int var14 = (class34.field971[2] & 0xFF << 8) + (class34.field971[3] & 0xFF);
                            var12 = ((class34.field971[4] & 0xFF) << 16) + (class34.field971[5] & 0xFF << 8) + (class34.field971[6] & 0xFF);
                            int var15 = class34.field971[7] & 0xFF;
                            if (arg4 == var13 && var11 == var14 && this.field8878 == var15) {
                                if (var12 >= 0 && this.field8880.method2261((byte) -99) / 520L >= (long) var12) {
                                    break label105;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg0 = false;
                        var12 = (int) ((this.field8880.method2261((byte) -56) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class34.field971[2] = (byte) (var11 >> 8);
                    class34.field971[3] = (byte) var11;
                    if ((arg3 - var10) <= 512) {
                        var12 = 0;
                    }
                    class34.field971[1] = (byte) arg4;
                    class34.field971[0] = (byte) (arg4 >> 8);
                    class34.field971[4] = (byte) (var12 >> 16);
                    class34.field971[6] = (byte) var12;
                    class34.field971[7] = (byte) this.field8878;
                    class34.field971[5] = (byte) (var12 >> 8);
                    this.field8880.method2260((byte) 77, (long) (var7 * 520));
                    this.field8880.method2259(class34.field971, 0, 8, false);
                    int var18 = arg3 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field8880.method2259(arg2, var10, var18, false);
                    var7 = var12;
                    var10 += var18;
                    var11++;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)[B")
    public final byte[] method3503(int arg0, int arg1) {
        field8877++;
        class349 var3 = this.field8880;
        synchronized (this.field8880) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field8876.method2261((byte) -116)) {
                    return null;
                }
                this.field8876.method2260((byte) 47, (long) (arg0 * 6));
                this.field8876.method2257(-1, class34.field971, 6, 0);
                int var5 = (class34.field971[0] & 0xFF << 16) + (class34.field971[1] & 0xFF << 8) + (class34.field971[2] & 0xFF);
                int var6 = (class34.field971[5] & 0xFF) + (class34.field971[4] & 0xFF << 8) + (class34.field971[3] & 0xFF << 16);
                if (var5 < 0 || this.field8881 < var5) {
                    return null;
                } else if (var6 > 0 && this.field8880.method2261((byte) -77) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    if (arg1 != -302126520) {
                        return null;
                    }
                    label74: while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field8880.method2260((byte) -95, (long) (var6 * 520));
                        int var14 = var5 - var10;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field8880.method2257(-1, class34.field971, var14 + 8, 0);
                        int var15 = ((class34.field971[0] & 0xFF) << 8) + (class34.field971[1] & 0xFF);
                        int var16 = ((class34.field971[2] & 0xFF) << 8) + (class34.field971[3] & 0xFF);
                        int var17 = (class34.field971[6] & 0xFF) + (class34.field971[5] & 0xFF << 8) + (class34.field971[4] & 0xFF << 16);
                        int var18 = class34.field971[7] & 0xFF;
                        if (arg0 == var15 && var11 == var16 && this.field8878 == var18) {
                            if (var17 >= 0 && ((long) var17) <= (this.field8880.method2261((byte) -110) / 520L)) {
                                var6 = var17;
                                var11++;
                                int var21 = 0;
                                while (true) {
                                    if (var14 <= var21) {
                                        continue label74;
                                    }
                                    var9[var10++] = class34.field971[var21 + 8];
                                    var21++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public static void method3504(int arg0) {
        int var1 = 76 / ((10 - arg0) / 55);
        field8884 = null;
        field8886 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([BIII)Z")
    public final boolean method3505(byte[] arg0, int arg1, int arg2, int arg3) {
        field8885++;
        class349 var5 = this.field8880;
        synchronized (this.field8880) {
            if (arg2 > -36) {
                return false;
            } else if (arg1 >= 0 && this.field8881 >= arg1) {
                boolean var7 = this.method3502(true, 5, arg0, arg1, arg3);
                if (!var7) {
                    var7 = this.method3502(false, 5, arg0, arg1, arg3);
                }
                return var7;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8883++;
        return "Cache:" + this.field8878;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(ILln;Lln;I)V")
    public class610(int arg0, class349 arg1, class349 arg2, int arg3) {
        this.field8880 = arg1;
        this.field8881 = arg3;
        this.field8876 = arg2;
        this.field8878 = arg0;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)V")
    public static final void method3506(int arg0, int arg1) {
        class486.field6961 = 0;
        class540.field7540 = arg1;
        class577.field8380 = 1;
        field8875++;
        class47.field1136 = null;
        if (arg0 != 15995) {
            method3506(-111, 52);
        }
        class71.field1489 = -1;
        class339.field5051 = false;
        class585.field8450 = -1;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BIII)I")
    public static final int method3507(byte arg0, int arg1, int arg2, int arg3) {
        field8879++;
        if (arg0 != 62) {
            return -36;
        }
        if (arg2 > 243) {
            arg3 >>= 0x4;
        } else if (arg2 > 217) {
            arg3 >>= 0x3;
        } else if (arg2 > 192) {
            arg3 >>= 0x2;
        } else if (arg2 > 179) {
            arg3 >>= 0x1;
        }
        return (arg3 >> 5 << 7) + ((arg1 & 0xFF) >> 2 << 10) + (arg2 >> 1);
    }
}
