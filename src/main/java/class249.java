import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class249 {

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "Lsn;")
    public static class205 field3390 = new class205(1, -1);

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "Lrb;")
    public static class283 field3396 = new class283(9, -2);

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "Lub;")
    public static class301 field3397 = new class301("", 15);

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "B")
    public byte field3376;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "B")
    public byte field3382;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "B")
    public byte field3383;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "B")
    public byte field3387;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "B")
    public byte field3388;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "B")
    public byte field3393;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "B")
    public byte field3395;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public int field3378;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public int field3379;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "Lkt;")
    public static class61 field3394;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "S")
    public short field3377;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "Z")
    public boolean field3374;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "Z")
    public boolean field3375;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "Z")
    public boolean field3380;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "Z")
    public boolean field3381;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "Z")
    public boolean field3384;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "Z")
    public boolean field3385;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "Z")
    public boolean field3386;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "Z")
    public boolean field3391;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "Z")
    public boolean field3392;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "()V", line = 4)
    public static final void method1486() {
        if (class134.field2046 != null) {
            for (int var0 = 0; var0 < class134.field2046.length; var0++) {
                for (int var1 = 0; var1 < class124.field1916; var1++) {
                    for (int var2 = 0; var2 < class177.field2664; var2++) {
                        if (class134.field2046[var0][var1][var2] != null) {
                            class134.field2046[var0][var1][var2].method3156(2);
                        }
                        class134.field2046[var0][var1][var2] = null;
                    }
                }
            }
        }
        class134.field2046 = null;
        class348.field5000 = null;
        if (class239.field3306 != null) {
            for (int var3 = 0; var3 < class239.field3306.length; var3++) {
                for (int var4 = 0; var4 < class124.field1916; var4++) {
                    for (int var5 = 0; var5 < class177.field2664; var5++) {
                        if (class239.field3306[var3][var4][var5] != null) {
                            class239.field3306[var3][var4][var5].method3156(2);
                        }
                        class239.field3306[var3][var4][var5] = null;
                    }
                }
            }
        }
        class239.field3306 = null;
        class36.field554 = null;
        class103.field1632 = null;
        class492.field7122 = null;
        class349.field5072 = 0;
        if (class280.field3809 != null) {
            for (int var6 = 0; var6 < class349.field5072; var6++) {
                class280.field3809[var6] = null;
            }
        }
        if (class140.field2099 != null) {
            for (int var7 = 0; var7 < class265.field3572; var7++) {
                class140.field2099[var7] = null;
            }
            class265.field3572 = 0;
        }
        if (class231.field3229 != null) {
            for (int var8 = 0; var8 < class384.field5507; var8++) {
                class231.field3229[var8] = null;
            }
            for (int var9 = 0; var9 < class265.field3571; var9++) {
                for (int var10 = 0; var10 < class124.field1916; var10++) {
                    for (int var11 = 0; var11 < class177.field2664; var11++) {
                        class118.field1853[var9][var10][var11] = 0L;
                    }
                }
            }
            class384.field5507 = 0;
        }
        class496.field7269 = null;
        class320.method1896(0);
        class116.field1835.method2593(false);
        class34.field526 = null;
        class436.field6304 = null;
        class92.field1512 = null;
        class295.field3992 = null;
        class159.field2419 = null;
        class77.field1093 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILat;)Ljava/lang/String;", line = 146)
    public static final String method1487(int arg0, int arg1, class444 arg2) {
        field3389++;
        if (!client.method3067(arg2).method2552((byte) -49, arg1) && arg2.field6536 == null) {
            return null;
        }
        if (arg0 < 83) {
            method1488(false);
        }
        if (arg2.field6405 == null || arg2.field6405.length <= arg1 || arg2.field6405[arg1] == null || arg2.field6405[arg1].trim().length() == 0) {
            return class181.field2693 ? "Hidden-" + arg1 : null;
        } else {
            return arg2.field6405[arg1];
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V", line = 184)
    public static void method1488(boolean arg0) {
        field3396 = null;
        field3397 = null;
        if (arg0) {
            field3397 = null;
        }
        field3394 = null;
        field3390 = null;
    }
}
