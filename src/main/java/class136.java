import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class136 extends class88 {

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "Lgk;")
    public class159 field1991 = new class159();

    @OriginalMember(owner = "client!wi", name = "I", descriptor = "Lnh;")
    public class55 field2001 = new class55();

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "Lhl;")
    private class40 field1999;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public static int field1987 = -1;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
    public static int field1990 = 0;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "Z")
    public static boolean field1989 = false;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!wi", name = "E", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!wi", name = "F", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "Lpf;")
    public static class294 field1994;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lci;II)V")
    private final void method829(class250 arg0, int arg1, int arg2) {
        field1995++;
        if ((this.field1999.field590[arg0.field3788] & 0x4) != 0 && arg0.field3808 < 0) {
            int var4 = this.field1999.field576[arg0.field3788] / class248.field3764;
            int var5 = (1048575 - (arg0.field3786 - var4)) / var4;
            arg0.field3786 = arg0.field3786 + (arg1 * var4) & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field1999.field543[arg0.field3788] == 0) {
                    arg0.field3805 = class257.method1700(arg0.field3803, arg0.field3805.method1718(), arg0.field3805.method1704(), arg0.field3805.method1716());
                } else {
                    arg0.field3805 = class257.method1700(arg0.field3803, arg0.field3805.method1718(), 0, arg0.field3805.method1716());
                    this.field1999.method240(-124, arg0, arg0.field3787.field2700[arg0.field3791] < 0);
                }
                if (arg0.field3787.field2700[arg0.field3791] < 0) {
                    arg0.field3805.method1711(-1);
                }
                arg1 = arg0.field3786 / var4;
            }
        }
        arg0.field3805.method249(arg1);
        if (arg2 != 13136) {
            this.method265((int[]) null, -39, -106);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "()Lai;")
    public final class88 method270() {
        field1988++;
        class250 var1;
        do {
            var1 = (class250) this.field1991.method985((byte) -117);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3805 == null);
        return var1.field3805;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "([III)V")
    public final void method265(int[] arg0, int arg1, int arg2) {
        field1993++;
        this.field2001.method265(arg0, arg1, arg2);
        for (class250 var4 = (class250) this.field1991.method983(7); var4 != null; var4 = (class250) this.field1991.method985((byte) -119)) {
            if (!this.field1999.method262(var4, -1)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3792) {
                        this.method831((byte) 66, var4, arg0, var6, var5 + var6, var5);
                        var4.field3792 -= var6;
                        break;
                    }
                    this.method831((byte) 66, var4, arg0, var4.field3792, var5 + var6, var5);
                    var5 += var4.field3792;
                    var6 -= var4.field3792;
                } while (!this.field1999.method255(arg0, (byte) -80, var6, var5, var4));
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "(I)V")
    public static void method830(int arg0) {
        field1994 = null;
        if (arg0 != -22788) {
            field1998 = -123;
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "()Lai;")
    public final class88 method257() {
        class250 var1 = (class250) this.field1991.method983(7);
        field1992++;
        if (var1 == null) {
            return null;
        } else if (var1.field3805 == null) {
            return this.method270();
        } else {
            return var1.field3805;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLci;[IIII)V")
    private final void method831(byte arg0, class250 arg1, int[] arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 66) {
            method830(115);
        }
        field1997++;
        if ((this.field1999.field590[arg1.field3788] & 0x4) != 0 && arg1.field3808 < 0) {
            int var7 = this.field1999.field576[arg1.field3788] / class248.field3764;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field3786) / var7;
                if (var8 > arg3) {
                    arg1.field3786 += arg3 * var7;
                    break;
                }
                arg3 -= var8;
                arg1.field3805.method265(arg2, arg5, var8);
                int var9 = class248.field3764 / 100;
                class257 var10 = arg1.field3805;
                arg5 += var8;
                arg1.field3786 += var7 * var8 - 1048576;
                int var11 = 262144 / var7;
                if (var11 < var9) {
                    var9 = var11;
                }
                if (this.field1999.field543[arg1.field3788] == 0) {
                    arg1.field3805 = class257.method1700(arg1.field3803, var10.method1718(), var10.method1704(), var10.method1716());
                } else {
                    arg1.field3805 = class257.method1700(arg1.field3803, var10.method1718(), 0, var10.method1716());
                    this.field1999.method240(arg0 ^ 0xFFFFFFC3, arg1, arg1.field3787.field2700[arg1.field3791] < 0);
                    arg1.field3805.method1723(var9, var10.method1704());
                }
                if (arg1.field3787.field2700[arg1.field3791] < 0) {
                    arg1.field3805.method1711(-1);
                }
                var10.method1719(var9);
                var10.method265(arg2, arg5, arg4 - arg5);
                if (var10.method1706()) {
                    this.field2001.method373(var10);
                }
            }
        }
        arg1.field3805.method265(arg2, arg5, arg3);
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "()I")
    public final int method273() {
        field2000++;
        return 0;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lhl;)V")
    public class136(class40 arg0) {
        this.field1999 = arg0;
    }

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "(I)V")
    public final void method249(int arg0) {
        this.field2001.method249(arg0);
        for (class250 var2 = (class250) this.field1991.method983(7); var2 != null; var2 = (class250) this.field1991.method985((byte) 103)) {
            if (!this.field1999.method262(var2, -1)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3792) {
                        this.method829(var2, var3, 13136);
                        var2.field3792 -= var3;
                        break;
                    }
                    this.method829(var2, var2.field3792, 13136);
                    var3 -= var2.field3792;
                } while (!this.field1999.method255((int[]) null, (byte) -80, var3, 0, var2));
            }
        }
        field1996++;
    }
}
