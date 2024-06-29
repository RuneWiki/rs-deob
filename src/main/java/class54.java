import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class54 {

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "Lmq;")
    private class104 field888 = new class104(64);

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "Lfc;")
    private class343 field878;

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "Lfn;")
    public static class52 field883 = new class52(50, 2);

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "Ljava/lang/String;")
    public static String field885 = null;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "Lfc;")
    public static class343 field886;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)Lub;", line = 3)
    public final class29 method418(int arg0, int arg1) {
        field882++;
        class104 var3 = this.field888;
        class29 var4;
        synchronized (this.field888) {
            var4 = (class29) this.field888.method659((long) arg0, (byte) -1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field878.method2029(arg1, arg0, 0);
        class29 var6 = new class29();
        if (var5 != null) {
            var6.method237(new class425(var5), (byte) 43);
        }
        var6.method236(115);
        class104 var7 = this.field888;
        synchronized (this.field888) {
            this.field888.method653(68, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(II)V", line = 31)
    public final void method419(int arg0, int arg1) {
        field881++;
        class104 var3 = this.field888;
        synchronized (this.field888) {
            if (arg0 > 1) {
                this.field888.method666(arg1, false);
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IC)Z", line = 48)
    public static final boolean method420(int arg0, char arg1) {
        if (arg0 != 35) {
            field885 = null;
        }
        field879++;
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 59)
    public static final long method421(String arg0, int arg1) {
        field880++;
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 - 64);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        if (arg1 != -16583) {
            method421((String) null, -57);
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V", line = 103)
    public final void method422(byte arg0) {
        field877++;
        if (arg0 <= 123) {
            field886 = null;
        }
        class104 var2 = this.field888;
        synchronized (this.field888) {
            this.field888.method656(102);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V", line = 116)
    public static void method423(int arg0) {
        if (arg0 != 97) {
            method425((byte) -44, (class363) null, 125, 38);
        }
        field883 = null;
        field885 = null;
        field886 = null;
    }

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "(II)V", line = 129)
    public static final void method424(int arg0, int arg1) {
        class173 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class269 var4 = class366.field5215[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class205.field2946; var5++) {
                    for (int var6 = 0; var6 < class456.field6299; var6++) {
                        var2 = var4.method702(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class259.field3616;
                            int var8 = var5 << class259.field3616;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class269 var10 = class366.field5215[var9];
                                if (var10 != null) {
                                    int var11 = var4.method710(var6, var5) - var10.method710(var6, var5);
                                    int var12 = var4.method710(var6 + 1, var5) - var10.method710(var6 + 1, var5);
                                    int var13 = var4.method710(var6 + 1, var5 + 1) - var10.method710(var6 + 1, var5 + 1);
                                    int var14 = var4.method710(var6, var5 + 1) - var10.method710(var6, var5 + 1);
                                    var10.method717(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BLms;II)V", line = 199)
    public static final void method425(byte arg0, class363 arg1, int arg2, int arg3) {
        field887++;
        if (class146.field2070 != null || class351.field4800 || arg1 == null || class249.method1555(arg1, (byte) 74) == null) {
            return;
        }
        class146.field2070 = arg1;
        int var4 = -107 / ((arg0 - 36) / 51);
        class128.field1819 = class249.method1555(arg1, (byte) 80);
        class105.field1508 = 0;
        class195.field2769 = false;
        class106.field1516 = arg2;
        class465.field6532 = arg3;
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)V", line = 221)
    public final void method426(int arg0) {
        if (arg0 != -23624) {
            method424(-40, 9);
        }
        field884++;
        class104 var2 = this.field888;
        synchronized (this.field888) {
            this.field888.method654(false);
        }
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Ldk;ILfc;)V", line = 249)
    public class54(class328 arg0, int arg1, class343 arg2) {
        this.field878 = arg2;
        if (this.field878 != null) {
            this.field878.method2054(0, 35);
        }
    }
}
