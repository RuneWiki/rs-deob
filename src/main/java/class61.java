import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class61 {

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "Z")
    public boolean field948 = false;

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "I")
    public int field951 = -1;

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "Z")
    public boolean field955 = false;

    @OriginalMember(owner = "client!kt", name = "p", descriptor = "I")
    public int field963 = 0;

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "I")
    public int field954 = 2;

    @OriginalMember(owner = "client!kt", name = "r", descriptor = "I")
    public int field965 = -1;

    @OriginalMember(owner = "client!kt", name = "s", descriptor = "I")
    public int field966 = 99;

    @OriginalMember(owner = "client!kt", name = "w", descriptor = "I")
    public int field970 = -1;

    @OriginalMember(owner = "client!kt", name = "B", descriptor = "I")
    public int field975 = -1;

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "I")
    public int field973 = -1;

    @OriginalMember(owner = "client!kt", name = "x", descriptor = "I")
    public int field971 = 5;

    @OriginalMember(owner = "client!kt", name = "u", descriptor = "Z")
    public boolean field968 = false;

    @OriginalMember(owner = "client!kt", name = "E", descriptor = "I")
    public static int field978 = 0;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "I")
    public int field953;

    @OriginalMember(owner = "client!kt", name = "j", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!kt", name = "l", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!kt", name = "n", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!kt", name = "q", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!kt", name = "t", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!kt", name = "v", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!kt", name = "A", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!kt", name = "D", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "Lsb;")
    public class222 field950;

    @OriginalMember(owner = "client!kt", name = "k", descriptor = "Lwf;")
    public static class33 field958;

    @OriginalMember(owner = "client!kt", name = "o", descriptor = "[I")
    public int[] field962;

    @OriginalMember(owner = "client!kt", name = "y", descriptor = "[I")
    private int[] field972;

    @OriginalMember(owner = "client!kt", name = "C", descriptor = "[I")
    public int[] field976;

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "[Z")
    public boolean[] field952;

    @OriginalMember(owner = "client!kt", name = "i", descriptor = "[[I")
    public int[][] field956;

    @OriginalMember(owner = "client!kt", name = "m", descriptor = "[[S")
    public static short[][] field960;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Le;BIIII)Le;")
    public final class289 method403(class289 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 <= 42) {
            return null;
        }
        field967++;
        int var7 = this.field962[arg4];
        int var8 = this.field976[arg4];
        class313 var9 = this.field950.method1542(0, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method669((byte) 1, arg2, true);
        }
        class313 var11 = null;
        if ((this.field968 || class29.field324) && arg3 != -1 && arg3 < this.field976.length) {
            int var12 = this.field976[arg3];
            var11 = this.field950.method1542(0, var12 >> 16);
            arg3 = var12 & 0xFFFF;
        }
        class313 var13 = null;
        class313 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field972 != null) {
            if (arg4 < this.field972.length) {
                var15 = this.field972[arg4];
                if (var15 != 65535) {
                    var13 = this.field950.method1542(0, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field968 || class29.field324) && arg3 != -1 && arg3 < this.field972.length) {
                var16 = this.field972[arg3];
                if (var16 != 65535) {
                    var14 = this.field950.method1542(0, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field948) {
            arg2 |= 0x200;
        }
        if (var9.method2077(var10, (byte) -84)) {
            arg2 |= 0x80;
        }
        if (var9.method2075(var10, -117)) {
            arg2 |= 0x100;
        }
        if (var9.method2074(255, var10)) {
            arg2 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2077(var15, (byte) 44)) {
                arg2 |= 0x80;
            }
            if (var13.method2075(var15, -105)) {
                arg2 |= 0x100;
            }
            if (var13.method2074(255, var15)) {
                arg2 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method2077(arg3, (byte) 124)) {
                arg2 |= 0x80;
            }
            if (var11.method2075(arg3, -115)) {
                arg2 |= 0x100;
            }
            if (var11.method2074(255, arg3)) {
                arg2 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method2077(var16, (byte) -119)) {
                arg2 |= 0x80;
            }
            if (var14.method2075(var16, -107)) {
                arg2 |= 0x100;
            }
            if (var14.method2074(255, var16)) {
                arg2 |= 0x400;
            }
        }
        int var17 = arg2 | 0x20;
        class289 var18 = arg0.method669((byte) 1, var17, true);
        var18.method1937(var11, this.field948, var9, arg5 - 1, var7, arg3, var10, (byte) -59, 0);
        if (var13 != null) {
            var18.method1937(var14, this.field948, var13, arg5 - 1, var7, var16, var15, (byte) 97, 0);
        }
        return var18;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)V")
    public static final void method404(byte arg0) {
        field974++;
        if (class259.field4152 == 0) {
            return;
        }
        try {
            if ((++class448.field6648) > 2000) {
                if (class541.field7922 != null) {
                    class541.field7922.method2155(false);
                    class541.field7922 = null;
                }
                if (class327.field4949 >= 1) {
                    class336.field5062 = -5;
                    class259.field4152 = 0;
                    return;
                }
                class271.field4286.field5146 = !class271.field4286.field5146;
                class259.field4152 = 1;
                class448.field6648 = 0;
                class327.field4949++;
            }
            if (class259.field4152 == 1) {
                class53.field819 = class122.field1844.method460(class271.field4286.method2221(1615737763), 10503, class271.field4286.field5144);
                class259.field4152 = 2;
            }
            if (class259.field4152 == 2) {
                if (class53.field819.field4974 == 2) {
                    throw new IOException();
                }
                if (class53.field819.field4974 != 1) {
                    return;
                }
                class541.field7922 = class202.method1424(5000, (Socket) class53.field819.field4975, arg0 + 7);
                class53.field819 = null;
                class541.field7922.method2159(-15728, class312.field4752.field2982, 0, class312.field4752.field2973);
                class259.field4152 = 4;
            }
            if (class259.field4152 == 4) {
                if (!class541.field7922.method2158(1, -124)) {
                    return;
                }
                class541.field7922.method2152(0, class424.field6231.field2973, -113, 1);
                int var1 = class424.field6231.field2973[0] & 0xFF;
                if (var1 != 21) {
                    class336.field5062 = var1;
                    class259.field4152 = 0;
                    class541.field7922.method2155(false);
                    class541.field7922 = null;
                    return;
                }
                class259.field4152 = 5;
            }
            if (class259.field4152 == 5) {
                if (!class541.field7922.method2158(1, -124)) {
                    return;
                }
                class541.field7922.method2152(0, class424.field6231.field2973, -121, 1);
                class259.field4152 = 6;
                class347.field5161 = new String[class424.field6231.field2973[0] & 0xFF];
            }
            if (class259.field4152 == 6) {
                if (!class541.field7922.method2158(class347.field5161.length * 8, arg0 - 118)) {
                    return;
                }
                class424.field6231.field2982 = 0;
                class541.field7922.method2152(0, class424.field6231.field2973, arg0 ^ 0x35, class347.field5161.length * 8);
                for (int var2 = 0; var2 < class347.field5161.length; var2++) {
                    class347.field5161[var2] = class144.method1029(class424.field6231.method1351(true), arg0 - 17631);
                }
                class259.field4152 = 0;
                class336.field5062 = 21;
                class541.field7922.method2155(false);
                class541.field7922 = null;
                return;
            }
        } catch (IOException var3) {
            if (class541.field7922 != null) {
                class541.field7922.method2155(false);
                class541.field7922 = null;
            }
            if (class327.field4949 < 1) {
                class271.field4286.field5146 = !class271.field4286.field5146;
                class327.field4949++;
                class259.field4152 = 1;
                class448.field6648 = 0;
            } else {
                class259.field4152 = 0;
                class336.field5062 = -4;
            }
        }
        if (arg0 != -8) {
            field978 = -70;
        }
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(B)V")
    public final void method405(byte arg0) {
        int var2 = -9 / ((arg0 + 23) / 62);
        if (this.field975 == -1) {
            if (this.field952 == null) {
                this.field975 = 0;
            } else {
                this.field975 = 2;
            }
        }
        if (this.field951 == -1) {
            if (this.field952 == null) {
                this.field951 = 0;
            } else {
                this.field951 = 2;
            }
        }
        field969++;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZILfh;)V")
    private final void method406(boolean arg0, int arg1, class194 arg2) {
        if (!arg0) {
            return;
        }
        if (arg1 == 1) {
            int var13 = arg2.method1396(-89);
            this.field962 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field962[var14] = arg2.method1396(-111);
            }
            this.field976 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field976[var15] = arg2.method1396(-125);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field976[var16] = (arg2.method1396(-123) << 16) + this.field976[var16];
            }
        } else if (arg1 == 2) {
            this.field973 = arg2.method1396(72);
        } else if (arg1 == 3) {
            this.field952 = new boolean[256];
            int var4 = arg2.method1337((byte) -115);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field952[arg2.method1337((byte) 47)] = true;
            }
        } else if (arg1 == 5) {
            this.field971 = arg2.method1337((byte) 106);
        } else if (arg1 == 6) {
            this.field965 = arg2.method1396(115);
        } else if (arg1 == 7) {
            this.field970 = arg2.method1396(-101);
        } else if (arg1 == 8) {
            this.field966 = arg2.method1337((byte) 66);
        } else if (arg1 == 9) {
            this.field975 = arg2.method1337((byte) 20);
        } else if (arg1 == 10) {
            this.field951 = arg2.method1337((byte) 123);
        } else if (arg1 == 11) {
            this.field954 = arg2.method1337((byte) -109);
        } else if (arg1 == 12) {
            int var6 = arg2.method1337((byte) -109);
            this.field972 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field972[var7] = arg2.method1396(88);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field972[var8] += arg2.method1396(34) << 16;
            }
        } else if (arg1 == 13) {
            int var9 = arg2.method1396(100);
            this.field956 = new int[var9][];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = arg2.method1337((byte) -120);
                if (var11 > 0) {
                    this.field956[var10] = new int[var11];
                    this.field956[var10][0] = arg2.method1339(-32768);
                    for (int var12 = 1; var12 < var11; var12++) {
                        this.field956[var10][var12] = arg2.method1396(50);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field948 = true;
        } else if (arg1 == 15) {
            this.field968 = true;
        } else if (arg1 == 16) {
            this.field955 = true;
        } else if (arg1 == 17) {
            this.field963 = arg2.method1337((byte) 78);
        }
        field957++;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method407(String arg0, int arg1) throws ClassNotFoundException {
        field964++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        }
        if (arg1 != 1024) {
            method409(false, null, (byte) 103);
        }
        if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIZI)I")
    public final int method408(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg3 > -57) {
            return 45;
        }
        field959++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field976[arg1];
        class313 var8 = null;
        class313 var9 = this.field950.method1542(0, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field968 || class29.field324) && arg0 != -1 && arg0 < this.field976.length) {
            int var11 = this.field976[arg0];
            var8 = this.field950.method1542(0, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field948) {
            var5 |= 0x200;
        }
        if (var9.method2077(var10, (byte) -61)) {
            var5 |= 0x80;
        }
        if (var9.method2075(var10, -117)) {
            var5 |= 0x100;
        }
        if (var9.method2074(255, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method2077(var6, (byte) 107)) {
                var5 |= 0x80;
            }
            if (var8.method2075(var6, -123)) {
                var5 |= 0x100;
            }
            if (var8.method2074(255, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field972 != null && arg2) {
            if (arg1 < this.field972.length) {
                int var12 = this.field972[arg1];
                if (var12 != 65535) {
                    class313 var13 = this.field950.method1542(0, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method2077(var14, (byte) 109)) {
                            var5 |= 0x80;
                        }
                        if (var13.method2075(var14, -113)) {
                            var5 |= 0x100;
                        }
                        if (var13.method2074(255, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field968 || class29.field324) && arg0 != -1 && this.field972.length > arg0) {
                int var15 = this.field972[arg0];
                if (var15 != 65535) {
                    class313 var16 = this.field950.method1542(0, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method2077(var17, (byte) -98)) {
                            var5 |= 0x80;
                        }
                        if (var16.method2075(var17, -106)) {
                            var5 |= 0x100;
                        }
                        if (var16.method2074(255, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z[BB)V")
    public static final void method409(boolean arg0, byte[] arg1, byte arg2) {
        field961++;
        if (class168.field2542 == null) {
            class168.field2542 = new class194(20000);
        }
        class168.field2542.method1355(arg1.length, (byte) 76, 0, arg1);
        if (arg2 > -28) {
            method409(true, null, (byte) -105);
        }
        if (!arg0) {
            return;
        }
        class172.method1236(class168.field2542.field2973, (byte) -65);
        class205.field3154 = new class424[class275.field4311];
        int var3 = 0;
        for (int var4 = class358.field5297; var4 <= class472.field6933; var4++) {
            class424 var5 = class500.method2987(var4, (byte) 69);
            if (var5 != null) {
                class205.field3154[var3++] = var5;
            }
        }
        class511.field7482 = false;
        class213.field3242 = class375.method2397((byte) -75);
        class168.field2542 = null;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
    public static void method410(int arg0) {
        field960 = null;
        if (arg0 <= 65) {
            field960 = null;
        }
        field958 = null;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIBIILe;I)Le;")
    public final class289 method411(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class289 arg6, int arg7) {
        field977++;
        int var9 = this.field962[arg2];
        int var10 = this.field976[arg2];
        class313 var11 = this.field950.method1542(arg5, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg6.method669(arg3, arg7, true);
        }
        class313 var13 = null;
        if ((this.field968 || class29.field324) && arg0 != -1 && this.field976.length > arg0) {
            int var14 = this.field976[arg0];
            var13 = this.field950.method1542(0, var14 >> 16);
            arg0 = var14 & 0xFFFF;
        }
        if (this.field948) {
            arg7 |= 0x200;
        }
        if (var11.method2077(var12, (byte) -106)) {
            arg7 |= 0x80;
        }
        if (var11.method2075(var12, arg5 ^ 0xFFFFFF8E)) {
            arg7 |= 0x100;
        }
        if (var11.method2074(arg5 + 255, var12)) {
            arg7 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2077(arg0, (byte) 104)) {
                arg7 |= 0x80;
            }
            if (var13.method2075(arg0, -113)) {
                arg7 |= 0x100;
            }
            if (var13.method2074(255, arg0)) {
                arg7 |= 0x400;
            }
        }
        int var15 = arg7 | 0x20;
        class289 var16 = arg6.method669(arg3, var15, true);
        var16.method1937(var13, this.field948, var11, arg1 - 1, var9, arg0, var12, (byte) 78, arg4);
        return var16;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lfh;I)V")
    public final void method412(class194 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1337((byte) 40);
            if (var3 == 0) {
                field949++;
                int var4 = 92 / ((54 - arg1) / 59);
                return;
            }
            this.method406(true, var3, arg0);
        }
    }
}
