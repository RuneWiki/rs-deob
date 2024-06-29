import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class467 extends class121 implements Runnable {

    @OriginalMember(owner = "client!og", name = "q", descriptor = "Z")
    private boolean field6524 = true;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "I")
    public int field6525 = -1;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "Los;")
    private class311 field6519;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public static int field6521 = -1;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "Z")
    public static boolean field6528 = false;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "[C")
    public static char[] field6520 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "[Lo;")
    public static class24[] field6526;

    @OriginalMember(owner = "client!og", name = "run", descriptor = "()V")
    public final void run() {
        field6527++;
        while (this.field6524) {
            this.field6519.method1881(this, -106);
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
    public final void method2706(int arg0) {
        int var2 = -24 % ((-arg0 - 35) / 52);
        field6523++;
        (new Thread(this, "a")).start();
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILjj;)V")
    public static final void method2707(int arg0, class77 arg1) {
        if (arg0 != 49) {
            field6528 = false;
        }
        field6517++;
        arg1.field1003 = null;
        if (class197.field2809 < 20) {
            class64.field811.method2753(4, arg1);
            class197.field2809++;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public final void method2708(byte arg0) {
        field6522++;
        this.field6524 = false;
        int var2 = 92 % ((18 - arg0) / 38);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method2709(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class493.field6970 = arg0;
        class169.field2463 = 0x1 << class493.field6970;
        class534.field7832 = class169.field2463 >> 1;
        class170.field2468 = (int) Math.sqrt((double) (class534.field7832 * class534.field7832 + class534.field7832 * class534.field7832));
        class400.field5632 = class169.field2463 >> 2;
        class14.field185 = class169.field2463;
        class6.field109 = arg2;
        class272.field4032 = arg3;
        class153.field2206 = arg4;
        class288.field4208 = new class239[arg1][class6.field109][class272.field4032];
        class68.field858 = new class38[arg1];
        if (arg5) {
            class429.field6048 = new int[class6.field109][class272.field4032];
            class261.field3858 = new byte[class6.field109][class272.field4032];
            class211.field3059 = new short[class6.field109][class272.field4032];
            class418.field5879 = new class239[1][class6.field109][class272.field4032];
            class60.field743 = new class38[1];
        } else {
            class429.field6048 = null;
            class261.field3858 = null;
            class211.field3059 = null;
            class418.field5879 = null;
            class60.field743 = null;
        }
        if (arg6) {
            class400.field5635 = new long[arg1][arg2][arg3];
            class74.field899 = new class391[65535];
            class147.field1955 = new boolean[65535];
            class446.field6233 = 0;
        } else {
            class400.field5635 = null;
            class74.field899 = null;
            class147.field1955 = null;
            class446.field6233 = 0;
        }
        class521.method3083(false);
        class382.field5383 = new class296[1000];
        class345.field5010 = 0;
        class52.field629 = new class296[1000];
        class197.field2808 = 0;
        class520.field7650 = new int[arg1][class6.field109 + 1][class272.field4032 + 1];
        class521.field7661 = new class144[5000];
        class222.field3184 = 0;
        class477.field6647 = new boolean[class153.field2206 + class153.field2206 + 1][class153.field2206 + class153.field2206 + 1];
        class12.field156 = new boolean[class153.field2206 + class153.field2206 + 2][class153.field2206 + class153.field2206 + 2];
        class435.field6118 = null;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
    public static void method2710(byte arg0) {
        field6520 = null;
        int var1 = -71 / ((45 - arg0) / 57);
        field6526 = null;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
    public static final void method2711(int arg0) {
        field6518++;
        if (arg0 != 6591) {
            method2710((byte) -17);
        }
        for (int var1 = 0; var1 < class10.field140; var1++) {
            class78 var2 = class289.field4229[var1];
            if (var2.field1015 == 2) {
                if (var2.field1014 == null) {
                    var2.field1026 = Integer.MIN_VALUE;
                } else {
                    class138.field1810.method2312(var2.field1014);
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Los;)V")
    public class467(class311 arg0) {
        this.field6519 = arg0;
    }
}
