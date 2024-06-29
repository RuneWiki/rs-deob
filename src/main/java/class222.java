import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class222 extends class122 {

    @OriginalMember(owner = "client!re", name = "v", descriptor = "[J")
    private long[] field4055 = new long[10];

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    private int field4056 = 256;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    private int field4059 = 0;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    private int field4062 = 1;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "J")
    private long field4060 = class180.method1236(96);

    @OriginalMember(owner = "client!re", name = "x", descriptor = "[I")
    public static int[] field4057 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2 };

    @OriginalMember(owner = "client!re", name = "B", descriptor = "Lcc;")
    public static class209 field4061 = class95.method669(120, "");

    @OriginalMember(owner = "client!re", name = "r", descriptor = "Lla;")
    public static class95 field4051 = new class95(64);

    @OriginalMember(owner = "client!re", name = "E", descriptor = "Lcc;")
    public static class209 field4064 = class95.method669(105, " ");

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    private int field4052;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)V")
    public static final void method1568(int arg0, int arg1, int arg2) {
        if (arg2 == -257) {
            field4049++;
            class195 var3 = class178.method1229(arg1, 12, -114);
            var3.method1338(0);
            var3.field3511 = arg0;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public static void method1569(int arg0) {
        field4051 = null;
        field4057 = null;
        field4061 = null;
        field4064 = null;
        if (arg0 != 0) {
            field4064 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public final void method170(int arg0) {
        if (arg0 != -30820) {
            method1568(18, -104, 29);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field4055[var2] = 0L;
        }
        field4050++;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIB)I")
    public final int method169(int arg0, int arg1, byte arg2) {
        int var4 = this.field4056;
        int var5 = this.field4062;
        field4058++;
        this.field4056 = 300;
        this.field4062 = 1;
        this.field4060 = class180.method1236(-99);
        if (this.field4055[this.field4052] == 0L) {
            this.field4062 = var5;
            this.field4056 = var4;
        } else if (this.field4055[this.field4052] < this.field4060) {
            this.field4056 = (int) ((long) (arg0 * 2560) / (this.field4060 - this.field4055[this.field4052]));
        }
        if (this.field4056 < 25) {
            this.field4056 = 25;
        }
        if (this.field4056 > 256) {
            this.field4056 = 256;
            this.field4062 = (int) ((long) arg0 - ((this.field4060 - this.field4055[this.field4052]) / 10L));
        }
        if (arg0 < this.field4062) {
            this.field4062 = arg0;
        }
        this.field4055[this.field4052] = this.field4060;
        this.field4052 = (this.field4052 + 1) % 10;
        if (this.field4062 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field4055[var6] != 0L) {
                    this.field4055[var6] -= -((long) this.field4062);
                }
            }
        }
        if (arg1 > this.field4062) {
            this.field4062 = arg1;
        }
        int var7 = -29 % ((arg2 - 14) / 47);
        class174.method1196((byte) 88, (long) this.field4062);
        int var8 = 0;
        while (this.field4059 < 256) {
            var8++;
            this.field4059 += this.field4056;
        }
        this.field4059 &= 0xFF;
        return var8;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lcc;B)V")
    public static final void method1570(class209 arg0, byte arg1) {
        field4063++;
        class284.method1913(false, (byte) -76);
        class72.method518(4080, arg0);
        int var2 = 66 % ((arg1 + 29) / 40);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)Z")
    public static final boolean method1571(int arg0, int arg1) {
        field4054++;
        if (arg0 > -20) {
            method1570((class209) null, (byte) 117);
        }
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
    public class222() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field4055[var1] = this.field4060;
        }
    }
}
