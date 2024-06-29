import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class404 extends class398 {

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "Z")
    private boolean field6004 = true;

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "Z")
    private boolean field6008 = true;

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "Z")
    public static boolean field6009 = false;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!ta", name = "P", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!ta", name = "Q", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!ta", name = "R", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!ta", name = "S", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!ta", name = "T", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!ta", name = "U", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)[[I", line = 3)
    public final int[][] method99(int arg0, int arg1) {
        if (arg1 != 2) {
            field6009 = true;
        }
        ++field6013;
        int[][] var3 = super.field5933.method2205((byte) -114, arg0);
        if (super.field5933.field4847) {
            int[][] var4 = this.method2561(this.field6008 ? -arg0 + class411.field6070 : arg0, (byte) -105, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field6004) {
                for (int var11 = 0; var11 < class140.field1922; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; ~var12 > ~class140.field1922; ++var12) {
                    var8[var12] = var5[-var12 + class242.field3233];
                    var9[var12] = var6[class242.field3233 - var12];
                    var10[var12] = var7[-var12 + class242.field3233];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IJLii;)V", line = 72)
    public static final void method2604(int arg0, long arg1, class405 arg2) {
        ++field6007;
        class112.field1574 = class21.field282;
        class430.field6329 = arg0;
        class21.field282 = 0;
        long var4 = class114.method735(97);
        for (class6 var6 = (class6) class106.field1530.method1005(arg0 ^ -84); var6 != null; var6 = (class6) class106.field1530.method1009(false)) {
            if (var6.method43(arg2, arg1)) {
                ++class430.field6329;
            }
        }
        if (class2.field24 && ~(arg1 % 100L) == -1L) {
            System.out.println("Particle system count: " + class106.field1530.method1001(arg0 ^ 3144) + ", running: " + class430.field6329 + ". Particles: " + class21.field282 + ". Time taken: " + (-var4 + class114.method735(113)) + "ms");
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lnj;II)V", line = 102)
    public final void method208(class228 arg0, int arg1, int arg2) {
        if (arg2 != -13132) {
            this.field6008 = true;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field5931 = ~arg0.method1348(-97) == -2;
                }
            } else {
                this.field6008 = arg0.method1348(arg2 ^ 13103) == 1;
            }
        } else {
            this.field6004 = ~arg0.method1348(-108) == -2;
        }
        ++field6006;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V", line = 236)
    public class404() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(B)Lni;", line = 155)
    public static final class246 method2605(byte arg0) {
        ++field6014;
        if (arg0 <= 61) {
            field6005 = 69;
        }
        if (class293.field4180 != null && class331.field4813 != null) {
            class331.field4813.method1095(class293.field4180, 1);
            class246 var1 = (class246) class331.field4813.method1092((byte) 54);
            if (var1 == null) {
                return null;
            } else {
                class7 var2 = class99.method674(36, var1.field3323);
                return var2 != null && var2.field106 && var2.method50(-28047) ? var1 : class23.method151((byte) -115);
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lds;Lds;I)V", line = 185)
    public static final void method2606(class225 arg0, class225 arg1, int arg2) {
        ++field6011;
        if (arg0.field2958 != null) {
            arg0.method1302(true);
        }
        arg0.field2961 = arg1.field2961;
        arg0.field2958 = arg1;
        arg0.field2958.field2961 = arg0;
        if (arg2 != 12111) {
            method2607(49L, -21);
        }
        arg0.field2961.field2958 = arg0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 209)
    public static final String method2607(long arg0, int arg1) {
        class102.field1413.setTime(new Date(arg0));
        ++field6010;
        int var3 = class102.field1413.get(7);
        if (arg1 <= 43) {
            return null;
        } else {
            int var4 = class102.field1413.get(5);
            int var5 = class102.field1413.get(2);
            int var6 = class102.field1413.get(1);
            int var7 = class102.field1413.get(11);
            int var8 = class102.field1413.get(12);
            int var9 = class102.field1413.get(13);
            return class226.field2970[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + class277.field4019[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)[I", line = 240)
    public final int[] method95(int arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        } else {
            ++field6012;
            int[] var3 = super.field5927.method305(arg0, (byte) 67);
            if (super.field5927.field591) {
                int[] var4 = this.method2558(0, arg1 ^ 29295, !this.field6008 ? arg0 : -arg0 + class411.field6070);
                if (!this.field6004) {
                    class60.method422(var4, 0, var3, 0, class140.field1922);
                } else {
                    for (int var5 = 0; ~var5 > ~class140.field1922; ++var5) {
                        var3[var5] = var4[-var5 + class242.field3233];
                    }
                }
            }
            return var3;
        }
    }
}
