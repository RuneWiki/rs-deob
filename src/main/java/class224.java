import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class224 implements class250 {

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "[Lqh;")
    public static class47[] field3450 = new class47[2048];

    @OriginalMember(owner = "client!rq", name = "k", descriptor = "[[I")
    public static int[][] field3454 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field3452 = new String[100];

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public int field3444;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public int field3445;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public int field3446;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
    public int field3451;

    @OriginalMember(owner = "client!rq", name = "l", descriptor = "I")
    public int field3455;

    @OriginalMember(owner = "client!rq", name = "m", descriptor = "I")
    public int field3456;

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "Z")
    public boolean field3453;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)J", line = 6)
    public final long method1357(byte arg0) {
        field3449++;
        long[] var2 = class483.field7371;
        if (arg0 != 119) {
            this.method1359((byte) -97, null);
        }
        long var3 = -1L;
        long var5 = var2[(int) ((var3 ^ (long) this.field3456) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var5 >>> 8 ^ var2[(int) ((var5 ^ (long) (this.field3451 >> 8)) & 0xFFL)];
        long var9 = var2[(int) ((var7 ^ (long) this.field3451) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var2[(int) ((var9 ^ (long) (this.field3455 >> 24)) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var11 >>> 8 ^ var2[(int) (((long) (this.field3455 >> 16) ^ var11) & 0xFFL)];
        long var15 = var13 >>> 8 ^ var2[(int) (((long) (this.field3455 >> 8) ^ var13) & 0xFFL)];
        long var17 = var2[(int) ((var15 ^ (long) this.field3455) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var2[(int) ((var17 ^ (long) this.field3445) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var2[(int) ((var19 ^ (long) (this.field3444 >> 24)) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field3444 >> 16) ^ var21) & 0xFFL)];
        long var25 = var23 >>> 8 ^ var2[(int) (((long) (this.field3444 >> 8) ^ var23) & 0xFFL)];
        long var27 = var2[(int) ((var25 ^ (long) this.field3444) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var2[(int) (((long) this.field3446 ^ var27) & 0xFFL)] ^ var27 >>> 8;
        return var2[(int) (((long) (this.field3453 ? 1 : 0) ^ var29) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lqq;IILql;III[[[B[I[I[I[I[IIBIIZ)V", line = 35)
    public static final void method1358(class318 arg0, int arg1, int arg2, class496 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class179.field2801 = arg0;
        class67.field1095 = arg1;
        class144.field2346 = arg3;
        class311.field4687 = class179.field2801.method1986() > 0;
        class7.field82 = arg4 >> class239.field3602;
        class248.field3812 = arg6 >> class239.field3602;
        class421.field6042 = arg4;
        class168.field2618 = arg6;
        class202.field3202 = arg5;
        class56.field916 = class7.field82 - class320.field4826;
        if (class56.field916 < 0) {
            class139.field2282 = -class56.field916;
            class56.field916 = 0;
        } else {
            class139.field2282 = 0;
        }
        class72.field1287 = class248.field3812 - class320.field4826;
        if (class72.field1287 < 0) {
            class312.field4697 = -class72.field1287;
            class72.field1287 = 0;
        } else {
            class312.field4697 = 0;
        }
        class255.field3886 = class7.field82 + class320.field4826;
        if (class255.field3886 > class377.field5492) {
            class255.field3886 = class377.field5492;
        }
        class14.field197 = class320.field4826 + class248.field3812;
        if (class14.field197 > class347.field5132) {
            class14.field197 = class347.field5132;
        }
        for (int var18 = 0; var18 < class320.field4826 + class320.field4826 + 2; var18++) {
            for (int var23 = 0; var23 < class320.field4826 + class320.field4826 + 2; var23++) {
                int var24 = class7.field82 + var18 - class320.field4826;
                int var25 = class248.field3812 + var23 - class320.field4826;
                if (var24 >= 0 && var25 >= 0 && var24 < class377.field5492 && var25 < class347.field5132) {
                    int var26 = var24 << class239.field3602;
                    int var27 = var25 << class239.field3602;
                    int var28 = class201.field3195[class201.field3195.length - 1].method318(var24, var25) - (0x3E8 << class239.field3602 - 7);
                    int var29 = class262.field3978 == null ? class201.field3195[0].method318(var24, var25) + class434.field6362 : class262.field3978[0].method318(var24, var25) + class434.field6362;
                    class323.field4845[var18][var23] = class179.field2801.method1923(var26, var28, var27, var26, var29, var27);
                } else {
                    class323.field4845[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class320.field4826 + class320.field4826 + 1; var19++) {
            for (int var22 = 0; var22 < class320.field4826 + class320.field4826 + 1; var22++) {
                class358.field5313[var19][var22] = class323.field4845[var19][var22] || class323.field4845[var19 + 1][var22] || class323.field4845[var19][var22 + 1] || class323.field4845[var19 + 1][var22 + 1];
            }
        }
        class508.field7685 = arg8;
        class439.field6448 = arg9;
        class462.field7105 = arg10;
        class222.field3432 = arg11;
        class47.field720 = arg12;
        class39.method217();
        class49.method349(-51);
        for (class227 var20 = (class227) class359.field5315.method1319(65); var20 != null; var20 = (class227) class359.field5315.method1320((byte) -67)) {
            var20.method1297((byte) 7);
            class150.method974(false, var20);
        }
        if (class311.field4687) {
            for (int var21 = 0; var21 < class51.field766; var21++) {
                class162.field2532[var21].method1399(arg1, -767211645, arg17);
            }
        }
        if (arg2 > 1) {
            class179.field2801.method1910(0);
            if (class100.field1810 == null || class100.field1810 instanceof class126) {
                class100.field1810 = new class184();
            }
        } else if (class100.field1810 == null || class100.field1810 instanceof class184) {
            class100.field1810 = new class126();
        }
        class100.field1810.method855(768, arg2);
        class100.field1810.method858((byte) -77);
        if (class471.field7206 != null) {
            class7.method37(true);
            class100.field1810.method859(22, 768);
            class29.method154(arg2, null, 0, (byte) 0, arg15, arg16);
            class100.field1810.method858((byte) -76);
            class100.field1810.method859(23, 768);
            class7.method37(false);
        }
        class29.method154(arg2, arg7, arg13, arg14, arg15, arg16);
        class100.field1810.method858((byte) -122);
        class100.field1810.method860(true);
        class100.field1810.method858((byte) -107);
        if (arg2 > 1) {
            class179.field2801.method1902(0);
        }
        class179.field2801.method1916(0, null);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(BLah;)Z", line = 192)
    public final boolean method1359(byte arg0, class250 arg1) {
        field3448++;
        if (!(arg1 instanceof class224)) {
            return false;
        }
        int var3 = 25 / ((arg0 + 2) / 51);
        class224 var4 = (class224) arg1;
        if (this.field3456 != var4.field3456) {
            return false;
        } else if (this.field3451 != var4.field3451) {
            return false;
        } else if (this.field3455 != var4.field3455) {
            return false;
        } else if (this.field3445 != var4.field3445) {
            return false;
        } else if (this.field3444 != var4.field3444) {
            return false;
        } else if (this.field3446 == var4.field3446) {
            return this.field3453 == var4.field3453;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)V", line = 241)
    public static void method1360(boolean arg0) {
        if (arg0) {
            method1360(true);
        }
        field3454 = null;
        field3452 = null;
        field3450 = null;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IB)I", line = 260)
    public static final int method1361(int arg0, byte arg1) {
        if (class163.field2534 != null) {
            class163.field2534.method1795((byte) 124);
            class163.field2534 = null;
        }
        if (arg1 >= 0) {
            return -78;
        }
        field3447++;
        class484.field7398++;
        if (class484.field7398 > 4) {
            class297.field4509 = 0;
            class484.field7398 = 0;
            return arg0;
        }
        if (class377.field5507 == class331.field4965) {
            class331.field4965 = class135.field2155;
        } else {
            class331.field4965 = class377.field5507;
        }
        class297.field4509 = 0;
        return -1;
    }
}
