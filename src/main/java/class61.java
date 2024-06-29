import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class61 extends class17 {

    @OriginalMember(owner = "client!b", name = "hb", descriptor = "[S")
    private short[] field975 = new short[512];

    @OriginalMember(owner = "client!b", name = "jb", descriptor = "I")
    private int field977 = 1;

    @OriginalMember(owner = "client!b", name = "ab", descriptor = "I")
    private int field968 = 5;

    @OriginalMember(owner = "client!b", name = "nb", descriptor = "[B")
    private byte[] field981 = new byte[512];

    @OriginalMember(owner = "client!b", name = "kb", descriptor = "I")
    private int field978 = 2;

    @OriginalMember(owner = "client!b", name = "ib", descriptor = "I")
    private int field976 = 5;

    @OriginalMember(owner = "client!b", name = "eb", descriptor = "I")
    private int field972 = 0;

    @OriginalMember(owner = "client!b", name = "ob", descriptor = "I")
    private int field982 = 2048;

    @OriginalMember(owner = "client!b", name = "cb", descriptor = "Lsf;")
    public static class108 field970 = class140.method973(255, "D-Bmarrage de la librairie 3D");

    @OriginalMember(owner = "client!b", name = "bb", descriptor = "I")
    public static int field969 = 0;

    @OriginalMember(owner = "client!b", name = "db", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!b", name = "fb", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!b", name = "gb", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!b", name = "mb", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!b", name = "pb", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!b", name = "qb", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!b", name = "rb", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!b", name = "lb", descriptor = "[I")
    public static int[] field979;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(Z)V", line = 9)
    public final void method116(boolean arg0) {
        if (arg0) {
            this.field981 = class135.method927(this.field972, 0);
            field973++;
            this.method424((byte) 93);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(ZI)Lpb;", line = 23)
    public static final class78 method423(boolean arg0, int arg1) {
        if (arg0) {
            return (class78) null;
        }
        class78 var2 = (class78) class215.field3811.method642((long) arg1, (byte) -122);
        field984++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class55.field802.method1868(12236, 1, arg1);
        class78 var4 = new class78();
        var4.field1195 = arg1;
        if (var3 != null) {
            var4.method514(new class249(var3), -1);
        }
        var4.method511(1246);
        class215.field3811.method643((byte) -49, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(B)V", line = 59)
    private final void method424(byte arg0) {
        field985++;
        Random var2 = new Random((long) this.field972);
        this.field975 = new short[512];
        if (this.field982 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field975[var3] = (short) class109.method792(-11163, var2, this.field982);
            }
        }
        if (arg0 != 93) {
            method423(true, 100);
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V", line = 84)
    public class61() {
        super(0, true);
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(II)V", line = 91)
    public static final void method425(int arg0, int arg1) {
        class120 var2 = class248.method1704(arg1, 81, arg0);
        field971++;
        var2.method843((byte) 28);
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(II)[I", line = 107)
    public final int[] method120(int arg0, int arg1) {
        field983++;
        if (arg0 >= -95) {
            this.field981 = (byte[]) null;
        }
        int[] var3 = this.field217.method1698(-3, arg1);
        if (this.field217.field4295) {
            int var4 = (class36.field504[arg1] * this.field976) + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class116.field2008; var7++) {
                class13.field157 = Integer.MAX_VALUE;
                class53.field782 = Integer.MAX_VALUE;
                class155.field2785 = Integer.MAX_VALUE;
                class120.field2050 = Integer.MAX_VALUE;
                int var8 = field979[var7] * this.field968 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field981[(var11 >= this.field976 ? var11 - this.field976 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field981[var12 + (this.field968 > var13 ? var13 : var13 - this.field968) & 0xFF] & 0xFF) * 2;
                        int var10000 = -(var13 << 12);
                        int var27 = var14 + 1;
                        int var15 = var10000 + var8 - this.field975[var14];
                        int var16 = var4 - (var11 << 12) - this.field975[var27];
                        int var17 = this.field977;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var19 = var16 >= 0 ? var16 : -var16;
                            int var20 = var15 >= 0 ? var15 : -var15;
                            var18 = var19 < var20 ? var20 : var19;
                        } else if (var17 == 4) {
                            int var21 = (int) (Math.sqrt((double) ((float) (var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
                            int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                            int var23 = var21 + var22;
                            var18 = var23 * var23 >> 12;
                        } else if (var17 == 5) {
                            int var24 = var15 * var15;
                            int var25 = var16 * var16;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var24 + var25) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var15 < 0 ? -var15 : var15) + (var16 >= 0 ? var16 : -var16);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (class120.field2050 > var18) {
                            class13.field157 = class53.field782;
                            class53.field782 = class155.field2785;
                            class155.field2785 = class120.field2050;
                            class120.field2050 = var18;
                        } else if (class155.field2785 > var18) {
                            class13.field157 = class53.field782;
                            class53.field782 = class155.field2785;
                            class155.field2785 = var18;
                        } else if (var18 < class53.field782) {
                            class13.field157 = class53.field782;
                            class53.field782 = var18;
                        } else if (class13.field157 > var18) {
                            class13.field157 = var18;
                        }
                    }
                }
                int var26 = this.field978;
                if (var26 == 0) {
                    var3[var7] = class120.field2050;
                } else if (var26 == 1) {
                    var3[var7] = class155.field2785;
                } else if (var26 == 3) {
                    var3[var7] = class53.field782;
                } else if (var26 == 4) {
                    var3[var7] = class13.field157;
                } else if (var26 == 2) {
                    var3[var7] = class155.field2785 - class120.field2050;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BLrm;I)V", line = 342)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        if (arg2 == 0) {
            this.field968 = this.field976 = arg1.method1731(true);
        } else if (arg2 == 1) {
            this.field972 = arg1.method1731(true);
        } else if (arg2 == 2) {
            this.field982 = arg1.method1712(-1);
        } else if (arg2 == 3) {
            this.field978 = arg1.method1731(true);
        } else if (arg2 == 4) {
            this.field977 = arg1.method1731(true);
        } else if (arg2 == 5) {
            this.field968 = arg1.method1731(true);
        } else if (arg2 == 6) {
            this.field976 = arg1.method1731(true);
        }
        if (arg0 == -114) {
            field974++;
        }
    }

    @OriginalMember(owner = "client!b", name = "h", descriptor = "(I)V", line = 415)
    public static void method426(int arg0) {
        field979 = null;
        if (arg0 != 1) {
            field969 = 37;
        }
        field970 = null;
    }
}
