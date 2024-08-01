import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("d")
public class class31 extends class85 {

    @OriginalMember(owner = "d", name = "Q", descriptor = "[S")
    public static short[] field726 = new short[500];

    @OriginalMember(owner = "d", name = "W", descriptor = "I")
    public static int field732 = 0;

    @OriginalMember(owner = "d", name = "R", descriptor = "[[B")
    public static byte[][] field727 = new byte[250][];

    @OriginalMember(owner = "d", name = "Y", descriptor = "[I")
    public static int[] field734 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "d", name = "fb", descriptor = "[Llf;")
    public static class109[] field741 = new class109[100];

    @OriginalMember(owner = "d", name = "U", descriptor = "[[S")
    public static short[][] field730 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "d", name = "X", descriptor = "Llf;")
    private static class109 field733 = class35.method275("Please wait 5 minutes before trying again)3", 2);

    @OriginalMember(owner = "d", name = "eb", descriptor = "[I")
    public static int[] field740 = new int[50];

    @OriginalMember(owner = "d", name = "jb", descriptor = "I")
    public static int field745 = 0;

    @OriginalMember(owner = "d", name = "T", descriptor = "Llf;")
    public static class109 field729 = field733;

    @OriginalMember(owner = "d", name = "hb", descriptor = "Llf;")
    private static class109 field743 = class35.method275("World", 2);

    @OriginalMember(owner = "d", name = "bb", descriptor = "Llf;")
    public static class109 field737 = field743;

    @OriginalMember(owner = "d", name = "cb", descriptor = "Llf;")
    public static class109 field738 = field743;

    @OriginalMember(owner = "d", name = "S", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "d", name = "V", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "d", name = "Z", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "d", name = "ab", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "d", name = "db", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "d", name = "gb", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "d", name = "ib", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "d", name = "c", descriptor = "(II)I")
    public static int method262(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "d", name = "a", descriptor = "(ILuc;)V")
    public static final void method263(int arg0, class187 arg1) {
        ++field736;
        arg1.field3601 = false;
        if (~arg1.field3579 != 0) {
            class20 var2 = client.method246(12, arg1.field3579);
            if (var2 != null && var2.field440 != null) {
                ++arg1.field3602;
                if (arg1.field3573 < var2.field440.length && ~arg1.field3602 < ~var2.field442[arg1.field3573]) {
                    ++arg1.field3573;
                    arg1.field3602 = 1;
                    class146.method1025(arg1.field3609, class157.field2955 == arg1, arg1.field3549, (byte) -128, arg1.field3573, var2);
                }
                if (var2.field440.length <= arg1.field3573) {
                    arg1.field3602 = 0;
                    arg1.field3573 = 0;
                    class146.method1025(arg1.field3609, class157.field2955 == arg1, arg1.field3549, (byte) -27, arg1.field3573, var2);
                }
            } else {
                arg1.field3579 = -1;
            }
        }
        if (~arg1.field3583 != 0 && ~class143.field2754 <= ~arg1.field3615) {
            if (~arg1.field3598 > -1) {
                arg1.field3598 = 0;
            }
            int var3 = class193.method1297(arg1.field3583, -18753).field2207;
            if (~var3 != 0) {
                class20 var4 = client.method246(12, var3);
                if (var4 != null && var4.field440 != null) {
                    ++arg1.field3554;
                    if (~arg1.field3598 > ~var4.field440.length && ~arg1.field3554 < ~var4.field442[arg1.field3598]) {
                        arg1.field3554 = 1;
                        ++arg1.field3598;
                        class146.method1025(arg1.field3609, class157.field2955 == arg1, arg1.field3549, (byte) -111, arg1.field3598, var4);
                    }
                    if (~var4.field440.length >= ~arg1.field3598) {
                        arg1.field3583 = -1;
                    }
                } else {
                    arg1.field3583 = -1;
                }
            } else {
                arg1.field3583 = -1;
            }
        }
        if (arg1.field3597 != -1 && arg1.field3570 <= 1) {
            class20 var5 = client.method246(12, arg1.field3597);
            if (var5.field444 == 1 && arg1.field3560 > 0 && ~arg1.field3545 >= ~class143.field2754 && class143.field2754 > arg1.field3553) {
                arg1.field3570 = 1;
                return;
            }
        }
        if (arg0 != 1) {
            field738 = null;
        }
        if (arg1.field3597 != -1 && arg1.field3570 == 0) {
            class20 var6 = client.method246(12, arg1.field3597);
            if (var6 != null && var6.field440 != null) {
                ++arg1.field3595;
                if (var6.field440.length > arg1.field3558 && var6.field442[arg1.field3558] < arg1.field3595) {
                    arg1.field3595 = 1;
                    ++arg1.field3558;
                    class146.method1025(arg1.field3609, class157.field2955 == arg1, arg1.field3549, (byte) -44, arg1.field3558, var6);
                }
                if (~var6.field440.length >= ~arg1.field3558) {
                    arg1.field3558 -= var6.field454;
                    ++arg1.field3594;
                    if (var6.field457 > arg1.field3594) {
                        if (~arg1.field3558 <= -1 && arg1.field3558 < var6.field440.length) {
                            class146.method1025(arg1.field3609, class157.field2955 == arg1, arg1.field3549, (byte) -118, arg1.field3558, var6);
                        } else {
                            arg1.field3597 = -1;
                        }
                    } else {
                        arg1.field3597 = -1;
                    }
                }
                arg1.field3601 = var6.field432;
            } else {
                arg1.field3597 = -1;
            }
        }
        if (~arg1.field3570 < -1) {
            --arg1.field3570;
        }
    }

    @OriginalMember(owner = "d", name = "c", descriptor = "(III)V")
    public static final void method264(int arg0, int arg1, int arg2) {
        class3 var3 = class78.field1550[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field31 = null;
        }
    }

    @OriginalMember(owner = "d", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method265(Component arg0, byte arg1) {
        arg0.addMouseListener(class85.field1728);
        ++field744;
        if (arg1 == 78) {
            arg0.addMouseMotionListener(class85.field1728);
            arg0.addFocusListener(class85.field1728);
        }
    }

    @OriginalMember(owner = "d", name = "a", descriptor = "(BI)Lng;")
    public static final class128 method266(byte arg0, int arg1) {
        ++field742;
        class128 var2 = (class128) class22.field505.method1086((long) arg1, -128);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class68.field1328.method147(0, arg1, 1);
            if (arg0 != 55) {
                return null;
            } else {
                class128 var4 = new class128();
                if (var3 != null) {
                    var4.method928(new class86(var3), (byte) 68, arg1);
                }
                class22.field505.method1082((long) arg1, -109, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "d", name = "e", descriptor = "(I)V")
    public static void method267(int arg0) {
        field733 = null;
        field730 = null;
        field737 = null;
        field738 = null;
        field734 = null;
        field740 = null;
        field743 = null;
        if (arg0 > -69) {
            method263(60, (class187) null);
        }
        field729 = null;
        field726 = null;
        field727 = null;
        field741 = null;
    }

    @OriginalMember(owner = "d", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        if (arg0 > -49) {
            return null;
        } else {
            ++field728;
            int[] var3 = super.field1736.method835(-314, arg1);
            if (super.field1736.field2253) {
                for (int var4 = 0; var4 < class57.field1152; ++var4) {
                    var3[var4] = class47.field980[var4];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "d", name = "<init>", descriptor = "()V")
    public class31() {
        super(0, true);
    }
}
