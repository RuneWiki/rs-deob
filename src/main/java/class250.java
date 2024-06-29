import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class250 extends class232 {

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "Z")
    public boolean field4189 = true;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "[Led;")
    public static class289[] field4187 = new class289[50];

    @OriginalMember(owner = "client!tf", name = "R", descriptor = "Lok;")
    public static class146 field4191 = class235.method1724(-12908, "b12_full");

    @OriginalMember(owner = "client!tf", name = "ab", descriptor = "Lok;")
    public static class146 field4200 = class235.method1724(-12908, "Abbrechen");

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!tf", name = "S", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!tf", name = "T", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!tf", name = "W", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!tf", name = "Y", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!tf", name = "Z", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "[I")
    public int[] field4182;

    @OriginalMember(owner = "client!tf", name = "U", descriptor = "[I")
    private int[] field4194;

    @OriginalMember(owner = "client!tf", name = "V", descriptor = "[Lok;")
    private class146[] field4195;

    @OriginalMember(owner = "client!tf", name = "X", descriptor = "[[I")
    private int[][] field4197;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lwe;B)V", line = 19)
    public final void method1824(class47 arg0, byte arg1) {
        field4199++;
        if (arg1 < 104) {
            return;
        }
        while (true) {
            int var3 = arg0.method368(-123);
            if (var3 == 0) {
                return;
            }
            this.method1828((byte) -73, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 41)
    public static final void method1825(Component arg0, byte arg1) {
        field4198++;
        if (arg1 != -105) {
            return;
        }
        Method var2 = class129.field2170;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class157.field2648);
        arg0.addFocusListener(class157.field2648);
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(B)I", line = 64)
    public final int method1826(byte arg0) {
        field4193++;
        if (this.field4194 == null) {
            return 0;
        } else {
            int var2 = 29 / ((-arg0 - 11) / 60);
            return this.field4194.length;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lbf;IIIII)V", line = 80)
    public static final void method1827(class322 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class161.field2732 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class189.field3124) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class192.field3168 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class11 var14 = class203.field3382[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class174.field2914[var11][var12 + 1][var13] + class174.field2914[var11][var12][var13] + class174.field2914[var11][var12][var13 + 1] + class174.field2914[var11][var12 + 1][var13 + 1]) / 4 - (class174.field2914[arg1][arg2 + 1][arg3] + class174.field2914[arg1][arg2][arg3] + class174.field2914[arg1][arg2][arg3 + 1] + class174.field2914[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class278 var16 = var14.field212;
                                    if (var16 != null) {
                                        if (var16.field4779.method947()) {
                                            arg0.method945(var16.field4779, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field4774 != null && var16.field4774.method947()) {
                                            arg0.method945(var16.field4774, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field218; var17++) {
                                        class311 var18 = var14.field217[var17];
                                        if (var18 != null && var18.field5300.method947() && (var18.field5296 == var12 || var7 == var12) && (var18.field5294 == var13 || var9 == var13)) {
                                            int var19 = var18.field5302 + 1 - var18.field5296;
                                            int var20 = var18.field5299 + 1 - var18.field5294;
                                            arg0.method945(var18.field5300, (var18.field5296 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field5294 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BILwe;)V", line = 178)
    private final void method1828(byte arg0, int arg1, class47 arg2) {
        field4192++;
        if (arg1 == 1) {
            this.field4195 = arg2.method337(-1).method1090(60, (byte) 33);
        } else if (arg1 == 2) {
            int var8 = arg2.method368(-121);
            this.field4182 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4182[var9] = arg2.method379(-2);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method368(96);
            this.field4194 = new int[var4];
            this.field4197 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method379(-2);
                this.field4194[var5] = var6;
                this.field4197[var5] = new int[class60.field1024[var6]];
                for (int var7 = 0; var7 < class60.field1024[var6]; var7++) {
                    this.field4197[var5][var7] = arg2.method379(-2);
                }
            }
        } else if (arg1 == 4) {
            this.field4189 = false;
        }
        if (arg0 >= -35) {
            this.field4182 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILok;Lwe;)I", line = 243)
    public static final int method1829(int arg0, class146 arg1, class47 arg2) {
        field4188++;
        int var3 = arg2.field857;
        arg2.method349(arg1.field2461, (byte) -78);
        arg2.field857 += class287.field4924.method586(arg1.field2462, true, arg2.field860, arg2.field857, arg0, arg1.field2461);
        return arg2.field857 - var3;
    }

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(B)V", line = 257)
    public final void method1830(byte arg0) {
        if (this.field4182 != null) {
            for (int var2 = 0; var2 < this.field4182.length; var2++) {
                this.field4182[var2] = class138.method1013(this.field4182[var2], 32768);
            }
        }
        field4180++;
        if (arg0 != -53) {
            field4191 = (class146) null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)Lok;", line = 277)
    public final class146 method1831(int arg0) {
        field4184++;
        class146 var2 = class114.method776(arg0 ^ 0xFFFFFFA2, 80);
        if (this.field4195 == null) {
            return class318.field5407;
        }
        var2.method1082(this.field4195[arg0], false);
        for (int var3 = 1; var3 < this.field4195.length; var3++) {
            var2.method1082(class201.field3350, false);
            var2.method1082(this.field4195[var3], false);
        }
        return var2.method1098(15651);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILwe;)Lok;", line = 302)
    public final class146 method1832(int arg0, class47 arg1) {
        field4190++;
        int var3 = 108 % ((43 - arg0) / 38);
        class146 var4 = class114.method776(63, 80);
        if (this.field4194 != null) {
            for (int var5 = 0; var5 < this.field4194.length; var5++) {
                var4.method1082(this.field4195[var5], false);
                var4.method1082(class196.method1515(8, arg1.method364(class88.field1405[this.field4194[var5]], true), this.field4194[var5], this.field4197[var5]), false);
            }
        }
        var4.method1082(this.field4195[this.field4195.length - 1], false);
        return var4.method1098(15651);
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)I", line = 329)
    public final int method1833(int arg0, int arg1) {
        field4196++;
        if (arg0 != 1) {
            this.method1833(2, -5);
        }
        return this.field4194 == null || arg1 < 0 || arg1 > this.field4194.length ? -1 : this.field4194[arg1];
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)V", line = 344)
    public static void method1834(int arg0) {
        field4187 = null;
        field4191 = null;
        if (arg0 >= -20) {
            field4191 = (class146) null;
        }
        field4200 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)I", line = 361)
    public final int method1835(int arg0, int arg1, int arg2) {
        if (arg1 != -3568) {
            method1829(-60, (class146) null, (class47) null);
        }
        field4181++;
        if (this.field4194 == null || arg0 < 0 || arg0 > this.field4194.length) {
            return -1;
        } else if (this.field4197[arg0] == null || arg2 < 0 || this.field4197[arg0].length < arg2) {
            return -1;
        } else {
            return this.field4197[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lwe;[IB)V", line = 385)
    public final void method1836(class47 arg0, int[] arg1, byte arg2) {
        field4186++;
        if (this.field4194 == null) {
            return;
        }
        int var4 = 0;
        if (arg2 != -86) {
            this.field4195 = (class146[]) null;
        }
        while (var4 < this.field4194.length && var4 < arg1.length) {
            int var5 = class211.field3487[this.method1833(1, var4)];
            if (var5 > 0) {
                arg0.method335(var5, (long) arg1[var4], 125);
            }
            var4++;
        }
    }
}
