import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class218 extends class147 {

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "[Ljg;")
    public class250[] field3906;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "Lqj;")
    public static class196 field3905 = class80.method502("Mem:", -48);

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "Lah;")
    public static class22 field3903 = new class22(5);

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "Lqj;")
    public static class196 field3908 = class80.method502("<img=0>", -48);

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "I")
    public static int field3912 = 0;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "I")
    public static volatile int field3911 = 0;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "Lqj;")
    public static class196 field3914 = class80.method502("<col=ffffff>", -48);

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "[Lqj;")
    public static class196[] field3915 = new class196[1000];

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "S")
    public static short field3918 = 205;

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "Lqj;")
    public static class196 field3916 = class80.method502("mapfunction", -48);

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "I")
    public static int field3913 = 0;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "J")
    public static long field3910;

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "[I")
    public static int[] field3917;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)Z")
    public final boolean method1488(int arg0, int arg1) {
        field3907++;
        if (arg1 != -6859) {
            field3918 = 66;
        }
        return this.field3906[arg0].field4422;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lbk;Lbk;IZ)V")
    public class218(class136 arg0, class136 arg1, int arg2, boolean arg3) {
        class243 var5 = new class243();
        int var6 = arg0.method831(-12858, arg2);
        this.field3906 = new class250[var6];
        int[] var7 = arg0.method826(arg2, (byte) -36);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method842(arg2, (byte) 92, var7[var8]);
            class54 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class54 var12 = (class54) var5.method1651((byte) -18); var12 != null; var12 = (class54) var5.method1656(-119)) {
                if (var12.field675 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method835(1, 0, var11);
                } else {
                    var13 = arg1.method835(1, var11, 0);
                }
                var10 = new class54(var11, var13);
                var5.method1652(26532, var10);
            }
            this.field3906[var7[var8]] = new class250(var9, var10);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)Lca;")
    public static final class116 method1489(int arg0, int arg1, int arg2) {
        class61 var3 = class249.field4410[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class116 var4 = var3.field818;
            var3.field818 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZ)I")
    public static final int method1490(int arg0, boolean arg1) {
        field3904++;
        long var2 = class183.method1195((byte) 121);
        if (arg0 != 0) {
            return -16;
        }
        for (class39 var4 = arg1 ? (class39) class132.field1887.method1554(6539) : (class39) class132.field1887.method1547(342); var4 != null; var4 = (class39) class132.field1887.method1547(342)) {
            if (var2 > (var4.field437 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field437 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field1850;
                    class215.field3873[var5] = class214.field3823[var5];
                    var4.method797((byte) 116);
                    return var5;
                }
                var4.method797((byte) 122);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)V")
    public static void method1491(byte arg0) {
        if (arg0 != -86) {
            field3908 = null;
        }
        field3916 = null;
        field3915 = null;
        field3908 = null;
        field3917 = null;
        field3903 = null;
        field3905 = null;
        field3914 = null;
    }
}
