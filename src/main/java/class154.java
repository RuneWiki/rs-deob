import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class154 {

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "Ldb;")
    private class207 field2436;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "Lcd;")
    private class78 field2432;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "Lqo;")
    private class331 field2437;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "Lvh;")
    public static class62 field2434 = new class62(64);

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2438 = "Loaded update list";

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "Lgj;")
    public static class257 field2439 = new class257();

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "Llf;")
    private class143 field2430;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "Lnk;")
    public static class16 field2428;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "[Lka;")
    private class211[] field2427;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method1119(int arg0) {
        field2435++;
        if (this.field2430 != null) {
            return true;
        }
        if (this.field2437 == null) {
            if (this.field2432.method510(-107)) {
                return false;
            }
            this.field2437 = this.field2432.method511(true, 27702, (byte) 0, 255, 255);
        }
        if (arg0 != -15627) {
            field2439 = (class257) null;
        }
        if (this.field2437.field2683) {
            return false;
        } else {
            this.field2430 = new class143(this.field2437.method1238((byte) -107));
            this.field2427 = new class211[(this.field2430.field2260.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILpj;ZILpj;)Lka;", line = 41)
    private final class211 method1120(int arg0, class205 arg1, boolean arg2, int arg3, class205 arg4) {
        if (arg0 != -17137) {
            return (class211) null;
        }
        field2431++;
        if (this.field2430 == null) {
            throw new RuntimeException();
        }
        this.field2430.field2295 = arg3 * 8 + 5;
        if (this.field2430.field2260.length <= this.field2430.field2295) {
            throw new RuntimeException();
        } else if (this.field2427[arg3] == null) {
            int var6 = this.field2430.method1057(-102);
            int var7 = this.field2430.method1057(arg0 ^ 0x4293);
            class211 var8 = new class211(arg3, arg4, arg1, this.field2432, this.field2436, var6, var7, arg2);
            this.field2427[arg3] = var8;
            return var8;
        } else {
            return this.field2427[arg3];
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V", line = 83)
    public final void method1121(int arg0) {
        field2429++;
        if (this.field2427 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field2427.length; var2++) {
            if (this.field2427[var2] != null) {
                this.field2427[var2].method1478(0);
            }
        }
        for (int var3 = arg0; var3 < this.field2427.length; var3++) {
            if (this.field2427[var3] != null) {
                this.field2427[var3].method1473((byte) -86);
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILdf;I)V", line = 121)
    public static final void method1122(int arg0, class185 arg1, int arg2) {
        field2425++;
        Object[] var3 = arg1.field2789;
        int var4 = (Integer) var3[0];
        class126 var5 = class246.method1752(5439488, var4);
        if (var5 == null) {
            return;
        }
        class41.field447 = new int[var5.field1784];
        class250.field3958 = new String[var5.field1791];
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 1; var8 < var3.length; var8++) {
            if ((var3[var8] instanceof Integer)) {
                int var10 = (Integer) var3[var8];
                if (var10 == -2147483647) {
                    var10 = arg1.field2785;
                }
                if (var10 == -2147483646) {
                    var10 = arg1.field2780;
                }
                if (var10 == -2147483645) {
                    var10 = arg1.field2793 == null ? -1 : arg1.field2793.field5073;
                }
                if (var10 == -2147483644) {
                    var10 = arg1.field2786;
                }
                if (var10 == -2147483643) {
                    var10 = arg1.field2793 == null ? -1 : arg1.field2793.field5112;
                }
                if (var10 == -2147483642) {
                    var10 = arg1.field2791 == null ? -1 : arg1.field2791.field5073;
                }
                if (var10 == -2147483641) {
                    var10 = arg1.field2791 == null ? -1 : arg1.field2791.field5112;
                }
                if (var10 == -2147483640) {
                    var10 = arg1.field2794;
                }
                if (var10 == -2147483639) {
                    var10 = arg1.field2796;
                }
                class41.field447[var7++] = var10;
            } else if (var3[var8] instanceof String) {
                String var9 = (String) var3[var8];
                if (var9.equals("event_opbase")) {
                    var9 = arg1.field2779;
                }
                class250.field3958[var6++] = var9;
            }
        }
        if (arg0 == -2147483644) {
            class176.method1224(arg0 + 2147483644, var5, arg2);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lpj;BILpj;)Lka;", line = 216)
    public final class211 method1123(class205 arg0, byte arg1, int arg2, class205 arg3) {
        if (arg1 > -92) {
            field2438 = (String) null;
        }
        field2440++;
        return this.method1120(-17137, arg0, true, arg2, arg3);
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)V", line = 227)
    public static final void method1124(int arg0) {
        if (arg0 >= -50) {
            method1122(54, (class185) null, 106);
        }
        class328.field5282.method304(248, 19830);
        for (class238 var1 = (class238) class88.field1166.method761(43); var1 != null; var1 = (class238) class88.field1166.method757(-1)) {
            if (var1.field3663 == 0) {
                class178.method1233(true, var1, 58);
            }
        }
        field2433++;
        class337.field5388++;
        if (class13.field126 != null) {
            class107.method693(class13.field126, 6);
            class13.field126 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(I)V", line = 260)
    public static void method1125(int arg0) {
        field2428 = null;
        if (arg0 >= -25) {
            method1125(15);
        }
        field2434 = null;
        field2438 = null;
        field2439 = null;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lcd;Ldb;)V", line = 277)
    public class154(class78 arg0, class207 arg1) {
        this.field2436 = arg1;
        this.field2432 = arg0;
        if (!this.field2432.method510(-124)) {
            this.field2437 = this.field2432.method511(true, 27702, (byte) 0, 255, 255);
        }
    }
}
