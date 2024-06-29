import java.awt.Frame;
import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class182 {

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "[B")
    private byte[] field3163 = new byte[4];

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "Lfa;")
    private class176 field3165;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    private int field3164;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "J")
    private long field3171;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "Lia;")
    public static class257 field3153 = class28.method234(-95, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static int field3169 = -1;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field3162 = 0;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3156 = new BigInteger("9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083");

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "Z")
    public static boolean field3173 = false;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    private int field3160;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    private int field3168;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "Lwf;")
    public static class110 field3154;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "Lld;")
    public static class51 field3174;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "Lff;")
    public static class83 field3175;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "Ljava/awt/Frame;")
    public static Frame field3158;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field3161;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "[B")
    private byte[] field3166;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public static void method1244(byte arg0) {
        field3156 = null;
        field3158 = null;
        field3153 = null;
        field3154 = null;
        field3174 = null;
        if (arg0 <= -27) {
            field3175 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)V")
    public static final void method1245(byte arg0) {
        class40.field827.method912((byte) 36);
        int var1 = class40.field827.method909(1, (byte) -101);
        if (arg0 < 87) {
            method1248(-13, 120, -4, -120);
        }
        field3155++;
        if (var1 == 0) {
            return;
        }
        int var2 = class40.field827.method909(2, (byte) -121);
        if (var2 == 0) {
            class210.field3591[class212.field3628++] = 2047;
        } else if (var2 == 1) {
            int var3 = class40.field827.method909(3, (byte) -101);
            class137.field2441.method1584(var3, false, (byte) 4);
            int var4 = class40.field827.method909(1, (byte) -100);
            if (var4 == 1) {
                class210.field3591[class212.field3628++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class40.field827.method909(3, (byte) -121);
            class137.field2441.method1584(var5, true, (byte) 4);
            int var6 = class40.field827.method909(3, (byte) -100);
            class137.field2441.method1584(var6, true, (byte) 4);
            int var7 = class40.field827.method909(1, (byte) -114);
            if (var7 == 1) {
                class210.field3591[class212.field3628++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class40.field827.method909(7, (byte) -121);
            int var9 = class40.field827.method909(1, (byte) -127);
            if (var9 == 1) {
                class210.field3591[class212.field3628++] = 2047;
            }
            int var10 = class40.field827.method909(7, (byte) -127);
            int var11 = class40.field827.method909(1, (byte) -106);
            class189.field3261 = class40.field827.method909(2, (byte) -100);
            class137.field2441.method1586(var8, var11 == 1, var10, (byte) 94);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lof;B)V")
    public static final void method1246(class203 arg0, byte arg1) {
        field3157++;
        class211.method1415(arg1 - 11);
        if (arg1 != -81) {
            field3159 = 87;
        }
        if (class186.field3230 != null) {
            return;
        }
        if (!class231.field3882) {
            class53.method407((byte) -117);
        } else if (class102.field1902 == 1) {
            int var2 = class164.field2861 / 5;
            int var3 = class165.field2886 - (-var2 - 140);
            if (var3 <= class105.field1952 && class105.field1952 <= var3 + 14 && class74.field1430 >= class257.field4414 + 4 && (class257.field4414 + 18) >= class74.field1430) {
                class152.method1056(arg1 - 32687, 0, 0);
                return;
            }
            if (class105.field1952 >= (var3 + 15) && var3 + 80 >= class105.field1952 && class257.field4414 + 4 <= class74.field1430 && class257.field4414 + 18 >= class74.field1430) {
                class152.method1056(arg1 ^ 0x7FAF, 0, 1);
                return;
            }
            int var4 = class165.field2886 + var2 + 250;
            if (var4 <= class105.field1952 && class105.field1952 <= var4 + 14 && class257.field4414 + 4 <= class74.field1430 && class74.field1430 <= (class257.field4414 + 18)) {
                class152.method1056(arg1 ^ 0x7FAF, 1, 0);
                return;
            }
            if (class105.field1952 >= (var4 + 15) && class105.field1952 <= (var4 + 80) && class257.field4414 + 4 <= class74.field1430 && class74.field1430 <= (class257.field4414 + 18)) {
                class152.method1056(-32768, 1, 1);
                return;
            }
            int var5 = class165.field2886 + var2 + 360;
            if (var5 <= class105.field1952 && (var5 + 14) >= class105.field1952 && class257.field4414 + 4 <= class74.field1430 && class74.field1430 <= class257.field4414 + 18) {
                class152.method1056(arg1 - 32687, 2, 0);
                return;
            }
            if (var5 + 15 <= class105.field1952 && (var5 + 80) >= class105.field1952 && class74.field1430 >= class257.field4414 + 4 && class74.field1430 <= (class257.field4414 + 18)) {
                class152.method1056(-32768, 2, 1);
                return;
            }
            int var6 = class165.field2886 + var2 + 470;
            if (class105.field1952 >= var6 && class105.field1952 <= (var6 + 14) && class74.field1430 >= (class257.field4414 + 4) && class257.field4414 + 18 >= class74.field1430) {
                class152.method1056(-32768, 3, 0);
                return;
            }
            if (class105.field1952 >= (var6 + 15) && class105.field1952 <= (var6 + 80) && class74.field1430 >= class257.field4414 + 4 && (class257.field4414 + 18) >= class74.field1430) {
                class152.method1056(-32768, 3, 1);
                return;
            }
            if (class70.field1382 != -1) {
                class132 var7 = class171.field2936[class70.field1382];
                if (var7.field2364 == class68.field1363) {
                    byte[] var8 = class233.method1528(new class257[] { var7.field2367, class233.field4020 }, 0).method1667((byte) 32);
                    class238.field4065 = new String(var8, 0, var8.length);
                    class151.field2598 = var7.field2375;
                    if (class165.field2879 != 0) {
                        class115.field2074 = class151.field2598 + 50000;
                        class211.field3612 = class151.field2598 + 40000;
                        class151.field2608 = class211.field3612;
                    }
                    if (class191.field3264 != null) {
                        class191.field3264.field970 = true;
                        class257.method1718(false, class191.field3264);
                    }
                    return;
                }
                class257 var9 = class123.field2215;
                if (class165.field2879 != 0) {
                    var9 = class233.method1528(new class257[] { class204.field3504, class111.method808(10, var7.field2375 + 7000) }, 0);
                }
                class257 var10 = class233.method1528(new class257[] { class191.field3280, var7.field2367, class233.field4020, var9, class21.field432, class111.method808(10, class227.field3822), class200.field3433, class111.method808(10, class225.field3779), class151.field2607, class111.method808(10, 0), class136.field2435, class111.method808(arg1 ^ 0xFFFFFFA5, class59.field1249), class188.field3253, class111.method808(10, class161.field2819) }, 0);
                try {
                    arg0.getAppletContext().showDocument(var10.method1707(true), "_self");
                    return;
                } catch (Exception var11) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)[B")
    public final byte[] method1247(int arg0) throws IOException {
        field3172++;
        int var2 = -66 / ((-arg0 - 6) / 36);
        if (this.field3171 < class80.method600(-96)) {
            throw new IOException("fdt");
        }
        if (this.field3164 == 0) {
            if (this.field3165.field3000 == 2) {
                throw new IOException("fds");
            }
            if (this.field3165.field3000 == 1) {
                this.field3161 = (DataInputStream) this.field3165.field3001;
                this.field3164 = 1;
            }
        }
        if (this.field3164 == 1) {
            int var3 = this.field3161.available();
            if (var3 > 0) {
                if ((var3 + this.field3168) > 4) {
                    var3 = 4 - this.field3168;
                }
                this.field3168 += this.field3161.read(this.field3163, this.field3168, var3);
                if (this.field3168 == 4) {
                    int var4 = (new class152(this.field3163)).method1042(116);
                    this.field3166 = new byte[var4];
                    this.field3164 = 2;
                }
            }
        }
        if (this.field3164 == 2) {
            int var5 = this.field3161.available();
            if (var5 > 0) {
                if ((var5 + this.field3160) > this.field3166.length) {
                    var5 = this.field3166.length - this.field3160;
                }
                this.field3160 += this.field3161.read(this.field3166, this.field3160, var5);
                if (this.field3166.length == this.field3160) {
                    return this.field3166;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIII)I")
    public static final int method1248(int arg0, int arg1, int arg2, int arg3) {
        field3170++;
        if ((class233.field4007[arg0][arg2][arg1] & 0x8) != 0) {
            return 0;
        } else if (arg0 <= 0 || (class233.field4007[1][arg2][arg1] & 0x2) == 0) {
            int var4 = -1 / ((44 - arg3) / 58);
            return arg0;
        } else {
            return arg0 - 1;
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lmi;Ljava/net/URL;)V")
    public class182(class100 arg0, URL arg1) {
        this.field3165 = arg0.method714(arg1, 93);
        this.field3164 = 0;
        this.field3171 = class80.method600(-47) + 30000L;
    }
}
