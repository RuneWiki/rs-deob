import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class118 extends class90 {

    @OriginalMember(owner = "client!me", name = "x", descriptor = "Lrf;")
    private static class163 field2485 = class53.method392(111, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!me", name = "A", descriptor = "Lrf;")
    public static class163 field2488 = field2485;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "Lrf;")
    public static class163 field2489 = class53.method392(-112, "lila:");

    @OriginalMember(owner = "client!me", name = "E", descriptor = "Lig;")
    public static class84 field2492 = null;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "Lfc;")
    public static class54 field2483 = new class54(30);

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "I")
    public static int field2504 = 0;

    @OriginalMember(owner = "client!me", name = "R", descriptor = "I")
    public static int field2505 = 0;

    @OriginalMember(owner = "client!me", name = "P", descriptor = "I")
    public static int field2503 = 0;

    @OriginalMember(owner = "client!me", name = "U", descriptor = "I")
    public static int field2508 = -1;

    @OriginalMember(owner = "client!me", name = "V", descriptor = "I")
    public static int field2509 = 3;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "I")
    public int field2486;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    public int field2487;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "I")
    public int field2494;

    @OriginalMember(owner = "client!me", name = "H", descriptor = "I")
    public int field2495;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!me", name = "L", descriptor = "I")
    public int field2499;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!me", name = "S", descriptor = "Lrf;")
    public class163 field2506;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "Lta;")
    public static class176 field2496;

    @OriginalMember(owner = "client!me", name = "J", descriptor = "Lu;")
    public static class184 field2497;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "Lig;")
    public class84 field2484;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "Lig;")
    public class84 field2500;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2493;

    @OriginalMember(owner = "client!me", name = "O", descriptor = "[Ljava/lang/Object;")
    public Object[] field2502;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V")
    public static final void method808(int arg0) {
        field2498++;
        int var1 = class105.field2195.method331(8, -2055311549);
        if (class112.field2377 > var1) {
            for (int var2 = var1; var2 < class112.field2377; var2++) {
                class168.field3434[class72.field1522++] = class27.field504[var2];
            }
        }
        if (var1 > class112.field2377) {
            throw new RuntimeException("gppov1");
        }
        class112.field2377 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class27.field504[var3];
            class38 var5 = class121.field2553[var4];
            int var6 = class105.field2195.method331(1, -2055311549);
            if (var6 == 0) {
                class27.field504[class112.field2377++] = var4;
                var5.field711 = class51.field1023;
            } else {
                int var7 = class105.field2195.method331(2, -2055311549);
                if (var7 == 0) {
                    class27.field504[class112.field2377++] = var4;
                    var5.field711 = class51.field1023;
                    class52.field1088[class181.field3638++] = var4;
                } else if (var7 == 1) {
                    class27.field504[class112.field2377++] = var4;
                    var5.field711 = class51.field1023;
                    int var8 = class105.field2195.method331(3, -2055311549);
                    var5.method223(false, var8, false);
                    int var9 = class105.field2195.method331(1, -2055311549);
                    if (var9 == 1) {
                        class52.field1088[class181.field3638++] = var4;
                    }
                } else if (var7 == 2) {
                    class27.field504[class112.field2377++] = var4;
                    var5.field711 = class51.field1023;
                    int var10 = class105.field2195.method331(3, -2055311549);
                    var5.method223(false, var10, true);
                    int var11 = class105.field2195.method331(3, -2055311549);
                    var5.method223(false, var11, true);
                    int var12 = class105.field2195.method331(1, -2055311549);
                    if (var12 == 1) {
                        class52.field1088[class181.field3638++] = var4;
                    }
                } else if (var7 == 3) {
                    class168.field3434[class72.field1522++] = var4;
                }
            }
        }
        if (arg0 <= 122) {
            field2485 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
    public static void method809(boolean arg0) {
        field2497 = null;
        if (!arg0) {
            field2496 = null;
        }
        field2496 = null;
        field2489 = null;
        field2492 = null;
        field2493 = null;
        field2485 = null;
        field2488 = null;
        field2483 = null;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)V")
    public static final void method810(int arg0, int arg1) {
        field2501++;
        for (class17 var2 = (class17) class7.field141.method468(1); var2 != null; var2 = (class17) class7.field141.method471(-4984)) {
            if ((var2.field1950 >> 48 & 0xFFFFL) == (long) arg0) {
                var2.method630(29);
            }
        }
        if (arg1 > -65) {
            field2504 = 38;
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(B)V")
    public static final void method811(byte arg0) {
        class194.method1295((byte) 79, field2492);
        field2490++;
        class209.field4072++;
        if (class87.field1896 && class52.field1087) {
            int var1 = class22.field394;
            int var2 = class75.field1555;
            int var3 = var1 - class162.field3291;
            if (var3 < class142.field2918) {
                var3 = class142.field2918;
            }
            if (var3 + field2492.field1746 > class142.field2918 + class129.field2692.field1746) {
                var3 = class142.field2918 + class129.field2692.field1746 - field2492.field1746;
            }
            int var4 = field2492.field1716;
            if (arg0 != -120) {
                method808(-75);
            }
            int var5 = var2 - class133.field2769;
            int var6 = var3 + class129.field2692.field1781 - class142.field2918;
            if (class88.field1908 > var5) {
                var5 = class88.field1908;
            }
            int var7 = var3 - class14.field249;
            if (var5 + field2492.field1815 > class88.field1908 + class129.field2692.field1815) {
                var5 = class88.field1908 + class129.field2692.field1815 - field2492.field1815;
            }
            int var8 = var5 - class103.field2158;
            int var9 = var5 + class129.field2692.field1747 - class88.field1908;
            if (class209.field4072 > field2492.field1852 && (var4 < var7 || -var4 > var7 || var8 > var4 || -var4 > var8)) {
                class27.field490 = true;
            }
            if (field2492.field1799 != null && class27.field490) {
                class118 var10 = new class118();
                var10.field2500 = field2492;
                var10.field2495 = var6;
                var10.field2487 = var9;
                var10.field2502 = field2492.field1799;
                class64.method458((byte) -78, var10);
            }
            if (class117.field2476 == 0) {
                if (class27.field490) {
                    if (field2492.field1786 != null) {
                        class118 var11 = new class118();
                        var11.field2502 = field2492.field1786;
                        var11.field2495 = var6;
                        var11.field2484 = class131.field2732;
                        var11.field2500 = field2492;
                        var11.field2487 = var9;
                        class64.method458((byte) -94, var11);
                    }
                    if (class131.field2732 != null && class141.method923((byte) 125, field2492) != null) {
                        class141.field2896.method326(104, 209);
                        class141.field2896.method355(field2492.field1758, (byte) 89);
                        class124.field2586++;
                        class141.field2896.method386((byte) 104, class131.field2732.field1782);
                        class141.field2896.method341(field2492.field1782, 123);
                        class141.field2896.method355(class131.field2732.field1758, (byte) 118);
                    }
                } else if ((class172.field3487 == 1 || class116.method800(class184.field3678 - 1, (byte) -51)) && class184.field3678 > 2) {
                    class27.method161(arg0 + 120);
                } else if (class184.field3678 > 0) {
                    class77.method536(-104, class184.field3678 - 1);
                }
                field2492 = null;
            }
        } else if (class209.field4072 > 1) {
            field2492 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lu;ILu;)V")
    public static final void method812(class184 arg0, int arg1, class184 arg2) {
        if (arg1 == 1) {
            field2491++;
            class185.field3702 = arg2;
            class68.field1431 = arg0;
        }
    }
}
