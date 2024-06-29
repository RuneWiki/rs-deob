import java.awt.event.KeyEvent;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class80 {

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "J")
    private long field1506 = -1L;

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
    private int field1515 = 0;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "J")
    private long field1505 = -1L;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "Laa;")
    private class165 field1500;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "J")
    private long field1494;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "J")
    private long field1514;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "[B")
    private byte[] field1493;

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "[B")
    private byte[] field1516;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "J")
    private long field1490;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Lpj;")
    private static class237 field1491 = class33.method353("green:", 102);

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "Lpj;")
    public static class237 field1497 = class33.method353(")3", 28);

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "Lpj;")
    public static class237 field1498 = field1491;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "Lpj;")
    public static class237 field1512 = class33.method353("(U5", 73);

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "Lpj;")
    public static class237 field1510 = field1491;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    private int field1501;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "J")
    private long field1509;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "Lug;")
    public static class194 field1507;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "([BI)V")
    public final void method613(byte[] arg0, int arg1) throws IOException {
        field1511++;
        this.method620(0, arg0.length, false, arg0);
        if (arg1 != -8365) {
            this.field1515 = 50;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)I")
    public static final int method614(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 / arg0;
        field1508++;
        int var5 = arg0 - 1 & arg3;
        int var6 = arg1 / arg0;
        int var7 = arg1 & arg0 - 1;
        int var8 = 120 / ((arg2 - 26) / 53);
        int var9 = class23.method214((byte) -82, var6, var4);
        int var10 = class23.method214((byte) -82, var6, var4 + 1);
        int var11 = class23.method214((byte) -82, var6 + 1, var4);
        int var12 = class23.method214((byte) -82, var6 + 1, var4 + 1);
        int var13 = class78.method603(var10, true, var5, arg0, var9);
        int var14 = class78.method603(var12, true, var5, arg0, var11);
        return class78.method603(var14, true, var7, arg0, var13);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    private final void method615(int arg0) throws IOException {
        if (arg0 != 11333) {
            method621(10, 121);
        }
        field1489++;
        this.field1501 = 0;
        if (this.field1509 != this.field1490) {
            this.field1500.method1154(10649, this.field1490);
            this.field1509 = this.field1490;
        }
        this.field1506 = this.field1490;
        while (this.field1516.length > this.field1501) {
            int var2 = this.field1516.length - this.field1501;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field1500.method1156(this.field1516, var2, this.field1501, -51);
            if (var3 == -1) {
                break;
            }
            this.field1509 += (long) var3;
            this.field1501 += var3;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method616(int arg0, int arg1, int arg2, long arg3) {
        class35 var5 = class274.field4775[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field763 != null && var5.field763.field2000 == arg3) {
            return true;
        } else if (var5.field749 != null && var5.field749.field3617 == arg3) {
            return true;
        } else if (var5.field753 != null && var5.field753.field4014 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field759; var6++) {
                if (var5.field755[var6].field3314 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V")
    private final void method617(boolean arg0) throws IOException {
        field1495++;
        if (this.field1505 != -1L) {
            if (this.field1509 != this.field1505) {
                this.field1500.method1154(10649, this.field1505);
                this.field1509 = this.field1505;
            }
            this.field1500.method1155(-14594, this.field1515, 0, this.field1493);
            long var2 = -1L;
            long var4 = -1L;
            if (this.field1506 <= this.field1505 && ((long) this.field1501 + this.field1506) > this.field1505) {
                var4 = this.field1505;
            } else if (this.field1506 >= this.field1505 && ((long) this.field1515 + this.field1505) > this.field1506) {
                var4 = this.field1506;
            }
            this.field1509 += (long) this.field1515;
            if (this.field1506 < (long) this.field1515 + this.field1505 && ((long) this.field1501 + this.field1506) >= ((long) this.field1515 + this.field1505)) {
                var2 = (long) this.field1515 + this.field1505;
            } else if (this.field1505 < (long) this.field1501 + this.field1506 && (long) this.field1515 + this.field1505 >= (long) this.field1501 + this.field1506) {
                var2 = (long) this.field1501 + this.field1506;
            }
            if (this.field1509 > this.field1494) {
                this.field1494 = this.field1509;
            }
            if (var4 > -1L && var4 < var2) {
                int var6 = (int) (var2 - var4);
                class171.method1182(this.field1493, (int) (var4 - this.field1505), this.field1516, (int) (var4 - this.field1506), var6);
            }
            this.field1515 = 0;
            this.field1505 = -1L;
        }
        if (!arg0) {
            field1507 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
    public static void method618(int arg0) {
        field1512 = null;
        field1510 = null;
        field1507 = null;
        field1498 = null;
        field1497 = null;
        field1491 = null;
        if (arg0 != -1) {
            field1510 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    public static final int method619(KeyEvent arg0, int arg1) {
        if (arg1 >= -90) {
            return 69;
        }
        field1504++;
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIZ[B)V")
    public final void method620(int arg0, int arg1, boolean arg2, byte[] arg3) throws IOException {
        field1517++;
        try {
            if ((arg0 + arg1) > arg3.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg3.length);
            }
            if (this.field1505 != -1L && this.field1505 <= this.field1490 && (long) this.field1515 + this.field1505 >= this.field1490 - -((long) arg1)) {
                class171.method1182(this.field1493, (int) (this.field1490 - this.field1505), arg3, arg0, arg1);
                this.field1490 += (long) arg1;
                return;
            }
            long var5 = this.field1490;
            int var7 = arg0;
            int var8 = arg1;
            if (this.field1490 >= this.field1506 && (long) this.field1501 + this.field1506 > this.field1490) {
                int var9 = (int) ((long) this.field1501 - (this.field1490 - this.field1506));
                if (var9 > arg1) {
                    var9 = arg1;
                }
                arg1 -= var9;
                class171.method1182(this.field1516, (int) (this.field1490 - this.field1506), arg3, arg0, var9);
                this.field1490 += (long) var9;
                arg0 += var9;
            }
            if (this.field1516.length < arg1) {
                this.field1500.method1154(10649, this.field1490);
                this.field1509 = this.field1490;
                while (arg1 > 0) {
                    int var10 = this.field1500.method1156(arg3, arg1, arg0, -128);
                    if (var10 == -1) {
                        break;
                    }
                    this.field1509 += (long) var10;
                    this.field1490 += (long) var10;
                    arg1 -= var10;
                    arg0 += var10;
                }
            } else if (arg1 > 0) {
                int var11 = arg1;
                this.method615(11333);
                if (this.field1501 < arg1) {
                    var11 = this.field1501;
                }
                arg1 -= var11;
                class171.method1182(this.field1516, 0, arg3, arg0, var11);
                arg0 += var11;
                this.field1490 += (long) var11;
            }
            if (this.field1505 != -1L) {
                if (this.field1490 < this.field1505 && arg1 > 0) {
                    int var12 = (int) (this.field1505 - this.field1490) + arg0;
                    if (var12 > (arg0 + arg1)) {
                        var12 = arg0 + arg1;
                    }
                    while (arg0 < var12) {
                        arg3[arg0++] = 0;
                        arg1--;
                        this.field1490++;
                    }
                }
                long var13 = -1L;
                if (this.field1505 >= var5 && ((long) var8 + var5) > this.field1505) {
                    var13 = this.field1505;
                } else if (var5 >= this.field1505 && var5 < (long) this.field1515 + this.field1505) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (long) this.field1515 + this.field1505 && this.field1505 + ((long) this.field1515) <= (long) var8 + var5) {
                    var15 = (long) this.field1515 + this.field1505;
                } else if ((long) var8 + var5 > this.field1505 && (var5 + ((long) var8)) <= (this.field1505 + ((long) this.field1515))) {
                    var15 = var5 + ((long) var8);
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class171.method1182(this.field1493, (int) (var13 - this.field1505), arg3, (int) (var13 - var5) + var7, var17);
                    if (this.field1490 < var15) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field1490));
                        this.field1490 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1509 = -1L;
            throw var19;
        }
        if (arg2) {
            this.field1493 = null;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V")
    public static final void method621(int arg0, int arg1) {
        field1503++;
        class180.field3167 = -1;
        class51.field1085 = -1;
        class215.field3681 = arg0;
        if (arg1 < -64) {
            class208.method1393((byte) 25);
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(Z)Ljava/io/File;")
    private final File method622(boolean arg0) {
        if (arg0) {
            field1499++;
            return this.field1500.method1157((byte) 108);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)J")
    public final long method623(int arg0) {
        if (arg0 < 82) {
            this.method623(-29);
        }
        field1513++;
        return this.field1514;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZII[B)V")
    public final void method624(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1492++;
        try {
            if (this.field1514 < ((long) arg1 + this.field1490)) {
                this.field1514 = (long) arg1 + this.field1490;
            }
            if (this.field1505 != -1L && (this.field1490 < this.field1505 || this.field1490 > (long) this.field1515 + this.field1505)) {
                this.method617(true);
            }
            if (this.field1505 != -1L && (long) this.field1493.length + this.field1505 < (long) arg1 + this.field1490) {
                int var5 = (int) ((long) this.field1493.length + this.field1505 - this.field1490);
                arg1 -= var5;
                class171.method1182(arg3, arg2, this.field1493, (int) (this.field1490 - this.field1505), var5);
                arg2 += var5;
                this.field1490 += (long) var5;
                this.field1515 = this.field1493.length;
                this.method617(true);
            }
            if (this.field1493.length < arg1) {
                if (this.field1509 != this.field1490) {
                    this.field1500.method1154(10649, this.field1490);
                    this.field1509 = this.field1490;
                }
                this.field1500.method1155(-14594, arg1, arg2, arg3);
                long var6 = -1L;
                if (this.field1506 <= this.field1490 && (long) this.field1501 + this.field1506 > this.field1490) {
                    var6 = this.field1490;
                } else if (this.field1490 <= this.field1506 && (long) arg1 + this.field1490 > this.field1506) {
                    var6 = this.field1506;
                }
                long var8 = -1L;
                if (this.field1506 < ((long) arg1 + this.field1490) && this.field1490 + ((long) arg1) <= this.field1506 - -((long) this.field1501)) {
                    var8 = (long) arg1 + this.field1490;
                } else if ((long) this.field1501 + this.field1506 > this.field1490 && ((long) this.field1501 + this.field1506) <= ((long) arg1 + this.field1490)) {
                    var8 = (long) this.field1501 + this.field1506;
                }
                this.field1509 += (long) arg1;
                if (this.field1509 > this.field1494) {
                    this.field1494 = this.field1509;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class171.method1182(arg3, (int) ((long) arg2 + var6 - this.field1490), this.field1516, (int) (var6 - this.field1506), var10);
                }
                this.field1490 += (long) arg1;
                return;
            }
            if (arg1 > 0) {
                if (this.field1505 == -1L) {
                    this.field1505 = this.field1490;
                }
                class171.method1182(arg3, arg2, this.field1493, (int) (this.field1490 - this.field1505), arg1);
                this.field1490 += (long) arg1;
                if (this.field1490 - this.field1505 > (long) this.field1515) {
                    this.field1515 = (int) (this.field1490 - this.field1505);
                }
                return;
            }
        } catch (IOException var12) {
            this.field1509 = -1L;
            throw var12;
        }
        if (!arg0) {
            method614(3, 43, 5, 111);
        }
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V")
    public final void method625(int arg0) throws IOException {
        this.method617(true);
        if (arg0 > -118) {
            field1498 = null;
        }
        this.field1500.method1153((byte) -11);
        field1502++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)V")
    public static final void method626(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class158.field2852; var3++) {
            for (int var4 = 0; var4 < class224.field3852; var4++) {
                for (int var5 = 0; var5 < class182.field3211; var5++) {
                    class35 var6 = class274.field4775[var3][var4][var5];
                    if (var6 != null) {
                        class114 var7 = var6.field763;
                        if (var7 != null && var7.field1999.method704()) {
                            class97.method735(var7.field1999, var3, var4, var5, 1, 1);
                            if (var7.field1993 != null && var7.field1993.method704()) {
                                class97.method735(var7.field1993, var3, var4, var5, 1, 1);
                                var7.field1999.method708(var7.field1993, 0, 0, 0, false);
                                var7.field1993 = var7.field1993.method707(arg0, arg1, arg2);
                            }
                            var7.field1999 = var7.field1999.method707(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field759; var8++) {
                            class191 var10 = var6.field755[var8];
                            if (var10 != null && var10.field3318.method704()) {
                                class97.method735(var10.field3318, var3, var4, var5, var10.field3327 + 1 - var10.field3316, var10.field3320 - var10.field3315 + 1);
                                var10.field3318 = var10.field3318.method707(arg0, arg1, arg2);
                            }
                        }
                        class232 var9 = var6.field753;
                        if (var9 != null && var9.field4012.method704()) {
                            class147.method1000(var9.field4012, var3, var4, var5);
                            var9.field4012 = var9.field4012.method707(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Laa;II)V")
    public class80(class165 arg0, int arg1, int arg2) throws IOException {
        this.field1500 = arg0;
        this.field1514 = this.field1494 = arg0.method1158((byte) 73);
        this.field1493 = new byte[arg2];
        this.field1516 = new byte[arg1];
        this.field1490 = 0L;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(JI)V")
    public final void method627(long arg0, int arg1) throws IOException {
        if (arg1 != 15294) {
            method621(7, 93);
        }
        field1496++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method622(true));
        }
        this.field1490 = arg0;
    }
}
