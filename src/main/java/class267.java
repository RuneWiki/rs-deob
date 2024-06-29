import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public abstract class class267 extends class5 {

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
    public int field3711;

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
    public int field3715;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "[I")
    public int[] field3717;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method591(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1705(String arg0, int arg1) {
        field3716++;
        class407.field6188 = arg0;
        if (arg1 != 4096) {
            field3713 = -29;
        }
        if (class312.field4572.field7381 == null) {
            return;
        }
        try {
            String var2 = class312.field4572.field7381.getParameter("cookieprefix");
            String var3 = class312.field4572.field7381.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class360.method2300((byte) 109, class58.method427((byte) -19) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class305.method1918(class312.field4572.field7381, (byte) 30, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IILi;IIJLga;II)V")
    public static final void method1706(int arg0, int arg1, class30 arg2, int arg3, int arg4, long arg5, class282 arg6, int arg7, int arg8) {
        field3714++;
        int var10 = -52 / ((-arg0 - 17) / 47);
        int var11 = arg7 * arg7 + arg8 * arg8;
        if (((long) var11) > arg5) {
            return;
        }
        int var12 = Math.min(arg6.field3991 / 2, arg6.field4043 / 2);
        if ((var12 * var12) >= var11) {
            class429.method2619(arg8, arg6, arg7, class145.field1933[arg1], arg2, arg3, arg4, -128);
            return;
        }
        var12 -= 10;
        int var13;
        if (class340.field5269 == 4) {
            var13 = (int) class53.field744 & 0x3FFF;
        } else {
            var13 = (int) class53.field744 + class303.field4433 & 0x3FFF;
        }
        int var14 = class428.field6502[var13];
        int var15 = class428.field6501[var13];
        if (class340.field5269 != 4) {
            var14 = var14 * 256 / (class514.field7549 + 256);
            var15 = var15 * 256 / (class514.field7549 + 256);
        }
        int var16 = arg7 * var15 + arg8 * var14 >> 15;
        int var17 = arg8 * var15 - (arg7 * var14) >> 15;
        double var18 = Math.atan2((double) var16, (double) var17);
        int var20 = (int) (Math.sin(var18) * (double) var12);
        int var21 = (int) (Math.cos(var18) * (double) var12);
        class478.field7075[arg1].method2204((float) arg6.field3991 / 2.0F + (float) arg3 + (float) var20, (float) arg6.field4043 / 2.0F + (float) arg4 + (float) (-var21), 4096, (int) (-var18 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public abstract void method590(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public abstract void method592(int arg0, Canvas arg1);
}
