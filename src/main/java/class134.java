import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class134 extends class112 {

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
    private int field2053 = 2;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "[B")
    private byte[] field2057 = new byte[512];

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "I")
    private int field2055 = 5;

    @OriginalMember(owner = "client!vd", name = "ab", descriptor = "I")
    private int field2066 = 0;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    private int field2056 = 1;

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "I")
    private int field2060 = 5;

    @OriginalMember(owner = "client!vd", name = "bb", descriptor = "I")
    private int field2067 = 2048;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "[S")
    private short[] field2050 = new short[512];

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "Lwm;")
    public static class152 field2059 = class157.method1048("Schlie-8en", 101);

    @OriginalMember(owner = "client!vd", name = "X", descriptor = "Lek;")
    public static class183 field2063 = new class183();

    @OriginalMember(owner = "client!vd", name = "db", descriptor = "Lwm;")
    public static class152 field2069 = class157.method1048("http:)4)4", 101);

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!vd", name = "W", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!vd", name = "Y", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!vd", name = "Z", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!vd", name = "cb", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "Lhh;")
    public static class209 field2052;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "Ldl;")
    public static class38 field2051;

    @OriginalMember(owner = "client!vd", name = "eb", descriptor = "[I")
    public static int[] field2070;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLdi;)V", line = 5)
    public static final void method854(byte arg0, class151 arg1) {
        field2064++;
        class138 var2 = null;
        try {
            class188 var3 = arg1.method960(0, "runescape");
            if (arg0 < 20) {
                return;
            }
            while (var3.field2980 == 0) {
                class4.method19(0, 1L);
            }
            if (var3.field2980 == 1) {
                var2 = (class138) var3.field2977;
                class291 var4 = class93.method610(1);
                var2.method872(1, var4.field4950, var4.field4946, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method874(-119);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V", line = 42)
    public class134() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILhi;)V", line = 63)
    public final void method52(int arg0, int arg1, class291 arg2) {
        field2058++;
        if (arg0 != 31164) {
            return;
        }
        if (arg1 == 0) {
            this.field2060 = this.field2055 = arg2.method2011(arg0 ^ 0xFFFF8611);
        } else if (arg1 == 1) {
            this.field2066 = arg2.method2011(-83);
        } else if (arg1 == 2) {
            this.field2067 = arg2.method2021((byte) 74);
        } else if (arg1 == 3) {
            this.field2053 = arg2.method2011(arg0 ^ 0xFFFF8659);
        } else if (arg1 == 4) {
            this.field2056 = arg2.method2011(-74);
        } else if (arg1 == 5) {
            this.field2060 = arg2.method2011(-79);
        } else if (arg1 == 6) {
            this.field2055 = arg2.method2011(-29);
        }
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V", line = 140)
    public final void method673(int arg0) {
        field2065++;
        this.field2057 = class28.method226(this.field2066, 255);
        this.method856(true);
        if (arg0 != 8) {
            method855((class291) null, 47);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lhi;I)Ljc;", line = 153)
    public static final class296 method855(class291 arg0, int arg1) {
        field2054++;
        if (arg1 != -1) {
            method857(false);
        }
        return new class296(arg0.method1986(true), arg0.method1986(true), arg0.method1986(true), arg0.method1986(true), arg0.method2009((byte) 64), arg0.method2011(arg1 ^ 0x2E));
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V", line = 164)
    private final void method856(boolean arg0) {
        field2062++;
        if (!arg0) {
            method855((class291) null, -121);
        }
        Random var2 = new Random((long) this.field2066);
        this.field2050 = new short[512];
        if (this.field2067 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field2050[var3] = (short) class137.method870(var2, this.field2067, (byte) -112);
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)V", line = 210)
    public static void method857(boolean arg0) {
        field2070 = null;
        field2051 = null;
        field2063 = null;
        field2069 = null;
        field2059 = null;
        field2052 = null;
        if (!arg0) {
            field2051 = (class38) null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)[I", line = 235)
    public final int[] method53(byte arg0, int arg1) {
        field2061++;
        if (arg0 != -3) {
            method855((class291) null, 67);
        }
        int[] var3 = this.field1585.method1952(arg1, (byte) 95);
        if (this.field1585.field4935) {
            int var4 = class114.field1620[arg1] * this.field2055 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class58.field889; var7++) {
                class199.field3210 = Integer.MAX_VALUE;
                class284.field4826 = Integer.MAX_VALUE;
                class97.field1383 = Integer.MAX_VALUE;
                class262.field4463 = Integer.MAX_VALUE;
                int var8 = (class131.field1992[var7] * this.field2060) + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field2057[(var11 >= this.field2055 ? var11 - this.field2055 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field2057[var12 + (this.field2060 > var13 ? var13 : var13 - this.field2060) & 0xFF] & 0xFF) * 2;
                        int var10000 = var8 - (var13 << 12);
                        int var27 = var14 + 1;
                        int var15 = var10000 - this.field2050[var14];
                        int var16 = -(var11 << 12) - (this.field2050[var27] - var4);
                        int var17 = this.field2056;
                        int var20;
                        if (var17 == 1) {
                            var20 = var15 * var15 + (var16 * var16) >> 12;
                        } else if (var17 == 3) {
                            int var18 = var16 < 0 ? -var16 : var16;
                            int var19 = var15 < 0 ? -var15 : var15;
                            var20 = var18 < var19 ? var19 : var18;
                        } else if (var17 == 4) {
                            int var21 = (int) (Math.sqrt((double) ((float) (var15 >= 0 ? var15 : -var15) / 4096.0F)) * 4096.0D);
                            int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                            int var23 = var21 + var22;
                            var20 = var23 * var23 >> 12;
                        } else if (var17 == 5) {
                            int var24 = var15 * var15;
                            int var25 = var16 * var16;
                            var20 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var24 + var25) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var20 = (var16 >= 0 ? var16 : -var16) + (var15 >= 0 ? var15 : -var15);
                        } else {
                            var20 = (int) (Math.sqrt((double) ((float) (var15 * var15 + (var16 * var16)) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (class262.field4463 > var20) {
                            class199.field3210 = class284.field4826;
                            class284.field4826 = class97.field1383;
                            class97.field1383 = class262.field4463;
                            class262.field4463 = var20;
                        } else if (class97.field1383 > var20) {
                            class199.field3210 = class284.field4826;
                            class284.field4826 = class97.field1383;
                            class97.field1383 = var20;
                        } else if (var20 < class284.field4826) {
                            class199.field3210 = class284.field4826;
                            class284.field4826 = var20;
                        } else if (class199.field3210 > var20) {
                            class199.field3210 = var20;
                        }
                    }
                }
                int var26 = this.field2053;
                if (var26 == 0) {
                    var3[var7] = class262.field4463;
                } else if (var26 == 1) {
                    var3[var7] = class97.field1383;
                } else if (var26 == 3) {
                    var3[var7] = class284.field4826;
                } else if (var26 == 4) {
                    var3[var7] = class199.field3210;
                } else if (var26 == 2) {
                    var3[var7] = class97.field1383 - class262.field4463;
                }
            }
        }
        return var3;
    }
}
