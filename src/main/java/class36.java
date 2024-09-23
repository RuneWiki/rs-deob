import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LPTCUHOU")
public class class36 {

    @OriginalMember(owner = "LPTCUHOU", name = "a", descriptor = "I")
    public int field1012 = -1;

    @OriginalMember(owner = "LPTCUHOU", name = "b", descriptor = "Z")
    public boolean field1013 = true;

    @OriginalMember(owner = "LPTCUHOU", name = "d", descriptor = "I")
    public int field1015 = -1;

    @OriginalMember(owner = "LPTCUHOU", name = "e", descriptor = "I")
    public int field1016 = -1;

    @OriginalMember(owner = "LPTCUHOU", name = "h", descriptor = "I")
    private int field1019 = 128;

    @OriginalMember(owner = "LPTCUHOU", name = "i", descriptor = "I")
    public int field1020 = -1;

    @OriginalMember(owner = "LPTCUHOU", name = "j", descriptor = "I")
    public int field1021 = -1;

    @OriginalMember(owner = "LPTCUHOU", name = "m", descriptor = "I")
    public int field1024 = -1;

    @OriginalMember(owner = "LPTCUHOU", name = "o", descriptor = "I")
    public int field1026 = 32;

    @OriginalMember(owner = "LPTCUHOU", name = "p", descriptor = "Z")
    public boolean field1027 = false;

    @OriginalMember(owner = "LPTCUHOU", name = "q", descriptor = "I")
    public int field1028 = -1;

    @OriginalMember(owner = "LPTCUHOU", name = "w", descriptor = "I")
    public int field1034 = -1;

    @OriginalMember(owner = "LPTCUHOU", name = "y", descriptor = "Z")
    private boolean field1036 = true;

    @OriginalMember(owner = "LPTCUHOU", name = "z", descriptor = "B")
    public byte field1037 = 1;

    @OriginalMember(owner = "LPTCUHOU", name = "A", descriptor = "I")
    public int field1038 = -1;

    @OriginalMember(owner = "LPTCUHOU", name = "D", descriptor = "I")
    public int field1041 = -1;

    @OriginalMember(owner = "LPTCUHOU", name = "F", descriptor = "J")
    public long field1043 = -1L;

    @OriginalMember(owner = "LPTCUHOU", name = "G", descriptor = "Z")
    private boolean field1044 = false;

    @OriginalMember(owner = "LPTCUHOU", name = "H", descriptor = "I")
    public int field1045 = -1;

    @OriginalMember(owner = "LPTCUHOU", name = "I", descriptor = "I")
    public int field1046 = -1;

    @OriginalMember(owner = "LPTCUHOU", name = "L", descriptor = "I")
    private int field1049 = 128;

    @OriginalMember(owner = "LPTCUHOU", name = "M", descriptor = "B")
    private byte field1050 = 1;

    @OriginalMember(owner = "LPTCUHOU", name = "t", descriptor = "LHGKRJZKS;")
    public static class24 field1031 = new class24(0, 30);

    @OriginalMember(owner = "LPTCUHOU", name = "l", descriptor = "I")
    private int field1023;

    @OriginalMember(owner = "LPTCUHOU", name = "v", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "LPTCUHOU", name = "C", descriptor = "I")
    private int field1040;

    @OriginalMember(owner = "LPTCUHOU", name = "K", descriptor = "I")
    private static int field1048;

    @OriginalMember(owner = "LPTCUHOU", name = "n", descriptor = "LGLMIQHJI;")
    private static class21 field1025;

    @OriginalMember(owner = "LPTCUHOU", name = "s", descriptor = "Lclient;")
    public static client field1030;

    @OriginalMember(owner = "LPTCUHOU", name = "c", descriptor = "Ljava/lang/String;")
    public String field1014;

    @OriginalMember(owner = "LPTCUHOU", name = "J", descriptor = "[B")
    public byte[] field1047;

    @OriginalMember(owner = "LPTCUHOU", name = "f", descriptor = "[I")
    private int[] field1017;

    @OriginalMember(owner = "LPTCUHOU", name = "g", descriptor = "[I")
    private int[] field1018;

    @OriginalMember(owner = "LPTCUHOU", name = "k", descriptor = "[I")
    private static int[] field1022;

