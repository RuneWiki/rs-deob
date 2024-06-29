import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class334 {

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "Ljt;")
    private class64 field4837 = null;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    private int field4848 = 65000;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Ljt;")
    private class64 field4839 = null;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    private int field4846;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "[I")
    public static int[] field4845 = new int[1];

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "Lwt;")
    public static class194 field4844 = new class194("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public static final void method2016(int arg0) {
        class144.field1865 = null;
        class225.field3181 = null;
        if (arg0 != 3) {
            field4845 = null;
        }
        field4841++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public static void method2017(byte arg0) {
        field4844 = null;
        int var1 = -8 % ((arg0 + 21) / 51);
        field4845 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZIIII)V")
    public static final void method2018(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 27714) {
            field4849++;
            if (class322.method1928(arg3, 7387)) {
                class376.method2279(arg1, arg0, arg2, class181.field2591[arg3], -1, (byte) 126);
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)[B")
    public final byte[] method2019(int arg0, int arg1) {
        field4847++;
        class64 var3 = this.field4837;
        synchronized (this.field4837) {
            try {
                if (((long) (arg1 * 6 + 6)) > this.field4839.method448(-912076561)) {
                    return null;
                }
                this.field4839.method445((long) (arg1 * 6), -85);
                this.field4839.method450(0, arg0 ^ 0x5058, class179.field2577, 6);
                int var5 = (class179.field2577[arg0] & 0xFF << 8) + (class179.field2577[0] & 0xFF << 16) + (class179.field2577[2] & 0xFF);
                int var6 = (class179.field2577[3] & 0xFF << 16) - (-((class179.field2577[4] & 0xFF) << 8) - (class179.field2577[5] & 0xFF));
                if (var5 < 0 || var5 > this.field4848) {
                    return null;
                } else if (var6 > 0 && ((long) var6) <= (this.field4837.method448(arg0 ^ 0xC9A2D0EE) / 520L)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field4837.method445((long) (var6 * 520), arg0 - 92);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field4837.method450(0, 20569, class179.field2577, var13 + 8);
                        int var14 = (class179.field2577[0] & 0xFF << 8) + (class179.field2577[1] & 0xFF);
                        int var15 = (class179.field2577[2] & 0xFF << 8) + (class179.field2577[3] & 0xFF);
                        int var16 = (class179.field2577[4] & 0xFF << 16) - (-(class179.field2577[5] & 0xFF << 8) - (class179.field2577[6] & 0xFF));
                        int var17 = class179.field2577[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field4846 == var17) {
                            if (var16 >= 0 && this.field4837.method448(-912076561) / 520L >= (long) var16) {
                                var11++;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class179.field2577[var20 + 8];
                                }
                                var6 = var16;
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

    @OriginalMember(owner = "client!ek", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4850++;
        return "Cache:" + this.field4846;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([BIIIZ)Z")
    private final boolean method2020(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 != 65280) {
            field4844 = null;
        }
        field4842++;
        class64 var6 = this.field4837;
        synchronized (this.field4837) {
            try {
                int var8;
                if (arg4) {
                    if (this.field4839.method448(-912076561) < ((long) (arg3 * 6 + 6))) {
                        return false;
                    }
                    this.field4839.method445((long) (arg3 * 6), -89);
                    this.field4839.method450(0, arg2 ^ 0xAF59, class179.field2577, 6);
                    var8 = ((class179.field2577[3] & 0xFF) << 16) + (class179.field2577[4] & 0xFF << 8) + (class179.field2577[5] & 0xFF);
                    if (var8 <= 0 || (this.field4837.method448(-912076561) / 520L) < ((long) var8)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field4837.method448(-912076561) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class179.field2577[1] = (byte) (arg1 >> 8);
                class179.field2577[2] = (byte) arg1;
                class179.field2577[4] = (byte) (var8 >> 8);
                class179.field2577[5] = (byte) var8;
                class179.field2577[0] = (byte) (arg1 >> 16);
                class179.field2577[3] = (byte) (var8 >> 16);
                this.field4839.method445((long) (arg3 * 6), arg2 ^ 0xFFFF008A);
                this.field4839.method453(6, class179.field2577, 31058, 0);
                int var10 = 0;
                int var11 = 0;
                while (arg1 > var10) {
                    int var12 = 0;
                    if (arg4) {
                        label109: {
                            this.field4837.method445((long) (var8 * 520), -62);
                            try {
                                this.field4837.method450(0, 20569, class179.field2577, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class179.field2577[0] & 0xFF) << 8) + (class179.field2577[1] & 0xFF);
                            int var14 = (class179.field2577[2] & 0xFF << 8) + (class179.field2577[3] & 0xFF);
                            var12 = (class179.field2577[5] & 0xFF << 8) + (class179.field2577[4] & 0xFF << 16) + (class179.field2577[6] & 0xFF);
                            int var15 = class179.field2577[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field4846 == var15) {
                                if (var12 >= 0 && (this.field4837.method448(arg2 - 912141841) / 520L) >= ((long) var12)) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg4 = false;
                        var12 = (int) ((this.field4837.method448(arg2 ^ 0xC9A22FEF) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class179.field2577[1] = (byte) arg3;
                    class179.field2577[0] = (byte) (arg3 >> 8);
                    if (arg1 - var10 <= 512) {
                        var12 = 0;
                    }
                    class179.field2577[2] = (byte) (var11 >> 8);
                    class179.field2577[3] = (byte) var11;
                    class179.field2577[5] = (byte) (var12 >> 8);
                    class179.field2577[4] = (byte) (var12 >> 16);
                    class179.field2577[6] = (byte) var12;
                    class179.field2577[7] = (byte) this.field4846;
                    this.field4837.method445((long) (var8 * 520), -95);
                    this.field4837.method453(8, class179.field2577, 31058, 0);
                    int var18 = arg1 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field4837.method453(var18, arg0, 31058, var10);
                    var8 = var12;
                    var10 += var18;
                    var11++;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIBI)V")
    public static final void method2021(int arg0, int arg1, byte arg2, int arg3) {
        field4838++;
        class121 var4 = class99.field1353[arg0][arg3];
        class250.method1572((byte) -79, arg1, var4 == null ? class335.field4865 : var4);
        int var5 = 123 % ((arg2 - 73) / 50);
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
    public static final void method2022(int arg0) {
        class234.field3288.method2217((byte) -111);
        field4840++;
        int var1 = class234.field3288.method2229(8, arg0 ^ 0xFFFFFFFC);
        if (class339.field4942 > var1) {
            for (int var2 = var1; var2 < class339.field4942; var2++) {
                class253.field3658[class45.field678++] = class263.field3749[var2];
            }
        }
        if (class339.field4942 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class339.field4942 = 0;
        if (arg0 != 3) {
            method2017((byte) 25);
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class263.field3749[var3];
            class139 var5 = class504.field7697[var4];
            int var6 = class234.field3288.method2229(1, -1);
            if (var6 == 0) {
                class263.field3749[class339.field4942++] = var4;
                var5.field4243 = class263.field3748;
            } else {
                int var7 = class234.field3288.method2229(2, -1);
                if (var7 == 0) {
                    class263.field3749[class339.field4942++] = var4;
                    var5.field4243 = class263.field3748;
                    class93.field1257[class389.field5771++] = var4;
                } else if (var7 == 1) {
                    class263.field3749[class339.field4942++] = var4;
                    var5.field4243 = class263.field3748;
                    int var8 = class234.field3288.method2229(3, -1);
                    var5.method882(9, 1, var8);
                    int var9 = class234.field3288.method2229(1, -1);
                    if (var9 == 1) {
                        class93.field1257[class389.field5771++] = var4;
                    }
                } else if (var7 == 2) {
                    class263.field3749[class339.field4942++] = var4;
                    var5.field4243 = class263.field3748;
                    if (class234.field3288.method2229(1, arg0 - 4) == 1) {
                        int var10 = class234.field3288.method2229(3, -1);
                        var5.method882(9, 2, var10);
                        int var11 = class234.field3288.method2229(3, arg0 - 4);
                        var5.method882(arg0 + 6, 2, var11);
                    } else {
                        int var12 = class234.field3288.method2229(3, -1);
                        var5.method882(9, 0, var12);
                    }
                    int var13 = class234.field3288.method2229(1, arg0 - 4);
                    if (var13 == 1) {
                        class93.field1257[class389.field5771++] = var4;
                    }
                } else if (var7 == 3) {
                    class253.field3658[class45.field678++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B[BII)Z")
    public final boolean method2023(byte arg0, byte[] arg1, int arg2, int arg3) {
        field4843++;
        class64 var5 = this.field4837;
        synchronized (this.field4837) {
            if (arg3 < 0 || this.field4848 < arg3) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2020(arg1, arg3, arg0 + 65354, arg2, true);
            if (arg0 == -74) {
                if (!var6) {
                    var6 = this.method2020(arg1, arg3, 65280, arg2, false);
                }
                return var6;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(ILjt;Ljt;I)V")
    public class334(int arg0, class64 arg1, class64 arg2, int arg3) {
        this.field4837 = arg1;
        this.field4839 = arg2;
        this.field4848 = arg3;
        this.field4846 = arg0;
    }
}
