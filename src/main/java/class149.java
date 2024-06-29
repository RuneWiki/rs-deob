import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class149 {

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "Z")
    private boolean field2035 = false;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    private int field2047 = 32;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "J")
    private long field2054 = class10.method51(-3183);

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "J")
    private long field2062 = 0L;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
    private int field2064 = 0;

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
    private int field2063 = 0;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "J")
    private long field2065 = 0L;

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "[Loe;")
    private class11[] field2067 = new class11[8];

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "[Loe;")
    private class11[] field2066 = new class11[8];

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    private int field2070 = 0;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
    private int field2071 = 0;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "Z")
    private boolean field2069 = true;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "Lrc;")
    public static class108 field2039 = new class108(83, 5);

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "[I")
    public static int[] field2055 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "Z")
    public static boolean field2059 = true;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "Lrc;")
    public static class108 field2057 = new class108(87, 12);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
    private int field2060;

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "I")
    public int field2061;

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "I")
    public int field2068;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "Loe;")
    private class11 field2037;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "[I")
    public int[] field2040;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)V")
    public static final void method1055(byte arg0, int arg1) {
        if (arg0 < 43) {
            method1062(32);
        }
        field2034++;
        class334 var2 = class352.method2172(arg1, 14, 16711935);
        var2.method2099(true);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
    public final synchronized void method1056(boolean arg0) {
        this.field2069 = true;
        if (arg0) {
            this.field2054 = 52L;
        }
        field2053++;
        try {
            this.method1060();
        } catch (Exception var2) {
            this.method1057();
            this.field2062 = class10.method51(-3183) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "()V")
    public void method1057() {
        field2046++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public final synchronized void method1058(int arg0) {
        if (class482.field6821 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class482.field6821.field1905[var3] == this) {
                    class482.field6821.field1905[var3] = null;
                }
                if (class482.field6821.field1905[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class482.field6821.field1906 = true;
                while (class482.field6821.field1907) {
                    class89.method752(arg0 ^ 0x4, 50L);
                }
                class482.field6821 = null;
            }
        }
        field2051++;
        this.method1057();
        this.field2035 = true;
        if (arg0 != 4) {
            this.method1070(78, -15);
        }
        this.field2040 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public final synchronized void method1059(byte arg0) {
        field2042++;
        if (this.field2035) {
            return;
        }
        if (arg0 != 9) {
            method1055((byte) -49, 35);
        }
        long var2 = class10.method51(-3183);
        try {
            if (this.field2054 + 500000L < var2) {
                this.field2054 = var2 - 500000L;
            }
            while ((this.field2054 + 5000L) < var2) {
                this.method1070(256, 87);
                this.field2054 += (long) (256000 / class192.field2868);
            }
        } catch (Exception var7) {
            this.field2054 = var2;
        }
        if (this.field2040 == null) {
            return;
        }
        try {
            if (this.field2062 != 0L) {
                if (var2 < this.field2062) {
                    return;
                }
                this.method1068(this.field2061);
                this.field2069 = true;
                this.field2062 = 0L;
            }
            int var4 = this.method1063();
            if (this.field2064 < (this.field2071 - var4)) {
                this.field2064 = this.field2071 - var4;
            }
            int var5 = this.field2068 + this.field2060;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field2061) {
                this.field2061 += 1024;
                if (this.field2061 > 16384) {
                    this.field2061 = 16384;
                }
                this.method1057();
                var4 = 0;
                this.method1068(this.field2061);
                if (var5 + 256 > this.field2061) {
                    var5 = this.field2061 - 256;
                    this.field2060 = var5 - this.field2068;
                }
                this.field2069 = true;
            }
            while (var4 < var5) {
                this.method1071(this.field2040, 256);
                this.method1061();
                var4 += 256;
            }
            if (var2 > this.field2065) {
                if (this.field2069) {
                    this.field2069 = false;
                } else if (this.field2064 == 0 && this.field2070 == 0) {
                    this.method1057();
                    this.field2062 = var2 + 2000L;
                    return;
                } else {
                    this.field2060 = Math.min(this.field2070, this.field2064);
                    this.field2070 = this.field2064;
                }
                this.field2064 = 0;
                this.field2065 = var2 + 2000L;
            }
            this.field2071 = var4;
        } catch (Exception var6) {
            this.method1057();
            this.field2062 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "()V")
    public void method1060() throws Exception {
        field2043++;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "()V")
    public void method1061() throws Exception {
        field2050++;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)Z")
    public static final boolean method1062(int arg0) {
        if (arg0 != 9104) {
            field2039 = null;
        }
        field2038++;
        return class480.field6799 != class389.field5379 || class255.field3661 >= 2;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "()I")
    public int method1063() throws Exception {
        field2052++;
        return this.field2061;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method1064(Component arg0) throws Exception {
        field2049++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Loe;IB)V")
    private final void method1065(class11 arg0, int arg1, byte arg2) {
        int var4 = -51 / ((arg2 + 64) / 59);
        field2045++;
        int var5 = arg1 >> 5;
        class11 var6 = this.field2066[var5];
        if (var6 == null) {
            this.field2067[var5] = arg0;
        } else {
            var6.field77 = arg0;
        }
        this.field2066[var5] = arg0;
        arg0.field76 = arg1;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
    public static void method1066(byte arg0) {
        field2039 = null;
        int var1 = -34 / ((arg0 + 4) / 41);
        field2055 = null;
        field2057 = null;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)V")
    public final void method1067(byte arg0) {
        if (arg0 == 107) {
            this.field2069 = true;
            field2041++;
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
    public void method1068(int arg0) throws Exception {
        field2044++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Loe;B)V")
    public final synchronized void method1069(class11 arg0, byte arg1) {
        if (arg1 < -102) {
            field2036++;
            this.field2037 = arg0;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)V")
    private final void method1070(int arg0, int arg1) {
        if (arg1 != 87) {
            return;
        }
        field2048++;
        this.field2063 -= arg0;
        if (this.field2063 < 0) {
            this.field2063 = 0;
        }
        if (this.field2037 != null) {
            this.field2037.method58(arg0);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "([II)V")
    private final void method1071(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class217.field3139) {
            var3 = arg1 << 1;
        }
        class214.method1450(arg0, 0, var3);
        this.field2063 -= arg1;
        if (this.field2037 != null && this.field2063 <= 0) {
            this.field2063 += class192.field2868 >> 4;
            class137.method1008((byte) -84, this.field2037);
            this.method1065(this.field2037, this.field2037.method52(), (byte) -128);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class11 var10 = null;
                        class11 var11 = this.field2067[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class231 var12 = var11.field74;
                                if (var12 == null || var12.field3385 <= var8) {
                                    var11.field75 = true;
                                    int var13 = var11.method54();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3385 += var13;
                                    }
                                    if (var4 >= this.field2047) {
                                        break label107;
                                    }
                                    class11 var14 = var11.method53();
                                    if (var14 != null) {
                                        int var15 = var11.field76;
                                        while (var14 != null) {
                                            this.method1065(var14, var15 * var14.method52() >> 8, (byte) -126);
                                            var14 = var11.method55();
                                        }
                                    }
                                    class11 var16 = var11.field77;
                                    var11.field77 = null;
                                    if (var10 == null) {
                                        this.field2067[var7] = var16;
                                    } else {
                                        var10.field77 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2066[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field77;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class11 var18 = this.field2067[var17];
                this.field2067[var17] = this.field2066[var17] = null;
                while (var18 != null) {
                    class11 var19 = var18.field77;
                    var18.field77 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2063 < 0) {
            this.field2063 = 0;
        }
        if (this.field2037 != null) {
            this.field2037.method56(arg0, 0, arg1);
        }
        this.field2054 = class10.method51(-3183);
    }
}
