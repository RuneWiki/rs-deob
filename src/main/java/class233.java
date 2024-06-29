import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class233 {

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Z")
    public static volatile boolean field3944 = true;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "Lwa;")
    public static class75 field3952 = class66.method560("::fpson", false);

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Lwa;")
    public static class75 field3940 = class66.method560("_", false);

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field3939 = -1;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "Lwa;")
    public static class75 field3954 = class66.method560("welle:", false);

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "Lwa;")
    public static class75 field3951 = class66.method560("Spieler kann nicht gefunden werden: ", false);

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public int field3945;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public int field3946;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public int field3948;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "Lcb;")
    public static class267 field3949;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "Lcb;")
    public static class267 field3950;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;", line = 4)
    public static final Class method1699(byte arg0, String arg1) throws ClassNotFoundException {
        field3943++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else {
            int var2 = 40 / ((21 - arg0) / 52);
            if (arg1.equals("S")) {
                return Short.TYPE;
            } else if (arg1.equals("J")) {
                return Long.TYPE;
            } else if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([IIIIII)V", line = 50)
    public static final void method1700(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class242 var6 = class271.field4681[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class236 var7 = var6.field4089;
        if (var7 != null) {
            int var8 = var7.field3980;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class129 var10 = var6.field4082;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field2219;
        int var12 = var10.field2228;
        int var13 = var10.field2226;
        int var14 = var10.field2223;
        int[] var15 = class202.field3404[var11];
        int[] var16 = class51.field844[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IILja;)V", line = 144)
    private final void method1701(int arg0, int arg1, class60 arg2) {
        if (arg0 == 1) {
            this.field3945 = arg2.method485((byte) -2);
            this.field3946 = arg2.method501(0);
            this.field3948 = arg2.method501(0);
        }
        field3941++;
        int var4 = 99 / ((arg1 + 8) / 55);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([BIII)I", line = 174)
    public static final int method1702(byte[] arg0, int arg1, int arg2, int arg3) {
        int var4 = -1;
        for (int var5 = arg3; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class88.field1457[(arg0[var5] ^ var4) & 0xFF];
        }
        if (arg1 > -61) {
            method1703((byte) 111);
        }
        field3947++;
        return ~var4;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 197)
    public static void method1703(byte arg0) {
        field3951 = null;
        if (arg0 < 68) {
            method1700((int[]) null, 49, -58, 69, 70, -3);
        }
        field3952 = null;
        field3949 = null;
        field3950 = null;
        field3940 = null;
        field3954 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)V", line = 239)
    public static final void method1704(int arg0, int arg1, int arg2) {
        class259.field4337 = true;
        class172.field2904 = arg0;
        class250.field4205 = arg1;
        class116.field1965 = arg2;
        class232.field3930 = -1;
        class195.field3283 = -1;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lja;I)V", line = 259)
    public final void method1705(class60 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method501(0);
            if (var3 == 0) {
                field3953++;
                if (arg1 != 0) {
                    method1703((byte) -40);
                }
                return;
            }
            this.method1701(var3, -85, arg0);
        }
    }
}
