import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class class35 extends class510 {

    @OriginalMember(owner = "client!na", name = "i", descriptor = "Z")
    public boolean field391 = false;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Z")
    public boolean field392 = false;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public int field390;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public int field387;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "S")
    public short field388;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field394 = 0;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "Lmt;")
    public static class276 field397 = new class276(2, 4, 4, 0);

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLwm;)V", line = 5)
    public static final void method199(byte arg0, class403 arg1) {
        field393++;
        int var2 = arg1.method2325(true);
        class474.field6599 = new class520[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class474.field6599[var3] = new class520();
            class474.field6599[var3].field7655 = arg1.method2325(true);
            class474.field6599[var3].field7649 = arg1.method2367(-5042);
        }
        class399.field5626 = arg1.method2325(true);
        class434.field6109 = arg1.method2325(true);
        class204.field2901 = arg1.method2325(true);
        class429.field6045 = new class135[class434.field6109 + 1 - class399.field5626];
        int var4 = -88 / ((48 - arg0) / 55);
        for (int var5 = 0; var5 < class204.field2901; var5++) {
            int var6 = arg1.method2325(true);
            class135 var7 = class429.field6045[var6] = new class135();
            var7.field3423 = arg1.method2357((byte) 114);
            var7.field3426 = arg1.method2319((byte) 109);
            var7.field1770 = var6 + class399.field5626;
            var7.field1765 = arg1.method2367(-5042);
            var7.field1764 = arg1.method2367(-5042);
        }
        class28.field341 = arg1.method2319((byte) 87);
        class367.field5240 = true;
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(I)V", line = 53)
    public static void method200(int arg0) {
        if (arg0 == 4) {
            field397 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(IIIIZZ)V", line = 118)
    public class35(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        this.field389 = arg2;
        this.field390 = arg1;
        this.field387 = arg0;
        this.field391 = arg4;
        this.field388 = (short) arg3;
        this.field392 = arg5;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII)V", line = 75)
    public static final void method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field396++;
        if (arg1 != 2) {
            field397 = null;
        }
        int var7 = arg5 + arg0;
        int var8 = arg2 - arg0;
        for (int var9 = arg5; var9 < var7; var9++) {
            class447.method2605(arg1 - 9, arg3, arg6, arg4, class112.field1523[var9]);
        }
        for (int var10 = arg2; var10 > var8; var10--) {
            class447.method2605(-7, arg3, arg6, arg4, class112.field1523[var10]);
        }
        int var11 = arg4 - arg0;
        int var12 = arg3 + arg0;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class112.field1523[var13];
            class447.method2605(-7, arg3, arg6, var12, var14);
            class447.method2605(-7, var11, arg6, arg4, var14);
        }
    }
}
