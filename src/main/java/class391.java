import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class391 {

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "Lng;")
    private class226 field5892 = new class226(16);

    @OriginalMember(owner = "client!tv", name = "i", descriptor = "Lic;")
    private class491 field5895;

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "J")
    public static long field5891 = -1L;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "Lgo;")
    public static class441 field5887 = new class441(14, 0, 4, 1);

    @OriginalMember(owner = "client!tv", name = "k", descriptor = "[I")
    public static int[] field5897;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!tv", name = "h", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!tv", name = "j", descriptor = "I")
    public static int field5896;

    static {
        new class475("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        field5897 = new int[32];
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILic;)V", line = 4)
    public static final void method2375(int arg0, class491 arg1) {
        field5890++;
        if (arg0 != -1520110140) {
            field5891 = -119L;
        }
        class381.field5779 = arg1;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V", line = 18)
    public final void method2376(int arg0) {
        class226 var2 = this.field5892;
        synchronized (this.field5892) {
            this.field5892.method1540(arg0 - 21271);
        }
        field5896++;
        if (arg0 != 21271) {
            this.method2377(34, 117);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(II)V", line = 33)
    public final void method2377(int arg0, int arg1) {
        field5893++;
        class226 var3 = this.field5892;
        synchronized (this.field5892) {
            this.field5892.method1534(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)V", line = 50)
    public static final void method2378(int arg0) {
        field5888++;
        class334.method2032(123, false);
        class119.field1797 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class234.field3482.length; var2++) {
            if (class57.field878[var2] != -1 && class234.field3482[var2] == null) {
                class234.field3482[var2] = class132.field2035.method2945(class57.field878[var2], 0, true);
                if (class234.field3482[var2] == null) {
                    class119.field1797++;
                    var1 = false;
                }
            }
            if (class424.field6364[var2] != -1 && class434.field6501[var2] == null) {
                class434.field6501[var2] = class132.field2035.method2933(0, arg0 - 26789, class424.field6364[var2], class41.field617[var2]);
                if (class434.field6501[var2] == null) {
                    class119.field1797++;
                    var1 = false;
                }
            }
            if (class480.field7048[var2] != -1 && class13.field165[var2] == null) {
                class13.field165[var2] = class132.field2035.method2945(class480.field7048[var2], 0, true);
                if (class13.field165[var2] == null) {
                    class119.field1797++;
                    var1 = false;
                }
            }
            if (class257.field3788[var2] != -1 && class169.field2510[var2] == null) {
                class169.field2510[var2] = class132.field2035.method2945(class257.field3788[var2], 0, true);
                if (class169.field2510[var2] == null) {
                    class119.field1797++;
                    var1 = false;
                }
            }
            if (class150.field2230 != null && class145.field2151[var2] == null && class150.field2230[var2] != -1) {
                class145.field2151[var2] = class132.field2035.method2933(0, arg0 - 26789, class150.field2230[var2], class41.field617[var2]);
                if (class145.field2151[var2] == null) {
                    var1 = false;
                    class119.field1797++;
                }
            }
        }
        if (class27.field284 == null) {
            if (class509.field7428 == null || !class277.field3994.method2948(class509.field7428.field1576 + "_staticelements", (byte) -128)) {
                class27.field284 = new class28(0);
            } else if (class277.field3994.method2925(4, class509.field7428.field1576 + "_staticelements")) {
                class27.field284 = class243.method1630((byte) 82, class509.field7428.field1576 + "_staticelements", class410.field6174, class277.field3994);
            } else {
                var1 = false;
                class119.field1797++;
            }
        }
        if (!var1) {
            class11.field143 = 1;
            return;
        }
        class37.field395 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class234.field3482.length; var4++) {
            byte[] var19 = class434.field6501[var4];
            if (var19 != null) {
                int var20 = (class331.field4689[var4] >> 8) * 64 - class68.field1038;
                int var21 = (class331.field4689[var4] & 0xFF) * 64 - class24.field259;
                if (class474.field6982 != 0) {
                    var20 = 10;
                    var21 = 10;
                }
                var3 &= class278.method1817(class30.field323, var20, var19, class182.field2661, -23, var21);
            }
            byte[] var22 = class169.field2510[var4];
            if (var22 != null) {
                int var23 = (class331.field4689[var4] >> 8) * 64 - class68.field1038;
                int var24 = (class331.field4689[var4] & 0xFF) * 64 - class24.field259;
                if (class474.field6982 != 0) {
                    var24 = 10;
                    var23 = 10;
                }
                var3 &= class278.method1817(class30.field323, var23, var22, class182.field2661, arg0 - 22, var24);
            }
        }
        if (!var3) {
            class11.field143 = 2;
            return;
        }
        if (class11.field143 != 0) {
            class183.method1254(60, class147.field2181, class237.field3490.method2838(false, class143.field2137) + "<br>(100%)", true);
        }
        class110.method675(19315);
        class426.method2554(arg0 ^ 0xFFFFFF86);
        boolean var5 = false;
        if (class348.field5015.method1107() && class426.field6401.field997) {
            for (int var6 = 0; var6 < class234.field3482.length; var6++) {
                if (class169.field2510[var6] != null || class13.field165[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class426.field6401.field1019) {
            var7 = class4.field53[class207.field2958];
        } else {
            var7 = class308.field4429[class207.field2958];
        }
        if (class348.field5015.method1075()) {
            var7++;
        }
        class47.method292(7, 4, class30.field323, class182.field2661, var7, var5, class348.field5015.method1056() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class434.field6500[var8].method863(arg0 - 107);
        }
        class486.method2887((byte) 119);
        class272.method1788(false, 22079);
        class277.method1809((byte) 91);
        class323.field4623 = null;
        class110.method675(19315);
        System.gc();
        class334.method2032(arg0 + 116, true);
        class74.method422(0);
        class226.field3324 = class426.field6401.method393(class170.field2529, arg0 ^ 0xFFFFFFFE);
        class265.field3885 = class426.field6401.field997;
        class199.field2881 = class34.field363 >= 96;
        class86.field1325 = class426.field6401.method392(-2, class170.field2529);
        class147.field2182 = !class426.field6401.field1020;
        class68.field1037 = class426.field6401.method2532(arg0 ^ 0xFFFFFFFE, class170.field2529) ? -1 : class271.field3942;
        class34.field356 = class426.field6401.field989;
        class366.field5599 = class170.field2529 == 1 || class426.field6401.field998;
        class489.field7212 = new class314(4, class30.field323, class182.field2661, false);
        if (class474.field6982 == 0) {
            class230.method1583(class489.field7212, class234.field3482, (byte) 96);
        } else {
            class24.method155(class489.field7212, -1811030303, class234.field3482);
        }
        class527.method3111(class182.field2661 >> 4, class30.field323 >> 4, -109);
        class453.method2724(28);
        if (var5) {
            class158.method1008(true);
            class139.field2088 = new class314(1, class30.field323, class182.field2661, true);
            if (class474.field6982 == 0) {
                class230.method1583(class139.field2088, class13.field165, (byte) 96);
                class334.method2032(113, true);
            } else {
                class24.method155(class139.field2088, -1811030303, class13.field165);
                class334.method2032(112, true);
            }
            class139.field2088.method1643(true, 0, class489.field7212.field3587[0]);
            class139.field2088.method1633(class348.field5015, true, null, null);
            class158.method1008(false);
        }
        class489.field7212.method1633(class348.field5015, true, var5 ? class139.field2088.field3587 : null, class434.field6500);
        if (class474.field6982 == 0) {
            class334.method2032(arg0 - 101, true);
            class392.method2383(class489.field7212, class434.field6501, (byte) -120);
            if (class145.field2151 != null) {
                class451.method2719((byte) 29);
            }
        } else {
            class334.method2032(113, true);
            class437.method2628(class489.field7212, (byte) 102, class434.field6501);
        }
        class426.method2554(-71);
        class334.method2032(115, true);
        class489.field7212.method1641(arg0 - 10763, class348.field5015, null, var5 ? class31.field335[0] : null);
        class489.field7212.method1956(class348.field5015, (byte) 0);
        class334.method2032(-66, true);
        if (var5) {
            class158.method1008(true);
            class334.method2032(-99, true);
            if (class474.field6982 == 0) {
                class392.method2383(class139.field2088, class169.field2510, (byte) -65);
            } else {
                class437.method2628(class139.field2088, (byte) -21, class169.field2510);
            }
            class426.method2554(arg0 + 128);
            class334.method2032(102, true);
            class139.field2088.method1641(-10764, class348.field5015, class307.field4415[0], null);
            class139.field2088.method1956(class348.field5015, (byte) 0);
            class334.method2032(123, true);
            class158.method1008(false);
        }
        class403.method2428(false);
        int var9 = class489.field7212.field4486;
        if (var9 > class79.field1192) {
            var9 = class79.field1192;
        }
        if ((class79.field1192 + arg0) > var9) {
            var9 = class79.field1192 - 1;
        }
        if (class426.field6401.method2532(1, class170.field2529)) {
            class421.method2536(0);
        } else {
            class421.method2536(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class30.field323; var17++) {
                for (int var18 = 0; var18 < class182.field2661; var18++) {
                    class326.method2015((byte) 64, var10, var17, var18);
                }
            }
        }
        class147.method969(102);
        class110.method675(19315);
        class8.method45((byte) -86);
        class426.method2554(127);
        class23.field236 = false;
        class258.method1716(75);
        if (class214.field3119 != null && class90.field1361 != null && class193.field2832 == 25) {
            class291.method1861((byte) -104, class487.field7195);
            class233.field3460++;
            class356.field5471.method1415(1057001181, (byte) -118);
        }
        if (class474.field6982 == 0) {
            int var11 = (class116.field1744 - (class30.field323 >> 4)) / 8;
            int var12 = ((class30.field323 >> 4) + class116.field1744) / 8;
            int var13 = (class210.field3062 - (class182.field2661 >> 4)) / 8;
            int var14 = (class210.field3062 + (class182.field2661 >> 4)) / 8;
            for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                    if (var15 < var11 || var12 < var15 || var16 < var13 || var16 > var14) {
                        class132.field2035.method2930("m" + var15 + "_" + var16, (byte) 70);
                        class132.field2035.method2930("l" + var15 + "_" + var16, (byte) -127);
                    }
                }
            }
        }
        if (class193.field2832 == 28) {
            class11.method76(false, 10);
        } else {
            class11.method76(false, 30);
            if (class90.field1361 != null) {
                class291.method1861((byte) -104, class521.field7666);
            }
        }
        class87.method507(-65);
        class110.method675(19315);
        class457.method2742(0);
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)V", line = 506)
    public static void method2379(int arg0) {
        if (arg0 <= 112) {
            field5897 = null;
        }
        field5897 = null;
        field5887 = null;
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(II)Lbk;", line = 518)
    public final class253 method2380(int arg0, int arg1) {
        field5889++;
        class226 var3 = this.field5892;
        class253 var4;
        synchronized (this.field5892) {
            if (arg0 >= -30) {
                field5897 = null;
            }
            var4 = (class253) this.field5892.method1536((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5895.method2945(30, arg1, true);
        class253 var6 = new class253();
        if (var5 != null) {
            var6.method1703((byte) 117, new class209(var5));
        }
        class226 var7 = this.field5892;
        synchronized (this.field5892) {
            this.field5892.method1542(var6, (byte) 112, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)V", line = 567)
    public final void method2381(boolean arg0) {
        if (!arg0) {
            field5897 = null;
        }
        field5894++;
        class226 var2 = this.field5892;
        synchronized (this.field5892) {
            this.field5892.method1539(-107);
        }
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lai;ILic;)V", line = 582)
    public class391(class423 arg0, int arg1, class491 arg2) {
        this.field5895 = arg2;
        this.field5895.method2942(false, 30);
    }
}
