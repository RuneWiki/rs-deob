import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class182 extends class122 {

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "I")
    private int field2958 = 0;

    @OriginalMember(owner = "client!uc", name = "S", descriptor = "I")
    private int field2959 = -1;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
    private int field2957;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "Lqd;")
    public static class40 field2954 = class147.method1106("Ablegen", (byte) -73);

    @OriginalMember(owner = "client!uc", name = "U", descriptor = "I")
    public static int field2961 = 0;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!uc", name = "V", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!uc", name = "X", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!uc", name = "W", descriptor = "Lrb;")
    public static class213 field2963;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V", line = 12)
    public static void method1326(int arg0) {
        field2954 = null;
        if (arg0 != 381499047) {
            field2955 = 49;
        }
        field2963 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V", line = 29)
    public final void method1327(byte arg0) {
        field2964++;
        int var2 = class199.method1395(-122);
        if ((var2 & 0x1) == 0) {
            class21.method140(this.field2959);
        }
        if ((var2 & 0x2) == 0) {
            class21.method144(0);
        }
        if ((var2 & 0x4) == 0) {
            class21.method164(0);
        }
        if (arg0 <= 53) {
            field2955 = 123;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILrb;I)V", line = 54)
    public static final void method1328(int arg0, int arg1, class213 arg2, int arg3) {
        field2956++;
        if (class44.field827 != 0 && class44.field827 != 3 || !arg2.method1509(0)) {
            return;
        }
        int var4 = arg2.field3572[arg0];
        if (var4 > arg3 || arg3 > (arg2.field3425[arg0] + var4)) {
            return;
        }
        int var5 = arg0 - arg2.field3565 / 2;
        int var6 = arg3 - arg2.field3502 / 2;
        int var7 = class309.field5191 + class108.field1893 & 0x7FF;
        int var8 = class203.field3208[var7];
        int var9 = (class33.field662 + 256) * var8 >> 8;
        int var10 = class203.field3216[var7];
        int var11 = (class33.field662 + 256) * var10 >> 8;
        if (arg1 != -1654) {
            return;
        }
        int var12 = var5 * var9 + (var6 * var11) >> 11;
        int var13 = var5 * var11 - (var6 * var9) >> 11;
        int var14 = class255.field4233.field1531 + var12 >> 7;
        int var15 = class255.field4233.field1497 - var13 >> 7;
        if (class162.field2689 > 0 && class251.field4162[82] && class251.field4162[81]) {
            class274.method1901(class263.field4407 + var15, class196.field3152 - -var14, class160.field2671, true);
            return;
        }
        boolean var16 = class170.method1263(class255.field4233.field1489[0], 0, true, 0, var14, var15, 1, true, 0, 0, 0, class255.field4233.field1532[0]);
        if (!var16) {
            return;
        }
        class19.field295.method218(var6, arg1 - 18260);
        class19.field295.method218(var5, arg1 - 18260);
        class19.field295.method209(16711680, class108.field1893);
        class19.field295.method218(57, -19914);
        class19.field295.method218(class309.field5191, arg1 ^ 0x4BBC);
        class19.field295.method218(class33.field662, -19914);
        class19.field295.method218(89, -19914);
        class19.field295.method209(16711680, class255.field4233.field1531);
        class19.field295.method209(16711680, class255.field4233.field1497);
        class19.field295.method218(class303.field5081, arg1 - 18260);
        class19.field295.method218(63, -19914);
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I)V", line = 200)
    public class182(int arg0) {
        int[] var2 = new int[1];
        GL var3 = class21.field377;
        var3.glGenTextures(1, var2, 0);
        this.field2959 = var2[0];
        this.field2957 = class136.field2300;
        class21.method140(this.field2959);
        int var4 = class203.field3212[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var3.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var3.glTexParameteri(3553, 10241, 9729);
        var3.glTexParameteri(3553, 10240, 9729);
        class136.field2303 += var6.limit() - this.field2958;
        this.field2958 = var6.limit();
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)Lsd;", line = 138)
    public static final class26 method1329(int arg0) {
        field2962++;
        class26 var1 = new class26(30);
        var1.method218(7, -19914);
        if (arg0 != 1) {
            field2963 = (class213) null;
        }
        var1.method218(class162.field2692, -19914);
        var1.method218(class254.field4211 ? 1 : 0, -19914);
        var1.method218(class194.field3131 ? 1 : 0, -19914);
        var1.method218(class217.field3623 ? 1 : 0, arg0 ^ 0xFFFFB237);
        var1.method218(class81.field1429 ? 1 : 0, arg0 - 19915);
        var1.method218(class250.field4144 ? 1 : 0, -19914);
        var1.method218(class223.field3704 ? 1 : 0, -19914);
        var1.method218(class104.field1847 ? 1 : 0, -19914);
        var1.method218(class96.field1728 ? 1 : 0, -19914);
        var1.method218(class285.field4804, arg0 - 19915);
        var1.method218(class1.field8 ? 1 : 0, -19914);
        var1.method218(class178.field2929 ? 1 : 0, arg0 ^ 0xFFFFB237);
        var1.method218(class206.field3287 ? 1 : 0, -19914);
        var1.method218(class296.field4952, -19914);
        var1.method218(class142.field2387 ? 1 : 0, -19914);
        var1.method218(class94.field1698, -19914);
        var1.method218(class90.field1636, -19914);
        var1.method218(class105.field1854, -19914);
        var1.method209(16711680, class159.field2665);
        var1.method209(16711680, field2961);
        var1.method218(2, arg0 - 19915);
        var1.method239((byte) 107, class213.field3497);
        var1.method218(class204.field3230, -19914);
        var1.method218(class33.field669 ? 1 : 0, -19914);
        return var1;
    }

    @OriginalMember(owner = "client!uc", name = "finalize", descriptor = "()V", line = 187)
    protected final void finalize() throws Throwable {
        if (this.field2959 != -1) {
            class136.method1008(this.field2959, this.field2958, this.field2957);
            this.field2958 = 0;
            this.field2959 = -1;
        }
        field2960++;
        super.finalize();
    }
}
