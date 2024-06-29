import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class144 {

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "Lme;")
    public class208 field1810 = new class208();

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "Z")
    public static volatile boolean field1811 = false;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!eea", name = "h", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!eea", name = "i", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!eea", name = "j", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "Lme;")
    private class208 field1815;

    @OriginalMember(owner = "client!eea", name = "k", descriptor = "Lwb;")
    public static class350 field1819;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZLme;)V")
    public final void method1054(boolean arg0, class208 arg1) {
        if (arg1.field2468 != null) {
            arg1.method1315((byte) -51);
        }
        field1818++;
        arg1.field2468 = this.field1810.field2468;
        arg1.field2467 = this.field1810;
        arg1.field2468.field2467 = arg1;
        arg1.field2467.field2468 = arg1;
        if (arg0) {
            this.field1815 = null;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(B)V")
    public static void method1055(byte arg0) {
        field1819 = null;
        if (arg0 <= 40) {
            method1060((byte) -15);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)Lme;")
    public final class208 method1056(int arg0) {
        if (arg0 != -1) {
            this.field1810 = null;
        }
        field1813++;
        class208 var2 = this.field1810.field2467;
        if (this.field1810 == var2) {
            this.field1815 = null;
            return null;
        } else {
            this.field1815 = var2.field2467;
            return var2;
        }
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(B)V")
    public static final void method1057(byte arg0) {
        if (arg0 <= 116) {
            method1057((byte) 50);
        }
        field1814++;
        for (int var1 = 0; var1 < class168.field2027; var1++) {
            class141.field1767[var1] = null;
        }
        class168.field2027 = 0;
        for (int var2 = 0; var2 < class368.field4569; var2++) {
            for (int var42 = 0; var42 < class307.field3799; var42++) {
                for (int var43 = 0; var43 < class250.field2938; var43++) {
                    class727 var44 = class107.field1351[var2][var43][var42];
                    if (var44 != null) {
                        if (var44.field10183 > 0) {
                            var44.field10183 = (short) (var44.field10183 * -1);
                        }
                        if (var44.field10178 > 0) {
                            var44.field10178 = (short) (var44.field10178 * -1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class368.field4569; var3++) {
            for (int var4 = 0; var4 < class307.field3799; var4++) {
                for (int var5 = 0; var5 < class250.field2938; var5++) {
                    class727 var6 = class107.field1351[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class107.field1351[0][var5][var4] != null && class107.field1351[0][var5][var4].field10172 != null;
                        if (var6.field10178 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class727 var12 = class107.field1351[var3][var5][var4 - 1];
                            int var13 = class707.field9933[var3].method1728(var4, (byte) -49, var5);
                            while (var8 > 0 && var12 != null && var12.field10178 < 0 && var6.field10178 == var12.field10178 && var6.field10179 == var12.field10179 && var13 == class707.field9933[var3].method1728(var8 - 1, (byte) -83, var5) && (var8 - 1 <= 0 || class707.field9933[var3].method1728(var8 - 2, (byte) -118, var5) == var13)) {
                                var8--;
                                var12 = class107.field1351[var3][var5][var8 - 1];
                            }
                            for (class727 var14 = class107.field1351[var3][var5][var4 + 1]; class250.field2938 > var9 && var14 != null && var14.field10178 < 0 && var6.field10178 == var14.field10178 && var6.field10179 == var14.field10179 && var13 == class707.field9933[var3].method1728(var9 + 1, (byte) -31, var5) && (class250.field2938 <= (var9 + 1) || var13 == class707.field9933[var3].method1728(var9 + 2, (byte) -102, var5)); var14 = class107.field1351[var3][var5][var9 + 1]) {
                                var9++;
                            }
                            int var15 = var3 + 1 - var3;
                            int var16 = class707.field9933[var7 ? var3 + 1 : var3].method1728(var8, (byte) -48, var5);
                            int var17 = var6.field10178 * var15 + var16;
                            int var18 = class707.field9933[var7 ? var3 + 1 : var3].method1728(var9 + 1, (byte) -105, var5);
                            int var19 = var6.field10178 * var15 + var18;
                            int var20 = var5 << class714.field10017;
                            int var21 = var8 << class714.field10017;
                            int var22 = (var9 << class714.field10017) + class327.field4047;
                            class141.field1767[class168.field2027++] = new class557(1, var3, var6.field10179 + var20, var20 - -var6.field10179, var20 + var6.field10179, var6.field10179 + var20, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; var23 <= var11; var23++) {
                                for (int var24 = var8; var24 <= var9; var24++) {
                                    class107.field1351[var23][var5][var24].field10178 = (short) (class107.field1351[var23][var5][var24].field10178 * -1);
                                }
                            }
                        }
                        if (var6.field10183 < 0) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class727 var29 = class107.field1351[var3][var5 - 1][var4];
                            int var30 = class707.field9933[var3].method1728(var4, (byte) -43, var5);
                            while (var25 > 0 && var29 != null && var29.field10183 < 0 && var6.field10183 == var29.field10183 && var6.field10180 == var29.field10180 && var30 == class707.field9933[var3].method1728(var4, (byte) -53, var25 - 1) && ((var25 - 1) <= 0 || var30 == class707.field9933[var3].method1728(var4, (byte) -57, var25 - 2))) {
                                var25--;
                                var29 = class107.field1351[var3][var25 - 1][var4];
                            }
                            for (class727 var31 = class107.field1351[var3][var5 + 1][var4]; class307.field3799 > var26 && var31 != null && var31.field10183 < 0 && var6.field10183 == var31.field10183 && var6.field10180 == var31.field10180 && var30 == class707.field9933[var3].method1728(var4, (byte) -40, var26 + 1) && (class307.field3799 <= var26 + 1 || class707.field9933[var3].method1728(var4, (byte) -69, var26 + 2) == var30); var31 = class107.field1351[var3][var26 + 1][var4]) {
                                var26++;
                            }
                            int var32 = var3 + 1 - var3;
                            int var33 = class707.field9933[var7 ? var3 + 1 : var3].method1728(var4, (byte) -85, var25);
                            int var34 = var6.field10183 * var32 + var33;
                            int var35 = class707.field9933[var7 ? var3 + 1 : var3].method1728(var4, (byte) -56, var26 + 1);
                            int var36 = var35 + (var6.field10183 * var32);
                            int var37 = var25 << class714.field10017;
                            int var38 = (var26 << class714.field10017) + class327.field4047;
                            int var39 = var4 << class714.field10017;
                            class141.field1767[class168.field2027++] = new class557(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var39 + var6.field10180, var6.field10180 + var39, var39 + var6.field10180, var6.field10180 + var39);
                            for (int var40 = var3; var40 <= var28; var40++) {
                                for (int var41 = var25; var41 <= var26; var41++) {
                                    class107.field1351[var40][var41][var4].field10183 = (short) (class107.field1351[var40][var41][var4].field10183 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        class267.field3161 = true;
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(I)I")
    public final int method1058(int arg0) {
        field1809++;
        if (arg0 != -28700) {
            return 117;
        }
        int var2 = 0;
        for (class208 var3 = this.field1810.field2467; var3 != this.field1810; var3 = var3.field2467) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "(I)V")
    public final void method1059(int arg0) {
        while (true) {
            class208 var2 = this.field1810.field2467;
            if (this.field1810 == var2) {
                field1817++;
                this.field1815 = null;
                if (arg0 >= -120) {
                    this.method1058(-15);
                    return;
                }
                return;
            }
            var2.method1315((byte) -114);
        }
    }

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "(B)Z")
    public static final boolean method1060(byte arg0) {
        if (arg0 != -124) {
            field1819 = null;
        }
        field1812++;
        return class558.field7751 != 0;
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "()V")
    public class144() {
        this.field1810.field2467 = this.field1810;
        this.field1810.field2468 = this.field1810;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Z)Lme;")
    public final class208 method1061(boolean arg0) {
        field1816++;
        class208 var2 = this.field1815;
        if (!arg0) {
            return null;
        } else if (this.field1810 == var2) {
            this.field1815 = null;
            return null;
        } else {
            this.field1815 = var2.field2467;
            return var2;
        }
    }
}
