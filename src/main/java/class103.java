import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class103 {

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public int field1589 = 5;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public int field1597 = 99;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public int field1592 = -1;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public int field1601 = -1;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public int field1604 = 2;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public int field1600 = -1;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "Z")
    public boolean field1610 = false;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "Z")
    public boolean field1613 = false;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "Z")
    public boolean field1603 = false;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "Z")
    public boolean field1605 = false;

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "I")
    public int field1615 = -1;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public int field1594 = -1;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "S")
    public static short field1591 = 32767;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    public static int field1611 = -1;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public int field1598;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "Ljava/awt/Frame;")
    public static Frame field1599;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "[I")
    private int[] field1590;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "[I")
    public int[] field1602;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "[I")
    public int[] field1606;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "[Z")
    public boolean[] field1614;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "[[I")
    public int[][] field1608;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public final void method782(int arg0) {
        if (this.field1594 == -1) {
            if (this.field1614 == null) {
                this.field1594 = 0;
            } else {
                this.field1594 = 2;
            }
        }
        if (arg0 != 16) {
            method785(-97);
        }
        field1607++;
        if (this.field1600 != -1) {
            return;
        }
        if (this.field1614 == null) {
            this.field1600 = 0;
        } else {
            this.field1600 = 2;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IBIILhd;)Lhd;")
    public final class11 method783(int arg0, byte arg1, int arg2, int arg3, class11 arg4) {
        field1593++;
        if (arg1 > 0) {
            field1591 = 11;
        }
        int var6 = this.field1602[arg0];
        int var7 = this.field1606[arg0];
        class50 var8 = class208.method1454((byte) 67, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg4.method68(true, true, true);
        }
        class50 var10 = null;
        if ((this.field1613 || class305.field4896) && arg3 != -1 && arg3 < this.field1606.length) {
            int var11 = this.field1606[arg3];
            var10 = class208.method1454((byte) 31, var11 >> 16);
            arg3 = var11 & 0xFFFF;
        }
        class11 var12;
        if (var10 == null) {
            var12 = arg4.method68(!var8.method416(true, var9), !var8.method415(var9, (byte) -110), !this.field1605);
        } else {
            var12 = arg4.method68(!var8.method416(true, var9) & !var10.method416(true, arg3), !var8.method415(var9, (byte) 121) & !var10.method415(arg3, (byte) -98), !this.field1605);
        }
        var12.method71(var8, var9, var10, arg3, arg2 - 1, var6, this.field1605);
        return var12;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILha;)V")
    private final void method784(int arg0, int arg1, class31 arg2) {
        if (arg1 == 1) {
            int var4 = arg2.method260((byte) -67);
            this.field1602 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1602[var5] = arg2.method260((byte) -67);
            }
            this.field1606 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1606[var6] = arg2.method260((byte) -67);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1606[var7] = (arg2.method260((byte) -67) << 16) + this.field1606[var7];
            }
        } else if (arg1 == 2) {
            this.field1592 = arg2.method260((byte) -67);
        } else if (arg1 == 3) {
            this.field1614 = new boolean[256];
            int var8 = arg2.method265(-127);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1614[arg2.method265(-110)] = true;
            }
        } else if (arg1 == 4) {
            this.field1610 = true;
        } else if (arg1 == 5) {
            this.field1589 = arg2.method265(-113);
        } else if (arg1 == 6) {
            this.field1601 = arg2.method260((byte) -67);
        } else if (arg1 == 7) {
            this.field1615 = arg2.method260((byte) -67);
        } else if (arg1 == 8) {
            this.field1597 = arg2.method265(-93);
        } else if (arg1 == 9) {
            this.field1594 = arg2.method265(-90);
        } else if (arg1 == 10) {
            this.field1600 = arg2.method265(-101);
        } else if (arg1 == 11) {
            this.field1604 = arg2.method265(-90);
        } else if (arg1 == 12) {
            int var14 = arg2.method265(-93);
            this.field1590 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field1590[var15] = arg2.method260((byte) -67);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field1590[var16] = (arg2.method260((byte) -67) << 16) + this.field1590[var16];
            }
        } else if (arg1 == 13) {
            int var10 = arg2.method260((byte) -67);
            this.field1608 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg2.method265(-116);
                if (var12 > 0) {
                    this.field1608[var11] = new int[var12];
                    this.field1608[var11][0] = arg2.method304((byte) 84);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field1608[var11][var13] = arg2.method260((byte) -67);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field1605 = true;
        } else if (arg1 == 15) {
            this.field1613 = true;
        } else if (arg1 == 16) {
            this.field1603 = true;
        }
        if (arg0 < 86) {
            this.method786((class31) null, -4);
        }
        field1612++;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
    public static void method785(int arg0) {
        if (arg0 != 0) {
            method785(-29);
        }
        field1599 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lha;I)V")
    public final void method786(class31 arg0, int arg1) {
        if (arg1 != 31546) {
            this.method786((class31) null, -19);
        }
        field1595++;
        while (true) {
            int var3 = arg0.method265(-127);
            if (var3 == 0) {
                return;
            }
            this.method784(arg1 - 31445, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILhd;III)Lhd;")
    public final class11 method787(int arg0, int arg1, class11 arg2, int arg3, int arg4, int arg5) {
        field1596++;
        int var7 = this.field1602[arg5];
        int var8 = this.field1606[arg5];
        class50 var9 = class208.method1454((byte) -127, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method65(true, true, true);
        }
        int var11 = arg3 & 0x3;
        class50 var12 = null;
        if ((this.field1613 || class305.field4896) && arg1 != -1 && arg1 < this.field1606.length) {
            int var13 = this.field1606[arg1];
            var12 = class208.method1454((byte) -120, var13 >> 16);
            arg1 = var13 & 0xFFFF;
        }
        class11 var14;
        if (var12 == null) {
            var14 = arg2.method65(!var9.method416(true, var10), !var9.method415(var10, (byte) 52), !this.field1605);
        } else {
            var14 = arg2.method65(!var9.method416(true, var10) & !var12.method416(true, arg1), !var9.method415(var10, (byte) 44) & !var12.method415(arg1, (byte) -87), !this.field1605);
        }
        if (var11 == 1) {
            var14.method78();
        } else if (var11 == 2) {
            var14.method73();
        } else if (var11 == 3) {
            var14.method77();
        }
        var14.method71(var9, var10, var12, arg1, arg0 - 1, var7, this.field1605);
        if (arg4 < 15) {
            this.method782(100);
        }
        if (var11 == 1) {
            var14.method77();
        } else if (var11 == 2) {
            var14.method73();
        } else if (var11 == 3) {
            var14.method78();
        }
        return var14;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILhd;III)Lhd;")
    public final class11 method788(int arg0, class11 arg1, int arg2, int arg3, int arg4) {
        field1609++;
        int var6 = this.field1602[arg2];
        int var7 = this.field1606[arg2];
        class50 var8 = class208.method1454((byte) -113, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg1.method90(true, true, true);
        }
        class50 var10 = null;
        if ((this.field1613 || class305.field4896) && arg4 != -1 && this.field1606.length > arg4) {
            int var11 = this.field1606[arg4];
            var10 = class208.method1454((byte) 63, var11 >> 16);
            arg4 = var11 & 0xFFFF;
        }
        class50 var12 = null;
        int var13 = 0;
        if (arg3 != 11218) {
            this.method788(84, (class11) null, 27, -68, -122);
        }
        int var14 = 0;
        class50 var15 = null;
        if (this.field1590 != null) {
            if (arg2 < this.field1590.length) {
                var14 = this.field1590[arg2];
                if (var14 != 65535) {
                    var12 = class208.method1454((byte) -110, var14 >> 16);
                    var14 &= 0xFFFF;
                }
            }
            if ((this.field1613 || class305.field4896) && arg4 != -1 && this.field1590.length > arg4) {
                var13 = this.field1590[arg4];
                if (var13 != 65535) {
                    var15 = class208.method1454((byte) 83, var13 >> 16);
                    var13 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method416(true, var9);
        boolean var17 = !var8.method415(var9, (byte) 61);
        if (var12 != null) {
            var16 &= !var12.method416(true, var14);
            var17 &= !var12.method415(var14, (byte) 118);
        }
        if (var10 != null) {
            var16 &= !var10.method416(true, arg4);
            var17 &= !var10.method415(arg4, (byte) 57);
        }
        if (var15 != null) {
            var16 &= !var15.method416(true, var13);
            var17 &= !var15.method415(var13, (byte) 78);
        }
        class11 var18 = arg1.method90(var16, var17, !this.field1605);
        var18.method71(var8, var9, var10, arg4, arg0 - 1, var6, this.field1605);
        if (var12 != null) {
            var18.method71(var12, var14, var15, var13, arg0 - 1, var6, this.field1605);
        }
        return var18;
    }
}
