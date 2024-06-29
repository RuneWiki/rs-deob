import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class275 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Lph;")
    private static class229 field4587 = class266.method1858("Please wait)3)3)3", 0);

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "Lph;")
    public static class229 field4591 = field4587;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "[I")
    public static int[] field4593 = new int[128];

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "Lph;")
    public static class229 field4589 = class189.method1319(160, false);

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Lph;")
    public static class229 field4595 = class266.method1858("(Y<)4col>", 0);

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "[Lbb;")
    public static class197[] field4597 = new class197[50];

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "[F")
    public static float[] field4596 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)I", line = 19)
    public static final int method1902(byte arg0) {
        field4594++;
        int var1 = 84 % ((arg0 + 58) / 38);
        return 16;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V", line = 32)
    public static void method1903(boolean arg0) {
        field4595 = null;
        field4597 = null;
        field4587 = null;
        field4593 = null;
        field4591 = null;
        if (arg0) {
            field4587 = (class229) null;
        }
        field4589 = null;
        field4596 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII)Z", line = 53)
    public static final boolean method1904(int arg0, int arg1, int arg2, int arg3) {
        if (!class262.method1824(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class192.field3174[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class244.field4035) {
                    if (!class61.method418(var4, var6, var5)) {
                        return false;
                    }
                    if (!class61.method418(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class61.method418(var4, var7, var5)) {
                        return false;
                    }
                    if (!class61.method418(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class61.method418(var4, var8, var5)) {
                    return false;
                }
                if (!class61.method418(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class255.field4266) {
                    if (!class61.method418(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class61.method418(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class61.method418(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class61.method418(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class61.method418(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class61.method418(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class244.field4035) {
                    if (!class61.method418(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class61.method418(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class61.method418(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class61.method418(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class61.method418(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class61.method418(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class255.field4266) {
                    if (!class61.method418(var4, var6, var5)) {
                        return false;
                    }
                    if (!class61.method418(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class61.method418(var4, var7, var5)) {
                        return false;
                    }
                    if (!class61.method418(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class61.method418(var4, var8, var5)) {
                    return false;
                }
                if (!class61.method418(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class61.method418(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class61.method418(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class61.method418(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class61.method418(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class61.method418(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)I", line = 260)
    public static final int method1905(int arg0) {
        field4592++;
        if ((double) class263.field4394 == 3.0D) {
            return 37;
        } else if ((double) class263.field4394 == 4.0D) {
            return 50;
        } else {
            if (arg0 != 50) {
                field4587 = (class229) null;
            }
            return (double) class263.field4394 == 6.0D ? 75 : 100;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)V", line = 283)
    public static final void method1906(int arg0, byte arg1) {
        class39.field614.method1418((byte) -17, arg0);
        int var2 = 38 / ((arg1 + 81) / 45);
        field4590++;
    }
}
