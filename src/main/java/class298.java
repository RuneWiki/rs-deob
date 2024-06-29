import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class298 extends class177 {

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "[B")
    private byte[] field4671 = new byte[512];

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
    private int field4675 = 5;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
    private int field4677 = 2;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    private int field4683 = 1;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    private int field4668 = 0;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "I")
    private int field4680 = 5;

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "I")
    private int field4684 = 2048;

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "[S")
    private short[] field4687 = new short[512];

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public static int field4669 = 5063219;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    public static int field4673 = 0;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    public static int field4666 = 0;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "I")
    public static int field4676 = -1;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
    public static int field4667 = 0;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "Z")
    public static boolean field4674 = true;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "Ljava/lang/String;")
    public static String field4664;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V", line = 16)
    private final void method2095(int arg0) {
        field4665++;
        Random var2 = new Random((long) this.field4668);
        this.field4687 = new short[512];
        if (arg0 != -683) {
            this.field4684 = -50;
        }
        if (this.field4684 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field4687[var3] = (short) class66.method561(true, var2, this.field4684);
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIZ)Lsd;", line = 47)
    public static final class27 method2096(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field4672++;
        int var7 = arg3 + (arg5 ? 65536 : 0) + (arg2 << 17) + (arg1 << 19);
        long var8 = (long) arg0 * 3147483667L + (long) var7 * 3849834839L;
        class27 var10 = (class27) class116.field1815.method1432((byte) 93, var8);
        if (var10 != null) {
            return var10;
        }
        class56.field827 = false;
        class27 var11 = class59.method528(arg2, false, false, (byte) -107, arg3, arg1, arg0, arg5);
        if (var11 != null && !class56.field827) {
            class116.field1815.method1436(false, var11, var8);
        }
        if (arg4 != 5) {
            field4676 = 82;
        }
        return var11;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lhb;II)V", line = 73)
    public final void method97(class35 arg0, int arg1, int arg2) {
        if (arg1 != -18061) {
            field4667 = -71;
        }
        if (arg2 == 0) {
            this.field4675 = this.field4680 = arg0.method273(arg1 ^ 0xFFFF4673);
        } else if (arg2 == 1) {
            this.field4668 = arg0.method273(arg1 + 83341);
        } else if (arg2 == 2) {
            this.field4684 = arg0.method300(-1394191632);
        } else if (arg2 == 3) {
            this.field4677 = arg0.method273(65280);
        } else if (arg2 == 4) {
            this.field4683 = arg0.method273(65280);
        } else if (arg2 == 5) {
            this.field4675 = arg0.method273(arg1 + 83341);
        } else if (arg2 == 6) {
            this.field4680 = arg0.method273(65280);
        }
        field4686++;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V", line = 178)
    public class298() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Llb;IIILlb;)Lm;", line = 182)
    public static final class48 method2097(class211 arg0, int arg1, int arg2, int arg3, class211 arg4) {
        field4670++;
        if (class297.method2093(arg2, arg1, (byte) 102, arg0)) {
            if (arg3 != 18573) {
                field4666 = -66;
            }
            return class138.method1046(arg4.method1507(arg1, (byte) 119, arg2), arg3 ^ 0x48F2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[I", line = 199)
    public final int[] method95(int arg0, int arg1) {
        if (arg0 > -52) {
            return (int[]) null;
        }
        int[] var3 = this.field2652.method1481(arg1, (byte) -93);
        field4681++;
        if (this.field2652.field3287) {
            int var4 = class260.field3858[arg1] * this.field4680 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class287.field4415; var7++) {
                class132.field2057 = Integer.MAX_VALUE;
                class138.field2154 = Integer.MAX_VALUE;
                class246.field3703 = Integer.MAX_VALUE;
                class242.field3643 = Integer.MAX_VALUE;
                int var8 = class179.field2684[var7] * this.field4675 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field4671[(var11 < this.field4680 ? var11 : var11 - this.field4680) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field4671[var12 + (var13 >= this.field4675 ? var13 - this.field4675 : var13) & 0xFF] & 0xFF) * 2;
                        int var27 = var14 + 1;
                        int var15 = var8 - this.field4687[var14] - (var13 << 12);
                        int var16 = var4 - (var11 << 12) - this.field4687[var27];
                        int var17 = this.field4683;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var19 = var15 < 0 ? -var15 : var15;
                            int var20 = var16 >= 0 ? var16 : -var16;
                            var18 = var19 <= var20 ? var20 : var19;
                        } else if (var17 == 4) {
                            int var23 = (int) (Math.sqrt((double) ((float) (var15 >= 0 ? var15 : -var15) / 4096.0F)) * 4096.0D);
                            int var24 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                            int var25 = var23 + var24;
                            var18 = var25 * var25 >> 12;
                        } else if (var17 == 5) {
                            int var21 = var16 * var16;
                            int var22 = var15 * var15;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 + var22) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var16 >= 0 ? var16 : -var16) + (var15 < 0 ? -var15 : var15);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + (var16 * var16)) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (class242.field3643 > var18) {
                            class132.field2057 = class138.field2154;
                            class138.field2154 = class246.field3703;
                            class246.field3703 = class242.field3643;
                            class242.field3643 = var18;
                        } else if (class246.field3703 > var18) {
                            class132.field2057 = class138.field2154;
                            class138.field2154 = class246.field3703;
                            class246.field3703 = var18;
                        } else if (class138.field2154 > var18) {
                            class132.field2057 = class138.field2154;
                            class138.field2154 = var18;
                        } else if (var18 < class132.field2057) {
                            class132.field2057 = var18;
                        }
                    }
                }
                int var26 = this.field4677;
                if (var26 == 0) {
                    var3[var7] = class242.field3643;
                } else if (var26 == 1) {
                    var3[var7] = class246.field3703;
                } else if (var26 == 3) {
                    var3[var7] = class138.field2154;
                } else if (var26 == 4) {
                    var3[var7] = class132.field2057;
                } else if (var26 == 2) {
                    var3[var7] = class246.field3703 - class242.field3643;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 406)
    public final void method465(int arg0) {
        int var2 = 118 % ((arg0 + 6) / 43);
        field4682++;
        this.field4671 = class299.method2104(0, this.field4668);
        this.method2095(-683);
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V", line = 435)
    public static void method2098(int arg0) {
        int var1 = -120 % ((arg0 - 24) / 37);
        field4664 = null;
    }
}
