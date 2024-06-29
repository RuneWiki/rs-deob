import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!fa")
public abstract class class12 {

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "Lu;")
    public static class38 field115 = class9.method45(-41, "u_pass");

    @OriginalMember(owner = "mapview!fa", name = "e", descriptor = "I")
    public static int field119 = 0;

    @OriginalMember(owner = "mapview!fa", name = "h", descriptor = "I")
    public static int field122 = 1;

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "I")
    public int field117;

    @OriginalMember(owner = "mapview!fa", name = "d", descriptor = "I")
    public int field118;

    @OriginalMember(owner = "mapview!fa", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field121;

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "[B")
    public static byte[] field116;

    @OriginalMember(owner = "mapview!fa", name = "f", descriptor = "[I")
    public int[] field120;

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(B)V", line = 5)
    public static void method62(byte arg0) {
        field115 = null;
        field116 = null;
        int var1 = 113 % ((arg0 + 54) / 39);
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Lca;ZLjava/lang/Object;)V", line = 22)
    public static final void method64(class6 arg0, boolean arg1, Object arg2) {
        if (arg0.field47 == null) {
            return;
        }
        int var3 = 0;
        if (!arg1) {
            field115 = null;
        }
        while (var3 < 50 && arg0.field47.peekEvent() != null) {
            class34.method197(21282, 1L);
            var3++;
        }
        if (arg2 != null) {
            arg0.field47.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Z)V", line = 47)
    public final void method65(boolean arg0) {
        if (arg0) {
            class27.method154(this.field120, this.field118, this.field117);
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(I)V", line = 72)
    public static final void method67(int arg0) {
        class16 var1 = class13.field126;
        synchronized (class13.field126) {
            class25.field221 = class34.field442;
            if (arg0 < -21) {
                if (class23.field212 >= 0) {
                    while (class23.field212 != class16.field149) {
                        int var2 = class35.field443[class16.field149];
                        class16.field149 = class16.field149 + 1 & 0x7F;
                        if (var2 < 0) {
                            class33.field433[~var2] = false;
                        } else {
                            class33.field433[var2] = true;
                        }
                    }
                } else {
                    for (int var3 = 0; var3 < 112; var3++) {
                        class33.field433[var3] = false;
                    }
                    class23.field212 = class16.field149;
                }
                class34.field442 = class9.field80;
            }
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "<init>", descriptor = "()V", line = 121)
    protected class12() {
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method63(int arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(BLjava/awt/Graphics;II)V")
    public abstract void method66(byte arg0, Graphics arg1, int arg2, int arg3);
}
