import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class201 implements Runnable {

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Z")
    public boolean field3976 = true;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "Ljava/lang/Object;")
    public Object field3978 = new Object();

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "[I")
    public int[] field3981 = new int[500];

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public int field3982 = 0;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "[I")
    public int[] field3980 = new int[500];

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Lcd;")
    public static class23 field3972 = class54.method414("Musik)2Engine vorbereitet)3", -1);

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "Lcd;")
    public static class23 field3973 = class54.method414(")3runescape)3com", -1);

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "Lcd;")
    public static class23 field3977 = class54.method414("weiss:", -1);

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "Lcd;")
    public static class23 field3975 = class54.method414("null", -1);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Lcg;")
    public static class26 field3971;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Lkh;")
    public static class97 field3974;

    @OriginalMember(owner = "client!wd", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field3976) {
            Object var1 = this.field3978;
            synchronized (this.field3978) {
                if (this.field3982 < 500) {
                    this.field3981[this.field3982] = class78.field1724;
                    this.field3980[this.field3982] = class64.field1518;
                    this.field3982++;
                }
            }
            class53.method409(50L, -25391);
        }
        field3979++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static void method1324(byte arg0) {
        field3977 = null;
        field3973 = null;
        field3972 = null;
        field3974 = null;
        field3971 = null;
        if (arg0 > 115) {
            field3975 = null;
        }
    }
}
