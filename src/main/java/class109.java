import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class109 extends class535 implements class68 {

    @OriginalMember(owner = "client!kt", name = "w", descriptor = "Lkr;")
    public class535 field1531;

    @OriginalMember(owner = "client!kt", name = "C", descriptor = "Ljava/lang/String;")
    public static String field1537 = "";

    @OriginalMember(owner = "client!kt", name = "I", descriptor = "I")
    public static int field1543 = -1;

    @OriginalMember(owner = "client!kt", name = "r", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!kt", name = "s", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!kt", name = "t", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!kt", name = "u", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!kt", name = "v", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!kt", name = "x", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!kt", name = "y", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!kt", name = "A", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!kt", name = "B", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!kt", name = "D", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!kt", name = "E", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!kt", name = "F", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!kt", name = "G", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!kt", name = "H", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!kt", name = "J", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!kt", name = "K", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(Z)Z")
    public final boolean method176(boolean arg0) {
        if (!arg0) {
            field1543 = 67;
        }
        field1533++;
        return false;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILqa;I)Lka;")
    public final class334 method337(int arg0, class165 arg1, int arg2) {
        if (arg2 != 14221) {
            this.method136(66, null);
        }
        field1541++;
        return null;
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)I")
    public final int method336(int arg0) {
        if (arg0 != -6130) {
            this.field1531 = null;
        }
        field1532++;
        return 0;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lnj;Z)Ljava/lang/String;")
    public static final String method688(class164 arg0, boolean arg1) {
        field1544++;
        if (!arg1) {
            field1537 = null;
        }
        return class81.method550(arg0, 32767, 0);
    }

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "(I)V")
    public final void method175(int arg0) {
        if (arg0 != 0) {
            method688(null, false);
        }
        field1539++;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILa;IIILqa;Z)V")
    public final void method166(int arg0, class444 arg1, int arg2, int arg3, int arg4, class165 arg5, boolean arg6) {
        if (arg2 <= -4) {
            field1540++;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILqa;)Lou;")
    public final class437 method136(int arg0, class165 arg1) {
        if (arg0 == 0) {
            field1536++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lqa;I)V")
    public final void method330(class165 arg0, int arg1) {
        field1545++;
        if (arg1 != 14470) {
            field1537 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "(I)I")
    public final int method338(int arg0) {
        field1529++;
        if (arg0 < 75) {
            this.method337(-119, null, -3);
        }
        return 0;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)Z")
    public final boolean method339(int arg0) {
        field1526++;
        return arg0 != 3583;
    }

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "(I)V")
    public static void method689(int arg0) {
        field1537 = null;
        if (arg0 != 0) {
            field1543 = 22;
        }
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(B)V")
    public static final void method690(byte arg0) {
        field1535++;
        class368 var1 = null;
        try {
            class234 var2 = class312.field4572.method2975(true, 8, "2");
            if (arg0 >= -119) {
                method688(null, true);
            }
            while (var2.field3322 == 0) {
                class388.method2433(1L, 69);
            }
            if (var2.field3322 == 1) {
                var1 = (class368) var2.field3324;
                byte[] var3 = new byte[(int) var1.method2343((byte) 31)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2340(var3.length - var4, var4, true, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class159.method1037((byte) -62, new class164(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2344((byte) -93);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)I")
    public final int method332(int arg0) {
        if (arg0 != 6359) {
            this.method338(-35);
        }
        field1530++;
        return 0;
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(ZLqa;)V")
    public final void method135(boolean arg0, class165 arg1) {
        if (arg0) {
            this.method339(107);
        }
        field1538++;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(IIIIILkr;)V")
    public class109(int arg0, int arg1, int arg2, int arg3, int arg4, class535 arg5) {
        super(arg2, arg3, arg4, class215.method1475(118, arg1, arg0));
        this.field1531 = arg5;
    }

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "(I)V")
    public final void method334(int arg0) {
        if (arg0 != 29893) {
            this.field1531 = null;
        }
        field1534++;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZLqa;)V")
    public final void method333(boolean arg0, class165 arg1) {
        field1527++;
        if (!arg0) {
            field1537 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BIILqa;)Z")
    public final boolean method138(byte arg0, int arg1, int arg2, class165 arg3) {
        field1542++;
        if (arg0 < 121) {
            this.method136(127, null);
        }
        return false;
    }
}
