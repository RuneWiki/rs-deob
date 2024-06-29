import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class155 {

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "I")
    public int field2448 = 128;

    @OriginalMember(owner = "client!wq", name = "p", descriptor = "I")
    public int field2453 = 128;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "I")
    public int field2443;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
    public int field2441;

    @OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
    public int field2454;

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "I")
    public int field2444;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
    public static int field2440 = 0;

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "[I")
    public static int[] field2445 = new int[14];

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
    public int field2438;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "I")
    public int field2442;

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
    public int field2447;

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "I")
    public int field2451;

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!wq", name = "r", descriptor = "I")
    public int field2455;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "Lgba;")
    public static class625 field2439;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
    public static void method1086(int arg0) {
        field2439 = null;
        field2445 = null;
        if (arg0 != 19634) {
            field2445 = null;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)Lwq;")
    public final class155 method1087(byte arg0) {
        if (arg0 == -120) {
            field2446++;
            return new class155(this.field2443, this.field2448, this.field2453, this.field2444, this.field2441, this.field2454);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Ljava/awt/Component;I)Ljca;")
    public static final class642 method1088(Component arg0, int arg1) {
        field2452++;
        if (arg1 <= 72) {
            method1088(null, -90);
        }
        return new class595(arg0);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1089(String arg0, int arg1) {
        field2449++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = arg1; var4 < var2; var4++) {
            var3 = arg0.charAt(var4) + ((var3 << 5) - var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lwq;B)V")
    public final void method1090(class155 arg0, byte arg1) {
        int var3 = 98 / ((74 - arg1) / 47);
        this.field2444 = arg0.field2444;
        this.field2441 = arg0.field2441;
        this.field2448 = arg0.field2448;
        this.field2453 = arg0.field2453;
        this.field2454 = arg0.field2454;
        this.field2443 = arg0.field2443;
        field2450++;
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(I)V")
    public class155(int arg0) {
        this.field2443 = arg0;
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(IIIIII)V")
    private class155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2441 = arg4;
        this.field2448 = arg1;
        this.field2443 = arg0;
        this.field2453 = arg2;
        this.field2454 = arg5;
        this.field2444 = arg3;
    }
}
