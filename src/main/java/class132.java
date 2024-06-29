import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class132 {

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public int field1983 = 0;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public int field1996 = 0;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "Z")
    private boolean field1984 = false;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field1988 = new String[5];

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "Lbu;")
    public static class21 field1990 = new class21(70, 0);

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public int field1981;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public int field1985;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public int field1987;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    public int field1989;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    private int field1991;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    public int field1992;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public int field1993;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
    public int field1997;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public int field1999;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public int field2002;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "J")
    public long field1998;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "Lhu;")
    public static class141 field1994;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "[Ljd;")
    public static class241[] field1980;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 16)
    public static void method974(int arg0) {
        field1980 = null;
        if (arg0 == 1) {
            field1990 = null;
            field1988 = null;
            field1994 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lso;I)V", line = 30)
    public final void method975(class494 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2964((byte) 88);
            if (var3 == 0) {
                if (arg1 != 18327) {
                    method977();
                }
                field1995++;
                return;
            }
            this.method976(arg0, var3, 1);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lso;II)V", line = 50)
    private final void method976(class494 arg0, int arg1, int arg2) {
        field2001++;
        if (arg1 == arg2) {
            this.field1991 = arg0.method2998(true);
        } else if (arg1 == 2) {
            arg0.method2964((byte) 53);
        } else if (arg1 == 3) {
            this.field1993 = arg0.method2976(arg2 - 129);
            this.field1989 = arg0.method2976(-127);
            this.field1981 = arg0.method2976(-124);
        } else if (arg1 == 4) {
            this.field1985 = arg0.method2964((byte) 60);
            this.field1987 = arg0.method2976(-127);
        } else if (arg1 == 6) {
            this.field1999 = arg0.method2964((byte) 75);
        } else if (arg1 == 8) {
            this.field1983 = 1;
        } else if (arg1 == 9) {
            this.field1996 = 1;
        } else if (arg1 == 10) {
            this.field1984 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "()V", line = 114)
    public static final void method977() {
        for (int var0 = class126.field1953; var0 < class562.field7990; var0++) {
            for (int var1 = 0; var1 < class81.field902; var1++) {
                for (int var2 = 0; var2 < class48.field615; var2++) {
                    class46 var3 = class767.field10562[var0][var1][var2];
                    if (var3 != null) {
                        class613 var4 = var3.field582;
                        class613 var5 = var3.field589;
                        if (var4 != null && var4.method910(true)) {
                            class516.method3111(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method910(true)) {
                                class516.method3111(var5, var0, var1, var2, 1, 1);
                                var5.method905(false, var4, 0, 0, 0, class228.field3494, 0);
                                var5.method903(-772);
                            }
                            var4.method903(-772);
                        }
                        for (class48 var6 = var3.field586; var6 != null; var6 = var6.field611) {
                            class672 var8 = var6.field605;
                            if (var8 != null && var8.method910(true)) {
                                class516.method3111(var8, var0, var1, var2, var8.field9371 + 1 - var8.field9368, var8.field9360 - var8.field9364 + 1);
                                var8.method903(-772);
                            }
                        }
                        class399 var7 = var3.field587;
                        if (var7 != null && var7.method910(true)) {
                            class243.method1619(var7, var0, var1, var2);
                            var7.method903(-772);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V", line = 189)
    public final void method978(boolean arg0) {
        field2000++;
        this.field1992 = class376.field5188[this.field1991 << 3];
        long var2 = (long) this.field1993;
        long var4 = (long) this.field1989;
        if (arg0) {
            method977();
        }
        long var6 = (long) this.field1981;
        this.field1997 = (int) Math.sqrt((double) (var6 * var6 + var2 * var2 + var4 * var4));
        if (this.field1987 == 0) {
            this.field1987 = 1;
        }
        if (this.field1985 == 0) {
            this.field1998 = 2147483647L;
        } else if (this.field1985 == 1) {
            this.field1998 = (this.field1997 * 8 / this.field1987);
            this.field1998 *= this.field1998;
        } else if (this.field1985 == 2) {
            this.field1998 = (this.field1997 * 8 / this.field1987);
        }
        if (this.field1984) {
            this.field1997 *= -1;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)Z", line = 233)
    public static final boolean method979(int arg0, int arg1, int arg2) {
        field1982++;
        if (arg0 == 2048) {
            return (arg2 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V", line = 244)
    public static final void method980(int arg0) {
        if (arg0 >= -114) {
            method979(-60, -110, 17);
        }
        field2003++;
        for (class244 var1 = (class244) class87.field961.method2243((byte) 100); var1 != null; var1 = (class244) class87.field961.method2248(-15690)) {
            class13.method140(-257, var1.field3628);
        }
    }
}
