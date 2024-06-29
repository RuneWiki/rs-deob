import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class355 {

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public int field5558 = 2048;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public int field5561 = 2048;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public int field5557 = 0;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public int field5559 = 0;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Ldj;")
    public static class143 field5554 = new class143(16);

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "[I")
    public static int[] field5562 = new int[5];

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field5564 = 0;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 7)
    public static void method2469(int arg0) {
        field5554 = null;
        if (arg0 != 0) {
            field5562 = (int[]) null;
        }
        field5562 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)Ljava/lang/String;", line = 27)
    public static final String method2470(byte arg0) {
        field5563++;
        String var1 = "www";
        if (class145.field2021 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (class194.field2690 != null) {
            var2 = "/p=" + class194.field2690;
        }
        return arg0 == 104 ? "http://" + var1 + ".runescape.com/l=" + class306.field4473 + "/a=" + class185.field2522 + var2 + "/" : (String) null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILfd;B)V", line = 50)
    private final void method2471(int arg0, int arg1, class299 arg2, byte arg3) {
        field5555++;
        if (arg1 == 1) {
            this.field5559 = arg2.method2096((byte) -122);
        } else if (arg1 == 2) {
            this.field5558 = arg2.method2083((byte) -90);
        } else if (arg1 == 3) {
            this.field5561 = arg2.method2083((byte) -68);
        } else if (arg1 == 4) {
            this.field5557 = arg2.method2043(true);
        }
        if (arg3 != -12) {
            this.field5559 = 63;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLfd;I)V", line = 85)
    public final void method2472(boolean arg0, class299 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method2096((byte) -122);
            if (var4 == 0) {
                if (!arg0) {
                    method2469(-34);
                }
                field5560++;
                return;
            }
            this.method2471(arg2, var4, arg1, (byte) -12);
        }
    }
}
