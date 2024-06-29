import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class427 extends class176 {

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "[[I")
    public static int[][] field6483 = new int[128][128];

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!kq", name = "q", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!kq", name = "r", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "Lkq;")
    public class427 field6485;

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "Lkq;")
    public class427 field6487;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIII)V", line = 5)
    public static final void method2604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class377.field5760 <= arg0 && arg2 <= class49.field701 && class463.field6924 <= arg3 && class369.field5628 >= arg4) {
            class514.method3070((byte) 116, arg2, arg3, arg4, arg1, arg0);
        } else {
            class380.method2381(true, arg3, arg0, arg4, arg2, arg1);
        }
        field6489++;
        int var6 = -60 % ((-arg5 - 62) / 50);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)V", line = 21)
    public static void method2605(byte arg0) {
        field6483 = null;
        int var1 = 84 % ((63 - arg0) / 45);
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)V", line = 35)
    public final void method2606(int arg0) {
        field6486++;
        if (this.field6487 == null) {
            return;
        }
        if (arg0 != 11129) {
            method2608(48, null);
        }
        this.field6487.field6485 = this.field6485;
        this.field6485.field6487 = this.field6487;
        this.field6487 = null;
        this.field6485 = null;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)V", line = 57)
    public static final void method2607(byte arg0) {
        field6488++;
        class373.method2354((byte) -29);
        class239.method1574(22050, class203.field2716.field1148, (byte) -124, 2);
        class85.field1240 = class513.method3066(class312.field4572, -81, 22050, class85.field1245, 0);
        class85.field1240.method404(0, class355.field5491);
        class406.field6165 = class513.method3066(class312.field4572, -18, 2048, class85.field1245, 1);
        if (arg0 >= 113) {
            class406.field6165.method404(0, class31.field463);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILik;)V", line = 77)
    public static final void method2608(int arg0, class141 arg1) {
        field6484++;
        if (arg0 != 1937244360) {
            field6483 = null;
        }
        arg1.method951(arg0 ^ 0x22941D29);
        int var2 = class350.field5400;
        class96 var3 = class56.field800 = class241.field3398[var2] = new class96();
        var3.field3882 = var2;
        int var4 = arg1.method949(arg0 ^ 0x73780096, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFFB1C) >> 14;
        int var7 = var4 & 0x3FFF;
        var3.field3917[0] = var6 - class331.field5162;
        var3.field1867 = (var3.field3917[0] << 7) + (var3.method637((byte) -25) << 6);
        var3.field3915[0] = var7 - class328.field5099;
        var3.field1862 = (var3.field3915[0] << 7) + (var3.method637((byte) 95) << 6);
        class367.field5618 = var3.field1866 = var5;
        if (class391.field5980[var2] != null) {
            var3.method641(class391.field5980[var2], (byte) 42);
        }
        class20.field310 = 0;
        class55.field778[class20.field310++] = var2;
        class107.field1523[var2] = 0;
        class484.field7132 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method949(106, 18);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class317 var13 = class95.field1383[var8] = new class317();
                var13.field4603 = 0;
                var13.field4606 = (var10 << 28) + (var11 << 14) + var12;
                var13.field4602 = -1;
                var13.field4605 = false;
                class521.field7667[class484.field7132++] = var8;
                class107.field1523[var8] = 0;
            }
        }
        arg1.method952(arg0 ^ 0x737800FA);
    }
}
