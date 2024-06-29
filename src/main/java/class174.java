import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class174 {

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    private int field2973 = 0;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    private int field2971 = -1;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Lsf;")
    private class33 field2969 = new class33();

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "Z")
    public boolean field2980 = false;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    private int field2967;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    private int field2966;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "[[I")
    private int[][] field2968;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "[Lgd;")
    private class57[] field2975;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field2976 = 0;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Lsc;")
    public static class56 field2965 = new class56(32);

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Lsf;")
    public static class33 field2979 = new class33();

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)[[I")
    public final int[][] method1180(byte arg0) {
        field2974++;
        if (this.field2967 != this.field2966) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 == -117) {
            for (int var2 = 0; var2 < this.field2966; var2++) {
                this.field2975[var2] = class46.field1058;
            }
            return this.field2968;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lqe;IIB)V")
    public static final void method1181(class197 arg0, int arg1, int arg2, byte arg3) {
        field2972++;
        if (arg0.field4129 == arg2 && arg2 != -1) {
            class31 var4 = class186.method1263(0, arg2);
            int var5 = var4.field583;
            if (var5 == 1) {
                arg0.field4127 = 0;
                arg0.field4144 = arg1;
                arg0.field4139 = 0;
                arg0.field4120 = 0;
                class132.method918(arg0.field4143, false, arg0.field4120, var4, 122, arg0.field4177);
            }
            if (var5 == 2) {
                arg0.field4127 = 0;
            }
        } else if (arg2 == -1 || arg0.field4129 == -1 || class186.method1263(0, arg2).field584 >= class186.method1263(0, arg0.field4129).field584) {
            arg0.field4129 = arg2;
            arg0.field4144 = arg1;
            arg0.field4139 = 0;
            arg0.field4120 = 0;
            arg0.field4127 = 0;
            arg0.field4167 = arg0.field4148;
            if (arg0.field4129 != -1) {
                class132.method918(arg0.field4143, false, arg0.field4120, class186.method1263(0, arg0.field4129), 60, arg0.field4177);
            }
        }
        if (arg3 > -20) {
            method1181((class197) null, -58, 121, (byte) 18);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)[I")
    public final int[] method1182(byte arg0, int arg1) {
        field2964++;
        if (arg0 != -48) {
            method1183(-113, 35, 109, -119, 126, -69, 57, -82);
        }
        if (this.field2967 == this.field2966) {
            this.field2980 = this.field2975[arg1] == null;
            this.field2975[arg1] = class46.field1058;
            return this.field2968[arg1];
        } else if (this.field2966 == 1) {
            this.field2980 = this.field2971 != arg1;
            this.field2971 = arg1;
            return this.field2968[0];
        } else {
            class57 var3 = this.field2975[arg1];
            if (var3 == null) {
                this.field2980 = true;
                if (this.field2973 >= this.field2966) {
                    class57 var4 = (class57) this.field2969.method280((byte) -46);
                    var3 = new class57(arg1, var4.field1214);
                    this.field2975[var4.field1218] = null;
                    var4.method254(1);
                } else {
                    var3 = new class57(arg1, this.field2973);
                    this.field2973++;
                }
                this.field2975[arg1] = var3;
            } else {
                this.field2980 = false;
            }
            this.field2969.method284(var3, arg0 ^ 0xFFFF933E);
            return this.field2968[var3.field1214];
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 < 17) {
            return;
        }
        field2977++;
        if (arg2 < 1 || arg7 < 1 || arg2 > 102 || arg7 > 102) {
            return;
        }
        if (!class69.method524((byte) -79) && (class233.field4007[0][arg2][arg7] & 0x2) == 0) {
            int var8 = arg1;
            if ((class233.field4007[arg1][arg2][arg7] & 0x8) != 0) {
                var8 = 0;
            }
            if (class54.field1158 != var8) {
                return;
            }
        }
        int var9 = arg1;
        if (arg1 < 3 && (class233.field4007[1][arg2][arg7] & 0x2) == 2) {
            var9 = arg1 + 1;
        }
        class230.method1504(74, arg7, arg2, var9, class173.field2961[arg1], arg6, arg1);
        if (arg0 < 0) {
            return;
        }
        boolean var10 = class133.field2387;
        class133.field2387 = true;
        class24.method213(class173.field2961[arg1], arg5, false, arg1, (byte) -50, arg2, arg7, var9, arg3, arg0, false);
        class133.field2387 = var10;
        return;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V")
    public static void method1184(byte arg0) {
        if (arg0 <= -43) {
            field2979 = null;
            field2965 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public final void method1185(int arg0) {
        field2970++;
        for (int var2 = 0; var2 < this.field2966; var2++) {
            this.field2968[var2] = null;
        }
        this.field2975 = null;
        this.field2968 = null;
        this.field2969.method282(-119);
        this.field2969 = null;
        if (arg0 != -103) {
            this.field2971 = 102;
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(III)V")
    public class174(int arg0, int arg1, int arg2) {
        this.field2967 = arg1;
        this.field2966 = arg0;
        this.field2968 = new int[this.field2966][arg2];
        this.field2975 = new class57[this.field2967];
    }
}
