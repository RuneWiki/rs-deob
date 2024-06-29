import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class223 {

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Llh;")
    private class364 field3228 = new class364(64);

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "Llh;")
    public class364 field3233 = new class364(30);

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "Lhh;")
    public class84 field3224;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "Lhh;")
    private class84 field3230;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public int field3236;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "Lhh;")
    public static class84 field3227;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method1471(long arg0, byte arg1) {
        field3229++;
        if (arg1 != -8) {
            field3227 = null;
        }
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class103.field1640[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method1472(int arg0) {
        if (arg0 != 0) {
            method1472(-34);
        }
        field3227 = null;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public final void method1473(int arg0) {
        field3225++;
        class364 var2 = this.field3228;
        synchronized (this.field3228) {
            this.field3228.method2350((byte) 112);
        }
        class364 var3 = this.field3233;
        synchronized (this.field3233) {
            this.field3233.method2350((byte) 112);
            if (arg0 != -1) {
                this.field3236 = -60;
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V")
    public final void method1474(int arg0, int arg1) {
        field3234++;
        class364 var3 = this.field3228;
        synchronized (this.field3228) {
            this.field3228.method2348(arg1, -127);
            if (arg0 != 0) {
                this.method1475(54, false);
            }
        }
        class364 var4 = this.field3233;
        synchronized (this.field3233) {
            this.field3233.method2348(arg1, 80);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ)Lmn;")
    public final class246 method1475(int arg0, boolean arg1) {
        field3231++;
        class364 var3 = this.field3228;
        class246 var4;
        synchronized (this.field3228) {
            var4 = (class246) this.field3228.method2339(-120, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (!arg1) {
            this.field3224 = null;
        }
        byte[] var5 = this.field3230.method683(class443.method2689(arg0, (byte) -94), class479.method2864(-49, arg0), 5);
        class246 var6 = new class246();
        var6.field3553 = arg0;
        var6.field3539 = this;
        if (var5 != null) {
            var6.method1575((byte) -77, new class303(var5));
        }
        class364 var7 = this.field3228;
        synchronized (this.field3228) {
            this.field3228.method2342((long) arg0, var6, -97);
            return var6;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I[Ltn;B)V")
    public static final void method1476(int arg0, class58[] arg1, byte arg2) {
        field3235++;
        int var3 = 0;
        if (arg2 != -80) {
            return;
        }
        while (arg1.length > var3) {
            class58 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field843 == 0) {
                    if (var4.field910 != null) {
                        method1476(arg0, var4.field910, (byte) -80);
                    }
                    class183 var5 = (class183) class466.field6844.method2485(85, (long) var4.field955);
                    if (var5 != null) {
                        class270.method1734(var5.field2753, arg0, arg2 + 136);
                    }
                }
                if (arg0 == 0 && var4.field939 != null) {
                    class519 var6 = new class519();
                    var6.field7625 = var4;
                    var6.field7627 = var4.field939;
                    class150.method1086(var6);
                }
                if (arg0 == 1 && var4.field863 != null) {
                    label62: {
                        if (var4.field840 >= 0) {
                            class58 var7 = class421.method2578(-4179, var4.field955);
                            if (var7 == null || var7.field910 == null || var4.field840 >= var7.field910.length || var7.field910[var4.field840] != var4) {
                                break label62;
                            }
                        }
                        class519 var8 = new class519();
                        var8.field7625 = var4;
                        var8.field7627 = var4.field863;
                        class150.method1086(var8);
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
    public final void method1477(boolean arg0) {
        class364 var2 = this.field3228;
        synchronized (this.field3228) {
            this.field3228.method2349(0);
            if (!arg0) {
                method1472(-75);
            }
        }
        field3226++;
        class364 var3 = this.field3233;
        synchronized (this.field3233) {
            this.field3233.method2349(0);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3232++;
        int var7 = class39.method299(class229.field3347, (byte) -56, class156.field2366, arg0);
        int var8 = class39.method299(class229.field3347, (byte) -56, class156.field2366, arg5);
        int var9 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg2);
        int var10 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg6);
        int var11 = class39.method299(class229.field3347, (byte) -56, class156.field2366, arg0 + arg1);
        int var12 = class39.method299(class229.field3347, (byte) -56, class156.field2366, arg5 - arg1);
        for (int var13 = var7; var13 < var11; var13++) {
            class217.method1448(class436.field6332[var13], var9, arg3, 4, var10);
        }
        if (arg4 != 0) {
            field3227 = null;
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class217.method1448(class436.field6332[var14], var9, arg3, 4, var10);
        }
        int var15 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg2 + arg1);
        int var16 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg6 - arg1);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class436.field6332[var17];
            class217.method1448(var18, var9, arg3, 4, var15);
            class217.method1448(var18, var16, arg3, 4, var10);
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)V")
    public final void method1479(int arg0, int arg1) {
        field3223++;
        this.field3236 = arg0;
        class364 var3 = this.field3233;
        synchronized (this.field3233) {
            this.field3233.method2349(arg1 ^ arg1);
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lmt;ILhh;Lhh;)V")
    public class223(class271 arg0, int arg1, class84 arg2, class84 arg3) {
        this.field3224 = arg3;
        this.field3230 = arg2;
        int var5 = this.field3230.method658((byte) 49) - 1;
        this.field3230.method656((byte) 122, var5);
    }
}
