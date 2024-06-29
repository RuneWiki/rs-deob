import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class135 {

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Lma;")
    private class274 field2241 = new class274();

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Lma;")
    private class274 field2243 = new class274();

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "Lma;")
    private class274 field2244 = new class274();

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "Lma;")
    private class274 field2246 = new class274();

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "Lpb;")
    private class70 field2250 = new class70(4);

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "I")
    public volatile int field2253 = 0;

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "I")
    public volatile int field2255 = 0;

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "B")
    private byte field2254 = 0;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "Lpb;")
    private class70 field2252 = new class70(8);

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lve;")
    public static class255 field2232 = class87.method607(80, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Lve;")
    public static class255 field2236 = class87.method607(51, "lila:");

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "Lve;")
    public static class255 field2245 = null;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
    private int field2251;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "J")
    private long field2249;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "Ltk;")
    private class239 field2248;

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "Lcg;")
    private class37 field2256;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)I", line = 6)
    public final int method1003(int arg0) {
        field2228++;
        if (arg0 != 0) {
            this.method1008(52);
        }
        return this.field2241.method1916((byte) 92) + this.field2243.method1916((byte) 106);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZIBI)Lcg;", line = 19)
    public final class37 method1004(int arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        long var6 = (long) ((arg2 << 16) + arg0);
        field2237++;
        class37 var8 = new class37();
        if (arg4 != 3) {
            this.method1017((byte) -21);
        }
        var8.field4903 = var6;
        var8.field3739 = arg1;
        var8.field571 = arg3;
        if (arg1) {
            if (this.method1003(arg4 ^ 0x3) >= 20) {
                throw new RuntimeException();
            }
            this.field2241.method1923(-8121, var8);
        } else if (this.method1016(arg4 ^ 0xFFFFFFBD) < 20) {
            this.field2244.method1923(-8121, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)Z", line = 66)
    public final boolean method1005(int arg0) {
        if (this.field2248 != null) {
            long var2 = class218.method1541(88);
            int var4 = (int) (var2 - this.field2249);
            this.field2249 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field2251 += var4;
            if (this.field2251 > 30000) {
                try {
                    this.field2248.method1650((byte) 15);
                } catch (Exception var30) {
                }
                this.field2248 = null;
            }
        }
        if (arg0 != 17636) {
            return true;
        }
        field2247++;
        if (this.field2248 == null) {
            return this.method1003(0) == 0 && this.method1016(-61) == 0;
        }
        try {
            for (class37 var6 = (class37) this.field2241.method1919(false); var6 != null; var6 = (class37) this.field2241.method1917(arg0 - 17637)) {
                this.field2250.field1068 = 0;
                this.field2250.method463(false, 1);
                this.field2250.method433((int) var6.field4903, false);
                this.field2248.method1653(0, this.field2250.field1066, (byte) 88, 4);
                this.field2243.method1923(-8121, var6);
            }
            for (class37 var7 = (class37) this.field2244.method1919(false); var7 != null; var7 = (class37) this.field2244.method1917(-1)) {
                this.field2250.field1068 = 0;
                this.field2250.method463(false, 0);
                this.field2250.method433((int) var7.field4903, false);
                this.field2248.method1653(0, this.field2250.field1066, (byte) -85, 4);
                this.field2246.method1923(arg0 - 25757, var7);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field2248.method1652(-13301);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field2251 = 0;
                byte var10 = 0;
                if (this.field2256 == null) {
                    var10 = 8;
                } else if (this.field2256.field579 == 0) {
                    var10 = 1;
                }
                if (var10 <= 0) {
                    int var11 = this.field2256.field567.field1066.length - this.field2256.field571;
                    int var12 = 512 - this.field2256.field579;
                    if (var12 > var11 - this.field2256.field567.field1068) {
                        var12 = var11 - this.field2256.field567.field1068;
                    }
                    if (var12 > var9) {
                        var12 = var9;
                    }
                    this.field2248.method1651(var12, this.field2256.field567.field1066, -1, this.field2256.field567.field1068);
                    if (this.field2254 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field2256.field567.field1066[this.field2256.field567.field1068 + var13] = (byte) class127.method943(this.field2256.field567.field1066[this.field2256.field567.field1068 + var13], this.field2254);
                        }
                    }
                    this.field2256.field567.field1068 += var12;
                    this.field2256.field579 += var12;
                    if (this.field2256.field567.field1068 == var11) {
                        this.field2256.method2024((byte) 91);
                        this.field2256.field3742 = false;
                        this.field2256 = null;
                    } else if (this.field2256.field579 == 512) {
                        this.field2256.field579 = 0;
                    }
                } else {
                    int var14 = var10 - this.field2252.field1068;
                    if (var9 < var14) {
                        var14 = var9;
                    }
                    this.field2248.method1651(var14, this.field2252.field1066, -1, this.field2252.field1068);
                    if (this.field2254 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field2252.field1066[this.field2252.field1068 + var15] = (byte) class127.method943(this.field2252.field1066[this.field2252.field1068 + var15], this.field2254);
                        }
                    }
                    this.field2252.field1068 += var14;
                    if (var10 <= this.field2252.field1068) {
                        if (this.field2256 == null) {
                            this.field2252.field1068 = 0;
                            int var16 = this.field2252.method481(0);
                            int var17 = this.field2252.method423(arg0 - 17381);
                            int var18 = this.field2252.method481(0);
                            int var19 = this.field2252.method469(96);
                            int var20 = var18 & 0x7F;
                            boolean var21 = (var18 & 0x80) != 0;
                            Object var22 = null;
                            long var23 = (long) ((var16 << 16) + var17);
                            class37 var25;
                            if (var21) {
                                for (var25 = (class37) this.field2246.method1919(false); var25 != null && var25.field4903 != var23; var25 = (class37) this.field2246.method1917(arg0 - 17637)) {
                                }
                            } else {
                                for (var25 = (class37) this.field2243.method1919(false); var25 != null && var25.field4903 != var23; var25 = (class37) this.field2243.method1917(-1)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            this.field2256 = var25;
                            int var26 = var20 == 0 ? 5 : 9;
                            this.field2256.field567 = new class70(var19 + var26 + this.field2256.field571);
                            this.field2256.field567.method463(false, var20);
                            this.field2256.field567.method436(var19, arg0 ^ 0xFFFFF298);
                            this.field2256.field579 = 8;
                            this.field2252.field1068 = 0;
                        } else if (this.field2256.field579 != 0) {
                            throw new IOException();
                        } else if (this.field2252.field1066[0] == -1) {
                            this.field2256.field579 = 1;
                            this.field2252.field1068 = 0;
                        } else {
                            this.field2256 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field2248.method1650((byte) -105);
            } catch (Exception var29) {
            }
            this.field2255++;
            this.field2248 = null;
            return this.method1003(0) == 0 && this.method1016(-111) == 0;
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V", line = 338)
    private final void method1006(int arg0) {
        field2231++;
        if (this.field2248 == null) {
            return;
        }
        try {
            if (arg0 > -2) {
                this.field2244 = (class274) null;
            }
            this.field2250.field1068 = 0;
            this.field2250.method463(false, 6);
            this.field2250.method433(3, false);
            this.field2248.method1653(0, this.field2250.field1066, (byte) 122, 4);
        } catch (IOException var5) {
            try {
                this.field2248.method1650((byte) 52);
            } catch (Exception var4) {
            }
            this.field2255++;
            this.field2248 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V", line = 364)
    public final void method1007(byte arg0) {
        if (arg0 <= 88) {
            this.method1003(-91);
        }
        field2242++;
        if (this.field2248 != null) {
            this.field2248.method1650((byte) 2);
        }
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)Z", line = 377)
    public final boolean method1008(int arg0) {
        field2238++;
        if (arg0 == -21) {
            return this.method1016(arg0 - 85) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V", line = 392)
    public final void method1009(int arg0) {
        field2229++;
        this.field2253++;
        this.field2254 = (byte) ((int) (Math.random() * (double) arg0 + 1.0D));
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V", line = 405)
    public static final void method1010(int arg0, int arg1, int arg2) {
        class255.field4318.method1523(22260, 69);
        class255.field4318.method438(arg2, 255);
        if (arg1 == 4) {
            field2235++;
            class255.field4318.method443((byte) 122, arg0);
            class137.field2297++;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ltk;ZI)V", line = 422)
    public final void method1011(class239 arg0, boolean arg1, int arg2) {
        field2227++;
        if (this.field2248 != null) {
            try {
                this.field2248.method1650((byte) 91);
            } catch (Exception var11) {
            }
            this.field2248 = null;
        }
        this.field2248 = arg0;
        this.method1006(-79);
        if (arg2 >= -107) {
            return;
        }
        this.method1013(2, arg1);
        this.field2256 = null;
        this.field2252.field1068 = 0;
        while (true) {
            class37 var5 = (class37) this.field2243.method1920((byte) 11);
            if (var5 == null) {
                while (true) {
                    class37 var6 = (class37) this.field2246.method1920((byte) 11);
                    if (var6 == null) {
                        if (this.field2254 != 0) {
                            try {
                                this.field2250.field1068 = 0;
                                this.field2250.method463(false, 4);
                                this.field2250.method463(false, this.field2254);
                                this.field2250.method462(0, (byte) -61);
                                this.field2248.method1653(0, this.field2250.field1066, (byte) 127, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field2248.method1650((byte) -109);
                                } catch (Exception var9) {
                                }
                                this.field2248 = null;
                                this.field2255++;
                            }
                        }
                        this.field2251 = 0;
                        this.field2249 = class218.method1541(-57);
                        return;
                    }
                    this.field2244.method1923(-8121, var6);
                }
            }
            this.field2241.method1923(-8121, var5);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILve;BLve;)V", line = 492)
    public static final void method1012(int arg0, class255 arg1, byte arg2, class255 arg3) {
        class79.field1284 = arg0;
        class49.field731 = arg3;
        field2234++;
        class49.field730 = arg1;
        if (class49.field731.method1752(true, class49.field728) || class49.field730.method1752(true, class49.field728)) {
            class284.field4886 = 3;
        } else if (class25.field386 == -1) {
            class287.field4922 = 0;
            class284.field4886 = -3;
            class114.field1948 = 1;
            class70 var4 = new class70(128);
            var4.method463(false, 10);
            var4.method462((int) (Math.random() * 99999.0D), (byte) -61);
            var4.method462(515, (byte) -61);
            var4.method449(16711680, class49.field731.method1764((byte) -128));
            var4.method436((int) (Math.random() * 9.9999999E7D), -18820);
            var4.method483(-99755000, class49.field730);
            var4.method436((int) (Math.random() * 9.9999999E7D), -18820);
            var4.method452(class206.field3536, true, class54.field852);
            if (arg2 <= -49) {
                class255.field4318.field1068 = 0;
                class255.field4318.method463(false, 178);
                class255.field4318.method463(false, var4.field1068);
                class255.field4318.method484((byte) -90, 0, var4.field1066, var4.field1068);
            }
        } else {
            class261.method1817((byte) 30);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZ)V", line = 548)
    public final void method1013(int arg0, boolean arg1) {
        field2233++;
        if (arg0 != 2 || this.field2248 == null) {
            return;
        }
        try {
            this.field2250.field1068 = 0;
            this.field2250.method463(false, arg1 ? 2 : 3);
            this.field2250.method433(0, false);
            this.field2248.method1653(0, this.field2250.field1066, (byte) -56, 4);
        } catch (IOException var6) {
            try {
                this.field2248.method1650((byte) 122);
            } catch (Exception var5) {
            }
            this.field2255++;
            this.field2248 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V", line = 575)
    public static void method1014(int arg0) {
        field2232 = null;
        field2245 = null;
        if (arg0 != 15863) {
            field2236 = (class255) null;
        }
        field2236 = null;
    }

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)V", line = 596)
    public final void method1015(int arg0) {
        field2239++;
        if (this.field2248 == null) {
            return;
        }
        try {
            this.field2250.field1068 = 0;
            this.field2250.method463(false, 7);
            this.field2250.method433(arg0, false);
            this.field2248.method1653(0, this.field2250.field1066, (byte) -105, 4);
        } catch (IOException var5) {
            try {
                this.field2248.method1650((byte) 117);
            } catch (Exception var4) {
            }
            this.field2255++;
            this.field2248 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "(I)I", line = 629)
    private final int method1016(int arg0) {
        field2230++;
        return arg0 > -6 ? 20 : this.field2244.method1916((byte) 35) + this.field2246.method1916((byte) -120);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)Z", line = 650)
    public final boolean method1017(byte arg0) {
        field2240++;
        if (arg0 != -27) {
            this.method1009(53);
        }
        return this.method1003(arg0 ^ -27) >= 20;
    }
}
