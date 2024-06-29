import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class43 {

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "[B")
    private byte[] field1039 = new byte[4];

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Ldf;")
    private class28 field1049;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    private int field1052;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "J")
    private long field1053;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "Loc;")
    public static class99 field1044 = class48.method402((byte) -104, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "Loc;")
    public static class99 field1051 = class48.method402((byte) -104, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "Loc;")
    public static class99 field1043 = class48.method402((byte) -104, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "Loc;")
    public static class99 field1050 = class48.method402((byte) -104, "@or2@");

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "Lrd;")
    public static class119 field1040 = new class119(4096);

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "Lr;")
    public static class118 field1054 = new class118(64);

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field1057 = 0;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "Loc;")
    private static class99 field1055 = class48.method402((byte) -104, "flash1:");

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "Loc;")
    public static class99 field1059 = field1055;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "Loc;")
    public static class99 field1061 = class48.method402((byte) -104, "Menge eingeben:");

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "Z")
    public static boolean field1060 = false;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "Loc;")
    public static class99 field1056 = field1055;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    private int field1046;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    private int field1048;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "Lhb;")
    public static class50 field1058;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field1042;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "[B")
    private byte[] field1041;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)[B")
    public final byte[] method368(byte arg0) throws IOException {
        if (arg0 != 25) {
            field1040 = null;
        }
        field1047++;
        if (this.field1053 < class60.method535(arg0 ^ 0x1B)) {
            throw new IOException("fdt");
        }
        if (this.field1052 == 0) {
            if (this.field1049.field688 == 2) {
                throw new IOException("fds");
            }
            if (this.field1049.field688 == 1) {
                this.field1052 = 1;
                this.field1042 = (DataInputStream) this.field1049.field685;
            }
        }
        if (this.field1052 == 1) {
            int var2 = this.field1042.available();
            if (var2 > 0) {
                if (this.field1048 + var2 > 4) {
                    var2 = 4 - this.field1048;
                }
                this.field1048 += this.field1042.read(this.field1039, this.field1048, var2);
                if (this.field1048 == 4) {
                    int var3 = (new class57(this.field1039)).method495(16711680);
                    this.field1041 = new byte[var3];
                    this.field1052 = 2;
                }
            }
        }
        if (this.field1052 == 2) {
            int var4 = this.field1042.available();
            if (var4 > 0) {
                if (this.field1046 + var4 > this.field1041.length) {
                    var4 = this.field1041.length - this.field1046;
                }
                this.field1046 += this.field1042.read(this.field1041, this.field1046, var4);
                if (this.field1041.length == this.field1046) {
                    return this.field1041;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static final void method369(int arg0) {
        if (class49.field1179 == 1) {
            if (class23.field540 >= 539 && class23.field540 <= 573 && class4.field75 >= 169 && class4.field75 < 205 && class134.field3301[0] != -1) {
                class57.field1473 = 0;
                class130.field3190 = true;
                class52.field1243 = true;
            }
            if (class23.field540 >= 569 && class23.field540 <= 599 && class4.field75 >= 168 && class4.field75 < 205 && class134.field3301[1] != -1) {
                class57.field1473 = 1;
                class52.field1243 = true;
                class130.field3190 = true;
            }
            if (class23.field540 >= 597 && class23.field540 <= 627 && class4.field75 >= 168 && class4.field75 < 205 && class134.field3301[2] != -1) {
                class52.field1243 = true;
                class130.field3190 = true;
                class57.field1473 = 2;
            }
            if (class23.field540 >= 625 && class23.field540 <= 669 && class4.field75 >= 168 && class4.field75 < 203 && class134.field3301[3] != -1) {
                class57.field1473 = 3;
                class130.field3190 = true;
                class52.field1243 = true;
            }
            if (class23.field540 >= 666 && class23.field540 <= 696 && class4.field75 >= 168 && class4.field75 < 205 && class134.field3301[4] != -1) {
                class57.field1473 = 4;
                class130.field3190 = true;
                class52.field1243 = true;
            }
            if (class23.field540 >= 694 && class23.field540 <= 724 && class4.field75 >= 168 && class4.field75 < 205 && class134.field3301[5] != -1) {
                class130.field3190 = true;
                class52.field1243 = true;
                class57.field1473 = 5;
            }
            if (class23.field540 >= 722 && class23.field540 <= 756 && class4.field75 >= 169 && class4.field75 < 205 && class134.field3301[6] != -1) {
                class57.field1473 = 6;
                class130.field3190 = true;
                class52.field1243 = true;
            }
            if (class23.field540 >= 540 && class23.field540 <= 574 && class4.field75 >= 466 && class4.field75 < 502 && class134.field3301[7] != -1) {
                class52.field1243 = true;
                class57.field1473 = 7;
                class130.field3190 = true;
            }
            if (class23.field540 >= 572 && class23.field540 <= 602 && class4.field75 >= 466 && class4.field75 < 503 && class134.field3301[8] != -1) {
                class130.field3190 = true;
                class52.field1243 = true;
                class57.field1473 = 8;
            }
            if (class23.field540 >= 599 && class23.field540 <= 629 && class4.field75 >= 466 && class4.field75 < 503 && class134.field3301[9] != -1) {
                class52.field1243 = true;
                class57.field1473 = 9;
                class130.field3190 = true;
            }
            if (class23.field540 >= 627 && class23.field540 <= 671 && class4.field75 >= 467 && class4.field75 < 502 && class134.field3301[10] != -1) {
                class57.field1473 = 10;
                class52.field1243 = true;
                class130.field3190 = true;
            }
            if (class23.field540 >= 669 && class23.field540 <= 699 && class4.field75 >= 466 && class4.field75 < 503 && class134.field3301[11] != -1) {
                class130.field3190 = true;
                class52.field1243 = true;
                class57.field1473 = 11;
            }
            if (class23.field540 >= 696 && class23.field540 <= 726 && class4.field75 >= 466 && class4.field75 < 503 && class134.field3301[12] != -1) {
                class130.field3190 = true;
                class57.field1473 = 12;
                class52.field1243 = true;
            }
            if (class23.field540 >= 724 && class23.field540 <= 758 && class4.field75 >= 466 && class4.field75 < 502 && class134.field3301[13] != -1) {
                class130.field3190 = true;
                class52.field1243 = true;
                class57.field1473 = 13;
            }
        }
        field1038++;
        if (arg0 != 0) {
            method370(-47);
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)I")
    public static final int method370(int arg0) {
        field1045++;
        int var1 = 3;
        if (class32.field754 < 310) {
            int var2 = class145.field3611 >> 7;
            int var3 = class94.field2290 >> 7;
            int var4 = class69.field1770.field3115 >> 7;
            int var5 = class69.field1770.field3077 >> 7;
            int var6;
            if (var2 >= var4) {
                var6 = var2 - var4;
            } else {
                var6 = var4 - var2;
            }
            if ((class81.field2028[class84.field2116][var2][var3] & 0x4) != 0) {
                var1 = class84.field2116;
            }
            int var7;
            if (var5 <= var3) {
                var7 = var3 - var5;
            } else {
                var7 = var5 - var3;
            }
            if (var6 <= var7) {
                int var8 = 32768;
                int var9 = var6 * 65536 / var7;
                while (var3 != var5) {
                    var8 += var9;
                    if (var3 < var5) {
                        var3++;
                    } else if (var5 < var3) {
                        var3--;
                    }
                    if ((class81.field2028[class84.field2116][var2][var3] & 0x4) != 0) {
                        var1 = class84.field2116;
                    }
                    if (var8 >= 65536) {
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class81.field2028[class84.field2116][var2][var3] & 0x4) != 0) {
                            var1 = class84.field2116;
                        }
                        var8 -= 65536;
                    }
                }
            } else {
                int var10 = var7 * 65536 / var6;
                int var11 = 32768;
                while (var2 != var4) {
                    var11 += var10;
                    if (var2 < var4) {
                        var2++;
                    } else if (var2 > var4) {
                        var2--;
                    }
                    if ((class81.field2028[class84.field2116][var2][var3] & 0x4) != 0) {
                        var1 = class84.field2116;
                    }
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var5 > var3) {
                            var3++;
                        } else if (var3 > var5) {
                            var3--;
                        }
                        if ((class81.field2028[class84.field2116][var2][var3] & 0x4) != 0) {
                            var1 = class84.field2116;
                        }
                    }
                }
            }
        }
        if ((class81.field2028[class84.field2116][class69.field1770.field3115 >> 7][class69.field1770.field3077 >> 7] & 0x4) != 0) {
            var1 = class84.field2116;
        }
        return arg0 == -17546 ? var1 : 26;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
    public static void method371(boolean arg0) {
        field1043 = null;
        field1061 = null;
        field1044 = null;
        field1040 = null;
        field1051 = null;
        field1056 = null;
        if (!arg0) {
            field1054 = null;
        }
        field1055 = null;
        field1059 = null;
        field1054 = null;
        field1050 = null;
        field1058 = null;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lhb;Ljava/net/URL;)V")
    public class43(class50 arg0, URL arg1) {
        this.field1049 = arg0.method420(arg1, false);
        this.field1052 = 0;
        this.field1053 = class60.method535(2) + 30000L;
    }
}
