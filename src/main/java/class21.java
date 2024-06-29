import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class21 extends RuntimeException {

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field222;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Ljava/lang/String;")
    public String field218;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "[I")
    public static int[] field224 = new int[2048];

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Lmh;")
    private static class62 field225 = class201.method1405(true, "Players");

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "[I")
    public static int[] field219 = new int[2];

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Lmh;")
    public static class62 field226 = field225;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Lmh;")
    public static class62 field228 = class201.method1405(true, "_labels");

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Ljava/awt/Font;")
    public static Font field227;

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 14)
    public class21(Throwable arg0, String arg1) {
        this.field222 = arg0;
        this.field218 = arg1;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 42)
    public static void method96(byte arg0) {
        field224 = null;
        field228 = null;
        field225 = null;
        field219 = null;
        field226 = null;
        if (arg0 != 120) {
            field228 = (class62) null;
        }
        field227 = null;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V", line = 60)
    public static final void method97(byte arg0) {
        field223++;
        class148.method1071(83);
        class133.method1006(113);
        class262.method1813((byte) 73);
        class185.method1295(-104);
        class307.method2097(8);
        if (arg0 <= 15) {
            method96((byte) -128);
        }
        class106.method825((byte) -40);
        class216.method1527(66);
        class240.method1683(true);
        class256.method1783(2);
        class176.method1240(0);
        class269.method1846(65536);
        class35.method228(-14);
        class284.method1929(1);
        class291.method1977(0);
        class102.field1688.method1392(0);
    }
}
