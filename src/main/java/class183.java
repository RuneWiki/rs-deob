import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class183 {

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public int field2784 = class109.method873((byte) -113);

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public int field2776;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "Ljava/lang/String;")
    public String field2790;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "Ljava/lang/String;")
    public String field2789;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public int field2779;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public int field2785;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public int field2778;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "Ljava/lang/String;")
    public String field2774;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Ljava/lang/String;")
    public String field2783;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Ljava/lang/String;")
    public String field2777;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "[C")
    public static char[] field2787 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field2786 = 1;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/lang/String;ZLjava/lang/String;I)V")
    public static final void method1323(int arg0, String arg1, boolean arg2, String arg3, int arg4) {
        class505.method2957(arg1, arg3, -1, (byte) 124, arg4, true, arg2);
        field2782++;
        if (arg0 >= -76) {
            field2780 = 42;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method1324(int arg0) {
        if (arg0 == -17262) {
            field2787 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IILjava/lang/String;Ljava/lang/String;)V")
    public final void method1325(String arg0, String arg1, int arg2, int arg3, String arg4, int arg5, int arg6, String arg7, String arg8) {
        this.field2784 = class109.method873((byte) -106);
        field2781++;
        this.field2790 = arg0;
        int var10 = -43 / ((arg2 - 10) / 35);
        this.field2778 = class594.field8494;
        this.field2779 = arg6;
        this.field2785 = arg5;
        this.field2783 = arg7;
        this.field2777 = arg4;
        this.field2774 = arg1;
        this.field2776 = arg3;
        this.field2789 = arg8;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V")
    public static final void method1326(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2775++;
        int var5 = class469.field6395;
        int var6 = class217.field3168;
        if (class593.field8489) {
            var5 += class45.method342(false);
            var6 += class87.method771(-2);
        }
        if (class775.field10664 == 1) {
            class85 var7 = class447.field6168[class785.field10756 / 100];
            var7.method759(var5 - 8, var6 - 8);
            class528.method3090(3985, var6 + var7.method14() - 8, var6 + -8, var5 - 8, var7.method11() + -8 + var5);
        }
        if (class775.field10664 == 2) {
            class85 var8 = class447.field6168[class785.field10756 / 100 + 4];
            var8.method759(var5 - 8, var6 + -8);
            class528.method3090(3985, var6 - (8 - var8.method14()), var6 + -8, var5 - 8, var8.method11() + var5 + -8);
        }
        class770.method4259((byte) 10);
        if (arg0 != 4) {
            field2780 = -74;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
    public static final void method1327(boolean arg0) {
        field2788++;
        if (!arg0) {
            method1323(-21, null, true, null, 33);
        }
        while (class48.field674.method2229((byte) 91, class549.field7634) >= 15) {
            int var1 = class48.field674.method2222(8, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            class647 var3 = (class647) class486.field6697.method4253((long) var1, -1);
            if (var3 == null) {
                class506 var4 = new class506();
                var4.field4051 = var1;
                var3 = new class647(var4);
                class486.field6697.method4252(!arg0, var3, (long) var1);
                var2 = true;
                class654.field9252[class51.field731++] = var3;
            }
            class506 var5 = var3.field9191;
            class350.field4963[class657.field9270++] = var1;
            var5.field4087 = class302.field4342;
            if (var5.field6964 != null && var5.field6964.method1297(-106)) {
                class580.method3407(var5, -30920);
            }
            int var6 = class48.field674.method2222(8, 2);
            int var7 = class48.field674.method2222(8, 1);
            int var8 = class48.field674.method2222(8, 1);
            if (var8 == 1) {
                class4.field58[class34.field423++] = var1;
            }
            int var9 = class48.field674.method2222(8, 5);
            var5.method2965(524288, class677.field9511.method3700(32501, class48.field674.method2222(8, 14)));
            if (var9 > 15) {
                var9 -= 32;
            }
            int var10 = (class48.field674.method2222(8, 3) + 4 & 0x36200007) << 11;
            int var11 = class48.field674.method2222(8, 5);
            if (var11 > 15) {
                var11 -= 32;
            }
            var5.method1798(var5.field6964.field2737, false);
            var5.field4117 = var5.field6964.field2676 << 3;
            if (var2) {
                var5.method1795(var10, 0, true);
            }
            var5.method2962(var6, class719.field10041.field4142[0] + var11, class719.field10041.field4136[0] + var9, var5.method209(true), -570433240, ~var7 == -2);
            if (var5.field6964.method1297(-105)) {
                class616.method3542(var5, null, 0, var5.field4136[0], null, (byte) 127, var5.field10361, var5.field4142[0]);
            }
        }
        class48.field674.method2223(false);
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class183(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field2776 = arg6;
        this.field2790 = arg2;
        this.field2789 = arg4;
        this.field2779 = arg0;
        this.field2785 = arg1;
        this.field2778 = class594.field8494;
        this.field2774 = arg5;
        this.field2783 = arg7;
        this.field2777 = arg3;
    }
}
