import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class242 extends class423 {

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field3735;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field3737;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field3734;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "[Ljava/lang/String;")
    private static final String[] field3747 = new String[] { method2093(method2092("5\b\u0005\u001d4")), method2093(method2092("5\b\u0005\u00104")), method2093(method2092("5\b\u0005\u001f4")), method2093(method2092(";C\u0005ta")), method2093(method2092(".\u0018G6")), method2093(method2092("5\b\u0005\u00114")), method2093(method2092("5\b\u0005\u001e4")), method2093(method2092("5\b\u0005fu.\u0004_d4")), method2093(method2092("5\b\u0005\u00184")), method2093(method2092("5\b\u0005\u001b4")), method2093(method2092("5\b\u0005\u00194")), method2093(method2092("5\b\u0005\u00164")), method2093(method2092("5\b\u0005\u00124")), method2093(method2092("5\b\u0005\u001c4")), method2093(method2092("5\b\u0005\u00134")) };

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field3741 = new String[100];

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "Lvn;")
    public static class330 field3718 = new class330(23, -1);

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public static int field3746 = 1;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "D")
    private double field3725;

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    private int field3728;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "I")
    private int field3729;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "J")
    private long field3736;

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "Lhk;")
    private class107 field3733;

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "Lgda;")
    public static class58 field3745;

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field3732;

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field3739;

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field3720;

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "Z")
    private boolean field3721;

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "Z")
    private boolean field3724;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "Z")
    private boolean field3726;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "Z")
    private boolean field3730;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)V")
    private final void method2080(byte arg0, int arg1) {
        try {
            field3719++;
            this.field3728 = arg1;
            if (this.field3721) {
                if (this.field3728 > this.field3729) {
                    this.field3728 = this.field3729;
                }
                if (this.field3728 < 0) {
                    this.field3728 = 0;
                }
                this.field3732.setPostProcessingLevel(this.field3728);
            }
            if (arg0 != -17) {
                method2089(-117);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3747[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)Z")
    public final boolean method2081(byte arg0) {
        try {
            if (arg0 < 1) {
                return true;
            } else {
                field3723++;
                return this.field3721;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3747[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILha;)Lkaa;")
    public static final class49 method2082(int arg0, int arg1, class63 arg2) {
        try {
            field3717++;
            class85 var3 = class33.method341(arg2, arg1, true, 0);
            if (var3 == null) {
                return null;
            } else {
                if (arg0 != 22306) {
                    field3718 = null;
                }
                return var3.field1278;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3747[5] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field3747[4] : field3747[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lha;I)Lhk;")
    public final class107 method2083(class63 arg0, int arg1) {
        try {
            field3738++;
            if (arg1 <= 86) {
                return null;
            } else if (this.field3739 == null) {
                return null;
            } else if (this.field3724 || this.field3733 == null) {
                this.field3733 = arg0.method266(this.field3739.pixels, 0, this.field3739.field10942, this.field3739.field10942, this.field3739.field10943, false);
                this.field3724 = false;
                return this.field3733;
            } else {
                return this.field3733;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3747[14] + (arg0 == null ? field3747[4] : field3747[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method2084(long arg0, int arg1) {
        try {
            field3722++;
            if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
                return null;
            }
            if (arg1 != 31473) {
                field3745 = null;
            }
            if ((arg0 % 37L) == 0L) {
                return null;
            }
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class278.field4470[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field3747[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)D")
    public final double method2085(int arg0) {
        try {
            if (arg0 != 29484) {
                this.method2086((byte) 2, null);
            }
            field3727++;
            return this.field3725;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3747[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLjagtheora/ogg/OggPacket;)V")
    public final void method2086(byte arg0, OggPacket arg1) {
        try {
            if (arg0 >= -125) {
                field3745 = null;
            }
            field3740++;
            if (this.field3721) {
                this.field3736 = class712.method5167(-2334);
                int var4 = this.field3732.decodePacketIn(arg1, this.field3720);
                if (var4 < 0) {
                    throw new IllegalStateException(String.valueOf(var4));
                }
                this.field3732.granuleFrame(this.field3720);
                this.field3725 = this.field3732.granuleTime(this.field3720);
                if (this.field3726) {
                    boolean var5 = arg1.isKeyFrame() == 1;
                    if (!var5) {
                        return;
                    }
                    this.field3726 = false;
                }
                if (!this.field3730 || arg1.isKeyFrame() == 1) {
                    if (this.field3732.decodeFrame(this.field3739) != 0) {
                        throw new IllegalStateException(String.valueOf(var4));
                    }
                    this.field3724 = true;
                }
            } else {
                int var3 = this.field3735.decodeHeader(this.field3737, this.field3734, arg1);
                if (var3 == 0) {
                    this.field3721 = true;
                    if (this.field3737.frameWidth > 2048 || this.field3737.frameHeight > 1024) {
                        throw new IllegalStateException();
                    }
                    this.field3732 = new DecoderContext(this.field3737, this.field3735);
                    this.field3720 = new GranulePos();
                    this.field3739 = new Frame(this.field3737.frameWidth, this.field3737.frameHeight);
                    this.field3729 = this.field3732.getMaxPostProcessingLevel();
                    this.method2080((byte) -17, this.field3728);
                } else if (var3 < 0) {
                    throw new IllegalStateException(String.valueOf(var3));
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3747[6] + arg0 + ',' + (arg1 == null ? field3747[4] : field3747[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)F")
    public final float method2087(int arg0) {
        try {
            field3743++;
            if (arg0 == 381) {
                return this.field3721 && !this.field3737.method5418() ? (float) this.field3737.fpsNumerator / (float) this.field3737.fpsDenominator : 0.0F;
            } else {
                return 0.20030208F;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3747[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)V")
    public static void method2088(byte arg0) {
        try {
            if (arg0 == 86) {
                field3745 = null;
                field3718 = null;
                field3741 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3747[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class242(OggStreamState arg0) {
        super(arg0);
        try {
            this.field3735 = new SetupInfo();
            this.field3737 = new TheoraInfo();
            this.field3734 = new TheoraComment();
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3747[7] + (arg0 == null ? field3747[4] : field3747[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
    public static final void method2089(int arg0) {
        try {
            field3742++;
            for (int var1 = arg0; var1 < class258.field3904; var1++) {
                int var2 = class207.method1870(class258.field3904, arg0 ^ 0x5B, class537.field7888 + var1) * class152.field2133;
                for (int var3 = 0; var3 < class152.field2133; var3++) {
                    int var4 = var2 + class207.method1870(class152.field2133, 61, var3 + class574.field8297);
                    if (class194.field3055[var4] == class143.field2028) {
                        class574.field8295[var4].method3587(0, 0, class667.field9483, class742.field10924, class667.field9483 * var3, class742.field10924 * var1, true, true);
                    }
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3747[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public final void method2090(byte arg0) {
        try {
            if (arg0 != 124) {
                field3718 = null;
            }
            field3731++;
            if (this.field3739 != null) {
                this.field3739.method5417();
            }
            if (this.field3732 != null) {
                this.field3732.method5417();
                this.field3732 = null;
            }
            if (this.field3720 != null) {
                this.field3720.method5417();
                this.field3720 = null;
            }
            this.field3737.method5417();
            this.field3734.method5417();
            this.field3735.method5417();
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3747[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)J")
    public final long method2091(int arg0) {
        try {
            field3744++;
            return arg0 == 0 ? this.field3736 : 6L;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3747[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2092(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2093(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 64;
                    break;
                case 1:
                    var10005 = 109;
                    break;
                case 2:
                    var10005 = 43;
                    break;
                case 3:
                    var10005 = 90;
                    break;
                default:
                    var10005 = 28;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
