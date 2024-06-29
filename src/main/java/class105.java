import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class105 extends class497 {

    @OriginalMember(owner = "client!fv", name = "s", descriptor = "I")
    private int field1366;

    @OriginalMember(owner = "client!fv", name = "t", descriptor = "I")
    private int field1367;

    @OriginalMember(owner = "client!fv", name = "D", descriptor = "I")
    private int field1377;

    @OriginalMember(owner = "client!fv", name = "w", descriptor = "I")
    private int field1370;

    @OriginalMember(owner = "client!fv", name = "u", descriptor = "Ljk;")
    public static class585 field1368 = new class585(35, -1);

    @OriginalMember(owner = "client!fv", name = "p", descriptor = "I")
    private int field1363;

    @OriginalMember(owner = "client!fv", name = "q", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!fv", name = "r", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!fv", name = "v", descriptor = "I")
    private int field1369;

    @OriginalMember(owner = "client!fv", name = "x", descriptor = "I")
    private int field1371;

    @OriginalMember(owner = "client!fv", name = "y", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!fv", name = "z", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!fv", name = "A", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!fv", name = "B", descriptor = "I")
    private int field1375;

    @OriginalMember(owner = "client!fv", name = "C", descriptor = "[B")
    private byte[] field1376;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V")
    public final void method766(int arg0) {
        field1374++;
        int var2 = 63 / ((82 - arg0) / 36);
        this.field1369 = 0;
        this.field1371 = 0;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(BII)V")
    public void method767(byte arg0, int arg1, int arg2) {
        if (arg2 < -96) {
            field1364++;
            this.field1376[arg1] = arg0;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(III)V")
    public final void method768(int arg0, int arg1, int arg2) {
        field1373++;
        if (~arg1 == arg0) {
            this.field1363 = this.field1366 - (arg2 < 0 ? -arg2 : arg2);
            this.field1375 = 4096;
            this.field1363 = this.field1363 * this.field1363 >> 12;
            this.field1371 = this.field1363;
            return;
        }
        this.field1375 = this.field1367 * this.field1363 >> 12;
        this.field1363 = this.field1366 - (arg2 >= 0 ? arg2 : -arg2);
        if (this.field1375 < 0) {
            this.field1375 = 0;
        } else if (this.field1375 > 4096) {
            this.field1375 = 4096;
        }
        this.field1363 = this.field1363 * this.field1363 >> 12;
        this.field1363 = this.field1375 * this.field1363 >> 12;
        this.field1371 += this.field1370 * this.field1363 >> 12;
        this.field1370 = this.field1377 * this.field1370 >> 12;
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class105(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field1366 = (int) (arg6 * 4096.0F);
        this.field1367 = (int) (arg7 * 4096.0F);
        this.field1370 = this.field1377 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)V")
    public final void method769(int arg0) {
        this.field1370 = this.field1377;
        this.field1371 >>= 0x4;
        field1365++;
        if (this.field1371 < 0) {
            this.field1371 = 0;
        } else if (this.field1371 > 255) {
            this.field1371 = 255;
        }
        int var2 = 113 / ((2 - arg0) / 53);
        this.method767((byte) this.field1371, this.field1369++, -99);
        this.field1371 = 0;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V")
    public static void method770(byte arg0) {
        if (arg0 >= -53) {
            method771((byte) 121);
        }
        field1368 = null;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(B)V")
    public static final void method771(byte arg0) {
        int var1 = 90 % ((-arg0 - 16) / 51);
        class652.field9223++;
        field1372++;
        class543 var2 = class299.method1780(class84.field1196, class395.field5586, 82);
        var2.field7872.method2281((byte) 58, 0);
        class511.method3028(7482, var2);
    }
}
