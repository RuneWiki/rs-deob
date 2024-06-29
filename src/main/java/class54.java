import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class54 implements Runnable {

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Z")
    public boolean field1083 = true;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field1081 = new Object();

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public int field1086 = 0;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "[I")
    public int[] field1087 = new int[500];

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "[I")
    public int[] field1088 = new int[500];

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "[I")
    public static int[] field1079;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 6)
    public static final void method417(int arg0) {
        if (arg0 != -1) {
            method418(35);
        }
        field1084++;
        for (class164 var1 = (class164) class318.field4798.method424(-46); var1 != null; var1 = (class164) class318.field4798.method425(arg0 ^ 0x7F22)) {
            if (var1.field2649 > 0) {
                var1.field2649--;
            }
            if (var1.field2649 != 0) {
                if (var1.field2651 > 0) {
                    var1.field2651--;
                }
                if (var1.field2651 == 0 && var1.field2642 >= 1 && var1.field2648 >= 1 && var1.field2642 <= 102 && var1.field2648 <= 102 && (var1.field2653 < 0 || class172.method1087(10, var1.field2653, var1.field2652))) {
                    class260.method1745(var1.field2648, var1.field2650, var1.field2655, var1.field2643, var1.field2652, var1.field2653, (byte) 45, var1.field2642);
                    var1.field2651 = -1;
                    if (var1.field2653 == var1.field2639 && var1.field2639 == -1) {
                        var1.method278((byte) -105);
                    } else if (var1.field2653 == var1.field2639 && var1.field2650 == var1.field2646 && var1.field2652 == var1.field2647) {
                        var1.method278((byte) -105);
                    }
                }
            } else if (var1.field2639 < 0 || class172.method1087(10, var1.field2639, var1.field2647)) {
                class260.method1745(var1.field2648, var1.field2646, var1.field2655, var1.field2643, var1.field2647, var1.field2639, (byte) 66, var1.field2642);
                var1.method278((byte) -105);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V", line = 72)
    public static void method418(int arg0) {
        field1079 = null;
        int var1 = 83 % ((1 - arg0) / 63);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V", line = 81)
    public static final void method419(int arg0, int arg1) {
        class104.field1803 = (class328) class50.field1013.method303((long) arg0, (byte) 112);
        field1085++;
        if (arg1 != -2) {
            field1079 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZIII)V", line = 93)
    public static final void method420(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg0) {
            String var4 = "::tele " + arg3 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
            System.out.println(var4);
            class244.method1618(var4, -122);
            field1082++;
        }
    }

    @OriginalMember(owner = "client!ld", name = "run", descriptor = "()V", line = 109)
    public final void run() {
        field1080++;
        while (this.field1083) {
            Object var1 = this.field1081;
            synchronized (this.field1081) {
                if (this.field1086 < 500) {
                    this.field1088[this.field1086] = class120.field2083;
                    this.field1087[this.field1086] = class9.field196;
                    this.field1086++;
                }
            }
            class127.method843(-102, 50L);
        }
    }
}
