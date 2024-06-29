import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class434 implements class284 {

    @OriginalMember(owner = "client!av", name = "b", descriptor = "Leg;")
    private class336 field5688 = new class336(256);

    @OriginalMember(owner = "client!av", name = "o", descriptor = "Lwm;")
    private class30 field5701;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "Lwm;")
    private class30 field5687;

    @OriginalMember(owner = "client!av", name = "f", descriptor = "I")
    private int field5692;

    @OriginalMember(owner = "client!av", name = "n", descriptor = "[Lgk;")
    private class191[] field5700;

    @OriginalMember(owner = "client!av", name = "e", descriptor = "I")
    public static int field5691 = 0;

    @OriginalMember(owner = "client!av", name = "k", descriptor = "I")
    public static int field5697 = 0;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!av", name = "g", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!av", name = "h", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!av", name = "i", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!av", name = "j", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!av", name = "l", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!av", name = "m", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!av", name = "p", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(FIIIZI)[F")
    public final float[] method1735(float arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg5 < 2) {
            this.method1734(-116, false, -58, -64, 109, -1.7088503F);
        }
        field5693++;
        return this.method2492(-107, arg1).method3631(-60, this, arg3, arg2, this.field5700[arg1].field2676, this.field5687);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(BI)Lgk;")
    public final class191 method1732(byte arg0, int arg1) {
        int var3 = 117 % ((arg0 - 74) / 42);
        field5695++;
        return this.field5700[arg1];
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IZIIIF)[I")
    public final int[] method1734(int arg0, boolean arg1, int arg2, int arg3, int arg4, float arg5) {
        if (arg0 == -25886) {
            field5689++;
            return this.method2492(-125, arg4).method3632(1, this, this.field5687, arg3, arg2, this.field5700[arg4].field2676, (double) arg5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(II)Lhf;")
    private final class674 method2492(int arg0, int arg1) {
        if (arg0 > -95) {
            this.field5692 = 54;
        }
        field5694++;
        class173 var3 = this.field5688.method1941((long) arg1, (byte) 98);
        if (var3 != null) {
            return (class674) var3;
        }
        byte[] var4 = this.field5701.method148((byte) 37, arg1);
        if (var4 == null) {
            return null;
        } else {
            class674 var5 = new class674(new class234(var4));
            this.field5688.method1936(var5, (long) arg1, -104);
            return var5;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(II)Z")
    public final boolean method1733(int arg0, int arg1) {
        if (arg0 != -1852) {
            this.method1736(true);
        }
        field5690++;
        class674 var3 = this.method2492(-101, arg1);
        return var3 != null && var3.method3633(this, this.field5687, (byte) 48);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IIFZIB)[I")
    public final int[] method1737(int arg0, int arg1, float arg2, boolean arg3, int arg4, byte arg5) {
        if (arg5 != 45) {
            this.field5692 = -5;
        }
        field5702++;
        return this.method2492(-109, arg0).method3634(arg4, arg1, this, this.field5700[arg0].field2676, this.field5687, arg3, false, (double) arg2);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ILuaa;II)V")
    public static final void method2493(int arg0, class391 arg1, int arg2, int arg3) {
        field5699++;
        if (arg1 == null) {
            return;
        }
        if (arg1.field5157 != null) {
            class244 var4 = new class244();
            var4.field3349 = arg1.field5157;
            var4.field3350 = arg1;
            class760.method4148(var4);
        }
        class170.field2260 = arg1.field5151;
        class4.field55 = arg2;
        class358.field4377 = arg1.field5128;
        class559.field7106 = arg1.field5156;
        class610.field7710 = arg3;
        class20.field185 = arg1.field5143;
        class777.field10600 = arg1.field5039;
        class47.field549 = true;
        class776.method4255(arg1, -1007);
        if (arg0 >= -10) {
            method2493(7, null, -77, 27);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Z)I")
    public final int method1736(boolean arg0) {
        field5698++;
        if (arg0) {
            field5697 = 119;
        }
        return this.field5692;
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lwm;Lwm;Lwm;)V")
    public class434(class30 arg0, class30 arg1, class30 arg2) {
        this.field5701 = arg1;
        this.field5687 = arg2;
        class234 var4 = new class234(arg0.method139(0, (byte) -94, 0));
        this.field5692 = var4.method1553((byte) 126);
        this.field5700 = new class191[this.field5692];
        for (int var5 = 0; var5 < this.field5692; var5++) {
            if (var4.method1509(true) == 1) {
                this.field5700[var5] = new class191();
            }
        }
        for (int var6 = 0; var6 < this.field5692; var6++) {
            if (this.field5700[var6] != null) {
                this.field5700[var6].field2679 = var4.method1509(true) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field5692; var7++) {
            if (this.field5700[var7] != null) {
                this.field5700[var7].field2673 = var4.method1509(true) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field5692; var8++) {
            if (this.field5700[var8] != null) {
                this.field5700[var8].field2670 = var4.method1509(true) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field5692; var9++) {
            if (this.field5700[var9] != null) {
                this.field5700[var9].field2661 = var4.method1554(27806);
            }
        }
        for (int var10 = 0; var10 < this.field5692; var10++) {
            if (this.field5700[var10] != null) {
                this.field5700[var10].field2672 = var4.method1554(27806);
            }
        }
        for (int var11 = 0; var11 < this.field5692; var11++) {
            if (this.field5700[var11] != null) {
                this.field5700[var11].field2678 = var4.method1554(27806);
            }
        }
        for (int var12 = 0; var12 < this.field5692; var12++) {
            if (this.field5700[var12] != null) {
                this.field5700[var12].field2680 = var4.method1554(27806);
            }
        }
        for (int var13 = 0; var13 < this.field5692; var13++) {
            if (this.field5700[var13] != null) {
                this.field5700[var13].field2681 = (short) var4.method1553((byte) 57);
            }
        }
        for (int var14 = 0; var14 < this.field5692; var14++) {
            if (this.field5700[var14] != null) {
                this.field5700[var14].field2662 = var4.method1554(27806);
            }
        }
        for (int var15 = 0; var15 < this.field5692; var15++) {
            if (this.field5700[var15] != null) {
                this.field5700[var15].field2665 = var4.method1554(27806);
            }
        }
        for (int var16 = 0; var16 < this.field5692; var16++) {
            if (this.field5700[var16] != null) {
                this.field5700[var16].field2674 = var4.method1509(true) == 1;
            }
        }
        for (int var17 = 0; var17 < this.field5692; var17++) {
            if (this.field5700[var17] != null) {
                this.field5700[var17].field2676 = var4.method1509(true) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field5692; var18++) {
            if (this.field5700[var18] != null) {
                this.field5700[var18].field2671 = var4.method1554(27806);
            }
        }
        for (int var19 = 0; var19 < this.field5692; var19++) {
            if (this.field5700[var19] != null) {
                this.field5700[var19].field2660 = var4.method1509(true) == 1;
            }
        }
        for (int var20 = 0; var20 < this.field5692; var20++) {
            if (this.field5700[var20] != null) {
                this.field5700[var20].field2663 = var4.method1509(true) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field5692; var21++) {
            if (this.field5700[var21] != null) {
                this.field5700[var21].field2668 = var4.method1509(true) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field5692; var22++) {
            if (this.field5700[var22] != null) {
                this.field5700[var22].field2677 = var4.method1509(true);
            }
        }
        for (int var23 = 0; var23 < this.field5692; var23++) {
            if (this.field5700[var23] != null) {
                this.field5700[var23].field2664 = var4.method1497((byte) 101);
            }
        }
        for (int var24 = 0; var24 < this.field5692; var24++) {
            if (this.field5700[var24] != null) {
                this.field5700[var24].field2682 = var4.method1509(true);
            }
        }
    }
}
