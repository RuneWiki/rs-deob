import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 extends class88 {

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public int field6;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "Lhj;")
    public static class69 field2 = class181.method1318("(U4", (byte) -117);

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "Lhj;")
    public static class69 field12 = class181.method1318("weiss:", (byte) -108);

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "[I")
    public static int[] field7 = new int[4096];

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "Lhj;")
    private static class69 field13;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "Lhj;")
    public static class69 field14;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "[Lgi;")
    public static class152[] field8;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lhj;I)I")
    public static final int method8(class69 arg0, int arg1) {
        field3++;
        if (arg1 == ~arg0.method441((byte) 73)) {
            return -1;
        }
        for (int var2 = 0; var2 < class61.field1117.field1724; var2++) {
            if (class61.field1117.field1729[var2].method438(class216.field3909, class232.field4238, -118).method463((byte) 85, arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5++;
        int var8 = class240.method1700(class166.field3075, arg7, 126, class19.field252);
        int var9 = class240.method1700(class166.field3075, arg6, 125, class19.field252);
        int var10 = class240.method1700(class35.field485, arg4, 126, class201.field3629);
        int var11 = class240.method1700(class35.field485, arg5, 124, class201.field3629);
        int var12 = class240.method1700(class166.field3075, arg2 + arg7, -80, class19.field252);
        int var13 = class240.method1700(class166.field3075, arg6 - arg2, 125, class19.field252);
        for (int var14 = var8; var14 < var12; var14++) {
            class99.method740(arg3, class186.field3402[var14], -1162793114, var11, var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class99.method740(arg3, class186.field3402[var15], -1162793114, var11, var10);
        }
        int var16 = class240.method1700(class35.field485, arg4 + arg2, 125, class201.field3629);
        int var17 = -1 % ((arg1 - 64) / 44);
        int var18 = class240.method1700(class35.field485, arg5 - arg2, 125, class201.field3629);
        for (int var19 = var12; var19 <= var13; var19++) {
            int[] var20 = class186.field3402[var19];
            class99.method740(arg3, var20, -1162793114, var16, var10);
            class99.method740(arg0, var20, -1162793114, var18, var16);
            class99.method740(arg3, var20, -1162793114, var11, var18);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)Z")
    public static final boolean method10(int arg0, byte arg1) {
        field11++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        }
        int var2 = -111 / ((56 - arg1) / 62);
        if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method11(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class157.field2927 * arg3 + class130.field2421 * arg0 >> 16;
        int var6 = class130.field2421 * arg3 - class157.field2927 * arg0 >> 16;
        int var7 = class80.field1532 * var6 + class48.field698 * arg1 >> 16;
        int var8 = class80.field1532 * arg1 - class48.field698 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class80.field1532 * var6 + class48.field698 * arg2 >> 16;
        int var12 = class80.field1532 * arg2 - class48.field698 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class44.field632 && var13 < class44.field632) {
            return false;
        } else if (var9 > class266.field4733 && var13 > class266.field4733) {
            return false;
        } else if (var10 < class36.field509 && var14 < class36.field509) {
            return false;
        } else {
            return var10 <= class155.field2895 || var14 <= class155.field2895;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
    public static final void method12(int arg0, int arg1) {
        field1++;
        if (arg0 == -20402) {
            class135 var2 = class8.method38((byte) 119, 4, arg1);
            var2.method1012((byte) 91);
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
    public static void method13(byte arg0) {
        field14 = null;
        field7 = null;
        field12 = null;
        if (arg0 >= 126) {
            field2 = null;
            field13 = null;
            field8 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BJ)Lhj;")
    public static final class69 method14(byte arg0, long arg1) {
        field4++;
        class257.field4614.setTime(new Date(arg1));
        int var3 = class257.field4614.get(7);
        int var4 = class257.field4614.get(5);
        int var5 = class257.field4614.get(2);
        int var6 = class257.field4614.get(1);
        int var7 = -27 / ((arg0 - 59) / 52);
        int var8 = class257.field4614.get(11);
        int var9 = class257.field4614.get(12);
        int var10 = class257.field4614.get(13);
        return class9.method42(117, new class69[] { class148.field2762[var3 - 1], class43.field614, class98.method727(-229, var4 / 10), class98.method727(-229, var4 % 10), class159.field2951, class56.field1024[var5], class159.field2951, class98.method727(-229, var6), class59.field1079, class98.method727(-229, var8 / 10), class98.method727(-229, var8 % 10), class206.field3768, class98.method727(-229, var9 / 10), class98.method727(-229, var9 % 10), class206.field3768, class98.method727(-229, var10 / 10), class98.method727(-229, var10 % 10), class161.field2996 });
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
    public class3() {
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(I)V")
    public class3(int arg0) {
        this.field6 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field7[var0] = class136.method1015(1207330220, var0);
        }
        field13 = class181.method1318("Loaded fonts", (byte) -107);
        field14 = field13;
    }
}
