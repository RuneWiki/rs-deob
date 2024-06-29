import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class657 extends class289 {

    @OriginalMember(owner = "client!am", name = "M", descriptor = "I")
    public static int field8863 = 100;

    @OriginalMember(owner = "client!am", name = "G", descriptor = "I")
    public static int field8862;

    @OriginalMember(owner = "client!am", name = "N", descriptor = "I")
    public static int field8864;

    @OriginalMember(owner = "client!am", name = "P", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!am", name = "Q", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!am", name = "S", descriptor = "I")
    public static int field8869;

    @OriginalMember(owner = "client!am", name = "R", descriptor = "Lbp;")
    public static class406 field8868;

    @OriginalMember(owner = "client!am", name = "O", descriptor = "[B")
    private byte[] field8865;

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V", line = 7)
    public class657() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/awt/Canvas;B)V", line = 10)
    public static final void method3648(Canvas arg0, byte arg1) {
        if (arg1 < 105) {
            return;
        }
        field8869++;
        Dimension var2 = arg0.getSize();
        class306.method1982(-2, var2.height, var2.width);
        if (class206.field2664 == 1) {
            class685.field9171.method546(arg0, class169.field2222, class776.field10671);
        } else {
            class685.field9171.method546(arg0, class265.field3899, class220.field2858);
        }
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(B)V", line = 28)
    public static void method3649(byte arg0) {
        int var1 = 30 / ((arg0 - 39) / 58);
        field8868 = null;
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(I)V", line = 37)
    public static final void method3650(int arg0) {
        class389.field5637 = 0;
        if (arg0 != 100) {
            field8863 = -33;
        }
        field8864++;
        boolean var1 = class560.field7678.method1711(-125) == 1;
        int var2 = class560.field7678.method1711(-119);
        int var3 = class560.field7678.method1712(0);
        int var4 = class560.field7678.method1728((byte) 62);
        class176.method1210((byte) 52);
        class394.method2422(var2, -2);
        int var5 = (class442.field6366 - class560.field7678.field3725) / 16;
        class92.field1289 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class92.field1289[var6][var10] = class560.field7678.method1672(arg0 - 16616);
            }
        }
        class328.field4651 = new byte[var5][];
        class592.field8095 = new int[var5];
        class639.field8603 = new int[var5];
        class168.field2216 = new byte[var5][];
        class238.field3158 = new int[var5];
        class754.field10206 = new byte[var5][];
        class649.field8753 = new int[var5];
        class294.field4168 = new byte[var5][];
        class542.field7496 = new int[var5];
        class361.field5245 = null;
        class550.field7592 = null;
        int var7 = 0;
        for (int var8 = (var3 - (class102.field1467 >> 4)) / 8; var8 <= (((class102.field1467 >> 4) + var3) / 8); var8++) {
            for (int var9 = (var4 - (class393.field5663 >> 4)) / 8; var9 <= (((class393.field5663 >> 4) + var4) / 8); var9++) {
                class649.field8753[var7] = (var8 << 8) + var9;
                class592.field8095[var7] = class577.field7862.method1173(false, "m" + var8 + "_" + var9);
                class238.field3158[var7] = class577.field7862.method1173(false, "l" + var8 + "_" + var9);
                class542.field7496[var7] = class577.field7862.method1173(false, "um" + var8 + "_" + var9);
                class639.field8603[var7] = class577.field7862.method1173(false, "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        class775.method4264((byte) -87, var4, var1, var3, 11);
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(IIZI)[B", line = 114)
    public final byte[] method3651(int arg0, int arg1, boolean arg2, int arg3) {
        field8862++;
        this.field8865 = new byte[arg0 * arg3 * arg1 * 2];
        if (arg2) {
            field8868 = null;
        }
        this.method69(arg0, arg3, !arg2, arg1);
        return this.field8865;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIILofa;)V", line = 131)
    public static final void method3652(int arg0, int arg1, int arg2, class347 arg3) {
        if (arg0 != -8674) {
            return;
        }
        field8867++;
        if (class528.field7306 != null || class677.field9075 || arg3 == null || class733.method4045(-24216, arg3) == null) {
            return;
        }
        class528.field7306 = arg3;
        class237.field3155 = class733.method4045(arg0 - 15542, arg3);
        class735.field9960 = 0;
        class425.field6177 = false;
        class723.field9822 = arg1;
        class99.field1441 = arg2;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BIB)V", line = 154)
    public final void method1855(byte arg0, int arg1, byte arg2) {
        field8866++;
        int var4 = arg1 * 2;
        int var10001 = var4;
        int var7 = var4 + 1;
        this.field8865[var10001] = -1;
        int var5 = 15 % ((78 - arg2) / 43);
        int var6 = arg0 & 0xFF;
        this.field8865[var7] = (byte) (var6 * 3 >> 5);
    }
}
