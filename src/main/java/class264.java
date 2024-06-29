import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class264 extends class25 implements class347 {

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    private int field4268;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "Lqu;")
    public static class219 field4274 = new class219(80, 7);

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "[Lgh;")
    public static class350[] field4276 = new class350[2048];

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
    public static int field4277 = -1;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "Z")
    public static boolean field4275 = false;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lna;I[BI)V")
    public class264(class211 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4268 = arg1;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(II[BI)V")
    public final void method747(int arg0, int arg1, byte[] arg2, int arg3) {
        this.method152(arg2, arg1);
        ++field4271;
        this.field4268 = arg3;
        if (arg0 != 24519) {
            this.method746((byte) 77);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)J")
    public final long method744(byte arg0) {
        if (arg0 != -108) {
            return 63L;
        } else {
            ++field4272;
            return super.field278.method112();
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIII)V")
    public static final void method1809(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4273;
        int var8 = arg0 + 1;
        class280.method1888(arg5, arg4, (byte) 82, class103.field1521[arg0], arg3);
        int var9 = arg2 - 1;
        class280.method1888(arg5, arg4, (byte) 82, class103.field1521[arg2], arg3);
        for (int var6 = var8; var9 >= var6; ++var6) {
            int[] var7 = class103.field1521[var6];
            var7[arg5] = var7[arg4] = arg3;
        }
        if (arg1 != 0) {
            method1811(-9);
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V")
    public static void method1810(int arg0) {
        if (arg0 != -1) {
            field4276 = null;
        }
        field4274 = null;
        field4276 = null;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)I")
    public final int method746(byte arg0) {
        ++field4267;
        int var2 = 65 / (arg0 / 53);
        return 0;
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)V")
    public static final void method1811(int arg0) {
        class63.field1000 = new class140(class301.field4723.method1583(121, class12.field131), "", class436.field6587, 1011, -1, 0L, 0, 0, true, false);
        ++field4269;
        if (arg0 != 80) {
            field4275 = false;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)I")
    public final int method749(int arg0) {
        int var2 = 42 / ((7 - arg0) / 34);
        ++field4270;
        return this.field4268;
    }
}
