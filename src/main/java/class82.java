import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class82 implements Runnable {

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "[I")
    public static int[] field1590 = new int[100];

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Lhh;")
    private static class163 field1586 = class137.method1065("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", 17);

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Lhh;")
    public static class163 field1585 = field1586;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Lee;")
    public static class108 field1588;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZ)V")
    public static final void method661(int arg0, boolean arg1) {
        field1591++;
        class52.field863.method112(arg0, 121);
        class161.field2949.method112(arg0, 116);
        class114.field2129.method112(arg0, 112);
        if (!arg1) {
            method661(-72, false);
        }
        class64.field1083.method112(arg0, 124);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static void method662(int arg0) {
        if (arg0 == 0) {
            field1588 = null;
            field1586 = null;
            field1585 = null;
            field1590 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)Z")
    public static final boolean method663(int arg0) {
        field1587++;
        try {
            if (arg0 != -12559) {
                field1590 = null;
            }
            if (class157.field2919 == 2) {
                if (class126.field2447 == null) {
                    class126.field2447 = class189.method1393(class13.field212, class226.field4091, class134.field2590);
                    if (class126.field2447 == null) {
                        return false;
                    }
                }
                if (class145.field2760 == null) {
                    class145.field2760 = new class231(class115.field2193, class90.field1647);
                }
                if (class115.field2191.method712(false, class145.field2760, class113.field2126, 22050, class126.field2447)) {
                    class115.field2191.method709(5202);
                    class115.field2191.method714(arg0 ^ 0x1589, class49.field817);
                    class115.field2191.method720(144, class126.field2447, class221.field4030);
                    class145.field2760 = null;
                    class157.field2919 = 0;
                    class126.field2447 = null;
                    class13.field212 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class115.field2191.method730(true);
            class126.field2447 = null;
            class157.field2919 = 0;
            class145.field2760 = null;
            class13.field212 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
    public static final void method664(int arg0) {
        field1583++;
        int var1 = 113 / ((-arg0 - 6) / 54);
        class87.field1625 = new class128();
    }

    @OriginalMember(owner = "client!sd", name = "run", descriptor = "()V")
    public final void run() {
        field1589++;
        try {
            while (true) {
                class128 var1 = class250.field4395;
                class103 var2;
                synchronized (class250.field4395) {
                    var2 = (class103) class250.field4395.method1017(124);
                }
                if (var2 == null) {
                    class107.method866(0, 100L);
                    Object var3 = class169.field3098;
                    synchronized (class169.field3098) {
                        if (class218.field3970 <= 1) {
                            class218.field3970 = 0;
                            class169.field3098.notifyAll();
                            return;
                        }
                        class218.field3970--;
                    }
                } else {
                    if (var2.field1979 == 0) {
                        var2.field1976.method1771(var2.field1981, (int) var2.field2641, var2.field1981.length, -1);
                        class128 var5 = class250.field4395;
                        synchronized (class250.field4395) {
                            var2.method1063(125);
                        }
                    } else if (var2.field1979 == 1) {
                        var2.field1981 = var2.field1976.method1772(16711680, (int) var2.field2641);
                        class128 var4 = class250.field4395;
                        synchronized (class250.field4395) {
                            class256.field4490.method1018((byte) 100, var2);
                        }
                    }
                    Object var6 = class169.field3098;
                    synchronized (class169.field3098) {
                        if (class218.field3970 <= 1) {
                            class218.field3970 = 0;
                            class169.field3098.notifyAll();
                            return;
                        }
                        class218.field3970 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class107.method865(-88, var17, (String) null);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lpa;I)Z")
    public static final boolean method665(class123 arg0, int arg1) {
        field1584++;
        return arg0.method970(class132.field2566, arg1);
    }
}
