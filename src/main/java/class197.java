import java.awt.Canvas;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class197 {

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Lge;")
    private class423 field2729 = null;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Lge;")
    private class423 field2733 = null;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    private int field2736 = 65000;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    private int field2727;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Lng;")
    public static class190 field2735 = new class190(200);

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "[I")
    public static int[] field2737 = new int[3];

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "[I")
    public static int[] field2738 = new int[128];

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "[Llf;")
    public static class130[] field2730;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1317(int arg0, int arg1) {
        class35.field545 = -1;
        if (arg0 == 37) {
            class42.field629 = 3.0F;
        } else if (arg0 == 50) {
            class42.field629 = 4.0F;
        } else if (arg0 == 75) {
            class42.field629 = 6.0F;
        } else if (arg0 == 100) {
            class42.field629 = 8.0F;
        } else if (arg0 == 200) {
            class42.field629 = 16.0F;
        }
        field2724++;
        if (arg1 == 29000) {
            class35.field545 = -1;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZIB)V", line = 35)
    public static final void method1318(boolean arg0, int arg1, byte arg2) {
        class390.field5738 = new int[class267.field3646];
        class166.field2368 = new int[class267.field3646];
        field2732++;
        if (!arg0) {
            class446.field6435 = null;
        }
        if (arg2 != -60) {
            return;
        }
        class310.field4243 = new int[class267.field3646];
        class289.field4000 = new int[5];
        class68.field1065 = new byte[arg1][class432.field6220][class267.field3646];
        class180.field2518 = 99;
        class399.field5841 = new byte[arg1][class432.field6220][class267.field3646];
        class140.field2006 = new byte[arg1][class432.field6220][class267.field3646];
        class267.field3651 = new byte[arg1][class432.field6220 + 1][class267.field3646 + 1];
        class418.field6051 = new int[arg1][class432.field6220 + 1][class267.field3646 + 1];
        class361.field5069 = new byte[arg1][class432.field6220][class267.field3646];
        class429.field6174 = new int[class267.field3646];
        class346.field4844 = new int[class267.field3646];
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[BIIZ)Z", line = 65)
    private final boolean method1319(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        field2726++;
        class423 var6 = this.field2733;
        synchronized (this.field2733) {
            try {
                int var8;
                if (arg4) {
                    if ((long) (arg2 * 6 + 6) > this.field2729.method2668(-6452)) {
                        return false;
                    }
                    this.field2729.method2666((long) (arg2 * 6), 0);
                    this.field2729.method2667(class10.field148, -1, 6, 0);
                    var8 = (class10.field148[5] & 0xFF) + ((class10.field148[4] & 0xFF) << 8) + (class10.field148[3] & 0xFF << 16);
                    if (var8 <= 0 || this.field2733.method2668(arg3 - 6489) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field2733.method2668(-6452) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class10.field148[3] = (byte) (var8 >> 16);
                class10.field148[5] = (byte) var8;
                class10.field148[4] = (byte) (var8 >> 8);
                class10.field148[0] = (byte) (arg0 >> 16);
                if (arg3 != 37) {
                    this.field2727 = 94;
                }
                class10.field148[2] = (byte) arg0;
                class10.field148[1] = (byte) (arg0 >> 8);
                this.field2729.method2666((long) (arg2 * 6), 0);
                this.field2729.method2665((byte) -83, class10.field148, 0, 6);
                int var10 = 0;
                int var11 = 0;
                while (var10 < arg0) {
                    int var12 = 0;
                    if (arg4) {
                        label108: {
                            this.field2733.method2666((long) (var8 * 520), 0);
                            try {
                                this.field2733.method2667(class10.field148, -1, 8, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class10.field148[0] & 0xFF << 8) + (class10.field148[1] & 0xFF);
                            var12 = ((class10.field148[5] & 0xFF) << 8) + ((class10.field148[4] & 0xFF) << 16) + (class10.field148[6] & 0xFF);
                            int var14 = (class10.field148[2] & 0xFF << 8) + (class10.field148[3] & 0xFF);
                            int var15 = class10.field148[7] & 0xFF;
                            if (arg2 == var13 && var11 == var14 && this.field2727 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field2733.method2668(-6452) / 520L) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg4 = false;
                        var12 = (int) ((this.field2733.method2668(-6452) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    if (arg0 - var10 <= 512) {
                        var12 = 0;
                    }
                    class10.field148[0] = (byte) (arg2 >> 8);
                    class10.field148[2] = (byte) (var11 >> 8);
                    class10.field148[3] = (byte) var11;
                    class10.field148[1] = (byte) arg2;
                    class10.field148[5] = (byte) (var12 >> 8);
                    class10.field148[4] = (byte) (var12 >> 16);
                    class10.field148[6] = (byte) var12;
                    class10.field148[7] = (byte) this.field2727;
                    this.field2733.method2666((long) (var8 * 520), 0);
                    this.field2733.method2665((byte) 109, class10.field148, 0, 8);
                    int var18 = arg0 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field2733.method2665((byte) 113, arg1, var10, var18);
                    var10 += var18;
                    var11++;
                    var8 = var12;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[BII)Z", line = 191)
    public final boolean method1320(int arg0, byte[] arg1, int arg2, int arg3) {
        field2731++;
        class423 var5 = this.field2733;
        synchronized (this.field2733) {
            if (arg3 < 0 || arg3 > this.field2736) {
                throw new IllegalArgumentException();
            }
            if (arg0 != -16580) {
                this.field2729 = null;
            }
            boolean var6 = this.method1319(arg3, arg1, arg2, 37, true);
            if (!var6) {
                var6 = this.method1319(arg3, arg1, arg2, 37, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(ILge;Lge;I)V", line = 399)
    public class197(int arg0, class423 arg1, class423 arg2, int arg3) {
        this.field2727 = arg0;
        this.field2729 = arg2;
        this.field2736 = arg3;
        this.field2733 = arg1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)[B", line = 235)
    public final byte[] method1321(int arg0, byte arg1) {
        field2725++;
        class423 var3 = this.field2733;
        synchronized (this.field2733) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field2729.method2668(-6452)) {
                    return null;
                }
                this.field2729.method2666((long) (arg0 * 6), 0);
                this.field2729.method2667(class10.field148, -1, 6, 0);
                int var5 = (class10.field148[2] & 0xFF) + (((class10.field148[0] & 0xFF) << 16) + ((class10.field148[1] & 0xFF) << 8));
                int var6 = (class10.field148[3] & 0xFF << 16) - (-((class10.field148[4] & 0xFF) << 8) - (class10.field148[5] & 0xFF));
                if (var5 < 0 || this.field2736 < var5) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field2733.method2668(-6452) / 520L) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    if (arg1 < 76) {
                        return null;
                    }
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field2733.method2666((long) (var6 * 520), 0);
                        int var14 = var5 - var10;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field2733.method2667(class10.field148, -1, var14 + 8, 0);
                        int var15 = ((class10.field148[0] & 0xFF) << 8) + (class10.field148[1] & 0xFF);
                        int var16 = ((class10.field148[2] & 0xFF) << 8) + (class10.field148[3] & 0xFF);
                        int var17 = ((class10.field148[4] & 0xFF) << 16) - (-((class10.field148[5] & 0xFF) << 8) - (class10.field148[6] & 0xFF));
                        int var18 = class10.field148[7] & 0xFF;
                        if (arg0 == var15 && var11 == var16 && this.field2727 == var18) {
                            if (var17 >= 0 && this.field2733.method2668(-6452) / 520L >= (long) var17) {
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var9[var10++] = class10.field148[var21 + 8];
                                }
                                var6 = var17;
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
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "toString", descriptor = "()Ljava/lang/String;", line = 315)
    public final String toString() {
        field2734++;
        return "Cache:" + this.field2727;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V", line = 323)
    public static void method1322(byte arg0) {
        field2735 = null;
        int var1 = 71 % ((-arg0 - 26) / 35);
        field2738 = null;
        field2737 = null;
        field2730 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Laa;B)V", line = 342)
    public static final void method1323(class281 arg0, byte arg1) {
        field2728++;
        if (class171.field2443.method1309(16505) == 0) {
            return;
        }
        if (class16.field205 == 0 || class16.field205 == 2) {
            for (class72 var4 = (class72) class171.field2443.method1312((byte) 25); var4 != null; var4 = (class72) class171.field2443.method1304(arg1 ^ 0xFFFFFF88)) {
                class36.method262(false, var4.field1113, var4.field1107 ? class307.field4211.field4965 : null, var4.field1112, var4.field1115, false, var4.field1105, 36, arg0, var4.field1111, class403.field5875, arg0);
                var4.method2459(198);
            }
            class210.method1362(arg1 ^ 0x448A);
        } else {
            if (class182.field2543 == null) {
                Canvas var2 = new Canvas();
                var2.setSize(36, 32);
                class182.field2543 = class281.method1786(0, 0, var2, class204.field2772, (byte) 62, class65.field1027);
                class381.field5404 = class182.field2543.method1791(class349.method2234(class435.field6251, class153.field2163, true, 0), class18.method107(class353.field4943, class153.field2163, 0), true);
            }
            for (class72 var3 = (class72) class171.field2443.method1312((byte) 25); var3 != null; var3 = (class72) class171.field2443.method1304(arg1 ^ 0xFFFFFF9E)) {
                class36.method262(false, var3.field1113, var3.field1107 ? class307.field4211.field4965 : null, var3.field1112, var3.field1115, false, var3.field1105, 36, arg0, var3.field1111, class381.field5404, class182.field2543);
                var3.method2459(198);
            }
        }
        if (arg1 != 70) {
            method1322((byte) 85);
        }
    }
}
