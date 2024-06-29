import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class279 extends Canvas {

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field3925;

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IB)Lwh;", line = 4)
    public static final class146 method1828(int arg0, byte arg1) {
        field3927++;
        if (arg1 > -57) {
            return null;
        } else if (arg0 >= 0 && arg0 < 100) {
            return class127.field1925[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vca", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 19)
    public final void update(Graphics arg0) {
        this.field3925.update(arg0);
        field3926++;
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 30)
    public class279(Component arg0) {
        this.field3925 = arg0;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V", line = 38)
    public static final void method1829(int arg0) {
        field3929++;
        class612.field8865 = 0;
        if (arg0 != -3200) {
            return;
        }
        int var1 = (class468.field6748.field644 >> 9) + class115.field1845;
        int var2 = (class468.field6748.field648 >> 9) + class64.field1160;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class612.field8865 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class612.field8865 = 1;
        }
        if (class612.field8865 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class612.field8865 = 0;
        }
    }

    @OriginalMember(owner = "client!vca", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 64)
    public final void paint(Graphics arg0) {
        field3928++;
        this.field3925.paint(arg0);
    }
}
