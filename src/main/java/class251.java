import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class class251 {

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Lud;")
    public static class279 field4483 = class130.method1024(" ", 255);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Lqd;")
    public static class44 field4480 = new class44();

    @OriginalMember(owner = "client!t", name = "g", descriptor = "Z")
    public static boolean field4486 = false;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lud;")
    public static class279 field4488 = class130.method1024("(Y", 255);

    @OriginalMember(owner = "client!t", name = "k", descriptor = "Lud;")
    public static class279 field4490 = class130.method1024("Spielwelt erstellt)3", 255);

    @OriginalMember(owner = "client!t", name = "h", descriptor = "Lud;")
    public static class279 field4487 = class130.method1024("::errortest", 255);

    @OriginalMember(owner = "client!t", name = "m", descriptor = "Lud;")
    public static class279 field4492 = class130.method1024("::wm2", 255);

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "[I")
    public static int[] field4489;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "[Lcg;")
    public static class42[] field4485;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "[[[Lpl;")
    public static class191[][][] field4491;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 9)
    public static void method1802(int arg0) {
        field4487 = null;
        field4483 = null;
        field4492 = null;
        field4490 = null;
        field4491 = (class191[][][]) null;
        field4485 = null;
        field4480 = null;
        if (arg0 < -50) {
            field4488 = null;
            field4489 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)[F", line = 28)
    public static final float[] method1803(int arg0, int arg1) {
        field4484++;
        float var2 = class219.method1607() + class219.method1603();
        int var3 = class219.method1602();
        float var4 = (float) (var3 >> 16 & 0xFF) / 255.0F;
        class41.field879[3] = 1.0F;
        float var5 = (float) (var3 >> 8 & 0xFF) / 255.0F;
        float var6 = (float) (var3 & 0xFF) / 255.0F;
        float var7 = 0.58823526F;
        class41.field879[2] = var2 * var6 * ((float) class52.method442(255, arg0) / 255.0F) * var7;
        class41.field879[0] = var2 * (float) (class52.method442(16760277, arg0) >> 16) / 255.0F * var4 * var7;
        if (arg1 != -16325) {
            field4486 = false;
        }
        class41.field879[1] = var2 * var7 * var5 * ((float) (class52.method442(65447, arg0) >> 8) / 255.0F);
        return class41.field879;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILok;)V", line = 66)
    public static final void method1804(int arg0, class149 arg1) {
        class150.field2754 = arg1;
        class192.field3469 = class150.field2754.method1174(4, -17680);
        if (arg0 == -27505) {
            field4481++;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II)V", line = 85)
    public static final void method1805(int arg0, int arg1) {
        if (arg0 <= 46) {
            field4488 = (class279) null;
        }
        field4482++;
        class282.field5034.method1339(arg1, 19326);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IZI)I")
    public abstract int method256(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
    public abstract void method260(int arg0);
}
