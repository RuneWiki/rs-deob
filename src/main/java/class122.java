import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class122 extends class303 {

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    private int field1955 = 32768;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
    public static int field1950 = -1;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    public static int field1951 = 0;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field1952 = 0;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public static volatile int field1956 = 0;

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILpe;I)V", line = 24)
    public final void method65(int arg0, class101 arg1, int arg2) {
        if (arg2 == 0) {
            this.field1955 = arg1.method731(false) << 4;
        } else if (arg2 == 1) {
            this.field4773 = arg1.method741(96) == 1;
        }
        if (arg0 != -4004) {
            field1950 = 89;
        }
        field1953++;
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)V", line = 56)
    public final void method70(int arg0) {
        field1949++;
        class226.method1635(4096);
        if (arg0 <= 13) {
            field1947 = -104;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)[I", line = 76)
    public final int[] method67(int arg0, int arg1) {
        if (arg0 != -3) {
            return (int[]) null;
        }
        field1954++;
        int[] var3 = this.field4763.method394(0, arg1);
        if (this.field4763.field863) {
            int[] var4 = this.method2107(arg1, 0, 1);
            int[] var5 = this.method2107(arg1, 0, 2);
            for (int var6 = 0; var6 < class70.field1108; var6++) {
                int var7 = var4[var6] >> 4 & 0xFF;
                int var8 = var5[var6] * this.field1955 >> 12;
                int var9 = class148.field2386[var7] * var8 >> 12;
                int var10 = class123.field1971[var7] * var8 >> 12;
                int var11 = class40.field724 & (var10 >> 12) + var6;
                int var12 = class12.field240 & (var9 >> 12) + arg1;
                int[] var13 = this.method2107(var12, 0, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V", line = 122)
    public class122() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[[I", line = 132)
    public final int[][] method74(int arg0, int arg1) {
        int[][] var3 = this.field4772.method1175(-89, arg0);
        if (this.field4772.field2488) {
            int[] var4 = this.method2107(arg0, 0, 1);
            int[] var5 = this.method2107(arg0, 0, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class70.field1108; var9++) {
                int var10 = var4[var9] * 255 >> 12 & 0xFF;
                int var11 = var5[var9] * this.field1955 >> 12;
                int var12 = class123.field1971[var10] * var11 >> 12;
                int var13 = var9 + (var12 >> 12) & class40.field724;
                int var14 = class148.field2386[var10] * var11 >> 12;
                int var15 = class12.field240 & (var14 >> 12) + arg0;
                int[][] var16 = this.method2106(var15, 0, 112);
                var6[var9] = var16[0][var13];
                var7[var9] = var16[1][var13];
                var8[var9] = var16[2][var13];
            }
        }
        field1948++;
        if (arg1 != 82) {
            field1952 = 121;
        }
        return var3;
    }
}
