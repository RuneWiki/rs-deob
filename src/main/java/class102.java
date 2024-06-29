import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public abstract class class102 {

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "[B")
    private byte[] field1360;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field1359;

    @OriginalMember(owner = "client!gq", name = "z", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field1376;

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field1370;

    @OriginalMember(owner = "client!gq", name = "v", descriptor = "Lrda;")
    private class467 field1372;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "Z")
    public static boolean field1357 = true;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "Lrn;")
    public static class633 field1355 = new class633(26, 3);

    @OriginalMember(owner = "client!gq", name = "u", descriptor = "F")
    public static float field1371;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!gq", name = "s", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!gq", name = "x", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!gq", name = "A", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!gq", name = "B", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!gq", name = "E", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!gq", name = "G", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!gq", name = "H", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!gq", name = "C", descriptor = "Lsm;")
    private class407 field1379;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "Luh;")
    private class433 field1362;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "Let;")
    private class435 field1351;

    @OriginalMember(owner = "client!gq", name = "F", descriptor = "Lclient;")
    public static client field1382;

    @OriginalMember(owner = "client!gq", name = "y", descriptor = "Ljava/lang/String;")
    private String field1375;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "Z")
    private boolean field1361;

    @OriginalMember(owner = "client!gq", name = "r", descriptor = "Z")
    private boolean field1368;

    @OriginalMember(owner = "client!gq", name = "w", descriptor = "Z")
    private boolean field1373;

    @OriginalMember(owner = "client!gq", name = "D", descriptor = "Z")
    private boolean field1380;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
    public final void method581(byte arg0) throws IOException {
        field1374++;
        if (arg0 != -65) {
            this.field1376 = null;
        }
        if (this.field1380) {
            return;
        }
        while (!this.field1373) {
            class464 var2;
            if (this.field1368) {
                var2 = (class464) this.field1372.method2616((long) this.field1376.getSerialNumber(), (byte) -84);
            } else {
                var2 = this.method589((byte) -46);
                if (var2 == null) {
                    if (this.field1361) {
                        this.method584(0);
                    }
                    return;
                }
                if (var2 == null) {
                    throw new IllegalStateException();
                }
                this.field1368 = true;
            }
            if (this.field1351 == var2) {
                if (this.field1351.method2498(-113) >= 50) {
                    return;
                }
                while (this.field1351.field6029.packetOut(this.field1370) == 1) {
                    this.field1351.method2606(true, this.field1370);
                    this.method593((byte) 108);
                    if (this.field1379 != null) {
                        double var4 = this.field1379.method2372(true);
                        for (int var6 = 0; var6 < 10 && this.method582((byte) -104); var6++) {
                            this.method590(-2);
                            if (this.field1373) {
                                return;
                            }
                        }
                        if (var4 < this.field1379.method2372(true)) {
                            return;
                        }
                    }
                    if (this.field1351.method2498(-117) >= 50) {
                        return;
                    }
                }
            } else if (var2 instanceof class433) {
                this.method593((byte) 119);
            } else if (this.field1379 != var2) {
                while (var2.field6029.packetOut(this.field1370) == 1) {
                    if (var2.field6024 == 1 && var2 instanceof class433) {
                        this.method588(this.field1375, (byte) 13);
                    }
                    var2.method2606(true, this.field1370);
                }
            } else if (this.field1351 == null && !this.field1380) {
                for (int var3 = 0; var3 < 10 && this.method582((byte) 63); var3++) {
                    this.method590(-2);
                    if (this.field1373) {
                        return;
                    }
                }
                return;
            }
            this.field1368 = false;
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)Z")
    private final boolean method582(byte arg0) {
        field1377++;
        int var2 = -92 / ((-arg0 - 23) / 58);
        if (this.field1351 == null) {
            double var3 = (double) this.field1379.method2370(-201);
            return var3 == 0.0D || (double) class502.method2786(-7114) >= 1000.0D / var3 + (double) this.field1379.method2366((byte) -69);
        } else {
            return !this.field1379.method2368(57) || this.method587(0) > this.field1379.method2372(true);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)Lsm;")
    public final class407 method583(boolean arg0) {
        if (arg0) {
            field1381++;
            return this.field1379;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
    private final void method584(int arg0) {
        field1356++;
        for (class464 var2 = (class464) this.field1372.method2610((byte) -28); var2 != null; var2 = (class464) this.field1372.method2620(0)) {
            if (this.field1379 != var2) {
                while (var2.field6029.packetOut() == 1) {
                    var2.method2606(true, this.field1370);
                }
            }
        }
        if (this.field1379 == null) {
            return;
        }
        for (int var3 = arg0; var3 < 10; var3++) {
            if (!this.method582((byte) 35)) {
                return;
            }
            if (this.field1379.field6029.packetOut() != 1) {
                this.method597(arg0 + 8);
                return;
            }
            this.field1379.method2606(true, this.field1370);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BLmc;)Lbo;")
    public static final class370 method585(byte arg0, class234 arg1) {
        field1378++;
        class1 var2 = class439.method2513(arg1, -60);
        if (arg0 >= -127) {
            field1371 = 0.3806012F;
        }
        int var3 = arg1.method1494(22527720);
        return new class370(var2.field1, var2.field7, var2.field3, var2.field12, var2.field11, var3);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZILfda;)V")
    public static final void method586(boolean arg0, int arg1, class381 arg2) {
        field1369++;
        int var3 = -1;
        int var4 = 0;
        if (arg0) {
            method598(39);
        }
        if (arg2.field4675 > class693.field8900) {
            class71.method427(arg2, 2);
        } else if (class693.field8900 <= arg2.field4690) {
            class296.method1772(512, arg2);
        } else {
            class204.method1386(6144, false, arg2);
            var4 = class463.field6020;
            var3 = class781.field10681;
        }
        if (arg2.field2896 < 512 || arg2.field2900 < 512 || arg2.field2896 >= (class240.field3280 * 512 - 512) || arg2.field2900 >= class276.field3602 * 512 - 512) {
            var4 = 0;
            arg2.field4675 = 0;
            var3 = -1;
            arg2.field4690 = 0;
            arg2.field4700 = -1;
            arg2.field4748 = null;
            arg2.field2896 = arg2.field4767[0] * 512 + arg2.method190((byte) -126) * 256;
            arg2.field2900 = arg2.field4758[0] * 512 + arg2.method190((byte) -128) * 256;
            arg2.method2182((byte) 55);
            for (int var5 = 0; var5 < arg2.field4747.length; var5++) {
                arg2.field4747[var5].field5625 = -1;
            }
        }
        if (class422.field5564 == arg2 && (arg2.field2896 < 6144 || arg2.field2900 < 6144 || class240.field3280 * 512 - 6144 <= arg2.field2896 || arg2.field2900 >= class276.field3602 * 512 - 6144)) {
            var4 = 0;
            arg2.field4700 = -1;
            arg2.field4675 = 0;
            var3 = -1;
            arg2.field4690 = 0;
            arg2.field4748 = null;
            arg2.field2896 = arg2.field4767[0] * 512 + (arg2.method190((byte) -70) * 256);
            arg2.field2900 = arg2.field4758[0] * 512 + (arg2.method190((byte) -83) * 256);
            arg2.method2182((byte) 38);
            for (int var6 = 0; var6 < arg2.field4747.length; var6++) {
                arg2.field4747[var6].field5625 = -1;
            }
        }
        int var7 = class106.method631(arg2, 59);
        class461.method2598(arg2, 1073741823);
        class503.method2788(-92, var7, var4, arg2, var3);
        class393.method2281(var3, arg2, 0);
        class540.method2942(arg2, -17946);
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)D")
    public final double method587(int arg0) {
        if (arg0 != 0) {
            return 1.8441005324305255D;
        }
        field1366++;
        if (this.field1351 == null) {
            return this.field1379 == null ? 0.0D : this.field1379.method2372(true);
        } else {
            return this.field1351.method2497(arg0 + 32413);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method588(String arg0, byte arg1) {
        this.field1375 = arg0;
        field1383++;
        if (this.field1375 == null) {
            this.field1362 = null;
            return;
        }
        if (this.field1362 != null && !this.field1375.equals(this.field1362.method2490((byte) -109))) {
            this.field1362 = null;
        }
        if (this.field1362 == null) {
            for (class464 var3 = (class464) this.field1372.method2610((byte) -70); var3 != null; var3 = (class464) this.field1372.method2620(0)) {
                if (var3 instanceof class433) {
                    class433 var4 = (class433) var3;
                    if (this.field1375.equals(var4.method2490((byte) -109))) {
                        this.field1362 = var4;
                        return;
                    }
                }
            }
        }
        if (arg1 <= 5) {
            method598(62);
        }
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(B)Lbk;")
    private final class464 method589(byte arg0) throws IOException {
        if (arg0 != -46) {
            this.method583(false);
        }
        field1384++;
        if (this.field1373) {
            throw new IllegalStateException();
        } else if (this.field1361) {
            return null;
        } else {
            while (this.field1359.pageOut(this.field1376) <= 0) {
                int var10 = this.method594(this.field1360, (byte) 87);
                if (var10 == -1) {
                    this.field1361 = true;
                    return null;
                }
                if (var10 == 0) {
                    return null;
                }
                if (!this.field1359.write(this.field1360, var10)) {
                    throw new RuntimeException("");
                }
            }
            int var2 = this.field1376.getSerialNumber();
            if (!this.field1376.isBOS()) {
                class464 var3 = (class464) this.field1372.method2616((long) var2, (byte) -96);
                if (!var3.field6029.pageIn(this.field1376)) {
                    throw new IllegalStateException();
                }
                return var3;
            }
            OggStreamState var4 = new OggStreamState(var2);
            if (!var4.pageIn(this.field1376)) {
                throw new IllegalStateException();
            } else if (var4.packetPeek(this.field1370) == 1) {
                class464 var5;
                if (this.field1379 == null && this.field1370.isTheora()) {
                    this.field1379 = new class407(var4);
                    var5 = this.field1379;
                } else if (this.field1351 == null && this.field1370.isVorbis()) {
                    this.field1351 = new class435(var4);
                    var5 = this.field1351;
                } else {
                    byte[] var6 = this.field1370.getData();
                    StringBuffer var7 = new StringBuffer();
                    for (int var8 = 1; var8 < var6.length && Character.isLetterOrDigit((char) var6[var8]); var8++) {
                        var7.append((char) var6[var8]);
                    }
                    String var9 = var7.toString();
                    if (var9.equals("kate")) {
                        var5 = new class433(var4);
                    } else {
                        var5 = new class81(var4);
                    }
                }
                this.field1372.method2619(var5, (long) var2, -1);
                return var5;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)V")
    private final void method590(int arg0) throws IOException {
        field1354++;
        if (arg0 != -2) {
            return;
        }
        while (this.field1379.field6029.packetOut(this.field1370) != 1) {
            class464 var2 = this.method589((byte) -46);
            if (var2 == null) {
                if (this.field1361) {
                    this.method584(0);
                }
                return;
            }
            if (this.field1362 == var2) {
                this.method593((byte) -63);
            }
        }
        this.field1379.method2606(true, this.field1370);
    }

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "(B)Let;")
    public final class435 method591(byte arg0) {
        if (arg0 == -119) {
            field1352++;
            return this.field1351;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "(B)Z")
    public final boolean method592(byte arg0) {
        field1367++;
        if (!this.field1373 && !this.field1361) {
            return false;
        } else if (this.field1351 == null || this.field1351.method2498(-122) <= 0) {
            return arg0 <= -26;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "(B)V")
    private final void method593(byte arg0) {
        class464 var2 = (class464) this.field1372.method2610((byte) -22);
        int var3 = -128 % ((arg0 - 16) / 52);
        while (var2 != null) {
            if (var2 instanceof class433) {
                class433 var4 = (class433) var2;
                while ((var4.field6024 <= 8 || this.method587(0) > (double) var4.method2488((byte) 84)) && var4.field6029.packetOut(this.field1370) == 1) {
                    var4.method2606(true, this.field1370);
                }
            }
            var2 = (class464) this.field1372.method2620(0);
        }
        field1364++;
        this.method588(this.field1375, (byte) 11);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "([BB)I")
    public abstract int method594(byte[] arg0, byte arg1) throws IOException;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(Z)Luh;")
    public final class433 method595(boolean arg0) {
        field1365++;
        if (!arg0) {
            method586(false, -55, null);
        }
        return this.field1362;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Luaa;III)V")
    public static final void method596(class391 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field5085 == 0) {
            arg0.field5119 = arg0.field4993;
        } else if (arg0.field5085 == 1) {
            arg0.field5119 = (arg2 - arg0.field5117) / 2 + arg0.field4993;
        } else if (arg0.field5085 == 2) {
            arg0.field5119 = arg2 - arg0.field5117 - arg0.field4993;
        } else if (arg0.field5085 == 3) {
            arg0.field5119 = arg0.field4993 * arg2 >> 14;
        } else if (arg0.field5085 == 4) {
            arg0.field5119 = (arg0.field4993 * arg2 >> 14) + (arg2 - arg0.field5117) / 2;
        } else {
            arg0.field5119 = arg2 - arg0.field5117 - (arg0.field4993 * arg2 >> 14);
        }
        field1363++;
        if (arg0.field5035 == 0) {
            arg0.field5003 = arg0.field5114;
        } else if (arg0.field5035 == 1) {
            arg0.field5003 = (arg3 - arg0.field5031) / 2 + arg0.field5114;
        } else if (arg0.field5035 == 2) {
            arg0.field5003 = arg3 - arg0.field5114 - arg0.field5031;
        } else if (arg0.field5035 == 3) {
            arg0.field5003 = arg0.field5114 * arg3 >> 14;
        } else if (arg0.field5035 == 4) {
            arg0.field5003 = (arg0.field5114 * arg3 >> 14) + (arg3 - arg0.field5031) / 2;
        } else {
            arg0.field5003 = arg3 - (arg0.field5114 * arg3 >> 14) - arg0.field5031;
        }
        if (arg1 != -5 || !class538.field6782) {
            return;
        }
        if (client.method2637(arg0).field4547 == 0 && arg0.field5007 != 0) {
            return;
        }
        if (arg0.field5119 < 0) {
            arg0.field5119 = 0;
        } else if ((arg0.field5119 + arg0.field5117) > arg2) {
            arg0.field5119 = arg2 - arg0.field5117;
        }
        if (arg0.field5003 < 0) {
            arg0.field5003 = 0;
            return;
        }
        if ((arg0.field5031 + arg0.field5003) > arg3) {
            arg0.field5003 = arg3 - arg0.field5031;
            return;
        }
    }

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "(I)V")
    public final void method597(int arg0) {
        field1353++;
        if (this.field1373) {
            return;
        }
        for (class464 var2 = (class464) this.field1372.method2610((byte) -126); var2 != null; var2 = (class464) this.field1372.method2620(0)) {
            var2.method508(arg0 ^ 0x59);
            var2.field6029.method549();
        }
        this.field1370.method549();
        this.field1376.method549();
        if (arg0 != 8) {
            method596(null, -5, -79, -11);
        }
        this.field1359.method549();
        this.field1373 = true;
    }

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)V")
    public static void method598(int arg0) {
        field1355 = null;
        field1382 = null;
        if (arg0 != 0) {
            method586(true, 17, null);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IZ)V")
    public final void method599(int arg0, boolean arg1) {
        int var3 = 80 % ((44 - arg0) / 56);
        field1358++;
        if (this.field1351 != null) {
            class338 var4 = this.field1351.method2494(31077);
            if (var4 != null) {
                var4.method1951(0, arg1);
            }
        }
        this.field1380 = !this.field1380;
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(I)V")
    public class102(int arg0) {
        if (!class382.method2194("jagtheora", 31749)) {
            throw new RuntimeException("Failed to load jagtheora library");
        }
        this.field1360 = new byte[arg0];
        this.field1359 = new OggSyncState();
        this.field1376 = new OggPage();
        this.field1370 = new OggPacket();
        this.field1372 = new class467(8);
    }
}
