import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class73 extends class238 {

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)I")
    public static final int method630(byte arg0, int arg1) {
        field1099++;
        int var2 = -52 / (arg0 / 42);
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IJ)V")
    public static final void method631(int arg0, long arg1) {
        field1100++;
        if (arg0 != -2) {
            method630((byte) 11, 60);
        }
        int var3 = class472.field6697;
        if (class646.field9302 != var3) {
            int var4 = var3 - class646.field9302;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (var4 > 0) {
                if (var5 == 0) {
                    var5 = 1;
                } else if (var4 < var5) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = -1;
            } else if (var4 > var5) {
                var5 = var4;
            }
            class646.field9302 += var5;
        }
        int var6 = class658.field9426;
        class680.field9668 += (float) arg1 * class112.field1579 / 40.0F * 8.0F;
        if (class537.field7811 != var6) {
            int var7 = var6 - class537.field7811;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class537.field7811 += var8;
        }
        class112.field1584 += (float) arg1 * class201.field2980 / 40.0F * 8.0F;
        class553.method3324(false);
    }
}
