import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class59 {

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "[B")
    private byte[] field1475 = new byte[4];

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "Lgg;")
    private class61 field1470;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    private int field1477;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "J")
    private long field1464;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field1472 = 0;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "Lea;")
    private static class38 field1476 = class9.method46((byte) 125, "Loading title screen )2 ");

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "[Lk;")
    public static class89[] field1481 = new class89[1000];

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Lea;")
    public static class38 field1468 = field1476;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field1473 = 0;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    private int field1465;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field1480;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "[B")
    private byte[] field1467;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "[I")
    public static int[] field1478;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "[[B")
    public static byte[][] field1462;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
    public static final void method424(boolean arg0) {
        if (!arg0) {
            field1472 = -94;
        }
        field1471++;
        while (true) {
            class141 var1 = class188.field3756;
            class36 var2;
            synchronized (class188.field3756) {
                var2 = (class36) class63.field1537.method1026((byte) -76);
            }
            if (var2 == null) {
                return;
            }
            var2.field755.method947((int) var2.field2172, false, 126, var2.field753, var2.field750);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)I")
    public static final int method425(int arg0, int arg1, int arg2) {
        field1469++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 / 128;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            if (arg2 != 12108) {
                field1476 = null;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)[B")
    public final byte[] method426(int arg0) throws IOException {
        field1463++;
        if (class166.method1184((byte) -80) > this.field1464) {
            throw new IOException("fdt");
        }
        if (this.field1477 == 0) {
            if (this.field1470.field1486 == 2) {
                throw new IOException("fds");
            }
            if (this.field1470.field1486 == 1) {
                this.field1480 = (DataInputStream) this.field1470.field1490;
                this.field1477 = 1;
            }
        }
        if (arg0 != 1) {
            field1476 = null;
        }
        if (this.field1477 == 1) {
            int var2 = this.field1480.available();
            if (var2 > 0) {
                if (this.field1466 + var2 > 4) {
                    var2 = 4 - this.field1466;
                }
                this.field1466 += this.field1480.read(this.field1475, this.field1466, var2);
                if (this.field1466 == 4) {
                    int var3 = (new class66(this.field1475)).method464(-45);
                    this.field1477 = 2;
                    this.field1467 = new byte[var3];
                }
            }
        }
        if (this.field1477 == 2) {
            int var4 = this.field1480.available();
            if (var4 > 0) {
                if (this.field1467.length < var4 + this.field1465) {
                    var4 = this.field1467.length - this.field1465;
                }
                this.field1465 += this.field1480.read(this.field1467, this.field1465, var4);
                if (this.field1467.length == this.field1465) {
                    return this.field1467;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILdd;ZLdd;)V")
    public static final void method427(int arg0, class32 arg1, boolean arg2, class32 arg3) {
        class198.field3924 = arg1;
        class151.field3113 = arg3;
        class185.field3669 = arg2;
        if (arg0 > 123) {
            field1479++;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)V")
    public static void method428(boolean arg0) {
        field1478 = null;
        field1462 = null;
        field1468 = null;
        if (arg0) {
            field1481 = null;
            field1476 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILqa;II)V")
    public static final void method429(int arg0, class144 arg1, int arg2, int arg3) {
        if ((arg2 & 0x10) != 0) {
            int var4 = class192.field3794.method483((byte) 45);
            byte[] var5 = new byte[var4];
            class66 var6 = new class66(var5);
            class192.field3794.method494(var4, var5, 110, 0);
            class99.field2210[arg3] = var6;
            arg1.method1038(var6, 65535);
        }
        field1482++;
        if ((arg2 & 0x100) != 0) {
            arg1.field376 = class192.field3794.method515(-1739943584);
            int var7 = class192.field3794.method500(127);
            arg1.field433 = var7 >> 16;
            arg1.field392 = (var7 & 0xFFFF) + class45.field1098;
            if (arg1.field376 == 65535) {
                arg1.field376 = -1;
            }
            arg1.field404 = 0;
            arg1.field394 = 0;
            if (arg1.field392 > class45.field1098) {
                arg1.field394 = -1;
            }
        }
        if ((arg2 & 0x1) != 0) {
            arg1.field427 = class192.field3794.method506(2);
            arg1.field419 = class192.field3794.method487(2);
        }
        if ((arg2 & 0x40) != 0) {
            arg1.field434 = class192.field3794.method475((byte) -116);
            if (arg1.field434.method265(0, -103) == 126) {
                arg1.field434 = arg1.field434.method262(1, -1);
                class102.method839(arg1.field3022, 2, arg1.field434, (byte) 72);
            } else if (class195.field3842 == arg1) {
                class102.method839(arg1.field3022, 2, arg1.field434, (byte) -56);
            }
            arg1.field398 = 0;
            arg1.field413 = 0;
            arg1.field402 = 150;
        }
        if ((arg2 & 0x8) != 0) {
            int var8 = class192.field3794.method515(-1739943584);
            int var9 = class192.field3794.method509(126);
            if (var8 == 65535) {
                var8 = -1;
            }
            class97.method807(var9, var8, arg1, 0);
        }
        if ((arg2 & 0x2) != 0) {
            arg1.field393 = class192.field3794.method511(-124);
            if (arg1.field393 == 65535) {
                arg1.field393 = -1;
            }
        }
        if (arg0 < 43) {
            return;
        }
        if ((arg2 & 0x4) != 0) {
            int var10 = class192.field3794.method509(121);
            int var11 = class192.field3794.method483((byte) 3);
            arg1.method107(class45.field1098, var10, (byte) 109, var11);
            arg1.field437 = class45.field1098 + 300;
            arg1.field432 = class192.field3794.method498(255);
            arg1.field430 = class192.field3794.method463((byte) 25);
        }
        if ((arg2 & 0x80) != 0) {
            int var12 = class192.field3794.method487(2);
            int var13 = class192.field3794.method483((byte) -124);
            int var14 = class192.field3794.method498(255);
            int var15 = class192.field3794.field1620;
            if (arg1.field3022 != null && arg1.field3014 != null) {
                boolean var16 = false;
                long var17 = arg1.field3022.method256(-100);
                if (var13 <= 1) {
                    for (int var19 = 0; var19 < class43.field951; var19++) {
                        if (class186.field3704[var19] == var17) {
                            var16 = true;
                            break;
                        }
                    }
                }
                if (!var16 && class124.field2667 == 0) {
                    class94.field2127.field1620 = 0;
                    class192.field3794.method499(0, var14, class94.field2127.field1627, (byte) -53);
                    class94.field2127.field1620 = 0;
                    class38 var20 = class77.method644(class96.method802(class94.field2127, -53).method254(1));
                    arg1.field434 = var20.method255((byte) -111);
                    arg1.field398 = var12 >> 8;
                    arg1.field413 = var12 & 0xFF;
                    arg1.field402 = 150;
                    if (var13 == 2 || var13 == 3) {
                        class102.method839(class163.method1168(110, new class38[] { class111.field2464, arg1.field3022 }), 1, var20, (byte) 74);
                    } else if (var13 == 1) {
                        class102.method839(class163.method1168(-51, new class38[] { class86.field2006, arg1.field3022 }), 1, var20, (byte) 111);
                    } else {
                        class102.method839(arg1.field3022, 2, var20, (byte) -30);
                    }
                }
            }
            class192.field3794.field1620 = var14 + var15;
        }
        if ((arg2 & 0x200) != 0) {
            int var21 = class192.field3794.method498(255);
            int var22 = class192.field3794.method498(255);
            arg1.method107(class45.field1098, var21, (byte) 126, var22);
            arg1.field437 = class45.field1098 + 300;
            arg1.field432 = class192.field3794.method509(124);
            arg1.field430 = class192.field3794.method509(127);
        }
        if ((arg2 & 0x400) == 0) {
            return;
        }
        arg1.field424 = class192.field3794.method463((byte) 21);
        arg1.field379 = class192.field3794.method498(255);
        arg1.field428 = class192.field3794.method498(255);
        arg1.field383 = class192.field3794.method463((byte) 101);
        arg1.field388 = class192.field3794.method511(-37) + class45.field1098;
        arg1.field407 = class192.field3794.method515(-1739943584) + class45.field1098;
        arg1.field401 = class192.field3794.method509(118);
        arg1.field380 = 0;
        arg1.field385 = 1;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lod;Ljava/net/URL;)V")
    public class59(class129 arg0, URL arg1) {
        this.field1470 = arg0.method956((byte) -110, arg1);
        this.field1477 = 0;
        this.field1464 = class166.method1184((byte) -80) + 30000L;
    }
}
