import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class216 {

    @OriginalMember(owner = "client!km", name = "e", descriptor = "Lhu;")
    private class76 field2905 = new class76(64);

    @OriginalMember(owner = "client!km", name = "c", descriptor = "Lr;")
    private class110 field2903;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "Lwh;")
    public static class90 field2910 = new class90(0, 0);

    @OriginalMember(owner = "client!km", name = "l", descriptor = "F")
    public static float field2912;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public static int field2911;

    static {
        new class206("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field2912 = 0.0F;
        field2913 = -1;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)V", line = 5)
    public final void method1222(int arg0, int arg1) {
        class76 var3 = this.field2905;
        synchronized (this.field2905) {
            this.field2905.method496(arg1, -60);
            if (arg0 != 8082) {
                field2912 = -0.012318134F;
            }
        }
        field2907++;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)I", line = 20)
    public static final int method1223(int arg0) {
        field2908++;
        return arg0 == 8173 ? class460.field6234 : -91;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(II)V", line = 37)
    public final void method1224(int arg0, int arg1) {
        if (arg1 != 10) {
            field2910 = null;
        }
        class76 var3 = this.field2905;
        synchronized (this.field2905) {
            this.field2905.method495(arg1 ^ 0xFFFFFFA4);
            this.field2905 = new class76(arg0);
        }
        field2909++;
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Ldn;ILr;)V", line = 54)
    public class216(class329 arg0, int arg1, class110 arg2) {
        this.field2903 = arg2;
        if (this.field2903 != null) {
            int var4 = this.field2903.method705((byte) -99) - 1;
            this.field2903.method694(var4, (byte) 119);
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V", line = 78)
    public final void method1225(int arg0) {
        class76 var2 = this.field2905;
        synchronized (this.field2905) {
            this.field2905.method502(0);
        }
        if (arg0 == 10) {
            field2901++;
        }
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(II)Lla;", line = 93)
    public final class288 method1226(int arg0, int arg1) {
        field2902++;
        int var3 = -56 % ((-arg1 - 23) / 50);
        class76 var4 = this.field2905;
        class288 var5;
        synchronized (this.field2905) {
            var5 = (class288) this.field2905.method493((byte) 19, (long) arg0);
        }
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = this.field2903.method702((byte) 63, class311.method1711(23045, arg0), class405.method2446(14776, arg0));
        class288 var7 = new class288();
        if (var6 != null) {
            var7.method1624(new class32(var6), 15656);
        }
        class76 var8 = this.field2905;
        synchronized (this.field2905) {
            this.field2905.method505((long) arg0, var7, 44);
            return var7;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V", line = 122)
    public final void method1227(boolean arg0) {
        field2906++;
        class76 var2 = this.field2905;
        synchronized (this.field2905) {
            this.field2905.method495(-88);
            if (!arg0) {
                field2912 = 1.3244427F;
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V", line = 135)
    public static void method1228(byte arg0) {
        if (arg0 != -93) {
            method1229(false, (class487) null, 120);
        }
        field2910 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZLnh;I)V", line = 145)
    public static final void method1229(boolean arg0, class487 arg1, int arg2) {
        field2904++;
        if (class475.field6540 >= 400 || class233.field3103 == arg1) {
            return;
        }
        String var9;
        if (~arg1.field6750 == arg2) {
            boolean var3 = true;
            if (class233.field3103.field6771 != -1 && arg1.field6771 != -1) {
                int var4 = arg1.field6757 >= class233.field3103.field6757 ? arg1.field6757 : class233.field3103.field6757;
                int var5 = arg1.field6771 > class233.field3103.field6771 ? class233.field3103.field6771 : arg1.field6771;
                int var6 = var4 * 10 / 100 + var5 + 5;
                int var7 = class233.field3103.field6757 - arg1.field6757;
                if (var7 < 0) {
                    var7 = -var7;
                }
                if (var7 > var6) {
                    var3 = false;
                }
            }
            String var8 = class343.field4601 == class243.field3233 ? class281.field3788.method1176(class110.field1676, (byte) -100) : class447.field6083.method1176(class110.field1676, (byte) -122);
            if (arg1.field6748 <= arg1.field6757) {
                var9 = arg1.method2835(arg2 - 20616, true) + (var3 ? class152.method898(64512, class233.field3103.field6757, arg1.field6757) : "<col=ffffff>") + " (" + var8 + arg1.field6757 + ")";
            } else {
                var9 = arg1.method2835(-20617, true) + (var3 ? class152.method898(64512, class233.field3103.field6757, arg1.field6757) : "<col=ffffff>") + " (" + var8 + arg1.field6757 + "+" + (arg1.field6748 - arg1.field6757) + ")";
            }
        } else {
            var9 = arg1.method2835(-20617, true) + " (" + class268.field3582.method1176(class110.field1676, (byte) -127) + arg1.field6750 + ")";
        }
        if (class289.field3899) {
            if (!arg0 && (class456.field6187 & 0x8) != 0) {
                class402.method2436(-1, true, 0, false, (byte) 97, class491.field6867, 0, 60, class31.field407 + " -> <col=ffffff>" + var9, class297.field3974, (long) arg1.field1163);
                class403.field5531++;
            }
        } else if (arg0) {
            class402.method2436(0, false, 0, true, (byte) 115, "<col=cccccc>" + var9, 0, -1, "", -1, 0L);
        } else {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (class134.field1950[var10] != null) {
                    short var12 = 0;
                    if (class404.field5538 == class343.field4601 && class134.field1950[var10].equalsIgnoreCase(class400.field5507.method1176(class110.field1676, (byte) -110))) {
                        if (class233.field3103.field6757 < arg1.field6757) {
                            var12 = 2000;
                        }
                        if (class233.field3103.field6773 != 0 && arg1.field6773 != 0) {
                            if (class233.field3103.field6773 == arg1.field6773) {
                                var12 = 2000;
                            } else {
                                var12 = 0;
                            }
                        }
                    } else if (class160.field2221[var10]) {
                        var12 = 2000;
                    }
                    short var13 = (short) (class45.field620[var10] + var12);
                    int var14 = class78.field1056[var10] == -1 ? class491.field6868 : class78.field1056[var10];
                    class402.method2436(-1, true, 0, false, (byte) 93, class134.field1950[var10], 0, var13, "<col=ffffff>" + var9, var14, (long) arg1.field1163);
                    class356.field4908++;
                }
            }
        }
        if (arg0) {
            return;
        }
        for (class395 var11 = (class395) class450.field6121.method652((byte) 37); var11 != null; var11 = (class395) class450.field6121.method653(15)) {
            if (var11.field5469 == 22) {
                var11.field5475 = "<col=ffffff>" + var9;
                return;
            }
        }
    }
}
