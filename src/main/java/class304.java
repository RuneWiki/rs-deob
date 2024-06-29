import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class304 extends Canvas {

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Ljava/awt/Component;")
    private Component field5131;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Lbd;")
    public static class162 field5127 = class17.method142(0, ":chalreq:");

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 15)
    public static void method2070(int arg0) {
        if (arg0 != -10140) {
            method2076((byte) 79, -101, 29, (class162) null, 90);
        }
        field5127 = null;
    }

    @OriginalMember(owner = "client!sc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 31)
    public final void paint(Graphics arg0) {
        field5130++;
        this.field5131.paint(arg0);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V", line = 46)
    public static final void method2071(int arg0) {
        field5124++;
        int var1 = -45 / ((arg0 + 2) / 42);
        class258.field4289 = class172.method1321(4, 8, 8, (byte) -50, 35, 0.4F, 2048, true);
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V", line = 57)
    public static final void method2072(int arg0) {
        class51.method367(false, -94);
        field5125++;
        class32.field529 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class147.field2654.length; var2++) {
            if (class250.field4176[var2] != -1 && class147.field2654[var2] == null) {
                class147.field2654[var2] = class91.field1614.method1128(0, 0, class250.field4176[var2]);
                if (class147.field2654[var2] == null) {
                    class32.field529++;
                    var1 = false;
                }
            }
            if (class251.field4190[var2] != -1 && class209.field3542[var2] == null) {
                class209.field3542[var2] = class91.field1614.method1134(-123, class251.field4190[var2], 0, class92.field1631[var2]);
                if (class209.field3542[var2] == null) {
                    var1 = false;
                    class32.field529++;
                }
            }
            if (class117.field2159) {
                if (class188.field3236[var2] != -1 && class280.field4730[var2] == null) {
                    class280.field4730[var2] = class91.field1614.method1128(0, 0, class188.field3236[var2]);
                    if (class280.field4730[var2] == null) {
                        class32.field529++;
                        var1 = false;
                    }
                }
                if (class157.field2763[var2] != -1 && class131.field2361[var2] == null) {
                    class131.field2361[var2] = class91.field1614.method1128(0, 0, class157.field2763[var2]);
                    if (class131.field2361[var2] == null) {
                        class32.field529++;
                        var1 = false;
                    }
                }
            }
            if (class243.field4038 != null && class204.field3455[var2] == null && class243.field4038[var2] != -1) {
                class204.field3455[var2] = class91.field1614.method1134(81, class243.field4038[var2], 0, class92.field1631[var2]);
                if (class204.field3455[var2] == null) {
                    var1 = false;
                    class32.field529++;
                }
            }
        }
        if (class122.field2202 == null) {
            if (class64.field999 == null || !class6.field50.method1146((byte) 103, class135.method1062(new class162[] { class64.field999.field3028, class293.field4934 }, true))) {
                class122.field2202 = new class32(0);
            } else if (class6.field50.method1124(class135.method1062(new class162[] { class64.field999.field3028, class293.field4934 }, true), -1)) {
                class122.field2202 = class184.method1394(class6.field50, 104, class135.method1062(new class162[] { class64.field999.field3028, class293.field4934 }, true));
            } else {
                class32.field529++;
                var1 = false;
            }
        }
        if (!var1) {
            class63.field984 = 1;
            return;
        }
        class80.field1400 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class147.field2654.length; var4++) {
            byte[] var5 = class209.field3542[var4];
            if (var5 != null) {
                int var6 = (class123.field2230[var4] >> 8) * 64 - class178.field3052;
                int var7 = (class123.field2230[var4] & 0xFF) * 64 - class258.field4294;
                if (class213.field3570) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class143.method1152(-1, var7, var6, var5);
            }
            if (class117.field2159) {
                byte[] var8 = class131.field2361[var4];
                if (var8 != null) {
                    int var9 = (class123.field2230[var4] >> 8) * 64 - class178.field3052;
                    int var10 = (class123.field2230[var4] & 0xFF) * 64 - class258.field4294;
                    if (class213.field3570) {
                        var9 = 10;
                        var10 = 10;
                    }
                    var3 &= class143.method1152(-1, var10, var9, var8);
                }
            }
        }
        if (!var3) {
            class63.field984 = 2;
            return;
        }
        if (class63.field984 != 0) {
            class94.method706(class135.method1062(new class162[] { class235.field3934, class270.field4513 }, true), 48, true);
        }
        class58.method401((byte) 62);
        class202.method1506((byte) 85);
        if (arg0 < 92) {
            field5127 = (class162) null;
        }
        boolean var11 = false;
        if (class117.field2159 && class27.field458) {
            for (int var12 = 0; var12 < class147.field2654.length; var12++) {
                if (class131.field2361[var12] != null || class280.field4730[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class3.method13(4, 104, 104, class117.field2159 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class267.field4473[var13].method1369(16777216);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class213.field3580[var14][var15][var16] = 0;
                }
            }
        }
        class30.method251(false, (byte) -43);
        if (class117.field2159) {
            class287.field4836.method796();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class287.field4838[var17][var18].field3780 = true;
                }
            }
        }
        if (class117.field2159) {
            class221.method1594();
        }
        if (class117.field2159) {
            class165.method1301((byte) 121);
        }
        class58.method401((byte) 62);
        System.gc();
        class51.method367(true, -86);
        class184.method1390(false, 104);
        if (!class213.field3570) {
            class182.method1376(false, 0);
            class51.method367(true, -66);
            if (class117.field2159) {
                int var19 = class122.field2215.field5050[0] >> 3;
                int var20 = class122.field2215.field5034[0] >> 3;
                class231.method1651(var20, var19, (byte) -89);
            }
            class211.method1550(false, 116);
            if (class204.field3455 != null) {
                class10.method61(70);
            }
        }
        if (class213.field3570) {
            class228.method1632(false, (byte) -101);
            class51.method367(true, -52);
            if (class117.field2159) {
                int var21 = class122.field2215.field5050[0] >> 3;
                int var22 = class122.field2215.field5034[0] >> 3;
                class231.method1651(var22, var21, (byte) -112);
            }
            class71.method516(-125, false);
        }
        class202.method1506((byte) 117);
        class51.method367(true, -63);
        class146.method1164(105, class267.field4473, false);
        if (class117.field2159) {
            class221.method1601();
        }
        class51.method367(true, -55);
        int var23 = class142.field2543;
        if (var23 > class157.field2765) {
            var23 = class157.field2765;
        }
        if (var23 < class157.field2765 - 1) {
            int var24 = class157.field2765 - 1;
        }
        if (class4.method19(-122)) {
            class77.method582(0);
        } else {
            class77.method582(class142.field2543);
        }
        class64.method441(16);
        if (class117.field2159 && var11) {
            class139.method1087(true);
            class184.method1390(true, 104);
            if (!class213.field3570) {
                class182.method1376(true, 0);
                class51.method367(true, -92);
                class211.method1550(true, 109);
            }
            if (class213.field3570) {
                class228.method1632(true, (byte) -101);
                class51.method367(true, -90);
                class71.method516(-118, true);
            }
            class202.method1506((byte) 111);
            class51.method367(true, -49);
            class146.method1164(105, class267.field4473, true);
            class51.method367(true, -40);
            class64.method441(16);
            class139.method1087(false);
        }
        if (class117.field2159) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class287.field4838[var25][var26].method1627(class206.field3473[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class134.method1059(2747, var28, var27);
            }
        }
        class80.method618(-66);
        class58.method401((byte) 62);
        class274.method1859(-119);
        class202.method1506((byte) 99);
        if (class95.field1740 != null && class116.field2054 != null && class262.field4380 == 25) {
            class212.field3556++;
            class187.field3229.method338(77, (byte) 8);
            class187.field3229.method730(false, 1057001181);
        }
        if (!class213.field3570) {
            int var29 = (class165.field2928 - 6) / 8;
            int var30 = (class165.field2928 + 6) / 8;
            int var31 = (class123.field2238 - 6) / 8;
            int var32 = (class123.field2238 + 6) / 8;
            for (int var33 = var29 - 1; var33 <= (var30 + 1); var33++) {
                for (int var34 = var31 - 1; var34 <= (var32 + 1); var34++) {
                    if (var29 > var33 || var33 > var30 || var31 > var34 || var32 < var34) {
                        class91.field1614.method1126(255, class135.method1062(new class162[] { class297.field4974, class156.method1212(10, var33), class256.field4237, class156.method1212(10, var34) }, true));
                        class91.field1614.method1126(255, class135.method1062(new class162[] { class280.field4749, class156.method1212(10, var33), class256.field4237, class156.method1212(10, var34) }, true));
                    }
                }
            }
        }
        if (class262.field4380 == 28) {
            class122.method984(10, 2047);
        } else {
            class122.method984(30, 2047);
            if (class116.field2054 != null) {
                class187.field3229.method338(114, (byte) 8);
            }
        }
        class58.method401((byte) 62);
        class220.method1590(0);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lda;B)V", line = 563)
    public static final void method2073(class143 arg0, byte arg1) {
        if (arg1 < 80) {
            method2071(43);
        }
        class168.field2949 = arg0;
        field5126++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Lnl;", line = 579)
    public static final class219 method2074(int arg0, int arg1) {
        field5133++;
        if (arg0 != 1116) {
            return (class219) null;
        } else if (arg1 == 0) {
            return new class314();
        } else if (arg1 == 1) {
            return new class51();
        } else if (arg1 == 2) {
            return new class19();
        } else if (arg1 == 3) {
            return new class157();
        } else if (arg1 == 4) {
            return new class35();
        } else if (arg1 == 5) {
            return new class190();
        } else if (arg1 == 6) {
            return new class265();
        } else if (arg1 == 7) {
            return new class131();
        } else if (arg1 == 8) {
            return new class231();
        } else if (arg1 == 9) {
            return new class263();
        } else if (arg1 == 10) {
            return new class55();
        } else if (arg1 == 11) {
            return new class274();
        } else if (arg1 == 12) {
            return new class261();
        } else if (arg1 == 13) {
            return new class163();
        } else if (arg1 == 14) {
            return new class245();
        } else if (arg1 == 15) {
            return new class289();
        } else if (arg1 == 16) {
            return new class50();
        } else if (arg1 == 17) {
            return new class275();
        } else if (arg1 == 18) {
            return new class307();
        } else if (arg1 == 19) {
            return new class104();
        } else if (arg1 == 20) {
            return new class270();
        } else if (arg1 == 21) {
            return new class81();
        } else if (arg1 == 22) {
            return new class292();
        } else if (arg1 == 23) {
            return new class106();
        } else if (arg1 == 24) {
            return new class228();
        } else if (arg1 == 25) {
            return new class207();
        } else if (arg1 == 26) {
            return new class77();
        } else if (arg1 == 27) {
            return new class67();
        } else if (arg1 == 28) {
            return new class199();
        } else if (arg1 == 29) {
            return new class198();
        } else if (arg1 == 30) {
            return new class208();
        } else if (arg1 == 31) {
            return new class295();
        } else if (arg1 == 32) {
            return new class218();
        } else if (arg1 == 33) {
            return new class136();
        } else if (arg1 == 34) {
            return new class7();
        } else if (arg1 == 35) {
            return new class229();
        } else if (arg1 == 36) {
            return new class185();
        } else if (arg1 == 37) {
            return new class230();
        } else if (arg1 == 38) {
            return new class135();
        } else if (arg1 == 39) {
            return new class27();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 896)
    public class304(Component arg0) {
        this.field5131 = arg0;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)Lom;", line = 905)
    public static final class116 method2075(int arg0, int arg1) {
        field5129++;
        class116 var2 = (class116) class292.field4911.method1536((long) arg0, -90);
        if (var2 != null) {
            return var2;
        } else if (arg1 == 4) {
            byte[] var3 = class102.field1853.method1128(class148.method1174(117, arg0), 0, class298.method2042(-118, arg0));
            class116 var4 = new class116();
            var4.field2097 = arg0;
            if (var3 != null) {
                var4.method911(new class94(var3), arg1 + 2939);
            }
            var4.method926((byte) -61);
            if (var4.field2102 != -1) {
                var4.method930(method2075(var4.field2102, 4), method2075(var4.field2066, 4), arg1 - 17065);
            }
            if (var4.field2063 != -1) {
                var4.method924(method2075(var4.field2100, 4), (byte) -127, method2075(var4.field2063, 4));
            }
            if (!class146.field2647 && var4.field2107) {
                var4.field2055 = null;
                var4.field2072 = 0;
                var4.field2091 = class315.field5322;
                var4.field2121 = false;
                var4.field2120 = null;
            }
            class292.field4911.method1532((long) arg0, -75, var4);
            return var4;
        } else {
            return (class116) null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 949)
    public final void update(Graphics arg0) {
        this.field5131.update(arg0);
        field5128++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BIILbd;I)V", line = 959)
    public static final void method2076(byte arg0, int arg1, int arg2, class162 arg3, int arg4) {
        class78 var5 = class112.method903(arg2, arg4, -25988);
        field5134++;
        if (var5 == null) {
            return;
        }
        if (var5.field1356 != null) {
            class180 var6 = new class180();
            var6.field3099 = var5;
            var6.field3102 = var5.field1356;
            var6.field3096 = arg3;
            var6.field3094 = arg1;
            class31.method257(-32581, var6);
        }
        boolean var7 = true;
        if (var5.field1313 > 0) {
            var7 = class61.method415((byte) -68, var5);
        }
        if (!var7 || !class136.method1066(client.method861(var5), arg1 - 1, -1)) {
            return;
        }
        if (arg1 == 1) {
            class187.field3229.method338(122, (byte) 8);
            class261.field4349++;
            class187.field3229.method730(false, arg2);
            class187.field3229.method751(arg4, -1044017976);
        }
        if (arg1 == 2) {
            class139.field2478++;
            class187.field3229.method338(245, (byte) 8);
            class187.field3229.method730(false, arg2);
            class187.field3229.method751(arg4, -1044017976);
        }
        if (arg1 == 3) {
            class10.field122++;
            class187.field3229.method338(107, (byte) 8);
            class187.field3229.method730(false, arg2);
            class187.field3229.method751(arg4, -1044017976);
        }
        if (arg1 == 4) {
            class283.field4800++;
            class187.field3229.method338(69, (byte) 8);
            class187.field3229.method730(false, arg2);
            class187.field3229.method751(arg4, -1044017976);
        }
        int var8 = -1 % ((-arg0 - 28) / 55);
        if (arg1 == 5) {
            class187.field3229.method338(213, (byte) 8);
            class187.field3229.method730(false, arg2);
            class135.field2401++;
            class187.field3229.method751(arg4, -1044017976);
        }
        if (arg1 == 6) {
            class298.field4985++;
            class187.field3229.method338(27, (byte) 8);
            class187.field3229.method730(false, arg2);
            class187.field3229.method751(arg4, -1044017976);
        }
        if (arg1 == 7) {
            class187.field3229.method338(138, (byte) 8);
            class240.field3978++;
            class187.field3229.method730(false, arg2);
            class187.field3229.method751(arg4, -1044017976);
        }
        if (arg1 == 8) {
            class187.field3229.method338(37, (byte) 8);
            class162.field2831++;
            class187.field3229.method730(false, arg2);
            class187.field3229.method751(arg4, -1044017976);
        }
        if (arg1 == 9) {
            class102.field1857++;
            class187.field3229.method338(130, (byte) 8);
            class187.field3229.method730(false, arg2);
            class187.field3229.method751(arg4, -1044017976);
        }
        if (arg1 == 10) {
            class187.field3229.method338(23, (byte) 8);
            class187.field3229.method730(false, arg2);
            class187.field3229.method751(arg4, -1044017976);
            class268.field4478++;
        }
    }
}
