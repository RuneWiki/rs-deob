import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class302 implements class252 {

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "Lod;")
    private class223 field4643 = new class223(256);

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Lug;")
    private class253 field4634;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "Lug;")
    private class253 field4645;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "[Lml;")
    private class172[] field4636;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field4639 = 0;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4646 = "Starting 3d Library";

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZIFIIB)[I", line = 4)
    public final int[] method1807(boolean arg0, int arg1, float arg2, int arg3, int arg4, byte arg5) {
        field4640++;
        if (arg5 != 40) {
            this.field4636 = (class172[]) null;
        }
        return this.method455(arg1, (byte) -55).method1447(this.field4645, this.field4636[arg1].field2846, this, arg0, (double) arg2, 1, arg3, arg4);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lug;BII)Lun;", line = 18)
    public static final class190 method2088(class253 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 >= -82) {
            field4637 = 121;
        }
        field4644++;
        return class287.method2029(arg0, arg2, 2, arg3) ? class32.method299(-65) : null;
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(IB)V", line = 33)
    public static final void method2089(int arg0, byte arg1) {
        field4633++;
        class56.field779 = 3;
        class1.field4 = 20;
        if (arg1 > 18) {
            class105.field1392 = arg0;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V", line = 47)
    public static void method2090(int arg0) {
        if (arg0 != 12909) {
            field4637 = 22;
        }
        field4646 = null;
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(IB)Laf;", line = 63)
    public class195 method455(int arg0, byte arg1) {
        class279 var3 = this.field4643.method1628(true, (long) arg0);
        field4641++;
        if (var3 != null) {
            return (class195) var3;
        }
        if (arg1 != -55) {
            this.field4645 = (class253) null;
        }
        byte[] var4 = this.field4634.method1834(-128, arg0);
        if (var4 == null) {
            return null;
        } else {
            class195 var5 = new class195(new class6(var4));
            this.field4643.method1627((byte) 97, var5, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)Lml;", line = 89)
    public final class172 method1806(int arg0, int arg1) {
        if (arg0 != 18160) {
            this.field4636 = (class172[]) null;
        }
        field4635++;
        return this.field4636[arg1];
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IB)Z", line = 100)
    public final boolean method1805(int arg0, byte arg1) {
        field4638++;
        class195 var3 = this.method455(arg0, (byte) -55);
        if (arg1 != 12) {
            method2091(-81, 105);
        }
        return var3 != null && var3.method1451(-111, this, this.field4645);
    }

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "(II)V", line = 122)
    public static final void method2091(int arg0, int arg1) {
        field4642++;
        class34 var2 = class91.method656(arg1, -2, 8);
        int var3 = -75 % ((60 - arg0) / 62);
        var2.method306(13);
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lug;Lug;Lug;)V", line = 139)
    public class302(class253 arg0, class253 arg1, class253 arg2) {
        this.field4634 = arg1;
        this.field4645 = arg2;
        class6 var4 = new class6(arg0.method1813(0, 0, true));
        int var5 = var4.method39((byte) 118);
        this.field4636 = new class172[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method58(-288140008) == 1) {
                this.field4636[var6] = new class172();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field4636[var7] != null) {
                this.field4636[var7].field2842 = var4.method58(-288140008) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field4636[var8] != null) {
                this.field4636[var8].field2835 = var4.method58(-288140008) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field4636[var9] != null) {
                this.field4636[var9].field2831 = var4.method58(-288140008) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field4636[var10] != null) {
                this.field4636[var10].field2847 = var4.method58(-288140008) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field4636[var11] != null) {
                this.field4636[var11].field2845 = var4.method83((byte) -119);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field4636[var12] != null) {
                this.field4636[var12].field2844 = var4.method83((byte) -74);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field4636[var13] != null) {
                this.field4636[var13].field2827 = var4.method83((byte) -78);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field4636[var14] != null) {
                this.field4636[var14].field2840 = var4.method83((byte) -105);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field4636[var15] != null) {
                this.field4636[var15].field2836 = (short) var4.method39((byte) 56);
            }
        }
        if (var4.field115.length > var4.field111) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field4636[var16] != null) {
                    var4.method83((byte) -90);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field4636[var17] != null) {
                    var4.method83((byte) -125);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field4636[var18] != null) {
                    var4.method58(-288140008);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field4636[var19] != null) {
                    this.field4636[var19].field2846 = var4.method58(-288140008) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field4636[var20] != null) {
                    var4.method83((byte) -81);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field4636[var21] != null) {
                    var4.method58(-288140008);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field4636[var22] != null) {
                    var4.method58(-288140008);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field4636[var23] != null) {
                    var4.method58(-288140008);
                }
            }
        }
    }
}
