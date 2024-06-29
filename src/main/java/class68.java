import java.awt.Point;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class68 extends class39 implements class147 {

    @OriginalMember(owner = "client!aw", name = "N", descriptor = "Lbt;")
    public class39 field937;

    @OriginalMember(owner = "client!aw", name = "x", descriptor = "Ljava/util/Random;")
    public static Random field921 = new Random();

    @OriginalMember(owner = "client!aw", name = "K", descriptor = "I")
    public static int field934 = 2;

    @OriginalMember(owner = "client!aw", name = "u", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!aw", name = "v", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!aw", name = "w", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!aw", name = "y", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!aw", name = "z", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!aw", name = "A", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!aw", name = "B", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!aw", name = "C", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!aw", name = "D", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!aw", name = "E", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!aw", name = "F", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!aw", name = "G", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!aw", name = "H", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!aw", name = "I", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!aw", name = "J", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!aw", name = "L", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!aw", name = "M", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!aw", name = "O", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!aw", name = "P", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(IIIIIIIIIILbt;)V", line = 3)
    public class68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class39 arg10) {
        super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, class334.method2023(arg0, 119, arg1));
        this.field937 = arg10;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IILoa;)Lba;", line = 12)
    public final class352 method548(int arg0, int arg1, class638 arg2) {
        field928++;
        return arg0 == -585 ? null : null;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Z)V", line = 26)
    public final void method142(boolean arg0) {
        field924++;
        if (arg0) {
            field935 = -115;
        }
    }

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "(I)I", line = 37)
    public final int method179(int arg0) {
        if (arg0 != -1) {
            this.method562(-87);
        }
        field938++;
        return 0;
    }

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "(I)Z", line = 48)
    public final boolean method140(int arg0) {
        if (arg0 == 0) {
            field923++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "(I)I", line = 59)
    public final int method549(int arg0) {
        if (arg0 == 12352) {
            field919++;
            return 0;
        } else {
            return 94;
        }
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)V", line = 71)
    public final void method550(int arg0) {
        field922++;
        if (arg0 > -4) {
            field934 = -102;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IILgfa;IIZLoa;)V", line = 83)
    public final void method143(int arg0, int arg1, class687 arg2, int arg3, int arg4, boolean arg5, class638 arg6) {
        field939++;
        int var8 = -7 / (-arg3 / 54);
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Loa;B)Lac;", line = 92)
    public final class496 method551(class638 arg0, byte arg1) {
        field918++;
        if (arg1 >= -62) {
            this.method562(103);
        }
        return this.field937.method551(arg0, (byte) -64);
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(ZLoa;)V", line = 103)
    public final void method552(boolean arg0, class638 arg1) {
        if (arg0) {
            field932++;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)V", line = 114)
    public static final void method553(byte arg0) {
        field930++;
        int var1 = 0;
        if (class274.field3872.method546((byte) -110, class429.field6020)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class274.field3872.field885) {
            var1 |= 0x40;
        }
        class650.method3618(var1, -1);
        class164.field2499.method2018(true, var1);
        class648.field9184.method3060(var1, -16810);
        class648.field9185.method1499((byte) -101, var1);
        class569.field7652.method2129(var1, 30);
        class404.method2313(-104, var1);
        class357.method2115(false, var1);
        class640.method3568(1, var1);
        class210.method1381(var1, 15433);
        class70.method572(16912);
        if (arg0 <= 34) {
            method553((byte) -67);
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)I", line = 152)
    public final int method554(int arg0) {
        field926++;
        if (arg0 != -18971) {
            field934 = -62;
        }
        return 0;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(ILoa;)Lwc;", line = 167)
    public final class60 method555(int arg0, class638 arg1) {
        if (arg0 == 0) {
            field933++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(BLoa;)V", line = 179)
    public final void method556(byte arg0, class638 arg1) {
        field920++;
        if (arg0 <= 5) {
            this.method549(-126);
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(BI)V", line = 194)
    public static final void method557(byte arg0, int arg1) {
        field936++;
        if (!class274.field3872.field894) {
            arg1 = -1;
        }
        if (class179.field2657 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class342 var2 = class660.field9275.method1219(arg1, (byte) -15);
            class543 var3 = var2.method2046((byte) 75);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class503.field6878.method623(var3.method2989(), var3.method2991(), (byte) 78, class105.field1413, var3.method2992(), new Point(var2.field4959, var2.field4961));
                class179.field2657 = arg1;
            }
        }
        if (arg1 == -1 && class179.field2657 != -1) {
            class503.field6878.method623(-1, null, (byte) 78, class105.field1413, -1, new Point());
            class179.field2657 = -1;
        }
        if (arg0 > -125) {
            method558(50);
        }
    }

    @OriginalMember(owner = "client!aw", name = "k", descriptor = "(I)V", line = 234)
    public static void method558(int arg0) {
        if (arg0 != 0) {
            method553((byte) 43);
        }
        field921 = null;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IILoa;I)Z", line = 244)
    public final boolean method559(int arg0, int arg1, class638 arg2, int arg3) {
        field927++;
        return arg1 != -8003;
    }

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "(I)I", line = 263)
    public final int method560(int arg0) {
        field925++;
        return arg0 == 15654 ? 0 : 105;
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(BLoa;)V", line = 275)
    public final void method561(byte arg0, class638 arg1) {
        field931++;
        if (arg0 != 111) {
            method557((byte) -35, -118);
        }
    }

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "(I)Z", line = 285)
    public final boolean method562(int arg0) {
        if (arg0 == 29008) {
            field929++;
            return false;
        } else {
            return true;
        }
    }
}
