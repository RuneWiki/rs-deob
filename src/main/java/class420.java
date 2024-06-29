import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class420 {

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "Lef;")
    public class412 field5442 = new class412();

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "[I")
    public static int[] field5436 = new int[13];

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Lsc;")
    public static class290 field5440 = new class290();

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "Lef;")
    private class412 field5444;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "Ldn;")
    public static class438 field5435;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)I", line = 5)
    public final int method2380(byte arg0) {
        field5441++;
        if (arg0 != -48) {
            return -83;
        }
        int var2 = 0;
        class412 var3 = this.field5442.field5353;
        while (this.field5442 != var3) {
            var3 = var3.field5353;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([Let;II)V", line = 26)
    public static final void method2381(class509[] arg0, int arg1, int arg2) {
        field5438++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class509 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field7197 == 0) {
                    if (var4.field7101 != null) {
                        method2381(var4.field7101, -117, arg2);
                    }
                    class565 var5 = (class565) class309.field3937.method2645((long) var4.field7045, (byte) -122);
                    if (var5 != null) {
                        class642.method3696(var5.field8297, 0, arg2);
                    }
                }
                if (arg2 == 0 && var4.field7116 != null) {
                    class503 var6 = new class503();
                    var6.field6973 = var4;
                    var6.field6975 = var4.field7116;
                    class630.method3608(var6);
                }
                if (arg2 == 1 && var4.field7155 != null) {
                    if (var4.field7086 >= 0) {
                        class509 var7 = class61.method348(var4.field7045, true);
                        if (var7 == null || var7.field7101 == null || var7.field7101.length <= var4.field7086 || var7.field7101[var4.field7086] != var4) {
                            continue;
                        }
                    }
                    class503 var8 = new class503();
                    var8.field6973 = var4;
                    var8.field6975 = var4.field7155;
                    class630.method3608(var8);
                }
            }
        }
        if (arg1 > -103) {
            field5435 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V", line = 101)
    public final void method2382(boolean arg0) {
        while (true) {
            class412 var2 = this.field5442.field5353;
            if (this.field5442 == var2) {
                field5434++;
                this.field5444 = null;
                if (arg0) {
                    this.method2385(null, true);
                    return;
                }
                return;
            }
            var2.method2355((byte) -41);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)Lef;", line = 122)
    public final class412 method2383(int arg0) {
        int var2 = -70 / ((arg0 - 71) / 52);
        field5439++;
        class412 var3 = this.field5442.field5353;
        if (this.field5442 == var3) {
            this.field5444 = null;
            return null;
        } else {
            this.field5444 = var3.field5353;
            return var3;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(Z)Lef;", line = 144)
    public final class412 method2384(boolean arg0) {
        if (!arg0) {
            this.field5444 = null;
        }
        field5443++;
        class412 var2 = this.field5444;
        if (this.field5442 == var2) {
            this.field5444 = null;
            return null;
        } else {
            this.field5444 = var2.field5353;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lef;Z)V", line = 177)
    public final void method2385(class412 arg0, boolean arg1) {
        field5437++;
        if (arg0.field5355 != null) {
            arg0.method2355((byte) -41);
        }
        arg0.field5355 = this.field5442.field5355;
        if (!arg1) {
            method2381(null, 96, -76);
        }
        arg0.field5353 = this.field5442;
        arg0.field5355.field5353 = arg0;
        arg0.field5353.field5355 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V", line = 216)
    public class420() {
        this.field5442.field5355 = this.field5442;
        this.field5442.field5353 = this.field5442;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)V", line = 198)
    public static void method2386(byte arg0) {
        if (arg0 < -88) {
            field5435 = null;
            field5436 = null;
            field5440 = null;
        }
    }
}
