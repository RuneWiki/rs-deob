import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class289 {

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "Lwi;")
    private class330 field4221 = new class330(128);

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "Lwi;")
    public class330 field4233 = new class330(64);

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "Luu;")
    private class191 field4232;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "Luu;")
    public class191 field4220;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "[I")
    public static int[] field4225 = new int[2];

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Lla;")
    public static class319 field4217 = new class319(40, 8);

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "[[I")
    public static int[][] field4230 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "F")
    public static float field4231;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
    public final void method1847(boolean arg0) {
        if (arg0) {
            field4217 = null;
        }
        class330 var2 = this.field4221;
        synchronized (this.field4221) {
            this.field4221.method2127((byte) -67);
        }
        field4219++;
        class330 var3 = this.field4233;
        synchronized (this.field4233) {
            this.field4233.method2127((byte) 125);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIII)V")
    public static final void method1848(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4216++;
        if (arg1 != 6) {
            field4230 = null;
        }
        for (class179 var5 = (class179) class86.field1251.method445(33); var5 != null; var5 = (class179) class86.field1251.method451(false)) {
            class76.method531((byte) -103, arg3, arg0, var5, arg2, arg4);
        }
        for (class179 var6 = (class179) class86.field1254.method445(33); var6 != null; var6 = (class179) class86.field1254.method451(false)) {
            byte var11 = 1;
            class485 var12 = var6.field2388.method1759(arg1 - 133);
            if (var6.field2388.field3829) {
                var11 = 0;
            } else if (var6.field2388.field3839 == var12.field7140 || var6.field2388.field3839 == var12.field7172 || var6.field2388.field3839 == var12.field7144 || var6.field2388.field3839 == var12.field7182) {
                var11 = 2;
            } else if (var6.field2388.field3839 == var12.field7164 || var6.field2388.field3839 == var12.field7166 || var6.field2388.field3839 == var12.field7171 || var6.field2388.field3839 == var12.field7186) {
                var11 = 3;
            }
            if (var6.field2397 != var11) {
                int var13 = class221.method1487(-1, var6.field2388);
                if (var6.field2401 != var13) {
                    if (var6.field2400 != null) {
                        class31.field463.method883(var6.field2400);
                        var6.field2400 = null;
                    }
                    var6.field2401 = var13;
                }
                var6.field2397 = var11;
            }
            var6.field2394 = var6.field2388.field1867;
            var6.field2404 = var6.field2388.field1867 + (var6.field2388.method637((byte) -19) << 6);
            var6.field2392 = var6.field2388.field1862;
            var6.field2403 = var6.field2388.field1862 + (var6.field2388.method637((byte) 40) << 6);
            class76.method531((byte) -103, arg3, arg0, var6, arg2, arg4);
        }
        for (class179 var7 = (class179) class424.field6459.method1743(false); var7 != null; var7 = (class179) class424.field6459.method1742(-66)) {
            byte var8 = 1;
            class485 var9 = var7.field2386.method1759(46);
            if (var7.field2386.field3829) {
                var8 = 0;
            } else if (var7.field2386.field3839 == var9.field7140 || var7.field2386.field3839 == var9.field7172 || var7.field2386.field3839 == var9.field7144 || var7.field2386.field3839 == var9.field7182) {
                var8 = 2;
            } else if (var7.field2386.field3839 == var9.field7164 || var7.field2386.field3839 == var9.field7166 || var7.field2386.field3839 == var9.field7171 || var7.field2386.field3839 == var9.field7186) {
                var8 = 3;
            }
            if (var7.field2397 != var8) {
                int var10 = class170.method1160(-111, var7.field2386);
                if (var7.field2401 != var10) {
                    if (var7.field2400 != null) {
                        class31.field463.method883(var7.field2400);
                        var7.field2400 = null;
                    }
                    var7.field2401 = var10;
                }
                var7.field2397 = var8;
            }
            var7.field2394 = var7.field2386.field1867;
            var7.field2404 = var7.field2386.field1867 + (var7.field2386.method637((byte) -96) << 6);
            var7.field2392 = var7.field2386.field1862;
            var7.field2403 = var7.field2386.field1862 + (var7.field2386.method637((byte) 6) << 6);
            class76.method531((byte) -103, arg3, arg0, var7, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)V")
    public static final void method1849(int arg0, int arg1, int arg2, int arg3) {
        class178.field2382 = new byte[arg0][arg2][arg1];
        field4223++;
        if (arg3 > -111) {
            field4231 = -1.9628537F;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V")
    public final void method1850(int arg0, int arg1, int arg2) {
        field4227++;
        if (arg2 != 5) {
            field4225 = null;
        }
        this.field4221 = new class330(arg0);
        this.field4233 = new class330(arg1);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)Lmk;")
    public final class38 method1851(int arg0, int arg1) {
        field4218++;
        class330 var3 = this.field4221;
        class38 var4;
        synchronized (this.field4221) {
            var4 = (class38) this.field4221.method2133((long) arg1, (byte) 82);
        }
        if (var4 != null) {
            return var4;
        }
        class191 var5 = this.field4232;
        byte[] var6;
        synchronized (this.field4232) {
            var6 = this.field4232.method1281(arg0, arg1, 90);
        }
        class38 var7 = new class38();
        var7.field558 = this;
        var7.field563 = arg1;
        if (var6 != null) {
            var7.method325(new class164(var6), 0);
        }
        var7.method319((byte) 127);
        class330 var8 = this.field4221;
        synchronized (this.field4221) {
            this.field4221.method2131(var7, (long) arg1, false);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/lang/String;II)Z")
    public static final boolean method1852(String arg0, int arg1, int arg2) {
        if (arg1 < 17) {
            field4225 = null;
        }
        field4226++;
        if (class500.field7379 != 3) {
            class139.field1851 = new class195();
            class139.field1851.field2603 = arg0;
            class139.field1851.field2602 = arg2;
            if (class476.field7072 != class116.field1601) {
                class139.field1851.field2611 = class139.field1851.field2602 + 50000;
                class139.field1851.field2606 = class139.field1851.field2602 + 40000;
            }
            return true;
        }
        String var3 = "";
        if (class476.field7072 != class116.field1601) {
            var3 = ":" + (arg2 + 7000);
        }
        String var4 = "";
        if (class407.field6188 != null) {
            var4 = "/p=" + class407.field6188;
        }
        String var5 = "http://" + arg0 + var3 + "/l=" + class257.field3556 + "/a=" + class331.field5167 + var4 + "/j" + (class211.field2989 ? "1" : "0") + ",o" + (class37.field529 ? "1" : "0") + ",a2";
        try {
            class168.field2261.getAppletContext().showDocument(new URL(var5), "_self");
            return true;
        } catch (Exception var6) {
            return false;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)V")
    public final void method1853(int arg0, int arg1) {
        field4229++;
        class330 var3 = this.field4221;
        synchronized (this.field4221) {
            this.field4221.method2140(-127, arg1);
        }
        class330 var4 = this.field4233;
        synchronized (this.field4233) {
            this.field4233.method2140(-128, arg1);
        }
        if (arg0 != 7) {
            field4225 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    public static void method1854(byte arg0) {
        field4230 = null;
        int var1 = 78 % ((arg0 + 56) / 49);
        field4225 = null;
        field4217 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static final void method1855(int arg0) {
        class178.field2378 = false;
        field4222++;
        class129.field1744 = null;
        if (arg0 == 9) {
            class141.method950(0);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
    public final void method1856(byte arg0) {
        field4224++;
        if (arg0 != 95) {
            return;
        }
        class330 var2 = this.field4221;
        synchronized (this.field4221) {
            this.field4221.method2135(arg0 - 95);
        }
        class330 var3 = this.field4233;
        synchronized (this.field4233) {
            this.field4233.method2135(0);
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Liv;ILuu;Luu;)V")
    public class289(class65 arg0, int arg1, class191 arg2, class191 arg3) {
        this.field4232 = arg2;
        this.field4220 = arg3;
        this.field4232.method1290(false, 36);
    }
}
