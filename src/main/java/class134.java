import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class134 {

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public int field2392 = -1;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public int field2395 = -1;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public int field2398 = 0;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "Z")
    public boolean field2401 = true;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public static int field2402 = 7759444;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method927(Component arg0, int arg1) {
        arg0.addMouseListener(class152.field2635);
        arg0.addMouseMotionListener(class152.field2635);
        arg0.addFocusListener(class152.field2635);
        int var2 = -17 % ((arg1 - 26) / 43);
        field2390++;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIILij;IJIIII)Z")
    public static final boolean method928(int arg0, int arg1, int arg2, int arg3, class166 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class225.method1472(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public static final void method929(int arg0) {
        class150.field2586.method833(0);
        if (arg0 == -4) {
            field2394++;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILk;B)V")
    public final void method930(int arg0, class152 arg1, byte arg2) {
        while (true) {
            int var4 = arg1.method1051((byte) 106);
            if (var4 == 0) {
                field2400++;
                if (arg2 > -87) {
                    this.field2392 = -43;
                    return;
                }
                return;
            }
            this.method933((byte) 121, var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V")
    public static final void method931(int arg0, int arg1) {
        if (arg1 < -35) {
            class158.field2761.method831(arg0, -128);
            field2396++;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
    public static final void method932(int arg0) {
        class174.field2965 = new class56(arg0);
        field2397++;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BIILk;)V")
    private final void method933(byte arg0, int arg1, int arg2, class152 arg3) {
        if (arg0 <= 29) {
            return;
        }
        if (arg1 == 1) {
            this.field2398 = class29.method244(arg3.method1064((byte) -88), (byte) -15);
        } else if (arg1 == 2) {
            this.field2395 = arg3.method1051((byte) 107);
        } else if (arg1 == 3) {
            this.field2395 = arg3.method1063(-17162);
            if (this.field2395 == 65535) {
                this.field2395 = -1;
            }
        } else if (arg1 == 5) {
            this.field2401 = false;
        } else if (arg1 == 7) {
            this.field2392 = class29.method244(arg3.method1064((byte) -118), (byte) -15);
        } else if (arg1 == 8) {
            class37.field739 = arg2;
        } else if (arg1 == 9) {
            arg3.method1063(-17162);
        } else if (arg1 != 10) {
            if (arg1 == 11) {
                arg3.method1051((byte) 97);
            } else if (arg1 != 12) {
                if (arg1 == 13) {
                    arg3.method1064((byte) -108);
                } else if (arg1 == 14) {
                    arg3.method1051((byte) -75);
                }
            }
        }
        field2391++;
    }
}
