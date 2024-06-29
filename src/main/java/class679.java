import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class679 {

    @OriginalMember(owner = "client!kv", name = "r", descriptor = "Llc;")
    public static class435 field9647 = new class435(114, 4);

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "B")
    public byte field9634;

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "B")
    public byte field9637;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "B")
    public byte field9638;

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "B")
    public byte field9640;

    @OriginalMember(owner = "client!kv", name = "q", descriptor = "B")
    public byte field9646;

    @OriginalMember(owner = "client!kv", name = "s", descriptor = "B")
    public byte field9648;

    @OriginalMember(owner = "client!kv", name = "v", descriptor = "B")
    public byte field9651;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
    public int field9632;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    public static int field9633;

    @OriginalMember(owner = "client!kv", name = "n", descriptor = "I")
    public static int field9643;

    @OriginalMember(owner = "client!kv", name = "p", descriptor = "I")
    public int field9645;

    @OriginalMember(owner = "client!kv", name = "t", descriptor = "I")
    public int field9649;

    @OriginalMember(owner = "client!kv", name = "u", descriptor = "Lla;")
    public static class423 field9650;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "S")
    public short field9631;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "Z")
    public boolean field9630;

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "Z")
    public boolean field9635;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "Z")
    public boolean field9636;

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "Z")
    public boolean field9639;

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "Z")
    public boolean field9641;

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "Z")
    public boolean field9642;

    @OriginalMember(owner = "client!kv", name = "o", descriptor = "Z")
    public boolean field9644;

    @OriginalMember(owner = "client!kv", name = "w", descriptor = "Z")
    public boolean field9652;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)Z", line = 13)
    public static final boolean method3859(int arg0, int arg1, int arg2) {
        if (arg2 == -1) {
            field9633++;
            return (arg0 & 0x84080) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V", line = 29)
    public static final void method3860(int arg0) {
        field9643++;
        if (arg0 != 778) {
            method3861(-73);
        }
        for (int var1 = 0; var1 < class172.field2414; var1++) {
            int var2 = class597.field8490[var1];
            class571 var3 = ((class63) class389.field5608.method4020((long) var2, (byte) -58)).field1004;
            int var4 = class352.field5213.method2886(true);
            if ((var4 & 0x1) != 0) {
                var4 += class352.field5213.method2886(true) << 8;
            }
            if ((var4 & 0x10) != 0) {
                var3.field4632 = class352.field5213.method2894(-13192);
                var3.field4579 = 100;
            }
            if ((var4 & 0x1000) != 0) {
                var3.field4549 = class352.field5213.method2911((byte) -3);
                var3.field4619 = class352.field5213.method2906(arg0 ^ 0x38A);
                var3.field4614 = class352.field5213.method2915(arg0 ^ 0xFFFFFC8C);
                var3.field4633 = (byte) class352.field5213.method2920(-27357);
                var3.field4581 = class703.field9918 + class352.field5213.method2897(65280);
                var3.field4618 = class703.field9918 + class352.field5213.method2892((byte) 51);
            }
            if ((var4 & 0x40) != 0) {
                int var5 = class352.field5213.method2889(-18098);
                int var6 = class352.field5213.method2920(arg0 - 28135);
                var3.method2054(var5, var6, 103, class703.field9918);
                var3.field4589 = class703.field9918 + 300;
                var3.field4550 = class352.field5213.method2904(arg0 ^ 0x34F);
            }
            if ((var4 & 0x2000) != 0) {
                int var7 = class352.field5213.method2920(arg0 ^ 0xFFFF9629);
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                for (int var10 = 0; var10 < var7; var10++) {
                    int var11 = class352.field5213.method2882(-1);
                    if ((var11 & 0xC000) == 49152) {
                        int var12 = class352.field5213.method2897(65280);
                        var8[var10] = class430.method2658(var11 << 16, var12);
                    } else {
                        var8[var10] = var11;
                    }
                    var9[var10] = class352.field5213.method2897(class639.method3689(arg0, 64522));
                }
                var3.method2065(var9, var8, -1);
            }
            if ((var4 & 0x2) != 0) {
                var3.field8222 = class352.field5213.method2883(-2);
                var3.field8237 = class352.field5213.method2897(65280);
            }
            if ((var4 & 0x8) != 0) {
                int var13 = class352.field5213.method2882(-1);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = class352.field5213.method2884((byte) -37);
                int var15 = class352.field5213.method2920(-27357);
                int var16 = var15 & 0x7;
                int var17 = (var15 & 0x7A) >> 3;
                if (var17 == 15) {
                    var17 = -1;
                }
                var3.method2056(var14, false, var16, var13, var17, (byte) -119);
            }
            if ((var4 & 0x4) != 0) {
                if (var3.field8235.method3164(true)) {
                    class45.method447((byte) -81, var3);
                }
                var3.method3395(class288.field4000.method2822(class352.field5213.method2897(arg0 + 64502), 50), 0);
                var3.method2066(var3.field8235.field7512, true);
                var3.field4571 = var3.field8235.field7516 << 3;
                if (var3.field8235.method3164(true)) {
                    class709.method3965(var3.field4645[0], var3, var3.field4646[0], null, null, var3.field3920, (byte) -14, 0);
                }
            }
            if ((var4 & 0x80) != 0) {
                int[] var18 = new int[4];
                for (int var19 = 0; var19 < 4; var19++) {
                    var18[var19] = class352.field5213.method2883(arg0 - 780);
                    if (var18[var19] == 65535) {
                        var18[var19] = -1;
                    }
                }
                int var20 = class352.field5213.method2904(62);
                class132.method935(0, var20, var3, var18);
            }
            if ((var4 & 0x100) != 0) {
                int var21 = class352.field5213.method2889(-18098);
                int var22 = class352.field5213.method2886(true);
                var3.method2054(var21, var22, 101, class703.field9918);
            }
            if ((var4 & 0x800) != 0) {
                int var23 = class352.field5213.method2882(-1);
                if (var23 == 65535) {
                    var23 = -1;
                }
                int var24 = class352.field5213.method2885(-120);
                int var25 = class352.field5213.method2920(-27357);
                int var26 = var25 & 0x7;
                int var27 = (var25 & 0x7F) >> 3;
                if (var27 == 15) {
                    var27 = -1;
                }
                var3.method2056(var24, true, var26, var23, var27, (byte) -92);
            }
            if ((var4 & 0x20) != 0) {
                var3.field4576 = class352.field5213.method2892((byte) 51);
                if (var3.field4576 == 65535) {
                    var3.field4576 = -1;
                }
            }
            if ((var4 & 0x200) != 0) {
                int var28 = class352.field5213.method2897(arg0 + 64502);
                var3.field4537 = class352.field5213.method2886(true);
                var3.field4572 = class352.field5213.method2920(-27357);
                var3.field4573 = var28 & 0x7FFF;
                var3.field4556 = (var28 & 0x8000) != 0;
                var3.field4578 = class703.field9918 + var3.field4537 + var3.field4573;
            }
            if ((var4 & 0x400) != 0) {
                int var29 = class352.field5213.method2904(110);
                int[] var30 = new int[var29];
                int[] var31 = new int[var29];
                int[] var32 = new int[var29];
                for (int var33 = 0; var33 < var29; var33++) {
                    int var34 = class352.field5213.method2892((byte) 51);
                    if (var34 == 65535) {
                        var34 = -1;
                    }
                    var30[var33] = var34;
                    var31[var33] = class352.field5213.method2904(43);
                    var32[var33] = class352.field5213.method2882(-1);
                }
                class572.method3401(var32, var31, false, var30, var3);
            }
            if ((var4 & 0x4000) != 0) {
                var3.field4582 = class352.field5213.method2900(-58);
                var3.field4559 = class352.field5213.method2911((byte) -128);
                var3.field4580 = class352.field5213.method2915(-119);
                var3.field4626 = class352.field5213.method2906(128);
                var3.field4628 = class352.field5213.method2892((byte) 51) + class703.field9918;
                var3.field4586 = class352.field5213.method2892((byte) 51) + class703.field9918;
                var3.field4590 = class352.field5213.method2924((byte) -90);
                var3.field4582 += var3.field4646[0];
                var3.field4626 += var3.field4645[0];
                var3.field4641 = 0;
                var3.field4580 += var3.field4646[0];
                var3.field4637 = 1;
                var3.field4559 += var3.field4645[0];
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(I)V", line = 300)
    public static void method3861(int arg0) {
        field9647 = null;
        if (arg0 != 0) {
            method3860(-10);
        }
        field9650 = null;
    }
}
