import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class354 {

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public int field5029;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
    public int field5035;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "Lbo;")
    public class354 field5040;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "Lpo;")
    public class202 field5042;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
    public static int field5039 = 3;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public int field5030;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
    public int field5038;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "I")
    public int field5043;

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "[Z")
    public static boolean[] field5034;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 7)
    public static final void method2271(int arg0) {
        client.field3636.method112(0);
        field5033++;
        if (arg0 != 20189) {
            method2272(11, -81);
        }
        class30.field436.method112(0);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)Lwo;", line = 20)
    public static final class52 method2272(int arg0, int arg1) {
        field5031++;
        class52 var2 = (class52) class48.field778.method2228(-1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class152.field2323.method1355(arg0, -12607, 5);
        if (arg1 != 10) {
            field5039 = 67;
        }
        class52 var4 = new class52();
        if (var3 != null) {
            var4.method414(new class37(var3), (byte) 120);
        }
        class48.field778.method2226((long) arg0, var4, (byte) -108);
        return var4;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V", line = 45)
    public static void method2273(byte arg0) {
        if (arg0 != -11) {
            field5041 = -49;
        }
        field5034 = null;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V", line = 59)
    public static final void method2274(int arg0) {
        field5037++;
        class122.field1928.method726(class185.field2721, class152.field2321, class113.field1822);
        if (arg0 != -26130) {
            field5032 = -59;
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)V", line = 74)
    public static final void method2275(byte arg0) {
        class255.field3693.method147(35);
        field5044++;
        if (arg0 >= -17) {
            return;
        }
        for (class278 var1 = (class278) class276.field4153.method157((byte) -125); var1 != null; var1 = (class278) class276.field4153.method145(5)) {
            if (var1.field4182 < 1000) {
                var1.method251(31);
                class255.field3693.method148((byte) 83, var1);
            }
        }
        class255.field3693.method149(class276.field4153, 88);
        if (class133.field2141 != null || class273.field4109 != null || class5.field34 > 0) {
            return;
        }
        int var2 = class60.field951;
        if (!class84.field1365) {
            if (var2 == 1 && class389.field5591 > 0) {
                int var17 = ((class278) class276.field4153.field322.field497).field4182;
                if (var17 == 7 || var17 == 8 || var17 == 10 || var17 == 48 || var17 == 16 || var17 == 28 || var17 == 42 || var17 == 23 || var17 == 24 || var17 == 34 || var17 == 11 || var17 == 1005) {
                    class278 var18 = (class278) class276.field4153.field322.field497;
                    class258 var19 = class342.method2207(var18.field4178, (byte) 14);
                    class417 var20 = client.method1815(var19);
                    if (var20.method2608((byte) -42)) {
                        class444.field6454 = false;
                        class372.field5278 = 0;
                        if (class133.field2141 != null) {
                            class107.method947(true, class133.field2141);
                        }
                        class133.field2141 = class342.method2207(var18.field4178, (byte) 14);
                        class380.field5388 = class62.field1000;
                        class341.field4841 = class78.field1320;
                        class225.field3326 = var18.field4181;
                        class107.method947(true, class133.field2141);
                        return;
                    }
                }
            }
            if (var2 <= 0 && class117.field1854 > 0) {
                var2 = class117.field1854;
            }
            class117.field1854 = 0;
            if (var2 == 1 && (class60.field963 == 1 && class389.field5591 > 2 || class133.method1102(-2001))) {
                var2 = 2;
            }
            if (var2 == 2 && class389.field5591 > 0) {
                class307.method2100(21633);
            }
            if (var2 != 1 || class389.field5591 <= 0) {
                return;
            }
            class89.method666((byte) 86);
            return;
        }
        if (var2 != 1) {
            int var3 = class129.field2111;
            int var4 = class291.field4327;
            if ((class169.field2512 - 10) > var3 || var3 > class169.field2512 + class32.field452 + 10 || var4 < class63.field1024 - 10 || (class63.field1024 + class305.field4451 + 10) < var4) {
                class84.field1365 = false;
                class253.method1834(class32.field452, class305.field4451, false, class169.field2512, class63.field1024);
            }
        }
        if (var2 != 1) {
            return;
        }
        int var5 = class169.field2512;
        int var6 = class63.field1024;
        int var7 = class32.field452;
        int var8 = class62.field1000;
        int var9 = class78.field1320;
        int var10 = -1;
        for (int var11 = 0; var11 < class389.field5591; var11++) {
            if (class369.field5242) {
                int var16 = ((class389.field5591 - var11 - 1) * 16) + var6 + 33;
                if (var5 < var8 && (var5 + var7) > var8 && var9 > var16 - 13 && var9 < var16 + 3) {
                    var10 = var11;
                }
            } else {
                int var15 = var6 - (-((class389.field5591 - var11 - 1) * 16) - 31);
                if (var5 < var8 && var5 + var7 > var8 && var15 - 13 < var9 && var9 < var15 + 3) {
                    var10 = var11;
                }
            }
        }
        if (var10 != -1) {
            int var12 = 0;
            class214 var13 = new class214(class276.field4153);
            for (class278 var14 = (class278) var13.method1631((byte) -93); var14 != null; var14 = (class278) var13.method1629(-1)) {
                if (var10 == var12) {
                    class268.method1910((byte) 86, var14);
                }
                var12++;
            }
        }
        class84.field1365 = false;
        class253.method1834(class32.field452, class305.field4451, false, class169.field2512, class63.field1024);
        return;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(II)V", line = 260)
    public class354(int arg0, int arg1) {
        this.field5029 = arg1;
        this.field5035 = arg0;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lbo;I)V", line = 268)
    public class354(class354 arg0, int arg1) {
        this.field5040 = arg0;
        this.field5029 = this.field5040.field5029 + arg1;
        this.field5035 = this.field5040.field5035;
        this.field5042 = this.field5040.field5042;
    }
}
