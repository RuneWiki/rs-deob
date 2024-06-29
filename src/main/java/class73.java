import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public abstract class class73 {

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field1230 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "[Z")
    public static boolean[] field1227 = new boolean[100];

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public int field1225;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public int field1235;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "Lvb;")
    public static class140 field1233;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "Ljava/awt/Image;")
    public Image field1223;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "[I")
    public int[] field1236;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static void method493(int arg0) {
        field1233 = null;
        field1230 = null;
        field1227 = null;
        if (arg0 != 9053) {
            method494(42, (int[]) null, 107, -114, -66);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public abstract void method40(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[IIII)V")
    public static final void method494(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field1229++;
        int var6 = arg3 - 1;
        int var5 = var6 - 7;
        arg4--;
        while (var5 > arg4) {
            int var7 = arg4 + 1;
            arg1[var7] = arg0;
            int var8 = var7 + 1;
            arg1[var8] = arg0;
            int var9 = var8 + 1;
            arg1[var9] = arg0;
            int var10 = var9 + 1;
            arg1[var10] = arg0;
            int var11 = var10 + 1;
            arg1[var11] = arg0;
            int var12 = var11 + 1;
            arg1[var12] = arg0;
            int var13 = var12 + 1;
            arg1[var13] = arg0;
            arg4 = var13 + 1;
            arg1[arg4] = arg0;
        }
        while (var6 > arg4) {
            arg4++;
            arg1[arg4] = arg0;
        }
        if (arg2 != 4028) {
            field1233 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIII)V")
    public static final void method495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1228++;
        int var6 = 0;
        int var7 = arg1;
        method494(arg3, class204.field3253[arg4], 4028, arg0 + arg5, -arg0 + arg5);
        int var8 = arg0 * arg0;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        if (arg2 > -48) {
            field1233 = null;
        }
        int var11 = arg1 << 1;
        int var12 = var8 << 1;
        int var13 = (1 - var11) * var8 + var10;
        int var14 = var9 - ((var11 - 1) * var12);
        int var15 = var9 << 2;
        int var16 = var8 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = (var6 + 1) * var15;
        int var19 = ((arg1 << 1) - 3) * var12;
        int var20 = (arg1 - 1) * var16;
        while (var7 > 0) {
            var7--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var18;
                    var6++;
                    var18 += var15;
                    var13 += var17;
                    var17 += var15;
                }
            }
            if (var14 < 0) {
                var6++;
                var14 += var18;
                var13 += var17;
                var18 += var15;
                var17 += var15;
            }
            int var21 = arg4 + var7;
            var13 += -var20;
            var20 -= var16;
            int var22 = arg5 + var6;
            int var23 = arg4 - var7;
            int var24 = arg5 - var6;
            method494(arg3, class204.field3253[var23], 4028, var22, var24);
            var14 += -var19;
            method494(arg3, class204.field3253[var21], 4028, var22, var24);
            var19 -= var16;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method38(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V")
    public static final void method496(int arg0, int arg1) {
        class274.field4404.method1262(arg0, 2736);
        field1222++;
        class160.field2547.method1262(arg0, 2736);
        if (arg1 > -93) {
            method494(89, (int[]) null, 116, 29, -28);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public final void method497(byte arg0) {
        field1224++;
        class127.method894(this.field1236, this.field1235, this.field1225);
        int var2 = -119 % ((-arg0 - 16) / 53);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)V")
    public static final void method498(int arg0, boolean arg1) {
        field1234++;
        if (!arg1) {
            field1230 = null;
        }
        class83.field1384--;
        if (class83.field1384 == arg0) {
            return;
        }
        class157.method1071(class249.field3948, arg0 + 1, class249.field3948, arg0, class83.field1384 - arg0);
        class157.method1071(class269.field4343, arg0 + 1, class269.field4343, arg0, class83.field1384 - arg0);
        class157.method1068(class177.field2904, arg0 + 1, class177.field2904, arg0, class83.field1384 - arg0);
        class157.method1072(class192.field3103, arg0 + 1, class192.field3103, arg0, class83.field1384 - arg0);
        class157.method1073(class77.field1288, arg0 + 1, class77.field1288, arg0, class83.field1384 - arg0);
        class157.method1068(class64.field1076, arg0 + 1, class64.field1076, arg0, class83.field1384 - arg0);
        class157.method1068(class255.field4124, arg0 + 1, class255.field4124, arg0, class83.field1384 - arg0);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
    public static final void method499(int arg0) {
        field1226++;
        if (class182.field3008 > 0) {
            class216.method1500(~arg0);
            return;
        }
        class133.field2120 = class208.field3298;
        class208.field3298 = null;
        if (arg0 != -1) {
            field1230 = null;
        }
        class262.method1760(40, arg0 - 75);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method39(int arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLag;)Lag;")
    public static final class211 method500(byte arg0, class211 arg1) {
        field1231++;
        class211 var2 = client.method2029(arg1);
        if (arg0 < 71) {
            method496(90, -89);
        }
        if (var2 == null) {
            var2 = arg1.field3350;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
    protected class73() {
    }
}
