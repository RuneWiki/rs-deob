import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class481 extends class151 {

    @OriginalMember(owner = "client!kn", name = "y", descriptor = "I")
    private int field6761 = 0;

    @OriginalMember(owner = "client!kn", name = "A", descriptor = "Lcp;")
    private class470 field6763 = new class470(16);

    @OriginalMember(owner = "client!kn", name = "I", descriptor = "I")
    private int field6771 = 0;

    @OriginalMember(owner = "client!kn", name = "J", descriptor = "Lkr;")
    private class486 field6772 = new class486();

    @OriginalMember(owner = "client!kn", name = "Q", descriptor = "J")
    private long field6779 = 0L;

    @OriginalMember(owner = "client!kn", name = "E", descriptor = "Lrg;")
    private class420 field6767;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    private int field6749;

    @OriginalMember(owner = "client!kn", name = "O", descriptor = "Z")
    private boolean field6777;

    @OriginalMember(owner = "client!kn", name = "L", descriptor = "Lkr;")
    private class486 field6774;

    @OriginalMember(owner = "client!kn", name = "P", descriptor = "Z")
    private boolean field6778;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "Lrg;")
    private class420 field6752;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "Lci;")
    private class287 field6748;

    @OriginalMember(owner = "client!kn", name = "r", descriptor = "I")
    private int field6754;

    @OriginalMember(owner = "client!kn", name = "s", descriptor = "I")
    private int field6755;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "Lal;")
    private class58 field6746;

    @OriginalMember(owner = "client!kn", name = "t", descriptor = "Lll;")
    private class224 field6756;

    @OriginalMember(owner = "client!kn", name = "z", descriptor = "Ldt;")
    public static class145 field6762 = null;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "Lus;")
    public static class1 field6742 = new class1(58, 2);

    @OriginalMember(owner = "client!kn", name = "G", descriptor = "Lwf;")
    public static class79 field6769 = new class79(26, 3);

    @OriginalMember(owner = "client!kn", name = "M", descriptor = "Z")
    public static boolean field6775 = false;

    @OriginalMember(owner = "client!kn", name = "N", descriptor = "Lku;")
    public static class232 field6776 = new class232(64);

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "I")
    public static int field6753;

    @OriginalMember(owner = "client!kn", name = "u", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!kn", name = "v", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!kn", name = "w", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!kn", name = "x", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!kn", name = "C", descriptor = "I")
    public static int field6765;

    @OriginalMember(owner = "client!kn", name = "D", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!kn", name = "F", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!kn", name = "H", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!kn", name = "S", descriptor = "Lb;")
    public static class201 field6781;

    @OriginalMember(owner = "client!kn", name = "B", descriptor = "Ldg;")
    private class261 field6764;

    @OriginalMember(owner = "client!kn", name = "K", descriptor = "Z")
    private boolean field6773;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "[B")
    private byte[] field6750;

    @OriginalMember(owner = "client!kn", name = "R", descriptor = "[Z")
    public static boolean[] field6780;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)I")
    public final int method2809(byte arg0) {
        field6744++;
        if (this.field6764 == null) {
            return 0;
        }
        if (arg0 != 9) {
            this.field6746 = null;
        }
        if (this.field6777) {
            class238 var2 = this.field6774.method2843(1123227612);
            return var2 == null ? 0 : (int) var2.field3568;
        } else {
            return this.field6764.field3830;
        }
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(B)V")
    public final void method2810(byte arg0) {
        field6751++;
        if (arg0 != 61) {
            method2816(-96, -18);
        }
        if (this.field6767 != null) {
            this.field6773 = true;
            if (this.field6774 == null) {
                this.field6774 = new class486();
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V")
    public final void method2811(int arg0) {
        field6753++;
        int var2 = 45 % ((arg0 - 16) / 52);
        if (this.field6774 != null) {
            if (this.method950((byte) -63) == null) {
                return;
            }
            if (this.field6777) {
                boolean var7 = true;
                for (class238 var8 = this.field6774.method2843(1123227612); var8 != null; var8 = this.field6774.method2842(1673506446)) {
                    int var10 = (int) var8.field3568;
                    if (this.field6750[var10] == 0) {
                        this.method2814(var10, 108, 1);
                    }
                    if (this.field6750[var10] == 0) {
                        var7 = false;
                    } else {
                        var8.method1510((byte) -13);
                    }
                }
                while (this.field6764.field3831.length > this.field6771) {
                    if (this.field6764.field3831[this.field6771] == 0) {
                        this.field6771++;
                    } else {
                        if (this.field6748.field4194 >= 250) {
                            var7 = false;
                            break;
                        }
                        if (this.field6750[this.field6771] == 0) {
                            this.method2814(this.field6771, 47, 1);
                        }
                        if (this.field6750[this.field6771] == 0) {
                            class238 var9 = new class238();
                            var9.field3568 = (long) this.field6771;
                            var7 = false;
                            this.field6774.method2845(var9, (byte) 37);
                        }
                        this.field6771++;
                    }
                }
                if (var7) {
                    this.field6777 = false;
                    this.field6771 = 0;
                }
            } else if (this.field6773) {
                boolean var3 = true;
                for (class238 var4 = this.field6774.method2843(1123227612); var4 != null; var4 = this.field6774.method2842(1673506446)) {
                    int var6 = (int) var4.field3568;
                    if (this.field6750[var6] != 1) {
                        this.method2814(var6, 95, 2);
                    }
                    if (this.field6750[var6] == 1) {
                        var4.method1510((byte) -13);
                    } else {
                        var3 = false;
                    }
                }
                while (this.field6771 < this.field6764.field3831.length) {
                    if (this.field6764.field3831[this.field6771] == 0) {
                        this.field6771++;
                    } else {
                        if (this.field6746.method362(-28)) {
                            var3 = false;
                            break;
                        }
                        if (this.field6750[this.field6771] != 1) {
                            this.method2814(this.field6771, 67, 2);
                        }
                        if (this.field6750[this.field6771] != 1) {
                            class238 var5 = new class238();
                            var5.field3568 = (long) this.field6771;
                            var3 = false;
                            this.field6774.method2845(var5, (byte) 37);
                        }
                        this.field6771++;
                    }
                }
                if (var3) {
                    this.field6771 = 0;
                    this.field6773 = false;
                }
            } else {
                this.field6774 = null;
            }
        }
        if (!this.field6778 || class433.method2562(-2039) < this.field6779) {
            return;
        }
        for (class224 var11 = (class224) this.field6763.method2769((byte) -94); var11 != null; var11 = (class224) this.field6763.method2768((byte) -88)) {
            if (!var11.field3393) {
                if (var11.field3398) {
                    if (!var11.field3397) {
                        throw new RuntimeException();
                    }
                    var11.method1510((byte) -13);
                } else {
                    var11.field3398 = true;
                }
            }
        }
        this.field6779 = class433.method2562(-2039) + 1000L;
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)I")
    public final int method2812(int arg0) {
        field6768++;
        if (this.method950((byte) -63) == null) {
            return this.field6756 == null ? 0 : this.field6756.method288(0);
        } else {
            if (arg0 != 19702) {
                this.field6754 = -33;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZI)[B")
    public final byte[] method949(boolean arg0, int arg1) {
        field6760++;
        class224 var3 = this.method2814(arg1, 80, 0);
        if (var3 == null) {
            return null;
        }
        if (!arg0) {
            this.field6774 = null;
        }
        byte[] var4 = var3.method289((byte) -117);
        var3.method1510((byte) -13);
        return var4;
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)V")
    public static void method2813(int arg0) {
        field6780 = null;
        field6781 = null;
        field6742 = null;
        if (arg0 >= -8) {
            method2813(36);
        }
        field6776 = null;
        field6769 = null;
        field6762 = null;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)Lll;")
    private final class224 method2814(int arg0, int arg1, int arg2) {
        if (arg1 < 35) {
            this.method2817(10);
        }
        field6766++;
        class224 var4 = (class224) this.field6763.method2761((long) arg0, (byte) -112);
        if (var4 != null && arg2 == 0 && !var4.field3397 && var4.field3393) {
            var4.method1510((byte) -13);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field6767 == null || this.field6750[arg0] == -1) {
                    if (this.field6746.method351(15740)) {
                        return null;
                    }
                    var4 = this.field6746.method350(true, arg0, -1, this.field6749, (byte) 2);
                } else {
                    var4 = this.field6748.method1792(this.field6767, arg0, (byte) 8);
                }
            } else if (arg2 == 1) {
                if (this.field6767 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field6748.method1797((byte) -73, arg0, this.field6767);
            } else if (arg2 == 2) {
                if (this.field6767 == null) {
                    throw new RuntimeException();
                }
                if (this.field6750[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field6746.method362(-7)) {
                    return null;
                }
                var4 = this.field6746.method350(false, arg0, -1, this.field6749, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field6763.method2767(-1, (long) arg0, var4);
        }
        if (var4.field3393) {
            return null;
        }
        byte[] var5 = var4.method289((byte) -124);
        if (!var4 instanceof class43) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class142.field1892.reset();
                class142.field1892.update(var5, 0, var5.length - 2);
                int var6 = (int) class142.field1892.getValue();
                if (this.field6764.field3825[arg0] != var6) {
                    throw new RuntimeException();
                }
                this.field6746.field790 = 0;
                this.field6746.field789 = 0;
            } catch (RuntimeException var12) {
                this.field6746.method349((byte) 78);
                var4.method1510((byte) -13);
                if (var4.field3397 && !this.field6746.method351(15740)) {
                    class325 var7 = this.field6746.method350(true, arg0, -1, this.field6749, (byte) 2);
                    this.field6763.method2767(-1, (long) arg0, var7);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field6764.field3816[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field6764.field3816[arg0];
            if (this.field6767 != null) {
                this.field6748.method1795(arg0, var5, this.field6767, false);
                if (this.field6750[arg0] != 1) {
                    this.field6761++;
                    this.field6750[arg0] = 1;
                }
            }
            if (!var4.field3397) {
                var4.method1510((byte) -13);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class142.field1892.reset();
            class142.field1892.update(var5, 0, var5.length - 2);
            int var8 = (int) class142.field1892.getValue();
            if (this.field6764.field3825[arg0] != var8) {
                throw new RuntimeException();
            }
            int var9 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field6764.field3816[arg0] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field6750[arg0] != 1) {
                this.field6761++;
                this.field6750[arg0] = 1;
            }
            if (!var4.field3397) {
                var4.method1510((byte) -13);
            }
            return var4;
        } catch (Exception var11) {
            this.field6750[arg0] = -1;
            var4.method1510((byte) -13);
            if (var4.field3397 && !this.field6746.method351(15740)) {
                class325 var10 = this.field6746.method350(true, arg0, -1, this.field6749, (byte) 2);
                this.field6763.method2767(-1, (long) arg0, var10);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V")
    public final void method2815(boolean arg0) {
        field6758++;
        if (this.field6774 == null || this.method950((byte) -63) == null) {
            return;
        }
        if (arg0) {
            this.method949(true, 61);
        }
        for (class238 var2 = this.field6772.method2843(1123227612); var2 != null; var2 = this.field6772.method2842(1673506446)) {
            int var3 = (int) var2.field3568;
            if (var3 < 0 || this.field6764.field3829 <= var3 || this.field6764.field3831[var3] == 0) {
                var2.method1510((byte) -13);
            } else {
                if (this.field6750[var3] == 0) {
                    this.method2814(var3, 120, 1);
                }
                if (this.field6750[var3] == -1) {
                    this.method2814(var3, 127, 2);
                }
                if (this.field6750[var3] == 1) {
                    var2.method1510((byte) -13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(II)V")
    public final void method951(int arg0, int arg1) {
        if (arg0 != 2) {
            return;
        }
        field6743++;
        if (this.field6767 == null) {
            return;
        }
        for (class238 var3 = this.field6772.method2843(1123227612); var3 != null; var3 = this.field6772.method2842(1673506446)) {
            if ((long) arg1 == var3.field3568) {
                return;
            }
        }
        class238 var4 = new class238();
        var4.field3568 = (long) arg1;
        this.field6772.method2845(var4, (byte) 37);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)I")
    public final int method947(int arg0, int arg1) {
        field6765++;
        class224 var3 = (class224) this.field6763.method2761((long) arg1, (byte) -112);
        if (var3 == null) {
            if (arg0 != 13038) {
                this.method949(false, 54);
            }
            return 0;
        } else {
            return var3.method288(arg0 - 13038);
        }
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(II)Lvt;")
    public static final class182 method2816(int arg0, int arg1) {
        field6747++;
        class182 var2 = (class182) field6776.method1479(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class26.field338.method1257(arg0, 0, 24558);
        class182 var4 = new class182();
        if (var3 != null) {
            var4.method1134(true, new class276(var3));
        }
        var4.method1135(true);
        field6776.method1473(var4, (long) arg0, 5);
        if (arg1 < 81) {
            method2816(33, -111);
        }
        return var4;
    }

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "(I)I")
    public final int method2817(int arg0) {
        int var2 = 47 % ((13 - arg0) / 48);
        field6759++;
        return this.field6761;
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(B)I")
    public final int method2818(byte arg0) {
        if (arg0 != 87) {
            this.method2811(-93);
        }
        field6745++;
        return this.field6764 == null ? 0 : this.field6764.field3830;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)Ldg;")
    public final class261 method950(byte arg0) {
        field6757++;
        if (this.field6764 != null) {
            return this.field6764;
        }
        if (this.field6756 == null) {
            if (this.field6746.method351(arg0 ^ 0xFFFFC2BD)) {
                return null;
            }
            this.field6756 = this.field6746.method350(true, this.field6749, -1, 255, (byte) 0);
        }
        if (this.field6756.field3393) {
            return null;
        } else if (arg0 == -63) {
            byte[] var2 = this.field6756.method289((byte) -108);
            if (this.field6756 instanceof class43) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field6764 = new class261(var2, this.field6755);
                    if (this.field6764.field3823 != this.field6754) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field6764 = null;
                    if (this.field6746.method351(15740)) {
                        this.field6756 = null;
                    } else {
                        this.field6756 = this.field6746.method350(true, this.field6749, -1, 255, (byte) 0);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field6764 = new class261(var2, this.field6755);
                } catch (RuntimeException var4) {
                    this.field6746.method349((byte) 78);
                    this.field6764 = null;
                    if (this.field6746.method351(15740)) {
                        this.field6756 = null;
                    } else {
                        this.field6756 = this.field6746.method350(true, this.field6749, -1, 255, (byte) 0);
                    }
                    return null;
                }
                if (this.field6752 != null) {
                    this.field6748.method1795(this.field6749, var2, this.field6752, false);
                }
            }
            if (this.field6767 != null) {
                this.field6761 = 0;
                this.field6750 = new byte[this.field6764.field3829];
            }
            this.field6756 = null;
            return this.field6764;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(ILrg;Lrg;Lal;Lci;IIZ)V")
    public class481(int arg0, class420 arg1, class420 arg2, class58 arg3, class287 arg4, int arg5, int arg6, boolean arg7) {
        this.field6767 = arg1;
        this.field6749 = arg0;
        if (this.field6767 == null) {
            this.field6777 = false;
        } else {
            this.field6777 = true;
            this.field6774 = new class486();
        }
        this.field6778 = arg7;
        this.field6752 = arg2;
        this.field6748 = arg4;
        this.field6754 = arg6;
        this.field6755 = arg5;
        this.field6746 = arg3;
        if (this.field6752 != null) {
            this.field6756 = this.field6748.method1792(this.field6752, this.field6749, (byte) 8);
        }
    }
}
