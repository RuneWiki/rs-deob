import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public abstract class class19 {

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Ljava/lang/String;")
    public static String field281 = "Hidden";

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "Z")
    public static boolean field291 = true;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public int field282;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public int field290;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "Led;")
    public static class186 field286;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field284;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "[I")
    public int[] field292;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public final void method176(byte arg0) {
        field287++;
        if (arg0 == 64) {
            class211.method1433(this.field292, this.field290, this.field282);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public abstract void method177(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V")
    public static void method178(byte arg0) {
        field286 = null;
        if (arg0 == -104) {
            field281 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static final void method179(int arg0) {
        class193.field3066 = null;
        if (arg0 != 8) {
            field280 = -100;
        }
        class94.field1601 = null;
        class198.field3123 = null;
        class171.field2679 = null;
        class108.field1779 = null;
        field279++;
        class28.field390 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILjava/awt/Component;IZ)V")
    public abstract void method180(int arg0, Component arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZII)Z")
    public static final boolean method181(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field281 = null;
        }
        class193 var3 = class69.method501(0, arg1);
        field289++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method1305((byte) -51, arg2);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method182(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
    public static final void method183(int arg0) {
        class25.field331++;
        field285++;
        if (arg0 > -86) {
            field286 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    protected class19() {
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIII)V")
    public static final void method184(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 11211) {
            method181(false, -5, 119);
        }
        class41 var5 = class221.method1492((byte) -42, arg3, 10);
        field288++;
        var5.method301(8792);
        var5.field584 = arg0;
        var5.field583 = arg1;
        var5.field592 = arg4;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method185(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field283++;
        if (arg1 == 36 && class53.method394(false, arg7)) {
            client.method1052(class193.field3052[arg7], -1, arg5, arg4, arg2, arg6, arg0, arg3);
        }
    }
}
