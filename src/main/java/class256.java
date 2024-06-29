import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class256 {

    @OriginalMember(owner = "client!at", name = "o", descriptor = "Z")
    public boolean field3564 = false;

    @OriginalMember(owner = "client!at", name = "m", descriptor = "Lqp;")
    public static class466 field3562 = new class466("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!at", name = "g", descriptor = "B")
    public static byte field3556;

    @OriginalMember(owner = "client!at", name = "b", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!at", name = "e", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!at", name = "f", descriptor = "I")
    public int field3555;

    @OriginalMember(owner = "client!at", name = "h", descriptor = "I")
    public int field3557;

    @OriginalMember(owner = "client!at", name = "i", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!at", name = "j", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!at", name = "l", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!at", name = "n", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!at", name = "c", descriptor = "Lim;")
    public class402 field3552;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field3550;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(II)Z")
    public static final boolean method1534(int arg0, int arg1) {
        field3553++;
        if (class255.field3535[arg1]) {
            return true;
        } else if (class136.field1958.method750(arg1, arg0 - 32433)) {
            int var2 = class136.field1958.method753(arg1, -86);
            if (var2 == 0) {
                class255.field3535[arg1] = true;
                return true;
            }
            if (class495.field7226[arg1] == null) {
                class495.field7226[arg1] = new class150[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class495.field7226[arg1][var3] == null) {
                    byte[] var4 = class136.field1958.method727(var3, arg1, 120);
                    if (var4 != null) {
                        class150 var5 = class495.field7226[arg1][var3] = new class150();
                        var5.field2277 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method1006((byte) -79, new class391(var4));
                    }
                }
            }
            if (arg0 != 32554) {
                field3550 = null;
            }
            class255.field3535[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V")
    public static void method1535(byte arg0) {
        field3550 = null;
        if (arg0 >= 1) {
            field3562 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(B)I")
    public static final int method1536(byte arg0) {
        field3554++;
        return arg0 >= -14 ? -53 : 6;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ILya;IZ)Ll;")
    public final class16 method1537(int arg0, class38 arg1, int arg2, boolean arg3) {
        field3551++;
        if (arg2 != 6) {
            return null;
        }
        long var5 = (long) (arg1.field468 << 19 | (arg3 ? 262144 : 0) | arg0 << 16 | this.field3555);
        class16 var7 = (class16) this.field3552.field5904.method1073(var5, false);
        if (var7 != null) {
            return var7;
        } else if (this.field3552.field5893.method747(this.field3555, (byte) -68)) {
            class4 var8 = class4.method22(this.field3552.field5893, this.field3555, 0);
            if (var8 != null) {
                var8.field35 = var8.field37 = var8.field38 = var8.field33 = 0;
                if (arg3) {
                    var8.method28();
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    var8.method15();
                }
            }
            class16 var10 = arg1.method265(var8, true);
            if (var10 != null) {
                this.field3552.field5904.method1072(var5, var10, false);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lsi;I)V")
    public final void method1538(class391 arg0, int arg1) {
        field3563++;
        while (true) {
            int var3 = arg0.method2348(arg1 - 1009);
            if (var3 == 0) {
                if (arg1 == 1007) {
                    return;
                } else {
                    this.method1537(-29, null, -105, false);
                    return;
                }
            }
            this.method1539(arg0, (byte) -124, var3);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lsi;BI)V")
    private final void method1539(class391 arg0, byte arg1, int arg2) {
        field3561++;
        if (arg1 != -124) {
            this.field3564 = true;
        }
        if (arg2 == 1) {
            this.field3555 = arg0.method2353((byte) 73);
        } else if (arg2 == 2) {
            this.field3557 = arg0.method2338(true);
        } else if (arg2 == 3) {
            this.field3564 = true;
            return;
        } else if (arg2 == 4) {
            this.field3555 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(II)Z")
    public static final boolean method1540(int arg0, int arg1) {
        if (arg1 > -101) {
            method1536((byte) 80);
        }
        field3558++;
        if (arg0 == 17 || arg0 == 23 || arg0 == 20 || arg0 == 3 || arg0 == 19) {
            return true;
        } else {
            return arg0 == 18 || arg0 == 1007;
        }
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(B)Z")
    public final boolean method1541(byte arg0) {
        if (arg0 != -90) {
            method1540(-88, -92);
        }
        field3560++;
        return this.field3552.field5893.method747(this.field3555, (byte) -68);
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lya;ILbh;)I")
    public static final int method1542(class38 arg0, int arg1, class28 arg2) {
        if (arg1 != 1) {
            field3562 = null;
        }
        field3559++;
        if (arg2.field372 != -1) {
            return arg2.field372;
        }
        if (arg2.field378 != -1) {
            class166 var3 = arg0.field471.method1654(54, arg0.method308() ? arg2.field378 : arg2.field379);
            if (!var3.field2501) {
                return var3.field2484;
            }
        }
        return arg2.field370;
    }
}
