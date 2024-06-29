import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class38 implements Runnable {

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Z")
    public boolean field562 = true;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field559 = new Object();

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public int field568 = 0;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "[I")
    public int[] field567 = new int[500];

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "[I")
    public int[] field569 = new int[500];

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Lth;")
    public static class57 field561 = new class57(64);

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field565 = 127;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!qe", name = "run", descriptor = "()V", line = 8)
    public final void run() {
        while (this.field562) {
            Object var1 = this.field559;
            synchronized (this.field559) {
                if (this.field568 < 500) {
                    this.field569[this.field568] = class56.field815;
                    this.field567[this.field568] = class165.field2353;
                    this.field568++;
                }
            }
            class184.method1283(50L, 10);
        }
        field566++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIILph;)Lln;", line = 30)
    public static final class118 method277(int arg0, int arg1, int arg2, class361 arg3) {
        field560++;
        if (class62.method508(0, arg1, arg0, arg3)) {
            return arg2 >= -110 ? (class118) null : class306.method2153(14);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 47)
    public static void method278(int arg0) {
        field561 = null;
        if (arg0 != -3412) {
            field561 = (class57) null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lia;", line = 69)
    public static final class15 method279(int arg0, int arg1) {
        if (arg0 != 127) {
            field563 = 67;
        }
        class15 var2 = (class15) class200.field2941.method461((byte) 120, (long) arg1);
        field558++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class160.field2321.method2520(32, arg1, (byte) -25);
        class15 var4 = new class15();
        if (var3 != null) {
            var4.method89(12, new class190(var3));
        }
        var4.method88((byte) 80);
        class200.field2941.method460(var4, -26089, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)I", line = 93)
    public static final int method280(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }
}
