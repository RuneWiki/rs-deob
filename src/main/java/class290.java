import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class290 extends class288 {

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "[Lgi;")
    public static class194[] field4629 = new class194[29];

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "Ljava/lang/String;")
    public static String field4630 = "wishes to trade with you.";

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "Z")
    public static boolean field4632 = false;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(II)I")
    public static final int method1941(int arg0, int arg1) {
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        field4633++;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg1 != -1675860440) {
            field4632 = true;
        }
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(B)V")
    public static final void method1942(byte arg0) {
        if (class197.field3179 != null && (class197.field3179.field614 + 64 - class197.field3179.method385((byte) -101) * 64 >> 7) == class5.field60 && (class197.field3179.field613 - (class197.field3179.method385((byte) -58) - 1) * 64 >> 7) == class184.field2932) {
            class5.field60 = 0;
        }
        field4627++;
        if (arg0 > -13) {
            return;
        }
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var6 = 0; var6 < 104; var6++) {
                class161.field2616[var1][var6] = 0;
            }
        }
        for (int var2 = 0; var2 < class70.field969; var2++) {
            class235 var5 = class260.field4141[class51.field721[var2]];
            if (var5 != null) {
                var5.field625 = false;
            }
        }
        for (int var3 = 0; var3 < class251.field4027; var3++) {
            class275 var4 = class198.field3193[class134.field2250[var3]];
            if (var4 != null) {
                var4.field625 = false;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ld;ZI)V")
    public static final void method1943(class128 arg0, boolean arg1, int arg2) {
        field4628++;
        int var3 = arg0.field2135;
        int var4 = (int) arg0.field962;
        arg0.method544(96);
        if (arg1) {
            class236.method1555(-90, var3);
        }
        class78.method584((byte) -86, var3);
        if (arg2 <= 61) {
            field4632 = false;
        }
        class103 var5 = class168.method1180(8931, var4);
        if (var5 != null) {
            class45.method346((byte) 51, var5);
        }
        int var6 = class202.field3248;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class62.method479(class23.field291[var7], 32000)) {
                class117.method830(-126, var7);
            }
        }
        if (class202.field3248 == 1) {
            class240.field3852 = false;
            class134.method944(class283.field4512, class214.field3451, class179.field2897, class250.field4007, false);
        } else {
            class134.method944(class283.field4512, class214.field3451, class179.field2897, class250.field4007, false);
            int var8 = class283.field4524.method1119(class205.field3282);
            for (int var9 = 0; var9 < class202.field3248; var9++) {
                int var10 = class283.field4524.method1119(class207.method1396((byte) 51, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class179.field2897 = var8 + 8;
            class283.field4512 = class202.field3248 * 15 + (class41.field482 ? 26 : 22);
        }
        if (class113.field1944 != -1) {
            class76.method577(class113.field1944, 1, 21767);
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class290() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        if (arg0 == 0) {
            field4634++;
            return class246.field3958;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(B)V")
    public static void method1944(byte arg0) {
        field4629 = null;
        int var1 = 63 / ((-arg0 - 57) / 52);
        field4630 = null;
    }
}
