import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class732 extends class298 {

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "[Ljava/lang/String;")
    private static final String[] field10637 = new String[] { method5342(method5341("s9\\q,")), method5342(method5341("ms\\\u001ay")), method5342(method5341("[B0")), method5342(method5341("fb\u001e3")), method5342(method5341("ms\\\u001ey")), method5342(method5341("ms\\\u001cy")), method5342(method5341("ms\\\u0017y")), method5342(method5341("ms\\\u001by")), method5342(method5341("ms\\\u0018y")), method5342(method5341("ms\\\u001dy")), method5342(method5341("ms\\\u0019y")) };

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "[I")
    public static int[] field10622 = new int[2048];

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "Lel;")
    public static class573 field10626 = new class573(78, -2);

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "F")
    private float field10633;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "F")
    private float field10636;

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
    private int field10623;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
    public static int field10624;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "I")
    public static int field10625;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    public static int field10627;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
    public static int field10628;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "I")
    private int field10630;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public static int field10631;

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    public static int field10632;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public static int field10634;

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "Ljava/lang/String;")
    private String field10621;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "Ljava/lang/String;")
    private String field10629;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "Ljava/lang/String;")
    private String field10635;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)F")
    public final float method5335(byte arg0) {
        try {
            ++field10624;
            if (arg0 != 126) {
                field10622 = null;
            }
            return this.field10633;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10637[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)Ljava/lang/String;")
    public final String method5336(byte arg0) {
        try {
            if (arg0 != -123) {
                this.method138((byte) -21);
            }
            ++field10625;
            return this.field10621;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10637[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)F")
    public final float method5337(boolean arg0) {
        try {
            ++field10632;
            if (!arg0) {
                this.field10629 = null;
            }
            return this.field10636;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10637[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(Z)V")
    public static void method5338(boolean arg0) {
        try {
            field10622 = null;
            field10626 = null;
            if (arg0) {
                method5339(83, '\u0018');
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10637[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IC)Z")
    public static final boolean method5339(int arg0, char arg1) {
        try {
            if (arg0 != -58) {
                method5339(68, '8');
            }
            ++field10628;
            return ~arg1 <= -49 && ~arg1 >= -58;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10637[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class732(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
    public final void method138(byte arg0) {
        try {
            if (arg0 != -119) {
                this.field10635 = null;
            }
            ++field10631;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10637[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V")
    public final void method139(OggPacket arg0, byte arg1) {
        try {
            ++field10627;
            if (super.field4695 <= 0 || field10637[2].equals(this.field10629)) {
                class163 var3 = new class163(arg0.getData());
                int var4 = 70 / ((arg1 - -14) / 36);
                int var5 = var3.method1455((byte) 62);
                if (~super.field4695 >= -9) {
                    if ((128 | var5) == 0) {
                        throw new IllegalStateException();
                    }
                    if (super.field4695 != 0) {
                        return;
                    }
                    var3.field2201 += 23;
                    this.field10630 = var3.method1408(-77);
                    this.field10623 = var3.method1408(-112);
                    if (this.field10630 == 0 || this.field10623 == 0) {
                        throw new IllegalStateException();
                    }
                    class163 var13 = new class163(16);
                    var3.method1413(var13.field2209, -16385, 16, 0);
                    this.field10621 = var13.method1423(96);
                    var13.field2201 = 0;
                    var3.method1413(var13.field2209, -16385, 16, 0);
                    this.field10629 = var13.method1423(-92);
                } else {
                    if (~var5 == -1) {
                        long var6 = var3.method1421((byte) 126);
                        long var8 = var3.method1421((byte) 126);
                        long var10 = var3.method1421((byte) 126);
                        if (var6 < 0L || var8 < 0L || var10 < 0L || ~var10 < ~var6) {
                            throw new IllegalStateException();
                        }
                        this.field10636 = (float) ((long) this.field10623 * var6) / (float) this.field10630;
                        this.field10633 = (float) ((var6 + var8) * (long) this.field10623) / (float) this.field10630;
                        int var12 = var3.method1408(110);
                        if (var12 < 0 || ~var12 < ~(var3.field2209.length - var3.field2201)) {
                            throw new IllegalStateException();
                        }
                        this.field10635 = class612.method4521(var3.field2209, var12, var3.field2201, true);
                    }
                    if (~(var5 | 128) != -1) {
                        return;
                    }
                }
            }
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field10637[1] + (arg0 != null ? field10637[0] : field10637[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)Ljava/lang/String;")
    public final String method5340(int arg0) {
        try {
            if (arg0 != 0) {
                method5338(false);
            }
            ++field10634;
            return this.field10635;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10637[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5341(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 81);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5342(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 8;
                    break;
                case 1:
                    var10005 = 23;
                    break;
                case 2:
                    var10005 = 114;
                    break;
                case 3:
                    var10005 = 95;
                    break;
                default:
                    var10005 = 81;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
