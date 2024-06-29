import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class15 {

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "I")
    private int field197 = -1;

    @OriginalMember(owner = "client!raa", name = "f", descriptor = "Ltf;")
    private class524 field196 = new class524();

    @OriginalMember(owner = "client!raa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field201 = new String[] { method105(method104("vn\u001eS")), method105(method104("c5\\\u0011\u0003")), method105(method104("jz\u0013\u0011Bqu\u001bK@0")), method105(method104("jz\u0013\u0011<0")), method105(method104("jz\u0013\u0011?0")), method105(method104("8\u007f\u0017S\ny5\u001dH\u0010}iH")), method105(method104("[w\u0013Q-}o\u0006V\u0010\u007fh6Z\u0012lz\\^\u000ehw\u000bk\u0011[w\u0013Q-}o\u0006V\u0010\u007fhZ\u0016D8X\u0000Z\u001a}u\u0006V\u001fthR[\u00118u\u001dK^uz\u0006\\\u00169;!Z\nlr\u001cX\r6t\u0005Q\u001bj!")), method105(method104("8n\u0002[\u001fl~<J\u0013\"")), method105(method104("jz\u0013\u0011=0")), method105(method104("nx")), method105(method104("l!")), method105(method104("jz\u0013\u0011:0")), method105(method104("Mu\u0000Z\u001dw|\u001cV\r}\u007fR|\u0012yu!Z\nlr\u001cX\r\\~\u001eK\u001f8o\u000bO\u001b8r\u001c\u001f\u001a}x\u001d[\u001b02")) };

    @OriginalMember(owner = "client!raa", name = "g", descriptor = "Ldfa;")
    public static class477 field193 = new class477(8);

    @OriginalMember(owner = "client!raa", name = "i", descriptor = "[I")
    public static int[] field198 = null;

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "F")
    public static float field199;

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!raa", name = "h", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!raa", name = "j", descriptor = "J")
    private long field194;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Z)V")
    public static void method100(boolean arg0) {
        try {
            if (arg0) {
                field200 = 42;
            }
            field198 = null;
            field193 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field201[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IILjava/awt/Canvas;I)Lwu;")
    public static final class451 method101(int arg0, int arg1, Canvas arg2, int arg3) {
        try {
            field195++;
            try {
                Class var4 = Class.forName(field201[9]);
                class451 var5 = (class451) var4.getDeclaredConstructor().newInstance();
                var5.method777(arg2, arg3 ^ 0xFFFFFF86, arg1, arg0);
                return arg3 == -1 ? var5 : null;
            } catch (Throwable var8) {
                class385 var6 = new class385();
                var6.method777(arg2, 122, arg1, arg0);
                return var6;
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field201[8] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field201[0] : field201[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lwfa;Z)V")
    public final void method102(class286 arg0, boolean arg1) {
        try {
            field192++;
            if (this.field194 != arg0.field4020 || this.field197 != arg0.field4054) {
                throw new RuntimeException(field201[6] + class626.method4599((byte) -104, arg0.field4020) + field201[7] + arg0.field4054 + field201[5] + class626.method4599((byte) -104, this.field194) + field201[7] + this.field197);
            }
            class114 var3 = (class114) this.field196.method3977((byte) -102);
            if (!arg1) {
                this.field194 = -118L;
            }
            while (var3 != null) {
                var3.method115(95, arg0);
                var3 = (class114) this.field196.method3987(0);
            }
            arg0.field4054++;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field201[4] + (arg0 == null ? field201[0] : field201[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILjc;)V")
    private final void method103(int arg0, class711 arg1) {
        try {
            if (arg0 < 100) {
                this.method103(-45, null);
            }
            field191++;
            this.field194 = arg1.method5147((byte) 111);
            this.field197 = arg1.method5113(18443);
            for (int var3 = arg1.method5128(0); var3 != 0; var3 = arg1.method5128(0)) {
                if (class389.field5673) {
                    System.out.println(field201[10] + var3);
                }
                class114 var4;
                if (var3 == 3) {
                    var4 = new class601();
                } else if (var3 == 1) {
                    var4 = new class184();
                } else if (var3 == 13) {
                    var4 = new class17();
                } else if (var3 == 4) {
                    var4 = new class491();
                } else if (var3 == 6) {
                    var4 = new class278();
                } else if (var3 == 5) {
                    var4 = new class783();
                } else if (var3 == 2) {
                    var4 = new class738();
                } else if (var3 == 7) {
                    var4 = new class283();
                } else if (var3 == 8) {
                    var4 = new class164();
                } else if (var3 == 9) {
                    var4 = new class525();
                } else if (var3 == 10) {
                    var4 = new class30();
                } else if (var3 == 11) {
                    var4 = new class786();
                } else if (var3 == 12) {
                    var4 = new class159();
                } else {
                    throw new RuntimeException(field201[12]);
                }
                var4.method116(arg1, -27800);
                this.field196.method3984(var4, 0);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field201[11] + arg0 + ',' + (arg1 == null ? field201[0] : field201[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(Ljc;)V")
    public class15(class711 arg0) {
        try {
            this.method103(103, arg0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field201[2] + (arg0 == null ? field201[0] : field201[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!raa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method104(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!raa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method105(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 24;
                    break;
                case 1:
                    var10005 = 27;
                    break;
                case 2:
                    var10005 = 114;
                    break;
                case 3:
                    var10005 = 63;
                    break;
                default:
                    var10005 = 126;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
