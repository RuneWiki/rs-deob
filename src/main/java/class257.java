import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public abstract class class257 {

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3939 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field3945 = 0;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field3947 = 0;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public int field3938;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public int field3941;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "Lrl;")
    public static class163 field3943;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "Ljava/awt/Image;")
    public Image field3942;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "[I")
    public int[] field3940;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BILjava/awt/Component;I)V")
    public abstract void method234(byte arg0, int arg1, Component arg2, int arg3);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
    public static void method1708(boolean arg0) {
        field3939 = null;
        if (!arg0) {
            method1708(true);
        }
        field3943 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "()V")
    public static final void method1709() {
        for (int var0 = 0; var0 < class273.field4306; var0++) {
            class172 var1 = class75.field1264[var0];
            class75.method595(var1);
            class75.field1264[var0] = null;
        }
        class273.field4306 = 0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public final void method1710(int arg0) {
        field3944++;
        class201.method1353(this.field3940, this.field3941, this.field3938);
        if (arg0 != 18814) {
            field3939 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method232(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    protected class257() {
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjava/awt/Graphics;IIIB)V")
    public abstract void method235(int arg0, Graphics arg1, int arg2, int arg3, int arg4, byte arg5);
}
