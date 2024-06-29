import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class391 implements Runnable {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "Z")
    private boolean field5160 = false;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "Z")
    private boolean field5177 = false;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    private int field5173 = 0;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    private int field5174 = 0;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "Ljava/net/Socket;")
    private Socket field5181;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "Lpq;")
    private class165 field5182;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "Ljava/io/InputStream;")
    private InputStream field5180;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field5161;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "[I")
    public static int[] field5171 = new int[256];

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "[I")
    public static int[] field5185;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Lvs;")
    private class506 field5162;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "[B")
    private byte[] field5168;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "[I")
    public static int[] field5165;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public final void method2244(int arg0) {
        field5179++;
        if (arg0 != -16138) {
            this.method2244(-99);
        }
        if (!this.field5160) {
            this.field5180 = new class584();
            this.field5161 = new class285();
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
    public final void method2245(int arg0) {
        field5176++;
        if (this.field5160) {
            return;
        }
        synchronized (this) {
            this.field5160 = true;
            this.notifyAll();
        }
        if (this.field5162 != null) {
            while (this.field5162.field7031 == 0) {
                class462.method2688(1L, (byte) 110);
            }
            if (this.field5162.field7031 == 1) {
                try {
                    ((Thread) this.field5162.field7030).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field5162 = null;
        if (arg0 != 1) {
            this.field5182 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V")
    public static void method2246(int arg0) {
        field5165 = null;
        field5171 = null;
        if (arg0 != 1) {
            method2252(-42, -98, 85, 66, 34, 51, 39);
        }
        field5185 = null;
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)V")
    public final void method2247(int arg0) throws IOException {
        field5169++;
        if (this.field5160) {
            return;
        }
        if (arg0 != 0) {
            this.field5168 = null;
        }
        if (this.field5177) {
            this.field5177 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([BBII)V")
    public final void method2248(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field5163++;
        if (this.field5160) {
            return;
        }
        if (arg1 != 74) {
            this.field5161 = null;
        }
        while (arg2 > 0) {
            int var5 = this.field5180.read(arg0, arg3, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg3 += var5;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)I")
    public final int method2249(byte arg0) throws IOException {
        if (arg0 == 4) {
            field5172++;
            return this.field5160 ? 0 : this.field5180.available();
        } else {
            return 16;
        }
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)V")
    public static final void method2250(int arg0) {
        class53.field446 = new class587(8);
        field5167++;
        class454.field6261 = 0;
        if (arg0 != 2028208128) {
            field5183 = 118;
        }
        for (class455 var1 = (class455) class388.field5129.method1987(true); var1 != null; var1 = (class455) class388.field5129.method1994(6408)) {
            var1.method2660();
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([BIII)V")
    public final void method2251(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field5178++;
        if (arg2 != -26995 || this.field5160) {
            return;
        }
        if (this.field5177) {
            this.field5177 = false;
            throw new IOException();
        }
        if (this.field5168 == null) {
            this.field5168 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field5168[this.field5174] = arg0[arg3 + var6];
                this.field5174 = (this.field5174 + 1) % 5000;
                if (((this.field5173 + 4900) % 5000) == this.field5174) {
                    throw new IOException();
                }
            }
            if (this.field5162 == null) {
                this.field5162 = this.field5182.method901((byte) -112, 3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!qg", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field5174 == this.field5173) {
                            if (this.field5160) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field5173;
                        if (this.field5174 >= this.field5173) {
                            var3 = this.field5174 - this.field5173;
                        } else {
                            var3 = 5000 - this.field5173;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field5161.write(this.field5168, var2, var3);
                    } catch (IOException var9) {
                        this.field5177 = true;
                    }
                    this.field5173 = (this.field5173 + var3) % 5000;
                    try {
                        if (this.field5174 == this.field5173) {
                            this.field5161.flush();
                        }
                    } catch (IOException var8) {
                        this.field5177 = true;
                    }
                    continue;
                }
                try {
                    if (this.field5180 != null) {
                        this.field5180.close();
                    }
                    if (this.field5161 != null) {
                        this.field5161.close();
                    }
                    if (this.field5181 != null) {
                        this.field5181.close();
                    }
                } catch (IOException var7) {
                }
                this.field5168 = null;
                break;
            }
        } catch (Exception var12) {
            class443.method2597(var12, null, (byte) 104);
        }
        field5175++;
    }

    @OriginalMember(owner = "client!qg", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field5164++;
        this.method2245(1);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2252(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class249 var7 = new class249();
        var7.field3190 = arg1 >> class362.field4756;
        var7.field3182 = arg2 >> class362.field4756;
        var7.field3185 = arg3 >> class362.field4756;
        var7.field3179 = arg4 >> class362.field4756;
        var7.field3178 = arg0;
        var7.field3180 = arg1;
        var7.field3193 = arg2;
        var7.field3188 = arg3;
        var7.field3191 = arg4;
        var7.field3173 = arg5;
        var7.field3186 = arg6;
        class194.field2349[class107.field1339++] = var7;
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "(I)I")
    public final int method2253(int arg0) throws IOException {
        if (arg0 != 1675886592) {
            this.method2244(-28);
        }
        field5170++;
        return this.field5160 ? 0 : this.field5180.read();
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Ljava/net/Socket;Lpq;)V")
    public class391(Socket arg0, class165 arg1) throws IOException {
        this.field5181 = arg0;
        this.field5182 = arg1;
        this.field5181.setSoTimeout(30000);
        this.field5181.setTcpNoDelay(true);
        this.field5180 = this.field5181.getInputStream();
        this.field5161 = this.field5181.getOutputStream();
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIIILqt;III)Z")
    public static final boolean method2254(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class542 arg8, int arg9, int arg10, int arg11) {
        field5166++;
        int var12 = arg5;
        int var13 = arg9;
        if (arg1 < 0) {
            method2246(-112);
        }
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg5 - var14;
        int var17 = arg9 - var15;
        class303.field3871[var14][var15] = 99;
        class585.field8491[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class104.field1271[var18] = arg5;
        int var35 = var18 + 1;
        class468.field6544[var18] = arg9;
        int[][] var20 = arg8.field7922;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class348.field4484 = var13;
                                    class152.field1855 = var12;
                                    return false;
                                }
                                var13 = class468.field6544[var19];
                                var12 = class104.field1271[var19];
                                var19 = var19 + 1 & 0xFFF;
                                var21 = var12 - var16;
                                var22 = var13 - var17;
                                var23 = var12 - arg8.field7939;
                                var24 = var13 - arg8.field7915;
                                if (arg10 == -4) {
                                    if (arg2 == var12 && arg7 == var13) {
                                        class152.field1855 = var12;
                                        class348.field4484 = var13;
                                        return true;
                                    }
                                } else if (arg10 == -3) {
                                    if (class320.method1765(arg3, arg6, 102, arg2, var12, arg7, var13, arg6, arg11)) {
                                        class152.field1855 = var12;
                                        class348.field4484 = var13;
                                        return true;
                                    }
                                } else if (arg10 == -2) {
                                    if (arg8.method3158(arg4, arg11, -60, arg7, arg2, var13, arg6, arg6, var12, arg3)) {
                                        class348.field4484 = var13;
                                        class152.field1855 = var12;
                                        return true;
                                    }
                                } else if (arg10 == -1) {
                                    if (arg8.method3157(arg6, var12, arg7, arg3, arg2, arg11, -114, var13, arg4)) {
                                        class348.field4484 = var13;
                                        class152.field1855 = var12;
                                        return true;
                                    }
                                } else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
                                    if (arg8.method3154(arg0, arg7, arg10, arg2, var12, arg6, (byte) -10, var13)) {
                                        class348.field4484 = var13;
                                        class152.field1855 = var12;
                                        return true;
                                    }
                                } else if (arg8.method3156(arg0, arg2, var13, var12, arg10, (byte) -51, arg6, arg7)) {
                                    class348.field4484 = var13;
                                    class152.field1855 = var12;
                                    return true;
                                }
                                var26 = class585.field8491[var21][var22] + 1;
                                if (var21 > 0 && class303.field3871[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg6 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= arg6 - 1) {
                                            class104.field1271[var35] = var12 - 1;
                                            class468.field6544[var35] = var13;
                                            class303.field3871[var21 - 1][var22] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class585.field8491[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if ((128 - arg6) > var21 && class303.field3871[var21 + 1][var22] == 0 && (var20[arg6 + var23][var24] & 0x60E40000) == 0 && (var20[var23 + arg6][var24 + arg6 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if ((arg6 - 1) <= var28) {
                                            class104.field1271[var35] = var12 + 1;
                                            class468.field6544[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class303.field3871[var21 + 1][var22] = 8;
                                            class585.field8491[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[arg6 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class303.field3871[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg6 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (arg6 - 1 <= var29) {
                                            class104.field1271[var35] = var12;
                                            class468.field6544[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class303.field3871[var21][var22 - 1] = 1;
                                            class585.field8491[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var22 < 128 - arg6 && class303.field3871[var21][var22 + 1] == 0 && (var20[var23][arg6 + var24] & 0x4E240000) == 0 && (var20[arg6 + var23 - 1][var24 + arg6] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg6 - 1)) {
                                            class104.field1271[var35] = var12;
                                            class468.field6544[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class303.field3871[var21][var22 + 1] = 4;
                                            class585.field8491[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][var24 + arg6] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class303.field3871[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg6 <= var31) {
                                            class104.field1271[var35] = var12 - 1;
                                            class468.field6544[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class303.field3871[var21 - 1][var22 - 1] = 3;
                                            class585.field8491[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var21 < (128 - arg6) && var22 > 0 && class303.field3871[var21 + 1][var22 - 1] == 0 && (var20[arg6 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg6 <= var32) {
                                            class104.field1271[var35] = var12 + 1;
                                            class468.field6544[var35] = var13 - 1;
                                            class303.field3871[var21 + 1][var22 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class585.field8491[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg6 + var23][var32 + var24 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && 128 - arg6 > var22 && class303.field3871[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][var24 + arg6] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg6; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg6 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class104.field1271[var35] = var12 - 1;
                                    class468.field6544[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class303.field3871[var21 - 1][var22 + 1] = 6;
                                    class585.field8491[var21 - 1][var22 + 1] = var26;
                                }
                            } while (128 - arg6 <= var21);
                        } while (var22 >= (128 - arg6));
                    } while (class303.field3871[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg6 + var23][arg6 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg6; var34++) {
                    if ((var20[var23 + var34][arg6 + var24] & 0x7E240000) != 0 || (var20[var23 + arg6][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class104.field1271[var35] = var12 + 1;
                class468.field6544[var35] = var13 + 1;
                class303.field3871[var21 + 1][var22 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class585.field8491[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field5171[var0] = var1;
        }
        field5185 = new int[] { 28, 35, 40, 44 };
    }
}
