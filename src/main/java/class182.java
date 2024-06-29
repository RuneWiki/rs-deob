import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class182 implements Runnable {

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "Z")
    public boolean field2998 = true;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field2993 = new Object();

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "[I")
    public int[] field3006 = new int[500];

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "[I")
    public int[] field3009 = new int[500];

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public int field3011 = 0;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "[I")
    public static int[] field3003 = new int[64];

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field2994 = 0;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "Z")
    public static boolean field3001 = false;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field2999 = 0;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field3007 = 0;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "Ldf;")
    public static class51 field3000 = class46.method233("::fps ", 100);

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field3005 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "Ldf;")
    private static class51 field3002 = class46.method233("scroll:", 100);

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "Ldf;")
    public static class51 field2996 = field3002;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "Ldf;")
    public static class51 field3010 = field3002;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "Ldf;")
    public static class51 field3008 = class46.method233("<col=00ff00>", 100);

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "Ldf;")
    public static class51 field3012 = class46.method233("cross", 100);

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
    public static int field3013 = -1;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Ltg;")
    public static class171 field3004;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILth;)V")
    public static final void method1291(int arg0, class104 arg1) {
        field2997++;
        arg1.field1723 = false;
        if (arg1.field1725 != null) {
            arg1.field1725.field1559 = 0;
        }
        if (arg0 != 50) {
            method1293((byte) -97, (class111) null);
        }
        for (class104 var2 = arg1.method493(); var2 != null; var2 = arg1.method490()) {
            method1291(arg0, var2);
        }
    }

    @OriginalMember(owner = "client!gg", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field2998) {
            Object var1 = this.field2993;
            synchronized (this.field2993) {
                if (this.field3011 < 500) {
                    this.field3006[this.field3011] = class89.field1482;
                    this.field3009[this.field3011] = class90.field1504;
                    this.field3011++;
                }
            }
            class147.method1066(50L, 0);
        }
        field2995++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static void method1292(int arg0) {
        field3012 = null;
        field2996 = null;
        if (arg0 != 50) {
            method1292(16);
        }
        field3003 = null;
        field3002 = null;
        field3004 = null;
        field3010 = null;
        field3008 = null;
        field3000 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLu;)Z")
    public static final boolean method1293(byte arg0, class111 arg1) {
        if (arg0 == 116) {
            field3014++;
            return arg1.method827(class210.field3489, -87);
        } else {
            return false;
        }
    }
}
