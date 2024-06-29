import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class104 extends RuntimeException {

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "Ljava/lang/String;")
    public String field1792;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1777;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Lmh;")
    public static class128 field1782 = class22.method156(122, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Lmh;")
    public static class128 field1784 = class22.method156(123, "(Z");

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "[I")
    public static int[] field1776 = new int[4096];

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field1790 = 0;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "Lmh;")
    public static class128 field1789 = class22.method156(127, "n");

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "[I")
    public static int[] field1778 = new int[2000];

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field1780 = -1;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Lmh;")
    public static class128 field1791 = class22.method156(124, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field1786 = -1;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field1788 = 1;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Lmh;")
    public static class128 field1779 = class22.method156(125, "scrollen:");

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Ldj;")
    public static class314 field1781;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[Lem;B)V", line = 12)
    public static final void method640(int arg0, class10[] arg1, byte arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class10 var4 = arg1[var3];
            if (var4 != null && var4.field267 == arg0 && (!var4.field294 || !client.method1646(var4))) {
                if (var4.field288 == 0) {
                    if (!var4.field294 && client.method1646(var4) && class279.field4829 != var4) {
                        continue;
                    }
                    method640(var4.field230, arg1, (byte) 87);
                    if (var4.field348 != null) {
                        method640(var4.field230, var4.field348, (byte) 120);
                    }
                    class88 var5 = (class88) class182.field3198.method728(false, (long) var4.field230);
                    if (var5 != null) {
                        class211.method1455(var5.field1510, -15843);
                    }
                }
                if (var4.field288 == 6) {
                    if (var4.field275 != -1 || var4.field217 != -1) {
                        boolean var6 = class62.method415((byte) -55, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field217;
                        } else {
                            var7 = var4.field275;
                        }
                        if (var7 != -1) {
                            class1 var8 = class167.method1091(-114, var7);
                            if (var8 != null) {
                                var4.field315 += class50.field992;
                                while (var8.field7[var4.field354] < var4.field315) {
                                    var4.field315 -= var8.field7[var4.field354];
                                    var4.field354++;
                                    if (var8.field8.length <= var4.field354) {
                                        var4.field354 -= var8.field26;
                                        if (var4.field354 < 0 || var4.field354 >= var8.field8.length) {
                                            var4.field354 = 0;
                                        }
                                    }
                                    class7.method48(var4, 0);
                                }
                            }
                        }
                    }
                    if (var4.field274 != 0 && !var4.field294) {
                        int var9 = var4.field274 >> 16;
                        int var10 = class50.field992 * var9;
                        int var11 = var4.field274 << 16 >> 16;
                        var4.field231 = var4.field231 + var10 & 0x7FF;
                        int var12 = class50.field992 * var11;
                        var4.field290 = var4.field290 + var12 & 0x7FF;
                        class7.method48(var4, 0);
                    }
                }
            }
        }
        if (arg2 <= 23) {
            field1782 = (class128) null;
        }
        field1787++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI)V", line = 114)
    public static final void method641(boolean arg0, int arg1) {
        class7.field145 = new int[104];
        int var2 = 46 % ((44 - arg1) / 49);
        field1785++;
        class159.field2727 = new int[104];
        class50.field986 = 99;
        byte var3;
        if (arg0) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        class4.field80 = new int[var3][105][105];
        class252.field4355 = new byte[var3][105][105];
        class121.field2048 = new byte[var3][104][104];
        class176.field3101 = new int[104];
        class183.field3205 = new int[104];
        class22.field553 = new byte[var3][104][104];
        class314.field5316 = new int[104];
        class9.field205 = new byte[var3][104][104];
        class157.field2694 = new byte[var3][104][104];
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V", line = 169)
    public static void method642(boolean arg0) {
        field1791 = null;
        field1778 = null;
        field1784 = null;
        field1776 = null;
        if (!arg0) {
            method644(-109, (class154[]) null);
        }
        field1779 = null;
        field1789 = null;
        field1781 = null;
        field1782 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZ)Z", line = 222)
    public static final boolean method643(int arg0, boolean arg1) {
        if (arg1) {
            method643(-32, false);
        }
        field1783++;
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[Lac;)V", line = 235)
    public static final void method644(int arg0, class154[] arg1) {
        class112.field1885[arg0] = arg1;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 240)
    public class104(Throwable arg0, String arg1) {
        this.field1792 = arg1;
        this.field1777 = arg0;
    }
}
