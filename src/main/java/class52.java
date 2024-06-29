import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class52 {

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "Lub;")
    private class18 field948 = new class18();

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "Lub;")
    private class18 field960 = new class18();

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "Lub;")
    private class18 field963 = new class18();

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "Lub;")
    private class18 field965 = new class18();

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "Lwn;")
    private class519 field966 = new class519(4);

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "I")
    public volatile int field972 = 0;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
    public volatile int field971 = 0;

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "B")
    private byte field973 = 0;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "Lwn;")
    private class519 field970 = new class519(8);

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "Lqv;")
    public static class316 field958 = new class316(14, 11);

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "Lge;")
    public static class511 field962 = new class511(4);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
    private int field968;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "J")
    private long field967;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "Lbj;")
    private class164 field969;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "Lij;")
    private class297 field974;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V", line = 3)
    private final void method452(byte arg0) {
        field952++;
        if (this.field969 == null) {
            return;
        }
        try {
            this.field966.field7558 = 0;
            this.field966.method3048(-2034159384, 6);
            this.field966.method3056(-111, 3);
            if (arg0 != -27) {
                field958 = null;
            }
            this.field969.method1181(arg0 ^ 0x38, this.field966.field7545, 4, 0);
        } catch (IOException var3) {
            try {
                this.field969.method1186((byte) -118);
            } catch (Exception var2) {
            }
            this.field969 = null;
            this.field972++;
            this.field971 = -2;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 32)
    public final void method453(int arg0) {
        try {
            this.field969.method1186((byte) -112);
        } catch (Exception var2) {
        }
        field953++;
        this.field969 = null;
        this.field973 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field972++;
        this.field971 = arg0;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZI)V", line = 47)
    public final void method454(boolean arg0, int arg1) {
        field951++;
        if (this.field969 == null) {
            return;
        }
        try {
            this.field966.field7558 = 0;
            if (arg1 <= -103) {
                this.field966.method3048(-2034159384, arg0 ? 2 : 3);
                this.field966.method3056(-114, 0);
                this.field969.method1181(-72, this.field966.field7545, 4, 0);
            }
        } catch (IOException var4) {
            try {
                this.field969.method1186((byte) -122);
            } catch (Exception var3) {
            }
            this.field969 = null;
            this.field971 = -2;
            this.field972++;
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)I", line = 74)
    private final int method455(int arg0) {
        if (arg0 == 0) {
            field957++;
            return this.field963.method98(-575) + this.field965.method98(arg0 - 575);
        } else {
            return 64;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IILi;Ltf;ILjava/lang/String;Lba;IIILgg;I)V", line = 88)
    public static final void method456(int arg0, int arg1, class31 arg2, class198 arg3, int arg4, String arg5, class269 arg6, int arg7, int arg8, int arg9, class119 arg10, int arg11) {
        field945++;
        int var12;
        if (class294.field4381 == 4) {
            var12 = (int) class508.field7354 & 0x3FFF;
        } else {
            var12 = (int) class508.field7354 + class78.field1280 & 0x3FFF;
        }
        int var13 = Math.max(arg3.field3008 / 2, arg3.field2988 / 2) + 10;
        int var14 = arg7 * arg7 + arg11 * arg11;
        if (var14 > var13 * var13) {
            return;
        }
        int var15 = class358.field5204[var12];
        int var16 = class358.field5203[var12];
        if (class294.field4381 != 4) {
            var15 = var15 * 256 / (class384.field5495 + 256);
            var16 = var16 * 256 / (class384.field5495 + 256);
        }
        int var17 = arg7 * var16 + arg11 * var15 >> 15;
        int var18 = arg11 * var16 - arg7 * var15 >> 15;
        int var19 = arg10.method869(null, -61, 100, arg5);
        int var20 = var17 - var19 / 2;
        int var21 = arg10.method878(100, null, arg5, true, 0);
        if (-arg3.field3008 <= var20 && var20 <= arg3.field3008 && (-arg3.field2988) <= var18 && arg3.field2988 >= var18) {
            int var22 = -93 % ((arg1 + 31) / 44);
            arg6.method1742(0, 0, arg3.field3008 / 2 + arg9 + var20, 0, arg3.field2988 / 2 + arg8 - var21 - var18 - arg0, arg8, arg9, 50, arg2, arg4, null, var19, 0, 1, arg5, null);
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)Z", line = 134)
    public final boolean method457(byte arg0) {
        field947++;
        if (arg0 != -117) {
            method466(24);
        }
        return this.method459(arg0 + 117) >= 20;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V", line = 146)
    public final void method458(int arg0) {
        field954++;
        if (this.field969 == null) {
            return;
        }
        try {
            this.field966.field7558 = 0;
            this.field966.method3048(-2034159384, 7);
            this.field966.method3056(-124, 0);
            this.field969.method1181(-75, this.field966.field7545, 4, arg0);
        } catch (IOException var3) {
            try {
                this.field969.method1186((byte) -122);
            } catch (Exception var2) {
            }
            this.field971 = -2;
            this.field972++;
            this.field969 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)I", line = 179)
    public final int method459(int arg0) {
        field949++;
        if (arg0 != 0) {
            this.method462(null, false, -81);
        }
        return this.field948.method98(arg0 - 575) + this.field960.method98(-575);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)Z", line = 191)
    public final boolean method460(boolean arg0) {
        field956++;
        if (this.field969 != null) {
            long var2 = class165.method1188((byte) 26);
            int var4 = (int) (var2 - this.field967);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field967 = var2;
            this.field968 += var4;
            if (this.field968 > 30000) {
                try {
                    this.field969.method1186((byte) -124);
                } catch (Exception var27) {
                }
                this.field969 = null;
            }
        }
        if (this.field969 == null) {
            return this.method459(0) == 0 && this.method455(0) == 0;
        }
        try {
            if (arg0) {
                return false;
            }
            this.field969.method1183((byte) -89);
            for (class297 var5 = (class297) this.field948.method102(1048575); var5 != null; var5 = (class297) this.field948.method105((byte) 43)) {
                this.field966.field7558 = 0;
                this.field966.method3048(-2034159384, 1);
                this.field966.method3056(-117, (int) var5.field7659);
                this.field969.method1181(-115, this.field966.field7545, 4, 0);
                this.field960.method99(var5, 5604);
            }
            for (class297 var6 = (class297) this.field963.method102(1048575); var6 != null; var6 = (class297) this.field963.method105((byte) 43)) {
                this.field966.field7558 = 0;
                this.field966.method3048(-2034159384, 0);
                this.field966.method3056(-119, (int) var6.field7659);
                this.field969.method1181(-94, this.field966.field7545, 4, 0);
                this.field965.method99(var6, 5604);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field969.method1187(-118);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field968 = 0;
                byte var9 = 0;
                if (this.field974 == null) {
                    var9 = 8;
                } else if (this.field974.field4443 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field970.field7558;
                    if (var8 < var10) {
                        var10 = var8;
                    }
                    this.field969.method1184(0, this.field970.field7545, var10, this.field970.field7558);
                    if (this.field973 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field970.field7545[this.field970.field7558 + var11] = (byte) class288.method1845(this.field970.field7545[this.field970.field7558 + var11], this.field973);
                        }
                    }
                    this.field970.field7558 += var10;
                    if (this.field970.field7558 >= var9) {
                        if (this.field974 == null) {
                            this.field970.field7558 = 0;
                            int var12 = this.field970.method3072((byte) -126);
                            int var13 = this.field970.method3018(566990904);
                            int var14 = this.field970.method3072((byte) -125);
                            int var15 = this.field970.method3053(-129);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class297 var21;
                            if (var17) {
                                for (var21 = (class297) this.field965.method102(1048575); var21 != null && var21.field7659 != var18; var21 = (class297) this.field965.method105((byte) 43)) {
                                }
                            } else {
                                for (var21 = (class297) this.field960.method102(1048575); var21 != null && var21.field7659 != var18; var21 = (class297) this.field960.method105((byte) 43)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field974 = var21;
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field974.field4433 = new class519(this.field974.field4437 + var22 + var15);
                            this.field974.field4433.method3048(-2034159384, var16);
                            this.field974.field4433.method3019(var15, 11648);
                            this.field974.field4443 = 8;
                            this.field970.field7558 = 0;
                        } else if (this.field974.field4443 != 0) {
                            throw new IOException();
                        } else if (this.field970.field7545[0] == -1) {
                            this.field974.field4443 = 1;
                            this.field970.field7558 = 0;
                        } else {
                            this.field974 = null;
                        }
                    }
                } else {
                    int var23 = this.field974.field4433.field7545.length - this.field974.field4437;
                    int var24 = 512 - this.field974.field4443;
                    if (var23 - this.field974.field4433.field7558 < var24) {
                        var24 = var23 - this.field974.field4433.field7558;
                    }
                    if (var24 > var8) {
                        var24 = var8;
                    }
                    this.field969.method1184(0, this.field974.field4433.field7545, var24, this.field974.field4433.field7558);
                    if (this.field973 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field974.field4433.field7545[this.field974.field4433.field7558 + var25] = (byte) class288.method1845(this.field974.field4433.field7545[this.field974.field4433.field7558 + var25], this.field973);
                        }
                    }
                    this.field974.field4433.field7558 += var24;
                    this.field974.field4443 += var24;
                    if (this.field974.field4433.field7558 == var23) {
                        this.field974.method3115((byte) 103);
                        this.field974.field4248 = false;
                        this.field974 = null;
                    } else if (this.field974.field4443 == 512) {
                        this.field974.field4443 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field969.method1186((byte) -120);
            } catch (Exception var26) {
            }
            this.field972++;
            this.field969 = null;
            this.field971 = -2;
            return this.method459(0) == 0 && this.method455(0) == 0;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IBZII)Lij;", line = 466)
    public final class297 method461(int arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        field950++;
        long var6 = (long) ((arg3 << 16) + arg4);
        class297 var8 = new class297();
        var8.field7659 = var6;
        var8.field4437 = arg1;
        if (arg0 >= -42) {
            this.field966 = null;
        }
        var8.field4253 = arg2;
        if (arg2) {
            if (this.method459(0) >= 20) {
                throw new RuntimeException();
            }
            this.field948.method99(var8, 5604);
        } else if (this.method455(0) < 20) {
            this.field963.method99(var8, 5604);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lbj;ZI)V", line = 511)
    public final void method462(class164 arg0, boolean arg1, int arg2) {
        if (this.field969 != null) {
            try {
                this.field969.method1186((byte) -126);
            } catch (Exception var9) {
            }
            this.field969 = null;
        }
        field955++;
        this.field969 = arg0;
        this.method452((byte) -27);
        int var4 = -50 / ((arg2 + 6) / 37);
        this.method454(arg1, -105);
        this.field970.field7558 = 0;
        this.field974 = null;
        while (true) {
            class297 var5 = (class297) this.field960.method103(1048575);
            if (var5 == null) {
                while (true) {
                    class297 var6 = (class297) this.field965.method103(1048575);
                    if (var6 == null) {
                        if (this.field973 != 0) {
                            try {
                                this.field966.field7558 = 0;
                                this.field966.method3048(-2034159384, 4);
                                this.field966.method3048(-2034159384, this.field973);
                                this.field966.method3016(0, -77);
                                this.field969.method1181(-53, this.field966.field7545, 4, 0);
                            } catch (IOException var8) {
                                try {
                                    this.field969.method1186((byte) -117);
                                } catch (Exception var7) {
                                }
                                this.field969 = null;
                                this.field972++;
                                this.field971 = -2;
                            }
                        }
                        this.field968 = 0;
                        this.field967 = class165.method1188((byte) 26);
                        return;
                    }
                    this.field963.method99(var6, 5604);
                }
            }
            this.field948.method99(var5, 5604);
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)Z", line = 580)
    public final boolean method463(byte arg0) {
        field946++;
        if (arg0 != 112) {
            this.field963 = null;
        }
        return this.method455(arg0 ^ 0x70) >= 20;
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(B)V", line = 592)
    public final void method464(byte arg0) {
        field959++;
        if (this.field969 != null) {
            this.field969.method1185(-31318);
        }
        if (arg0 >= -44) {
            this.field969 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "(I)V", line = 620)
    public final void method465(int arg0) {
        field961++;
        int var2 = 31 % ((54 - arg0) / 34);
        if (this.field969 != null) {
            this.field969.method1186((byte) -112);
        }
    }

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V", line = 642)
    public static void method466(int arg0) {
        int var1 = 100 % ((-arg0 - 53) / 42);
        field962 = null;
        field958 = null;
    }
}
