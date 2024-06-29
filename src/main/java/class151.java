import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class151 extends Canvas {

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field3490;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Z")
    public static boolean field3484 = false;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "[I")
    public static int[] field3479 = new int[100];

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Lv;")
    public static class146 field3487 = class159.method1226((byte) -37, "gelb:");

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field3485 = 0;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "[Lv;")
    public static class146[] field3488 = new class146[1000];

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field3491 = 0;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Lla;")
    public static class77 field3480;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Lmb;")
    public static class85 field3483;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZLnd;)V")
    public static final void method1131(int arg0, boolean arg1, class94 arg2) {
        field3482++;
        int var3 = arg2.field2225;
        int var4 = (int) arg2.field679;
        arg2.method217(-1264);
        if (arg1) {
            class41.method271(var3, (byte) -56);
        }
        class69.method489((byte) 26, var3);
        int var5 = -126 % ((arg0 + 27) / 57);
        class26 var6 = class64.method466(-1922515024, var4);
        if (var6 != null) {
            class75.method567((byte) 121, var6);
        }
        class38.field842 = false;
        class13.field208 = 0;
        class3.method25(0, class44.field1024, class12.field192, class17.field277, class51.field1158);
        if (class6.field136 != -1) {
            class6.method52((byte) -11, 1, class6.field136);
        }
    }

    @OriginalMember(owner = "client!ve", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3489++;
        this.field3490.update(arg0);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([Lna;IIII[BI)V")
    public static final void method1132(class91[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        field3486++;
        if (arg1 != -31714) {
            field3484 = true;
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg6 + var12 > 0 && arg6 + var12 < 103 && arg4 + var13 > 0 && arg4 + var13 < 103) {
                        arg0[var7].field2185[arg6 + var12][arg4 + var13] = class90.method711(arg0[var7].field2185[arg6 + var12][arg4 + var13], -16777217);
                    }
                }
            }
        }
        class95 var8 = new class95(arg5);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class155.method1159(var8, arg3, 0, arg4 + var11, var9, arg2, 87, arg6 + var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
    public static void method1133(boolean arg0) {
        if (arg0) {
            method1131(40, false, null);
        }
        field3479 = null;
        field3487 = null;
        field3483 = null;
        field3488 = null;
        field3480 = null;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class151(Component arg0) {
        this.field3490 = arg0;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)Z")
    public static final boolean method1134(byte arg0, int arg1) {
        if (arg0 != 27) {
            method1132(null, -101, -1, -128, 65, null, -79);
        }
        field3493++;
        return (arg1 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ve", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field3490.paint(arg0);
        field3481++;
    }
}
