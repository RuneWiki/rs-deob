import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class272 extends class89 {

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    private int field4792 = 0;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "Lwd;")
    private class97 field4803 = new class97(16);

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "I")
    private int field4814 = 0;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "Lef;")
    private class175 field4813 = new class175();

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "J")
    private long field4817 = 0L;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    private int field4791;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "Lr;")
    private class59 field4808;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "Z")
    private boolean field4815;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "Lef;")
    private class175 field4816;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "Lr;")
    private class59 field4809;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "Lrg;")
    private class236 field4790;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "I")
    private int field4806;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    private int field4811;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "Lea;")
    private class200 field4797;

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "Z")
    private boolean field4818;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "Lck;")
    private class235 field4793;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "Le;")
    private static class191 field4802 = class54.method368("Loaded config", 2047);

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "Le;")
    public static class191 field4788 = field4802;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "Llh;")
    private class188 field4796;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "Z")
    private boolean field4812;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "[B")
    private byte[] field4810;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)Llh;")
    public final class188 method540(int arg0) {
        field4795++;
        if (this.field4796 != null) {
            return this.field4796;
        }
        if (this.field4793 == null) {
            if (this.field4797.method1405(-64)) {
                return null;
            }
            this.field4793 = this.field4797.method1396(true, this.field4791, 255, (byte) 0, false);
        }
        if (this.field4793.field4183) {
            return null;
        }
        byte[] var2 = this.field4793.method77(-15219);
        if (this.field4793 instanceof class178) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4796 = new class188(var2, this.field4806);
                if (this.field4796.field3320 != this.field4811) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field4796 = null;
                if (this.field4797.method1405(-119)) {
                    this.field4793 = null;
                } else {
                    this.field4793 = this.field4797.method1396(true, this.field4791, 255, (byte) 0, false);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4796 = new class188(var2, this.field4806);
            } catch (RuntimeException var4) {
                this.field4797.method1399((byte) -105);
                this.field4796 = null;
                if (this.field4797.method1405(-95)) {
                    this.field4793 = null;
                } else {
                    this.field4793 = this.field4797.method1396(true, this.field4791, 255, (byte) 0, false);
                }
                return null;
            }
            if (this.field4809 != null) {
                this.field4790.method1667(var2, this.field4809, 2, this.field4791);
            }
        }
        if (this.field4808 != null) {
            this.field4810 = new byte[this.field4796.field3316];
            this.field4792 = 0;
        }
        if (arg0 > -122) {
            return null;
        } else {
            this.field4793 = null;
            return this.field4796;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)I")
    public final int method1853(boolean arg0) {
        if (!arg0) {
            return -41;
        }
        field4804++;
        if (this.field4796 == null) {
            return 0;
        } else if (this.field4815) {
            class104 var2 = this.field4816.method1173(115);
            return var2 == null ? 0 : (int) var2.field1713;
        } else {
            return this.field4796.field3307;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIB)Lck;")
    private final class235 method1854(int arg0, int arg1, byte arg2) {
        field4794++;
        class235 var4 = (class235) this.field4803.method612((long) arg1, true);
        if (var4 != null && arg0 == 0 && !var4.field4178 && var4.field4183) {
            var4.method655(63);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field4808 == null || this.field4810[arg1] == -1) {
                    if (this.field4797.method1405(arg2 - 225)) {
                        return null;
                    }
                    var4 = this.field4797.method1396(true, arg1, this.field4791, (byte) 2, false);
                } else {
                    var4 = this.field4790.method1663(-3, arg1, this.field4808);
                }
            } else if (arg0 == 1) {
                if (this.field4808 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field4790.method1666(this.field4808, arg1, false);
            } else if (arg0 == 2) {
                if (this.field4808 == null) {
                    throw new RuntimeException();
                }
                if (this.field4810[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4797.method1403((byte) -105)) {
                    return null;
                }
                var4 = this.field4797.method1396(false, arg1, this.field4791, (byte) 2, false);
            } else {
                throw new RuntimeException();
            }
            this.field4803.method605((long) arg1, -3, var4);
        }
        if (var4.field4183) {
            return null;
        }
        byte[] var5 = var4.method77(arg2 - 15319);
        if (arg2 != 100) {
            this.field4811 = -23;
        }
        if (!var4 instanceof class178) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class100.field1592.reset();
                class100.field1592.update(var5, 0, var5.length - 2);
                int var9 = (int) class100.field1592.getValue();
                if (this.field4796.field3310[arg1] != var9) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var12) {
                this.field4797.method1399((byte) -105);
                var4.method655(63);
                if (var4.field4178 && !this.field4797.method1405(arg2 - 185)) {
                    class11 var10 = this.field4797.method1396(true, arg1, this.field4791, (byte) 2, false);
                    this.field4803.method605((long) arg1, arg2 - 103, var10);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field4796.field3312[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field4796.field3312[arg1];
            if (this.field4808 != null) {
                this.field4790.method1667(var5, this.field4808, 2, arg1);
                if (this.field4810[arg1] != 1) {
                    this.field4792++;
                    this.field4810[arg1] = 1;
                }
            }
            if (!var4.field4178) {
                var4.method655(63);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class100.field1592.reset();
            class100.field1592.update(var5, 0, var5.length - 2);
            int var6 = (int) class100.field1592.getValue();
            if (this.field4796.field3310[arg1] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field4796.field3312[arg1] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field4810[arg1] != 1) {
                this.field4792++;
                this.field4810[arg1] = 1;
            }
            if (!var4.field4178) {
                var4.method655(63);
            }
            return var4;
        } catch (Exception var11) {
            this.field4810[arg1] = -1;
            var4.method655(arg2 - 37);
            if (var4.field4178 && !this.field4797.method1405(-122)) {
                class11 var8 = this.field4797.method1396(true, arg1, this.field4791, (byte) 2, false);
                this.field4803.method605((long) arg1, -3, var8);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
    public static void method1855(int arg0) {
        int var1 = 83 / ((62 - arg0) / 42);
        field4802 = null;
        field4788 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)V")
    public final void method536(int arg0, int arg1) {
        field4786++;
        if (this.field4808 == null) {
            return;
        }
        for (class104 var3 = this.field4813.method1173(48); var3 != null; var3 = this.field4813.method1175(-1)) {
            if ((long) arg0 == var3.field1713) {
                return;
            }
        }
        class104 var4 = new class104();
        if (arg1 > -82) {
            this.method1862(-11);
        }
        var4.field1713 = (long) arg0;
        this.field4813.method1176(var4, (byte) 38);
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)I")
    public final int method1856(int arg0) {
        field4789++;
        int var2 = -109 / ((-arg0 - 56) / 60);
        return this.field4796 == null ? 0 : this.field4796.field3307;
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)V")
    public final void method1857(int arg0) {
        field4799++;
        if (arg0 != 0) {
            this.field4791 = -107;
        }
        if (this.field4808 != null) {
            this.field4812 = true;
            if (this.field4816 == null) {
                this.field4816 = new class175();
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public final void method1858(byte arg0) {
        field4787++;
        if (this.field4816 == null || this.method540(-128) == null) {
            return;
        }
        if (arg0 != 1) {
            this.method1862(96);
        }
        for (class104 var2 = this.field4813.method1173(75); var2 != null; var2 = this.field4813.method1175(-1)) {
            int var3 = (int) var2.field1713;
            if (var3 < 0 || this.field4796.field3316 <= var3 || this.field4796.field3308[var3] == 0) {
                var2.method655(63);
            } else {
                if (this.field4810[var3] == 0) {
                    this.method1854(1, var3, (byte) 100);
                }
                if (this.field4810[var3] == -1) {
                    this.method1854(2, var3, (byte) 100);
                }
                if (this.field4810[var3] == 1) {
                    var2.method655(63);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)[B")
    public final byte[] method537(int arg0, int arg1) {
        field4800++;
        class235 var3 = this.method1854(0, arg1, (byte) 100);
        if (var3 == null) {
            return null;
        }
        if (arg0 > -79) {
            this.field4797 = null;
        }
        byte[] var4 = var3.method77(-15219);
        var3.method655(63);
        return var4;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)I")
    public final int method1859(byte arg0) {
        int var2 = -113 % ((5 - arg0) / 52);
        field4807++;
        return this.field4792;
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V")
    public final void method1860(int arg0) {
        field4801++;
        if (this.field4816 != null) {
            if (this.method540(-124) == null) {
                return;
            }
            if (this.field4815) {
                boolean var2 = true;
                for (class104 var3 = this.field4816.method1173(14); var3 != null; var3 = this.field4816.method1175(-1)) {
                    int var5 = (int) var3.field1713;
                    if (this.field4810[var5] == 0) {
                        this.method1854(1, var5, (byte) 100);
                    }
                    if (this.field4810[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method655(63);
                    }
                }
                while (this.field4796.field3308.length > this.field4814) {
                    if (this.field4796.field3308[this.field4814] == 0) {
                        this.field4814++;
                    } else {
                        if (this.field4790.field4217 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field4810[this.field4814] == 0) {
                            this.method1854(1, this.field4814, (byte) 100);
                        }
                        if (this.field4810[this.field4814] == 0) {
                            class104 var4 = new class104();
                            var4.field1713 = (long) this.field4814;
                            this.field4816.method1176(var4, (byte) 38);
                            var2 = false;
                        }
                        this.field4814++;
                    }
                }
                if (var2) {
                    this.field4815 = false;
                    this.field4814 = 0;
                }
            } else if (this.field4812) {
                boolean var6 = true;
                for (class104 var7 = this.field4816.method1173(103); var7 != null; var7 = this.field4816.method1175(-1)) {
                    int var9 = (int) var7.field1713;
                    if (this.field4810[var9] != 1) {
                        this.method1854(2, var9, (byte) 100);
                    }
                    if (this.field4810[var9] == 1) {
                        var7.method655(63);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field4814 < this.field4796.field3308.length) {
                    if (this.field4796.field3308[this.field4814] == 0) {
                        this.field4814++;
                    } else {
                        if (this.field4797.method1403((byte) -124)) {
                            var6 = false;
                            break;
                        }
                        if (this.field4810[this.field4814] != 1) {
                            this.method1854(2, this.field4814, (byte) 100);
                        }
                        if (this.field4810[this.field4814] != 1) {
                            var6 = false;
                            class104 var8 = new class104();
                            var8.field1713 = (long) this.field4814;
                            this.field4816.method1176(var8, (byte) 38);
                        }
                        this.field4814++;
                    }
                }
                if (var6) {
                    this.field4812 = false;
                    this.field4814 = 0;
                }
            } else {
                this.field4816 = null;
            }
        }
        if (this.field4818 && this.field4817 <= class27.method198((byte) -113)) {
            for (class235 var10 = (class235) this.field4803.method609(false); var10 != null; var10 = (class235) this.field4803.method610(109)) {
                if (!var10.field4183) {
                    if (var10.field4188) {
                        if (!var10.field4178) {
                            throw new RuntimeException();
                        }
                        var10.method655(63);
                    } else {
                        var10.field4188 = true;
                    }
                }
            }
            this.field4817 = class27.method198((byte) -126) + 1000L;
        }
        if (arg0 != -666090616) {
            this.method536(45, -91);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Leg;IIBI)V")
    public static final void method1861(class33 arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class267.field4726 < 3) {
            ((class155) class9.field98).method590(arg1, arg2, arg0.field537, arg0.field561, class9.field98.field4075 / 2, class9.field98.field4073 / 2, class65.field1138, 256, arg0.field492, arg0.field566);
        } else {
            class7.method36(arg1, arg2, 0, arg0.field492, arg0.field566);
        }
        class87.field1428[arg4] = true;
        field4805++;
        if (arg3 >= -36) {
            method1861((class33) null, 83, 43, (byte) 122, -62);
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(II)I")
    public final int method539(int arg0, int arg1) {
        field4798++;
        if (arg0 == -421) {
            class235 var3 = (class235) this.field4803.method612((long) arg1, true);
            return var3 == null ? 0 : var3.method80(122);
        } else {
            return 50;
        }
    }

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)I")
    public final int method1862(int arg0) {
        field4785++;
        if (arg0 != -1) {
            return 105;
        } else if (this.method540(-123) == null) {
            return this.field4793 == null ? 0 : this.field4793.method80(92);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(ILr;Lr;Lea;Lrg;IIZ)V")
    public class272(int arg0, class59 arg1, class59 arg2, class200 arg3, class236 arg4, int arg5, int arg6, boolean arg7) {
        this.field4791 = arg0;
        this.field4808 = arg1;
        if (this.field4808 == null) {
            this.field4815 = false;
        } else {
            this.field4815 = true;
            this.field4816 = new class175();
        }
        this.field4809 = arg2;
        this.field4790 = arg4;
        this.field4806 = arg5;
        this.field4811 = arg6;
        this.field4797 = arg3;
        this.field4818 = arg7;
        if (this.field4809 != null) {
            this.field4793 = this.field4790.method1663(-3, this.field4791, this.field4809);
        }
    }
}
