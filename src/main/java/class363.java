import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class363 {

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Lsj;")
    private class426 field4828 = new class426();

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Lhu;")
    public static class115 field4824 = new class115("", 14);

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "F")
    public static float field4834;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "F")
    public static float field4836;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "Lsj;")
    private class426 field4833;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method2065(byte arg0) {
        if (arg0 == -80) {
            field4823++;
            return this.field4828.field6117 == this.field4828;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILmi;)V", line = 18)
    public static final void method2066(int arg0, class461 arg1) {
        if (arg0 != 0) {
            method2073((byte) -6);
        }
        if (arg1.field6464 != null) {
            arg1.field6464.field3321 = 0;
        }
        arg1.field6463 = false;
        field4830++;
        for (class461 var2 = arg1.method1229(); var2 != null; var2 = arg1.method1221()) {
            method2066(0, var2);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)I", line = 43)
    public final int method2067(int arg0) {
        field4835++;
        int var2 = -115 % ((arg0 + 4) / 45);
        int var3 = 0;
        for (class426 var4 = this.field4828.field6117; var4 != this.field4828; var4 = var4.field6117) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)Lsj;", line = 63)
    public final class426 method2068(int arg0) {
        field4832++;
        class426 var2 = this.field4833;
        if (this.field4828 == var2) {
            this.field4833 = null;
            return null;
        }
        if (arg0 != -2001) {
            method2073((byte) 69);
        }
        this.field4833 = var2.field6117;
        return var2;
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)Lsj;", line = 88)
    public final class426 method2069(int arg0) {
        field4837++;
        class426 var2 = this.field4828.field6112;
        if (this.field4828 == var2) {
            this.field4833 = null;
            return null;
        } else {
            this.field4833 = var2.field6112;
            return arg0 >= -96 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)Lsj;", line = 109)
    public final class426 method2070(byte arg0) {
        int var2 = -20 / ((arg0 + 80) / 32);
        field4825++;
        class426 var3 = this.field4828.field6117;
        if (this.field4828 == var3) {
            this.field4833 = null;
            return null;
        } else {
            this.field4833 = var3.field6117;
            return var3;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLsj;)V", line = 129)
    public final void method2071(byte arg0, class426 arg1) {
        field4829++;
        if (arg1.field6112 != null) {
            arg1.method2564((byte) 2);
        }
        int var3 = 74 % ((10 - arg0) / 43);
        arg1.field6112 = this.field4828.field6112;
        arg1.field6117 = this.field4828;
        arg1.field6112.field6117 = arg1;
        arg1.field6117.field6112 = arg1;
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V", line = 145)
    public final void method2072(byte arg0) {
        while (true) {
            class426 var2 = this.field4828.field6117;
            if (this.field4828 == var2) {
                field4827++;
                if (arg0 < 120) {
                    this.method2068(-19);
                }
                this.field4833 = null;
                return;
            }
            var2.method2564((byte) 2);
        }
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(B)V", line = 167)
    public static void method2073(byte arg0) {
        if (arg0 != 83) {
            field4824 = null;
        }
        field4824 = null;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V", line = 207)
    public class363() {
        this.field4828.field6112 = this.field4828;
        this.field4828.field6117 = this.field4828;
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)Lsj;", line = 189)
    public final class426 method2074(int arg0) {
        if (arg0 > -19) {
            field4824 = null;
        }
        field4826++;
        class426 var2 = this.field4828.field6117;
        if (this.field4828 == var2) {
            return null;
        } else {
            var2.method2564((byte) 2);
            return var2;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BJ)V", line = 217)
    public static final void method2075(byte arg0, long arg1) {
        field4831++;
        int var3 = class206.field2472.field530 + class429.field6162;
        int var4 = class419.field5948 + class206.field2472.field531;
        if (class281.field3814 - var3 < -2000 || (class281.field3814 - var3) > 2000 || (class622.field8905 - var4) < -2000 || (class622.field8905 - var4) > 2000) {
            class622.field8905 = var4;
            class281.field3814 = var3;
        }
        if (class281.field3814 != var3) {
            int var5 = var3 - class281.field3814;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class281.field3814 += var6;
        }
        if (class622.field8905 != var4) {
            int var7 = var4 - class622.field8905;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class622.field8905 += var8;
        }
        if (!class221.field2851.field4141) {
            class393.field5309 += (float) arg1 * class59.field936 / 6.0F;
            class115.field1495 += (float) arg1 * class16.field311 / 6.0F;
        }
        class651.method3667(-23378);
        if (arg0 != 26) {
            field4836 = 0.10899101F;
        }
    }
}
