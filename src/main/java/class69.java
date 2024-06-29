import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class69 {

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "Lej;")
    private class252 field970 = null;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "Lej;")
    private class252 field972 = null;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    private int field975 = 65000;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    private int field962;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "Lqj;")
    public static class196 field966 = class80.method502(")3runescape)3com)4l=", -48);

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "Lqj;")
    public static class196 field967 = class80.method502("rect_debug=", -48);

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static void method443(int arg0) {
        if (arg0 > -112) {
            method445(-122);
        }
        field966 = null;
        field967 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)[B")
    public final byte[] method444(int arg0, int arg1) {
        field968++;
        class252 var3 = this.field972;
        synchronized (this.field972) {
            try {
                if (this.field970.method1703(-126) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field970.method1704((byte) 115, (long) (arg1 * 6));
                this.field970.method1702(0, 6, class142.field2178, 0);
                int var5 = (class142.field2178[2] & 0xFF) + ((class142.field2178[0] & 0xFF) << 16) + ((class142.field2178[1] & 0xFF) << 8);
                int var6 = ((class142.field2178[3] & 0xFF) << 16) + ((class142.field2178[4] & 0xFF) << 8) + (class142.field2178[5] & 0xFF);
                if (var5 < 0 || this.field975 < var5) {
                    return null;
                } else if (var6 > 0 && this.field972.method1703(-120) / 520L >= (long) var6) {
                    int var9 = 0;
                    int var10 = 54 / ((6 - arg0) / 36);
                    byte[] var11 = new byte[var5];
                    int var12 = 0;
                    while (var9 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field972.method1704((byte) 125, (long) (var6 * 520));
                        int var14 = var5 - var9;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field972.method1702(0, var14 + 8, class142.field2178, 0);
                        int var15 = ((class142.field2178[2] & 0xFF) << 8) + (class142.field2178[3] & 0xFF);
                        int var16 = ((class142.field2178[0] & 0xFF) << 8) + (class142.field2178[1] & 0xFF);
                        int var17 = class142.field2178[7] & 0xFF;
                        int var18 = ((class142.field2178[5] & 0xFF) << 8) + ((class142.field2178[4] & 0xFF) << 16) + (class142.field2178[6] & 0xFF);
                        if (arg1 == var16 && var12 == var15 && this.field962 == var17) {
                            if (var18 >= 0 && (long) var18 <= this.field972.method1703(-116) / 520L) {
                                var6 = var18;
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var11[var9++] = class142.field2178[var21 + 8];
                                }
                                var12++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var11;
                } else {
                    return null;
                }
            } catch (IOException var40) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)Z")
    public static final boolean method445(int arg0) {
        long var1 = class183.method1195((byte) 123);
        int var3 = (int) (var1 - class64.field888);
        if (var3 > 200) {
            var3 = 200;
        }
        field974++;
        class169.field2852 += var3;
        class64.field888 = var1;
        if (class8.field84 == 0 && class72.field1045 == 0 && class192.field3366 == 0 && class45.field542 == 0) {
            return true;
        } else if (class50.field595 == null) {
            return false;
        } else {
            try {
                if (class169.field2852 > 30000) {
                    throw new IOException();
                }
                while (class72.field1045 < 20 && class45.field542 > 0) {
                    class182 var4 = (class182) class236.field4196.method1554(6539);
                    class56 var5 = new class56(4);
                    var5.method329((byte) 12, 1);
                    var5.method344((int) var4.field1850, 30848);
                    class50.field595.method484(var5.field693, 4, 0, 3);
                    class45.field534.method1552(var4, var4.field1850, 0);
                    class45.field542--;
                    class72.field1045++;
                }
                int var6 = 122 % ((-arg0 - 79) / 45);
                while (class8.field84 < 20 && class192.field3366 > 0) {
                    class182 var7 = (class182) class234.field4154.method40(100);
                    class56 var8 = new class56(4);
                    var8.method329((byte) 7, 0);
                    var8.method344((int) var7.field1850, 30848);
                    class50.field595.method484(var8.field693, 4, 0, 3);
                    var7.method920(-2);
                    class203.field3656.method1552(var7, var7.field1850, 0);
                    class192.field3366--;
                    class8.field84++;
                }
                for (int var9 = 0; var9 < 100; var9++) {
                    int var10 = class50.field595.method479(30000);
                    if (var10 < 0) {
                        throw new IOException();
                    }
                    if (var10 == 0) {
                        break;
                    }
                    class169.field2852 = 0;
                    byte var11 = 0;
                    if (class132.field1888 == null) {
                        var11 = 8;
                    } else if (class252.field4456 == 0) {
                        var11 = 1;
                    }
                    if (var11 > 0) {
                        int var12 = var11 - class27.field339.field699;
                        if (var10 < var12) {
                            var12 = var10;
                        }
                        class50.field595.method482((byte) 90, class27.field339.field699, var12, class27.field339.field693);
                        if (class76.field1098 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class27.field339.field693[class27.field339.field699 + var13] = (byte) class246.method1675(class27.field339.field693[class27.field339.field699 + var13], class76.field1098);
                            }
                        }
                        class27.field339.field699 += var12;
                        if (var11 > class27.field339.field699) {
                            break;
                        }
                        if (class132.field1888 == null) {
                            class27.field339.field699 = 0;
                            int var14 = class27.field339.method367(1);
                            int var15 = class27.field339.method318(true);
                            int var16 = class27.field339.method367(1);
                            int var17 = class27.field339.method311(0);
                            long var18 = (long) ((var14 << 16) + var15);
                            class182 var20 = (class182) class45.field534.method1551(32768, var18);
                            class103.field1495 = true;
                            if (var20 == null) {
                                var20 = (class182) class203.field3656.method1551(32768, var18);
                                class103.field1495 = false;
                            }
                            if (var20 == null) {
                                throw new IOException();
                            }
                            class132.field1888 = var20;
                            int var21 = var16 == 0 ? 5 : 9;
                            class253.field4481 = new class56(class132.field1888.field3210 + var21 + var17);
                            class253.field4481.method329((byte) 19, var16);
                            class253.field4481.method355((byte) -102, var17);
                            class252.field4456 = 8;
                            class27.field339.field699 = 0;
                        } else if (class252.field4456 == 0) {
                            if (class27.field339.field693[0] == -1) {
                                class252.field4456 = 1;
                                class27.field339.field699 = 0;
                            } else {
                                class132.field1888 = null;
                            }
                        }
                    } else {
                        int var22 = 512 - class252.field4456;
                        int var23 = class253.field4481.field693.length - class132.field1888.field3210;
                        if (var23 - class253.field4481.field699 < var22) {
                            var22 = var23 - class253.field4481.field699;
                        }
                        if (var22 > var10) {
                            var22 = var10;
                        }
                        class50.field595.method482((byte) 74, class253.field4481.field699, var22, class253.field4481.field693);
                        if (class76.field1098 != 0) {
                            for (int var24 = 0; var24 < var22; var24++) {
                                class253.field4481.field693[class253.field4481.field699 + var24] = (byte) class246.method1675(class253.field4481.field693[class253.field4481.field699 + var24], class76.field1098);
                            }
                        }
                        class253.field4481.field699 += var22;
                        class252.field4456 += var22;
                        if (class253.field4481.field699 == var23) {
                            if (class132.field1888.field1850 == 16711935L) {
                                class88.field1290 = class253.field4481;
                                for (int var25 = 0; var25 < 256; var25++) {
                                    class95 var26 = class63.field873[var25];
                                    if (var26 != null) {
                                        class88.field1290.field699 = var25 * 8 + 5;
                                        int var27 = class88.field1290.method311(0);
                                        int var28 = class88.field1290.method311(0);
                                        var26.method597(var27, 31219, var28);
                                    }
                                }
                            } else {
                                class157.field2535.reset();
                                class157.field2535.update(class253.field4481.field693, 0, var23);
                                int var29 = (int) class157.field2535.getValue();
                                if (class132.field1888.field3215 != var29) {
                                    try {
                                        class50.field595.method481(true);
                                    } catch (Exception var31) {
                                    }
                                    class76.field1098 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class53.field666++;
                                    class50.field595 = null;
                                    return false;
                                }
                                class165.field2686 = 0;
                                class53.field666 = 0;
                                class132.field1888.field3213.method595((class132.field1888.field1850 & 0xFF0000L) == 16711680L, (int) (class132.field1888.field1850 & 0xFFFFL), class253.field4481.field693, class103.field1495, 123);
                            }
                            class132.field1888.method797((byte) 109);
                            class252.field4456 = 0;
                            if (class103.field1495) {
                                class72.field1045--;
                            } else {
                                class8.field84--;
                            }
                            class253.field4481 = null;
                            class132.field1888 = null;
                        } else {
                            if (class252.field4456 != 512) {
                                break;
                            }
                            class252.field4456 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var32) {
                try {
                    class50.field595.method481(true);
                } catch (Exception var30) {
                }
                class165.field2686++;
                class50.field595 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([BZBII)Z")
    private final boolean method446(byte[] arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        field969++;
        class252 var6 = this.field972;
        synchronized (this.field972) {
            try {
                int var8;
                if (arg1) {
                    if (this.field970.method1703(-122) < (long) (arg4 * 6 + 6)) {
                        return false;
                    }
                    this.field970.method1704((byte) 120, (long) (arg4 * 6));
                    this.field970.method1702(0, 6, class142.field2178, 0);
                    var8 = ((class142.field2178[4] & 0xFF) << 8) + ((class142.field2178[3] & 0xFF) << 16) + (class142.field2178[5] & 0xFF);
                    if (var8 <= 0 || (long) var8 > this.field972.method1703(-126) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field972.method1703(-120) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class142.field2178[1] = (byte) (arg3 >> 8);
                class142.field2178[5] = (byte) var8;
                class142.field2178[2] = (byte) arg3;
                class142.field2178[3] = (byte) (var8 >> 16);
                class142.field2178[4] = (byte) (var8 >> 8);
                class142.field2178[0] = (byte) (arg3 >> 16);
                int var10 = 0;
                int var11 = 0;
                this.field970.method1704((byte) 123, (long) (arg4 * 6));
                this.field970.method1699(class142.field2178, true, 6, 0);
                while (true) {
                    if (var11 < arg3) {
                        label106: {
                            int var12 = 0;
                            if (arg1) {
                                label104: {
                                    this.field972.method1704((byte) 109, (long) (var8 * 520));
                                    try {
                                        this.field972.method1702(0, 8, class142.field2178, 0);
                                    } catch (EOFException var34) {
                                        break label106;
                                    }
                                    var12 = (class142.field2178[6] & 0xFF) + ((class142.field2178[5] & 0xFF) << 8) + ((class142.field2178[4] & 0xFF) << 16);
                                    int var13 = ((class142.field2178[0] & 0xFF) << 8) + (class142.field2178[1] & 0xFF);
                                    int var14 = class142.field2178[7] & 0xFF;
                                    int var15 = ((class142.field2178[2] & 0xFF) << 8) + (class142.field2178[3] & 0xFF);
                                    if (arg4 == var13 && var10 == var15 && this.field962 == var14) {
                                        if (var12 >= 0 && (long) var12 <= this.field972.method1703(-120) / 520L) {
                                            break label104;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                            }
                            if (var12 == 0) {
                                arg1 = false;
                                var12 = (int) ((this.field972.method1703(-119) + 519L) / 520L);
                                if (var12 == 0) {
                                    var12++;
                                }
                                if (var8 == var12) {
                                    var12++;
                                }
                            }
                            int var18 = arg3 - var11;
                            class142.field2178[3] = (byte) var10;
                            class142.field2178[0] = (byte) (arg4 >> 8);
                            class142.field2178[7] = (byte) this.field962;
                            if (var18 > 512) {
                                var18 = 512;
                            }
                            if (arg3 - var11 <= 512) {
                                var12 = 0;
                            }
                            class142.field2178[6] = (byte) var12;
                            class142.field2178[2] = (byte) (var10 >> 8);
                            class142.field2178[5] = (byte) (var12 >> 8);
                            var10++;
                            class142.field2178[4] = (byte) (var12 >> 16);
                            class142.field2178[1] = (byte) arg4;
                            this.field972.method1704((byte) 114, (long) (var8 * 520));
                            var8 = var12;
                            this.field972.method1699(class142.field2178, true, 8, 0);
                            this.field972.method1699(arg0, true, var18, var11);
                            var11 += var18;
                            continue;
                        }
                    }
                    int var19 = 87 / ((-arg2 - 60) / 61);
                    return true;
                }
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III[B)Z")
    public final boolean method447(int arg0, int arg1, int arg2, byte[] arg3) {
        field965++;
        class252 var5 = this.field972;
        synchronized (this.field972) {
            if (arg2 < 0 || this.field975 < arg2) {
                throw new IllegalArgumentException();
            }
            if (arg1 != 255) {
                this.method446(null, false, (byte) -59, 99, 121);
            }
            boolean var6 = this.method446(arg3, true, (byte) 64, arg2, arg0);
            if (!var6) {
                var6 = this.method446(arg3, false, (byte) -124, arg2, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method448(boolean arg0, Object arg1, int arg2) {
        field971++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class146.method912(var3, 0) : var3;
        } else if (arg1 instanceof class34) {
            class34 var4 = (class34) arg1;
            return var4.method177(94);
        } else {
            if (arg2 != 1) {
                field973 = 117;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ra", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field964++;
        return "Cache:" + this.field962;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(ILej;Lej;I)V")
    public class69(int arg0, class252 arg1, class252 arg2, int arg3) {
        this.field970 = arg2;
        this.field972 = arg1;
        this.field962 = arg0;
        this.field975 = arg3;
    }
}
