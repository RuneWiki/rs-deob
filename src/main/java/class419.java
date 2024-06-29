import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class419 {

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Lnk;")
    public static class326 field6340;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public int field6335;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public int field6337;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    private int field6338;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "Ljm;")
    public class297 field6339;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Lnv;")
    public static class493 field6342;

    static {
        new class306("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        field6340 = new class326(2, 15);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILia;)V", line = 5)
    public final void method2573(int arg0, class23 arg1) {
        while (true) {
            int var3 = arg1.method126((byte) -105);
            if (var3 == 0) {
                if (arg0 != 30295) {
                    return;
                }
                field6333++;
                return;
            }
            this.method2576((byte) -110, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Lwh;", line = 28)
    public final synchronized class523 method2574(int arg0) {
        field6334++;
        class523 var2 = (class523) this.field6339.field4790.method1593((byte) -47, (long) this.field6338);
        if (var2 != null) {
            return var2;
        }
        class523 var3 = class523.method3093(this.field6339.field4789, this.field6338, arg0);
        if (var3 != null) {
            this.field6339.field4790.method1595(var3, (long) this.field6338, (byte) -109);
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V", line = 53)
    public static void method2575(boolean arg0) {
        if (!arg0) {
            method2577(-62, 124, 106, -109, 0);
        }
        field6340 = null;
        field6342 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BILia;)V", line = 68)
    private final void method2576(byte arg0, int arg1, class23 arg2) {
        field6332++;
        if (arg1 == 1) {
            this.field6338 = arg2.method132(106);
        } else if (arg1 == 2) {
            this.field6337 = arg2.method126((byte) -72);
            this.field6335 = arg2.method126((byte) -74);
        }
        if (arg0 >= -71) {
            this.field6338 = 68;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIII)V", line = 95)
    public static final void method2577(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class128.field2208; var5++) {
            Rectangle var6 = class166.field2665[var5];
            if ((var6.x + var6.width) > arg1 && var6.x < arg1 + arg4 && arg3 < (var6.y + var6.height) && var6.y < (arg0 + arg3)) {
                client.field1170[var5] = true;
            }
        }
        if (arg2 <= 38) {
            field6341 = -71;
        }
        field6336++;
    }
}
