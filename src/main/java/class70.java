import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class70 {

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "Lvg;")
    private class49 field886 = new class49(64);

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "Lri;")
    private class97 field882;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "Lrl;")
    public static class672 field884 = new class672(29, 4);

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    public static int field887 = 0;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "[C")
    private static char[] field889 = new char[64];

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "Lws;")
    public static class328 field891;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "[Lf;")
    public static class702[] field888;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
    public static void method717(int arg0) {
        field884 = null;
        if (arg0 != 1) {
            method724(-101, -123, 127);
        }
        field888 = null;
        field891 = null;
        field889 = null;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
    public final void method718(int arg0) {
        class49 var2 = this.field886;
        synchronized (this.field886) {
            if (arg0 != 45) {
                return;
            }
            this.field886.method563(0);
        }
        field876++;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)V")
    public final void method719(int arg0, int arg1) {
        field879++;
        if (arg1 != 97) {
            return;
        }
        class49 var3 = this.field886;
        synchronized (this.field886) {
            this.field886.method569(0);
            this.field886 = new class49(arg0);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
    public final void method720(byte arg0) {
        class49 var2 = this.field886;
        synchronized (this.field886) {
            int var3 = -13 % ((arg0 - 69) / 57);
            this.field886.method569(0);
        }
        field881++;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IB)Lea;")
    public final class507 method721(int arg0, byte arg1) {
        field880++;
        class49 var3 = this.field886;
        class507 var4;
        synchronized (this.field886) {
            var4 = (class507) this.field886.method560(false, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class97 var5 = this.field882;
        byte[] var6;
        synchronized (this.field882) {
            var6 = this.field882.method926(class180.method1471(-23587, arg0), -127, class28.method433((byte) -105, arg0));
        }
        class507 var7 = new class507();
        if (var6 != null) {
            var7.method3082(-14281, new class6(var6));
        }
        class49 var8 = this.field886;
        synchronized (this.field886) {
            this.field886.method559(var7, (long) arg0, 0);
        }
        int var9 = 37 / ((arg1 - 31) / 33);
        return var7;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)I")
    public static final int method722(int arg0) {
        field883++;
        if (class453.field6808) {
            return 6;
        } else if (class572.field8178 == null) {
            return 0;
        } else {
            if (arg0 > -92) {
                method722(-67);
            }
            int var1 = class572.field8178.field4631;
            if (class614.method3581(-80, var1)) {
                return 1;
            } else if (class147.method1238(12081, var1)) {
                return 2;
            } else if (class705.method3978(32, var1)) {
                return 3;
            } else if (class511.method3098(false, var1)) {
                return 4;
            } else {
                return 5;
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)V")
    public final void method723(byte arg0, int arg1) {
        class49 var3 = this.field886;
        synchronized (this.field886) {
            this.field886.method573((byte) 124, arg1);
        }
        if (arg0 >= -37) {
            method717(-96);
        }
        field878++;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)Z")
    public static final boolean method724(int arg0, int arg1, int arg2) {
        if (arg0 != 256) {
            field887 = -38;
        }
        field877++;
        return (arg2 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lei;ILri;)V")
    public class70(class162 arg0, int arg1, class97 arg2) {
        this.field882 = arg2;
        if (this.field882 != null) {
            int var4 = this.field882.method917(true) - 1;
            this.field882.method949(var4, 0);
        }
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field889[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field889[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field889[var2] = (char) (var2 + 48 - 52);
        }
        field889[63] = '-';
        field889[62] = '*';
        field890 = -1;
        field891 = new class328(7, 7);
    }
}
