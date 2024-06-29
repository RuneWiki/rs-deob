import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class96 implements Runnable {

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Z")
    public boolean field2129 = true;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Ljava/lang/Object;")
    public Object field2127 = new Object();

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "[I")
    public int[] field2134 = new int[500];

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "[I")
    public int[] field2135 = new int[500];

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public int field2136 = 0;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Llc;")
    public static class69 field2125 = class69.method470((byte) -96, "::hiddenbuttontest");

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Llc;")
    public static class69 field2126 = class69.method470((byte) -125, "You have @gre@");

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Llc;")
    public static class69 field2121 = class69.method470((byte) -115, "Loading ignore list");

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static volatile int field2122 = 0;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "Z")
    public static boolean field2133 = false;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "[I")
    public static int[] field2131;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "[Lcb;")
    public static class15[] field2128;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public static void method730(int arg0) {
        if (arg0 != 500) {
            method730(-29);
        }
        field2121 = null;
        field2126 = null;
        field2128 = null;
        field2131 = null;
        field2125 = null;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public static final void method731(int arg0) {
        field2123++;
        class3.field60++;
        class26.field557.method178(-5, 255);
        if (class67.field1396 != -1) {
            class49.method323((byte) 6, class67.field1396);
            class67.field1396 = -1;
            class73.field1639 = false;
            class110.field2418 = true;
            class71.field1596 = true;
        }
        if (class60.field1244 != arg0) {
            class49.method323((byte) 6, class60.field1244);
            class35.field709 = true;
            class60.field1244 = -1;
            class73.field1639 = false;
        }
        if (class22.field469 != -1) {
            class49.method323((byte) 6, class22.field469);
            class22.field469 = -1;
            class89.method626(30, (byte) 112);
        }
        if (class51.field1124 != -1) {
            class49.method323((byte) 6, class51.field1124);
            class51.field1124 = -1;
        }
        if (class53.field1144 != -1) {
            class49.method323((byte) 6, class53.field1144);
            class53.field1144 = -1;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)V")
    public static final void method732(int arg0, int arg1) {
        field2124++;
        if (arg0 != -1) {
            method731(89);
        }
        if (class83.field1872) {
            class107.field2337 = arg1;
        } else {
            class104.method780(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "run", descriptor = "()V")
    public final void run() {
        field2132++;
        while (this.field2129) {
            Object var1 = this.field2127;
            synchronized (this.field2127) {
                if (this.field2136 < 500) {
                    this.field2134[this.field2136] = class101.field2193;
                    this.field2135[this.field2136] = class74.field1666;
                    this.field2136++;
                }
            }
            class108.method814((byte) 15, 50L);
        }
    }
}
