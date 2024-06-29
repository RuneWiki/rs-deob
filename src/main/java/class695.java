import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class695 {

    @OriginalMember(owner = "client!nw", name = "h", descriptor = "Z")
    public static boolean field9696 = false;

    @OriginalMember(owner = "client!nw", name = "g", descriptor = "Lwd;")
    public static class179 field9695 = new class179();

    @OriginalMember(owner = "client!nw", name = "k", descriptor = "Ljn;")
    public static class134 field9699 = new class134(125, 17);

    @OriginalMember(owner = "client!nw", name = "j", descriptor = "F")
    public static float field9698;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "I")
    public int field9689;

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "I")
    public int field9690;

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "I")
    public static int field9691;

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "I")
    public int field9692;

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "I")
    public static int field9693;

    @OriginalMember(owner = "client!nw", name = "f", descriptor = "I")
    public int field9694;

    @OriginalMember(owner = "client!nw", name = "i", descriptor = "I")
    public int field9697;

    @OriginalMember(owner = "client!nw", name = "l", descriptor = "I")
    public int field9700;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)V")
    public static void method3929(int arg0) {
        if (arg0 != 4) {
            field9695 = null;
        }
        field9695 = null;
        field9699 = null;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Loq;[Lsca;)V")
    public static final void method3930(class230 arg0, class251[] arg1) {
        if (class449.field6283) {
            int var2 = arg0.method1526(false, arg1);
            class139.field1781.method163(var2, arg1);
        }
        if (class661.field9303 == class594.field8355) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class253) {
                var5 = ((class253) arg0).field3745;
                var6 = ((class253) arg0).field3758;
            } else {
                var5 = arg0.field3470 >> class732.field10110;
                var6 = arg0.field3460 >> class732.field10110;
            }
            class139.field1781.method217(class95.field1115[0].method2529(arg0.field3460, arg0.field3470, (byte) -128), class666.method3796(var5, var6), class497.method2924(var5, var6), class418.method2530(var5, var6));
        }
        class289 var7 = arg0.method74(96, class139.field1781);
        if (var7 == null) {
            return;
        }
        if (arg0.field3468) {
            class21[] var8 = var7.field4255;
            for (int var9 = 0; var9 < var8.length; var9++) {
                class21 var10 = var8[var9];
                if (var10.field180) {
                    class338.method2144((byte) -88, var10.field183 + var10.field181, var10.field184 - var10.field183, var10.field183 + var10.field182, var10.field179 - var10.field183);
                }
            }
        }
        if (var7.field4257) {
            var7.field4258 = arg0;
            if (class753.field10384) {
                class705 var11 = class539.field7444;
                synchronized (class539.field7444) {
                    class539.field7444.method3978(var7, (byte) -125);
                    return;
                }
            }
            class539.field7444.method3978(var7, (byte) -126);
            return;
        }
        class467.method2791(-34, var7);
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(B[B)V")
    public static final void method3931(byte arg0, byte[] arg1) {
        field9693++;
        class511 var2 = new class511(arg1);
        boolean var3 = false;
        if (arg0 != -8) {
            return;
        }
        while (true) {
            while (true) {
                int var4 = var2.method3013(arg0 ^ 0xFFFFFFA2);
                if (var4 == 0) {
                    if (var3) {
                        return;
                    }
                    if (class471.field6521 == null) {
                        class777.field10693 = new int[4];
                        class510.field6923 = 4;
                        class471.field6521 = new int[4];
                    }
                    for (int var6 = 0; var6 < class471.field6521.length; var6++) {
                        class471.field6521[var6] = 0;
                        class777.field10693[var6] = var6 * 20;
                    }
                    return;
                }
                if (var4 == 1) {
                    if (class471.field6521 == null) {
                        class510.field6923 = 4;
                        class777.field10693 = new int[4];
                        class471.field6521 = new int[4];
                    }
                    var3 = true;
                    for (int var5 = 0; var5 < class471.field6521.length; var5++) {
                        class471.field6521[var5] = var2.method3034(arg0 + 9);
                        class777.field10693[var5] = var2.method3034(1);
                    }
                } else if (var4 == 2) {
                    class424.field5898 = var2.method3002(-1);
                } else if (var4 == 3) {
                    class510.field6923 = var2.method3013(-97);
                    class777.field10693 = new int[class510.field6923];
                    class471.field6521 = new int[class510.field6923];
                }
            }
        }
    }
}
