import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class210 extends class456 {

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    private int field3153 = 4096;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
    private int field3158 = 0;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
    public static int field3159;

    static {
        new class332("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V", line = 4)
    public class210() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBLre;)V", line = 22)
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (arg1 == 55) {
            if (~arg0 != -1) {
                if (~arg0 == -2) {
                    this.field3153 = arg2.method2631(2530);
                }
            } else {
                this.field3158 = arg2.method2631(arg1 ^ 2517);
            }
            ++field3156;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLui;Lui;)V", line = 56)
    public static final void method1415(boolean arg0, class451 arg1, class451 arg2) {
        class1.field18 = arg2;
        if (arg0) {
            method1416(-75, 27, true, -73, (class356) null, -42, -102);
        }
        class452.field6420 = arg1;
        ++field3154;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZILpp;II)V", line = 68)
    public static final void method1416(int arg0, int arg1, boolean arg2, int arg3, class356 arg4, int arg5, int arg6) {
        ++field3157;
        if (class198.field2984 < 50) {
            if (arg4 != null && arg4.field5417 != null && arg0 < arg4.field5417.length && arg4.field5417[arg0] != null) {
                int var7 = arg4.field5417[arg0][0];
                int var8 = var7 >> 8;
                if (arg5 != 15806) {
                    method1416(-18, -9, false, 79, (class356) null, 40, -99);
                }
                int var9 = var7 >> 5 & 7;
                int var10 = 31 & var7;
                if (arg4.field5417[arg0].length > 1) {
                    int var11 = (int) (Math.random() * (double) arg4.field5417[arg0].length);
                    if (var11 > 0) {
                        var8 = arg4.field5417[arg0][var11];
                    }
                }
                if (~var10 == -1) {
                    if (arg2) {
                        class68.method601(var8, 255, 0, var9, true);
                    }
                } else if (class337.field5038.field3934 != 0) {
                    class78.field1107[class198.field2984] = var8;
                    class419.field6024[class198.field2984] = var9;
                    class385.field5696[class198.field2984] = 0;
                    class283.field4297[class198.field2984] = null;
                    class37.field476[class198.field2984] = 255;
                    int var12 = (arg1 + -64) / 128;
                    int var13 = (arg6 + -64) / 128;
                    class325.field4876[class198.field2984] = (arg3 << 24) + (var12 << 16) + (var13 << 8) + var10;
                    ++class198.field2984;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)[I", line = 129)
    public final int[] method33(int arg0, int arg1) {
        ++field3159;
        if (arg0 != -1) {
            this.method210(-30, (byte) 120, (class446) null);
        }
        int[] var3 = super.field6466.method2533(true, arg1);
        if (super.field6466.field6153) {
            int[] var4 = this.method2707(arg1, -31797, 0);
            for (int var5 = 0; var5 < class156.field2169; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field3158 >= ~var6 && this.field3153 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }
}
