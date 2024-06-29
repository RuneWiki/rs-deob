import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class117 {

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    private int field1425 = 65000;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Lrs;")
    private class392 field1429 = null;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Lrs;")
    private class392 field1423 = null;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    private int field1426;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Liq;")
    public static class362 field1428 = new class362("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Liq;")
    public static class362 field1431 = new class362("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "F")
    public static float field1433 = 0.0F;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZIB[BI)Z")
    private final boolean method721(boolean arg0, int arg1, byte arg2, byte[] arg3, int arg4) {
        field1422++;
        class392 var6 = this.field1429;
        synchronized (this.field1429) {
            try {
                int var8;
                if (arg0) {
                    if (((long) (arg4 * 6 + 6)) > this.field1423.method2496(-111)) {
                        return false;
                    }
                    this.field1423.method2502((long) (arg4 * 6), (byte) 123);
                    this.field1423.method2500(true, 6, class112.field1366, 0);
                    var8 = ((class112.field1366[4] & 0xFF) << 8) + ((class112.field1366[3] & 0xFF) << 16) + (class112.field1366[5] & 0xFF);
                    if (var8 <= 0 || (this.field1429.method2496(-98) / 520L) < ((long) var8)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field1429.method2496(arg2 ^ 0xFFFFFFD0) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class112.field1366[2] = (byte) arg1;
                class112.field1366[5] = (byte) var8;
                class112.field1366[3] = (byte) (var8 >> 16);
                class112.field1366[4] = (byte) (var8 >> 8);
                class112.field1366[1] = (byte) (arg1 >> 8);
                class112.field1366[0] = (byte) (arg1 >> 16);
                this.field1423.method2502((long) (arg4 * 6), (byte) 108);
                this.field1423.method2499(false, class112.field1366, 6, 0);
                if (arg2 != 113) {
                    return true;
                }
                int var11 = 0;
                int var12 = 0;
                while (var11 < arg1) {
                    int var13 = 0;
                    if (arg0) {
                        label110: {
                            this.field1429.method2502((long) (var8 * 520), (byte) 70);
                            try {
                                this.field1429.method2500(true, 8, class112.field1366, 0);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = (class112.field1366[0] & 0xFF << 8) + (class112.field1366[1] & 0xFF);
                            var13 = ((class112.field1366[5] & 0xFF) << 8) + ((class112.field1366[4] & 0xFF) << 16) + (class112.field1366[6] & 0xFF);
                            int var15 = (class112.field1366[2] & 0xFF << 8) + (class112.field1366[3] & 0xFF);
                            int var16 = class112.field1366[7] & 0xFF;
                            if (arg4 == var14 && var12 == var15 && this.field1426 == var16) {
                                if (var13 >= 0 && ((long) var13) <= (this.field1429.method2496(-126) / 520L)) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field1429.method2496(-71) + 519L) / 520L);
                        arg0 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class112.field1366[1] = (byte) arg4;
                    class112.field1366[0] = (byte) (arg4 >> 8);
                    class112.field1366[2] = (byte) (var12 >> 8);
                    if (arg1 - var11 <= 512) {
                        var13 = 0;
                    }
                    class112.field1366[3] = (byte) var12;
                    class112.field1366[5] = (byte) (var13 >> 8);
                    class112.field1366[7] = (byte) this.field1426;
                    class112.field1366[6] = (byte) var13;
                    class112.field1366[4] = (byte) (var13 >> 16);
                    this.field1429.method2502((long) (var8 * 520), (byte) 121);
                    this.field1429.method2499(false, class112.field1366, 8, 0);
                    int var19 = arg1 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field1429.method2499(false, arg3, var19, var11);
                    var12++;
                    var8 = var13;
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BC)Z")
    public static final boolean method722(byte arg0, char arg1) {
        field1430++;
        if (Character.isISOControl(arg1)) {
            return false;
        }
        if (arg0 != 36) {
            method725(8, 113, 98, -34, -53);
        }
        if (class245.method1665(arg1, 127)) {
            return true;
        }
        char[] var2 = class210.field2978;
        for (int var3 = 0; var3 < var2.length; var3++) {
            char var7 = var2[var3];
            if (arg1 == var7) {
                return true;
            }
        }
        char[] var4 = class233.field3274;
        for (int var5 = 0; var5 < var4.length; var5++) {
            char var6 = var4[var5];
            if (arg1 == var6) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([I[Ljava/lang/Object;I)V")
    public static final void method723(int[] arg0, Object[] arg1, int arg2) {
        field1419++;
        if (arg2 >= -32) {
            field1431 = null;
        }
        class377.method2436(arg0, 1, arg1, 0, arg0.length - 1);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III[B)Z")
    public final boolean method724(int arg0, int arg1, int arg2, byte[] arg3) {
        field1421++;
        class392 var5 = this.field1429;
        synchronized (this.field1429) {
            if (arg0 < ~arg1 || arg1 > this.field1425) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method721(true, arg1, (byte) 113, arg3, arg2);
            if (!var6) {
                var6 = this.method721(false, arg1, (byte) 113, arg3, arg2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
    public static final void method725(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 255) {
            return;
        }
        field1427++;
        if (class81.field946 <= arg1 && arg1 <= class235.field3295) {
            int var5 = class130.method805(true, class219.field3080, arg0, class388.field5464);
            int var6 = class130.method805(true, class219.field3080, arg3, class388.field5464);
            class341.method2191(arg1, true, arg4, var5, var6);
        }
    }

    @OriginalMember(owner = "client!gb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1420++;
        return "Cache:" + this.field1426;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIZ)V")
    public static final void method726(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field1431 = null;
        }
        class113.field1395 = arg0 - class308.field4367;
        field1432++;
        class401.field5727 = arg1 - class308.field4368;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method727(int arg0) {
        int var1 = -86 / ((-arg0 - 30) / 44);
        field1431 = null;
        field1428 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)[B")
    public final byte[] method728(byte arg0, int arg1) {
        field1424++;
        class392 var3 = this.field1429;
        synchronized (this.field1429) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field1423.method2496(-92)) {
                    return null;
                }
                this.field1423.method2502((long) (arg1 * 6), (byte) 75);
                this.field1423.method2500(true, 6, class112.field1366, 0);
                int var5 = (class112.field1366[0] & 0xFF << 16) + (class112.field1366[2] & 0xFF) + (class112.field1366[1] & 0xFF << 8);
                int var6 = (class112.field1366[5] & 0xFF) + ((class112.field1366[3] & 0xFF) << 16) + (class112.field1366[4] & 0xFF << 8);
                if (var5 < 0 || this.field1425 < var5) {
                    return null;
                } else if (var6 > 0 && this.field1429.method2496(-126) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    if (arg0 >= -97) {
                        method722((byte) -63, (char) 65429);
                    }
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field1429.method2502((long) (var6 * 520), (byte) 119);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field1429.method2500(true, var13 + 8, class112.field1366, 0);
                        int var14 = (class112.field1366[0] & 0xFF << 8) + (class112.field1366[1] & 0xFF);
                        int var15 = (class112.field1366[2] & 0xFF << 8) + (class112.field1366[3] & 0xFF);
                        int var16 = (class112.field1366[6] & 0xFF) + ((class112.field1366[4] & 0xFF) << 16) + ((class112.field1366[5] & 0xFF) << 8);
                        int var17 = class112.field1366[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field1426 == var17) {
                            if (var16 >= 0 && (this.field1429.method2496(-101) / 520L) >= ((long) var16)) {
                                var6 = var16;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class112.field1366[var20 + 8];
                                }
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

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(ILrs;Lrs;I)V")
    public class117(int arg0, class392 arg1, class392 arg2, int arg3) {
        this.field1429 = arg1;
        this.field1425 = arg3;
        this.field1426 = arg0;
        this.field1423 = arg2;
    }
}
