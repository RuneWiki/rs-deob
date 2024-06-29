import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class341 {

    @OriginalMember(owner = "client!us", name = "n", descriptor = "F")
    public float field4853 = 1.0F;

    @OriginalMember(owner = "client!us", name = "s", descriptor = "F")
    public float field4858 = 0.25F;

    @OriginalMember(owner = "client!us", name = "f", descriptor = "F")
    public float field4845 = 1.0F;

    @OriginalMember(owner = "client!us", name = "l", descriptor = "I")
    public int field4851;

    @OriginalMember(owner = "client!us", name = "k", descriptor = "I")
    public int field4850;

    @OriginalMember(owner = "client!us", name = "c", descriptor = "F")
    public float field4842;

    @OriginalMember(owner = "client!us", name = "g", descriptor = "I")
    public int field4846;

    @OriginalMember(owner = "client!us", name = "i", descriptor = "Lvr;")
    public class458 field4848;

    @OriginalMember(owner = "client!us", name = "h", descriptor = "F")
    public float field4847;

    @OriginalMember(owner = "client!us", name = "p", descriptor = "F")
    public float field4855;

    @OriginalMember(owner = "client!us", name = "t", descriptor = "I")
    public int field4859;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "I")
    public int field4840;

    @OriginalMember(owner = "client!us", name = "m", descriptor = "I")
    public int field4852;

    @OriginalMember(owner = "client!us", name = "e", descriptor = "[I")
    public static int[] field4844 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!us", name = "o", descriptor = "I")
    public static int field4854 = -1;

    @OriginalMember(owner = "client!us", name = "r", descriptor = "Luf;")
    public static class519 field4857 = null;

    @OriginalMember(owner = "client!us", name = "v", descriptor = "[I")
    public static int[] field4861 = new int[32];

    @OriginalMember(owner = "client!us", name = "b", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!us", name = "d", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!us", name = "j", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!us", name = "q", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!us", name = "u", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)I")
    public static final int method2095(int arg0) {
        field4856++;
        boolean var1 = false;
        boolean var2 = false;
        if (arg0 > -61) {
            method2097(false, 93, 105, -78, 80);
        }
        boolean var3 = false;
        if (class336.field4775.field1585 && !class336.field4775.field1588) {
            var1 = true;
            if (class63.field964.field10844 < 512 && class63.field964.field10844 != 0) {
                var1 = false;
            }
            if (class111.field1584.startsWith("win")) {
                var3 = true;
                var2 = true;
            } else {
                var2 = true;
            }
        }
        if (class745.field10363) {
            var2 = false;
        }
        if (class69.field1123) {
            var1 = false;
        }
        if (class459.field6271) {
            var3 = false;
        }
        if (!var1 && !var2 && !var3) {
            return class339.method2073(-45);
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = -1;
        if (var1) {
            try {
                var4 = class742.method4090(1000, (byte) -123, 2);
            } catch (Exception var15) {
            }
        }
        if (var3) {
            try {
                var6 = class742.method4090(1000, (byte) -117, 3);
                if (class420.field5820.field9482.method2338(17539) == 3) {
                    class165 var7 = class686.field9702.method108();
                    long var8 = var7.field2521 & 0xFFFFFFFFFFFFL;
                    int var10 = var7.field2520;
                    if (var10 == 4318) {
                        var2 &= var8 >= 64425238954L;
                    } else if (var10 == 4098) {
                        var2 &= var8 >= 60129613779L;
                    }
                }
            } catch (Exception var14) {
            }
        }
        if (var2) {
            try {
                var5 = class742.method4090(1000, (byte) -118, 1);
            } catch (Exception var13) {
            }
        }
        if (var4 == -1 && var5 == -1 && var6 == -1) {
            return class339.method2073(-78);
        }
        int var11 = (int) ((float) var5 * 1.1F);
        int var12 = (int) ((float) var6 * 1.1F);
        if (var4 > var12 && var11 < var4) {
            return class514.method3024(-128, var4);
        } else if (var11 >= var12) {
            return class490.method2868(var11, 1, 7);
        } else {
            return class490.method2868(var12, 3, 7);
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(I)V")
    public static void method2096(int arg0) {
        if (arg0 != 18253) {
            field4857 = null;
        }
        field4861 = null;
        field4844 = null;
        field4857 = null;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZIIII)V")
    public static final void method2097(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            return;
        }
        field4849++;
        if (arg3 <= arg4) {
            class379.method2284(arg3, arg4, class74.field1144[arg2], arg1, 2);
        } else {
            class379.method2284(arg4, arg3, class74.field1144[arg2], arg1, 2);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lol;I)V")
    public final void method2098(class431 arg0, int arg1) {
        this.field4853 = (float) (arg0.method2557(14929) * 8) / 255.0F;
        field4841++;
        if (arg1 != 3973) {
            this.field4851 = -36;
        }
        this.field4858 = (float) (arg0.method2557(14929) * 8) / 255.0F;
        this.field4845 = (float) (arg0.method2557(14929) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lus;B)Z")
    public final boolean method2099(class341 arg0, byte arg1) {
        field4860++;
        if (arg1 == 95) {
            return this.field4859 == arg0.field4859 && this.field4855 == arg0.field4855 && this.field4847 == arg0.field4847 && this.field4842 == arg0.field4842 && this.field4858 == arg0.field4858 && this.field4853 == arg0.field4853 && this.field4845 == arg0.field4845 && this.field4846 == arg0.field4846 && this.field4850 == arg0.field4850 && this.field4848 == arg0.field4848;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V")
    public class341() {
        this.field4851 = -60;
        this.field4850 = 0;
        this.field4842 = 1.2F;
        this.field4846 = class792.field10857;
        this.field4848 = class726.field10109;
        this.field4847 = 0.69921875F;
        this.field4855 = 1.1523438F;
        this.field4859 = class277.field4005;
        this.field4840 = -50;
        this.field4852 = -50;
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lol;)V")
    public class341(class431 arg0) {
        int var2 = arg0.method2557(14929);
        if (class420.field5820.field9481.method3155(17539) == 1 && class321.field4568.method472() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field4859 = class277.field4005;
            } else {
                this.field4859 = arg0.method2526(17);
            }
            if ((var2 & 0x2) == 0) {
                this.field4855 = 1.1523438F;
            } else {
                this.field4855 = (float) arg0.method2565((byte) -116) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field4847 = 0.69921875F;
            } else {
                this.field4847 = (float) arg0.method2565((byte) -109) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field4842 = 1.2F;
            } else {
                this.field4842 = (float) arg0.method2565((byte) -123) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2526(17);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2565((byte) -105);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2565((byte) -107);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2565((byte) -120);
            }
            this.field4842 = 1.2F;
            this.field4855 = 1.1523438F;
            this.field4847 = 0.69921875F;
            this.field4859 = class277.field4005;
        }
        if ((var2 & 0x10) == 0) {
            this.field4851 = -60;
            this.field4852 = -50;
            this.field4840 = -50;
        } else {
            this.field4852 = arg0.method2528((byte) 89);
            this.field4851 = arg0.method2528((byte) 89);
            this.field4840 = arg0.method2528((byte) 89);
        }
        if ((var2 & 0x20) == 0) {
            this.field4846 = class792.field10857;
        } else {
            this.field4846 = arg0.method2526(17);
        }
        if ((var2 & 0x40) == 0) {
            this.field4850 = 0;
        } else {
            this.field4850 = arg0.method2565((byte) -116);
        }
        if ((var2 & 0x80) == 0) {
            this.field4848 = class726.field10109;
        } else {
            int var3 = arg0.method2565((byte) -112);
            int var4 = arg0.method2565((byte) -122);
            int var5 = arg0.method2565((byte) -125);
            int var6 = arg0.method2565((byte) -122);
            int var7 = arg0.method2565((byte) -96);
            int var8 = arg0.method2565((byte) -88);
            this.field4848 = class779.method4280(var7, var8, var3, false, var5, var6, var4);
        }
    }
}
