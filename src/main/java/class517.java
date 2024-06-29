import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class517 extends class512 {

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    private int field7612;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    private int field7618;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    private int field7616;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    private int field7620;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "Lbg;")
    public static class324 field7614 = new class324(52, 8);

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "Lsl;")
    public static class318 field7623 = new class318(41, 3);

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field7613;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field7615;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field7619;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public static int field7621;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public static int field7622;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "[I")
    public static int[] field7617;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)V")
    public static void method3072(boolean arg0) {
        if (!arg0) {
            field7617 = null;
            field7614 = null;
            field7623 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILjava/awt/Canvas;ILet;ILga;)Lya;")
    public static final class38 method3073(int arg0, Canvas arg1, int arg2, class419 arg3, int arg4, class277 arg5) {
        ++field7621;
        return arg2 != -3210 ? null : new class365(arg0, arg1, arg5, arg4, arg3);
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(III)V")
    public final void method1251(int arg0, int arg1, int arg2) {
        ++field7622;
        int var4 = this.field7612 * arg2 >> 12;
        int var5 = this.field7618 * arg2 >> 12;
        int var6 = this.field7620 * arg0 >> 12;
        int var7 = this.field7616 * arg0 >> 12;
        if (arg1 == 4) {
            class242.method1597((byte) -125, var6, var5, super.field7554, var4, var7);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(JB)V")
    public static final void method3074(long arg0, byte arg1) {
        if (arg1 >= 22) {
            ++field7613;
            class472.field6970.field827 = 0;
            class472.field6970.method638(255, class215.field3090.field3575);
            class472.field6970.method591(arg0, (byte) -48);
            class175.field2485 = 0;
            class4.field62 = 0;
            class72.field989 = 1;
            class247.field3669 = -3;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(III)V")
    public final void method1252(int arg0, int arg1, int arg2) {
        ++field7615;
        int var4 = this.field7612 * arg2 >> 12;
        if (arg0 > -78) {
            field7623 = null;
        }
        int var5 = this.field7618 * arg2 >> 12;
        int var6 = this.field7620 * arg1 >> 12;
        int var7 = this.field7616 * arg1 >> 12;
        class10.method66(super.field7550, super.field7552, var4, super.field7554, var6, var5, 19173, var7);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lya;)V")
    public static final void method3075(class38 arg0) {
        for (int var1 = class168.field2378; var1 < class308.field4395; ++var1) {
            for (int var2 = 0; var2 < class241.field3562; ++var2) {
                for (int var3 = 0; var3 < class497.field7388; ++var3) {
                    class148 var4 = class422.field6240[var1][var2][var3];
                    if (var4 != null) {
                        class235 var5 = var4.field2098;
                        class235 var6 = var4.field2078;
                        if (var5 != null && var5.method32((byte) 108)) {
                            class487.method2926(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method32((byte) 123)) {
                                class487.method2926(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method25(0, 0, var5, (byte) -99, false, arg0, 0);
                                var6.method29(102);
                            }
                            var5.method29(-101);
                        }
                        for (class480 var7 = var4.field2086; var7 != null; var7 = var7.field7058) {
                            class431 var9 = var7.field7054;
                            if (var9 != null && var9.method32((byte) 109)) {
                                class487.method2926(arg0, var9, var1, var2, var3, var9.field6340 - var9.field6332 + 1, var9.field6337 - var9.field6339 + 1);
                                var9.method29(-92);
                            }
                        }
                        class363 var8 = var4.field2082;
                        if (var8 != null && var8.method32((byte) 123)) {
                            class405.method2490(arg0, var8, var1, var2, var3);
                            var8.method29(8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(IIIIIII)V")
    public class517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field7612 = arg0;
        this.field7618 = arg2;
        this.field7616 = arg3;
        this.field7620 = arg1;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
    public final void method1249(int arg0, int arg1, int arg2) {
        ++field7619;
        if (arg0 != 24245) {
            field7614 = null;
        }
    }
}
