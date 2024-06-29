import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class380 {

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public int field5311;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public int field5315;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Z")
    public boolean field5309;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "S")
    public short field5310;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public int field5314;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "S")
    public short field5313;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public int field5318;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public int field5316;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "S")
    public short field5320;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "B")
    public byte field5312;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field5317 = 0;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/awt/Canvas;B)V", line = 22)
    public static final void method2297(Canvas arg0, byte arg1) {
        if (arg1 != 54) {
            return;
        }
        field5319++;
        Dimension var2 = arg0.getSize();
        class181.method1165(var2.width, var2.height, 115);
        if (class709.field9973 == 1) {
            class422.field5998.method98(arg0, class635.field8800, class162.field2073);
        } else {
            class422.field5998.method98(arg0, class199.field2547, class210.field2691);
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 45)
    public class380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field5311 = arg1;
        this.field5315 = arg2;
        this.field5309 = arg10;
        this.field5310 = (short) arg6;
        this.field5314 = arg3;
        this.field5313 = (short) arg5;
        this.field5318 = arg0;
        this.field5316 = arg11;
        this.field5320 = (short) arg4;
        this.field5312 = (byte) arg8;
    }
}
