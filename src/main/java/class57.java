import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class57 extends class246 {

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    private int field964 = 0;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "Llj;")
    private class25 field950 = new class25(16);

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    private int field971 = 0;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "Lmb;")
    private class160 field973 = new class160();

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "J")
    private long field977 = 0L;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    private int field947;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "Lah;")
    private class277 field959;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "Z")
    private boolean field974;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "Lmb;")
    private class160 field975;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "Lij;")
    private class195 field968;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    private int field946;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
    private int field953;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "Lah;")
    private class277 field965;

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "Z")
    private boolean field976;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "Ldc;")
    private class235 field951;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "Lwb;")
    private class26 field955;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "J")
    public static long field942 = 0L;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public static int field949 = 0;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "Lcf;")
    public static class93 field969 = class147.method1066("comp-Btence ", -48);

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "Lwi;")
    public static class134 field945;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "Lwd;")
    public static class22 field957;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "Ltj;")
    private class272 field941;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "Z")
    private boolean field972;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "[B")
    private byte[] field961;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)I")
    public final int method317(int arg0) {
        field960++;
        if (this.field941 == null) {
            return 0;
        } else if (this.field974) {
            class222 var2 = this.field975.method1151(103);
            if (arg0 > -79) {
                this.field946 = -92;
            }
            return var2 == null ? 0 : (int) var2.field4006;
        } else {
            return this.field941.field4852;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)I")
    public final int method318(byte arg0) {
        if (arg0 != -24) {
            this.field975 = null;
        }
        field966++;
        if (this.method322(255) == null) {
            return this.field955 == null ? 0 : this.field955.method141(false);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBI)Lwb;")
    private final class26 method319(int arg0, byte arg1, int arg2) {
        class26 var4 = (class26) this.field950.method135((long) arg2, true);
        field954++;
        if (var4 != null && arg0 == 0 && !var4.field346 && var4.field343) {
            var4.method1544((byte) -120);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field959 == null || this.field961[arg2] == -1) {
                    if (this.field968.method1389(true)) {
                        return null;
                    }
                    var4 = this.field968.method1406(-292567952, this.field947, arg2, true, (byte) 2);
                } else {
                    var4 = this.field951.method1602(this.field959, (byte) -20, arg2);
                }
            } else if (arg0 == 1) {
                if (this.field959 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field951.method1607(this.field959, arg2, -103);
            } else if (arg0 == 2) {
                if (this.field959 == null) {
                    throw new RuntimeException();
                }
                if (this.field961[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field968.method1397((byte) 66)) {
                    return null;
                }
                var4 = this.field968.method1406(-292567952, this.field947, arg2, false, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field950.method137((long) arg2, var4, -1);
        }
        if (arg1 >= -122) {
            this.method318((byte) -1);
        }
        if (var4.field343) {
            return null;
        }
        byte[] var5 = var4.method144(-24385);
        if (!var4 instanceof class204) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class115.field2007.reset();
                class115.field2007.update(var5, 0, var5.length - 2);
                int var6 = (int) class115.field2007.getValue();
                if (this.field941.field4833[arg2] != var6) {
                    throw new RuntimeException();
                }
                this.field968.field3579 = 0;
                this.field968.field3581 = 0;
            } catch (RuntimeException var12) {
                this.field968.method1391(-1);
                var4.method1544((byte) -28);
                if (var4.field346 && !this.field968.method1389(true)) {
                    class220 var7 = this.field968.method1406(-292567952, this.field947, arg2, true, (byte) 2);
                    this.field950.method137((long) arg2, var7, -1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field941.field4850[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field941.field4850[arg2];
            if (this.field959 != null) {
                this.field951.method1601(-48, this.field959, var5, arg2);
                if (this.field961[arg2] != 1) {
                    this.field964++;
                    this.field961[arg2] = 1;
                }
            }
            if (!var4.field346) {
                var4.method1544((byte) -113);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class115.field2007.reset();
            class115.field2007.update(var5, 0, var5.length - 2);
            int var8 = (int) class115.field2007.getValue();
            if (this.field941.field4833[arg2] != var8) {
                throw new RuntimeException();
            }
            int var9 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field941.field4850[arg2] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field961[arg2] != 1) {
                this.field964++;
                this.field961[arg2] = 1;
            }
            if (!var4.field346) {
                var4.method1544((byte) -107);
            }
            return var4;
        } catch (Exception var11) {
            this.field961[arg2] = -1;
            var4.method1544((byte) -96);
            if (var4.field346 && !this.field968.method1389(true)) {
                class220 var10 = this.field968.method1406(-292567952, this.field947, arg2, true, (byte) 2);
                this.field950.method137((long) arg2, var10, -1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)Lmg;")
    public static final class264 method320(int arg0, byte arg1) {
        field963++;
        if (arg1 != 29) {
            return null;
        } else if (arg0 == 0) {
            return new class68();
        } else if (arg0 == 1) {
            return new class207();
        } else if (arg0 == 2) {
            return new class86();
        } else if (arg0 == 3) {
            return new class144();
        } else if (arg0 == 4) {
            return new class38();
        } else if (arg0 == 5) {
            return new class150();
        } else if (arg0 == 6) {
            return new class56();
        } else if (arg0 == 7) {
            return new class5();
        } else if (arg0 == 8) {
            return new class170();
        } else if (arg0 == 9) {
            return new class146();
        } else if (arg0 == 10) {
            return new class226();
        } else if (arg0 == 11) {
            return new class166();
        } else if (arg0 == 12) {
            return new class182();
        } else if (arg0 == 13) {
            return new class80();
        } else if (arg0 == 14) {
            return new class66();
        } else if (arg0 == 15) {
            return new class106();
        } else if (arg0 == 16) {
            return new class217();
        } else if (arg0 == 17) {
            return new class176();
        } else if (arg0 == 18) {
            return new class97();
        } else if (arg0 == 19) {
            return new class44();
        } else if (arg0 == 20) {
            return new class169();
        } else if (arg0 == 21) {
            return new class273();
        } else if (arg0 == 22) {
            return new class48();
        } else if (arg0 == 23) {
            return new class284();
        } else if (arg0 == 24) {
            return new class105();
        } else if (arg0 == 25) {
            return new class243();
        } else if (arg0 == 26) {
            return new class8();
        } else if (arg0 == 27) {
            return new class14();
        } else if (arg0 == 28) {
            return new class16();
        } else if (arg0 == 29) {
            return new class119();
        } else if (arg0 == 30) {
            return new class275();
        } else if (arg0 == 31) {
            return new class247();
        } else if (arg0 == 32) {
            return new class153();
        } else if (arg0 == 33) {
            return new class285();
        } else if (arg0 == 34) {
            return new class85();
        } else if (arg0 == 35) {
            return new class101();
        } else if (arg0 == 36) {
            return new class15();
        } else if (arg0 == 37) {
            return new class203();
        } else if (arg0 == 38) {
            return new class164();
        } else if (arg0 == 39) {
            return new class269();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V")
    public final void method321(int arg0) {
        if (arg0 < 116) {
            this.method328((byte) 103, -22);
        }
        field948++;
        if (this.field975 != null) {
            if (this.method322(255) == null) {
                return;
            }
            if (this.field974) {
                boolean var6 = true;
                for (class222 var7 = this.field975.method1151(108); var7 != null; var7 = this.field975.method1159(101)) {
                    int var9 = (int) var7.field4006;
                    if (this.field961[var9] == 0) {
                        this.method319(1, (byte) -126, var9);
                    }
                    if (this.field961[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method1544((byte) -62);
                    }
                }
                while (this.field971 < this.field941.field4826.length) {
                    if (this.field941.field4826[this.field971] == 0) {
                        this.field971++;
                    } else {
                        if (this.field951.field4206 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field961[this.field971] == 0) {
                            this.method319(1, (byte) -124, this.field971);
                        }
                        if (this.field961[this.field971] == 0) {
                            var6 = false;
                            class222 var8 = new class222();
                            var8.field4006 = (long) this.field971;
                            this.field975.method1152((byte) -5, var8);
                        }
                        this.field971++;
                    }
                }
                if (var6) {
                    this.field971 = 0;
                    this.field974 = false;
                }
            } else if (this.field972) {
                boolean var2 = true;
                for (class222 var3 = this.field975.method1151(108); var3 != null; var3 = this.field975.method1159(35)) {
                    int var5 = (int) var3.field4006;
                    if (this.field961[var5] != 1) {
                        this.method319(2, (byte) -127, var5);
                    }
                    if (this.field961[var5] == 1) {
                        var3.method1544((byte) -28);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field971 < this.field941.field4826.length) {
                    if (this.field941.field4826[this.field971] == 0) {
                        this.field971++;
                    } else {
                        if (this.field968.method1397((byte) 74)) {
                            var2 = false;
                            break;
                        }
                        if (this.field961[this.field971] != 1) {
                            this.method319(2, (byte) -127, this.field971);
                        }
                        if (this.field961[this.field971] != 1) {
                            class222 var4 = new class222();
                            var4.field4006 = (long) this.field971;
                            this.field975.method1152((byte) -5, var4);
                            var2 = false;
                        }
                        this.field971++;
                    }
                }
                if (var2) {
                    this.field972 = false;
                    this.field971 = 0;
                }
            } else {
                this.field975 = null;
            }
        }
        if (!this.field976 || class28.method155((byte) 125) < this.field977) {
            return;
        }
        for (class26 var10 = (class26) this.field950.method132((byte) 103); var10 != null; var10 = (class26) this.field950.method136(44)) {
            if (!var10.field343) {
                if (var10.field337) {
                    if (!var10.field346) {
                        throw new RuntimeException();
                    }
                    var10.method1544((byte) -122);
                } else {
                    var10.field337 = true;
                }
            }
        }
        this.field977 = class28.method155((byte) 103) + 1000L;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)Ltj;")
    public final class272 method322(int arg0) {
        field944++;
        if (arg0 != 255) {
            this.method331(26);
        }
        if (this.field941 != null) {
            return this.field941;
        }
        if (this.field955 == null) {
            if (this.field968.method1389(true)) {
                return null;
            }
            this.field955 = this.field968.method1406(-292567952, 255, this.field947, true, (byte) 0);
        }
        if (this.field955.field343) {
            return null;
        }
        byte[] var2 = this.field955.method144(-24385);
        if (this.field955 instanceof class204) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field941 = new class272(var2, this.field953);
                if (this.field941.field4827 != this.field946) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field941 = null;
                if (this.field968.method1389(true)) {
                    this.field955 = null;
                } else {
                    this.field955 = this.field968.method1406(-292567952, 255, this.field947, true, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field941 = new class272(var2, this.field953);
            } catch (RuntimeException var4) {
                this.field968.method1391(arg0 ^ 0xFFFFFF00);
                this.field941 = null;
                if (this.field968.method1389(true)) {
                    this.field955 = null;
                } else {
                    this.field955 = this.field968.method1406(-292567952, 255, this.field947, true, (byte) 0);
                }
                return null;
            }
            if (this.field965 != null) {
                this.field951.method1601(arg0 ^ 0xFFFFFF2F, this.field965, var2, this.field947);
            }
        }
        this.field955 = null;
        if (this.field959 != null) {
            this.field964 = 0;
            this.field961 = new byte[this.field941.field4853];
        }
        return this.field941;
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V")
    public final void method323(int arg0) {
        field943++;
        if (this.field975 == null || this.method322(255) == null) {
            return;
        }
        for (class222 var2 = this.field973.method1151(120); var2 != null; var2 = this.field973.method1159(59)) {
            int var3 = (int) var2.field4006;
            if (var3 < 0 || this.field941.field4853 <= var3 || this.field941.field4826[var3] == 0) {
                var2.method1544((byte) -107);
            } else {
                if (this.field961[var3] == 0) {
                    this.method319(1, (byte) -124, var3);
                }
                if (this.field961[var3] == -1) {
                    this.method319(2, (byte) -127, var3);
                }
                if (this.field961[var3] == 1) {
                    var2.method1544((byte) -89);
                }
            }
        }
        if (arg0 != 0) {
            this.method326(-72);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
    public final void method324(int arg0, int arg1) {
        field967++;
        if (this.field959 == null) {
            return;
        }
        if (arg0 != -21) {
            this.method327(-31);
        }
        for (class222 var3 = this.field973.method1151(arg0 ^ 0xFFFFFF97); var3 != null; var3 = this.field973.method1159(arg0 + 72)) {
            if ((long) arg1 == var3.field4006) {
                return;
            }
        }
        class222 var4 = new class222();
        var4.field4006 = (long) arg1;
        this.field973.method1152((byte) -5, var4);
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)V")
    public static void method325(int arg0) {
        field969 = null;
        field945 = null;
        if (arg0 == 0) {
            field957 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "(I)I")
    public final int method326(int arg0) {
        field970++;
        if (this.field941 == null) {
            return 0;
        } else {
            if (arg0 != -26829) {
                this.field965 = null;
            }
            return this.field941.field4852;
        }
    }

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "(I)I")
    public final int method327(int arg0) {
        field940++;
        if (arg0 != 25230) {
            method325(-95);
        }
        return this.field964;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)[B")
    public final byte[] method328(byte arg0, int arg1) {
        class26 var3 = this.method319(0, (byte) -124, arg1);
        field956++;
        if (var3 == null) {
            return null;
        } else if (arg0 >= -20) {
            return null;
        } else {
            byte[] var4 = var3.method144(-24385);
            var3.method1544((byte) -87);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)I")
    public final int method329(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field974 = false;
        }
        class26 var3 = (class26) this.field950.method135((long) arg0, true);
        field952++;
        return var3 == null ? 0 : var3.method141(false);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
    public static final void method330(boolean arg0) {
        field962++;
        class238.field4255.method300(0);
        if (arg0) {
            method320(-78, (byte) -72);
        }
    }

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "(I)V")
    public final void method331(int arg0) {
        field958++;
        if (this.field959 == null) {
            return;
        }
        this.field972 = true;
        if (this.field975 == null) {
            this.field975 = new class160();
        }
        if (arg0 != 0) {
            this.field976 = true;
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(ILah;Lah;Lij;Ldc;IIZ)V")
    public class57(int arg0, class277 arg1, class277 arg2, class195 arg3, class235 arg4, int arg5, int arg6, boolean arg7) {
        this.field947 = arg0;
        this.field959 = arg1;
        if (this.field959 == null) {
            this.field974 = false;
        } else {
            this.field974 = true;
            this.field975 = new class160();
        }
        this.field968 = arg3;
        this.field946 = arg6;
        this.field953 = arg5;
        this.field965 = arg2;
        this.field976 = arg7;
        this.field951 = arg4;
        if (this.field965 != null) {
            this.field955 = this.field951.method1602(this.field965, (byte) -22, this.field947);
        }
    }
}
