import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class85 extends class335 {

    @OriginalMember(owner = "client!ps", name = "Fb", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!ps", name = "Gb", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!ps", name = "Hb", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!ps", name = "Ib", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IF)V")
    public final void method692(int arg0, float arg1) {
        ++field1301;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field4600[super.field4619++] = (byte) var3;
        super.field4600[super.field4619++] = (byte) (var3 >> 8);
        super.field4600[super.field4619++] = (byte) (var3 >> 16);
        super.field4600[super.field4619++] = (byte) (var3 >> 24);
        int var4 = -27 % ((arg0 - 41) / 63);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(FI)V")
    public final void method693(float arg0, int arg1) {
        ++field1302;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field4600[super.field4619++] = (byte) (var3 >> 24);
        if (arg1 <= 24) {
            method694(-51);
        }
        super.field4600[super.field4619++] = (byte) (var3 >> 16);
        super.field4600[super.field4619++] = (byte) (var3 >> 8);
        super.field4600[super.field4619++] = (byte) var3;
    }

    @OriginalMember(owner = "client!ps", name = "u", descriptor = "(I)V")
    public static final void method694(int arg0) {
        ++field1303;
        if (arg0 != -3299) {
            method694(26);
        }
        for (class99 var1 = (class99) class666.field9449.method3257(-102); var1 != null; var1 = (class99) class666.field9449.method3263((byte) -86)) {
            class236 var2 = var1.field1495;
            if (!var2.field3346) {
                if (var2.field3316 <= class642.field8626) {
                    var2.method1469(true, class104.field1561);
                    if (var2.field3346) {
                        var1.method2797(-103);
                    } else {
                        class618.method3385(var2, true);
                    }
                }
            } else {
                var1.method2797(77);
                var2.method1470((byte) -113);
            }
        }
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(I)V")
    public class85(int arg0) {
        super(arg0);
    }
}
