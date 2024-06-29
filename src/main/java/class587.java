import java.io.IOException;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class587 {

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "Ldha;")
    private class84 field7817 = new class84();

    @OriginalMember(owner = "client!tv", name = "u", descriptor = "Ldha;")
    private class84 field7836 = new class84();

    @OriginalMember(owner = "client!tv", name = "v", descriptor = "Ldha;")
    private class84 field7837 = new class84();

    @OriginalMember(owner = "client!tv", name = "w", descriptor = "Ldha;")
    private class84 field7838 = new class84();

    @OriginalMember(owner = "client!tv", name = "x", descriptor = "Ljp;")
    private class376 field7839 = new class376(4);

    @OriginalMember(owner = "client!tv", name = "B", descriptor = "B")
    private byte field7843 = 0;

    @OriginalMember(owner = "client!tv", name = "D", descriptor = "I")
    public volatile int field7845 = 0;

    @OriginalMember(owner = "client!tv", name = "C", descriptor = "I")
    public volatile int field7844 = 0;

    @OriginalMember(owner = "client!tv", name = "E", descriptor = "Ljp;")
    private class376 field7846 = new class376(8);

    @OriginalMember(owner = "client!tv", name = "i", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field7824 = new Hashtable();

    @OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
    public static int field7831 = -1;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "I")
    public static int field7816;

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
    public static int field7818;

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "I")
    public static int field7819;

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "I")
    public static int field7820;

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "I")
    public static int field7821;

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "I")
    public static int field7822;

    @OriginalMember(owner = "client!tv", name = "h", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!tv", name = "j", descriptor = "I")
    public static int field7825;

    @OriginalMember(owner = "client!tv", name = "k", descriptor = "I")
    public static int field7826;

    @OriginalMember(owner = "client!tv", name = "l", descriptor = "I")
    public static int field7827;

    @OriginalMember(owner = "client!tv", name = "n", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!tv", name = "o", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!tv", name = "q", descriptor = "I")
    public static int field7832;

    @OriginalMember(owner = "client!tv", name = "r", descriptor = "I")
    public static int field7833;

    @OriginalMember(owner = "client!tv", name = "s", descriptor = "I")
    public static int field7834;

    @OriginalMember(owner = "client!tv", name = "t", descriptor = "I")
    public static int field7835;

    @OriginalMember(owner = "client!tv", name = "y", descriptor = "I")
    private int field7840;

    @OriginalMember(owner = "client!tv", name = "z", descriptor = "J")
    private long field7841;

    @OriginalMember(owner = "client!tv", name = "F", descriptor = "Lfea;")
    private class152 field7847;

    @OriginalMember(owner = "client!tv", name = "A", descriptor = "Lqk;")
    private class18 field7842;

    @OriginalMember(owner = "client!tv", name = "m", descriptor = "Laj;")
    public static class333 field7828;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V")
    public static final void method3262(byte arg0) {
        field7816++;
        class41.method281(598809411, class712.field9959.field1297.method2806(17));
        int var1 = (class634.field8856 >> 12) + (class121.field1765 >> 3);
        int var2 = (class350.field5138 >> 12) + (class230.field3147 >> 3);
        class610.field8296 = class551.field7456.field2250 = 0;
        class551.field7456.method654(8, 8, false);
        if (arg0 != -45) {
            field7831 = 42;
        }
        byte var3 = 18;
        class103.field1426 = new int[var3];
        class30.field450 = new int[var3][4];
        class560.field7531 = new byte[var3][];
        class73.field1070 = new byte[var3][];
        class186.field2487 = new int[var3];
        class366.field5331 = new int[var3];
        class255.field3811 = new byte[var3][];
        class286.field4212 = new int[var3];
        class476.field6617 = new byte[var3][];
        class381.field5565 = new byte[var3][];
        class618.field8334 = new int[var3];
        class503.field6969 = new int[var3];
        int var4 = 0;
        for (int var5 = (var1 - (class597.field8132 >> 4)) / 8; var5 <= ((class597.field8132 >> 4) + var1) / 8; var5++) {
            for (int var8 = (var2 - (class628.field8800 >> 4)) / 8; var8 <= (var2 + (class628.field8800 >> 4)) / 8; var8++) {
                int var9 = (var5 << 8) + var8;
                class186.field2487[var4] = var9;
                class618.field8334[var4] = field7828.method2092("m" + var5 + "_" + var8, false);
                class366.field5331[var4] = field7828.method2092("l" + var5 + "_" + var8, false);
                class103.field1426[var4] = field7828.method2092("n" + var5 + "_" + var8, false);
                class503.field6969[var4] = field7828.method2092("um" + var5 + "_" + var8, false);
                class286.field4212[var4] = field7828.method2092("ul" + var5 + "_" + var8, false);
                if (class103.field1426[var4] == -1) {
                    class618.field8334[var4] = -1;
                    class366.field5331[var4] = -1;
                    class503.field6969[var4] = -1;
                    class286.field4212[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class103.field1426.length; var6++) {
            class103.field1426[var6] = -1;
            class618.field8334[var6] = -1;
            class366.field5331[var6] = -1;
            class503.field6969[var6] = -1;
            class286.field4212[var6] = -1;
        }
        byte var7;
        if (class458.field6355 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class327.method2069(var1, false, var2, var7, 94);
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
    public final void method3263(int arg0) {
        if (this.field7842 != null) {
            this.field7842.method144(false);
        }
        int var2 = 98 / ((arg0 - 7) / 56);
        field7827++;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)V")
    public final void method3264(boolean arg0) {
        field7819++;
        try {
            this.field7842.method140(-126);
        } catch (Exception var2) {
        }
        this.field7842 = null;
        this.field7843 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field7845++;
        if (arg0) {
            this.field7844 = -1;
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)V")
    public static void method3265(int arg0) {
        field7828 = null;
        field7824 = null;
        if (arg0 != 15674) {
            field7831 = -8;
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(B)Z")
    public final boolean method3266(byte arg0) {
        field7833++;
        if (arg0 >= -67) {
            this.field7839 = null;
        }
        return this.method3270(false) >= 20;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lqk;BZ)V")
    public final void method3267(class18 arg0, byte arg1, boolean arg2) {
        if (this.field7842 != null) {
            try {
                this.field7842.method140(-125);
            } catch (Exception var8) {
            }
            this.field7842 = null;
        }
        field7834++;
        this.field7842 = arg0;
        this.method3272(false);
        this.method3277(arg2, arg1 - 88);
        this.field7846.field5459 = 0;
        this.field7847 = null;
        while (true) {
            class152 var4 = (class152) this.field7836.method698(122);
            if (var4 == null) {
                if (arg1 != 88) {
                    this.method3264(false);
                }
                while (true) {
                    class152 var5 = (class152) this.field7838.method698(-99);
                    if (var5 == null) {
                        if (this.field7843 != 0) {
                            try {
                                this.field7839.field5459 = 0;
                                this.field7839.method2380(arg1 + 65192, 4);
                                this.field7839.method2380(arg1 ^ 0xFF58, this.field7843);
                                this.field7839.method2415(false, 0);
                                this.field7842.method142(4, this.field7839.field5518, 0, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field7842.method140(-127);
                                } catch (Exception var6) {
                                }
                                this.field7844 = -2;
                                this.field7845++;
                                this.field7842 = null;
                            }
                        }
                        this.field7840 = 0;
                        this.field7841 = class302.method1910(0);
                        return;
                    }
                    this.field7837.method695(-85, var5);
                }
            }
            this.field7817.method695(-102, var4);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILss;)I")
    public static final int method3268(int arg0, class457 arg1) {
        if (arg0 != -10656) {
            return -72;
        }
        field7822++;
        if (class122.field1782 == arg1) {
            return 5890;
        } else if (class461.field6387 == arg1) {
            return 34167;
        } else if (class386.field5627 == arg1) {
            return 34168;
        } else if (class109.field1493 == arg1) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)V")
    public final void method3269(int arg0) {
        field7826++;
        if (this.field7842 == null) {
            return;
        }
        try {
            this.field7839.field5459 = 0;
            this.field7839.method2380(arg0 + 65280, 7);
            this.field7839.method2408((byte) 111, arg0);
            this.field7842.method142(4, this.field7839.field5518, 0, 0);
        } catch (IOException var3) {
            try {
                this.field7842.method140(arg0 - 127);
            } catch (Exception var2) {
            }
            this.field7842 = null;
            this.field7845++;
            this.field7844 = -2;
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(Z)I")
    private final int method3270(boolean arg0) {
        field7818++;
        if (arg0) {
            this.method3271((byte) -41);
        }
        return this.field7837.method696(-14980) + this.field7838.method696(-14980);
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(B)V")
    public final void method3271(byte arg0) {
        int var2 = -13 % ((arg0 - 13) / 58);
        if (this.field7842 != null) {
            this.field7842.method140(-126);
        }
        field7830++;
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(Z)V")
    private final void method3272(boolean arg0) {
        field7821++;
        if (this.field7842 == null) {
            return;
        }
        try {
            this.field7839.field5459 = 0;
            this.field7839.method2380(65280, 6);
            this.field7839.method2408((byte) 80, 3);
            this.field7842.method142(4, this.field7839.field5518, 0, 0);
        } catch (IOException var3) {
            try {
                this.field7842.method140(-125);
            } catch (Exception var2) {
            }
            this.field7844 = -2;
            this.field7842 = null;
            this.field7845++;
        }
        if (arg0) {
            this.field7842 = null;
        }
    }

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "(I)Z")
    public final boolean method3273(int arg0) {
        field7823++;
        if (this.field7842 != null) {
            long var2 = class302.method1910(0);
            int var4 = (int) (var2 - this.field7841);
            this.field7841 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field7840 += var4;
            if (this.field7840 > 30000) {
                try {
                    this.field7842.method140(-125);
                } catch (Exception var27) {
                }
                this.field7842 = null;
            }
        }
        if (this.field7842 == null) {
            return this.method3276(0) == 0 && this.method3270(false) == 0;
        }
        try {
            this.field7842.method149(arg0 - 88);
            for (class152 var5 = (class152) this.field7817.method697(arg0); var5 != null; var5 = (class152) this.field7817.method699(true)) {
                this.field7839.field5459 = 0;
                this.field7839.method2380(arg0 + 65280, 1);
                this.field7839.method2408((byte) 86, (int) var5.field4141);
                this.field7842.method142(4, this.field7839.field5518, 0, arg0);
                this.field7836.method695(arg0 - 117, var5);
            }
            for (class152 var6 = (class152) this.field7837.method697(arg0); var6 != null; var6 = (class152) this.field7837.method699(true)) {
                this.field7839.field5459 = 0;
                this.field7839.method2380(65280, 0);
                this.field7839.method2408((byte) 122, (int) var6.field4141);
                this.field7842.method142(4, this.field7839.field5518, 0, 0);
                this.field7838.method695(-128, var6);
            }
            for (int var7 = arg0; var7 < 100; var7++) {
                int var8 = this.field7842.method148((byte) 33);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field7840 = 0;
                byte var9 = 0;
                if (this.field7847 == null) {
                    var9 = 8;
                } else if (this.field7847.field2098 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field7847.field2094.field5518.length - this.field7847.field2095;
                    int var11 = 512 - this.field7847.field2098;
                    if (var10 - this.field7847.field2094.field5459 < var11) {
                        var11 = var10 - this.field7847.field2094.field5459;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field7842.method141(this.field7847.field2094.field5459, 233224196, var11, this.field7847.field2094.field5518);
                    if (this.field7843 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field7847.field2094.field5518[this.field7847.field2094.field5459 + var12] = (byte) class471.method2773(this.field7847.field2094.field5518[this.field7847.field2094.field5459 + var12], this.field7843);
                        }
                    }
                    this.field7847.field2094.field5459 += var11;
                    this.field7847.field2098 += var11;
                    if (this.field7847.field2094.field5459 == var10) {
                        this.field7847.method1811(arg0 ^ 0x6DA0);
                        this.field7847.field10051 = false;
                        this.field7847 = null;
                    } else if (this.field7847.field2098 == 512) {
                        this.field7847.field2098 = 0;
                    }
                } else {
                    int var13 = var9 - this.field7846.field5459;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field7842.method141(this.field7846.field5459, arg0 ^ 0xDE6B804, var13, this.field7846.field5518);
                    if (this.field7843 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field7846.field5518[this.field7846.field5459 + var14] = (byte) class471.method2773(this.field7846.field5518[this.field7846.field5459 + var14], this.field7843);
                        }
                    }
                    this.field7846.field5459 += var13;
                    if (this.field7846.field5459 >= var9) {
                        if (this.field7847 == null) {
                            this.field7846.field5459 = 0;
                            int var15 = this.field7846.method2398(-1372747256);
                            int var16 = this.field7846.method2359(-1);
                            int var17 = this.field7846.method2398(-1372747256);
                            int var18 = this.field7846.method2384(arg0 + 67);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class152 var24;
                            if (var20) {
                                for (var24 = (class152) this.field7838.method697(arg0); var24 != null && var24.field4141 != var21; var24 = (class152) this.field7838.method699(true)) {
                                }
                            } else {
                                for (var24 = (class152) this.field7836.method697(0); var24 != null && var24.field4141 != var21; var24 = (class152) this.field7836.method699(true)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field7847 = var24;
                            this.field7847.field2094 = new class376(this.field7847.field2095 + var25 + var18);
                            this.field7847.field2094.method2380(65280, var19);
                            this.field7847.field2094.method2354(var18, (byte) 110);
                            this.field7847.field2098 = 8;
                            this.field7846.field5459 = 0;
                        } else if (this.field7847.field2098 != 0) {
                            throw new IOException();
                        } else if (this.field7846.field5518[0] == -1) {
                            this.field7846.field5459 = 0;
                            this.field7847.field2098 = 1;
                        } else {
                            this.field7847 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field7842.method140(-125);
            } catch (Exception var26) {
            }
            this.field7842 = null;
            this.field7845++;
            this.field7844 = -2;
            return this.method3276(0) == 0 && this.method3270(false) == 0;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(BIZII)Lfea;")
    public final class152 method3274(byte arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg1 < 34) {
            this.method3263(41);
        }
        field7832++;
        long var6 = (long) ((arg4 << 16) + arg3);
        class152 var8 = new class152();
        var8.field10055 = arg2;
        var8.field4141 = var6;
        var8.field2095 = arg0;
        if (arg2) {
            if (this.method3276(0) >= 20) {
                throw new RuntimeException();
            }
            this.field7817.method695(-90, var8);
        } else if (this.method3270(false) < 20) {
            this.field7837.method695(-112, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "(Z)Z")
    public final boolean method3275(boolean arg0) {
        if (!arg0) {
            this.method3266((byte) 81);
        }
        field7835++;
        return this.method3276(0) >= 20;
    }

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "(I)I")
    public final int method3276(int arg0) {
        field7829++;
        return arg0 == 0 ? this.field7817.method696(arg0 - 14980) + this.field7836.method696(-14980) : -69;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZI)V")
    public final void method3277(boolean arg0, int arg1) {
        field7820++;
        if (this.field7842 == null) {
            return;
        }
        try {
            this.field7839.field5459 = arg1;
            this.field7839.method2380(65280, arg0 ? 2 : 3);
            this.field7839.method2408((byte) 103, 0);
            this.field7842.method142(4, this.field7839.field5518, 0, 0);
        } catch (IOException var4) {
            try {
                this.field7842.method140(-127);
            } catch (Exception var3) {
            }
            this.field7844 = -2;
            this.field7842 = null;
            this.field7845++;
        }
    }
}
