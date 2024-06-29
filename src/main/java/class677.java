import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public abstract class class677 extends class508 {

    @OriginalMember(owner = "client!sp", name = "v", descriptor = "I")
    public int field9505;

    @OriginalMember(owner = "client!sp", name = "t", descriptor = "[I")
    public static int[] field9503 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!sp", name = "u", descriptor = "[[I")
    public static int[][] field9504 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!sp", name = "w", descriptor = "I")
    public static int field9506;

    @OriginalMember(owner = "client!sp", name = "s", descriptor = "[Lf;")
    public static class536[] field9502;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(B)V")
    public static void method3795(byte arg0) {
        int var1 = 39 % ((arg0 + 30) / 37);
        field9502 = null;
        field9503 = null;
        field9504 = null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Z[[[BIB)V")
    public static final void method3796(boolean arg0, byte[][][] arg1, int arg2, byte arg3) {
        int var4 = arg0 ? 1 : 0;
        class518.field7075 = 0;
        class467.field5939 = 0;
        class546.field7270++;
        for (int var5 = 0; var5 < class593.field8335[var4]; var5++) {
            if (!class177.method1118(class102.field1375[var4][var5], arg0, arg1, arg2, arg3)) {
                class214.method1271(class102.field1375[var4][var5]);
                if (class102.field1375[var4][var5].field6455 != -1) {
                    class610.field8563[class518.field7075++] = class102.field1375[var4][var5];
                }
            }
        }
        for (int var6 = 0; var6 < class173.field2256[var4]; var6++) {
            if (!class177.method1118(class337.field4341[var4][var6], arg0, arg1, arg2, arg3)) {
                class214.method1271(class337.field4341[var4][var6]);
                if (class337.field4341[var4][var6].field6455 != -1) {
                    class341.field4394[class467.field5939++] = class337.field4341[var4][var6];
                }
            }
        }
        for (int var7 = 0; var7 < class469.field5960[var4]; var7++) {
            if (!class177.method1118(class252.field3090[var4][var7], arg0, arg1, arg2, arg3)) {
                if (class252.field3090[var4][var7].method83((byte) 23)) {
                    class214.method1271(class252.field3090[var4][var7]);
                    if (class252.field3090[var4][var7].field6455 != -1) {
                        class341.field4394[class467.field5939++] = class252.field3090[var4][var7];
                    }
                } else {
                    class214.method1271(class252.field3090[var4][var7]);
                    if (class252.field3090[var4][var7].field6455 != -1) {
                        class610.field8563[class518.field7075++] = class252.field3090[var4][var7];
                    }
                }
            }
        }
        if (!arg0) {
            for (int var8 = 0; var8 < class103.field1389; var8++) {
                if (!class177.method1118(class11.field191[var8], arg0, arg1, arg2, arg3)) {
                    class214.method1271(class11.field191[var8]);
                    if (class11.field191[var8].field6455 != -1) {
                        if (class11.field191[var8].method83((byte) 23)) {
                            class341.field4394[class467.field5939++] = class11.field191[var8];
                        } else {
                            class610.field8563[class518.field7075++] = class11.field191[var8];
                        }
                    }
                }
            }
        }
        if (class518.field7075 > 0) {
            class316.method1824(class610.field8563, 0, class518.field7075 - 1);
            for (int var9 = 0; var9 < class518.field7075; var9++) {
                class417.method2228(class610.field8563[var9], true);
            }
        }
        if (class167.field2199) {
            class590.field8291.method1024(0, null);
        }
        for (int var10 = class436.field5441; var10 < class391.field4927; var10++) {
            if (var10 < arg2 || arg1 == null) {
                int var21 = class354.field4511.length;
                if (class354.field4511.length + class575.field8022 > class429.field5383) {
                    var21 -= class354.field4511.length + class575.field8022 - class429.field5383;
                }
                int var22 = class354.field4511[0].length;
                if (class354.field4511[0].length + class468.field5953 > class37.field508) {
                    var22 -= class354.field4511[0].length + class468.field5953 - class37.field508;
                }
                boolean[][] var23 = class512.field6954;
                if (class608.field8535) {
                    if (class184.field2345) {
                        var23 = class396.field4999[var10];
                    }
                    for (int var24 = class126.field1571; var24 < var21; var24++) {
                        int var25 = class575.field8022 + var24 - class126.field1571;
                        for (int var26 = class360.field4589; var26 < var22; var26++) {
                            if (class354.field4511[var24][var26] && !class455.method2433(var10, var25, -1, class468.field5953 + var26 - class360.field4589)) {
                                var23[var24][var26] = true;
                            } else {
                                var23[var24][var26] = false;
                            }
                        }
                    }
                }
                if (class184.field2345) {
                    class491.field6485[var10].method1278(0, 0, 0, null, false);
                    for (int var27 = 0; var27 < class378.field4788; var27++) {
                        class523.field7115[var27].method3660((byte) -32, new class545(var10 + 1));
                    }
                } else if (class9.field164) {
                    class491.field6485[var10].method1277(class516.field7041, class204.field2599, class479.field6372, class512.field6954, true, class111.field1461);
                } else {
                    class491.field6485[var10].method1278(class516.field7041, class204.field2599, class479.field6372, class512.field6954, true);
                }
            } else {
                int var12 = class354.field4511.length;
                if (class354.field4511.length + class575.field8022 > class429.field5383) {
                    var12 -= class354.field4511.length + class575.field8022 - class429.field5383;
                }
                int var13 = class354.field4511[0].length;
                if (class354.field4511[0].length + class468.field5953 > class37.field508) {
                    var13 -= class354.field4511[0].length + class468.field5953 - class37.field508;
                }
                boolean[][] var14 = class512.field6954;
                if (class608.field8535) {
                    if (class184.field2345) {
                        var14 = class396.field4999[var10];
                    }
                    for (int var15 = class126.field1571; var15 < var12; var15++) {
                        int var16 = class575.field8022 + var15 - class126.field1571;
                        for (int var17 = class360.field4589; var17 < var13; var17++) {
                            var14[var15][var17] = false;
                            if (class354.field4511[var15][var17]) {
                                int var18 = class468.field5953 + var17 - class360.field4589;
                                for (int var19 = var10; var19 >= 0; var19--) {
                                    if (class270.field3423[var19][var16][var18] != null && class270.field3423[var19][var16][var18].field1028 == var10) {
                                        if ((var19 < arg2 || arg1[var19][var16][var18] != arg3) && !class455.method2433(var10, var16, -1, var18)) {
                                            var14[var15][var17] = true;
                                            break;
                                        }
                                        var14[var15][var17] = false;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (class184.field2345) {
                    class491.field6485[var10].method1278(0, 0, 0, null, false);
                    for (int var20 = 0; var20 < class378.field4788; var20++) {
                        class523.field7115[var20].method3660((byte) -32, new class545(var10 + 1));
                    }
                } else if (class9.field164) {
                    class491.field6485[var10].method1277(class516.field7041, class204.field2599, class479.field6372, class512.field6954, false, class111.field1461);
                } else {
                    class491.field6485[var10].method1278(class516.field7041, class204.field2599, class479.field6372, class512.field6954, false);
                }
            }
        }
        if (class467.field5939 > 0) {
            class228.method1365(class341.field4394, 0, class467.field5939 - 1);
            for (int var11 = 0; var11 < class467.field5939; var11++) {
                class417.method2228(class341.field4394[var11], true);
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)Z")
    public abstract boolean method369(int arg0);

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method368(int arg0);

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(I)V")
    public class677(int arg0) {
        this.field9505 = arg0;
    }
}
