import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class52 {

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "B")
    public byte field768 = 0;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "B")
    public byte field759;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "B")
    public byte field749;

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "S")
    public short field762;

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "S")
    public short field767;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "Lap;")
    public static class310 field753 = new class310(5, 6);

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "Lmo;")
    public static class336 field760 = new class336(8);

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "B")
    public byte field751;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "B")
    public byte field754;

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "B")
    public byte field765;

    @OriginalMember(owner = "client!wr", name = "A", descriptor = "B")
    public byte field773;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "Ldg;")
    public class131 field763;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "Lro;")
    public class174 field748;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "Lip;")
    public class371 field755;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "Lip;")
    public class371 field756;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "Lem;")
    public class390 field758;

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "Lpa;")
    public class404 field766;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "La;")
    public class421 field752;

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "La;")
    public class421 field772;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "Lwr;")
    public class52 field757;

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "S")
    public short field771;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "Z")
    public boolean field750;

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "Z")
    public boolean field764;

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "Z")
    public boolean field769;

    static {
        new class151("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
        new class151("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lvc;IILde;III[[[B[I[I[I[I[IIBIIZ)V", line = 4)
    public static final void method493(class89 arg0, int arg1, int arg2, class257 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class340.field4702 = arg0;
        class105.field1472 = arg1;
        class379.field5217 = arg3;
        class296.field4181 = class340.field4702.method403() > 0;
        class409.field5607 = arg4 >> class380.field5232;
        class54.field811 = arg6 >> class380.field5232;
        class200.field2966 = arg4;
        class385.field5280 = arg6;
        class371.field5106 = arg5;
        class316.field4461 = class409.field5607 - class4.field30;
        if (class316.field4461 < 0) {
            class68.field995 = -class316.field4461;
            class316.field4461 = 0;
        } else {
            class68.field995 = 0;
        }
        client.field877 = class54.field811 - class4.field30;
        if (client.field877 < 0) {
            class208.field3051 = -client.field877;
            client.field877 = 0;
        } else {
            class208.field3051 = 0;
        }
        class106.field1497 = class409.field5607 + class4.field30;
        if (class106.field1497 > class310.field4401) {
            class106.field1497 = class310.field4401;
        }
        class380.field5224 = class54.field811 + class4.field30;
        if (class380.field5224 > class97.field1374) {
            class380.field5224 = class97.field1374;
        }
        for (int var18 = 0; var18 < class4.field30 + class4.field30 + 2; var18++) {
            for (int var23 = 0; var23 < class4.field30 + class4.field30 + 2; var23++) {
                int var24 = class409.field5607 + var18 - class4.field30;
                int var25 = class54.field811 + var23 - class4.field30;
                if (var24 >= 0 && var25 >= 0 && var24 < class310.field4401 && var25 < class97.field1374) {
                    int var26 = var24 << class380.field5232;
                    int var27 = var25 << class380.field5232;
                    int var28 = class190.field2858[class190.field2858.length - 1].method591(var24, var25) - 1000;
                    int var29 = class427.field5960 == null ? class190.field2858[0].method591(var24, var25) + class47.field719 : class427.field5960[0].method591(var24, var25) + class47.field719;
                    class399.field5480[var18][var23] = class340.field4702.method364(var26, var28, var27, var26, var29, var27);
                } else {
                    class399.field5480[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class4.field30 + class4.field30 + 1; var19++) {
            for (int var22 = 0; var22 < class4.field30 + class4.field30 + 1; var22++) {
                class154.field2129[var19][var22] = class399.field5480[var19][var22] || class399.field5480[var19 + 1][var22] || class399.field5480[var19][var22 + 1] || class399.field5480[var19 + 1][var22 + 1];
            }
        }
        class295.field4173 = arg8;
        class112.field1575 = arg9;
        class448.field6380 = arg10;
        class24.field258 = arg11;
        class95.field1339 = arg12;
        class450.method2719();
        class183.method1307(23952);
        for (class309 var20 = (class309) class280.field4024.method1763((byte) -118); var20 != null; var20 = (class309) class280.field4024.method1767(true)) {
            var20.method2003(1);
            class305.method1963(126, var20);
        }
        if (class296.field4181) {
            for (int var21 = 0; var21 < class237.field3467; var21++) {
                class357.field4906[var21].method733(arg1, (byte) 63, arg17);
            }
        }
        if (arg2 > 1) {
            class340.field4702.method391(0);
            if (class291.field4124 == null || class291.field4124 instanceof class386) {
                class291.field4124 = new class126();
            }
        } else if (class291.field4124 == null || class291.field4124 instanceof class126) {
            class291.field4124 = new class386();
        }
        class291.field4124.method138(arg2, (byte) -63);
        class291.field4124.method136(-23413);
        if (class267.field3862 != null) {
            class484.method2859(true);
            class291.field4124.method142((byte) -83, 22);
            class36.method218(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class291.field4124.method136(-23413);
            class291.field4124.method142((byte) -83, 23);
            class484.method2859(false);
        }
        class36.method218(arg2, arg7, arg13, arg14, arg15, arg16);
        class291.field4124.method136(-23413);
        class291.field4124.method132(true);
        class291.field4124.method136(-23413);
        if (arg2 > 1) {
            class340.field4702.method314(0);
        }
        class340.field4702.method439(0, (class104[]) null);
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(III)V", line = 158)
    public class52(int arg0, int arg1, int arg2) {
        this.field749 = this.field759 = (byte) arg0;
        this.field762 = (short) arg1;
        this.field767 = (short) arg2;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V", line = 169)
    public static void method494(int arg0) {
        field753 = null;
        field760 = null;
        if (arg0 != 0) {
            field753 = null;
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V", line = 182)
    public final void method495(int arg0) {
        while (this.field763 != null) {
            class131 var2 = this.field763.field1796;
            this.field763.method979((byte) 58);
            this.field763 = var2;
        }
        field761++;
        if (arg0 < 100) {
            this.field769 = true;
        }
        this.field768 = 0;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILwg;Z)V", line = 214)
    public static final void method496(int arg0, class361 arg1, boolean arg2) {
        field770++;
        if (class303.field4310 >= 400) {
            return;
        }
        class37 var3 = arg1.field4952;
        if (var3.field434 != null) {
            var3 = var3.method232(class416.field5691, -1);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field432) {
            return;
        }
        if (arg0 != 0) {
            field760 = null;
        }
        String var4 = var3.field415;
        if (var3.field457 != 0) {
            String var5 = class350.field4825 == class35.field378 ? class284.field4064.method1078(class66.field967, arg0 ^ 0x64) : class390.field5394.method1078(class66.field967, 100);
            var4 = var4 + class332.method2092(var3.field457, class262.field3781.field522, (byte) -100) + " (" + var5 + var3.field457 + ")";
        }
        if (!class450.field6405) {
            if (!arg2) {
                String[] var7 = var3.field425;
                if (class357.field4935) {
                    var7 = class196.method1367(var7, 31626);
                }
                if (var7 != null) {
                    for (int var8 = 4; var8 >= 0; var8--) {
                        if (var7[var8] != null && (class6.field42 != class35.field378 || !var7[var8].equalsIgnoreCase(class404.field5533.method1078(class66.field967, 100)))) {
                            byte var9 = 0;
                            int var10 = class161.field2332;
                            if (var8 == 0) {
                                var9 = 8;
                            }
                            if (var8 == 1) {
                                var9 = 9;
                            }
                            if (var8 == 2) {
                                var9 = 50;
                            }
                            if (var8 == 3) {
                                var9 = 30;
                            }
                            if (var8 == 4) {
                                var9 = 46;
                            }
                            if (var3.field411 == var8) {
                                var10 = var3.field409;
                            }
                            if (var3.field453 == var8) {
                                var10 = var3.field464;
                            }
                            class2.field13++;
                            class19.method140(false, (byte) 121, "<col=ffff00>" + var4, true, var7[var8], 0, (long) arg1.field5751, var9, 0, -1, var10);
                        }
                    }
                }
                if (class6.field42 == class35.field378 && var7 != null) {
                    for (int var11 = 4; var11 >= 0; var11--) {
                        if (var7[var11] != null && var7[var11].equalsIgnoreCase(class404.field5533.method1078(class66.field967, 100))) {
                            short var12 = 0;
                            if (var3.field457 > class262.field3781.field522) {
                                var12 = 2000;
                            }
                            short var13 = 0;
                            if (var11 == 0) {
                                var13 = 8;
                            }
                            if (var11 == 1) {
                                var13 = 9;
                            }
                            if (var11 == 2) {
                                var13 = 50;
                            }
                            if (var11 == 3) {
                                var13 = 30;
                            }
                            if (var11 == 4) {
                                var13 = 46;
                            }
                            if (var13 != 0) {
                                var13 += var12;
                            }
                            class433.field6122++;
                            class19.method140(false, (byte) -120, "<col=ffff00>" + var4, true, var7[var11], 0, (long) arg1.field5751, var13, 0, -1, var3.field465);
                        }
                    }
                }
            }
            class19.method140(arg2, (byte) -15, "<col=ffff00>" + var4, true, class439.field6232.method1078(class66.field967, 100), 0, (long) arg1.field5751, 1011, 0, -1, class476.field6747);
            class305.field4328++;
        } else if (!arg2) {
            class129 var6 = class132.field1809 == -1 ? null : class422.field5847.method1635(class132.field1809, false);
            if ((class182.field2751 & 0x2) != 0) {
                if (var6 == null || var3.method228(class132.field1809, 0, var6.field1765) != var6.field1765) {
                    class19.method140(false, (byte) 125, class352.field4842 + " -> <col=ffff00>" + var4, true, class347.field4784, 0, (long) arg1.field5751, 18, 0, -1, class95.field1336);
                    class166.field2407++;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIBII)V", line = 389)
    public static final void method497(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field747++;
        class334 var5 = class352.method2172(arg4, 4, 16711935);
        var5.method2104(0);
        var5.field4636 = arg0;
        if (arg2 <= -117) {
            var5.field4635 = arg1;
            var5.field4648 = arg3;
        }
    }
}
