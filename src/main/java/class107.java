import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class107 {

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    private int field1998 = 0;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    private int field1996 = -1;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "Ldc;")
    private class36 field2003 = new class36();

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "Z")
    public boolean field2007 = false;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    private int field1994;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "[[I")
    private int[][] field1997;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    private int field1993;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "[Lme;")
    private class135[] field2002;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public static int field2000 = 0;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "Lqe;")
    public static class179 field2004 = class206.method1380("runes", (byte) -34);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "Leh;")
    public static class52 field2006;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZIII)V")
    public static final void method695(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class40.field869 = arg4;
        class168.field3037 = arg3;
        field1995++;
        class70.field1403 = arg2;
        class235.field4336 = arg0;
        if (!arg1) {
            method695(121, true, -58, 61, -87);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I")
    public static int method696(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static void method697(int arg0) {
        field2004 = null;
        field2006 = null;
        if (arg0 != 128) {
            field2006 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
    public static final void method698(int arg0) {
        field1992++;
        if (arg0 <= 0) {
            return;
        }
        for (int var1 = -1; var1 < class22.field548; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class10.field279[var1];
            }
            class115 var3 = class23.field554[var2];
            if (var3 != null) {
                class2.method12((byte) 103, 1, var3);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)[I")
    public final int[] method699(byte arg0, int arg1) {
        if (arg0 != -74) {
            method695(108, false, -104, 98, 109);
        }
        field2001++;
        if (this.field1994 == this.field1993) {
            this.field2007 = this.field2002[arg1] == null;
            this.field2002[arg1] = class9.field262;
            return this.field1997[arg1];
        } else if (this.field1994 == 1) {
            this.field2007 = this.field1996 != arg1;
            this.field1996 = arg1;
            return this.field1997[0];
        } else {
            class135 var3 = this.field2002[arg1];
            if (var3 == null) {
                this.field2007 = true;
                if (this.field1998 >= this.field1994) {
                    class135 var4 = (class135) this.field2003.method234((byte) 121);
                    var3 = new class135(arg1, var4.field2491);
                    this.field2002[var4.field2500] = null;
                    var4.method592((byte) -128);
                } else {
                    var3 = new class135(arg1, this.field1998);
                    this.field1998++;
                }
                this.field2002[arg1] = var3;
            } else {
                this.field2007 = false;
            }
            this.field2003.method233(var3, false);
            return this.field1997[var3.field2491];
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)[[I")
    public final int[][] method700(byte arg0) {
        field1990++;
        if (this.field1994 != this.field1993) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (arg0 != -67) {
            method704(-18, -65, -118, -120, null, null, -56, 90, 99L);
        }
        while (this.field1994 > var2) {
            this.field2002[var2] = class9.field262;
            var2++;
        }
        return this.field1997;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)I")
    public static final int method701(int arg0, byte arg1) {
        field1999++;
        if (arg0 == 16711935) {
            return -1;
        } else {
            int var2 = -86 / ((arg1 - 4) / 63);
            return class163.method1044(4686, arg0);
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)V")
    public final void method702(byte arg0) {
        field1991++;
        for (int var2 = 0; var2 < this.field1994; var2++) {
            this.field1997[var2] = null;
        }
        int var3 = -108 % ((24 - arg0) / 34);
        this.field1997 = null;
        this.field2002 = null;
        this.field2003.method236((byte) 97);
        this.field2003 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIII)V")
    public static final void method703(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 0) {
            field2004 = null;
        }
        if (class235.field4336 <= arg2 && arg2 <= class40.field869) {
            int var5 = class56.method391(arg1 ^ 0xFFFFFF, class70.field1403, class168.field3037, arg3);
            int var6 = class56.method391(arg1 + 16777215, class70.field1403, class168.field3037, arg4);
            class237.method1538(arg2, var5, (byte) -119, arg0, var6);
        }
        field2005++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIILrb;Lrb;IIJ)V")
    public static final void method704(int arg0, int arg1, int arg2, int arg3, class186 arg4, class186 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class237 var10 = new class237();
        var10.field4379 = arg8;
        var10.field4356 = arg1 * 128 + 64;
        var10.field4375 = arg2 * 128 + 64;
        var10.field4376 = arg3;
        var10.field4382 = arg4;
        var10.field4362 = arg5;
        var10.field4365 = arg6;
        var10.field4360 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class229.field4232[var11][arg1][arg2] == null) {
                class229.field4232[var11][arg1][arg2] = new class197(var11, arg1, arg2);
            }
        }
        class229.field4232[arg0][arg1][arg2].field3680 = var10;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(III)V")
    public class107(int arg0, int arg1, int arg2) {
        this.field1994 = arg0;
        this.field1997 = new int[this.field1994][arg2];
        this.field1993 = arg1;
        this.field2002 = new class135[this.field1993];
    }
}
