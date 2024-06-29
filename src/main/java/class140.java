import java.awt.Component;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class140 implements Runnable {

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "Z")
    public boolean field3469 = true;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Ljava/lang/Object;")
    public Object field3468 = new Object();

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "[I")
    public int[] field3474 = new int[500];

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public int field3476 = 0;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "[I")
    public int[] field3475 = new int[500];

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Loc;")
    public static class99 field3458 = class48.method402((byte) -104, "Benutzen");

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Loc;")
    private static class99 field3462 = class48.method402((byte) -104, "Your account has been disabled)3");

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Loc;")
    private static class99 field3460 = class48.method402((byte) -104, "Location");

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Loc;")
    public static class99 field3463 = field3462;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "[I")
    public static int[] field3471 = new int[1000];

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Loc;")
    public static class99 field3459 = field3460;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "Lma;")
    public static class83 field3466 = new class83();

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "Loc;")
    public static class99 field3480 = class48.method402((byte) -104, "Art");

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "Loc;")
    public static class99 field3482 = class48.method402((byte) -104, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
    public static int field3478 = 0;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "Loc;")
    public static class99 field3483 = class48.method402((byte) -104, "mn");

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "[[[I")
    public static int[][][] field3484 = new int[4][13][13];

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "Lpc;")
    public static class105 field3465;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "Lpc;")
    public static class105 field3477;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Lac;")
    public static class3 field3456;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "Lba;")
    public static class8 field3481;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lhe;Loc;B)Loc;")
    public static final class99 method1152(class54 arg0, class99 arg1, byte arg2) {
        if (arg1.method830(class112.field2808, 63) != -1) {
            label62: while (true) {
                int var3 = arg1.method830(class66.field1695, arg2 ^ 0x27);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method830(class14.field350, 63);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method830(class3.field45, 63);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.method830(class42.field1013, arg2 + 39);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method830(class135.field3366, 63);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.method830(class132.field3221, 63);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class99 var9 = class137.field3407;
                                                        if (class79.field1948 != null) {
                                                            var9 = class35.method307(arg2 + 4533, class79.field1948.field689);
                                                            try {
                                                                if (class79.field1948.field685 != null) {
                                                                    byte[] var10 = ((String) class79.field1948.field685).getBytes("ISO-8859-1");
                                                                    var9 = class79.method686(0, var10, (byte) -17, var10.length);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg1 = class20.method189(new class99[] { arg1.method840(0, -76, var8), var9, arg1.method813(var8 + 4, (byte) -24) }, arg2 + 31);
                                                    }
                                                }
                                                arg1 = class20.method189(new class99[] { arg1.method840(0, 108, var7), class94.method776(arg2 ^ 0x65, class69.method604(3, arg0, 4)), arg1.method813(var7 + 2, (byte) 123) }, arg2 ^ 0x34);
                                            }
                                        }
                                        arg1 = class20.method189(new class99[] { arg1.method840(0, arg2 ^ 0x7A, var6), class94.method776(118, class69.method604(arg2 - 21, arg0, 3)), arg1.method813(var6 + 2, (byte) -115) }, 88);
                                    }
                                }
                                arg1 = class20.method189(new class99[] { arg1.method840(0, -90, var5), class94.method776(arg2 ^ 0x6B, class69.method604(3, arg0, 2)), arg1.method813(var5 + 2, (byte) 115) }, 90);
                            }
                        }
                        arg1 = class20.method189(new class99[] { arg1.method840(0, 87, var4), class94.method776(-27, class69.method604(arg2 ^ 0x1B, arg0, 1)), arg1.method813(var4 + 2, (byte) -88) }, 36);
                    }
                }
                arg1 = class20.method189(new class99[] { arg1.method840(0, arg2 + 92, var3), class94.method776(116, class69.method604(arg2 - 21, arg0, 0)), arg1.method813(var3 + 2, (byte) -111) }, 53);
            }
        }
        if (arg2 != 24) {
            field3482 = null;
        }
        field3461++;
        return arg1;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1153(int arg0, Component arg1) {
        if (arg0 <= 110) {
            method1157(-46);
        }
        field3473++;
        arg1.removeKeyListener(class39.field978);
        arg1.removeFocusListener(class39.field978);
    }

    @OriginalMember(owner = "client!vb", name = "run", descriptor = "()V")
    public final void run() {
        field3457++;
        while (this.field3469) {
            Object var1 = this.field3468;
            synchronized (this.field3468) {
                if (this.field3476 < 500) {
                    this.field3474[this.field3476] = class148.field3656;
                    this.field3475[this.field3476] = class80.field1969;
                    this.field3476++;
                }
            }
            class57.method509(-127, 50L);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static final void method1154(int arg0) {
        if (arg0 < 13) {
            field3460 = null;
        }
        field3454++;
        for (class148 var1 = (class148) class105.field2546.method722(126); var1 != null; var1 = (class148) class105.field2546.method716(true)) {
            if (var1.field3662 == -1) {
                var1.field3651 = 0;
                class12.method127(var1, -4);
            } else {
                var1.method394((byte) 126);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
    public static void method1155(int arg0) {
        field3462 = null;
        field3465 = null;
        field3480 = null;
        field3463 = null;
        field3459 = null;
        field3481 = null;
        field3456 = null;
        if (arg0 != 4) {
            method1154(-77);
        }
        field3460 = null;
        field3458 = null;
        field3477 = null;
        field3471 = null;
        field3484 = null;
        field3483 = null;
        field3482 = null;
        field3466 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZII)Z")
    public static final boolean method1156(boolean arg0, int arg1, int arg2) {
        field3464++;
        if (arg0) {
            return false;
        } else {
            return (arg2 >> arg1 + 1 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
    public static final void method1157(int arg0) {
        if (arg0 != 1) {
            field3463 = null;
        }
        field3467++;
        class128.field3136 = new class83();
    }
}
