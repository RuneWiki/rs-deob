import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class373 {

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "Llj;")
    public class439 field5672 = null;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "Llj;")
    public class439 field5680 = null;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "[Lwv;")
    public class25[] field5678 = null;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "[Lwv;")
    public class25[] field5681 = null;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "Llj;")
    public class439 field5683 = null;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "Z")
    public boolean field5673;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "Z")
    public static boolean field5676 = false;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "Laa;")
    public static class341 field5674;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "Lpc;")
    public static class483 field5679;

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lnq;)V", line = 146)
    public class373(class325 arg0) {
        this.field5673 = arg0.field4964;
        class528.method3127(arg0, -106);
        if (this.field5673) {
            byte[] var2 = class250.method1620(class313.field4578, (byte) 78, false);
            this.field5680 = new class439(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class250.method1620(class524.field7708, (byte) 29, false);
            this.field5672 = new class439(arg0, 6410, 128, 128, 16, var3, 6410);
            class71 var4 = arg0.field4898;
            if (var4.method497(0)) {
                byte[] var5 = class250.method1620(class288.field4205, (byte) 114, false);
                this.field5683 = new class439(arg0, 6408, 128, 128, 16);
                class439 var6 = new class439(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method496(var6, this.field5683, 2.0F, (byte) -44)) {
                    this.field5683.method3175(-1);
                } else {
                    this.field5683.method3172(6146);
                    this.field5683 = null;
                }
                var6.method3172(6146);
                return;
            }
        } else {
            this.field5678 = new class25[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class21.method193(var7 * 128 * 128 * 2, 32768, true, class313.field4578);
                this.field5678[var7] = new class25(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field5681 = new class25[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class21.method193(var8 * 32768, 32768, true, class524.field7708);
                this.field5681[var8] = new class25(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V", line = 15)
    public static final void method2354(byte arg0) {
        int var1 = 1 % ((31 - arg0) / 45);
        field5682++;
        if (class85.field1240 != null) {
            class85.field1240.method402((byte) 36);
        }
        if (class406.field6165 != null) {
            class406.field6165.method402((byte) 36);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLqq;[[B)V", line = 35)
    public static final void method2355(byte arg0, class337 arg1, byte[][] arg2) {
        field5677++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        if (arg0 != 67) {
            field5674 = null;
        }
        for (int var4 = 0; var4 < arg1.field3653; var4++) {
            class523.method3104((byte) -1);
            for (int var5 = 0; var5 < (class398.field6071 >> 3); var5++) {
                for (int var6 = 0; var6 < (class528.field7734 >> 3); var6++) {
                    int var7 = class156.field2033[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg1.field3647 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = (var7 & 0x3FFF) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class510.field7490.length; var13++) {
                                if (class510.field7490[var13] == var12 && arg2[var13] != null) {
                                    class164 var14 = new class164(arg2[var13]);
                                    arg1.method1680(var4, var8, var9, var6 * 8, var10, var11, var14, class9.field174, var5 * 8, 0);
                                    arg1.method2181(-73, var4, var5 * 8, class400.field6090, var6 * 8, var8, var11, var10, var3[0] == -1 ? var3 : null, var14, var9);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class121.field1655 = class332.field5172.method2209(class182.field2469, var3[3], var3[2], var3[1], arg0 ^ 0x9, var3[0]);
            class361.field5534 = var3[4];
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 133)
    public static void method2356(int arg0) {
        field5674 = null;
        if (arg0 != -15417) {
            method2354((byte) 67);
        }
        field5679 = null;
    }
}
