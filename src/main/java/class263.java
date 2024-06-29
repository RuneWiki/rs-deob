import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class263 implements Runnable {

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "Llc;")
    private class86 field4173 = new class86();

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public int field4184 = 0;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "Z")
    private boolean field4186 = false;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field4185;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "[I")
    public static int[] field4176 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "Lam;")
    public static class180 field4181 = new class180();

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4188 = "Created gameworld";

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4187 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "Lub;")
    public static class91 field4174;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[Lre;I)V")
    public static final void method1772(int arg0, class228[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class228 var4 = arg1[var3];
            if (var4 != null && var4.field3467 == arg0 && (!var4.field3520 || !client.method1046(var4))) {
                if (var4.field3477 == 0) {
                    if (!var4.field3520 && client.method1046(var4) && class209.field3258 != var4) {
                        continue;
                    }
                    method1772(var4.field3480, arg1, -124);
                    if (var4.field3498 != null) {
                        method1772(var4.field3480, var4.field3498, -115);
                    }
                    class251 var5 = (class251) class127.field2007.method285((long) var4.field3480, 13821);
                    if (var5 != null) {
                        class111.method789(127, var5.field4041);
                    }
                }
                if (var4.field3477 == 6) {
                    if (var4.field3504 != -1 || var4.field3483 != -1) {
                        boolean var6 = class155.method1038(var4, (byte) 5);
                        int var7;
                        if (var6) {
                            var7 = var4.field3483;
                        } else {
                            var7 = var4.field3504;
                        }
                        if (var7 != -1) {
                            class30 var8 = class148.method996(-72, var7);
                            if (var8 != null) {
                                var4.field3580 += class84.field1413;
                                while (var8.field423[var4.field3598] < var4.field3580) {
                                    var4.field3580 -= var8.field423[var4.field3598];
                                    var4.field3598++;
                                    if (var4.field3598 >= var8.field439.length) {
                                        var4.field3598 -= var8.field418;
                                        if (var4.field3598 < 0 || var4.field3598 >= var8.field439.length) {
                                            var4.field3598 = 0;
                                        }
                                    }
                                    var4.field3538 = var4.field3598 + 1;
                                    if (var8.field439.length <= var4.field3538) {
                                        var4.field3538 -= var8.field418;
                                        if (var4.field3538 < 0 || var4.field3538 >= var8.field439.length) {
                                            var4.field3538 = -1;
                                        }
                                    }
                                    class82.method591(var4, false);
                                }
                            }
                        }
                    }
                    if (var4.field3540 != 0 && !var4.field3520) {
                        int var9 = var4.field3540 >> 16;
                        int var10 = class84.field1413 * var9;
                        var4.field3614 = var4.field3614 + var10 & 0x7FF;
                        int var11 = var4.field3540 << 16 >> 16;
                        int var12 = class84.field1413 * var11;
                        var4.field3618 = var4.field3618 + var12 & 0x7FF;
                        class82.method591(var4, false);
                    }
                }
            }
        }
        field4178++;
        if (arg2 > -86) {
            method1775((String) null, true, (byte) -10);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public static void method1773(int arg0) {
        field4176 = null;
        field4181 = null;
        if (arg0 != 2047) {
            field4181 = null;
        }
        field4188 = null;
        field4174 = null;
        field4187 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IILuh;)Lga;")
    public final class174 method1774(int arg0, int arg1, class103 arg2) {
        if (arg1 != 21919) {
            this.method1778((byte) 52, -99, (byte[]) null, (class103) null);
        }
        class174 var4 = new class174();
        field4171++;
        var4.field2750 = 1;
        class86 var5 = this.field4173;
        synchronized (this.field4173) {
            class174 var6 = (class174) this.field4173.method607((byte) 119);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field273 && var6.field2747 == arg2 && var6.field2750 == 2) {
                    var4.field2744 = var6.field2744;
                    var4.field2377 = false;
                    return var4;
                }
                var6 = (class174) this.field4173.method611((byte) -2);
            }
        }
        var4.field2744 = arg2.method749(true, arg0);
        var4.field2387 = true;
        var4.field2377 = false;
        return var4;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
    public static final void method1775(String arg0, boolean arg1, byte arg2) {
        field4183++;
        int var3 = 0;
        String var4 = arg0.toLowerCase();
        short[] var5 = new short[16];
        for (int var6 = 0; var6 < class31.field461; var6++) {
            class72 var9 = class85.method602(false, var6);
            if ((!arg1 || var9.field1190) && var9.field1168 == -1 && var9.field1191 == -1 && var9.field1223 == 0 && var9.field1176.toLowerCase().indexOf(var4) != -1) {
                if (var3 >= 250) {
                    class292.field4594 = null;
                    class39.field557 = -1;
                    return;
                }
                if (var5.length <= var3) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var3; var11++) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var3++] = (short) var6;
            }
        }
        class292.field4594 = var5;
        if (arg2 > -113) {
            method1777((StringBuffer) null, -37, 'T', -89);
        }
        class39.field557 = var3;
        class148.field2339 = 0;
        String[] var7 = new String[class39.field557];
        for (int var8 = 0; var8 < class39.field557; var8++) {
            var7[var8] = class85.method602(false, var5[var8]).field1176;
        }
        class143.method961(class292.field4594, (byte) -123, var7);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
    public final void method1776(int arg0) {
        field4177++;
        this.field4186 = true;
        if (arg0 != 2047) {
            field4174 = null;
        }
        class86 var2 = this.field4173;
        synchronized (this.field4173) {
            this.field4173.notifyAll();
        }
        try {
            this.field4185.join();
        } catch (InterruptedException var3) {
        }
        this.field4185 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/StringBuffer;ICI)Ljava/lang/StringBuffer;")
    public static final StringBuffer method1777(StringBuffer arg0, int arg1, char arg2, int arg3) {
        field4175++;
        int var4 = arg0.length();
        arg0.setLength(arg1);
        int var5 = var4;
        if (arg3 != 1) {
            method1773(75);
        }
        while (var5 < arg1) {
            arg0.setCharAt(var5, arg2);
            var5++;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI[BLuh;)Lga;")
    public final class174 method1778(byte arg0, int arg1, byte[] arg2, class103 arg3) {
        field4182++;
        class174 var5 = new class174();
        var5.field273 = (long) arg1;
        var5.field2747 = arg3;
        var5.field2387 = false;
        var5.field2750 = 2;
        if (arg0 != 73) {
            method1777((StringBuffer) null, -46, (char) 65447, 15);
        }
        var5.field2744 = arg2;
        this.method1779(var5, -1);
        return var5;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lga;I)V")
    private final void method1779(class174 arg0, int arg1) {
        if (arg1 != -1) {
            method1777((StringBuffer) null, 44, (char) 65430, -94);
        }
        field4179++;
        class86 var3 = this.field4173;
        synchronized (this.field4173) {
            this.field4173.method604(arg0, -105);
            this.field4184++;
            this.field4173.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ii", name = "run", descriptor = "()V")
    public final void run() {
        field4180++;
        while (!this.field4186) {
            class86 var1 = this.field4173;
            class174 var2;
            synchronized (this.field4173) {
                var2 = (class174) this.field4173.method605(0);
                if (var2 == null) {
                    try {
                        this.field4173.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4184--;
            }
            try {
                if (var2.field2750 == 2) {
                    var2.field2747.method744(var2.field2744.length, (int) var2.field273, 48, var2.field2744);
                } else if (var2.field2750 == 3) {
                    var2.field2744 = var2.field2747.method749(true, (int) var2.field273);
                }
            } catch (Exception var6) {
                class168.method1130((String) null, var6, -101);
            }
            var2.field2377 = false;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZILuh;)Lga;")
    public final class174 method1780(boolean arg0, int arg1, class103 arg2) {
        field4172++;
        class174 var4 = new class174();
        if (!arg0) {
            method1773(-106);
        }
        var4.field2747 = arg2;
        var4.field273 = (long) arg1;
        var4.field2750 = 3;
        var4.field2387 = false;
        this.method1779(var4, -1);
        return var4;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
    public class263() {
        class76 var1 = class179.field2788.method257(5, this, (byte) -13);
        while (var1.field1255 == 0) {
            class150.method1011((byte) 41, 10L);
        }
        if (var1.field1255 == 2) {
            throw new RuntimeException();
        }
        this.field4185 = (Thread) var1.field1258;
    }
}
