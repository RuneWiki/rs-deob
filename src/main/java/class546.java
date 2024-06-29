import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class546 {

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public int field7087;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "Lnj;")
    public static class415 field7086 = new class415(67, 0);

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public static int field7085;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lcda;Z)V", line = 5)
    public static final void method2896(class534 arg0, boolean arg1) {
        field7088++;
        arg0.method2846(true);
        int var2 = 0;
        for (int var3 = 0; var3 < class260.field3508; var3++) {
            int var15 = class135.field1779[var3];
            if ((class699.field9752[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class699.field9752[var15] = (byte) class131.method954(class699.field9752[var15], 2);
                } else {
                    int var16 = arg0.method2845(1, 8);
                    if (var16 == 0) {
                        var2 = class544.method2886(true, arg0);
                        class699.field9752[var15] = (byte) class131.method954(class699.field9752[var15], 2);
                    } else {
                        class448.method2543(var15, arg0, 3);
                    }
                }
            }
        }
        arg0.method2837((byte) 106);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg0.method2846(arg1);
        for (int var4 = 0; var4 < class260.field3508; var4++) {
            int var13 = class135.field1779[var4];
            if ((class699.field9752[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class699.field9752[var13] = (byte) class131.method954(class699.field9752[var13], 2);
                } else {
                    int var14 = arg0.method2845(1, 8);
                    if (var14 == 0) {
                        var2 = class544.method2886(true, arg0);
                        class699.field9752[var13] = (byte) class131.method954(class699.field9752[var13], 2);
                    } else {
                        class448.method2543(var13, arg0, 3);
                    }
                }
            }
        }
        arg0.method2837((byte) -106);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg0.method2846(true);
        for (int var5 = 0; var5 < class154.field1951; var5++) {
            int var11 = class420.field5434[var5];
            if ((class699.field9752[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class699.field9752[var11] = (byte) class131.method954(class699.field9752[var11], 2);
                    var2--;
                } else {
                    int var12 = arg0.method2845(1, 8);
                    if (var12 == 0) {
                        var2 = class544.method2886(arg1, arg0);
                        class699.field9752[var11] = (byte) class131.method954(class699.field9752[var11], 2);
                    } else if (class559.method2990(-125, var11, arg0)) {
                        class699.field9752[var11] = (byte) class131.method954(class699.field9752[var11], 2);
                    }
                }
            }
        }
        arg0.method2837((byte) -122);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg0.method2846(true);
        for (int var6 = 0; var6 < class154.field1951; var6++) {
            int var9 = class420.field5434[var6];
            if ((class699.field9752[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class699.field9752[var9] = (byte) class131.method954(class699.field9752[var9], 2);
                    var2--;
                } else {
                    int var10 = arg0.method2845(1, 8);
                    if (var10 == 0) {
                        var2 = class544.method2886(true, arg0);
                        class699.field9752[var9] = (byte) class131.method954(class699.field9752[var9], 2);
                    } else if (class559.method2990(-125, var9, arg0)) {
                        class699.field9752[var9] = (byte) class131.method954(class699.field9752[var9], 2);
                    }
                }
            }
        }
        arg0.method2837((byte) -83);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class260.field3508 = 0;
        class154.field1951 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class699.field9752[var7] = (byte) (class699.field9752[var7] >> 1);
            class193 var8 = class592.field8019[var7];
            if (var8 == null) {
                class420.field5434[class154.field1951++] = var7;
            } else {
                class135.field1779[class260.field3508++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V", line = 213)
    public static void method2897(byte arg0) {
        field7086 = null;
        if (arg0 < 38) {
            field7086 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 223)
    public class546(String arg0, int arg1) {
        this.field7087 = arg1;
    }

    @OriginalMember(owner = "client!fs", name = "toString", descriptor = "()Ljava/lang/String;", line = 233)
    public final String toString() {
        field7085++;
        throw new IllegalStateException();
    }
}
