import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class43 extends class232 {

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "Lhi;")
    public static class82 field754 = class95.method664((byte) -64, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "[I")
    public static int[] field749 = new int[32768];

    @OriginalMember(owner = "client!ri", name = "Y", descriptor = "I")
    public static int field758 = 0;

    @OriginalMember(owner = "client!ri", name = "X", descriptor = "Lhi;")
    private static class82 field757 = class95.method664((byte) -45, " from your friend list first)3");

    @OriginalMember(owner = "client!ri", name = "Z", descriptor = "Lhi;")
    public static class82 field759 = class95.method664((byte) -50, "(Z");

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "Lhi;")
    public static class82 field752 = field757;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!ri", name = "W", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(IB)[I", line = 9)
    public final int[] method80(int arg0, byte arg1) {
        int[] var3 = this.field4008.method131((byte) -93, arg0);
        int var4 = -70 / ((-arg1 - 31) / 55);
        if (this.field4008.field256) {
            int[][] var5 = this.method1641(0, arg0, (byte) -98);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            for (int var9 = 0; var9 < class54.field858; var9++) {
                var3[var9] = (var7[var9] + var8[var9] + var6[var9]) / 3;
            }
        }
        field753++;
        return var3;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V", line = 43)
    public class43() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lum;ZIIIIB)V", line = 55)
    public static final void method323(class222 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        class243.field4227 = arg3;
        class28.field380 = arg5;
        int var7 = 118 / ((arg6 - 66) / 52);
        class265.field4529 = arg4;
        class315.field5422 = arg0;
        class77.field1324 = 1;
        class136.field2348 = arg2;
        class293.field4918 = arg1;
        field755++;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(B)V", line = 82)
    public static void method324(byte arg0) {
        field752 = null;
        field754 = null;
        field759 = null;
        field757 = null;
        if (arg0 < 81) {
            method324((byte) 3);
        }
        field749 = null;
    }

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "(I)V", line = 114)
    public static final void method325(int arg0) {
        field750++;
        int var1 = class264.method1877(1);
        if (arg0 != 18916) {
            return;
        }
        if (var1 == 0) {
            class138.field2376 = (byte[][][]) null;
            class257.method1841((byte) 51, 0);
        } else if (var1 == 1) {
            class153.method1094(-121, (byte) 0);
            class257.method1841((byte) 51, 512);
            class29.method178(-105);
        } else {
            class153.method1094(arg0 - 19038, (byte) (class47.field789 + -4 & 0xFF));
            class257.method1841((byte) 51, 2);
        }
    }
}
