import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class363 {

    @OriginalMember(owner = "client!afa", name = "k", descriptor = "Liha;")
    private class29 field5937 = new class29(64);

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "Lgda;")
    private class58 field5936;

    @OriginalMember(owner = "client!afa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5941 = new String[] { method3014(method3013(" \u0013H\u0003Di")), method3014(method3013(" \u0013H\u0003Bi")), method3014(method3013(" \u0013H\u0003:(\u001b@Y8i")), method3014(method3013("/\u0000EA")), method3014(method3013(":[\u0007\u0003{")), method3014(method3013("6\u001cG")), method3014(method3013("o\u0011EA")), method3014(method3013("-\u001cGX~")), method3014(method3013(",\u0014J")), method3014(method3013("-\u001cK")), method3014(method3013("o\u0006F")), method3014(method3013("o\u0011PAo#")), method3014(method3013(" \u0013H\u0003@i")), method3014(method3013(" \u0013H\u0003Ci")), method3014(method3013(" \u0013H\u0003Ei")), method3014(method3013(" \u0013H\u0003Ai")), method3014(method3013(" \u0013H\u0003Gi")) };

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "Lhl;")
    public static class556 field5934 = new class556(100, 3);

    @OriginalMember(owner = "client!afa", name = "i", descriptor = "Liha;")
    public static class29 field5940 = new class29(4);

    @OriginalMember(owner = "client!afa", name = "f", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!afa", name = "g", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!afa", name = "j", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!afa", name = "h", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "Ljava/lang/Object;")
    public static Object field5938;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IZ)Lev;", line = 6)
    public final class723 method3006(int arg0, boolean arg1) {
        try {
            field5939++;
            class29 var3 = this.field5937;
            class723 var4;
            synchronized (this.field5937) {
                var4 = (class723) this.field5937.method302(-91, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class58 var5 = this.field5936;
            byte[] var6;
            synchronized (this.field5936) {
                var6 = this.field5936.method604((byte) 11, arg0, 54);
            }
            class723 var7 = new class723();
            if (!arg1) {
                return null;
            }
            if (var6 != null) {
                var7.method5250(new class176(var6), 1);
            }
            class29 var8 = this.field5937;
            synchronized (this.field5937) {
                this.field5937.method295(false, (long) arg0, var7);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field5941[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(III)Z", line = 36)
    public static final boolean method3007(int arg0, int arg1, int arg2) {
        try {
            field5935++;
            if (arg1 > -56) {
                field5934 = null;
            }
            return (arg0 & 0x8000) != 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5941[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)V", line = 47)
    public final void method3008(byte arg0) {
        try {
            if (arg0 != 30) {
                method3011(false);
            }
            field5932++;
            class29 var2 = this.field5937;
            synchronized (this.field5937) {
                this.field5937.method298(5);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5941[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V", line = 62)
    public final void method3009(int arg0) {
        try {
            if (arg0 != -11187) {
                this.method3010(-78, 44);
            }
            field5931++;
            class29 var2 = this.field5937;
            synchronized (this.field5937) {
                this.field5937.method304(arg0 + 11188);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5941[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(II)V", line = 78)
    public final void method3010(int arg0, int arg1) {
        try {
            field5933++;
            class29 var3 = this.field5937;
            synchronized (this.field5937) {
                if (arg0 != -16095) {
                    field5938 = null;
                }
                this.field5937.method294(arg1, arg0 + 15465);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field5941[14] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(Z)V", line = 91)
    public static void method3011(boolean arg0) {
        try {
            field5934 = null;
            if (arg0) {
                method3007(1, -64, -49);
            }
            field5938 = null;
            field5940 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5941[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 105)
    public static final String method3012(String arg0, int arg1) {
        try {
            if (arg1 != 4) {
                method3007(-122, -46, 125);
            }
            field5930++;
            if (class726.field10649.startsWith(field5941[5])) {
                return arg0 + field5941[6];
            } else if (class726.field10649.startsWith(field5941[7])) {
                return field5941[9] + arg0 + field5941[10];
            } else if (class726.field10649.startsWith(field5941[8])) {
                return field5941[9] + arg0 + field5941[11];
            } else {
                return null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5941[12] + (arg0 == null ? field5941[3] : field5941[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lpo;ILgda;)V", line = 138)
    public class363(class585 arg0, int arg1, class58 arg2) {
        try {
            this.field5936 = arg2;
            if (this.field5936 != null) {
                this.field5936.method580(80, 54);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5941[2] + (arg0 == null ? field5941[3] : field5941[4]) + ',' + arg1 + ',' + (arg2 == null ? field5941[3] : field5941[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!afa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3013(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!afa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3014(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 65;
                    break;
                case 1:
                    var10005 = 117;
                    break;
                case 2:
                    var10005 = 41;
                    break;
                case 3:
                    var10005 = 45;
                    break;
                default:
                    var10005 = 6;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
