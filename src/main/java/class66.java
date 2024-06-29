import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class66 implements class138 {

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    private int field1250 = 50;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "Z")
    private boolean field1253 = false;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "Lgf;")
    private class7 field1236;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "Lgf;")
    private class7 field1242;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "Lbg;")
    private class177 field1246;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Lbg;")
    private class177 field1228;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "[Z")
    private boolean[] field1260;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "[B")
    private byte[] field1249;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "[B")
    private byte[] field1256;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "[S")
    private short[] field1237;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "[Z")
    private boolean[] field1234;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "[Z")
    private boolean[] field1235;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "[B")
    private byte[] field1241;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "[B")
    private byte[] field1245;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "[Z")
    private boolean[] field1258;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "[Z")
    private boolean[] field1255;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field1232 = 0;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "Llc;")
    public static class143 field1238 = method374(" est d-Bj-9 dans votre liste noire)3", -1);

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field1229 = 0;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "Llc;")
    public static class143 field1254 = method374("::clientdrop", -1);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Lgf;")
    public static class7 field1230;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "Lgf;")
    public static class7 field1244;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)Z")
    public final boolean method373(byte arg0, int arg1) {
        field1222++;
        if (this.field1253 || this.field1234[arg1]) {
            return true;
        } else if (arg0 == 12) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;I)Llc;")
    public static final class143 method374(String arg0, int arg1) {
        field1226++;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        class143 var4 = new class143();
        int var5 = 0;
        var4.field2503 = new byte[var3];
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var5) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field2503[var4.field2548++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field2503[var4.field2548++] = (byte) var6;
            }
        }
        if (arg1 == -1) {
            var4.method908(arg1 + 1);
            return var4.method900((byte) 54);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
    public final void method375(boolean arg0) {
        if (!arg0) {
            method374((String) null, -125);
        }
        this.field1246.method1166(121);
        if (this.field1228 != null) {
            this.field1228.method1166(118);
        }
        field1240++;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)[I")
    public final int[] method376(int arg0, int arg1) {
        field1225++;
        class95 var3 = this.method381(arg1, 45);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 <= 15) {
                field1230 = null;
            }
            return var3.method562(this.field1253 || this.field1234[arg1], 128, this, this.field1236);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method377(byte[] arg0, boolean arg1) {
        field1252++;
        int var2 = arg0.length;
        if (arg1) {
            field1261 = 100;
        }
        byte[] var3 = new byte[var2];
        class275.method1813(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)Z")
    public final boolean method378(int arg0, boolean arg1) {
        field1224++;
        if (arg1) {
            this.method388(96, 1);
        }
        return this.field1260[arg0];
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILfi;)V")
    public static final void method379(int arg0, class228 arg1) {
        if (arg0 <= 56) {
            return;
        }
        field1247++;
        arg1.field4123 = false;
        if (arg1.field4133 != -1) {
            class104 var2 = class164.method1081(arg1.field4133, -21331);
            if (var2 == null || var2.field1829 == null) {
                arg1.field4133 = -1;
            } else {
                arg1.field4121++;
                if (var2.field1829.length > arg1.field4184 && var2.field1824[arg1.field4184] < arg1.field4121) {
                    arg1.field4121 = 1;
                    arg1.field4184++;
                    class274.method1805(var2, arg1.field4184, arg1.field4108, arg1.field4178, class229.field4195 == arg1, (byte) -66);
                }
                if (var2.field1829.length <= arg1.field4184) {
                    arg1.field4121 = 0;
                    arg1.field4184 = 0;
                    class274.method1805(var2, arg1.field4184, arg1.field4108, arg1.field4178, class229.field4195 == arg1, (byte) -66);
                }
            }
        }
        if (arg1.field4119 != -1 && arg1.field4132 <= class146.field2635) {
            int var3 = class122.method742(-79, arg1.field4119).field3090;
            if (var3 == -1) {
                arg1.field4119 = -1;
            } else {
                class104 var4 = class164.method1081(var3, -21331);
                if (var4 == null || var4.field1829 == null) {
                    arg1.field4119 = -1;
                } else {
                    if (arg1.field4107 < 0) {
                        arg1.field4107 = 0;
                        class274.method1805(var4, 0, arg1.field4108, arg1.field4178, class229.field4195 == arg1, (byte) -66);
                    }
                    arg1.field4175++;
                    if (arg1.field4107 < var4.field1829.length && var4.field1824[arg1.field4107] < arg1.field4175) {
                        arg1.field4107++;
                        arg1.field4175 = 1;
                        class274.method1805(var4, arg1.field4107, arg1.field4108, arg1.field4178, class229.field4195 == arg1, (byte) -66);
                    }
                    if (var4.field1829.length <= arg1.field4107) {
                        arg1.field4119 = -1;
                    }
                }
            }
        }
        if (arg1.field4131 != -1 && arg1.field4156 <= 1) {
            class104 var5 = class164.method1081(arg1.field4131, -21331);
            if (var5.field1827 == 1 && arg1.field4138 > 0 && class146.field2635 >= arg1.field4139 && arg1.field4128 < class146.field2635) {
                arg1.field4156 = 1;
                return;
            }
        }
        if (arg1.field4131 != -1 && arg1.field4156 == 0) {
            class104 var6 = class164.method1081(arg1.field4131, -21331);
            if (var6 == null || var6.field1829 == null) {
                arg1.field4131 = -1;
            } else {
                arg1.field4166++;
                if (arg1.field4153 < var6.field1829.length && var6.field1824[arg1.field4153] < arg1.field4166) {
                    arg1.field4153++;
                    arg1.field4166 = 1;
                    class274.method1805(var6, arg1.field4153, arg1.field4108, arg1.field4178, class229.field4195 == arg1, (byte) -66);
                }
                if (var6.field1829.length <= arg1.field4153) {
                    arg1.field4109++;
                    arg1.field4153 -= var6.field1819;
                    if (var6.field1835 <= arg1.field4109) {
                        arg1.field4131 = -1;
                    } else if (arg1.field4153 >= 0 && var6.field1829.length > arg1.field4153) {
                        class274.method1805(var6, arg1.field4153, arg1.field4108, arg1.field4178, class229.field4195 == arg1, (byte) -66);
                    } else {
                        arg1.field4131 = -1;
                    }
                }
                arg1.field4123 = var6.field1830;
            }
        }
        if (arg1.field4156 > 0) {
            arg1.field4156--;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)V")
    public static void method380(boolean arg0) {
        field1254 = null;
        field1238 = null;
        field1230 = null;
        if (!arg0) {
            method380(false);
        }
        field1244 = null;
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(II)Lke;")
    private final class95 method381(int arg0, int arg1) {
        field1223++;
        class95 var3 = (class95) this.field1246.method1168((long) arg0, (byte) 96);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field1242.method41(-18328, arg0, 0);
        if (var4 == null) {
            return null;
        }
        int var5 = -48 % ((arg1 + 27) / 57);
        class190 var6 = new class190(var4);
        class95 var7 = new class95(var6);
        this.field1246.method1163(var7, (long) arg0, 0);
        return var7;
    }

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "(II)V")
    public final void method382(int arg0, int arg1) {
        field1251++;
        for (class95 var3 = (class95) this.field1246.method1165((byte) -114); var3 != null; var3 = (class95) this.field1246.method1169((byte) -25)) {
            if (var3.field1755) {
                var3.method559(128, arg1);
                var3.field1755 = false;
            }
        }
        if (arg0 != 0) {
            this.method381(-22, 26);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IFI)[I")
    public final int[] method383(int arg0, float arg1, int arg2) {
        if (arg2 != 0) {
            this.method386((byte) 17, true);
        }
        field1259++;
        class95 var4 = this.method381(arg0, -88);
        if (var4 == null) {
            return null;
        } else {
            var4.field1755 = true;
            return var4.method555(this.field1236, arg2 - 99, this.field1253 || this.field1234[arg0], arg1, this);
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)Z")
    public final boolean method384(int arg0, int arg1) {
        field1248++;
        class95 var3 = this.method381(arg1, 43);
        if (var3 == null) {
            return false;
        } else if (arg0 == 1) {
            return var3.method558(arg0 + 102, this.field1236, this);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(II)Z")
    public final boolean method385(int arg0, int arg1) {
        field1243++;
        return arg0 < 108 ? false : this.field1235[arg1];
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BZ)V")
    public final void method386(byte arg0, boolean arg1) {
        this.field1253 = arg1;
        this.method375(true);
        if (arg0 != 75) {
            this.field1234 = null;
        }
        field1227++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method387(int arg0, Component arg1) {
        field1239++;
        arg1.removeMouseListener(class221.field4004);
        arg1.removeMouseMotionListener(class221.field4004);
        arg1.removeFocusListener(class221.field4004);
        int var2 = 92 % ((-arg0 - 45) / 49);
        class191.field3513 = 0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I")
    public final int method388(int arg0, int arg1) {
        field1257++;
        return arg0 == 0 ? this.field1237[arg1] & 0xFFFF : -118;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lgf;Lgf;Lgf;IZ)V")
    public class66(class7 arg0, class7 arg1, class7 arg2, int arg3, boolean arg4) {
        this.field1236 = arg2;
        this.field1242 = arg0;
        this.field1250 = arg3;
        this.field1253 = arg4;
        this.field1246 = new class177(this.field1250);
        this.field1228 = null;
        class190 var6 = new class190(arg1.method41(-18328, 0, 0));
        int var7 = var6.method1275(128);
        this.field1260 = new boolean[var7];
        this.field1249 = new byte[var7];
        this.field1256 = new byte[var7];
        this.field1237 = new short[var7];
        this.field1234 = new boolean[var7];
        this.field1235 = new boolean[var7];
        this.field1241 = new byte[var7];
        this.field1245 = new byte[var7];
        this.field1258 = new boolean[var7];
        this.field1255 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field1255[var8] = var6.method1265(117) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field1255[var9]) {
                this.field1235[var9] = var6.method1265(125) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field1255[var10]) {
                this.field1260[var10] = var6.method1265(114) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field1255[var11]) {
                this.field1234[var11] = var6.method1265(116) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field1255[var12]) {
                this.field1258[var12] = var6.method1265(119) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field1255[var13]) {
                this.field1245[var13] = var6.method1234(false);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field1255[var14]) {
                this.field1249[var14] = var6.method1234(false);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field1255[var15]) {
                this.field1256[var15] = var6.method1234(false);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field1255[var16]) {
                this.field1241[var16] = var6.method1234(false);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field1255[var17]) {
                this.field1237[var17] = (short) var6.method1275(128);
            }
        }
    }
}
