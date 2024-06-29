import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public abstract class class200 {

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "[I")
    public static int[] field3404 = new int[200];

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "Lce;")
    public static class126 field3406 = class206.method1445(-7923, "_labels");

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field3412 = -1;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field3409 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "Lce;")
    public static class126 field3413 = class206.method1445(-7923, "Titelbild geladen)3");

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field3415 = 0;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "Lcm;")
    public static class312 field3414;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Lg;")
    public static class63 field3405;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V", line = 23)
    public static void method1413(int arg0) {
        field3405 = null;
        field3414 = null;
        field3404 = null;
        field3413 = null;
        field3406 = null;
        int var1 = 95 / ((36 - arg0) / 32);
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)[F", line = 52)
    public static final float[] method1414(int arg0) {
        field3408++;
        float var1 = class235.method1597() + class235.method1604();
        int var2 = class235.method1599();
        class87.field1374[3] = 1.0F;
        float var3 = (float) (var2 >> 16 & 0xFF) / 255.0F;
        float var4 = (float) ((var2 & arg0) >> 8) / 255.0F;
        float var5 = (float) (var2 & 0xFF) / 255.0F;
        float var6 = 0.58823526F;
        class87.field1374[1] = class209.field3594[1] * var4 * var6 * var1;
        class87.field1374[0] = class209.field3594[0] * var3 * var6 * var1;
        class87.field1374[2] = class209.field3594[2] * var5 * var6 * var1;
        return class87.field1374;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILjava/lang/String;)V", line = 88)
    public static final void method1415(int arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
        if (arg0 == 2) {
            field3411++;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)[B")
    public abstract byte[] method716(int arg0);

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([BI)V")
    public abstract void method717(byte[] arg0, int arg1);
}
