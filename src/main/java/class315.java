import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class315 extends class425 {

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public int field4649;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public int field4652;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "Lqfa;")
    public static class85 field4651 = new class85(76, 12);

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static void method2038(int arg0) {
        if (arg0 > -89) {
            method2039(false);
        }
        field4651 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)I")
    public static final int method2039(boolean arg0) {
        field4653++;
        if (arg0) {
            method2038(60);
        }
        if (class308.field4551) {
            return 6;
        } else if (class650.field9374 == null) {
            return 0;
        } else {
            int var1 = class650.field9374.field4465;
            if (class10.method281(var1, !arg0)) {
                return 1;
            } else if (class129.method1095(-45, var1)) {
                return 2;
            } else if (class602.method3438(var1, -89)) {
                return 3;
            } else if (class219.method1522(72, var1)) {
                return 4;
            } else {
                return 5;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(II)V")
    public class315(int arg0, int arg1) {
        this.field4649 = arg1;
        this.field4652 = arg0;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
    public static final void method2040(byte arg0) {
        class470.field6673 = 0;
        field4650++;
        int var1 = class126.field2299.method729((byte) -60);
        int var2 = class126.field2299.method731(26585);
        int var3 = class126.field2299.method734((byte) -23);
        boolean var4 = class126.field2299.method724(109) == 1;
        class628.method3596(-1);
        class540.method3118(var3, -20476);
        int var5 = (class478.field6872 - class126.field2299.field1393) / 16;
        class253.field3756 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var11 = 0; var11 < 4; var11++) {
                class253.field3756[var6][var11] = class126.field2299.method730(-89);
            }
        }
        int var7 = 61 % ((-arg0 - 46) / 45);
        class118.field2100 = new int[var5];
        class520.field7366 = new byte[var5][];
        class607.field8843 = new int[var5];
        class221.field3340 = new byte[var5][];
        class408.field5904 = new byte[var5][];
        class335.field5019 = new int[var5];
        class251.field3744 = new int[var5];
        class81.field1589 = new byte[var5][];
        class213.field3252 = null;
        class304.field4509 = null;
        class600.field8603 = new int[var5];
        int var8 = 0;
        for (int var9 = (var1 - (class675.field9604 >> 4)) / 8; var9 <= ((class675.field9604 >> 4) + var1) / 8; var9++) {
            for (int var10 = (var2 - (class218.field3316 >> 4)) / 8; var10 <= (var2 + (class218.field3316 >> 4)) / 8; var10++) {
                class335.field5019[var8] = (var9 << 8) + var10;
                class607.field8843[var8] = class13.field722.method2228("m" + var9 + "_" + var10, 5781);
                class251.field3744[var8] = class13.field722.method2228("l" + var9 + "_" + var10, 5781);
                class118.field2100[var8] = class13.field722.method2228("um" + var9 + "_" + var10, 5781);
                class600.field8603[var8] = class13.field722.method2228("ul" + var9 + "_" + var10, 5781);
                var8++;
            }
        }
        class138.method1133(11, (byte) -16, var4, var1, var2);
    }
}
