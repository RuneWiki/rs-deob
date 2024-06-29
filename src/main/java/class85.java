import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class85 {

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "Lpn;")
    public static class72 field1043 = new class72(12, 7);

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "Ljava/lang/String;")
    public static String field1050 = "";

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public int field1027;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public int field1028;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public int field1029;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public int field1030;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    public int field1032;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    public int field1034;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
    public int field1035;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    public int field1036;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
    public int field1037;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
    public int field1039;

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
    public int field1040;

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "I")
    public int field1041;

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!mn", name = "v", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "I")
    public int field1047;

    @OriginalMember(owner = "client!mn", name = "x", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!mn", name = "y", descriptor = "I")
    public int field1049;

    @OriginalMember(owner = "client!mn", name = "A", descriptor = "I")
    public static int field1051;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mn", name = "B", descriptor = "Ljava/lang/Class;")
    public static Class field1052;

    // $FF: synthetic method
    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method437(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Loj;Lab;B)V", line = 7)
    public static final void method429(class280 arg0, class256 arg1, byte arg2) {
        field1026++;
        boolean var3 = class422.field6096.method115(arg1.field3655, arg1.field3585, 127, arg1.field3615, arg1.field3616 ? class19.field258.field2722 : null, arg1.field3694, arg0, arg1.field3701 | 0xFF000000) == null;
        int var4 = 107 / ((arg2 - 91) / 33);
        if (var3) {
            class242.field3316.method803(new class232(arg1.field3585, arg1.field3655, arg1.field3694, arg1.field3701 | 0xFF000000, arg1.field3615, arg1.field3616), 50);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILg;II)Lkp;", line = 21)
    public static final class10 method430(int arg0, class470 arg1, int arg2, int arg3) {
        field1033++;
        if (arg2 >= -50) {
            field1043 = null;
        }
        byte[] var4 = arg1.method2768(-20472, arg0, arg3);
        return var4 == null ? null : new class10(var4);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V", line = 38)
    public static final void method431(int arg0) {
        field1031++;
        if (class57.field725 == -1) {
            return;
        }
        int var1 = class278.field3966.method837(-1);
        int var2 = class278.field3966.method838(-117);
        if (class361.field5205 != null) {
            var1 = class361.field5205.method490(0);
            var2 = class361.field5205.method487((byte) 96);
        }
        class51.method271(0, var1, 0, class464.field6541, 0, class110.field1336, class57.field725, true, 0, var2);
        if (class289.field4318 != null) {
            class187.method1010(-99, var1, var2);
        }
        int var3 = 125 % ((arg0 + 30) / 57);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)Z", line = 65)
    public static final boolean method432(int arg0, int arg1, int arg2) {
        field1046++;
        class415 var3 = class173.field2084.method2297(50, arg2);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg1 >= ~arg0 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method2470(116, arg0);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(JI)V", line = 87)
    public static final void method433(long arg0, int arg1) {
        field1051++;
        if (arg0 <= 0L) {
            return;
        }
        int var3 = 84 % ((27 - arg1) / 48);
        if ((arg0 % 10L) == 0L) {
            class76.method386(arg0 - 1L, (byte) 30);
            class76.method386(1L, (byte) 30);
        } else {
            class76.method386(arg0, (byte) 30);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V", line = 117)
    public static void method434(boolean arg0) {
        field1050 = null;
        if (arg0) {
            method433(-99L, 50);
        }
        field1043 = null;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V", line = 129)
    public static final void method435(int arg0) {
        field1048++;
        if (class348.field4961 != null) {
            return;
        }
        int var1 = class171.field2020;
        int var2 = class428.field6173;
        int var3 = class74.field898 - class110.field1336 - var1;
        if (arg0 != -1) {
            field1043 = null;
        }
        int var4 = class119.field1473 - class464.field6541 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class41.field500 == null) {
                var5 = class42.field512.field5106;
            } else {
                var5 = class41.field500;
            }
            int var6 = 0;
            int var7 = 0;
            if (class41.field500 == var5) {
                Insets var8 = class41.field500.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class119.field1473);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class74.field898, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class74.field898 - var3, var7, var3, class119.field1473);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class119.field1473 - var4, class74.field898, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIZ)Z", line = 212)
    public static final boolean method436(int arg0, int arg1, int arg2, boolean arg3) {
        field1045++;
        class116 var4 = (class116) class63.method320(arg1, arg0, arg2);
        boolean var5 = arg3;
        if (var4 != null) {
            var5 = arg3 & class270.method1635(-92, var4);
        }
        class116 var6 = (class116) class263.method1603(arg1, arg0, arg2, field1052 == null ? (field1052 = method437("td")) : field1052);
        if (var6 != null) {
            var5 &= class270.method1635(-67, var6);
        }
        class116 var7 = (class116) class427.method2542(arg1, arg0, arg2);
        if (var7 != null) {
            var5 &= class270.method1635(-125, var7);
        }
        return var5;
    }
}
