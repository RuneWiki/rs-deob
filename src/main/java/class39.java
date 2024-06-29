import java.awt.Frame;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class39 {

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "J")
    private long field594 = -1L;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
    private int field609 = 0;

    @OriginalMember(owner = "client!ul", name = "G", descriptor = "J")
    private long field620 = -1L;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "Lde;")
    private class58 field599;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "J")
    private long field602;

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "J")
    private long field616;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "J")
    private long field604;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "[B")
    private byte[] field606;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "[B")
    private byte[] field591;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "[I")
    public static int[] field588 = new int[50];

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field595 = 0;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "[B")
    public static byte[] field600 = new byte[520];

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "Lwa;")
    private static class75 field603 = class66.method560("Close", false);

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "Lwa;")
    public static class75 field601 = field603;

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "Lwa;")
    public static class75 field617 = class66.method560("Card:", false);

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "Lwa;")
    public static class75 field612 = class66.method560("gleiten:", false);

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "I")
    public static int field618 = -1;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "I")
    private int field615;

    @OriginalMember(owner = "client!ul", name = "F", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!ul", name = "H", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "J")
    private long field596;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(JI)V", line = 6)
    public final void method260(long arg0, int arg1) throws IOException {
        field608++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method265((byte) -91));
        }
        if (arg1 != -30524) {
            this.method262(-80);
        }
        this.field604 = arg0;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)Lsb;", line = 23)
    public static final class103 method261(int arg0, int arg1) {
        class103 var2 = (class103) class97.field1590.method1193((long) arg0, 121);
        field590++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class230.field3914.method1911(arg1, arg0, -53);
        class103 var4 = new class103();
        if (var3 != null) {
            var4.method804(new class60(var3), (byte) 103);
        }
        class97.field1590.method1194(var4, (long) arg0, false);
        return var4;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)J", line = 43)
    public final long method262(int arg0) {
        field619++;
        return arg0 > -81 ? 27L : this.field616;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III[B)V", line = 62)
    public final void method263(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field597++;
        try {
            int var5 = -74 % ((26 - arg0) / 63);
            if ((long) arg1 + this.field604 > this.field616) {
                this.field616 = (long) arg1 + this.field604;
            }
            if (this.field594 != -1L && (this.field594 > this.field604 || (long) this.field609 + this.field594 < this.field604)) {
                this.method270(-14959);
            }
            if (this.field594 != -1L && (long) arg1 + this.field604 > this.field594 - -((long) this.field606.length)) {
                int var6 = (int) ((long) this.field606.length - (this.field604 - this.field594));
                arg1 -= var6;
                class231.method1687(arg3, arg2, this.field606, (int) (this.field604 - this.field594), var6);
                arg2 += var6;
                this.field604 += (long) var6;
                this.field609 = this.field606.length;
                this.method270(-14959);
            }
            if (arg1 > this.field606.length) {
                if (this.field604 != this.field596) {
                    this.field599.method469(this.field604, 0);
                    this.field596 = this.field604;
                }
                this.field599.method468(arg2, 125, arg1, arg3);
                long var7 = -1L;
                if (this.field620 < ((long) arg1 + this.field604) && ((long) arg1 + this.field604) <= (this.field620 + ((long) this.field615))) {
                    var7 = this.field604 + ((long) arg1);
                } else if ((this.field620 + ((long) this.field615)) > this.field604 && (long) arg1 + this.field604 >= (long) this.field615 + this.field620) {
                    var7 = (long) this.field615 + this.field620;
                }
                long var9 = -1L;
                this.field596 += (long) arg1;
                if (this.field596 > this.field602) {
                    this.field602 = this.field596;
                }
                if (this.field620 <= this.field604 && this.field620 + ((long) this.field615) > this.field604) {
                    var9 = this.field604;
                } else if (this.field604 <= this.field620 && ((long) arg1 + this.field604) > this.field620) {
                    var9 = this.field620;
                }
                if (var9 > -1L && var9 < var7) {
                    int var11 = (int) (var7 - var9);
                    class231.method1687(arg3, (int) ((long) arg2 + var9 - this.field604), this.field591, (int) (var9 - this.field620), var11);
                }
                this.field604 += (long) arg1;
            } else if (arg1 > 0) {
                if (this.field594 == -1L) {
                    this.field594 = this.field604;
                }
                class231.method1687(arg3, arg2, this.field606, (int) (this.field604 - this.field594), arg1);
                this.field604 += (long) arg1;
                if (((long) this.field609) < (this.field604 - this.field594)) {
                    this.field609 = (int) (this.field604 - this.field594);
                }
            }
        } catch (IOException var13) {
            this.field596 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lcl;Ljava/awt/Frame;B)V", line = 187)
    public static final void method264(class124 arg0, Frame arg1, byte arg2) {
        if (arg2 != 16) {
            method269((byte) 40);
        }
        field614++;
        while (true) {
            class77 var3 = arg0.method933(arg1, false);
            while (var3.field1330 == 0) {
                class235.method1708(95, 10L);
            }
            if (var3.field1330 == 1) {
                arg1.setVisible(false);
                arg1.dispose();
                return;
            }
            class235.method1708(89, 100L);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)Ljava/io/File;", line = 215)
    private final File method265(byte arg0) {
        if (arg0 == -91) {
            field592++;
            return this.field599.method467(false);
        } else {
            return (File) null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)V", line = 237)
    public static final void method266(byte arg0, int arg1) {
        if (arg0 > -112) {
            method264((class124) null, (Frame) null, (byte) 103);
        }
        class76.field1318 = -1;
        field593++;
        class235.field3968 = false;
        class139.field2413 = 1;
        class127.field2212 = null;
        class136.field2338 = arg1;
        class147.field2556 = 0;
        class5.field57 = -1;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I[B)V", line = 257)
    public final void method267(int arg0, byte[] arg1) throws IOException {
        field611++;
        this.method272(arg1.length, 0, arg0, arg1);
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V", line = 268)
    public final void method268(int arg0) throws IOException {
        field605++;
        this.method270(-14959);
        if (arg0 == 12516) {
            this.field599.method465(-1);
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V", line = 281)
    public static void method269(byte arg0) {
        field588 = null;
        field601 = null;
        field612 = null;
        field603 = null;
        int var1 = -95 % ((arg0 - 3) / 53);
        field600 = null;
        field617 = null;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lde;II)V", line = 786)
    public class39(class58 arg0, int arg1, int arg2) throws IOException {
        this.field599 = arg0;
        this.field616 = this.field602 = arg0.method466(46);
        this.field604 = 0L;
        this.field606 = new byte[arg2];
        this.field591 = new byte[arg1];
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V", line = 311)
    private final void method270(int arg0) throws IOException {
        field613++;
        if (this.field594 != -1L) {
            if (this.field596 != this.field594) {
                this.field599.method469(this.field594, 0);
                this.field596 = this.field594;
            }
            this.field599.method468(0, 125, this.field609, this.field606);
            long var2 = -1L;
            this.field596 += (long) this.field609;
            if (this.field594 >= this.field620 && this.field620 + ((long) this.field615) > this.field594) {
                var2 = this.field594;
            } else if (this.field594 <= this.field620 && this.field620 < ((long) this.field609 + this.field594)) {
                var2 = this.field620;
            }
            if (this.field596 > this.field602) {
                this.field602 = this.field596;
            }
            long var4 = -1L;
            if (this.field620 < ((long) this.field609 + this.field594) && (long) this.field609 + this.field594 <= (long) this.field615 + this.field620) {
                var4 = (long) this.field609 + this.field594;
            } else if (this.field594 < ((long) this.field615 + this.field620) && ((long) this.field615 + this.field620) <= ((long) this.field609 + this.field594)) {
                var4 = (long) this.field615 + this.field620;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class231.method1687(this.field606, (int) (var2 - this.field594), this.field591, (int) (var2 - this.field620), var6);
            }
            this.field609 = 0;
            this.field594 = -1L;
        }
        if (arg0 != -14959) {
            method271((class60) null, 113);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lja;I)V", line = 389)
    public static final void method271(class60 arg0, int arg1) {
        field621++;
        if (arg1 != 0) {
            field603 = (class75) null;
        }
        while (true) {
            while (arg0.field997.length > arg0.field1012) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method501(0) == 1) {
                    var2 = true;
                    var4 = arg0.method501(0);
                    var3 = arg0.method501(arg1);
                }
                int var5 = arg0.method501(0);
                int var6 = arg0.method501(0);
                int var7 = class130.field2252 + class215.field3668 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class82.field1374;
                if (var8 >= 0 && var7 - 63 >= 0 && (var8 + 63) < field589 && class215.field3668 > var7) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var4 * 8 && var4 * 8 + 8 > var11 && (var3 * 8) <= var12 && var12 < (var3 * 8 + 8)) {
                                byte var13 = arg0.method511(arg1 - 118);
                                if (var13 != 0) {
                                    if (class245.field4123[var10][var9] == null) {
                                        class245.field4123[var10][var9] = new byte[4096];
                                    }
                                    class245.field4123[var10][var9][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method511(-119);
                                    if (class89.field1469[var10][var9] == null) {
                                        class89.field1469[var10][var9] = new byte[4096];
                                    }
                                    class89.field1469[var10][var9][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method511(-117);
                        if (var16 != 0) {
                            arg0.field1012++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(III[B)V", line = 498)
    public final void method272(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field607++;
        try {
            if (arg3.length < (arg0 + arg2)) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg0 - arg3.length);
            }
            if (this.field594 != -1L && this.field594 <= this.field604 && ((long) this.field609 + this.field594) >= ((long) arg0 + this.field604)) {
                class231.method1687(this.field606, (int) (this.field604 - this.field594), arg3, arg2, arg0);
                this.field604 += (long) arg0;
                return;
            }
            long var5 = this.field604;
            int var7 = arg2;
            int var8 = arg0;
            if (this.field604 >= this.field620 && this.field604 < ((long) this.field615 + this.field620)) {
                int var9 = (int) (this.field620 + (long) this.field615 - this.field604);
                if (var9 > arg0) {
                    var9 = arg0;
                }
                arg0 -= var9;
                class231.method1687(this.field591, (int) (this.field604 - this.field620), arg3, arg2, var9);
                arg2 += var9;
                this.field604 += (long) var9;
            }
            if (arg0 > this.field591.length) {
                this.field599.method469(this.field604, arg1);
                this.field596 = this.field604;
                while (arg0 > 0) {
                    int var10 = this.field599.method470(arg2, arg0, arg3, (byte) 120);
                    if (var10 == -1) {
                        break;
                    }
                    this.field604 += (long) var10;
                    arg2 += var10;
                    this.field596 += (long) var10;
                    arg0 -= var10;
                }
            } else if (arg0 > 0) {
                this.method274(false);
                int var11 = arg0;
                if (this.field615 < arg0) {
                    var11 = this.field615;
                }
                arg0 -= var11;
                class231.method1687(this.field591, 0, arg3, arg2, var11);
                this.field604 += (long) var11;
                arg2 += var11;
            }
            if (this.field594 != -1L) {
                if (this.field604 < this.field594 && arg0 > 0) {
                    int var12 = (int) (this.field594 - this.field604) + arg2;
                    if ((arg0 + arg2) < var12) {
                        var12 = arg0 + arg2;
                    }
                    while (var12 > arg2) {
                        arg3[arg2++] = 0;
                        this.field604++;
                        arg0--;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field594 && ((long) var8 + var5) > this.field594) {
                    var13 = this.field594;
                } else if (this.field594 <= var5 && var5 < this.field594 + ((long) this.field609)) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (((long) this.field609 + this.field594) > var5 && ((long) var8 + var5) >= ((long) this.field609 + this.field594)) {
                    var15 = (long) this.field609 + this.field594;
                } else if (this.field594 < ((long) var8 + var5) && (long) var8 + var5 <= this.field594 - -((long) this.field609)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class231.method1687(this.field606, (int) (var13 - this.field594), arg3, var7 + ((int) (var13 - var5)), var17);
                    if (this.field604 < var15) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field604));
                        this.field604 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field596 = -1L;
            throw var19;
        }
        if (arg1 < arg0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lcb;Z)V", line = 687)
    public static final void method273(class267 arg0, boolean arg1) {
        field598++;
        class306.field5237 = arg0.method1915(-15621, class175.field2943);
        class282.field4859 = arg0.method1915(-15621, class153.field2636);
        class180.field3027 = arg0.method1915(-15621, class292.field5025);
        class211.field3594 = arg0.method1915(-15621, class244.field4108);
        class206.field3492 = arg0.method1915(-15621, class132.field2279);
        class7.field90 = arg0.method1915(-15621, class290.field4983);
        class2.field24 = arg0.method1915(-15621, class78.field1343);
        class76.field1325 = arg0.method1915(-15621, class81.field1362);
        class267.field4602 = arg0.method1915(-15621, class7.field86);
        class70.field1196 = arg0.method1915(-15621, class294.field5064);
        class291.field4992 = arg0.method1915(-15621, class252.field4237);
        class300.field5137 = arg0.method1915(-15621, class244.field4118);
        class311.field5296 = arg0.method1915(-15621, class97.field1606);
        class144.field2488 = arg0.method1915(-15621, class5.field56);
        class63.field1104 = arg0.method1915(-15621, class212.field3612);
        class17.field223 = arg0.method1915(-15621, class240.field4065);
        class78.field1342 = arg0.method1915(-15621, class166.field2807);
        if (!arg1) {
            field588 = (int[]) null;
        }
        class87.field1446 = arg0.method1915(-15621, class110.field1889);
        class266.field4590 = arg0.method1915(-15621, class283.field4887);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V", line = 727)
    private final void method274(boolean arg0) throws IOException {
        if (arg0) {
            this.method265((byte) -79);
        }
        field610++;
        this.field615 = 0;
        if (this.field604 != this.field596) {
            this.field599.method469(this.field604, 0);
            this.field596 = this.field604;
        }
        this.field620 = this.field604;
        while (this.field615 < this.field591.length) {
            int var2 = this.field591.length - this.field615;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field599.method470(this.field615, var2, this.field591, (byte) -13);
            if (var3 == -1) {
                break;
            }
            this.field596 += (long) var3;
            this.field615 += var3;
        }
    }
}
