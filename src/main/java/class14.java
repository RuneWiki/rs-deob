import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class14 {

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "Laj;")
    private class209 field148 = null;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    private int field147 = 65000;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "Laj;")
    private class209 field154 = null;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    private int field158;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "Lpn;")
    public static class49 field150 = new class49(44, 2);

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "Ljp;")
    public static class55 field156 = new class55(37, 5);

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 4)
    public static void method80(int arg0) {
        field156 = null;
        field150 = null;
        if (arg0 < 47) {
            method85(-89, -108);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIZ[B)Z", line = 18)
    public static final boolean method81(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5) {
        field152++;
        boolean var6 = arg4;
        class194 var7 = new class194(arg5);
        int var8 = -1;
        label54: while (true) {
            int var9 = var7.method1390(1905);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method1340(-93);
                    if (var13 == 0) {
                        continue label54;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = var10 >> 6 & 0x3F;
                    int var16 = var7.method1337((byte) 75) >> 2;
                    int var17 = arg1 + var15;
                    int var18 = arg0 + var14;
                    if (var17 > 0 && var18 > 0 && arg3 - 1 > var17 && (arg2 - 1) > var18) {
                        class395 var19 = class247.field3693.method2281(var8, -9380);
                        if (var16 != 22 || class40.field667.field4195 || var19.field5840 != 0 || var19.field5827 == 1 || var19.field5787) {
                            var11 = true;
                            if (!var19.method2500((byte) -121)) {
                                var6 = false;
                                class47.field739++;
                            }
                        }
                    }
                }
                int var12 = var7.method1340(-64);
                if (var12 == 0) {
                    break;
                }
                var7.method1337((byte) 93);
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z[BIII)Z", line = 100)
    private final boolean method82(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        field159++;
        class209 var6 = this.field148;
        synchronized (this.field148) {
            try {
                int var7;
                if (arg0) {
                    if (this.field154.method1458((byte) 30) < (long) (arg3 * 6 + 6)) {
                        return false;
                    }
                    this.field154.method1460((long) (arg3 * 6), -60);
                    this.field154.method1455(false, class86.field1399, 6, 0);
                    var7 = ((class86.field1399[3] & 0xFF) << 16) + (class86.field1399[4] & 0xFF << 8) + (class86.field1399[5] & 0xFF);
                    if (var7 <= 0 || (this.field148.method1458((byte) 83) / 520L) < ((long) var7)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field148.method1458((byte) 84) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class86.field1399[3] = (byte) (var7 >> 16);
                class86.field1399[4] = (byte) (var7 >> 8);
                class86.field1399[1] = (byte) (arg4 >> 8);
                class86.field1399[2] = (byte) arg4;
                class86.field1399[5] = (byte) var7;
                class86.field1399[0] = (byte) (arg4 >> 16);
                this.field154.method1460((long) (arg3 * 6), -103);
                this.field154.method1461(-1675, 0, 6, class86.field1399);
                int var10 = 0;
                int var11 = 0;
                while (true) {
                    if (arg4 > var10) {
                        label107: {
                            int var12 = 0;
                            if (arg0) {
                                label105: {
                                    this.field148.method1460((long) (var7 * 520), -43);
                                    try {
                                        this.field148.method1455(false, class86.field1399, 8, 0);
                                    } catch (EOFException var34) {
                                        break label107;
                                    }
                                    int var13 = ((class86.field1399[0] & 0xFF) << 8) + (class86.field1399[1] & 0xFF);
                                    int var14 = (class86.field1399[2] & 0xFF << 8) + (class86.field1399[3] & 0xFF);
                                    var12 = (class86.field1399[5] & 0xFF << 8) + (class86.field1399[4] & 0xFF << 16) + (class86.field1399[6] & 0xFF);
                                    int var15 = class86.field1399[7] & 0xFF;
                                    if (arg3 == var13 && var11 == var14 && this.field158 == var15) {
                                        if (var12 >= 0 && ((long) var12) <= (this.field148.method1458((byte) 122) / 520L)) {
                                            break label105;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                            }
                            if (var12 == 0) {
                                var12 = (int) ((this.field148.method1458((byte) 112) + 519L) / 520L);
                                arg0 = false;
                                if (var12 == 0) {
                                    var12++;
                                }
                                if (var7 == var12) {
                                    var12++;
                                }
                            }
                            if ((arg4 - var10) <= 512) {
                                var12 = 0;
                            }
                            class86.field1399[2] = (byte) (var11 >> 8);
                            class86.field1399[0] = (byte) (arg3 >> 8);
                            class86.field1399[3] = (byte) var11;
                            class86.field1399[1] = (byte) arg3;
                            class86.field1399[7] = (byte) this.field158;
                            class86.field1399[4] = (byte) (var12 >> 16);
                            class86.field1399[5] = (byte) (var12 >> 8);
                            class86.field1399[6] = (byte) var12;
                            this.field148.method1460((long) (var7 * 520), -119);
                            this.field148.method1461(-1675, 0, 8, class86.field1399);
                            int var18 = arg4 - var10;
                            if (var18 > 512) {
                                var18 = 512;
                            }
                            this.field148.method1461(-1675, var10, var18, arg1);
                            var10 += var18;
                            var11++;
                            var7 = var12;
                            continue;
                        }
                    }
                    int var19 = 111 / ((arg2 + 33) / 46);
                    return true;
                }
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 221)
    public static final void method83(byte arg0) {
        class281.field4379.method1655(32000);
        field157++;
        class312.field4752.field2982 = 0;
        class498.field7255 = null;
        class61.field978 = 0;
        class424.field6231.field2982 = 0;
        class404.field5966 = null;
        class136.field2073 = null;
        class527.field7716 = null;
        class457.field6788 = 0;
        for (int var1 = 0; var1 < 100; var1++) {
            class451.field6714[var1] = null;
        }
        if (arg0 > -75) {
            method81(-19, -58, -70, 92, false, null);
        }
        class6.field76 = 0;
        class168.field2539 = 0;
        class216.field3274 = null;
        class94.field1505 = 0;
        class6.field80 = 0;
        class433.field6436 = null;
    }

    @OriginalMember(owner = "client!cn", name = "toString", descriptor = "()Ljava/lang/String;", line = 254)
    public final String toString() {
        field151++;
        return "Cache:" + this.field158;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(ILaj;Laj;I)V", line = 420)
    public class14(int arg0, class209 arg1, class209 arg2, int arg3) {
        this.field154 = arg2;
        this.field147 = arg3;
        this.field148 = arg1;
        this.field158 = arg0;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I[BIB)Z", line = 277)
    public final boolean method84(int arg0, byte[] arg1, int arg2, byte arg3) {
        field155++;
        class209 var5 = this.field148;
        synchronized (this.field148) {
            if (arg2 < 0 || this.field147 < arg2) {
                throw new IllegalArgumentException();
            }
            int var6 = -75 / ((17 - arg3) / 62);
            boolean var7 = this.method82(true, arg1, -128, arg0, arg2);
            if (!var7) {
                var7 = this.method82(false, arg1, -102, arg0, arg2);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)Lsc;", line = 307)
    public static final class270 method85(int arg0, int arg1) {
        field153++;
        class270[] var2 = class184.method1286(81);
        int var3 = 0;
        if (arg1 != -28358) {
            return null;
        }
        while (var3 < var2.length) {
            if (var2[var3].field4274 == arg0) {
                return var2[var3];
            }
            var3++;
        }
        return null;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)[B", line = 336)
    public final byte[] method86(int arg0, int arg1) {
        field149++;
        class209 var3 = this.field148;
        synchronized (this.field148) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field154.method1458((byte) 16)) {
                    return null;
                }
                this.field154.method1460((long) (arg0 * 6), -101);
                this.field154.method1455(false, class86.field1399, 6, 0);
                int var5 = (class86.field1399[2] & 0xFF) + ((class86.field1399[0] & 0xFF << 16) + ((class86.field1399[1] & 0xFF) << 8));
                int var6 = ((class86.field1399[3] & 0xFF) << 16) - (-((class86.field1399[4] & 0xFF) << 8) - (class86.field1399[5] & 0xFF));
                if (var5 < 0 || this.field147 < var5) {
                    return null;
                } else if (var6 > 0 && this.field148.method1458((byte) 125) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    label76: while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field148.method1460((long) (var6 * 520), -45);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field148.method1455(false, class86.field1399, var13 + 8, 0);
                        int var14 = (class86.field1399[0] & 0xFF << 8) + (class86.field1399[1] & 0xFF);
                        int var15 = ((class86.field1399[2] & 0xFF) << 8) + (class86.field1399[3] & 0xFF);
                        int var16 = ((class86.field1399[4] & 0xFF) << 16) + (class86.field1399[5] & 0xFF << 8) + (class86.field1399[6] & 0xFF);
                        int var17 = class86.field1399[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field158 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field148.method1458((byte) 30) / 520L) {
                                var6 = var16;
                                var11++;
                                int var20 = 0;
                                while (true) {
                                    if (var20 >= var13) {
                                        continue label76;
                                    }
                                    var9[var10++] = class86.field1399[var20 + 8];
                                    var20++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    if (arg1 <= 124) {
                        return null;
                    } else {
                        return var9;
                    }
                } else {
                    return null;
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }
}
