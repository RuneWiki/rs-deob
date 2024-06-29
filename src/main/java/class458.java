import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class458 extends class79 {

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field6600 = -1;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field6605;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2682(int arg0, boolean arg1) {
        field6602++;
        if (arg0 == 18 || arg0 == 57 || arg0 == 45 || arg0 == 3 || arg0 == 30) {
            return true;
        } else if (arg0 == 9 || arg0 == 1003) {
            return true;
        } else if (arg1) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(JI)V")
    public static final void method2683(long arg0, int arg1) {
        field6601++;
        int var3 = class539.field7514 + class644.field9367.field5108;
        int var4 = class409.field6075 + class644.field9367.field5109;
        if (~(class8.field81 - var3) > arg1 || class8.field81 - var3 > 500 || (class372.field5377 - var4) < -500 || (class372.field5377 - var4) > 500) {
            class8.field81 = var3;
            class372.field5377 = var4;
        }
        if (class8.field81 != var3) {
            int var5 = var3 - class8.field81;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class8.field81 += var6;
        }
        if (class372.field5377 != var4) {
            int var7 = var4 - class372.field5377;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class372.field5377 += var8;
        }
        if (!class202.field2854.field7903) {
            class181.field2622 += (float) arg0 * class367.field5199 / 6.0F;
            class523.field7256 += (float) arg0 * class563.field8074 / 6.0F;
        }
        class492.method2814(false);
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
    public static final void method2684(int arg0) {
        field6603++;
        if (class614.field8712) {
            return;
        }
        int var1 = -114 / ((14 - arg0) / 52);
        class430.method2563((byte) 127, class598.field8507);
        if (class245.field3546 != null) {
            class430.method2563((byte) 126, class245.field3546);
        }
        class614.field8712 = true;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZBLjava/lang/String;)V")
    public static final void method2685(boolean arg0, byte arg1, String arg2) {
        field6604++;
        if (arg2 == null) {
            return;
        }
        if (class511.field7081 >= 100) {
            class83.method758((byte) 125, class179.field2607.method3220(false, class538.field7500));
            return;
        }
        String var3 = class596.method3403(arg2, -110);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class511.field7081; var4++) {
            String var8 = class596.method3403(class290.field4198[var4], -97);
            if (var8 != null && var8.equals(var3)) {
                class83.method758((byte) 125, arg2 + class193.field2779.method3220(false, class538.field7500));
                return;
            }
            if (class293.field4223[var4] != null) {
                String var9 = class596.method3403(class293.field4223[var4], -120);
                if (var9 != null && var9.equals(var3)) {
                    class83.method758((byte) 125, arg2 + class193.field2779.method3220(false, class538.field7500));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class404.field6020; var5++) {
            String var6 = class596.method3403(class534.field7454[var5], -95);
            if (var6 != null && var6.equals(var3)) {
                class83.method758((byte) 125, class82.field1461.method3220(false, class538.field7500) + arg2 + class259.field3777.method3220(false, class538.field7500));
                return;
            }
            if (class301.field4344[var5] != null) {
                String var7 = class596.method3403(class301.field4344[var5], -90);
                if (var7 != null && var7.equals(var3)) {
                    class83.method758((byte) 125, class82.field1461.method3220(false, class538.field7500) + arg2 + class259.field3777.method3220(false, class538.field7500));
                    return;
                }
            }
        }
        if (class596.method3403(class644.field9367.field5958, -92).equals(var3)) {
            class83.method758((byte) 125, class509.field7062.method3220(false, class538.field7500));
            return;
        }
        if (arg1 != -65) {
            method2684(91);
        }
        class624.method3537(-80, class453.field6567);
        class148.field2259++;
        class127.field2088.method1710(class51.method441((byte) -124, arg2) + 1, 46);
        class127.field2088.method1726((byte) -52, arg2);
        class127.field2088.method1710(arg0 ? 1 : 0, 49);
    }

    static {
        new class567("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
    }
}
