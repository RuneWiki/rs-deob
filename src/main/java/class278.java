import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class278 {

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "Lmi;")
    private class256 field4557 = null;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    private int field4559 = 65000;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "Lmi;")
    private class256 field4558 = null;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    private int field4547;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4548 = "cyan:";

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "[Z")
    public static boolean[] field4553 = new boolean[100];

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field4552 = 0;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!hi", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4550++;
        return "Cache:" + this.field4547;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static final void method1921(int arg0) {
        field4560++;
        int[] var1 = new int[class148.field2202];
        int var2 = 0;
        for (int var3 = arg0; var3 < class148.field2202; var3++) {
            class162 var5 = class104.method696((byte) -26, var3);
            if (var5.field2479 >= 0 || var5.field2438 >= 0) {
                var1[var2++] = var3;
            }
        }
        class39.field471 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class39.field471[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II[BI)Z")
    public final boolean method1922(int arg0, int arg1, byte[] arg2, int arg3) {
        field4554++;
        class256 var5 = this.field4557;
        synchronized (this.field4557) {
            if (arg0 < 0 || arg0 > this.field4559) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1924(true, arg2, arg0, -375107096, arg3);
            if (!var6) {
                var6 = this.method1924(false, arg2, arg0, -375107096, arg3);
            }
            return arg1 > -77 ? true : var6;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)[B")
    public final byte[] method1923(int arg0, int arg1) {
        field4549++;
        class256 var3 = this.field4557;
        synchronized (this.field4557) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field4558.method1812(false)) {
                    return null;
                }
                this.field4558.method1815((long) (arg0 * 6), (byte) 98);
                this.field4558.method1810(6, class113.field1658, 0, arg1 - 122);
                int var5 = (class113.field1658[2] & 0xFF) + ((class113.field1658[0] & 0xFF << 16) + (class113.field1658[1] & 0xFF << 8));
                int var6 = (class113.field1658[3] & 0xFF << 16) + (class113.field1658[5] & 0xFF) + (class113.field1658[4] & 0xFF << 8);
                if (var5 < 0 || this.field4559 < var5) {
                    return null;
                } else if (var6 > 0 && this.field4557.method1812(false) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    if (arg1 != 8) {
                        this.field4558 = null;
                    }
                    int var11 = 0;
                    label74: while (var11 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field4557.method1815((long) (var6 * 520), (byte) 98);
                        int var13 = var5 - var11;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field4557.method1810(var13 + 8, class113.field1658, 0, -116);
                        int var14 = (class113.field1658[6] & 0xFF) + (((class113.field1658[4] & 0xFF) << 16) + ((class113.field1658[5] & 0xFF) << 8));
                        int var15 = class113.field1658[7] & 0xFF;
                        int var16 = ((class113.field1658[0] & 0xFF) << 8) + (class113.field1658[1] & 0xFF);
                        int var17 = (class113.field1658[2] & 0xFF << 8) + (class113.field1658[3] & 0xFF);
                        if (arg0 == var16 && var10 == var17 && this.field4547 == var15) {
                            if (var14 >= 0 && (long) var14 <= this.field4557.method1812(false) / 520L) {
                                var10++;
                                var6 = var14;
                                int var20 = 0;
                                while (true) {
                                    if (var20 >= var13) {
                                        continue label74;
                                    }
                                    var9[var11++] = class113.field1658[var20 + 8];
                                    var20++;
                                }
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

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z[BIII)Z")
    private final boolean method1924(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        field4555++;
        class256 var6 = this.field4557;
        synchronized (this.field4557) {
            try {
                int var8;
                if (arg0) {
                    if (this.field4558.method1812(false) < (long) (arg4 * 6 + 6)) {
                        return false;
                    }
                    this.field4558.method1815((long) (arg4 * 6), (byte) 98);
                    this.field4558.method1810(6, class113.field1658, 0, arg3 + 375106980);
                    var8 = ((class113.field1658[3] & 0xFF) << 16) - (-(class113.field1658[4] & 0xFF << 8) - (class113.field1658[5] & 0xFF));
                    if (var8 <= 0 || (long) var8 > this.field4557.method1812(false) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field4557.method1812(false) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class113.field1658[5] = (byte) var8;
                class113.field1658[2] = (byte) arg2;
                class113.field1658[1] = (byte) (arg2 >> 8);
                class113.field1658[3] = (byte) (var8 >> 16);
                if (arg3 != -375107096) {
                    return false;
                }
                class113.field1658[0] = (byte) (arg2 >> 16);
                class113.field1658[4] = (byte) (var8 >> 8);
                int var11 = 0;
                this.field4558.method1815((long) (arg4 * 6), (byte) 98);
                this.field4558.method1819(0, -1, class113.field1658, 6);
                int var12 = 0;
                while (arg2 > var11) {
                    int var13 = 0;
                    if (arg0) {
                        label110: {
                            this.field4557.method1815((long) (var8 * 520), (byte) 98);
                            try {
                                this.field4557.method1810(8, class113.field1658, 0, -120);
                            } catch (EOFException var36) {
                                return true;
                            }
                            var13 = (class113.field1658[5] & 0xFF << 8) + (class113.field1658[4] & 0xFF << 16) + (class113.field1658[6] & 0xFF);
                            int var14 = ((class113.field1658[0] & 0xFF) << 8) + (class113.field1658[1] & 0xFF);
                            int var15 = class113.field1658[7] & 0xFF;
                            int var16 = ((class113.field1658[2] & 0xFF) << 8) + (class113.field1658[3] & 0xFF);
                            if (arg4 == var14 && var12 == var16 && this.field4547 == var15) {
                                if (var13 >= 0 && this.field4557.method1812(false) / 520L >= (long) var13) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var19 = arg2 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    if (var13 == 0) {
                        arg0 = false;
                        var13 = (int) ((this.field4557.method1812(false) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    if ((arg2 - var11) <= 512) {
                        var13 = 0;
                    }
                    class113.field1658[7] = (byte) this.field4547;
                    class113.field1658[4] = (byte) (var13 >> 16);
                    class113.field1658[6] = (byte) var13;
                    class113.field1658[5] = (byte) (var13 >> 8);
                    class113.field1658[0] = (byte) (arg4 >> 8);
                    class113.field1658[3] = (byte) var12;
                    class113.field1658[1] = (byte) arg4;
                    class113.field1658[2] = (byte) (var12 >> 8);
                    var12++;
                    this.field4557.method1815((long) (var8 * 520), (byte) 98);
                    this.field4557.method1819(0, -1, class113.field1658, 8);
                    this.field4557.method1819(var11, -1, arg1, var19);
                    var8 = var13;
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public static final void method1925(byte arg0) {
        field4551++;
        class247.method1761(class142.field2079, (byte) -121);
        class171.field2688++;
        if (class237.field3811 && class45.field547) {
            int var1 = class71.field1042;
            int var2 = class50.field633;
            int var3 = var2 - class71.field1052;
            int var4 = var1 - class68.field1014;
            if (var4 < class134.field1939) {
                var4 = class134.field1939;
            }
            if (class258.field4199 > var3) {
                var3 = class258.field4199;
            }
            if ((class142.field2079.field3730 + var3) > (class258.field4199 + class82.field1247.field3730)) {
                var3 = class258.field4199 + class82.field1247.field3730 - class142.field2079.field3730;
            }
            int var5 = var3 - class206.field3230;
            if (arg0 == -65) {
                if (var4 + class142.field2079.field3686 > class134.field1939 + class82.field1247.field3686) {
                    var4 = class82.field1247.field3686 + class134.field1939 - class142.field2079.field3686;
                }
                int var6 = class142.field2079.field3728;
                int var7 = var4 - class90.field1361;
                if (class171.field2688 > class142.field2079.field3670 && (var5 > var6 || (-var6) > var5 || var7 > var6 || -var6 > var7)) {
                    class40.field479 = true;
                }
                int var8 = var3 + class82.field1247.field3616 - class258.field4199;
                int var9 = var4 + class82.field1247.field3661 - class134.field1939;
                if (class142.field2079.field3666 != null && class40.field479) {
                    class122 var10 = new class122();
                    var10.field1755 = class142.field2079.field3666;
                    var10.field1750 = var9;
                    var10.field1752 = class142.field2079;
                    var10.field1753 = var8;
                    class122.method795(var10, -94);
                }
                if (class284.field4606 == 0) {
                    if (class40.field479) {
                        if (class142.field2079.field3732 != null) {
                            class122 var11 = new class122();
                            var11.field1752 = class142.field2079;
                            var11.field1759 = class80.field1227;
                            var11.field1755 = class142.field2079.field3732;
                            var11.field1750 = var9;
                            var11.field1753 = var8;
                            class122.method795(var11, arg0 - 35);
                        }
                        if (class80.field1227 != null && client.method1709(class142.field2079) != null) {
                            class150.field2218.method445(124, 7);
                            class150.field2218.method1210(class80.field1227.field3595, (byte) -16);
                            class63.field915++;
                            class150.field2218.method1203(class142.field2079.field3739, arg0 ^ 0xD56455D7);
                            class150.field2218.method1213(class80.field1227.field3739, (byte) -108);
                            class150.field2218.method1210(class142.field2079.field3595, (byte) -16);
                        }
                    } else if ((class10.field153 == 1 || class10.method62(class173.field2721 - 1, true)) && class173.field2721 > 2) {
                        class300.method2017(109);
                    } else if (class173.field2721 > 0) {
                        class171.method1223(arg0 ^ 0x42);
                    }
                    class142.field2079 = null;
                }
            }
        } else if (class171.field2688 > 1) {
            class142.field2079 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
    public static void method1926(int arg0) {
        if (arg0 != 3) {
            field4548 = null;
        }
        field4548 = null;
        field4553 = null;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(ILmi;Lmi;I)V")
    public class278(int arg0, class256 arg1, class256 arg2, int arg3) {
        this.field4559 = arg3;
        this.field4547 = arg0;
        this.field4558 = arg2;
        this.field4557 = arg1;
    }
}
