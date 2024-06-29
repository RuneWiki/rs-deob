import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class80 {

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "Lgg;")
    public static class63 field1939 = class116.method911(43, " <col=ffffff>");

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "[I")
    public static int[] field1940 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "[J")
    public static long[] field1938 = new long[200];

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "Lgg;")
    private static class63 field1936 = class116.method911(43, " has logged in)3");

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "Lgg;")
    public static class63 field1942 = field1936;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "Lbc;")
    public static class14 field1941;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static final void method721(int arg0) {
        field1943++;
        try {
            if (class35.field820 == 0) {
                if (class171.field3553 != null) {
                    class171.field3553.method509(true);
                    class171.field3553 = null;
                }
                class35.field820 = 1;
                class63.field1587 = false;
                class191.field3890 = null;
                class16.field376 = 0;
            }
            if (class35.field820 == 1) {
                if (class191.field3890 == null) {
                    class191.field3890 = class79.field1924.method1047(class186.field3761, (byte) -61, class83.field1966);
                }
                if (class191.field3890.field2058 == 2) {
                    throw new IOException();
                }
                if (class191.field3890.field2058 == 1) {
                    class171.field3553 = new class52((Socket) class191.field3890.field2060, class79.field1924);
                    class35.field820 = 2;
                    class191.field3890 = null;
                }
            }
            if (class35.field820 == 2) {
                long var1 = class112.field2518 = class153.field3201.method590(-98);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class141.field3031.field54 = 0;
                class141.field3031.method66(2, 14);
                class141.field3031.method66(arg0 ^ 0x1, var3);
                class171.field3553.method512(0, 2, class141.field3031.field48, (byte) -66);
                class35.field820 = 3;
                class167.field3437.field54 = 0;
            }
            if (class35.field820 == arg0) {
                if (class183.field3711 != null) {
                    class183.field3711.method497(4742);
                }
                if (class132.field2868 != null) {
                    class132.field2868.method497(arg0 + 4739);
                }
                int var4 = class171.field3553.method516((byte) -127);
                if (class183.field3711 != null) {
                    class183.field3711.method497(4742);
                }
                if (class132.field2868 != null) {
                    class132.field2868.method497(4742);
                }
                if (var4 != 0) {
                    class121.method927(var4, -7);
                    return;
                }
                class167.field3437.field54 = 0;
                class35.field820 = 4;
            }
            if (class35.field820 == 4) {
                if (class167.field3437.field54 < 8) {
                    int var5 = class171.field3553.method510((byte) 83);
                    if (8 - class167.field3437.field54 < var5) {
                        var5 = 8 - class167.field3437.field54;
                    }
                    if (var5 > 0) {
                        class171.field3553.method514(class167.field3437.field54, var5, -1, class167.field3437.field48);
                        class167.field3437.field54 += var5;
                    }
                }
                if (class167.field3437.field54 == 8) {
                    class167.field3437.field54 = 0;
                    class141.field3037 = class167.field3437.method21(-28356);
                    class35.field820 = 5;
                }
            }
            if (class35.field820 == 5) {
                class141.field3031.field54 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class141.field3037 >> 32), (int) class141.field3037 };
                class141.field3031.method66(2, 10);
                class141.field3031.method76(var6[0], (byte) 114);
                class141.field3031.method76(var6[1], (byte) 114);
                class141.field3031.method76(var6[2], (byte) 114);
                class141.field3031.method76(var6[3], (byte) 114);
                class141.field3031.method32((byte) 72, class153.field3201.method590(-98));
                class141.field3031.method65(class153.field3205, 4);
                class141.field3031.method63((byte) -58, class153.field3196, class23.field537);
                class97.field2303.field54 = 0;
                if (class136.field2932 == 40) {
                    class97.field2303.method66(2, 18);
                } else {
                    class97.field2303.method66(2, 16);
                }
                class97.field2303.method66(arg0 ^ 0x1, class141.field3031.field54 + 93);
                class97.field2303.method76(480, (byte) 114);
                class97.field2303.method66(2, class198.field3964 ? 1 : 0);
                class74.method684(class97.field2303, (byte) -102);
                class97.field2303.method76(class155.field3247.field2050, (byte) 114);
                class97.field2303.method76(class188.field3797.field2050, (byte) 114);
                class97.field2303.method76(class177.field3636.field2050, (byte) 114);
                class97.field2303.method76(class176.field3622.field2050, (byte) 114);
                class97.field2303.method76(class108.field2446.field2050, (byte) 114);
                class97.field2303.method76(class47.field1142.field2050, (byte) 114);
                class97.field2303.method76(class10.field225.field2050, (byte) 114);
                class97.field2303.method76(class18.field433.field2050, (byte) 114);
                class97.field2303.method76(class110.field2479.field2050, (byte) 114);
                class97.field2303.method76(class17.field401.field2050, (byte) 114);
                class97.field2303.method76(class29.field681.field2050, (byte) 114);
                class97.field2303.method76(class134.field2906.field2050, (byte) 114);
                class97.field2303.method76(class111.field2503.field2050, (byte) 114);
                class97.field2303.method76(class167.field3450.field2050, (byte) 114);
                class97.field2303.method76(class144.field3082.field2050, (byte) 114);
                class97.field2303.method76(class81.field1960.field2050, (byte) 114);
                class97.field2303.method72(0, (byte) -69, class141.field3031.field54, class141.field3031.field48);
                class171.field3553.method512(0, class97.field2303.field54, class97.field2303.field48, (byte) 104);
                class141.field3031.method864(var6, true);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class167.field3437.method864(var6, true);
                class35.field820 = 6;
            }
            if (class35.field820 == 6 && class171.field3553.method510((byte) 108) > 0) {
                int var8 = class171.field3553.method516((byte) -100);
                if (var8 == 21 && class136.field2932 == 20) {
                    class35.field820 = 7;
                } else if (var8 == 2) {
                    class35.field820 = 9;
                } else if (var8 == 15 && class136.field2932 == 40) {
                    class161.method1099((byte) -107);
                    return;
                } else if (var8 == 23 && class106.field2419 < 1) {
                    class35.field820 = 0;
                    class106.field2419++;
                } else {
                    class121.method927(var8, -7);
                    return;
                }
            }
            if (class35.field820 == 7 && class171.field3553.method510((byte) 127) > 0) {
                class60.field1524 = (class171.field3553.method516((byte) -100) + 3) * 60;
                class35.field820 = 8;
            }
            if (class35.field820 == 8) {
                class16.field376 = 0;
                class188.method1232(class127.field2809, class89.method772((byte) 44, new class63[] { class175.method1162((byte) -126, class60.field1524 / 60), class136.field2949 }), class51.field1261, false);
                if (--class60.field1524 <= 0) {
                    class35.field820 = 0;
                }
            } else {
                if (class35.field820 == 9 && class171.field3553.method510((byte) 102) >= 9) {
                    class191.field3882 = class171.field3553.method516((byte) -128);
                    client.field715 = class171.field3553.method516((byte) -109);
                    class39.field927 = class171.field3553.method516((byte) -128) == 1;
                    class50.field1216 = class171.field3553.method516((byte) -110);
                    class50.field1216 <<= 0x8;
                    class50.field1216 += class171.field3553.method516((byte) -111);
                    class13.field299 = class171.field3553.method516((byte) -124);
                    class171.field3553.method514(0, 1, -1, class167.field3437.field48);
                    class167.field3437.field54 = 0;
                    class124.field2736 = class167.field3437.method863(arg0 - 14618);
                    class171.field3553.method514(0, 2, -1, class167.field3437.field48);
                    class167.field3437.field54 = 0;
                    class112.field2531 = class167.field3437.method46((byte) 65);
                    class35.field820 = 10;
                }
                if (class35.field820 != 10) {
                    class16.field376++;
                    if (class16.field376 > 2000) {
                        if (class106.field2419 < 1) {
                            class35.field820 = 0;
                            class106.field2419++;
                            if (class186.field3761 == class167.field3461) {
                                class186.field3761 = class203.field4046;
                            } else {
                                class186.field3761 = class167.field3461;
                            }
                        } else {
                            class121.method927(-3, -7);
                        }
                    }
                } else if (class171.field3553.method510((byte) 123) >= class112.field2531) {
                    class167.field3437.field54 = 0;
                    class171.field3553.method514(0, class112.field2531, arg0 - 4, class167.field3437.field48);
                    class113.method897(0);
                    class158.field3270 = -1;
                    client.method300(-1, false);
                    class124.field2736 = -1;
                }
            }
        } catch (IOException var9) {
            if (class106.field2419 < 1) {
                class35.field820 = 0;
                if (class186.field3761 == class167.field3461) {
                    class186.field3761 = class203.field4046;
                } else {
                    class186.field3761 = class167.field3461;
                }
                class106.field2419++;
            } else {
                class121.method927(-2, -7);
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLqa;)V")
    public static final void method722(byte arg0, class145 arg1) {
        arg1.field3089 = false;
        if (arg1.field3092 != null) {
            arg1.field3092.field2951 = 0;
        }
        if (arg0 >= -45) {
            field1936 = null;
        }
        for (class145 var2 = arg1.method378(); var2 != null; var2 = arg1.method373()) {
            method722((byte) -48, var2);
        }
        field1937++;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
    public static void method723(int arg0) {
        field1936 = null;
        field1940 = null;
        field1938 = null;
        field1942 = null;
        field1939 = null;
        if (arg0 != 16565) {
            field1936 = null;
        }
        field1941 = null;
    }
}
