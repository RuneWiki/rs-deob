import java.awt.Component;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class59 {

    @OriginalMember(owner = "client!r", name = "b", descriptor = "Lbg;")
    private class168 field1068 = null;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    private int field1072 = 65000;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "Lbg;")
    private class168 field1078 = null;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    private int field1080;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "[S")
    public static short[] field1069 = new short[256];

    @OriginalMember(owner = "client!r", name = "d", descriptor = "Le;")
    public static class191 field1070 = class54.method368(":", 2047);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "[[[B")
    public static byte[][][] field1075;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IZI[Lai;I[B)V")
    public static final void method393(int arg0, boolean arg1, int arg2, class220[] arg3, int arg4, byte[] arg5) {
        field1077++;
        if (arg0 > -35) {
            return;
        }
        class225 var6 = new class225(arg5);
        int var7 = -1;
        while (true) {
            int var8 = var6.method1564((byte) 112);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1577(false);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = var6.method1580(-56);
                int var14 = var9 >> 6 & 0x3F;
                int var15 = arg4 + var14;
                int var16 = var13 >> 2;
                int var17 = var13 & 0x3;
                int var18 = var11 + arg2;
                if (var15 > 0 && var18 > 0 && var15 < 103 && var18 < 103) {
                    class220 var19 = null;
                    if (!arg1) {
                        int var20 = var12;
                        if ((class270.field4755[1][var15][var18] & 0x2) == 2) {
                            var20 = var12 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg3[var20];
                        }
                    }
                    class228.method1630(var12, var18, var12, 91, arg1, var15, var17, var19, !arg1, var7, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z[B)Lcg;")
    public static final class44 method394(boolean arg0, byte[] arg1) {
        field1073++;
        if (arg1 == null) {
            return null;
        }
        class195 var2 = new class195(arg1, class253.field4489, class245.field4360, class68.field1183, class47.field842, class161.field2731);
        if (arg0) {
            return null;
        } else {
            class228.method1628((byte) 0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public static final void method395(byte arg0) {
        field1074++;
        for (int var1 = 0; var1 < class197.field3514; var1++) {
            int var3 = class256.field4542[var1];
            class156 var4 = class115.field1901[var3];
            if (var4 != null) {
                class133.method897(var4.field2663.field3208, 0, var4);
            }
        }
        int var2 = 41 / ((64 - arg0) / 38);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([BIII)Z")
    public final boolean method396(byte[] arg0, int arg1, int arg2, int arg3) {
        field1071++;
        class168 var5 = this.field1068;
        synchronized (this.field1068) {
            if (arg1 < 0 || arg1 > this.field1072) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method397(arg2, false, true, arg1, arg0);
            if (!var6) {
                var6 = this.method397(arg2, false, false, arg1, arg0);
            }
            if (arg3 != 13636) {
                this.method397(-47, true, true, -82, (byte[]) null);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IZZI[B)Z")
    private final boolean method397(int arg0, boolean arg1, boolean arg2, int arg3, byte[] arg4) {
        field1067++;
        class168 var6 = this.field1068;
        synchronized (this.field1068) {
            try {
                if (arg1) {
                    return false;
                }
                int var9;
                if (arg2) {
                    if ((long) (arg0 * 6 + 6) > this.field1078.method1138(120)) {
                        return false;
                    }
                    this.field1078.method1132((long) (arg0 * 6), (byte) 69);
                    this.field1078.method1139(6, class167.field2817, 80, 0);
                    var9 = (class167.field2817[3] & 0xFF << 16) + (class167.field2817[5] & 0xFF) + (class167.field2817[4] & 0xFF << 8);
                    if (var9 <= 0 || this.field1068.method1138(107) / 520L < (long) var9) {
                        return false;
                    }
                } else {
                    var9 = (int) ((this.field1068.method1138(111) + 519L) / 520L);
                    if (var9 == 0) {
                        var9 = 1;
                    }
                }
                class167.field2817[0] = (byte) (arg3 >> 16);
                class167.field2817[3] = (byte) (var9 >> 16);
                class167.field2817[4] = (byte) (var9 >> 8);
                class167.field2817[1] = (byte) (arg3 >> 8);
                class167.field2817[5] = (byte) var9;
                class167.field2817[2] = (byte) arg3;
                int var11 = 0;
                int var12 = 0;
                this.field1078.method1132((long) (arg0 * 6), (byte) 78);
                this.field1078.method1140((byte) -86, 0, class167.field2817, 6);
                while (arg3 > var11) {
                    int var13 = 0;
                    if (arg2) {
                        label111: {
                            this.field1068.method1132((long) (var9 * 520), (byte) 90);
                            try {
                                this.field1068.method1139(8, class167.field2817, -76, 0);
                            } catch (EOFException var36) {
                                return true;
                            }
                            var13 = (class167.field2817[5] & 0xFF << 8) + ((class167.field2817[4] & 0xFF) << 16) + (class167.field2817[6] & 0xFF);
                            int var14 = (class167.field2817[0] & 0xFF << 8) + (class167.field2817[1] & 0xFF);
                            int var15 = ((class167.field2817[2] & 0xFF) << 8) + (class167.field2817[3] & 0xFF);
                            int var16 = class167.field2817[7] & 0xFF;
                            if (arg0 == var14 && var12 == var15 && this.field1080 == var16) {
                                if (var13 >= 0 && (long) var13 <= this.field1068.method1138(90) / 520L) {
                                    break label111;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field1068.method1138(99) + 519L) / 520L);
                        arg2 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var9 == var13) {
                            var13++;
                        }
                    }
                    class167.field2817[7] = (byte) this.field1080;
                    if ((arg3 - var11) <= 512) {
                        var13 = 0;
                    }
                    class167.field2817[5] = (byte) (var13 >> 8);
                    int var19 = arg3 - var11;
                    class167.field2817[6] = (byte) var13;
                    class167.field2817[1] = (byte) arg0;
                    class167.field2817[3] = (byte) var12;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    class167.field2817[4] = (byte) (var13 >> 16);
                    class167.field2817[0] = (byte) (arg0 >> 8);
                    class167.field2817[2] = (byte) (var12 >> 8);
                    var12++;
                    this.field1068.method1132((long) (var9 * 520), (byte) 126);
                    this.field1068.method1140((byte) -107, 0, class167.field2817, 8);
                    var9 = var13;
                    this.field1068.method1140((byte) -89, var11, arg4, var19);
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
    public static void method398(byte arg0) {
        field1070 = null;
        field1069 = null;
        field1075 = null;
        if (arg0 != 30) {
            field1069 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1081++;
        return "Cache:" + this.field1080;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method399(int arg0, Component arg1) {
        arg1.removeKeyListener(class229.field4119);
        arg1.removeFocusListener(class229.field4119);
        field1076++;
        class196.field3504 = -1;
        if (arg0 <= 87) {
            method395((byte) 1);
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(ILbg;Lbg;I)V")
    public class59(int arg0, class168 arg1, class168 arg2, int arg3) {
        this.field1080 = arg0;
        this.field1072 = arg3;
        this.field1078 = arg2;
        this.field1068 = arg1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZI)[B")
    public final byte[] method400(boolean arg0, int arg1) {
        field1079++;
        class168 var3 = this.field1068;
        synchronized (this.field1068) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field1078.method1138(92)) {
                    return null;
                }
                this.field1078.method1132((long) (arg1 * 6), (byte) 123);
                this.field1078.method1139(6, class167.field2817, -122, 0);
                int var5 = (class167.field2817[5] & 0xFF) + ((class167.field2817[3] & 0xFF << 16) + (class167.field2817[4] & 0xFF << 8));
                int var6 = ((class167.field2817[0] & 0xFF) << 16) + ((class167.field2817[1] & 0xFF) << 8) + (class167.field2817[2] & 0xFF);
                if (arg0) {
                    return null;
                } else if (var6 < 0 || var6 > this.field1072) {
                    return null;
                } else if (var5 > 0 && this.field1068.method1138(123) / 520L >= (long) var5) {
                    byte[] var10 = new byte[var6];
                    int var11 = 0;
                    int var12 = 0;
                    label74: while (var6 > var11) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field1068.method1132((long) (var5 * 520), (byte) 111);
                        int var14 = var6 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field1068.method1139(var14 + 8, class167.field2817, -45, 0);
                        int var15 = ((class167.field2817[2] & 0xFF) << 8) + (class167.field2817[3] & 0xFF);
                        int var16 = (class167.field2817[6] & 0xFF) + ((class167.field2817[4] & 0xFF) << 16) + (class167.field2817[5] & 0xFF << 8);
                        int var17 = class167.field2817[7] & 0xFF;
                        int var18 = (class167.field2817[0] & 0xFF << 8) + (class167.field2817[1] & 0xFF);
                        if (arg1 == var18 && var12 == var15 && this.field1080 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field1068.method1138(102) / 520L) {
                                var12++;
                                var5 = var16;
                                int var21 = 0;
                                while (true) {
                                    if (var14 <= var21) {
                                        continue label74;
                                    }
                                    var10[var11++] = class167.field2817[var21 + 8];
                                    var21++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }
}
