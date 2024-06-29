import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class238 extends class135 {

    @OriginalMember(owner = "client!od", name = "cb", descriptor = "I")
    private int field4229 = 0;

    @OriginalMember(owner = "client!od", name = "lb", descriptor = "I")
    private int field4238 = 1;

    @OriginalMember(owner = "client!od", name = "X", descriptor = "I")
    private int field4224 = 0;

    @OriginalMember(owner = "client!od", name = "Z", descriptor = "Z")
    public static boolean field4226 = false;

    @OriginalMember(owner = "client!od", name = "V", descriptor = "Lqj;")
    public static class196 field4222 = class80.method502("; Expires=", -48);

    @OriginalMember(owner = "client!od", name = "W", descriptor = "Ls;")
    public static class227 field4223 = new class227(64);

    @OriginalMember(owner = "client!od", name = "gb", descriptor = "Lqj;")
    private static class196 field4233 = class80.method502("purple:", -48);

    @OriginalMember(owner = "client!od", name = "ob", descriptor = "Lqj;")
    public static class196 field4241 = field4233;

    @OriginalMember(owner = "client!od", name = "mb", descriptor = "Lqj;")
    private static class196 field4239 = class80.method502("Loading textures )2 ", -48);

    @OriginalMember(owner = "client!od", name = "rb", descriptor = "Lqj;")
    public static class196 field4244 = field4239;

    @OriginalMember(owner = "client!od", name = "pb", descriptor = "Lqj;")
    public static class196 field4242 = class80.method502("titlebg", -48);

    @OriginalMember(owner = "client!od", name = "fb", descriptor = "I")
    public static int field4232 = 0;

    @OriginalMember(owner = "client!od", name = "nb", descriptor = "Lqj;")
    public static class196 field4240 = field4233;

    @OriginalMember(owner = "client!od", name = "sb", descriptor = "Lqj;")
    public static class196 field4245 = class80.method502("Zugewiesener Speicher)3", -48);

    @OriginalMember(owner = "client!od", name = "ib", descriptor = "I")
    public static int field4235 = -1;

    @OriginalMember(owner = "client!od", name = "Y", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!od", name = "ab", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!od", name = "bb", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!od", name = "eb", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!od", name = "hb", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!od", name = "jb", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!od", name = "qb", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!od", name = "db", descriptor = "Log;")
    public static class38 field4230;

    @OriginalMember(owner = "client!od", name = "kb", descriptor = "[Lub;")
    public static class43[] field4237;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        ++field4225;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -4) {
                    this.field4238 = arg0.method367(1);
                }
            } else {
                this.field4224 = arg0.method367(1);
            }
        } else {
            this.field4229 = arg0.method367(1);
        }
        if (arg2 != -16231) {
            method1595(-26, 35);
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(III)I")
    public static final int method1593(int arg0, int arg1, int arg2) {
        ++field4243;
        class249 var3 = (class249) class110.field1562.method1551(32768, (long) arg0);
        if (var3 == null) {
            return -1;
        } else {
            return ~arg2 <= arg1 && ~arg2 > ~var3.field4406.length ? var3.field4406[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    public class238() {
        super(0, true);
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(B)V")
    public final void method102(byte arg0) {
        ++field4228;
        if (arg0 != -85) {
            method1595(-90, 101);
        }
        class87.method546((byte) 114);
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V")
    public static void method1594(int arg0) {
        field4244 = null;
        field4245 = null;
        if (arg0 != -711649727) {
            method1596(-15, -126);
        }
        field4239 = null;
        field4230 = null;
        field4233 = null;
        field4241 = null;
        field4242 = null;
        field4240 = null;
        field4222 = null;
        field4237 = null;
        field4223 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        if (arg1) {
            field4237 = null;
        }
        ++field4231;
        int[] var3 = super.field1954.method110(arg0, 49);
        if (super.field1954.field244) {
            int var4 = class123.field1756[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; var6 < class131.field1862; ++var6) {
                int var7 = class82.field1189[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field4229 == 0) {
                    var9 = (-var4 + var7) * this.field4238;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field4238 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field4224 != -1) {
                    if (this.field4224 == 2) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class173.field2914[255 & var12 >> 4] - -4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(II)Lmh;")
    public static final class246 method1595(int arg0, int arg1) {
        ++field4234;
        class246 var2 = (class246) class142.field2166.method575(arg1 + -11, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class111.field1619.method842(arg1, (byte) -106, arg0);
            class246 var4 = new class246();
            if (var3 != null) {
                var4.method1680(-1, new class56(var3));
            }
            class142.field2166.method574((long) arg0, false, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(II)[B")
    public static final byte[] method1596(int arg0, int arg1) {
        ++field4227;
        if (arg0 < 114) {
            return null;
        } else {
            class106 var2 = (class106) class90.field1320.method575(0, (long) arg1);
            if (var2 == null) {
                byte[] var3 = new byte[512];
                Random var4 = new Random((long) arg1);
                for (int var5 = 0; ~var5 > -256; ++var5) {
                    var3[var5] = (byte) var5;
                }
                for (int var6 = 0; var6 < 255; ++var6) {
                    int var7 = -var6 + 255;
                    int var8 = class217.method1484(true, var4, var7);
                    byte var9 = var3[var8];
                    var3[var8] = var3[var7];
                    var3[var7] = var3[-var6 + 511] = var9;
                }
                var2 = new class106(var3);
                class90.field1320.method574((long) arg1, false, var2);
            }
            return var2.field1529;
        }
    }
}
