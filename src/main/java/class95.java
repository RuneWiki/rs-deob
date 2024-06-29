import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class95 {

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "[I")
    public static int[] field2198 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "Lwd;")
    private static class150 field2203 = class2.method9(true, "Accept challenge");

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Lwd;")
    public static class150 field2202 = class2.method9(true, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Lwd;")
    public static class150 field2207 = field2203;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field2209 = 0;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static volatile int field2210 = 0;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Lud;")
    public static class138 field2208;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
    public static int[] field2201;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public static final void method668(byte arg0) {
        field2206++;
        if (arg0 != -82) {
            method670(-102);
        }
        if (class94.field2172 == 104) {
            int var1;
            if (class69.field1731 == -1) {
                var1 = class138.field3231;
            } else {
                var1 = class69.field1731;
            }
            if (class69.field1731 != class138.field3231) {
                var1--;
                if (var1 < 0) {
                    var1 = 19;
                }
                if (class11.field279[var1] != null) {
                    class43.field1193 = class11.field279[var1];
                    class40.field1067 = true;
                    class69.field1731 = var1;
                }
            }
        }
        if (class94.field2172 != 105 || class69.field1731 == -1) {
            return;
        }
        class69.field1731++;
        if (class69.field1731 >= 20) {
            class69.field1731 = 0;
        }
        if (class69.field1731 == class138.field3231) {
            class40.field1067 = true;
            class43.field1193 = class43.field1167;
            class69.field1731 = -1;
            return;
        }
        if (class11.field279[class69.field1731] != null) {
            class43.field1193 = class11.field279[class69.field1731];
            class40.field1067 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
    public static final void method669(byte arg0) {
        field2200++;
        if (arg0 >= -85) {
            method670(-105);
        }
        Object var1 = class55.field1435;
        synchronized (class55.field1435) {
            if (class106.field2385 != 0) {
                class106.field2385 = 1;
                try {
                    class55.field1435.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static void method670(int arg0) {
        field2203 = null;
        if (arg0 != 19) {
            return;
        }
        field2201 = null;
        field2207 = null;
        field2208 = null;
        field2202 = null;
        field2198 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lva;Lwd;B)Lwd;")
    public static final class150 method671(class141 arg0, class150 arg1, byte arg2) {
        if (arg1.method1200(class106.field2391, 29903) != -1) {
            label62: while (true) {
                int var3 = arg1.method1200(class88.field2060, 29903);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method1200(class58.field1492, arg2 ^ 0x74CA);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method1200(class37.field1030, 29903);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.method1200(class83.field2011, 29903);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method1200(class92.field2149, 29903);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.method1200(class98.field2250, 29903);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class150 var9 = class43.field1167;
                                                        if (class22.field647 != null) {
                                                            var9 = class127.method962(class22.field647.field2283, (byte) -117);
                                                            try {
                                                                if (class22.field647.field2282 != null) {
                                                                    byte[] var10 = ((String) class22.field647.field2282).getBytes("ISO-8859-1");
                                                                    var9 = class37.method280(var10, 0, 0, var10.length);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg1 = class111.method786((byte) -111, new class150[] { arg1.method1202(0, var8, arg2 ^ 0x5), var9, arg1.method1196(var8 + 4, arg2 ^ 0xFFFF8390) });
                                                    }
                                                }
                                                arg1 = class111.method786((byte) -115, new class150[] { arg1.method1202(0, var7, 0), class104.method717(class40.method288(-84, arg0, 4), (byte) 118), arg1.method1196(var7 + 2, arg2 ^ 0xFFFF8390) });
                                            }
                                        }
                                        arg1 = class111.method786((byte) -120, new class150[] { arg1.method1202(0, var6, 0), class104.method717(class40.method288(-92, arg0, 3), (byte) 121), arg1.method1196(var6 + 2, arg2 + -31856) });
                                    }
                                }
                                arg1 = class111.method786((byte) 102, new class150[] { arg1.method1202(0, var5, 0), class104.method717(class40.method288(-86, arg0, 2), (byte) 120), arg1.method1196(var5 + 2, arg2 + -31856) });
                            }
                        }
                        arg1 = class111.method786((byte) 71, new class150[] { arg1.method1202(0, var4, 0), class104.method717(class40.method288(-64, arg0, 1), (byte) 111), arg1.method1196(var4 + 2, -31851) });
                    }
                }
                arg1 = class111.method786((byte) -124, new class150[] { arg1.method1202(0, var3, 0), class104.method717(class40.method288(-69, arg0, 0), (byte) 108), arg1.method1196(var3 + 2, arg2 ^ 0xFFFF8390) });
            }
        }
        if (arg2 != 5) {
            method671(null, null, (byte) -75);
        }
        field2204++;
        return arg1;
    }
}
