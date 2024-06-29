import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class510 extends class677 {

    @OriginalMember(owner = "client!li", name = "y", descriptor = "Ljava/lang/Object;")
    private Object field6933;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "[I")
    public static int[] field6939 = new int[32];

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "I")
    public static int field6938;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "(I)Ljava/lang/Object;")
    public final Object method368(int arg0) {
        if (arg0 == -1) {
            field6937++;
            return this.field6933;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)Lwl;")
    public static final class679 method2753(int arg0, byte arg1) {
        field6935++;
        class679[] var2 = class498.method2680(20565);
        if (arg1 != -98) {
            method2756(-9, -49);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class679 var4 = var2[var3];
            if (var4.field9548 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(B)V")
    public static void method2754(byte arg0) {
        field6939 = null;
        if (arg0 != 124) {
            method2754((byte) -60);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIBI)I")
    public static final int method2755(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var7 = arg2 & 0x3;
        if ((arg3 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg6;
            arg6 = var8;
        }
        field6936++;
        if (var7 == 0) {
            return arg1;
        } else if (var7 == 1) {
            return 7 + 1 - arg0 - arg4;
        } else {
            if (arg5 != -102) {
                field6934 = 94;
            }
            return var7 == 2 ? 7 - arg1 - (arg6 - 1) : arg0;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)Z")
    public final boolean method369(int arg0) {
        if (arg0 >= -50) {
            return true;
        } else {
            field6938++;
            return false;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)V")
    public static final void method2756(int arg0, int arg1) {
        field6932++;
        if (~arg0 != arg1 && class236.field2954[arg0]) {
            class351.field4485.method3348(16, arg0);
            class103.field1390[arg0] = null;
            class688.field9760[arg0] = null;
            class236.field2954[arg0] = false;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "()V")
    public static final void method2757() {
        if (class582.field8139 != null) {
            for (int var0 = 0; var0 < class582.field8139.length; var0++) {
                for (int var1 = 0; var1 < class429.field5383; var1++) {
                    for (int var2 = 0; var2 < class37.field508; var2++) {
                        if (class582.field8139[var0][var1][var2] != null) {
                            class582.field8139[var0][var1][var2].method445(false);
                        }
                        class582.field8139[var0][var1][var2] = null;
                    }
                }
            }
        }
        class582.field8139 = null;
        class256.field3127 = null;
        if (class173.field2260 != null) {
            for (int var3 = 0; var3 < class173.field2260.length; var3++) {
                for (int var4 = 0; var4 < class429.field5383; var4++) {
                    for (int var5 = 0; var5 < class37.field508; var5++) {
                        if (class173.field2260[var3][var4][var5] != null) {
                            class173.field2260[var3][var4][var5].method445(false);
                        }
                        class173.field2260[var3][var4][var5] = null;
                    }
                }
            }
        }
        class173.field2260 = null;
        class699.field9887 = null;
        class270.field3423 = null;
        class491.field6485 = null;
        class354.field4511 = null;
        class512.field6954 = null;
        class396.field4999 = null;
        class560.field7787 = null;
        class338.method1903((byte) 71);
        if (class11.field191 != null) {
            for (int var6 = 0; var6 < class103.field1389; var6++) {
                class11.field191[var6] = null;
            }
            class103.field1389 = 0;
        }
        if (class102.field1375 != null) {
            for (int var7 = 0; var7 < class593.field8335[0]; var7++) {
                class102.field1375[0][var7] = null;
            }
            for (int var8 = 0; var8 < class593.field8335[1]; var8++) {
                class102.field1375[1][var8] = null;
            }
            class593.field8335 = new int[2];
        }
        if (class337.field4341 != null) {
            for (int var9 = 0; var9 < class173.field2256[0]; var9++) {
                class337.field4341[0][var9] = null;
            }
            for (int var10 = 0; var10 < class173.field2256[1]; var10++) {
                class337.field4341[1][var10] = null;
            }
            class173.field2256 = new int[2];
        }
        if (class252.field3090 != null) {
            for (int var11 = 0; var11 < class469.field5960[0]; var11++) {
                class252.field3090[0][var11] = null;
            }
            for (int var12 = 0; var12 < class469.field5960[1]; var12++) {
                class252.field3090[1][var12] = null;
            }
            class469.field5960 = new int[2];
        }
        if (class610.field8563 != null) {
            for (int var13 = 0; var13 < class610.field8563.length; var13++) {
                class610.field8563[var13] = null;
            }
            class518.field7075 = 0;
        }
        if (class341.field4394 != null) {
            for (int var14 = 0; var14 < class341.field4394.length; var14++) {
                class341.field4394[var14] = null;
            }
            class467.field5939 = 0;
        }
        if (class352.field4498 != null) {
            for (int var15 = 0; var15 < class574.field8008; var15++) {
                class352.field4498[var15] = null;
            }
            for (int var16 = 0; var16 < class391.field4927; var16++) {
                for (int var17 = 0; var17 < class429.field5383; var17++) {
                    for (int var18 = 0; var18 < class37.field508; var18++) {
                        class704.field9932[var16][var17][var18] = 0L;
                    }
                }
            }
            class574.field8008 = 0;
        }
        class145.method840((byte) -103);
        class632.field8878.method799(128);
        class319.field4080 = null;
        class540.field7230 = null;
        class180.field2320 = null;
        if (class455.field5825 != null) {
            class632.method3537();
            class590.field8291.method1063(1);
            class590.field8291.method1040(0);
        }
        if (class523.field7115 != null) {
            class523.field7115 = null;
        }
        class590.field8291 = null;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class510(Object arg0, int arg1) {
        super(arg1);
        this.field6933 = arg0;
    }
}
