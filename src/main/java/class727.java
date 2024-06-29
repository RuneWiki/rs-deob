import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class727 {

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "Z")
    private boolean field9837 = false;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
    private int field9841 = -1;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "[Ljava/lang/String;")
    private String[] field9844 = new String[0];

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
    private int field9842;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
    public static int field9838 = 1;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field9832;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field9833;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field9834;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public static int field9835;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field9836;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public static int field9839;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public static int field9840;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
    public static int field9843;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
    public static int field9845;

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "I")
    public static int field9846;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "([BZB)Ljava/lang/Object;", line = 6)
    public static final Object method4021(byte[] arg0, boolean arg1, byte arg2) {
        if (arg2 < 73) {
            field9838 = -51;
        }
        field9840++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class691.field9337) {
            try {
                class386 var3 = (class386) Class.forName("lg").getDeclaredConstructor().newInstance();
                var3.method2437((byte) 62, arg0);
                return var3;
            } catch (Throwable var4) {
                class691.field9337 = true;
            }
        }
        return arg1 ? class745.method4111(arg0, 0) : arg0;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)I", line = 43)
    private final int method4022(int arg0, int arg1) {
        int var3 = 71 % ((arg1 + 4) / 53);
        field9839++;
        int var4 = this.field9844.length;
        while (var4 <= arg0) {
            if (!this.field9837) {
                var4 += this.field9842;
            } else if (var4 == 0) {
                var4 = 1;
            } else {
                var4 = this.field9842 * var4;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZI)I", line = 70)
    public static final int method4023(boolean arg0, int arg1) {
        field9845++;
        if (!arg0) {
            field9838 = -32;
        }
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;Lwea;ZZI)V", line = 81)
    public static final void method4024(String arg0, class158 arg1, boolean arg2, boolean arg3, int arg4) {
        field9846++;
        if (arg3) {
            if (class158.field2551.startsWith("win") && arg1.field2525) {
                String var5 = null;
                if (class675.field9193 != null) {
                    var5 = class675.field9193.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class622 var6 = class12.method94(arg1, arg0, -117, 0);
                    class424.field6105 = var6;
                    class637.field8758 = arg1;
                    class21.field334 = arg0;
                    return;
                }
            }
            if (class158.field2551.startsWith("mac")) {
                String var7 = null;
                if (class675.field9193 != null) {
                    var7 = class675.field9193.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg2) {
                    class12.method94(arg1, arg0, 42, 1);
                    return;
                }
            }
            class12.method94(arg1, arg0, 96, 2);
        } else {
            class12.method94(arg1, arg0, -96, 3);
        }
        int var8 = -6 / ((arg4 - 20) / 44);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)[Ljava/lang/String;", line = 154)
    public final String[] method4025(int arg0) {
        field9836++;
        int var2 = 95 % ((15 - arg0) / 32);
        String[] var3 = new String[this.field9841 + 1];
        class363.method2317(this.field9844, 0, var3, 0, this.field9841 + 1);
        return var3;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 167)
    private final void method4026(String arg0, int arg1, int arg2) {
        if (arg1 >= -56) {
            this.field9837 = true;
        }
        field9843++;
        if (this.field9841 < arg2) {
            this.field9841 = arg2;
        }
        if (arg2 >= this.field9844.length) {
            this.method4027(arg2, -107);
        }
        this.field9844[arg2] = arg0;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)V", line = 184)
    private final void method4027(int arg0, int arg1) {
        int var3 = 50 % ((3 - arg1) / 63);
        field9835++;
        String[] var4 = new String[this.method4022(arg0, 108)];
        class363.method2317(this.field9844, 0, var4, 0, this.field9844.length);
        this.field9844 = var4;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILjava/lang/String;)V", line = 200)
    public final void method4028(int arg0, String arg1) {
        this.method4026(arg1, -99, this.field9841 + 1);
        field9833++;
        if (arg0 != -1) {
            this.field9837 = true;
        }
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(IZ)V", line = 253)
    public class727(int arg0, boolean arg1) {
        this.field9842 = arg0;
        this.field9837 = arg1;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IBLcea;)V", line = 230)
    public static final void method4029(int arg0, byte arg1, class215 arg2) {
        if (arg1 > -113) {
            field9838 = -64;
        }
        if (class252.field3638 != null) {
            try {
                class252.field3638.method139(0L, (byte) 59);
                class252.field3638.method133(arg0, 24, true, arg2.field3066);
            } catch (Exception var3) {
            }
        }
        field9832++;
    }

    @OriginalMember(owner = "client!bo", name = "toString", descriptor = "()Ljava/lang/String;", line = 263)
    public final String toString() {
        field9834++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field9841; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field9844[var2]);
        }
        var1.append("]");
        return var1.toString();
    }
}
