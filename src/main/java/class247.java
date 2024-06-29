import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class247 extends class86 {

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "I")
    private int field3835 = 0;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "I")
    private int field3837 = 0;

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
    private int field3842 = 2000;

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "I")
    private int field3844 = 16;

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "I")
    private int field3845 = 4096;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "I")
    public static int field3840 = 0;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "[Lt;")
    public static class356[] field3836;

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V", line = 4)
    public class247() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lrn;II)Lqn;", line = 9)
    public static final class361 method1854(class18 arg0, int arg1, int arg2) {
        field3847++;
        if (class122.method1058(arg1 - 15830, arg2, arg0)) {
            return arg1 == 255 ? class79.method724(-100) : (class361) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lrn;B)V", line = 26)
    public static final void method1855(class18 arg0, byte arg1) {
        field3846++;
        class138.field2289 = class113.method978(arg0, class133.field2229, (byte) 54);
        class66.field996 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) (class140.field2332[var2] >> 16 & 0xFF);
            int var4 = class140.field2332[var2 + 1] >> 16 & 0xFF;
            float var5 = ((float) var4 - var3) / 64.0F;
            float var6 = (float) (class140.field2332[var2] >> 8 & 0xFF);
            int var7 = class140.field2332[var2 + 1] >> 8 & 0xFF;
            float var8 = ((float) var7 - var6) / 64.0F;
            float var9 = (float) (class140.field2332[var2] & 0xFF);
            int var10 = class140.field2332[var2 + 1] & 0xFF;
            float var11 = ((float) var10 - var9) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class66.field996[var2 * 64 + var12] = class41.method426(class41.method426((int) var6 << 8, (int) var3 << 16), (int) var9);
                var6 += var8;
                var3 += var5;
                var9 += var11;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class66.field996[var13] = class140.field2332[3];
        }
        class331.field5091 = new int[32768];
        class75.field1109 = new int[32768];
        class239.method1774(-28, (class77) null);
        if (arg1 != 62) {
            field3840 = -127;
        }
        class245.field3819 = new int[32768];
        class123.field1975 = new int[32768];
        class309.field4771 = new class361(128, 254);
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V", line = 93)
    public final void method476(int arg0) {
        field3841++;
        if (arg0 != 0) {
            this.method157(0, false, (class25) null);
        }
        class164.method1307((byte) 0);
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)V", line = 109)
    public static void method1856(boolean arg0) {
        if (arg0) {
            method1855((class18) null, (byte) 118);
        }
        field3836 = null;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V", line = 123)
    public static final void method1857(byte arg0) {
        if (arg0 <= 115) {
            method1854((class18) null, -61, 89);
        }
        field3838++;
        class334.field5108 = new class342[class228.field3561.method185(false)][];
        class151.field2468 = new boolean[class228.field3561.method185(false)];
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZLug;)V", line = 136)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        field3843++;
        if (arg0 == 0) {
            this.field3835 = arg2.method281(-124);
        } else if (arg0 == 1) {
            this.field3842 = arg2.method314((byte) 51);
        } else if (arg0 == 2) {
            this.field3844 = arg2.method281(-125);
        } else if (arg0 == 3) {
            this.field3837 = arg2.method314((byte) 99);
        } else if (arg0 == 4) {
            this.field3845 = arg2.method314((byte) 114);
        }
        if (arg1) {
            this.method158(-6, 66);
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)[I", line = 197)
    public final int[] method158(int arg0, int arg1) {
        field3839++;
        if (arg1 <= 7) {
            this.field3835 = -2;
        }
        int[] var3 = this.field1225.method1914(arg0, 53);
        if (this.field1225.field3995) {
            int var4 = this.field3845 >> 1;
            int[][] var5 = this.field1225.method1909((byte) 124);
            Random var6 = new Random((long) this.field3835);
            for (int var7 = 0; var7 < this.field3842; var7++) {
                int var8 = this.field3845 > 0 ? this.field3837 + class67.method659(this.field3845, var6, true) - var4 : this.field3837;
                int var9 = var8 >> 4 & 0xFF;
                int var10 = class67.method659(class93.field1424, var6, true);
                int var11 = class67.method659(class181.field2836, var6, true);
                int var12 = (class239.field3711[var9] * this.field3844 >> 12) + var10;
                int var13 = (class193.field3042[var9] * this.field3844 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = var12 - var10;
                if (var15 != 0 || var14 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var12;
                        var12 = var13;
                        var13 = var17;
                        int var18 = var10;
                        var10 = var11;
                        var11 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var12 - var10;
                    int var22 = var11;
                    int var23 = var13 - var11;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var24 = -var21 / 2;
                    int var25 = 2048 / var21;
                    int var26 = var11 < var13 ? 1 : -1;
                    int var27 = 1024 - (class67.method659(4096, var6, true) >> 2);
                    for (int var28 = var10; var28 < var12; var28++) {
                        var24 += var23;
                        int var29 = var27 + ((var28 - var10) * var25) + 1024;
                        int var30 = class280.field4324 & var22;
                        int var31 = var28 & class313.field4848;
                        if (var24 > 0) {
                            var22 += var26;
                            var24 += -var21;
                        }
                        if (var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
