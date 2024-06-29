import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class271 extends class319 {

    @OriginalMember(owner = "client!kv", name = "p", descriptor = "I")
    private int field3816;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
    private int field3809;

    @OriginalMember(owner = "client!kv", name = "q", descriptor = "I")
    private int field3817;

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
    private int field3812;

    @OriginalMember(owner = "client!kv", name = "r", descriptor = "I")
    private int field3818;

    @OriginalMember(owner = "client!kv", name = "o", descriptor = "I")
    private int field3815;

    @OriginalMember(owner = "client!kv", name = "s", descriptor = "Lwga;")
    private class745 field3819;

    @OriginalMember(owner = "client!kv", name = "n", descriptor = "D")
    public static double field3814 = -1.0D;

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!kv", name = "u", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!kv", name = "t", descriptor = "Lnj;")
    private class247 field3820;

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "[I")
    public static int[] field3813;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)Lnj;", line = 9)
    public final class247 method1792(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field3821++;
        if (this.field3820 == null) {
            class1.field2[3] = this.field3812;
            class1.field2[1] = this.field3818;
            class1.field2[4] = this.field3809;
            class152 var2 = this.field3819.field1170;
            class1.field2[5] = this.field3815;
            class1.field2[2] = this.field3816;
            class1.field2[0] = this.field3817;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1181(-7953, class1.field2[var5])) {
                    return null;
                }
                class739 var7 = var2.method1180(class1.field2[var5], -6662);
                int var8 = var7.field9941 ? 64 : 128;
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var7.field9947 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class394.field5786[var6] = var2.method1182(false, class1.field2[var6], 1.0F, var4, var4, 81);
            }
            this.field3820 = this.field3819.method2281(class394.field5786, var3, 61, var4);
        }
        return this.field3820;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IILha;Ljava/lang/String;ZIII)V", line = 73)
    public static final void method1793(int arg0, int arg1, class59 arg2, String arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (class345.field4829 == null || class343.field4817 == null) {
            if (class569.field7819.method874(false, class623.field8472) && class569.field7819.method874(false, class630.field8676)) {
                class345.field4829 = arg2.method356(class267.method1780(class569.field7819, class623.field8472, 0), true);
                class267 var8 = class267.method1780(class569.field7819, class630.field8676, 0);
                class343.field4817 = arg2.method356(var8, true);
                var8.method1777();
                class25.field739 = arg2.method356(var8, true);
            } else {
                arg2.method217(arg1, arg5, arg0, arg7, 255 - class99.field1783 << 24 | class231.field3344, 1);
            }
        }
        field3810++;
        if (class345.field4829 != null && class343.field4817 != null) {
            int var9 = (arg0 - class343.field4817.method1626() * 2) / class345.field4829.method1626();
            for (int var10 = 0; var10 < var9; var10++) {
                class345.field4829.method2925(class343.field4817.method1626() + arg1 + class345.field4829.method1626() * var10, arg5);
            }
            class343.field4817.method2925(arg1, arg5);
            class25.field739.method2925(arg1 + arg0 - class25.field739.method1626(), arg5);
        }
        if (!arg4) {
            class168.field2634.method639(arg3, class561.field7747 | 0xFF000000, arg5 + 14, arg1 + 3, -1, -127);
            arg2.method217(arg1, arg5 + arg7, arg0, arg6 - arg7, class231.field3344 | -class99.field1783 + 255 << 24, 1);
        }
    }

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "(I)V", line = 120)
    public static final void method1794(int arg0) {
        field3811++;
        if (class740.field9961) {
            return;
        }
        class286.method1873(arg0 ^ arg0, class690.field9324);
        if (class135.field2273 != null) {
            class286.method1873(0, class135.field2273);
        }
        class740.field9961 = true;
    }

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "(I)V", line = 145)
    public static void method1795(int arg0) {
        if (arg0 < 85) {
            method1794(-124);
        }
        field3813 = null;
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lwga;IIIIII)V", line = 157)
    public class271(class745 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3816 = arg3;
        this.field3809 = arg5;
        this.field3817 = arg1;
        this.field3812 = arg4;
        this.field3818 = arg2;
        this.field3815 = arg6;
        this.field3819 = arg0;
    }
}
