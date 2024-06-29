import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class379 {

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "Lwf;")
    private class117 field5221 = new class117(64);

    @OriginalMember(owner = "client!lv", name = "l", descriptor = "Lkda;")
    private class328 field5227;

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "I")
    public static int field5222 = 0;

    @OriginalMember(owner = "client!lv", name = "m", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!lv", name = "h", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!lv", name = "i", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!lv", name = "j", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!lv", name = "k", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lqa;I)V")
    public static final void method2260(class208 arg0, int arg1) {
        field5223++;
        int var2 = class37.field454;
        int var3 = class483.field6896;
        int var4 = class340.field4704;
        int var5 = class131.field1805;
        int var6 = -10660793;
        arg0.method1378(true, var2, var6, var4, var5, var3);
        arg0.method1378(true, var2 + 1, -16777216, var4 + -2, 16, var3 + 1);
        arg0.method1374(true, var5 - 19, var4 - 2, -16777216, var2 + 1, var3 + 18);
        class114.field1608.method726(var2 + 3, class13.field118.method3408(92, class63.field795), true, -1, var6, var3 + 14);
        if (arg1 >= -19) {
            method2260(null, 119);
        }
        int var7 = class623.field9182.method1587((byte) -20);
        int var8 = class623.field9182.method1594(2028208128);
        int var9 = 0;
        for (class583 var10 = (class583) class174.field2677.method124((byte) 42); var10 != null; var10 = (class583) class174.field2677.method120(99)) {
            int var11 = (class103.field1484 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var2 < var7 && var2 + var4 > var7 && var8 > var11 - 13 && var8 < (var11 + 3) && var10.field8551) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class397.method2359(var10.field8566, (byte) -122)) {
                var13 = class150.field2242.method3606((byte) -111, (int) var10.field8564).field8051;
            } else if (var10.field8558 != -1) {
                var13 = class150.field2242.method3606((byte) -124, var10.field8558).field8051;
            } else if (class555.method3354(-42, var10.field8566)) {
                class505 var16 = (class505) class510.field7260.method2799((long) ((int) var10.field8564), true);
                if (var16 != null) {
                    class571 var17 = var16.field7148;
                    class87 var18 = var17.field8405;
                    if (var18.field1314 != null) {
                        var18 = var18.method655((byte) 108, class556.field8280);
                    }
                    if (var18 != null) {
                        var13 = var18.field1267;
                    }
                }
            } else if (class513.method3044(var10.field8566, 1012)) {
                Object var14 = null;
                class145 var15;
                if (var10.field8566 == 1012) {
                    var15 = class216.field3172.method1505(-24044, (int) var10.field8564);
                } else {
                    var15 = class216.field3172.method1505(-24044, (int) (var10.field8564 >>> 32 & 0x7FFFFFFFL));
                }
                if (var15.field2028 != null) {
                    var15 = var15.method991(class556.field8280, true);
                }
                if (var15 != null) {
                    var13 = var15.field2023;
                }
            }
            String var19 = class632.method3679(var10, (byte) -34);
            if (var13 != null) {
                var19 = var19 + class540.method3280((byte) 57, var13);
            }
            class114.field1608.method732(var11, var12, class352.field4793, (byte) -114, var19, class371.field5098, 0, var2 + 3);
            if (var10.field8552) {
                class580.field8536.method316(var2 + class470.field6636.method2126((byte) 80, var19) + 5, var11 + -12);
            }
            var9++;
        }
        class224.method1445(class37.field454, class340.field4704, (byte) -31, class131.field1805, class483.field6896);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V")
    public final void method2261(byte arg0) {
        field5217++;
        if (arg0 <= 10) {
            method2263(83, null);
        }
        class117 var2 = this.field5221;
        synchronized (this.field5221) {
            this.field5221.method837(127);
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V")
    public static final void method2262(int arg0) {
        class112.field1589.field2177 = 0;
        field5220++;
        class333.field4615 = 0;
        class482.field6884 = null;
        class383.field5272 = null;
        class554.field8256 = 0;
        class525.field7521 = 0;
        class564.field8360 = null;
        class234.field3399 = null;
        class632.field9278.field2177 = 0;
        class485.method2911((byte) -31);
        class351.method2121(865758566);
        for (int var1 = arg0; var1 < 2048; var1++) {
            class293.field4036[var1] = null;
        }
        class541.field8119 = null;
        for (int var2 = 0; var2 < class599.field8840; var2++) {
            class571 var4 = class57.field718[var2].field7148;
            if (var4 != null) {
                var4.field1923 = -1;
            }
        }
        class197.method1324(10);
        class531.field7929 = 1;
        class18.method117((byte) -85, 9);
        for (int var3 = 0; var3 < 100; var3++) {
            class104.field1511[var3] = true;
        }
        class577.method3433((byte) 88);
        class589.field8745 = null;
        class115.field1611 = 0L;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(ILvp;)Ljava/lang/String;")
    public static final String method2263(int arg0, class162 arg1) {
        field5216++;
        if (arg0 != 32694) {
            field5226 = 33;
        }
        if (client.method1599(arg1).method3658(-116) == 0) {
            return null;
        } else if (arg1.field2435 == null || arg1.field2435.trim().length() == 0) {
            return class112.field1592 ? "Hidden-use" : null;
        } else {
            return arg1.field2435;
        }
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(B)V")
    public final void method2264(byte arg0) {
        class117 var2 = this.field5221;
        synchronized (this.field5221) {
            if (arg0 < 23) {
                method2263(57, null);
            }
            this.field5221.method846(0);
        }
        field5219++;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IZ)Lmq;")
    public final class435 method2265(int arg0, boolean arg1) {
        field5224++;
        class117 var3 = this.field5221;
        class435 var4;
        synchronized (this.field5221) {
            var4 = (class435) this.field5221.method842(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1) {
            method2263(-41, null);
        }
        class328 var5 = this.field5227;
        byte[] var6;
        synchronized (this.field5227) {
            var6 = this.field5227.method1966(class532.method3211(arg0, -9419), class368.method2209((byte) 124, arg0), !arg1);
        }
        class435 var7 = new class435();
        if (var6 != null) {
            var7.method2537(-1, new class148(var6));
        }
        class117 var8 = this.field5221;
        synchronized (this.field5221) {
            this.field5221.method835((byte) 125, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)V")
    public final void method2266(int arg0, int arg1) {
        class117 var3 = this.field5221;
        synchronized (this.field5221) {
            this.field5221.method837(126);
            this.field5221 = new class117(arg0);
        }
        if (arg1 == 0) {
            field5218++;
        }
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(II)V")
    public final void method2267(int arg0, int arg1) {
        class117 var3 = this.field5221;
        synchronized (this.field5221) {
            this.field5221.method834(arg0, 0);
        }
        field5225++;
        int var4 = 19 / ((arg1 + 12) / 54);
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lbt;ILkda;)V")
    public class379(class39 arg0, int arg1, class328 arg2) {
        this.field5227 = arg2;
        if (this.field5227 != null) {
            int var4 = this.field5227.method1974(-8588) - 1;
            this.field5227.method1975(56, var4);
        }
    }

    static {
        new class572("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field5228 = 0;
    }
}
