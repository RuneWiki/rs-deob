import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class122 implements Runnable {

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "Z")
    public boolean field2093 = true;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field2095 = new Object();

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "[I")
    public int[] field2100 = new int[500];

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public int field2101 = 0;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "[I")
    public int[] field2102 = new int[500];

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static volatile int field2097 = 0;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field2098 = 0;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!jj", name = "run", descriptor = "()V", line = 19)
    public final void run() {
        while (this.field2093) {
            Object var1 = this.field2095;
            synchronized (this.field2095) {
                if (this.field2101 < 500) {
                    this.field2102[this.field2101] = class333.field5275;
                    this.field2100[this.field2101] = class77.field1343;
                    this.field2101++;
                }
            }
            class283.method2076((byte) 11, 50L);
        }
        field2103++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V", line = 51)
    public static final void method965(int arg0) {
        class323.field5150.method2326(-4);
        field2104++;
        if (arg0 != 0) {
            field2097 = 111;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIII)I", line = 77)
    public static final int method966(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2099++;
        int var5 = arg2 & 0xF;
        int var6 = var5 < 8 ? arg0 : arg3;
        int var7 = 27 % ((76 - arg1) / 38);
        int var8 = var5 < 4 ? arg3 : (var5 == 12 || var5 == 14 ? arg0 : arg4);
        return ((var5 & 0x2) == 0 ? var8 : -var8) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }
}
