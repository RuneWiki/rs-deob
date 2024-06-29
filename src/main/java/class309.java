import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class309 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public int field4852 = -1;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public int field4855 = -1;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public int field4864 = -1;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public int field4872 = -1;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public int field4868 = 0;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public int field4867 = -1;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public int field4856 = 0;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
    public int field4873 = -1;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public int field4858 = -1;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public int field4854 = -1;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public int field4871 = 0;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public int field4860 = 0;

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "I")
    public int field4880 = -1;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public int field4857 = -1;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public int field4862 = -1;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
    public int field4876 = -1;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public int field4865 = 0;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "I")
    public int field4877 = -1;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public int field4853 = -1;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
    public int field4875 = -1;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public int field4869 = -1;

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "I")
    public int field4885 = 0;

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "I")
    public int field4886 = -1;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
    public int field4874 = -1;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "I")
    public int field4879 = -1;

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "I")
    public int field4882 = -1;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
    public int field4890 = -1;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
    public int field4889 = 0;

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "I")
    public int field4878 = 0;

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "I")
    public int field4887 = -1;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
    public int field4888 = 0;

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "I")
    public int field4883 = 0;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "F")
    public static float field4866 = 128.0F;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4859 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!hf", name = "G", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "[[I")
    public int[][] field4891;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lgn;B)V", line = 17)
    public final void method2121(class303 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2043((byte) -112);
            if (var3 == 0) {
                field4881++;
                int var4 = 26 % ((-arg1 - 55) / 47);
                return;
            }
            this.method2123((byte) -105, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 53)
    public static void method2122(int arg0) {
        if (arg0 == -1) {
            field4859 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLgn;I)V", line = 68)
    private final void method2123(byte arg0, class303 arg1, int arg2) {
        int var4 = -51 / ((arg0 - 34) / 62);
        if (arg2 == 1) {
            this.field4876 = arg1.method1994(false);
            this.field4879 = arg1.method1994(false);
            if (this.field4879 == 65535) {
                this.field4879 = -1;
            }
            if (this.field4876 == 65535) {
                this.field4876 = -1;
            }
        } else if (arg2 == 2) {
            this.field4855 = arg1.method1994(false);
        } else if (arg2 == 3) {
            this.field4862 = arg1.method1994(false);
        } else if (arg2 == 4) {
            this.field4882 = arg1.method1994(false);
        } else if (arg2 == 5) {
            this.field4890 = arg1.method1994(false);
        } else if (arg2 == 6) {
            this.field4872 = arg1.method1994(false);
        } else if (arg2 == 7) {
            this.field4864 = arg1.method1994(false);
        } else if (arg2 == 8) {
            this.field4858 = arg1.method1994(false);
        } else if (arg2 == 9) {
            this.field4867 = arg1.method1994(false);
        } else if (arg2 == 26) {
            this.field4889 = (short) (arg1.method2043((byte) -127) * 4);
            this.field4860 = (short) (arg1.method2043((byte) -120) * 4);
        } else if (arg2 == 27) {
            if (this.field4891 == null) {
                this.field4891 = new int[12][];
            }
            int var5 = arg1.method2043((byte) -110);
            this.field4891[var5] = new int[6];
            for (int var6 = 0; var6 < 6; var6++) {
                this.field4891[var5][var6] = arg1.method2042(7);
            }
        } else if (arg2 == 29) {
            this.field4871 = arg1.method2043((byte) -117);
        } else if (arg2 == 30) {
            this.field4885 = arg1.method1994(false);
        } else if (arg2 == 31) {
            this.field4868 = arg1.method2043((byte) -109);
        } else if (arg2 == 32) {
            this.field4883 = arg1.method1994(false);
        } else if (arg2 == 33) {
            this.field4878 = arg1.method2042(7);
        } else if (arg2 == 34) {
            this.field4856 = arg1.method2043((byte) -112);
        } else if (arg2 == 35) {
            this.field4888 = arg1.method1994(false);
        } else if (arg2 == 36) {
            this.field4865 = arg1.method2042(7);
        } else if (arg2 == 37) {
            this.field4869 = arg1.method2043((byte) -128);
        } else if (arg2 == 38) {
            this.field4877 = arg1.method1994(false);
        } else if (arg2 == 39) {
            this.field4887 = arg1.method1994(false);
        } else if (arg2 == 40) {
            this.field4874 = arg1.method1994(false);
        } else if (arg2 == 41) {
            this.field4880 = arg1.method1994(false);
        } else if (arg2 == 42) {
            this.field4873 = arg1.method1994(false);
        } else if (arg2 == 43) {
            arg1.method1994(false);
        } else if (arg2 == 44) {
            arg1.method1994(false);
        } else if (arg2 == 45) {
            arg1.method1994(false);
        } else if (arg2 == 46) {
            this.field4852 = arg1.method1994(false);
        } else if (arg2 == 47) {
            this.field4854 = arg1.method1994(false);
        } else if (arg2 == 48) {
            this.field4857 = arg1.method1994(false);
        } else if (arg2 == 49) {
            this.field4853 = arg1.method1994(false);
        } else if (arg2 == 50) {
            this.field4886 = arg1.method1994(false);
        } else if (arg2 == 51) {
            this.field4875 = arg1.method1994(false);
        }
        field4884++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)I", line = 247)
    public static final int method2124(int arg0, int arg1) {
        field4863++;
        if (arg1 != -1728299768) {
            field4859 = (String) null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V", line = 298)
    public final void method2125(boolean arg0) {
        if (!arg0) {
            field4861++;
        }
    }
}
