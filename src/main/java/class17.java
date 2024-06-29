import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class17 extends class149 {

    @OriginalMember(owner = "client!uv", name = "K", descriptor = "I")
    private int field269 = 3072;

    @OriginalMember(owner = "client!uv", name = "P", descriptor = "I")
    private int field274 = 1024;

    @OriginalMember(owner = "client!uv", name = "M", descriptor = "I")
    private int field271 = 2048;

    @OriginalMember(owner = "client!uv", name = "L", descriptor = "Lpg;")
    public static class492 field270 = new class492(52, 3);

    @OriginalMember(owner = "client!uv", name = "Q", descriptor = "Lpg;")
    public static class492 field275 = new class492(18, -1);

    @OriginalMember(owner = "client!uv", name = "R", descriptor = "I")
    public static int field276 = -60;

    @OriginalMember(owner = "client!uv", name = "I", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!uv", name = "J", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!uv", name = "N", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!uv", name = "O", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!uv", name = "T", descriptor = "Ljava/awt/Font;")
    public static Font field278;

    @OriginalMember(owner = "client!uv", name = "S", descriptor = "Z")
    public static boolean field277;

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "()V", line = 107)
    public class17() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "(I)V", line = 14)
    public static void method138(int arg0) {
        field270 = null;
        if (arg0 != 1) {
            method138(-120);
        }
        field278 = null;
        field275 = null;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(BI)[[I", line = 26)
    public final int[][] method139(byte arg0, int arg1) {
        ++field273;
        int[][] var3 = super.field2147.method2726(arg1, 0);
        if (super.field2147.field6664) {
            int[][] var4 = this.method984((byte) 96, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class316.field4838; ++var11) {
                var8[var11] = this.field274 - -(var5[var11] * this.field271 >> 12);
                var9[var11] = (var6[var11] * this.field271 >> 12) + this.field274;
                var10[var11] = (var7[var11] * this.field271 >> 12) + this.field274;
            }
        }
        return arg0 >= -45 ? null : var3;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)[I", line = 75)
    public final int[] method92(int arg0, int arg1) {
        ++field268;
        if (arg0 != -10835) {
            field278 = null;
        }
        int[] var3 = super.field2152.method2891(arg1, (byte) 87);
        if (super.field2152.field7051) {
            int[] var4 = this.method983(0, 24824, arg1);
            for (int var5 = 0; var5 < class316.field4838; ++var5) {
                var3[var5] = (var4[var5] * this.field271 >> 12) + this.field274;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IBLtl;)V", line = 113)
    public final void method93(int arg0, byte arg1, class91 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field2148 = arg2.method618((byte) 100) == 1;
                }
            } else {
                this.field269 = arg2.method631(arg1 + 10459);
            }
        } else {
            this.field274 = arg2.method631(10494);
        }
        if (arg1 != 35) {
            this.method99(-122);
        }
        ++field267;
    }

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "(I)V", line = 160)
    public final void method99(int arg0) {
        if (arg0 >= -86) {
            this.method93(50, (byte) 21, (class91) null);
        }
        ++field272;
        this.field271 = this.field269 - this.field274;
    }
}
