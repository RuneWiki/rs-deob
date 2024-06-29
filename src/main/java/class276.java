import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class276 {

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field4156 = -1;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field4160 = 99;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "Lrf;")
    public static class289 field4158 = null;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)Lwd;")
    public static final class23 method1827(byte arg0, int arg1) {
        field4162++;
        class23 var2 = (class23) class244.field3653.method1777((long) arg1, (byte) 112);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class227.field3396.method1973(1, class255.method1679((byte) 123, arg1), class119.method757(arg1, true));
        if (arg0 <= 34) {
            field4158 = null;
        }
        class23 var4 = new class23();
        if (var3 != null) {
            var4.method149(true, new class248(var3));
        }
        class244.field3653.method1784((long) arg1, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BII)Ljava/lang/String;")
    public static final String method1828(byte arg0, int arg1, int arg2) {
        field4161++;
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (arg0 == 42) {
            return var3 > 0 ? "<col=c0ff00>" : "<col=ffff00>";
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Lcc;")
    public static final class215 method1829(int arg0, int arg1) {
        field4155++;
        class215 var2 = (class215) class177.field2709.method1777((long) arg0, (byte) 112);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class237.field3580.method1973(1, class234.method1488(false, arg0), class217.method1393(arg0, 127));
        class215 var4 = new class215();
        var4.field3230 = arg0;
        if (var3 != null) {
            var4.method1383(24484, new class248(var3));
        }
        if (arg1 != 29223) {
            field4158 = null;
        }
        var4.method1377(-1);
        class177.field2709.method1784((long) arg0, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method1830(int arg0) {
        field4158 = null;
        if (arg0 != 8) {
            field4158 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static final void method1831(byte arg0) {
        while (true) {
            if (class100.field1580.method1097(class202.field3050, 8) >= 27) {
                int var1 = class100.field1580.method1098(15, (byte) -12);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class18.field220[var1] == null) {
                        var2 = true;
                        class18.field220[var1] = new class61();
                    }
                    class61 var3 = class18.field220[var1];
                    class169.field2586[class24.field295++] = var1;
                    var3.field2278 = class270.field4058;
                    if (var3.field959 != null && var3.field959.method493(arg0 + 169)) {
                        class191.method1200((byte) 97, var3);
                    }
                    int var4 = class100.field1580.method1098(5, (byte) -70);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = class248.field3760[class100.field1580.method1098(3, (byte) 122)];
                    if (var2) {
                        var3.field2233 = var3.field2273 = var5;
                    }
                    int var6 = class100.field1580.method1098(1, (byte) 122);
                    var3.method405(class267.method1783((byte) 117, class100.field1580.method1098(14, (byte) -19)), (byte) 61);
                    int var7 = class100.field1580.method1098(5, (byte) -38);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = class100.field1580.method1098(1, (byte) 81);
                    if (var8 == 1) {
                        class113.field1736[class118.field1781++] = var1;
                    }
                    var3.method930(arg0 ^ 0xFFFFFF94, var3.field959.field1148);
                    var3.field2287 = var3.field959.field1176;
                    var3.field2269 = var3.field959.field1194;
                    if (var3.field2269 == 0) {
                        var3.field2273 = 0;
                    }
                    var3.method929(var3.method676(-30217), var6 == 1, class165.field2537.field2275[0] + var4, -1, class165.field2537.field2297[0] - -var7);
                    if (var3.field959.method493(arg0 ^ 0xFFFFFFA3)) {
                        class89.method573(var3.field2297[0], (class107) null, class99.field1557, 0, var3, var3.field2275[0], arg0 + 100, (class288) null);
                    }
                    continue;
                }
            }
            if (arg0 != -50) {
                field4160 = 63;
            }
            class100.field1580.method1103((byte) -65);
            field4163++;
            return;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIII)V")
    public static final void method1832(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -32768) {
            field4160 = 7;
        }
        field4159++;
        if (arg0 <= arg3) {
            for (int var5 = arg0; var5 < arg3; var5++) {
                class23.field284[var5][arg1] = arg4;
            }
        } else {
            for (int var6 = arg3; var6 < arg0; var6++) {
                class23.field284[var6][arg1] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)Lei;")
    public static final class175 method1833(int arg0, int arg1) {
        if (arg1 >= -46) {
            return null;
        } else {
            field4157++;
            return (class175) class145.field2120.method1666((long) arg0, (byte) 53);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)Lmb;")
    public static final class162 method1834(int arg0, int arg1, int arg2) {
        class270 var3 = class33.field487[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4084;
    }
}
