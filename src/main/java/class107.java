import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class107 extends class240 {

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
    private int field1969 = 2;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "[B")
    private byte[] field1968 = new byte[512];

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "I")
    private int field1977 = 5;

    @OriginalMember(owner = "client!ag", name = "ab", descriptor = "I")
    private int field1979 = 0;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "I")
    private int field1967 = 1;

    @OriginalMember(owner = "client!ag", name = "bb", descriptor = "[S")
    private short[] field1980 = new short[512];

    @OriginalMember(owner = "client!ag", name = "ib", descriptor = "I")
    private int field1987 = 5;

    @OriginalMember(owner = "client!ag", name = "jb", descriptor = "I")
    private int field1988 = 2048;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "I")
    public static int field1972 = -1;

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "Lcd;")
    public static class64 field1978 = class44.method335((byte) 71, "p11_full");

    @OriginalMember(owner = "client!ag", name = "fb", descriptor = "Lcd;")
    private static class64 field1984 = class44.method335((byte) 71, "Examine");

    @OriginalMember(owner = "client!ag", name = "eb", descriptor = "Lcd;")
    public static class64 field1983 = field1984;

    @OriginalMember(owner = "client!ag", name = "hb", descriptor = "Lcd;")
    public static class64 field1986 = class44.method335((byte) 71, "Versteckt");

    @OriginalMember(owner = "client!ag", name = "gb", descriptor = "I")
    public static int field1985 = 7759444;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!ag", name = "cb", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!ag", name = "db", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!ag", name = "kb", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "[S")
    public static short[] field1970;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(I)V", line = 5)
    public final void method288(int arg0) {
        field1981++;
        this.field1968 = class252.method1806(this.field1979, arg0 - 17517);
        this.method784(false);
        if (arg0 != 17772) {
            field1986 = (class64) null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(B)V", line = 23)
    public static final void method783(byte arg0) {
        if (class29.field477 != null) {
            class213 var1 = class29.field477;
            synchronized (class29.field477) {
                class29.field477 = null;
            }
        }
        field1971++;
        if (arg0 <= 41) {
            field1986 = (class64) null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V", line = 62)
    private final void method784(boolean arg0) {
        if (arg0) {
            this.method16(63, -35, (class13) null);
        }
        field1974++;
        Random var2 = new Random((long) this.field1979);
        this.field1980 = new short[512];
        if (this.field1988 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field1980[var3] = (short) class206.method1439(var2, (byte) 123, this.field1988);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)V", line = 97)
    public static void method785(int arg0) {
        if (arg0 >= -61) {
            field1972 = 18;
        }
        field1978 = null;
        field1986 = null;
        field1983 = null;
        field1984 = null;
        field1970 = null;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V", line = 118)
    public class107() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)[I", line = 124)
    public final int[] method12(int arg0, int arg1) {
        if (arg0 != 64) {
            return (int[]) null;
        }
        int[] var3 = this.field4094.method179(arg1, true);
        field1989++;
        if (this.field4094.field344) {
            int var4 = class268.field4615[arg1] * this.field1977 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class169.field2936; var7++) {
                class134.field2385 = Integer.MAX_VALUE;
                class263.field4518 = Integer.MAX_VALUE;
                class274.field4698 = Integer.MAX_VALUE;
                class64.field1246 = Integer.MAX_VALUE;
                int var8 = class74.field1408[var7] * this.field1987 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field1968[(this.field1977 > var11 ? var11 : var11 - this.field1977) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field1968[(var13 < this.field1987 ? var13 : var13 - this.field1987) + var12 & 0xFF] & 0xFF) * 2;
                        int var10000 = var8 - (var13 << 12);
                        int var27 = var14 + 1;
                        int var15 = var10000 - this.field1980[var14];
                        int var16 = var4 - this.field1980[var27] - (var11 << 12);
                        int var17 = this.field1967;
                        int var20;
                        if (var17 == 1) {
                            var20 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var18 = var16 >= 0 ? var16 : -var16;
                            int var19 = var15 < 0 ? -var15 : var15;
                            var20 = var18 < var19 ? var19 : var18;
                        } else if (var17 == 4) {
                            int var21 = (int) (Math.sqrt((double) ((float) (var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
                            int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                            int var23 = var21 + var22;
                            var20 = var23 * var23 >> 12;
                        } else if (var17 == 5) {
                            int var24 = var15 * var15;
                            int var25 = var16 * var16;
                            var20 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var24 + var25) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var20 = (var15 >= 0 ? var15 : -var15) + (var16 >= 0 ? var16 : -var16);
                        } else {
                            var20 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (var20 < class64.field1246) {
                            class134.field2385 = class263.field4518;
                            class263.field4518 = class274.field4698;
                            class274.field4698 = class64.field1246;
                            class64.field1246 = var20;
                        } else if (class274.field4698 > var20) {
                            class134.field2385 = class263.field4518;
                            class263.field4518 = class274.field4698;
                            class274.field4698 = var20;
                        } else if (class263.field4518 > var20) {
                            class134.field2385 = class263.field4518;
                            class263.field4518 = var20;
                        } else if (class134.field2385 > var20) {
                            class134.field2385 = var20;
                        }
                    }
                }
                int var26 = this.field1969;
                if (var26 == 0) {
                    var3[var7] = class64.field1246;
                } else if (var26 == 1) {
                    var3[var7] = class274.field4698;
                } else if (var26 == 3) {
                    var3[var7] = class263.field4518;
                } else if (var26 == 4) {
                    var3[var7] = class134.field2385;
                } else if (var26 == 2) {
                    var3[var7] = class274.field4698 - class64.field1246;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILkh;)V", line = 334)
    public final void method16(int arg0, int arg1, class13 arg2) {
        field1982++;
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.field1987 = this.field1977 = arg2.method152((byte) -125);
        } else if (arg1 == 1) {
            this.field1979 = arg2.method152((byte) -100);
        } else if (arg1 == 2) {
            this.field1988 = arg2.method112((byte) 92);
        } else if (arg1 == 3) {
            this.field1969 = arg2.method152((byte) -71);
        } else if (arg1 == 4) {
            this.field1967 = arg2.method152((byte) -103);
        } else if (arg1 == 5) {
            this.field1987 = arg2.method152((byte) -74);
        } else if (arg1 == 6) {
            this.field1977 = arg2.method152((byte) -121);
        }
    }

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "(I)V", line = 444)
    public static final void method786(int arg0) {
        field1973++;
        if (arg0 != -28904) {
            field1972 = -125;
        }
        for (class246 var1 = (class246) class93.field1733.method778(0); var1 != null; var1 = (class246) class93.field1733.method775(26517)) {
            if (var1.field4273) {
                var1.method1781(0);
            }
        }
        for (class246 var2 = (class246) class115.field2115.method778(0); var2 != null; var2 = (class246) class115.field2115.method775(arg0 + 55421)) {
            if (var2.field4273) {
                var2.method1781(arg0 + 28904);
            }
        }
    }
}
