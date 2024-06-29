import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public class class250 {

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "Z")
    public boolean field3704 = true;

    @OriginalMember(owner = "client!bja", name = "c", descriptor = "I")
    public int field3706 = -1;

    @OriginalMember(owner = "client!bja", name = "j", descriptor = "I")
    public int field3713 = 0;

    @OriginalMember(owner = "client!bja", name = "l", descriptor = "Z")
    public boolean field3715 = false;

    @OriginalMember(owner = "client!bja", name = "m", descriptor = "I")
    public int field3716 = -1;

    @OriginalMember(owner = "client!bja", name = "n", descriptor = "I")
    public int field3717 = 8;

    @OriginalMember(owner = "client!bja", name = "i", descriptor = "I")
    public int field3712 = 512;

    @OriginalMember(owner = "client!bja", name = "b", descriptor = "Z")
    public boolean field3705 = true;

    @OriginalMember(owner = "client!bja", name = "k", descriptor = "I")
    public int field3714 = 1190717;

    @OriginalMember(owner = "client!bja", name = "o", descriptor = "I")
    public int field3718 = 127;

    @OriginalMember(owner = "client!bja", name = "r", descriptor = "I")
    public int field3721 = 64;

    @OriginalMember(owner = "client!bja", name = "s", descriptor = "Ltq;")
    public static class397 field3722 = new class397();

    @OriginalMember(owner = "client!bja", name = "t", descriptor = "[I")
    public static int[] field3723 = new int[4096];

    @OriginalMember(owner = "client!bja", name = "d", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!bja", name = "e", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!bja", name = "f", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!bja", name = "g", descriptor = "I")
    public int field3710;

    @OriginalMember(owner = "client!bja", name = "h", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!bja", name = "p", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!bja", name = "q", descriptor = "Lvk;")
    public class446 field3720;

    @OriginalMember(owner = "client!bja", name = "u", descriptor = "[I")
    public static int[] field3724;

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(I)V")
    public final void method1676(int arg0) {
        int var2 = 78 % (-arg0 / 44);
        field3708++;
        this.field3717 = this.field3710 | this.field3717 << 8;
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(ZLgga;)V")
    public final void method1677(boolean arg0, class511 arg1) {
        field3707++;
        while (true) {
            int var3 = arg1.method3013(60);
            if (var3 == 0) {
                if (arg0) {
                    return;
                } else {
                    this.method1677(false, null);
                    return;
                }
            }
            this.method1678(var3, arg1, -12);
        }
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(ILgga;I)V")
    private final void method1678(int arg0, class511 arg1, int arg2) {
        field3711++;
        if (arg0 == 1) {
            this.field3713 = class444.method2669(-16711936, arg1.method2983(true));
        } else if (arg0 == 2) {
            this.field3706 = arg1.method3013(15);
        } else if (arg0 == 3) {
            this.field3706 = arg1.method3002(arg2 ^ 0xB);
            if (this.field3706 == 65535) {
                this.field3706 = -1;
            }
        } else if (arg0 == 5) {
            this.field3704 = false;
        } else if (arg0 == 7) {
            this.field3716 = class444.method2669(arg2 ^ 0xFF00F4, arg1.method2983(true));
        } else if (arg0 == 8) {
            this.field3720.field6252 = this.field3710;
        } else if (arg0 == 9) {
            this.field3712 = arg1.method3002(-1) << 2;
        } else if (arg0 == 10) {
            this.field3705 = false;
        } else if (arg0 == 11) {
            this.field3717 = arg1.method3013(8);
        } else if (arg0 == 12) {
            this.field3715 = true;
        } else if (arg0 == 13) {
            this.field3714 = arg1.method2983(true);
        } else if (arg0 == 14) {
            this.field3721 = arg1.method3013(arg2 + 30) << 2;
        } else if (arg0 == 16) {
            this.field3718 = arg1.method3013(arg2 ^ 0xFFFFFFBA);
        }
        if (arg2 != -12) {
            this.field3713 = -14;
        }
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(B)V")
    public static final void method1679(byte arg0) {
        field3709++;
        class574 var1 = (class574) class189.field2356.method1041(1048832);
        int var2 = -108 / ((-arg0 - 79) / 37);
        while (var1 != null) {
            class49.method412(var1, 1, false);
            var1 = (class574) class189.field2356.method1033(-1);
        }
        for (class574 var3 = (class574) class747.field10318.method1041(1048832); var3 != null; var3 = (class574) class747.field10318.method1033(-1)) {
            class49.method412(var3, 1, true);
        }
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(IIIB)V")
    public static final void method1680(int arg0, int arg1, int arg2, byte arg3) {
        field3719++;
        String var4 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
        System.out.println(var4);
        if (arg3 >= -65) {
            method1679((byte) 67);
        }
        class416.method2522(false, var4, true, 0);
    }

    @OriginalMember(owner = "client!bja", name = "b", descriptor = "(I)V")
    public static void method1681(int arg0) {
        field3724 = null;
        if (arg0 > -81) {
            method1682(108, -94, -9);
        }
        field3722 = null;
        field3723 = null;
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(III)Lkka;")
    public static final class516 method1682(int arg0, int arg1, int arg2) {
        class472 var3 = class59.field688[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class516 var4 = var3.field6543;
            var3.field6543 = null;
            class543.method3219(var4);
            return var4;
        }
    }
}
