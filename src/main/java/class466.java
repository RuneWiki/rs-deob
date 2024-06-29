import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class466 {

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "[I")
    private int[] field6953 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "[I")
    public static int[] field6957 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public static int field6949;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
    public static int field6959;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
    public static int field6960;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
    public static int field6963;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
    public static int field6964;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
    public static int field6965;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "Lbu;")
    public static class17 field6955;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "Ler;")
    public class68 field6951;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "[I")
    private int[] field6958;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "[S")
    private short[] field6950;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "[S")
    private short[] field6954;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "[S")
    private short[] field6956;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "[S")
    private short[] field6962;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
    public static final void method2762(byte arg0) {
        class457.field6847.method884(-18051);
        field6961++;
        for (int var1 = 0; var1 < 32; var1++) {
            class432.field6420[var1] = 0L;
        }
        int var2 = 0;
        if (arg0 <= 31) {
            method2767(true);
        }
        while (var2 < 32) {
            class443.field6618[var2] = 0L;
            var2++;
        }
        class528.field7793 = 0;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lcu;II)V")
    private final void method2763(class145 arg0, int arg1, int arg2) {
        if (arg1 <= 99) {
            return;
        }
        field6948++;
        if (arg2 == 1) {
            arg0.method1063((byte) -24);
        } else if (arg2 == 2) {
            int var4 = arg0.method1063((byte) -52);
            this.field6958 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6958[var5] = arg0.method1069((byte) -44);
            }
            return;
        } else if (arg2 != 3) {
            if (arg2 != 40) {
                if (arg2 == 41) {
                    int var6 = arg0.method1063((byte) 112);
                    this.field6954 = new short[var6];
                    this.field6956 = new short[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field6956[var7] = (short) arg0.method1069((byte) -112);
                        this.field6954[var7] = (short) arg0.method1069((byte) -13);
                    }
                } else if (arg2 >= 60 && arg2 < 70) {
                    this.field6953[arg2 - 60] = arg0.method1069((byte) -16);
                    return;
                }
                return;
            }
            int var8 = arg0.method1063((byte) -16);
            this.field6962 = new short[var8];
            this.field6950 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field6962[var9] = (short) arg0.method1069((byte) -117);
                this.field6950[var9] = (short) arg0.method1069((byte) -118);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(B)Lnd;")
    public final class380 method2764(byte arg0) {
        field6960++;
        class380[] var2 = new class380[5];
        int var3 = 0;
        if (arg0 <= 91) {
            field6952 = 85;
        }
        class17 var4 = this.field6951.field1171;
        synchronized (this.field6951.field1171) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field6953[var5] != -1) {
                    var2[var3++] = class410.method2492(0, true, this.field6951.field1171, this.field6953[var5]);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field5736 < 13) {
                var2[var6].method2369((byte) -127, 0);
            }
        }
        class380 var7 = new class380(var2, var3);
        if (this.field6962 != null) {
            for (int var8 = 0; var8 < this.field6962.length; var8++) {
                var7.method2363(this.field6962[var8], this.field6950[var8], (byte) -127);
            }
        }
        if (this.field6956 != null) {
            for (int var9 = 0; var9 < this.field6956.length; var9++) {
                var7.method2356((byte) 73, this.field6954[var9], this.field6956[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
    public static void method2765(int arg0) {
        field6955 = null;
        if (arg0 != 21697) {
            field6952 = -61;
        }
        field6957 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIII)V")
    public static final void method2766(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 0) {
            class28.method321(class268.field3872, arg2 ^ 0xFFFF9ABB);
            class433.field6428++;
        }
        field6964++;
        if (arg1 == 1) {
            class455.field6789++;
            class28.method321(class423.field6316, -5001);
        }
        class410.field6141.method1114(-1971649880, class380.field5726.method1584(arg2 ^ 0x76C2, 82) ? 1 : 0);
        class410.field6141.method1068((byte) -127, arg0 + class403.field6059);
        class410.field6141.method1095(arg2 ^ 0x76BD, class200.field2931 + arg3);
        class467.field6967 = arg3;
        if (arg2 != 30412) {
            method2765(110);
        }
        class308.field4710 = arg0;
        class100.field1648 = false;
        class482.method2866(84);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)Z")
    public static final boolean method2767(boolean arg0) {
        for (int var1 = class11.field196; var1 < class190.field2830; var1++) {
            class429[][] var2 = class380.field5761[var1];
            for (int var3 = -class369.field5579; var3 <= 0; var3++) {
                int var4 = class267.field3846 + var3;
                int var5 = class267.field3846 - var3;
                if (var4 >= class451.field6738 || var5 < class1.field2) {
                    for (int var6 = -class369.field5579; var6 <= 0; var6++) {
                        int var7 = class388.field5834 + var6;
                        int var8 = class388.field5834 - var6;
                        if (var4 >= class451.field6738) {
                            if (var7 >= class363.field5501) {
                                class429 var9 = var2[var4][var7];
                                if (var9 != null && var9.field6371) {
                                    class416.field6219 = arg0;
                                    class318.field4777.method323(var9, (byte) 88);
                                    class318.field4777.method329((byte) 91);
                                }
                            }
                            if (var8 < class252.field3602) {
                                class429 var10 = var2[var4][var8];
                                if (var10 != null && var10.field6371) {
                                    class416.field6219 = arg0;
                                    class318.field4777.method323(var10, (byte) 83);
                                    class318.field4777.method329((byte) 70);
                                }
                            }
                        }
                        if (var5 < class1.field2) {
                            if (var7 >= class363.field5501) {
                                class429 var11 = var2[var5][var7];
                                if (var11 != null && var11.field6371) {
                                    class416.field6219 = arg0;
                                    class318.field4777.method323(var11, (byte) 109);
                                    class318.field4777.method329((byte) 77);
                                }
                            }
                            if (var8 < class252.field3602) {
                                class429 var12 = var2[var5][var8];
                                if (var12 != null && var12.field6371) {
                                    class416.field6219 = arg0;
                                    class318.field4777.method323(var12, (byte) 63);
                                    class318.field4777.method329((byte) 120);
                                }
                            }
                        }
                        if (class68.field1179 == 0) {
                            if (class165.field2567) {
                                class318.field4777.method331(-66, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(Z)Lnd;")
    public final class380 method2768(boolean arg0) {
        field6965++;
        if (this.field6958 == null) {
            return null;
        }
        class380[] var2 = new class380[this.field6958.length];
        class17 var3 = this.field6951.field1171;
        synchronized (this.field6951.field1171) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field6958.length) {
                    break;
                }
                var2[var4] = class410.method2492(0, true, this.field6951.field1171, this.field6958[var4]);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field6958.length; var5++) {
            if (var2[var5].field5736 < 13) {
                var2[var5].method2369((byte) 112, 0);
            }
        }
        if (arg0) {
            return null;
        }
        class380 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class380(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field6962 != null) {
            for (int var7 = 0; var7 < this.field6962.length; var7++) {
                var6.method2363(this.field6962[var7], this.field6950[var7], (byte) -126);
            }
        }
        if (this.field6956 != null) {
            for (int var8 = 0; var8 < this.field6956.length; var8++) {
                var6.method2356((byte) 73, this.field6954[var8], this.field6956[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lcu;I)V")
    public final void method2769(class145 arg0, int arg1) {
        field6963++;
        while (true) {
            int var3 = arg0.method1063((byte) -96);
            if (var3 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    this.method2770(-83);
                    return;
                }
            }
            this.method2763(arg0, 124, var3);
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)Z")
    public final boolean method2770(int arg0) {
        field6949++;
        boolean var2 = true;
        class17 var3 = this.field6951.field1171;
        synchronized (this.field6951.field1171) {
            for (int var4 = arg0; var4 < 5; var4++) {
                if (this.field6953[var4] != -1 && !this.field6951.field1171.method137(0, this.field6953[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)Z")
    public final boolean method2771(int arg0) {
        field6959++;
        if (this.field6958 == null) {
            return true;
        }
        boolean var2 = true;
        class17 var3 = this.field6951.field1171;
        synchronized (this.field6951.field1171) {
            for (int var4 = arg0; var4 < this.field6958.length; var4++) {
                if (!this.field6951.field1171.method137(arg0, this.field6958[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }
}
