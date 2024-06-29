import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class281 {

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Lr;")
    private class63 field4204 = null;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    private int field4205 = 65000;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "Lr;")
    private class63 field4208 = null;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    private int field4207;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "Lce;")
    public static class345 field4209 = new class345(64);

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4212 = "Please wait...";

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "[S")
    public static short[] field4215 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "J")
    public static long field4213 = 0L;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field4211 = 0;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "Ldp;")
    public static class174 field4218;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "Lqi;")
    public static class207 field4217;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[BII)Z", line = 3)
    public final boolean method1991(int arg0, byte[] arg1, int arg2, int arg3) {
        field4206++;
        if (arg0 >= -110) {
            return false;
        }
        class63 var5 = this.field4204;
        synchronized (this.field4204) {
            if (arg3 < 0 || arg3 > this.field4205) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1993(arg3, arg1, true, false, arg2);
            if (!var6) {
                var6 = this.method1993(arg3, arg1, false, false, arg2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BD)V", line = 31)
    public static final void method1992(byte arg0, double arg1) {
        if (arg0 < 22) {
            field4212 = null;
        }
        if (class242.field3532 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class257.field3725[var3] = var4 > 255 ? 255 : var4;
            }
            class242.field3532 = arg1;
        }
        field4214++;
    }

    @OriginalMember(owner = "client!uf", name = "toString", descriptor = "()Ljava/lang/String;", line = 58)
    public final String toString() {
        field4216++;
        return "Cache:" + this.field4207;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[BZZI)Z", line = 66)
    private final boolean method1993(int arg0, byte[] arg1, boolean arg2, boolean arg3, int arg4) {
        field4202++;
        class63 var6 = this.field4204;
        synchronized (this.field4204) {
            try {
                int var8;
                if (arg2) {
                    if (((long) (arg4 * 6 + 6)) > this.field4208.method489(255)) {
                        return false;
                    }
                    this.field4208.method482((long) (arg4 * 6), (byte) 33);
                    this.field4208.method487(29, 6, 0, class207.field3031);
                    var8 = (class207.field3031[5] & 0xFF) + (((class207.field3031[3] & 0xFF) << 16) + ((class207.field3031[4] & 0xFF) << 8));
                    if (var8 <= 0 || this.field4204.method489(255) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field4204.method489(255) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class207.field3031[2] = (byte) arg0;
                class207.field3031[4] = (byte) (var8 >> 8);
                class207.field3031[0] = (byte) (arg0 >> 16);
                class207.field3031[3] = (byte) (var8 >> 16);
                class207.field3031[5] = (byte) var8;
                class207.field3031[1] = (byte) (arg0 >> 8);
                this.field4208.method482((long) (arg4 * 6), (byte) 17);
                this.field4208.method484(class207.field3031, 6, 0, 64);
                if (arg3) {
                    return true;
                }
                int var11 = 0;
                int var12 = 0;
                while (var11 < arg0) {
                    int var13 = 0;
                    if (arg2) {
                        label110: {
                            this.field4204.method482((long) (var8 * 520), (byte) 127);
                            try {
                                this.field4204.method487(15, 8, 0, class207.field3031);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = (class207.field3031[0] & 0xFF << 8) + (class207.field3031[1] & 0xFF);
                            var13 = ((class207.field3031[5] & 0xFF) << 8) + (class207.field3031[4] & 0xFF << 16) + (class207.field3031[6] & 0xFF);
                            int var15 = (class207.field3031[2] & 0xFF << 8) + (class207.field3031[3] & 0xFF);
                            int var16 = class207.field3031[7] & 0xFF;
                            if (arg4 == var14 && var12 == var15 && this.field4207 == var16) {
                                if (var13 >= 0 && ((long) var13) <= (this.field4204.method489(255) / 520L)) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg2 = false;
                        var13 = (int) ((this.field4204.method489(255) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class207.field3031[1] = (byte) arg4;
                    class207.field3031[0] = (byte) (arg4 >> 8);
                    class207.field3031[2] = (byte) (var12 >> 8);
                    class207.field3031[3] = (byte) var12;
                    if ((arg0 - var11) <= 512) {
                        var13 = 0;
                    }
                    class207.field3031[7] = (byte) this.field4207;
                    class207.field3031[5] = (byte) (var13 >> 8);
                    class207.field3031[4] = (byte) (var13 >> 16);
                    class207.field3031[6] = (byte) var13;
                    this.field4204.method482((long) (var8 * 520), (byte) 64);
                    this.field4204.method484(class207.field3031, 8, 0, 64);
                    int var19 = arg0 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field4204.method484(arg1, var19, var11, 64);
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

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 188)
    public static void method1994(int arg0) {
        if (arg0 != -8923) {
            return;
        }
        field4209 = null;
        field4217 = null;
        field4212 = null;
        field4215 = null;
        field4218 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILec;I)Ljava/lang/String;", line = 208)
    public static final String method1995(int arg0, class37 arg1, int arg2) {
        field4201++;
        try {
            int var3 = arg1.method316((byte) 119);
            if (arg0 < var3) {
                var3 = arg0;
            }
            if (arg2 < 80) {
                method1996(31);
            }
            byte[] var4 = new byte[var3];
            arg1.field565 += class139.field2204.method949(var3, 0, false, arg1.field578, var4, arg1.field565);
            return class384.method2435(var3, var4, 0, 122);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(ILr;Lr;I)V", line = 381)
    public class281(int arg0, class63 arg1, class63 arg2, int arg3) {
        this.field4204 = arg1;
        this.field4205 = arg3;
        this.field4208 = arg2;
        this.field4207 = arg0;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V", line = 254)
    public static final void method1996(int arg0) {
        if (arg0 != -128) {
            return;
        }
        field4203++;
        if (class46.field750) {
            return;
        }
        if (class324.field4673) {
            class106.field1756 = (float) ((int) class106.field1756 - 65 & 0xFFFFFF80);
        } else {
            class278.field4183 += (-24.0F - class278.field4183) / 2.0F;
        }
        class46.field750 = true;
        class206.field3020 = true;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)[B", line = 283)
    public final byte[] method1997(int arg0, int arg1) {
        field4200++;
        class63 var3 = this.field4204;
        synchronized (this.field4204) {
            try {
                if (this.field4208.method489(255) < ((long) (arg1 * 6 + 6))) {
                    return null;
                }
                this.field4208.method482((long) (arg1 * 6), (byte) 71);
                this.field4208.method487(arg0 ^ 0x5770, 6, 0, class207.field3031);
                int var5 = (class207.field3031[0] & 0xFF << 16) + (class207.field3031[2] & 0xFF) + (class207.field3031[1] & 0xFF << 8);
                int var6 = (class207.field3031[3] & 0xFF << 16) - (-((class207.field3031[4] & 0xFF) << 8) - (class207.field3031[5] & 0xFF));
                if (var5 < 0 || var5 > this.field4205) {
                    return null;
                } else if (var6 > 0 && ((long) var6) <= (this.field4204.method489(255) / 520L)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    if (arg0 != 22359) {
                        return null;
                    }
                    int var12 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field4204.method482((long) (var6 * 520), (byte) 81);
                        int var14 = var5 - var10;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field4204.method487(39, var14 + 8, 0, class207.field3031);
                        int var15 = ((class207.field3031[0] & 0xFF) << 8) + (class207.field3031[1] & 0xFF);
                        int var16 = (class207.field3031[2] & 0xFF << 8) + (class207.field3031[3] & 0xFF);
                        int var17 = ((class207.field3031[4] & 0xFF) << 16) + (class207.field3031[5] & 0xFF << 8) + (class207.field3031[6] & 0xFF);
                        int var18 = class207.field3031[7] & 0xFF;
                        if (arg1 == var15 && var12 == var16 && this.field4207 == var18) {
                            if (var17 >= 0 && ((long) var17) <= (this.field4204.method489(arg0 - 22104) / 520L)) {
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var9[var10++] = class207.field3031[var21 + 8];
                                }
                                var6 = var17;
                                var12++;
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
}
