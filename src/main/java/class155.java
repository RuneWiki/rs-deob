import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class155 extends class202 {

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "Lth;")
    public class187 field3188 = new class187();

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "Lpa;")
    public class144 field3196 = new class144();

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "Lsc;")
    private class173 field3193;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "Ldd;")
    public static class35 field3195 = class180.method1196((byte) -69, "::gc");

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "Z")
    public static boolean field3197 = false;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "Lba;")
    public static class12 field3191;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILag;I)Lbg;")
    public static final class18 method1041(int arg0, int arg1, class8 arg2, int arg3) {
        field3186++;
        if (class19.method166(arg3, 61, arg2, arg1)) {
            if (arg0 != 11110) {
                method1043(11);
            }
            return class73.method581(arg0 ^ 0x2B09);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
    public final void method694(int arg0) {
        field3187++;
        this.field3196.method694(arg0);
        for (class101 var2 = (class101) this.field3188.method1232(25831); var2 != null; var2 = (class101) this.field3188.method1238(22622)) {
            if (!this.field3193.method1141(var2, -69)) {
                int var3 = arg0;
                do {
                    if (var2.field2226 >= var3) {
                        this.method1044(0, var3, var2);
                        var2.field2226 -= var3;
                        break;
                    }
                    this.method1044(0, var2.field2226, var2);
                    var3 -= var2.field2226;
                } while (!this.field3193.method1139(var3, 0, 14473, null, var2));
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([III)V")
    public final void method705(int[] arg0, int arg1, int arg2) {
        this.field3196.method705(arg0, arg1, arg2);
        field3192++;
        for (class101 var4 = (class101) this.field3188.method1232(25831); var4 != null; var4 = (class101) this.field3188.method1238(22622)) {
            if (!this.field3193.method1141(var4, -70)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field2226 >= var6) {
                        this.method1042(var6, var5 + var6, var4, false, var5, arg0);
                        var4.field2226 -= var6;
                        break;
                    }
                    this.method1042(var4.field2226, var5 + var6, var4, false, var5, arg0);
                    var5 += var4.field2226;
                    var6 -= var4.field2226;
                } while (!this.field3193.method1139(var6, var5, 14473, arg0, var4));
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILkc;ZI[I)V")
    private final void method1042(int arg0, int arg1, class101 arg2, boolean arg3, int arg4, int[] arg5) {
        if ((this.field3193.field3453[arg2.field2250] & 0x4) != 0 && arg2.field2246 < 0) {
            int var7 = this.field3193.field3506[arg2.field2250] / class150.field3136;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field2237) / var7;
                if (var8 > arg0) {
                    arg2.field2237 += arg0 * var7;
                    break;
                }
                arg0 -= var8;
                arg2.field2217.method705(arg5, arg4, var8);
                arg4 += var8;
                arg2.field2237 += var7 * var8 - 1048576;
                int var9 = 262144 / var7;
                int var10 = class150.field3136 / 100;
                if (var10 > var9) {
                    var10 = var9;
                }
                class94 var11 = arg2.field2217;
                if (this.field3193.field3502[arg2.field2250] == 0) {
                    arg2.field2217 = class94.method695(arg2.field2227, var11.method703(), var11.method713(), var11.method720());
                } else {
                    arg2.field2217 = class94.method695(arg2.field2227, var11.method703(), 0, var11.method720());
                    this.field3193.method1134(arg2.field2221.field3353[arg2.field2241] < 0, false, arg2);
                    arg2.field2217.method681(var10, var11.method713());
                }
                if (arg2.field2221.field3353[arg2.field2241] < 0) {
                    arg2.field2217.method711(-1);
                }
                var11.method690(var10);
                var11.method705(arg5, arg4, arg1 - arg4);
                if (var11.method712()) {
                    this.field3196.method984(var11);
                }
            }
        }
        field3185++;
        if (arg3) {
            this.field3188 = null;
        }
        arg2.field2217.method705(arg5, arg4, arg0);
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)V")
    public static void method1043(int arg0) {
        if (arg0 != 10483) {
            field3197 = true;
        }
        field3191 = null;
        field3195 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILkc;)V")
    private final void method1044(int arg0, int arg1, class101 arg2) {
        if ((this.field3193.field3453[arg2.field2250] & 0x4) != arg0 && arg2.field2246 < 0) {
            int var4 = this.field3193.field3506[arg2.field2250] / class150.field3136;
            int var5 = (var4 + 1048575 - arg2.field2237) / var4;
            arg2.field2237 = arg1 * var4 + arg2.field2237 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field3193.field3502[arg2.field2250] == 0) {
                    arg2.field2217 = class94.method695(arg2.field2227, arg2.field2217.method703(), arg2.field2217.method713(), arg2.field2217.method720());
                } else {
                    arg2.field2217 = class94.method695(arg2.field2227, arg2.field2217.method703(), 0, arg2.field2217.method720());
                    this.field3193.method1134(arg2.field2221.field3353[arg2.field2241] < 0, false, arg2);
                }
                if (arg2.field2221.field3353[arg2.field2241] < 0) {
                    arg2.field2217.method711(-1);
                }
                arg1 = arg2.field2237 / var4;
            }
        }
        arg2.field2217.method694(arg1);
        field3183++;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "()Lve;")
    public final class202 method682() {
        field3182++;
        class101 var1;
        do {
            var1 = (class101) this.field3188.method1238(22622);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2217 == null);
        return var1.field2217;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZZ)V")
    public static final void method1045(boolean arg0, boolean arg1) {
        field3184++;
        if (class30.field603 == null) {
            return;
        }
        try {
            class26 var2 = new class26(4);
            var2.method257((byte) 126, arg0 ? 2 : 3);
            var2.method234((byte) 103, 0);
            class30.field603.method924(0, 4, var2.field529, arg1);
        } catch (IOException var4) {
            try {
                class30.field603.method920((byte) -91);
            } catch (Exception var3) {
            }
            class30.field603 = null;
            class35.field777++;
        }
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)V")
    public static final void method1046(int arg0) {
        class69.field1646.method813(-126);
        if (arg0 != 0) {
            return;
        }
        field3189++;
        class186.field3794.method813(-128);
        class186.field3797.method813(-119);
        class64.field1528.method813(-113);
        class178.field3649.method813(-113);
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "()Lve;")
    public final class202 method704() {
        field3190++;
        class101 var1 = (class101) this.field3188.method1232(25831);
        if (var1 == null) {
            return null;
        } else if (var1.field2217 == null) {
            return this.method682();
        } else {
            return var1.field2217;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "()I")
    public final int method707() {
        field3194++;
        return 0;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lsc;)V")
    public class155(class173 arg0) {
        this.field3193 = arg0;
    }
}
