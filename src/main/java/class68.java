import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class68 extends class314 {

    @OriginalMember(owner = "client!aw", name = "L", descriptor = "I")
    private int field864 = 3216;

    @OriginalMember(owner = "client!aw", name = "M", descriptor = "I")
    private int field865 = 4096;

    @OriginalMember(owner = "client!aw", name = "O", descriptor = "[I")
    private int[] field867 = new int[3];

    @OriginalMember(owner = "client!aw", name = "W", descriptor = "I")
    private int field875 = 3216;

    @OriginalMember(owner = "client!aw", name = "T", descriptor = "J")
    public static volatile long field872 = 0L;

    @OriginalMember(owner = "client!aw", name = "U", descriptor = "Lpw;")
    public static class656 field873 = new class656();

    @OriginalMember(owner = "client!aw", name = "N", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!aw", name = "P", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!aw", name = "Q", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!aw", name = "R", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!aw", name = "S", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!aw", name = "V", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        ++field871;
        int[] var3 = super.field4928.method534((byte) -108, arg0);
        if (arg1 <= 109) {
            this.method3((byte) 95);
        }
        if (super.field4928.field618) {
            int var4 = class433.field6589 * this.field865 >> 12;
            int[] var5 = this.method2140(0, class66.field849 & arg0 + -1, -122);
            int[] var6 = this.method2140(0, arg0, -122);
            int[] var7 = this.method2140(0, arg0 - -1 & class66.field849, -123);
            for (int var8 = 0; var8 < class81.field1009; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class504.field7373 & var8 + -1] + -var6[var8 - -1 & class504.field7373]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class587.field8348[((var12 - -1) * var12 >> 1) + var11] & 255;
                int var14 = var13 * 4096 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var10 * var13 >> 8;
                int var17 = this.field867[2] * var14 >> 12;
                int var18 = this.field867[1] * var15 >> 12;
                int var19 = this.field867[0] * var16 >> 12;
                var3[var8] = var18 + var19 - -var17;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(B)V")
    public static void method714(byte arg0) {
        field873 = null;
        if (arg0 != 5) {
            method714((byte) 28);
        }
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(IB)V")
    public static final void method715(int arg0, byte arg1) {
        ++field866;
        if (~class682.field9564 != ~arg0) {
            if (arg0 == 13) {
                if (class234.field3704 != null) {
                    class240.method1724(class700.field9878, (byte) 79);
                } else {
                    class89.method805(-29536, class63.field808, class700.field9878, class521.field7550);
                }
            }
            if (arg0 != 13 && class585.field8325 != null) {
                class585.field8325.method588(24331);
                class585.field8325 = null;
            }
            if (~arg0 == -4) {
                class546.method3298((byte) 82, ~class528.field7706 != ~class379.field5912);
            }
            if (arg0 == 7) {
                class566.method3352(~class528.field7706 != ~class177.field2914, -1);
            }
            if (~arg0 != -6) {
                if (arg0 != 6) {
                    if (~arg0 == -10) {
                        if (class234.field3704 == null) {
                            class89.method805(-29536, class63.field808, class700.field9878, class521.field7550);
                        } else {
                            class240.method1724(class700.field9878, (byte) 79);
                        }
                    } else if (~arg0 == -13) {
                        if (class234.field3704 == null) {
                            class98.method959(class63.field808, class521.field7550, 9528);
                        } else {
                            class40.method516(-4682);
                        }
                    }
                } else if (class234.field3704 == null) {
                    class89.method805(-29536, class63.field808, class700.field9878, class521.field7550);
                } else {
                    class240.method1724(class700.field9878, (byte) 79);
                }
            } else if (class234.field3704 == null) {
                class98.method959(class63.field808, class521.field7550, 9528);
            } else {
                class40.method516(-4682);
            }
            if (class255.method1804(-5737, class682.field9564)) {
                class456.field6845.field1555 = 2;
                class216.field3561.field1555 = 2;
                class422.field6434.field1555 = 2;
                class132.field2157.field1555 = 2;
                class304.field4755.field1555 = 2;
                class286.field4546.field1555 = 2;
                class28.field434.field1555 = 2;
            }
            if (class255.method1804(-5737, arg0)) {
                class402.field6206 = 1;
                class533.field7756 = 0;
                class6.field80 = 0;
                class51.field689 = 0;
                class112.field1781 = 1;
                class373.method2453(true, -50);
                class456.field6845.field1555 = 1;
                class216.field3561.field1555 = 1;
                class422.field6434.field1555 = 1;
                class132.field2157.field1555 = 1;
                class304.field4755.field1555 = 1;
                class286.field4546.field1555 = 1;
                class28.field434.field1555 = 1;
            }
            if (arg0 == 11 || arg0 == 3) {
                class184.method1494(true);
            }
            boolean var2 = arg0 == 2 || class668.method3832(arg0, 28100) || class471.method2924((byte) 54, arg0);
            if (arg1 > -16) {
                field872 = 9L;
            }
            boolean var3 = ~class682.field9564 == -3 || class668.method3832(class682.field9564, 28100) || class471.method2924((byte) 86, class682.field9564);
            if (var2 != var3) {
                if (!var2) {
                    class143.method1217(2, -21411);
                    class683.field9586.method2961(true, -15945);
                } else {
                    class187.field3121 = class560.field8076;
                    if (~class17.field282.field4863 != -1) {
                        class339.method2321(class560.field8076, class17.field282.field4863, class663.field9232, -13082, 2, 0, false);
                        class87.method800((byte) 7);
                    } else {
                        class143.method1217(2, -21411);
                    }
                    class683.field9586.method2961(false, -15945);
                }
            }
            if (class255.method1804(-5737, arg0) || arg0 == 13) {
                class627.field8857.method143();
            }
            class682.field9564 = arg0;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(BLie;I)V")
    public final void method5(byte arg0, class6 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field875 = arg1.method67(12021);
                }
            } else {
                this.field864 = arg1.method67(12021);
            }
        } else {
            this.field865 = arg1.method67(12021);
        }
        ++field869;
        if (arg0 > -1) {
            this.field867 = null;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)V")
    public final void method3(byte arg0) {
        this.method716(-114);
        ++field870;
        if (arg0 != -15) {
            this.field865 = 94;
        }
    }

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "(I)V")
    private final void method716(int arg0) {
        ++field868;
        double var2 = Math.cos((double) ((float) this.field875 / 4096.0F));
        this.field867[0] = (int) (var2 * Math.sin((double) ((float) this.field864 / 4096.0F)) * 4096.0D);
        this.field867[1] = (int) (4096.0D * Math.cos((double) ((float) this.field864 / 4096.0F)) * var2);
        this.field867[2] = (int) (4096.0D * Math.sin((double) ((float) this.field875 / 4096.0F)));
        int var4 = this.field867[0] * this.field867[0] >> 12;
        int var5 = this.field867[1] * this.field867[1] >> 12;
        int var6 = this.field867[2] * this.field867[2] >> 12;
        if (arg0 <= -113) {
            int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var6 - -var5 >> 12)));
            if (var7 != 0) {
                this.field867[2] = (this.field867[2] << 12) / var7;
                this.field867[0] = (this.field867[0] << 12) / var7;
                this.field867[1] = (this.field867[1] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "()V")
    public class68() {
        super(1, true);
    }
}
