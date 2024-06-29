import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class124 {

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "[Ltg;")
    private class295[] field1735;

    @OriginalMember(owner = "client!nq", name = "p", descriptor = "I")
    private int field1741;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
    public static int field1727 = 0;

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "I")
    public static int field1733 = -1;

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "I")
    public static int field1731 = 16777215;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!nq", name = "m", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!nq", name = "n", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!nq", name = "o", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!nq", name = "l", descriptor = "J")
    private long field1737;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "Ltg;")
    private class295 field1730;

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "Lrk;")
    public static class427 field1742;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)Ltg;")
    public final class295 method966(byte arg0) {
        field1732++;
        if (this.field1730 == null) {
            return null;
        } else if (arg0 > -1) {
            return null;
        } else {
            class295 var2 = this.field1735[(int) ((long) (this.field1741 - 1) & this.field1737)];
            while (this.field1730 != var2) {
                if (this.field1730.field3984 == this.field1737) {
                    class295 var3 = this.field1730;
                    this.field1730 = this.field1730.field3979;
                    return var3;
                }
                this.field1730 = this.field1730.field3979;
            }
            this.field1730 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method967(int arg0, int arg1, String arg2) {
        field1728++;
        boolean var3 = false;
        for (int var4 = arg0; var4 < class174.field2579; var4++) {
            class338 var5 = class220.field3044[class134.field1921[var4]];
            if (var5 != null && var5.field4577 != null && var5.field4577.equalsIgnoreCase(arg2)) {
                if (arg1 == 1) {
                    class200.field2848++;
                    class355.field4828.method1801(149, (byte) -85);
                    class355.field4828.method1869((byte) -60, class134.field1921[var4]);
                    class355.field4828.method1872((byte) 54, 0);
                } else if (arg1 == 4) {
                    class401.field5605++;
                    class355.field4828.method1801(237, (byte) -113);
                    class355.field4828.method1864(128, 0);
                    class355.field4828.method1834(class134.field1921[var4], (byte) -119);
                } else if (arg1 == 5) {
                    class390.field5470++;
                    class355.field4828.method1801(26, (byte) -118);
                    class355.field4828.method1824(103, 0);
                    class355.field4828.method1877(true, class134.field1921[var4]);
                } else if (arg1 == 6) {
                    class355.field4828.method1801(184, (byte) -56);
                    class77.field1160++;
                    class355.field4828.method1874(class134.field1921[var4], 81);
                    class355.field4828.method1872((byte) 54, 0);
                } else if (arg1 == 7) {
                    class355.field4828.method1801(177, (byte) -48);
                    class187.field2699++;
                    class355.field4828.method1872((byte) 54, 0);
                    class355.field4828.method1874(class134.field1921[var4], 26);
                }
                var3 = true;
                break;
            }
        }
        if (!var3) {
            class289.method1838(-754415328, class233.field3206 + arg2);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V")
    public static void method968(int arg0) {
        field1742 = null;
        if (arg0 != 4) {
            method971(35, 12, false, -99);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ltg;JZ)V")
    public final void method969(class295 arg0, long arg1, boolean arg2) {
        field1738++;
        if (arg0.field3980 != null) {
            arg0.method1902(32);
        }
        class295 var5 = this.field1735[(int) ((long) (this.field1741 - 1) & arg1)];
        arg0.field3980 = var5.field3980;
        arg0.field3979 = var5;
        arg0.field3980.field3979 = arg0;
        if (arg2) {
            arg0.field3979.field3980 = arg0;
            arg0.field3984 = arg1;
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)V")
    public static final void method970(byte arg0) {
        field1734++;
        if (arg0 != -6) {
            return;
        }
        if (class148.field2271 <= 0) {
            class421.field5896 = "";
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class77.field1161.length; var2++) {
            if (class77.field1161[var2].startsWith("--> ")) {
                var1++;
                if (class148.field2271 == var1) {
                    class421.field5896 = class77.field1161[var2].substring(4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIZI)V")
    public static final void method971(int arg0, int arg1, boolean arg2, int arg3) {
        field1726++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class373.field5246 = arg2;
        if (arg1 > -119) {
            method967(116, -12, (String) null);
        }
        class413.field5774 = arg3;
        class436.field6227 = arg0;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZJ)Ltg;")
    public final class295 method972(boolean arg0, long arg1) {
        this.field1737 = arg1;
        field1729++;
        class295 var4 = this.field1735[(int) (arg1 & (long) (this.field1741 - 1))];
        for (this.field1730 = var4.field3979; this.field1730 != var4; this.field1730 = this.field1730.field3979) {
            if (this.field1730.field3984 == arg1) {
                class295 var5 = this.field1730;
                this.field1730 = this.field1730.field3979;
                return var5;
            }
        }
        if (arg0) {
            return null;
        } else {
            this.field1730 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(I)V")
    public class124(int arg0) {
        this.field1735 = new class295[arg0];
        this.field1741 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class295 var3 = this.field1735[var2] = new class295();
            var3.field3980 = var3;
            var3.field3979 = var3;
        }
    }
}
