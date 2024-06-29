import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class457 extends class71 {

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    public int field6328 = 0;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "Lkr;")
    public static class602 field6329 = new class602(107, 6);

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public int field6325;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    public int field6327;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "I")
    public int field6331;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "I")
    public int field6332;

    @OriginalMember(owner = "client!km", name = "t", descriptor = "I")
    public int field6335;

    @OriginalMember(owner = "client!km", name = "w", descriptor = "I")
    public int field6338;

    @OriginalMember(owner = "client!km", name = "x", descriptor = "I")
    public int field6339;

    @OriginalMember(owner = "client!km", name = "z", descriptor = "I")
    public int field6341;

    @OriginalMember(owner = "client!km", name = "A", descriptor = "I")
    public int field6342;

    @OriginalMember(owner = "client!km", name = "C", descriptor = "I")
    public int field6344;

    @OriginalMember(owner = "client!km", name = "D", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!km", name = "E", descriptor = "I")
    public int field6346;

    @OriginalMember(owner = "client!km", name = "G", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!km", name = "H", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!km", name = "J", descriptor = "I")
    public int field6351;

    @OriginalMember(owner = "client!km", name = "K", descriptor = "I")
    public int field6352;

    @OriginalMember(owner = "client!km", name = "M", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!km", name = "P", descriptor = "I")
    public int field6357;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "Lkba;")
    public class187 field6326;

    @OriginalMember(owner = "client!km", name = "F", descriptor = "Lkba;")
    public class187 field6347;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "Lts;")
    public class220 field6330;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "Lwq;")
    public class679 field6333;

    @OriginalMember(owner = "client!km", name = "L", descriptor = "Lwo;")
    public class695 field6353;

    @OriginalMember(owner = "client!km", name = "O", descriptor = "Lwo;")
    public class695 field6356;

    @OriginalMember(owner = "client!km", name = "y", descriptor = "Lkca;")
    public class760 field6340;

    @OriginalMember(owner = "client!km", name = "I", descriptor = "Lkca;")
    public class760 field6350;

    @OriginalMember(owner = "client!km", name = "B", descriptor = "Lcea;")
    public class96 field6343;

    @OriginalMember(owner = "client!km", name = "s", descriptor = "Z")
    public boolean field6334;

    @OriginalMember(owner = "client!km", name = "u", descriptor = "Z")
    public boolean field6336;

    @OriginalMember(owner = "client!km", name = "N", descriptor = "Z")
    public boolean field6355;

    @OriginalMember(owner = "client!km", name = "v", descriptor = "[I")
    public int[] field6337;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIZILdw;II[B)Lgv;")
    public static final class702 method2792(int arg0, int arg1, boolean arg2, int arg3, class664 arg4, int arg5, int arg6, byte[] arg7) {
        if (arg6 <= 64) {
            method2794((byte) -111);
        }
        field6354++;
        if (!arg4.field9071 && (!class88.method611(arg0, 2) || !class88.method611(arg5, 2))) {
            return arg4.field9057 ? new class702(arg4, 34037, arg1, arg0, arg5, arg2, arg7, arg3) : new class702(arg4, arg1, arg0, arg5, class606.method3450(arg0, (byte) -25), class606.method3450(arg5, (byte) -25), arg7, arg3);
        } else {
            return new class702(arg4, 3553, arg1, arg0, arg5, arg2, arg7, arg3);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
    public final void method2793(byte arg0) {
        field6349++;
        int var2 = this.field6327;
        boolean var3 = this.field6355;
        if (this.field6330 != null) {
            class220 var4 = this.field6330.method1297(class124.field1712, 21559);
            if (var4 == null) {
                this.field6355 = false;
                this.field6341 = 0;
                this.field6336 = false;
                this.field6332 = 256;
                this.field6327 = -1;
                this.field6357 = 0;
                this.field6325 = 0;
                this.field6335 = 0;
                this.field6337 = null;
                this.field6346 = 0;
                this.field6339 = 256;
            } else {
                this.field6341 = var4.field2910;
                this.field6355 = var4.field2886;
                this.field6327 = var4.field2881;
                this.field6325 = var4.field2905;
                this.field6339 = var4.field2879;
                this.field6332 = var4.field2944;
                this.field6346 = var4.field2914;
                this.field6335 = var4.field2941 << 9;
                this.field6336 = var4.field2898;
                this.field6337 = var4.field2923;
            }
        } else if (this.field6333 != null) {
            int var5 = class260.method1759(this.field6333, -1);
            if (var2 != var5) {
                this.field6327 = var5;
                class123 var6 = this.field6333.field9436;
                if (var6.field1700 != null) {
                    var6 = var6.method773(class124.field1712, false);
                }
                if (var6 == null) {
                    this.field6332 = 256;
                    this.field6325 = this.field6335 = this.field6357 = 0;
                    this.field6339 = 256;
                    this.field6355 = this.field6333.field9436.field1644;
                } else {
                    this.field6355 = var6.field1644;
                    this.field6335 = var6.field1687 << 9;
                    this.field6332 = var6.field1659;
                    this.field6339 = var6.field1701;
                    this.field6325 = var6.field1692;
                    this.field6357 = var6.field1679 << 9;
                }
            }
        } else if (this.field6343 != null) {
            this.field6327 = class720.method4035(this.field6343, false);
            this.field6357 = 0;
            this.field6325 = this.field6343.field1339;
            this.field6335 = this.field6343.field1367 << 9;
            this.field6332 = 256;
            this.field6355 = this.field6343.field1330;
            this.field6339 = 256;
        }
        if ((this.field6327 != var2 || this.field6355 != var3) && this.field6340 != null) {
            class483.field6739.method361(this.field6340);
            this.field6340 = null;
            this.field6326 = null;
            this.field6356 = null;
        }
        int var7 = -56 / ((arg0 + 33) / 43);
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(B)V")
    public static void method2794(byte arg0) {
        field6329 = null;
        if (arg0 < 118) {
            field6329 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V")
    public static final void method2795(boolean arg0) {
        field6348++;
        if (class320.field4444 != null) {
            return;
        }
        class320.field4444 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var11 = var16;
                    var9 = var8;
                    var10 = var18;
                } else if (var14 == 1) {
                    var9 = var17;
                    var10 = var8;
                    var11 = var16;
                } else if (var14 == 2) {
                    var11 = var18;
                    var10 = var8;
                    var9 = var16;
                } else if (var14 == 3) {
                    var10 = var17;
                    var9 = var16;
                    var11 = var8;
                } else if (var14 == 4) {
                    var11 = var8;
                    var9 = var18;
                    var10 = var16;
                } else if (var14 == 5) {
                    var11 = var17;
                    var9 = var8;
                    var10 = var16;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var22 << 16) + (var23 << 8) + var24 - 16777216;
                class320.field4444[var3++] = var25;
            }
        }
        if (!arg0) {
            field6329 = null;
        }
    }
}
