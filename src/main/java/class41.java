import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class41 {

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "[Ljava/lang/String;")
    private String[] field420 = new String[0];

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "I")
    private int field421 = -1;

    @OriginalMember(owner = "client!ts", name = "p", descriptor = "Z")
    private boolean field427 = false;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "I")
    private int field415;

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "Lvq;")
    public static class500 field423 = new class500();

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!ts", name = "o", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZLgga;)Ldda;")
    public static final class406 method324(boolean arg0, class511 arg1) {
        field413++;
        class267 var2 = class278.method1807(4)[arg1.method3013(-121)];
        class15 var3 = class282.method1834(0)[arg1.method3013(-103)];
        int var4 = arg1.method3034(1);
        int var5 = arg1.method3034(1);
        int var6 = arg1.method3002(-1);
        int var7 = arg1.method3002(-1);
        if (arg0) {
            method325(72, null);
        }
        int var8 = arg1.method3034(1);
        int var9 = arg1.method3008(64);
        int var10 = arg1.method3008(64);
        return new class406(var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILgga;)V")
    public static final void method325(int arg0, class511 arg1) {
        field422++;
        int var2 = 0;
        if (arg0 != 1) {
            method333(-51, null);
        }
        while (class358.field5155 > var2) {
            int var3 = arg1.method3043(-31927);
            int var4 = arg1.method3002(arg0 ^ 0xFFFFFFFE);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class94.field1092[var3] != null) {
                class94.field1092[var3].field2280 = var4;
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V")
    public static final void method326(boolean arg0) {
        field417++;
        for (class571 var1 = (class571) class566.field7987.method1041(1048832); var1 != null; var1 = (class571) class566.field7987.method1033(-1)) {
            if (var1.field8045) {
                var1.method3357(-1236336695);
            }
        }
        class571 var2 = (class571) class536.field7419.method1041(1048832);
        if (arg0) {
            return;
        }
        while (var2 != null) {
            if (var2.field8045) {
                var2.method3357(-1236336695);
            }
            var2 = (class571) class536.field7419.method1033(-1);
        }
    }

    @OriginalMember(owner = "client!ts", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field426++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field421; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field420[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)V")
    private final void method327(int arg0, int arg1) {
        field418++;
        String[] var3 = new String[this.method332(arg0 ^ 0xFFFF, arg1)];
        class335.method2123(this.field420, 0, var3, arg0, this.field420.length);
        this.field420 = var3;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)[Ljava/lang/String;")
    public final String[] method328(byte arg0) {
        if (arg0 == -116) {
            field416++;
            String[] var2 = new String[this.field421 + 1];
            class335.method2123(this.field420, 0, var2, 0, this.field421 + 1);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method329(int arg0, String arg1) {
        this.method330(this.field421 + 1, -37, arg1);
        field412++;
        int var3 = 114 / ((arg0 - 36) / 43);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IILjava/lang/String;)V")
    private final void method330(int arg0, int arg1, String arg2) {
        field414++;
        if (arg0 > this.field421) {
            this.field421 = arg0;
        }
        if (arg1 >= -9) {
            field423 = null;
        }
        if (this.field420.length <= arg0) {
            this.method327(0, arg0);
        }
        this.field420[arg0] = arg2;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
    public static void method331(int arg0) {
        field423 = null;
        if (arg0 != -7606) {
            field423 = null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(II)I")
    private final int method332(int arg0, int arg1) {
        if (arg0 != 65535) {
            return -75;
        }
        field425++;
        int var3 = this.field420.length;
        while (var3 <= arg1) {
            if (!this.field427) {
                var3 += this.field415;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field415 * var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(IZ)V")
    public class41(int arg0, boolean arg1) {
        this.field427 = arg1;
        this.field415 = arg0;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(ILjava/lang/String;)V")
    public static final void method333(int arg0, String arg1) {
        field419++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class690.method3915(-4097, arg1);
        if (var2 == null) {
            return;
        }
        if (arg0 != 1) {
            field424 = 11;
        }
        for (int var3 = 0; var3 < class302.field4404; var3++) {
            String var4 = class17.field100[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class690.method3915(arg0 - 4098, var4);
            if (var5 != null && var5.equals(var2)) {
                class302.field4404--;
                for (int var6 = var3; var6 < class302.field4404; var6++) {
                    class17.field100[var6] = class17.field100[var6 + 1];
                    class538.field7433[var6] = class538.field7433[var6 + 1];
                    class554.field7679[var6] = class554.field7679[var6 + 1];
                    class133.field1698[var6] = class133.field1698[var6 + 1];
                    class319.field4522[var6] = class319.field4522[var6 + 1];
                }
                class345.field5014 = class453.field6312;
                class216.field2974++;
                class116 var7 = class248.method1672(class84.field1023, class223.field3090, -20647);
                var7.field1575.method3005(arg0 + 254, class395.method2435(arg1, 1));
                var7.field1575.method3037(0, arg1);
                class443.method2655(0, var7);
                return;
            }
        }
    }
}
