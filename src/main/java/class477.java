import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class477 extends Canvas {

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field6750;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field6751 = -1;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "[I")
    public static int[] field6753 = new int[14];

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!uj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field6750.paint(arg0);
        field6755++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public static void method2825(int arg0) {
        if (arg0 == -13657) {
            field6753 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field6752++;
        this.field6750.update(arg0);
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class477(Component arg0) {
        this.field6750 = arg0;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lmg;B)V")
    public static final void method2826(class451 arg0, byte arg1) {
        field6754++;
        arg0.field6378 = null;
        int var2 = arg0.field6379.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field6379[var3].field6548 = false;
        }
        class388[] var4 = class36.field442;
        synchronized (class36.field442) {
            int var5 = 116 % ((45 - arg1) / 35);
            if (class36.field442.length > var2 && class94.field1178[var2] < 200) {
                class36.field442[var2].method2336(arg0, (byte) -56);
                int var10002 = class94.field1178[var2]++;
            }
        }
    }
}
