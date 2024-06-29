import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class110 implements Runnable {

    @OriginalMember(owner = "client!db", name = "k", descriptor = "[Lph;")
    public volatile class229[] field1962 = new class229[2];

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Z")
    public volatile boolean field1955 = false;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "Z")
    public volatile boolean field1959 = false;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Lsb;")
    public static class98 field1954 = class47.method368("Standort", 0);

    @OriginalMember(owner = "client!db", name = "j", descriptor = "[Lqb;")
    public static class72[] field1961 = new class72[4];

    @OriginalMember(owner = "client!db", name = "m", descriptor = "[I")
    public static int[] field1964 = new int[32];

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Lvf;")
    public static class48 field1952 = new class48();

    @OriginalMember(owner = "client!db", name = "p", descriptor = "Lsb;")
    private static class98 field1967 = class47.method368("Attack", 0);

    @OriginalMember(owner = "client!db", name = "o", descriptor = "Lsb;")
    public static class98 field1966 = field1967;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Lkh;")
    public class5 field1958;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "[Lqh;")
    public static class24[] field1960;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static final void method831(int arg0) {
        field1953++;
        class162.field2934.method1554((byte) -109);
        class60.field986.method1554((byte) -109);
        if (arg0 == -1) {
            class48.field801.method1554((byte) -109);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    public static final void method832(int arg0) {
        field1963++;
        class211.field3606.method1565(-1);
        if (arg0 != -3) {
            method835(88, -37, 48);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public static void method833(byte arg0) {
        field1961 = null;
        field1967 = null;
        field1964 = null;
        field1954 = null;
        field1960 = null;
        if (arg0 <= -88) {
            field1966 = null;
            field1952 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BZ)I")
    public static final int method834(byte arg0, boolean arg1) {
        if (arg0 <= 34) {
            field1966 = null;
        }
        long var2 = class164.method1183((byte) 80);
        field1957++;
        for (class211 var4 = arg1 ? (class211) class85.field1505.method1514((byte) 14) : (class211) class85.field1505.method1515(126); var4 != null; var4 = (class211) class85.field1505.method1515(99)) {
            if ((var4.field3608 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field3608 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field4061;
                    class118.field2117[var5] = class68.field1086[var5];
                    var4.method1611((byte) 78);
                    return var5;
                }
                var4.method1611((byte) -127);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)Lld;")
    public static final class53 method835(int arg0, int arg1, int arg2) {
        class71 var3 = class31.field553[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class53 var4 = var3.field1132;
            var3.field1132 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!db", name = "run", descriptor = "()V")
    public final void run() {
        field1965++;
        this.field1959 = true;
        try {
            while (!this.field1955) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class229 var2 = this.field1962[var1];
                    if (var2 != null) {
                        var2.method1580(5386);
                    }
                }
                class234.method1603(10L, 24);
                class215.method1432(true, this.field1958, (Object) null);
            }
        } catch (Exception var9) {
            class243.method1678((String) null, var9, (byte) -98);
        } finally {
            Object var6 = null;
            this.field1959 = false;
        }
    }
}
