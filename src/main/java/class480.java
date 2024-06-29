import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class class480 extends class271 {

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "Z")
    public volatile boolean field7045 = true;

    @OriginalMember(owner = "client!ag", name = "D", descriptor = "Lso;")
    public static class327 field7046 = new class327(6, 5);

    @OriginalMember(owner = "client!ag", name = "G", descriptor = "Llt;")
    public static class475 field7049 = new class475("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!ag", name = "H", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "Z")
    public boolean field7044;

    @OriginalMember(owner = "client!ag", name = "E", descriptor = "Z")
    public boolean field7047;

    @OriginalMember(owner = "client!ag", name = "F", descriptor = "[I")
    public static int[] field7048;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2855(boolean arg0) {
        field7046 = null;
        field7049 = null;
        if (arg0) {
            method2855(false);
        }
        field7048 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIBIZLnm;I)V", line = 19)
    public static final void method2856(int arg0, int arg1, byte arg2, int arg3, boolean arg4, class329 arg5, int arg6) {
        field7050++;
        if (class299.field4256 >= 50 || arg5 == null || arg5.field4663 == null || arg5.field4663.length <= arg6 || arg5.field4663[arg6] == null || arg2 <= 14) {
            return;
        }
        int var7 = arg5.field4663[arg6][0];
        int var8 = var7 >> 8;
        int var9 = var7 >> 5 & 0x7;
        int var10 = var7 & 0x1F;
        if (arg5.field4663[arg6].length > 1) {
            int var11 = (int) ((double) arg5.field4663[arg6].length * Math.random());
            if (var11 > 0) {
                var8 = arg5.field4663[arg6][var11];
            }
        }
        if (var10 == 0) {
            if (arg4) {
                class207.method1394(255, 100, var8, var9, 0);
            }
        } else if (class426.field6401.field996 != 0) {
            int var12 = arg1 - 64 >> 7;
            int var13 = arg0 - 64 >> 7;
            class333.field4700[class299.field4256++] = new class297((byte) 1, var8, var9, 0, 255, (var13 << 8) + ((arg3 << 24) + (var12 << 16)) + var10);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1291(int arg0);

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)I")
    public abstract int method1293(int arg0);
}
