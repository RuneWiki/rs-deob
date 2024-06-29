import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class448 {

    @OriginalMember(owner = "client!np", name = "r", descriptor = "Lhv;")
    private class474 field6158 = new class474();

    @OriginalMember(owner = "client!np", name = "t", descriptor = "Lhv;")
    private class474 field6160 = new class474();

    @OriginalMember(owner = "client!np", name = "u", descriptor = "Lhv;")
    private class474 field6161 = new class474();

    @OriginalMember(owner = "client!np", name = "w", descriptor = "Lhv;")
    private class474 field6163 = new class474();

    @OriginalMember(owner = "client!np", name = "z", descriptor = "Liaa;")
    private class452 field6166 = new class452(4);

    @OriginalMember(owner = "client!np", name = "B", descriptor = "I")
    public volatile int field6168 = 0;

    @OriginalMember(owner = "client!np", name = "D", descriptor = "I")
    public volatile int field6170 = 0;

    @OriginalMember(owner = "client!np", name = "C", descriptor = "B")
    private byte field6169 = 0;

    @OriginalMember(owner = "client!np", name = "E", descriptor = "Liaa;")
    private class452 field6171 = new class452(8);

    @OriginalMember(owner = "client!np", name = "i", descriptor = "I")
    public static int field6149 = 0;

    @OriginalMember(owner = "client!np", name = "s", descriptor = "[I")
    public static int[] field6159 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!np", name = "m", descriptor = "F")
    public static float field6153;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!np", name = "k", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!np", name = "n", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!np", name = "o", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!np", name = "q", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!np", name = "v", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!np", name = "A", descriptor = "I")
    private int field6167;

    @OriginalMember(owner = "client!np", name = "x", descriptor = "J")
    private long field6164;

    @OriginalMember(owner = "client!np", name = "p", descriptor = "Lnp;")
    public static class448 field6156;

    @OriginalMember(owner = "client!np", name = "G", descriptor = "Llba;")
    private class501 field6172;

    @OriginalMember(owner = "client!np", name = "y", descriptor = "Lua;")
    private class608 field6165;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V")
    public final void method2476(byte arg0) {
        field6148++;
        try {
            this.field6165.method3391(10);
        } catch (Exception var2) {
        }
        if (arg0 != 29) {
            this.method2487(true);
        }
        this.field6170 = -1;
        this.field6169 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field6165 = null;
        this.field6168++;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(B)V")
    public final void method2477(byte arg0) {
        if (this.field6165 != null) {
            this.field6165.method3396((byte) 124);
        }
        int var2 = -42 / ((-arg0 - 47) / 34);
        field6151++;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)I")
    public final int method2478(boolean arg0) {
        field6146++;
        return arg0 ? -43 : this.field6158.method2768((byte) -26) + this.field6160.method2768((byte) -26);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)I")
    private final int method2479(int arg0) {
        if (arg0 == 0) {
            field6143++;
            return this.field6161.method2768((byte) -26) + this.field6163.method2768((byte) -26);
        } else {
            return 41;
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(Z)Z")
    public final boolean method2480(boolean arg0) {
        if (!arg0) {
            this.method2477((byte) 66);
        }
        field6145++;
        return this.method2479(0) >= 20;
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(Z)Z")
    public final boolean method2481(boolean arg0) {
        field6144++;
        if (arg0) {
            return true;
        } else {
            return this.method2478(false) >= 20;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ZZ)V")
    public final void method2482(boolean arg0, boolean arg1) {
        field6142++;
        if (!arg1 || this.field6165 == null) {
            return;
        }
        try {
            this.field6166.field6215 = 0;
            this.field6166.method2525(arg0 ? 2 : 3, -81849);
            this.field6166.method2512(0, false);
            this.field6165.method3397(this.field6166.field6209, 0, 6, 4);
        } catch (IOException var4) {
            try {
                this.field6165.method3391(-119);
            } catch (Exception var3) {
            }
            this.field6165 = null;
            this.field6168++;
            this.field6170 = -2;
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V")
    private final void method2483(int arg0) {
        field6147++;
        if (this.field6165 == null) {
            return;
        }
        try {
            if (arg0 != -2) {
                method2484((byte) 121);
            }
            this.field6166.field6215 = 0;
            this.field6166.method2525(6, -81849);
            this.field6166.method2512(3, false);
            this.field6165.method3397(this.field6166.field6209, 0, 6, 4);
        } catch (IOException var3) {
            try {
                this.field6165.method3391(-15);
            } catch (Exception var2) {
            }
            this.field6170 = -2;
            this.field6168++;
            this.field6165 = null;
        }
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(B)V")
    public static final void method2484(byte arg0) {
        class11.field111 = 0;
        field6157++;
        if (arg0 != -86) {
            method2486(true);
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class288.field3709[var1] = null;
            class60.field626[var1] = 1;
            class412.field5458[var1] = null;
        }
    }

    @OriginalMember(owner = "client!np", name = "d", descriptor = "(B)Z")
    public final boolean method2485(byte arg0) {
        field6154++;
        if (this.field6165 != null) {
            long var2 = class641.method3604(false);
            int var4 = (int) (var2 - this.field6164);
            this.field6164 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field6167 += var4;
            if (this.field6167 > 30000) {
                try {
                    this.field6165.method3391(-100);
                } catch (Exception var27) {
                }
                this.field6165 = null;
            }
        }
        if (this.field6165 == null) {
            return this.method2478(false) == 0 && this.method2479(0) == 0;
        }
        try {
            this.field6165.method3389(3);
            for (class501 var5 = (class501) this.field6158.method2769(0); var5 != null; var5 = (class501) this.field6158.method2763(-23638)) {
                this.field6166.field6215 = 0;
                this.field6166.method2525(1, -81849);
                this.field6166.method2512((int) var5.field4676, false);
                this.field6165.method3397(this.field6166.field6209, 0, 6, 4);
                this.field6160.method2765(0, var5);
            }
            if (arg0 > -123) {
                this.field6164 = -35L;
            }
            for (class501 var6 = (class501) this.field6161.method2769(0); var6 != null; var6 = (class501) this.field6161.method2763(-23638)) {
                this.field6166.field6215 = 0;
                this.field6166.method2525(0, -81849);
                this.field6166.method2512((int) var6.field4676, false);
                this.field6165.method3397(this.field6166.field6209, 0, 6, 4);
                this.field6163.method2765(0, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field6165.method3395((byte) 85);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field6167 = 0;
                byte var9 = 0;
                if (this.field6172 == null) {
                    var9 = 8;
                } else if (this.field6172.field7219 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field6171.field6215;
                    if (var8 < var10) {
                        var10 = var8;
                    }
                    this.field6165.method3390(var10, this.field6171.field6209, 0, this.field6171.field6215);
                    if (this.field6169 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field6171.field6209[this.field6171.field6215 + var11] = (byte) class555.method3127(this.field6171.field6209[this.field6171.field6215 + var11], this.field6169);
                        }
                    }
                    this.field6171.field6215 += var10;
                    if (this.field6171.field6215 >= var9) {
                        if (this.field6172 == null) {
                            this.field6171.field6215 = 0;
                            int var12 = this.field6171.method2541(92);
                            int var13 = this.field6171.method2574(-1758460248);
                            int var14 = this.field6171.method2541(38);
                            int var15 = this.field6171.method2575((byte) -48);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class501 var21;
                            if (var17) {
                                for (var21 = (class501) this.field6163.method2769(0); var21 != null && var21.field4676 != var18; var21 = (class501) this.field6163.method2763(-23638)) {
                                }
                            } else {
                                for (var21 = (class501) this.field6160.method2769(0); var21 != null && var21.field4676 != var18; var21 = (class501) this.field6160.method2763(-23638)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field6172 = var21;
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field6172.field7218 = new class452(var15 + var22 + this.field6172.field7215);
                            this.field6172.field7218.method2525(var16, -81849);
                            this.field6172.field7218.method2554(var15, 255);
                            this.field6172.field7219 = 8;
                            this.field6171.field6215 = 0;
                        } else if (this.field6172.field7219 != 0) {
                            throw new IOException();
                        } else if (this.field6171.field6209[0] == -1) {
                            this.field6172.field7219 = 1;
                            this.field6171.field6215 = 0;
                        } else {
                            this.field6172 = null;
                        }
                    }
                } else {
                    int var23 = this.field6172.field7218.field6209.length - this.field6172.field7215;
                    int var24 = 512 - this.field6172.field7219;
                    if (var24 > var23 - this.field6172.field7218.field6215) {
                        var24 = var23 - this.field6172.field7218.field6215;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field6165.method3390(var24, this.field6172.field7218.field6209, 0, this.field6172.field7218.field6215);
                    if (this.field6169 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field6172.field7218.field6209[this.field6172.field7218.field6215 + var25] = (byte) class555.method3127(this.field6172.field7218.field6209[this.field6172.field7218.field6215 + var25], this.field6169);
                        }
                    }
                    this.field6172.field7218.field6215 += var24;
                    this.field6172.field7219 += var24;
                    if (this.field6172.field7218.field6215 == var23) {
                        this.field6172.method1968((byte) -88);
                        this.field6172.field8252 = false;
                        this.field6172 = null;
                    } else if (this.field6172.field7219 == 512) {
                        this.field6172.field7219 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field6165.method3391(-101);
            } catch (Exception var26) {
            }
            this.field6165 = null;
            this.field6168++;
            this.field6170 = -2;
            return this.method2478(false) == 0 && this.method2479(0) == 0;
        }
    }

    @OriginalMember(owner = "client!np", name = "d", descriptor = "(Z)V")
    public static void method2486(boolean arg0) {
        field6156 = null;
        if (!arg0) {
            method2489(12, null);
        }
        field6159 = null;
    }

    @OriginalMember(owner = "client!np", name = "e", descriptor = "(Z)V")
    public final void method2487(boolean arg0) {
        if (arg0) {
            this.field6169 = 72;
        }
        field6155++;
        if (this.field6165 != null) {
            this.field6165.method3391(-120);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(BZIIB)Llba;")
    public final class501 method2488(byte arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        field6150++;
        long var6 = (long) ((arg3 << 16) + arg2);
        class501 var8 = new class501();
        var8.field4676 = var6;
        var8.field8250 = arg1;
        var8.field7215 = arg4;
        if (arg1) {
            if (this.method2478(false) >= 20) {
                throw new RuntimeException();
            }
            this.field6158.method2765(arg0 ^ 0xFFFFFFAD, var8);
        } else if (this.method2479(arg0 + 83) < 20) {
            this.field6161.method2765(arg0 ^ 0xFFFFFFAD, var8);
        } else {
            throw new RuntimeException();
        }
        return arg0 == -83 ? var8 : null;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method2489(int arg0, byte[] arg1) {
        field6141++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != 9) {
            method2484((byte) -7);
        }
        byte[] var2 = new byte[arg1.length];
        class652.method3679(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lua;ZB)V")
    public final void method2490(class608 arg0, boolean arg1, byte arg2) {
        if (this.field6165 != null) {
            try {
                this.field6165.method3391(-120);
            } catch (Exception var9) {
            }
            this.field6165 = null;
        }
        field6162++;
        this.field6165 = arg0;
        int var4 = 24 / ((arg2 + 78) / 37);
        this.method2483(-2);
        this.method2482(arg1, true);
        this.field6172 = null;
        this.field6171.field6215 = 0;
        while (true) {
            class501 var5 = (class501) this.field6160.method2766((byte) 82);
            if (var5 == null) {
                while (true) {
                    class501 var6 = (class501) this.field6163.method2766((byte) 82);
                    if (var6 == null) {
                        if (this.field6169 != 0) {
                            try {
                                this.field6166.field6215 = 0;
                                this.field6166.method2525(4, -81849);
                                this.field6166.method2525(this.field6169, -81849);
                                this.field6166.method2537(18244, 0);
                                this.field6165.method3397(this.field6166.field6209, 0, 6, 4);
                            } catch (IOException var8) {
                                try {
                                    this.field6165.method3391(-102);
                                } catch (Exception var7) {
                                }
                                this.field6168++;
                                this.field6165 = null;
                                this.field6170 = -2;
                            }
                        }
                        this.field6167 = 0;
                        this.field6164 = class641.method3604(false);
                        return;
                    }
                    this.field6161.method2765(0, var6);
                }
            }
            this.field6158.method2765(0, var5);
        }
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(I)V")
    public final void method2491(int arg0) {
        field6152++;
        if (this.field6165 == null || arg0 < 98) {
            return;
        }
        try {
            this.field6166.field6215 = 0;
            this.field6166.method2525(7, -81849);
            this.field6166.method2512(0, false);
            this.field6165.method3397(this.field6166.field6209, 0, 6, 4);
        } catch (IOException var3) {
            try {
                this.field6165.method3391(-121);
            } catch (Exception var2) {
            }
            this.field6165 = null;
            this.field6168++;
            this.field6170 = -2;
        }
    }
}
