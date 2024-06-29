import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class134 {

    @OriginalMember(owner = "client!b", name = "a", descriptor = "J")
    public static long field2329 = 0L;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "Lke;")
    public static class256 field2337 = class316.method2202("", 27626);

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Lke;")
    public static class256 field2334 = class316.method2202("welle:", 27626);

    @OriginalMember(owner = "client!b", name = "j", descriptor = "Lke;")
    public static class256 field2338 = class316.method2202("Verbindung zum Update)2Server hergestellt)3", 27626);

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "Lwi;")
    public static class195 field2335;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "[Lsk;")
    public static class269[] field2332;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)[B", line = 12)
    public static final synchronized byte[] method955(byte arg0, int arg1) {
        field2333++;
        if (arg1 == 100 && class41.field744 > 0) {
            byte[] var2 = class146.field2574[--class41.field744];
            class146.field2574[class41.field744] = null;
            return var2;
        } else if (arg1 == 5000 && class108.field1921 > 0) {
            byte[] var3 = class9.field144[--class108.field1921];
            class9.field144[class108.field1921] = null;
            return var3;
        } else if (arg0 != -9) {
            return (byte[]) null;
        } else if (arg1 == 30000 && class51.field932 > 0) {
            byte[] var4 = class102.field1841[--class51.field932];
            class102.field1841[class51.field932] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V", line = 71)
    public static void method956(boolean arg0) {
        field2335 = null;
        if (arg0) {
            method955((byte) 6, -113);
        }
        field2338 = null;
        field2332 = null;
        field2334 = null;
        field2337 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILra;)V", line = 115)
    public static final void method957(int arg0, class41 arg1) {
        if (arg0 <= 16) {
            field2334 = (class256) null;
        }
        field2339++;
        while (true) {
            while (arg1.field738 < arg1.field772.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method357(false) == 1) {
                    var2 = true;
                    var3 = arg1.method357(false);
                    var4 = arg1.method357(false);
                }
                int var5 = arg1.method357(false);
                int var6 = arg1.method357(false);
                int var7 = var5 * 64 - class313.field5383;
                int var8 = class154.field2753 - (var6 * 64 - class8.field133) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class40.field731 > var7 + 63 && class154.field2753 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var3 * 8 <= var11 && var11 < (var3 * 8 + 8) && var4 * 8 <= var12 && (var4 * 8 + 8) > var12) {
                                byte var13 = arg1.method323(9092);
                                if (var13 != 0) {
                                    if (class196.field3591[var9][var10] == null) {
                                        class196.field3591[var9][var10] = new byte[4096];
                                    }
                                    class196.field3591[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method323(9092);
                                    if (class37.field651[var9][var10] == null) {
                                        class37.field651[var9][var10] = new byte[4096];
                                    }
                                    class37.field651[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method323(9092);
                        if (var16 != 0) {
                            arg1.field738++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V", line = 211)
    public static final void method958(byte arg0) {
        field2330++;
        try {
            if (arg0 <= 105) {
                method956(false);
            }
            if (class83.field1518 == 1) {
                int var1 = class188.field3429.method1923(84);
                if (var1 > 0 && class188.field3429.method1935((byte) 99)) {
                    int var2 = var1 - class93.field1682;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class188.field3429.method1950(16384, var2);
                    return;
                }
                class188.field3429.method1944(13739);
                class188.field3429.method1934(16);
                class196.field3587 = null;
                if (class137.field2391 == null) {
                    class83.field1518 = 0;
                } else {
                    class83.field1518 = 2;
                }
                class165.field2922 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class188.field3429.method1944(13739);
            class83.field1518 = 0;
            class137.field2391 = null;
            class165.field2922 = null;
            class196.field3587 = null;
        }
    }
}
