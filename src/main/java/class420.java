import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class420 {

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "Lwh;")
    private class90 field5865 = null;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    private int field5871 = 65000;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Lwh;")
    private class90 field5864 = null;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    private int field5873;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "[I")
    public static int[] field5870 = new int[250];

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field5872 = 0;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Lwf;")
    public static class79 field5862 = new class79(5, 2);

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field5874 = -2;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "Z")
    public static boolean field5875 = false;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method2466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5868++;
        if (arg8 >= 1 && arg0 >= 1 && class58.field758 - 2 >= arg8 && arg0 <= (class287.field4181 - 2)) {
            int var9 = arg1;
            if (arg1 < 3 && class28.method207(arg8, arg6 ^ 0xFFFFE334, arg0)) {
                var9 = arg1 + 1;
            }
            if (!class314.field4438.method1174((byte) -106, class437.field6083) && !class212.method1376(class42.field619, arg0, true, var9, arg8)) {
                return;
            }
            if (class330.field4786 == null) {
                return;
            }
            class184.field2718.method155(arg4, arg0, 17529, class422.field5918[arg1], arg8, arg1, class141.field1878);
            if (arg5 >= 0) {
                boolean var10 = class314.field4438.field5801;
                class314.field4438.field5801 = true;
                class184.field2718.method153(arg0, false, arg5, arg1, arg8, arg7, class141.field1878, var9, class422.field5918[arg1], arg3, arg2);
                class314.field4438.field5801 = var10;
            }
        }
        if (arg6 != 32512) {
            method2469((byte) -45);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[BII)Z")
    public final boolean method2467(int arg0, byte[] arg1, int arg2, int arg3) {
        field5866++;
        class90 var5 = this.field5864;
        synchronized (this.field5864) {
            if (arg0 < 0 || this.field5871 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2470(arg0, arg1, (byte) 121, true, arg3);
            if (!var6) {
                var6 = this.method2470(arg0, arg1, (byte) 121, false, arg3);
            }
            if (arg2 != 24704) {
                this.field5865 = null;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)[B")
    public final byte[] method2468(int arg0, int arg1) {
        field5863++;
        class90 var3 = this.field5864;
        synchronized (this.field5864) {
            try {
                if (this.field5865.method507(true) < ((long) (arg1 * 6 + 6))) {
                    return null;
                }
                this.field5865.method506((byte) 107, (long) (arg1 * 6));
                this.field5865.method513(6, arg0 ^ 0xFFFFA7E3, 0, class435.field6060);
                if (arg0 != 21574) {
                    this.method2468(-33, -9);
                }
                int var5 = ((class435.field6060[1] & 0xFF) << 8) + (((class435.field6060[0] & 0xFF) << 16) + (class435.field6060[2] & 0xFF));
                int var6 = ((class435.field6060[4] & 0xFF) << 8) + ((class435.field6060[3] & 0xFF) << 16) + (class435.field6060[5] & 0xFF);
                if (var5 < 0 || var5 > this.field5871) {
                    return null;
                } else if (var6 > 0 && this.field5864.method507(true) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field5864.method506((byte) 72, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field5864.method513(var13 + 8, -3163, 0, class435.field6060);
                        int var14 = ((class435.field6060[0] & 0xFF) << 8) + (class435.field6060[1] & 0xFF);
                        int var15 = ((class435.field6060[2] & 0xFF) << 8) + (class435.field6060[3] & 0xFF);
                        int var16 = (class435.field6060[6] & 0xFF) + (((class435.field6060[4] & 0xFF) << 16) + ((class435.field6060[5] & 0xFF) << 8));
                        int var17 = class435.field6060[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field5873 == var17) {
                            if (var16 >= 0 && ((long) var16) <= (this.field5864.method507(true) / 520L)) {
                                var6 = var16;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class435.field6060[var20 + 8];
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

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public static void method2469(byte arg0) {
        field5870 = null;
        field5862 = null;
        if (arg0 < 65) {
            method2469((byte) -67);
        }
    }

    @OriginalMember(owner = "client!rg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5869++;
        return "Cache:" + this.field5873;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[BBZI)Z")
    private final boolean method2470(int arg0, byte[] arg1, byte arg2, boolean arg3, int arg4) {
        field5867++;
        class90 var6 = this.field5864;
        synchronized (this.field5864) {
            try {
                int var8;
                if (arg3) {
                    if ((long) (arg4 * 6 + 6) > this.field5865.method507(true)) {
                        return false;
                    }
                    this.field5865.method506((byte) -43, (long) (arg4 * 6));
                    this.field5865.method513(6, arg2 ^ 0xFFFFF3DC, 0, class435.field6060);
                    var8 = (class435.field6060[5] & 0xFF) + (class435.field6060[4] & 0xFF << 8) + (class435.field6060[3] & 0xFF << 16);
                    if (var8 <= 0 || this.field5864.method507(true) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field5864.method507(true) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class435.field6060[4] = (byte) (var8 >> 8);
                class435.field6060[1] = (byte) (arg0 >> 8);
                class435.field6060[3] = (byte) (var8 >> 16);
                class435.field6060[2] = (byte) arg0;
                if (arg2 != 121) {
                    method2469((byte) 7);
                }
                class435.field6060[0] = (byte) (arg0 >> 16);
                class435.field6060[5] = (byte) var8;
                this.field5865.method506((byte) 108, (long) (arg4 * 6));
                this.field5865.method509(6, class435.field6060, -30916, 0);
                int var10 = 0;
                int var11 = 0;
                while (var10 < arg0) {
                    int var12 = 0;
                    if (arg3) {
                        label108: {
                            this.field5864.method506((byte) -36, (long) (var8 * 520));
                            try {
                                this.field5864.method513(8, arg2 - 3284, 0, class435.field6060);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class435.field6060[0] & 0xFF << 8) + (class435.field6060[1] & 0xFF);
                            int var14 = ((class435.field6060[2] & 0xFF) << 8) + (class435.field6060[3] & 0xFF);
                            var12 = ((class435.field6060[4] & 0xFF) << 16) + ((class435.field6060[5] & 0xFF) << 8) + (class435.field6060[6] & 0xFF);
                            int var15 = class435.field6060[7] & 0xFF;
                            if (arg4 == var13 && var11 == var14 && this.field5873 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field5864.method507(true) / 520L) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field5864.method507(true) + 519L) / 520L);
                        arg3 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    if ((arg0 - var10) <= 512) {
                        var12 = 0;
                    }
                    class435.field6060[2] = (byte) (var11 >> 8);
                    class435.field6060[1] = (byte) arg4;
                    class435.field6060[0] = (byte) (arg4 >> 8);
                    class435.field6060[3] = (byte) var11;
                    class435.field6060[6] = (byte) var12;
                    class435.field6060[4] = (byte) (var12 >> 16);
                    class435.field6060[5] = (byte) (var12 >> 8);
                    class435.field6060[7] = (byte) this.field5873;
                    this.field5864.method506((byte) -64, (long) (var8 * 520));
                    this.field5864.method509(8, class435.field6060, -30916, 0);
                    int var18 = arg0 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field5864.method509(var18, arg1, -30916, var10);
                    var11++;
                    var8 = var12;
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(ILwh;Lwh;I)V")
    public class420(int arg0, class90 arg1, class90 arg2, int arg3) {
        this.field5871 = arg3;
        this.field5873 = arg0;
        this.field5865 = arg2;
        this.field5864 = arg1;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method2471(int arg0, long arg1) {
        field5861++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg0 != 6) {
                method2471(-114, -11L);
            }
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class62.field817[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    static {
        new class326("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
    }
}
