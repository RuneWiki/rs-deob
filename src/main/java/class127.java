import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class127 extends class305 {

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    private int field2185 = 0;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "I")
    private int field2187 = -1;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
    private int field2181;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "[I")
    public static int[] field2184 = new int[32];

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V", line = 9)
    public final void method837(int arg0) {
        field2186++;
        int var2 = class37.method294((byte) -14);
        if ((var2 & 0x1) == 0) {
            class249.method1689(this.field2187);
        }
        if (arg0 != 1682) {
            return;
        }
        if ((var2 & 0x2) == 0) {
            class249.method1653(0);
        }
        if ((var2 & 0x4) == 0) {
            class249.method1681(0);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 32)
    public static final void method838(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class306.field4629 * 128) {
            arg0 = class306.field4629 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class39.field762 * 128) {
            arg2 = class39.field762 * 128 - 1;
        }
        class136.field2288 = class284.field4395[arg3];
        class159.field2599 = class284.field4398[arg3];
        class333.field5110 = class284.field4395[arg4];
        class235.field3701 = class284.field4398[arg4];
        class56.field1113 = arg0;
        class344.field5347 = arg1;
        class303.field4606 = arg2;
        class166.field2675 = arg0 / 128;
        class56.field1108 = arg2 / 128;
        class189.field3061 = class166.field2675 - class339.field5251;
        if (class189.field3061 < 0) {
            class189.field3061 = 0;
        }
        class23.field471 = class56.field1108 - class339.field5251;
        if (class23.field471 < 0) {
            class23.field471 = 0;
        }
        class190.field3081 = class339.field5251 + class166.field2675;
        if (class190.field3081 > class306.field4629) {
            class190.field3081 = class306.field4629;
        }
        class121.field2092 = class56.field1108 + class339.field5251;
        if (class121.field2092 > class39.field762) {
            class121.field2092 = class39.field762;
        }
        short var15;
        if (class249.field3893) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class339.field5251 + class339.field5251 + 2; var16++) {
            for (int var17 = 0; var17 < class339.field5251 + class339.field5251 + 2; var17++) {
                int var18 = (var16 - class339.field5251 << 7) - (class56.field1113 & 0x7F);
                int var19 = (var17 - class339.field5251 << 7) - (class303.field4606 & 0x7F);
                int var20 = class166.field2675 + var16 - class339.field5251;
                int var21 = class56.field1108 + var17 - class339.field5251;
                if (var20 >= 0 && var21 >= 0 && var20 < class306.field4629 && var21 < class39.field762) {
                    int var22;
                    if (class136.field2290 == null) {
                        var22 = class46.field954[0][var20][var21] + 128 - class344.field5347;
                    } else {
                        var22 = class136.field2290[0][var20][var21] + 128 - class344.field5347;
                    }
                    int var23 = class46.field954[3][var20][var21] - class344.field5347 - 1000;
                    class255.field3985[var16][var17] = class232.method1536(var18, var23, var22, var19, var15);
                } else {
                    class255.field3985[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class339.field5251 + class339.field5251 + 1; var24++) {
            for (int var25 = 0; var25 < class339.field5251 + class339.field5251 + 1; var25++) {
                class56.field1110[var24][var25] = class255.field3985[var24][var25] || class255.field3985[var24 + 1][var25] || class255.field3985[var24][var25 + 1] || class255.field3985[var24 + 1][var25 + 1];
            }
        }
        class209.field3369 = arg6;
        class28.field543 = arg7;
        class101.field1767 = arg8;
        class296.field4511 = arg9;
        class97.field1713 = arg10;
        class176.method1105();
        if (class239.field3738 != null) {
            class199.method1269(true);
            class133.method874(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class249.field3893) {
                class255.field3984 = false;
                class128.method844(0, 0, (byte) -89);
                class65.method496((float[]) null);
                class310.method2072();
            }
            class199.method1269(false);
        }
        class133.method874(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIB)V", line = 160)
    public static final void method839(int arg0, int arg1, byte arg2) {
        if (arg2 <= -59) {
            field2183++;
            if (class165.method1056(arg1, (byte) 24)) {
                class306.method2027(arg0, class138.field2300[arg1], -2);
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V", line = 174)
    public static void method840(int arg0) {
        field2184 = null;
        if (arg0 != -2034244880) {
            method838(-120, 35, -56, 16, -111, (byte[][][]) ((byte[][][]) null), (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -76, (byte) -61, -23, -98);
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)V", line = 186)
    public static final void method841(byte arg0) {
        field2182++;
        if (class214.field3434) {
            return;
        }
        if (class6.field136) {
            class120.field2090 = (float) ((int) class120.field2090 - 17 & 0xFFFFFFF0);
        } else {
            class69.field1467 += (-class69.field1467 - 12.0F) / 2.0F;
        }
        class214.field3434 = true;
        if (arg0 < -84) {
            class35.field707 = true;
        }
    }

    @OriginalMember(owner = "client!pc", name = "finalize", descriptor = "()V", line = 217)
    protected final void finalize() throws Throwable {
        field2189++;
        if (this.field2187 != -1) {
            class258.method1732(this.field2187, this.field2185, this.field2181);
            this.field2187 = -1;
            this.field2185 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(I)V", line = 292)
    public class127(int arg0) {
        GL var2 = class249.field3898;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field2181 = class258.field4013;
        this.field2187 = var3[0];
        class249.method1689(this.field2187);
        int var4 = class284.field4387[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class258.field4014 += var6.limit() - this.field2185;
        this.field2185 = var6.limit();
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lhn;", line = 242)
    public static final class185 method842(int arg0, int arg1) {
        field2179++;
        class185 var2 = (class185) class255.field3971.method1881(true, (long) arg1);
        if (arg0 != -17723) {
            field2184 = (int[]) null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class235.field3690.method2036(30, arg1, (byte) 59);
        class185 var4 = new class185();
        if (var3 != null) {
            var4.method1186(arg0 ^ 0x454D, arg1, new class202(var3));
        }
        class255.field3971.method1880(var4, (long) arg1, arg0 + 17793);
        return var4;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IJ)V", line = 267)
    public static final void method843(int arg0, long arg1) {
        field2188++;
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class106.method691(arg1 - 1L, (byte) 8);
            class106.method691(1L, (byte) 8);
        } else {
            class106.method691(arg1, (byte) 8);
        }
        if (arg0 >= -23) {
            field2184 = (int[]) null;
        }
    }
}
