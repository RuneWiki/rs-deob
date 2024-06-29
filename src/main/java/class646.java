import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class646 {

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "Lsb;")
    public static class305 field9118 = new class305(32, 18);

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "[Lkk;")
    public static class159[] field9121 = new class159[75];

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public int field9109;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public int field9110;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field9111;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public int field9112;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public int field9113;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public int field9114;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public int field9116;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public int field9117;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public static int field9119;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public static int field9120;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public static int field9123;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "[B")
    public byte[] field9115;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "[B")
    public byte[] field9122;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIBIII)V", line = 8)
    public static final void method3617(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field9111++;
        int var6 = arg1 - arg3;
        int var7 = arg5 - arg4;
        if (var7 == 0) {
            if (var6 != 0) {
                class603.method3372(arg4, arg3, arg2 ^ 0xFFFFFFA6, arg1, arg0);
            }
        } else if (var6 == 0) {
            class443.method2567(arg5, arg3, arg0, 16767564, arg4);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg4;
                int var10 = arg5;
                arg4 = arg3;
                arg3 = var9;
                arg5 = arg1;
                arg1 = var10;
            }
            if (arg5 < arg4) {
                int var11 = arg4;
                int var12 = arg3;
                arg4 = arg5;
                arg5 = var11;
                arg3 = arg1;
                arg1 = var12;
            }
            int var13 = arg3;
            int var14 = arg5 - arg4;
            if (arg2 != -92) {
                field9118 = null;
            }
            int var15 = arg1 - arg3;
            int var16 = -(var14 >> 1);
            int var17 = arg3 < arg1 ? 1 : -1;
            if (var15 < 0) {
                var15 = -var15;
            }
            if (var8) {
                for (int var18 = arg4; var18 <= arg5; var18++) {
                    class557.field7954[var18][var13] = arg0;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg4; var19 <= arg5; var19++) {
                    class557.field7954[var13][var19] = arg0;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lwp;III)V", line = 132)
    public static final void method3618(class452 arg0, int arg1, int arg2, int arg3) {
        field9120++;
        if (arg0 == null) {
            return;
        }
        if (arg0.field6377 != null) {
            class213 var4 = new class213();
            var4.field2592 = arg0;
            var4.field2587 = arg0.field6377;
            class281.method1642(var4);
        }
        class672.field9355 = arg0.field6434;
        class616.field8673 = arg3;
        if (arg1 != 0) {
            return;
        }
        class128.field1439 = arg0.field6339;
        class348.field4665 = true;
        class512.field7345 = arg2;
        class465.field6641 = arg0.field6360;
        class185.field2084 = arg0.field6372;
        class178.field1992 = arg0.field6411;
        class130.method741(arg0, arg1 + 26034);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V", line = 165)
    public static void method3619(byte arg0) {
        int var1 = -103 % ((-arg0 - 42) / 32);
        field9121 = null;
        field9118 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIII)V", line = 181)
    public static final void method3620(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -1) {
            method3619((byte) -95);
        }
        field9119++;
        class76 var5 = class3.method28(8, (byte) 42, arg1);
        var5.method403((byte) 117);
        var5.field780 = arg0;
        var5.field789 = arg4;
        var5.field785 = arg3;
    }
}
