import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class279 extends class138 {

    @OriginalMember(owner = "client!sg", name = "O", descriptor = "Z")
    public boolean field4610 = false;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
    private int field4608 = 0;

    @OriginalMember(owner = "client!sg", name = "Q", descriptor = "I")
    private int field4612 = -1;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "Lad;")
    private class242 field4603;

    @OriginalMember(owner = "client!sg", name = "db", descriptor = "Z")
    private boolean field4624;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "Z")
    private boolean field4600;

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "Z")
    private boolean field4607;

    @OriginalMember(owner = "client!sg", name = "eb", descriptor = "Z")
    private boolean field4625;

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "I")
    private int field4599;

    @OriginalMember(owner = "client!sg", name = "gb", descriptor = "I")
    private int field4627;

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
    private int field4606;

    @OriginalMember(owner = "client!sg", name = "X", descriptor = "I")
    private int field4618;

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "[S")
    public static short[] field4604 = new short[] { 31, 25, 18, 51, 26, 22, 21, 37 };

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "[[S")
    public static short[][] field4605 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 115, 88, 59, 35, 16, 2, 823, 1837, 4019, 7091, 10169, 14259, 17331, 21427, 27571, 30643, -31821, -27721, -24647, -21593, -16587, -13391, 790, 5014, 7056, 1156, 15124, 19986, 30610, -30830, -27758, -23664, -17518, -14446, -9328, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 115, 88, 59, 35, 16, 2, 819, 929, 792, 2743, 2729, 3858, 4923, 4907, 4884, 7995, 7966, 11069, 11047, 11028, 18227, 18204, 18314, 30397, 30373, 30350, -31175, -31197, -32116, -25920, -25939, -25960, -21833, -21849, -21740, -19008, -18011, -18928, -11845, -11867, -14736, 23440, 22032, 21642, 1752, 4946, 8916, 14036, 25948, 32472, -27950, -20778, -15660, -7470, 8097, 7830, 5392, 4890, 4882, 788, 530, -22756, -24044, 13964 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 115, 88, 59, 35, 16, 2, 819, 929, 792, 2743, 2729, 3858, 4923, 4907, 4884, 7995, 7966, 11069, 11047, 11028, 18227, 18204, 18314, 30397, 30373, 30350, -31175, -31197, -32116, -25920, -25939, -25960, -21833, -21849, -21740, -19008, -18011, -18928, -11845, -11867, -14736, 23440, 22032, 21642, 1752, 4946, 8916, 14036, 25948, 32472, -27950, -20778, -15660, -7470, 8097, 7830, 5392, 4890, 4882, 788, 530, -22756, -24044, 13964 } };

    @OriginalMember(owner = "client!sg", name = "U", descriptor = "Lck;")
    public static class119 field4615 = class298.method1987((byte) 25, "Abbrechen");

    @OriginalMember(owner = "client!sg", name = "fb", descriptor = "Lck;")
    public static class119 field4626 = class298.method1987((byte) 33, "Angreifen");

    @OriginalMember(owner = "client!sg", name = "W", descriptor = "F")
    private float field4617;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!sg", name = "P", descriptor = "I")
    private int field4611;

    @OriginalMember(owner = "client!sg", name = "S", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!sg", name = "T", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!sg", name = "V", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!sg", name = "Z", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!sg", name = "ab", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!sg", name = "bb", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!sg", name = "cb", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!sg", name = "Y", descriptor = "[I")
    private int[] field4619;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZLva;Lll;)Z", line = 7)
    public final boolean method1850(int arg0, boolean arg1, class36 arg2, class17 arg3) {
        field4609++;
        if (!this.field4603.method1572(true, arg2, arg3)) {
            return false;
        }
        int var5 = arg1 ? 64 : 128;
        GL var6 = class264.field4313;
        int var7 = class177.method1131(arg0 + 119);
        if ((var7 & 0x1) == 0) {
            if (this.field4612 == -1) {
                int[] var8 = new int[1];
                var6.glGenTextures(1, var8, 0);
                this.field4611 = class143.field2280;
                this.field4612 = var8[0];
                class264.method1722(this.field4612);
                ByteBuffer var9 = ByteBuffer.wrap(this.field4603.method1577(var5, arg2, var5, 0.7D, this.field4600, arg3, true));
                if (this.field4618 == 2) {
                    GLU var11 = new GLU();
                    var11.gluBuild2DMipmaps(3553, 6408, var5, var5, 6408, 5121, var9);
                    var6.glTexParameteri(3553, 10241, 9987);
                    var6.glTexParameteri(3553, 10240, 9729);
                    class143.field2279 += var9.limit() * 4 / 3 - this.field4608;
                    this.field4608 = var9.limit() * 4 / 3;
                } else if (this.field4618 == 1) {
                    int var10 = 0;
                    while (true) {
                        var6.glTexImage2D(3553, var10++, 6408, var5, var5, 0, 6408, 5121, var9);
                        var5 >>= 0x1;
                        if (var5 == 0) {
                            var6.glTexParameteri(3553, 10241, 9987);
                            var6.glTexParameteri(3553, 10240, 9729);
                            class143.field2279 += var9.limit() * 4 / 3 - this.field4608;
                            this.field4608 = var9.limit() * 4 / 3;
                            break;
                        }
                        var9 = ByteBuffer.wrap(this.field4603.method1577(var5, arg2, var5, 0.7D, this.field4600, arg3, true));
                    }
                } else {
                    var6.glTexImage2D(3553, 0, 6408, var5, var5, 0, 6408, 5121, var9);
                    var6.glTexParameteri(3553, 10241, 9729);
                    var6.glTexParameteri(3553, 10240, 9729);
                    class143.field2279 += var9.limit() - this.field4608;
                    this.field4608 = var9.limit();
                }
                var6.glTexParameteri(3553, 10242, this.field4607 ? 10497 : 33071);
                var6.glTexParameteri(3553, 10243, this.field4625 ? 10497 : 33071);
            } else {
                class264.method1722(this.field4612);
            }
        }
        if ((var7 & 0x2) == arg0) {
            class264.method1719(this.field4606);
        }
        if ((var7 & 0x4) == 0) {
            class264.method1720(0);
        }
        if ((var7 & 0x8) == 0) {
            if (this.field4627 == 0 && this.field4599 == 0) {
                class264.method1706();
            } else {
                float var12 = (float) (class264.field4319 * this.field4627) / (float) var5;
                float var13 = (float) (class264.field4319 * this.field4599) / (float) var5;
                class264.method1708(var13, var12, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(Z)V", line = 112)
    public static void method1851(boolean arg0) {
        field4626 = null;
        if (!arg0) {
            method1853(-108, (byte) 24, -117, 97, 44, (class292) null, (class163) null, (class291) null);
        }
        field4605 = (short[][]) null;
        field4604 = null;
        field4615 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)V", line = 129)
    public static final void method1852(int arg0, int arg1, int arg2) {
        field4616++;
        if (arg2 != 18669) {
            field4604 = (short[]) null;
        }
        int[] var3 = new int[4];
        var3[0] = arg1;
        int var4 = 1;
        int[] var5 = new int[4];
        var5[0] = arg0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class7.field157[var6] != arg1) {
                var3[var4] = class7.field157[var6];
                var5[var4] = class287.field4732[var6];
                var4++;
            }
        }
        class7.field157 = var3;
        class287.field4732 = var5;
        class242.method1578(class280.field4629, class280.field4629.length - 1, true, 0);
    }

    @OriginalMember(owner = "client!sg", name = "finalize", descriptor = "()V", line = 166)
    protected final void finalize() throws Throwable {
        field4623++;
        if (this.field4612 != -1) {
            class143.method937(this.field4612, this.field4608, this.field4611);
            this.field4612 = -1;
            this.field4608 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IBIIILba;Lqh;Lrb;)V", line = 195)
    public static final void method1853(int arg0, byte arg1, int arg2, int arg3, int arg4, class292 arg5, class163 arg6, class291 arg7) {
        int var8 = -59 / ((-arg1 - 76) / 49);
        class32 var9 = new class32();
        var9.field463 = arg3;
        field4621++;
        var9.field455 = arg4 * 128;
        var9.field454 = arg0 * 128;
        if (arg7 != null) {
            var9.field464 = arg7;
            var9.field452 = arg7.field4798 * 128;
            int var10 = arg7.field4812;
            var9.field456 = arg7.field4814;
            var9.field450 = arg7.field4801;
            int var11 = arg7.field4785;
            if (arg2 == 1 || arg2 == 3) {
                var10 = arg7.field4785;
                var11 = arg7.field4812;
            }
            var9.field459 = arg7.field4766;
            var9.field465 = arg7.field4781;
            var9.field457 = (arg4 + var11) * 128;
            var9.field458 = (arg0 + var10) * 128;
            if (arg7.field4817 != null) {
                var9.field469 = true;
                var9.method239((byte) -85);
            }
            if (var9.field465 != null) {
                var9.field460 = (int) ((double) (var9.field459 - var9.field456) * Math.random()) + var9.field456;
            }
            class55.field877.method999(var9, (byte) -108);
        } else if (arg6 != null) {
            var9.field467 = arg6;
            class50 var12 = arg6.field2575;
            if (var12.field826 != null) {
                var9.field469 = true;
                var12 = var12.method378((byte) 114);
            }
            if (var12 != null) {
                var9.field457 = (var12.field796 + arg4) * 128;
                var9.field458 = (var12.field796 + arg0) * 128;
                var9.field450 = class216.method1370(-1, arg6);
                var9.field452 = var12.field771 * 128;
            }
            class95.field1461.method999(var9, (byte) -108);
        } else if (arg5 != null) {
            var9.field472 = arg5;
            var9.field457 = (arg5.field4956 + arg4) * 128;
            var9.field458 = (arg5.field4956 + arg0) * 128;
            var9.field450 = class84.method568(124, arg5);
            var9.field452 = arg5.field4871 * 128;
            class272.field4469.method1326(arg5.field4861.method786((byte) 112), (byte) -106, var9);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZLll;Lva;B)[I", line = 280)
    public final int[] method1854(boolean arg0, class17 arg1, class36 arg2, byte arg3) {
        field4601++;
        if (!this.field4603.method1572(true, arg2, arg1)) {
            return null;
        }
        if (arg3 != 45) {
            this.field4600 = true;
        }
        int var5 = arg0 ? 64 : 128;
        return this.field4603.method1571(false, 1.0D, this.field4600, arg2, var5, var5, arg1, 2);
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V", line = 297)
    public static final void method1855(int arg0) {
        class291.field4780 = (int[][][]) null;
        class289.field4752 = (byte[][][]) null;
        class135.field2190 = (byte[][][]) null;
        class220.field3525 = (byte[][][]) null;
        class268.field4416 = null;
        field4613++;
        class182.field2886 = null;
        class241.field3867 = null;
        class273.field4487 = (byte[][][]) null;
        if (arg0 != 0) {
            field4615 = (class119) null;
        }
        class95.field1464 = null;
        class202.field3209 = null;
        client.field1392 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lfj;)V", line = 609)
    public class279(class3 arg0) {
        this.field4603 = new class242(arg0);
        this.field4624 = arg0.method64((byte) -99) == 1;
        this.field4600 = arg0.method64((byte) -95) == 1;
        this.field4607 = arg0.method64((byte) -127) == 1;
        this.field4625 = arg0.method64((byte) 64) == 1;
        int var2 = arg0.method64((byte) -87) & 0x3;
        this.field4599 = arg0.method24(false);
        this.field4627 = arg0.method24(false);
        int var3 = arg0.method64((byte) 71);
        arg0.method64((byte) 45);
        if (var2 == 1) {
            this.field4606 = 2;
        } else if (var2 == 2) {
            this.field4606 = 3;
        } else if (var2 == 3) {
            this.field4606 = 4;
        } else {
            this.field4606 = 0;
        }
        this.field4618 = var3 >> 4 & 0xF;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lva;ZLll;)Z", line = 341)
    public final boolean method1856(class36 arg0, boolean arg1, class17 arg2) {
        field4602++;
        return arg1 ? this.field4603.method1572(arg1, arg0, arg2) : true;
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)V", line = 355)
    public static final void method1857(int arg0) {
        class103.method677(0, 30359, 0);
        if (arg0 == 0) {
            field4620++;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)V", line = 369)
    public final void method1858(int arg0, byte arg1) {
        field4614++;
        if (arg1 < 109) {
            this.field4603 = (class242) null;
        }
        if (this.field4619 == null || this.field4627 == 0 && this.field4599 == 0) {
            return;
        }
        if (class190.field3000 == null || class190.field3000.length < this.field4619.length) {
            class190.field3000 = new int[this.field4619.length];
        }
        int var3 = this.field4619.length == 4096 ? 64 : 128;
        int var4 = this.field4619.length;
        int var5 = this.field4599 * arg0;
        int var6 = arg0 * var3 * this.field4627;
        int var7 = var3 - 1;
        int var8 = var4 - 1;
        for (int var9 = 0; var9 < var4; var9 += var3) {
            int var10 = var8 & var6 + var9;
            for (int var11 = 0; var11 < var3; var11++) {
                int var12 = var9 + var11;
                int var13 = (var5 + var11 & var7) + var10;
                class190.field3000[var12] = this.field4619[var13];
            }
        }
        int[] var14 = this.field4619;
        this.field4619 = class190.field3000;
        class190.field3000 = var14;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lll;IFLva;Z)[I", line = 440)
    public final int[] method1859(class17 arg0, int arg1, float arg2, class36 arg3, boolean arg4) {
        field4622++;
        if (arg1 <= 57) {
            return (int[]) null;
        }
        if (this.field4619 == null || this.field4617 != arg2) {
            if (!this.field4603.method1572(true, arg3, arg0)) {
                return null;
            }
            int var6 = arg4 ? 64 : 128;
            this.field4619 = this.field4603.method1571(true, (double) arg2, this.field4600, arg3, var6, var6, arg0, 2);
            this.field4617 = arg2;
            if (this.field4624) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var12 = var6 - 1;
                int var13 = var6;
                int var14 = var6 * var6;
                int var15 = var6 - 1;
                int var16;
                int var17 = var16 = var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var19 = var15; var19 >= 0; var19--) {
                        var16--;
                        int var20 = this.field4619[var16];
                        var7[var19] += class19.method151(16758277, var20) >> 16;
                        var8[var19] += class19.method151(var20, 65382) >> 8;
                        var9[var19] += class19.method151(255, var20);
                    }
                    if (var16 == 0) {
                        var16 = var14;
                    }
                }
                int var21 = var14;
                for (int var22 = var12; var22 >= 0; var22--) {
                    int var23 = 1;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = 1;
                    for (int var28 = 2; var28 >= 0; var28--) {
                        var27--;
                        var26 += var7[var27];
                        var25 += var9[var27];
                        var24 += var8[var27];
                        if (var27 == 0) {
                            var27 = var13;
                        }
                    }
                    for (int var29 = var15; var29 >= 0; var29--) {
                        int var30 = var24 / 9;
                        int var31 = var25 / 9;
                        var27--;
                        var23--;
                        int var32 = var26 / 9;
                        var21--;
                        var10[var21] = class156.method998(class156.method998(var32 << 16, var30 << 8), var31);
                        var25 += var9[var27] - var9[var23];
                        var26 += var7[var27] - var7[var23];
                        var24 += var8[var27] - var8[var23];
                        if (var23 == 0) {
                            var23 = var13;
                        }
                        if (var27 == 0) {
                            var27 = var13;
                        }
                    }
                    for (int var33 = var15; var33 >= 0; var33--) {
                        var17--;
                        int var34 = this.field4619[var17];
                        var16--;
                        int var35 = this.field4619[var16];
                        var7[var33] += -class19.method151(var34 >> 16, 255) + class19.method151(var35 >> 16, 255);
                        var8[var33] += -class19.method151(var34 >> 8, 255) + (class19.method151(var35, 65357) >> 8);
                        var9[var33] += class19.method151(var35, 255) - class19.method151(var34, 255);
                    }
                    if (var17 == 0) {
                        var17 = var14;
                    }
                    if (var16 == 0) {
                        var16 = var14;
                    }
                }
                this.field4619 = var10;
            }
        }
        return this.field4619;
    }
}
