import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class108 implements Runnable {

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    private int field2595 = 0;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "Z")
    private boolean field2603 = false;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "Z")
    private boolean field2610 = false;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    private int field2616 = 0;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Lde;")
    private class27 field2590;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "Ljava/net/Socket;")
    private Socket field2614;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "Ljava/io/InputStream;")
    private InputStream field2609;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2588;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Lu;")
    public static class135 field2589 = class87.method676((byte) -122, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "[Lu;")
    public static class135[] field2599 = new class135[500];

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "[I")
    public static int[] field2600 = new int[2048];

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "Lu;")
    public static class135 field2596 = class87.method676((byte) -58, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "Lu;")
    private static class135 field2605 = class87.method676((byte) -88, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "Lu;")
    public static class135 field2606 = field2605;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "Lu;")
    public static class135 field2611 = class87.method676((byte) -84, " x");

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "Lu;")
    private static class135 field2617 = class87.method676((byte) -58, "Use");

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "Lu;")
    public static class135 field2607 = field2617;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "Lu;")
    public static class135 field2618 = class87.method676((byte) -96, "Name eingeben:");

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "Lg;")
    public static class43 field2598;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "Ljb;")
    private class64 field2594;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "[B")
    private byte[] field2604;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III[B)V")
    public final void method870(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2593++;
        if (this.field2603) {
            return;
        }
        if (this.field2610) {
            this.field2610 = false;
            throw new IOException();
        }
        if (this.field2604 == null) {
            this.field2604 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = arg2; var6 < arg0; var6++) {
                this.field2604[this.field2595] = arg3[arg1 + var6];
                this.field2595 = (this.field2595 + 1) % 5000;
                if ((this.field2616 + 4900) % 5000 == this.field2595) {
                    throw new IOException();
                }
            }
            if (this.field2594 == null) {
                this.field2594 = this.field2590.method220(3, false, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static final void method871(int arg0) {
        if (class48.field1151 == 1) {
            if (class139.field3389 >= 539 && class139.field3389 <= 573 && class20.field470 >= 169 && class20.field470 < 205 && class21.field491[0] != -1) {
                class10.field244 = true;
                class135.field3239 = true;
                class49.field1167 = 0;
            }
            if (class139.field3389 >= 569 && class139.field3389 <= 599 && class20.field470 >= 168 && class20.field470 < 205 && class21.field491[1] != -1) {
                class10.field244 = true;
                class49.field1167 = 1;
                class135.field3239 = true;
            }
            if (class139.field3389 >= 597 && class139.field3389 <= 627 && class20.field470 >= 168 && class20.field470 < 205 && class21.field491[2] != -1) {
                class135.field3239 = true;
                class49.field1167 = 2;
                class10.field244 = true;
            }
            if (class139.field3389 >= 625 && class139.field3389 <= 669 && class20.field470 >= 168 && class20.field470 < 203 && class21.field491[3] != -1) {
                class10.field244 = true;
                class135.field3239 = true;
                class49.field1167 = 3;
            }
            if (class139.field3389 >= 666 && class139.field3389 <= 696 && class20.field470 >= 168 && class20.field470 < 205 && class21.field491[4] != -1) {
                class49.field1167 = 4;
                class10.field244 = true;
                class135.field3239 = true;
            }
            if (class139.field3389 >= 694 && class139.field3389 <= 724 && class20.field470 >= 168 && class20.field470 < 205 && class21.field491[5] != -1) {
                class49.field1167 = 5;
                class10.field244 = true;
                class135.field3239 = true;
            }
            if (class139.field3389 >= 722 && class139.field3389 <= 756 && class20.field470 >= 169 && class20.field470 < 205 && class21.field491[6] != -1) {
                class49.field1167 = 6;
                class135.field3239 = true;
                class10.field244 = true;
            }
            if (class139.field3389 >= 540 && class139.field3389 <= 574 && class20.field470 >= 466 && class20.field470 < 502 && class21.field491[7] != -1) {
                class135.field3239 = true;
                class49.field1167 = 7;
                class10.field244 = true;
            }
            if (class139.field3389 >= 572 && class139.field3389 <= 602 && class20.field470 >= 466 && class20.field470 < 503 && class21.field491[8] != -1) {
                class49.field1167 = 8;
                class135.field3239 = true;
                class10.field244 = true;
            }
            if (class139.field3389 >= 599 && class139.field3389 <= 629 && class20.field470 >= 466 && class20.field470 < 503 && class21.field491[9] != -1) {
                class135.field3239 = true;
                class10.field244 = true;
                class49.field1167 = 9;
            }
            if (class139.field3389 >= 627 && class139.field3389 <= 671 && class20.field470 >= 467 && class20.field470 < 502 && class21.field491[10] != -1) {
                class135.field3239 = true;
                class10.field244 = true;
                class49.field1167 = 10;
            }
            if (class139.field3389 >= 669 && class139.field3389 <= 699 && class20.field470 >= 466 && class20.field470 < 503 && class21.field491[11] != -1) {
                class135.field3239 = true;
                class10.field244 = true;
                class49.field1167 = 11;
            }
            if (class139.field3389 >= 696 && class139.field3389 <= 726 && class20.field470 >= 466 && class20.field470 < 503 && class21.field491[12] != -1) {
                class10.field244 = true;
                class135.field3239 = true;
                class49.field1167 = 12;
            }
            if (class139.field3389 >= 724 && class139.field3389 <= 758 && class20.field470 >= 466 && class20.field470 < 502 && class21.field491[13] != -1) {
                class10.field244 = true;
                class135.field3239 = true;
                class49.field1167 = 13;
            }
        }
        field2591++;
        int var1 = 2 / ((arg0 + 11) / 43);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B[BII)V")
    public final void method872(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2613++;
        if (this.field2603) {
            return;
        }
        int var5 = -105 / ((3 - arg0) / 36);
        while (arg2 > 0) {
            int var6 = this.field2609.read(arg1, arg3, arg2);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg2 -= var6;
            arg3 += var6;
        }
    }

    @OriginalMember(owner = "client!pd", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field2616 == this.field2595) {
                            if (this.field2603) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field2616;
                        if (this.field2595 >= this.field2616) {
                            var3 = this.field2595 - this.field2616;
                        } else {
                            var3 = 5000 - this.field2616;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field2588.write(this.field2604, var2, var3);
                    } catch (IOException var9) {
                        this.field2610 = true;
                    }
                    this.field2616 = (this.field2616 + var3) % 5000;
                    try {
                        if (this.field2616 == this.field2595) {
                            this.field2588.flush();
                        }
                    } catch (IOException var8) {
                        this.field2610 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2609 != null) {
                        this.field2609.close();
                    }
                    if (this.field2588 != null) {
                        this.field2588.close();
                    }
                    if (this.field2614 != null) {
                        this.field2614.close();
                    }
                } catch (IOException var7) {
                }
                this.field2604 = null;
                break;
            }
        } catch (Exception var12) {
            class34.method267(null, 35, var12);
        }
        field2592++;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
    public static void method873(int arg0) {
        field2589 = null;
        field2600 = null;
        field2598 = null;
        field2596 = null;
        field2599 = null;
        int var1 = 49 % ((-arg0 - 11) / 41);
        field2607 = null;
        field2606 = null;
        field2611 = null;
        field2605 = null;
        field2618 = null;
        field2617 = null;
    }

    @OriginalMember(owner = "client!pd", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field2601++;
        this.method874((byte) -127);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public final void method874(byte arg0) {
        field2597++;
        if (this.field2603) {
            return;
        }
        synchronized (this) {
            this.field2603 = true;
            if (arg0 >= -91) {
                method876(72);
            }
            this.notifyAll();
        }
        if (this.field2594 != null) {
            while (this.field2594.field1592 == 0) {
                class96.method795(1L, 77);
            }
            if (this.field2594.field1592 == 1) {
                try {
                    ((Thread) this.field2594.field1596).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2594 = null;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)I")
    public final int method875(byte arg0) throws IOException {
        if (arg0 > -44) {
            this.run();
        }
        field2608++;
        return this.field2603 ? 0 : this.field2609.read();
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
    public static final void method876(int arg0) {
        field2612++;
        try {
            if (arg0 >= -82) {
                method876(-66);
            }
            if (class28.field679 == null) {
                class28.field679 = new class101(class41.field965, class107.method867(2, new class135[] { class103.field2499, class113.field2725, class151.field3733 }).method1079((byte) -119));
            } else {
                byte[] var1 = class28.field679.method832((byte) -43);
                if (var1 != null) {
                    class59 var2 = new class59(var1);
                    class3.field74 = var2.method483((byte) 24);
                    class99.field2406 = new class50[class3.field74];
                    for (int var3 = 0; var3 < class3.field74; var3++) {
                        class50 var4 = class99.field2406[var3] = new class50();
                        int var5 = var2.method483((byte) 24);
                        var4.field1185 = (var5 & 0x8000) != 0;
                        var4.field1186 = var5 & 0x7FFF;
                        var4.field1200 = var2.method496(-113);
                        var4.field1182 = var2.method446((byte) -99);
                        var4.field1190 = var3;
                        var4.field1181 = class102.method839((byte) -112, var4.field1200);
                    }
                    class113.method923(class99.field2406.length - 1, (byte) -128, 0, class99.field2406, class119.field2878, class41.field962);
                    class28.field679 = null;
                    class115.field2759 = true;
                }
            }
        } catch (Exception var6) {
            class28.field679 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)I")
    public final int method877(int arg0) throws IOException {
        field2602++;
        if (this.field2603) {
            return 0;
        } else {
            if (arg0 <= 122) {
                this.run();
            }
            return this.field2609.available();
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Ljava/net/Socket;Lde;)V")
    public class108(Socket arg0, class27 arg1) throws IOException {
        this.field2590 = arg1;
        this.field2614 = arg0;
        this.field2614.setSoTimeout(30000);
        this.field2614.setTcpNoDelay(true);
        this.field2609 = this.field2614.getInputStream();
        this.field2588 = this.field2614.getOutputStream();
    }
}
