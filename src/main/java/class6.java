import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class6 {

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "Luc;")
    private class38 field56;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "Le;")
    private class64 field64;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "Ltc;")
    private class174 field68;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "Lpj;")
    public static class237 field58 = class33.method353("<img=1>", 34);

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "Lpj;")
    public static class237 field66 = class33.method353("ul", 43);

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "Lfa;")
    public static class239 field63;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "Lie;")
    private class32 field65;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "[Ln;")
    private class16[] field60;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZLw;)Z")
    public static final boolean method69(boolean arg0, class141 arg1) {
        field59++;
        if (arg1.field2428 == null) {
            return false;
        }
        int var2 = 0;
        if (arg0) {
            return false;
        }
        while (var2 < arg1.field2428.length) {
            int var3 = class101.method768(var2, 709041672, arg1);
            int var4 = arg1.field2496[var2];
            if (arg1.field2428[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field2428[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field2428[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
            var2++;
        }
        return true;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZLob;IZLob;)Ln;")
    private final class16 method70(boolean arg0, class128 arg1, int arg2, boolean arg3, class128 arg4) {
        field67++;
        if (this.field65 == null) {
            throw new RuntimeException();
        }
        this.field65.field647 = arg2 * 8 + 5;
        if (this.field65.field647 >= this.field65.field644.length) {
            throw new RuntimeException();
        } else if (this.field60[arg2] == null) {
            if (arg3) {
                this.field68 = null;
            }
            int var6 = this.field65.method319((byte) -18);
            int var7 = this.field65.method319((byte) -18);
            class16 var8 = new class16(arg2, arg4, arg1, this.field56, this.field64, var6, var7, arg0);
            this.field60[arg2] = var8;
            return var8;
        } else {
            return this.field60[arg2];
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BILob;Lob;)Ln;")
    public final class16 method71(byte arg0, int arg1, class128 arg2, class128 arg3) {
        field62++;
        int var5 = 99 % ((arg0 + 21) / 38);
        return this.method70(true, arg2, arg1, false, arg3);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIZILie;I)V")
    public static final void method72(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class32 arg7, int arg8) {
        field61++;
        if (arg2 < 82) {
            field58 = null;
        }
        if (arg6 < 0 || arg6 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var11 = arg7.method316((byte) 124);
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg7.method316((byte) -52);
                    return;
                }
                if (var11 <= 49) {
                    arg7.method316((byte) -104);
                }
            }
        }
        if (!arg5) {
            class73.field1410[arg4][arg6][arg3] = 0;
        }
        while (true) {
            int var9 = arg7.method316((byte) -56);
            if (var9 == 0) {
                if (arg5) {
                    class99.field1773[0][arg6][arg3] = class74.field1421[0][arg6][arg3];
                    return;
                } else if (arg4 == 0) {
                    class99.field1773[0][arg6][arg3] = -class28.method251(85, arg3 + arg1 + 556238, arg0 + 932731 + arg6) * 8;
                    return;
                } else {
                    class99.field1773[arg4][arg6][arg3] = class99.field1773[arg4 - 1][arg6][arg3] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg7.method316((byte) -83);
                if (!arg5) {
                    if (var10 == 1) {
                        var10 = 0;
                    }
                    if (arg4 == 0) {
                        class99.field1773[0][arg6][arg3] = -var10 * 8;
                        return;
                    }
                    class99.field1773[arg4][arg6][arg3] = class99.field1773[arg4 - 1][arg6][arg3] - (var10 * 8);
                    return;
                }
                class99.field1773[0][arg6][arg3] = var10 * 8 + class74.field1421[0][arg6][arg3];
                return;
            }
            if (var9 <= 49) {
                class3.field26[arg4][arg6][arg3] = arg7.method325(-104);
                class218.field3766[arg4][arg6][arg3] = (byte) ((var9 - 2) / 4);
                class185.field3250[arg4][arg6][arg3] = (byte) class272.method1817(3, arg8 + var9 - 2);
            } else if (var9 > 81) {
                class25.field446[arg4][arg6][arg3] = (byte) (var9 - 81);
            } else if (!arg5) {
                class73.field1410[arg4][arg6][arg3] = (byte) (var9 - 49);
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public static void method73(int arg0) {
        field58 = null;
        field63 = null;
        field66 = null;
        if (arg0 != -22086) {
            field58 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)Z")
    public final boolean method74(int arg0) {
        field69++;
        if (this.field65 != null) {
            return true;
        }
        if (this.field68 == null) {
            if (this.field56.method397(32)) {
                return false;
            }
            this.field68 = this.field56.method386(255, true, (byte) 0, 255, (byte) 127);
        }
        if (this.field68.field2175) {
            return false;
        }
        this.field65 = new class32(this.field68.method885(1));
        this.field60 = new class16[(this.field65.field644.length - 5) / 8];
        if (arg0 != -16754) {
            this.field60 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V")
    public final void method75(int arg0) {
        field57++;
        if (this.field60 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field60.length; var2++) {
            if (this.field60[var2] != null) {
                this.field60[var2].method142(0);
            }
        }
        if (arg0 != -15067) {
            this.field56 = null;
        }
        for (int var3 = 0; var3 < this.field60.length; var3++) {
            if (this.field60[var3] != null) {
                this.field60[var3].method150(arg0 + 1150);
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Luc;Le;)V")
    public class6(class38 arg0, class64 arg1) {
        this.field56 = arg0;
        this.field64 = arg1;
        if (!this.field56.method397(81)) {
            this.field68 = this.field56.method386(255, true, (byte) 0, 255, (byte) 113);
        }
    }
}
