import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class122 extends Canvas {

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field2071;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "[I")
    public static int[] field2072 = new int[256];

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "Lbg;")
    public static class217 field2077 = new class217(128);

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "[J")
    public static long[] field2079 = new long[200];

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field2080 = 0;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field2081 = 0;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!ob", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field2073++;
        this.field2071.paint(arg0);
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class122(Component arg0) {
        this.field2071 = arg0;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
    public static final void method921(boolean arg0) {
        if (!arg0) {
            field2080 = -103;
        }
        class166.field2697.method1350((byte) 110);
        field2075++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZ)V")
    public static final void method922(int arg0, boolean arg1) {
        field2070++;
        class136 var2 = (class136) class7.field77.method1453((long) arg0, 1);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (!arg1) {
            return;
        }
        while (var3 < var2.field2258.length) {
            var2.field2258[var3] = -1;
            var2.field2256[var3] = 0;
            var3++;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static void method923(int arg0) {
        field2079 = null;
        int var1 = 98 % ((arg0 + 40) / 46);
        field2072 = null;
        field2077 = null;
    }

    @OriginalMember(owner = "client!ob", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2076++;
        this.field2071.update(arg0);
    }
}
