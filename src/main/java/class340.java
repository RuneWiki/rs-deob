import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class340 extends class170 {

    @OriginalMember(owner = "client!qea", name = "D", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field4385 = new VorbisInfo();

    @OriginalMember(owner = "client!qea", name = "u", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field4376 = new VorbisComment();

    @OriginalMember(owner = "client!qea", name = "F", descriptor = "Lmq;")
    public static class78 field4387 = new class78(57, 0);

    @OriginalMember(owner = "client!qea", name = "M", descriptor = "I")
    public static int field4394 = 50;

    @OriginalMember(owner = "client!qea", name = "K", descriptor = "[I")
    public static int[] field4392 = new int[field4394];

    @OriginalMember(owner = "client!qea", name = "P", descriptor = "[I")
    public static int[] field4397 = new int[field4394];

    @OriginalMember(owner = "client!qea", name = "S", descriptor = "[I")
    public static int[] field4399 = new int[field4394];

    @OriginalMember(owner = "client!qea", name = "I", descriptor = "[I")
    public static int[] field4390 = new int[field4394];

    @OriginalMember(owner = "client!qea", name = "O", descriptor = "[I")
    public static int[] field4396 = new int[field4394];

    @OriginalMember(owner = "client!qea", name = "V", descriptor = "[I")
    public static int[] field4402 = new int[field4394];

    @OriginalMember(owner = "client!qea", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field4401 = new String[field4394];

    @OriginalMember(owner = "client!qea", name = "z", descriptor = "D")
    private double field4381;

    @OriginalMember(owner = "client!qea", name = "t", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!qea", name = "v", descriptor = "I")
    private int field4377;

    @OriginalMember(owner = "client!qea", name = "w", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!qea", name = "x", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!qea", name = "B", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!qea", name = "E", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!qea", name = "G", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!qea", name = "H", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!qea", name = "T", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!qea", name = "A", descriptor = "Lcf;")
    private class146 field4382;

    @OriginalMember(owner = "client!qea", name = "y", descriptor = "Lwu;")
    private class161 field4380;

    @OriginalMember(owner = "client!qea", name = "C", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field4384;

    @OriginalMember(owner = "client!qea", name = "N", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field4395;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qea", name = "W", descriptor = "Ljava/lang/Class;")
    public static Class field4403;

    @OriginalMember(owner = "client!qea", name = "R", descriptor = "[I")
    public static int[] field4398;

    @OriginalMember(owner = "client!qea", name = "L", descriptor = "[Loq;")
    public static class218[] field4393;

    @OriginalMember(owner = "client!qea", name = "J", descriptor = "[[S")
    public static short[][] field4391;

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)I")
    public final int method1989(int arg0) {
        ++field4383;
        int var2 = 0 % ((arg0 - 31) / 56);
        return this.field4382 == null ? 0 : this.field4382.method917(0);
    }

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "(I)D")
    public final double method1990(int arg0) {
        if (arg0 != 0) {
            return 0.5217345894366513D;
        } else {
            ++field4379;
            double var2 = this.field4381;
            if (this.field4382 != null) {
                var2 = this.field4382.method912(false);
                if (var2 < 0.0D) {
                    var2 = this.field4381;
                }
            }
            return var2 - (double) (256.0F / (float) class554.field7780);
        }
    }

    @OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class340(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method1991(byte arg0, String arg1) {
        ++field4389;
        StringBuffer var2 = new StringBuffer();
        if (arg0 != -34) {
            return null;
        } else {
            int var3 = arg1.length();
            for (int var4 = 0; ~var3 < ~var4; ++var4) {
                char var5 = arg1.charAt(var4);
                if (var5 == '%' && var4 - -2 < var3) {
                    char var6 = arg1.charAt(var4 + 1);
                    boolean var7 = false;
                    int var8;
                    if (~var6 <= -49 && var6 <= '9') {
                        var8 = var6 + -48;
                    } else if (var6 >= 'a' && ~var6 >= -103) {
                        var8 = var6 + '\n' + -97;
                    } else {
                        if (var6 < 'A' || ~var6 < -71) {
                            var2.append('%');
                            continue;
                        }
                        var8 = var6 + '\n' - 65;
                    }
                    int var9 = var8 * 16;
                    char var10 = arg1.charAt(var4 + 2);
                    int var11;
                    if (var10 >= '0' && var10 <= '9') {
                        var11 = var10 - '0' + var9;
                    } else if (~var10 <= -98 && var10 <= 'f') {
                        var11 = var10 + '\n' + -97 + var9;
                    } else {
                        if (~var10 > -66 || var10 > 'F') {
                            var2.append('%');
                            continue;
                        }
                        var11 = var10 + -55 + var9;
                    }
                    var4 += 2;
                    if (~var11 != -1 && class446.method2636((byte) var11, (byte) -120)) {
                        var2.append(class219.method1370((byte) var11, -125));
                    }
                } else if (var5 != '+') {
                    var2.append(var5);
                } else {
                    var2.append(' ');
                }
            }
            return var2.toString();
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Z)V")
    public final void method926(boolean arg0) {
        ++field4400;
        if (this.field4395 != null) {
            this.field4395.method892();
        }
        if (this.field4384 != null) {
            this.field4384.method892();
        }
        if (!arg0) {
            this.method926(true);
        }
        this.field4376.method892();
        this.field4385.method892();
        if (this.field4382 != null) {
            this.field4382.method916(1);
        }
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(ILjagtheora/ogg/OggPacket;)V")
    public final void method931(int arg0, OggPacket arg1) {
        if (arg0 <= -87) {
            ++field4375;
            if (~super.field2240 > -4) {
                int var3 = this.field4385.headerIn(this.field4376, arg1);
                if (var3 < 0) {
                    throw new IllegalStateException(String.valueOf(var3));
                }
                if (~super.field2240 == -3) {
                    if (this.field4385.channels <= 2 && this.field4385.channels >= 1) {
                        this.field4384 = new DSPState(this.field4385);
                        this.field4395 = new VorbisBlock(this.field4384);
                        this.field4380 = new class161(this.field4385.rate, class554.field7780);
                        this.field4382 = new class146(this.field4385.channels);
                        return;
                    }
                    throw new RuntimeException(String.valueOf(this.field4385.channels));
                }
            } else {
                if (~this.field4395.synthesis(arg1) == -1) {
                    this.field4384.blockIn(this.field4395);
                }
                float[][] var4 = this.field4384.pcmOut(this.field4385.channels);
                this.field4381 = this.field4384.granuleTime();
                if (this.field4381 == -1.0D) {
                    this.field4381 = (double) ((float) this.field4377 / (float) this.field4385.rate);
                }
                this.field4384.read(var4[0].length);
                this.field4377 += var4[0].length;
                class264 var5 = this.field4382.method914(var4[0].length, (byte) 122, this.field4381);
                class54.method437(var5.field3348, var4, 19);
                for (int var6 = 0; ~this.field4385.channels < ~var6; ++var6) {
                    var5.field3348[var6] = this.field4380.method996(var5.field3348[var6], 22709);
                }
                this.field4382.method918(var5, 100);
            }
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1992(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 == arg5 && arg7 == arg8 && arg0 == arg4 && arg2 == arg3) {
            class638.method3460(arg1, (byte) 20, arg8, arg9, arg2, arg0);
        } else {
            int var10 = arg1;
            int var11 = arg8;
            int var12 = arg1 * 3;
            int var13 = arg8 * 3;
            int var14 = arg5 * 3;
            int var15 = arg7 * 3;
            int var16 = arg4 * 3;
            int var17 = arg3 * 3;
            int var18 = arg0 + var14 - var16 + -arg1;
            int var19 = arg2 + var15 + -var17 - arg8;
            int var20 = -var14 + var16 + -var14 + var12;
            int var21 = -var15 + var13 + -var15 + var17;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg1 - -(var27 + var29 - -var31 >> 12);
                int var34 = arg8 - -(var28 + var30 - -var32 >> 12);
                class638.method3460(var10, (byte) 20, var11, arg9, var34, var33);
                var10 = var33;
                var11 = var34;
            }
        }
        ++field4378;
        if (arg6 <= 0) {
            method1993(true);
        }
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(Z)V")
    public static final void method1993(boolean arg0) {
        ++field4386;
        try {
            Method var1 = (field4403 != null ? field4403 : (field4403 = method1996("java.lang.Runtime"))).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class401.field5559 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        if (!arg0) {
            method1992(19, 20, -57, -9, -58, 93, 10, 56, 64, -47);
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)Lcf;")
    public final class146 method1994(byte arg0) {
        if (arg0 > -106) {
            field4391 = null;
        }
        ++field4388;
        return this.field4382;
    }

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "(I)V")
    public static void method1995(int arg0) {
        field4402 = null;
        field4401 = null;
        field4392 = null;
        field4399 = null;
        if (arg0 == 0) {
            field4397 = null;
            field4396 = null;
            field4387 = null;
            field4391 = null;
            field4393 = null;
            field4398 = null;
            field4390 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1996(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
