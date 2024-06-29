import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class182 {

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "J")
    public long field2391;

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "Llf;")
    private class250 field2386;

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "I")
    public static int field2390 = 0;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "Lhr;")
    public static class551 field2393;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ID)V", line = 3)
    public static final void method1233(int arg0, double arg1) {
        if (class340.field4755 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class496.field6974[var3] = var4 <= 255 ? var4 : 255;
            }
            class340.field4755 = arg1;
        }
        field2389++;
        if (arg0 != 1) {
            field2393 = null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(III)Z", line = 33)
    public static final boolean method1234(int arg0, int arg1, int arg2) {
        if (arg1 == 16) {
            field2385++;
            return (arg0 & 0x10) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V", line = 49)
    public static void method1235(int arg0) {
        if (arg0 <= 2) {
            field2384 = -51;
        }
        field2393 = null;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(BIIIIILha;I)V", line = 64)
    public static final void method1236(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class66 arg6, int arg7) {
        field2392++;
        int var8 = -99 % ((arg0 + 63) / 54);
        arg6.method529(arg3, arg5, arg4, arg1, arg7, 1);
        arg6.method529(16, arg5 + 1, arg4 + -2, arg1 + 1, arg2, 1);
        arg6.method553(arg4 - 2, arg1 + 1, arg5 + 18, arg2, 110, arg3 - 19);
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Llf;J[Lmja;)V", line = 75)
    public class182(class250 arg0, long arg1, class440[] arg2) {
        this.field2391 = arg1;
        this.field2386 = arg0;
    }

    @OriginalMember(owner = "client!gw", name = "finalize", descriptor = "()V", line = 89)
    protected final void finalize() throws Throwable {
        this.field2386.method1573(this.field2391, false);
        field2387++;
        super.finalize();
    }
}
