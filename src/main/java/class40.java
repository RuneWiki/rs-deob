import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!v")
public abstract class class40 {

    @OriginalMember(owner = "mapview!v", name = "d", descriptor = "Lt;")
    public static class36 field525 = class3.method8(13631, "Silk Trader");

    @OriginalMember(owner = "mapview!v", name = "g", descriptor = "[I")
    public static int[] field528 = new int[256];

    @OriginalMember(owner = "mapview!v", name = "j", descriptor = "I")
    public static int field531 = 0;

    @OriginalMember(owner = "mapview!v", name = "l", descriptor = "Lt;")
    public static class36 field533 = class3.method8(13631, "details)3dat");

    @OriginalMember(owner = "mapview!v", name = "i", descriptor = "I")
    public static int field530 = 1;

    @OriginalMember(owner = "mapview!v", name = "m", descriptor = "I")
    public static int field534 = -1;

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "J")
    public static volatile long field524 = 0L;

    @OriginalMember(owner = "mapview!v", name = "f", descriptor = "Lt;")
    public static class36 field527 = class3.method8(13631, "fonts");

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "I")
    public int field523;

    @OriginalMember(owner = "mapview!v", name = "e", descriptor = "I")
    public int field526;

    @OriginalMember(owner = "mapview!v", name = "k", descriptor = "Ljava/awt/Image;")
    public Image field532;

    @OriginalMember(owner = "mapview!v", name = "h", descriptor = "[B")
    public static byte[] field529;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "[I")
    public int[] field522;

    @OriginalMember(owner = "mapview!v", name = "n", descriptor = "[Lt;")
    public static class36[] field535;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(ILk;Lt;Lt;)[Lqa;", line = 7)
    public static final class31[] method258(int arg0, class19 arg1, class36 arg2, class36 arg3) {
        int var4 = arg1.method102(-1, arg3);
        int var5 = arg1.method99(arg2, arg0, var4);
        return class19.method98(var4, arg1, var5, (byte) 60);
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(II)I", line = 18)
    public static final int method259(int arg0, int arg1) {
        if (arg0 >= 65 && arg0 <= 90) {
            arg0 += 32;
        }
        int var2 = -40 % ((68 - arg1) / 38);
        return arg0;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field528[var0] = var1;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Lfa;ZLjava/lang/Object;)V", line = 44)
    public static final void method260(class11 arg0, boolean arg1, Object arg2) {
        if (arg0.field148 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field148.peekEvent() != null; var3++) {
            mapview.method140(1L, 111);
        }
        if (!arg1) {
            field535 = null;
        }
        if (arg2 != null) {
            arg0.field148.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(I)V", line = 71)
    public final void method261(int arg0) {
        if (arg0 != 0) {
            method260(null, false, null);
        }
        class37.method232(this.field522, this.field526, this.field523);
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 91)
    public static final void method262(int arg0, Component arg1) {
        Method var2 = class11.field162;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class20.field248);
        arg1.addFocusListener(class20.field248);
        if (arg0 != 0) {
            method259(92, 99);
        }
    }

    @OriginalMember(owner = "mapview!v", name = "<init>", descriptor = "()V", line = 112)
    protected class40() {
    }

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "(I)V", line = 132)
    public static void method263(int arg0) {
        field527 = null;
        field525 = null;
        field533 = null;
        field535 = null;
        field529 = null;
        field528 = null;
        if (arg0 != -257) {
            method260(null, false, null);
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method167(int arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public abstract void method166(Graphics arg0, int arg1, int arg2, int arg3);
}
