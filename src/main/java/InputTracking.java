import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("e")
public class InputTracking {

    @OriginalMember(owner = "e", name = "a", descriptor = "I")
    private static int field70 = 7007;

    @OriginalMember(owner = "e", name = "b", descriptor = "B")
    private static byte field71 = 7;

    @OriginalMember(owner = "e", name = "c", descriptor = "I")
    private static int field72 = -514;

    @OriginalMember(owner = "e", name = "f", descriptor = "Lkb;")
    public static Packet field75 = null;

    @OriginalMember(owner = "e", name = "g", descriptor = "Lkb;")
    public static Packet field76 = null;

    @OriginalMember(owner = "e", name = "j", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "e", name = "k", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "e", name = "l", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "e", name = "h", descriptor = "J")
    public static long field77;

    @OriginalMember(owner = "e", name = "i", descriptor = "J")
    public static long field78;

    @OriginalMember(owner = "e", name = "d", descriptor = "Z")
    private static boolean field73;

    @OriginalMember(owner = "e", name = "e", descriptor = "Z")
    public static boolean field74;

    @OriginalMember(owner = "e", name = "a", descriptor = "(I)V")
    public static final synchronized void method34(int arg0) {
        field75 = Packet.method196(false, 1);
        field78 = System.currentTimeMillis();
        field74 = true;
        if (arg0 == 40470) {
            ;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(IZ)V")
    public static final synchronized void method35(int arg0, boolean arg1) {
        field74 = false;
        if (arg0 != 0) {
            field72 = -492;
        }
        if (arg1) {
            method37(499, 7007);
        } else {
            if (field75 != null) {
                field75.field623 = 0;
            }
            field76 = null;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(Z)Lkb;")
    public static final synchronized Packet method36(boolean arg0) {
        Packet var1 = null;
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (field76 != null) {
            var1 = field76;
            field76 = null;
        }
        return var1;
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(II)V")
    public static final synchronized void method37(int arg0, int arg1) {
        if (field70 == arg1 && field75.field623 + arg0 >= 500) {
            Packet var2 = field75;
            field75 = Packet.method196(false, 1);
            field76 = var2;
        }
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(IIIZ)V")
    public static final synchronized void method38(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg0 < 0 || arg0 >= 789 || arg2 < 0 || arg2 >= 532) {
            return;
        }
        field79++;
        long var4 = System.currentTimeMillis();
        if (!arg3) {
            return;
        }
        long var6 = (var4 - field78) / 10L;
        if (var6 > 250L) {
            var6 = 250L;
        }
        field78 = var4;
        method37(5, 7007);
        if (arg1 == 1) {
            field75.method199(1);
        } else {
            field75.method199(2);
        }
        field75.method199((int) var6);
        field75.method202((arg2 << 10) + arg0);
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "(II)V")
    public static final synchronized void method39(int arg0, int arg1) {
        field79++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field78) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field78 = var2;
        method37(2, 7007);
        if (arg0 >= 0) {
            return;
        }
        if (arg1 == 1) {
            field75.method199(3);
        } else {
            field75.method199(4);
        }
        field75.method199((int) var4);
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(IIB)V")
    public static final synchronized void method40(int arg0, int arg1, byte arg2) {
        if (arg1 < 0 || arg1 >= 789 || arg0 < 0 || arg0 >= 532) {
            return;
        }
        long var3 = System.currentTimeMillis();
        if (arg2 != 37) {
            field73 = !field73;
        }
        if (var3 - field77 < 50L) {
            return;
        }
        field77 = var3;
        field79++;
        long var5 = (var3 - field78) / 10L;
        if (var5 > 250L) {
            var5 = 250L;
        }
        field78 = var3;
        if (arg1 - field80 < 8 && arg1 - field80 >= -8 && arg0 - field81 < 8 && arg0 - field81 >= -8) {
            method37(3, 7007);
            field75.method199(5);
            field75.method199((int) var5);
            field75.method199((arg0 + 8 - field81 << 4) + arg1 + 8 - field80);
        } else if (arg1 - field80 < 128 && arg1 - field80 >= -128 && arg0 - field81 < 128 && arg0 - field81 >= -128) {
            method37(4, 7007);
            field75.method199(6);
            field75.method199((int) var5);
            field75.method199(arg1 + 128 - field80);
            field75.method199(arg0 + 128 - field81);
        } else {
            method37(5, 7007);
            field75.method199(7);
            field75.method199((int) var5);
            field75.method202((arg0 << 10) + arg1);
        }
        field80 = arg1;
        field81 = arg0;
    }

    @OriginalMember(owner = "e", name = "c", descriptor = "(II)V")
    public static final synchronized void method41(int arg0, int arg1) {
        if (arg1 >= 0) {
            return;
        }
        field79++;
        long var2 = System.currentTimeMillis();
        long var4 = (var2 - field78) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field78 = var2;
        if (arg0 == 1000) {
            arg0 = 11;
        }
        if (arg0 == 1001) {
            arg0 = 12;
        }
        if (arg0 == 1002) {
            arg0 = 14;
        }
        if (arg0 == 1003) {
            arg0 = 15;
        }
        if (arg0 >= 1008) {
            arg0 -= 992;
        }
        method37(3, 7007);
        field75.method199(8);
        field75.method199((int) var4);
        field75.method199(arg0);
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(IB)V")
    public static final synchronized void method42(int arg0, byte arg1) {
        field79++;
        if (arg1 != 18) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        long var3 = System.currentTimeMillis();
        long var5 = (var3 - field78) / 10L;
        if (var5 > 250L) {
            var5 = 250L;
        }
        field78 = var3;
        if (arg0 == 1000) {
            arg0 = 11;
        }
        if (arg0 == 1001) {
            arg0 = 12;
        }
        if (arg0 == 1002) {
            arg0 = 14;
        }
        if (arg0 == 1003) {
            arg0 = 15;
        }
        if (arg0 >= 1008) {
            arg0 -= 992;
        }
        method37(3, 7007);
        field75.method199(9);
        field75.method199((int) var5);
        field75.method199(arg0);
    }

    @OriginalMember(owner = "e", name = "a", descriptor = "(B)V")
    public static final synchronized void method43(byte arg0) {
        field79++;
        long var1 = System.currentTimeMillis();
        if (field71 != arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        long var4 = (var1 - field78) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field78 = var1;
        method37(2, 7007);
        field75.method199(10);
        field75.method199((int) var4);
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "(B)V")
    public static final synchronized void method44(byte arg0) {
        field79++;
        long var1 = System.currentTimeMillis();
        if (arg0 != -19) {
            return;
        }
        long var3 = (var1 - field78) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field78 = var1;
        method37(2, 7007);
        field75.method199(11);
        field75.method199((int) var3);
    }

    @OriginalMember(owner = "e", name = "c", descriptor = "(B)V")
    public static final synchronized void method45(byte arg0) {
        field79++;
        long var1 = System.currentTimeMillis();
        if (arg0 != 4) {
            return;
        }
        boolean var3 = false;
        long var4 = (var1 - field78) / 10L;
        if (var4 > 250L) {
            var4 = 250L;
        }
        field78 = var1;
        method37(2, 7007);
        field75.method199(12);
        field75.method199((int) var4);
    }

    @OriginalMember(owner = "e", name = "b", descriptor = "(Z)V")
    public static final synchronized void method46(boolean arg0) {
        field79++;
        long var1 = System.currentTimeMillis();
        long var3 = (var1 - field78) / 10L;
        if (var3 > 250L) {
            var3 = 250L;
        }
        field78 = var1;
        if (!arg0) {
            method37(2, 7007);
            field75.method199(13);
            field75.method199((int) var3);
        }
    }
}
