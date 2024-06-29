import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class68 implements Runnable {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Lec;")
    public static class28 field1526 = class28.method210(-46, "You have ");

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Lec;")
    public static class28 field1527 = class28.method210(-46, "scroll:");

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field1530 = 10;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Lec;")
    public static class28 field1532 = class28.method210(-46, "New User");

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Lec;")
    public static class28 field1535 = class28.method210(-46, " with @lre@");

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field1541 = 0;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Lec;")
    public static class28 field1538 = class28.method210(-46, "sideicons");

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Lvb;")
    public static class122 field1529;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "Lwc;")
    public static class128 field1528;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Lqb;")
    public static class97 field1539;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "[[B")
    public static byte[][] field1534;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[Lec;)Lec;")
    public static final class28 method537(int arg0, class28[] arg1) {
        if (arg0 != 1) {
            field1534 = null;
        }
        field1531++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class42.method328(arg0 ^ 0x6B, arg1.length, 0, arg1);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static void method538(int arg0) {
        field1539 = null;
        field1529 = null;
        field1532 = null;
        field1535 = null;
        field1534 = null;
        field1526 = null;
        int var1 = -23 / ((arg0 + 43) / 63);
        field1527 = null;
        field1528 = null;
        field1538 = null;
    }

    @OriginalMember(owner = "client!lb", name = "run", descriptor = "()V")
    public final void run() {
        field1537++;
        try {
            while (true) {
                while (true) {
                    class42 var1 = class114.field2426;
                    class105 var2;
                    synchronized (class114.field2426) {
                        var2 = (class105) class114.field2426.method326(0);
                    }
                    if (var2 == null) {
                        class31.method247(100L, (byte) 123);
                        Object var16 = class96.field2129;
                        synchronized (class96.field2129) {
                            if (class76.field1716 < 0) {
                                class76.field1716 = 0;
                                class96.field2129.notifyAll();
                            } else {
                                class76.field1716--;
                            }
                            if (class76.field1716 == 0) {
                                return;
                            }
                        }
                    } else {
                        Object var3 = class96.field2129;
                        synchronized (class96.field2129) {
                            if (class76.field1716 < 0) {
                                class76.field1716 = 0;
                                class96.field2129.notifyAll();
                                return;
                            }
                            class76.field1716 = 600;
                        }
                        class9 var4 = var2.field2215;
                        if (var2.field2222 == 0) {
                            var4.field152.method504(var2.field2226, var2.field2217, var2.field2226.length, -6);
                        } else if (var2.field2222 == 1) {
                            int var5 = var2.field2217;
                            byte[] var6 = var4.field152.method502((byte) 15, var5);
                            if (var6 != null) {
                                class22.field494.reset();
                                class22.field494.update(var6, 0, var6.length - 2);
                                int var7 = (int) class22.field494.getValue();
                                int var8 = ((var6[var6.length - 2] & 0xFF) << 8) + (var6[var6.length - 1] & 0xFF);
                                if (var4.field2644[var5] != var7 || var4.field2624[var5] != var8) {
                                    var6 = null;
                                }
                            }
                            if (var6 == null) {
                                var4.field173[var5] = false;
                            } else {
                                var4.field2634[var5] = var6;
                            }
                        } else if (var2.field2222 == 2) {
                            Object var9 = class11.field187;
                            synchronized (class11.field187) {
                                var4.field173 = new boolean[var4.field2634.length];
                                int var10 = 0;
                                while (true) {
                                    if (var4.field2634.length <= var10) {
                                        break;
                                    }
                                    var4.field173[var10] = false;
                                    byte[] var11 = var4.field152.method502((byte) 15, var10);
                                    if (var11 != null && var11.length > 2) {
                                        class22.field494.reset();
                                        class22.field494.update(var11, 0, var11.length - 2);
                                        int var12 = (int) class22.field494.getValue();
                                        int var13 = ((var11[var11.length - 2] & 0xFF) << 8) + (var11[var11.length - 1] & 0xFF);
                                        if (var4.field2644[var10] == var12 && var4.field2624[var10] == var13) {
                                            var4.field173[var10] = true;
                                        }
                                    }
                                    var10++;
                                }
                            }
                            Object var14 = class28.field594;
                            synchronized (class28.field594) {
                                var4.field161 = true;
                            }
                        }
                        class42 var15 = class114.field2426;
                        synchronized (class114.field2426) {
                            var2.method319((byte) -127);
                        }
                    }
                }
            }
        } catch (Exception var28) {
            class119.method884(32, var28, null);
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public static final void method539(int arg0) {
        field1533++;
        if (!class61.field1347) {
            return;
        }
        class70.field1557 = null;
        class14.field257 = null;
        class65.field1456 = null;
        class51.field1190 = null;
        field1528 = null;
        class129.field2798 = null;
        class86.field1910 = null;
        class90.field1983 = null;
        class22.field512 = null;
        class74.field1645 = null;
        class49.field1146 = null;
        class21.field483 = null;
        class77.field1727 = null;
        class31.field658 = null;
        class61.field1367 = null;
        class83.field1898 = null;
        class5.field93 = null;
        class74.field1633 = null;
        class125.field2720 = null;
        class110.field2324 = null;
        if (arg0 > -23) {
            field1527 = null;
        }
        class12.field194 = null;
        class126.field2738 = null;
        class66.method534(66, 10);
        class93.field2057.method392(0, true);
        class61.field1347 = false;
    }
}
