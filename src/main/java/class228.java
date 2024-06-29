import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class228 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field3347 = 16777215;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "Lqu;")
    public static class364 field3352 = new class364(50, 16);

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "Lqc;")
    public static class325 field3353 = new class325(10);

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "Lfo;")
    public static class22 field3355 = new class22(8, -1);

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method1487(int arg0) {
        field3353 = null;
        field3355 = null;
        field3352 = null;
        if (arg0 != 16) {
            field3352 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Llba;II)Lmg;")
    public static final class639 method1488(class237 arg0, int arg1, int arg2) {
        field3349++;
        class639 var3;
        if (class540.field8029 == null) {
            var3 = new class639();
        } else {
            var3 = class540.field8029;
            class540.field8029 = class540.field8029.field9291;
            var3.field9291 = null;
            class248.field3627--;
        }
        var3.field9288 = arg0;
        var3.field9289 = arg2;
        if (arg1 != -17917) {
            field3353 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)V")
    public static final void method1489(int arg0, int arg1, int arg2) {
        class415 var3 = class526.field7777[arg0][arg1][arg2];
        if (var3 != null && var3.field5976 != null) {
            var3.field5976 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
    public static final void method1490(int arg0) {
        field3354++;
        if (arg0 != -2) {
            field3353 = null;
        }
        class325 var1 = class203.field3028;
        synchronized (class203.field3028) {
            class203.field3028.method2037(true);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILjda;)V")
    public static final void method1491(int arg0, int arg1, class278 arg2) {
        if (class171.field2317) {
            arg0 = 0;
            class171.field2317 = false;
        }
        if (arg1 > -73) {
            method1488(null, 74, -20);
        }
        field3350++;
        if (class249.field3643 != null && class249.field3643.method1756(2, arg2)) {
            return;
        }
        class249.field3643 = arg2;
        class372.field5382 = class450.method2719((byte) 122);
        class542.field8109 = arg0;
        class43.field528 = arg0;
        if (class43.field528 != 0) {
            class336.field4934 = class616.field9018;
            class360.field5218 = class300.field4401;
            class158.field2039 = class166.field2247;
            class280.field4167 = class417.field5995;
            class166.field2255 = class404.field5804;
            class156.field1997 = class264.field3901;
            class294.field4316 = class470.field7211;
            class267.field3978 = class321.field4777;
            class46.field552 = class493.field7442;
            class396.field5747 = class510.field7572;
            return;
        }
        class361.method2213(65280);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[B)Lln;")
    public static final class94 method1492(int arg0, byte[] arg1) {
        field3348++;
        class94 var2 = new class94();
        class428 var3 = new class428(arg1);
        var3.field6221 = var3.field6162.length - 2;
        int var4 = var3.method2620(101);
        int var5 = var3.field6162.length - var4 - 12 - 2;
        var3.field6221 = var5;
        int var6 = var3.method2589(-11179);
        var2.field1166 = var3.method2620(arg0 + 98);
        var2.field1157 = var3.method2620(23);
        var2.field1161 = var3.method2620(42);
        var2.field1169 = var3.method2620(23);
        int var7 = var3.method2561((byte) -70);
        if (var7 > 0) {
            var2.field1168 = new class205[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method2620(86);
                class205 var10 = new class205(class479.method2908((byte) -99, var9));
                var2.field1168[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method2589(-11179);
                    int var12 = var3.method2589(-11179);
                    var10.method1341(new class269(var12), (byte) -106, (long) var11);
                }
            }
        }
        var3.field6221 = 0;
        var2.field1163 = var3.method2596(0);
        var2.field1159 = new int[var6];
        if (arg0 != -22) {
            return null;
        }
        var2.field1156 = new String[var6];
        var2.field1162 = new int[var6];
        int var13 = 0;
        while (var3.field6221 < var5) {
            int var14 = var3.method2620(114);
            if (var14 == 3) {
                var2.field1156[var13] = var3.method2585(126).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field1159[var13] = var3.method2561((byte) 110);
            } else {
                var2.field1159[var13] = var3.method2589(arg0 - 11157);
            }
            var2.field1162[var13++] = var14;
        }
        return var2;
    }
}
