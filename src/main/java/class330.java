import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class330 extends class119 {

    @OriginalMember(owner = "client!si", name = "k", descriptor = "Ljn;")
    public static class409 field4902 = new class409("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!si", name = "o", descriptor = "Lvq;")
    public static class24 field4906 = new class24(5, -2);

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "[I")
    public static int[] field4905;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
    public static void method2155(int arg0) {
        field4902 = null;
        field4906 = null;
        field4905 = null;
        if (arg0 != 32701) {
            field4902 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILjb;ZI)J")
    public static final long method2156(int arg0, class438 arg1, boolean arg2, int arg3) {
        field4903++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class178 var10 = class450.method2785(arg1.method9((byte) 108), (byte) 87);
        long var11 = (long) (arg3 << 7 | arg0 | arg1.method6(-20839) << 14 | arg1.method1(-101) << 20 | 0x40000000);
        if (var10.field2479 == 0) {
            var11 |= var8;
        }
        if (arg2) {
            method2157(-87, 112);
        }
        if (var10.field2529 == 1) {
            var11 |= var4;
        }
        if (var10.field2466) {
            var11 |= var6;
        }
        return var11 | (long) arg1.method9((byte) 112) << 32;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
    public static final void method2157(int arg0, int arg1) {
        field4904++;
        if (!class79.field990) {
            arg0 = -1;
        }
        if (class421.field6096 == arg0) {
            return;
        }
        if (arg0 != arg1) {
            class52 var2 = class42.method362(arg0, 100);
            class144 var3 = var2.method403((byte) -19);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class267.field3963.method2196(new Point(var2.field653, var2.field647), (byte) 98, class270.field4004, var3.method999(), var3.method1002(), var3.method998());
                class421.field6096 = arg0;
            }
        }
        if (arg0 == -1 && class421.field6096 != -1) {
            class267.field3963.method2196(new Point(), (byte) 87, class270.field4004, (int[]) null, -1, -1);
            class421.field6096 = -1;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(IIII)I")
    public static final int method2158(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 > 243) {
            arg1 >>= 0x4;
        } else if (arg3 > 217) {
            arg1 >>= 0x3;
        } else if (arg3 > 192) {
            arg1 >>= 0x2;
        } else if (arg3 > 179) {
            arg1 >>= 0x1;
        }
        if (arg2 != -30330) {
            method2156(-9, (class438) null, true, -105);
        }
        field4901++;
        return ((arg0 >> 2 & 0x3F) << 10) + (arg1 >> 5 << 7) + (arg3 >> 1);
    }
}
