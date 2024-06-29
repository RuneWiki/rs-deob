import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public abstract class class166 {

    @OriginalMember(owner = "client!dfa", name = "h", descriptor = "[B")
    private byte[] field2616;

    @OriginalMember(owner = "client!dfa", name = "D", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field2638;

    @OriginalMember(owner = "client!dfa", name = "x", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field2632;

    @OriginalMember(owner = "client!dfa", name = "l", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field2620;

    @OriginalMember(owner = "client!dfa", name = "A", descriptor = "Lhe;")
    private class372 field2635;

    @OriginalMember(owner = "client!dfa", name = "k", descriptor = "I")
    public static int field2619 = 0;

    @OriginalMember(owner = "client!dfa", name = "n", descriptor = "I")
    public static int field2622 = 0;

    @OriginalMember(owner = "client!dfa", name = "o", descriptor = "[[Z")
    public static boolean[][] field2623 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!dfa", name = "v", descriptor = "J")
    public static long field2630 = 0L;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!dfa", name = "d", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!dfa", name = "e", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!dfa", name = "i", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!dfa", name = "m", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!dfa", name = "p", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!dfa", name = "q", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!dfa", name = "r", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!dfa", name = "s", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!dfa", name = "u", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!dfa", name = "w", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!dfa", name = "B", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!dfa", name = "j", descriptor = "Lhq;")
    private class159 field2618;

    @OriginalMember(owner = "client!dfa", name = "g", descriptor = "Lku;")
    private class377 field2615;

    @OriginalMember(owner = "client!dfa", name = "E", descriptor = "Lea;")
    private class548 field2639;

    @OriginalMember(owner = "client!dfa", name = "f", descriptor = "Ljava/lang/String;")
    private String field2614;

    @OriginalMember(owner = "client!dfa", name = "t", descriptor = "Z")
    private boolean field2628;

    @OriginalMember(owner = "client!dfa", name = "y", descriptor = "Z")
    private boolean field2633;

    @OriginalMember(owner = "client!dfa", name = "z", descriptor = "Z")
    private boolean field2634;

    @OriginalMember(owner = "client!dfa", name = "C", descriptor = "Z")
    private boolean field2637;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IZ)V", line = 8)
    public final void method1209(int arg0, boolean arg1) {
        field2624++;
        if (arg0 != -17992) {
            this.method1216(-92, null);
        }
        if (this.field2618 != null) {
            class221 var3 = this.field2618.method1169((byte) -79);
            if (var3 != null) {
                var3.method1492(arg1, (byte) 109);
            }
        }
        this.field2637 = !this.field2637;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)V", line = 33)
    private final void method1210(int arg0) {
        field2627++;
        class518 var2 = (class518) this.field2635.method2283(false);
        if (arg0 > -12) {
            field2623 = null;
        }
        while (var2 != null) {
            if (var2 instanceof class377) {
                class377 var3 = (class377) var2;
                while ((var3.field7394 <= 8 || this.method1215((byte) 72) > (double) var3.method2439(false)) && var3.field7391.packetOut(this.field2620) == 1) {
                    var3.method3054(75, this.field2620);
                }
            }
            var2 = (class518) this.field2635.method2282((byte) 78);
        }
        this.method1216(22600, this.field2614);
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(I)V", line = 68)
    private final void method1211(int arg0) throws IOException {
        field2631++;
        while (this.field2639.field7391.packetOut(this.field2620) != 1) {
            class518 var2 = this.method1213((byte) 7);
            if (var2 == null) {
                if (this.field2634) {
                    this.method1222(arg0 + 27);
                }
                return;
            }
            if (this.field2615 == var2) {
                this.method1210(-108);
            }
        }
        if (arg0 == -2) {
            this.field2639.method3054(-82, this.field2620);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "(I)Z", line = 98)
    private final boolean method1212(int arg0) {
        field2610++;
        if (arg0 >= -91) {
            this.method1218(64);
        }
        if (this.field2618 == null) {
            double var2 = (double) this.field2639.method3200(63);
            return var2 == 0.0D || (double) class524.method3075(18) >= 1000.0D / var2 + (double) this.field2639.method3201(-2369);
        } else {
            return !this.field2639.method3209((byte) -11) || this.method1215((byte) -117) > this.field2639.method3207(125);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B)Ldn;", line = 118)
    private final class518 method1213(byte arg0) throws IOException {
        field2626++;
        int var2 = -121 % ((arg0 - 81) / 33);
        if (this.field2633) {
            throw new IllegalStateException();
        } else if (this.field2634) {
            return null;
        } else {
            while (this.field2638.pageOut(this.field2632) <= 0) {
                int var11 = this.method382(this.field2616, (byte) -14);
                if (var11 == -1) {
                    this.field2634 = true;
                    return null;
                }
                if (var11 == 0) {
                    return null;
                }
                if (!this.field2638.write(this.field2616, var11)) {
                    throw new RuntimeException("");
                }
            }
            int var3 = this.field2632.getSerialNumber();
            if (!this.field2632.isBOS()) {
                class518 var10 = (class518) this.field2635.method2287((long) var3, (byte) -117);
                if (!var10.field7391.pageIn(this.field2632)) {
                    throw new IllegalStateException();
                }
                return var10;
            }
            OggStreamState var4 = new OggStreamState(var3);
            if (!var4.pageIn(this.field2632)) {
                throw new IllegalStateException();
            } else if (var4.packetPeek(this.field2620) == 1) {
                class518 var5;
                if (this.field2639 == null && this.field2620.isTheora()) {
                    this.field2639 = new class548(var4);
                    var5 = this.field2639;
                } else if (this.field2618 == null && this.field2620.isVorbis()) {
                    this.field2618 = new class159(var4);
                    var5 = this.field2618;
                } else {
                    byte[] var6 = this.field2620.getData();
                    StringBuffer var7 = new StringBuffer();
                    for (int var8 = 1; var8 < var6.length && Character.isLetterOrDigit((char) var6[var8]); var8++) {
                        var7.append((char) var6[var8]);
                    }
                    String var9 = var7.toString();
                    if (var9.equals("kate")) {
                        var5 = new class377(var4);
                    } else {
                        var5 = new class564(var4);
                    }
                }
                this.field2635.method2278((byte) -64, (long) var3, var5);
                return var5;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "d", descriptor = "(I)Lku;", line = 238)
    public final class377 method1214(int arg0) {
        field2609++;
        if (arg0 != -17280) {
            this.field2628 = false;
        }
        return this.field2615;
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(B)D", line = 249)
    public final double method1215(byte arg0) {
        field2621++;
        if (this.field2618 != null) {
            return this.field2618.method1167((byte) -78);
        } else if (this.field2639 == null) {
            int var2 = 120 % ((-arg0 - 6) / 50);
            return 0.0D;
        } else {
            return this.field2639.method3207(123);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ILjava/lang/String;)V", line = 268)
    public final void method1216(int arg0, String arg1) {
        field2612++;
        this.field2614 = arg1;
        if (this.field2614 == null) {
            this.field2615 = null;
            return;
        }
        if (this.field2615 != null && !this.field2614.equals(this.field2615.method2441(124))) {
            this.field2615 = null;
        }
        if (arg0 != 22600 || this.field2615 != null) {
            return;
        }
        for (class518 var3 = (class518) this.field2635.method2283(false); var3 != null; var3 = (class518) this.field2635.method2282((byte) 123)) {
            if (var3 instanceof class377) {
                class377 var4 = (class377) var3;
                if (this.field2614.equals(var4.method2441(arg0 ^ 0x5812))) {
                    this.field2615 = var4;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "e", descriptor = "(I)V", line = 321)
    public final void method1217(int arg0) throws IOException {
        field2625++;
        if (this.field2637 || arg0 > -111) {
            return;
        }
        while (!this.field2633) {
            class518 var2;
            if (this.field2628) {
                var2 = (class518) this.field2635.method2287((long) this.field2632.getSerialNumber(), (byte) -117);
            } else {
                var2 = this.method1213((byte) -78);
                if (var2 == null) {
                    if (this.field2634) {
                        this.method1222(118);
                    }
                    return;
                }
                if (var2 == null) {
                    throw new IllegalStateException();
                }
                this.field2628 = true;
            }
            if (this.field2618 == var2) {
                if (this.field2618.method1166(true) >= 50) {
                    return;
                }
                while (this.field2618.field7391.packetOut(this.field2620) == 1) {
                    this.field2618.method3054(52, this.field2620);
                    this.method1210(-65);
                    if (this.field2639 != null) {
                        double var4 = this.field2639.method3207(124);
                        for (int var6 = 0; var6 < 10 && this.method1212(-104); var6++) {
                            this.method1211(-2);
                            if (this.field2633) {
                                return;
                            }
                        }
                        if (var4 < this.field2639.method3207(-98)) {
                            return;
                        }
                    }
                    if (this.field2618.method1166(true) >= 50) {
                        return;
                    }
                }
            } else if (var2 instanceof class377) {
                this.method1210(-32);
            } else if (this.field2639 != var2) {
                while (var2.field7391.packetOut(this.field2620) == 1) {
                    if (var2.field7394 == 1 && var2 instanceof class377) {
                        this.method1216(22600, this.field2614);
                    }
                    var2.method3054(-108, this.field2620);
                }
            } else if (this.field2618 == null && !this.field2637) {
                for (int var3 = 0; var3 < 10 && this.method1212(-119); var3++) {
                    this.method1211(-2);
                    if (this.field2633) {
                        return;
                    }
                }
                return;
            }
            this.field2628 = false;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "f", descriptor = "(I)Lea;", line = 442)
    public final class548 method1218(int arg0) {
        field2613++;
        if (arg0 != 11142) {
            this.method1214(41);
        }
        return this.field2639;
    }

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "(B)V", line = 455)
    public static void method1219(byte arg0) {
        field2623 = null;
        int var1 = -26 / ((arg0 + 6) / 40);
    }

    @OriginalMember(owner = "client!dfa", name = "g", descriptor = "(I)V", line = 466)
    public final void method1220(int arg0) {
        field2636++;
        if (this.field2633) {
            return;
        }
        for (class518 var2 = (class518) this.field2635.method2283(false); var2 != null; var2 = (class518) this.field2635.method2282((byte) 43)) {
            var2.method1165(-31);
            var2.field7391.method4068();
        }
        this.field2620.method4068();
        if (arg0 > -67) {
            this.method1223(-115);
        }
        this.field2632.method4068();
        this.field2638.method4068();
        this.field2633 = true;
    }

    @OriginalMember(owner = "client!dfa", name = "h", descriptor = "(I)Lhq;", line = 497)
    public final class159 method1221(int arg0) {
        if (arg0 >= -30) {
            this.method1220(-103);
        }
        field2611++;
        return this.field2618;
    }

    @OriginalMember(owner = "client!dfa", name = "i", descriptor = "(I)V", line = 518)
    private final void method1222(int arg0) {
        field2617++;
        class518 var2 = (class518) this.field2635.method2283(false);
        if (arg0 <= 10) {
            this.method1209(-19, false);
        }
        while (var2 != null) {
            if (this.field2639 != var2) {
                while (var2.field7391.packetOut() == 1) {
                    var2.method3054(53, this.field2620);
                }
            }
            var2 = (class518) this.field2635.method2282((byte) 67);
        }
        if (this.field2639 == null) {
            return;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (!this.method1212(-108)) {
                return;
            }
            if (this.field2639.field7391.packetOut() != 1) {
                this.method1220(-73);
                return;
            }
            this.field2639.method3054(93, this.field2620);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "j", descriptor = "(I)Z", line = 563)
    public final boolean method1223(int arg0) {
        if (arg0 != 0) {
            this.field2639 = null;
        }
        field2629++;
        if (this.field2633 || this.field2634) {
            return this.field2618 == null || this.field2618.method1166(true) <= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(I)V", line = 594)
    public class166(int arg0) {
        if (!class383.method2462((byte) 75, "jagtheora")) {
            throw new RuntimeException("Failed to load jagtheora library");
        }
        this.field2616 = new byte[arg0];
        this.field2638 = new OggSyncState();
        this.field2632 = new OggPage();
        this.field2620 = new OggPacket();
        this.field2635 = new class372(8);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "([BB)I")
    public abstract int method382(byte[] arg0, byte arg1) throws IOException;
}
