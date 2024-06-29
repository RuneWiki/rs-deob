import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class77 implements Runnable {

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "[[I")
    public static int[][] field1875 = new int[104][104];

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Lgg;")
    public static class63 field1877 = class116.method911(43, "p12_full");

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "[I")
    public static int[] field1880 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Lch;")
    public static class29 field1874 = new class29(64);

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field1881 = 0;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "[I")
    public static int[] field1882 = new int[256];

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!ic", name = "run", descriptor = "()V")
    public final void run() {
        field1878++;
        try {
            while (true) {
                class148 var1 = class69.field1729;
                class34 var2;
                synchronized (class69.field1729) {
                    var2 = (class34) class69.field1729.method1033(0);
                }
                if (var2 == null) {
                    class196.method1281((byte) -8, 100L);
                    Object var6 = class183.field3710;
                    synchronized (class183.field3710) {
                        if (class189.field3801 <= 1) {
                            class189.field3801 = 0;
                            class183.field3710.notifyAll();
                            return;
                        }
                        class189.field3801--;
                    }
                } else {
                    if (var2.field812 == 0) {
                        var2.field808.method669((int) var2.field3612, var2.field807, var2.field807.length, 102);
                        class148 var3 = class69.field1729;
                        synchronized (class69.field1729) {
                            var2.method1172(-87);
                        }
                    } else if (var2.field812 == 1) {
                        var2.field807 = var2.field808.method671((byte) 110, (int) var2.field3612);
                        class148 var4 = class69.field1729;
                        synchronized (class69.field1729) {
                            class169.field3485.method1034(0, var2);
                        }
                    }
                    Object var5 = class183.field3710;
                    synchronized (class183.field3710) {
                        if (class189.field3801 <= 1) {
                            class189.field3801 = 0;
                            class183.field3710.notifyAll();
                            return;
                        }
                        class189.field3801 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class199.method1302(null, var17, true);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)Z")
    public static final boolean method691(int arg0, int arg1) {
        if (arg0 >= -64) {
            return false;
        } else {
            field1876++;
            return (arg1 >> 30 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static final void method692(byte arg0) {
        field1879++;
        for (class203 var1 = (class203) class109.field2450.method1033(0); var1 != null; var1 = (class203) class109.field2450.method1035(0)) {
            if (class112.field2528 != var1.field4031 || var1.field4043 < class173.field3571) {
                var1.method1172(-109);
            } else if (class173.field3571 >= var1.field4020) {
                if (var1.field4040 > 0) {
                    class6 var3 = class55.field1458[var1.field4040 - 1];
                    if (var3 != null && var3.field1141 >= 0 && var3.field1141 < 13312 && var3.field1144 >= 0 && var3.field1144 < 13312) {
                        var1.method1346(class112.method894(-86, var1.field4031, var3.field1141, var3.field1144) - var1.field4023, var3.field1144, var3.field1141, (byte) -127, class173.field3571);
                    }
                }
                if (var1.field4040 < 0) {
                    int var4 = -var1.field4040 - 1;
                    class62 var5;
                    if (class50.field1216 == var4) {
                        var5 = class3.field72;
                    } else {
                        var5 = class33.field806[var4];
                    }
                    if (var5 != null && var5.field1141 >= 0 && var5.field1141 < 13312 && var5.field1144 >= 0 && var5.field1144 < 13312) {
                        var1.method1346(class112.method894(-115, var1.field4031, var5.field1141, var5.field1144) - var1.field4023, var5.field1144, var5.field1141, (byte) -127, class173.field3571);
                    }
                }
                var1.method1343(-1, class131.field2852);
                class134.method975(class112.field2528, (int) var1.field4041, (int) var1.field4016, (int) var1.field4015, 60, var1, var1.field4019, -1L, false);
            }
        }
        int var2 = -9 / (arg0 / 48);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static void method693(int arg0) {
        field1882 = null;
        field1875 = null;
        field1880 = null;
        if (arg0 != -5408) {
            method691(-49, -49);
        }
        field1874 = null;
        field1877 = null;
    }
}
