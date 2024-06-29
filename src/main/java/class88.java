import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class88 extends class177 {

    @OriginalMember(owner = "client!wl", name = "H", descriptor = "I")
    private int field1290 = 2048;

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "I")
    private int field1286 = 1024;

    @OriginalMember(owner = "client!wl", name = "E", descriptor = "I")
    private int field1288 = 3072;

    @OriginalMember(owner = "client!wl", name = "F", descriptor = "J")
    public static long field1289 = 0L;

    @OriginalMember(owner = "client!wl", name = "K", descriptor = "Lgk;")
    public static class7 field1293 = new class7(5000);

    @OriginalMember(owner = "client!wl", name = "O", descriptor = "I")
    public static int field1297 = 0;

    @OriginalMember(owner = "client!wl", name = "D", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!wl", name = "I", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!wl", name = "J", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!wl", name = "M", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!wl", name = "N", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!wl", name = "L", descriptor = "Llb;")
    public static class211 field1294;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 4)
    public final void method465(int arg0) {
        field1291++;
        int var2 = -16 % ((-arg0 - 6) / 43);
        this.field1290 = this.field1288 - this.field1286;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)[I", line = 14)
    public final int[] method95(int arg0, int arg1) {
        field1296++;
        int[] var3 = this.field2652.method1481(arg1, (byte) -116);
        if (arg0 > -52) {
            this.method465(-30);
        }
        if (this.field2652.field3287) {
            int[] var4 = this.method1280(arg1, 0, false);
            for (int var5 = 0; var5 < class287.field4415; var5++) {
                var3[var5] = (var4[var5] * this.field1290 >> 12) + this.field1286;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V", line = 48)
    public class88() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lhb;II)V", line = 54)
    public final void method97(class35 arg0, int arg1, int arg2) {
        field1287++;
        if (arg2 == 0) {
            this.field1286 = arg0.method300(-1394191632);
        } else if (arg2 == 1) {
            this.field1288 = arg0.method300(arg1 - 1394173571);
        } else if (arg2 == 2) {
            this.field2649 = arg0.method273(65280) == 1;
        }
        if (arg1 != -18061) {
            this.method465(85);
        }
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)V", line = 98)
    public static void method721(int arg0) {
        field1293 = null;
        field1294 = null;
        if (arg0 != 0) {
            method721(104);
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)[[I", line = 138)
    public final int[][] method99(int arg0, int arg1) {
        if (arg1 != -23387) {
            this.field1290 = 119;
        }
        field1292++;
        int[][] var3 = this.field2645.method1456(arg0, (byte) -113);
        if (this.field2645.field3203) {
            int[][] var4 = this.method1285(0, arg0, 27847);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class287.field4415; var11++) {
                var8[var11] = (var5[var11] * this.field1290 >> 12) + this.field1286;
                var9[var11] = (var6[var11] * this.field1290 >> 12) + this.field1286;
                var10[var11] = (var7[var11] * this.field1290 >> 12) + this.field1286;
            }
        }
        return var3;
    }
}
