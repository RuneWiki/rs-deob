import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class38 {

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    private int field455 = 0;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    private int field458 = -1;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "Lol;")
    private class220 field466 = new class220();

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "Z")
    public boolean field470 = false;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    private int field469;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "[Ljl;")
    private class252[] field459;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "[[I")
    private int[][] field456;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Ljf;")
    public static class216 field453 = new class216(2);

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "[C")
    public static char[] field467 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "Lac;")
    public static class153 field464 = new class153(32);

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)[[I")
    public final int[][] method214(int arg0) {
        field462++;
        if (this.field469 != this.field461) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field461; var2++) {
            this.field459[var2] = class79.field1191;
        }
        return this.field456;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II[SB[Ljava/lang/String;)V")
    public static final void method215(int arg0, int arg1, short[] arg2, byte arg3, String[] arg4) {
        if (arg3 <= 23) {
            return;
        }
        field463++;
        if (arg1 <= arg0) {
            return;
        }
        int var5 = (arg0 + arg1) / 2;
        int var6 = arg0;
        String var7 = arg4[var5];
        arg4[var5] = arg4[arg1];
        arg4[arg1] = var7;
        short var8 = arg2[var5];
        arg2[var5] = arg2[arg1];
        arg2[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (var7 == null || arg4[var9] != null && (var9 & 0x1) > arg4[var9].compareTo(var7)) {
                String var10 = arg4[var9];
                arg4[var9] = arg4[var6];
                arg4[var6] = var10;
                short var11 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6++] = var11;
            }
        }
        arg4[arg1] = arg4[var6];
        arg4[var6] = var7;
        arg2[arg1] = arg2[var6];
        arg2[var6] = var8;
        method215(arg0, var6 - 1, arg2, (byte) 27, arg4);
        method215(var6 + 1, arg1, arg2, (byte) 73, arg4);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
    public static void method216(byte arg0) {
        field453 = null;
        field464 = null;
        if (arg0 != 32) {
            method215(-23, -71, (short[]) null, (byte) -12, (String[]) null);
        }
        field467 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZ)[I")
    public final int[] method217(int arg0, boolean arg1) {
        field454++;
        if (!arg1) {
            method218(-103);
        }
        if (this.field469 == this.field461) {
            this.field470 = this.field459[arg0] == null;
            this.field459[arg0] = class79.field1191;
            return this.field456[arg0];
        } else if (this.field461 == 1) {
            this.field470 = this.field458 != arg0;
            this.field458 = arg0;
            return this.field456[0];
        } else {
            class252 var3 = this.field459[arg0];
            if (var3 == null) {
                this.field470 = true;
                if (this.field455 < this.field461) {
                    var3 = new class252(arg0, this.field455);
                    this.field455++;
                } else {
                    class252 var4 = (class252) this.field466.method1541(1);
                    var3 = new class252(arg0, var4.field4125);
                    this.field459[var4.field4123] = null;
                    var4.method1764(64);
                }
                this.field459[arg0] = var3;
            } else {
                this.field470 = false;
            }
            this.field466.method1539(-1770092592, var3);
            return this.field456[var3.field4125];
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
    public static final void method218(int arg0) {
        class310.field4985++;
        field465++;
        int var1 = -83 / ((64 - arg0) / 36);
        class150.field2218.method445(84, 7);
        class150.field2218.method1183(class49.method298((byte) 100), 984049208);
        class150.field2218.method1180(-17437, class112.field1626);
        class150.field2218.method1180(-17437, class126.field1814);
        class150.field2218.method1183(class96.field1451, 984049208);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)V")
    public static final void method219(byte arg0, int arg1) {
        class282.field4592 = -1;
        class72.field1069 = -1;
        field457++;
        class311.field4993 = arg1;
        class283.method1945(-65);
        if (arg0 >= -97) {
            method218(-6);
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V")
    public final void method220(byte arg0) {
        for (int var2 = 0; var2 < this.field461; var2++) {
            this.field456[var2] = null;
        }
        field468++;
        this.field456 = null;
        if (arg0 == 57) {
            this.field459 = null;
            this.field466.method1544((byte) 43);
            this.field466 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IB)V")
    public static final void method221(int arg0, byte arg1) {
        field460++;
        int var2 = 121 / ((arg1 - 4) / 36);
        class181 var3 = class95.method652(2, (byte) 34, arg0);
        var3.method1283(192);
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(III)V")
    public class38(int arg0, int arg1, int arg2) {
        this.field469 = arg1;
        this.field461 = arg0;
        this.field459 = new class252[this.field469];
        this.field456 = new int[this.field461][arg2];
    }
}
