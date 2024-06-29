import java.awt.Canvas;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class202 {

    @OriginalMember(owner = "client!po", name = "f", descriptor = "Z")
    private boolean field2710 = false;

    @OriginalMember(owner = "client!po", name = "o", descriptor = "I")
    private int field2719 = 32;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "J")
    private long field2717 = class114.method735(116);

    @OriginalMember(owner = "client!po", name = "y", descriptor = "I")
    private int field2729 = 0;

    @OriginalMember(owner = "client!po", name = "x", descriptor = "I")
    private int field2728 = 0;

    @OriginalMember(owner = "client!po", name = "z", descriptor = "J")
    private long field2730 = 0L;

    @OriginalMember(owner = "client!po", name = "B", descriptor = "I")
    private int field2732 = 0;

    @OriginalMember(owner = "client!po", name = "H", descriptor = "J")
    private long field2738 = 0L;

    @OriginalMember(owner = "client!po", name = "D", descriptor = "I")
    private int field2734 = 0;

    @OriginalMember(owner = "client!po", name = "I", descriptor = "Z")
    private boolean field2739 = true;

    @OriginalMember(owner = "client!po", name = "G", descriptor = "[Lpl;")
    private class446[] field2737 = new class446[8];

    @OriginalMember(owner = "client!po", name = "E", descriptor = "[Lpl;")
    private class446[] field2735 = new class446[8];

    @OriginalMember(owner = "client!po", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2706 = "Loaded textures";

    @OriginalMember(owner = "client!po", name = "j", descriptor = "I")
    public static int field2714 = 0;

    @OriginalMember(owner = "client!po", name = "p", descriptor = "I")
    public static int field2720 = 0;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!po", name = "k", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!po", name = "r", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!po", name = "s", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!po", name = "t", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!po", name = "u", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!po", name = "v", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!po", name = "w", descriptor = "I")
    private int field2727;

    @OriginalMember(owner = "client!po", name = "A", descriptor = "I")
    public int field2731;

    @OriginalMember(owner = "client!po", name = "C", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!po", name = "F", descriptor = "I")
    public int field2736;

    @OriginalMember(owner = "client!po", name = "l", descriptor = "Lpl;")
    private class446 field2716;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2708;

    @OriginalMember(owner = "client!po", name = "n", descriptor = "[I")
    public int[] field2718;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "()I")
    public int method838() throws Exception {
        field2725++;
        return this.field2731;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BIIIII)V")
    public static final void method1195(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class125.field1751 >= arg1 && arg5 >= class379.field5521) {
            boolean var6;
            if (class87.field1227 > arg2) {
                arg2 = class87.field1227;
                var6 = false;
            } else if (arg2 > class299.field4382) {
                arg2 = class299.field4382;
                var6 = false;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg4 < class87.field1227) {
                arg4 = class87.field1227;
                var7 = false;
            } else if (arg4 <= class299.field4382) {
                var7 = true;
            } else {
                var7 = false;
                arg4 = class299.field4382;
            }
            if (arg1 < class379.field5521) {
                arg1 = class379.field5521;
            } else {
                class207.method1221((byte) -128, arg2, arg4, class384.field5560[arg1++], arg3);
            }
            if (class125.field1751 < arg5) {
                arg5 = class125.field1751;
            } else {
                class207.method1221((byte) -122, arg2, arg4, class384.field5560[arg5--], arg3);
            }
            if (var6 && var7) {
                for (int var8 = arg1; var8 <= arg5; var8++) {
                    int[] var9 = class384.field5560[var8];
                    var9[arg2] = var9[arg4] = arg3;
                }
            } else if (var6) {
                for (int var10 = arg1; var10 <= arg5; var10++) {
                    class384.field5560[var10][arg2] = arg3;
                }
            } else if (var7) {
                for (int var11 = arg1; var11 <= arg5; var11++) {
                    class384.field5560[var11][arg4] = arg3;
                }
            }
        }
        if (arg0 == 7) {
            field2715++;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method837(Component arg0) throws Exception {
        field2711++;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
    public final synchronized void method1196(int arg0) {
        this.field2739 = true;
        field2733++;
        try {
            this.method835();
            if (arg0 >= -117) {
                this.field2739 = false;
            }
        } catch (Exception var2) {
            this.method839();
            this.field2730 = class114.method735(121) + 2000L;
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V")
    public static void method1197(int arg0) {
        field2708 = null;
        if (arg0 > 62) {
            field2706 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BLpl;)V")
    public final synchronized void method1198(byte arg0, class446 arg1) {
        if (arg0 >= -55) {
            this.method1201(-77);
        }
        this.field2716 = arg1;
        field2705++;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "()V")
    public void method840() throws Exception {
        field2724++;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lpl;IZ)V")
    private final void method1199(class446 arg0, int arg1, boolean arg2) {
        field2713++;
        if (arg2) {
            return;
        }
        int var4 = arg1 >> 5;
        class446 var5 = this.field2735[var4];
        if (var5 == null) {
            this.field2737[var4] = arg0;
        } else {
            var5.field6545 = arg0;
        }
        this.field2735[var4] = arg0;
        arg0.field6544 = arg1;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III)Z")
    public static final boolean method1200(int arg0, int arg1, int arg2) {
        int var3 = class246.field3324[arg0][arg1][arg2];
        if (-class291.field4165 == var3) {
            return false;
        } else if (class291.field4165 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class225.method1300(var4 + 1, class12.field205[arg0].method742(arg1, arg2), var5 + 1) && class225.method1300(var4 + 128 - 1, class12.field205[arg0].method742(arg1 + 1, arg2), var5 + 1) && class225.method1300(var4 + 128 - 1, class12.field205[arg0].method742(arg1 + 1, arg2 + 1), var5 + 128 - 1) && class225.method1300(var4 + 1, class12.field205[arg0].method742(arg1, arg2 + 1), var5 + 128 - 1)) {
                class246.field3324[arg0][arg1][arg2] = class291.field4165;
                return true;
            } else {
                class246.field3324[arg0][arg1][arg2] = -class291.field4165;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V")
    public final synchronized void method1201(int arg0) {
        field2722++;
        if (this.field2710) {
            return;
        }
        long var2 = class114.method735(122);
        try {
            if (var2 > this.field2717 + 500000L) {
                this.field2717 = var2 - 500000L;
            }
            while ((this.field2717 + 5000L) < var2) {
                this.method1204((byte) -112, 256);
                this.field2717 += (long) (256000 / class9.field153);
            }
        } catch (Exception var7) {
            this.field2717 = var2;
        }
        if (this.field2718 == null) {
            return;
        }
        try {
            if (this.field2730 != 0L) {
                if (this.field2730 > var2) {
                    return;
                }
                this.method836(this.field2731);
                this.field2739 = true;
                this.field2730 = 0L;
            }
            int var4 = this.method838();
            if ((this.field2729 - var4) > this.field2732) {
                this.field2732 = this.field2729 - var4;
            }
            int var5 = this.field2736 + this.field2727;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field2731 < var5 + 256) {
                this.field2731 += 1024;
                if (this.field2731 > 16384) {
                    this.field2731 = 16384;
                }
                this.method839();
                var4 = 0;
                this.method836(this.field2731);
                this.field2739 = true;
                if ((var5 + 256) > this.field2731) {
                    var5 = this.field2731 - 256;
                    this.field2727 = var5 - this.field2736;
                }
            }
            while (var5 > var4) {
                this.method1202(this.field2718, 256);
                var4 += 256;
                this.method840();
            }
            if (this.field2738 < var2) {
                if (this.field2739) {
                    this.field2739 = false;
                } else if (this.field2732 == 0 && this.field2728 == 0) {
                    this.method839();
                    this.field2730 = var2 + 2000L;
                    return;
                } else {
                    this.field2727 = Math.min(this.field2728, this.field2732);
                    this.field2728 = this.field2732;
                }
                this.field2738 = var2 + 2000L;
                this.field2732 = 0;
            }
            if (arg0 != 5426) {
                method1197(49);
            }
            this.field2729 = var4;
        } catch (Exception var6) {
            this.method839();
            this.field2730 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(I)V")
    public void method836(int arg0) throws Exception {
        field2707++;
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "()V")
    public void method839() {
        field2709++;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "([II)V")
    private final void method1202(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class407.field6043) {
            var3 = arg1 << 1;
        }
        class60.method423(arg0, 0, var3);
        this.field2734 -= arg1;
        if (this.field2716 != null && this.field2734 <= 0) {
            this.field2734 += class9.field153 >> 4;
            class364.method2380(this.field2716, 53);
            this.method1199(this.field2716, this.field2716.method875(), false);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class446 var10 = null;
                        class446 var11 = this.field2737[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class49 var12 = var11.field6542;
                                if (var12 == null || var12.field682 <= var8) {
                                    var11.field6543 = true;
                                    int var13 = var11.method490();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field682 += var13;
                                    }
                                    if (var4 >= this.field2719) {
                                        break label107;
                                    }
                                    class446 var14 = var11.method501();
                                    if (var14 != null) {
                                        int var15 = var11.field6544;
                                        while (var14 != null) {
                                            this.method1199(var14, var15 * var14.method875() >> 8, false);
                                            var14 = var11.method469();
                                        }
                                    }
                                    class446 var16 = var11.field6545;
                                    var11.field6545 = null;
                                    if (var10 == null) {
                                        this.field2737[var7] = var16;
                                    } else {
                                        var10.field6545 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2735[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field6545;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class446 var18 = this.field2737[var17];
                this.field2737[var17] = this.field2735[var17] = null;
                while (var18 != null) {
                    class446 var19 = var18.field6545;
                    var18.field6545 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2734 < 0) {
            this.field2734 = 0;
        }
        if (this.field2716 != null) {
            this.field2716.method495(arg0, 0, arg1);
        }
        this.field2717 = class114.method735(110);
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "()V")
    public void method835() throws Exception {
        field2723++;
    }

    @OriginalMember(owner = "client!po", name = "e", descriptor = "(I)V")
    public final void method1203(int arg0) {
        field2712++;
        this.field2739 = true;
        if (arg0 != 500000) {
            this.field2718 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BI)V")
    private final void method1204(byte arg0, int arg1) {
        field2726++;
        this.field2734 -= arg1;
        if (this.field2734 < 0) {
            this.field2734 = 0;
        }
        if (this.field2716 != null) {
            this.field2716.method470(arg1);
        }
        if (arg0 > -99) {
            this.method1202((int[]) null, 81);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V")
    public final synchronized void method1205(byte arg0) {
        if (class278.field4053 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class278.field4053.field5967[var3] == this) {
                    class278.field4053.field5967[var3] = null;
                }
                if (class278.field4053.field5967[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class278.field4053.field5963 = true;
                while (class278.field4053.field5964) {
                    class144.method918(50L, true);
                }
                class278.field4053 = null;
            }
        }
        field2721++;
        this.method839();
        if (arg0 <= 72) {
            this.field2739 = true;
        }
        this.field2710 = true;
        this.field2718 = null;
    }
}
