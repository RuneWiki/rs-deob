import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class233 extends class86 {

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "Ljava/lang/Object;")
    private Object field3739;

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
    public static int field3738 = 0;

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
    public static int field3736 = 0;

    @OriginalMember(owner = "client!wf", name = "Y", descriptor = "I")
    public static int field3743 = -1;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!wf", name = "W", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!wf", name = "X", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3734;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZLjava/lang/String;)Z", line = 6)
    public static final boolean method1686(boolean arg0, String arg1) {
        field3742++;
        if (!arg0) {
            field3743 = -55;
        }
        return class63.method428(10, arg1, true, 43);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIBII)I", line = 17)
    public static final int method1687(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3740++;
        if (arg2 == -27) {
            int var5 = 65536 - class170.field2810[arg4 * 1024 / arg1] >> 1;
            return ((65536 - var5) * arg3 >> 16) + (arg0 * var5 >> 16);
        } else {
            return -69;
        }
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)Z", line = 31)
    public final boolean method582(int arg0) {
        field3741++;
        if (arg0 <= 70) {
            this.method585((byte) 74);
        }
        return false;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[BII)Z", line = 44)
    public static final boolean method1688(int arg0, byte[] arg1, int arg2, int arg3) {
        field3735++;
        if (arg0 != -6782) {
            method1689(false);
        }
        boolean var4 = true;
        class44 var5 = new class44(arg1);
        int var6 = -1;
        label74: while (true) {
            int var7 = var5.method260(8);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var15;
                class97 var16;
                do {
                    int var13;
                    int var14;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method281(-126);
                                        if (var17 == 0) {
                                            continue label74;
                                        }
                                        var5.method286((byte) -90);
                                    }
                                    int var10 = var5.method281(-117);
                                    if (var10 == 0) {
                                        continue label74;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    int var12 = (var8 & 0xFD6) >> 6;
                                    var13 = arg3 + var12;
                                    var14 = arg2 + var11;
                                    var15 = var5.method286((byte) -105) >> 2;
                                } while (var13 <= 0);
                            } while (var14 <= 0);
                        } while (var13 >= 103);
                    } while (var14 >= 103);
                    var16 = class69.method454(false, var6);
                } while (var15 == 22 && !class297.field4695 && var16.field1321 == 0 && var16.field1333 != 1 && !var16.field1313);
                var9 = true;
                if (!var16.method662(-10430)) {
                    class89.field1230++;
                    var4 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(Z)V", line = 131)
    public static void method1689(boolean arg0) {
        if (arg0) {
            method1687(-26, -3, (byte) 79, 1, 59);
        }
        field3734 = null;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 152)
    public final Object method585(byte arg0) {
        field3732++;
        if (arg0 != 100) {
            field3738 = -125;
        }
        return this.field3739;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 161)
    public class233(Object arg0) {
        this.field3739 = arg0;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)V", line = 171)
    public static final void method1690(int arg0, byte arg1) {
        field3733++;
        class344.method2389(-13950);
        if (arg1 <= 37) {
            return;
        }
        class43.method218(114);
        int var2 = class208.method1512(-20076, arg0).field3626;
        if (var2 == 0) {
            return;
        }
        int var3 = class70.field991[arg0];
        if (var2 == 6) {
            class240.field3815 = var3;
        }
        if (var2 == 9) {
            class105.field1547 = var3;
        }
        if (var2 == 5) {
            class113.field1731 = var3;
        }
    }
}
