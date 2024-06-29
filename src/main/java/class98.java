import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class98 extends class142 implements class722 {

    @OriginalMember(owner = "client!ps", name = "W", descriptor = "Z")
    private boolean field1299 = false;

    @OriginalMember(owner = "client!ps", name = "X", descriptor = "Lvo;")
    public class43 field1300;

    @OriginalMember(owner = "client!ps", name = "K", descriptor = "Z")
    private boolean field1287;

    @OriginalMember(owner = "client!ps", name = "E", descriptor = "[I")
    public static int[] field1284 = new int[8];

    @OriginalMember(owner = "client!ps", name = "ab", descriptor = "I")
    public static int field1303 = -1;

    @OriginalMember(owner = "client!ps", name = "U", descriptor = "Lnga;")
    public static class514 field1297 = new class514();

    @OriginalMember(owner = "client!ps", name = "hb", descriptor = "I")
    public static int field1310 = 0;

    @OriginalMember(owner = "client!ps", name = "I", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!ps", name = "J", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!ps", name = "L", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!ps", name = "M", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!ps", name = "N", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!ps", name = "O", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!ps", name = "P", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!ps", name = "Q", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!ps", name = "R", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!ps", name = "S", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!ps", name = "T", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!ps", name = "V", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!ps", name = "Z", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!ps", name = "bb", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!ps", name = "cb", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!ps", name = "db", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!ps", name = "eb", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!ps", name = "fb", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!ps", name = "gb", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!ps", name = "Y", descriptor = "Loia;")
    private class90 field1301;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILha;)V", line = 3)
    public final void method678(int arg0, class60 arg1) {
        ++field1295;
        this.field1300.method261((byte) -85, arg1);
        if (arg0 != -25163) {
            this.method162((class176) null, (byte) -78, false, 22, (class60) null, 107, 28);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lha;I)V", line = 16)
    public final void method679(class60 arg0, int arg1) {
        if (arg1 != 24447) {
            field1284 = null;
        }
        ++field1288;
        this.field1300.method259(arg0, 105);
    }

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "(I)I", line = 27)
    public final int method132(int arg0) {
        if (arg0 != 0) {
            field1303 = -108;
        }
        ++field1289;
        return this.field1300.method266((byte) 125);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)I", line = 39)
    public final int method680(int arg0) {
        if (arg0 != 30472) {
            method683(55);
        }
        ++field1305;
        return this.field1300.field460;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V", line = 54)
    public final void method681(byte arg0) {
        if (arg0 != -96) {
            this.field1301 = null;
        }
        ++field1294;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Z)Z", line = 64)
    public final boolean method682(boolean arg0) {
        ++field1296;
        return !arg0 ? true : this.field1300.method265(21);
    }

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "(I)Z", line = 75)
    public final boolean method126(int arg0) {
        ++field1292;
        if (arg0 != 6540) {
            this.method684((class150) null, (byte) -110);
        }
        return this.field1299;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BLha;)Loia;", line = 91)
    public final class90 method134(byte arg0, class60 arg1) {
        ++field1293;
        if (arg0 != -53) {
            field1297 = null;
        }
        return this.field1301;
    }

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "(B)V", line = 105)
    public final void method150(byte arg0) {
        ++field1308;
        if (arg0 != -73) {
            field1303 = -80;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "(I)V", line = 119)
    public static void method683(int arg0) {
        if (arg0 != -22408) {
            method683(77);
        }
        field1297 = null;
        field1284 = null;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILha;BI)Z", line = 130)
    public final boolean method131(int arg0, class60 arg1, byte arg2, int arg3) {
        ++field1302;
        class472 var5 = this.field1300.method264(-1, false, 131072, arg1, false);
        if (var5 == null) {
            return false;
        } else {
            if (arg2 < 59) {
                this.method132(-80);
            }
            class10 var6 = arg1.method410();
            var6.method33(super.field2170, super.field2178, super.field2165);
            return class670.field9312 ? var5.method196(arg0, arg3, var6, false, 0, class661.field9249) : var5.method206(arg0, arg3, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lmg;B)V", line = 151)
    public final void method684(class150 arg0, byte arg1) {
        ++field1291;
        int var3 = 127 % ((arg1 - -41) / 46);
        this.field1300.method268(arg0, -118);
    }

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(B)Z", line = 161)
    public final boolean method157(byte arg0) {
        if (arg0 >= -70) {
            field1284 = null;
        }
        ++field1306;
        return false;
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(Lha;I)V", line = 172)
    public final void method136(class60 arg0, int arg1) {
        ++field1307;
        int var3 = 46 % ((53 - arg1) / 46);
        class472 var4 = this.field1300.method264(-1, true, 262144, arg0, true);
        if (var4 != null) {
            int var5 = super.field2170 >> 9;
            int var6 = super.field2165 >> 9;
            class10 var7 = arg0.method410();
            var7.method33(super.field2170, super.field2178, super.field2165);
            this.field1300.method262(var4, var5, var6, var7, false, var5, arg0, false, var6);
        }
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(Z)I", line = 196)
    public final int method128(boolean arg0) {
        ++field1304;
        if (arg0) {
            this.method685(82);
        }
        return this.field1300.method270((byte) -123);
    }

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)Z", line = 209)
    public final boolean method123(int arg0) {
        ++field1285;
        int var2 = -68 / ((arg0 - -76) / 47);
        return false;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)I", line = 222)
    public final int method685(int arg0) {
        if (arg0 != 4657) {
            this.method131(108, (class60) null, (byte) 101, -1);
        }
        ++field1309;
        return this.field1300.field471;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lha;Lvha;IIIIIZII)V", line = 234)
    public class98(class60 arg0, class685 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field9551);
        this.field1300 = new class43(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field1287 = arg1.field9610 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lgg;BZILha;II)V", line = 248)
    public final void method162(class176 arg0, byte arg1, boolean arg2, int arg3, class60 arg4, int arg5, int arg6) {
        int var8 = -32 / ((arg1 - 15) / 55);
        ++field1286;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(Lha;I)Lbd;", line = 258)
    public final class62 method127(class60 arg0, int arg1) {
        ++field1290;
        class472 var3 = this.field1300.method264(-1, false, 2048, arg0, true);
        if (var3 == null) {
            return null;
        } else {
            class10 var4 = arg0.method410();
            var4.method33(super.field2170, super.field2178, super.field2165);
            class62 var5 = class413.method2384(1, (byte) -47, this.field1287);
            int var6 = super.field2170 >> 9;
            if (arg1 >= -12) {
                this.method127((class60) null, -86);
            }
            int var7 = super.field2165 >> 9;
            this.field1300.method262(var3, var6, var7, var4, true, var6, arg0, false, var7);
            if (!class670.field9312) {
                var3.method230(var4, var5.field678[0], 0);
            } else {
                var3.method243(var4, var5.field678[0], class661.field9249, 0);
            }
            if (this.field1300.field474 != null) {
                class583 var8 = this.field1300.field474.method3116();
                if (class670.field9312) {
                    arg0.method397(var8, class661.field9249);
                } else {
                    arg0.method452(var8);
                }
            }
            this.field1299 = var3.method219() || this.field1300.field474 != null;
            if (this.field1301 != null) {
                class412.method2379(super.field2178, super.field2170, 18, super.field2165, var3, this.field1301);
            } else {
                this.field1301 = class185.method1041(super.field2178, super.field2170, var3, super.field2165, 4);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)I", line = 310)
    public final int method686(byte arg0) {
        if (arg0 != 20) {
            field1303 = -77;
        }
        ++field1298;
        return this.field1300.field439;
    }
}
