import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class592 {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field8035;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field8036;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field8037;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field8038;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field8039;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILgt;IIBI)V", line = 9)
    public static final void method3391(int arg0, class481 arg1, int arg2, int arg3, byte arg4, int arg5) {
        field8037++;
        class88 var6 = null;
        for (class88 var7 = (class88) class651.field8995.method2725(arg4 ^ 0x3E); var7 != null; var7 = (class88) class651.field8995.method2726(-120)) {
            if (var7.field1182 == arg0 && var7.field1176 == arg3 && var7.field1179 == arg5 && var7.field1175 == arg2) {
                var6 = var7;
                break;
            }
        }
        if (var6 == null) {
            var6 = new class88();
            var6.field1179 = arg5;
            var6.field1175 = arg2;
            var6.field1176 = arg3;
            var6.field1182 = arg0;
            class651.field8995.method2732(var6, arg4 ^ 0x55A8);
        }
        var6.field1184 = false;
        if (arg4 == 27) {
            var6.field1170 = true;
            var6.field1180 = arg1;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)[B", line = 48)
    public static final synchronized byte[] method3392(int arg0, int arg1) {
        field8038++;
        if (arg0 == 100 && class415.field5436 > 0) {
            byte[] var2 = class501.field7029[--class415.field5436];
            class501.field7029[class415.field5436] = null;
            return var2;
        } else if (arg0 == 5000 && class603.field8147 > 0) {
            byte[] var3 = class375.field4703[--class603.field8147];
            class375.field4703[class603.field8147] = null;
            return var3;
        } else if (arg1 != -1) {
            return null;
        } else if (arg0 == 30000 && class197.field2344 > 0) {
            byte[] var4 = class637.field8742[--class197.field2344];
            class637.field8742[class197.field2344] = null;
            return var4;
        } else {
            if (class650.field8861 != null) {
                for (int var5 = 0; var5 < class215.field2538.length; var5++) {
                    if (class215.field2538[var5] == arg0 && class152.field1900[var5] > 0) {
                        byte[] var6 = class650.field8861[var5][--class152.field1900[var5]];
                        class650.field8861[var5][class152.field1900[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I[B)V", line = 107)
    public static final synchronized void method3393(int arg0, byte[] arg1) {
        field8036++;
        if (arg1.length == 100 && class415.field5436 < 1000) {
            class501.field7029[class415.field5436++] = arg1;
        } else if (arg0 <= -82) {
            if (arg1.length == 5000 && class603.field8147 < 250) {
                class375.field4703[class603.field8147++] = arg1;
            } else if (arg1.length == 30000 && class197.field2344 < 50) {
                class637.field8742[class197.field2344++] = arg1;
            } else if (class650.field8861 != null) {
                for (int var2 = 0; var2 < class215.field2538.length; var2++) {
                    if (class215.field2538[var2] == arg1.length && class650.field8861[var2].length > class152.field1900[var2]) {
                        class650.field8861[var2][class152.field1900[var2]++] = arg1;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIZIII)I", line = 154)
    public static final int method3394(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg2) {
            method3392(-78, -15);
        }
        field8035++;
        if (class621.field8523 == null) {
            return 0;
        }
        if (arg1 < 3) {
            int var6 = arg4 >> 9;
            int var7 = arg3 >> 9;
            if (arg0 < 0 || arg5 < 0 || arg0 > class596.field8090 - 1 || class107.field1350 - 1 < arg5) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || (class596.field8090 - 1) < var6 || class107.field1350 - 1 < var7) {
                return 0;
            }
            boolean var8 = (class124.field1585[1][arg4 >> 9][arg3 >> 9] & 0x2) != 0;
            if ((arg4 & 0x1FF) == 0) {
                boolean var9 = (class124.field1585[1][var6 - 1][arg3 >> 9] & 0x2) != 0;
                boolean var10 = (class124.field1585[1][var6][arg3 >> 9] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class124.field1585[1][arg0][arg5] & 0x2) != 0;
                }
            }
            if ((arg3 & 0x1FF) == 0) {
                boolean var11 = (class124.field1585[1][arg4 >> 9][var7 - 1] & 0x2) != 0;
                boolean var12 = (class124.field1585[1][arg4 >> 9][var7] & 0x2) != 0;
                if (var12 != var11) {
                    var8 = (class124.field1585[1][arg0][arg5] & 0x2) != 0;
                }
            }
            if (var8) {
                arg1++;
            }
        }
        return class621.field8523[arg1].method1730(arg4, arg3, -1);
    }
}
