import java.awt.Rectangle;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class31 extends class189 {

    @OriginalMember(owner = "client!i", name = "B", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field498;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!i", name = "y", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!i", name = "z", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!i", name = "C", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(FFI[BIILpj;IFFFIB)V")
    public static final void method215(float arg0, float arg1, int arg2, byte[] arg3, int arg4, int arg5, class101 arg6, int arg7, float arg8, float arg9, float arg10, int arg11, byte arg12) {
        int var13 = -72 / ((arg12 - 84) / 42);
        for (int var14 = 0; var14 < arg2; var14++) {
            class65.method574(arg5, arg10, (byte) -83, arg11, arg7, arg3, arg9, arg0, arg1, arg2, arg6, arg8, var14, arg4);
            arg7 += arg4 * arg5;
        }
        field495++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method216(int arg0, long arg1) {
        class49.field993.setTime(new Date(arg1));
        field493++;
        int var3 = class49.field993.get(7);
        int var4 = class49.field993.get(5);
        int var5 = class49.field993.get(2);
        int var6 = class49.field993.get(1);
        int var7 = class49.field993.get(11);
        int var8 = class49.field993.get(12);
        if (arg0 == 16017) {
            int var9 = class49.field993.get(13);
            return class485.field7131[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class348.field5179[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)Z")
    public static final boolean method217(int arg0, int arg1, int arg2) {
        if (arg2 != -20008) {
            field499 = -6;
        }
        field497++;
        return (arg1 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(Z)V")
    public static final void method218(boolean arg0) {
        class509.field7425 = new String[500];
        field494++;
        class150.field2479 = class398.field6038.field6963 + class398.field6038.field6972 + 2;
        class162.field2597 = class272.field4126.field6972 + class272.field4126.field6963 + 2;
        if (arg0) {
            field498 = null;
        }
        for (int var1 = 0; var1 < class509.field7425.length; var1++) {
            class509.field7425[var1] = "";
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(III)Z")
    public static final boolean method219(int arg0, int arg1, int arg2) {
        field496++;
        if (arg1 == -1) {
            return class5.method33(true, arg2, arg0) | (arg0 & 0x70000) != 0 || class128.method1006(arg0, arg2, true);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method220(int arg0) {
        field498 = null;
        if (arg0 < 23) {
            method217(-61, 40, 27);
        }
    }

    static {
        new class309(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        field498 = new Rectangle[100];
        for (int var0 = 0; var0 < 100; var0++) {
            field498[var0] = new Rectangle();
        }
    }
}
