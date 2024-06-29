import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class164 extends class125 {

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "Ljd;")
    private class92 field3195 = class98.field1994;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public static int field3196 = 0;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public static int field3204 = 0;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "Ldb;")
    public static class33 field3198 = new class33(4096);

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "Ljd;")
    public static class92 field3209 = class202.method1325((byte) 90, "::fps ");

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "Ljd;")
    public static class92 field3210 = class202.method1325((byte) 90, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "Z")
    public static boolean field3211 = false;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public int field3197;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    private int field3199;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public int field3200;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "Ldb;")
    private class33 field3201;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)V")
    public static void method1055(byte arg0) {
        field3210 = null;
        field3198 = null;
        int var1 = 118 % ((23 - arg0) / 44);
        field3209 = null;
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V")
    public static final void method1056(int arg0) {
        field3208++;
        if (class115.field2339 && class81.field1639 != field3196) {
            class165.method1066(false, class67.field1352, class61.field1260, class15.field423.field233[0], class81.field1639, class15.field423.field198[0]);
            return;
        }
        if (arg0 != -26019) {
            field3211 = false;
        }
        if (class81.field1639 != class115.field2342) {
            class115.field2342 = class81.field1639;
            class58.method354(class81.field1639, (byte) 67);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)I")
    public final int method1057(byte arg0, int arg1) {
        field3203++;
        if (this.field3201 == null) {
            return this.field3199;
        }
        if (arg0 != 56) {
            field3211 = true;
        }
        class130 var3 = (class130) this.field3201.method216(-111, (long) arg1);
        return var3 == null ? this.field3199 : var3.field2608;
    }

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)Z")
    public static final boolean method1058(int arg0) {
        long var1 = class168.method1118(1);
        int var3 = (int) (var1 - class180.field3443);
        if (arg0 != 4) {
            method1058(91);
        }
        field3206++;
        if (var3 > 200) {
            var3 = 200;
        }
        class187.field3533 += var3;
        class180.field3443 = var1;
        if (class182.field3465 == 0 && class129.field2600 == 0 && class74.field1563 == 0 && class208.field4002 == 0) {
            return true;
        } else if (class123.field2485 == null) {
            return false;
        } else {
            try {
                if (class187.field3533 > 30000) {
                    throw new IOException();
                }
                while (class129.field2600 < 20 && class208.field4002 > 0) {
                    class153 var4 = (class153) class100.field2058.method215((byte) -97);
                    class70 var5 = new class70(4);
                    var5.method428(1, arg0 ^ 0x7D);
                    var5.method439((int) var4.field4079, (byte) 119);
                    class123.field2485.method324(0, var5.field1493, 4, 2084);
                    class190.field3610.method210((byte) -51, var4.field4079, var4);
                    class208.field4002--;
                    class129.field2600++;
                }
                while (class182.field3465 < 20 && class74.field1563 > 0) {
                    class153 var6 = (class153) class156.field3094.method1161((byte) 110);
                    class70 var7 = new class70(4);
                    var7.method428(0, 115);
                    var7.method439((int) var6.field4079, (byte) 103);
                    class123.field2485.method324(0, var7.field1493, 4, 2084);
                    var6.method838(arg0 + 8159);
                    class126.field2547.method210((byte) -36, var6.field4079, var6);
                    class74.field1563--;
                    class182.field3465++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class123.field2485.method326(0);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    byte var10 = 0;
                    class187.field3533 = 0;
                    if (class208.field4000 == null) {
                        var10 = 8;
                    } else if (class46.field1017 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - class16.field444.field1472;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        class123.field2485.method318(class16.field444.field1472, (byte) 114, var11, class16.field444.field1493);
                        if (class147.field2921 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                class16.field444.field1493[class16.field444.field1472 + var12] = (byte) class98.method685(class16.field444.field1493[class16.field444.field1472 + var12], class147.field2921);
                            }
                        }
                        class16.field444.field1472 += var11;
                        if (class16.field444.field1472 < var10) {
                            break;
                        }
                        if (class208.field4000 == null) {
                            class16.field444.field1472 = 0;
                            int var13 = class16.field444.method443(255);
                            int var14 = class16.field444.method442(-21351);
                            int var15 = class16.field444.method443(255);
                            int var16 = class16.field444.method453(arg0 ^ 0x20);
                            long var17 = (long) ((var13 << 16) + var14);
                            class153 var19 = (class153) class190.field3610.method216(-128, var17);
                            class51.field1080 = true;
                            if (var19 == null) {
                                var19 = (class153) class126.field2547.method216(-93, var17);
                                class51.field1080 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            class208.field4000 = var19;
                            int var20 = var15 == 0 ? 5 : 9;
                            class116.field2351 = new class70(class208.field4000.field3031 + var16 + var20);
                            class116.field2351.method428(var15, 91);
                            class116.field2351.method446(var16, -26751);
                            class16.field444.field1472 = 0;
                            class46.field1017 = 8;
                        } else if (class46.field1017 == 0) {
                            if (class16.field444.field1493[0] == -1) {
                                class46.field1017 = 1;
                                class16.field444.field1472 = 0;
                            } else {
                                class208.field4000 = null;
                            }
                        }
                    } else {
                        int var21 = class116.field2351.field1493.length - class208.field4000.field3031;
                        int var22 = 512 - class46.field1017;
                        if (var21 - class116.field2351.field1472 < var22) {
                            var22 = var21 - class116.field2351.field1472;
                        }
                        if (var9 < var22) {
                            var22 = var9;
                        }
                        class123.field2485.method318(class116.field2351.field1472, (byte) 79, var22, class116.field2351.field1493);
                        if (class147.field2921 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                class116.field2351.field1493[class116.field2351.field1472 + var23] = (byte) class98.method685(class116.field2351.field1493[class116.field2351.field1472 + var23], class147.field2921);
                            }
                        }
                        class116.field2351.field1472 += var22;
                        class46.field1017 += var22;
                        if (class116.field2351.field1472 == var21) {
                            if (class208.field4000.field4079 == 16711935L) {
                                class76.field1590 = class116.field2351;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class192 var25 = client.field674[var24];
                                    if (var25 != null) {
                                        class76.field1590.field1472 = var24 * 8 + 5;
                                        int var26 = class76.field1590.method453(53);
                                        int var27 = class76.field1590.method453(62);
                                        var25.method1274(var27, (byte) 74, var26);
                                    }
                                }
                            } else {
                                class6.field293.reset();
                                class6.field293.update(class116.field2351.field1493, 0, var21);
                                int var28 = (int) class6.field293.getValue();
                                if (class208.field4000.field3028 != var28) {
                                    try {
                                        class123.field2485.method319(true);
                                    } catch (Exception var30) {
                                    }
                                    class147.field2921 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class76.field1579++;
                                    class123.field2485 = null;
                                    return false;
                                }
                                class76.field1579 = 0;
                                class43.field975 = 0;
                                class208.field4000.field3035.method1268((int) (class208.field4000.field4079 & 0xFFFFL), class51.field1080, true, class116.field2351.field1493, (class208.field4000.field4079 & 0xFF0000L) == 16711680L);
                            }
                            class208.field4000.method1370(-79);
                            if (class51.field1080) {
                                class129.field2600--;
                            } else {
                                class182.field3465--;
                            }
                            class46.field1017 = 0;
                            class208.field4000 = null;
                            class116.field2351 = null;
                        } else {
                            if (class46.field1017 != 512) {
                                break;
                            }
                            class46.field1017 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class123.field2485.method319(true);
                } catch (Exception var29) {
                }
                class43.field975++;
                class123.field2485 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static final void method1059(String arg0, Throwable arg1, int arg2) {
        field3207++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class185.method1204(104, arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class42.field931.field3312 != null) {
                if (arg2 < 65) {
                    method1056(43);
                }
                class183 var8 = class42.field931.method1119(2, new URL(class42.field931.field3312.getCodeBase(), "clienterror.ws?c=" + class102.field2096 + "&u=" + class89.field1754 + "&v1=" + class169.field3301 + "&v2=" + class169.field3309 + "&e=" + var7));
                while (var8.field3476 == 0) {
                    class58.method357(-24534, 1L);
                }
                if (var8.field3476 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field3474;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILh;)V")
    private final void method1060(int arg0, int arg1, class70 arg2) {
        if (arg0 != 0) {
            method1056(-15);
        }
        field3194++;
        if (arg1 == 1) {
            this.field3200 = arg2.method443(arg0 ^ 0xFF);
        } else if (arg1 == 2) {
            this.field3197 = arg2.method443(255);
        } else if (arg1 == 3) {
            this.field3195 = arg2.method437((byte) 69);
        } else if (arg1 == 4) {
            this.field3199 = arg2.method453(98);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method442(arg0 - 21351);
            this.field3201 = new class33(class130.method857((byte) 94, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method453(119);
                class210 var7;
                if (arg1 == 5) {
                    var7 = new class162(arg2.method437((byte) 110));
                } else {
                    var7 = new class130(arg2.method453(77));
                }
                this.field3201.method210((byte) -117, (long) var6, var7);
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Ljd;")
    public final class92 method1061(int arg0, int arg1) {
        field3202++;
        if (this.field3201 == null) {
            return this.field3195;
        }
        class162 var3 = (class162) this.field3201.method216(-89, (long) arg0);
        if (var3 == null) {
            return this.field3195;
        } else {
            if (arg1 != -28329) {
                field3211 = true;
            }
            return var3.field3179;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lh;I)V")
    public final void method1062(class70 arg0, int arg1) {
        field3205++;
        if (arg1 != 0) {
            this.method1060(-112, -72, null);
        }
        while (true) {
            int var3 = arg0.method443(255);
            if (var3 == 0) {
                return;
            }
            this.method1060(arg1, var3, arg0);
        }
    }
}
