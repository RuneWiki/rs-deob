import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class219 {

    @OriginalMember(owner = "client!oba", name = "h", descriptor = "Lbp;")
    private class323 field3138 = null;

    @OriginalMember(owner = "client!oba", name = "f", descriptor = "Lbp;")
    private class323 field3136 = null;

    @OriginalMember(owner = "client!oba", name = "j", descriptor = "I")
    private int field3140 = 65000;

    @OriginalMember(owner = "client!oba", name = "e", descriptor = "I")
    private int field3135;

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "[I")
    public static int[] field3133 = new int[4096];

    @OriginalMember(owner = "client!oba", name = "m", descriptor = "Z")
    public static boolean field3143;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!oba", name = "g", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!oba", name = "i", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!oba", name = "k", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!oba", name = "l", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "[[B")
    public static byte[][] field3132;

    @OriginalMember(owner = "client!oba", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3141++;
        return "Cache:" + this.field3135;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(I[BII)Z")
    public final boolean method1412(int arg0, byte[] arg1, int arg2, int arg3) {
        field3134++;
        class323 var5 = this.field3136;
        synchronized (this.field3136) {
            if (arg3 < 0 || this.field3140 < arg3) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1416(arg0, true, arg3, arg2 - 7324, arg1);
            if (arg2 == 520) {
                if (!var6) {
                    var6 = this.method1416(arg0, false, arg3, -6804, arg1);
                }
                return var6;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)[Lbi;")
    public static final class408[] method1413(int arg0) {
        field3139++;
        if (arg0 != 6) {
            field3132 = null;
        }
        return new class408[] { class267.field3751, class95.field1455, class512.field7211 };
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(II)[B")
    public final byte[] method1414(int arg0, int arg1) {
        field3137++;
        class323 var3 = this.field3136;
        synchronized (this.field3136) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field3138.method1999((byte) 1)) {
                    return null;
                }
                this.field3138.method2005(arg0 ^ arg0, (long) (arg1 * 6));
                this.field3138.method2002(class94.field1454, 6, 0, false);
                int var5 = (class94.field1454[2] & 0xFF) + ((class94.field1454[1] & 0xFF) << 8) + ((class94.field1454[0] & 0xFF) << 16);
                int var6 = (class94.field1454[5] & 0xFF) + ((class94.field1454[4] & 0xFF) << 8) + (class94.field1454[3] & 0xFF << 16);
                if (var5 < 0 || var5 > this.field3140) {
                    return null;
                } else if (var6 > 0 && ((long) var6) <= (this.field3136.method1999((byte) 1) / 520L)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3136.method2005(0, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3136.method2002(class94.field1454, var13 + 8, 0, false);
                        int var14 = ((class94.field1454[0] & 0xFF) << 8) + (class94.field1454[1] & 0xFF);
                        int var15 = (class94.field1454[2] & 0xFF << 8) + (class94.field1454[3] & 0xFF);
                        int var16 = (class94.field1454[6] & 0xFF) + ((class94.field1454[4] & 0xFF) << 16) + (class94.field1454[5] & 0xFF << 8);
                        int var17 = class94.field1454[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field3135 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field3136.method1999((byte) 1) / 520L) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class94.field1454[var20 + 8];
                                }
                                var11++;
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

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(B)V")
    public static void method1415(byte arg0) {
        int var1 = -25 % ((2 - arg0) / 38);
        field3133 = null;
        field3132 = null;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IZII[B)Z")
    private final boolean method1416(int arg0, boolean arg1, int arg2, int arg3, byte[] arg4) {
        field3142++;
        class323 var6 = this.field3136;
        synchronized (this.field3136) {
            try {
                int var8;
                if (arg1) {
                    if ((long) (arg0 * 6 + 6) > this.field3138.method1999((byte) 1)) {
                        return false;
                    }
                    this.field3138.method2005(arg3 ^ 0xFFFFE56C, (long) (arg0 * 6));
                    this.field3138.method2002(class94.field1454, 6, 0, false);
                    var8 = ((class94.field1454[3] & 0xFF) << 16) + ((class94.field1454[4] & 0xFF) << 8) + (class94.field1454[5] & 0xFF);
                    if (var8 <= 0 || (long) var8 > this.field3136.method1999((byte) 1) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field3136.method1999((byte) 1) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class94.field1454[1] = (byte) (arg2 >> 8);
                class94.field1454[2] = (byte) arg2;
                class94.field1454[0] = (byte) (arg2 >> 16);
                class94.field1454[4] = (byte) (var8 >> 8);
                class94.field1454[5] = (byte) var8;
                class94.field1454[3] = (byte) (var8 >> 16);
                this.field3138.method2005(0, (long) (arg0 * 6));
                this.field3138.method2007(false, class94.field1454, 6, 0);
                if (arg3 != -6804) {
                    field3132 = null;
                }
                int var10 = 0;
                int var11 = 0;
                while (arg2 > var10) {
                    int var12 = 0;
                    if (arg1) {
                        label108: {
                            this.field3136.method2005(0, (long) (var8 * 520));
                            try {
                                this.field3136.method2002(class94.field1454, 8, 0, false);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class94.field1454[0] & 0xFF << 8) + (class94.field1454[1] & 0xFF);
                            int var14 = ((class94.field1454[2] & 0xFF) << 8) + (class94.field1454[3] & 0xFF);
                            var12 = (class94.field1454[5] & 0xFF << 8) + (class94.field1454[4] & 0xFF << 16) + (class94.field1454[6] & 0xFF);
                            int var15 = class94.field1454[7] & 0xFF;
                            if (arg0 == var13 && var11 == var14 && this.field3135 == var15) {
                                if (var12 >= 0 && this.field3136.method1999((byte) 1) / 520L >= (long) var12) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field3136.method1999((byte) 1) + 519L) / 520L);
                        arg1 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    if (arg2 - var10 <= 512) {
                        var12 = 0;
                    }
                    class94.field1454[2] = (byte) (var11 >> 8);
                    class94.field1454[0] = (byte) (arg0 >> 8);
                    class94.field1454[3] = (byte) var11;
                    class94.field1454[1] = (byte) arg0;
                    class94.field1454[4] = (byte) (var12 >> 16);
                    class94.field1454[7] = (byte) this.field3135;
                    class94.field1454[5] = (byte) (var12 >> 8);
                    class94.field1454[6] = (byte) var12;
                    this.field3136.method2005(0, (long) (var8 * 520));
                    this.field3136.method2007(false, class94.field1454, 8, 0);
                    int var18 = arg2 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field3136.method2007(false, arg4, var18, var10);
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

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIZ[B)[B")
    public static final byte[] method1417(int arg0, int arg1, boolean arg2, byte[] arg3) {
        field3131++;
        byte[] var4;
        if (arg0 > 0) {
            var4 = new byte[arg1];
            for (int var5 = 0; var5 < arg1; var5++) {
                var4[var5] = arg3[arg0 + var5];
            }
        } else {
            var4 = arg3;
        }
        if (arg2) {
            return null;
        }
        class398 var6 = new class398();
        var6.method2379((byte) 120);
        var6.method2383((long) (arg1 * 8), var4, -82);
        byte[] var7 = new byte[64];
        var6.method2384(var7, 0, (byte) -19);
        return var7;
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(ILbp;Lbp;I)V")
    public class219(int arg0, class323 arg1, class323 arg2, int arg3) {
        this.field3136 = arg1;
        this.field3140 = arg3;
        this.field3135 = arg0;
        this.field3138 = arg2;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field3133[var0] = class124.method869(var0, 932841964);
        }
        field3143 = false;
    }
}
