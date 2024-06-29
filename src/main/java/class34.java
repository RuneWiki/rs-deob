import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class34 {

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    private int field534 = 0;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    private int field537 = -1;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "Lgb;")
    private class149 field536 = new class149();

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "Z")
    public boolean field550 = false;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
    private int field547;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "[Lbc;")
    private class178[] field538;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    private int field540;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "[[[I")
    private int[][][] field549;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "Lgb;")
    public static class149 field533 = new class149();

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "Z")
    public static boolean field548 = false;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "Ljava/lang/String;")
    public static String field546 = "Checking for updates - ";

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public static int field544 = -1;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public static void method265(int arg0) {
        field546 = null;
        if (arg0 == 1) {
            field533 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)[[[I")
    public final int[][][] method266(int arg0) {
        field542++;
        if (this.field547 != this.field540) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field540; var2++) {
            this.field538[var2] = class33.field528;
        }
        return this.field549;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIII)V")
    public static final void method267(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field551++;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        if (arg3 != 1) {
            method267(62, 25, -61, 24, 113);
        }
        int var8 = -1;
        int var9 = class68.method533(class75.field1265, class261.field4025, arg1 + arg0, (byte) 92);
        int var10 = class68.method533(class75.field1265, class261.field4025, arg1 - arg0, (byte) 62);
        class263.method1788(var10, -18732, arg2, class156.field2379[arg4], var9);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg4 + var6;
                int var12 = arg4 - var6;
                if (class271.field4289 <= var11 && class113.field1779 >= var12) {
                    int var13 = class68.method533(class75.field1265, class261.field4025, arg1 + var5, (byte) 50);
                    int var14 = class68.method533(class75.field1265, class261.field4025, arg1 - var5, (byte) 113);
                    if (var11 <= class113.field1779) {
                        class263.method1788(var14, -18732, arg2, class156.field2379[var11], var13);
                    }
                    if (var12 >= class271.field4289) {
                        class263.method1788(var14, -18732, arg2, class156.field2379[var12], var13);
                    }
                }
            }
            var5++;
            int var15 = arg4 - var5;
            int var16 = arg4 + var5;
            if (var16 >= class271.field4289 && var15 <= class113.field1779) {
                int var17 = class68.method533(class75.field1265, class261.field4025, arg1 + var6, (byte) 123);
                int var18 = class68.method533(class75.field1265, class261.field4025, arg1 - var6, (byte) 122);
                if (var16 <= class113.field1779) {
                    class263.method1788(var18, -18732, arg2, class156.field2379[var16], var17);
                }
                if (var15 >= class271.field4289) {
                    class263.method1788(var18, -18732, arg2, class156.field2379[var15], var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)V")
    public static final void method268(int arg0) {
        class179.field2675.method1783(arg0 ^ arg0);
        field543++;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method269(boolean arg0, int arg1) {
        field535++;
        if (arg0) {
            return null;
        } else if (this.field547 == this.field540) {
            this.field550 = this.field538[arg1] == null;
            this.field538[arg1] = class33.field528;
            return this.field549[arg1];
        } else if (this.field540 == 1) {
            this.field550 = this.field537 != arg1;
            this.field537 = arg1;
            return this.field549[0];
        } else {
            class178 var3 = this.field538[arg1];
            if (var3 == null) {
                this.field550 = true;
                if (this.field534 < this.field540) {
                    var3 = new class178(arg1, this.field534);
                    this.field534++;
                } else {
                    class178 var4 = (class178) this.field536.method1012(-1);
                    var3 = new class178(arg1, var4.field2663);
                    this.field538[var4.field2667] = null;
                    var4.method693(-60);
                }
                this.field538[arg1] = var3;
            } else {
                this.field550 = false;
            }
            this.field536.method1007((byte) 89, var3);
            return this.field549[var3.field2663];
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IB)Z")
    public static final boolean method270(int arg0, byte arg1) {
        field541++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class80.field1341[arg0];
        if (arg1 < 121) {
            method267(-71, -76, 124, 86, -57);
        }
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1001;
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)V")
    public final void method271(int arg0) {
        for (int var2 = 0; var2 < this.field540; var2++) {
            this.field549[var2][0] = null;
            this.field549[var2][1] = null;
            this.field549[var2][2] = null;
            this.field549[var2] = null;
        }
        if (arg0 != 1) {
            field548 = false;
        }
        field539++;
        this.field549 = null;
        this.field538 = null;
        this.field536.method1016(false);
        this.field536 = null;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(III)V")
    public class34(int arg0, int arg1, int arg2) {
        this.field547 = arg1;
        this.field538 = new class178[this.field547];
        this.field540 = arg0;
        this.field549 = new int[this.field540][3][arg2];
    }
}
