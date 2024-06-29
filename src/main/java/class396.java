import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class396 {

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Liha;")
    private class29 field6282 = new class29(64);

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "Lgda;")
    private class58 field6277;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public int field6280;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6287 = new String[] { method3209(method3208("h8Fsh")), method3209(method3208("h8Fuh")), method3209(method3208("h8Fqh")), method3209(method3208("h8Fth")), method3209(method3208("h8Frh")), method3209(method3208("d&\u0004[")), method3209(method3208("q}F\u0019=")), method3209(method3208("h8F\u000b)d:\u001c\th")) };

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "[[I")
    public static int[][] field6284 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "Lpe;")
    public static class636 field6283 = new class636(14, 0, 4, 1);

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "()V", line = 8)
    public static final void method3202() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class780.field11382.length; var1++) {
                if (class780.field11382[var1].method3313()) {
                    class155.field2158[var1] = class780.field11382[var1].method3308();
                } else {
                    synchronized (class780.field11382[var1]) {
                        class780.field11382[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class780.field11382[class780.field11382.length - 1].method3311();
                class18.method124(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class780.field11382.length - 1; var4++) {
                        if (!class780.field11382[var4].method3313()) {
                            synchronized (class780.field11382[var4]) {
                                class780.field11382[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class780.field11382.length - 2; var6++) {
                            class780.field11382[var6].method3311();
                        }
                        class18.method124(2);
                        while (!class780.field11382[0].method3313()) {
                            synchronized (class780.field11382[0]) {
                                class780.field11382[0].notify();
                            }
                            try {
                                class524.method3918(-4, 1L);
                            } catch (Exception var9) {
                            }
                        }
                        class780.field11382[0].method3311();
                        return;
                    }
                    try {
                        class524.method3918(-4, 1L);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class524.method3918(-4, 1L);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)V", line = 105)
    public final void method3203(int arg0, int arg1) {
        try {
            field6281++;
            if (arg1 != 9288) {
                field6285 = -31;
            }
            class29 var3 = this.field6282;
            synchronized (this.field6282) {
                this.field6282.method294(arg0, arg1 - 9918);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6287[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 119)
    public static void method3204(int arg0) {
        try {
            field6284 = null;
            field6283 = null;
            if (arg0 != 0) {
                method3204(-122);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6287[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V", line = 131)
    public final void method3205(boolean arg0) {
        try {
            field6279++;
            if (arg0) {
                this.method3206((byte) 50);
            }
            class29 var2 = this.field6282;
            synchronized (this.field6282) {
                this.field6282.method304(1);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6287[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V", line = 145)
    public final void method3206(byte arg0) {
        try {
            class29 var2 = this.field6282;
            synchronized (this.field6282) {
                int var3 = -127 / ((arg0 - 58) / 53);
                this.field6282.method298(5);
            }
            field6286++;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6287[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)Lkr;", line = 159)
    public final class780 method3207(int arg0, int arg1) {
        try {
            field6278++;
            class29 var3 = this.field6282;
            class780 var4;
            synchronized (this.field6282) {
                var4 = (class780) this.field6282.method302(arg1 - 17746, (long) arg0);
                if (arg1 != 17618) {
                    this.field6277 = null;
                }
            }
            if (var4 != null) {
                return var4;
            }
            class58 var5 = this.field6277;
            byte[] var6;
            synchronized (this.field6277) {
                var6 = this.field6277.method604((byte) 126, arg0, 47);
            }
            class780 var7 = new class780();
            if (var6 != null) {
                var7.method5602(0, new class176(var6));
            }
            class29 var8 = this.field6282;
            synchronized (this.field6282) {
                this.field6282.method295(false, (long) arg0, var7);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field6287[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lpo;ILgda;)V", line = 200)
    public class396(class585 arg0, int arg1, class58 arg2) {
        try {
            this.field6277 = arg2;
            if (this.field6277 == null) {
                this.field6280 = 0;
            } else {
                this.field6280 = this.field6277.method580(74, 47);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6287[7] + (arg0 == null ? field6287[5] : field6287[6]) + ',' + arg1 + ',' + (arg2 == null ? field6287[5] : field6287[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3208(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x40);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3209(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 10;
                    break;
                case 1:
                    var10005 = 83;
                    break;
                case 2:
                    var10005 = 104;
                    break;
                case 3:
                    var10005 = 55;
                    break;
                default:
                    var10005 = 64;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
