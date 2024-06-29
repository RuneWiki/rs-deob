import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class158 extends class261 {

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "Z")
    private boolean field2668 = true;

    @OriginalMember(owner = "client!dh", name = "R", descriptor = "Z")
    private boolean field2679 = true;

    @OriginalMember(owner = "client!dh", name = "G", descriptor = "Lve;")
    public static class255 field2669 = class87.method607(37, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!dh", name = "L", descriptor = "Lve;")
    private static class255 field2673 = class87.method607(109, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "Lve;")
    public static class255 field2672 = field2673;

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "Lff;")
    public static class47 field2675 = new class47(8);

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!dh", name = "O", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!dh", name = "P", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!dh", name = "Q", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)[I", line = 8)
    public final int[] method21(byte arg0, int arg1) {
        field2674++;
        int[] var3 = this.field4425.method906(arg1, 8251);
        if (this.field4425.field2043) {
            int[] var4 = this.method1822(0, 14, this.field2679 ? class250.field4205 - arg1 : arg1);
            if (this.field2668) {
                for (int var5 = 0; var5 < class92.field1576; var5++) {
                    var3[var5] = var4[class77.field1260 - var5];
                }
            } else {
                class36.method217(var4, 0, var3, 0, class92.field1576);
            }
        }
        int var6 = 37 / ((arg0 + 49) / 33);
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZI)[[I", line = 51)
    public final int[][] method13(boolean arg0, int arg1) {
        field2678++;
        if (!arg0) {
            this.field2679 = true;
        }
        int[][] var3 = this.field4418.method35(arg1, 117);
        if (this.field4418.field94) {
            int[][] var4 = this.method1819(-93, 0, this.field2679 ? class250.field4205 - arg1 : arg1);
            int[] var5 = var4[1];
            int[] var6 = var3[0];
            int[] var7 = var4[2];
            int[] var8 = var4[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field2668) {
                for (int var11 = 0; var11 < class92.field1576; var11++) {
                    var6[var11] = var8[class77.field1260 - var11];
                    var9[var11] = var5[class77.field1260 - var11];
                    var10[var11] = var7[class77.field1260 - var11];
                }
            } else {
                for (int var12 = 0; var12 < class92.field1576; var12++) {
                    var6[var12] = var8[var12];
                    var9[var12] = var5[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lpb;BI)V", line = 128)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field2668 = arg0.method481(0) == 1;
        } else if (arg2 == 1) {
            this.field2679 = arg0.method481(0) == 1;
        } else if (arg2 == 2) {
            this.field4434 = arg0.method481(0) == 1;
        }
        if (arg1 >= -115) {
            this.method13(false, 96);
        }
        field2670++;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V", line = 208)
    public class158() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(BI)Lkd;", line = 173)
    public static final class69 method1154(byte arg0, int arg1) {
        field2671++;
        class69 var2 = (class69) class211.field3594.method58(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class131.field2166.method636(0, (byte) 117, arg1);
        } else {
            var3 = class254.field4278.method636(0, (byte) 97, arg1 & 0x7FFF);
        }
        class69 var4 = new class69();
        if (var3 != null) {
            var4.method416((byte) -118, new class70(var3));
        }
        if (arg0 > -65) {
            field2675 = (class47) null;
        }
        if (arg1 >= 32768) {
            var4.method419(15282);
        }
        class211.field3594.method63(0, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V", line = 217)
    public static final void method1155(int arg0, int arg1) {
        if (arg1 > -38) {
            method1155(80, 30);
        }
        class53 var2 = class303.method2112(-1155040160, arg0, 6);
        var2.method326(45);
        field2676++;
    }

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "(B)V", line = 230)
    public static void method1156(byte arg0) {
        field2672 = null;
        if (arg0 == -90) {
            field2675 = null;
            field2669 = null;
            field2673 = null;
        }
    }
}
