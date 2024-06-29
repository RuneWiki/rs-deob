import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class105 {

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    private int field1422 = 65000;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Ldi;")
    private class99 field1429 = null;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Ldi;")
    private class99 field1426 = null;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    private int field1432;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "Lef;")
    public static class241 field1423 = new class241(128);

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1430 = " is already on your friend list.";

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1434 = "purple:";

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "[[[I")
    public static int[][][] field1428;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)[B")
    public final byte[] method634(int arg0, int arg1) {
        field1431++;
        class99 var3 = this.field1429;
        synchronized (this.field1429) {
            try {
                if (this.field1426.method603((byte) 104) < ((long) (arg1 * 6 + 6))) {
                    return null;
                }
                this.field1426.method605(false, (long) (arg1 * 6));
                this.field1426.method602((byte) -7, class156.field2250, 6, 0);
                int var5 = ((class156.field2250[3] & 0xFF) << 16) + (class156.field2250[5] & 0xFF) + ((class156.field2250[4] & 0xFF) << 8);
                int var6 = ((class156.field2250[1] & 0xFF) << 8) + ((class156.field2250[0] & 0xFF) << 16) + (class156.field2250[2] & 0xFF);
                if (arg0 != 1288987528) {
                    field1423 = null;
                }
                if (var6 < 0 || var6 > this.field1422) {
                    return null;
                } else if (var5 > 0 && (long) var5 <= this.field1429.method603((byte) 46) / 520L) {
                    byte[] var9 = new byte[var6];
                    int var10 = 0;
                    int var11 = 0;
                    while (var6 > var10) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field1429.method605(false, (long) (var5 * 520));
                        int var13 = var6 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field1429.method602((byte) -46, class156.field2250, var13 + 8, 0);
                        int var14 = (class156.field2250[2] & 0xFF << 8) + (class156.field2250[3] & 0xFF);
                        int var15 = ((class156.field2250[0] & 0xFF) << 8) + (class156.field2250[1] & 0xFF);
                        int var16 = class156.field2250[7] & 0xFF;
                        int var17 = (class156.field2250[6] & 0xFF) + ((class156.field2250[5] & 0xFF) << 8) + ((class156.field2250[4] & 0xFF) << 16);
                        if (arg1 == var15 && var11 == var14 && this.field1432 == var16) {
                            if (var17 >= 0 && this.field1429.method603((byte) 22) / 520L >= (long) var17) {
                                var11++;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class156.field2250[var20 + 8];
                                }
                                var5 = var17;
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

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static final void method635(int arg0) {
        field1433++;
        class59.field703.method71(-74);
        class227.field3199.method71(-102);
        class110.field1471.method71(-98);
        if (arg0 >= 116) {
            class118.field1667.method71(-119);
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public static void method636(int arg0) {
        field1428 = null;
        field1430 = null;
        field1423 = null;
        if (arg0 != 6) {
            method637(124, -50, 35, -79, 116, -79);
        }
        field1434 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIII)V")
    public static final void method637(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1427++;
        int var6 = arg3 - arg5;
        int var7 = arg1 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class45.method287(arg5, (byte) -121, arg1, arg4, arg2);
            }
        } else if (var7 == 0) {
            class192.method1248(arg4, arg2, arg3, 88, arg5);
        } else {
            int var8 = (var7 << 12) / var6;
            if (arg0 != 1124985996) {
                method637(21, -5, -75, -73, 106, -104);
            }
            int var9 = arg4 - (arg5 * var8 >> 12);
            int var10;
            int var11;
            if (arg3 < class177.field2514) {
                var10 = var9 + (class177.field2514 * var8 >> 12);
                var11 = class177.field2514;
            } else if (class279.field4238 < arg3) {
                var11 = class279.field4238;
                var10 = (class279.field4238 * var8 >> 12) + var9;
            } else {
                var11 = arg3;
                var10 = arg1;
            }
            int var12;
            int var13;
            if (class177.field2514 > arg5) {
                var12 = class177.field2514;
                var13 = (class177.field2514 * var8 >> 12) + var9;
            } else if (class279.field4238 < arg5) {
                var12 = class279.field4238;
                var13 = (class279.field4238 * var8 >> 12) + var9;
            } else {
                var13 = arg4;
                var12 = arg5;
            }
            if (var13 < class286.field4431) {
                var12 = (class286.field4431 - var9 << 12) / var8;
                var13 = class286.field4431;
            } else if (var13 > class230.field3302) {
                var13 = class230.field3302;
                var12 = (class230.field3302 - var9 << 12) / var8;
            }
            if (class286.field4431 > var10) {
                var11 = (class286.field4431 - var9 << 12) / var8;
                var10 = class286.field4431;
            } else if (class230.field3302 < var10) {
                var11 = (class230.field3302 - var9 << 12) / var8;
                var10 = class230.field3302;
            }
            class71.method438(var10, var13, (byte) 79, arg2, var12, var11);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[BII)Z")
    public final boolean method638(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 != 6) {
            method637(67, 101, 124, 6, 113, 121);
        }
        field1421++;
        class99 var5 = this.field1429;
        synchronized (this.field1429) {
            if (arg3 < 0 || this.field1422 < arg3) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method639(arg2, true, arg1, arg3, (byte) -71);
            if (!var6) {
                var6 = this.method639(arg2, false, arg1, arg3, (byte) 112);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ[BIB)Z")
    private final boolean method639(int arg0, boolean arg1, byte[] arg2, int arg3, byte arg4) {
        field1424++;
        class99 var6 = this.field1429;
        synchronized (this.field1429) {
            try {
                int var8;
                if (arg1) {
                    if (((long) (arg0 * 6 + 6)) > this.field1426.method603((byte) 87)) {
                        return false;
                    }
                    this.field1426.method605(false, (long) (arg0 * 6));
                    this.field1426.method602((byte) -115, class156.field2250, 6, 0);
                    var8 = (class156.field2250[5] & 0xFF) + ((class156.field2250[4] & 0xFF) << 8) + ((class156.field2250[3] & 0xFF) << 16);
                    if (var8 <= 0 || ((long) var8) > (this.field1429.method603((byte) 51) / 520L)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field1429.method603((byte) 67) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class156.field2250[0] = (byte) (arg3 >> 16);
                class156.field2250[2] = (byte) arg3;
                class156.field2250[1] = (byte) (arg3 >> 8);
                int var10 = -117 / ((52 - arg4) / 55);
                class156.field2250[5] = (byte) var8;
                int var11 = 0;
                int var12 = 0;
                class156.field2250[4] = (byte) (var8 >> 8);
                class156.field2250[3] = (byte) (var8 >> 16);
                this.field1426.method605(false, (long) (arg0 * 6));
                this.field1426.method604(0, class156.field2250, 6, 255);
                while (var11 < arg3) {
                    int var13 = 0;
                    if (arg1) {
                        label104: {
                            this.field1429.method605(false, (long) (var8 * 520));
                            try {
                                this.field1429.method602((byte) -63, class156.field2250, 8, 0);
                            } catch (EOFException var34) {
                                return true;
                            }
                            int var14 = (class156.field2250[2] & 0xFF << 8) + (class156.field2250[3] & 0xFF);
                            int var15 = class156.field2250[7] & 0xFF;
                            int var16 = ((class156.field2250[0] & 0xFF) << 8) + (class156.field2250[1] & 0xFF);
                            var13 = (class156.field2250[4] & 0xFF << 16) + ((class156.field2250[5] & 0xFF) << 8) + (class156.field2250[6] & 0xFF);
                            if (arg0 == var16 && var12 == var14 && this.field1432 == var15) {
                                if (var13 >= 0 && ((long) var13) <= (this.field1429.method603((byte) 111) / 520L)) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var19 = arg3 - var11;
                    if (var13 == 0) {
                        arg1 = false;
                        var13 = (int) ((this.field1429.method603((byte) 39) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class156.field2250[2] = (byte) (var12 >> 8);
                    if ((arg3 - var11) <= 512) {
                        var13 = 0;
                    }
                    class156.field2250[1] = (byte) arg0;
                    class156.field2250[6] = (byte) var13;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    class156.field2250[0] = (byte) (arg0 >> 8);
                    class156.field2250[4] = (byte) (var13 >> 16);
                    class156.field2250[3] = (byte) var12;
                    var12++;
                    class156.field2250[5] = (byte) (var13 >> 8);
                    class156.field2250[7] = (byte) this.field1432;
                    this.field1429.method605(false, (long) (var8 * 520));
                    var8 = var13;
                    this.field1429.method604(0, class156.field2250, 8, 255);
                    this.field1429.method604(var11, arg2, var19, 255);
                    var11 += var19;
                }
                return true;
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V")
    public static final void method640(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class202.field2868; var3++) {
            for (int var4 = 0; var4 < class268.field3922; var4++) {
                for (int var5 = 0; var5 < class97.field1292; var5++) {
                    class133 var6 = class6.field94[var3][var4][var5];
                    if (var6 != null) {
                        class118 var7 = var6.field1927;
                        if (var7 != null && var7.field1672.method711()) {
                            class251.method1615(var7.field1672, var3, var4, var5, 1, 1);
                            if (var7.field1659 != null && var7.field1659.method711()) {
                                class251.method1615(var7.field1659, var3, var4, var5, 1, 1);
                                var7.field1672.method708(var7.field1659, 0, 0, 0, false);
                                var7.field1659 = var7.field1659.method715(arg0, arg1, arg2);
                            }
                            var7.field1672 = var7.field1672.method715(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field1934; var8++) {
                            class243 var10 = var6.field1930[var8];
                            if (var10 != null && var10.field3526.method711()) {
                                class251.method1615(var10.field3526, var3, var4, var5, var10.field3533 + 1 - var10.field3540, var10.field3532 - var10.field3527 + 1);
                                var10.field3526 = var10.field3526.method715(arg0, arg1, arg2);
                            }
                        }
                        class50 var9 = var6.field1917;
                        if (var9 != null && var9.field568.method711()) {
                            class235.method1535(var9.field568, var3, var4, var5);
                            var9.field568 = var9.field568.method715(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1425++;
        return "Cache:" + this.field1432;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(ILdi;Ldi;I)V")
    public class105(int arg0, class99 arg1, class99 arg2, int arg3) {
        this.field1432 = arg0;
        this.field1429 = arg1;
        this.field1422 = arg3;
        this.field1426 = arg2;
    }
}
