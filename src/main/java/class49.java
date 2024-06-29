import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class49 {

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    private int field784 = 0;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "Z")
    public boolean field787 = true;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public int field777 = -1;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public int field790 = 128;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field780 = 0;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "Lbd;")
    public static class162 field788 = class17.method142(0, "(U4");

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public int field781;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public int field783;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public int field785;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    public int field791;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 7)
    public static final void method357(int arg0) {
        class198.field3365.method1529(false);
        if (arg0 != 16753037) {
            method357(59);
        }
        field786++;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILb;Z)V", line = 18)
    public final void method358(int arg0, class94 arg1, boolean arg2) {
        field778++;
        while (true) {
            int var4 = arg1.method756(915905888);
            if (var4 == 0) {
                if (arg2) {
                    method357(-82);
                }
                return;
            }
            this.method359(-105, var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIILb;)V", line = 52)
    private final void method359(int arg0, int arg1, int arg2, class94 arg3) {
        field779++;
        if (arg0 >= -58) {
            field780 = 23;
        }
        if (arg1 == 1) {
            this.field784 = arg3.method732(-1);
            this.method361(-8733, this.field784);
        } else if (arg1 == 2) {
            this.field777 = arg3.method761((byte) 108);
            if (this.field777 == 65535) {
                this.field777 = -1;
            }
        } else if (arg1 == 3) {
            this.field790 = arg3.method761((byte) 108);
        } else if (arg1 == 4) {
            this.field787 = false;
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V", line = 91)
    public static void method360(int arg0) {
        if (arg0 == 3) {
            field788 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)V", line = 114)
    private final void method361(int arg0, int arg1) {
        field782++;
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) ((arg1 & 0xFFA18D) >> 16) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var5;
        if (var3 < var5) {
            var9 = var3;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var5;
        if (var3 > var5) {
            var11 = var3;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (arg0 != -8733) {
            return;
        }
        double var17 = (var9 + var11) / 2.0D;
        this.field791 = (int) (var17 * 256.0D);
        if (this.field791 < 0) {
            this.field791 = 0;
        } else if (this.field791 > 255) {
            this.field791 = 255;
        }
        if (var9 != var11) {
            if (var5 == var11) {
                var13 = (var3 - var7) / (var11 - var9);
            } else if (var3 == var11) {
                var13 = (var7 - var5) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var5 - var3) / (var11 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field783 = (int) (var15 * 256.0D);
        if (var17 > 0.5D) {
            this.field781 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field781 = (int) (var15 * var17 * 512.0D);
        }
        double var19 = var13 / 6.0D;
        if (this.field783 < 0) {
            this.field783 = 0;
        } else if (this.field783 > 255) {
            this.field783 = 255;
        }
        if (this.field781 < 1) {
            this.field781 = 1;
        }
        this.field785 = (int) ((double) this.field781 * var19);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 233)
    public static final Class method362(String arg0, int arg1) throws ClassNotFoundException {
        field789++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else {
            if (arg1 != 15605) {
                field780 = 84;
            }
            return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
        }
    }
}
