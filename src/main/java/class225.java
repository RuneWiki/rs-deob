import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class225 extends class199 {

    @OriginalMember(owner = "client!vb", name = "W", descriptor = "I")
    private int field3239 = 0;

    @OriginalMember(owner = "client!vb", name = "U", descriptor = "I")
    private int field3237 = 1;

    @OriginalMember(owner = "client!vb", name = "eb", descriptor = "I")
    private int field3247 = 0;

    @OriginalMember(owner = "client!vb", name = "S", descriptor = "[I")
    public static int[] field3235 = new int[5];

    @OriginalMember(owner = "client!vb", name = "V", descriptor = "Lcc;")
    public static class327 field3238 = new class327(64);

    @OriginalMember(owner = "client!vb", name = "bb", descriptor = "Z")
    public static boolean field3244 = false;

    @OriginalMember(owner = "client!vb", name = "ab", descriptor = "I")
    public static int field3243 = 1;

    @OriginalMember(owner = "client!vb", name = "T", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!vb", name = "Y", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!vb", name = "cb", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!vb", name = "db", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!vb", name = "fb", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!vb", name = "X", descriptor = "[S")
    public static short[] field3240;

    @OriginalMember(owner = "client!vb", name = "Z", descriptor = "[S")
    public static short[] field3242;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)[I", line = 15)
    public final int[] method190(int arg0, int arg1) {
        field3248++;
        if (arg0 != -1735) {
            return (int[]) null;
        }
        int[] var3 = this.field2802.method2502(arg1, -76);
        if (this.field2802.field5637) {
            int var4 = class274.field3919[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class95.field1235; var6++) {
                int var7 = class82.field1062[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field3239 == 0) {
                    var11 = (var7 - var4) * this.field3237;
                } else {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field3237 * var10) * 3.141592653589793D);
                }
                int var12 = var11 - (var11 & 0xFFFFF000);
                if (this.field3247 == 0) {
                    var12 = class109.field1420[var12 >> 4 & 0xFF] + 4096 >> 1;
                } else if (this.field3247 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V", line = 86)
    public static void method1628(boolean arg0) {
        field3240 = null;
        field3238 = null;
        if (arg0) {
            method1629((byte) 2, -94, -94, -62, -123);
        }
        field3235 = null;
        field3242 = null;
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(B)V", line = 99)
    public final void method189(byte arg0) {
        field3245++;
        class177.method1304((byte) -29);
        int var2 = -110 / ((36 - arg0) / 44);
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V", line = 273)
    public class225() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLfd;I)V", line = 127)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        if (arg2 == 0) {
            this.field3239 = arg1.method2096((byte) -122);
        } else if (arg2 == 1) {
            this.field3247 = arg1.method2096((byte) -122);
        } else if (arg2 == 3) {
            this.field3237 = arg1.method2096((byte) -122);
        }
        field3236++;
        if (arg0 != -43) {
            field3242 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BIIII)V", line = 161)
    public static final void method1629(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class42 var5 = class166.method1242(10, arg4, arg0 - 1249071344);
        field3246++;
        var5.method307((byte) -120);
        if (arg0 == -48) {
            var5.field536 = arg1;
            var5.field525 = arg2;
            var5.field523 = arg3;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(JZIII)Ljava/lang/String;", line = 190)
    public static final String method1630(long arg0, boolean arg1, int arg2, int arg3, int arg4) {
        char var6 = ',';
        char var7 = '.';
        field3241++;
        boolean var8 = false;
        if (arg4 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg4 == 2) {
            var7 = ' ';
        }
        if (arg0 < 0L) {
            var8 = true;
            arg0 = -arg0;
        }
        int var9 = 29 % ((42 - arg2) / 40);
        StringBuffer var10 = new StringBuffer(26);
        if (arg3 > 0) {
            for (int var11 = 0; var11 < arg3; var11++) {
                int var12 = (int) arg0;
                arg0 /= 10L;
                var10.append((char) (var12 + 48 - (int) arg0 * 10));
            }
            var10.append(var6);
        }
        int var13 = 0;
        while (true) {
            int var14 = (int) arg0;
            arg0 /= 10L;
            var10.append((char) (var14 + 48 - ((int) arg0 * 10)));
            if (arg0 == 0L) {
                if (var8) {
                    var10.append('-');
                }
                return var10.reverse().toString();
            }
            if (arg1) {
                var13++;
                if ((var13 % 3) == 0) {
                    var10.append(var7);
                }
            }
        }
    }
}
