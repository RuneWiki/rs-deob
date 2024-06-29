import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public abstract class class82 extends class60 {

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "Z")
    public static boolean field1277 = true;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field1270 = new String[100];

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "I")
    public static int field1281 = 0;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "Z")
    public boolean field1280;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "[I")
    public static int[] field1268;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "()I", line = 13)
    public int method636() {
        field1279++;
        return 0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)Z", line = 22)
    public final boolean method638(int arg0) {
        field1272++;
        int var2 = -125 % ((-arg0 - 51) / 58);
        return this.field1280;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)[Lwk;", line = 32)
    public static final class186[] method639(byte arg0) {
        field1273++;
        class186[] var1 = new class186[class89.field1426];
        for (int var2 = 0; var2 < class89.field1426; var2++) {
            var1[var2] = new class186(class185.field2926, class112.field1821, class61.field892[var2], class183.field2902[var2], class309.field4887[var2], class83.field1288[var2], class207.field3277[var2], class260.field3873);
        }
        class260.method1796(1952227009);
        int var3 = -93 / ((arg0 + 48) / 49);
        return var1;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZILpk;)Leg;", line = 56)
    public static final class317 method641(int arg0, boolean arg1, int arg2, class120 arg3) {
        field1267++;
        if (arg1) {
            return class107.method854(arg3, arg0, arg2, (byte) 105) ? class135.method1037(-1) : null;
        } else {
            return (class317) null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(Z)Z", line = 70)
    public final boolean method642(boolean arg0) {
        if (arg0) {
            field1277 = true;
        }
        field1266++;
        return false;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)V", line = 83)
    public static void method644(byte arg0) {
        field1268 = null;
        field1270 = null;
        if (arg0 < 25) {
            method646(82, -127, 45, -26);
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)V", line = 96)
    public static final void method645(int arg0, int arg1) {
        if (arg1 != -18152) {
            method645(101, 108);
        }
        class307 var2 = (class307) class340.field5253.method79((long) arg0, (byte) 0);
        field1269++;
        if (var2 != null) {
            var2.method489(false);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIII)I", line = 112)
    public static final int method646(int arg0, int arg1, int arg2, int arg3) {
        field1275++;
        if ((class332.field5184[arg1][arg3][arg2] & 0x8) != 0) {
            return 0;
        } else if (arg1 <= 0 || (class332.field5184[1][arg3][arg2] & 0x2) == 0) {
            if (arg0 >= -119) {
                field1281 = 113;
            }
            return arg1;
        } else {
            return arg1 - 1;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)Z", line = 137)
    public final boolean method647(int arg0) {
        if (arg0 <= 125) {
            return true;
        } else {
            field1274++;
            return false;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lpk;III)[Lme;", line = 154)
    public static final class200[] method649(class120 arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            field1271++;
            return class107.method854(arg0, arg1, arg3, (byte) 124) ? class328.method2304(0) : null;
        } else {
            return (class200[]) null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;BLjava/lang/String;)V", line = 170)
    public static final void method650(int arg0, String arg1, String arg2, byte arg3, String arg4) {
        class115.method901(arg0, -91, -1, arg4, arg2, arg1);
        field1278++;
        if (arg3 >= -104) {
            field1281 = -119;
        }
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(B)I", line = 186)
    public final int method652(byte arg0) {
        if (arg0 == 69) {
            field1276++;
            return 1;
        } else {
            return -71;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "()V")
    public abstract void method637();

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V")
    public abstract void method640(int arg0, int arg1);

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIII)V")
    public abstract void method643(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "()Z")
    public abstract boolean method648();

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "()Z")
    public abstract boolean method651();

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V")
    public abstract void method653(int arg0);
}
