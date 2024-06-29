import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class256 extends class401 {

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "Ljava/lang/String;")
    public String field3496;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "F")
    public static float field3493;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "[I")
    public static int[] field3495;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
    public static void method1574(int arg0) {
        if (arg0 != 0) {
            field3493 = 0.16684711F;
        }
        field3495 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "()V")
    public static final void method1575() {
        if (class468.field6438 != null) {
            for (int var0 = 0; var0 < class468.field6438.length; var0++) {
                for (int var1 = 0; var1 < class335.field4511; var1++) {
                    for (int var2 = 0; var2 < class643.field8878; var2++) {
                        if (class468.field6438[var0][var1][var2] != null) {
                            class468.field6438[var0][var1][var2].method2290(12014);
                        }
                        class468.field6438[var0][var1][var2] = null;
                    }
                }
            }
        }
        class468.field6438 = null;
        class497.field6766 = null;
        if (class310.field4290 != null) {
            for (int var3 = 0; var3 < class310.field4290.length; var3++) {
                for (int var4 = 0; var4 < class335.field4511; var4++) {
                    for (int var5 = 0; var5 < class643.field8878; var5++) {
                        if (class310.field4290[var3][var4][var5] != null) {
                            class310.field4290[var3][var4][var5].method2290(12014);
                        }
                        class310.field4290[var3][var4][var5] = null;
                    }
                }
            }
        }
        class310.field4290 = null;
        class52.field606 = null;
        class295.field4051 = null;
        class409.field5812 = null;
        class147.field2093 = null;
        class133.field1903 = null;
        class598.field8354 = null;
        class497.field6756 = null;
        class466.method2632(32);
        if (class544.field7388 != null) {
            for (int var6 = 0; var6 < class590.field8286; var6++) {
                class544.field7388[var6] = null;
            }
            class590.field8286 = 0;
        }
        if (class383.field5425 != null) {
            for (int var7 = 0; var7 < class89.field1287[0]; var7++) {
                class383.field5425[0][var7] = null;
            }
            for (int var8 = 0; var8 < class89.field1287[1]; var8++) {
                class383.field5425[1][var8] = null;
            }
            class89.field1287 = new int[2];
        }
        if (class216.field3061 != null) {
            for (int var9 = 0; var9 < class582.field8197[0]; var9++) {
                class216.field3061[0][var9] = null;
            }
            for (int var10 = 0; var10 < class582.field8197[1]; var10++) {
                class216.field3061[1][var10] = null;
            }
            class582.field8197 = new int[2];
        }
        if (class420.field5921 != null) {
            for (int var11 = 0; var11 < class466.field6417[0]; var11++) {
                class420.field5921[0][var11] = null;
            }
            for (int var12 = 0; var12 < class466.field6417[1]; var12++) {
                class420.field5921[1][var12] = null;
            }
            class466.field6417 = new int[2];
        }
        if (class401.field5627 != null) {
            for (int var13 = 0; var13 < class401.field5627.length; var13++) {
                class401.field5627[var13] = null;
            }
            class333.field4494 = 0;
        }
        if (class635.field8784 != null) {
            for (int var14 = 0; var14 < class635.field8784.length; var14++) {
                class635.field8784[var14] = null;
            }
            class419.field5917 = 0;
        }
        if (class334.field4501 != null) {
            for (int var15 = 0; var15 < class53.field609; var15++) {
                class334.field4501[var15] = null;
            }
            for (int var16 = 0; var16 < class107.field1493; var16++) {
                for (int var17 = 0; var17 < class335.field4511; var17++) {
                    for (int var18 = 0; var18 < class643.field8878; var18++) {
                        class508.field6965[var16][var17][var18] = 0L;
                    }
                }
            }
            class53.field609 = 0;
        }
        class445.method2521((byte) -124);
        class300.field4089.method3905((byte) -105);
        class523.field7099 = null;
        class437.field6073 = null;
        class24.field305 = null;
        if (class494.field6736 != null) {
            class65.method558();
            class401.field5619.method191(1);
            class401.field5619.method173(0);
        }
        if (class672.field9424 != null) {
            class672.field9424 = null;
        }
        class401.field5619 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "([FII)[F")
    public static final float[] method1576(float[] arg0, int arg1, int arg2) {
        field3494++;
        float[] var3 = new float[arg1];
        class359.method2055(arg0, 0, var3, 0, arg1);
        if (arg2 != 18450) {
            method1576(null, 10, -18);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
    public class256() {
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class256(String arg0) {
        this.field3496 = arg0;
    }
}
