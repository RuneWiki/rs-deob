import java.awt.Font;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class227 {

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "Lce;")
    private class216 field3661 = new class216();

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "Lce;")
    private class216 field3676 = new class216();

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "Lce;")
    private class216 field3677 = new class216();

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "Lce;")
    private class216 field3678 = new class216();

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "Llj;")
    private class25 field3680 = new class25(4);

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public volatile int field3683 = 0;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "B")
    private byte field3685 = 0;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public volatile int field3686 = 0;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "Llj;")
    private class25 field3684 = new class25(8);

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3659 = "Connecting to update server";

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "[Lck;")
    public static class218[] field3670 = new class218[14];

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3671 = "Checking for updates - ";

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "Ljava/lang/String;")
    public static String field3673 = "Loaded world list data";

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    private int field3681;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "J")
    private long field3679;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "Lba;")
    private class167 field3687;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "Ltj;")
    private class273 field3682;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "Ljava/awt/Font;")
    public static Font field3674;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "[[S")
    public static short[][] field3654;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)I")
    public final int method1544(int arg0) {
        if (arg0 == 13270) {
            field3672++;
            return this.field3661.method1463(false) + this.field3676.method1463(false);
        } else {
            return 64;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public final void method1545(byte arg0) {
        field3655++;
        if (this.field3682 == null) {
            return;
        }
        try {
            this.field3680.field349 = 0;
            this.field3680.method184(7, 92);
            this.field3680.method174(19954, 0);
            this.field3682.method1843(-110, this.field3680.field339, 4, 0);
        } catch (IOException var4) {
            try {
                this.field3682.method1842(false);
            } catch (Exception var3) {
            }
            this.field3686 = -2;
            this.field3683++;
            this.field3682 = null;
        }
        int var2 = 28 / ((-arg0 - 67) / 33);
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
    public static void method1546(int arg0) {
        field3673 = null;
        field3674 = null;
        field3671 = null;
        field3670 = null;
        field3659 = null;
        if (arg0 >= -71) {
            field3671 = null;
        }
        field3654 = null;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)Z")
    public final boolean method1547(int arg0) {
        if (this.field3682 != null) {
            long var2 = class260.method1785((byte) -127);
            int var4 = (int) (var2 - this.field3679);
            this.field3679 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3681 += var4;
            if (this.field3681 > 30000) {
                try {
                    this.field3682.method1842(false);
                } catch (Exception var27) {
                }
                this.field3682 = null;
            }
        }
        field3665++;
        if (arg0 <= 0) {
            this.method1544(63);
        }
        if (this.field3682 == null) {
            return this.method1544(13270) == 0 && this.method1554(22718) == 0;
        }
        try {
            this.field3682.method1846((byte) 39);
            for (class167 var5 = (class167) this.field3661.method1467(0); var5 != null; var5 = (class167) this.field3661.method1461((byte) -116)) {
                this.field3680.field349 = 0;
                this.field3680.method184(1, 121);
                this.field3680.method174(19954, (int) var5.field1958);
                this.field3682.method1843(-111, this.field3680.field339, 4, 0);
                this.field3676.method1466(var5, -31);
            }
            for (class167 var6 = (class167) this.field3677.method1467(0); var6 != null; var6 = (class167) this.field3677.method1461((byte) -116)) {
                this.field3680.field349 = 0;
                this.field3680.method184(0, 90);
                this.field3680.method174(19954, (int) var6.field1958);
                this.field3682.method1843(-100, this.field3680.field339, 4, 0);
                this.field3678.method1466(var6, 112);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field3682.method1840((byte) 123);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field3681 = 0;
                byte var9 = 0;
                if (this.field3687 == null) {
                    var9 = 8;
                } else if (this.field3687.field2569 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field3687.field2571.field339.length - this.field3687.field2570;
                    int var11 = 512 - this.field3687.field2569;
                    if (var11 > (var10 - this.field3687.field2571.field349)) {
                        var11 = var10 - this.field3687.field2571.field349;
                    }
                    if (var8 < var11) {
                        var11 = var8;
                    }
                    this.field3682.method1841(-1, this.field3687.field2571.field339, var11, this.field3687.field2571.field349);
                    if (this.field3685 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field3687.field2571.field339[this.field3687.field2571.field349 + var12] = (byte) class128.method879(this.field3687.field2571.field339[this.field3687.field2571.field349 + var12], this.field3685);
                        }
                    }
                    this.field3687.field2571.field349 += var11;
                    this.field3687.field2569 += var11;
                    if (this.field3687.field2571.field349 == var10) {
                        this.field3687.method912(-120);
                        this.field3687.field854 = false;
                        this.field3687 = null;
                    } else if (this.field3687.field2569 == 512) {
                        this.field3687.field2569 = 0;
                    }
                } else {
                    int var13 = var9 - this.field3684.field349;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field3682.method1841(-1, this.field3684.field339, var13, this.field3684.field349);
                    if (this.field3685 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field3684.field339[this.field3684.field349 + var14] = (byte) class128.method879(this.field3684.field339[this.field3684.field349 + var14], this.field3685);
                        }
                    }
                    this.field3684.field349 += var13;
                    if (var9 <= this.field3684.field349) {
                        if (this.field3687 == null) {
                            this.field3684.field349 = 0;
                            int var15 = this.field3684.method201(255);
                            int var16 = this.field3684.method190(-3);
                            int var17 = this.field3684.method201(255);
                            boolean var18 = (var17 & 0x80) != 0;
                            int var19 = var17 & 0x7F;
                            long var20 = (long) ((var15 << 16) + var16);
                            int var22 = this.field3684.method214((byte) 44);
                            Object var23 = null;
                            class167 var24;
                            if (var18) {
                                for (var24 = (class167) this.field3678.method1467(0); var24 != null && var24.field1958 != var20; var24 = (class167) this.field3678.method1461((byte) -116)) {
                                }
                            } else {
                                for (var24 = (class167) this.field3676.method1467(0); var24 != null && var24.field1958 != var20; var24 = (class167) this.field3676.method1461((byte) -116)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field3687 = var24;
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field3687.field2571 = new class25(this.field3687.field2570 + var22 + var25);
                            this.field3687.field2571.method184(var19, 85);
                            this.field3687.field2571.method166(var22, -3);
                            this.field3687.field2569 = 8;
                            this.field3684.field349 = 0;
                        } else if (this.field3687.field2569 != 0) {
                            throw new IOException();
                        } else if (this.field3684.field339[0] == -1) {
                            this.field3687.field2569 = 1;
                            this.field3684.field349 = 0;
                        } else {
                            this.field3687 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field3682.method1842(false);
            } catch (Exception var26) {
            }
            this.field3683++;
            this.field3682 = null;
            this.field3686 = -2;
            return this.method1544(13270) == 0 && this.method1554(22718) == 0;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
    private final void method1548(byte arg0) {
        field3669++;
        if (this.field3682 == null) {
            return;
        }
        try {
            this.field3680.field349 = 0;
            this.field3680.method184(6, 82);
            this.field3680.method174(19954, 3);
            this.field3682.method1843(-119, this.field3680.field339, 4, 0);
        } catch (IOException var4) {
            try {
                this.field3682.method1842(false);
            } catch (Exception var3) {
            }
            this.field3683++;
            this.field3686 = -2;
            this.field3682 = null;
        }
        int var2 = 14 % ((arg0 + 6) / 38);
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V")
    public final void method1549(int arg0) {
        if (this.field3682 != null) {
            this.field3682.method1844((byte) -99);
        }
        int var2 = -11 / ((68 - arg0) / 46);
        field3658++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZILtj;)V")
    public final void method1550(boolean arg0, int arg1, class273 arg2) {
        field3656++;
        if (this.field3682 != null) {
            try {
                this.field3682.method1842(false);
            } catch (Exception var8) {
            }
            this.field3682 = null;
        }
        if (arg1 != 28817) {
            this.field3681 = 74;
        }
        this.field3682 = arg2;
        this.method1548((byte) -102);
        this.method1553(arg0, (byte) -110);
        this.field3684.field349 = 0;
        this.field3687 = null;
        while (true) {
            class167 var4 = (class167) this.field3676.method1464(true);
            if (var4 == null) {
                while (true) {
                    class167 var5 = (class167) this.field3678.method1464(true);
                    if (var5 == null) {
                        if (this.field3685 != 0) {
                            try {
                                this.field3680.field349 = 0;
                                this.field3680.method184(4, 103);
                                this.field3680.method184(this.field3685, arg1 ^ 0x70FD);
                                this.field3680.method223(-1720191288, 0);
                                this.field3682.method1843(-123, this.field3680.field339, 4, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field3682.method1842(false);
                                } catch (Exception var6) {
                                }
                                this.field3683++;
                                this.field3686 = -2;
                                this.field3682 = null;
                            }
                        }
                        this.field3681 = 0;
                        this.field3679 = class260.method1785((byte) -101);
                        return;
                    }
                    this.field3677.method1466(var5, arg1 ^ 0xFFFF8F70);
                }
            }
            this.field3661.method1466(var4, 68);
        }
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)V")
    public final void method1551(int arg0) {
        int var2 = -112 % ((arg0 + 69) / 32);
        field3660++;
        if (this.field3682 != null) {
            this.field3682.method1842(false);
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)Z")
    public final boolean method1552(byte arg0) {
        if (arg0 != 61) {
            this.field3679 = -98L;
        }
        field3675++;
        return this.method1554(22718) >= 20;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZB)V")
    public final void method1553(boolean arg0, byte arg1) {
        field3667++;
        int var3 = -42 % ((30 - arg1) / 62);
        if (this.field3682 == null) {
            return;
        }
        try {
            this.field3680.field349 = 0;
            this.field3680.method184(arg0 ? 2 : 3, 86);
            this.field3680.method174(19954, 0);
            this.field3682.method1843(-124, this.field3680.field339, 4, 0);
        } catch (IOException var5) {
            try {
                this.field3682.method1842(false);
            } catch (Exception var4) {
            }
            this.field3682 = null;
            this.field3686 = -2;
            this.field3683++;
        }
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)I")
    private final int method1554(int arg0) {
        if (arg0 == 22718) {
            field3657++;
            return this.field3677.method1463(false) + this.field3678.method1463(false);
        } else {
            return 85;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)I")
    public static final int method1555(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field3662++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            if (arg1 != 22647) {
                field3674 = null;
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)V")
    public final void method1556(byte arg0) {
        try {
            this.field3682.method1842(false);
        } catch (Exception var2) {
        }
        this.field3683++;
        this.field3686 = -1;
        this.field3682 = null;
        if (arg0 <= 103) {
            this.method1548((byte) 100);
        }
        this.field3685 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        field3664++;
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(B)Z")
    public final boolean method1557(byte arg0) {
        field3668++;
        if (arg0 == 93) {
            return this.method1544(13270) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIZIB)Lba;")
    public final class167 method1558(int arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        field3666++;
        long var6 = (long) ((arg0 << 16) + arg1);
        if (arg3 != -21) {
            this.method1552((byte) 5);
        }
        class167 var8 = new class167();
        var8.field857 = arg2;
        var8.field2570 = arg4;
        var8.field1958 = var6;
        if (arg2) {
            if (this.method1544(arg3 ^ 0xFFFFCC3D) >= 20) {
                throw new RuntimeException();
            }
            this.field3661.method1466(var8, arg3 ^ 0xFFFFFFA8);
        } else if (this.method1554(arg3 + 22739) < 20) {
            this.field3677.method1466(var8, 88);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }
}
