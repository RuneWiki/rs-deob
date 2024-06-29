import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class246 {

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "Lrg;")
    private class96 field4040 = new class96();

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "Lna;")
    public static class26 field4041 = class69.method505("Lade Texturen )2 ", (byte) -117);

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Lve;")
    public static class266 field4032;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "Lrg;")
    private class96 field4042;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)I", line = 6)
    public final int method1690(int arg0) {
        int var2 = 0;
        class96 var3 = this.field4040.field1575;
        field4029++;
        while (this.field4040 != var3) {
            var3 = var3.field1575;
            var2++;
        }
        return arg0 > -41 ? -56 : var2;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 38)
    public static void method1691(byte arg0) {
        int var1 = -102 / ((arg0 - 35) / 48);
        field4032 = null;
        field4041 = null;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)Lrg;", line = 50)
    public final class96 method1692(byte arg0) {
        class96 var2 = this.field4040.field1575;
        field4037++;
        if (this.field4040 == var2) {
            this.field4042 = null;
            return null;
        }
        this.field4042 = var2.field1575;
        if (arg0 < 14) {
            this.field4042 = (class96) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)Lrg;", line = 76)
    public final class96 method1693(int arg0) {
        field4031++;
        class96 var2 = this.field4040.field1575;
        if (this.field4040 == var2) {
            return null;
        } else {
            var2.method722((byte) -107);
            return arg0 == -1 ? var2 : (class96) null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)Lrg;", line = 94)
    public final class96 method1694(int arg0) {
        class96 var2 = this.field4042;
        int var3 = 101 / ((74 - arg0) / 44);
        field4033++;
        if (this.field4040 == var2) {
            this.field4042 = null;
            return null;
        } else {
            this.field4042 = var2.field1575;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lrg;B)V", line = 133)
    public final void method1695(class96 arg0, byte arg1) {
        field4038++;
        int var3 = 88 / ((-arg1 - 90) / 35);
        if (arg0.field1565 != null) {
            arg0.method722((byte) -107);
        }
        arg0.field1565 = this.field4040.field1565;
        arg0.field1575 = this.field4040;
        arg0.field1565.field1575 = arg0;
        arg0.field1575.field1565 = arg0;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[B)Lrk;", line = 153)
    public static final class175 method1696(int arg0, byte[] arg1) {
        field4030++;
        if (arg1 == null) {
            return null;
        } else if (arg0 == -22376) {
            class175 var2;
            if (class255.field4184) {
                var2 = new class105(arg1, class58.field936, class82.field1281, class141.field2149, class98.field1596, class205.field3203);
            } else {
                var2 = new class248(arg1, class58.field936, class82.field1281, class141.field2149, class98.field1596, class205.field3203);
            }
            class160.method1088((byte) 106);
            return var2;
        } else {
            return (class175) null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIIIII)V", line = 175)
    public static final void method1697(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 > -65) {
            return;
        }
        field4034++;
        class69 var10 = null;
        for (class69 var11 = (class69) class98.field1595.method264(-96); var11 != null; var11 = (class69) class98.field1595.method263(4)) {
            if (var11.field1068 == arg0 && var11.field1082 == arg4 && var11.field1066 == arg1 && var11.field1081 == arg7) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class69();
            var10.field1082 = arg4;
            var10.field1066 = arg1;
            var10.field1068 = arg0;
            var10.field1081 = arg7;
            class108.method765(72, var10);
            class98.field1595.method257(true, var10);
        }
        var10.field1080 = arg8;
        var10.field1079 = arg9;
        var10.field1077 = arg5;
        var10.field1083 = arg6;
        var10.field1074 = arg3;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V", line = 216)
    public static final void method1698(int arg0, int arg1) {
        class264.field4314 = 0;
        field4035++;
        class108.field1701 = -1;
        class306.field5280 = 1;
        class300.field5172 = arg1;
        class224.field3536 = false;
        class225.field3570 = null;
        class261.field4269 = arg0;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V", line = 232)
    public final void method1699(int arg0) {
        field4039++;
        if (arg0 != 17126) {
            method1696(-21, (byte[]) null);
        }
        while (true) {
            class96 var2 = this.field4040.field1575;
            if (this.field4040 == var2) {
                this.field4042 = null;
                return;
            }
            var2.method722((byte) -107);
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V", line = 294)
    public class246() {
        this.field4040.field1575 = this.field4040;
        this.field4040.field1565 = this.field4040;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBI)Lbn;", line = 274)
    public static final class66 method1700(int arg0, byte arg1, int arg2) {
        field4036++;
        class66 var3 = (class66) class287.field4796.method264(-95);
        int var4 = -82 % ((arg1 - 11) / 32);
        while (var3 != null) {
            if (var3.field1035 && var3.method489(arg2, (byte) 97, arg0)) {
                return var3;
            }
            var3 = (class66) class287.field4796.method263(4);
        }
        return null;
    }
}
