import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class191 {

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public int field3272 = 0;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public int field3279 = -1;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public int field3282 = -1;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Z")
    public boolean field3283 = true;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Ljd;")
    public static class85 field3273 = class221.method1499("unzap", (byte) 106);

    @OriginalMember(owner = "client!t", name = "g", descriptor = "[[[Lwe;")
    public static class15[][][] field3278 = new class15[4][104][104];

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IBLvb;)V")
    public static final void method1312(int arg0, byte arg1, class58 arg2) {
        field3276++;
        if (arg2.field1035 > class151.field2555) {
            class144.method942(arg2, 127);
        } else if (class151.field2555 > arg2.field1050) {
            class75.method529(arg2, (byte) -95);
        } else {
            class199.method1366(arg2, 64);
        }
        if (arg2.field1042 < 128 || arg2.field1027 < 128 || arg2.field1042 >= 13184 || arg2.field1027 >= 13184) {
            arg2.field1056 = -1;
            arg2.field1035 = 0;
            arg2.field1064 = -1;
            arg2.field1050 = 0;
            arg2.field1042 = arg2.field1043[0] * 128 + arg2.method311((byte) 73) * 64;
            arg2.field1027 = arg2.field1066[0] * 128 + arg2.method311((byte) -119) * 64;
            arg2.method388((byte) -85);
        }
        if (class22.field308 == arg2 && (arg2.field1042 < 1536 || arg2.field1027 < 1536 || arg2.field1042 >= 11776 || arg2.field1027 >= 11776)) {
            arg2.field1064 = -1;
            arg2.field1035 = 0;
            arg2.field1050 = 0;
            arg2.field1056 = -1;
            arg2.field1042 = arg2.field1043[0] * 128 + arg2.method311((byte) 124) * 64;
            arg2.field1027 = arg2.field1066[0] * 128 + arg2.method311((byte) -68) * 64;
            arg2.method388((byte) 49);
        }
        class111.method760(14047, arg2);
        if (arg1 <= 36) {
            field3273 = null;
        }
        class229.method1538(-1, arg2);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)I")
    public static final int method1313(int arg0, int arg1, int arg2) {
        if (arg0 >= -80) {
            field3278 = null;
        }
        field3274++;
        int var3 = 0;
        while (arg1 > 0) {
            arg1--;
            var3 = var3 << 1 | arg2 & 0x1;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)Lt;")
    public static final class191 method1314(int arg0, int arg1) {
        field3275++;
        class191 var2 = (class191) class124.field2191.method1269((long) arg1, (byte) 88);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class262.field4644.method464(-1, 4, arg1);
        class191 var4 = new class191();
        if (var3 != null) {
            var4.method1315(arg1, new class247(var3), (byte) 101);
        }
        if (arg0 >= -35) {
            return null;
        } else {
            class124.field2191.method1271(-15561, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILik;B)V")
    private final void method1315(int arg0, class247 arg1, byte arg2) {
        if (arg2 != 101) {
            this.method1317(14, -110, (class247) null, 93);
        }
        field3280++;
        while (true) {
            int var4 = arg1.method1711((byte) -67);
            if (var4 == 0) {
                return;
            }
            this.method1317(64, arg0, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static void method1316(int arg0) {
        if (arg0 < 119) {
            field3278 = null;
        }
        field3278 = null;
        field3273 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILik;I)V")
    private final void method1317(int arg0, int arg1, class247 arg2, int arg3) {
        field3277++;
        if (arg0 != 64) {
            return;
        }
        if (arg3 == 1) {
            this.field3272 = class142.method937(arg2.method1691(19388), (byte) 73);
        } else if (arg3 == 2) {
            this.field3279 = arg2.method1711((byte) -67);
        } else if (arg3 == 3) {
            this.field3279 = arg2.method1694((byte) -100);
            if (this.field3279 == 65535) {
                this.field3279 = -1;
                return;
            }
        } else if (arg3 == 5) {
            this.field3283 = false;
        } else if (arg3 == 7) {
            this.field3282 = class142.method937(arg2.method1691(19388), (byte) 73);
            return;
        } else if (arg3 == 8) {
            class232.field4017 = arg1;
            return;
        } else {
            if (arg3 == 9) {
                arg2.method1694((byte) -100);
            } else if (arg3 != 10) {
                if (arg3 == 11) {
                    arg2.method1711((byte) -67);
                    return;
                }
                if (arg3 != 12) {
                    if (arg3 == 13) {
                        arg2.method1691(19388);
                        return;
                    }
                    if (arg3 == 14) {
                        arg2.method1711((byte) -67);
                        return;
                    }
                }
            }
            return;
        }
    }
}
