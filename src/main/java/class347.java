import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class347 {

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "[[I")
    public static int[][] field4450 = new int[6][];

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "Z")
    public static boolean field4451 = false;

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "Llda;")
    public static class203 field4449;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)V", line = 3)
    public static void method1922(int arg0) {
        if (arg0 > -48) {
            method1922(-115);
        }
        field4450 = null;
        field4449 = null;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Llo;[Lgga;)V", line = 20)
    public static final void method1923(class488 arg0, class332[] arg1) {
        if (class167.field2199) {
            int var2 = arg0.method785(arg1, 83);
            class590.field8291.method1024(var2, arg1);
        }
        if (class699.field9887 == class491.field6485) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class172) {
                var5 = ((class172) arg0).field2247;
                var6 = ((class172) arg0).field2243;
            } else {
                var5 = arg0.field6461 >> class52.field775;
                var6 = arg0.field6464 >> class52.field775;
            }
            class590.field8291.method984(class256.field3127[0].method1565(arg0.field6464, arg0.field6461, true), class385.method2073(var5, var6), class686.method3858(var5, var6), class228.method1364(var5, var6));
        }
        class101 var7 = arg0.method73(false, class590.field8291);
        if (var7 == null) {
            return;
        }
        var7.field1364 = arg0;
        if (class184.field2345) {
            class139 var8 = class632.field8878;
            synchronized (class632.field8878) {
                boolean var9 = false;
                for (class101 var10 = (class101) class632.field8878.method802((byte) 109); var10 != null; var10 = (class101) class632.field8878.method800((byte) -106)) {
                    if (arg0.field6455 >= var10.field1364.field6455) {
                        class593.method3261(var7, var10, -109);
                        var9 = true;
                        break;
                    }
                }
                if (!var9) {
                    class632.field8878.method801(var7, 86);
                }
                return;
            }
        }
        boolean var11 = false;
        for (class101 var12 = (class101) class632.field8878.method802((byte) 76); var12 != null; var12 = (class101) class632.field8878.method800((byte) -106)) {
            if (arg0.field6455 >= var12.field1364.field6455) {
                class593.method3261(var7, var12, -93);
                var11 = true;
                break;
            }
        }
        if (!var11) {
            class632.field8878.method801(var7, 43);
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)V", line = 103)
    public static final void method1924(byte arg0) {
        field4452++;
        int var1 = 0;
        for (int var2 = 0; var2 < class431.field5395; var2++) {
            for (int var3 = 0; var3 < class452.field5802; var3++) {
                if (class383.method2070(true, var1, var3, (byte) 74, var2, class270.field3423)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        if (arg0 > -41) {
            field4450 = null;
        }
    }
}
