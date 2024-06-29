import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public abstract class class62 extends class135 {

    @OriginalMember(owner = "client!ki", name = "C", descriptor = "Z")
    public volatile boolean field854 = true;

    @OriginalMember(owner = "client!ki", name = "A", descriptor = "I")
    public static int field852 = 0;

    @OriginalMember(owner = "client!ki", name = "D", descriptor = "Ljava/lang/String;")
    public static String field855 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!ki", name = "H", descriptor = "I")
    public static int field859 = 0;

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!ki", name = "B", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!ki", name = "G", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "Z")
    public boolean field850;

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "Z")
    public boolean field857;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)V")
    public static final void method430(int arg0) {
        if (arg0 != 1424) {
            field852 = -55;
        }
        field856++;
        class190.field2998.method1420(arg0 ^ 0xFFFFFA6F);
        class116.field1720.method1420(-1);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(Z)[Lhc;")
    public static final class229[] method431(boolean arg0) {
        field851++;
        class229[] var1 = new class229[class35.field454];
        if (!arg0) {
            return null;
        }
        for (int var2 = 0; var2 < class35.field454; var2++) {
            int var3 = class236.field3777[var2] * class228.field3696[var2];
            byte[] var4 = class101.field1574[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class72.field1023[class224.method1526(var4[var6], 255)];
            }
            var1[var2] = new class12(class46.field583, class209.field3253, class206.field3221[var2], class226.field3653[var2], class236.field3777[var2], class228.field3696[var2], var5);
        }
        class222.method1506((byte) 113);
        return var1;
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)[B")
    public abstract byte[] method432(int arg0);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLb;)V")
    public static final void method433(boolean arg0, class83 arg1) {
        field858++;
        long var2 = 0L;
        if (arg1.field1299 == 0) {
            var2 = class224.method1529(arg1.field1309, arg1.field1298, arg1.field1310);
        }
        if (arg1.field1299 == 1) {
            var2 = class90.method607(arg1.field1309, arg1.field1298, arg1.field1310);
        }
        if (arg1.field1299 == 2) {
            var2 = class23.method161(arg1.field1309, arg1.field1298, arg1.field1310);
        }
        int var4 = -1;
        if (arg1.field1299 == 3) {
            var2 = class87.method600(arg1.field1309, arg1.field1298, arg1.field1310);
        }
        int var5 = 0;
        int var6 = 0;
        if (var2 != 0L) {
            var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var5 = (int) var2 >> 14 & 0x1F;
            var6 = (int) var2 >> 20 & 0x3;
        }
        arg1.field1300 = var5;
        arg1.field1304 = var4;
        if (arg0) {
            arg1.field1306 = var6;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)I")
    public abstract int method434(byte arg0);

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)V")
    public static void method435(int arg0) {
        field855 = null;
        if (arg0 != -24047) {
            field852 = -109;
        }
    }
}
