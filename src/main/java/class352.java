import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class352 extends class401 {

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public int field4681;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public int field4682;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "Lmw;")
    public class455 field4686;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "Llh;")
    public class487 field4685;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public static final void method2028(byte arg0) {
        class650.method3662(false, -123);
        field4684++;
        class456.field6336 = 0;
        boolean var1 = true;
        if (arg0 < 57) {
            return;
        }
        for (int var2 = 0; var2 < class479.field6606.length; var2++) {
            if (class314.field4342[var2] != -1 && class479.field6606[var2] == null) {
                class479.field6606[var2] = class609.field8458.method3654(-15615, class314.field4342[var2], 0);
                if (class479.field6606[var2] == null) {
                    var1 = false;
                    class456.field6336++;
                }
            }
            if (class180.field2611[var2] != -1 && class518.field7052[var2] == null) {
                class518.field7052[var2] = class609.field8458.method3634(23323, 0, class416.field5870[var2], class180.field2611[var2]);
                if (class518.field7052[var2] == null) {
                    var1 = false;
                    class456.field6336++;
                }
            }
            if (class699.field9915[var2] != -1 && class666.field9327[var2] == null) {
                class666.field9327[var2] = class609.field8458.method3654(-15615, class699.field9915[var2], 0);
                if (class666.field9327[var2] == null) {
                    var1 = false;
                    class456.field6336++;
                }
            }
            if (class519.field7078[var2] != -1 && class372.field5015[var2] == null) {
                class372.field5015[var2] = class609.field8458.method3654(-15615, class519.field7078[var2], 0);
                if (class372.field5015[var2] == null) {
                    class456.field6336++;
                    var1 = false;
                }
            }
            if (class416.field5868 != null && class306.field4223[var2] == null && class416.field5868[var2] != -1) {
                class306.field4223[var2] = class609.field8458.method3634(23323, 0, class416.field5870[var2], class416.field5868[var2]);
                if (class306.field4223[var2] == null) {
                    class456.field6336++;
                    var1 = false;
                }
            }
        }
        if (class451.field6190 == null) {
            if (class531.field7183 == null || !class114.field1580.method3624((byte) 101, class531.field7183.field1557 + "_staticelements")) {
                class451.field6190 = new class495(0);
            } else if (class114.field1580.method3625(class531.field7183.field1557 + "_staticelements", -1)) {
                class451.field6190 = class543.method3067(class114.field1580, class21.field239, (byte) -40, class531.field7183.field1557 + "_staticelements");
            } else {
                class456.field6336++;
                var1 = false;
            }
        }
        if (!var1) {
            class432.field6029 = 1;
            return;
        }
        class669.field9394 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class479.field6606.length; var4++) {
            byte[] var21 = class518.field7052[var4];
            if (var21 != null) {
                int var22 = (class111.field1540[var4] >> 8) * 64 - class498.field6774;
                int var23 = (class111.field1540[var4] & 0xFF) * 64 - class613.field8555;
                if (class273.field3739 != 0) {
                    var23 = 10;
                    var22 = 10;
                }
                var3 &= class403.method2354(var23, class401.field5620, class257.field3508, var21, var22, 1024);
            }
            byte[] var24 = class372.field5015[var4];
            if (var24 != null) {
                int var25 = (class111.field1540[var4] >> 8) * 64 - class498.field6774;
                int var26 = (class111.field1540[var4] & 0xFF) * 64 - class613.field8555;
                if (class273.field3739 != 0) {
                    var26 = 10;
                    var25 = 10;
                }
                var3 &= class403.method2354(var26, class401.field5620, class257.field3508, var24, var25, 1024);
            }
        }
        if (!var3) {
            class432.field6029 = 2;
            return;
        }
        if (class432.field6029 != 0) {
            class124.method890(class65.field800.method555(class697.field9900, true) + "<br>(100%)", class273.field3741, -1, true, class334.field4506, class136.field1916);
        }
        class466.method2634(5);
        class63.method526(false);
        boolean var5 = false;
        if (class334.field4506.method88() && class366.field4875.field9353) {
            for (int var6 = 0; var6 < class479.field6606.length; var6++) {
                if (class372.field5015[var6] != null || class666.field9327[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class366.field4875.field9348) {
            var7 = class334.field4498[class368.field4965];
        } else {
            var7 = class113.field1565[class368.field4965];
        }
        if (class334.field4506.method127()) {
            var7++;
        }
        class444.method2518(class334.field4506, class686.field9778, 9, 4, class401.field5620, class257.field3508, var7, var5, class334.field4506.method203() > 0);
        class323.method1937(class597.field8341);
        if (class597.field8341 == 0) {
            class103.method752(null);
        } else {
            class103.method752(class499.field6781);
        }
        for (int var8 = 0; var8 < 4; var8++) {
            class151.field2218[var8].method2183(1);
        }
        class509.method2908((byte) 41);
        class216.method1388(false, (byte) -59);
        class606.method3406((byte) 87);
        class261.field3549 = null;
        class14.field147 = false;
        class466.method2634(5);
        System.gc();
        class650.method3662(true, -125);
        class491.method2780(-88);
        class332.field4479 = class366.field4875.method3770(class503.field6917, true);
        class316.field4353 = class651.field9037 >= 96;
        class286.field3937 = class366.field4875.field9353;
        class588.field8262 = class366.field4875.method3766(class503.field6917, (byte) -83);
        class69.field928 = !class366.field4875.field9366;
        class69.field933 = class366.field4875.method537(class503.field6917, 0) ? -1 : class540.field7305;
        class20.field235 = class7.method24((byte) 98, class503.field6917) || class366.field4875.field9356;
        class704.field9953 = class366.field4875.field9344;
        class138.field1953 = new class630(4, class401.field5620, class257.field3508, false);
        if (class273.field3739 == 0) {
            class162.method1142(class479.field6606, class138.field1953, (byte) -72);
        } else {
            class308.method1872(class479.field6606, 110, class138.field1953);
        }
        class320.method1923(class257.field3508 >> 4, 112, class401.field5620 >> 4);
        class116.method826(2000);
        if (var5) {
            class503.method2881(true);
            class698.field9911 = new class630(1, class401.field5620, class257.field3508, true);
            if (class273.field3739 == 0) {
                class162.method1142(class666.field9327, class698.field9911, (byte) -72);
                class650.method3662(true, -122);
            } else {
                class308.method1872(class666.field9327, 61, class698.field9911);
                class650.method3662(true, -123);
            }
            class698.field9911.method1772(0, class138.field1953.field3989[0], -65);
            class698.field9911.method1780(null, null, (byte) -64, class334.field4506);
            class503.method2881(false);
        }
        class138.field1953.method1780(class151.field2218, var5 ? class698.field9911.field3989 : null, (byte) -64, class334.field4506);
        if (class273.field3739 == 0) {
            class650.method3662(true, -125);
            class287.method1765(121, class518.field7052, class138.field1953);
            if (class306.field4223 != null) {
                class308.method1866((byte) 81);
            }
        } else {
            class650.method3662(true, -125);
            class431.method2475(class138.field1953, class518.field7052, 7);
        }
        class63.method526(false);
        if (class651.field9037 < 96) {
            class255.method1570(569692233);
        }
        class650.method3662(true, -127);
        class138.field1953.method1773((byte) -103, null, var5 ? class52.field606[0] : null, class334.field4506);
        class138.field1953.method3528(class334.field4506, (byte) -116, false);
        class650.method3662(true, -122);
        if (var5) {
            class503.method2881(true);
            class650.method3662(true, -122);
            if (class273.field3739 == 0) {
                class287.method1765(-122, class372.field5015, class698.field9911);
            } else {
                class431.method2475(class698.field9911, class372.field5015, 7);
            }
            class63.method526(false);
            class650.method3662(true, -123);
            class698.field9911.method1773((byte) -95, class497.field6766[0], null, class334.field4506);
            class698.field9911.method3528(class334.field4506, (byte) 72, true);
            class650.method3662(true, -122);
            class503.method2881(false);
        }
        class654.method3689(23017);
        int var9 = class138.field1953.field8739;
        if (class367.field4944 < var9) {
            var9 = class367.field4944;
        }
        if (class367.field4944 - 1 > var9) {
            var9 = class367.field4944 - 1;
        }
        if (class366.field4875.method537(class503.field6917, 0)) {
            class28.method271(0);
        } else {
            class28.method271(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var19 = 0; var19 < class401.field5620; var19++) {
                for (int var20 = 0; var20 < class257.field3508; var20++) {
                    class672.method3793((byte) -117, var20, var10, var19);
                }
            }
        }
        class603.method3394(-4);
        class466.method2634(5);
        class282.method1731(0);
        class63.method526(false);
        class127.method908(-1);
        if (class130.field1868 != null && class589.field8272 != null && class285.field3921 == 11) {
            class437.field6069++;
            class352 var11 = class290.method1786(98, class199.field2836, class261.field3548);
            var11.field4686.method2836(1057001181, -22164);
            class602.method3388(var11, (byte) 28);
        }
        if (class273.field3739 == 0) {
            int var12 = (class452.field6238 - (class401.field5620 >> 4)) / 8;
            int var13 = ((class401.field5620 >> 4) + class452.field6238) / 8;
            int var14 = (class186.field2695 - (class257.field3508 >> 4)) / 8;
            int var15 = ((class257.field3508 >> 4) + class186.field2695) / 8;
            for (int var16 = var12 - 1; var16 <= (var13 + 1); var16++) {
                for (int var17 = var14 - 1; var17 <= var15 + 1; var17++) {
                    if (var12 > var16 || var16 > var13 || var17 < var14 || var17 > var15) {
                        class609.field8458.method3644(-125, "m" + var16 + "_" + var17);
                        class609.field8458.method3644(-123, "l" + var16 + "_" + var17);
                    }
                }
            }
        }
        if (class285.field3921 == 4) {
            class178.method1232(3, (byte) 30);
        } else if (class285.field3921 == 8) {
            class178.method1232(7, (byte) 66);
        } else {
            class178.method1232(10, (byte) 62);
            if (class589.field8272 != null) {
                class352 var18 = class290.method1786(98, class199.field2836, class58.field661);
                class602.method3388(var18, (byte) 28);
            }
        }
        class671.method3788(25298);
        class466.method2634(5);
        class430.method2469(122);
        if (class128.field1833) {
            class26.method251("Took: " + (class577.method3295((byte) 15) - class489.field6706) + "ms", (byte) -80);
            class128.field1833 = false;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public final void method2029(int arg0) {
        field4683++;
        if (arg0 != -5) {
            this.field4686 = null;
        }
        if (class674.field9521 < class354.field4703.length) {
            class354.field4703[class674.field9521++] = this;
        }
    }
}
