import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class136 extends class213 {

    @OriginalMember(owner = "client!ut", name = "t", descriptor = "Lef;")
    public class513 field1575 = new class513();

    @OriginalMember(owner = "client!ut", name = "v", descriptor = "Lfk;")
    public class679 field1578 = new class679();

    @OriginalMember(owner = "client!ut", name = "s", descriptor = "Lot;")
    private class616 field1566;

    @OriginalMember(owner = "client!ut", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field1579 = new String[] { method1162(method1161("!\u001e\u0000'")), method1162(method1161(":\u001fB\u0001O")), method1162(method1161("4EBe\u001a")), method1162(method1161(":\u001fB\u0002O")), method1162(method1161(":\u001fB\u000fO")), method1162(method1161(":\u001fB\fO")), method1162(method1161(":\u001fB\bO")), method1162(method1161(":\u001fB\tO")), method1162(method1161(":\u001fB\u0003O")), method1162(method1161(":\u001fBw\u000e!\u0002\u0018uO")), method1162(method1161(":\u001fB\u000eO")), method1162(method1161(":\u001fB\rO")), method1162(method1161(":\u001fB\nO")) };

    @OriginalMember(owner = "client!ut", name = "n", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!ut", name = "x", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!ut", name = "o", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!ut", name = "y", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!ut", name = "w", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!ut", name = "r", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!ut", name = "z", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!ut", name = "q", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!ut", name = "p", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!ut", name = "u", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "()Lfq;")
    public final class213 method1151() {
        try {
            field1577++;
            class575 var1;
            do {
                var1 = (class575) this.field1575.method3862(-353);
                if (var1 == null) {
                    return null;
                }
            } while (var1.field8483 == null);
            return var1.field8483;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1579[7] + ')');
        }
    }

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "()I")
    public final int method1152() {
        try {
            field1568++;
            return 0;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1579[12] + ')');
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BLnw;)V")
    public static final void method1153(byte arg0, class612 arg1) {
        try {
            if (arg0 != 111) {
                method1153((byte) -9, null);
            }
            field1571++;
            for (class142 var2 = (class142) class278.field4182.method3863((byte) 64); var2 != null; var2 = (class142) class278.field4182.method3862(-353)) {
                if (var2.field1702 == arg1) {
                    if (var2.field1700 != null) {
                        class594.field8714.method4980(var2.field1700);
                        var2.field1700 = null;
                    }
                    var2.method1824(1);
                    return;
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1579[3] + arg0 + ',' + (arg1 == null ? field1579[0] : field1579[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILlba;I[III)V")
    private final void method1154(int arg0, class575 arg1, int arg2, int[] arg3, int arg4, int arg5) {
        try {
            field1574++;
            if ((this.field1566.field8995[arg1.field8505] & 0x4) != 0 && arg1.field8503 < 0) {
                int var7 = this.field1566.field9044[arg1.field8505] / class598.field8803;
                while (true) {
                    int var8 = (var7 + 1048575 - arg1.field8491) / var7;
                    if (var8 > arg5) {
                        arg1.field8491 += arg5 * var7;
                        break;
                    }
                    arg1.field8483.method1156(arg3, arg4, var8);
                    arg1.field8491 += var7 * var8 - 1048576;
                    arg4 += var8;
                    arg5 -= var8;
                    int var9 = class598.field8803 / 100;
                    int var10 = 262144 / var7;
                    if (var9 > var10) {
                        var9 = var10;
                    }
                    class303 var11 = arg1.field8483;
                    if (this.field1566.field9051[arg1.field8505] == 0) {
                        arg1.field8483 = class303.method2578(arg1.field8496, var11.method2564(), var11.method2550(), var11.method2568());
                    } else {
                        arg1.field8483 = class303.method2578(arg1.field8496, var11.method2564(), 0, var11.method2568());
                        this.field1566.method4571(109, arg1, arg1.field8481.field3215[arg1.field8494] < 0);
                        arg1.field8483.method2541(var9, var11.method2550());
                    }
                    if (arg1.field8481.field3215[arg1.field8494] < 0) {
                        arg1.field8483.method2555(-1);
                    }
                    var11.method2565(var9);
                    var11.method1156(arg3, arg4, arg2 - arg4);
                    if (var11.method2562()) {
                        this.field1578.method4981(var11);
                    }
                }
            }
            arg1.field8483.method1156(arg3, arg4, arg5);
            if (arg0 <= 122) {
                this.field1575 = null;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field1579[11] + arg0 + ',' + (arg1 == null ? field1579[0] : field1579[2]) + ',' + arg2 + ',' + (arg3 == null ? field1579[0] : field1579[2]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BIII)I")
    public static final int method1155(byte arg0, int arg1, int arg2, int arg3) {
        try {
            field1569++;
            if (arg2 == arg3) {
                return arg3;
            } else if (arg0 == 39) {
                int var4 = 128 - arg1;
                int var5 = (arg2 & 0x7F) * arg1 + (arg3 & 0x7F) * var4 >> 7;
                int var6 = (arg2 & 0x380) * arg1 + (arg3 & 0x380) * var4 >> 7;
                int var7 = (arg3 & 0xFC00) * var4 + ((arg2 & 0xFC00) * arg1) >> 7;
                return var6 & 0x380 | var7 & 0xFC00 | var5 & 0x7F;
            } else {
                return -44;
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field1579[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "([III)V")
    public final void method1156(int[] arg0, int arg1, int arg2) {
        try {
            field1576++;
            this.field1578.method1156(arg0, arg1, arg2);
            for (class575 var4 = (class575) this.field1575.method3863((byte) 64); var4 != null; var4 = (class575) this.field1575.method3862(-353)) {
                if (!this.field1566.method4578(true, var4)) {
                    int var5 = arg1;
                    int var6 = arg2;
                    do {
                        if (var6 <= var4.field8484) {
                            this.method1154(123, var4, var5 + var6, arg0, var5, var6);
                            var4.field8484 -= var6;
                            break;
                        }
                        this.method1154(126, var4, var5 + var6, arg0, var5, var4.field8484);
                        var6 -= var4.field8484;
                        var5 += var4.field8484;
                    } while (!this.field1566.method4566(var5, arg0, var4, var6, (byte) -114));
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field1579[5] + (arg0 == null ? field1579[0] : field1579[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BLlba;I)V")
    private final void method1157(byte arg0, class575 arg1, int arg2) {
        try {
            if (arg0 != 19) {
                this.field1566 = null;
            }
            if ((this.field1566.field8995[arg1.field8505] & 0x4) != 0 && arg1.field8503 < 0) {
                int var4 = this.field1566.field9044[arg1.field8505] / class598.field8803;
                int var5 = (var4 + 1048575 - arg1.field8491) / var4;
                arg1.field8491 = arg2 * var4 + arg1.field8491 & 0xFFFFF;
                if (arg2 >= var5) {
                    if (this.field1566.field9051[arg1.field8505] == 0) {
                        arg1.field8483 = class303.method2578(arg1.field8496, arg1.field8483.method2564(), arg1.field8483.method2550(), arg1.field8483.method2568());
                    } else {
                        arg1.field8483 = class303.method2578(arg1.field8496, arg1.field8483.method2564(), 0, arg1.field8483.method2568());
                        this.field1566.method4571(90, arg1, arg1.field8481.field3215[arg1.field8494] < 0);
                    }
                    if (arg1.field8481.field3215[arg1.field8494] < 0) {
                        arg1.field8483.method2555(-1);
                    }
                    arg2 = arg1.field8491 / var4;
                }
            }
            field1573++;
            arg1.field8483.method1160(arg2);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field1579[1] + arg0 + ',' + (arg1 == null ? field1579[0] : field1579[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "()Lfq;")
    public final class213 method1158() {
        try {
            field1567++;
            class575 var1 = (class575) this.field1575.method3863((byte) 64);
            if (var1 == null) {
                return null;
            } else if (var1.field8483 == null) {
                return this.method1151();
            } else {
                return var1.field8483;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1579[10] + ')');
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)[Lni;")
    public static final class547[] method1159(int arg0) {
        try {
            if (arg0 == -1) {
                field1570++;
                return new class547[] { class655.field9467, class418.field6161, class546.field8150 };
            } else {
                return null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1579[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
    public final void method1160(int arg0) {
        try {
            field1572++;
            this.field1578.method1160(arg0);
            for (class575 var2 = (class575) this.field1575.method3863((byte) 64); var2 != null; var2 = (class575) this.field1575.method3862(-353)) {
                if (!this.field1566.method4578(true, var2)) {
                    int var3 = arg0;
                    do {
                        if (var2.field8484 >= var3) {
                            this.method1157((byte) 19, var2, var3);
                            var2.field8484 -= var3;
                            break;
                        }
                        this.method1157((byte) 19, var2, var2.field8484);
                        var3 -= var2.field8484;
                    } while (!this.field1566.method4566(0, null, var2, var3, (byte) -96));
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1579[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lot;)V")
    public class136(class616 arg0) {
        try {
            this.field1566 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1579[9] + (arg0 == null ? field1579[0] : field1579[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ut", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1161(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x67);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ut", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1162(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 79;
                    break;
                case 1:
                    var10005 = 107;
                    break;
                case 2:
                    var10005 = 108;
                    break;
                case 3:
                    var10005 = 75;
                    break;
                default:
                    var10005 = 103;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
