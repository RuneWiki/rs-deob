import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class265 extends class39 {

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "[I")
    public static int[] field3934 = new int[13];

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "[B")
    private byte[] field3929;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(III)I")
    public static final int method1695(int arg0, int arg1, int arg2) {
        field3931++;
        if (arg1 == 4 || arg1 == 5) {
            return class544.field8127[arg0 & 0x3];
        } else {
            if (arg2 != -18490) {
                method1695(-96, 63, -50);
            }
            return 256;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BII)V")
    public final void method199(byte arg0, int arg1, int arg2) {
        field3932++;
        int var4 = arg1 * 2;
        int var5 = arg0 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field3929[var10001] = (byte) (var5 * 3 >> 5);
        this.field3929[var6] = (byte) (var5 * 3 >> 5);
        if (arg2 < 26) {
            this.method1697(57, 38, 126, 9);
        }
    }

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "(I)V")
    public static void method1696(int arg0) {
        field3934 = null;
        if (arg0 != 3) {
            method1698(-44, -10, 96, 32, (byte) -67);
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(IIII)[B")
    public final byte[] method1697(int arg0, int arg1, int arg2, int arg3) {
        field3930++;
        this.field3929 = new byte[arg2 * arg3 * arg0 * 2];
        if (arg1 == 0) {
            this.method2960(4095, arg2, arg3, arg0);
            return this.field3929;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIB)V")
    public static final void method1698(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != 75) {
            field3934 = null;
        }
        for (int var5 = 0; var5 < class395.field5741; var5++) {
            Rectangle var6 = class280.field4162[var5];
            if (arg0 < var6.x + var6.width && (arg0 + arg3) > var6.x && arg2 < var6.y + var6.height && (arg1 + arg2) > var6.y) {
                class644.field9344[var5] = true;
            }
        }
        field3933++;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
    public class265() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
