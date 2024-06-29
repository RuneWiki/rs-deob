import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class106 extends class26 {

    @OriginalMember(owner = "client!j", name = "w", descriptor = "[B")
    public byte[] field1381;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field1373 = 0;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "Ljava/lang/String;")
    public static String field1379 = " more options";

    @OriginalMember(owner = "client!j", name = "x", descriptor = "[S")
    public static short[] field1382 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!j", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1378 = "Opened title screen";

    @OriginalMember(owner = "client!j", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1375 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!j", name = "s", descriptor = "Z")
    public static boolean field1377 = false;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "Ljava/lang/String;")
    public static String field1380 = "Loading defaults - ";

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)J", line = 14)
    public static final long method748(int arg0, int arg1, int arg2) {
        class119 var3 = class345.field5367[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field1563; var4++) {
            class294 var5 = var3.field1549[var4];
            if ((var5.field4289 >> 29 & 0x3L) == 2L && var5.field4283 == arg1 && var5.field4287 == arg2) {
                return var5.field4289;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Lwh;", line = 35)
    public static final class317 method749(int arg0, int arg1) {
        field1383++;
        class317 var2 = (class317) class308.field4524.method1116(17301, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class313.field4595.method1089(0, (byte) 112, arg0 & 0x7FFF);
        } else {
            var3 = class215.field3040.method1089(0, (byte) 116, arg0);
        }
        class317 var4 = new class317();
        if (arg1 != 29898) {
            method750((byte) -99);
        }
        if (var3 != null) {
            var4.method2188((byte) -19, new class299(var3));
        }
        if (arg0 >= 32768) {
            var4.method2194(32768);
        }
        class308.field4524.method1115((long) arg0, 124, var4);
        return var4;
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(B)V", line = 66)
    public static void method750(byte arg0) {
        field1375 = null;
        if (arg0 == -58) {
            field1379 = null;
            field1382 = null;
            field1380 = null;
            field1378 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V", line = 83)
    public static final void method751(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1376++;
        for (class96 var5 = (class96) class264.field3831.method413(1253231568); var5 != null; var5 = (class96) class264.field3831.method419(63)) {
            class360.method2503(false, arg0, arg3, arg4, var5, arg2);
        }
        class96 var6 = (class96) class343.field5336.method413(1253231568);
        if (arg1 <= 72) {
            return;
        }
        while (var6 != null) {
            byte var7 = 1;
            class91 var8 = var6.field1266.method2300((byte) 124);
            if (var6.field1266.field4897 == var8.field1182) {
                var7 = 0;
            } else if (var6.field1266.field4897 == var8.field1149 || var6.field1266.field4897 == var8.field1147 || var6.field1266.field4897 == var8.field1178 || var6.field1266.field4897 == var8.field1189) {
                var7 = 2;
            } else if (var6.field1266.field4897 == var8.field1174 || var6.field1266.field4897 == var8.field1151 || var6.field1266.field4897 == var8.field1183 || var6.field1266.field4897 == var8.field1172) {
                var7 = 3;
            }
            if (var6.field1250 != var7) {
                int var9 = class336.method2345((byte) -54, var6.field1266);
                if (var6.field1256 != var9) {
                    if (var6.field1260 != null) {
                        class186.field2548.method2246(var6.field1260);
                        var6.field1260 = null;
                    }
                    var6.field1256 = var9;
                }
                var6.field1250 = var7;
            }
            var6.field1268 = var6.field1266.field4855;
            var6.field1258 = var6.field1266.field4855 + (var6.field1266.method1699(-1) * 64);
            var6.field1253 = var6.field1266.field4893;
            var6.field1251 = var6.field1266.field4893 + (var6.field1266.method1699(-1) * 64);
            class360.method2503(false, arg0, arg3, arg4, var6, arg2);
            var6 = (class96) class343.field5336.method419(56);
        }
        for (class96 var10 = (class96) class169.field2344.method2277(13292); var10 != null; var10 = (class96) class169.field2344.method2278((byte) -94)) {
            byte var11 = 1;
            class91 var12 = var10.field1269.method2300((byte) -77);
            if (var10.field1269.field4897 == var12.field1182) {
                var11 = 0;
            } else if (var10.field1269.field4897 == var12.field1149 || var10.field1269.field4897 == var12.field1147 || var10.field1269.field4897 == var12.field1178 || var10.field1269.field4897 == var12.field1189) {
                var11 = 2;
            } else if (var10.field1269.field4897 == var12.field1174 || var10.field1269.field4897 == var12.field1151 || var10.field1269.field4897 == var12.field1183 || var10.field1269.field4897 == var12.field1172) {
                var11 = 3;
            }
            if (var10.field1250 != var11) {
                int var13 = class336.method2346(var10.field1269, (byte) -106);
                if (var10.field1256 != var13) {
                    if (var10.field1260 != null) {
                        class186.field2548.method2246(var10.field1260);
                        var10.field1260 = null;
                    }
                    var10.field1256 = var13;
                }
                var10.field1250 = var11;
            }
            var10.field1268 = var10.field1269.field4855;
            var10.field1258 = var10.field1269.field4855 + var10.field1269.method1699(-1) * 64;
            var10.field1253 = var10.field1269.field4893;
            var10.field1251 = var10.field1269.field4893 + (var10.field1269.method1699(-1) * 64);
            class360.method2503(false, arg0, arg3, arg4, var10, arg2);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILfh;)V", line = 210)
    public static final void method752(int arg0, class140 arg1) {
        class161.field2302 = arg1;
        field1374++;
        if (arg0 != -12014) {
            field1382 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "([B)V", line = 219)
    public class106(byte[] arg0) {
        this.field1381 = arg0;
    }
}
