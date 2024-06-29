import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class622 {

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public int field8998;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    private int field8999;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field8997 = 0;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field8996;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field9000;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field9001;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field9002;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field9003;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field9004;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V", line = 3)
    public static final void method3583(int arg0, int arg1) {
        if (arg1 != -2) {
            method3586(-102);
        }
        if (class464.field6699 == null || arg0 > class464.field6699.length) {
            class464.field6699 = new int[arg0];
        }
        field9000++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIB)I", line = 19)
    public static final int method3584(int arg0, int arg1, int arg2, byte arg3) {
        field9004++;
        if (class87.field1348 < 100) {
            return -2;
        }
        if (arg3 <= 14) {
            method3586(-95);
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg1 - class55.field865;
        int var7 = arg0 - class55.field866;
        for (class415 var8 = (class415) class55.field841.method1904(false); var8 != null; var8 = (class415) class55.field841.method1901(105)) {
            if (var8.field6142 == arg2) {
                int var9 = var8.field6143;
                int var10 = var8.field6145;
                int var11 = var9 + class55.field865 << 14 | class55.field866 + var10;
                int var12 = (var7 - var10) * (var7 - var10) + (var6 - var9) * (var6 - var9);
                if (var4 < 0 || var5 > var12) {
                    var4 = var11;
                    var5 = var12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)I", line = 71)
    public final int method3585(byte arg0) {
        if (arg0 <= 38) {
            this.field8998 = -70;
        }
        field9003++;
        return this.field8999;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)Ltp;", line = 90)
    public static final class542 method3586(int arg0) {
        field8996++;
        try {
            if (arg0 > -33) {
                field8997 = -101;
            }
            return (class542) Class.forName("dq").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lps;I)Lps;", line = 112)
    public static final class5 method3587(class5 arg0, int arg1) {
        field9002++;
        if (arg1 != -1087028336) {
            field8997 = 44;
        }
        if (arg0.field87 != -1) {
            return class705.method3944(arg0.field87, (byte) 125);
        }
        int var2 = arg0.field65 >>> 16;
        class194 var3 = new class194(class318.field4623);
        for (class200 var4 = (class200) var3.method1260(30); var4 != null; var4 = (class200) var3.method1257((byte) -17)) {
            if (var4.field2716 == var2) {
                return class705.method3944((int) var4.field5740, (byte) 114);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(II)V", line = 142)
    public class622(int arg0, int arg1) {
        this.field8998 = arg1;
        this.field8999 = arg0;
    }

    @OriginalMember(owner = "client!vg", name = "toString", descriptor = "()Ljava/lang/String;", line = 151)
    public final String toString() {
        field9001++;
        throw new IllegalStateException();
    }
}
