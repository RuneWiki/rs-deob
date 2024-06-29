import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class173 extends class15 {

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "[Lsb;")
    public static class120[] field3056 = new class120[6];

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "I")
    public static int field3067 = 0;

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "Z")
    public static boolean field3068 = false;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "Lce;")
    public class126 field3057;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "[I")
    public int[] field3054;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "[I")
    public int[] field3055;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "[I")
    public int[] field3058;

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "[I")
    public int[] field3061;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V", line = 4)
    public final void method1255(int arg0) {
        if (this.field3058 != null) {
            for (int var2 = 0; var2 < this.field3058.length; var2++) {
                this.field3058[var2] = class221.method1516(this.field3058[var2], 32768);
            }
        }
        if (arg0 != 32768) {
            method1257(-70, (byte) 126);
        }
        if (this.field3054 != null) {
            for (int var3 = 0; var3 < this.field3054.length; var3++) {
                this.field3054[var3] = class221.method1516(this.field3054[var3], 32768);
            }
        }
        field3060++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BILbb;)V", line = 49)
    private final void method1256(byte arg0, int arg1, class134 arg2) {
        field3069++;
        if (arg1 == 1) {
            this.field3057 = arg2.method970(arg0 + 125);
        } else if (arg1 == 2) {
            int var4 = arg2.method948(arg0 ^ 0x5);
            this.field3055 = new int[var4];
            this.field3054 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3054[var5] = arg2.method942(true);
                int var6 = arg2.method948(-122);
                if (var6 == 0) {
                    this.field3055[var5] = -1;
                } else {
                    this.field3055[var5] = var6;
                }
            }
        } else if (arg1 == 3) {
            int var7 = arg2.method948(arg0 - 1);
            this.field3058 = new int[var7];
            this.field3061 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3058[var8] = arg2.method942(true);
                int var9 = arg2.method948(-128);
                if (var9 == 0) {
                    this.field3061[var8] = -1;
                } else {
                    this.field3061[var8] = var9;
                }
            }
        } else if (arg1 != 4) {
        }
        if (arg0 != -124) {
            this.method1255(-3);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)V", line = 125)
    public static final void method1257(int arg0, byte arg1) {
        if (arg1 < 3) {
            method1258((class134) null, 100);
        }
        class245 var2 = class139.method1022(4, (byte) -116, arg0);
        field3062++;
        var2.method1682(109);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lbb;I)Lce;", line = 145)
    public static final class126 method1258(class134 arg0, int arg1) {
        field3065++;
        int var2 = -110 % ((34 - arg1) / 56);
        return class221.method1514(-8333, 32767, arg0);
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(II)I", line = 156)
    public final int method1259(int arg0, int arg1) {
        if (arg0 >= -118) {
            field3056 = (class120[]) null;
        }
        field3070++;
        if (this.field3054 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field3054.length; var3++) {
            if (this.field3055[var3] == arg1) {
                return this.field3054[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)V", line = 183)
    public static void method1260(int arg0) {
        field3056 = null;
        if (arg0 != 0) {
            method1258((class134) null, -94);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZI)Lga;", line = 193)
    public static final class168 method1261(boolean arg0, int arg1) {
        field3064++;
        class168 var2 = (class168) class136.field2362.method1173(-19839, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class168.field2999.method2173(class158.method1166(arg1, true), class132.method917(arg1, (byte) -73), (byte) -119);
        class168 var4 = new class168();
        var4.field2988 = arg1;
        if (var3 != null) {
            var4.method1230(new class134(var3), (byte) 109);
        }
        if (arg0) {
            return (class168) null;
        } else {
            class136.field2362.method1179(var4, (long) arg1, (byte) -72);
            return var4;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILbb;)V", line = 229)
    public final void method1262(int arg0, class134 arg1) {
        field3059++;
        if (arg0 != -1) {
            this.method1263(65, 44);
        }
        while (true) {
            int var3 = arg1.method948(-125);
            if (var3 == 0) {
                return;
            }
            this.method1256((byte) -124, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(II)I", line = 253)
    public final int method1263(int arg0, int arg1) {
        field3063++;
        if (this.field3058 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field3058.length; var3++) {
            if (this.field3061[var3] == arg0) {
                return this.field3058[var3];
            }
        }
        if (arg1 != 32768) {
            field3068 = false;
        }
        return -1;
    }
}