    @OriginalMember(owner = "LPTCUHOU", name = "u", descriptor = "[I")
    private int[] field1032;

    @OriginalMember(owner = "LPTCUHOU", name = "x", descriptor = "[I")
    private int[] field1035;

    @OriginalMember(owner = "LPTCUHOU", name = "B", descriptor = "[I")
    public int[] field1039;

    @OriginalMember(owner = "LPTCUHOU", name = "r", descriptor = "[LLPTCUHOU;")
    private static class36[] field1029;

    @OriginalMember(owner = "LPTCUHOU", name = "E", descriptor = "[Ljava/lang/String;")
    public String[] field1042;

    @OriginalMember(owner = "LPTCUHOU", name = "a", descriptor = "(I)LVHYCWIPJ;")
    public final class53 method378(int arg0) {
        if (this.field1039 != null) {
            class36 var2 = this.method383(-23798);
            return var2 == null ? null : var2.method378(0);
        } else if (this.field1018 == null) {
            return null;
        } else {
            boolean var3 = false;
            if (arg0 != 0) {
                throw new NullPointerException();
            }
            for (int var4 = 0; var4 < this.field1018.length; var4++) {
                if (!class53.method501(this.field1018[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class53[] var5 = new class53[this.field1018.length];
            for (int var6 = 0; var6 < this.field1018.length; var6++) {
                var5[var6] = class53.method500((byte) 5, this.field1018[var6]);
            }
            class53 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class53(var5.length, var5, -11616);
            }
            if (this.field1035 != null) {
                for (int var8 = 0; var8 < this.field1035.length; var8++) {
                    var7.method514(this.field1035[var8], this.field1032[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "LPTCUHOU", name = "a", descriptor = "(BLGLMIQHJI;)V")
    private final void method379(byte arg0, class21 arg1) {
        if (arg0 != 8) {
            this.field1036 = !this.field1036;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method244();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg1.method244();
                    this.field1017 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1017[var5] = arg1.method246();
                    }
                } else if (var3 == 2) {
                    this.field1014 = arg1.method251();
                } else if (var3 == 3) {
                    this.field1047 = arg1.method252(false);
                } else if (var3 == 12) {
                    this.field1037 = arg1.method245();
                } else if (var3 == 13) {
                    this.field1038 = arg1.method246();
                } else if (var3 == 14) {
                    this.field1012 = arg1.method246();
                } else if (var3 == 17) {
                    this.field1012 = arg1.method246();
                    this.field1041 = arg1.method246();
                    this.field1046 = arg1.method246();
                    this.field1021 = arg1.method246();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field1042 == null) {
                        this.field1042 = new String[5];
                    }
                    this.field1042[var3 - 30] = arg1.method251();
                    if (this.field1042[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1042[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg1.method244();
                    this.field1035 = new int[var6];
                    this.field1032 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1035[var7] = arg1.method246();
                        this.field1032[var7] = arg1.method246();
                    }
                } else if (var3 == 60) {
                    int var8 = arg1.method244();
                    this.field1018 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1018[var9] = arg1.method246();
                    }
                } else if (var3 == 90) {
                    this.field1024 = arg1.method246();
                } else if (var3 == 91) {
                    this.field1016 = arg1.method246();
                } else if (var3 == 92) {
                    this.field1045 = arg1.method246();
                } else if (var3 == 93) {
                    this.field1013 = false;
                } else if (var3 == 95) {
                    this.field1015 = arg1.method246();
                } else if (var3 == 97) {
                    this.field1019 = arg1.method246();
                } else if (var3 == 98) {
                    this.field1049 = arg1.method246();
                } else if (var3 == 99) {
                    this.field1027 = true;
                } else if (var3 == 100) {
                    this.field1023 = arg1.method245();
                } else if (var3 == 101) {
                    this.field1040 = arg1.method245() * 5;
                } else if (var3 == 102) {
                    this.field1020 = arg1.method246();
                } else if (var3 == 103) {
                    this.field1026 = arg1.method246();
                } else if (var3 == 106) {
                    this.field1028 = arg1.method246();
                    if (this.field1028 == 65535) {
                        this.field1028 = -1;
                    }
                    this.field1034 = arg1.method246();
                    if (this.field1034 == 65535) {
                        this.field1034 = -1;
                    }
                    int var10 = arg1.method244();
                    this.field1039 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field1039[var11] = arg1.method246();
                        if (this.field1039[var11] == 65535) {
                            this.field1039[var11] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "LPTCUHOU", name = "b", descriptor = "(I)LLPTCUHOU;")
    public static final class36 method380(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1029[var1].field1043) {
                return field1029[var1];
            }
        }
        field1048 = (field1048 + 1) % 20;
        class36 var2 = field1029[field1048] = new class36();
        field1025.field818 = field1022[arg0];
        var2.field1043 = arg0;
        var2.method379((byte) 8, field1025);
        return var2;
    }

    @OriginalMember(owner = "LPTCUHOU", name = "a", descriptor = "(LXRWUKRPO;)V")
    public static final void method381(class65 arg0) {
        field1025 = new class21(arg0.method581("npc.dat", null), -49015);
        class21 var1 = new class21(arg0.method581("npc.idx", null), -49015);
        field1033 = var1.method246();
        field1022 = new int[field1033];
        int var2 = 2;
        for (int var3 = 0; var3 < field1033; var3++) {
            field1022[var3] = var2;
            var2 += var1.method246();
        }
        field1029 = new class36[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1029[var4] = new class36();
        }
    }

    @OriginalMember(owner = "LPTCUHOU", name = "a", descriptor = "([IIII)LVHYCWIPJ;")
    public final class53 method382(int[] arg0, int arg1, int arg2, int arg3) {
        if (this.field1039 != null) {
            class36 var5 = this.method383(-23798);
            return var5 == null ? null : var5.method382(arg0, arg1, 14442, arg3);
        }
        class53 var6 = (class53) field1031.method285(this.field1043);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1017.length; var8++) {
                if (!class53.method501(this.field1017[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class53[] var9 = new class53[this.field1017.length];
            for (int var10 = 0; var10 < this.field1017.length; var10++) {
                var9[var10] = class53.method500((byte) 5, this.field1017[var10]);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new class53(var9.length, var9, -11616);
            }
            if (this.field1035 != null) {
                for (int var11 = 0; var11 < this.field1035.length; var11++) {
                    var6.method514(this.field1035[var11], this.field1032[var11]);
                }
            }
            var6.method507(0);
            var6.method517(this.field1023 + 64, this.field1040 + 850, -30, -50, -30, true);
            field1031.method286(-43932, this.field1043, var6);
        }
        class53 var12 = class53.field1374;
        if (arg2 != 14442) {
            throw new NullPointerException();
        }
        var12.method502(var6, class51.method489(arg3, this.field1050) & class51.method489(arg1, this.field1050), 9);
        if (arg3 != -1 && arg1 != -1) {
            var12.method509(false, arg3, arg0, arg1);
        } else if (arg3 != -1) {
            var12.method508(999, arg3);
        }
        if (this.field1019 != 128 || this.field1049 != 128) {
            var12.method516(this.field1044, this.field1019, this.field1019, this.field1049);
        }
        var12.method504(43085);
        var12.field1411 = null;
        var12.field1410 = null;
        if (this.field1037 == 1) {
            var12.field1412 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "LPTCUHOU", name = "c", descriptor = "(I)LLPTCUHOU;")
    public final class36 method383(int arg0) {
        if (arg0 != -23798) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field1028 != -1) {
            class72 var3 = class72.field1710[this.field1028];
            int var4 = var3.field1712;
            int var5 = var3.field1713;
            int var6 = var3.field1714;
            int var7 = client.field569[var6 - var5];
            var2 = field1030.field492[var4] >> var5 & var7;
        } else if (this.field1034 != -1) {
            var2 = field1030.field492[this.field1034];
        }
        return var2 < 0 || var2 >= this.field1039.length || this.field1039[var2] == -1 ? null : method380(this.field1039[var2]);
    }

    @OriginalMember(owner = "LPTCUHOU", name = "d", descriptor = "(I)V")
    public static final void method384(int arg0) {
        field1031 = null;
        field1022 = null;
        field1029 = null;
        if (arg0 >= 2 && arg0 <= 2) {
            field1025 = null;
        }
    }
}
