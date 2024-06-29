import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public abstract class class558 extends class108 {

    @OriginalMember(owner = "client!oda", name = "q", descriptor = "I")
    public int field7889 = 0;

    @OriginalMember(owner = "client!oda", name = "k", descriptor = "I")
    public int field7883 = 2;

    @OriginalMember(owner = "client!oda", name = "u", descriptor = "Z")
    public boolean field7893 = false;

    @OriginalMember(owner = "client!oda", name = "n", descriptor = "I")
    public int field7886 = 127;

    @OriginalMember(owner = "client!oda", name = "r", descriptor = "I")
    public int field7890 = 0;

    @OriginalMember(owner = "client!oda", name = "l", descriptor = "Z")
    public boolean field7884 = true;

    @OriginalMember(owner = "client!oda", name = "o", descriptor = "Z")
    public boolean field7887 = true;

    @OriginalMember(owner = "client!oda", name = "v", descriptor = "I")
    public int field7894 = 0;

    @OriginalMember(owner = "client!oda", name = "s", descriptor = "Z")
    public boolean field7891 = true;

    @OriginalMember(owner = "client!oda", name = "L", descriptor = "I")
    public int field7910 = 0;

    @OriginalMember(owner = "client!oda", name = "C", descriptor = "Z")
    public boolean field7901 = true;

    @OriginalMember(owner = "client!oda", name = "R", descriptor = "Z")
    public boolean field7916 = true;

    @OriginalMember(owner = "client!oda", name = "G", descriptor = "Z")
    public boolean field7905 = false;

    @OriginalMember(owner = "client!oda", name = "w", descriptor = "Z")
    public boolean field7895 = true;

    @OriginalMember(owner = "client!oda", name = "U", descriptor = "Z")
    public boolean field7919 = true;

    @OriginalMember(owner = "client!oda", name = "z", descriptor = "Z")
    public boolean field7898 = true;

    @OriginalMember(owner = "client!oda", name = "J", descriptor = "Z")
    public boolean field7908 = true;

    @OriginalMember(owner = "client!oda", name = "T", descriptor = "I")
    public int field7918 = 2;

    @OriginalMember(owner = "client!oda", name = "A", descriptor = "I")
    public int field7899 = 1;

    @OriginalMember(owner = "client!oda", name = "t", descriptor = "I")
    public int field7892 = 3;

    @OriginalMember(owner = "client!oda", name = "F", descriptor = "I")
    public int field7904 = 3;

    @OriginalMember(owner = "client!oda", name = "m", descriptor = "I")
    public int field7885 = 0;

    @OriginalMember(owner = "client!oda", name = "V", descriptor = "I")
    public int field7920 = 0;

    @OriginalMember(owner = "client!oda", name = "X", descriptor = "Z")
    public boolean field7922 = true;

    @OriginalMember(owner = "client!oda", name = "x", descriptor = "I")
    public int field7896 = 2;

    @OriginalMember(owner = "client!oda", name = "Y", descriptor = "Z")
    public boolean field7923 = false;

    @OriginalMember(owner = "client!oda", name = "D", descriptor = "Z")
    public boolean field7902 = true;

    @OriginalMember(owner = "client!oda", name = "p", descriptor = "I")
    public int field7888 = 127;

    @OriginalMember(owner = "client!oda", name = "Z", descriptor = "I")
    public int field7924 = 0;

    @OriginalMember(owner = "client!oda", name = "ab", descriptor = "I")
    public int field7925 = 2;

    @OriginalMember(owner = "client!oda", name = "W", descriptor = "I")
    public int field7921 = 127;

    @OriginalMember(owner = "client!oda", name = "N", descriptor = "Z")
    public boolean field7912 = true;

    @OriginalMember(owner = "client!oda", name = "Q", descriptor = "Loh;")
    public static class549 field7915 = null;

    @OriginalMember(owner = "client!oda", name = "H", descriptor = "I")
    public static int field7906;

    @OriginalMember(owner = "client!oda", name = "I", descriptor = "I")
    public static int field7907;

    @OriginalMember(owner = "client!oda", name = "K", descriptor = "I")
    public static int field7909;

    @OriginalMember(owner = "client!oda", name = "M", descriptor = "I")
    public static int field7911;

    @OriginalMember(owner = "client!oda", name = "O", descriptor = "I")
    public static int field7913;

    @OriginalMember(owner = "client!oda", name = "P", descriptor = "I")
    public static int field7914;

    @OriginalMember(owner = "client!oda", name = "S", descriptor = "I")
    public static int field7917;

    @OriginalMember(owner = "client!oda", name = "bb", descriptor = "I")
    public static int field7926;

    @OriginalMember(owner = "client!oda", name = "y", descriptor = "Z")
    public boolean field7897;

    @OriginalMember(owner = "client!oda", name = "B", descriptor = "Z")
    public boolean field7900;

    @OriginalMember(owner = "client!oda", name = "E", descriptor = "Z")
    public boolean field7903;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(ILaj;)V", line = 6)
    public static final void method3137(int arg0, class261 arg1) {
        int var2 = 0;
        if (arg0 < 93) {
            method3144((byte) -76);
        }
        while (var2 < class429.field6246) {
            int var3 = class291.field4212[var2];
            class400 var4 = class39.field536[var3];
            int var5 = arg1.method1738(255);
            if ((var5 & 0x20) != 0) {
                var5 += arg1.method1738(255) << 8;
            }
            if ((var5 & 0x4000) != 0) {
                var5 += arg1.method1738(255) << 16;
            }
            class137.method1042(119, arg1, var4, var5, var3);
            var2++;
        }
        field7914++;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZBI)V", line = 50)
    public final void method3138(boolean arg0, byte arg1, int arg2) {
        if (arg1 > -17) {
            this.field7885 = -21;
        }
        field7913++;
        if (class141.method1053(arg2, 125)) {
            this.field7897 = arg0;
        } else {
            this.field7900 = arg0;
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(III)V", line = 76)
    public final void method3139(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.method3138(false, (byte) 100, 65);
        }
        field7926++;
        if (class141.method1053(arg1, 127)) {
            this.field7896 = arg2;
        } else {
            this.field7910 = arg2;
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(II)Z", line = 91)
    public final boolean method3140(int arg0, int arg1) {
        if (arg1 != 2) {
            this.method3140(55, -117);
        }
        field7907++;
        return class141.method1053(arg0, arg1 + 124) ? this.field7897 : this.field7900;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lco;I)V", line = 121)
    public final void method3141(class268 arg0, int arg1) {
        field7911++;
        arg0.method1710(18, 82);
        arg0.method1710(this.field7904, 126);
        arg0.method1710(this.field7887 ? 1 : 0, 120);
        arg0.method1710(this.field7908 ? 1 : 0, 71);
        arg0.method1710(this.field7902 ? 1 : 0, 50);
        arg0.method1710(this.field7912 ? 1 : 0, arg1 ^ 0x1924);
        if (arg1 != 6419) {
            this.field7891 = true;
        }
        arg0.method1710(0, arg1 - 6298);
        arg0.method1710(this.field7884 ? 1 : 0, 127);
        arg0.method1710(this.field7891 ? 1 : 0, arg1 - 6408);
        arg0.method1710(this.field7922 ? 1 : 0, 42);
        arg0.method1710(this.field7896, arg1 ^ 0x1934);
        arg0.method1710(this.field7910, 26);
        arg0.method1710(this.field7897 ? 1 : 0, 61);
        arg0.method1710(this.field7900 ? 1 : 0, arg1 - 6340);
        arg0.method1710(this.field7898 ? 1 : 0, 126);
        arg0.method1710(this.field7919 ? 1 : 0, 70);
        arg0.method1710(this.field7890, 74);
        arg0.method1710(this.field7916 ? 1 : 0, 36);
        arg0.method1710(this.field7888, 107);
        arg0.method1710(this.field7921, 85);
        arg0.method1710(this.field7886, arg1 - 6307);
        arg0.method1699(true, this.field7920);
        arg0.method1699(true, this.field7924);
        arg0.method1710(class111.method924(-106), arg1 ^ 0x1952);
        arg0.method1702(this.field7894, false);
        arg0.method1710(this.field7925, 103);
        arg0.method1710(this.field7923 ? 1 : 0, 110);
        arg0.method1710(this.field7903 ? 1 : 0, 122);
        arg0.method1710(this.field7885, 74);
        arg0.method1710(this.field7905 ? 1 : 0, 43);
        arg0.method1710(this.field7901 ? 1 : 0, arg1 - 6317);
        arg0.method1710(this.field7899, 30);
        arg0.method1710(this.field7895 ? 1 : 0, 108);
        arg0.method1710(this.field7918, 118);
        arg0.method1710(this.field7883, 25);
        arg0.method1710(this.field7893 ? 1 : 0, arg1 - 6296);
        arg0.method1710(this.field7892, arg1 - 6374);
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "([ILjk;[I[IB)V", line = 190)
    public static final void method3142(int[] arg0, class170 arg1, int[] arg2, int[] arg3, byte arg4) {
        field7909++;
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var7 = arg3[var5];
            int var8 = arg0[var5];
            int var9 = arg2[var5];
            int var10 = 0;
            while (var8 != 0 && arg1.field1504.length > var10) {
                if ((var8 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg1.field1504[var10] = null;
                    } else {
                        class439 var11 = class49.field739.method2297((byte) 110, var7);
                        int var12 = var11.field6396;
                        class527 var13 = arg1.field1504[var10];
                        if (var13 != null) {
                            if (var13.field7335 == var7) {
                                if (var12 == 0) {
                                    var13 = arg1.field1504[var10] = null;
                                } else if (var12 == 1) {
                                    var13.field7331 = 0;
                                    var13.field7330 = 0;
                                    var13.field7328 = 0;
                                    var13.field7327 = var9;
                                    var13.field7332 = 1;
                                    class402.method2456(false, arg1.field5109, 0, var11, (byte) -23, arg1.field5108, arg1.field5116);
                                } else if (var12 == 2) {
                                    var13.field7328 = 0;
                                }
                            } else if (var11.field6408 >= class49.field739.method2297((byte) 107, var13.field7335).field6408) {
                                var13 = arg1.field1504[var10] = null;
                            }
                        }
                        if (var13 == null) {
                            class527 var14 = arg1.field1504[var10] = new class527();
                            var14.field7331 = 0;
                            var14.field7328 = 0;
                            var14.field7335 = var7;
                            var14.field7330 = 0;
                            var14.field7327 = var9;
                            var14.field7332 = 1;
                            class402.method2456(false, arg1.field5109, 0, var11, (byte) -23, arg1.field5108, arg1.field5116);
                        }
                    }
                }
                var10++;
                var8 >>>= 0x1;
            }
        }
        int var6 = 18 / ((arg4 - 54) / 61);
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(II)I", line = 294)
    public final int method3143(int arg0, int arg1) {
        if (arg1 != 0) {
            method3144((byte) 1);
        }
        field7917++;
        return class141.method1053(arg0, -112) ? this.field7896 : this.field7910;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(B)V", line = 314)
    public static void method3144(byte arg0) {
        if (arg0 >= -35) {
            method3137(-11, null);
        }
        field7915 = null;
    }
}
