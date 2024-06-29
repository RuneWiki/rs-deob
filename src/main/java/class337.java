import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class337 {

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "Z")
    private boolean field4828 = false;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    private int field4825 = 32;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "J")
    private long field4834 = class508.method2860(false);

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
    private int field4838 = 0;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "[Lps;")
    private class427[] field4839 = new class427[8];

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
    private int field4840 = 0;

    @OriginalMember(owner = "client!nm", name = "A", descriptor = "J")
    private long field4845 = 0L;

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "I")
    private int field4843 = 0;

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "[Lps;")
    private class427[] field4847 = new class427[8];

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "Z")
    private boolean field4848 = true;

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "J")
    private long field4851 = 0L;

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "I")
    private int field4849 = 0;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "Lpp;")
    public static class464 field4827 = new class464(52, 3);

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "J")
    public static long field4833 = 0L;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "Lge;")
    public static class550 field4837 = new class550(0, 0);

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "I")
    public int field4844;

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "I")
    public int field4846;

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "I")
    private int field4850;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "Lps;")
    private class427 field4826;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "[I")
    public int[] field4821;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "()V", line = 3)
    public void method2065() throws Exception {
        field4841++;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 11)
    public void method2066(int arg0) throws Exception {
        field4831++;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)V", line = 19)
    public static final void method2067(int arg0, int arg1, int arg2) {
        field4820++;
        class21 var3 = class601.method3413(arg0, 5, (byte) 117);
        var3.method230(18340);
        var3.field308 = arg1;
        if (arg2 != 19136) {
            field4837 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V", line = 35)
    public static void method2068(byte arg0) {
        field4837 = null;
        if (arg0 <= 34) {
            method2068((byte) 40);
        }
        field4827 = null;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)V", line = 46)
    public final synchronized void method2069(byte arg0) {
        if (class284.field4142 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class284.field4142.field1580[var3] == this) {
                    class284.field4142.field1580[var3] = null;
                }
                if (class284.field4142.field1580[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class284.field4142.field1579 = true;
                while (class284.field4142.field1581) {
                    class210.method1342(-59, 50L);
                }
                class284.field4142 = null;
            }
        }
        field4836++;
        this.method2070();
        this.field4821 = null;
        if (arg0 > -87) {
            field4837 = null;
        }
        this.field4828 = true;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "()V", line = 92)
    public void method2070() {
        field4819++;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V", line = 100)
    public final synchronized void method2071(int arg0) {
        field4835++;
        this.field4848 = true;
        try {
            this.method2065();
            if (arg0 != 0) {
                this.field4828 = true;
            }
        } catch (Exception var2) {
            this.method2070();
            this.field4851 = class508.method2860(false) + 2000L;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BLps;)V", line = 120)
    public final synchronized void method2072(byte arg0, class427 arg1) {
        field4824++;
        this.field4826 = arg1;
        if (arg0 != -75) {
            this.field4838 = -48;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 141)
    public void method2073(Component arg0) throws Exception {
        field4822++;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILps;I)V", line = 154)
    private final void method2074(int arg0, class427 arg1, int arg2) {
        field4829++;
        int var4 = arg0 >> 5;
        class427 var5 = this.field4839[var4];
        if (var5 == null) {
            this.field4847[var4] = arg1;
        } else {
            var5.field6237 = arg1;
        }
        this.field4839[var4] = arg1;
        if (arg2 != 1647401509) {
            this.method2071(99);
        }
        arg1.field6238 = arg0;
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "()I", line = 181)
    public int method2075() throws Exception {
        field4842++;
        return this.field4846;
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(B)V", line = 200)
    public final synchronized void method2076(byte arg0) {
        if (arg0 >= -34) {
            return;
        }
        field4832++;
        if (this.field4828) {
            return;
        }
        long var2 = class508.method2860(false);
        try {
            if ((this.field4834 + 500000L) < var2) {
                this.field4834 = var2 - 500000L;
            }
            while ((this.field4834 + 5000L) < var2) {
                this.method2078(256, true);
                this.field4834 += (256000 / class604.field8591);
            }
        } catch (Exception var7) {
            this.field4834 = var2;
        }
        if (this.field4821 == null) {
            return;
        }
        try {
            if (this.field4851 != 0L) {
                if (this.field4851 > var2) {
                    return;
                }
                this.method2066(this.field4846);
                this.field4848 = true;
                this.field4851 = 0L;
            }
            int var4 = this.method2075();
            if (this.field4843 < (this.field4849 - var4)) {
                this.field4843 = this.field4849 - var4;
            }
            int var5 = this.field4844 + this.field4850;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field4846 < (var5 + 256)) {
                this.field4846 += 1024;
                if (this.field4846 > 16384) {
                    this.field4846 = 16384;
                }
                this.method2070();
                var4 = 0;
                this.method2066(this.field4846);
                this.field4848 = true;
                if (this.field4846 < (var5 + 256)) {
                    var5 = this.field4846 - 256;
                    this.field4850 = var5 - this.field4844;
                }
            }
            while (var5 > var4) {
                this.method2079(this.field4821, 256);
                this.method2077();
                var4 += 256;
            }
            if (var2 > this.field4845) {
                if (this.field4848) {
                    this.field4848 = false;
                } else if (this.field4843 == 0 && this.field4838 == 0) {
                    this.method2070();
                    this.field4851 = var2 + 2000L;
                    return;
                } else {
                    this.field4850 = Math.min(this.field4838, this.field4843);
                    this.field4838 = this.field4843;
                }
                this.field4843 = 0;
                this.field4845 = var2 + 2000L;
            }
            this.field4849 = var4;
        } catch (Exception var6) {
            this.method2070();
            this.field4851 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "()V", line = 320)
    public void method2077() throws Exception {
        field4823++;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZ)V", line = 329)
    private final void method2078(int arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field4830++;
        this.field4840 -= arg0;
        if (this.field4840 < 0) {
            this.field4840 = 0;
        }
        if (this.field4826 != null) {
            this.field4826.method48(arg0);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([II)V", line = 354)
    private final void method2079(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class641.field9295) {
            var3 = arg1 << 1;
        }
        class164.method1145(arg0, 0, var3);
        this.field4840 -= arg1;
        if (this.field4826 != null && this.field4840 <= 0) {
            this.field4840 += class604.field8591 >> 4;
            class189.method1259((byte) 97, this.field4826);
            this.method2074(this.field4826.method1989(), this.field4826, 1647401509);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class427 var10 = null;
                        class427 var11 = this.field4847[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class239 var12 = var11.field6236;
                                if (var12 == null || var12.field3482 <= var8) {
                                    var11.field6239 = true;
                                    int var13 = var11.method39();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3482 += var13;
                                    }
                                    if (var4 >= this.field4825) {
                                        break label107;
                                    }
                                    class427 var14 = var11.method45();
                                    if (var14 != null) {
                                        int var15 = var11.field6238;
                                        while (var14 != null) {
                                            this.method2074(var15 * var14.method1989() >> 8, var14, 1647401509);
                                            var14 = var11.method36();
                                        }
                                    }
                                    class427 var16 = var11.field6237;
                                    var11.field6237 = null;
                                    if (var10 == null) {
                                        this.field4847[var7] = var16;
                                    } else {
                                        var10.field6237 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4839[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field6237;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class427 var18 = this.field4847[var17];
                this.field4847[var17] = this.field4839[var17] = null;
                while (var18 != null) {
                    class427 var19 = var18.field6237;
                    var18.field6237 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field4840 < 0) {
            this.field4840 = 0;
        }
        if (this.field4826 != null) {
            this.field4826.method38(arg0, 0, arg1);
        }
        this.field4834 = class508.method2860(false);
    }
}
