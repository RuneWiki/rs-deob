import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class187 {

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public int field2456 = 443;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "Z")
    private boolean field2459 = false;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public int field2461 = 43594;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "Z")
    private boolean field2462 = true;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field2458 = 1403;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "[[Z")
    public static boolean[][] field2455 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public int field2454;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "Ljava/lang/String;")
    public String field2460;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZLql;)Z")
    public final boolean method1191(boolean arg0, class187 arg1) {
        if (!arg0) {
            return true;
        }
        field2457++;
        if (arg1 == null) {
            return false;
        } else {
            return this.field2454 == arg1.field2454 && this.field2460.equals(arg1.field2460);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLnga;)Lwp;")
    public final class435 method1192(byte arg0, class256 arg1) {
        field2464++;
        int var3 = -108 % ((arg0 - 57) / 39);
        return arg1.method1557(this.field2460, this.field2459, 22, this.field2462 ? this.field2456 : this.field2461);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
    public final void method1193(byte arg0) {
        if (arg0 != -68) {
            this.method1193((byte) 16);
        }
        if (!this.field2462) {
            this.field2459 = true;
            this.field2462 = true;
        } else if (this.field2459) {
            this.field2459 = false;
        } else {
            this.field2462 = false;
        }
        field2463++;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
    public static void method1194(int arg0) {
        field2455 = null;
        if (arg0 != 0) {
            field2455 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ldfa;I)V")
    public static final void method1195(class757 arg0, int arg1) {
        field2465++;
        int var2 = 0;
        arg0.method4212((byte) -125);
        for (int var3 = 0; var3 < class627.field8745; var3++) {
            int var16 = class274.field3465[var3];
            if ((class220.field2792[var16] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class220.field2792[var16] = (byte) class216.method1308(class220.field2792[var16], 2);
                } else {
                    int var17 = arg0.method4206(1, 4);
                    if (var17 == 0) {
                        var2 = class58.method461(8, arg0);
                        class220.field2792[var16] = (byte) class216.method1308(class220.field2792[var16], 2);
                    } else {
                        class383.method2304(arg0, var16, (byte) 86);
                    }
                }
            }
        }
        arg0.method4214(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg0.method4212((byte) -125);
        for (int var4 = 0; var4 < class627.field8745; var4++) {
            int var14 = class274.field3465[var4];
            if ((class220.field2792[var14] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class220.field2792[var14] = (byte) class216.method1308(class220.field2792[var14], 2);
                } else {
                    int var15 = arg0.method4206(1, 127);
                    if (var15 == 0) {
                        var2 = class58.method461(8, arg0);
                        class220.field2792[var14] = (byte) class216.method1308(class220.field2792[var14], 2);
                    } else {
                        class383.method2304(arg0, var14, (byte) -111);
                    }
                }
            }
        }
        arg0.method4214(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg0.method4212((byte) -125);
        for (int var5 = 0; var5 < class625.field8728; var5++) {
            int var12 = class261.field3311[var5];
            if ((class220.field2792[var12] & 0x1) != 0) {
                if (var2 > 0) {
                    class220.field2792[var12] = (byte) class216.method1308(class220.field2792[var12], 2);
                    var2--;
                } else {
                    int var13 = arg0.method4206(1, -68);
                    if (var13 == 0) {
                        var2 = class58.method461(8, arg0);
                        class220.field2792[var12] = (byte) class216.method1308(class220.field2792[var12], 2);
                    } else if (class553.method3149(arg0, 33, var12)) {
                        class220.field2792[var12] = (byte) class216.method1308(class220.field2792[var12], 2);
                    }
                }
            }
        }
        arg0.method4214(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg0.method4212((byte) -125);
        int var6 = -76 % ((arg1 + 44) / 34);
        for (int var7 = 0; var7 < class625.field8728; var7++) {
            int var10 = class261.field3311[var7];
            if ((class220.field2792[var10] & 0x1) == 0) {
                if (var2 > 0) {
                    class220.field2792[var10] = (byte) class216.method1308(class220.field2792[var10], 2);
                    var2--;
                } else {
                    int var11 = arg0.method4206(1, -54);
                    if (var11 == 0) {
                        var2 = class58.method461(8, arg0);
                        class220.field2792[var10] = (byte) class216.method1308(class220.field2792[var10], 2);
                    } else if (class553.method3149(arg0, -126, var10)) {
                        class220.field2792[var10] = (byte) class216.method1308(class220.field2792[var10], 2);
                    }
                }
            }
        }
        arg0.method4214(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class625.field8728 = 0;
        class627.field8745 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            class220.field2792[var8] = (byte) (class220.field2792[var8] >> 1);
            class546 var9 = class447.field6287[var8];
            if (var9 == null) {
                class261.field3311[class625.field8728++] = var8;
            } else {
                class274.field3465[class627.field8745++] = var8;
            }
        }
    }
}
