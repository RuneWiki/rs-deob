import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class221 extends class43 {

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public int field2729;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public int field2736;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public int field2737;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public int field2738;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public int field2739;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "Laq;")
    public class453 field2732;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "Laq;")
    public class453 field2741;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "Ljava/lang/String;")
    public String field2742;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "Z")
    public boolean field2730;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "[Ljava/lang/Object;")
    public Object[] field2735;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1341(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2740++;
        if (arg0 <= 111) {
            return true;
        } else if ((class222.field2770[0][arg2][arg1] & 0x2) != 0) {
            return true;
        } else if ((class222.field2770[arg4][arg2][arg1] & 0x10) == 0) {
            return class189.method1173(arg4, arg2, arg1, false) == arg3;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Luo;)V")
    public static final void method1342(class118 arg0) {
        for (int var1 = class367.field5003; var1 < class238.field3149; var1++) {
            for (int var2 = 0; var2 < class43.field512; var2++) {
                for (int var3 = 0; var3 < class262.field3367; var3++) {
                    class316 var4 = class347.field4722[var1][var2][var3];
                    if (var4 != null) {
                        class226 var5 = var4.field4268;
                        class226 var6 = var4.field4269;
                        if (var5 != null && var5.method129(3652)) {
                            class304.method1938(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method129(3652)) {
                                class304.method1938(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method137(arg0, 0, 0, 0, false, (byte) -117, var5);
                                var6.method140(-43);
                            }
                            var5.method140(-119);
                        }
                        for (class272 var7 = var4.field4256; var7 != null; var7 = var7.field3514) {
                            class133 var9 = var7.field3512;
                            if (var9 != null && var9.method129(3652)) {
                                class304.method1938(arg0, var9, var1, var2, var3, var9.field1510 + 1 - var9.field1512, var9.field1517 - var9.field1518 + 1);
                                var9.method140(-66);
                            }
                        }
                        class388 var8 = var4.field4255;
                        if (var8 != null && var8.method129(3652)) {
                            class211.method1292(arg0, var8, var1, var2, var3);
                            var8.method140(-112);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
    public static final void method1343(int arg0, int arg1) {
        field2733++;
        class365 var2 = class187.field2165;
        synchronized (class187.field2165) {
            class187.field2165.method2286(arg1, (byte) 36);
        }
        class365 var3 = class383.field5247;
        synchronized (class383.field5247) {
            class383.field5247.method2286(arg1, (byte) 36);
        }
        if (arg0 == -25005) {
            class158 var4 = class450.field6285;
            synchronized (class450.field6285) {
                class450.field6285.method1007(arg1, (byte) -77);
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    public static final void method1344(int arg0) {
        if (class241.field3160 <= 0) {
            class342.field4668 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class431.field5878.length; var2++) {
                if (class431.field5878[var2].startsWith("--> ")) {
                    var1++;
                    if (class241.field3160 == var1) {
                        class342.field4668 = class431.field5878[var2].substring(4);
                        break;
                    }
                }
            }
        }
        if (arg0 < 39) {
            method1341(12, -7, 99, -79, -91);
        }
        field2731++;
    }
}
