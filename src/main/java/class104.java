import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class104 {

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    private int field2683 = 0;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "[Lcd;")
    private class17[] field2671;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    private int field2674;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "Lke;")
    public static class65 field2679 = class1.method17("Cabbage", -123);

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "Lke;")
    public static class65 field2676 = class1.method17("Hierhin gehen", -118);

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field2677 = 0;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Lke;")
    public static class65 field2666 = class1.method17("sideicons", -120);

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Lke;")
    public static class65 field2668 = class1.method17("Bitte warten Sie eine Minute", -118);

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "Lke;")
    private static class65 field2685 = class1.method17("Loaded gamescreen", -123);

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Lke;")
    public static class65 field2665 = field2685;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "Lie;")
    public static class53 field2663 = new class53();

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "Lke;")
    public static class65 field2686 = class1.method17("Ung-Ultige Verbindung mit einem Anmelde)2Server)3", -124);

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "[I")
    public static int[] field2688 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "Lke;")
    private static class65 field2687 = class1.method17("Please check your message)2centre for details)3", -125);

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "Lke;")
    public static class65 field2693 = field2687;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "Lke;")
    public static class65 field2690 = class1.method17("RuneScape wird geladen )2 bitte warten)3)3)3", -120);

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "Lke;")
    public static class65 field2694 = class1.method17("Maximale Anmelde)2Versuche -Uberschritten)3", -121);

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "J")
    private long field2678;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "Lcd;")
    private class17 field2673;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "Lcd;")
    private class17 field2680;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "Lpa;")
    public static class90 field2691;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "[Z")
    public static boolean[] field2692;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILke;Lg;)I", line = 3)
    public static final int method853(int arg0, class65 arg1, class39 arg2) {
        field2684++;
        int var3 = arg2.field998;
        arg2.method315(arg1.field1733, (byte) 111);
        if (arg0 != 0) {
            field2686 = null;
        }
        arg2.field998 += class20.field492.method410(arg2.field994, arg2.field998, arg1.field1733, (byte) 126, arg1.field1702, 0);
        return arg2.field998 - var3;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(JZLcd;)V", line = 23)
    public final void method854(long arg0, boolean arg1, class17 arg2) {
        if (arg2.field354 != null) {
            arg2.method133(2);
        }
        class17 var5 = this.field2671[(int) ((long) (this.field2674 - 1) & arg0)];
        if (arg1) {
            method858(null, null, 34);
        }
        arg2.field349 = arg0;
        arg2.field354 = var5.field354;
        field2664++;
        arg2.field353 = var5;
        arg2.field354.field353 = arg2;
        arg2.field353.field354 = arg2;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 45)
    public static void method855(int arg0) {
        if (arg0 != 0) {
            method853(16, null, null);
        }
        field2688 = null;
        field2666 = null;
        field2694 = null;
        field2665 = null;
        field2687 = null;
        field2691 = null;
        field2692 = null;
        field2690 = null;
        field2679 = null;
        field2686 = null;
        field2668 = null;
        field2685 = null;
        field2676 = null;
        field2663 = null;
        field2693 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)Lcd;", line = 74)
    public final class17 method856(boolean arg0) {
        if (!arg0) {
            this.field2683 = 29;
        }
        field2682++;
        this.field2683 = 0;
        return this.method857((byte) 111);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)Lcd;", line = 92)
    private final class17 method857(byte arg0) {
        field2675++;
        if (this.field2683 > 0 && this.field2671[this.field2683 - 1] != this.field2680) {
            class17 var2 = this.field2680;
            this.field2680 = var2.field353;
            return var2;
        }
        if (arg0 != 111) {
            field2668 = null;
        }
        while (this.field2683 < this.field2674) {
            class17 var3 = this.field2671[this.field2683++].field353;
            if (this.field2671[this.field2683 - 1] != var3) {
                this.field2680 = var3.field353;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lec;Lke;I)Lke;", line = 134)
    public static final class65 method858(class27 arg0, class65 arg1, int arg2) {
        field2667++;
        if (arg2 >= -42) {
            return null;
        } else if (arg1.method540(-49, class129.field3120) == -1) {
            return arg1;
        } else {
            while (true) {
                int var3 = arg1.method540(-49, class78.field2092);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method540(-49, class78.field2072);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method540(-49, class76.field2043);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.method540(-49, class110.field2727);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method540(-49, class1.field13);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.method540(-49, class123.field3000);
                                                        if (var8 == -1) {
                                                            return arg1;
                                                        }
                                                        class65 var9 = class100.field2591;
                                                        if (class98.field2551 != null) {
                                                            var9 = class51.method408(class98.field2551.field877, true);
                                                            try {
                                                                if (class98.field2551.field878 != null) {
                                                                    byte[] var10 = ((String) class98.field2551.field878).getBytes("ISO-8859-1");
                                                                    var9 = class121.method972(0, var10.length, var10, false);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg1 = class21.method172(-96, new class65[] { arg1.method555(0, var8, (byte) -78), var9, arg1.method539(-27693, var8 + 4) });
                                                    }
                                                }
                                                arg1 = class21.method172(-72, new class65[] { arg1.method555(0, var7, (byte) -78), class94.method809(3662, class81.method708((byte) -122, arg0, 4)), arg1.method539(-27693, var7 + 2) });
                                            }
                                        }
                                        arg1 = class21.method172(-65, new class65[] { arg1.method555(0, var6, (byte) -78), class94.method809(3662, class81.method708((byte) -122, arg0, 3)), arg1.method539(-27693, var6 + 2) });
                                    }
                                }
                                arg1 = class21.method172(-62, new class65[] { arg1.method555(0, var5, (byte) -78), class94.method809(3662, class81.method708((byte) -122, arg0, 2)), arg1.method539(-27693, var5 + 2) });
                            }
                        }
                        arg1 = class21.method172(-42, new class65[] { arg1.method555(0, var4, (byte) -78), class94.method809(3662, class81.method708((byte) -122, arg0, 1)), arg1.method539(-27693, var4 + 2) });
                    }
                }
                arg1 = class21.method172(-121, new class65[] { arg1.method555(0, var3, (byte) -78), class94.method809(3662, class81.method708((byte) -122, arg0, 0)), arg1.method539(-27693, var3 + 2) });
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)Lcd;", line = 236)
    public final class17 method859(byte arg0) {
        field2669++;
        if (this.field2673 == null) {
            return null;
        }
        class17 var2 = this.field2671[(int) ((long) (this.field2674 - 1) & this.field2678)];
        if (arg0 != 117) {
            method858(null, null, -3);
        }
        while (this.field2673 != var2) {
            if (this.field2673.field349 == this.field2678) {
                class17 var3 = this.field2673;
                this.field2673 = this.field2673.field353;
                return var3;
            }
            this.field2673 = this.field2673.field353;
        }
        this.field2673 = null;
        return null;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V", line = 269)
    public static final void method860(boolean arg0) {
        class58.field1561 = null;
        class113.field2832 = null;
        class53.field1366 = null;
        class12.field254 = null;
        class35.field891 = null;
        class99.field2582 = null;
        field2670++;
        if (arg0) {
            field2690 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(I)V", line = 302)
    public class104(int arg0) {
        this.field2671 = new class17[arg0];
        this.field2674 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class17 var3 = this.field2671[var2] = new class17();
            var3.field354 = var3;
            var3.field353 = var3;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(JI)Lcd;", line = 323)
    public final class17 method861(long arg0, int arg1) {
        this.field2678 = arg0;
        field2672++;
        class17 var4 = this.field2671[(int) (arg0 & (long) (this.field2674 - 1))];
        if (arg1 < 12) {
            field2691 = null;
        }
        for (this.field2673 = var4.field353; this.field2673 != var4; this.field2673 = this.field2673.field353) {
            if (this.field2673.field349 == arg0) {
                class17 var5 = this.field2673;
                this.field2673 = this.field2673.field353;
                return var5;
            }
        }
        this.field2673 = null;
        return null;
    }
}
