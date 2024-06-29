import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class359 {

    @OriginalMember(owner = "client!ho", name = "t", descriptor = "Lrh;")
    private class69 field5080 = new class69();

    @OriginalMember(owner = "client!ho", name = "w", descriptor = "Lrh;")
    private class69 field5083 = new class69();

    @OriginalMember(owner = "client!ho", name = "A", descriptor = "Lrh;")
    private class69 field5087 = new class69();

    @OriginalMember(owner = "client!ho", name = "B", descriptor = "Lrh;")
    private class69 field5088 = new class69();

    @OriginalMember(owner = "client!ho", name = "F", descriptor = "Ltq;")
    private class250 field5092 = new class250(4);

    @OriginalMember(owner = "client!ho", name = "G", descriptor = "B")
    private byte field5093 = 0;

    @OriginalMember(owner = "client!ho", name = "J", descriptor = "I")
    public volatile int field5095 = 0;

    @OriginalMember(owner = "client!ho", name = "K", descriptor = "I")
    public volatile int field5096 = 0;

    @OriginalMember(owner = "client!ho", name = "I", descriptor = "Ltq;")
    private class250 field5094 = new class250(8);

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
    public static int field5079 = 0;

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "[I")
    public static int[] field5075 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "Lmk;")
    public static class154 field5068 = new class154();

    @OriginalMember(owner = "client!ho", name = "x", descriptor = "[I")
    public static int[] field5084 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!ho", name = "z", descriptor = "Z")
    public static volatile boolean field5086 = true;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!ho", name = "u", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!ho", name = "v", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!ho", name = "y", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!ho", name = "D", descriptor = "I")
    private int field5090;

    @OriginalMember(owner = "client!ho", name = "C", descriptor = "J")
    private long field5089;

    @OriginalMember(owner = "client!ho", name = "E", descriptor = "Lqp;")
    private class278 field5091;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "Lok;")
    public static class60 field5072;

    @OriginalMember(owner = "client!ho", name = "L", descriptor = "Lr;")
    private class62 field5097;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)Z")
    public final boolean method2185(byte arg0) {
        field5076++;
        if (arg0 == -5) {
            return this.method2198(2) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIZBZ)Lr;")
    public final class62 method2186(int arg0, int arg1, boolean arg2, byte arg3, boolean arg4) {
        field5085++;
        long var6 = (long) ((arg1 << 16) + arg0);
        if (arg4) {
            this.field5095 = 23;
        }
        class62 var8 = new class62();
        var8.field2365 = var6;
        var8.field1700 = arg2;
        var8.field630 = arg3;
        if (arg2) {
            if (this.method2194(2) >= 20) {
                throw new RuntimeException();
            }
            this.field5080.method393((byte) 120, var8);
        } else if (this.method2198(2) < 20) {
            this.field5087.method393((byte) 96, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lqp;BZ)V")
    public final void method2187(class278 arg0, byte arg1, boolean arg2) {
        int var4 = 68 % ((arg1 + 14) / 40);
        if (this.field5091 != null) {
            try {
                this.field5091.method1538((byte) 5);
            } catch (Exception var9) {
            }
            this.field5091 = null;
        }
        field5061++;
        this.field5091 = arg0;
        this.method2188((byte) 114);
        this.method2200(0, arg2);
        this.field5094.field3389 = 0;
        this.field5097 = null;
        while (true) {
            class62 var5 = (class62) this.field5083.method398((byte) 38);
            if (var5 == null) {
                while (true) {
                    class62 var6 = (class62) this.field5088.method398((byte) 38);
                    if (var6 == null) {
                        if (this.field5093 != 0) {
                            try {
                                this.field5092.field3389 = 0;
                                this.field5092.method1386(-222840624, 4);
                                this.field5092.method1386(-222840624, this.field5093);
                                this.field5092.method1346(122, 0);
                                this.field5091.method1537(this.field5092.field3406, false, 4, 0);
                            } catch (IOException var8) {
                                try {
                                    this.field5091.method1538((byte) 5);
                                } catch (Exception var7) {
                                }
                                this.field5091 = null;
                                this.field5095++;
                                this.field5096 = -2;
                            }
                        }
                        this.field5090 = 0;
                        this.field5089 = class442.method2730(25207);
                        return;
                    }
                    this.field5087.method393((byte) 82, var6);
                }
            }
            this.field5080.method393((byte) 54, var5);
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)V")
    private final void method2188(byte arg0) {
        field5082++;
        if (this.field5091 == null) {
            return;
        }
        try {
            this.field5092.field3389 = 0;
            this.field5092.method1386(-222840624, 6);
            this.field5092.method1382((byte) -113, 3);
            int var2 = 96 % ((36 - arg0) / 59);
            this.field5091.method1537(this.field5092.field3406, false, 4, 0);
        } catch (IOException var4) {
            try {
                this.field5091.method1538((byte) 5);
            } catch (Exception var3) {
            }
            this.field5096 = -2;
            this.field5091 = null;
            this.field5095++;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
    public final void method2189(int arg0) {
        if (arg0 != 16673) {
            this.field5088 = null;
        }
        field5070++;
        if (this.field5091 == null) {
            return;
        }
        try {
            this.field5092.field3389 = 0;
            this.field5092.method1386(-222840624, 7);
            this.field5092.method1382((byte) 102, 0);
            this.field5091.method1537(this.field5092.field3406, false, 4, 0);
        } catch (IOException var3) {
            try {
                this.field5091.method1538((byte) 5);
            } catch (Exception var2) {
            }
            this.field5091 = null;
            this.field5095++;
            this.field5096 = -2;
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)V")
    public final void method2190(int arg0) {
        if (this.field5091 != null) {
            this.field5091.method1538((byte) 5);
        }
        if (arg0 >= -33) {
            this.field5096 = -94;
        }
        field5078++;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(BII)I")
    public static final int method2191(byte arg0, int arg1, int arg2) {
        field5071++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (arg0 != -103) {
            method2197((byte) 33);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)Z")
    public final boolean method2192(int arg0) {
        if (arg0 != 6) {
            this.method2190(-37);
        }
        field5074++;
        return this.method2194(2) >= 20;
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)Z")
    public final boolean method2193(int arg0) {
        if (this.field5091 != null) {
            long var2 = class442.method2730(25207);
            int var4 = (int) (var2 - this.field5089);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field5089 = var2;
            this.field5090 += var4;
            if (this.field5090 > 30000) {
                try {
                    this.field5091.method1538((byte) 5);
                } catch (Exception var27) {
                }
                this.field5091 = null;
            }
        }
        field5081++;
        if (this.field5091 == null) {
            return this.method2194(2) == 0 && this.method2198(2) == 0;
        }
        try {
            this.field5091.method1535(true);
            for (class62 var5 = (class62) this.field5080.method399(127); var5 != null; var5 = (class62) this.field5080.method397(18244)) {
                this.field5092.field3389 = 0;
                this.field5092.method1386(-222840624, 1);
                this.field5092.method1382((byte) -66, (int) var5.field2365);
                this.field5091.method1537(this.field5092.field3406, false, 4, 0);
                this.field5083.method393((byte) 58, var5);
            }
            if (arg0 >= 0) {
                method2196((byte) 6, (String) null);
            }
            for (class62 var6 = (class62) this.field5087.method399(127); var6 != null; var6 = (class62) this.field5087.method397(18244)) {
                this.field5092.field3389 = 0;
                this.field5092.method1386(-222840624, 0);
                this.field5092.method1382((byte) 67, (int) var6.field2365);
                this.field5091.method1537(this.field5092.field3406, false, 4, 0);
                this.field5088.method393((byte) 48, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field5091.method1539(-32565);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field5090 = 0;
                byte var9 = 0;
                if (this.field5097 == null) {
                    var9 = 8;
                } else if (this.field5097.field639 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field5094.field3389;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field5091.method1529(this.field5094.field3406, var10, -18094, this.field5094.field3389);
                    if (this.field5093 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field5094.field3406[this.field5094.field3389 + var11] = (byte) class379.method2318(this.field5094.field3406[this.field5094.field3389 + var11], this.field5093);
                        }
                    }
                    this.field5094.field3389 += var10;
                    if (this.field5094.field3389 >= var9) {
                        if (this.field5097 == null) {
                            this.field5094.field3389 = 0;
                            int var12 = this.field5094.method1350(31351);
                            int var13 = this.field5094.method1374(-2);
                            int var14 = this.field5094.method1350(31351);
                            int var15 = this.field5094.method1359(255);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class62 var21;
                            if (var17) {
                                for (var21 = (class62) this.field5088.method399(123); var21 != null && var21.field2365 != var18; var21 = (class62) this.field5088.method397(18244)) {
                                }
                            } else {
                                for (var21 = (class62) this.field5083.method399(125); var21 != null && var21.field2365 != var18; var21 = (class62) this.field5083.method397(18244)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field5097 = var21;
                            this.field5097.field628 = new class250(var15 + var22 + this.field5097.field630);
                            this.field5097.field628.method1386(-222840624, var16);
                            this.field5097.field628.method1357(var15, 1826838072);
                            this.field5094.field3389 = 0;
                            this.field5097.field639 = 8;
                        } else if (this.field5097.field639 != 0) {
                            throw new IOException();
                        } else if (this.field5094.field3406[0] == -1) {
                            this.field5097.field639 = 1;
                            this.field5094.field3389 = 0;
                        } else {
                            this.field5097 = null;
                        }
                    }
                } else {
                    int var23 = this.field5097.field628.field3406.length - this.field5097.field630;
                    int var24 = 512 - this.field5097.field639;
                    if ((var23 - this.field5097.field628.field3389) < var24) {
                        var24 = var23 - this.field5097.field628.field3389;
                    }
                    if (var24 > var8) {
                        var24 = var8;
                    }
                    this.field5091.method1529(this.field5097.field628.field3406, var24, -18094, this.field5097.field628.field3389);
                    if (this.field5093 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field5097.field628.field3406[this.field5097.field628.field3389 + var25] = (byte) class379.method2318(this.field5097.field628.field3406[this.field5097.field628.field3389 + var25], this.field5093);
                        }
                    }
                    this.field5097.field628.field3389 += var24;
                    this.field5097.field639 += var24;
                    if (this.field5097.field628.field3389 == var23) {
                        this.field5097.method1009((byte) -1);
                        this.field5097.field1708 = false;
                        this.field5097 = null;
                    } else if (this.field5097.field639 == 512) {
                        this.field5097.field639 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field5091.method1538((byte) 5);
            } catch (Exception var26) {
            }
            this.field5095++;
            this.field5091 = null;
            this.field5096 = -2;
            return this.method2194(2) == 0 && this.method2198(2) == 0;
        }
    }

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "(I)I")
    public final int method2194(int arg0) {
        if (arg0 != 2) {
            field5072 = null;
        }
        field5064++;
        return this.field5080.method392(0) + this.field5083.method392(0);
    }

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "(I)V")
    public final void method2195(int arg0) {
        field5065++;
        int var2 = 41 % ((-arg0 - 13) / 46);
        if (this.field5091 != null) {
            this.field5091.method1530(64);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method2196(byte arg0, String arg1) {
        field5066++;
        return arg0 <= 96 ? 92 : class297.method1743(arg1, 123, true, 10);
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(B)V")
    public static void method2197(byte arg0) {
        field5068 = null;
        field5072 = null;
        field5075 = null;
        if (arg0 <= 109) {
            method2197((byte) -115);
        }
        field5084 = null;
    }

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "(I)I")
    private final int method2198(int arg0) {
        field5062++;
        if (arg0 != 2) {
            method2197((byte) -50);
        }
        return this.field5087.method392(0) + this.field5088.method392(0);
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "(B)V")
    public final void method2199(byte arg0) {
        try {
            this.field5091.method1538((byte) 5);
        } catch (Exception var2) {
        }
        field5069++;
        this.field5096 = -1;
        if (arg0 >= -8) {
            field5063 = 117;
        }
        this.field5093 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field5091 = null;
        this.field5095++;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IZ)V")
    public final void method2200(int arg0, boolean arg1) {
        field5073++;
        if (this.field5091 == null) {
            return;
        }
        try {
            this.field5092.field3389 = 0;
            this.field5092.method1386(arg0 ^ 0xF2B7B8D0, arg1 ? 2 : 3);
            this.field5092.method1382((byte) -103, 0);
            this.field5091.method1537(this.field5092.field3406, false, 4, arg0);
        } catch (IOException var4) {
            try {
                this.field5091.method1538((byte) 5);
            } catch (Exception var3) {
            }
            this.field5095++;
            this.field5096 = -2;
            this.field5091 = null;
        }
    }
}
