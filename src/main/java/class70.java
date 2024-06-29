import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class70 {

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "Lrp;")
    private class288 field1231 = new class288(256);

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "Lbl;")
    private class442 field1226;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "Lvl;")
    private class11 field1228;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "J")
    public static long field1230;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "[Z")
    public static boolean[] field1229;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)Lsg;")
    public final class262 method513(int arg0, int arg1) {
        field1223++;
        Object var3 = this.field1231.method1752(0, (long) arg0);
        if (var3 != null) {
            return (class262) var3;
        } else if (this.field1228.method61(arg0, (byte) -86)) {
            class48 var4 = this.field1228.method59(arg0, 21645);
            int var5 = var4.field735 ? 64 : this.field1226.field6664;
            class262 var7;
            if (var4.field726 && this.field1226.method1975()) {
                float[] var6 = this.field1228.method57(0.7F, false, var5, var5, 2285, arg0);
                var7 = new class262(this.field1226, 3553, 34842, var5, var5, var4.field730 != 0, var6, 6408);
            } else {
                int[] var8;
                short var9;
                if (var4.field739 && class498.method2990(var4.field728, 28799)) {
                    var8 = this.field1228.method60(var5, false, arg0, 0.7F, 120, var5);
                    var9 = 6407;
                } else {
                    var8 = this.field1228.method58(var5, 0.7F, false, arg0, var5, 19907);
                    var9 = 6408;
                }
                var7 = new class262(this.field1226, 3553, var9, var5, var5, var4.field730 != 0, var8, false);
            }
            var7.method1593(var4.field745, var4.field724, arg1 + arg1);
            this.field1231.method1758(1, var7, (long) arg0);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
    public final void method514(int arg0) {
        field1227++;
        if (arg0 < 59) {
            this.method514(93);
        }
        this.field1231.method1760(5, 30398);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V")
    public final void method515(int arg0) {
        field1222++;
        this.field1231.method1761(-111);
        if (arg0 != -1) {
            this.method513(-109, 37);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lfn;IIZIIB)V")
    public static final void method516(class87 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, byte arg6) {
        field1224++;
        if (class255.field3888 >= 50 || arg0 == null || arg0.field1502 == null || arg2 >= arg0.field1502.length || arg0.field1502[arg2] == null) {
            return;
        }
        int var7 = arg0.field1502[arg2][0];
        int var8 = var7 >> 8;
        int var9 = (var7 & 0xE4) >> 5;
        if (arg6 != -79) {
            return;
        }
        int var10 = var7 & 0x1F;
        if (arg0.field1502[arg2].length > 1) {
            int var11 = (int) ((double) arg0.field1502[arg2].length * Math.random());
            if (var11 > 0) {
                var8 = arg0.field1502[arg2][var11];
            }
        }
        if (var10 == 0) {
            if (arg3) {
                class487.method2927((byte) -34, var8, 0, 255, var9);
            }
        } else if (class463.field7116.field2952 != 0) {
            int var12 = arg4 - 64 >> 7;
            int var13 = arg5 - 64 >> 7;
            class432.field6354[class255.field3888++] = new class456((byte) 1, var8, var9, 0, 255, (arg1 << 24) + (var12 << 16) + (var13 << 8) + var10);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V")
    public static void method517(byte arg0) {
        if (arg0 == -37) {
            field1229 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lbl;Lvl;)V")
    public class70(class442 arg0, class11 arg1) {
        this.field1226 = arg0;
        this.field1228 = arg1;
    }
}
