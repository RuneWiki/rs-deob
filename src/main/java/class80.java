import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class80 {

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    private int field896 = 0;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public int field884;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "[Luj;")
    public class324[] field887;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field882 = -2;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "[I")
    public static int[] field888 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "J")
    private long field886;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Luj;")
    private class324 field889;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "Luj;")
    private class324 field895;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "Ljava/lang/String;")
    public static String field890;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I[Luj;)I")
    public final int method519(int arg0, class324[] arg1) {
        field894++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field884; var4++) {
            class324 var5 = this.field887[var4];
            for (class324 var6 = var5.field4681; var6 != var5; var6 = var6.field4681) {
                arg1[var3++] = var6;
            }
        }
        if (arg0 == 7710) {
            return var3;
        } else {
            return 125;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLuj;J)V")
    public final void method520(byte arg0, class324 arg1, long arg2) {
        if (arg1.field4677 != null) {
            arg1.method2108(true);
        }
        field879++;
        if (arg0 >= -50) {
            return;
        }
        class324 var5 = this.field887[(int) ((long) (this.field884 - 1) & arg2)];
        arg1.field4677 = var5.field4677;
        arg1.field4681 = var5;
        arg1.field4677.field4681 = arg1;
        arg1.field4681.field4677 = arg1;
        arg1.field4676 = arg2;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)I")
    public final int method521(byte arg0) {
        if (arg0 != -77) {
            return -50;
        }
        field893++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field884; var3++) {
            class324 var4 = this.field887[var3];
            for (class324 var5 = var4.field4681; var5 != var4; var5 = var5.field4681) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static final void method522(int arg0) {
        if (arg0 != -8676) {
            method531(-68, false, null);
        }
        field877++;
        class95.field1124.method1805(3);
        class460.field6862.method1805(63);
        class257.field3660.method1805(15);
        class30.field347.method1805(-122);
        class655.field9433.method1805(21);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)Luj;")
    public final class324 method523(int arg0) {
        int var2 = -2 / ((arg0 + 74) / 39);
        this.field896 = 0;
        field876++;
        return this.method530(12714);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BJ)Luj;")
    public final class324 method524(byte arg0, long arg1) {
        this.field886 = arg1;
        if (arg0 < 82) {
            method527(51);
        }
        field883++;
        class324 var4 = this.field887[(int) ((long) (this.field884 - 1) & arg1)];
        for (this.field889 = var4.field4681; this.field889 != var4; this.field889 = this.field889.field4681) {
            if (this.field889.field4676 == arg1) {
                class324 var5 = this.field889;
                this.field889 = this.field889.field4681;
                return var5;
            }
        }
        this.field889 = null;
        return null;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
    public static final void method525(int arg0) {
        field892++;
        class393 var1 = null;
        try {
            class175 var2 = class20.field197.method3161(false, false, "3");
            while (var2.field2138 == 0) {
                class646.method3696(arg0, 1L);
            }
            if (var2.field2138 == 2) {
                throw new RuntimeException("Error opening file");
            }
            if (arg0 != 1) {
                method527(-14);
            }
            var1 = (class393) var2.field2140;
            byte[] var3 = new byte[(int) var1.method2533((byte) 58)];
            if (var3.length == 0) {
                class240.field3409 = "";
                class506.field7343 = "";
            } else {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2531(var4, var3, -14263, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class194 var6 = new class194(var3);
                int var7 = var6.method1177(255);
                if (var7 > 50) {
                    throw new RuntimeException("Bad length");
                }
                var6.field2610 = var7 + 1;
                if (!var6.method1192(-17208)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field2610 = 1;
                int var8 = var6.method1177(255);
                if (var8 > 1) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class506.field7343 = var6.method1236((byte) -89);
                class240.field3409 = var6.method1236((byte) -58);
                if (var8 >= 1) {
                    class120.field1502 = var6.method1220(125);
                } else {
                    class120.field1502 = class448.field6686;
                }
            }
        } catch (Exception var10) {
            class506.field7343 = "";
            class240.field3409 = "";
        }
        try {
            if (var1 != null) {
                var1.method2528((byte) 118);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)Luj;")
    public final class324 method526(int arg0) {
        field880++;
        if (this.field889 == null) {
            return null;
        } else if (arg0 == 2) {
            class324 var2 = this.field887[(int) (this.field886 & (long) (this.field884 - 1))];
            while (this.field889 != var2) {
                if (this.field889.field4676 == this.field886) {
                    class324 var3 = this.field889;
                    this.field889 = this.field889.field4681;
                    return var3;
                }
                this.field889 = this.field889.field4681;
            }
            this.field889 = null;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V")
    public static void method527(int arg0) {
        field888 = null;
        field890 = null;
        if (arg0 < 120) {
            field888 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)V")
    public final void method528(int arg0) {
        if (arg0 != -519011192) {
            return;
        }
        for (int var2 = 0; var2 < this.field884; var2++) {
            class324 var3 = this.field887[var2];
            while (true) {
                class324 var4 = var3.field4681;
                if (var3 == var4) {
                    break;
                }
                var4.method2108(true);
            }
        }
        field885++;
        this.field889 = null;
        this.field895 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)I")
    public final int method529(boolean arg0) {
        if (arg0) {
            this.method524((byte) -125, 101L);
        }
        field878++;
        return this.field884;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(I)V")
    public class80(int arg0) {
        this.field884 = arg0;
        this.field887 = new class324[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class324 var3 = this.field887[var2] = new class324();
            var3.field4681 = var3;
            var3.field4677 = var3;
        }
    }

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)Luj;")
    public final class324 method530(int arg0) {
        field881++;
        if (this.field896 > 0 && this.field887[this.field896 - 1] != this.field895) {
            class324 var2 = this.field895;
            this.field895 = var2.field4681;
            return var2;
        }
        if (arg0 != 12714) {
            this.method523(-31);
        }
        while (this.field884 > this.field896) {
            class324 var3 = this.field887[this.field896++].field4681;
            if (this.field887[this.field896 - 1] != var3) {
                this.field895 = var3.field4681;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZLkr;)Z")
    public static final boolean method531(int arg0, boolean arg1, class645 arg2) {
        field891++;
        int var3 = arg2.method3671(2, (byte) 17);
        if (var3 == 0) {
            if (arg2.method3671(1, (byte) 17) != 0) {
                method531(arg0, true, arg2);
            }
            int var4 = arg2.method3671(6, (byte) 17);
            int var5 = arg2.method3671(6, (byte) 17);
            boolean var6 = arg2.method3671(1, (byte) 17) == 1;
            if (var6) {
                class224.field3146[class344.field4914++] = arg0;
            }
            if (class142.field1749[arg0] != null) {
                throw new RuntimeException("hr:lr");
            }
            class110 var7 = class554.field7859[arg0];
            class655 var8 = class142.field1749[arg0] = new class655();
            var8.field2495 = arg0;
            if (class444.field6644[arg0] != null) {
                var8.method3739(23402856, class444.field6644[arg0]);
            }
            var8.method1149(var7.field1350, 100, true);
            var8.field2469 = var7.field1351;
            int var9 = var7.field1353;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FE1E9) >> 14;
            var8.field9476 = var7.field1347;
            int var12 = var9 & 0xFF;
            var8.field2525[0] = class297.field4401[arg0];
            var8.field1757 = (byte) var10;
            var8.method3736((var11 << 6) + var4 - class287.field3980, 0, (var12 << 6) + var5 - class250.field3549);
            var8.field9472 = false;
            class554.field7859[arg0] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg2.method3671(2, (byte) 17);
            int var14 = class554.field7859[arg0].field1353;
            class554.field7859[arg0].field1353 = ((var14 >> 28) + var13 & 0x3 << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg2.method3671(5, (byte) 17);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class554.field7859[arg0].field1353;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = (var18 & 0x3FCD5D) >> 14;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var21--;
                var20--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var20++;
                var21--;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var20--;
                var21++;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var20++;
                var21++;
            }
            class554.field7859[arg0].field1353 = (var20 << 14) + (var19 << 28) + var21;
            return false;
        } else {
            int var22 = arg2.method3671(18, (byte) 17);
            if (!arg1) {
                field890 = null;
            }
            int var23 = var22 >> 16;
            int var24 = var22 >> 8 & 0xFF;
            int var25 = var22 & 0xFF;
            int var26 = class554.field7859[arg0].field1353;
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var25 + var26 & 0xFF;
            class554.field7859[arg0].field1353 = (var27 << 28) + var29 + (var28 << 14);
            return false;
        }
    }
}
