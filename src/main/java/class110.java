import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class110 {

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    private int field1550;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "Lor;")
    public static class460 field1546 = new class460(0, 0);

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "Lof;")
    public static class446 field1547 = new class446("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public static int field1551 = 0;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V", line = 6)
    public final void method691(int arg0) {
        if (arg0 >= -2) {
            this.field1550 = -121;
        }
        OpenGL.glEndList();
        field1548++;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lik;II)Z", line = 21)
    public static final boolean method692(class141 arg0, int arg1, int arg2) {
        field1552++;
        int var3 = arg0.method949(85, 2);
        if (var3 == 0) {
            if (arg0.method949(29, 1) != 0) {
                method692(arg0, arg1, -49);
            }
            int var4 = arg0.method949(46, 6);
            int var5 = arg0.method949(83, 6);
            boolean var6 = arg0.method949(23, 1) == 1;
            if (var6) {
                class224.field3113[class493.field7267++] = arg1;
            }
            if (class241.field3398[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class317 var7 = class95.field1383[arg1];
            class96 var8 = class241.field3398[arg1] = new class96();
            var8.field3882 = arg1;
            if (class391.field5980[arg1] != null) {
                var8.method641(class391.field5980[arg1], (byte) 90);
            }
            var8.method1768(var7.field4603, true, 6946);
            var8.field3833 = var7.field4602;
            int var9 = var7.field4606;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            var8.field1388 = var7.field4605;
            int var12 = var9 & 0xFF;
            var8.field3908[0] = class487.field7212[arg1];
            var8.field1866 = (byte) var10;
            var8.method635((var12 << 6) + var5 - class328.field5099, (var11 << 6) + var4 + -class331.field5162, -1);
            var8.field1427 = false;
            class95.field1383[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg0.method949(57, 2);
            int var14 = class95.field1383[arg1].field4606;
            class95.field1383[arg1].field4606 = (((var14 >> 28) + var13 & 0x3) << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg0.method949(101, 5);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class95.field1383[arg1].field4606;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = var18 >> 14 & 0xFF;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var20--;
                var21--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var21--;
                var20++;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var20--;
                var21++;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var20++;
                var21++;
            }
            class95.field1383[arg1].field4606 = (var19 << 28) + (var20 << 14) + var21;
            return false;
        } else {
            int var22 = arg0.method949(108, 18);
            int var23 = var22 >> 16;
            int var24 = (var22 & 0xFF2D) >> 8;
            int var25 = -111 / ((arg2 - 9) / 45);
            int var26 = var22 & 0xFF;
            int var27 = class95.field1383[arg1].field4606;
            int var28 = (var27 >> 28) + var23 & 0x3;
            int var29 = (var27 >> 14) + var24 & 0xFF;
            int var30 = var26 + var27 & 0xFF;
            class95.field1383[arg1].field4606 = (var29 << 14) + (var28 << 28) + var30;
            return false;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BC)V", line = 180)
    public final void method693(byte arg0, char arg1) {
        if (arg0 > 77) {
            field1549++;
            OpenGL.glCallList(this.field1550 + arg1);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)V", line = 192)
    public final void method694(int arg0, int arg1) {
        field1553++;
        OpenGL.glNewList(this.field1550 + arg1, arg0);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BIIII)V", line = 200)
    public static final void method695(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class418.field6370 == 1) {
            class55.field776[class194.field2595 / 100].method2201(class156.field2036 - 8, class484.field7137 + -8);
        }
        field1554++;
        if (arg0 != 12) {
            field1547 = null;
        }
        if (class418.field6370 == 2) {
            class55.field776[class194.field2595 / 100 + 4].method2201(class156.field2036 - 8, class484.field7137 + -8);
        }
        class263.method1696(126);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V", line = 223)
    public static void method696(byte arg0) {
        if (arg0 != 97) {
            field1546 = null;
        }
        field1546 = null;
        field1547 = null;
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lnq;I)V", line = 246)
    public class110(class325 arg0, int arg1) {
        this.field1550 = OpenGL.glGenLists(arg1);
    }
}
