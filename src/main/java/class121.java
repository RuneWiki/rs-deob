import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class121 {

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "Lcq;")
    public static class494 field2190 = new class494();

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public int field2191;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
    private int field2193;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)V")
    public final void method1056(int arg0, int arg1) {
        field2196++;
        this.field2193 = 0;
        this.field2191 = arg0;
        if (arg1 != 5799) {
            this.method1061((byte) 23);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IJZII)Ljava/lang/String;")
    public static final String method1057(int arg0, long arg1, boolean arg2, int arg3, int arg4) {
        field2194++;
        char var6 = ',';
        char var7 = '.';
        if (arg4 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg4 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg0 != -20746) {
            field2190 = null;
        }
        if (arg1 < 0L) {
            var8 = true;
            arg1 = -arg1;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg3 > 0) {
            for (int var10 = 0; var10 < arg3; var10++) {
                int var11 = (int) arg1;
                arg1 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg1 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg1;
            arg1 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg1 * 10));
            if (arg1 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg2) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Ljava/lang/String;ICLjava/lang/String;)Ljava/lang/String;")
    public static final String method1058(String arg0, int arg1, char arg2, String arg3) {
        field2192++;
        int var4 = arg3.length();
        int var5 = arg0.length();
        int var6 = var4;
        int var7 = var5 - 1;
        if (var7 != 0) {
            int var8 = 0;
            while (true) {
                var8 = arg3.indexOf(arg2, var8);
                if (var8 < 0) {
                    break;
                }
                var6 += var7;
                var8++;
            }
        }
        StringBuffer var9 = new StringBuffer(var6);
        if (arg1 != -20817) {
            field2199 = 53;
        }
        int var10 = 0;
        while (true) {
            int var11 = arg3.indexOf(arg2, var10);
            if (var11 < 0) {
                var9.append(arg3.substring(var10));
                return var9.toString();
            }
            var9.append(arg3.substring(var10, var11));
            var10 = var11 + 1;
            var9.append(arg0);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIZ)Z")
    public final boolean method1059(int arg0, int arg1, int arg2, boolean arg3) {
        field2197++;
        int var5 = this.field2193;
        if (this.field2191 == arg0 && this.field2193 == 0) {
            return false;
        }
        if (arg3) {
            this.field2193 = 67;
        }
        boolean var8;
        if (this.field2193 == 0) {
            if (this.field2191 < arg0 && arg0 <= this.field2191 + arg1 || arg0 < this.field2191 && arg0 >= this.field2191 - arg1) {
                this.field2191 = arg0;
                return false;
            }
            var8 = true;
        } else if (this.field2193 > 0 && arg0 > this.field2191) {
            int var6 = this.field2193 * this.field2193 / (arg1 * 2);
            int var7 = this.field2191 + var6;
            if (var7 < arg0 && var7 >= this.field2191) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field2193 < 0 && this.field2191 > arg0) {
            int var9 = this.field2193 * this.field2193 / (arg1 * 2);
            int var10 = this.field2191 - var9;
            if (var10 > arg0 && this.field2191 >= var10) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (arg0 > this.field2191) {
                this.field2193 += arg1;
                if (arg2 != 0 && this.field2193 > arg2) {
                    this.field2193 = arg2;
                }
            } else {
                this.field2193 -= arg1;
                if (arg2 != 0 && (-arg2) > this.field2193) {
                    this.field2193 = -arg2;
                }
            }
            if (this.field2193 != var5) {
                int var11 = this.field2193 * this.field2193 / (arg1 * 2);
                if (arg0 > this.field2191) {
                    if (this.field2191 + var11 > arg0) {
                        this.field2193 = var5;
                    }
                } else if (arg0 < this.field2191 && arg0 > this.field2191 - var11) {
                    this.field2193 = var5;
                }
            }
        } else if (this.field2193 <= 0) {
            this.field2193 += arg1;
            if (this.field2193 > 0) {
                this.field2193 = 0;
            }
        } else {
            this.field2193 -= arg1;
            if (this.field2193 < 0) {
                this.field2193 = 0;
            }
        }
        this.field2191 += this.field2193 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z)V")
    public static void method1060(boolean arg0) {
        if (arg0) {
            field2190 = null;
        }
        field2190 = null;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V")
    public final void method1061(byte arg0) {
        field2198++;
        this.field2191 &= 0x3FFF;
        if (arg0 < 92) {
            method1057(-77, 99L, false, -29, 118);
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(Z)I")
    public final int method1062(boolean arg0) {
        if (arg0) {
            return 75;
        } else {
            field2195++;
            return this.field2191 & 0x3FFF;
        }
    }
}
