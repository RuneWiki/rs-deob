import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class387 extends class447 {

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "I")
    private int field5639;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
    public static int field5637 = 0;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!bl", name = "A", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!bl", name = "B", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!bl", name = "C", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!bl", name = "D", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "Lqj;")
    public static class296 field5636;

    @OriginalMember(owner = "client!bl", name = "F", descriptor = "Lqj;")
    public static class296 field5645;

    @OriginalMember(owner = "client!bl", name = "E", descriptor = "[Luo;")
    public class343[] field5644;

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "[[B")
    public static byte[][] field5635;

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "[[B")
    private byte[][] field5638;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZI)Z", line = 5)
    public final boolean method2527(boolean arg0, int arg1) {
        field5647++;
        if (arg0) {
            field5645 = null;
        }
        return this.field5644[arg1].field4797;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZJ)Ljava/lang/String;", line = 17)
    public static final String method2528(boolean arg0, long arg1) {
        field5634++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            if (arg0) {
                field5637 = -46;
            }
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class16.field196[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)Z", line = 70)
    public final boolean method2529(boolean arg0) {
        field5640++;
        if (this.field5644 != null) {
            return true;
        }
        if (this.field5638 == null) {
            if (!class448.field6484.method1899(-13384, this.field5639)) {
                return false;
            }
            int[] var2 = class448.field6484.method1912(this.field5639, 18197);
            this.field5638 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field5638[var3] = class448.field6484.method1920(var2[var3], false, this.field5639);
            }
        }
        boolean var4 = arg0;
        for (int var5 = 0; var5 < this.field5638.length; var5++) {
            byte[] var14 = this.field5638[var5];
            int var15 = var14[1] & 0xFF | var14[0] & 0xFF << 8;
            var4 &= class301.field4166.method1898(var15, 126);
        }
        if (!var4) {
            return false;
        }
        class196 var6 = new class196();
        int var7 = class448.field6484.method1911(0, this.field5639);
        this.field5644 = new class343[var7];
        int[] var8 = class448.field6484.method1912(this.field5639, 18197);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field5638[var9];
            int var11 = var10[0] & 0xFF << 8 | var10[1] & 0xFF;
            class346 var12 = null;
            for (class346 var13 = (class346) var6.method1312((byte) 25); var13 != null; var13 = (class346) var6.method1304(-111)) {
                if (var13.field4840 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class346(var11, class301.field4166.method1904(var11, 255));
                var6.method1301(50, var12);
            }
            this.field5644[var8[var9]] = new class343(var10, var12);
        }
        this.field5638 = null;
        return true;
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(B)V", line = 162)
    public static final void method2530(byte arg0) {
        field5641++;
        if (arg0 == 30) {
            class190 var1 = class395.field5776;
            synchronized (class395.field5776) {
                class395.field5776.method1249(1);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IB)Lse;", line = 178)
    public static final class139 method2531(int arg0, byte arg1) {
        int var2 = 124 % ((39 - arg1) / 39);
        field5642++;
        class139 var3 = (class139) class27.field432.method1246((byte) -102, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class439.field6375.method1920(arg0, false, 34);
        class139 var5 = new class139();
        if (var4 != null) {
            var5.method956(new class371(var4), arg0, -5);
        }
        class27.field432.method1247((long) arg0, (byte) 125, var5);
        return var5;
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)V", line = 210)
    public static void method2532(int arg0) {
        field5645 = null;
        field5636 = null;
        field5635 = null;
        if (arg0 != 646) {
            method2534((class296) null, false, -82, (class296) null);
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(I)V", line = 221)
    public class387(int arg0) {
        this.field5639 = arg0;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)Z", line = 229)
    public final boolean method2533(int arg0, int arg1) {
        field5643++;
        if (arg1 != 255) {
            field5635 = null;
        }
        return this.field5644[arg0].field4801;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lqj;ZILqj;)V", line = 241)
    public static final void method2534(class296 arg0, boolean arg1, int arg2, class296 arg3) {
        class192.field2667 = arg1;
        field5646++;
        class48.field733 = arg0;
        int var4 = 74 % ((-arg2 - 34) / 38);
        class108.field1595 = arg3;
        int var5 = class48.field733.method1915(108) - 1;
        class113.field1661 = class48.field733.method1911(0, var5) + var5 * 256;
        class441.field6378 = new String[] { null, null, class367.field5151, null, null };
        class31.field492 = new String[] { null, null, null, null, class312.field4311 };
    }
}
