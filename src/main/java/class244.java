import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class244 extends class68 {

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
    public int field4138;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public int field4126;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public int field4129;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
    public int field4131;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
    public static int field4130 = 0;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "Lce;")
    public static class126 field4124 = class206.method1445(-7923, "Hidden)2use");

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "[[I")
    public static int[][] field4127 = new int[104][104];

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "Lce;")
    public static class126 field4137 = class206.method1445(-7923, "1");

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "Lce;")
    private static class126 field4139 = class206.method1445(-7923, "Connecting to update server");

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    public static int field4135 = 0;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "Lce;")
    public static class126 field4125 = field4139;

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "I")
    public static int field4141 = 0;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/util/Random;BI)I", line = 5)
    public static final int method1675(Random arg0, byte arg1, int arg2) {
        field4132++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (arg1 != 110) {
            return -48;
        } else if (class169.method1240(arg2, (byte) -74)) {
            return (int) ((long) arg2 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var3 <= var4);
            return class73.method529(arg2, var4, -1259236833);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)Z", line = 39)
    public final boolean method1676(int arg0, int arg1, int arg2) {
        field4140++;
        if (arg2 >= -93) {
            field4125 = (class126) null;
        }
        return arg1 >= this.field4126 && arg1 <= this.field4129 && arg0 >= this.field4138 && this.field4131 >= arg0;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)I", line = 58)
    public static final int method1677(int arg0, int arg1, int arg2) {
        field4128++;
        if (arg2 != -25815) {
            field4137 = (class126) null;
        }
        int var3 = class116.method761(arg0 - 1, (byte) 124, arg1 - 1) + class116.method761(arg0 - 1, (byte) -72, arg1 + 1) + class116.method761(arg0 + 1, (byte) -98, arg1 + -1) + class116.method761(arg0 + 1, (byte) 40, arg1 + 1);
        int var4 = class116.method761(arg0, (byte) -84, arg1 - 1) + class116.method761(arg0, (byte) 77, arg1 + 1) + class116.method761(arg0 - 1, (byte) -121, arg1) + class116.method761(arg0 + 1, (byte) 117, arg1);
        int var5 = class116.method761(arg0, (byte) 35, arg1);
        return var3 / 16 + var5 / 4 + (var4 / 8);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V", line = 75)
    public static void method1678(int arg0) {
        field4124 = null;
        field4139 = null;
        field4127 = (int[][]) null;
        field4137 = null;
        if (arg0 >= -104) {
            method1679((byte) -20);
        }
        field4125 = null;
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(B)V", line = 90)
    public static final void method1679(byte arg0) {
        field4123++;
        if (!class56.field846 || class116.field1952) {
            return;
        }
        class5[][][] var1 = class297.field4940;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class5[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class5 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field52 != null && var6.field52.field103 instanceof class62) {
                            class62 var7 = (class62) var6.field52.field103;
                            if ((Long.MIN_VALUE & var6.field52.field101) == 0L) {
                                var7.method439(false, true, true, true, false, true, true);
                            } else {
                                var7.method439(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field49 != null) {
                            if (var6.field49.field1684 instanceof class62) {
                                class62 var8 = (class62) var6.field49.field1684;
                                if ((Long.MIN_VALUE & var6.field49.field1678) == 0L) {
                                    var8.method439(false, true, true, true, false, true, true);
                                } else {
                                    var8.method439(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field49.field1683 instanceof class62) {
                                class62 var9 = (class62) var6.field49.field1683;
                                if ((Long.MIN_VALUE & var6.field49.field1678) == 0L) {
                                    var9.method439(false, true, true, true, false, true, true);
                                } else {
                                    var9.method439(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field46 != null) {
                            if (var6.field46.field2234 instanceof class62) {
                                class62 var10 = (class62) var6.field46.field2234;
                                if ((var6.field46.field2230 & Long.MIN_VALUE) == 0L) {
                                    var10.method439(false, true, true, true, false, true, true);
                                } else {
                                    var10.method439(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field46.field2239 instanceof class62) {
                                class62 var11 = (class62) var6.field46.field2239;
                                if ((var6.field46.field2230 & Long.MIN_VALUE) == 0L) {
                                    var11.method439(false, true, true, true, false, true, true);
                                } else {
                                    var11.method439(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field61; var12++) {
                            if (var6.field54[var12].field4043 instanceof class62) {
                                class62 var13 = (class62) var6.field54[var12].field4043;
                                if ((var6.field54[var12].field4045 & Long.MIN_VALUE) == 0L) {
                                    var13.method439(false, true, true, true, false, true, true);
                                } else {
                                    var13.method439(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != -13) {
            field4125 = (class126) null;
        }
        class116.field1952 = true;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/awt/Frame;BLvh;)V", line = 244)
    public static final void method1680(Frame arg0, byte arg1, class147 arg2) {
        field4134++;
        while (true) {
            class60 var3 = arg2.method1103(arg0, 4148);
            while (var3.field965 == 0) {
                class313.method2158(10L, true);
            }
            if (var3.field965 == 1) {
                if (arg1 <= 83) {
                    field4133 = -117;
                }
                arg0.setVisible(false);
                arg0.dispose();
                return;
            }
            class313.method2158(100L, true);
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(IIII)V", line = 293)
    public class244(int arg0, int arg1, int arg2, int arg3) {
        this.field4138 = arg1;
        this.field4126 = arg0;
        this.field4129 = arg2;
        this.field4131 = arg3;
    }
}
