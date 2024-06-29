import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public abstract class class248 {

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Ljf;")
    public static class216 field4032 = new class216(500);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4034;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lsc;IIIZ)V")
    public void method893(class248 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4031++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)Lsc;")
    public class248 method902(int arg0, int arg1, int arg2) {
        field4024++;
        return this;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Lob;")
    public static final class277 method1765(int arg0, int arg1) {
        if (arg1 != 25571) {
            field4025 = 126;
        }
        field4029++;
        class277 var2 = (class277) class191.field3022.method1517((long) arg0, (byte) -114);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class255.field4158.method501(-2, arg0, 0);
        class277 var4 = new class277();
        if (var3 != null) {
            var4.method1914(arg1 ^ 0xFFFF9C1C, new class170(var3));
        }
        var4.method1916((byte) 25);
        class191.field3022.method1518(var4, (long) arg0, (byte) 75);
        return var4;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()I")
    public abstract int method4();

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1766(int arg0) {
        field4032 = null;
        field4034 = null;
        if (arg0 != -10918) {
            field4032 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIIIJILom;)V")
    public abstract void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class65 arg10);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)I")
    public static final int method1767(byte arg0) {
        field4028++;
        int var1 = -88 % ((38 - arg0) / 50);
        return class8.field110;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V")
    public abstract void method3(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILaj;BII)V")
    public static final void method1768(int arg0, class1 arg1, byte arg2, int arg3, int arg4) {
        field4030++;
        if (class214.field3347 == arg1 || class173.field2721 >= 400) {
            return;
        }
        String var11;
        if (arg1.field5 == 0) {
            boolean var5 = true;
            if (class214.field3347.field35 != -1 && arg1.field35 != -1) {
                int var6 = arg1.field35 <= class214.field3347.field35 ? arg1.field35 : class214.field3347.field35;
                int var7 = class214.field3347.field13 > arg1.field13 ? class214.field3347.field13 : arg1.field13;
                int var8 = class214.field3347.field13 - arg1.field13;
                int var9 = var7 * 10 / 100 + var6 + 5;
                if (var8 < 0) {
                    var8 = -var8;
                }
                if (var9 < var8) {
                    var5 = false;
                }
            }
            String var10 = class257.field4188 == 1 ? class158.field2364 : class21.field277;
            if (arg1.field22 > arg1.field13) {
                var11 = arg1.method6(113) + (var5 ? class306.method2045(class214.field3347.field13, 376, arg1.field13) : "<col=ffffff>") + " (" + var10 + arg1.field13 + "+" + (arg1.field22 - arg1.field13) + ")";
            } else {
                var11 = arg1.method6(113) + (var5 ? class306.method2045(class214.field3347.field13, 376, arg1.field13) : "<col=ffffff>") + " (" + var10 + arg1.field13 + ")";
            }
        } else {
            var11 = arg1.method6(113) + " (" + class305.field4853 + arg1.field5 + ")";
        }
        if (class197.field3123 == 1) {
            class256.field4176++;
            class28.method142(class230.field3551 + " -> <col=ffffff>" + var11, -122, class179.field2800, arg0, (short) 44, (long) arg3, arg4, class123.field1773);
        } else if (!class63.field911) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class196.field3098[var12] != null) {
                    class124.field1792++;
                    short var13 = 0;
                    if (class257.field4188 == 0 && class196.field3098[var12].equalsIgnoreCase(class61.field889)) {
                        if (class214.field3347.field13 < arg1.field13) {
                            var13 = 2000;
                        }
                        if (class214.field3347.field38 != 0 && arg1.field38 != 0) {
                            if (class214.field3347.field38 == arg1.field38) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class76.field1143[var12]) {
                        var13 = 2000;
                    }
                    boolean var14 = false;
                    short var15 = class93.field1395[var12];
                    short var16 = (short) (var13 + var15);
                    class28.method142("<col=ffffff>" + var11, 57, class196.field3098[var12], arg0, var16, (long) arg3, arg4, class253.field4134[var12]);
                }
            }
        } else if ((class111.field1613 & 0x8) != 0) {
            class28.method142(class284.field4604 + " -> <col=ffffff>" + var11, -101, class59.field865, arg0, (short) 47, (long) arg3, arg4, class122.field1757);
            class235.field3800++;
        }
        for (int var17 = 0; var17 < class173.field2721; var17++) {
            if (class192.field3056[var17] == 15) {
                class43.field521[var17] = "<col=ffffff>" + var11;
                break;
            }
        }
        int var18 = 63 / ((50 - arg2) / 48);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "()Z")
    public boolean method908() {
        field4026++;
        return false;
    }
}
