import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class9 implements Runnable {

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "Z")
    public boolean field309 = true;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "Ljava/lang/Object;")
    public Object field310 = new Object();

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "[I")
    public int[] field316 = new int[500];

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "[I")
    public int[] field317 = new int[500];

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
    public int field318 = 0;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "Lwb;")
    public static class130 field292 = class26.method212("@cya@", -32376);

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Z")
    public static boolean field294 = true;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Lwb;")
    public static class130 field295 = class26.method212("", -32376);

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Lwb;")
    public static class130 field300 = field295;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Lwb;")
    public static class130 field293 = field295;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field296 = 0;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Lwb;")
    public static class130 field291 = field295;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "Lwb;")
    public static class130 field299 = field295;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "Lwb;")
    public static class130 field305 = class26.method212("Wen m-Ochten Sie von der Liste entfernen?", -32376);

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "Lwb;")
    private static class130 field306 = class26.method212("Ok", -32376);

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "Lwb;")
    public static class130 field307 = field295;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "Lwb;")
    public static class130 field308 = class26.method212("Bitte warten Sie)3)3)3", -32376);

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "Lwb;")
    public static class130 field312 = class26.method212("Ung-Ultiges Anmelde)2Paket)3", -32376);

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "Lwb;")
    public static class130 field302 = field306;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    public static int field314 = 0;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "Lwb;")
    public static class130 field315 = field295;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "Lwb;")
    private static class130 field298 = class26.method212(" has logged out)3", -32376);

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "Lwb;")
    public static class130 field311 = field298;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "Lwb;")
    private static class130 field313 = class26.method212("Continue", -32376);

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Lwb;")
    public static class130 field303 = field313;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "Lta;")
    public static class114 field297;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 11)
    public static final void method71(int arg0) {
        class119.field2905.method401(arg0 ^ 0xFFFFAFD5);
        client.field522.method401(26116);
        field301++;
        if (arg0 != -13871) {
            field295 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "run", descriptor = "()V", line = 37)
    public final void run() {
        field304++;
        while (this.field309) {
            Object var1 = this.field310;
            synchronized (this.field310) {
                if (this.field318 < 500) {
                    this.field317[this.field318] = class18.field483;
                    this.field316[this.field318] = class101.field2429;
                    this.field318++;
                }
            }
            class37.method375(-1, 50L);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V", line = 120)
    public static void method72(byte arg0) {
        field315 = null;
        field306 = null;
        field299 = null;
        field311 = null;
        if (arg0 >= -98) {
            return;
        }
        field305 = null;
        field295 = null;
        field298 = null;
        field307 = null;
        field308 = null;
        field300 = null;
        field293 = null;
        field292 = null;
        field313 = null;
        field302 = null;
        field291 = null;
        field303 = null;
        field312 = null;
        field297 = null;
    }
}
