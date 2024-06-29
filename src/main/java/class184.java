import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class184 {

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "[I")
    public static int[] field2588 = new int[4096];

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "()V")
    public static final void method1233() {
        if (class448.field6480 != null) {
            for (int var0 = 0; var0 < class448.field6480.length; var0++) {
                for (int var1 = 0; var1 < class302.field4492; var1++) {
                    for (int var2 = 0; var2 < class8.field82; var2++) {
                        if (class448.field6480[var0][var1][var2] != null) {
                            class448.field6480[var0][var1][var2].method453(-119);
                        }
                        class448.field6480[var0][var1][var2] = null;
                    }
                }
            }
        }
        class448.field6480 = null;
        class420.field6108 = null;
        if (class634.field8979 != null) {
            for (int var3 = 0; var3 < class634.field8979.length; var3++) {
                for (int var4 = 0; var4 < class302.field4492; var4++) {
                    for (int var5 = 0; var5 < class8.field82; var5++) {
                        if (class634.field8979[var3][var4][var5] != null) {
                            class634.field8979[var3][var4][var5].method453(-116);
                        }
                        class634.field8979[var3][var4][var5] = null;
                    }
                }
            }
        }
        class634.field8979 = null;
        class499.field7071 = null;
        class153.field2210 = null;
        class296.field4340 = null;
        class260.field3949 = null;
        class535.field7505 = null;
        class691.field9724 = null;
        class639.field9024 = null;
        class381.method2277((byte) 77);
        if (class518.field7307 != null) {
            for (int var6 = 0; var6 < class282.field4237; var6++) {
                class518.field7307[var6] = null;
            }
            class282.field4237 = 0;
        }
        if (class496.field7034 != null) {
            for (int var7 = 0; var7 < class313.field4626[0]; var7++) {
                class496.field7034[0][var7] = null;
            }
            for (int var8 = 0; var8 < class313.field4626[1]; var8++) {
                class496.field7034[1][var8] = null;
            }
            class313.field4626 = new int[2];
        }
        if (class232.field3618 != null) {
            for (int var9 = 0; var9 < class59.field1130[0]; var9++) {
                class232.field3618[0][var9] = null;
            }
            for (int var10 = 0; var10 < class59.field1130[1]; var10++) {
                class232.field3618[1][var10] = null;
            }
            class59.field1130 = new int[2];
        }
        if (class471.field6741 != null) {
            for (int var11 = 0; var11 < class127.field1896[0]; var11++) {
                class471.field6741[0][var11] = null;
            }
            for (int var12 = 0; var12 < class127.field1896[1]; var12++) {
                class471.field6741[1][var12] = null;
            }
            class127.field1896 = new int[2];
        }
        if (class286.field4268 != null) {
            for (int var13 = 0; var13 < class286.field4268.length; var13++) {
                class286.field4268[var13] = null;
            }
            class224.field3157 = 0;
        }
        if (class527.field7418 != null) {
            for (int var14 = 0; var14 < class527.field7418.length; var14++) {
                class527.field7418[var14] = null;
            }
            class460.field6580 = 0;
        }
        if (class580.field8172 != null) {
            for (int var15 = 0; var15 < class258.field3938; var15++) {
                class580.field8172[var15] = null;
            }
            for (int var16 = 0; var16 < class41.field685; var16++) {
                for (int var17 = 0; var17 < class302.field4492; var17++) {
                    for (int var18 = 0; var18 < class8.field82; var18++) {
                        class477.field6789[var16][var17][var18] = 0L;
                    }
                }
            }
            class258.field3938 = 0;
        }
        class95.method779((byte) -109);
        class380.field5378.method2409(97);
        class252.field3889 = null;
        class161.field2313 = null;
        class386.field5441 = null;
        if (class513.field7248 != null) {
            class228.method1524();
            class682.field9618.method113(1);
            class682.field9618.method135(0);
        }
        if (class295.field4329 != null) {
            class295.field4329 = null;
        }
        class682.field9618 = null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)V")
    public static final void method1234(byte arg0) {
        class577.method3271(true);
        field2587++;
        class182.method1230(-119, class287.field4270.field3716, 22050, 2);
        class574.field8072 = class50.method573(0, 0, class31.field486, 22050, class368.field5267);
        class574.field8072.method2014(61, class520.field7333);
        if (arg0 != 39) {
            method1235(-19);
        }
        class697.field9858 = class50.method573(0, 1, class31.field486, 2048, class368.field5267);
        class697.field9858.method2014(87, class627.field8780);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public static void method1235(int arg0) {
        if (arg0 != -30756) {
            method1233();
        }
        field2588 = null;
    }
}
