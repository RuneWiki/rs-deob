import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class131 extends class312 {

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    private int field2063 = -1;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
    private int field2066 = 0;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    private int field2061;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "Ljava/lang/String;")
    public static String field2055 = "flash1:";

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "J")
    public static long field2060 = 0L;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "I")
    public static int field2064 = 0;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "[[Z")
    public static boolean[][] field2057;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[S)[S", line = 6)
    public static final short[] method898(int arg0, short[] arg1) {
        field2059++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != 14118) {
            method901(-49);
        }
        short[] var2 = new short[arg1.length];
        class223.method1499(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIZIII)V", line = 25)
    public static final void method899(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        class29.field365 = arg5;
        class27.field348 = arg0;
        class90.field1364 = arg4;
        if (arg2) {
            method902(52, (class303) null);
        }
        class213.field3379 = arg3;
        field2058++;
        class160.field2491 = arg1;
        if (class90.field1364 >= 100) {
            int var6 = class29.field365 * 128 + 64;
            int var7 = class213.field3379 * 128 + 64;
            int var8 = class39.method286(class77.field1154, (byte) 82, var6, var7) - class160.field2491;
            int var9 = var8 - class169.field2579;
            int var10 = var7 - class225.field3592;
            int var11 = var6 - class298.field4598;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class199.field2989 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            class305.field4781 = (int) (Math.atan2((double) var11, (double) var10) * -325.949D) & 0x7FF;
            if (class199.field2989 < 128) {
                class199.field2989 = 128;
            }
            if (class199.field2989 > 383) {
                class199.field2989 = 383;
            }
        }
        class219.field3489 = 2;
    }

    @OriginalMember(owner = "client!qf", name = "finalize", descriptor = "()V", line = 72)
    protected final void finalize() throws Throwable {
        field2065++;
        if (this.field2063 != -1) {
            class301.method1983(this.field2063, this.field2066, this.field2061);
            this.field2063 = -1;
            this.field2066 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V", line = 96)
    public static final void method900(int arg0) {
        field2068++;
        byte var1 = 8;
        byte var2 = 0;
        class257.method1725(104, class338.field5235);
        int var3 = (class30.field374 >> 3) + (class298.field4598 >> 10);
        byte var4 = 8;
        byte var5 = 18;
        class188.field2857 = new int[var5];
        class314.field4953 = new int[var5];
        int var6 = (class294.field4535 >> 3) + (class225.field3592 >> 10);
        class334.field5191 = new int[var5];
        class121.field1865 = new int[var5];
        class151.field2380 = new byte[var5][];
        class183.field2811 = new byte[var5][];
        class40.field576 = new int[var5];
        class204.field3079 = new byte[var5][];
        class305.field4775 = new byte[var5][];
        class184.field2827 = new byte[var5][];
        class142.field2255 = new int[var5][4];
        class129.field2022 = new int[var5];
        int var7 = 0;
        if (arg0 != -1) {
            return;
        }
        for (int var8 = (var3 - 6) / 8; var8 <= (var3 + 6) / 8; var8++) {
            for (int var9 = (var6 - 6) / 8; var9 <= ((var6 + 6) / 8); var9++) {
                int var10 = (var8 << 8) + var9;
                class121.field1865[var7] = var10;
                class129.field2022[var7] = class297.field4554.method2107("m" + var8 + "_" + var9, (byte) 120);
                class334.field5191[var7] = class297.field4554.method2107("l" + var8 + "_" + var9, (byte) 117);
                class188.field2857[var7] = class297.field4554.method2107("n" + var8 + "_" + var9, (byte) 117);
                class40.field576[var7] = class297.field4554.method2107("um" + var8 + "_" + var9, (byte) 123);
                class314.field4953[var7] = class297.field4554.method2107("ul" + var8 + "_" + var9, (byte) 115);
                if (class188.field2857[var7] == -1) {
                    class129.field2022[var7] = -1;
                    class334.field5191[var7] = -1;
                    class40.field576[var7] = -1;
                    class314.field4953[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class188.field2857.length; var11++) {
            class188.field2857[var11] = -1;
            class129.field2022[var11] = -1;
            class334.field5191[var11] = -1;
            class40.field576[var11] = -1;
            class314.field4953[var11] = -1;
        }
        class227.method1556(false, var6, -2732, true, var4, var2, var1, var3);
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V", line = 178)
    public static void method901(int arg0) {
        int var1 = 13 / ((arg0 - 46) / 44);
        field2057 = (boolean[][]) null;
        field2055 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILgn;)Ljava/lang/String;", line = 190)
    public static final String method902(int arg0, class303 arg1) {
        if (arg0 == 8) {
            field2056++;
            return class123.method835(arg1, 32767, (byte) -53);
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(I)V", line = 246)
    public class131(int arg0) {
        int[] var2 = new int[1];
        GL var3 = class333.field5160;
        var3.glGenTextures(1, var2, 0);
        this.field2063 = var2[0];
        this.field2061 = class301.field4649;
        class333.method2282(this.field2063);
        int var4 = class12.field129[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var3.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var3.glTexParameteri(3553, 10241, 9729);
        var3.glTexParameteri(3553, 10240, 9729);
        class301.field4648 += var6.limit() - this.field2066;
        this.field2066 = var6.limit();
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)V", line = 220)
    public final void method903(byte arg0) {
        field2062++;
        int var2 = class218.method1455(-1);
        if ((var2 & 0x1) == 0) {
            class333.method2282(this.field2063);
        }
        if ((var2 & 0x2) == 0) {
            class333.method2306(0);
        }
        if ((var2 & 0x4) == 0) {
            class333.method2285(0);
        }
        if (arg0 > -125) {
            this.field2063 = -45;
        }
    }
}
