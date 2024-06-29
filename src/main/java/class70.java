import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class70 implements Runnable {

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Lfc;")
    private static class39 field1643 = class90.method774("Please reload this page)3", -122);

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "Lfc;")
    private static class39 field1639 = class90.method774("Invalid username or password)3", -90);

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Lfc;")
    public static class39 field1640 = class90.method774("Passwort: ", -79);

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field1651 = 0;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "Lfc;")
    public static class39 field1648 = class90.method774(" loggt sich aus)3", -109);

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "Lfc;")
    public static class39 field1644 = field1643;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "Lfc;")
    public static class39 field1641 = class90.method774("Bitte entfernen Sie ", -121);

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Lfc;")
    public static class39 field1642 = field1639;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "Lfc;")
    public static class39 field1653 = class90.method774("Okay", -91);

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public static int field1654 = 0;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "Z")
    public static volatile boolean field1655 = true;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Lb;")
    public static class8 field1638;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "[Lb;")
    public static class8[] field1637;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V", line = 5)
    public static void method652(int arg0) {
        field1642 = null;
        field1643 = null;
        field1638 = null;
        int var1 = 111 % ((76 - arg0) / 40);
        field1640 = null;
        field1639 = null;
        field1637 = null;
        field1641 = null;
        field1653 = null;
        field1644 = null;
        field1648 = null;
    }

    @OriginalMember(owner = "client!ka", name = "run", descriptor = "()V", line = 44)
    public final void run() {
        field1645++;
        try {
            while (true) {
                class2 var1 = class7.field214;
                class108 var2;
                synchronized (class7.field214) {
                    var2 = (class108) class7.field214.method8(-1);
                }
                if (var2 == null) {
                    class61.method609(-89, 100L);
                    Object var3 = class34.field899;
                    synchronized (class34.field899) {
                        if (class151.field3740 <= 1) {
                            class151.field3740 = 0;
                            class34.field899.notifyAll();
                            return;
                        }
                        class151.field3740--;
                    }
                } else {
                    if (var2.field2704 == 0) {
                        var2.field2707.method1032(var2.field2705.length, var2.field2705, -1, (int) var2.field3619);
                        class2 var5 = class7.field214;
                        synchronized (class7.field214) {
                            var2.method1170(12);
                        }
                    } else if (var2.field2704 == 1) {
                        var2.field2705 = var2.field2707.method1030(0, (int) var2.field3619);
                        class2 var4 = class7.field214;
                        synchronized (class7.field214) {
                            class29.field829.method19(var2, 7);
                        }
                    }
                    Object var6 = class34.field899;
                    synchronized (class34.field899) {
                        if (class151.field3740 <= 1) {
                            class151.field3740 = 0;
                            class34.field899.notifyAll();
                            return;
                        }
                        class151.field3740 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class142.method1158(null, var17, -115);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V", line = 163)
    public static final void method653(boolean arg0) {
        field1646++;
        int var1 = class96.field2224.method707(class131.field3308);
        for (int var2 = 0; var2 < class126.field3207; var2++) {
            int var12 = class96.field2224.method707(class97.field2315[var2]);
            if (var12 > var1) {
                var1 = var12;
            }
        }
        int var3 = class126.field3207 * 15 + 21;
        var1 += 8;
        if (class78.field1777 != -1) {
            class146.field3638 = var1;
            class50.field1258 = 0;
            class116.field3037 = class126.field3207 * 15 + 22;
            class94.field2206 = true;
            int var4 = class26.field758;
            int var5 = class34.field889 - var1 / 2;
            if (var1 + var5 > 765) {
                var5 = 765 - var1;
            }
            if (var4 + var3 > 503) {
                var4 = 503 - var3;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            class44.field1197 = var5;
            if (var4 < 0) {
                var4 = 0;
            }
            class93.field2171 = var4;
        } else if (class34.field889 > 4 && class26.field758 > 4 && class34.field889 < 516 && class26.field758 < 338) {
            class94.field2206 = true;
            class50.field1258 = 0;
            class146.field3638 = var1;
            class116.field3037 = class126.field3207 * 15 + 22;
            int var6 = class34.field889 - var1 / 2 - 4;
            if (var6 + var1 > 512) {
                var6 = 512 - var1;
            }
            int var7 = class26.field758 - 4;
            if (var6 < 0) {
                var6 = 0;
            }
            if (var3 + var7 > 334) {
                var7 = 334 - var3;
            }
            class44.field1197 = var6;
            if (var7 < 0) {
                var7 = 0;
            }
            class93.field2171 = var7;
        } else if (class34.field889 > 553 && class26.field758 > 205 && class34.field889 < 743 && class26.field758 < 466) {
            class116.field3037 = class126.field3207 * 15 + 22;
            class146.field3638 = var1;
            class50.field1258 = 1;
            class94.field2206 = true;
            int var8 = class34.field889 - var1 / 2 - 553;
            if (var8 < 0) {
                var8 = 0;
            } else if (var1 + var8 > 190) {
                var8 = 190 - var1;
            }
            class44.field1197 = var8;
            int var9 = class26.field758 - 205;
            if (var9 < 0) {
                var9 = 0;
            } else if (var3 + var9 > 261) {
                var9 = 261 - var3;
            }
            class93.field2171 = var9;
        } else if (class34.field889 > 17 && class26.field758 > 357 && class34.field889 < 496 && class26.field758 < 453) {
            class94.field2206 = true;
            class50.field1258 = 2;
            class116.field3037 = class126.field3207 * 15 + 22;
            class146.field3638 = var1;
            int var10 = class26.field758 - 357;
            int var11 = class34.field889 - var1 / 2 - 17;
            if (var10 < 0) {
                var10 = 0;
            } else if (var3 + var10 > 96) {
                var10 = 96 - var3;
            }
            if (var11 < 0) {
                var11 = 0;
            } else if (var1 + var11 > 479) {
                var11 = 479 - var1;
            }
            class93.field2171 = var10;
            class44.field1197 = var11;
        }
        if (!arg0) {
            method652(92);
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V", line = 311)
    public static final void method654(int arg0) {
        field1652++;
        class131.field3316.method927(false);
        class88.field2036.method927(false);
        if (arg0 == 2793) {
            class67.field1581.method927(false);
        }
    }
}
