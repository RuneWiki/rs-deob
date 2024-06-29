import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class414 {

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public int field6045;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "[I")
    public int[] field6043;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "[I")
    public int[] field6038;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field6036 = -1;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field6041 = 0;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "Z")
    public static boolean field6040 = false;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "Lmg;")
    public static class101 field6044;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "[[Z")
    public static boolean[][] field6042;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
    public static void method2470(byte arg0) {
        if (arg0 <= 72) {
            field6041 = -80;
        }
        field6044 = null;
        field6042 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIII)Lco;")
    public static final class77 method2471(int arg0, int arg1, int arg2, int arg3) {
        field6037++;
        class486 var4 = class89.field1305[arg3][arg2][arg1];
        if (var4 == null) {
            return null;
        }
        class77 var5 = null;
        if (arg0 != -4533) {
            return null;
        }
        int var6 = -1;
        for (class164 var7 = var4.field7115; var7 != null; var7 = var7.field2467) {
            class116 var8 = var7.field2468;
            if (var8 instanceof class77) {
                class77 var9 = (class77) var8;
                int var10 = var9.method626((byte) 120) * 64 + 60 - 64;
                int var11 = var9.field1732 - var10 >> 7;
                int var12 = var9.field1735 - var10 >> 7;
                int var13 = var9.field1732 + var10 >> 7;
                int var14 = var9.field1735 + var10 >> 7;
                if (arg2 >= var11 && var12 <= arg1 && var13 >= arg2 && var14 >= arg1) {
                    int var15 = (var14 + 1 - arg1) * (var13 + 1 - arg2);
                    if (var6 < var15) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(I)V")
    public class414(int arg0) {
        this.field6045 = arg0;
        this.field6043 = new int[this.field6045];
        this.field6038 = new int[this.field6045];
    }
}
