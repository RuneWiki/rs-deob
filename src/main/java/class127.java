import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class127 {

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public int field1646;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!ld", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1648++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(I)V")
    public class127(int arg0) {
        this.field1646 = arg0;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIBII)I")
    public static final int method874(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 > -5) {
            return -115;
        }
        field1645++;
        if (class661.field9303 == null) {
            return 0;
        }
        if (arg0 < 3) {
            int var6 = arg2 >> 9;
            int var7 = arg1 >> 9;
            if (arg4 < 0 || arg5 < 0 || class741.field10208 - 1 < arg4 || (class525.field7224 - 1) < arg5) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || class741.field10208 - 1 < var6 || var7 > class525.field7224 - 1) {
                return 0;
            }
            boolean var8 = (class533.field7338[1][arg2 >> 9][arg1 >> 9] & 0x2) != 0;
            if ((arg2 & 0x1FF) == 0) {
                boolean var9 = (class533.field7338[1][var6 - 1][arg1 >> 9] & 0x2) != 0;
                boolean var10 = (class533.field7338[1][var6][arg1 >> 9] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class533.field7338[1][arg4][arg5] & 0x2) != 0;
                }
            }
            if ((arg1 & 0x1FF) == 0) {
                boolean var11 = (class533.field7338[1][arg2 >> 9][var7 - 1] & 0x2) != 0;
                boolean var12 = (class533.field7338[1][arg2 >> 9][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class533.field7338[1][arg4][arg5] & 0x2) != 0;
                }
            }
            if (var8) {
                arg0++;
            }
        }
        return class661.field9303[arg0].method2529(arg1, arg2, (byte) -128);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZIIBII)V")
    public static final void method875(boolean arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (class661.field9305 != null && (arg5 != 3 || class631.field8824 != arg1 || class201.field2825 != arg2)) {
            class119.method851(class129.field1674, -1, class661.field9305);
            class661.field9305 = null;
        }
        field1647++;
        if (arg5 == 3 && class661.field9305 == null) {
            class661.field9305 = class578.method3386(arg2, arg1, -16777216, class129.field1674, 0, 0);
            if (class661.field9305 != null) {
                class201.field2825 = arg2;
                class631.field8824 = arg1;
                class266.method1738(-99);
            }
        }
        if (arg5 == 3 && class661.field9305 == null) {
            method875(true, -1, -1, (byte) 118, arg4, class688.field9602.field8518.method3732((byte) -98));
            return;
        }
        if (arg3 != 118) {
            method874(-57, -62, 28, (byte) 73, -11, -113);
        }
        Container var6;
        if (class661.field9305 != null) {
            var6 = class661.field9305;
            class277.field3991 = arg2;
            class20.field163 = arg1;
        } else if (class43.field453 == null) {
            if (class511.field7007 == null) {
                var6 = class785.field10774;
            } else {
                var6 = class511.field7007;
            }
            class20.field163 = var6.getSize().width;
            class277.field3991 = var6.getSize().height;
        } else {
            Insets var7 = class43.field453.getInsets();
            int var10001 = -var7.right;
            class20.field163 = class43.field453.getSize().width + var10001 - var7.left;
            int var10 = var7.top + var7.bottom;
            class277.field3991 = class43.field453.getSize().height - var10;
            var6 = class43.field453;
        }
        if (arg5 == 1) {
            class249.field3700 = class565.field7983;
            class424.field5890 = 0;
            class742.field10226 = class456.field6378;
            class339.field4915 = (class20.field163 - class456.field6378) / 2;
        } else {
            class462.method2779((byte) -93);
        }
        if (class425.field5937 != class224.field3414) {
            boolean var10000;
            if (class742.field10226 < 1024 && class249.field3700 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg0) {
            class436.method2616(106);
        } else {
            class749.field10341.setSize(class742.field10226, class249.field3700);
            if (class55.field651) {
                class664.method3787((byte) -81, class749.field10341);
            } else {
                class111.field1332.method190(class749.field10341, class742.field10226, class249.field3700);
            }
            if (class43.field453 == var6) {
                Insets var8 = class43.field453.getInsets();
                class749.field10341.setLocation(class339.field4915 + var8.left, class424.field5890 + var8.top);
            } else {
                class749.field10341.setLocation(class339.field4915, class424.field5890);
            }
        }
        if (arg5 >= 2) {
            class444.field6146 = true;
        } else {
            class444.field6146 = false;
        }
        if (class610.field8597 != -1) {
            class513.method3056(true, (byte) -24);
        }
        if (class679.field9490 != null && class203.method1303(class664.field9331, true)) {
            class570.method3352((byte) -114);
        }
        for (int var9 = 0; var9 < 100; var9++) {
            class363.field5240[var9] = true;
        }
        class516.field7074 = true;
    }
}
