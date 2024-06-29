import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class167 implements class36 {

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
    public int field2131;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
    public int field2128;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "[F")
    public float[] field2127;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "[[B")
    public static byte[][] field2129 = new byte[1000][];

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)V")
    public static final void method1048(byte arg0) {
        class231.field3485.method2704(-20678);
        field2126++;
        class632.field8833.method3363(110);
        class15.field91.method2613(true);
        class390.field5558.method3063(-12087);
        class104.field1201.method4316(5);
        if (arg0 >= -97) {
            method1048((byte) 121);
        }
        class35.field367.method3054((byte) 124);
        class571.field8029.method3697(11408);
        class576.field8094.method4140(4557);
        class650.field9089.method1968((byte) 57);
        class206.field2895.method1923(0);
        class326.field4583.method1349(-70);
        class671.field9419.method2878(-84);
        class35.field354.method2918((byte) 123);
        class657.field9274.method517(-80);
        class545.field7585.method2792(2);
        class734.field10126.method711(-15855);
        class72.field790.method675(16);
        class651.field9101.method557(false);
        class444.field6154.method3190(97);
        class315.field4514.method1872(-108);
        class616.field8649.method2427(26);
        class10.field67.method2201(1);
        class625.method3601(117);
        class159.method1022(73);
        class657.method3763(99);
        class170.method1093((byte) 118);
        class511.method3027(121);
        class766.field10538.method319(-5);
        class380.field5447.method319(-78);
        class170.field2167.method319(-33);
        class463.field6468.method319(-116);
        class700.field9741.method319(-37);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
    public static void method1049(int arg0) {
        if (arg0 != -19207) {
            field2129 = null;
        }
        field2129 = null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIB)Lns;")
    public static final class654 method1050(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 >= -95) {
            field2129 = null;
        }
        field2130++;
        class472 var4 = class59.field688[arg2][arg1][arg0];
        if (var4 == null) {
            return null;
        }
        class654 var5 = null;
        int var6 = -1;
        for (class44 var7 = var4.field6551; var7 != null; var7 = var7.field466) {
            class253 var8 = var7.field465;
            if (var8 instanceof class654) {
                class654 var9 = (class654) var8;
                int var10 = var9.method3744(1) * 256 + 252 - 256;
                int var11 = var9.field3470 - var10 >> 9;
                int var12 = var9.field3460 - var10 >> 9;
                int var13 = var9.field3470 + var10 >> 9;
                int var14 = var9.field3460 + var10 >> 9;
                if (var11 <= arg1 && var12 <= arg0 && var13 >= arg1 && arg0 <= var14) {
                    int var15 = (var14 + 1 - arg0) * (var13 + 1 - arg1);
                    if (var15 > var6) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(II)V")
    public class167(int arg0, int arg1) {
        this.field2131 = arg0;
        this.field2128 = arg1;
        this.field2127 = new float[arg0 * arg1];
    }
}
