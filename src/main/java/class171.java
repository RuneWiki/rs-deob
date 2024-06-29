import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class171 extends Canvas {

    @OriginalMember(owner = "client!t", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field3312;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field3302 = 0;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Lsg;")
    private static class169 field3303 = class165.method1060("Welcome to RuneScape", 1536);

    @OriginalMember(owner = "client!t", name = "g", descriptor = "Z")
    public static boolean field3308 = false;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Lsg;")
    public static class169 field3304 = field3303;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "[[S")
    public static short[][] field3311 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lsg;")
    public static class169 field3310 = class165.method1060("", 1536);

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Lqf;")
    public static class150 field3307;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
    public static final void method1142(byte arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        if (arg0 == 46) {
            System.exit(1);
            field3313++;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
    public static void method1143(byte arg0) {
        field3303 = null;
        field3304 = null;
        field3311 = null;
        field3310 = null;
        field3307 = null;
        if (arg0 != -113) {
            method1143((byte) 85);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BLsg;)V")
    public static final void method1144(byte arg0, class169 arg1) {
        field3306++;
        if (class35.field696 == null) {
            return;
        }
        long var2 = arg1.method1133(false);
        int var4 = 0;
        if (var2 == 0L) {
            return;
        }
        while (var4 < class35.field696.length && class35.field696[var4].field3543 != var2) {
            var4++;
        }
        if (class35.field696.length <= var4 || class35.field696[var4] == null) {
            return;
        }
        if (arg0 > -78) {
            method1142((byte) 111);
        }
        class141.field2621.method1024(251, (byte) -94);
        class141.field2621.method816(class35.field696[var4].field3543, -16701);
        class91.field1670++;
    }

    @OriginalMember(owner = "client!t", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field3312.update(arg0);
        field3309++;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class171(Component arg0) {
        this.field3312 = arg0;
    }

    @OriginalMember(owner = "client!t", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field3305++;
        this.field3312.paint(arg0);
    }
}
