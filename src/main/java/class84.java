import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class84 implements Runnable {

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "Z")
    public boolean field1368 = true;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field1363 = new Object();

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "[I")
    public int[] field1372 = new int[500];

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "[I")
    public int[] field1371 = new int[500];

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
    public int field1370 = 0;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "Z")
    public static boolean field1365 = false;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "Lqi;")
    public static class207 field1369;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
    public static final void method644(byte arg0) {
        field1367++;
        if (arg0 != -24) {
            field1369 = null;
        }
        class22.field343.method112(0);
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)V")
    public static void method645(byte arg0) {
        if (arg0 <= -29) {
            field1369 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IBIIII)V")
    public static final void method646(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 117 / ((arg1 + 70) / 46);
        int var10 = arg5 + 1;
        class47.method379(arg2, (byte) 95, arg4, class286.field4283[arg5], arg3);
        field1366++;
        int var9 = arg0 - 1;
        class47.method379(arg2, (byte) 99, arg4, class286.field4283[arg0], arg3);
        for (int var7 = var10; var7 <= var9; var7++) {
            int[] var8 = class286.field4283[var7];
            var8[arg3] = var8[arg2] = arg4;
        }
    }

    @OriginalMember(owner = "client!mr", name = "run", descriptor = "()V")
    public final void run() {
        field1364++;
        while (this.field1368) {
            Object var1 = this.field1363;
            synchronized (this.field1363) {
                if (this.field1370 < 500) {
                    this.field1372[this.field1370] = class129.field2111;
                    this.field1371[this.field1370] = class291.field4327;
                    this.field1370++;
                }
            }
            class134.method1106(50L, 10);
        }
    }
}
