import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class402 extends class343 {

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "[I")
    public static int[] field5682 = new int[4];

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "Llga;")
    public static class712 field5679 = new class712(37, -1);

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "[B")
    private byte[] field5686;

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class402() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V")
    public static void method2324(byte arg0) {
        field5682 = null;
        if (arg0 >= -28) {
            method2326(-40);
        }
        field5679 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILoi;II)V")
    public static final void method2325(int arg0, int arg1, class74 arg2, int arg3, int arg4) {
        field5680++;
        class351 var5 = arg2.method548(1);
        if (arg1 != 6144) {
            field5682 = null;
        }
        int var6 = arg2.field873 - arg2.field854.field9270 & 0x3FFF;
        if (arg3 == -1) {
            if (var6 != 0 || arg2.field865 > 25) {
                if (arg4 < 0 && var5.field4666 != -1) {
                    arg2.field803 = false;
                    arg2.field837 = var5.field4666;
                } else if (arg4 <= 0 || var5.field4681 == -1) {
                    arg2.field837 = var5.field4694;
                } else {
                    arg2.field837 = var5.field4681;
                }
                arg2.field803 = false;
            } else if (!arg2.field803 || !var5.method2041((byte) -53, arg2.field837)) {
                arg2.field837 = var5.method2039(arg1 ^ 0x1820);
                arg2.field803 = arg2.field837 != -1;
            }
        } else if (arg2.field809 != -1 && var6 >= 10240 || var6 <= 2048) {
            int var7 = class482.field6653[arg0] - arg2.field854.field9270 & 0x3FFF;
            if (arg3 == 2 && var5.field4682 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field4697 != -1) {
                    arg2.field837 = var5.field4697;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field4645 != -1) {
                    arg2.field837 = var5.field4645;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field4650 == -1) {
                    arg2.field837 = var5.field4682;
                } else {
                    arg2.field837 = var5.field4650;
                }
            } else if (arg3 == 0 && var5.field4657 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field4698 != -1) {
                    arg2.field837 = var5.field4698;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field4667 != -1) {
                    arg2.field837 = var5.field4667;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field4689 == -1) {
                    arg2.field837 = var5.field4657;
                } else {
                    arg2.field837 = var5.field4689;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field4661 != -1) {
                arg2.field837 = var5.field4661;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field4647 != -1) {
                arg2.field837 = var5.field4647;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field4654 == -1) {
                arg2.field837 = var5.field4694;
            } else {
                arg2.field837 = var5.field4654;
            }
            arg2.field803 = false;
        } else if (var6 == 0 && arg2.field865 <= 25) {
            if (arg3 == 2 && var5.field4682 != -1) {
                arg2.field837 = var5.field4682;
            } else if (arg3 == 0 && var5.field4657 != -1) {
                arg2.field837 = var5.field4657;
            } else {
                arg2.field837 = var5.field4694;
            }
            arg2.field803 = false;
        } else {
            if (arg3 == 2 && var5.field4682 != -1) {
                if (arg4 < 0 && var5.field4675 != -1) {
                    arg2.field837 = var5.field4675;
                } else if (arg4 <= 0 || var5.field4659 == -1) {
                    arg2.field837 = var5.field4682;
                } else {
                    arg2.field837 = var5.field4659;
                }
            } else if (arg3 == 0 && var5.field4657 != -1) {
                if (arg4 < 0 && var5.field4700 != -1) {
                    arg2.field837 = var5.field4700;
                } else if (arg4 <= 0 || var5.field4699 == -1) {
                    arg2.field837 = var5.field4657;
                } else {
                    arg2.field837 = var5.field4699;
                }
            } else if (arg4 < 0 && var5.field4668 != -1) {
                arg2.field837 = var5.field4668;
            } else if (arg4 <= 0 || var5.field4658 == -1) {
                arg2.field837 = var5.field4694;
            } else {
                arg2.field837 = var5.field4658;
            }
            arg2.field803 = false;
        }
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V")
    public static final void method2326(int arg0) {
        field5685++;
        class112.method753(-67);
        if (arg0 != 31398) {
            field5679 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZIII)[B")
    public final byte[] method2327(boolean arg0, int arg1, int arg2, int arg3) {
        field5683++;
        this.field5686 = new byte[arg1 * arg2 * arg3 * 2];
        if (!arg0) {
            this.method2017((byte) 104, -114, (byte) 118);
        }
        this.method1624((byte) -45, arg3, arg1, arg2);
        return this.field5686;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BIB)V")
    public final void method2017(byte arg0, int arg1, byte arg2) {
        field5684++;
        byte var4 = (byte) (((arg0 & 0xFF) >> 1) + 127);
        int var5 = arg1 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field5686[var10001] = var4;
        this.field5686[var6] = var4;
        if (arg2 != 42) {
            field5679 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2328(int arg0, int arg1, byte arg2) {
        if (arg2 <= 10) {
            method2325(36, -41, null, 23, 85);
        }
        field5678++;
        return (arg1 & 0xC580) != 0;
    }
}
