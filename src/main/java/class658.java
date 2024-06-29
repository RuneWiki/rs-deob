import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class658 {

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "Ljava/lang/String;")
    public String field9402;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "J")
    public long field9400;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Ljava/lang/String;")
    public String field9398;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public int field9396;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public int field9401;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field9397;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field9399;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field9403;

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class658(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field9402 = arg3;
        this.field9400 = arg4;
        this.field9398 = arg1;
        this.field9396 = arg2;
        this.field9401 = arg0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)I")
    public static final int method3711(byte arg0) {
        if (arg0 >= -96) {
            method3711((byte) 9);
        }
        field9399++;
        class98 var1 = class332.field4821;
        boolean var2 = false;
        if (class62.field996 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class98.method701(null, null, var3, 0, 1, 0);
        }
        long var4 = class60.method371(false);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method634(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class60.method371(false) - var4);
        var1.method710(0, 22339, -16777216, 100, 0, 100);
        if (var2) {
            var1.method623((byte) 82);
        }
        return var7;
    }
}
