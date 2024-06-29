import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class430 {

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Lbd;")
    public class43 field6260 = null;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "[Ljp;")
    public class236[] field6263 = null;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Lbd;")
    public class43 field6267 = null;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "[Ljp;")
    public class236[] field6266 = null;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Lbd;")
    public class43 field6268 = null;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Z")
    public boolean field6264;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "[I")
    public static int[] field6265;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static void method2613(int arg0) {
        field6265 = null;
        if (arg0 != 128) {
            field6265 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public static final void method2614(byte arg0) {
        if (arg0 == -17) {
            class20.field293.method2349(0);
            field6261++;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIILnh;Lnh;)V")
    public static final void method2615(int arg0, int arg1, int arg2, class524 arg3, class524 arg4) {
        class165 var5 = class524.method3094(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field2480 = arg3;
            var5.field2484 = arg4;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([BBI)I")
    public static final int method2616(byte[] arg0, byte arg1, int arg2) {
        field6259++;
        if (arg1 != -66) {
            method2613(63);
        }
        return class236.method1536(true, 0, arg2, arg0);
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lqg;)V")
    public class430(class321 arg0) {
        this.field6264 = arg0.field4842;
        class139.method1026(arg0, (byte) 77);
        if (this.field6264) {
            byte[] var6 = class473.method2834(22819, class339.field5168, false);
            this.field6260 = new class43(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class473.method2834(22819, class474.field6989, false);
            this.field6267 = new class43(arg0, 6410, 128, 128, 16, var7, 6410);
            class122 var8 = arg0.field4782;
            if (var8.method924(false)) {
                byte[] var9 = class473.method2834(22819, class21.field301, false);
                this.field6268 = new class43(arg0, 6408, 128, 128, 16);
                class43 var10 = new class43(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method927(this.field6268, var10, 94, 2.0F)) {
                    this.field6268.method2666(-6454);
                } else {
                    this.field6268.method2670(2957);
                    this.field6268 = null;
                }
                var10.method2670(2957);
            }
        } else {
            this.field6266 = new class236[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class68.method593(var2 * 2 * 128 * 128, -57, class339.field5168, 32768);
                this.field6266[var2] = new class236(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field6263 = new class236[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class68.method593(var3 * 256 * 128, -49, class474.field6989, 32768);
                this.field6263[var3] = new class236(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}
