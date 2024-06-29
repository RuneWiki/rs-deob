import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class102 extends class51 {

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    private int field1376;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    private int field1377;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    private int field1380;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    private int field1382;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "Lwt;")
    public static class194 field1378 = new class194("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(III)V")
    public final void method115(int arg0, int arg1, int arg2) {
        ++field1381;
        int var4 = this.field1380 * arg0 >> 12;
        if (arg1 == 17091) {
            int var5 = this.field1382 * arg0 >> 12;
            int var6 = this.field1376 * arg2 >> 12;
            int var7 = this.field1377 * arg2 >> 12;
            class86.method539(51, var6, var7, var5, var4, super.field757);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static void method612(int arg0) {
        field1378 = null;
        int var1 = -79 / ((59 - arg0) / 40);
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(III)V")
    public final void method116(int arg0, int arg1, int arg2) {
        ++field1379;
        int var4 = this.field1380 * arg2 >> 12;
        int var5 = this.field1382 * arg2 >> 12;
        int var6 = this.field1376 * arg1 >> 12;
        if (arg0 < 41) {
            this.field1380 = 79;
        }
        int var7 = this.field1377 * arg1 >> 12;
        class431.method2559(var4, var5, -16358, super.field759, super.field757, var6, super.field758, var7);
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(IIIIIII)V")
    public class102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1376 = arg1;
        this.field1377 = arg3;
        this.field1380 = arg0;
        this.field1382 = arg2;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)V")
    public final void method117(int arg0, int arg1, int arg2) {
        ++field1383;
        if (arg1 > -104) {
            this.field1377 = -81;
        }
        int var4 = this.field1380 * arg2 >> 12;
        int var5 = this.field1382 * arg2 >> 12;
        int var6 = this.field1376 * arg0 >> 12;
        int var7 = this.field1377 * arg0 >> 12;
        class81.method519(var5, super.field759, super.field758, var6, var7, false, var4);
    }
}
