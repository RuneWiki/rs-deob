import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class80 extends class261 {

    @OriginalMember(owner = "client!jk", name = "I", descriptor = "I")
    private int field1295 = 4096;

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "I")
    private int field1300 = 0;

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "I")
    public static int field1296 = 50;

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "Lve;")
    public static class255 field1301 = class87.method607(45, "titlebg");

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "Lwl;")
    public static class81 field1292 = new class81(260);

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "Lve;")
    public static class255 field1303 = class87.method607(85, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "Lfg;")
    public static class203 field1302 = new class203();

    @OriginalMember(owner = "client!jk", name = "G", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!jk", name = "H", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!jk", name = "M", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)[I", line = 10)
    public final int[] method21(byte arg0, int arg1) {
        int var3 = -30 / ((-arg0 - 49) / 33);
        field1297++;
        int[] var4 = this.field4425.method906(arg1, 8251);
        if (this.field4425.field2043) {
            int[] var5 = this.method1822(0, 112, arg1);
            for (int var6 = 0; var6 < class92.field1576; var6++) {
                int var7 = var5[var6];
                if (this.field1300 > var7) {
                    var4[var6] = this.field1300;
                } else if (this.field1295 < var7) {
                    var4[var6] = this.field1295;
                } else {
                    var4[var6] = var7;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V", line = 50)
    public class80() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZI)[[I", line = 59)
    public final int[][] method13(boolean arg0, int arg1) {
        field1298++;
        int[][] var3 = this.field4418.method35(arg1, 118);
        if (this.field4418.field94) {
            int[][] var4 = this.method1819(-38, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class92.field1576; var11++) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var9[var11];
                if (this.field1300 > var12) {
                    var7[var11] = this.field1300;
                } else if (this.field1295 < var12) {
                    var7[var11] = this.field1295;
                } else {
                    var7[var11] = var12;
                }
                if (this.field1300 > var13) {
                    var8[var11] = this.field1300;
                } else if (this.field1295 >= var13) {
                    var8[var11] = var13;
                } else {
                    var8[var11] = this.field1295;
                }
                if (var14 < this.field1300) {
                    var10[var11] = this.field1300;
                } else if (var14 <= this.field1295) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field1295;
                }
            }
        }
        if (!arg0) {
            method552((byte) 31);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIII)V", line = 132)
    public static final void method550(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1299++;
        if (arg3 != 1) {
            return;
        }
        class262 var5 = (class262) class68.field1008.method280((long) arg2, 29153);
        if (var5 == null) {
            var5 = new class262();
            class68.field1008.method284(true, (long) arg2, var5);
        }
        if (var5.field4448.length <= arg4) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field4448.length; var8++) {
                var6[var8] = var5.field4448[var8];
                var7[var8] = var5.field4440[var8];
            }
            for (int var9 = var5.field4448.length; var9 < arg4; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field4448 = var6;
            var5.field4440 = var7;
        }
        var5.field4448[arg4] = arg1;
        var5.field4440[arg4] = arg0;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILrg;)V", line = 185)
    public static final void method551(int arg0, class88 arg1) {
        class141.field2344 = arg1;
        field1294++;
        if (arg0 != 14512) {
            method550(-1, 63, -109, -37, -65);
        }
    }

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "(B)V", line = 217)
    public static void method552(byte arg0) {
        field1292 = null;
        field1303 = null;
        if (arg0 > -98) {
            method552((byte) -42);
        }
        field1302 = null;
        field1301 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lpb;BI)V", line = 240)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field1300 = arg0.method423(255);
        } else if (arg2 == 1) {
            this.field1295 = arg0.method423(255);
        } else if (arg2 == 2) {
            this.field4434 = arg0.method481(0) == 1;
        }
        if (arg1 >= -115) {
            field1303 = (class255) null;
        }
        field1293++;
    }
}
