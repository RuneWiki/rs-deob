import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public abstract class class257 extends class452 {

    @OriginalMember(owner = "client!ku", name = "y", descriptor = "Z")
    public volatile boolean field3927 = true;

    @OriginalMember(owner = "client!ku", name = "B", descriptor = "Lob;")
    public static class521 field3930 = new class521(50, 3);

    @OriginalMember(owner = "client!ku", name = "D", descriptor = "I")
    public static int field3932 = 0;

    @OriginalMember(owner = "client!ku", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field3933 = new String[100];

    @OriginalMember(owner = "client!ku", name = "F", descriptor = "Lak;")
    public static class234 field3934 = new class234("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!ku", name = "G", descriptor = "Lhn;")
    public static class509 field3935 = new class509(80, -1);

    @OriginalMember(owner = "client!ku", name = "v", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!ku", name = "z", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!ku", name = "A", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!ku", name = "C", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!ku", name = "w", descriptor = "Z")
    public boolean field3925;

    @OriginalMember(owner = "client!ku", name = "x", descriptor = "Z")
    public boolean field3926;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljava/lang/String;B)J", line = 5)
    public static final long method1712(String arg0, byte arg1) {
        field3931++;
        long var2 = 0L;
        int var4 = arg0.length();
        int var5 = 0;
        if (arg1 != -8) {
            method1716(true);
        }
        while (var4 > var5) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 - 64);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
            var5++;
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V", line = 49)
    public static final void method1713(int arg0) {
        field3928++;
        if (class377.field5692.method327()) {
            class377.field5692.method294(class111.field1557);
            class483.method2893(16711680);
            class377.field5692.method300(class111.field1557);
            class377.field5692.method272(class111.field1557);
        } else {
            class185.method1229((byte) -119, class96.field1384);
        }
        class152.method1044((byte) -127);
        if (arg0 != -18979) {
            method1716(false);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(BZZ)V", line = 71)
    public static final void method1714(byte arg0, boolean arg1, boolean arg2) {
        field3924++;
        int var3 = -34 / ((arg0 - 27) / 53);
        if (arg1) {
            class76.field1106++;
            class447.method2741(111);
        }
        if (arg2) {
            class479.field6897++;
            class422.method2636(-113);
        }
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(III)I", line = 93)
    public static final int method1715(int arg0, int arg1, int arg2) {
        field3929++;
        if (arg2 != 24088) {
            method1713(82);
        }
        return arg0 == 4 || arg0 == 5 ? class54.field667[arg1 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)V", line = 114)
    public static void method1716(boolean arg0) {
        if (arg0) {
            field3933 = null;
            field3930 = null;
            field3934 = null;
            field3935 = null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)I")
    public abstract int method1717(byte arg0);

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(Z)[B")
    public abstract byte[] method1718(boolean arg0);
}
