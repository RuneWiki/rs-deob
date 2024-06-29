import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class140 extends class145 {

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
    public int field3531;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "Lfc;")
    private static class39 field3521 = class90.method774("Unable to connect)3", -114);

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "Lfc;")
    public static class39 field3522 = class90.method774("Hier klicken)1 um fortzufahren)3)3)3", -78);

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "Lfc;")
    public static class39 field3526 = field3521;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "Lfc;")
    public static class39 field3533 = class90.method774("scrollbar", -95);

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "Lfc;")
    public static class39 field3532 = class90.method774("Bitte starten Sie eine Mitgliedschaft", -119);

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "Lfc;")
    public static class39 field3535 = field3521;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "Laa;")
    public static class2 field3529 = new class2();

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "Lfc;")
    public static class39 field3537 = class90.method774("Privater Chat", -111);

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "Lfc;")
    public static class39 field3538 = class90.method774("Verbinde mit Server)3)3)3", -126);

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "Lfc;")
    public static class39 field3541 = class90.method774(":duelreq:", -83);

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "Lp;")
    public static class104 field3540 = new class104(64);

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "Llf;")
    public static class82 field3536;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "Llf;")
    public static class82 field3539;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3523;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "[I")
    public static int[] field3524;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)Z", line = 7)
    public static final boolean method1146(int arg0) {
        field3530++;
        long var1 = class29.method361(arg0 - 5325);
        int var3 = (int) (var1 - class72.field1684);
        if (var3 > 200) {
            var3 = 200;
        }
        class43.field1176 += var3;
        class72.field1684 = var1;
        if (arg0 != 4) {
            method1146(98);
        }
        if (class1.field6 == 0 && class113.field2968 == 0 && class70.field1651 == 0 && class34.field900 == 0) {
            return true;
        } else if (client.field563 == null) {
            return false;
        } else {
            try {
                if (class43.field1176 > 30000) {
                    throw new IOException();
                }
                while (class113.field2968 < 20 && class34.field900 > 0) {
                    class92 var4 = (class92) class87.field1985.method992(true);
                    class25 var5 = new class25(4);
                    var5.method326(1, (byte) -122);
                    var5.method309(1870, (int) var4.field3619);
                    client.field563.method1140(true, 4, 0, var5.field711);
                    class104.field2625.method998(var4, var4.field3619, (byte) -118);
                    class113.field2968++;
                    class34.field900--;
                }
                while (class1.field6 < 20 && class70.field1651 > 0) {
                    class92 var6 = (class92) class151.field3748.method525(256);
                    class25 var7 = new class25(4);
                    var7.method326(0, (byte) -58);
                    var7.method309(1870, (int) var6.field3619);
                    client.field563.method1140(true, 4, 0, var7.field711);
                    var6.method1023((byte) 85);
                    class82.field1830.method998(var6, var6.field3619, (byte) -118);
                    class1.field6++;
                    class70.field1651--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = client.field563.method1138((byte) -47);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class43.field1176 = 0;
                    byte var10 = 0;
                    if (class16.field454 == null) {
                        var10 = 8;
                    } else if (class126.field3211 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = class65.field1564.field711.length - class16.field454.field2147;
                        int var12 = 512 - class126.field3211;
                        if (var12 > var11 - class65.field1564.field710) {
                            var12 = var11 - class65.field1564.field710;
                        }
                        if (var12 > var9) {
                            var12 = var9;
                        }
                        client.field563.method1141(true, class65.field1564.field710, class65.field1564.field711, var12);
                        if (class30.field859 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class65.field1564.field711[class65.field1564.field710 + var13] = (byte) class83.method697(class65.field1564.field711[class65.field1564.field710 + var13], class30.field859);
                            }
                        }
                        class126.field3211 += var12;
                        class65.field1564.field710 += var12;
                        if (class65.field1564.field710 == var11) {
                            if (class16.field454.field3619 == 16711935L) {
                                class145.field3627 = class65.field1564;
                                for (int var14 = 0; var14 < 256; var14++) {
                                    class89 var15 = class101.field2538[var14];
                                    if (var15 != null) {
                                        class145.field3627.field710 = var14 * 8 + 5;
                                        int var16 = class145.field3627.method313((byte) 59);
                                        int var17 = class145.field3627.method313((byte) -106);
                                        var15.method758(var16, arg0 ^ 0xFFFFFFD4, var17);
                                    }
                                }
                            } else {
                                class18.field513.reset();
                                class18.field513.update(class65.field1564.field711, 0, var11);
                                int var18 = (int) class18.field513.getValue();
                                if (class16.field454.field2154 != var18) {
                                    try {
                                        client.field563.method1145(5073);
                                    } catch (Exception var30) {
                                    }
                                    class6.field201++;
                                    class30.field859 = (byte) (Math.random() * 255.0D + 1.0D);
                                    client.field563 = null;
                                    return false;
                                }
                                class24.field653 = 0;
                                class6.field201 = 0;
                                class16.field454.field2159.method766((class16.field454.field3619 & 0xFF0000L) == 16711680L, class153.field3769, (byte) -111, class65.field1564.field711, (int) (class16.field454.field3619 & 0xFFFFL));
                            }
                            class16.field454.method1170(3);
                            class126.field3211 = 0;
                            if (class153.field3769) {
                                class113.field2968--;
                            } else {
                                class1.field6--;
                            }
                            class65.field1564 = null;
                            class16.field454 = null;
                        } else {
                            if (class126.field3211 != 512) {
                                break;
                            }
                            class126.field3211 = 0;
                        }
                    } else {
                        int var19 = var10 - class12.field307.field710;
                        if (var9 < var19) {
                            var19 = var9;
                        }
                        client.field563.method1141(true, class12.field307.field710, class12.field307.field711, var19);
                        if (class30.field859 != 0) {
                            for (int var20 = 0; var20 < var19; var20++) {
                                class12.field307.field711[class12.field307.field710 + var20] = (byte) class83.method697(class12.field307.field711[class12.field307.field710 + var20], class30.field859);
                            }
                        }
                        class12.field307.field710 += var19;
                        if (var10 > class12.field307.field710) {
                            break;
                        }
                        if (class16.field454 == null) {
                            class12.field307.field710 = 0;
                            int var21 = class12.field307.method322((byte) -50);
                            int var22 = class12.field307.method301(-4853);
                            int var23 = class12.field307.method322((byte) -50);
                            int var24 = class12.field307.method313((byte) 21);
                            long var25 = (long) ((var21 << 16) + var22);
                            class92 var27 = (class92) class104.field2625.method995(false, var25);
                            class153.field3769 = true;
                            if (var27 == null) {
                                var27 = (class92) class82.field1830.method995(false, var25);
                                class153.field3769 = false;
                            }
                            if (var27 == null) {
                                throw new IOException();
                            }
                            class16.field454 = var27;
                            int var28 = var23 == 0 ? 5 : 9;
                            class65.field1564 = new class25(var24 + var28 + class16.field454.field2147);
                            class65.field1564.method326(var23, (byte) -33);
                            class65.field1564.method283(true, var24);
                            class126.field3211 = 8;
                            class12.field307.field710 = 0;
                        } else if (class126.field3211 == 0) {
                            if (class12.field307.field711[0] == -1) {
                                class126.field3211 = 1;
                                class12.field307.field710 = 0;
                            } else {
                                class16.field454 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    client.field563.method1145(5073);
                } catch (Exception var29) {
                }
                class24.field653++;
                client.field563 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)V", line = 323)
    public static final void method1147(byte arg0) {
        if (arg0 <= -8) {
            class132.field3338 = null;
            class42.field1139 = null;
            class61.field1491 = null;
            field3534++;
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V", line = 347)
    public static void method1148(int arg0) {
        field3522 = null;
        field3541 = null;
        field3524 = null;
        if (arg0 != -1) {
            return;
        }
        field3523 = null;
        field3536 = null;
        field3533 = null;
        field3526 = null;
        field3521 = null;
        field3535 = null;
        field3540 = null;
        field3539 = null;
        field3537 = null;
        field3532 = null;
        field3529 = null;
        field3538 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lfc;B)I", line = 384)
    public static final int method1149(class39 arg0, byte arg1) {
        field3525++;
        if (arg1 != -69) {
            return 67;
        } else if (class38.field1037 == 1) {
            return 7;
        } else if (arg0.method472(0, class109.field2796)) {
            return 1;
        } else if (arg0.method472(0, class120.field3134)) {
            return 1;
        } else if (arg0.method472(0, class127.field3221)) {
            return 2;
        } else if (arg0.method472(0, class58.field1434)) {
            return 2;
        } else if (arg0.method472(0, class147.field3658)) {
            return 3;
        } else if (arg0.method472(0, class18.field509)) {
            return 4;
        } else if (arg0.method472(arg1 + 69, class60.field1480)) {
            return 5;
        } else if (arg0.method472(0, class120.field3146)) {
            return 6;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V", line = 424)
    public class140() {
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(I)V", line = 429)
    public class140(int arg0) {
        this.field3531 = arg0;
    }
}
