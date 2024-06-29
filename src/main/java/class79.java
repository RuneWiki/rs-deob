import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public abstract class class79 {

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "Lfg;")
    public static class83 field1129 = new class83("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "Luf;")
    public static class310 field1132 = new class310(109, 3);

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "Lfg;")
    public static class83 field1133 = new class83("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 7)
    public static void method576(int arg0) {
        field1129 = null;
        field1132 = null;
        if (arg0 != -121) {
            method576(-14);
        }
        field1133 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)V", line = 19)
    public static final void method577(boolean arg0) {
        field1130++;
        class270.method1545((byte) 110, false);
        class452.field6586 = 0;
        boolean var1 = arg0;
        for (int var2 = 0; var2 < class207.field2938.length; var2++) {
            if (class477.field6982[var2] != -1 && class207.field2938[var2] == null) {
                class207.field2938[var2] = class241.field3334.method1411(arg0, 0, class477.field6982[var2]);
                if (class207.field2938[var2] == null) {
                    var1 = false;
                    class452.field6586++;
                }
            }
            if (class234.field3249[var2] != -1 && class499.field7346[var2] == null) {
                class499.field7346[var2] = class241.field3334.method1399(class234.field3249[var2], class514.field7546[var2], 0, -1);
                if (class499.field7346[var2] == null) {
                    var1 = false;
                    class452.field6586++;
                }
            }
            if (class414.field6080[var2] != -1 && class274.field3721[var2] == null) {
                class274.field3721[var2] = class241.field3334.method1411(arg0, 0, class414.field6080[var2]);
                if (class274.field3721[var2] == null) {
                    class452.field6586++;
                    var1 = false;
                }
            }
            if (class292.field3916[var2] != -1 && class20.field215[var2] == null) {
                class20.field215[var2] = class241.field3334.method1411(true, 0, class292.field3916[var2]);
                if (class20.field215[var2] == null) {
                    class452.field6586++;
                    var1 = false;
                }
            }
            if (class13.field159 != null && class245.field3417[var2] == null && class13.field159[var2] != -1) {
                class245.field3417[var2] = class241.field3334.method1399(class13.field159[var2], class514.field7546[var2], 0, -1);
                if (class245.field3417[var2] == null) {
                    var1 = false;
                    class452.field6586++;
                }
            }
        }
        if (class13.field161 == null) {
            if (class14.field170 == null || !class87.field1193.method1406(class14.field170.field6296 + "_staticelements", 126)) {
                class13.field161 = new class435(0);
            } else if (class87.field1193.method1400(-77, class14.field170.field6296 + "_staticelements")) {
                class13.field161 = class210.method1275((byte) -83, class14.field170.field6296 + "_staticelements", class123.field1689, class87.field1193);
            } else {
                var1 = false;
                class452.field6586++;
            }
        }
        if (!var1) {
            class65.field895 = 1;
            return;
        }
        class388.field5453 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class207.field2938.length; var4++) {
            byte[] var19 = class499.field7346[var4];
            if (var19 != null) {
                int var20 = (class101.field1378[var4] >> 8) * 64 - class215.field3059;
                int var21 = (class101.field1378[var4] & 0xFF) * 64 - field1134;
                if (class65.field897 != 0) {
                    var20 = 10;
                    var21 = 10;
                }
                var3 &= class249.method1462(var19, var21, var20, !arg0, class232.field3217, class442.field6435);
            }
            byte[] var22 = class20.field215[var4];
            if (var22 != null) {
                int var23 = (class101.field1378[var4] >> 8) * 64 - class215.field3059;
                int var24 = (class101.field1378[var4] & 0xFF) * 64 - field1134;
                if (class65.field897 != 0) {
                    var23 = 10;
                    var24 = 10;
                }
                var3 &= class249.method1462(var22, var24, var23, !arg0, class232.field3217, class442.field6435);
            }
        }
        if (!var3) {
            class65.field895 = 2;
            return;
        }
        if (class65.field895 != 0) {
            class186.method1119(class117.field1579, class272.field3708.method590(class105.field1434, -22602) + "<br>(100%)", 0, true);
        }
        class503.method2959(!arg0);
        class193.method1169(-11544);
        boolean var5 = false;
        if (class418.field6109.method481() && class437.field6374.field4287) {
            for (int var6 = 0; var6 < class207.field2938.length; var6++) {
                if (class20.field215[var6] != null || class274.field3721[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class437.field6374.field4250) {
            var7 = class325.field4465[class348.field4772];
        } else {
            var7 = class123.field1688[class348.field4772];
        }
        if (class418.field6109.method470()) {
            var7++;
        }
        class290.method1657(7, 4, class442.field6435, class232.field3217, var7, var5, class418.field6109.method528() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class6.field64[var8].method2467((byte) 69);
        }
        class521.method3063(-32357);
        class331.method1838(1540, false);
        class120.method759((byte) 21);
        class325.field4462 = null;
        class503.method2959(false);
        System.gc();
        class270.method1545((byte) -21, true);
        class299.method1710((byte) 53);
        class281.field3790 = class437.field6374.method1765(class278.field3761, (byte) -101);
        class254.field3526 = class437.field6374.field4287;
        class448.field6479 = class463.field6730 >= 96;
        class455.field6645 = class437.field6374.method1763(class278.field3761, (byte) 82);
        class348.field4774 = !class437.field6374.field4283;
        class222.field3094 = class437.field6374.method560((byte) 115, class278.field3761) ? -1 : class304.field4173;
        class454.field6633 = class278.field3761 == 1 || class437.field6374.field4251;
        class261.field3587 = class437.field6374.field4286;
        class225.field3173 = new class341(4, class442.field6435, class232.field3217, false);
        if (class65.field897 == 0) {
            class95.method646((byte) -79, class207.field2938, class225.field3173);
        } else {
            class174.method1077(class207.field2938, class225.field3173, 8);
        }
        class329.method1834(class232.field3217 >> 4, class442.field6435 >> 4, 1);
        class382.method2195(11);
        if (var5) {
            class500.method2951(true);
            class360.field4926 = new class341(1, class442.field6435, class232.field3217, true);
            if (class65.field897 == 0) {
                class95.method646((byte) -79, class274.field3721, class360.field4926);
                class270.method1545((byte) 106, true);
            } else {
                class174.method1077(class274.field3721, class360.field4926, 8);
                class270.method1545((byte) -21, true);
            }
            class360.field4926.method3042((byte) 16, 0, class225.field3173.field7641[0]);
            class360.field4926.method3051(null, null, class418.field6109, -55);
            class500.method2951(false);
        }
        class225.field3173.method3051(var5 ? class360.field4926.field7641 : null, class6.field64, class418.field6109, -86);
        if (class65.field897 == 0) {
            class270.method1545((byte) 105, true);
            class244.method1445((byte) 48, class225.field3173, class499.field7346);
            if (class245.field3417 != null) {
                class272.method1551(4267);
            }
        } else {
            class270.method1545((byte) -14, true);
            class20.method148(true, class499.field7346, class225.field3173);
        }
        class193.method1169(-11544);
        class270.method1545((byte) -47, true);
        class225.field3173.method3045(class418.field6109, 27881, var5 ? class364.field5058[0] : null, null);
        class225.field3173.method1903(class418.field6109, false);
        class270.method1545((byte) 127, true);
        if (var5) {
            class500.method2951(true);
            class270.method1545((byte) 123, true);
            if (class65.field897 == 0) {
                class244.method1445((byte) 99, class360.field4926, class20.field215);
            } else {
                class20.method148(true, class20.field215, class360.field4926);
            }
            class193.method1169(-11544);
            class270.method1545((byte) -18, true);
            class360.field4926.method3045(class418.field6109, 27881, null, class19.field195[0]);
            class360.field4926.method1903(class418.field6109, !arg0);
            class270.method1545((byte) -63, true);
            class500.method2951(false);
        }
        class403.method2336(83);
        int var9 = class225.field3173.field4701;
        if (class400.field5571 < var9) {
            var9 = class400.field5571;
        }
        if (var9 < class400.field5571 - 1) {
            var9 = class400.field5571 - 1;
        }
        if (class437.field6374.method560((byte) 115, class278.field3761)) {
            class428.method2563(0);
        } else {
            class428.method2563(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class442.field6435; var17++) {
                for (int var18 = 0; var18 < class232.field3217; var18++) {
                    class469.method2754(var10, var17, var18, (byte) 127);
                }
            }
        }
        class83.method591((byte) -109);
        class503.method2959(false);
        class244.method1446((byte) -124);
        class193.method1169(-11544);
        class428.field6250 = false;
        class448.method2642((byte) -73);
        if (class140.field1993 != null && class117.field1578 != null && class137.field1958 == 25) {
            class41.field564++;
            class356.method1978((byte) 34, class142.field2030);
            class244.field3395.method2074(false, 1057001181);
        }
        if (class65.field897 == 0) {
            int var11 = (class446.field6464 - (class442.field6435 >> 4)) / 8;
            int var12 = ((class442.field6435 >> 4) + class446.field6464) / 8;
            int var13 = (class297.field4107 - (class232.field3217 >> 4)) / 8;
            int var14 = ((class232.field3217 >> 4) + class297.field4107) / 8;
            for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                    if (var11 > var15 || var15 > var12 || var13 > var16 || var14 < var16) {
                        class241.field3334.method1392("m" + var15 + "_" + var16, -108);
                        class241.field3334.method1392("l" + var15 + "_" + var16, -51);
                    }
                }
            }
        }
        if (class137.field1958 == 28) {
            class26.method186(10, 8);
        } else {
            class26.method186(30, 8);
            if (class117.field1578 != null) {
                class356.method1978((byte) 82, class61.field820);
            }
        }
        class314.method1776((byte) -125);
        class503.method2959(false);
        class109.method704(-7033);
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V", line = 473)
    public static final void method578(int arg0) {
        class26.method186(25, 8);
        field1131++;
        if (arg0 <= -99) {
            class383.method2198(-21963);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lsq;B)Lsq;")
    public abstract class117 method579(class117 arg0, byte arg1);
}
