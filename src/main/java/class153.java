import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class153 implements class234 {

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "Ljava/lang/String;")
    private String field2378;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Lla;")
    private class422 field2382;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "J")
    public static long field2376 = -1L;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "Ltm;")
    public static class334 field2383 = null;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Loi;")
    public final class696 method1156(boolean arg0) {
        field2385++;
        return arg0 ? class696.field9867 : null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method1157(byte arg0, long arg1) {
        class53.field850.setTime(new Date(arg1));
        field2377++;
        int var3 = 86 / ((arg0 - 57) / 61);
        int var4 = class53.field850.get(7);
        int var5 = class53.field850.get(5);
        int var6 = class53.field850.get(2);
        int var7 = class53.field850.get(1);
        int var8 = class53.field850.get(11);
        int var9 = class53.field850.get(12);
        int var10 = class53.field850.get(13);
        return class271.field4163[var4 - 1] + ", " + var5 / 10 + var5 % 10 + "-" + class51.field818[var6] + "-" + var7 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I")
    public static final int method1158(int arg0, String arg1, String arg2, int arg3) {
        field2380++;
        int var4 = arg1.length();
        int var5 = arg2.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while ((var6 - var8) < var4 || var7 - var9 < var5) {
            if (var6 - var8 >= var4) {
                return -1;
            }
            if (var5 <= (var7 - var9)) {
                return 1;
            }
            char var23;
            if (var8 == '\u0000') {
                var23 = arg1.charAt(var6++);
            } else {
                var23 = var8;
                boolean var24 = false;
            }
            char var25;
            if (var9 == '\u0000') {
                var25 = arg2.charAt(var7++);
            } else {
                var25 = var9;
                boolean var26 = false;
            }
            var8 = class114.method918(69, var23);
            var9 = class114.method918(69, var25);
            char var27 = class72.method660((byte) -20, arg0, var23);
            char var28 = class72.method660((byte) -20, arg0, var25);
            if (var27 != var28 && Character.toUpperCase(var27) != Character.toUpperCase(var28)) {
                char var29 = Character.toLowerCase(var27);
                char var30 = Character.toLowerCase(var28);
                if (var29 != var30) {
                    return class399.method2465(arg0, (byte) -126, var29) - class399.method2465(arg0, (byte) -111, var30);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var17;
            int var18;
            if (arg0 == 2) {
                var18 = var4 - var11 - 1;
                var17 = var5 - var11 - 1;
            } else {
                var17 = var11;
                var18 = var11;
            }
            char var19 = arg1.charAt(var18);
            char var20 = arg2.charAt(var17);
            if (var19 != var20 && Character.toUpperCase(var19) != Character.toUpperCase(var20)) {
                char var21 = Character.toLowerCase(var19);
                char var22 = Character.toLowerCase(var20);
                if (var21 != var22) {
                    return class399.method2465(arg0, (byte) -126, var21) - class399.method2465(arg0, (byte) -117, var22);
                }
            }
        }
        int var12 = -73 / ((arg3 - 54) / 50);
        int var13 = var4 - var5;
        if (var13 != 0) {
            return var13;
        }
        for (int var14 = 0; var14 < var10; var14++) {
            char var15 = arg1.charAt(var14);
            char var16 = arg2.charAt(var14);
            if (var15 != var16) {
                return class399.method2465(arg0, (byte) -126, var15) - class399.method2465(arg0, (byte) -114, var16);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V")
    public static void method1159(byte arg0) {
        field2383 = null;
        if (arg0 > -60) {
            field2376 = 25L;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Loj;I)V")
    public static final void method1160(class208 arg0, int arg1) {
        int var2 = 70 % ((-arg1 - 63) / 39);
        field2381++;
        if (arg0 == null) {
            return;
        }
        class344.field5093.method3472(109, arg0);
        class608.field8588++;
        Object var3 = null;
        class180 var6;
        if (arg0.field3484 || "".equals(arg0.field3483)) {
            var6 = new class180(arg0.field3483);
            class124.field1898++;
        } else {
            long var4 = arg0.field3476;
            for (var6 = (class180) class88.field1289.method3512(true, var4); var6 != null && !var6.field3061.equals(arg0.field3483); var6 = (class180) class88.field1289.method3513(-1)) {
            }
            if (var6 == null) {
                var6 = (class180) class206.field3455.method80((byte) -55, var4);
                if (var6 != null && !var6.field3061.equals(arg0.field3483)) {
                    var6 = null;
                }
                if (var6 == null) {
                    var6 = new class180(arg0.field3483);
                }
                class88.field1289.method3516(255, var4, var6);
                class124.field1898++;
            }
        }
        if (var6.method1394(arg0, 32749)) {
            class455.method2790((byte) 5, var6);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)I")
    public final int method1161(byte arg0) {
        field2384++;
        if (arg0 != 123) {
            method1159((byte) 112);
        }
        return this.field2382.method2618(this.field2378, (byte) 122) ? 100 : 0;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lla;Ljava/lang/String;)V")
    public class153(class422 arg0, String arg1) {
        this.field2378 = arg1;
        this.field2382 = arg0;
    }
}
