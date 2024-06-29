import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class14 {

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "[I")
    private int[] field238;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "Lao;")
    public static class188 field239;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "Lgf;")
    public static class180 field241;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "Lqa;")
    public static class162 field242;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
    public static final void method127(byte arg0) {
        class387.field5738.method2857(-18300);
        if (arg0 >= -82) {
            return;
        }
        field235++;
        int var1 = class387.field5738.method2847(-8, 8);
        if (class322.field4943 > var1) {
            for (int var2 = var1; var2 < class322.field4943; var2++) {
                class392.field5804[class107.field1670++] = class101.field1623[var2];
            }
        }
        if (class322.field4943 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class322.field4943 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class101.field1623[var3];
            class13 var5 = class132.field2030[var4];
            int var6 = class387.field5738.method2847(105, 1);
            if (var6 == 0) {
                class101.field1623[class322.field4943++] = var4;
                var5.field313 = class180.field2734;
            } else {
                int var7 = class387.field5738.method2847(-38, 2);
                if (var7 == 0) {
                    class101.field1623[class322.field4943++] = var4;
                    var5.field313 = class180.field2734;
                    class305.field4371[class109.field1692++] = var4;
                } else if (var7 == 1) {
                    class101.field1623[class322.field4943++] = var4;
                    var5.field313 = class180.field2734;
                    int var8 = class387.field5738.method2847(-50, 3);
                    var5.method123(1, 0, var8);
                    int var9 = class387.field5738.method2847(-113, 1);
                    if (var9 == 1) {
                        class305.field4371[class109.field1692++] = var4;
                    }
                } else if (var7 == 2) {
                    class101.field1623[class322.field4943++] = var4;
                    var5.field313 = class180.field2734;
                    if (class387.field5738.method2847(118, 1) == 1) {
                        int var10 = class387.field5738.method2847(122, 3);
                        var5.method123(2, 0, var10);
                        int var11 = class387.field5738.method2847(116, 3);
                        var5.method123(2, 0, var11);
                    } else {
                        int var12 = class387.field5738.method2847(121, 3);
                        var5.method123(0, 0, var12);
                    }
                    int var13 = class387.field5738.method2847(-60, 1);
                    if (var13 == 1) {
                        class305.field4371[class109.field1692++] = var4;
                    }
                } else if (var7 == 3) {
                    class392.field5804[class107.field1670++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)I")
    public final int method128(int arg0, int arg1) {
        if (arg0 != 13287) {
            return -43;
        }
        field236++;
        int var3 = (this.field238.length >> 1) - 1;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field238[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field238[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
    public static void method129(byte arg0) {
        field241 = null;
        field239 = null;
        field242 = null;
        if (arg0 < 35) {
            method130(-3, null);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILei;)V")
    public static final void method130(int arg0, class116 arg1) {
        field237++;
        if (arg0 != 0) {
            method130(-119, null);
        }
        if (arg1.field1839 != null) {
            arg1.field1839.field7643 = 0;
        }
        arg1.field1842 = false;
        for (class116 var2 = arg1.method228(); var2 != null; var2 = arg1.method222()) {
            method130(0, var2);
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "([I)V")
    public class14(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field238 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field238[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field238[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field238[var5 + var5] = arg0[var4];
            this.field238[var5 + var5 + 1] = var4++;
        }
    }

    static {
        new class180("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
        field239 = new class188(45, 3);
        field241 = new class180("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");
    }
}
