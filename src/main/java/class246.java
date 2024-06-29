import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class246 extends class90 {

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "[Ln;")
    public class249[] field3679;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "Z")
    public static boolean field3676 = false;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    public static int field3678 = 0;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "[Lqb;")
    public static class86[] field3681 = new class86[4];

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "Lve;")
    public static class233 field3675;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "[I")
    public static int[] field3682;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)Z")
    public final boolean method1609(byte arg0, int arg1) {
        field3677++;
        if (arg0 < 74) {
            field3675 = null;
        }
        return this.field3679[arg1].field3735;
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V")
    public static void method1610(int arg0) {
        field3681 = null;
        field3675 = null;
        field3682 = null;
        if (arg0 != 1) {
            field3676 = true;
        }
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(II)Z")
    public final boolean method1611(int arg0, int arg1) {
        if (arg0 != 4) {
            this.method1609((byte) 10, 57);
        }
        field3684++;
        return this.field3679[arg1].field3746;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)Ljg;")
    public static final class264 method1612(int arg0, int arg1, int arg2) {
        class131 var3 = class16.field233[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1928;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lkl;II)V")
    public static final void method1613(class114 arg0, int arg1, int arg2) {
        if (arg1 <= 126) {
            field3681 = null;
        }
        if (class56.field859 != null) {
            try {
                class56.field859.method325(-474049592, 0L);
                class56.field859.method316(24, arg2, arg0.field1629, true);
            } catch (Exception var3) {
            }
        }
        field3683++;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lve;Lve;IZ)V")
    public class246(class233 arg0, class233 arg1, int arg2, boolean arg3) {
        class97 var5 = new class97();
        int var6 = arg0.method1525(11672, arg2);
        this.field3679 = new class249[var6];
        int[] var7 = arg0.method1521(arg2, (byte) -73);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1538(arg2, var7[var8], (byte) 89);
            class101 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class101 var12 = (class101) var5.method656(102); var12 != null; var12 = (class101) var5.method650(125)) {
                if (var12.field1506 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1515(-61, 0, var11);
                } else {
                    var13 = arg1.method1515(-86, var11, 0);
                }
                var10 = new class101(var11, var13);
                var5.method652(69, var10);
            }
            this.field3679[var7[var8]] = new class249(var9, var10);
        }
    }
}
