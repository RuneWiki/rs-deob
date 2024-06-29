import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class291 extends class110 {

    @OriginalMember(owner = "client!h", name = "N", descriptor = "I")
    private int field4434 = 1;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "I")
    private int field4433 = 1;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "[I")
    public static int[] field4435 = new int[99];

    @OriginalMember(owner = "client!h", name = "G", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "Llm;")
    public static class210 field4437;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)Z", line = 5)
    public static final boolean method2035(byte arg0, int arg1) {
        field4430++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class201.field2998[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (arg0 != 74) {
            field4435 = (int[]) null;
        }
        return var2 == 1001;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V", line = 30)
    public class291() {
        super(1, false);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILre;)V", line = 34)
    public static final void method2036(int arg0, class263 arg1) {
        field4432++;
        if (arg0 != 30598) {
            method2038(true, 57, -67, (class210) null, 117, -126, -83);
        }
        while (true) {
            while (arg1.field3986.length > arg1.field4025) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1787(false) == 1) {
                    var2 = true;
                    var4 = arg1.method1787(false);
                    var3 = arg1.method1787(false);
                }
                int var5 = arg1.method1787(false);
                int var6 = arg1.method1787(false);
                int var7 = class296.field4533 + class111.field1719 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class292.field4439;
                if (var8 >= 0 && var7 - 63 >= 0 && (var8 + 63) < class41.field497 && class111.field1719 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var4 * 8 && var11 < var4 * 8 + 8 && (var3 * 8) <= var12 && var12 < (var3 * 8 + 8)) {
                                byte var13 = arg1.method1810((byte) 102);
                                if (var13 != 0) {
                                    if (class142.field2157[var9][var10] == null) {
                                        class142.field2157[var9][var10] = new byte[4096];
                                    }
                                    class142.field2157[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1810((byte) 125);
                                    if (class205.field3099[var9][var10] == null) {
                                        class205.field3099[var9][var10] = new byte[4096];
                                    }
                                    class205.field3099[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method1810((byte) 96);
                        if (var16 != 0) {
                            arg1.field4025++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V", line = 132)
    public static void method2037(boolean arg0) {
        field4435 = null;
        field4437 = null;
        if (!arg0) {
            field4437 = (class210) null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILre;I)V", line = 162)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg0 == 0) {
            this.field4434 = arg1.method1787(false);
        } else if (arg0 == 1) {
            this.field4433 = arg1.method1787(false);
        } else if (arg0 == 2) {
            this.field1705 = arg1.method1787(false) == 1;
        }
        if (arg2 > -37) {
            this.field4433 = -35;
        }
        field4436++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IZ)[[I", line = 201)
    public final int[][] method445(int arg0, boolean arg1) {
        field4431++;
        int[][] var3 = this.field1701.method1477((byte) 114, arg0);
        if (this.field1701.field3255) {
            int var4 = this.field4433 + this.field4433 + 1;
            int[][][] var5 = new int[var4][][];
            int var6 = this.field4434 + this.field4434 + 1;
            int var7 = 65536 / var4;
            int var8 = 65536 / var6;
            for (int var9 = arg0 - this.field4433; var9 <= (arg0 + this.field4433); var9++) {
                int[][] var10 = this.method770(var9 & class154.field2320, (byte) 107, 0);
                int[][] var11 = new int[3][class124.field1936];
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                int[] var15 = var10[1];
                int[] var16 = var10[0];
                int[] var17 = var10[2];
                for (int var18 = -this.field4434; var18 <= this.field4434; var18++) {
                    int var19 = class196.field2949 & var18;
                    var13 += var15[var19];
                    var12 += var16[var19];
                    var14 += var17[var19];
                }
                int[] var20 = var11[0];
                int[] var21 = var11[1];
                int[] var22 = var11[2];
                int var23 = 0;
                while (var23 < class124.field1936) {
                    var20[var23] = var8 * var12 >> 16;
                    var21[var23] = var8 * var13 >> 16;
                    var22[var23] = var8 * var14 >> 16;
                    int var24 = class196.field2949 & var23 - this.field4434;
                    int var25 = var12 - var16[var24];
                    int var26 = var13 - var15[var24];
                    int var27 = var14 - var17[var24];
                    var23++;
                    int var28 = class196.field2949 & this.field4434 + var23;
                    var12 = var16[var28] + var25;
                    var13 = var15[var28] + var26;
                    var14 = var17[var28] + var27;
                }
                var5[this.field4433 + var9 - arg0] = var11;
            }
            int[] var29 = var3[0];
            int[] var30 = var3[1];
            int[] var31 = var3[2];
            for (int var32 = 0; var32 < class124.field1936; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var5[var36];
                    var34 += var37[1][var32];
                    var35 += var37[2][var32];
                    var33 += var37[0][var32];
                }
                var29[var32] = var7 * var33 >> 16;
                var30[var32] = var7 * var34 >> 16;
                var31[var32] = var7 * var35 >> 16;
            }
        }
        if (arg1) {
            field4435 = (int[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZIILlm;III)V", line = 338)
    public static final void method2038(boolean arg0, int arg1, int arg2, class210 arg3, int arg4, int arg5, int arg6) {
        class16.field176 = arg0;
        field4427++;
        class307.field4683 = arg1;
        if (arg6 != -25614) {
            field4435 = (int[]) null;
        }
        class270.field4128 = arg2;
        class54.field682 = 1;
        class314.field4757 = arg3;
        class194.field2897 = arg5;
        class43.field527 = arg4;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIZZZII)V", line = 359)
    public static final void method2039(int arg0, int arg1, boolean arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        if (arg2) {
            class117.method817();
        }
        field4428++;
        if (class90.field1344 != null && (arg6 != 3 || class91.field1360 != arg1 || class204.field3064 != arg0)) {
            class130.method968(class274.field4200, (byte) 95, class90.field1344);
            class90.field1344 = null;
        }
        if (arg6 == 3 && class90.field1344 == null) {
            class90.field1344 = class146.method1045(0, 0, class274.field4200, arg0, 0, arg1);
            if (class90.field1344 != null) {
                class91.field1360 = arg1;
                class204.field3064 = arg0;
                class6.method17(class274.field4200, (byte) -126);
            }
        }
        if (arg6 == 3 && class90.field1344 == null) {
            method2039(-1, -1, true, true, true, arg5, class144.field2175);
            return;
        }
        Container var7;
        if (class90.field1344 != null) {
            var7 = class90.field1344;
        } else if (class106.field1661 == null) {
            var7 = class274.field4200.field3963;
        } else {
            var7 = class106.field1661;
        }
        class13.field152 = var7.getSize().width;
        class40.field480 = var7.getSize().height;
        if (class106.field1661 == var7) {
            Insets var8 = class106.field1661.getInsets();
            class40.field480 -= var8.top + var8.bottom;
            class13.field152 -= var8.right + var8.left;
        }
        if (arg6 >= 2) {
            class251.field3747 = class40.field480;
            class136.field2071 = class13.field152;
            class147.field2210 = 0;
            class301.field4604 = 0;
        } else {
            class251.field3747 = 503;
            class301.field4604 = 0;
            class147.field2210 = (class13.field152 - 765) / 2;
            class136.field2071 = 765;
        }
        if (arg4) {
            class66.method436((byte) -41, class315.field4764);
            class210.method1446((byte) -40, class315.field4764);
            if (class150.field2260 != null) {
                class150.field2260.method188(class315.field4764, (byte) -68);
            }
            class142.field2150.method2197(!arg3);
            class182.method1262(102, class315.field4764);
            class269.method1894((byte) 122, class315.field4764);
            if (class150.field2260 != null) {
                class150.field2260.method187(class315.field4764, -3325);
            }
        } else {
            if (class117.field1817) {
                class117.method832(class136.field2071, class251.field3747);
            }
            class315.field4764.setSize(class136.field2071, class251.field3747);
            if (class106.field1661 == var7) {
                Insets var9 = class106.field1661.getInsets();
                class315.field4764.setLocation(class147.field2210 + var9.left, class301.field4604 + var9.top);
            } else {
                class315.field4764.setLocation(class147.field2210, class301.field4604);
            }
        }
        if (arg6 == 0 && arg5 > 0) {
            class117.method835(class315.field4764);
        }
        if (arg2 && arg6 > 0) {
            class315.field4764.setIgnoreRepaint(true);
            if (!class188.field2799) {
                class249.method1679();
                class171.field2574 = null;
                class171.field2574 = class249.method1682(class136.field2071, (byte) 6, class315.field4764, class251.field3747);
                class46.method302();
                if (class293.field4490 == 5) {
                    class329.method2240(class217.field3299, (byte) -39, true);
                } else {
                    class274.method1930(class35.field434, false, 1);
                }
                try {
                    Graphics var10 = class315.field4764.getGraphics();
                    class171.field2574.method238(0, var10, 0, 0);
                } catch (Exception var14) {
                }
                class281.method1964(-19123);
                if (arg5 == 0) {
                    class171.field2574 = class249.method1682(765, (byte) 6, class315.field4764, 503);
                } else {
                    class171.field2574 = null;
                }
                class227 var12 = class274.field4200.method1779((byte) 8, class142.field2150.getClass());
                while (var12.field3456 == 0) {
                    class93.method662(-553, 100L);
                }
                if (var12.field3456 == 1) {
                    class188.field2799 = true;
                }
            }
            if (class188.field2799) {
                class117.method819(class315.field4764, class194.field2902 * 2);
            }
        }
        if (!class117.field1817 && arg6 > 0) {
            method2039(-1, -1, true, true, true, arg5, 0);
            return;
        }
        if (arg6 > 0 && arg5 == 0) {
            class294.field4507.setPriority(5);
            class171.field2574 = null;
            class77.method492();
            ((class292) class148.field2233).method2047(-2, 200);
            if (class292.field4447) {
                class148.method1057(0.7F);
            }
            class138.method999(false);
        } else if (arg6 == 0 && arg5 > 0) {
            class294.field4507.setPriority(1);
            class171.field2574 = class249.method1682(765, (byte) 6, class315.field4764, 503);
            class77.method520();
            class18.method116();
            ((class292) class148.field2233).method2047(-2, 20);
            if (class292.field4447) {
                if (class272.field4167 == 1) {
                    class148.method1057(0.9F);
                }
                if (class272.field4167 == 2) {
                    class148.method1057(0.8F);
                }
                if (class272.field4167 == 3) {
                    class148.method1057(0.7F);
                }
                if (class272.field4167 == 4) {
                    class148.method1057(0.6F);
                }
            }
            class86.method596();
            class138.method999(!arg3);
        }
        class307.field4679 = !class80.method540(-111);
        if (arg2) {
            class141.method1012((byte) -73);
        }
        if (arg6 < 2) {
            class177.field2612 = false;
        } else {
            class177.field2612 = true;
        }
        if (class123.field1926 != -1) {
            class136.method995(true, 31456);
        }
        if (class168.field2517 != null && (class293.field4490 == 30 || class293.field4490 == 25)) {
            class286.method1989((byte) 73);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class22.field298[var13] = true;
        }
        class121.field1896 = arg3;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field4435[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)[I", line = 617)
    public final int[] method46(int arg0, int arg1) {
        field4429++;
        if (arg0 != 1) {
            method2035((byte) -92, -77);
        }
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (this.field1695.field875) {
            int var4 = this.field4433 + this.field4433 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field4434 + this.field4434 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field4433; var9 <= this.field4433 + arg1; var9++) {
                int[] var10 = this.method764(0, true, var9 & class154.field2320);
                int[] var11 = new int[class124.field1936];
                int var12 = 0;
                for (int var13 = -this.field4434; var13 <= this.field4434; var13++) {
                    var12 += var10[var13 & class196.field2949];
                }
                int var14 = 0;
                while (class124.field1936 > var14) {
                    var11[var14] = var7 * var12 >> 16;
                    int var15 = var12 - var10[class196.field2949 & var14 - this.field4434];
                    var14++;
                    var12 = var10[class196.field2949 & this.field4434 + var14] + var15;
                }
                var8[this.field4433 + var9 - arg1] = var11;
            }
            for (int var16 = 0; var16 < class124.field1936; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var8[var18][var16];
                }
                var3[var16] = var5 * var17 >> 16;
            }
        }
        return var3;
    }
}
