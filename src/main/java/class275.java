import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class275 extends class277 {

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    private int field4438 = 0;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "Lcd;")
    private class69 field4429 = new class69(16);

    @OriginalMember(owner = "client!se", name = "O", descriptor = "I")
    private int field4454 = 0;

    @OriginalMember(owner = "client!se", name = "P", descriptor = "Lhh;")
    private class169 field4455 = new class169();

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "J")
    private long field4456 = 0L;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "Ltm;")
    private class127 field4436;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    private int field4430;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "Z")
    private boolean field4453;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "Lhh;")
    private class169 field4451;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "I")
    private int field4443;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "Lwj;")
    private class302 field4440;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "Lvb;")
    private class182 field4439;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "Ltm;")
    private class127 field4434;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    private int field4424;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "Z")
    private boolean field4457;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "Lhl;")
    private class85 field4449;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public static int field4435 = 0;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "[[[I")
    public static int[][][] field4444 = new int[2][][];

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "Lak;")
    public static class172 field4425;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "Lwm;")
    private class89 field4437;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "Z")
    private boolean field4452;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "[B")
    private byte[] field4447;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(II)[B", line = 5)
    public final byte[] method1987(int arg0, int arg1) {
        field4426++;
        class85 var3 = this.method1995(0, arg1, 1363);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.method578(26);
        var3.method1212((byte) 78);
        if (arg0 < 13) {
            method1996(97, -110, 21);
        }
        return var4;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)I", line = 29)
    public final int method1988(byte arg0) {
        field4450++;
        if (this.field4437 == null) {
            return 0;
        } else if (this.field4453) {
            int var2 = -47 % ((arg0 + 64) / 34);
            class165 var3 = this.field4451.method1240(3);
            return var3 == null ? 0 : (int) var3.field2744;
        } else {
            return this.field4437.field1228;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)I", line = 55)
    public final int method1989(byte arg0) {
        if (arg0 <= 56) {
            this.method1998(-104);
        }
        field4428++;
        return this.field4438;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)V", line = 66)
    public final void method1990(int arg0, int arg1) {
        field4427++;
        if (this.field4436 == null || arg1 != 2) {
            return;
        }
        for (class165 var3 = this.field4455.method1240(3); var3 != null; var3 = this.field4455.method1235(false)) {
            if (((long) arg0) == var3.field2744) {
                return;
            }
        }
        class165 var4 = new class165();
        var4.field2744 = (long) arg0;
        this.field4455.method1232(113, var4);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)Lwm;", line = 95)
    public final class89 method1991(boolean arg0) {
        field4448++;
        if (this.field4437 != null) {
            return this.field4437;
        }
        if (this.field4449 == null) {
            if (this.field4439.method1359((byte) 91)) {
                return null;
            }
            this.field4449 = this.field4439.method1369((byte) 0, this.field4430, true, (byte) -103, 255);
        }
        if (this.field4449.field1190) {
            return null;
        }
        byte[] var2 = this.field4449.method578(26);
        if (this.field4449 instanceof class116) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4437 = new class89(var2, this.field4443);
                if (this.field4437.field1242 != this.field4424) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var5) {
                this.field4437 = null;
                if (this.field4439.method1359((byte) 124)) {
                    this.field4449 = null;
                } else {
                    this.field4449 = this.field4439.method1369((byte) 0, this.field4430, true, (byte) -103, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4437 = new class89(var2, this.field4443);
            } catch (RuntimeException var6) {
                this.field4439.method1361((byte) -108);
                this.field4437 = null;
                if (this.field4439.method1359((byte) 110)) {
                    this.field4449 = null;
                } else {
                    this.field4449 = this.field4439.method1369((byte) 0, this.field4430, true, (byte) -103, 255);
                }
                return null;
            }
            if (this.field4434 != null) {
                this.field4440.method2152(this.field4434, this.field4430, (byte) 98, var2);
            }
        }
        if (arg0) {
            this.field4443 = 7;
        }
        this.field4449 = null;
        if (this.field4436 != null) {
            this.field4447 = new byte[this.field4437.field1237];
            this.field4438 = 0;
        }
        return this.field4437;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(I)I", line = 197)
    public final int method1992(int arg0) {
        field4432++;
        if (arg0 > -25) {
            this.method1999(true);
        }
        if (this.method1991(false) == null) {
            return this.field4449 == null ? 0 : this.field4449.method579(-105);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V", line = 230)
    public final void method1993(byte arg0) {
        if (arg0 <= 89) {
            return;
        }
        field4445++;
        if (this.field4451 != null) {
            if (this.method1991(false) == null) {
                return;
            }
            if (this.field4453) {
                boolean var2 = true;
                for (class165 var3 = this.field4451.method1240(3); var3 != null; var3 = this.field4451.method1235(false)) {
                    int var4 = (int) var3.field2744;
                    if (this.field4447[var4] == 0) {
                        this.method1995(1, var4, 1363);
                    }
                    if (this.field4447[var4] == 0) {
                        var2 = false;
                    } else {
                        var3.method1212((byte) 107);
                    }
                }
                while (this.field4437.field1231.length > this.field4454) {
                    if (this.field4437.field1231[this.field4454] == 0) {
                        this.field4454++;
                    } else {
                        if (this.field4440.field4742 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field4447[this.field4454] == 0) {
                            this.method1995(1, this.field4454, 1363);
                        }
                        if (this.field4447[this.field4454] == 0) {
                            class165 var5 = new class165();
                            var2 = false;
                            var5.field2744 = (long) this.field4454;
                            this.field4451.method1232(91, var5);
                        }
                        this.field4454++;
                    }
                }
                if (var2) {
                    this.field4454 = 0;
                    this.field4453 = false;
                }
            } else if (this.field4452) {
                boolean var6 = true;
                for (class165 var7 = this.field4451.method1240(3); var7 != null; var7 = this.field4451.method1235(false)) {
                    int var8 = (int) var7.field2744;
                    if (this.field4447[var8] != 1) {
                        this.method1995(2, var8, 1363);
                    }
                    if (this.field4447[var8] == 1) {
                        var7.method1212((byte) 96);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field4454 < this.field4437.field1231.length) {
                    if (this.field4437.field1231[this.field4454] == 0) {
                        this.field4454++;
                    } else {
                        if (this.field4439.method1374(-21)) {
                            var6 = false;
                            break;
                        }
                        if (this.field4447[this.field4454] != 1) {
                            this.method1995(2, this.field4454, 1363);
                        }
                        if (this.field4447[this.field4454] != 1) {
                            var6 = false;
                            class165 var9 = new class165();
                            var9.field2744 = (long) this.field4454;
                            this.field4451.method1232(117, var9);
                        }
                        this.field4454++;
                    }
                }
                if (var6) {
                    this.field4454 = 0;
                    this.field4452 = false;
                }
            } else {
                this.field4451 = null;
            }
        }
        if (!this.field4457 || this.field4456 > class283.method2038((byte) 124)) {
            return;
        }
        for (class85 var10 = (class85) this.field4429.method458((byte) -16); var10 != null; var10 = (class85) this.field4429.method455((byte) 55)) {
            if (!var10.field1190) {
                if (var10.field1187) {
                    if (!var10.field1184) {
                        throw new RuntimeException();
                    }
                    var10.method1212((byte) 121);
                } else {
                    var10.field1187 = true;
                }
            }
        }
        this.field4456 = class283.method2038((byte) 126) + 1000L;
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(I)I", line = 411)
    public final int method1994(int arg0) {
        field4441++;
        if (this.field4437 == null) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.field4443 = 55;
            }
            return this.field4437.field1228;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)Lhl;", line = 428)
    private final class85 method1995(int arg0, int arg1, int arg2) {
        field4431++;
        class85 var4 = (class85) this.field4429.method451((long) arg1, (byte) 100);
        if (var4 != null && arg0 == 0 && !var4.field1184 && var4.field1190) {
            var4.method1212((byte) 66);
            var4 = null;
        }
        if (arg2 != 1363) {
            return (class85) null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field4436 == null || this.field4447[arg1] == -1) {
                    if (this.field4439.method1359((byte) 104)) {
                        return null;
                    }
                    var4 = this.field4439.method1369((byte) 2, arg1, true, (byte) -103, this.field4430);
                } else {
                    var4 = this.field4440.method2150(arg1, this.field4436, (byte) -55);
                }
            } else if (arg0 == 1) {
                if (this.field4436 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field4440.method2154((byte) 110, arg1, this.field4436);
            } else if (arg0 == 2) {
                if (this.field4436 == null) {
                    throw new RuntimeException();
                }
                if (this.field4447[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4439.method1374(-21)) {
                    return null;
                }
                var4 = this.field4439.method1369((byte) 2, arg1, false, (byte) -103, this.field4430);
            } else {
                throw new RuntimeException();
            }
            this.field4429.method461(109, (long) arg1, var4);
        }
        if (var4.field1190) {
            return null;
        }
        byte[] var5 = var4.method578(26);
        if (!var4 instanceof class116) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class111.field1645.reset();
                class111.field1645.update(var5, 0, var5.length - 2);
                int var10 = (int) class111.field1645.getValue();
                if (this.field4437.field1243[arg1] != var10) {
                    throw new RuntimeException();
                }
                this.field4439.field3034 = 0;
                this.field4439.field3036 = 0;
            } catch (RuntimeException var14) {
                this.field4439.method1361((byte) -96);
                var4.method1212((byte) 75);
                if (var4.field1184 && !this.field4439.method1359((byte) 112)) {
                    class298 var12 = this.field4439.method1369((byte) 2, arg1, true, (byte) -103, this.field4430);
                    this.field4429.method461(0, (long) arg1, var12);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field4437.field1225[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field4437.field1225[arg1];
            if (this.field4436 != null) {
                this.field4440.method2152(this.field4436, arg1, (byte) 98, var5);
                if (this.field4447[arg1] != 1) {
                    this.field4438++;
                    this.field4447[arg1] = 1;
                }
            }
            if (!var4.field1184) {
                var4.method1212((byte) 83);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class111.field1645.reset();
            class111.field1645.update(var5, 0, var5.length - 2);
            int var6 = (int) class111.field1645.getValue();
            if (this.field4437.field1243[arg1] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field4437.field1225[arg1] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field4447[arg1] != 1) {
                if (this.field4447[arg1] != 0) {
                }
                this.field4438++;
                this.field4447[arg1] = 1;
            }
            if (!var4.field1184) {
                var4.method1212((byte) 95);
            }
            return var4;
        } catch (Exception var13) {
            this.field4447[arg1] = -1;
            var4.method1212((byte) 104);
            if (var4.field1184 && !this.field4439.method1359((byte) 88)) {
                class298 var9 = this.field4439.method1369((byte) 2, arg1, true, (byte) -103, this.field4430);
                this.field4429.method461(arg2 ^ 0x55E, (long) arg1, var9);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(III)Log;", line = 651)
    public static final class157 method1996(int arg0, int arg1, int arg2) {
        field4433++;
        class157 var3 = class142.method1053(arg2, 65535);
        if (arg1 == -1) {
            return var3;
        } else {
            int var4 = -75 / ((arg0 + 27) / 58);
            return var3 == null || var3.field2472 == null || var3.field2472.length <= arg1 ? null : var3.field2472[arg1];
        }
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(B)V", line = 672)
    public static void method1997(byte arg0) {
        field4425 = null;
        if (arg0 != 12) {
            method1996(15, -69, 76);
        }
        field4444 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(ILtm;Ltm;Lvb;Lwj;IIZ)V", line = 794)
    public class275(int arg0, class127 arg1, class127 arg2, class182 arg3, class302 arg4, int arg5, int arg6, boolean arg7) {
        this.field4436 = arg1;
        this.field4430 = arg0;
        if (this.field4436 == null) {
            this.field4453 = false;
        } else {
            this.field4453 = true;
            this.field4451 = new class169();
        }
        this.field4443 = arg5;
        this.field4440 = arg4;
        this.field4439 = arg3;
        this.field4434 = arg2;
        this.field4424 = arg6;
        this.field4457 = arg7;
        if (this.field4434 != null) {
            this.field4449 = this.field4440.method2150(this.field4430, this.field4434, (byte) -66);
        }
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(I)V", line = 690)
    public final void method1998(int arg0) {
        field4446++;
        if (this.field4436 == null) {
            return;
        }
        if (arg0 != -1) {
            this.field4449 = (class85) null;
        }
        this.field4452 = true;
        if (this.field4451 == null) {
            this.field4451 = new class169();
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V", line = 710)
    public final void method1999(boolean arg0) {
        field4423++;
        if (this.field4451 == null || this.method1991(false) == null) {
            return;
        }
        class165 var2 = this.field4455.method1240(3);
        if (!arg0) {
            this.method1995(-81, 60, -44);
        }
        while (var2 != null) {
            int var3 = (int) var2.field2744;
            if (var3 < 0 || var3 >= this.field4437.field1237 || this.field4437.field1231[var3] == 0) {
                var2.method1212((byte) 95);
            } else {
                if (this.field4447[var3] == 0) {
                    this.method1995(1, var3, 1363);
                }
                if (this.field4447[var3] == -1) {
                    this.method1995(2, var3, 1363);
                }
                if (this.field4447[var3] == 1) {
                    var2.method1212((byte) 78);
                }
            }
            var2 = this.field4455.method1235(false);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)I", line = 768)
    public final int method2000(int arg0, int arg1) {
        class85 var3 = (class85) this.field4429.method451((long) arg1, (byte) 100);
        if (arg0 != -118121624) {
            this.method1990(-82, 59);
        }
        field4442++;
        return var3 == null ? 0 : var3.method579(-120);
    }
}
