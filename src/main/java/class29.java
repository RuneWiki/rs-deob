import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class29 implements Runnable {

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field636 = 32;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "[I")
    public static int[] field638 = new int[128];

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Lvc;")
    public static class137 field641 = class45.method325(" (X", -46);

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field639 = 0;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "Lvc;")
    public static class137 field649 = class45.method325("An", -46);

    @OriginalMember(owner = "client!e", name = "i", descriptor = "[I")
    public static int[] field644 = new int[1000];

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field648 = 0;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "Lvc;")
    public static class137 field645 = class45.method325("@red@", -46);

    @OriginalMember(owner = "client!e", name = "k", descriptor = "[Lvc;")
    public static class137[] field646 = new class137[500];

    @OriginalMember(owner = "client!e", name = "p", descriptor = "Lvc;")
    public static class137 field651 = class45.method325(" x", -46);

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field650 = 0;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "Lvc;")
    public static class137 field637 = class45.method325("Chat panel redrawn", -46);

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Loa;")
    public static class93 field642;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "Lpa;")
    public static class99 field654;

    @OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
    public final void run() {
        field640++;
        try {
            while (true) {
                class100 var1 = class106.field2471;
                class98 var2;
                synchronized (class106.field2471) {
                    var2 = (class98) class106.field2471.method726(0);
                }
                if (var2 == null) {
                    class28.method219(true, 100L);
                    Object var6 = class60.field1290;
                    synchronized (class60.field1290) {
                        if (class12.field270 <= 1) {
                            class12.field270 = 0;
                            class60.field1290.notifyAll();
                            return;
                        }
                        class12.field270--;
                    }
                } else {
                    if (var2.field2280 == 0) {
                        var2.field2295.method177(var2.field2276.length, var2.field2276, (int) var2.field2490, 30169);
                        class100 var3 = class106.field2471;
                        synchronized (class106.field2471) {
                            var2.method776(0);
                        }
                    } else if (var2.field2280 == 1) {
                        var2.field2276 = var2.field2295.method180((int) var2.field2490, -7745);
                        class100 var4 = class106.field2471;
                        synchronized (class106.field2471) {
                            class49.field1099.method730(467, var2);
                        }
                    }
                    Object var5 = class60.field1290;
                    synchronized (class60.field1290) {
                        if (class12.field270 <= 1) {
                            class12.field270 = 0;
                            class60.field1290.notifyAll();
                            return;
                        }
                        class12.field270 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class110.method850((byte) 127, null, var17);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZZLie;)V")
    public static final void method225(boolean arg0, boolean arg1, class61 arg2) {
        field647++;
        if (class139.field3225 != null) {
            try {
                class139.field3225.method434(76);
            } catch (Exception var8) {
            }
            class139.field3225 = null;
        }
        class139.field3225 = arg2;
        class1.method8(arg1, (byte) -97);
        class24.field580 = null;
        class7.field137 = null;
        class40.field888.field2583 = 0;
        class128.field3015 = 0;
        while (true) {
            class38 var3 = (class38) class103.field2397.method871(-16);
            if (var3 == null) {
                while (true) {
                    class38 var4 = (class38) class72.field1536.method871(-16);
                    if (var4 == null) {
                        if (class40.field887 != 0) {
                            try {
                                class109 var5 = new class109(4);
                                var5.method837(98, 4);
                                var5.method837(-117, class40.field887);
                                var5.method793(0, (byte) 52);
                                class139.field3225.method440(0, 4, false, var5.field2547);
                            } catch (IOException var7) {
                                try {
                                    class139.field3225.method434(71);
                                } catch (Exception var6) {
                                }
                                class24.field579++;
                                class139.field3225 = null;
                            }
                        }
                        if (arg0) {
                            return;
                        } else {
                            class132.field3081 = 0;
                            class100.field2331 = class60.method432(true);
                            return;
                        }
                    }
                    class32.field680.method57(var4, (byte) -123);
                    class45.field988.method873(var4.field2490, 125, var4);
                    class11.field237++;
                    class77.field1706--;
                }
            }
            class116.field2752.method873(var3.field2490, 121, var3);
            class137.field3136++;
            class127.field2997--;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public static void method226(int arg0) {
        field649 = null;
        field654 = null;
        field641 = null;
        field651 = null;
        if (arg0 != -2) {
            return;
        }
        field645 = null;
        field644 = null;
        field637 = null;
        field638 = null;
        field646 = null;
        field642 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method227(Component arg0, int arg1) {
        arg0.addMouseListener(class48.field1071);
        if (arg1 != 0) {
            method226(84);
        }
        field652++;
        arg0.addMouseMotionListener(class48.field1071);
        arg0.addFocusListener(class48.field1071);
    }
}
