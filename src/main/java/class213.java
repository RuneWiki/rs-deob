import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public abstract class class213 {

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field3233 = 0;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "S")
    public static short field3237 = 32767;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field3235 = 0;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public int field3230;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public int field3231;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "Llm;")
    public static class210 field3228;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Lbf;")
    public static class227 field3229;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "Ljava/awt/Image;")
    public Image field3232;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3234;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "[I")
    public int[] field3238;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 7)
    public final void method1474(int arg0) {
        class46.method321(this.field3238, this.field3231, this.field3230);
        if (arg0 != 0) {
            this.method238(127, (Graphics) null, 89, 84);
        }
        field3239++;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V", line = 42)
    public static void method1475(int arg0) {
        int var1 = 104 % ((arg0 - 26) / 62);
        field3228 = null;
        field3229 = null;
        field3234 = null;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V", line = 50)
    protected class213() {
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
    public abstract void method236(int arg0, int arg1, Graphics arg2, int arg3, byte arg4, int arg5);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljava/awt/Component;IBI)V")
    public abstract void method237(Component arg0, int arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method238(int arg0, Graphics arg1, int arg2, int arg3);
}
