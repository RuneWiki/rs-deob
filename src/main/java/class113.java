import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class113 extends class43 {

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "J")
    public long field1320;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
    public static int field1317 = 0;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "J")
    public static long field1316 = 0L;

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "Lcq;")
    public static class72 field1321 = new class72("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!dq", name = "t", descriptor = "I")
    public static int field1325 = 0;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!dq", name = "q", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!dq", name = "r", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!dq", name = "s", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!dq", name = "u", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZILoo;ILoo;)I")
    public static final int method658(boolean arg0, int arg1, class27 arg2, int arg3, class27 arg4) {
        field1326++;
        if (arg1 == 1) {
            int var5 = arg4.field5316;
            int var6 = arg2.field5316;
            if (!arg0) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 != -17541) {
            return -113;
        } else if (arg1 == 2) {
            return class163.method1037(class373.field5057, arg4.method171(true).field634, arg2.method171(true).field634, (byte) 92);
        } else if (arg1 == 3) {
            if (arg4.field302.equals("-")) {
                if (arg2.field302.equals("-")) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg2.field302.equals("-")) {
                return arg0 ? 1 : -1;
            } else {
                return class163.method1037(class373.field5057, arg4.field302, arg2.field302, (byte) 92);
            }
        } else if (arg1 == 4) {
            if (arg4.method2421((byte) -67)) {
                return arg2.method2421((byte) -67) ? 0 : 1;
            } else if (arg2.method2421((byte) -67)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 5) {
            if (arg4.method2425((byte) 74)) {
                return arg2.method2425((byte) 74) ? 0 : 1;
            } else if (arg2.method2425((byte) 74)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 6) {
            if (arg4.method2419(0)) {
                return arg2.method2419(0) ? 0 : 1;
            } else if (arg2.method2419(0)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 7) {
            if (arg4.method2420(99)) {
                return arg2.method2420(arg3 + 17433) ? 0 : 1;
            } else if (arg2.method2420(-79)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 8) {
            int var7 = arg4.field303;
            int var8 = arg2.field303;
            if (arg0) {
                if (var7 == 1000) {
                    var7 = -1;
                }
                if (var8 == 1000) {
                    var8 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg4.field299 - arg2.field299;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lwo;IIZLwo;)V")
    public static final void method659(class285 arg0, int arg1, int arg2, boolean arg3, class285 arg4) {
        class450.field6293 = arg3;
        class270.field3503 = arg4;
        class266.field3430 = arg0;
        field1323++;
        class67.field802 = arg1;
        int var5 = class266.field3430.method1793(arg2 ^ arg2) - 1;
        class126.field1413 = var5 * 256 + class266.field3430.method1821(arg2 - 117, var5);
        class384.field5262 = new String[] { null, null, class270.field3486.method434(class67.field802, arg2 ^ 0x1FFF), null, null };
        class39.field463 = new String[] { null, null, null, null, class219.field2707.method434(class67.field802, -8192) };
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)V")
    public static void method660(byte arg0) {
        field1321 = null;
        if (arg0 < 12) {
            field1321 = null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIII)I")
    public static final int method661(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 28278) {
            field1316 = -63L;
        }
        field1322++;
        int var5 = 65536 - class363.field4917[arg3 * 8192 / arg2] >> 1;
        return ((65536 - var5) * arg0 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V")
    public class113() {
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(J)V")
    public class113(long arg0) {
        this.field1320 = arg0;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZI)Z")
    public static final boolean method662(boolean arg0, int arg1) {
        field1318++;
        if (!arg0) {
            method659((class285) null, 19, -98, true, (class285) null);
        }
        return (-arg1 & arg1) == arg1;
    }
}
