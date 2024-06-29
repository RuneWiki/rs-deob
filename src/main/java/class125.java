import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class125 extends class3 {

    @OriginalMember(owner = "client!mm", name = "F", descriptor = "Ljava/lang/String;")
    public static String field1863 = "glow3:";

    @OriginalMember(owner = "client!mm", name = "L", descriptor = "[Lsb;")
    public static class131[] field1869 = new class131[14];

    @OriginalMember(owner = "client!mm", name = "G", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!mm", name = "H", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!mm", name = "I", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!mm", name = "J", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!mm", name = "K", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!mm", name = "M", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!mm", name = "N", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!mm", name = "P", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!mm", name = "O", descriptor = "Llj;")
    public static class289 field1872;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "(B)V", line = 10)
    public static void method807(byte arg0) {
        field1869 = null;
        if (arg0 <= 76) {
            field1872 = (class289) null;
        }
        field1863 = null;
        field1872 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIZ)V", line = 25)
    public static final void method808(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1867++;
        if (class31.method266(arg1, 1)) {
            class89.method593(arg4, arg3, arg3 ^ 0xFFFFFFAD, class167.field2627[arg1], arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lfh;IZ)V", line = 38)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        field1865++;
        if (arg1 == 0) {
            this.field34 = arg0.method2224(-126) == 1;
        }
        if (arg2) {
            field1872 = (class289) null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)[[I", line = 56)
    public final int[][] method22(int arg0, int arg1) {
        field1868++;
        if (arg0 != -21194) {
            method807((byte) 39);
        }
        int[][] var3 = this.field20.method2435(arg1, false);
        if (this.field20.field5556) {
            int[][] var4 = this.method16(arg1, 0, (byte) 84);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class326.field5342; var11++) {
                var8[var11] = 4096 - var5[var11];
                var9[var11] = 4096 - var6[var11];
                var10[var11] = 4096 - var7[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BI)[I", line = 102)
    public final int[] method25(byte arg0, int arg1) {
        if (arg0 <= 57) {
            method807((byte) 84);
        }
        field1870++;
        int[] var3 = this.field21.method1258(arg1, 0);
        if (this.field21.field2808) {
            int[] var4 = this.method24(arg1, 1, 0);
            for (int var5 = 0; var5 < class326.field5342; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)Llj;", line = 139)
    public static final class289 method809(int arg0) {
        int var1 = -109 / ((-arg0 - 44) / 45);
        int var2 = class94.field1379[0] * class322.field5289[0];
        field1864++;
        int[] var3 = new int[var2];
        byte[] var4 = class105.field1522[0];
        for (int var5 = 0; var5 < var2; var5++) {
            var3[var5] = class201.field3085[class235.method1623(255, var4[var5])];
        }
        class289 var6;
        if (class245.field3886) {
            var6 = new class232(class300.field4961, class96.field1400, class18.field228[0], class28.field419[0], class322.field5289[0], class94.field1379[0], var3);
        } else {
            var6 = new class137(class300.field4961, class96.field1400, class18.field228[0], class28.field419[0], class322.field5289[0], class94.field1379[0], var3);
        }
        class167.method1164(false);
        return var6;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V", line = 168)
    public class125() {
        super(1, false);
    }
}
