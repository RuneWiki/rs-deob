import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class69 extends class192 {

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "Loh;")
    private static class258 field1189 = class153.method1046("Starting 3d Library", 94);

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "I")
    public static int field1188 = 0;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "Loh;")
    public static class258 field1194 = field1189;

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "Loh;")
    public static class258 field1187 = class153.method1046("showingVideoAd", 109);

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "I")
    public static int field1195 = 0;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "[I")
    public static int[] field1196;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "[I")
    public int[] field1201;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "[I")
    private int[] field1203;

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "[Loh;")
    private class258[] field1192;

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "[[I")
    private int[][] field1190;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V", line = 20)
    public final void method514(int arg0) {
        if (arg0 != 32768) {
            this.field1190 = (int[][]) ((int[][]) null);
        }
        if (this.field1201 != null) {
            for (int var2 = 0; var2 < this.field1201.length; var2++) {
                this.field1201[var2] = class307.method2139(this.field1201[var2], 32768);
            }
        }
        field1200++;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lva;B)V", line = 70)
    public final void method515(class235 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1589(107);
            if (var3 == 0) {
                field1198++;
                if (arg1 <= 123) {
                    this.field1203 = (int[]) null;
                }
                return;
            }
            this.method523(var3, (byte) -26, arg0);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BII)I", line = 97)
    public final int method516(byte arg0, int arg1, int arg2) {
        if (arg0 != -97) {
            return 12;
        }
        field1202++;
        if (this.field1203 == null || arg2 < 0 || arg2 > this.field1203.length) {
            return -1;
        } else if (this.field1190[arg2] == null || arg1 < 0 || this.field1190[arg2].length < arg1) {
            return -1;
        } else {
            return this.field1190[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(B)V", line = 116)
    public static void method517(byte arg0) {
        field1194 = null;
        field1196 = null;
        if (arg0 != -18) {
            field1195 = 119;
        }
        field1189 = null;
        field1187 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZ)I", line = 131)
    public final int method518(int arg0, boolean arg1) {
        field1204++;
        if (arg1) {
            this.field1201 = (int[]) null;
        }
        return this.field1203 == null || arg0 < 0 || arg0 > this.field1203.length ? -1 : this.field1203[arg0];
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lva;I)Loh;", line = 145)
    public final class258 method519(class235 arg0, int arg1) {
        field1191++;
        class258 var3 = class92.method687(80, false);
        if (this.field1203 != null) {
            for (int var4 = 0; var4 < this.field1203.length; var4++) {
                var3.method1766(arg1 - 116, this.field1192[var4]);
                var3.method1766(103, class162.method1088(arg0.method1573((byte) -1, class49.field738[this.field1203[var4]]), this.field1203[var4], -118, this.field1190[var4]));
            }
        }
        var3.method1766(67, this.field1192[this.field1192.length + arg1]);
        return var3.method1787(arg1 - 122);
    }

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "(B)I", line = 181)
    public final int method520(byte arg0) {
        field1206++;
        if (arg0 == 49) {
            return this.field1203 == null ? 0 : this.field1203.length;
        } else {
            return 60;
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)Loh;", line = 200)
    public final class258 method521(int arg0) {
        field1197++;
        class258 var2 = class92.method687(80, false);
        if (this.field1192 == null) {
            return class34.field398;
        }
        var2.method1766(41, this.field1192[arg0]);
        for (int var3 = 1; var3 < this.field1192.length; var3++) {
            var2.method1766(-116, class109.field1927);
            var2.method1766(91, this.field1192[var3]);
        }
        return var2.method1787(arg0 - 123);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILva;[I)V", line = 224)
    public final void method522(int arg0, class235 arg1, int[] arg2) {
        field1205++;
        if (this.field1203 == null) {
            return;
        }
        int var4 = 0;
        if (arg0 != -1) {
            return;
        }
        while (this.field1203.length > var4 && arg2.length > var4) {
            int var5 = class294.field5057[this.method518(var4, false)];
            if (var5 > 0) {
                arg1.method1570((long) arg2[var4], var5, arg0 + 9);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBLva;)V", line = 253)
    private final void method523(int arg0, byte arg1, class235 arg2) {
        field1199++;
        if (arg0 == 1) {
            this.field1192 = arg2.method1620(84).method1806(false, 60);
        } else if (arg0 == 2) {
            int var8 = arg2.method1589(57);
            this.field1201 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1201[var9] = arg2.method1615(1);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method1589(67);
            this.field1203 = new int[var4];
            this.field1190 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1615(22);
                this.field1203[var5] = var6;
                this.field1190[var5] = new int[class209.field3606[var6]];
                for (int var7 = 0; var7 < class209.field3606[var6]; var7++) {
                    this.field1190[var5][var7] = arg2.method1615(arg1 - 99);
                }
            }
        }
        if (arg1 != -26) {
            this.method520((byte) -70);
        }
    }
}
