import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class28 {

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "Lsd;")
    public class264 field392 = new class264();

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "Ltn;")
    public static class166 field391 = new class166();

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "Z")
    public static boolean field402 = false;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "[[Z")
    public static boolean[][] field400 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "Lq;")
    public static class152 field398;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "Lsd;")
    private class264 field395;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "([BLjava/lang/String;II)I", line = 5)
    public static final int method264(byte[] arg0, String arg1, int arg2, int arg3) {
        field388++;
        int var4 = arg3;
        if (arg2 < 104) {
            method268(5, 109);
        }
        int var5 = arg1.length();
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class343.method2060(arg1.charAt(var6), 0);
            int var8 = var5 > (var6 + 1) ? class343.method2060(arg1.charAt(var6 + 1), 0) : -1;
            int var9 = var6 + 2 >= var5 ? -1 : class343.method2060(arg1.charAt(var6 + 2), 0);
            int var10 = var5 <= var6 + 3 ? -1 : class343.method2060(arg1.charAt(var6 + 3), 0);
            arg0[arg3++] = (byte) class460.method2676(var8 >>> 4, var7 << 2);
            if (var9 == -1) {
                break;
            }
            arg0[arg3++] = (byte) class460.method2676(class248.method1593(var8, 15) << 4, var9 >>> 2);
            if (var10 == -1) {
                break;
            }
            arg0[arg3++] = (byte) class460.method2676(var10, class248.method1593(3, var9) << 6);
        }
        return arg3 - var4;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)Lsd;", line = 53)
    public final class264 method265(byte arg0) {
        field399++;
        class264 var2 = this.field395;
        if (arg0 != -39) {
            field400 = null;
        }
        if (this.field392 == var2) {
            this.field395 = null;
            return null;
        } else {
            this.field395 = var2.field3793;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V", line = 134)
    public class28() {
        this.field392.field3793 = this.field392;
        this.field392.field3794 = this.field392;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)Lsd;", line = 82)
    public final class264 method266(int arg0) {
        field389++;
        class264 var2 = this.field392.field3793;
        if (this.field392 == var2) {
            this.field395 = null;
            return null;
        } else if (arg0 < 108) {
            return null;
        } else {
            this.field395 = var2.field3793;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)I", line = 103)
    public final int method267(byte arg0) {
        int var2 = 91 / ((arg0 + 6) / 63);
        field396++;
        int var3 = 0;
        class264 var4 = this.field392.field3793;
        while (this.field392 != var4) {
            var4 = var4.field3793;
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)I", line = 124)
    public static final int method268(int arg0, int arg1) {
        if (arg1 != 3) {
            field402 = false;
        }
        field401++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILjava/lang/String;)V", line = 143)
    public static final void method269(int arg0, String arg1) {
        if (class679.field9668 == null) {
            class533.method3130((byte) -125);
        }
        field397++;
        class208.field3204.setTime(new Date(class254.method1619(true)));
        int var2 = class208.field3204.get(11);
        int var3 = class208.field3204.get(12);
        int var4 = class208.field3204.get(13);
        if (arg0 != 32316) {
            field400 = null;
        }
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class6.method26(arg1, (byte) 82, '\n');
        for (int var7 = 0; var7 < var6.length; var7++) {
            for (int var8 = class487.field6943; var8 > 0; var8--) {
                class679.field9668[var8] = class679.field9668[var8 - 1];
            }
            class679.field9668[0] = var5 + ": " + var6[var7];
            if (class661.field9300 != null) {
                try {
                    class661.field9300.write(class149.method1137(115, class679.field9668[0] + "\n"));
                } catch (IOException var9) {
                }
            }
            if (class679.field9668.length - 1 > class487.field6943) {
                class487.field6943++;
                if (class303.field4250 > 0) {
                    class303.field4250++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(B)V", line = 213)
    public static void method270(byte arg0) {
        int var1 = 58 / ((arg0 - 24) / 54);
        field391 = null;
        field398 = null;
        field400 = null;
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(B)V", line = 224)
    public final void method271(byte arg0) {
        while (true) {
            class264 var2 = this.field392.field3793;
            if (this.field392 == var2) {
                if (arg0 != -80) {
                    field400 = null;
                }
                field394++;
                this.field395 = null;
                return;
            }
            var2.method1678(false);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lsd;I)V", line = 248)
    public final void method272(class264 arg0, int arg1) {
        if (arg0.field3794 != null) {
            arg0.method1678(false);
        }
        field390++;
        if (arg1 != 28386) {
            field398 = null;
        }
        arg0.field3793 = this.field392;
        arg0.field3794 = this.field392.field3794;
        arg0.field3794.field3793 = arg0;
        arg0.field3793.field3794 = arg0;
    }
}
