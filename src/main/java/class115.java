import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class115 {

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "Lci;")
    private class171 field1954 = new class171();

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "Lci;")
    private class171 field1965 = new class171();

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "Lci;")
    private class171 field1966 = new class171();

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "Lci;")
    private class171 field1967 = new class171();

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "Lva;")
    private class187 field1970 = new class187(4);

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
    public volatile int field1975 = 0;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
    public volatile int field1972 = 0;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "B")
    private byte field1973 = 0;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "Lva;")
    private class187 field1974 = new class187(8);

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "Leg;")
    public static class37 field1956 = class174.method1167("mapscene", 61);

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "[B")
    public static byte[] field1957 = new byte[520];

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "Leg;")
    public static class37 field1962 = class174.method1167("::mm", -116);

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public static int field1960 = 1;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "[I")
    public static int[] field1964 = new int[5];

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "Leg;")
    public static class37 field1953 = class174.method1167("blanc:", 67);

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    private int field1969;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "J")
    private long field1968;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "Lgf;")
    private class104 field1976;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "Luh;")
    private class59 field1971;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "[[B")
    public static byte[][] field1941;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZZ)V")
    public final void method814(boolean arg0, boolean arg1) {
        field1961++;
        if (this.field1971 == null) {
            return;
        }
        try {
            this.field1970.field3169 = 0;
            this.field1970.method1292(arg1 ? 2 : 3, (byte) -64);
            this.field1970.method1274(0, (byte) 116);
            if (!arg0) {
                this.field1971.method420(this.field1970.field3175, 0, 4, -13789);
            }
        } catch (IOException var4) {
            try {
                this.field1971.method419((byte) -66);
            } catch (Exception var3) {
            }
            this.field1971 = null;
            this.field1972 = -2;
            this.field1975++;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZILuh;)V")
    public final void method815(boolean arg0, int arg1, class59 arg2) {
        field1963++;
        if (this.field1971 != null) {
            try {
                this.field1971.method419((byte) -66);
            } catch (Exception var8) {
            }
            this.field1971 = null;
        }
        this.field1971 = arg2;
        this.method822(-2);
        this.method814(false, arg0);
        this.field1974.field3169 = arg1;
        this.field1976 = null;
        while (true) {
            class104 var4 = (class104) this.field1965.method1150(-19113);
            if (var4 == null) {
                while (true) {
                    class104 var5 = (class104) this.field1967.method1150(-19113);
                    if (var5 == null) {
                        if (this.field1973 != 0) {
                            try {
                                this.field1970.field3169 = 0;
                                this.field1970.method1292(4, (byte) -64);
                                this.field1970.method1292(this.field1973, (byte) -64);
                                this.field1970.method1294(0, -26655);
                                this.field1971.method420(this.field1970.field3175, 0, 4, -13789);
                            } catch (IOException var7) {
                                try {
                                    this.field1971.method419((byte) -66);
                                } catch (Exception var6) {
                                }
                                this.field1971 = null;
                                this.field1975++;
                                this.field1972 = -2;
                            }
                        }
                        this.field1969 = 0;
                        this.field1968 = class149.method1024(-14898);
                        return;
                    }
                    this.field1966.method1152(arg1 + 98, var5);
                }
            }
            this.field1954.method1152(60, var4);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)I")
    public final int method816(boolean arg0) {
        field1951++;
        if (arg0) {
            this.method819((byte) 96);
        }
        return this.field1954.method1141((byte) 120) + this.field1965.method1141((byte) 120);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public final void method817(byte arg0) {
        try {
            this.field1971.method419((byte) -66);
        } catch (Exception var2) {
        }
        field1943++;
        if (arg0 > -102) {
            this.method826((byte) 43);
        }
        this.field1975++;
        this.field1972 = -1;
        this.field1973 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field1971 = null;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)I")
    private final int method818(byte arg0) {
        int var2 = -22 % ((38 - arg0) / 41);
        field1959++;
        return this.field1966.method1141((byte) 120) + this.field1967.method1141((byte) 120);
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)V")
    public final void method819(byte arg0) {
        field1947++;
        if (this.field1971 != null) {
            this.field1971.method423((byte) 113);
        }
        if (arg0 != -17) {
            this.method829(true);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljl;III)Lja;")
    public static final class105 method820(class101 arg0, int arg1, int arg2, int arg3) {
        field1955++;
        if (class131.method941(arg3, arg0, arg2, -56)) {
            return arg1 == 3821 ? class75.method498((byte) -125) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(B)V")
    public final void method821(byte arg0) {
        field1945++;
        if (this.field1971 == null) {
            return;
        }
        try {
            this.field1970.field3169 = 0;
            this.field1970.method1292(7, (byte) -64);
            this.field1970.method1274(0, (byte) 106);
            this.field1971.method420(this.field1970.field3175, 0, 4, -13789);
            int var2 = 26 % ((18 - arg0) / 58);
        } catch (IOException var4) {
            try {
                this.field1971.method419((byte) -66);
            } catch (Exception var3) {
            }
            this.field1975++;
            this.field1972 = -2;
            this.field1971 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    private final void method822(int arg0) {
        field1944++;
        if (this.field1971 == null) {
            return;
        }
        try {
            this.field1970.field3169 = 0;
            if (arg0 != -2) {
                this.method817((byte) 56);
            }
            this.field1970.method1292(6, (byte) -64);
            this.field1970.method1274(3, (byte) 110);
            this.field1971.method420(this.field1970.field3175, 0, 4, -13789);
        } catch (IOException var3) {
            try {
                this.field1971.method419((byte) -66);
            } catch (Exception var2) {
            }
            this.field1971 = null;
            this.field1975++;
            this.field1972 = -2;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBIIZ)Lgf;")
    public final class104 method823(int arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        field1950++;
        long var6 = (long) ((arg2 << 16) + arg3);
        class104 var8 = new class104();
        var8.field1614 = arg1;
        var8.field1502 = arg4;
        if (arg0 != 206873392) {
            return null;
        }
        var8.field5125 = var6;
        if (arg4) {
            if (this.method816(false) >= 20) {
                throw new RuntimeException();
            }
            this.field1954.method1152(arg0 ^ 0xC54A359, var8);
        } else if (this.method818((byte) -64) < 20) {
            this.field1966.method1152(114, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLeg;Z)V")
    public static final void method824(byte arg0, class37 arg1, boolean arg2) {
        field1949++;
        int var3 = class109.field1810.method1216(arg1, 250);
        int var4 = class109.field1810.method1215(arg1, 250) * 13;
        byte var5 = 4;
        int var6 = var5 + 6;
        int var7 = var5 + 6;
        class122.method873(var7 - var5, -var5 + var6, var3 + var5 + var5, var4 + var5 + var5, 0);
        class122.method861(var7 - var5, -var5 + var6, var3 + var5 + var5, var4 + var5 + var5, 16777215);
        class109.field1810.method1213(arg1, var7, var6, var3, var4, 16777215, -1, 1, 1, 0);
        class171.method1151(var6 - var5, var3 + var5 - -var5, var7 - var5, -30822, var4 + var5 + var5);
        int var8 = -85 / ((arg0 + 3) / 41);
        if (!arg2) {
            class99.method642(var6, var7, var3, true, var4);
            return;
        }
        try {
            Graphics var9 = class93.field1466.getGraphics();
            class276.field4897.method920((byte) -113, var9, 0, 0);
        } catch (Exception var10) {
            class93.field1466.repaint();
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)Z")
    public final boolean method825(int arg0) {
        field1942++;
        if (this.field1971 != null) {
            long var2 = class149.method1024(-14898);
            int var4 = (int) (var2 - this.field1968);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1969 += var4;
            this.field1968 = var2;
            if (this.field1969 > 30000) {
                try {
                    this.field1971.method419((byte) -66);
                } catch (Exception var28) {
                }
                this.field1971 = null;
            }
        }
        if (this.field1971 == null) {
            return this.method816(false) == 0 && this.method818((byte) 123) == 0;
        }
        try {
            this.field1971.method422(false);
            for (class104 var5 = (class104) this.field1954.method1148(19271); var5 != null; var5 = (class104) this.field1954.method1142(2682)) {
                this.field1970.field3169 = 0;
                this.field1970.method1292(1, (byte) -64);
                this.field1970.method1274((int) var5.field5125, (byte) 118);
                this.field1971.method420(this.field1970.field3175, 0, 4, -13789);
                this.field1965.method1152(59, var5);
            }
            for (class104 var6 = (class104) this.field1966.method1148(19271); var6 != null; var6 = (class104) this.field1966.method1142(2682)) {
                this.field1970.field3169 = 0;
                this.field1970.method1292(0, (byte) -64);
                this.field1970.method1274((int) var6.field5125, (byte) 122);
                this.field1971.method420(this.field1970.field3175, 0, 4, -13789);
                this.field1967.method1152(46, var6);
            }
            int var7 = 64 / ((-arg0 - 83) / 32);
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field1971.method430(false);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field1969 = 0;
                byte var10 = 0;
                if (this.field1976 == null) {
                    var10 = 8;
                } else if (this.field1976.field1623 == 0) {
                    var10 = 1;
                }
                if (var10 <= 0) {
                    int var11 = 512 - this.field1976.field1623;
                    int var12 = this.field1976.field1617.field3175.length - this.field1976.field1614;
                    if (var12 - this.field1976.field1617.field3169 < var11) {
                        var11 = var12 - this.field1976.field1617.field3169;
                    }
                    if (var9 < var11) {
                        var11 = var9;
                    }
                    this.field1971.method425(var11, 3714, this.field1976.field1617.field3175, this.field1976.field1617.field3169);
                    if (this.field1973 != 0) {
                        for (int var13 = 0; var13 < var11; var13++) {
                            this.field1976.field1617.field3175[this.field1976.field1617.field3169 + var13] = (byte) class4.method24(this.field1976.field1617.field3175[this.field1976.field1617.field3169 + var13], this.field1973);
                        }
                    }
                    this.field1976.field1623 += var11;
                    this.field1976.field1617.field3169 += var11;
                    if (this.field1976.field1617.field3169 == var12) {
                        this.field1976.method1953(91923);
                        this.field1976.field1500 = false;
                        this.field1976 = null;
                    } else if (this.field1976.field1623 == 512) {
                        this.field1976.field1623 = 0;
                    }
                } else {
                    int var14 = var10 - this.field1974.field3169;
                    if (var9 < var14) {
                        var14 = var9;
                    }
                    this.field1971.method425(var14, 3714, this.field1974.field3175, this.field1974.field3169);
                    if (this.field1973 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field1974.field3175[this.field1974.field3169 + var15] = (byte) class4.method24(this.field1974.field3175[this.field1974.field3169 + var15], this.field1973);
                        }
                    }
                    this.field1974.field3169 += var14;
                    if (this.field1974.field3169 >= var10) {
                        if (this.field1976 == null) {
                            this.field1974.field3169 = 0;
                            int var16 = this.field1974.method1268(255);
                            Object var17 = null;
                            int var18 = this.field1974.method1244(false);
                            int var19 = this.field1974.method1268(255);
                            int var20 = this.field1974.method1290((byte) 90);
                            int var21 = var19 & 0x7F;
                            boolean var22 = (var19 & 0x80) != 0;
                            long var23 = (long) ((var16 << 16) + var18);
                            class104 var25;
                            if (var22) {
                                for (var25 = (class104) this.field1967.method1148(19271); var25 != null && var25.field5125 != var23; var25 = (class104) this.field1967.method1142(2682)) {
                                }
                            } else {
                                for (var25 = (class104) this.field1965.method1148(19271); var25 != null && var25.field5125 != var23; var25 = (class104) this.field1965.method1142(2682)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            this.field1976 = var25;
                            int var26 = var21 == 0 ? 5 : 9;
                            this.field1976.field1617 = new class187(var20 + var26 + this.field1976.field1614);
                            this.field1976.field1617.method1292(var21, (byte) -64);
                            this.field1976.field1617.method1272(27862, var20);
                            this.field1974.field3169 = 0;
                            this.field1976.field1623 = 8;
                        } else if (this.field1976.field1623 != 0) {
                            throw new IOException();
                        } else if (this.field1974.field3175[0] == -1) {
                            this.field1974.field3169 = 0;
                            this.field1976.field1623 = 1;
                        } else {
                            this.field1976 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var29) {
            try {
                this.field1971.method419((byte) -66);
            } catch (Exception var27) {
            }
            this.field1972 = -2;
            this.field1975++;
            this.field1971 = null;
            return this.method816(false) == 0 && this.method818((byte) -75) == 0;
        }
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(B)V")
    public final void method826(byte arg0) {
        field1952++;
        if (this.field1971 != null) {
            this.field1971.method419((byte) -66);
        }
        if (arg0 > -20) {
            this.field1970 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "(B)Z")
    public final boolean method827(byte arg0) {
        int var2 = 21 % ((arg0 + 20) / 46);
        field1946++;
        return this.method816(false) >= 20;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V")
    public static void method828(int arg0) {
        field1956 = null;
        field1941 = null;
        field1957 = null;
        if (arg0 > 66) {
            field1953 = null;
            field1962 = null;
            field1964 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)Z")
    public final boolean method829(boolean arg0) {
        field1958++;
        if (arg0) {
            return false;
        } else {
            return this.method818((byte) 124) >= 20;
        }
    }
}
