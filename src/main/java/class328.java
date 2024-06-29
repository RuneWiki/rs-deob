import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class328 extends class308 {

    @OriginalMember(owner = "client!jm", name = "M", descriptor = "[I")
    public static int[] field5368 = new int[1000];

    @OriginalMember(owner = "client!jm", name = "H", descriptor = "Z")
    public static boolean field5363 = false;

    @OriginalMember(owner = "client!jm", name = "J", descriptor = "[I")
    public static int[] field5365 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!jm", name = "S", descriptor = "[J")
    public static long[] field5374 = new long[200];

    @OriginalMember(owner = "client!jm", name = "N", descriptor = "I")
    public static int field5369 = 0;

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!jm", name = "C", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!jm", name = "D", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!jm", name = "F", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!jm", name = "G", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!jm", name = "I", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!jm", name = "O", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!jm", name = "Q", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!jm", name = "T", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!jm", name = "P", descriptor = "Lnm;")
    public static class221 field5371;

    @OriginalMember(owner = "client!jm", name = "R", descriptor = "Ljava/lang/String;")
    public String field5373;

    @OriginalMember(owner = "client!jm", name = "B", descriptor = "[C")
    public char[] field5358;

    @OriginalMember(owner = "client!jm", name = "K", descriptor = "[C")
    public char[] field5366;

    @OriginalMember(owner = "client!jm", name = "A", descriptor = "[I")
    public int[] field5357;

    @OriginalMember(owner = "client!jm", name = "L", descriptor = "[I")
    public int[] field5367;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IC)I", line = 6)
    public final int method2334(int arg0, char arg1) {
        field5359++;
        if (this.field5357 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field5357.length; var3++) {
            if (this.field5366[var3] == arg1) {
                return this.field5357[var3];
            }
        }
        if (arg0 != -1) {
            method2341((byte) 16);
        }
        return -1;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(CI)I", line = 34)
    public final int method2335(char arg0, int arg1) {
        field5375++;
        if (this.field5367 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field5367.length; var3++) {
            if (this.field5358[var3] == arg0) {
                return this.field5367[var3];
            }
        }
        if (arg1 != 28) {
            this.field5358 = (char[]) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLfh;I)V", line = 58)
    private final void method2336(byte arg0, class313 arg1, int arg2) {
        if (arg2 == 1) {
            this.field5373 = arg1.method2198(-430);
        } else if (arg2 == 2) {
            int var7 = arg1.method2224(-122);
            this.field5366 = new char[var7];
            this.field5357 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field5357[var8] = arg1.method2250(-1613178296);
                byte var9 = arg1.method2200(88);
                this.field5366[var8] = var9 == 0 ? 0 : class121.method782(false, var9);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method2224(-120);
            this.field5367 = new int[var4];
            this.field5358 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5367[var5] = arg1.method2250(-1613178296);
                byte var6 = arg1.method2200(-81);
                this.field5358[var5] = var6 == 0 ? 0 : class121.method782(false, var6);
            }
        } else if (arg2 == 4) {
        }
        if (arg0 >= -84) {
            field5362 = 70;
        }
        field5364++;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZBI)I", line = 122)
    public static final int method2337(int arg0, boolean arg1, byte arg2, int arg3) {
        class220 var4 = (class220) class294.field4888.method29((long) arg0, 103);
        if (arg2 <= 97) {
            return 18;
        }
        field5372++;
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field3377.length; var6++) {
            if (var4.field3377[var6] >= 0 && var4.field3377[var6] < class6.field82) {
                class109 var7 = class322.method2311(var4.field3377[var6], -110);
                if (var7.field1554 != null) {
                    class94 var8 = (class94) var7.field1554.method29((long) arg3, 103);
                    if (var8 != null) {
                        if (arg1) {
                            var5 += var4.field3375[var6] * var8.field1373;
                        } else {
                            var5 += var8.field1373;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lfh;I)V", line = 177)
    public final void method2338(class313 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2224(-119);
            if (var3 == 0) {
                if (arg1 < 65) {
                    field5362 = 76;
                }
                field5370++;
                return;
            }
            this.method2336((byte) -102, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)V", line = 197)
    public final void method2339(byte arg0) {
        field5361++;
        if (this.field5367 != null) {
            for (int var2 = 0; var2 < this.field5367.length; var2++) {
                this.field5367[var2] = class167.method1160(this.field5367[var2], 32768);
            }
        }
        if (arg0 > -120) {
            method2337(3, true, (byte) 47, 95);
        }
        if (this.field5357 != null) {
            for (int var3 = 0; var3 < this.field5357.length; var3++) {
                this.field5357[var3] = class167.method1160(this.field5357[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIII)V", line = 228)
    public static final void method2340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != -1) {
            return;
        }
        int var7 = 0;
        class281[] var8 = class165.field2602;
        while (var7 < var8.length) {
            class281 var9 = var8[var7];
            if (var9 != null && var9.field4622 == 2) {
                class293.method2085(arg1, (var9.field4618 - class215.field3313 << 7) + var9.field4621, var9.field4620 * 2, arg6, arg5 >> 1, arg0 + 513, arg3 >> 1, (var9.field4617 - class150.field2420 << 7) + var9.field4626);
                if (class7.field85 > -1 && (class58.field875 % 20) < 10) {
                    class243.field3837[var9.field4619].method945(class7.field85 + arg4 - 12, arg2 - -class246.field3915 - 28);
                }
            }
            var7++;
        }
        field5356++;
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(B)V", line = 258)
    public static void method2341(byte arg0) {
        field5368 = null;
        field5371 = null;
        field5365 = null;
        field5374 = null;
        if (arg0 < 22) {
            field5374 = (long[]) null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(JI)V", line = 273)
    public static final void method2342(long arg0, int arg1) {
        field5360++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 != 138) {
            field5363 = false;
        }
        for (int var3 = 0; var3 < class339.field5458; var3++) {
            if (field5374[var3] == arg0) {
                class287.field4754++;
                class339.field5458--;
                for (int var4 = var3; var4 < class339.field5458; var4++) {
                    class31.field476[var4] = class31.field476[var4 + 1];
                    class248.field3931[var4] = class248.field3931[var4 + 1];
                    class236.field3736[var4] = class236.field3736[var4 + 1];
                    field5374[var4] = field5374[var4 + 1];
                    class21.field260[var4] = class21.field260[var4 + 1];
                    class296.field4909[var4] = class296.field4909[var4 + 1];
                }
                class246.field3916 = class12.field157;
                class195.field2992.method250(21066, 138);
                class195.field2992.method2228(arg0, true);
                break;
            }
        }
    }
}
