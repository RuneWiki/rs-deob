import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class59 extends class45 {

    @OriginalMember(owner = "client!in", name = "L", descriptor = "[B")
    private byte[] field1040 = new byte[512];

    @OriginalMember(owner = "client!in", name = "I", descriptor = "I")
    private int field1037 = 1;

    @OriginalMember(owner = "client!in", name = "P", descriptor = "I")
    private int field1044 = 5;

    @OriginalMember(owner = "client!in", name = "Q", descriptor = "I")
    private int field1045 = 2;

    @OriginalMember(owner = "client!in", name = "U", descriptor = "[S")
    private short[] field1049 = new short[512];

    @OriginalMember(owner = "client!in", name = "Y", descriptor = "I")
    private int field1053 = 2048;

    @OriginalMember(owner = "client!in", name = "X", descriptor = "I")
    private int field1052 = 0;

    @OriginalMember(owner = "client!in", name = "W", descriptor = "I")
    private int field1051 = 5;

    @OriginalMember(owner = "client!in", name = "T", descriptor = "Liv;")
    public static class64 field1048 = new class64(0, -2);

    @OriginalMember(owner = "client!in", name = "H", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!in", name = "J", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!in", name = "K", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!in", name = "M", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!in", name = "N", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!in", name = "O", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!in", name = "R", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!in", name = "S", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!in", name = "V", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V", line = 279)
    public class59() {
        super(0, true);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIB)B", line = 13)
    public static final byte method521(int arg0, int arg1, byte arg2) {
        if (arg2 <= 35) {
            field1048 = null;
        }
        ++field1039;
        if (arg0 != 9) {
            return 0;
        } else {
            return (byte) (~(1 & arg1) == -1 ? 1 : 2);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II)[I", line = 32)
    public final int[] method35(int arg0, int arg1) {
        ++field1050;
        if (arg0 != 0) {
            return null;
        } else {
            int[] var3 = super.field854.method863((byte) 12, arg1);
            if (super.field854.field1928) {
                int var4 = class433.field6429[arg1] * this.field1044 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; ~var7 > ~class259.field3768; ++var7) {
                    class214.field3091 = Integer.MAX_VALUE;
                    class234.field3410 = Integer.MAX_VALUE;
                    class467.field6968 = Integer.MAX_VALUE;
                    class157.field2462 = Integer.MAX_VALUE;
                    int var8 = class69.field1199[var7] * this.field1051 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                        int var13 = 255 & this.field1040[(this.field1044 <= var11 ? -this.field1044 + var11 : var11) & 255];
                        for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                            int var15 = (this.field1040[255 & var13 + (var14 < this.field1051 ? var14 : -this.field1051 + var14)] & 255) * 2;
                            int var10000 = -(var14 << 12);
                            int var27 = var15 + 1;
                            int var16 = var10000 - (this.field1049[var15] - var8);
                            int var17 = var4 - (this.field1049[var27] - -(var11 << 12));
                            int var18 = this.field1037;
                            int var19;
                            if (var18 != 1) {
                                if (~var18 != -4) {
                                    if (~var18 != -5) {
                                        if (var18 != 5) {
                                            if (~var18 == -3) {
                                                var19 = (var17 < 0 ? -var17 : var17) + (~var16 <= -1 ? var16 : -var16);
                                            } else {
                                                var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)) * 4096.0D);
                                            }
                                        } else {
                                            int var20 = var17 * var17;
                                            int var21 = var16 * var16;
                                            var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                        }
                                    } else {
                                        int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)));
                                        int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)));
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = var16 < 0 ? -var16 : var16;
                                    int var26 = ~var17 > -1 ? -var17 : var17;
                                    var19 = ~var25 >= ~var26 ? var26 : var25;
                                }
                            } else {
                                var19 = var16 * var16 + var17 * var17 >> 12;
                            }
                            if (~var19 > ~class157.field2462) {
                                class214.field3091 = class234.field3410;
                                class234.field3410 = class467.field6968;
                                class467.field6968 = class157.field2462;
                                class157.field2462 = var19;
                            } else if (~class467.field6968 < ~var19) {
                                class214.field3091 = class234.field3410;
                                class234.field3410 = class467.field6968;
                                class467.field6968 = var19;
                            } else if (~class234.field3410 < ~var19) {
                                class214.field3091 = class234.field3410;
                                class234.field3410 = var19;
                            } else if (~var19 > ~class214.field3091) {
                                class214.field3091 = var19;
                            }
                        }
                    }
                    int var12 = this.field1045;
                    if (~var12 != -1) {
                        if (var12 != 1) {
                            if (~var12 != -4) {
                                if (~var12 != -5) {
                                    if (~var12 == -3) {
                                        var3[var7] = -class157.field2462 + class467.field6968;
                                    }
                                } else {
                                    var3[var7] = class214.field3091;
                                }
                            } else {
                                var3[var7] = class234.field3410;
                            }
                        } else {
                            var3[var7] = class467.field6968;
                        }
                    } else {
                        var3[var7] = class157.field2462;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(I)V", line = 245)
    public static void method522(int arg0) {
        field1048 = null;
        if (arg0 != -1) {
            field1048 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(II)Las;", line = 255)
    public static final class104 method523(int arg0, int arg1) {
        ++field1043;
        int var2 = -123 / ((12 - arg1) / 63);
        class104 var3 = (class104) class348.field5199.method494(0, (long) arg0);
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class104.field1727.method114(arg0, 0, 127);
            class104 var5 = new class104();
            if (var4 != null) {
                var5.method783(new class145(var4), -19832, arg0);
            }
            class348.field5199.method485((long) arg0, (byte) -125, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(I)V", line = 284)
    public final void method38(int arg0) {
        ++field1047;
        this.field1040 = class89.method694(this.field1052, 512);
        this.method524(-1);
        if (arg0 != 4095) {
            this.method35(-57, -75);
        }
    }

    @OriginalMember(owner = "client!in", name = "f", descriptor = "(I)V", line = 301)
    private final void method524(int arg0) {
        if (arg0 == -1) {
            ++field1041;
            Random var2 = new Random((long) this.field1052);
            this.field1049 = new short[512];
            if (this.field1053 > 0) {
                for (int var3 = 0; var3 < 512; ++var3) {
                    this.field1049[var3] = (short) class455.method2714(var2, this.field1053, -13848);
                }
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "g", descriptor = "(I)[Lop;", line = 331)
    public static final class124[] method525(int arg0) {
        if (arg0 != 0) {
            field1048 = null;
        }
        ++field1038;
        return new class124[] { class446.field6661, class284.field4055, class516.field7583, class257.field3728, class177.field2702, class4.field112 };
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lcu;II)V", line = 342)
    public final void method37(class145 arg0, int arg1, int arg2) {
        ++field1042;
        if (arg1 != -26471) {
            this.method38(83);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field1044 = arg0.method1063((byte) -56);
                                }
                            } else {
                                this.field1051 = arg0.method1063((byte) 126);
                            }
                        } else {
                            this.field1037 = arg0.method1063((byte) 122);
                        }
                    } else {
                        this.field1045 = arg0.method1063((byte) 127);
                    }
                } else {
                    this.field1053 = arg0.method1069((byte) -117);
                }
            } else {
                this.field1052 = arg0.method1063((byte) 103);
            }
        } else {
            this.field1051 = this.field1044 = arg0.method1063((byte) -22);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IZZLli;Ljava/lang/String;)V", line = 424)
    public static final void method526(int arg0, boolean arg1, boolean arg2, class293 arg3, String arg4) {
        if (arg0 == -4) {
            ++field1036;
            if (!arg1) {
                class110.method822(arg3, (byte) -103, 3, arg4);
            } else {
                if (class293.field4167.startsWith("win") && ~class293.field4179 != -4) {
                    String var5 = null;
                    if (arg3.field4170 != null) {
                        var5 = arg3.field4170.getParameter("haveie6");
                    }
                    if (var5 == null || !var5.equals("1")) {
                        class324 var6 = class110.method822(arg3, (byte) -88, 0, arg4);
                        class398.field6007 = arg3;
                        class518.field7711 = arg4;
                        class237.field3426 = var6;
                        return;
                    }
                }
                if (class293.field4167.startsWith("mac")) {
                    String var7 = null;
                    if (arg3.field4170 != null) {
                        var7 = arg3.field4170.getParameter("havefirefox");
                    }
                    if (var7 != null && var7.equals("1") && arg2) {
                        class110.method822(arg3, (byte) -97, 1, arg4);
                        return;
                    }
                }
                class110.method822(arg3, (byte) -98, 2, arg4);
            }
        }
    }
}
