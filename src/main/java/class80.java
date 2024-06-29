import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class80 {

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "[I")
    private int[] field999;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Z")
    public static boolean field991 = false;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Leh;")
    public static class137 field994;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Leh;")
    public static class137 field997;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Ljava/awt/Image;")
    public static Image field996;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method446(String arg0, int arg1) {
        field992++;
        int var2 = class274.method1840(arg0, 120);
        if (var2 == -1) {
            return;
        }
        int[] var3 = class238.field3928.method1020(class209.field3336.field494[var2] & 0x3FFF, (byte) 63, (class209.field3336.field494[var2] & 0x38E0F0D6) >> 28, (class209.field3336.field494[var2] & 0xFFFFEA5) >> 14);
        if (arg1 != -574423858) {
            method446((String) null, -33);
        }
        client.method725(var3[2], var3[1], (byte) 98);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)I")
    public final int method447(int arg0, int arg1) {
        field995++;
        int var3 = (this.field999.length >> 1) - 1;
        int var4 = var3 & arg0;
        if (arg1 != 1) {
            field997 = null;
        }
        while (true) {
            int var5 = this.field999[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field999[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method448(int arg0) {
        field997 = null;
        field996 = null;
        if (arg0 > -15) {
            method448(-51);
        }
        field994 = null;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "([I)V")
    public class80(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field999 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field999[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field999[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field999[var5 + var5] = arg0[var4];
            this.field999[var5 + var5 + 1] = var4++;
        }
    }
}
