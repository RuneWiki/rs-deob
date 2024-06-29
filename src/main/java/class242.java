import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class242 {

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "Lh;")
    private class571 field3391 = new class571(256);

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "Lwr;")
    private class388 field3390;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "Ln;")
    private class17 field3388;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "Ldv;")
    public static class566 field3389 = new class566(24, 3);

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "Lej;")
    public static class104 field3395 = new class104("Loading JACLIB - ", "Lade JACLIB - ", "Chargement JACLIB - ", "Carregando JACLIB - ");

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
    public final void method1509(int arg0) {
        if (arg0 < 78) {
            method1511(99);
        }
        this.field3391.method3253(5, -121);
        field3387++;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)Lwn;")
    public final class617 method1510(int arg0, int arg1) {
        field3393++;
        Object var3 = this.field3391.method3252((long) arg0, (byte) -106);
        if (var3 != null) {
            return (class617) var3;
        } else if (this.field3388.method188(arg0, arg1 - 169)) {
            if (arg1 != 64) {
                field3389 = null;
            }
            class211 var4 = this.field3388.method190((byte) -89, arg0);
            int var5 = var4.field2965 ? 64 : this.field3390.field5416;
            class617 var7;
            if (var4.field2987 && this.field3390.method1328()) {
                float[] var6 = this.field3388.method187(arg0, var5, (byte) -97, var5, false, 0.7F);
                var7 = this.field3390.method2316(class49.field958, var5, (byte) -33, var6, var5, var4.field2980 != 0);
            } else {
                int[] var8 = var4.field2970 ? this.field3388.method185(false, 0.7F, var5, arg0, var5, (byte) 49) : this.field3388.method186(true, arg0, 10350, var5, var5, 0.7F);
                var7 = this.field3390.method2322(var5, var8, var5, 8, var4.field2980 != 0);
            }
            var7.method1812(var4.field2974, var4.field2985, -21501);
            this.field3391.method3243(var7, (long) arg0, arg1 ^ 0x71);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)V")
    public static void method1511(int arg0) {
        if (arg0 != 28273) {
            field3395 = null;
        }
        field3389 = null;
        field3395 = null;
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(I)V")
    public static final void method1512(int arg0) {
        class641.field9319.method1247(0);
        field3394++;
        if (arg0 >= -92) {
            field3395 = null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IILnj;)Z")
    public static final boolean method1513(int arg0, int arg1, class204 arg2) {
        field3386++;
        int var3 = arg2.method1237(592256579, 2);
        if (var3 == 0) {
            if (arg2.method1237(592256579, 1) != 0) {
                method1513(41, arg1, arg2);
            }
            int var4 = arg2.method1237(592256579, 6);
            int var5 = arg2.method1237(592256579, 6);
            boolean var6 = arg2.method1237(592256579, 1) == 1;
            if (var6) {
                class283.field3910[class155.field2316++] = arg1;
            }
            if (class349.field4696[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class62 var7 = class112.field1727[arg1];
            class188 var8 = class349.field4696[arg1] = new class188();
            var8.field607 = arg1;
            if (class492.field6896[arg1] != null) {
                var8.method1176(class492.field6896[arg1], (byte) -121);
            }
            var8.method341(true, var7.field1081, -112);
            var8.field532 = var7.field1083;
            int var9 = var7.field1077;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FCF7D) >> 14;
            var8.field2661 = var7.field1078;
            int var12 = var9 & 0xFF;
            var8.field620[0] = class463.field6544[arg1];
            var8.field6035 = (byte) var10;
            var8.method1174((var11 << 6) + var4 - class519.field7304, (var12 << 6) - -var5 - class6.field80, 75);
            var8.field2654 = false;
            class112.field1727[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg2.method1237(592256579, 2);
            int var14 = class112.field1727[arg1].field1077;
            class112.field1727[arg1].field1077 = (((var14 >> 28) + var13 & 0x3) << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg2.method1237(592256579, 5);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class112.field1727[arg1].field1077;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = (var18 & 0x3FD5D0) >> 14;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var21--;
                var20--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var20++;
                var21--;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var21++;
                var20--;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var21++;
                var20++;
            }
            class112.field1727[arg1].field1077 = (var19 << 28) + (var20 << 14) + var21;
            return false;
        } else {
            int var22 = arg2.method1237(592256579, 18);
            if (arg0 <= 29) {
                method1512(-70);
            }
            int var23 = var22 >> 16;
            int var24 = (var22 & 0xFF51) >> 8;
            int var25 = var22 & 0xFF;
            int var26 = class112.field1727[arg1].field1077;
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var25 + var26 & 0xFF;
            class112.field1727[arg1].field1077 = (var28 << 14) + (var27 << 28) + var29;
            return false;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z)V")
    public final void method1514(boolean arg0) {
        field3392++;
        this.field3391.method3246(!arg0);
        if (!arg0) {
            field3395 = null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lwr;Ln;)V")
    public class242(class388 arg0, class17 arg1) {
        this.field3390 = arg0;
        this.field3388 = arg1;
    }
}
