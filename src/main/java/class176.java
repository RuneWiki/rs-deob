import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class176 {

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Z")
    private boolean field2038 = false;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    private int field2051 = 32;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "J")
    private long field2034 = class164.method1038(8635);

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    private int field2056 = 0;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    private int field2060 = 0;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
    private int field2061 = 0;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "J")
    private long field2062 = 0L;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "[Ltf;")
    private class452[] field2057 = new class452[8];

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "J")
    private long field2064 = 0L;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
    private int field2058 = 0;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "[Ltf;")
    private class452[] field2067 = new class452[8];

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "Z")
    private boolean field2066 = true;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "Lcq;")
    public static class72 field2054 = new class72("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "Lcq;")
    public static class72 field2055 = new class72("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "B")
    public static byte field2065;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    private int field2059;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
    public int field2063;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "I")
    public int field2068;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Ltf;")
    private class452 field2045;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "[I")
    public int[] field2043;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILtf;)V")
    private final void method1103(int arg0, int arg1, class452 arg2) {
        field2046++;
        int var4 = arg0 >> 5;
        if (arg1 != 0) {
            field2054 = null;
        }
        class452 var5 = this.field2067[var4];
        if (var5 == null) {
            this.field2057[var4] = arg2;
        } else {
            var5.field6311 = arg2;
        }
        this.field2067[var4] = arg2;
        arg2.field6312 = arg0;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public void method180(int arg0) throws Exception {
        field2035++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)Ljp;")
    public static final class49 method1104(int arg0, boolean arg1) {
        field2036++;
        if (!arg1) {
            field2065 = 47;
        }
        class49 var2 = (class49) class433.field5917.method648(1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class122.field1386.method1794(5860, 5, arg0);
        class49 var4 = new class49();
        if (var3 != null) {
            var4.method275(99, new class242(var3));
        }
        class433.field5917.method643((long) arg0, var4, (byte) 122);
        return var4;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()I")
    public int method184() throws Exception {
        field2042++;
        return this.field2063;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "()V")
    public void method179() throws Exception {
        field2037++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public final synchronized void method1105(byte arg0) {
        if (arg0 != 37) {
            this.method1112((byte) -99);
        }
        field2039++;
        if (class367.field5011 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class367.field5011.field2549[var3] == this) {
                    class367.field5011.field2549[var3] = null;
                }
                if (class367.field5011.field2549[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class367.field5011.field2545 = true;
                while (class367.field5011.field2554) {
                    class219.method1330(50L, true);
                }
                class367.field5011 = null;
            }
        }
        this.method182();
        this.field2043 = null;
        this.field2038 = true;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
    public static void method1106(byte arg0) {
        field2055 = null;
        if (arg0 == 58) {
            field2054 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "()V")
    public void method182() {
        field2044++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)V")
    public static final void method1107(int arg0, byte arg1) {
        class280.field3629.method2286(arg0, (byte) 36);
        field2040++;
        int var2 = -126 / ((-arg1 - 13) / 50);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V")
    private final void method1108(int arg0, int arg1) {
        this.field2060 -= arg1;
        field2047++;
        if (this.field2060 < 0) {
            this.field2060 = 0;
        }
        if (this.field2045 != null) {
            this.field2045.method108(arg1);
        }
        if (arg0 != 21040) {
            this.method1114(-23);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lil;IIII)V")
    public static final void method1109(class42 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class184.method1147(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class43.field512) {
            class184.method1147(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class184.method1147(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class262.field3367) {
            class184.method1147(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class262.field3367) {
            class184.method1147(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class43.field512 && arg4 <= class262.field3367) {
            class184.method1147(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class184.method1147(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class43.field512 && arg4 > 0) {
            class184.method1147(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method185(Component arg0) throws Exception {
        field2049++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ltf;I)V")
    public final synchronized void method1110(class452 arg0, int arg1) {
        field2041++;
        if (arg1 > 39) {
            this.field2045 = arg0;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([II)V")
    private final void method1111(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class255.field3311) {
            var3 = arg1 << 1;
        }
        class114.method668(arg0, 0, var3);
        this.field2060 -= arg1;
        if (this.field2045 != null && this.field2060 <= 0) {
            this.field2060 += class247.field3267 >> 4;
            class320.method1998(-114, this.field2045);
            this.method1103(this.field2045.method482(), 0, this.field2045);
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
                        class452 var10 = null;
                        class452 var11 = this.field2057[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class185 var12 = var11.field6310;
                                if (var12 == null || var12.field2142 <= var8) {
                                    var11.field6313 = true;
                                    int var13 = var11.method107();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2142 += var13;
                                    }
                                    if (var4 >= this.field2051) {
                                        break label107;
                                    }
                                    class452 var14 = var11.method114();
                                    if (var14 != null) {
                                        int var15 = var11.field6312;
                                        while (var14 != null) {
                                            this.method1103(var15 * var14.method482() >> 8, 0, var14);
                                            var14 = var11.method109();
                                        }
                                    }
                                    class452 var16 = var11.field6311;
                                    var11.field6311 = null;
                                    if (var10 == null) {
                                        this.field2057[var7] = var16;
                                    } else {
                                        var10.field6311 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2067[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field6311;
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
                class452 var18 = this.field2057[var17];
                this.field2057[var17] = this.field2067[var17] = null;
                while (var18 != null) {
                    class452 var19 = var18.field6311;
                    var18.field6311 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2060 < 0) {
            this.field2060 = 0;
        }
        if (this.field2045 != null) {
            this.field2045.method112(arg0, 0, arg1);
        }
        this.field2034 = class164.method1038(8635);
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "()V")
    public void method183() throws Exception {
        field2052++;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)V")
    public final synchronized void method1112(byte arg0) {
        field2053++;
        this.field2066 = true;
        try {
            if (arg0 == -104) {
                this.method183();
            }
        } catch (Exception var2) {
            this.method182();
            this.field2064 = class164.method1038(8635) + 2000L;
        }
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(B)V")
    public final void method1113(byte arg0) {
        this.field2066 = true;
        int var2 = 45 % ((arg0 + 78) / 38);
        field2050++;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
    public final synchronized void method1114(int arg0) {
        if (arg0 != 12863) {
            this.method1112((byte) 33);
        }
        field2048++;
        if (this.field2038) {
            return;
        }
        long var2 = class164.method1038(8635);
        try {
            if (var2 > (this.field2034 + 500000L)) {
                this.field2034 = var2 - 500000L;
            }
            while ((this.field2034 + 5000L) < var2) {
                this.method1108(arg0 ^ 0x600F, 256);
                this.field2034 += (long) (256000 / class247.field3267);
            }
        } catch (Exception var7) {
            this.field2034 = var2;
        }
        if (this.field2043 == null) {
            return;
        }
        try {
            if (this.field2064 != 0L) {
                if (var2 < this.field2064) {
                    return;
                }
                this.method180(this.field2063);
                this.field2064 = 0L;
                this.field2066 = true;
            }
            int var4 = this.method184();
            if (this.field2056 - var4 > this.field2061) {
                this.field2061 = this.field2056 - var4;
            }
            int var5 = this.field2068 + this.field2059;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field2063) {
                this.field2063 += 1024;
                if (this.field2063 > 16384) {
                    this.field2063 = 16384;
                }
                this.method182();
                var4 = 0;
                this.method180(this.field2063);
                this.field2066 = true;
                if (var5 + 256 > this.field2063) {
                    var5 = this.field2063 - 256;
                    this.field2059 = var5 - this.field2068;
                }
            }
            while (var5 > var4) {
                this.method1111(this.field2043, 256);
                this.method179();
                var4 += 256;
            }
            if (var2 > this.field2062) {
                if (this.field2066) {
                    this.field2066 = false;
                } else if (this.field2061 == 0 && this.field2058 == 0) {
                    this.method182();
                    this.field2064 = var2 + 2000L;
                    return;
                } else {
                    this.field2059 = Math.min(this.field2058, this.field2061);
                    this.field2058 = this.field2061;
                }
                this.field2061 = 0;
                this.field2062 = var2 + 2000L;
            }
            this.field2056 = var4;
        } catch (Exception var6) {
            this.method182();
            this.field2064 = var2 + 2000L;
        }
    }
}
