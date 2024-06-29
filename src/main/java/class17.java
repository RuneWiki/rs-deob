import java.io.DataInputStream;
import java.net.URL;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ja")
public class class17 {

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "Lia;")
    public static class15 field165 = class28.method196("Agility Training", false);

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "Lia;")
    public static class15 field163 = class28.method196("Mining Site", false);

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "I")
    public static int field164 = 0;

    @OriginalMember(owner = "mapview!ja", name = "h", descriptor = "Lia;")
    public static class15 field170 = class28.method196("Clothes Shop", false);

    @OriginalMember(owner = "mapview!ja", name = "g", descriptor = "Lia;")
    public static class15 field169 = class28.method196("Furnace", false);

    @OriginalMember(owner = "mapview!ja", name = "i", descriptor = "I")
    public static int field171 = 0;

    @OriginalMember(owner = "mapview!ja", name = "f", descriptor = "Lia;")
    public static class15 field168 = class28.method196("Gem Shop", false);

    @OriginalMember(owner = "mapview!ja", name = "l", descriptor = "[J")
    public static long[] field174 = new long[32];

    @OriginalMember(owner = "mapview!ja", name = "e", descriptor = "Lia;")
    public static class15 field167 = class28.method196("Fishing Spot", false);

    @OriginalMember(owner = "mapview!ja", name = "n", descriptor = "Lia;")
    public static class15 field176 = class28.method196("Find", false);

    @OriginalMember(owner = "mapview!ja", name = "m", descriptor = "Lia;")
    public static class15 field175 = class28.method196("details)3dat", false);

    @OriginalMember(owner = "mapview!ja", name = "k", descriptor = "Lia;")
    public static class15 field173 = class28.method196("world", false);

    @OriginalMember(owner = "mapview!ja", name = "q", descriptor = "Lia;")
    public static class15 field179 = class28.method196("Anvil", false);

    @OriginalMember(owner = "mapview!ja", name = "d", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "mapview!ja", name = "o", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "mapview!ja", name = "j", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field172;

    @OriginalMember(owner = "mapview!ja", name = "p", descriptor = "[I")
    public static int[] field178;

    @OriginalMember(owner = "mapview!ja", name = "<init>", descriptor = "()V", line = 15)
    public class17() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V", line = 31)
    public static final void method134(Throwable arg0, int arg1, String arg2) {
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class25.method177(arg0, -1);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            if (arg1 != 10506) {
                return;
            }
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class6.field52.field131 == null) {
                return;
            }
            class24 var8 = class6.field52.method95(new URL(class6.field52.field131.getCodeBase(), "clienterror.ws?c=" + field177 + "&u=" + class4.field36 + "&v1=" + class14.field139 + "&v2=" + class14.field138 + "&e=" + var7), true);
            while (var8.field348 == 0) {
                class2.method15(1L, arg1 ^ 0x297E);
            }
            if (var8.field348 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field352;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(BLa;[B)V", line = 93)
    public final void method135(byte arg0, class1 arg1, byte[] arg2) {
        if (arg1.field4[arg1.field1] != 31 || arg1.field4[arg1.field1 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        } else if (arg0 == -117) {
            if (this.field172 == null) {
                this.field172 = new Inflater(true);
            }
            try {
                this.field172.setInput(arg1.field4, arg1.field1 + 10, -arg1.field1 - (8 - arg1.field4.length) + -10);
                this.field172.inflate(arg2);
            } catch (Exception var5) {
                this.field172.reset();
                throw new RuntimeException("Invalid GZIP compressed data!");
            }
            this.field172.reset();
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "<init>", descriptor = "(III)V", line = 147)
    private class17(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "([BIII)Lia;", line = 162)
    public static final class15 method136(byte[] arg0, int arg1, int arg2, int arg3) {
        class15 var4 = new class15();
        var4.field142 = 0;
        var4.field148 = new byte[arg1];
        for (int var5 = arg2; var5 < arg2 + arg1; var5++) {
            if (arg0[var5] != 0) {
                var4.field148[var4.field142++] = arg0[var5];
            }
        }
        if (arg3 == 31818) {
            return var4;
        } else {
            return (class15) null;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(Z)V", line = 210)
    public static void method137(boolean arg0) {
        field170 = null;
        field165 = null;
        field173 = null;
        field174 = null;
        field179 = null;
        field176 = null;
        field169 = null;
        field163 = null;
        field175 = null;
        field178 = null;
        field167 = null;
        if (arg0) {
            method137(false);
        }
        field168 = null;
    }
}
