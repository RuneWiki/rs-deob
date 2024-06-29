import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class219 extends class82 {

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    private int field2699 = 4096;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "[[Z")
    public static boolean[][] field2701 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)V", line = 5)
    public static final void method1260(int arg0) {
        class136.field1663.field4966 = 0;
        ++field2704;
        class312.field3981 = null;
        class323.field4098 = null;
        class378.field5033 = null;
        class532.field7483.field4966 = 0;
        class445.field6138 = 0;
        class426.field5483 = 0;
        class59.field577 = 0;
        class160.field1937 = null;
        class66.method370((byte) -128);
        class598.method3456(13939);
        for (int var1 = 0; ~var1 > -2049; ++var1) {
            class459.field6329[var1] = null;
        }
        class103.field1265 = null;
        for (int var2 = 0; var2 < class98.field1215; ++var2) {
            class459 var4 = class393.field5189[var2].field5390;
            if (var4 != null) {
                var4.field6479 = -1;
            }
        }
        class202.method1088((byte) -43);
        class617.field8931 = arg0;
        class35.method200(9, arg0 ^ 3);
        for (int var3 = 0; ~var3 > -101; ++var3) {
            class371.field4888[var3] = true;
        }
        class37.method205((byte) -77);
        class91.field1127 = 0L;
        class216.field2639 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BJ)V", line = 62)
    public static final void method1261(byte arg0, long arg1) {
        ++field2703;
        if (arg0 != -109) {
            field2706 = 127;
        }
        int var3 = class429.field5826;
        if (class485.field6788 != var3) {
            int var4 = -class485.field6788 + var3;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (~var4 >= -1) {
                if (~var5 == -1) {
                    var5 = -1;
                } else if (~var5 > ~var4) {
                    var5 = var4;
                }
            } else if (var5 != 0) {
                if (var4 < var5) {
                    var5 = var4;
                }
            } else {
                var5 = 1;
            }
            class485.field6788 += var5;
        }
        int var6 = class449.field6219;
        if (!class565.field8299.field2184) {
            class558.field8223 += (float) arg1 * class289.field3759 / 40.0F * 8.0F;
            class588.field8527 += (float) arg1 * class237.field2969 / 40.0F * 8.0F;
        }
        if (~class381.field5051 != ~var6) {
            int var7 = var6 - class381.field5051;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (~var7 < -1) {
                if (~var8 != -1) {
                    if (~var7 > ~var8) {
                        var8 = var7;
                    }
                } else {
                    var8 = 1;
                }
            } else if (~var8 == -1) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class381.field5051 += var8;
        }
        class443.method2596(arg0 ^ 7408);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)V", line = 149)
    public static final void method1262(byte arg0, int arg1) {
        ++field2700;
        class557 var2 = class93.method564(6, -14073, arg1);
        if (arg0 > -57) {
            method1264(18);
        }
        var2.method3264(-1037624096);
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V", line = 162)
    public class219() {
        super(1, true);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ldn;Ldn;Lqa;I)V", line = 166)
    public static final void method1263(class438 arg0, class438 arg1, class206 arg2, int arg3) {
        class330.field4307 = class530.method3021(false, 0, class478.field6708, arg1);
        ++field2709;
        if (arg3 != -21120) {
            method1262((byte) -104, 58);
        }
        class403.field5290 = arg2.method1153(class330.field4307, class3.method14(arg0, class478.field6708, 0), true);
        class92.field1129 = class530.method3021(false, 0, class99.field1236, arg1);
        class137.field1673 = arg2.method1153(class92.field1129, class3.method14(arg0, class99.field1236, 0), true);
        class410.field5340 = class530.method3021(false, 0, class205.field2463, arg1);
        class459.field6320 = arg2.method1153(class410.field5340, class3.method14(arg0, class205.field2463, 0), true);
    }

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)V", line = 183)
    public static void method1264(int arg0) {
        field2701 = null;
        if (arg0 != 4096) {
            method1262((byte) 33, 119);
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)[I", line = 198)
    public final int[] method201(int arg0, int arg1) {
        ++field2707;
        if (arg1 != 12218) {
            this.field2699 = -36;
        }
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (super.field990.field3641) {
            int[] var4 = this.method489(false, 0, arg0 + -1 & class466.field6523);
            int[] var5 = this.method489(false, 0, arg0);
            int[] var6 = this.method489(false, 0, class466.field6523 & arg0 + 1);
            for (int var7 = 0; ~class629.field9033 < ~var7; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field2699;
                int var9 = (var5[class129.field1590 & var7 + 1] + -var5[var7 + -1 & class129.field1590]) * this.field2699;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lpq;ILdn;)V", line = 257)
    public static final void method1265(class165 arg0, int arg1, class438 arg2) {
        ++field2708;
        if (arg1 == -1) {
            class475.field6674 = arg0;
            class532.field7489 = arg2;
            class544.field7969 = "";
            if (class165.field2026.startsWith("win")) {
                class544.field7969 = class544.field7969 + "windows/";
            } else if (class165.field2026.startsWith("linux")) {
                class544.field7969 = class544.field7969 + "linux/";
            } else if (class165.field2026.startsWith("mac")) {
                class544.field7969 = class544.field7969 + "macos/";
            }
            if (~class165.field2028 != -3) {
                if (!class165.field2010.startsWith("amd64") && !class165.field2010.startsWith("x86_64")) {
                    if (!class165.field2010.startsWith("i586") && !class165.field2010.startsWith("x86")) {
                        if (!class165.field2010.startsWith("ppc")) {
                            class544.field7969 = class544.field7969 + "universal/";
                        } else {
                            class544.field7969 = class544.field7969 + "ppc/";
                        }
                    } else {
                        class544.field7969 = class544.field7969 + "x86/";
                    }
                } else {
                    class544.field7969 = class544.field7969 + "x86_64/";
                }
            } else {
                class544.field7969 = class544.field7969 + "msjava/";
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILos;)V", line = 298)
    public final void method198(int arg0, int arg1, class374 arg2) {
        ++field2705;
        if (~arg0 == -1) {
            this.field2699 = arg2.method2136(false);
        }
        int var4 = -67 / ((-69 - arg1) / 42);
    }
}
