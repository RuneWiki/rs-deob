import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class78 {

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "[I")
    public static int[] field1082 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    public static int field1084 = -50;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "F")
    public static float field1085 = 0.0F;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "Ll;")
    public static class127 field1087;

    @OriginalMember(owner = "client!kq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1088++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILsm;)I")
    public static final int method565(int arg0, class477 arg1) {
        field1086++;
        String var2 = class73.method513(arg0 ^ arg0, arg1);
        int[] var3 = null;
        if (class219.method1383(arg1.field7034, 111)) {
            var3 = class164.field2437.method1749((int) arg1.field7030, arg0 - 270684902).field1147;
        } else if (arg1.field7038 != -1) {
            var3 = class164.field2437.method1749(arg1.field7038, -20230).field1147;
        } else if (class26.method255(arg1.field7034, arg0 - 270664773)) {
            class351 var4 = class88.field1375[(int) arg1.field7030];
            if (var4 != null) {
                class277 var5 = var4.field5409;
                if (var5.field4148 != null) {
                    var5 = var5.method1734((byte) -106, class307.field4619);
                }
                if (var5 != null) {
                    var3 = var5.field4195;
                }
            }
        } else if (class310.method1943(arg1.field7034, 1)) {
            Object var6 = null;
            class486 var7;
            if (arg1.field7034 == 1011) {
                var7 = class119.field1824.method248((int) arg1.field7030, 30);
            } else {
                var7 = class119.field1824.method248((int) (arg1.field7030 >>> 32 & 0x7FFFFFFFL), 30);
            }
            if (var7.field7219 != null) {
                var7 = var7.method2909((byte) 66, class307.field4619);
            }
            if (var7 != null) {
                var3 = var7.field7227;
            }
        }
        if (var3 != null) {
            var2 = var2 + class428.method2538(arg0 ^ 0xEFDDFC1F, var3);
        }
        int var8 = class342.field5252.method2596((byte) 110, class184.field2715, var2);
        if (arg1.field7027) {
            var8 += class283.field4279.method470() + 4;
        }
        return var8;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)V")
    public static void method566(boolean arg0) {
        field1082 = null;
        field1087 = null;
        if (!arg0) {
            method565(-59, null);
        }
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class78(String arg0, int arg1) {
        this.field1083 = arg1;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)V")
    public static final void method567(int arg0, int arg1) {
        class502 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class337 var4 = class213.field3048[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class167.field2473; var5++) {
                    for (int var6 = 0; var6 < class445.field6562; var6++) {
                        var2 = var4.method712(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class9.field75;
                            int var8 = var5 << class9.field75;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class337 var10 = class213.field3048[var9];
                                if (var10 != null) {
                                    int var11 = var4.method707(var6, var5) - var10.method707(var6, var5);
                                    int var12 = var4.method707(var6 + 1, var5) - var10.method707(var6 + 1, var5);
                                    int var13 = var4.method707(var6 + 1, var5 + 1) - var10.method707(var6 + 1, var5 + 1);
                                    int var14 = var4.method707(var6, var5 + 1) - var10.method707(var6, var5 + 1);
                                    var10.method703(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
