import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class254 extends class71 {

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "[J")
    private long[] field4374 = new long[10];

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    private int field4370 = 1;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    private int field4376 = 0;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    private int field4365 = 256;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "J")
    private long field4369 = class57.method391(19211);

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "Len;")
    public static class133 field4368 = new class133();

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "Lhi;")
    private static class82 field4375 = class95.method664((byte) -109, "Loaded interfaces");

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public static int field4381 = 0;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "Lhi;")
    public static class82 field4377 = field4375;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "Lhi;")
    public static class82 field4378 = class95.method664((byte) -36, "Hidden)2use");

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    private int field4373;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "Lum;")
    public static class222 field4379;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V", line = 8)
    public static void method1821(byte arg0) {
        field4368 = null;
        if (arg0 != -118) {
            field4380 = -62;
        }
        field4375 = null;
        field4377 = null;
        field4378 = null;
        field4379 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I", line = 33)
    public final int method449(int arg0, int arg1, int arg2) {
        int var4 = this.field4365;
        this.field4365 = 300;
        field4371++;
        int var5 = this.field4370;
        this.field4370 = 1;
        this.field4369 = class57.method391(19211);
        if (arg0 != 1504371521) {
            this.field4369 = -71L;
        }
        if (this.field4374[this.field4373] == 0L) {
            this.field4370 = var5;
            this.field4365 = var4;
        } else if (this.field4369 > this.field4374[this.field4373]) {
            this.field4365 = (int) ((long) (arg1 * 2560) / (this.field4369 - this.field4374[this.field4373]));
        }
        if (this.field4365 < 25) {
            this.field4365 = 25;
        }
        if (this.field4365 > 256) {
            this.field4365 = 256;
            this.field4370 = (int) ((long) arg1 - (this.field4369 - this.field4374[this.field4373]) / 10L);
        }
        if (arg1 < this.field4370) {
            this.field4370 = arg1;
        }
        this.field4374[this.field4373] = this.field4369;
        this.field4373 = (this.field4373 + 1) % 10;
        if (this.field4370 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field4374[var6] != 0L) {
                    this.field4374[var6] += (long) this.field4370;
                }
            }
        }
        if (this.field4370 < arg2) {
            this.field4370 = arg2;
        }
        class290.method2001((long) this.field4370, false);
        int var7 = 0;
        while (this.field4376 < 256) {
            var7++;
            this.field4376 += this.field4365;
        }
        this.field4376 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lhi;I)Z", line = 123)
    public static final boolean method1822(class82 arg0, int arg1) {
        field4366++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 != -24378) {
            method1821((byte) -67);
        }
        for (int var2 = 0; var2 < class171.field2964; var2++) {
            if (arg0.method543(class157.field2736[var2], (byte) 72)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V", line = 149)
    public final void method451(int arg0) {
        field4367++;
        if (arg0 >= 111) {
            for (int var2 = 0; var2 < 10; var2++) {
                this.field4374[var2] = 0L;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V", line = 192)
    public class254() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field4374[var1] = this.field4369;
        }
    }
}
