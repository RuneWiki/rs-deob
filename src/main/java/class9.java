import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class9 {

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    private int field132 = 65000;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "Lwk;")
    private class157 field139 = null;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "Lwk;")
    private class157 field137 = null;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    private int field130;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Lgl;")
    public static class172 field128 = new class172();

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "Z")
    public static boolean field138 = true;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Z")
    public static boolean field140 = true;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field142 = 0;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field141 = 0;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)[B")
    public final byte[] method51(int arg0, int arg1) {
        field143++;
        class157 var3 = this.field139;
        synchronized (this.field139) {
            try {
                if (arg0 != 512) {
                    method54((byte) -59);
                }
                if (this.field137.method1055((byte) -73) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field137.method1057((byte) 17, (long) (arg1 * 6));
                this.field137.method1058(0, 0, 6, class105.field1773);
                int var5 = (class105.field1773[1] & 0xFF << 8) + (((class105.field1773[0] & 0xFF) << 16) + (class105.field1773[2] & 0xFF));
                int var6 = ((class105.field1773[3] & 0xFF) << 16) + (class105.field1773[4] & 0xFF << 8) + (class105.field1773[5] & 0xFF);
                if (var5 < 0 || this.field132 < var5) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field139.method1055((byte) -128) / 520L) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        int var13 = var5 - var11;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field139.method1057((byte) 116, (long) (var6 * 520));
                        this.field139.method1058(0, 0, var13 + 8, class105.field1773);
                        int var14 = ((class105.field1773[0] & 0xFF) << 8) + (class105.field1773[1] & 0xFF);
                        int var15 = (class105.field1773[2] & 0xFF << 8) + (class105.field1773[3] & 0xFF);
                        int var16 = (class105.field1773[5] & 0xFF << 8) + (((class105.field1773[4] & 0xFF) << 16) + (class105.field1773[6] & 0xFF));
                        int var17 = class105.field1773[7] & 0xFF;
                        if (arg1 == var14 && var10 == var15 && this.field130 == var17) {
                            if (var16 >= 0 && (this.field139.method1055((byte) -63) / 520L) >= ((long) var16)) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var11++] = class105.field1773[var20 + 8];
                                }
                                var10++;
                                var6 = var16;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZIIZ)V")
    public static final void method52(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        class287.method1927(arg3, arg0, (byte) -34, arg2, class106.field1853.length - 1, arg4, arg1);
        field131++;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BIZI[B)Z")
    private final boolean method53(byte arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        field129++;
        class157 var6 = this.field139;
        synchronized (this.field139) {
            try {
                int var7;
                if (arg2) {
                    if (this.field137.method1055((byte) -63) < (long) (arg1 * 6 + 6)) {
                        return false;
                    }
                    this.field137.method1057((byte) 104, (long) (arg1 * 6));
                    this.field137.method1058(0, 0, 6, class105.field1773);
                    var7 = ((class105.field1773[3] & 0xFF) << 16) + (class105.field1773[5] & 0xFF) + ((class105.field1773[4] & 0xFF) << 8);
                    if (var7 <= 0 || (long) var7 > this.field139.method1055((byte) -115) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field139.method1055((byte) -119) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class105.field1773[2] = (byte) arg3;
                class105.field1773[3] = (byte) (var7 >> 16);
                class105.field1773[0] = (byte) (arg3 >> 16);
                class105.field1773[5] = (byte) var7;
                int var10 = 83 % (arg0 / 51);
                class105.field1773[4] = (byte) (var7 >> 8);
                class105.field1773[1] = (byte) (arg3 >> 8);
                this.field137.method1057((byte) -101, (long) (arg1 * 6));
                int var11 = 0;
                int var12 = 0;
                this.field137.method1050(class105.field1773, (byte) 45, 6, 0);
                while (arg3 > var11) {
                    int var13 = 0;
                    if (arg2) {
                        label105: {
                            this.field139.method1057((byte) 20, (long) (var7 * 520));
                            try {
                                this.field139.method1058(0, 0, 8, class105.field1773);
                            } catch (EOFException var34) {
                                return true;
                            }
                            var13 = (class105.field1773[5] & 0xFF << 8) + (((class105.field1773[4] & 0xFF) << 16) + (class105.field1773[6] & 0xFF));
                            int var14 = ((class105.field1773[0] & 0xFF) << 8) + (class105.field1773[1] & 0xFF);
                            int var15 = class105.field1773[7] & 0xFF;
                            int var16 = (class105.field1773[2] & 0xFF << 8) + (class105.field1773[3] & 0xFF);
                            if (arg1 == var14 && var12 == var16 && this.field130 == var15) {
                                if (var13 >= 0 && ((long) var13) <= (this.field139.method1055((byte) -70) / 520L)) {
                                    break label105;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg2 = false;
                        var13 = (int) ((this.field139.method1055((byte) -88) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    class105.field1773[3] = (byte) var12;
                    class105.field1773[1] = (byte) arg1;
                    class105.field1773[2] = (byte) (var12 >> 8);
                    var12++;
                    int var19 = arg3 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    class105.field1773[7] = (byte) this.field130;
                    class105.field1773[0] = (byte) (arg1 >> 8);
                    if (arg3 - var11 <= 512) {
                        var13 = 0;
                    }
                    class105.field1773[4] = (byte) (var13 >> 16);
                    class105.field1773[6] = (byte) var13;
                    class105.field1773[5] = (byte) (var13 >> 8);
                    this.field139.method1057((byte) 66, (long) (var7 * 520));
                    var7 = var13;
                    this.field139.method1050(class105.field1773, (byte) 45, 8, 0);
                    this.field139.method1050(arg4, (byte) 45, var19, var11);
                    var11 += var19;
                }
                return true;
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static void method54(byte arg0) {
        field128 = null;
        if (arg0 > -6) {
            method56(-98, 94);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([BIII)Z")
    public final boolean method55(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 21101) {
            method52(25, true, -5, 15, false);
        }
        field134++;
        class157 var5 = this.field139;
        synchronized (this.field139) {
            if (arg3 < 0 || this.field132 < arg3) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method53((byte) -121, arg1, true, arg3, arg0);
            if (!var6) {
                var6 = this.method53((byte) -66, arg1, false, arg3, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(II)Lse;")
    public static final class10 method56(int arg0, int arg1) {
        class10 var2 = (class10) class263.field4165.method1839((byte) 97, (long) arg0);
        field133++;
        if (var2 != null) {
            return var2;
        }
        class10 var3 = class115.method819(arg0, class286.field4556, true, class154.field2485, false);
        if (arg1 != 1545049680) {
            field128 = null;
        }
        if (var3 != null) {
            class263.field4165.method1830((long) arg0, arg1 - 1545049732, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field127++;
        return "Cache:" + this.field130;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILcb;)V")
    public static final void method57(int arg0, class255 arg1) {
        field135++;
        if (arg0 != -29652) {
            field141 = 65;
        }
        class14 var2 = null;
        class257.field4109 = 3;
        class101.method713(true, -21793);
        class283.field4508 = 0;
        field138 = true;
        class96.field1442 = true;
        class239.field3819 = 0;
        class45.field548 = 127;
        class205.field3279 = true;
        class96.field1454 = 2;
        class38.field468 = true;
        class168.field2735 = true;
        class195.field3161 = true;
        class133.field2207 = true;
        class92.field1319 = 255;
        class22.field270 = true;
        class285.field4549 = 0;
        class235.field3744 = true;
        class28.field339 = true;
        class183.field2928 = true;
        class153.field2469 = 127;
        class108.field1877 = 0;
        if (class30.field370 < 96) {
            class4.method31(0);
        } else {
            class4.method31(2);
        }
        class79.field1093 = false;
        class107.field1867 = false;
        class119.field2006 = false;
        class94.field1376 = true;
        class71.field981 = 0;
        class105.field1819 = 0;
        class207.field3332 = 0;
        try {
            class137 var3 = arg1.method1671((byte) -120, "runescape");
            while (var3.field2271 == 0) {
                class208.method1408(119, 1L);
            }
            if (var3.field2271 == 1) {
                var2 = (class14) var3.field2266;
                int var4 = 0;
                byte[] var5 = new byte[(int) var2.method110((byte) -121)];
                while (var5.length > var4) {
                    int var6 = var2.method108(var5.length - var4, var5, var4, arg0 ^ 0x73AB);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                    var4 += var6;
                }
                class238.method1575(new class264(var5), (byte) 38);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method109(-49);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lhk;Z)I")
    public static final int method58(class275 arg0, boolean arg1) {
        field136++;
        class265 var2 = arg0.field4439;
        if (var2.field4271 != null) {
            var2 = var2.method1794(-8159);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4263;
        class177 var4 = arg0.method375(0);
        if (arg0.field659 == var4.field2862) {
            var3 = var2.field4280;
        } else if (arg0.field659 == var4.field2831 || arg0.field659 == var4.field2865 || arg0.field659 == var4.field2838 || arg0.field659 == var4.field2856) {
            var3 = var2.field4304;
        } else if (arg0.field659 == var4.field2858 || arg0.field659 == var4.field2852 || arg0.field659 == var4.field2847 || arg0.field659 == var4.field2834) {
            var3 = var2.field4246;
        }
        if (arg1) {
            method54((byte) 121);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(ILwk;Lwk;I)V")
    public class9(int arg0, class157 arg1, class157 arg2, int arg3) {
        this.field139 = arg1;
        this.field132 = arg3;
        this.field130 = arg0;
        this.field137 = arg2;
    }
}
