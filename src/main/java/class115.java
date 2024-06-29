import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class115 extends class183 {

    @OriginalMember(owner = "client!nh", name = "X", descriptor = "I")
    private int field2060 = 5;

    @OriginalMember(owner = "client!nh", name = "kb", descriptor = "I")
    private int field2073 = 0;

    @OriginalMember(owner = "client!nh", name = "cb", descriptor = "[S")
    private short[] field2065 = new short[512];

    @OriginalMember(owner = "client!nh", name = "fb", descriptor = "I")
    private int field2068 = 2048;

    @OriginalMember(owner = "client!nh", name = "Y", descriptor = "[B")
    private byte[] field2061 = new byte[512];

    @OriginalMember(owner = "client!nh", name = "sb", descriptor = "I")
    private int field2081 = 1;

    @OriginalMember(owner = "client!nh", name = "rb", descriptor = "I")
    private int field2080 = 2;

    @OriginalMember(owner = "client!nh", name = "qb", descriptor = "I")
    private int field2079 = 5;

    @OriginalMember(owner = "client!nh", name = "ib", descriptor = "Ljf;")
    public static class229 field2071 = class212.method1457((byte) 125, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!nh", name = "ab", descriptor = "[S")
    public static short[] field2063 = new short[500];

    @OriginalMember(owner = "client!nh", name = "pb", descriptor = "Ljf;")
    public static class229 field2078 = class212.method1457((byte) 80, "rouge:");

    @OriginalMember(owner = "client!nh", name = "mb", descriptor = "I")
    public static int field2075 = 0;

    @OriginalMember(owner = "client!nh", name = "gb", descriptor = "Lui;")
    public static class268 field2069 = new class268(16);

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!nh", name = "W", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!nh", name = "Z", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!nh", name = "bb", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!nh", name = "db", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!nh", name = "eb", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!nh", name = "hb", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!nh", name = "lb", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!nh", name = "ob", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!nh", name = "tb", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "Lek;")
    public static class185 field2057;

    @OriginalMember(owner = "client!nh", name = "nb", descriptor = "Lek;")
    public static class185 field2076;

    @OriginalMember(owner = "client!nh", name = "jb", descriptor = "[Lwc;")
    public static class104[] field2072;

    @OriginalMember(owner = "client!nh", name = "ub", descriptor = "[[[B")
    public static byte[][][] field2083;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(B)V", line = 7)
    private final void method825(byte arg0) {
        field2058++;
        Random var2 = new Random((long) this.field2073);
        this.field2065 = new short[512];
        int var3 = -72 % ((-arg0 - 15) / 35);
        if (this.field2068 > 0) {
            for (int var4 = 0; var4 < 512; var4++) {
                this.field2065[var4] = (short) class50.method413(this.field2068, false, var2);
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(II)[I", line = 39)
    public final int[] method10(int arg0, int arg1) {
        if (arg1 != -1) {
            field2062 = 23;
        }
        field2077++;
        int[] var3 = this.field3161.method664(arg0, 0);
        if (this.field3161.field1736) {
            int var4 = class42.field746[arg0] * this.field2079 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class22.field393; var7++) {
                class78.field1440 = Integer.MAX_VALUE;
                class72.field1379 = Integer.MAX_VALUE;
                class215.field3699 = Integer.MAX_VALUE;
                class208.field3614 = Integer.MAX_VALUE;
                int var8 = class97.field1737[var7] * this.field2060 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field2061[(this.field2079 <= var11 ? var11 - this.field2079 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field2061[var12 + (var13 >= this.field2060 ? var13 - this.field2060 : var13) & 0xFF] & 0xFF) * 2;
                        int var27 = var14 + 1;
                        int var15 = var8 - this.field2065[var14] - (var13 << 12);
                        int var16 = var4 - (var11 << 12) - this.field2065[var27];
                        int var17 = this.field2081;
                        int var20;
                        if (var17 == 1) {
                            var20 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var18 = var16 >= 0 ? var16 : -var16;
                            int var19 = var15 >= 0 ? var15 : -var15;
                            var20 = var19 > var18 ? var19 : var18;
                        } else if (var17 == 4) {
                            int var23 = (int) (Math.sqrt((double) ((float) (var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
                            int var24 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                            int var25 = var23 + var24;
                            var20 = var25 * var25 >> 12;
                        } else if (var17 == 5) {
                            int var21 = var15 * var15;
                            int var22 = var16 * var16;
                            var20 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 + var22) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var20 = (var15 >= 0 ? var15 : -var15) + (var16 >= 0 ? var16 : -var16);
                        } else {
                            var20 = (int) (Math.sqrt((double) ((float) (var15 * var15 + (var16 * var16)) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (var20 < class208.field3614) {
                            class78.field1440 = class72.field1379;
                            class72.field1379 = class215.field3699;
                            class215.field3699 = class208.field3614;
                            class208.field3614 = var20;
                        } else if (class215.field3699 > var20) {
                            class78.field1440 = class72.field1379;
                            class72.field1379 = class215.field3699;
                            class215.field3699 = var20;
                        } else if (class72.field1379 > var20) {
                            class78.field1440 = class72.field1379;
                            class72.field1379 = var20;
                        } else if (class78.field1440 > var20) {
                            class78.field1440 = var20;
                        }
                    }
                }
                int var26 = this.field2080;
                if (var26 == 0) {
                    var3[var7] = class208.field3614;
                } else if (var26 == 1) {
                    var3[var7] = class215.field3699;
                } else if (var26 == 3) {
                    var3[var7] = class72.field1379;
                } else if (var26 == 4) {
                    var3[var7] = class78.field1440;
                } else if (var26 == 2) {
                    var3[var7] = class215.field3699 - class208.field3614;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lek;Z)V", line = 249)
    public static final void method826(class185 arg0, boolean arg1) {
        class169.field2923 = arg0.method1292(class288.field4921, (byte) 103);
        class183.field3172 = arg0.method1292(class15.field237, (byte) 44);
        if (arg1) {
            field2082 = 29;
        }
        field2066++;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V", line = 267)
    public class115() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(B)V", line = 278)
    public static void method827(byte arg0) {
        field2076 = null;
        field2069 = null;
        field2063 = null;
        field2083 = (byte[][][]) null;
        field2057 = null;
        int var1 = 15 % ((36 - arg0) / 51);
        field2072 = null;
        field2071 = null;
        field2078 = null;
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)V", line = 294)
    public static final void method828(int arg0) {
        field2059++;
        class329.field5586.method1892((byte) -35);
        class201.field3517.method378(true);
        if (arg0 != -14972) {
            method827((byte) -29);
        }
        client.field4451.method378(true);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILkh;I)V", line = 333)
    public final void method14(int arg0, class14 arg1, int arg2) {
        field2070++;
        if (arg0 > -43) {
            method826((class185) null, true);
        }
        if (arg2 == 0) {
            this.field2060 = this.field2079 = arg1.method93(false);
        } else if (arg2 == 1) {
            this.field2073 = arg1.method93(false);
        } else if (arg2 == 2) {
            this.field2068 = arg1.method116(-1);
        } else if (arg2 == 3) {
            this.field2080 = arg1.method93(false);
        } else if (arg2 == 4) {
            this.field2081 = arg1.method93(false);
        } else if (arg2 == 5) {
            this.field2060 = arg1.method93(false);
        } else if (arg2 == 6) {
            this.field2079 = arg1.method93(false);
        }
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V", line = 422)
    public static final void method829(int arg0) {
        class18.field284++;
        field2064++;
        class84.field1608.method1397(63, 0);
        for (class321 var1 = (class321) class151.field2618.method1884((byte) -121); var1 != null; var1 = (class321) class151.field2618.method1886(-118)) {
            if (var1.field5434 == 0) {
                class282.method1978(-124, true, var1);
            }
        }
        if (arg0 > -116) {
            method826((class185) null, true);
        }
        if (class208.field3613 != null) {
            class194.method1328((byte) -120, class208.field3613);
            class208.field3613 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V", line = 456)
    public final void method25(int arg0) {
        field2074++;
        this.field2061 = class308.method2098(2, this.field2073);
        this.method825((byte) 102);
        if (arg0 != -8) {
            field2071 = (class229) null;
        }
    }
}
