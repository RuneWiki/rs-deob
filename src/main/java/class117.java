import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class117 {

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "Lrj;")
    public class18 field2095 = new class18();

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Lni;")
    public static class24 field2091 = new class24(64);

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "Ljf;")
    public static class229 field2096 = class212.method1457((byte) 74, "Chargement des polices )2 ");

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "Lrj;")
    private class18 field2098;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "[[B")
    public static byte[][] field2089;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZI)V", line = 4)
    public static final void method831(boolean arg0, int arg1) {
        field2085++;
        class187 var2 = (class187) class278.field4772.method1890((long) arg1, -107);
        if (arg0) {
            field2091 = (class24) null;
        }
        if (var2 != null) {
            var2.method1747((byte) -95);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZLrj;)V", line = 20)
    public final void method832(boolean arg0, class18 arg1) {
        if (arg1.field276 != null) {
            arg1.method172(338);
        }
        if (!arg0) {
            this.method840(116);
        }
        field2093++;
        arg1.field276 = this.field2095.field276;
        arg1.field287 = this.field2095;
        arg1.field276.field287 = arg1;
        arg1.field287.field276 = arg1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V", line = 47)
    public static void method833(int arg0) {
        field2096 = null;
        if (arg0 == 1000000) {
            field2091 = null;
            field2089 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B[I[JII)V", line = 62)
    public static final void method834(byte arg0, int[] arg1, long[] arg2, int arg3, int arg4) {
        if (arg3 < arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            int var9 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var9;
            for (int var10 = arg3; var10 < arg4; var10++) {
                if ((var7 + ((long) (var10 & 0x1))) > arg2[var10]) {
                    long var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    int var13 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var13;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var9;
            method834((byte) 65, arg1, arg2, arg3, var6 - 1);
            method834((byte) -122, arg1, arg2, var6 + 1, arg4);
        }
        field2087++;
        int var14 = 87 / ((-arg0 - 53) / 49);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)I", line = 115)
    public static final int method835(int arg0) {
        field2097++;
        return arg0 > -63 ? 71 : 6;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V", line = 131)
    public static final void method836(byte arg0) {
        field2092++;
        if (class100.field1763 != null) {
            class30.method258(class100.field1763, (byte) 37);
            class100.field1763 = null;
        }
        int var1 = -20 % ((-arg0 - 27) / 49);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZBZIZ)Lek;", line = 148)
    public static final class185 method837(boolean arg0, byte arg1, boolean arg2, int arg3, boolean arg4) {
        field2094++;
        class107 var5 = null;
        if (class319.field5401 != null) {
            var5 = new class107(arg3, class319.field5401, class271.field4654[arg3], 1000000);
        }
        class62.field1060[arg3] = class284.field4875.method1658(class8.field87, (byte) -32, var5, arg3);
        if (arg0) {
            class62.field1060[arg3].method894(115);
        }
        if (arg1 >= -57) {
            field2091 = (class24) null;
        }
        return new class185(class62.field1060[arg3], arg4, arg2);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)I", line = 172)
    public final int method838(byte arg0) {
        field2088++;
        if (arg0 < 80) {
            this.method839((byte) 75);
        }
        int var2 = 0;
        for (class18 var3 = this.field2095.field287; var3 != this.field2095; var3 = var3.field287) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)Lrj;", line = 198)
    public final class18 method839(byte arg0) {
        field2086++;
        class18 var2 = this.field2098;
        if (this.field2095 == var2) {
            this.field2098 = null;
            return null;
        }
        this.field2098 = var2.field287;
        if (arg0 <= 35) {
            method836((byte) -4);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)Lrj;", line = 220)
    public final class18 method840(int arg0) {
        int var2 = 37 % ((arg0 + 70) / 52);
        field2090++;
        class18 var3 = this.field2095.field287;
        if (this.field2095 == var3) {
            this.field2098 = null;
            return null;
        } else {
            this.field2098 = var3.field287;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V", line = 265)
    public class117() {
        this.field2095.field276 = this.field2095;
        this.field2095.field287 = this.field2095;
    }
}
