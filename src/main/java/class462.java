import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class462 extends class13 {

    @OriginalMember(owner = "client!vq", name = "A", descriptor = "Ljava/lang/String;")
    public String field6499;

    @OriginalMember(owner = "client!vq", name = "E", descriptor = "Lmn;")
    public class368 field6503;

    @OriginalMember(owner = "client!vq", name = "z", descriptor = "Z")
    public static boolean field6498 = false;

    @OriginalMember(owner = "client!vq", name = "w", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!vq", name = "x", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!vq", name = "y", descriptor = "I")
    public int field6497;

    @OriginalMember(owner = "client!vq", name = "B", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!vq", name = "C", descriptor = "I")
    public static int field6501;

    @OriginalMember(owner = "client!vq", name = "D", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(DB)V", line = 13)
    public static final void method2729(double arg0, byte arg1) {
        if (arg1 > -54) {
            return;
        }
        if (class271.field3814 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class390.field5692[var3] = var4 > 255 ? 255 : var4;
            }
            class271.field3814 = arg0;
        }
        field6500++;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ldb;I)Z", line = 42)
    public final boolean method2730(class324 arg0, int arg1) {
        field6495++;
        boolean var3 = true;
        arg0.method115(true);
        class324 var4 = (class324) this.field6503.method2344(-74);
        while (var4 != null) {
            if (class42.method536(var4.field4505, arg0.field4505, true)) {
                class239.method1662(var4, arg0, -1);
                this.field6497++;
                if (var3) {
                    return false;
                }
                return true;
            }
            var4 = (class324) this.field6503.method2336((byte) 48);
            var3 = false;
        }
        this.field6503.method2338(true, arg0);
        int var5 = 80 % ((arg1 + 81) / 33);
        this.field6497++;
        return var3;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BLdb;)Z", line = 74)
    public final boolean method2731(byte arg0, class324 arg1) {
        field6496++;
        int var3 = 41 % ((-arg0 - 30) / 39);
        int var4 = this.method2732(-17937);
        arg1.method115(true);
        this.field6497--;
        if (this.field6497 != 0) {
            return this.method2732(-17937) != var4;
        }
        this.method2314((byte) 112);
        this.method115(true);
        class436.field6235--;
        class318.field4387.method991(this, arg1.field4497, (byte) -128);
        return false;
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 98)
    public class462(String arg0) {
        this.field6499 = arg0;
        this.field6503 = new class368();
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)I", line = 107)
    public final int method2732(int arg0) {
        if (arg0 == -17937) {
            field6501++;
            return this.field6503.field5243.field241 == this.field6503.field5243 ? -1 : ((class324) this.field6503.field5243.field241).field4505;
        } else {
            return 104;
        }
    }
}
