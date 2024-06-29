import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class589 {

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "I")
    public int field8225 = -1;

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "I")
    public int field8227 = -1;

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "Lfha;")
    public static class382 field8226 = new class382(4, 4);

    @OriginalMember(owner = "client!eba", name = "h", descriptor = "Lgm;")
    public static class125 field8230 = new class125("", 13);

    @OriginalMember(owner = "client!eba", name = "j", descriptor = "Lea;")
    public static class547 field8232 = new class547(27, 6);

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "I")
    public static int field8223;

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "I")
    public static int field8224;

    @OriginalMember(owner = "client!eba", name = "g", descriptor = "I")
    public static int field8229;

    @OriginalMember(owner = "client!eba", name = "f", descriptor = "[I")
    public int[] field8228;

    @OriginalMember(owner = "client!eba", name = "i", descriptor = "[J")
    public static long[] field8231;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(BLji;I)V")
    private final void method3277(byte arg0, class611 arg1, int arg2) {
        if (arg0 < 1) {
            method3280(101, 11, -47, -9, null, null, null, null, null, null, -9, (byte) -87, 72, -113, false, true, -44, -71, false);
        }
        if (arg2 == 1) {
            this.field8225 = arg1.method3402((byte) 127);
        } else if (arg2 == 2) {
            this.field8228 = new int[arg1.method3428((byte) -101)];
            for (int var4 = 0; var4 < this.field8228.length; var4++) {
                this.field8228[var4] = arg1.method3402((byte) 127);
            }
        } else if (arg2 == 3) {
            this.field8227 = arg1.method3428((byte) -101);
        }
        field8224++;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lji;I)V")
    public final void method3278(class611 arg0, int arg1) {
        if (arg1 != 0) {
            this.method3278(null, 76);
        }
        while (true) {
            int var3 = arg0.method3428((byte) -120);
            if (var3 == 0) {
                field8229++;
                return;
            }
            this.method3277((byte) 58, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V")
    public static void method3279(byte arg0) {
        field8226 = null;
        if (arg0 != -63) {
            field8231 = null;
        }
        field8232 = null;
        field8230 = null;
        field8231 = null;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
    public static final void method3280(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class232.field2988 = true;
        class276.field3687 = class22.field158.method455() > 0;
        class735.field10263 = arg15;
        class610.field8512 = arg1 >> class443.field6172;
        class39.field407 = arg3 >> class443.field6172;
        class211.field2526 = arg1;
        class671.field9323 = arg3;
        class495.field6743 = arg2;
        class635.field8826 = class610.field8512 - class118.field1562;
        if (class635.field8826 < 0) {
            class364.field4815 = -class635.field8826;
            class635.field8826 = 0;
        } else {
            class364.field4815 = 0;
        }
        class712.field9939 = class39.field407 - class118.field1562;
        if (class712.field9939 < 0) {
            class395.field5616 = -class712.field9939;
            class712.field9939 = 0;
        } else {
            class395.field5616 = 0;
        }
        class553.field7818 = class610.field8512 + class118.field1562;
        if (class553.field7818 > class68.field743) {
            class553.field7818 = class68.field743;
        }
        class170.field2115 = class39.field407 + class118.field1562;
        if (class170.field2115 > class480.field6629) {
            class170.field2115 = class480.field6629;
        }
        boolean[][] var19 = class423.field5940;
        boolean[][] var20 = class619.field8676;
        if (class735.field10263) {
            for (int var21 = 0; var21 < class118.field1562 + class118.field1562 + 2; var21++) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class118.field1562 + class118.field1562 + 2; var24++) {
                    if (var24 > 1) {
                        class320.field4301[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class610.field8512 + var21 - class118.field1562;
                    int var26 = class39.field407 + var24 - class118.field1562;
                    if (var25 >= 0 && var26 >= 0 && var25 < class68.field743 && var26 < class480.field6629) {
                        int var27 = var25 << class443.field6172;
                        int var28 = var26 << class443.field6172;
                        int var29 = class86.field1182[class86.field1182.length - 1].method1685(var26, -12639, var25) - (0x3E8 << class443.field6172 - 7);
                        int var30 = class143.field1850 == null ? class86.field1182[0].method1685(var26, -12639, var25) + class601.field8373 : class143.field1850[0].method1685(var26, -12639, var25) + class601.field8373;
                        var23 = arg16 >= 0 ? class22.field158.method363(var27, var29, var28, var27, var30, var28, arg16) : class22.field158.method403(var27, var29, var28, var27, var30, var28);
                        class619.field8676[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        class619.field8676[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class320.field4301[var24 - 1] & class320.field4301[var24] & var22 & var23;
                        class423.field5940[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class320.field4301[class118.field1562 + class118.field1562] = var22;
                class320.field4301[class118.field1562 + class118.field1562 + 1] = var23;
            }
            if (arg16 >= 0) {
                class232.field2988 = false;
            } else {
                class579.field8118 = arg5;
                class365.field4820 = arg6;
                class294.field3947 = arg7;
                class692.field9672 = arg8;
                class307.field4168 = arg9;
                class577.method3232(class22.field158, arg10, (byte) -59);
            }
        } else {
            if (class582.field8160 == null) {
                class582.field8160 = new boolean[class68.field743 + class68.field743 + 1][class68.field743 + class480.field6629 + 1];
            }
            for (int var32 = 0; var32 < class582.field8160.length; var32++) {
                for (int var42 = 0; var42 < class582.field8160[0].length; var42++) {
                    class582.field8160[var32][var42] = true;
                }
            }
            class619.field8676 = class582.field8160;
            class423.field5940 = class582.field8160;
            class635.field8826 = 0;
            class712.field9939 = 0;
            class553.field7818 = class68.field743;
            class170.field2115 = class480.field6629;
            class232.field2988 = false;
        }
        class14.method62(class22.field158, 59);
        if (!class350.field4641.field9076) {
            class29 var33 = class350.field4641.field9074;
            for (class62 var34 = (class62) var33.method113((byte) 15); var34 != null; var34 = (class62) var33.method119(false)) {
                var34.method975((byte) -37);
                class614.method3456(var34, 84);
            }
        }
        if (class276.field3687) {
            for (int var35 = 0; var35 < class474.field6562; var35++) {
                class85.field1176[var35].method3766(arg14, arg0, 71);
            }
        }
        if (class181.field2224) {
            class735.field10258 = class22.field158.method453();
            class22.field158.method398(class426.field6017);
            int var36 = (class426.field6017[2] - class426.field6017[0]) / class360.field4767;
            for (int var37 = 0; var37 < class360.field4767 - 1; var37++) {
                class281.field3729[var37] = (var37 + 1) * var36 + class116.field1540[var37];
            }
            for (int var38 = 0; var38 < class532.field7227.length; var38++) {
                class532.field7227[var38].method3275();
            }
        }
        if (class195.field2334 != null) {
            if (class181.field2224) {
                class179.method1023(0);
            }
            class148.method912(true);
            class22.field158.method348(-1, 1583160, 40, 127);
            class179.method1022(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class181.field2224) {
                class23.method93();
            }
            class22.field158.method417();
            class148.method912(false);
        }
        class179.method1022(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class181.field2224) {
            for (int var39 = 0; var39 < class307.field4170; var39++) {
                class331.field4466[var39] = class219.field2838[var39];
            }
            class179.method1023(0);
            for (int var40 = 0; var40 < class532.field7227.length; var40++) {
                class532.field7227[var40].method3275();
            }
        }
        if (class181.field2224) {
            class23.method93();
            for (int var41 = 0; var41 < class307.field4170; var41++) {
                class219.field2838[var41] = class331.field4466[var41];
            }
            if (class351.field4702 == 2) {
                int var10002;
                if (class565.field7977[0] < class565.field7977[1]) {
                    if (class281.field3729[0] + class116.field1540[0] > class426.field6017[0]) {
                        var10002 = class116.field1540[0]++;
                    }
                } else if (class565.field7977[0] > class565.field7977[1] && class281.field3729[0] + class116.field1540[0] < class426.field6017[2]) {
                    var10002 = class116.field1540[0]--;
                }
            }
        }
        if (!class735.field10263) {
            class423.field5940 = var19;
            class619.field8676 = var20;
        }
        class645.method3640();
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ILni;Ld;ILjava/awt/Canvas;)Lha;")
    public static final class60 method3281(int arg0, class522 arg1, class152 arg2, int arg3, Canvas arg4) {
        field8223++;
        if (!class619.method3510(true)) {
            throw new RuntimeException("");
        } else if (class492.method2758("jaggl", (byte) -36)) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg4, 8, 8, 8, 24, arg3, arg0);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class529 var8 = new class529(var5, arg4, var6, arg2, arg1, arg0);
            var8.method2124(true);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }
}
