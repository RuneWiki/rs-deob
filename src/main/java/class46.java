import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class46 implements class145 {

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    private int field643 = -1;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Z")
    private boolean field652 = false;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "[[I")
    public static int[][] field653 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Leg;")
    public static class188 field647 = new class188(5);

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "F")
    public static float field648;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "[[B")
    public static byte[][] field644;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "[[[I")
    public static int[][][] field655;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "()V", line = 8)
    public final void method315() {
        field642++;
        GL var1 = class333.field5160;
        class333.method2285(1);
        if (class173.field2636 == null || this.field643 < 0 || !class192.field2903) {
            var1.glTexEnvi(8960, 34184, 34167);
            return;
        }
        var1.glCallList(this.field643);
        var1.glActiveTexture(33985);
        class173.field2636.method932();
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glRotatef(-((float) class225.field3597 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
        var1.glRotatef(-((float) class143.field2261 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
        var1.glScalef(-1.0F, 1.0F, 1.0F);
        var1.glMatrixMode(5888);
        var1.glActiveTexture(33984);
        this.field652 = true;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V", line = 37)
    public static void method316(int arg0) {
        field647 = null;
        field644 = (byte[][]) null;
        field655 = (int[][][]) null;
        if (arg0 == 0) {
            field653 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLwf;I)Z", line = 52)
    public static final boolean method317(byte arg0, class306 arg1, int arg2) {
        field651++;
        byte[] var3 = arg1.method2102(arg2, 1);
        if (var3 == null) {
            return false;
        } else {
            class10.method65(true, var3);
            int var4 = -118 % ((arg0 + 50) / 62);
            return true;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "()V", line = 70)
    public final void method318() {
        GL var1 = class333.field5160;
        if (this.field652) {
            var1.glCallList(this.field643 + 1);
            this.field652 = false;
        } else {
            var1.glTexEnvi(8960, 34184, 5890);
        }
        field650++;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V", line = 221)
    public class46() {
        if (class333.field5185) {
            GL var1 = class333.field5160;
            this.field643 = var1.glGenLists(2);
            var1.glNewList(this.field643, 4864);
            var1.glActiveTexture(33985);
            var1.glTexEnvi(8960, 34161, 34165);
            var1.glTexEnvi(8960, 34178, 34168);
            var1.glTexEnvi(8960, 34162, 7681);
            var1.glTexEnvi(8960, 34184, 34167);
            var1.glTexGeni(8192, 9472, 34066);
            var1.glTexGeni(8193, 9472, 34066);
            var1.glTexGeni(8194, 9472, 34066);
            var1.glEnable(3168);
            var1.glEnable(3169);
            var1.glEnable(3170);
            var1.glEnable(34067);
            var1.glActiveTexture(33984);
            var1.glEndList();
            var1.glNewList(this.field643 + 1, 4864);
            var1.glActiveTexture(33985);
            var1.glTexEnvi(8960, 34161, 8448);
            var1.glTexEnvi(8960, 34178, 34166);
            var1.glTexEnvi(8960, 34162, 8448);
            var1.glTexEnvi(8960, 34184, 5890);
            var1.glDisable(3168);
            var1.glDisable(3169);
            var1.glDisable(3170);
            var1.glDisable(34067);
            var1.glMatrixMode(5890);
            var1.glLoadIdentity();
            var1.glMatrixMode(5888);
            var1.glActiveTexture(33984);
            var1.glEndList();
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIBIII)V", line = 93)
    public static final void method319(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        field646++;
        int var7 = arg3 * arg3;
        int var8 = arg1 * arg1;
        int var9 = arg1;
        int var10 = arg1 << 1;
        int var11 = var7 << 1;
        int var12 = var8 << 1;
        int var13 = var7 << 2;
        int var14 = (1 - var10) * var7 + var12;
        int var15 = var8 - ((var10 - 1) * var11);
        if (arg2 != 50) {
            field647 = (class188) null;
        }
        int var16 = var8 << 2;
        int var17 = ((var6 << 1) + 3) * var12;
        int var18 = ((arg1 << 1) - 3) * var11;
        int var19 = (arg1 - 1) * var13;
        if (class323.field5030 <= arg0 && class88.field1324 >= arg0) {
            int var20 = class3.method20(class256.field3995, arg3 + arg4, class118.field1834, arg2 - 27571);
            int var21 = class3.method20(class256.field3995, arg4 - arg3, class118.field1834, -27521);
            class253.method1704(var21, var20, arg5, class175.field2675[arg0], 7);
        }
        int var22 = (var6 + 1) * var16;
        while (var9 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var15 += var22;
                    var6++;
                    var14 += var17;
                    var22 += var16;
                    var17 += var16;
                }
            }
            var9--;
            if (var15 < 0) {
                var15 += var22;
                var14 += var17;
                var22 += var16;
                var6++;
                var17 += var16;
            }
            int var23 = arg0 - var9;
            var15 += -var18;
            var18 -= var13;
            var14 += -var19;
            var19 -= var13;
            int var24 = arg0 + var9;
            if (class323.field5030 <= var24 && class88.field1324 >= var23) {
                int var25 = class3.method20(class256.field3995, arg4 + var6, class118.field1834, -27521);
                int var26 = class3.method20(class256.field3995, arg4 - var6, class118.field1834, arg2 ^ 0xFFFF944D);
                if (class323.field5030 <= var23) {
                    class253.method1704(var26, var25, arg5, class175.field2675[var23], 7);
                }
                if (var24 <= class88.field1324) {
                    class253.method1704(var26, var25, arg5, class175.field2675[var24], 7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()I", line = 193)
    public final int method320() {
        field654++;
        return 4;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 203)
    public final void method321(int arg0) {
        field649++;
    }
}
