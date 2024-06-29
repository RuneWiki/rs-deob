import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class205 extends class187 {

    @OriginalMember(owner = "client!np", name = "y", descriptor = "I")
    public int field2767 = 1;

    @OriginalMember(owner = "client!np", name = "E", descriptor = "[I")
    public static int[] field2772 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!np", name = "B", descriptor = "I")
    public static int field2770 = 0;

    @OriginalMember(owner = "client!np", name = "z", descriptor = "I")
    public static int field2768 = -1;

    @OriginalMember(owner = "client!np", name = "D", descriptor = "C")
    public char field2771;

    @OriginalMember(owner = "client!np", name = "w", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!np", name = "x", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!np", name = "A", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!np", name = "F", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!np", name = "G", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIIBI)V", line = 3)
    public static final void method1111(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field2765++;
        int var7 = class104.method556(class335.field4462, 2048, arg6, class6.field42);
        int var8 = class104.method556(class335.field4462, 2048, arg1, class6.field42);
        int var9 = class104.method556(class322.field4306, 2048, arg3, class310.field4183);
        int var10 = class104.method556(class322.field4306, 2048, arg4, class310.field4183);
        int var11 = class104.method556(class335.field4462, 2048, arg0 + arg6, class6.field42);
        int var12 = class104.method556(class335.field4462, 2048, arg1 - arg0, class6.field42);
        for (int var13 = var7; var13 < var11; var13++) {
            class296.method1740(var9, class153.field1932[var13], (byte) 81, arg2, var10);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class296.method1740(var9, class153.field1932[var14], (byte) 81, arg2, var10);
        }
        int var15 = class104.method556(class322.field4306, 2048, arg0 + arg3, class310.field4183);
        int var16 = class104.method556(class322.field4306, 2048, arg4 - arg0, class310.field4183);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class153.field1932[var17];
            class296.method1740(var9, var18, (byte) 81, arg2, var15);
            class296.method1740(var16, var18, (byte) 81, arg2, var10);
        }
        if (arg5 >= -102) {
            field2772 = null;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)V", line = 56)
    public static void method1112(boolean arg0) {
        field2772 = null;
        if (arg0) {
            method1111(-20, -59, -57, -89, -86, (byte) 49, 69);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIII)V", line = 69)
    public static final void method1113(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2773++;
        if (class176.field2201 == 1) {
            class382.field5446[class417.field5996 / 100].method93(class71.field789 - 8, class131.field1695 + -8);
        }
        if (arg2 < -24) {
            if (class176.field2201 == 2) {
                class382.field5446[(class417.field5996 / 100) + 4].method93(class71.field789 - 8, class131.field1695 + -8);
            }
            class200.method1083(5000);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Ltq;II)V", line = 95)
    private final void method1114(class250 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field2771 = class199.method1066(arg0.method1363((byte) 116), false);
        } else if (arg2 == 2) {
            this.field2767 = 0;
        }
        field2766++;
        if (arg1 != 10504) {
            field2768 = 95;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Ltq;B)V", line = 122)
    public final void method1115(class250 arg0, byte arg1) {
        int var3 = 64 % ((arg1 + 64) / 59);
        field2769++;
        while (true) {
            int var4 = arg0.method1350(31351);
            if (var4 == 0) {
                return;
            }
            this.method1114(arg0, 10504, var4);
        }
    }
}
