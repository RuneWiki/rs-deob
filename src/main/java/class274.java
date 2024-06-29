import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class class274 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field4197 = 0;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field4199 = 0;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "J")
    public static long field4205 = 0L;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field4207 = 0;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "F")
    public static float field4200;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "[I")
    public static int[] field4202;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "[Lfg;")
    public static class191[] field4204;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZ)V", line = 4)
    public static final void method1836(int arg0, boolean arg1) {
        if (arg0 != 0) {
            field4204 = (class191[]) null;
        }
        field4203++;
        if (class46.field959 != arg1) {
            class46.field959 = arg1;
            class209.method1418(1);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)[Lvk;", line = 30)
    public static final class197[] method1837(int arg0) {
        field4198++;
        if (class39.field758 == null) {
            class197[] var1 = class8.method69(class177.field2849, 117);
            class197[] var2 = new class197[var1.length];
            int var3 = 0;
            label59: for (int var4 = 0; var4 < var1.length; var4++) {
                class197 var5 = var1[var4];
                if ((var5.field3174 <= 0 || var5.field3174 >= 24) && var5.field3173 >= 800 && var5.field3172 >= 600) {
                    for (int var6 = 0; var6 < var3; var6++) {
                        class197 var7 = var2[var6];
                        if (var5.field3173 == var7.field3173 && var5.field3172 == var7.field3172) {
                            if (var5.field3174 > var7.field3174) {
                                var2[var6] = var5;
                            }
                            continue label59;
                        }
                    }
                    var2[var3] = var5;
                    var3++;
                }
            }
            class39.field758 = new class197[var3];
            class129.method848(var2, 0, class39.field758, 0, var3);
            int[] var8 = new int[class39.field758.length];
            for (int var9 = 0; var9 < class39.field758.length; var9++) {
                class197 var10 = class39.field758[var9];
                var8[var9] = var10.field3173 * var10.field3172;
            }
            class255.method1708(class39.field758, (byte) -30, var8);
        }
        if (arg0 != -25827) {
            field4199 = 99;
        }
        return class39.field758;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V", line = 106)
    public static void method1838(int arg0) {
        if (arg0 != -13400) {
            field4206 = 66;
        }
        field4202 = null;
        field4204 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Lng;", line = 129)
    public static final class175 method1839(int arg0, int arg1) {
        field4201++;
        class175 var2 = (class175) class122.field2110.method2367((long) arg1, -12270);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class307.field4675.method2036(0, arg1 & 0x7FFF, (byte) 40);
        } else {
            var3 = class234.field3682.method2036(0, arg1, (byte) 65);
        }
        if (arg0 > -41) {
            field4202 = (int[]) null;
        }
        class175 var4 = new class175();
        if (var3 != null) {
            var4.method1100((byte) -94, new class202(var3));
        }
        if (arg1 >= 32768) {
            var4.method1103(false);
        }
        class122.field2110.method2369((long) arg1, -28759, var4);
        return var4;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBI)I")
    public abstract int method835(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public abstract void method836(byte arg0);
}
