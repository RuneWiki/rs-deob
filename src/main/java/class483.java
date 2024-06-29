import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class483 extends class157 {

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    private int field6814 = 0;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Lwb;")
    private class45 field6815 = new class45(16);

    @OriginalMember(owner = "client!p", name = "I", descriptor = "I")
    private int field6841 = 0;

    @OriginalMember(owner = "client!p", name = "J", descriptor = "Lvf;")
    private class166 field6842 = new class166();

    @OriginalMember(owner = "client!p", name = "N", descriptor = "J")
    private long field6846 = 0L;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    private int field6826;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "Lhc;")
    private class398 field6829;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "Z")
    private boolean field6843;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "Lvf;")
    private class166 field6845;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "Z")
    private boolean field6847;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Ltt;")
    private class403 field6818;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "Lhc;")
    private class398 field6832;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "Lua;")
    private class188 field6839;

    @OriginalMember(owner = "client!p", name = "H", descriptor = "I")
    private int field6840;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    private int field6822;

    @OriginalMember(owner = "client!p", name = "A", descriptor = "Lsi;")
    private class344 field6833;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Z")
    public static boolean field6816 = true;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field6824 = 0;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "J")
    public static long field6831 = 0L;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field6821;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!p", name = "B", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!p", name = "C", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!p", name = "D", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!p", name = "E", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!p", name = "F", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "Lup;")
    private class479 field6830;

    @OriginalMember(owner = "client!p", name = "L", descriptor = "Z")
    private boolean field6844;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "[B")
    private byte[] field6817;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)I")
    public final int method2847(byte arg0) {
        field6821++;
        if (this.field6830 == null) {
            return 0;
        } else if (arg0 == 1) {
            return this.field6830.field6769;
        } else {
            return 8;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    public final void method2848(int arg0) {
        field6834++;
        if (this.field6845 == null || this.method758((byte) -34) == null) {
            return;
        }
        if (arg0 < 56) {
            this.field6844 = false;
        }
        for (class147 var2 = this.field6842.method802((byte) 121); var2 != null; var2 = this.field6842.method806((byte) 104)) {
            int var3 = (int) var2.field1776;
            if (var3 < 0 || var3 >= this.field6830.field6783 || this.field6830.field6787[var3] == 0) {
                var2.method702((byte) -114);
            } else {
                if (this.field6817[var3] == 0) {
                    this.method2856((byte) -110, 1, var3);
                }
                if (this.field6817[var3] == -1) {
                    this.method2856((byte) -119, 2, var3);
                }
                if (this.field6817[var3] == 1) {
                    var2.method702((byte) -114);
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(B)I")
    public final int method2849(byte arg0) {
        field6835++;
        if (arg0 <= 80) {
            this.method756(-70, -25);
        }
        if (this.method758((byte) -34) == null) {
            return this.field6833 == null ? 0 : this.field6833.method295(5);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
    public final void method2850(int arg0) {
        field6836++;
        if (this.field6845 != null) {
            if (this.method758((byte) -34) == null) {
                return;
            }
            if (this.field6843) {
                boolean var6 = true;
                for (class147 var7 = this.field6845.method802((byte) 102); var7 != null; var7 = this.field6845.method806((byte) 104)) {
                    int var9 = (int) var7.field1776;
                    if (this.field6817[var9] == 0) {
                        this.method2856((byte) -100, 1, var9);
                    }
                    if (this.field6817[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method702((byte) -114);
                    }
                }
                while (this.field6841 < this.field6830.field6787.length) {
                    if (this.field6830.field6787[this.field6841] == 0) {
                        this.field6841++;
                    } else {
                        if (this.field6818.field5737 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field6817[this.field6841] == 0) {
                            this.method2856((byte) -72, 1, this.field6841);
                        }
                        if (this.field6817[this.field6841] == 0) {
                            class147 var8 = new class147();
                            var8.field1776 = (long) this.field6841;
                            this.field6845.method803(var8, 50);
                            var6 = false;
                        }
                        this.field6841++;
                    }
                }
                if (var6) {
                    this.field6841 = 0;
                    this.field6843 = false;
                }
            } else if (this.field6844) {
                boolean var2 = true;
                for (class147 var3 = this.field6845.method802((byte) 104); var3 != null; var3 = this.field6845.method806((byte) 104)) {
                    int var5 = (int) var3.field1776;
                    if (this.field6817[var5] != 1) {
                        this.method2856((byte) -90, 2, var5);
                    }
                    if (this.field6817[var5] == 1) {
                        var3.method702((byte) -114);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field6830.field6787.length > this.field6841) {
                    if (this.field6830.field6787[this.field6841] == 0) {
                        this.field6841++;
                    } else {
                        if (this.field6839.method1028(1)) {
                            var2 = false;
                            break;
                        }
                        if (this.field6817[this.field6841] != 1) {
                            this.method2856((byte) -33, 2, this.field6841);
                        }
                        if (this.field6817[this.field6841] != 1) {
                            class147 var4 = new class147();
                            var4.field1776 = (long) this.field6841;
                            this.field6845.method803(var4, arg0 ^ 0xFFFFA8F8);
                            var2 = false;
                        }
                        this.field6841++;
                    }
                }
                if (var2) {
                    this.field6844 = false;
                    this.field6841 = 0;
                }
            } else {
                this.field6845 = null;
            }
        }
        if (arg0 != -22326) {
            this.field6842 = null;
        }
        if (!this.field6847 || this.field6846 > class434.method2591(-19310)) {
            return;
        }
        for (class344 var10 = (class344) this.field6815.method241(0); var10 != null; var10 = (class344) this.field6815.method239(0)) {
            if (!var10.field4927) {
                if (var10.field4923) {
                    if (!var10.field4921) {
                        throw new RuntimeException();
                    }
                    var10.method702((byte) -114);
                } else {
                    var10.field4923 = true;
                }
            }
        }
        this.field6846 = class434.method2591(-19310) + 1000L;
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)I")
    public final int method2851(int arg0) {
        field6828++;
        if (this.field6830 == null) {
            return 0;
        } else if (!this.field6843) {
            return this.field6830.field6769;
        } else if (arg0 == 20752) {
            class147 var2 = this.field6845.method802((byte) 121);
            return var2 == null ? 0 : (int) var2.field1776;
        } else {
            return -19;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)Lup;")
    public final class479 method758(byte arg0) {
        field6819++;
        if (this.field6830 != null) {
            return this.field6830;
        }
        if (this.field6833 == null) {
            if (this.field6839.method1024(arg0 + 42)) {
                return null;
            }
            this.field6833 = this.field6839.method1033((byte) 0, 255, 0, this.field6826, true);
        }
        if (this.field6833.field4927) {
            return null;
        }
        byte[] var2 = this.field6833.method294((byte) 3);
        if (arg0 != -34) {
            return null;
        }
        if (this.field6833 instanceof class79) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field6830 = new class479(var2, this.field6822);
                if (this.field6830.field6779 != this.field6840) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field6830 = null;
                if (this.field6839.method1024(8)) {
                    this.field6833 = null;
                } else {
                    this.field6833 = this.field6839.method1033((byte) 0, 255, 0, this.field6826, true);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field6830 = new class479(var2, this.field6822);
            } catch (RuntimeException var4) {
                this.field6839.method1027(arg0 ^ 0xFFFFAFA5);
                this.field6830 = null;
                if (this.field6839.method1024(8)) {
                    this.field6833 = null;
                } else {
                    this.field6833 = this.field6839.method1033((byte) 0, 255, 0, this.field6826, true);
                }
                return null;
            }
            if (this.field6832 != null) {
                this.field6818.method2410(this.field6832, var2, this.field6826, (byte) 46);
            }
        }
        this.field6833 = null;
        if (this.field6829 != null) {
            this.field6817 = new byte[this.field6830.field6783];
            this.field6814 = 0;
        }
        return this.field6830;
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(I)I")
    public final int method2852(int arg0) {
        if (arg0 == 0) {
            field6823++;
            return this.field6814;
        } else {
            return 82;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)[B")
    public final byte[] method759(int arg0, int arg1) {
        field6827++;
        if (arg1 != -28677) {
            return null;
        }
        class344 var3 = this.method2856((byte) -18, 0, arg0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method294((byte) 21);
            var3.method702((byte) -114);
            return var4;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)I")
    public final int method756(int arg0, int arg1) {
        field6838++;
        if (arg0 <= 112) {
            this.field6814 = 21;
        }
        class344 var3 = (class344) this.field6815.method233(100, (long) arg1);
        return var3 == null ? 0 : var3.method295(5);
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(II)V")
    public final void method760(int arg0, int arg1) {
        field6820++;
        if (this.field6829 == null) {
            return;
        }
        class147 var3 = this.field6842.method802((byte) 106);
        if (arg0 != 255) {
            return;
        }
        while (var3 != null) {
            if (((long) arg1) == var3.field1776) {
                return;
            }
            var3 = this.field6842.method806((byte) 104);
        }
        class147 var4 = new class147();
        var4.field1776 = (long) arg1;
        this.field6842.method803(var4, arg0 ^ 0xCD);
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(II)I")
    public static final int method2853(int arg0, int arg1) {
        return class3.field24 == null ? 0 : class3.field24[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(B)V")
    public final void method2854(byte arg0) {
        field6825++;
        if (this.field6829 == null) {
            return;
        }
        if (arg0 != -37) {
            method2855((class83) null);
        }
        this.field6844 = true;
        if (this.field6845 == null) {
            this.field6845 = new class166();
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lmt;)V")
    public static final void method2855(class83 arg0) {
        for (int var1 = arg0.field999; var1 <= arg0.field1011; var1++) {
            for (int var2 = arg0.field1004; var2 <= arg0.field997; var2++) {
                class263 var3 = class293.field4356[arg0.field994][var1][var2];
                if (var3 != null) {
                    class248 var4 = var3.field3801;
                    class248 var5 = null;
                    while (var4 != null) {
                        if (var4.field3487 == arg0) {
                            if (var5 == null) {
                                var3.field3801 = var4.field3490;
                            } else {
                                var5.field3490 = var4.field3490;
                            }
                            var4.method1510((byte) 84);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field3490;
                    }
                    var3.field3802 = 0;
                    for (class248 var6 = var3.field3801; var6 != null; var6 = var6.field3490) {
                        var3.field3802 = (byte) (var3.field3802 | var6.field3488);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BII)Lsi;")
    private final class344 method2856(byte arg0, int arg1, int arg2) {
        field6837++;
        class344 var4 = (class344) this.field6815.method233(-72, (long) arg2);
        if (var4 != null && arg1 == 0 && !var4.field4921 && var4.field4927) {
            var4.method702((byte) -114);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field6829 == null || this.field6817[arg2] == -1) {
                    if (this.field6839.method1024(8)) {
                        return null;
                    }
                    var4 = this.field6839.method1033((byte) 2, this.field6826, 0, arg2, true);
                } else {
                    var4 = this.field6818.method2408(false, this.field6829, arg2);
                }
            } else if (arg1 == 1) {
                if (this.field6829 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field6818.method2407(10722, arg2, this.field6829);
            } else if (arg1 == 2) {
                if (this.field6829 == null) {
                    throw new RuntimeException();
                }
                if (this.field6817[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field6839.method1028(1)) {
                    return null;
                }
                var4 = this.field6839.method1033((byte) 2, this.field6826, 0, arg2, false);
            } else {
                throw new RuntimeException();
            }
            this.field6815.method234(-56, (long) arg2, var4);
        }
        if (var4.field4927) {
            return null;
        }
        if (arg0 > -16) {
            this.method2854((byte) -53);
        }
        byte[] var5 = var4.method294((byte) 40);
        if (!var4 instanceof class79) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class368.field5266.reset();
                class368.field5266.update(var5, 0, var5.length - 2);
                int var9 = (int) class368.field5266.getValue();
                if (this.field6830.field6777[arg2] != var9) {
                    throw new RuntimeException();
                }
                this.field6839.field2570 = 0;
                this.field6839.field2567 = 0;
            } catch (RuntimeException var12) {
                this.field6839.method1027(20603);
                var4.method702((byte) -114);
                if (var4.field4921 && !this.field6839.method1024(8)) {
                    class57 var10 = this.field6839.method1033((byte) 2, this.field6826, 0, arg2, true);
                    this.field6815.method234(-61, (long) arg2, var10);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field6830.field6776[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field6830.field6776[arg2];
            if (this.field6829 != null) {
                this.field6818.method2410(this.field6829, var5, arg2, (byte) 46);
                if (this.field6817[arg2] != 1) {
                    this.field6814++;
                    this.field6817[arg2] = 1;
                }
            }
            if (!var4.field4921) {
                var4.method702((byte) -114);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class368.field5266.reset();
            class368.field5266.update(var5, 0, var5.length - 2);
            int var6 = (int) class368.field5266.getValue();
            if (this.field6830.field6777[arg2] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field6830.field6776[arg2] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field6817[arg2] != 1) {
                this.field6814++;
                this.field6817[arg2] = 1;
            }
            if (!var4.field4921) {
                var4.method702((byte) -114);
            }
            return var4;
        } catch (Exception var11) {
            this.field6817[arg2] = -1;
            var4.method702((byte) -114);
            if (var4.field4921 && !this.field6839.method1024(8)) {
                class57 var8 = this.field6839.method1033((byte) 2, this.field6826, 0, arg2, true);
                this.field6815.method234(-50, (long) arg2, var8);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(ILhc;Lhc;Lua;Ltt;IIZ)V")
    public class483(int arg0, class398 arg1, class398 arg2, class188 arg3, class403 arg4, int arg5, int arg6, boolean arg7) {
        this.field6826 = arg0;
        this.field6829 = arg1;
        if (this.field6829 == null) {
            this.field6843 = false;
        } else {
            this.field6843 = true;
            this.field6845 = new class166();
        }
        this.field6847 = arg7;
        this.field6818 = arg4;
        this.field6832 = arg2;
        this.field6839 = arg3;
        this.field6840 = arg6;
        this.field6822 = arg5;
        if (this.field6832 != null) {
            this.field6833 = this.field6818.method2408(false, this.field6832, this.field6826);
        }
    }
}
