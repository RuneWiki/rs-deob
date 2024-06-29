import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class258 {

    @OriginalMember(owner = "client!fga", name = "h", descriptor = "Lfc;")
    private class262 field3386 = new class262(64);

    @OriginalMember(owner = "client!fga", name = "g", descriptor = "Lni;")
    private class522 field3385;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "Lni;")
    public class522 field3379;

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "Liia;")
    public static class89 field3381 = new class89();

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!fga", name = "d", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!fga", name = "e", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!fga", name = "f", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!fga", name = "i", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!fga", name = "j", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(B)I")
    public static final int method1549(byte arg0) {
        field3384++;
        if (arg0 > -59) {
            return -112;
        }
        if (class72.field774 == null) {
            if (!class83.field1156 && class736.field10279 != null) {
                return class736.field10279.field2944;
            }
            int var1 = class427.field6034.method528(116);
            int var2 = class427.field6034.method521((byte) 58);
            if (class148.field1903) {
                if (class729.field10174 < var1 && class729.field10174 + class33.field341 > var1) {
                    int var10 = -1;
                    for (int var11 = 0; var11 < class331.field4464; var11++) {
                        if (class527.field7072) {
                            int var16 = class475.field6566 + (var11 * 16) + 33;
                            if (var16 - 13 < var2 && (var16 + 3) >= var2) {
                                var10 = var11;
                            }
                        } else {
                            int var15 = (var11 * 16) + class475.field6566 + 31;
                            if ((var15 - 13) < var2 && var15 + 3 >= var2) {
                                var10 = var11;
                            }
                        }
                    }
                    if (var10 != -1) {
                        int var12 = 0;
                        class195 var13 = new class195(class526.field7066);
                        for (class756 var14 = (class756) var13.method1083(true); var14 != null; var14 = (class756) var13.method1084(0)) {
                            if (var12++ == var10) {
                                return ((class227) var14.field10553.field5735.field5555).field2944;
                            }
                        }
                    }
                } else if (class659.field9197 != null && var1 > class596.field8309 && (class596.field8309 + class438.field6139) > var1) {
                    int var17 = -1;
                    for (int var18 = 0; var18 < class659.field9197.field10556; var18++) {
                        if (class527.field7072) {
                            int var23 = class746.field10362 + (var18 * 16) + 33;
                            if (var23 - 13 < var2 && var23 + 3 >= var2) {
                                var17 = var18;
                            }
                        } else {
                            int var22 = var18 * 16 + class746.field10362 + 31;
                            if (var22 - 13 < var2 && var22 + 3 >= var2) {
                                var17 = var18;
                            }
                        }
                    }
                    if (var17 != -1) {
                        int var19 = 0;
                        class195 var20 = new class195(class659.field9197.field10553);
                        for (class227 var21 = (class227) var20.method1083(true); var21 != null; var21 = (class227) var20.method1084(0)) {
                            if (var17 == (var19++)) {
                                return var21.field2944;
                            }
                        }
                    }
                }
            } else if (class729.field10174 < var1 && var1 < (class729.field10174 + class33.field341)) {
                int var3 = -1;
                for (int var4 = 0; var4 < class43.field470; var4++) {
                    if (class527.field7072) {
                        int var9 = (class43.field470 - var4 - 1) * 16 + class475.field6566 + 33;
                        if (var2 > (var9 - 13) && var2 <= (var9 + 3)) {
                            var3 = var4;
                        }
                    } else {
                        int var8 = (class43.field470 - var4 - 1) * 16 + class475.field6566 + 31;
                        if ((var8 - 13) < var2 && (var8 + 3) >= var2) {
                            var3 = var4;
                        }
                    }
                }
                if (var3 != -1) {
                    int var5 = 0;
                    class192 var6 = new class192(class139.field1783);
                    for (class227 var7 = (class227) var6.method1073((byte) -121); var7 != null; var7 = (class227) var6.method1072(1000)) {
                        if (var5++ == var3) {
                            return var7.field2944;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)V")
    public static final void method1550(int arg0) {
        class223.field2880 = arg0;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(II)Lke;")
    public final class599 method1551(int arg0, int arg1) {
        field3387++;
        class262 var3 = this.field3386;
        class599 var4;
        synchronized (this.field3386) {
            var4 = (class599) this.field3386.method1571(arg1 - 123, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field3385;
        byte[] var6;
        synchronized (this.field3385) {
            var6 = this.field3385.method2885(arg0, arg1, false);
        }
        class599 var7 = new class599();
        var7.field8340 = this;
        if (var6 != null) {
            var7.method3318(false, new class611(var6));
        }
        class262 var8 = this.field3386;
        synchronized (this.field3386) {
            this.field3386.method1574((long) arg0, var7, (byte) -80);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(BI)V")
    public final void method1552(byte arg0, int arg1) {
        int var3 = -119 % ((arg0 + 21) / 33);
        class262 var4 = this.field3386;
        synchronized (this.field3386) {
            this.field3386.method1569((byte) 62, arg1);
        }
        field3380++;
    }

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "(I)V")
    public final void method1553(int arg0) {
        class262 var2 = this.field3386;
        synchronized (this.field3386) {
            this.field3386.method1575((byte) -107);
        }
        if (arg0 >= -92) {
            this.method1552((byte) -66, 21);
        }
        field3383++;
    }

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "(I)V")
    public final void method1554(int arg0) {
        class262 var2 = this.field3386;
        synchronized (this.field3386) {
            this.field3386.method1563(5);
            if (arg0 <= 107) {
                this.field3386 = null;
            }
        }
        field3388++;
    }

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "(B)V")
    public static void method1555(byte arg0) {
        if (arg0 <= 57) {
            field3381 = null;
        }
        field3381 = null;
    }

    @OriginalMember(owner = "client!fga", name = "d", descriptor = "(I)Ljga;")
    public static final class716 method1556(int arg0) {
        field3382++;
        return arg0 >= -36 ? null : class68.field755;
    }

    @OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Lrga;ILni;Lni;)V")
    public class258(class242 arg0, int arg1, class522 arg2, class522 arg3) {
        this.field3385 = arg2;
        this.field3379 = arg3;
        this.field3385.method2901(0, 3);
    }
}
