import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class115 {

    @OriginalMember(owner = "client!qca", name = "g", descriptor = "I")
    public int field1838;

    @OriginalMember(owner = "client!qca", name = "k", descriptor = "I")
    public int field1842;

    @OriginalMember(owner = "client!qca", name = "j", descriptor = "I")
    public int field1841;

    @OriginalMember(owner = "client!qca", name = "f", descriptor = "I")
    public int field1837;

    @OriginalMember(owner = "client!qca", name = "h", descriptor = "I")
    public static int field1839 = -2;

    @OriginalMember(owner = "client!qca", name = "i", descriptor = "Lqe;")
    public static class465 field1840 = new class465(41, 7);

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!qca", name = "l", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!qca", name = "m", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!qca", name = "n", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!qca", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field1835++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 13)
    public static final boolean method943(byte arg0, String arg1) {
        if (arg0 > -119) {
            field1839 = -55;
        }
        field1833++;
        return class54.field1029.containsKey(arg1);
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 32)
    public static final String method944(int arg0, String arg1) {
        if (arg0 < 49) {
            method944(90, null);
        }
        field1844++;
        String var2 = null;
        int var3 = arg1.indexOf("--> ");
        if (var3 >= 0) {
            var2 = arg1.substring(0, var3 + 4);
            arg1 = arg1.substring(var3 + 4);
        }
        if (arg1.startsWith("directlogin ")) {
            int var4 = arg1.indexOf(" ", "directlogin ".length());
            if (var4 >= 0) {
                int var5 = arg1.length();
                arg1 = arg1.substring(0, var4) + " ";
                for (int var6 = var4 + 1; var6 < var5; var6++) {
                    arg1 = arg1 + "*";
                }
            }
        }
        return var2 == null ? arg1 : var2 + arg1;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(B)V", line = 85)
    public static void method945(byte arg0) {
        field1840 = null;
        if (arg0 != -48) {
            method944(-126, null);
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(III)Z", line = 96)
    public static final boolean method946(int arg0, int arg1, int arg2) {
        field1832++;
        int var3 = 64 % ((arg2 + 35) / 43);
        return (arg0 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V", line = 106)
    public static final void method947(int arg0) {
        field1834++;
        class679 var1 = (class679) class567.field8051.method1522(true);
        if (arg0 != 1) {
            method943((byte) 124, null);
        }
        while (var1 != null) {
            class53 var2 = var1.field9570;
            if (var2.field1014) {
                var1.method3617(1);
                var2.method488(-4877);
            } else if (var2.field1018 <= class605.field8787) {
                var2.method486(-843, class373.field5232);
                if (var2.field1014) {
                    var1.method3617(1);
                } else {
                    class714.method3977(var2, true);
                }
            }
            var1 = (class679) class567.field8051.method1527((byte) 100);
        }
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(IIII)V", line = 145)
    public class115(int arg0, int arg1, int arg2, int arg3) {
        this.field1838 = arg3;
        this.field1842 = arg0;
        this.field1841 = arg1;
        this.field1837 = arg2;
    }
}
