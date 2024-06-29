import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class201 extends class110 {

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "[B")
    private byte[] field3001 = new byte[512];

    @OriginalMember(owner = "client!nm", name = "U", descriptor = "I")
    private int field3011 = 5;

    @OriginalMember(owner = "client!nm", name = "T", descriptor = "I")
    private int field3010 = 5;

    @OriginalMember(owner = "client!nm", name = "R", descriptor = "I")
    private int field3008 = 2;

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "I")
    private int field3004 = 0;

    @OriginalMember(owner = "client!nm", name = "S", descriptor = "[S")
    private short[] field3009 = new short[512];

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "I")
    private int field3002 = 1;

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
    private int field2997 = 2048;

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
    public static int field2999 = -1;

    @OriginalMember(owner = "client!nm", name = "H", descriptor = "[S")
    public static short[] field2998 = new short[500];

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "[I")
    public static int[] field3003 = new int[50];

    @OriginalMember(owner = "client!nm", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field3015 = "Loaded interfaces";

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!nm", name = "P", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!nm", name = "Q", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!nm", name = "V", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!nm", name = "W", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!nm", name = "X", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(III)Le;", line = 6)
    public static final class226 method1375(int arg0, int arg1, int arg2) {
        class221 var3 = class158.field2367[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class226 var4 = var3.field3368;
            var3.field3368 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)V", line = 19)
    public static void method1376(byte arg0) {
        field3003 = null;
        field3015 = null;
        field2998 = null;
        if (arg0 != -20) {
            field3015 = (String) null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)[I", line = 31)
    public final int[] method46(int arg0, int arg1) {
        if (arg0 != 1) {
            return (int[]) null;
        }
        field3012++;
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (this.field1695.field875) {
            int var4 = class177.field2615[arg1] * this.field3010 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class124.field1936; var7++) {
                class67.field888 = Integer.MAX_VALUE;
                class36.field445 = Integer.MAX_VALUE;
                class111.field1716 = Integer.MAX_VALUE;
                class158.field2374 = Integer.MAX_VALUE;
                int var8 = class249.field3714[var7] * this.field3011 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field3001[(var11 >= this.field3010 ? var11 - this.field3010 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field3001[(var13 >= this.field3011 ? var13 - this.field3011 : var13) + var12 & 0xFF] & 0xFF) * 2;
                        int var10001 = var13 << 12;
                        int var27 = var14 + 1;
                        int var15 = var8 - (var10001 + this.field3009[var14]);
                        int var16 = var4 - (var11 << 12) - this.field3009[var27];
                        int var17 = this.field3002;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var19 = var16 < 0 ? -var16 : var16;
                            int var20 = var15 < 0 ? -var15 : var15;
                            var18 = var20 <= var19 ? var19 : var20;
                        } else if (var17 == 4) {
                            int var21 = (int) (Math.sqrt((double) ((float) (var15 >= 0 ? var15 : -var15) / 4096.0F)) * 4096.0D);
                            int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                            int var23 = var21 + var22;
                            var18 = var23 * var23 >> 12;
                        } else if (var17 == 5) {
                            int var24 = var15 * var15;
                            int var25 = var16 * var16;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var24 + var25) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var16 >= 0 ? var16 : -var16) + (var15 < 0 ? -var15 : var15);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (class158.field2374 > var18) {
                            class67.field888 = class36.field445;
                            class36.field445 = class111.field1716;
                            class111.field1716 = class158.field2374;
                            class158.field2374 = var18;
                        } else if (class111.field1716 > var18) {
                            class67.field888 = class36.field445;
                            class36.field445 = class111.field1716;
                            class111.field1716 = var18;
                        } else if (var18 < class36.field445) {
                            class67.field888 = class36.field445;
                            class36.field445 = var18;
                        } else if (class67.field888 > var18) {
                            class67.field888 = var18;
                        }
                    }
                }
                int var26 = this.field3008;
                if (var26 == 0) {
                    var3[var7] = class158.field2374;
                } else if (var26 == 1) {
                    var3[var7] = class111.field1716;
                } else if (var26 == 3) {
                    var3[var7] = class36.field445;
                } else if (var26 == 4) {
                    var3[var7] = class67.field888;
                } else if (var26 == 2) {
                    var3[var7] = class111.field1716 - class158.field2374;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILre;I)V", line = 238)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg2 >= -37) {
            field2999 = -13;
        }
        if (arg0 == 0) {
            this.field3011 = this.field3010 = arg1.method1787(false);
        } else if (arg0 == 1) {
            this.field3004 = arg1.method1787(false);
        } else if (arg0 == 2) {
            this.field2997 = arg1.method1830((byte) -77);
        } else if (arg0 == 3) {
            this.field3008 = arg1.method1787(false);
        } else if (arg0 == 4) {
            this.field3002 = arg1.method1787(false);
        } else if (arg0 == 5) {
            this.field3011 = arg1.method1787(false);
        } else if (arg0 == 6) {
            this.field3010 = arg1.method1787(false);
        }
        field3006++;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V", line = 425)
    public class201() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "(I)V", line = 332)
    public final void method47(int arg0) {
        field3007++;
        if (arg0 != -9) {
            field3015 = (String) null;
        }
        this.field3001 = class321.method2204(this.field3004, 511);
        this.method1377(16610);
    }

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "(I)V", line = 356)
    private final void method1377(int arg0) {
        Random var2 = new Random((long) this.field3004);
        if (arg0 != 16610) {
            return;
        }
        this.field3009 = new short[512];
        field3014++;
        if (this.field2997 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field3009[var3] = (short) class216.method1488(this.field2997, true, var2);
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IB)V", line = 382)
    public static final void method1378(int arg0, byte arg1) {
        if (arg1 != -17) {
            return;
        }
        field3013++;
        if (arg0 == 37) {
            class61.field802 = 3.0F;
        } else if (arg0 == 50) {
            class61.field802 = 4.0F;
        } else if (arg0 == 75) {
            class61.field802 = 6.0F;
        } else if (arg0 == 100) {
            class61.field802 = 8.0F;
        } else if (arg0 == 200) {
            class61.field802 = 16.0F;
        }
        class204.field3070 = -1;
        class204.field3070 = -1;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 436)
    public static final String method1379(String arg0, int arg1, String arg2, String arg3) {
        field3005++;
        int var4 = arg2.length();
        int var5 = arg0.length();
        if (arg1 > -44) {
            method1379((String) null, 71, (String) null, (String) null);
        }
        int var6 = arg3.length();
        if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
        }
        int var7 = var4;
        int var8 = var6 - var5;
        if (var8 != 0) {
            int var9 = 0;
            while (true) {
                int var10 = arg2.indexOf(arg0, var9);
                if (var10 < 0) {
                    break;
                }
                var7 += var8;
                var9 = var5 + var10;
            }
        }
        StringBuffer var11 = new StringBuffer(var7);
        int var12 = 0;
        while (true) {
            int var13 = arg2.indexOf(arg0, var12);
            if (var13 < 0) {
                var11.append(arg2.substring(var12));
                return var11.toString();
            }
            var11.append(arg2.substring(var12, var13));
            var12 = var5 + var13;
            var11.append(arg3);
        }
    }
}
