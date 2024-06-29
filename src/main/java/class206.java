import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public abstract class class206 {

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static volatile int field3259 = 0;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public int field3255;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public int field3261;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "Llb;")
    public static class211 field3256;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field3262;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "[I")
    public int[] field3257;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLjava/lang/String;)I", line = 6)
    public static final int method1473(byte arg0, String arg1) {
        field3260++;
        if (arg0 != -92) {
            field3259 = -78;
        }
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V", line = 24)
    public final void method1474(byte arg0) {
        if (arg0 != -105) {
            field3259 = -94;
        }
        field3258++;
        class168.method1244(this.field3257, this.field3261, this.field3255);
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V", line = 36)
    public static void method1475(byte arg0) {
        field3256 = null;
        int var1 = 110 / ((-arg0 - 59) / 57);
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V", line = 49)
    protected class206() {
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)Lhg;", line = 53)
    public static final class173 method1476(int arg0, int arg1, int arg2) {
        class99 var3 = class250.field3746[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class173 var4 = var3.field1472;
            var3.field1472 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BIILjava/awt/Component;)V")
    public abstract void method617(byte arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method623(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public abstract void method619(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5);
}
