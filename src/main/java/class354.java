import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public abstract class class354 {

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public int field4754 = 0;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "I")
    public volatile int field4756 = 0;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "I")
    public volatile int field4753 = 0;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "[B")
    public byte[] field4752 = new byte[5000];

    @OriginalMember(owner = "client!op", name = "f", descriptor = "[Ljava/lang/Object;")
    public Object[] field4757 = new Object[5000];

    @OriginalMember(owner = "client!op", name = "g", descriptor = "I")
    public int field4758 = 0;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "[F")
    public float[] field4766 = new float[5000];

    @OriginalMember(owner = "client!op", name = "i", descriptor = "Lhc;")
    public static class368 field4760 = new class368("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!op", name = "k", descriptor = "I")
    public static int field4762 = -1;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "I")
    public static int field4761 = 0;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "Z")
    public static boolean field4763 = false;

    @OriginalMember(owner = "client!op", name = "r", descriptor = "Lka;")
    public static class408 field4769 = new class408(100);

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!op", name = "m", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!op", name = "p", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "Lea;")
    public static class58 field4765;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZI)V", line = 11)
    public static final void method2126(boolean arg0, int arg1) {
        field4755++;
        class261.field3601 = new class408(arg1);
        if (!arg0) {
            method2128(41, (class202) null, (class58) null);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILeq;IZ)V", line = 28)
    public static final void method2127(int arg0, class141 arg1, int arg2, boolean arg3) {
        class389.field5423[arg2][arg0] = arg1;
        field4759++;
        if (arg3) {
            method2129(-117);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILgf;Lea;)V", line = 59)
    public static final void method2128(int arg0, class202 arg1, class58 arg2) {
        field4764++;
        if (class333.field4490 == null) {
            return;
        }
        if (class273.field3726 < 10) {
            if (!class333.field4488.method1921(class333.field4490.field1453, (byte) -97)) {
                class273.field3726 = class399.field5534.method1910(class333.field4490.field1453, (byte) 124) / 10;
                return;
            }
            class412.method2547(-6598);
            class273.field3726 = 10;
        }
        if (class273.field3726 == 10) {
            class333.field4514 = class333.field4490.field1428 >> 6 << 6;
            class333.field4518 = class333.field4490.field1445 >> 6 << 6;
            class333.field4501 = (class333.field4490.field1444 >> 6 << 6) + 64 - class333.field4514;
            class333.field4520 = (class333.field4490.field1443 >> 6 << 6) + 64 - class333.field4518;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class333.field4490.method787(class343.field4623, (class359.field4970.field40 >> 7) + class6.field65, class371.field5148 - -(class359.field4970.field44 >> 7), var3, (byte) 64)) {
                var5 = var3[2] - class333.field4514;
                var4 = var3[1] - class333.field4518;
            }
            if (!class278.field3790 && var4 >= 0 && var4 < class333.field4520 && var5 >= 0 && var5 < class333.field4501) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                class350.field4719 = var6;
                class274.field3747 = var7;
            } else if (class2.field11 == -1 || class423.field5881 == -1) {
                class333.field4490.method793(false, class333.field4490.field1434 & 0x3FFF, var3, class333.field4490.field1434 >> 14 & 0x3FFF);
                class350.field4719 = var3[1] - class333.field4518;
                class274.field3747 = var3[2] - class333.field4514;
            } else {
                class333.field4490.method793(false, class423.field5881, var3, class2.field11);
                if (var3 != null) {
                    class350.field4719 = var3[1] - class333.field4518;
                    class274.field3747 = var3[2] - class333.field4514;
                }
                class278.field3790 = false;
                class423.field5881 = -1;
                class2.field11 = -1;
            }
            if (class333.field4490.field1437 == 37) {
                class333.field4493 = 3.0F;
                class333.field4498 = 3.0F;
            } else if (class333.field4490.field1437 == 50) {
                class333.field4493 = 4.0F;
                class333.field4498 = 4.0F;
            } else if (class333.field4490.field1437 == 75) {
                class333.field4493 = 6.0F;
                class333.field4498 = 6.0F;
            } else if (class333.field4490.field1437 == 100) {
                class333.field4493 = 8.0F;
                class333.field4498 = 8.0F;
            } else if (class333.field4490.field1437 == 200) {
                class333.field4493 = 16.0F;
                class333.field4498 = 16.0F;
            } else {
                class333.field4493 = 8.0F;
                class333.field4498 = 8.0F;
            }
            class333.field4496 = (int) class333.field4493 >> 1;
            class333.field4491 = class15.method91(-120, class333.field4496);
            class302.method1833(arg0 - 9);
            class333.method2029();
            class343.field4621 = new class162();
            class333.field4492 += (int) (Math.random() * 5.0D) - 2;
            if (class333.field4492 < -8) {
                class333.field4492 = -8;
            }
            class333.field4499 += (int) (Math.random() * 5.0D) - 2;
            if (class333.field4492 > 8) {
                class333.field4492 = 8;
            }
            if (class333.field4499 < -16) {
                class333.field4499 = -16;
            }
            if (class333.field4499 > 16) {
                class333.field4499 = 16;
            }
            class333.method2016(arg1, class333.field4492 >> 2 << 10, class333.field4499 >> 1);
            class18.method109(256, 1024, (byte) 112);
            class130.method976(256, 256, arg0 ^ 0xFFFFFFDB);
            method2126(true, 4096);
            class428.method2643(false, 256);
            class273.field3726 = 20;
        } else if (class273.field3726 == 20) {
            class419.method2589(0, true);
            class333.method2018(arg2, class333.field4492, class333.field4499);
            class273.field3726 = 60;
            class419.method2589(0, true);
            class80.method650(arg0 - 74);
        } else if (class273.field3726 == 60) {
            if (class333.field4488.method1907(-1, class333.field4490.field1453 + "_staticelements")) {
                if (!class333.field4488.method1921(class333.field4490.field1453 + "_staticelements", (byte) -97)) {
                    return;
                }
                class333.field4494 = class70.method557(-251, class333.field4488, class333.field4490.field1453 + "_staticelements", class55.field701);
            } else {
                class333.field4494 = new class147(0);
            }
            class333.method2032();
            class273.field3726 = 70;
            class419.method2589(0, true);
            class80.method650(-4);
        } else if (class273.field3726 == arg0) {
            class230.field3245 = new class23(arg2, 11, true, class104.field1447);
            class273.field3726 = 73;
            class419.method2589(arg0 - 70, true);
            class80.method650(-4);
        } else if (class273.field3726 == 73) {
            class445.field6238 = new class23(arg2, 12, true, class104.field1447);
            class273.field3726 = 76;
            class419.method2589(0, true);
            class80.method650(-4);
        } else if (class273.field3726 == 76) {
            class309.field4195 = new class23(arg2, 14, true, class104.field1447);
            class273.field3726 = 79;
            class419.method2589(arg0 - 70, true);
            class80.method650(-4);
        } else if (class273.field3726 == 79) {
            class1.field4 = new class23(arg2, 17, true, class104.field1447);
            class273.field3726 = 82;
            class419.method2589(0, true);
            class80.method650(-4);
        } else if (class273.field3726 == 82) {
            class46.field588 = new class23(arg2, 19, true, class104.field1447);
            class273.field3726 = 85;
            class419.method2589(arg0 ^ 0x46, true);
            class80.method650(-4);
        } else if (class273.field3726 == 85) {
            class2.field12 = new class23(arg2, 22, true, class104.field1447);
            class273.field3726 = 88;
            class419.method2589(0, true);
            class80.method650(-4);
        } else if (class273.field3726 == 88) {
            class53.field683 = new class23(arg2, 26, true, class104.field1447);
            class273.field3726 = 91;
            class419.method2589(0, true);
            class80.method650(-4);
        } else {
            class55.field720 = new class23(arg2, 30, true, class104.field1447);
            class273.field3726 = 100;
            class419.method2589(0, true);
            class80.method650(arg0 - 74);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(I)V", line = 313)
    public static void method2129(int arg0) {
        field4769 = null;
        field4760 = null;
        if (arg0 != -13494) {
            method2129(-48);
        }
        field4765 = null;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lr;B)V")
    public abstract void method1568(class63 arg0, byte arg1);

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public abstract void method1579(int arg0);

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IZ)V")
    public abstract void method1571(int arg0, boolean arg1);

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILr;)V")
    public abstract void method1572(int arg0, class63 arg1);

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
    public abstract void method1578(int arg0);

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(FLdn;ZII)V")
    public abstract void method1577(float arg0, class323 arg1, boolean arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(BI)V")
    public abstract void method1574(byte arg0, int arg1);

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(Lr;B)V")
    public abstract void method1576(class63 arg0, byte arg1);
}
