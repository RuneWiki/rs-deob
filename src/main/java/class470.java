import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class470 extends class28 {

    @OriginalMember(owner = "client!tba", name = "j", descriptor = "I")
    public int field6368;

    @OriginalMember(owner = "client!tba", name = "m", descriptor = "I")
    public int field6371;

    @OriginalMember(owner = "client!tba", name = "k", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!tba", name = "l", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(BLpea;)V")
    public static final void method2646(byte arg0, class641 arg1) {
        if (class211.field2761 == null) {
            class41 var2 = new class41();
            byte[] var3 = var2.method248(128, 112, 16, 128);
            class211.field2761 = class34.method207(false, 136, var3);
        }
        field6369++;
        if (class236.field3080 == null) {
            class440 var4 = new class440();
            byte[] var5 = var4.method2526(16, 128, 128, (byte) 66);
            class236.field3080 = class34.method207(false, 136, var5);
        }
        int var6 = -22 % ((23 - arg0) / 55);
        class546 var7 = arg1.field8942;
        if (var7.method3075(35632) && class518.field7142 == null) {
            byte[] var8 = class30.method186(8, -108, 128, 4.0F, 128, 0.6F, new class177(419684), 4.0F, 16, 0.5F, 16.0F);
            class518.field7142 = class34.method207(false, 136, var8);
        }
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(II)V")
    public class470(int arg0, int arg1) {
        this.field6368 = arg1;
        this.field6371 = arg0;
    }
}
