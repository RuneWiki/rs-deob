import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public abstract class class34 extends class274 {

    @OriginalMember(owner = "client!mca", name = "f", descriptor = "Z")
    public boolean field498;

    @OriginalMember(owner = "client!mca", name = "p", descriptor = "B")
    public byte field508;

    @OriginalMember(owner = "client!mca", name = "r", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "client!mca", name = "i", descriptor = "S")
    public short field501;

    @OriginalMember(owner = "client!mca", name = "s", descriptor = "B")
    public byte field511;

    @OriginalMember(owner = "client!mca", name = "j", descriptor = "S")
    public short field502;

    @OriginalMember(owner = "client!mca", name = "k", descriptor = "I")
    public int field503;

    @OriginalMember(owner = "client!mca", name = "m", descriptor = "S")
    public short field505;

    @OriginalMember(owner = "client!mca", name = "e", descriptor = "S")
    public short field497;

    @OriginalMember(owner = "client!mca", name = "n", descriptor = "I")
    public int field506;

    @OriginalMember(owner = "client!mca", name = "g", descriptor = "I")
    public static int field499 = -1;

    @OriginalMember(owner = "client!mca", name = "h", descriptor = "Lwq;")
    public static class492 field500 = new class492();

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!mca", name = "l", descriptor = "I")
    public int field504;

    @OriginalMember(owner = "client!mca", name = "o", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!mca", name = "q", descriptor = "Lsd;")
    public static class264 field509;

    @OriginalMember(owner = "client!mca", name = "e", descriptor = "(B)V", line = 18)
    public void method271(byte arg0) {
        int var2 = 102 % ((arg0 + 12) / 53);
        field507++;
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 38)
    public class34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field498 = arg8;
        this.field508 = (byte) arg0;
        this.field510 = arg2;
        this.field501 = (short) arg5;
        this.field511 = arg9;
        this.field502 = (short) arg6;
        this.field503 = arg3;
        this.field505 = (short) arg7;
        this.field497 = (short) arg4;
        this.field506 = arg1;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(BLfd;)V", line = 55)
    public static final void method272(byte arg0, class418 arg1) {
        field496++;
        int var2 = arg1.method2400((byte) 36);
        class225.field2928 = new class684[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class225.field2928[var3] = new class684();
            class225.field2928[var3].field9395 = arg1.method2400((byte) 36);
            class225.field2928[var3].field9396 = arg1.method2372(-85);
        }
        class188.field2416 = arg1.method2400((byte) 36);
        class49.field686 = arg1.method2400((byte) 36);
        class501.field6617 = arg1.method2400((byte) 36);
        class26.field324 = new class138[class49.field686 + 1 - class188.field2416];
        for (int var4 = 0; var4 < class501.field6617; var4++) {
            int var5 = arg1.method2400((byte) 36);
            class138 var6 = class26.field324[var5] = new class138();
            var6.field160 = arg1.method2396(33);
            var6.field161 = arg1.method2355(72);
            var6.field1811 = var5 + class188.field2416;
            var6.field1809 = arg1.method2372(-85);
            var6.field1817 = arg1.method2372(-55);
        }
        if (arg0 <= 7) {
            method273(-67);
        }
        class260.field3505 = arg1.method2355(79);
        class256.field3468 = true;
    }

    @OriginalMember(owner = "client!mca", name = "e", descriptor = "(I)V", line = 102)
    public static void method273(int arg0) {
        if (arg0 == -1) {
            field509 = null;
            field500 = null;
        }
    }

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "(I)I")
    public abstract int method270(int arg0);
}
