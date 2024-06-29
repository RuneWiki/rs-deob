import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class158 {

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "Lcu;")
    public static class206 field2496 = new class206(3, -1);

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "F")
    public static float field2489;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "I")
    public int field2490;

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "I")
    public int field2491;

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "I")
    public int field2493;

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
    public int field2494;

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "I")
    public int field2498;

    @OriginalMember(owner = "client!gw", name = "m", descriptor = "I")
    public int field2501;

    @OriginalMember(owner = "client!gw", name = "n", descriptor = "I")
    public int field2502;

    @OriginalMember(owner = "client!gw", name = "k", descriptor = "Lbi;")
    public static class449 field2499;

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "[B")
    public byte[] field2497;

    @OriginalMember(owner = "client!gw", name = "l", descriptor = "[B")
    public byte[] field2500;

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "[Lhv;")
    public static class485[] field2495;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1101(int arg0) {
        if (arg0 != -1) {
            method1102(15);
        }
        for (int var1 = 0; var1 < class360.field4868; var1++) {
            int var2 = class329.field4530[var1];
            class287 var3 = ((class280) class616.field8143.method2918((long) var2, (byte) -126)).field3983;
            int var4 = class439.field6039.method2034(255);
            if ((var4 & 0x80) != 0) {
                var4 += class439.field6039.method2034(arg0 ^ 0xFFFFFF00) << 8;
            }
            if ((var4 & 0x2000) != 0) {
                int var5 = class439.field6039.method1996(false);
                var3.field5626 = class439.field6039.method2033(5051);
                var3.field5625 = class439.field6039.method2028(true);
                var3.field5585 = var5 & 0x7FFF;
                var3.field5621 = (var5 & 0x8000) != 0;
                var3.field5550 = class642.field8626 + var3.field5585 + var3.field5626;
            }
            if ((var4 & 0x200) != 0) {
                var3.field5589 = class439.field6039.method2040(arg0 - 108);
                var3.field5578 = class439.field6039.method2044(arg0 - 32);
                var3.field5632 = class439.field6039.method2023((byte) 46);
                var3.field5601 = class439.field6039.method2044(92);
                var3.field5548 = class439.field6039.method2001((byte) -83) + class642.field8626;
                var3.field5610 = class439.field6039.method2001((byte) -83) + class642.field8626;
                var3.field5627 = class439.field6039.method2033(5051);
                var3.field5578 += var3.field5649[0];
                var3.field5642 = 1;
                var3.field5601 += var3.field5649[0];
                var3.field5632 += var3.field5643[0];
                var3.field5641 = 0;
                var3.field5589 += var3.field5643[0];
            }
            if ((var4 & 0x4) != 0) {
                var3.field4060 = class439.field6039.method2024((byte) 33);
                var3.field4036 = class439.field6039.method2013(97);
            }
            if ((var4 & 0x8) != 0) {
                var3.field5551 = class439.field6039.method2001((byte) -83);
                if (var3.field5551 == 65535) {
                    var3.field5551 = -1;
                }
            }
            if ((var4 & 0x1000) != 0) {
                int var6 = class439.field6039.method2001((byte) -83);
                int var7 = class439.field6039.method2045(-98);
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var8 = class439.field6039.method2046((byte) 74);
                var3.method2350(var7, var6, var8, (byte) -53, true);
            }
            if ((var4 & 0x800) != 0) {
                int var9 = class439.field6039.method1997(-129);
                int var10 = class439.field6039.method2046((byte) 97);
                var3.method2362(class642.field8626, var9, -115, var10);
            }
            if ((var4 & 0x2) != 0) {
                int var11 = class439.field6039.method1997(-129);
                int var12 = class439.field6039.method2033(5051);
                var3.method2362(class642.field8626, var11, -88, var12);
                var3.field5603 = class642.field8626 + 300;
                var3.field5636 = class439.field6039.method2028(true);
            }
            if ((var4 & 0x100) != 0) {
                var3.field5594 = class439.field6039.method2040(-64);
                var3.field5571 = class439.field6039.method2023((byte) 46);
                var3.field5604 = class439.field6039.method2044(126);
                var3.field5555 = (byte) class439.field6039.method2046((byte) -105);
                var3.field5583 = class642.field8626 + class439.field6039.method1996(false);
                var3.field5549 = class642.field8626 + class439.field6039.method2001((byte) -83);
            }
            if ((var4 & 0x10) != 0) {
                int[] var13 = new int[4];
                for (int var14 = 0; var14 < 4; var14++) {
                    var13[var14] = class439.field6039.method2013(123);
                    if (var13[var14] == 65535) {
                        var13[var14] = -1;
                    }
                }
                int var15 = class439.field6039.method2034(arg0 + 256);
                class24.method221(-1, var15, var3, var13);
            }
            if ((var4 & 0x400) != 0) {
                int var16 = class439.field6039.method2046((byte) 10);
                int[] var17 = new int[var16];
                int[] var18 = new int[var16];
                int[] var19 = new int[var16];
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = class439.field6039.method1996(false);
                    if (var21 == 65535) {
                        var21 = -1;
                    }
                    var17[var20] = var21;
                    var18[var20] = class439.field6039.method2034(255);
                    var19[var20] = class439.field6039.method1996(false);
                }
                class534.method2971(var18, ~arg0, var3, var17, var19);
            }
            if ((var4 & 0x1) != 0) {
                if (var3.field4052.method2400(65535)) {
                    class625.method3421(var3, -122);
                }
                var3.method1777((byte) -85, class239.field3369.method277(class439.field6039.method2024((byte) 68), (byte) -52));
                var3.method2354(arg0 ^ 0x5A, var3.field4052.field5738);
                var3.field5614 = var3.field4052.field5796 << 3;
                if (var3.field4052.method2400(65535)) {
                    class372.method2192(null, var3.field8609, -601998647, 0, null, var3, var3.field5649[0], var3.field5643[0]);
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field5587 = class439.field6039.method2029((byte) -86);
                var3.field5599 = 100;
            }
            if ((var4 & 0x20) != 0) {
                int var22 = class439.field6039.method2001((byte) -83);
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var23 = class439.field6039.method2045(arg0 - 97);
                int var24 = class439.field6039.method2033(5051);
                var3.method2350(var23, var22, var24, (byte) -48, false);
            }
        }
        field2492++;
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)V", line = 231)
    public static void method1102(int arg0) {
        if (arg0 != 3) {
            field2489 = 0.39032695F;
        }
        field2495 = null;
        field2496 = null;
        field2499 = null;
    }
}
