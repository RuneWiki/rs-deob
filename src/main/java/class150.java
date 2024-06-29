import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class150 extends class424 {

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
    private int field2180 = 4096;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "Lhc;")
    public static class368 field2174 = new class368("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "[Lum;")
    public static class186[] field2178;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZI)V")
    public static final void method1114(int arg0, boolean arg1, int arg2) {
        ++field2175;
        if (!(class333.field4493 < class333.field4498)) {
            if (class333.field4498 < class333.field4493) {
                class333.field4493 = (float) ((double) class333.field4493 - (double) class333.field4493 / 30.0D);
                if (class333.field4493 < class333.field4498) {
                    class333.field4493 = class333.field4498;
                }
                class302.method1833(69);
                class333.field4496 = (int) class333.field4493 >> 1;
                class333.field4491 = class15.method91(-124, class333.field4496);
            }
        } else {
            class333.field4493 = (float) ((double) class333.field4493 / 30.0D + (double) class333.field4493);
            if (class333.field4493 > class333.field4498) {
                class333.field4493 = class333.field4498;
            }
            class302.method1833(80);
            class333.field4496 = (int) class333.field4493 >> 1;
            class333.field4491 = class15.method91(49, class333.field4496);
        }
        if (class24.field312 != -1 && ~class258.field3572 != 0) {
            int var3 = -class350.field4719 + class24.field312;
            if (~var3 > -3 || ~var3 < -3) {
                var3 /= 8;
            }
            int var4 = -class274.field3747 + class258.field3572;
            class350.field4719 += var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            if (var3 == 0 && var4 == 0) {
                class24.field312 = -1;
                class258.field3572 = -1;
            }
            class274.field3747 -= -var4;
            class302.method1833(121);
        }
        if (class318.field4336 <= 0) {
            class281.field3817 = -1;
            class132.field1985 = -1;
        } else {
            --class432.field6098;
            if (class432.field6098 == 0) {
                class432.field6098 = 100;
                --class318.field4336;
            }
        }
        if (!arg1) {
            field2174 = null;
        }
        if (class237.field3376 && class343.field4621 != null) {
            for (class336 var5 = (class336) class343.field4621.method1173(0); var5 != null; var5 = (class336) class343.field4621.method1165(arg1)) {
                class430 var6 = class204.method1389(var5.field4539.field2229, -125);
                if (class200.field2879 == 0 && var5.method2042(arg0, (byte) -85, arg2)) {
                    if (var6.field6024 != null) {
                        if (var6.field6024[4] != null) {
                            class46.method379(var6.field6024[4], 1002, var6.field6021, true, (long) var5.field4539.field2229, 0, -1, var6.field5987);
                        }
                        if (var6.field6024[3] != null) {
                            class46.method379(var6.field6024[3], 1003, var6.field6021, true, (long) var5.field4539.field2229, 0, -1, var6.field5987);
                        }
                        if (var6.field6024[2] != null) {
                            class46.method379(var6.field6024[2], 1010, var6.field6021, true, (long) var5.field4539.field2229, 0, -1, var6.field5987);
                        }
                        if (var6.field6024[1] != null) {
                            class46.method379(var6.field6024[1], 1007, var6.field6021, arg1, (long) var5.field4539.field2229, 0, -1, var6.field5987);
                        }
                        if (var6.field6024[0] != null) {
                            class46.method379(var6.field6024[0], 1012, var6.field6021, true, (long) var5.field4539.field2229, 0, -1, var6.field5987);
                        }
                    }
                    if (!var5.field4539.field2236) {
                        var5.field4539.field2236 = true;
                        class172.method1228(15, var5.field4539.field2229, var6.field6021);
                    }
                    if (var5.field4539.field2236) {
                        class172.method1228(17, var5.field4539.field2229, var6.field6021);
                    }
                } else if (var5.field4539.field2236) {
                    var5.field4539.field2236 = false;
                    class172.method1228(16, var5.field4539.field2229, var6.field6021);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(II)I")
    public static final int method1115(int arg0, int arg1) {
        ++field2177;
        return arg1 != -16465 ? -46 : 255 & arg0;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V")
    public class150() {
        super(1, true);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lrg;BI)V")
    public final void method19(class366 arg0, byte arg1, int arg2) {
        ++field2179;
        if (arg1 != -48) {
            method1116(-110);
        }
        if (arg2 == 0) {
            this.field2180 = arg0.method2297(arg1 + 13400);
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(IB)[I")
    public final int[] method43(int arg0, byte arg1) {
        ++field2176;
        int[] var3 = super.field5892.method783(arg0, (byte) -86);
        if (super.field5892.field1427) {
            int[] var4 = this.method2621(0, -118, class174.field2484 & arg0 + -1);
            int[] var5 = this.method2621(0, -126, arg0);
            int[] var6 = this.method2621(0, -114, arg0 + 1 & class174.field2484);
            for (int var7 = 0; var7 < class303.field4135; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field2180;
                int var9 = (var5[class65.field898 & var7 + 1] + -var5[class65.field898 & var7 + -1]) * this.field2180;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 - -4096 + var13) / 4096.0F)));
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        if (arg1 != -10) {
            this.method19((class366) null, (byte) 63, 48);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "(I)V")
    public static final void method1116(int arg0) {
        ++field2173;
        class408 var1 = class146.field2124;
        synchronized (class146.field2124) {
            class146.field2124.method2522((byte) 76);
        }
        if (arg0 == 0) {
            class408 var2 = class43.field571;
            synchronized (class43.field571) {
                class43.field571.method2522((byte) 63);
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "(I)V")
    public static void method1117(int arg0) {
        if (arg0 == 1) {
            field2178 = null;
            field2174 = null;
        }
    }
}
