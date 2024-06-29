import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class14 {

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public int field232;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field221 = 0;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Z")
    public static boolean field223 = false;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "Z")
    public static boolean field240 = true;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public int field224;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public int field231;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public int field237;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Lsa;")
    public class84 field227;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "[I")
    public int[] field218;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "[I")
    public int[] field219;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "[I")
    public int[] field225;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "[I")
    public int[] field230;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "[I")
    public int[] field238;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "[I")
    public int[] field239;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "[Lsa;")
    public class84[] field235;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "[[I")
    public int[][] field222;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "[[I")
    public int[][] field229;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V", line = 7)
    public static final void method135(byte arg0) {
        field233++;
        if (class69.field969) {
            return;
        }
        if (arg0 != 64) {
            field236 = -119;
        }
        if (class82.field1124) {
            class6.field114 = (float) ((int) class6.field114 + 47 & 0xFFFFFFF0);
        } else {
            class25.field383 += (12.0F - class25.field383) / 2.0F;
        }
        class69.field969 = true;
        class281.field4320 = true;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(CILjava/lang/String;)I", line = 35)
    public static final int method136(char arg0, int arg1, String arg2) {
        field220++;
        int var3 = 0;
        int var4 = arg2.length();
        for (int var5 = arg1; var5 < var4; var5++) {
            if (arg0 == arg2.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([BZ)V", line = 62)
    private final void method137(byte[] arg0, boolean arg1) {
        field226++;
        class6 var3 = new class6(class307.method2123(arg0, (byte) -47));
        int var4 = var3.method58(-288140008);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field224 = 0;
        } else {
            this.field224 = var3.method73((byte) 19);
        }
        int var5 = var3.method58(-288140008);
        if (!arg1) {
            return;
        }
        int var6 = -1;
        this.field231 = var3.method39((byte) 79);
        int var7 = 0;
        this.field225 = new int[this.field231];
        for (int var8 = 0; var8 < this.field231; var8++) {
            this.field225[var8] = var7 += var3.method39((byte) 33);
            if (var6 < this.field225[var8]) {
                var6 = this.field225[var8];
            }
        }
        this.field237 = var6 + 1;
        this.field222 = new int[this.field237][];
        this.field239 = new int[this.field237];
        this.field230 = new int[this.field237];
        this.field219 = new int[this.field237];
        this.field218 = new int[this.field237];
        if (var5 != 0) {
            this.field238 = new int[this.field237];
            for (int var9 = 0; var9 < this.field237; var9++) {
                this.field238[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field231; var10++) {
                this.field238[this.field225[var10]] = var3.method73((byte) 19);
            }
            this.field227 = new class84(this.field238);
        }
        for (int var11 = 0; var11 < this.field231; var11++) {
            this.field218[this.field225[var11]] = var3.method73((byte) 19);
        }
        for (int var12 = 0; var12 < this.field231; var12++) {
            this.field230[this.field225[var12]] = var3.method73((byte) 19);
        }
        for (int var13 = 0; var13 < this.field231; var13++) {
            this.field219[this.field225[var13]] = var3.method39((byte) 120);
        }
        for (int var14 = 0; var14 < this.field231; var14++) {
            int var15 = this.field225[var14];
            int var16 = this.field219[var15];
            this.field222[var15] = new int[var16];
            int var17 = 0;
            int var18 = -1;
            for (int var19 = 0; var19 < var16; var19++) {
                int var20 = this.field222[var15][var19] = var17 += var3.method39((byte) 102);
                if (var18 < var20) {
                    var18 = var20;
                }
            }
            this.field239[var15] = var18 + 1;
            if ((var18 + 1) == var16) {
                this.field222[var15] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field229 = new int[var6 + 1][];
        this.field235 = new class84[var6 + 1];
        for (int var21 = 0; var21 < this.field231; var21++) {
            int var22 = this.field225[var21];
            int var23 = this.field219[var22];
            this.field229[var22] = new int[this.field239[var22]];
            for (int var24 = 0; var24 < this.field239[var22]; var24++) {
                this.field229[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field222[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field222[var22][var25];
                }
                this.field229[var22][var26] = var3.method73((byte) 19);
            }
            this.field235[var22] = new class84(this.field229[var22]);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BZ)Z", line = 235)
    public static final boolean method138(byte arg0, boolean arg1) {
        field241++;
        if (arg0 != 11) {
            return true;
        }
        boolean var2 = class189.method1380();
        if (arg1 == var2) {
            return true;
        }
        if (!arg1) {
            class189.method1382();
        } else if (!class189.method1384() || !class189.method1389() || !class189.method1386()) {
            arg1 = false;
        }
        class163.field2648 = arg1;
        class135.method985(class42.field581, arg0 - 139);
        if (var2 == arg1) {
            return false;
        } else {
            ((class57) class31.field466).method463(false);
            return true;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZLug;)V", line = 276)
    public static final void method139(boolean arg0, class253 arg1) {
        field228++;
        if (arg0) {
            method135((byte) 105);
        }
        class52.field662 = arg1;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Lcd;", line = 305)
    public static final class136 method140(int arg0, int arg1) {
        field234++;
        int var2 = arg0 >> 16;
        if (arg1 != 1036508464) {
            method140(0, 70);
        }
        int var3 = arg0 & 0xFFFF;
        if (class269.field4182[var2] == null || class269.field4182[var2][var3] == null) {
            boolean var4 = class286.method2022((byte) -33, var2);
            if (!var4) {
                return null;
            }
        }
        return class269.field4182[var2][var3];
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "([BI)V", line = 332)
    public class14(byte[] arg0, int arg1) {
        this.field232 = class233.method1676(arg0, false, arg0.length);
        if (this.field232 != arg1) {
            throw new RuntimeException();
        }
        this.method137(arg0, true);
    }
}
