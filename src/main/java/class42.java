import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class42 extends class122 {

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "Lai;")
    private static class10 field688 = class44.method278("OFF", -33);

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "Lai;")
    public static class10 field685 = field688;

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "Ltb;")
    public static class174 field693 = new class174(0, 0);

    @OriginalMember(owner = "client!ec", name = "db", descriptor = "Lai;")
    public static class10 field700 = class44.method278(" )2> <col=ff9040>", 118);

    @OriginalMember(owner = "client!ec", name = "bb", descriptor = "I")
    public static int field698 = 0;

    @OriginalMember(owner = "client!ec", name = "ab", descriptor = "Lob;")
    public static class129 field697 = new class129();

    @OriginalMember(owner = "client!ec", name = "fb", descriptor = "[Z")
    public static boolean[] field702 = new boolean[100];

    @OriginalMember(owner = "client!ec", name = "gb", descriptor = "[I")
    public static int[] field703 = new int[1000];

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
    public int field684;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "I")
    public int field694;

    @OriginalMember(owner = "client!ec", name = "Y", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!ec", name = "Z", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!ec", name = "cb", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!ec", name = "eb", descriptor = "Lld;")
    public static class104 field701;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V")
    public static void method263(int arg0) {
        field701 = null;
        field688 = null;
        field697 = null;
        field700 = null;
        if (arg0 != 16711935) {
            field687 = -67;
        }
        field702 = null;
        field703 = null;
        field685 = null;
        field693 = null;
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)Lsa;")
    public final class164 method264(int arg0) {
        field692++;
        int var2 = 61 / ((66 - arg0) / 59);
        return class104.method678(500, this.field694).method622(this.field684, 0, null, 0);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLwa;)Lwa;")
    public static final class200 method265(byte arg0, class200 arg1) {
        field699++;
        int var2 = class3.method10(class203.method1318(0, arg1), arg0 ^ 0x3E);
        if (var2 == 0) {
            return null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg1 = class66.method432(arg1.field3794, false);
            if (arg1 == null) {
                return null;
            }
        }
        return arg0 == -80 ? arg1 : null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILh;)V")
    public static final void method266(int arg0, class65 arg1) {
        arg1.field1080 = arg1.field1092;
        field690++;
        if (arg1.field1116 == 0) {
            arg1.field1114 = 0;
            return;
        }
        if (arg1.field1081 != -1 && arg1.field1110 == 0) {
            class77 var2 = class142.method958((byte) -115, arg1.field1081);
            if (arg1.field1125 > 0 && var2.field1359 == 0) {
                arg1.field1114++;
                return;
            }
            if (arg1.field1125 <= 0 && var2.field1346 == 0) {
                arg1.field1114++;
                return;
            }
        }
        int var3 = arg1.field1100;
        int var4 = arg1.field1099[arg1.field1116 - 1] * 128 + arg1.field1126 * 64;
        int var5 = arg1.field1106[arg1.field1116 - 1] * 128 + arg1.field1126 * 64;
        int var6 = arg1.field1097;
        if (var4 - var3 > 256 || var4 - var3 < -256 || var5 - var6 > 256 || var5 - var6 < -256) {
            arg1.field1097 = var5;
            arg1.field1100 = var4;
            return;
        }
        if (var4 > var3) {
            if (var5 > var6) {
                arg1.field1108 = 1280;
            } else if (var6 > var5) {
                arg1.field1108 = 1792;
            } else {
                arg1.field1108 = 1536;
            }
        } else if (var3 <= var4) {
            if (var5 > var6) {
                arg1.field1108 = 1024;
            } else if (var5 < var6) {
                arg1.field1108 = 0;
            }
        } else if (var6 < var5) {
            arg1.field1108 = 768;
        } else if (var5 < var6) {
            arg1.field1108 = 256;
        } else {
            arg1.field1108 = 512;
        }
        int var7 = arg1.field1108 - arg1.field1109 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        if (arg0 != -15108) {
            field703 = null;
        }
        int var8 = arg1.field1131;
        int var9 = 4;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg1.field1091;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg1.field1079;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg1.field1139;
        }
        if (var8 == -1) {
            var8 = arg1.field1091;
        }
        boolean var10 = true;
        arg1.field1080 = var8;
        if (arg1 instanceof class125) {
            var10 = ((class125) arg1).field2386.field3583;
        }
        if (var10) {
            if (arg1.field1109 != arg1.field1108 && arg1.field1130 == -1 && arg1.field1140 != 0) {
                var9 = 2;
            }
            if (arg1.field1116 > 2) {
                var9 = 6;
            }
            if (arg1.field1116 > 3) {
                var9 = 8;
            }
            if (arg1.field1114 > 0 && arg1.field1116 > 1) {
                arg1.field1114--;
                var9 = 8;
            }
        } else {
            if (arg1.field1116 > 1) {
                var9 = 6;
            }
            if (arg1.field1116 > 2) {
                var9 = 8;
            }
            if (arg1.field1114 > 0 && arg1.field1116 > 1) {
                var9 = 8;
                arg1.field1114--;
            }
        }
        if (arg1.field1077[arg1.field1116 - 1]) {
            var9 <<= 0x1;
        }
        if (var5 > var6) {
            arg1.field1097 += var9;
            if (var5 < arg1.field1097) {
                arg1.field1097 = var5;
            }
        } else if (var6 > var5) {
            arg1.field1097 -= var9;
            if (arg1.field1097 < var5) {
                arg1.field1097 = var5;
            }
        }
        if (var9 >= 8 && arg1.field1091 == arg1.field1080 && arg1.field1136 != -1) {
            arg1.field1080 = arg1.field1136;
        }
        if (var4 > var3) {
            arg1.field1100 += var9;
            if (var4 < arg1.field1100) {
                arg1.field1100 = var4;
            }
        } else if (var3 > var4) {
            arg1.field1100 -= var9;
            if (var4 > arg1.field1100) {
                arg1.field1100 = var4;
            }
        }
        if (arg1.field1100 != var4 || arg1.field1097 != var5) {
            return;
        }
        arg1.field1116--;
        if (arg1.field1125 > 0) {
            arg1.field1125--;
            return;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILc;)Z")
    public static final boolean method267(int arg0, int arg1, class21 arg2) {
        field691++;
        byte[] var3 = arg2.method140((byte) -76, arg0);
        if (var3 == null) {
            return false;
        } else {
            class44.method275(-124, var3);
            int var4 = 57 / ((arg1 - 64) / 50);
            return true;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIBI)I")
    public static final int method268(int arg0, int arg1, byte arg2, int arg3) {
        field695++;
        int var4 = 256 - arg1;
        if (arg2 <= 59) {
            method266(120, null);
        }
        return ((arg0 & 0xFF00FF) * var4 + (arg3 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg3 & 0xFF00) * arg1 & 0xFF0000) >> 8;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    public static final int method269(KeyEvent arg0, int arg1) {
        field683++;
        int var2 = arg0.getKeyChar();
        if (~var2 == arg1) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)Z")
    public static final boolean method270(int arg0, byte arg1) {
        field689++;
        if (arg1 >= -55) {
            method268(55, 46, (byte) -20, -18);
        }
        if (class130.field2476[arg0]) {
            return true;
        } else if (class134.field2522.method135(124, arg0)) {
            int var2 = class134.field2522.method142(arg0, -106);
            if (var2 == 0) {
                class130.field2476[arg0] = true;
                return true;
            }
            if (class205.field3990[arg0] == null) {
                class205.field3990[arg0] = new class200[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class205.field3990[arg0][var3] == null) {
                    byte[] var4 = class134.field2522.method159((byte) 116, var3, arg0);
                    if (var4 != null) {
                        class205.field3990[arg0][var3] = new class200();
                        class205.field3990[arg0][var3].field3833 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class205.field3990[arg0][var3].method1290(new class114(var4), 118);
                        } else {
                            class205.field3990[arg0][var3].method1293(new class114(var4), (byte) 82);
                        }
                    }
                }
            }
            class130.field2476[arg0] = true;
            return true;
        } else {
            return false;
        }
    }
}
