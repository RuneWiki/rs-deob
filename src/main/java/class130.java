import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class130 {

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Lct;")
    public static class285 field1816 = new class285(12, 6);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public int field1812;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    private int field1817;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public int field1818;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Ldc;")
    public class13 field1813;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Lui;")
    public static class451 field1819;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static final void method901(byte arg0) {
        field1814++;
        if (class28.field372 >= 0) {
            long var1 = class435.method2539(-10659);
            class28.field372 = (int) ((long) class28.field372 - (var1 - class1.field17));
            if (class28.field372 <= 0) {
                class287.field4376 = class446.field6323.field6802;
                class360.field5460 = class446.field6323.field6798;
                class72.field971 = class446.field6323.field6805;
                class345.field5252 = class446.field6323.field6784;
                class286.field4371 = class446.field6323.field6794;
                class58.field809 = class446.field6323.field6803;
                class92.field1281 = class446.field6323.field6801;
                class337.field5039 = class446.field6323.field6790;
                class28.field372 = -1;
                class402.field5873 = class446.field6323.field6791;
                class244.field3498 = class446.field6323.field6796;
            } else {
                int var3 = (class28.field372 << 8) / class170.field2420;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                class244.field3498 = ((class230.field3389 & 0xFF00) * var3 + (class446.field6323.field6796 & 0xFF00) * var4 & 0xFF0000) + ((class230.field3389 & 0xFF00FF) * var3 + (class446.field6323.field6796 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                float var6 = 1.0F - var5;
                class360.field5460 = (class446.field6323.field6798 - class92.field1282) * var6 + class92.field1282;
                class287.field4376 = (class446.field6323.field6802 - class85.field1199) * var6 + class85.field1199;
                class72.field971 = ((class205.field3109 & 0xFF00FF) * var3 + (class446.field6323.field6805 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class205.field3109 & 0xFF00) * var3 + (class446.field6323.field6805 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class286.field4371 = (class446.field6323.field6794 - class250.field3604) * var6 + class250.field3604;
                class92.field1281 = (class446.field6323.field6801 - class69.field943) * var6 + class69.field943;
                class345.field5252 = (class446.field6323.field6784 - class111.field1570) * var6 + class111.field1570;
                class402.field5873 = (class446.field6323.field6791 - class121.field1672) * var6 + class121.field1672;
                class337.field5039 = class8.field139 * var3 + class446.field6323.field6790 * var4 >> 8;
                if (class82.field1159 != class446.field6323.field6803) {
                    class58.field809 = class336.field5036.method529(class82.field1159, class446.field6323.field6803, var6, class58.field809);
                }
            }
            class1.field17 = var1;
        }
        if (arg0 != -74) {
            field1819 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lre;B)V")
    public final void method902(class446 arg0, byte arg1) {
        field1810++;
        if (arg1 >= -58) {
            return;
        }
        while (true) {
            int var3 = arg0.method2628(49152);
            if (var3 == 0) {
                return;
            }
            this.method905(true, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)Lff;")
    public final synchronized class368 method903(int arg0) {
        field1815++;
        class368 var2 = (class368) this.field1813.field192.method2393(-127, (long) this.field1817);
        if (arg0 != 16711935) {
            this.field1813 = null;
        }
        if (var2 != null) {
            return var2;
        }
        class368 var3 = class368.method2265(this.field1813.field184, this.field1817, 0);
        if (var3 != null) {
            this.field1813.field192.method2395(arg0 ^ 0xFF00FF, var3, (long) this.field1817);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public static void method904(int arg0) {
        field1819 = null;
        field1816 = null;
        if (arg0 <= 104) {
            method901((byte) -116);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZILre;)V")
    private final void method905(boolean arg0, int arg1, class446 arg2) {
        field1811++;
        if (!arg0) {
            this.field1813 = null;
        }
        if (arg1 == 1) {
            this.field1817 = arg2.method2631(2530);
        } else if (arg1 == 2) {
            this.field1812 = arg2.method2628(49152);
            this.field1818 = arg2.method2628(49152);
            return;
        }
    }

    static {
        new class332("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
    }
}
