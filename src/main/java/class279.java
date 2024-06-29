import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public abstract class class279 {

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "J")
    public static long field4425 = 0L;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "Lef;")
    public static class227 field4423;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method1894(long arg0, byte arg1) {
        if (arg1 != 63) {
            field4425 = -121L;
        }
        field4420++;
        return class257.method1739((byte) -102, arg0);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
    public static void method1895(int arg0) {
        field4423 = null;
        if (arg0 != 255) {
            field4423 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIII)Lh;")
    public static final class288 method1896(int arg0, int arg1, int arg2, int arg3) {
        class288 var4 = new class288();
        field4421++;
        if (arg0 != 26) {
            method1894(25L, (byte) 25);
        }
        var4.field4506 = arg3;
        var4.field4505 = arg2;
        class48.field787.method2046(var4, -95, (long) arg1);
        class142.method1034(76, arg2);
        class222 var5 = class169.method1217(arg1, 12180);
        if (var5 != null) {
            class80.method628((byte) -90, var5);
        }
        if (class260.field4115 != null) {
            class80.method628((byte) -118, class260.field4115);
            class260.field4115 = null;
        }
        int var6 = class14.field174;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class173.method1238(-23, class86.field1282[var7])) {
                class172.method1233(var7, 1);
            }
        }
        if (class14.field174 == 1) {
            class207.field3185 = false;
            class18.method137(class259.field4109, -124, class209.field3233, class272.field4345, class237.field3737);
        } else {
            class18.method137(class259.field4109, -128, class209.field3233, class272.field4345, class237.field3737);
            int var8 = class73.field1118.method1788(class164.field2480);
            for (int var9 = 0; var9 < class14.field174; var9++) {
                int var10 = class73.field1118.method1788(class151.method1097(true, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class272.field4345 = var8 + 8;
            class209.field3233 = (class284.field4471 ? 26 : 22) + class14.field174 * 15;
        }
        if (var5 != null) {
            class305.method2041(var5, 84, false);
        }
        class35.method330(arg0 - 148, arg2);
        if (class298.field4803 != -1) {
            class112.method829(-51, 1, class298.field4803);
        }
        return var4;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
    public static final void method1897(int arg0) {
        field4422++;
        for (class80 var1 = (class80) class58.field922.method6(-117); var1 != null; var1 = (class80) class58.field922.method11((byte) 40)) {
            if (var1.field1217) {
                var1.method629(false);
            }
        }
        if (arg0 != -10755) {
            method1897(-63);
        }
        for (class80 var2 = (class80) class121.field1832.method6(-112); var2 != null; var2 = (class80) class121.field1832.method11((byte) 57)) {
            if (var2.field1217) {
                var2.method629(false);
            }
        }
    }
}
