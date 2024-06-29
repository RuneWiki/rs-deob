import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class454 extends class34 {

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
    public static int field6634 = 1337;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "Ljava/util/Calendar;")
    public static Calendar field6636 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field6640 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "Lgp;")
    public static class464 field6635;

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
    public class454() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZZ)V")
    public static final void method2663(boolean arg0, boolean arg1) {
        class153.method1103(class66.field953, class236.field3268, -48, class348.field5033, arg1);
        ++field6638;
        if (!arg0) {
            method2663(true, true);
        }
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)V")
    public static void method2664(byte arg0) {
        field6640 = null;
        field6636 = null;
        if (arg0 != 0) {
            field6636 = null;
        }
        field6635 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field6639;
        int[] var3 = super.field537.method1780(arg0, (byte) 28);
        if (super.field537.field4191) {
            class57.method370(var3, 0, class383.field5502, class284.field3856[arg0]);
        }
        int var4 = -8 / (-arg1 / 50);
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method2665(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++class484.field6969;
        class222.field3136 = 0;
        for (int var6 = class269.field3628; var6 < class265.field3571; ++var6) {
            class532[][] var17 = class103.field1632[var6];
            for (int var18 = class164.field2525; var18 < class245.field3356; ++var18) {
                for (int var19 = class125.field1932; var19 < class215.field3054; ++var19) {
                    class532 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (!class223.field3153[var18 - class39.field578 + class282.field3832][var19 - class119.field1859 + class282.field3832] || arg1 != null && var6 >= arg2 && arg1[var6][var18][var19] == arg3) {
                            var20.field7827 = false;
                            var20.field7831 = false;
                            var20.field7818 = 0;
                            if (var18 >= class39.field578 - 16 && var18 <= class39.field578 + 16 && var19 >= class119.field1859 - 16 && var19 <= class119.field1859 + 16 && (var20.field7830 != null || var20.field7822 != null || var20.field7833 != null || var20.field7835 != null || var20.field7838 != null || var20.field7828 != null)) {
                                class295.field3992.method47(var20, -51);
                            }
                        } else {
                            var20.field7827 = true;
                            var20.field7831 = true;
                            if (var20.field7828 != null) {
                                var20.field7817 = true;
                            } else {
                                var20.field7817 = false;
                            }
                            ++class222.field3136;
                        }
                    }
                }
            }
        }
        boolean var7 = class492.field7122 == class36.field554;
        for (int var8 = class269.field3628; var8 < class265.field3571; ++var8) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class77.field1093.method551() && var8 >= arg2 && arg1 != null) {
                int var10 = class223.field3153.length;
                if (class223.field3153.length + class164.field2525 > class124.field1916) {
                    var10 -= class223.field3153.length + class164.field2525 - class124.field1916;
                }
                int var11 = class223.field3153[0].length;
                if (class223.field3153[0].length + class125.field1932 > class177.field2664) {
                    var11 -= class223.field3153[0].length + class125.field1932 - class177.field2664;
                }
                int var12 = class185.field2745;
                while (true) {
                    if (var12 >= var10) {
                        class295.field3992.method41(class492.field7122[var8], var8, true, true, var9);
                        break;
                    }
                    int var13 = class164.field2525 + var12 - class185.field2745;
                    for (int var14 = class58.field830; var14 < var11; ++var14) {
                        class18.field280[var12][var14] = false;
                        if (class223.field3153[var12][var14]) {
                            int var15 = class125.field1932 + var14 - class58.field830;
                            for (int var16 = var8; var16 >= 0; --var16) {
                                if (class103.field1632[var16][var13][var15] != null && class103.field1632[var16][var13][var15].field7842 == var8) {
                                    class18.field280[var12][var14] = class103.field1632[var16][var13][var15].field7827;
                                    break;
                                }
                            }
                        }
                    }
                    ++var12;
                }
            } else {
                class295.field3992.method41(class492.field7122[var8], var8, false, true, var9);
            }
            class295.field3992.method42(0);
        }
        if (!class105.method813(true)) {
            class105.method813(false);
        }
    }
}
