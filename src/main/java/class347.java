import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class347 extends class531 {

    @OriginalMember(owner = "client!ofa", name = "i", descriptor = "I")
    public static int field4853 = 0;

    @OriginalMember(owner = "client!ofa", name = "m", descriptor = "[I")
    public static int[] field4857 = new int[2048];

    @OriginalMember(owner = "client!ofa", name = "n", descriptor = "[I")
    public static int[] field4858 = new int[50];

    @OriginalMember(owner = "client!ofa", name = "g", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!ofa", name = "h", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!ofa", name = "j", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!ofa", name = "k", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!ofa", name = "l", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!ofa", name = "o", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!ofa", name = "p", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "(ZI)V", line = 3)
    public final void method301(boolean arg0, int arg1) {
        super.field7676.method821(true, 66);
        ++field4854;
        if (arg1 >= -9) {
            field4853 = 41;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(Lqfa;)V", line = 16)
    public class347(class106 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)Z", line = 23)
    public final boolean method304(int arg0) {
        ++field4855;
        if (arg0 < 125) {
            field4857 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(BII)V", line = 34)
    public final void method311(byte arg0, int arg1, int arg2) {
        if (arg0 >= -55) {
            field4857 = null;
        }
        ++field4851;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ZI)V", line = 53)
    public final void method309(boolean arg0, int arg1) {
        ++field4859;
        if (arg1 > -67) {
            this.method311((byte) 115, -58, 8);
        }
    }

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "(I)V", line = 64)
    public final void method300(int arg0) {
        ++field4856;
        super.field7676.method821(false, 117);
        if (arg0 != 1) {
            field4857 = null;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IZLdca;)V", line = 81)
    public final void method307(int arg0, boolean arg1, class188 arg2) {
        ++field4852;
        if (arg1) {
            this.method301(true, -11);
        }
        super.field7676.method808((byte) 34, arg2);
        super.field7676.method795(arg0, 34023);
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(B)V", line = 93)
    public static final void method2201(byte arg0) {
        ++field4860;
        if (~class339.field4745 != -1) {
            try {
                if (~(++class96.field1095) < -2001) {
                    if (class527.field7529 != null) {
                        class527.field7529.method612((byte) 118);
                        class527.field7529 = null;
                    }
                    if (class335.field4720 >= 2) {
                        class339.field4745 = 0;
                        class617.field8633 = -5;
                        return;
                    }
                    class680.field9439.method417((byte) -55);
                    ++class335.field4720;
                    class96.field1095 = 0;
                    class339.field4745 = 1;
                }
                if (class339.field4745 == 1) {
                    class613.field8617 = class680.field9439.method416(class519.field7328, false);
                    class339.field4745 = 2;
                }
                if (~class339.field4745 == -3) {
                    if (class613.field8617.field2089 == 2) {
                        throw new IOException();
                    }
                    if (class613.field8617.field2089 != 1) {
                        return;
                    }
                    class527.field7529 = class256.method1665((Socket) class613.field8617.field2092, 107, 15000);
                    class613.field8617 = null;
                    class158.method1205((byte) -30);
                    class339.field4745 = 4;
                }
                if (class339.field4745 == 4) {
                    if (class527.field7529.method616(1, 0)) {
                        class527.field7529.method620(0, 118, class110.field1640.field7050, 1);
                        int var1 = 255 & class110.field1640.field7050[0];
                        class617.field8633 = var1;
                        class339.field4745 = 0;
                        class527.field7529.method612((byte) 120);
                        class527.field7529 = null;
                    }
                } else {
                    int var2 = 108 % ((37 - arg0) / 39);
                }
            } catch (IOException var3) {
                if (class527.field7529 != null) {
                    class527.field7529.method612((byte) -59);
                    class527.field7529 = null;
                }
                if (~class335.field4720 > -3) {
                    class680.field9439.method417((byte) -103);
                    ++class335.field4720;
                    class96.field1095 = 0;
                    class339.field4745 = 1;
                } else {
                    class339.field4745 = 0;
                    class617.field8633 = -4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ofa", name = "d", descriptor = "(I)V", line = 193)
    public static final void method2202(int arg0) {
        if (arg0 == 0) {
            if (class652.field9112 == 2) {
                class16.field297[0].method4245(class747.field10352[0]);
                class16.field297[1].method4245(class747.field10352[1]);
            } else if (class652.field9112 == 3) {
                class16.field297[0].method4245(class747.field10352[0]);
                class16.field297[1].method4245(class747.field10352[1]);
                class16.field297[2].method4245(class747.field10352[2]);
            } else {
                class16.field297[0].method4245(class747.field10352[0]);
                class16.field297[1].method4245(class747.field10352[1]);
                class16.field297[2].method4245(class747.field10352[2]);
                class16.field297[3].method4245(class747.field10352[3]);
            }
        } else if (arg0 == 1) {
            if (class652.field9112 == 2) {
                class16.field297[0].method4245(class747.field10352[2]);
            } else if (class652.field9112 == 3) {
                class16.field297[0].method4245(class747.field10352[3]);
                class16.field297[1].method4245(class747.field10352[4]);
            } else {
                class16.field297[0].method4245(class747.field10352[4]);
                class16.field297[1].method4245(class747.field10352[5]);
                class16.field297[2].method4245(class747.field10352[6]);
            }
        } else {
            if (arg0 == 2) {
                if (class652.field9112 == 2) {
                    class16.field297[0].method4245(class747.field10352[3]);
                    return;
                }
                if (class652.field9112 == 3) {
                    class16.field297[0].method4245(class747.field10352[5]);
                    return;
                }
                class16.field297[0].method4245(class747.field10352[7]);
            }
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Z)V", line = 266)
    public static void method2203(boolean arg0) {
        field4858 = null;
        if (!arg0) {
            field4857 = null;
        }
    }
}
