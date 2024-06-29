import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public abstract class class304 extends class484 {

    @OriginalMember(owner = "client!or", name = "i", descriptor = "I")
    public int field4781;

    @OriginalMember(owner = "client!or", name = "r", descriptor = "I")
    public int field4790;

    @OriginalMember(owner = "client!or", name = "n", descriptor = "I")
    public int field4786;

    @OriginalMember(owner = "client!or", name = "p", descriptor = "I")
    public int field4788;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "I")
    public int field4777;

    @OriginalMember(owner = "client!or", name = "s", descriptor = "I")
    public int field4791;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "I")
    public int field4782;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "Z")
    public static boolean field4778 = false;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!or", name = "h", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!or", name = "k", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!or", name = "l", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!or", name = "o", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!or", name = "q", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILza;IZBILbm;)V")
    public final void method938(int arg0, class497 arg1, int arg2, boolean arg3, byte arg4, int arg5, class484 arg6) {
        field4785++;
        int var8 = 72 % ((arg4 - 27) / 32);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(Z)Z")
    public final boolean method936(boolean arg0) {
        field4776++;
        if (arg0) {
            method2051((byte) -7);
        }
        return false;
    }

    @OriginalMember(owner = "client!or", name = "e", descriptor = "(B)V")
    public static final void method2051(byte arg0) {
        field4780++;
        class456 var1 = class233.method1654(0, 15, 122);
        var1.method2862(0);
        if (arg0 < 96) {
            field4789 = 85;
        }
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(I)I")
    public abstract int method98(int arg0);

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V")
    public final void method934(int arg0) {
        field4787++;
        if (arg0 == 287) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZLjava/lang/String;IJ)V")
    public static final void method2052(boolean arg0, String arg1, int arg2, long arg3) {
        field4779++;
        if (arg0) {
            class415.method2652(true);
            if (class345.field5379.equals("")) {
                class271.field4327 = 39;
                return;
            }
        }
        class208 var5 = new class208(128);
        var5.method1479((byte) -103, 10);
        var5.method1437((int) (Math.random() * 65535.0D), 0);
        var5.method1439(arg3, arg2 ^ 0xFFFFFFDF);
        var5.method1437(class348.field5403, 0);
        var5.method1477(arg2 + 65279, (int) (Math.random() * 9.9999999E7D));
        var5.method1458(arg1, (byte) 78);
        var5.method1477(65280, (int) (Math.random() * 9.9999999E7D));
        if (arg0) {
            var5.method1439(class335.method2229(class345.field5379, 37), arg2 ^ 0x33);
            try {
                var5.method1439(Long.parseLong(class296.field4668), -79);
            } catch (Exception var6) {
                class271.field4327 = 39;
                return;
            }
        } else {
            var5.method1477(65280, (int) (Math.random() * 9.9999999E7D));
            var5.method1477(65280, (int) (Math.random() * 9.9999999E7D));
            var5.method1477(65280, (int) (Math.random() * 9.9999999E7D));
            var5.method1477(65280, (int) (Math.random() * 9.9999999E7D));
        }
        var5.method1477(65280, (int) (Math.random() * 9.9999999E7D));
        var5.method1449(0, class75.field1123, class440.field6824);
        class170.field2488.field3162 = 0;
        class170.field2488.method1479((byte) -87, arg0 ? class432.field6530.field4683 : class432.field6527.field4683);
        class170.field2488.method1437(var5.field3162 + 28, 0);
        class170.field2488.method1437(600, 0);
        class170.field2488.method1479((byte) -99, class12.field131);
        class170.field2488.method1479((byte) -104, class516.field7674.field3873);
        class531.method3155(24, class170.field2488);
        class170.field2488.method1474(var5.field3193, 0, var5.field3162, (byte) -59);
        class271.field4327 = -3;
        class457.field7048 = arg2;
        class360.field5582 = 0;
        class76.field1141 = 0;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "([I[Ljava/lang/Object;I)V")
    public static final void method2053(int[] arg0, Object[] arg1, int arg2) {
        if (arg2 >= -4) {
            method2052(true, null, 37, 47L);
        }
        field4783++;
        class161.method985(arg0.length - 1, arg1, 0, arg0, 46);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lpb;I)[Lkq;")
    public static final class534[] method2054(class2 arg0, int arg1) {
        field4784++;
        if (!arg0.method12((byte) 62)) {
            return new class534[0];
        }
        class495 var2 = arg0.method26((byte) 36);
        while (var2.field7458 == 0) {
            class208.method1464((byte) -61, 10L);
        }
        if (var2.field7458 == 2) {
            return new class534[0];
        }
        int[] var3 = (int[]) var2.field7462;
        class534[] var4 = new class534[var3.length >> 2];
        if (arg1 >= -81) {
            field4789 = 40;
        }
        for (int var5 = 0; var5 < var4.length; var5++) {
            class534 var6 = new class534();
            var4[var5] = var6;
            var6.field7824 = var3[var5 << 2];
            var6.field7825 = var3[(var5 << 2) + 1];
            var6.field7827 = var3[(var5 << 2) + 2];
            var6.field7826 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(IIIIIII)V")
    public class304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4781 = arg4;
        this.field4790 = arg2;
        this.field4786 = arg6;
        this.field4788 = arg0;
        this.field4777 = arg5;
        this.field4791 = arg3;
        this.field4782 = arg1;
    }
}
