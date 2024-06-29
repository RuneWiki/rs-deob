import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class17 extends class303 {

    @OriginalMember(owner = "client!ql", name = "G", descriptor = "I")
    private int field321 = 3072;

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "I")
    private int field326 = 2048;

    @OriginalMember(owner = "client!ql", name = "W", descriptor = "I")
    private int field337 = 1024;

    @OriginalMember(owner = "client!ql", name = "H", descriptor = "Z")
    public static boolean field322 = false;

    @OriginalMember(owner = "client!ql", name = "Q", descriptor = "I")
    public static int field331 = 0;

    @OriginalMember(owner = "client!ql", name = "X", descriptor = "I")
    public static volatile int field338 = -1;

    @OriginalMember(owner = "client!ql", name = "I", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!ql", name = "J", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!ql", name = "M", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!ql", name = "O", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!ql", name = "P", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!ql", name = "R", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!ql", name = "S", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!ql", name = "T", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!ql", name = "U", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!ql", name = "V", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!ql", name = "Y", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!ql", name = "Z", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lpe;I)Lwj;", line = 8)
    public static final class217 method140(class101 arg0, int arg1) {
        field336++;
        if (arg1 != 0) {
            method140((class101) null, 75);
        }
        return new class217(arg0.method780(arg1 - 17432), arg0.method780(arg1 ^ 0xFFFFBBE8), arg0.method780(-17432), arg0.method780(-17432), arg0.method776(-1574267376), arg0.method776(-1574267376), arg0.method741(20));
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)V", line = 19)
    public static final void method141(int arg0) {
        class183.field2922.method1837(-5);
        class103.field1740.method1837(27);
        field327++;
        if (arg0 > 106) {
            class134.field2127.method1837(-127);
            class11.field184.method1837(-128);
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V", line = 37)
    public class17() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(II)[I", line = 42)
    public final int[] method67(int arg0, int arg1) {
        field335++;
        if (arg0 != -3) {
            field322 = true;
        }
        int[] var3 = this.field4763.method394(0, arg1);
        if (this.field4763.field863) {
            int[] var4 = this.method2107(arg1, 0, 0);
            for (int var5 = 0; var5 < class70.field1108; var5++) {
                var3[var5] = (var4[var5] * this.field326 >> 12) + this.field337;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(II)V", line = 78)
    public static final void method142(int arg0, int arg1) {
        if (arg0 < -34) {
            field340++;
            class4 var2 = class67.method510(1, 4, arg1);
            var2.method6(255);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)[[I", line = 94)
    public final int[][] method74(int arg0, int arg1) {
        if (arg1 != 82) {
            field325 = 71;
        }
        field324++;
        int[][] var3 = this.field4772.method1175(-43, arg0);
        if (this.field4772.field2488) {
            int[][] var4 = this.method2106(arg0, 0, 29);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class70.field1108; var11++) {
                var8[var11] = (var5[var11] * this.field326 >> 12) + this.field337;
                var9[var11] = this.field337 + (var6[var11] * this.field326 >> 12);
                var10[var11] = (var7[var11] * this.field326 >> 12) + this.field337;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B[B)Z", line = 142)
    public static final boolean method143(byte arg0, byte[] arg1) {
        field334++;
        class101 var2 = new class101(arg1);
        int var3 = var2.method741(120);
        if (var3 != 1) {
            return false;
        }
        if (arg0 < 75) {
            method143((byte) 49, (byte[]) null);
        }
        boolean var4 = var2.method741(111) == 1;
        if (var4) {
            class141.method1081(-93, var2);
        }
        class236.method1687((byte) -125, var2);
        return true;
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)V", line = 166)
    public final void method70(int arg0) {
        this.field326 = this.field321 - this.field337;
        if (arg0 >= 13) {
            field332++;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLjava/lang/String;Z)V", line = 179)
    public static final void method144(byte arg0, String arg1, boolean arg2) {
        field339++;
        byte var3 = 4;
        int var4 = 74 % ((-arg0 - 35) / 53);
        int var5 = var3 + 6;
        int var6 = var3 + 6;
        int var7 = class64.field1021.method1026(arg1, 250);
        int var8 = class64.field1021.method1015(arg1, 250) * 13;
        if (class265.field4126) {
            class262.method1855(var5 - var3, -var3 + var6, var3 + var3 + var7, var8 - -var3 + var3, 0);
            class262.method1854(var5 - var3, -var3 + var6, var7 + var3 + var3, var3 + var8 + var3, 16777215);
        } else {
            class182.method1360(var5 - var3, var6 - var3, var3 + var3 + var7, var3 + var8 + var3, 0);
            class182.method1364(var5 - var3, var6 - var3, var3 + var3 + var7, var3 + var8 + var3, 16777215);
        }
        class64.field1021.method1021(arg1, var5, var6, var7, var8, 16777215, -1, 1, 1, 0);
        class77.method567(var3 + var3 + var8, -var3 + var5, var3 + var3 + var7, 0, var6 - var3);
        if (!arg2) {
            class270.method1948(var8, (byte) -105, var6, var5, var7);
        } else if (class265.field4126) {
            class265.method1912();
        } else {
            try {
                Graphics var9 = class2.field7.getGraphics();
                class222.field3556.method1216(0, 0, 0, var9);
            } catch (Exception var11) {
                class2.field7.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILpe;I)V", line = 252)
    public final void method65(int arg0, class101 arg1, int arg2) {
        if (arg2 == 0) {
            this.field337 = arg1.method731(false);
        } else if (arg2 == 1) {
            this.field321 = arg1.method731(false);
        } else if (arg2 == 2) {
            this.field4773 = arg1.method741(88) == 1;
        }
        field329++;
        if (arg0 != -4004) {
            field333 = -98;
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(BI)Lo;", line = 298)
    public static final class208 method145(byte arg0, int arg1) {
        field323++;
        class208 var2 = (class208) class139.field2209.method1830((long) arg1, (byte) 52);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class132.field2113.method467(class282.method2009((byte) -123, arg1), 73, class308.method2128(arg1, -18465));
        class208 var4 = new class208();
        var4.field3299 = arg1;
        int var5 = -64 / ((-arg0 - 39) / 62);
        if (var3 != null) {
            var4.method1516(105, new class101(var3));
        }
        var4.method1523((byte) 94);
        class139.field2209.method1831((long) arg1, var4, -13897);
        return var4;
    }
}
