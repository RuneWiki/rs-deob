import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class155 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "Lbd;")
    private class14 field3211 = new class14();

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "Lu;")
    private class179 field3229 = new class179();

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    private int field3230;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    private int field3232;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "Lda;")
    private class29 field3228;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Lea;")
    public static class38 field3217 = class9.method46((byte) 109, ")4lang)4de");

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "Lea;")
    private static class38 field3218 = class9.method46((byte) 116, "M");

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Lea;")
    public static class38 field3220 = field3218;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "[I")
    public static int[] field3221 = new int[5];

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "Lea;")
    public static class38 field3227 = field3218;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "Lea;")
    public static class38 field3224 = class9.method46((byte) 109, "Okay");

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public static int field3233 = 50;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Lcc;")
    public static class22 field3213 = new class22();

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "Lea;")
    public static class38 field3234 = class9.method46((byte) 108, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)Lkh;")
    public final class97 method1074(int arg0) {
        if (arg0 == -5) {
            field3225++;
            return this.field3228.method185((byte) 67);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    public static void method1075(int arg0) {
        field3221 = null;
        field3227 = null;
        if (arg0 <= 41) {
            field3233 = -111;
        }
        field3218 = null;
        field3213 = null;
        field3220 = null;
        field3234 = null;
        field3217 = null;
        field3224 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(JILbd;)V")
    public final void method1076(long arg0, int arg1, class14 arg2) {
        if (this.field3230 == 0) {
            class14 var5 = this.field3229.method1229((byte) -49);
            var5.method805(false);
            var5.method85(false);
            if (this.field3211 == var5) {
                class14 var6 = this.field3229.method1229((byte) -49);
                var6.method805(false);
                var6.method85(false);
            }
        } else {
            this.field3230--;
        }
        this.field3228.method184(arg2, false, arg0);
        field3216++;
        if (arg1 != -4) {
            this.field3232 = -97;
        }
        this.field3229.method1233(464, arg2);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)Lkh;")
    public final class97 method1077(boolean arg0) {
        field3222++;
        if (!arg0) {
            field3213 = null;
        }
        return this.field3228.method177(124);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BJ)Lbd;")
    public final class14 method1078(byte arg0, long arg1) {
        field3219++;
        class14 var4 = (class14) this.field3228.method183((byte) 36, arg1);
        if (var4 != null) {
            this.field3229.method1233(464, var4);
        }
        return arg0 < 9 ? null : var4;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
    public static final void method1079(boolean arg0) {
        field3212++;
        class124.field2667 = 0;
        int var1 = (class195.field3842.field406 >> 7) + class135.field2845;
        if (arg0) {
            method1080(43, (byte) -43);
        }
        int var2 = (class195.field3842.field382 >> 7) + class127.field2712;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class124.field2667 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class124.field2667 = 1;
        }
        if (class124.field2667 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class124.field2667 = 0;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)V")
    public static final void method1080(int arg0, byte arg1) {
        field3214++;
        class99.method815((byte) 96);
        class3.method18((byte) -119);
        int var2 = class198.method1303(-9094, arg0).field3089;
        if (arg1 != -3) {
            field3227 = null;
        }
        if (var2 == 0) {
            return;
        }
        int var3 = class195.field3845[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class93.method780(0.9F);
            }
            if (var3 == 2) {
                class93.method780(0.8F);
            }
            if (var3 == 3) {
                class93.method780(0.7F);
            }
            if (var3 == 4) {
                class93.method780(0.6F);
            }
            class140.method1001(arg1 ^ 0xFFFFFF8B);
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class109.field2454 != var4) {
                if (class109.field2454 == 0 && class179.field3615 != -1) {
                    class32.method204(var4, 0, false, -15793, class133.field2815, class179.field3615);
                    class134.field2826 = false;
                } else if (var4 == 0) {
                    class35.method234(false);
                    class134.field2826 = false;
                } else {
                    class145.method1041(32701, var4);
                }
                class109.field2454 = var4;
            }
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class113.field2522 = 127;
            }
            if (var3 == 1) {
                class113.field2522 = 96;
            }
            if (var3 == 2) {
                class113.field2522 = 64;
            }
            if (var3 == 3) {
                class113.field2522 = 32;
            }
            if (var3 == 4) {
                class113.field2522 = 0;
            }
        }
        if (var2 == 9) {
            class83.field1961 = var3;
        }
        if (var2 == 5) {
            class9.field206 = var3;
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class80.field1891 = 127;
            }
            if (var3 == 1) {
                class80.field1891 = 96;
            }
            if (var3 == 2) {
                class80.field1891 = 64;
            }
            if (var3 == 3) {
                class80.field1891 = 32;
            }
            if (var3 == 4) {
                class80.field1891 = 0;
            }
        }
        if (var2 == 6) {
            class145.field3028 = var3;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(JB)V")
    public final void method1081(long arg0, byte arg1) {
        field3215++;
        if (arg1 != -63) {
            field3217 = null;
        }
        class14 var4 = (class14) this.field3228.method183((byte) 58, arg0);
        if (var4 != null) {
            var4.method805(false);
            var4.method85(false);
            this.field3230++;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Z")
    public static final boolean method1082(int arg0, int arg1) {
        if (arg0 >= -66) {
            return false;
        } else {
            field3226++;
            return (arg1 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
    public final void method1083(int arg0) {
        field3231++;
        while (true) {
            class14 var2 = this.field3229.method1229((byte) -49);
            if (var2 == null) {
                if (arg0 != 3056) {
                    field3217 = null;
                }
                this.field3230 = this.field3232;
                return;
            }
            var2.method805(false);
            var2.method85(false);
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(I)V")
    public class155(int arg0) {
        this.field3230 = arg0;
        this.field3232 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3228 = new class29(var2);
    }
}
