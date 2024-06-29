import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public abstract class class298 {

    @OriginalMember(owner = "client!nba", name = "i", descriptor = "[B")
    private byte[] field4188;

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field4185;

    @OriginalMember(owner = "client!nba", name = "t", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field4199;

    @OriginalMember(owner = "client!nba", name = "m", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field4192;

    @OriginalMember(owner = "client!nba", name = "j", descriptor = "Lkk;")
    private class188 field4189;

    @OriginalMember(owner = "client!nba", name = "y", descriptor = "Lpca;")
    public static class714 field4204 = new class714(64);

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!nba", name = "k", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!nba", name = "l", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!nba", name = "o", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!nba", name = "p", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!nba", name = "q", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!nba", name = "r", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!nba", name = "s", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!nba", name = "u", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!nba", name = "v", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!nba", name = "x", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!nba", name = "z", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!nba", name = "B", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!nba", name = "w", descriptor = "Lkw;")
    private class248 field4202;

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "Loca;")
    private class262 field4186;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "Lpv;")
    private class70 field4180;

    @OriginalMember(owner = "client!nba", name = "A", descriptor = "Ljava/lang/String;")
    private String field4206;

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "Z")
    private boolean field4182;

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "Z")
    private boolean field4183;

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "Z")
    private boolean field4187;

    @OriginalMember(owner = "client!nba", name = "n", descriptor = "Z")
    private boolean field4193;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V", line = 5)
    public static void method1926(int arg0) {
        if (arg0 != -2) {
            method1926(-74);
        }
        field4204 = null;
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)V", line = 15)
    public final void method1927(int arg0) throws IOException {
        field4195++;
        if (this.field4193) {
            return;
        }
        if (arg0 < 80) {
            this.method1933(64);
        }
        while (!this.field4187) {
            class206 var2;
            if (this.field4182) {
                var2 = (class206) this.field4189.method1180((byte) 26, (long) this.field4199.getSerialNumber());
            } else {
                var2 = this.method1940((byte) 48);
                if (var2 == null) {
                    if (this.field4183) {
                        this.method1934(-2);
                    }
                    return;
                }
                if (var2 == null) {
                    throw new IllegalStateException();
                }
                this.field4182 = true;
            }
            if (this.field4186 == var2) {
                if (this.field4186.method1715(24) >= 50) {
                    return;
                }
                while (this.field4186.field2716.packetOut(this.field4192) == 1) {
                    this.field4186.method1267((byte) 120, this.field4192);
                    this.method1938(0);
                    if (this.field4180 != null) {
                        double var4 = this.field4180.method585(2048);
                        for (int var6 = 0; var6 < 10 && this.method1931(0); var6++) {
                            this.method1928(1);
                            if (this.field4187) {
                                return;
                            }
                        }
                        if (this.field4180.method585(2048) > var4) {
                            return;
                        }
                    }
                    if (this.field4186.method1715(-106) >= 50) {
                        return;
                    }
                }
            } else if ((var2 instanceof class248)) {
                this.method1938(0);
            } else if (this.field4180 != var2) {
                while (var2.field2716.packetOut(this.field4192) == 1) {
                    if (var2.field2715 == 1 && var2 instanceof class248) {
                        this.method1939(10, this.field4206);
                    }
                    var2.method1267((byte) 117, this.field4192);
                }
            } else if (this.field4186 == null && !this.field4193) {
                for (int var3 = 0; var3 < 10 && this.method1931(0); var3++) {
                    this.method1928(1);
                    if (this.field4187) {
                        return;
                    }
                }
                return;
            }
            this.field4182 = false;
        }
    }

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "(I)V", line = 141)
    private final void method1928(int arg0) throws IOException {
        field4191++;
        while (this.field4180.field2716.packetOut(this.field4192) != 1) {
            class206 var2 = this.method1940((byte) 48);
            if (var2 == null) {
                if (this.field4183) {
                    this.method1934(arg0 - 3);
                }
                return;
            }
            if (this.field4202 == var2) {
                this.method1938(arg0 ^ 0x1);
            }
        }
        this.field4180.method1267((byte) 94, this.field4192);
        if (arg0 != 1) {
            this.method1939(89, null);
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)Lkw;", line = 174)
    public final class248 method1929(byte arg0) {
        int var2 = 2 / ((arg0 + 1) / 55);
        field4184++;
        return this.field4202;
    }

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "(I)D", line = 185)
    public final double method1930(int arg0) {
        field4181++;
        if (this.field4186 != null) {
            return this.field4186.method1716(false);
        } else if (this.field4180 == null) {
            int var2 = -6 % ((-arg0 - 20) / 41);
            return 0.0D;
        } else {
            return this.field4180.method585(2048);
        }
    }

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "(I)Z", line = 204)
    private final boolean method1931(int arg0) {
        field4194++;
        if (arg0 != 0) {
            return true;
        } else if (this.field4186 == null) {
            double var2 = (double) this.field4180.method578((byte) -43);
            return var2 == 0.0D || (double) class479.method2864((byte) -101) >= 1000.0D / var2 + (double) this.field4180.method581(0);
        } else {
            return !this.field4180.method580(-1) || this.method1930(-125) > this.field4180.method585(2048);
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IZ)V", line = 223)
    public final void method1932(int arg0, boolean arg1) {
        field4198++;
        if (arg0 != -16426) {
            this.field4189 = null;
        }
        if (this.field4186 != null) {
            class560 var3 = this.field4186.method1718((byte) 87);
            if (var3 != null) {
                var3.method3229((byte) -123, arg1);
            }
        }
        this.field4193 = !this.field4193;
    }

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "(I)Lpv;", line = 245)
    public final class70 method1933(int arg0) {
        if (arg0 == -2) {
            field4207++;
            return this.field4180;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "(I)V", line = 257)
    private final void method1934(int arg0) {
        field4200++;
        for (class206 var2 = (class206) this.field4189.method1176(24490); var2 != null; var2 = (class206) this.field4189.method1178((byte) 71)) {
            if (this.field4180 != var2) {
                while (var2.field2716.packetOut() == 1) {
                    var2.method1267((byte) 84, this.field4192);
                }
            }
        }
        if (arg0 != -2) {
            this.field4193 = true;
        }
        if (this.field4180 == null) {
            return;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (!this.method1931(0)) {
                return;
            }
            if (this.field4180.field2716.packetOut() != 1) {
                this.method1936(0);
                return;
            }
            this.field4180.method1267((byte) 124, this.field4192);
        }
    }

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "(I)Z", line = 301)
    public final boolean method1935(int arg0) {
        field4201++;
        if (!this.field4187 && !this.field4183) {
            return false;
        } else if (this.field4186 == null || this.field4186.method1715(119) <= 0) {
            if (arg0 != 0) {
                this.field4199 = null;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nba", name = "i", descriptor = "(I)V", line = 321)
    public final void method1936(int arg0) {
        field4190++;
        if (this.field4187) {
            return;
        }
        for (class206 var2 = (class206) this.field4189.method1176(24490); var2 != null; var2 = (class206) this.field4189.method1178((byte) 71)) {
            var2.method584(arg0 - 110);
            var2.field2716.method4009();
        }
        this.field4192.method4009();
        if (arg0 == 0) {
            this.field4199.method4009();
            this.field4185.method4009();
            this.field4187 = true;
        }
    }

    @OriginalMember(owner = "client!nba", name = "j", descriptor = "(I)V", line = 363)
    private final void method1938(int arg0) {
        if (arg0 != 0) {
            this.field4188 = null;
        }
        for (class206 var2 = (class206) this.field4189.method1176(arg0 + 24490); var2 != null; var2 = (class206) this.field4189.method1178((byte) 71)) {
            if (var2 instanceof class248) {
                class248 var3 = (class248) var2;
                while ((var3.field2715 <= 8 || this.method1930(59) > (double) var3.method1584((byte) 64)) && var3.field2716.packetOut(this.field4192) == 1) {
                    var3.method1267((byte) 87, this.field4192);
                }
            }
        }
        field4196++;
        this.method1939(10, this.field4206);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(ILjava/lang/String;)V", line = 403)
    public final void method1939(int arg0, String arg1) {
        field4197++;
        this.field4206 = arg1;
        if (this.field4206 == null) {
            this.field4202 = null;
            return;
        }
        if (this.field4202 != null && !this.field4206.equals(this.field4202.method1585(false))) {
            this.field4202 = null;
        }
        if (this.field4202 == null) {
            for (class206 var3 = (class206) this.field4189.method1176(24490); var3 != null; var3 = (class206) this.field4189.method1178((byte) 71)) {
                if (var3 instanceof class248) {
                    class248 var4 = (class248) var3;
                    if (this.field4206.equals(var4.method1585(false))) {
                        this.field4202 = var4;
                        return;
                    }
                }
            }
        }
        if (arg0 != 10) {
            this.method1941(true);
        }
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(B)Luga;", line = 455)
    private final class206 method1940(byte arg0) throws IOException {
        field4205++;
        if (this.field4187) {
            throw new IllegalStateException();
        } else if (this.field4183) {
            return null;
        } else {
            while (this.field4185.pageOut(this.field4199) <= 0) {
                int var10 = this.method1937((byte) 10, this.field4188);
                if (var10 == -1) {
                    this.field4183 = true;
                    return null;
                }
                if (var10 == 0) {
                    return null;
                }
                if (!this.field4185.write(this.field4188, var10)) {
                    throw new RuntimeException("");
                }
            }
            if (arg0 != 48) {
                this.field4192 = null;
            }
            int var2 = this.field4199.getSerialNumber();
            if (!this.field4199.isBOS()) {
                class206 var9 = (class206) this.field4189.method1180((byte) 26, (long) var2);
                if (!var9.field2716.pageIn(this.field4199)) {
                    throw new IllegalStateException();
                }
                return var9;
            }
            OggStreamState var3 = new OggStreamState(var2);
            if (!var3.pageIn(this.field4199)) {
                throw new IllegalStateException();
            } else if (var3.packetPeek(this.field4192) == 1) {
                class206 var4;
                if (this.field4180 == null && this.field4192.isTheora()) {
                    this.field4180 = new class70(var3);
                    var4 = this.field4180;
                } else if (this.field4186 == null && this.field4192.isVorbis()) {
                    this.field4186 = new class262(var3);
                    var4 = this.field4186;
                } else {
                    byte[] var5 = this.field4192.getData();
                    StringBuffer var6 = new StringBuffer();
                    for (int var7 = 1; var5.length > var7 && Character.isLetterOrDigit((char) var5[var7]); var7++) {
                        var6.append((char) var5[var7]);
                    }
                    String var8 = var6.toString();
                    if (var8.equals("kate")) {
                        var4 = new class248(var3);
                    } else {
                        var4 = new class118(var3);
                    }
                }
                this.field4189.method1179((long) var2, var4, (byte) -26);
                return var4;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(I)V", line = 569)
    public class298(int arg0) {
        if (!class608.method3425("jagtheora", true)) {
            throw new RuntimeException("Failed to load jagtheora library");
        }
        this.field4188 = new byte[arg0];
        this.field4185 = new OggSyncState();
        this.field4199 = new OggPage();
        this.field4192 = new OggPacket();
        this.field4189 = new class188(8);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Z)Loca;", line = 584)
    public final class262 method1941(boolean arg0) {
        field4203++;
        if (arg0) {
            this.method1932(-11, true);
        }
        return this.field4186;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(B[B)I")
    public abstract int method1937(byte arg0, byte[] arg1) throws IOException;
}
