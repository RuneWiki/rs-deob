import java.awt.Canvas;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public abstract class class25 extends class362 {

    @OriginalMember(owner = "client!fba", name = "o", descriptor = "Lqo;")
    public class22 field730;

    @OriginalMember(owner = "client!fba", name = "u", descriptor = "[B")
    public static byte[] field736 = new byte[2048];

    @OriginalMember(owner = "client!fba", name = "p", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!fba", name = "q", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!fba", name = "s", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!fba", name = "t", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!fba", name = "v", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!fba", name = "w", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!fba", name = "y", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!fba", name = "z", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!fba", name = "x", descriptor = "Lmi;")
    public static class496 field739;

    @OriginalMember(owner = "client!fba", name = "r", descriptor = "Z")
    public boolean field733;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Ltp;Ltp;IB)V")
    public abstract void method377(class533 arg0, class533 arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Z)Z")
    public abstract boolean method378(boolean arg0);

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "(II)Loaa;")
    public static final class290 method379(int arg0, int arg1) {
        field737++;
        class290[] var2 = class55.method607((byte) -97);
        for (int var3 = arg1; var3 < var2.length; var3++) {
            if (var2[var3].field4058 == arg0) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZIILjava/awt/Canvas;Ld;)Lha;")
    public static final class59 method380(boolean arg0, int arg1, int arg2, Canvas arg3, class152 arg4) {
        field740++;
        if (!arg0) {
            field736 = null;
        }
        return new class289(arg3, arg4, arg2, arg1);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IBI)V")
    public abstract void method381(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(III)V")
    public static final void method382(int arg0, int arg1, int arg2) {
        field741++;
        if (~class326.field4513 != arg0) {
            if (arg2 >= 0) {
                class240.field3497[arg2] = arg1;
            } else {
                for (int var3 = 0; var3 < 16; var3++) {
                    class240.field3497[var3] = arg1;
                }
            }
        }
        class266.field3769.method73(arg1, arg2, -7836);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(BI)V")
    public abstract void method383(byte arg0, int arg1);

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V")
    public static final void method384(int arg0) {
        field732++;
        if (class189.field2825 == 0) {
            return;
        }
        try {
            if (arg0 >= 82) {
                if (++class166.field2604 > 2000) {
                    if (class512.field7137 != null) {
                        class512.field7137.method706((byte) 36);
                        class512.field7137 = null;
                    }
                    if (class232.field3355 >= 2) {
                        class189.field2825 = 0;
                        class547.field7542 = -5;
                        return;
                    }
                    class20.field316.method3761(0);
                    class189.field2825 = 1;
                    class166.field2604 = 0;
                    class232.field3355++;
                }
                if (class189.field2825 == 1) {
                    class162.field2585 = class20.field316.method3764(class689.field9299, (byte) 36);
                    class189.field2825 = 2;
                }
                if (class189.field2825 == 2) {
                    if (class162.field2585.field8462 == 2) {
                        throw new IOException();
                    }
                    if (class162.field2585.field8462 != 1) {
                        return;
                    }
                    class512.field7137 = class199.method1409((Socket) class162.field2585.field8463, (byte) 24, 7500);
                    class162.field2585 = null;
                    class620.method3538(0);
                    class189.field2825 = 4;
                }
                if (class189.field2825 == 4 && class512.field7137.method708(1, 104)) {
                    class512.field7137.method707(1, 0, (byte) -116, class149.field2477.field3066);
                    int var1 = class149.field2477.field3066[0] & 0xFF;
                    class547.field7542 = var1;
                    class189.field2825 = 0;
                    class512.field7137.method706((byte) 36);
                    class512.field7137 = null;
                }
            }
        } catch (IOException var2) {
            if (class512.field7137 != null) {
                class512.field7137.method706((byte) 36);
                class512.field7137 = null;
            }
            if (class232.field3355 < 2) {
                class20.field316.method3761(0);
                class166.field2604 = 0;
                class232.field3355++;
                class189.field2825 = 1;
            } else {
                class547.field7542 = -4;
                class189.field2825 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)Z")
    public abstract boolean method385(int arg0);

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "(I)Z")
    public final boolean method386(int arg0) {
        if (arg0 == 1) {
            field738++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)Z")
    public final boolean method387(byte arg0) {
        if (arg0 != 1) {
            this.method390((byte) 37);
        }
        field731++;
        return this.field733;
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(Z)I")
    public int method388(boolean arg0) {
        field734++;
        if (!arg0) {
            method384(-63);
        }
        return 0;
    }

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "(I)V")
    public static void method389(int arg0) {
        field736 = null;
        field739 = null;
        int var1 = -23 % ((arg0 + 24) / 47);
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(B)V")
    public abstract void method390(byte arg0);

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lqo;)V")
    public class25(class22 arg0) {
        this.field730 = arg0;
    }

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "(I)I")
    public final int method391(int arg0) {
        if (arg0 != 1) {
            field736 = null;
        }
        field735++;
        return 1;
    }
}
