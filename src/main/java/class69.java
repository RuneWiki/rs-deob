import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class69 extends class24 {

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "[I")
    public static int[] field915 = new int[100];

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "[I")
    public static int[] field918 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
    public static int field913 = 3;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "Z")
    public static boolean field914 = true;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V", line = 5)
    public static final void method387(int arg0, int arg1) {
        field912++;
        class71.field951.method1428(arg0, arg1 ^ 0x74F9);
        if (arg1 != 3) {
            field915 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(JB)Luf;", line = 18)
    public static final class168 method388(long arg0, byte arg1) {
        field911++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg1 != 104) {
            return (class168) null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var3--;
                var6[var3] = class78.field1083[(int) (var7 - (arg0 * 37L))];
            }
            class168 var9 = new class168();
            var9.field2716 = var6;
            var9.field2692 = var6.length;
            return var9;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB[Lg;)V", line = 61)
    public static final void method389(int arg0, byte arg1, class242[] arg2) {
        field917++;
        if (arg1 < 6) {
            return;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class242 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field4073 == 0) {
                    if (var4.field4004 != null) {
                        method389(arg0, (byte) 96, var4.field4004);
                    }
                    class240 var5 = (class240) class26.field319.method493((long) var4.field3996, 79);
                    if (var5 != null) {
                        class28.method149(var5.field3898, arg0, true);
                    }
                }
                if (arg0 == 0 && var4.field3984 != null) {
                    class182 var6 = new class182();
                    var6.field2919 = var4.field3984;
                    var6.field2928 = var4;
                    class177.method1270(var6, (byte) -39);
                }
                if (arg0 == 1 && var4.field4109 != null) {
                    if (var4.field3956 >= 0) {
                        class242 var7 = class130.method910((byte) -114, var4.field3996);
                        if (var7 == null || var7.field4004 == null || var4.field3956 >= var7.field4004.length || var7.field4004[var4.field3956] != var4) {
                            continue;
                        }
                    }
                    class182 var8 = new class182();
                    var8.field2919 = var4.field4109;
                    var8.field2928 = var4;
                    class177.method1270(var8, (byte) -5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)Z", line = 135)
    public static final boolean method390(int arg0) {
        field910++;
        class251 var1 = class55.field704;
        synchronized (class55.field704) {
            if (class139.field2149 == class107.field1641) {
                return false;
            }
            class80.field1161 = class67.field884[class107.field1641];
            class86.field1339 = class85.field1302[class107.field1641];
            class107.field1641 = class107.field1641 + 1 & 0x7F;
            if (arg0 != -13828) {
                field914 = true;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V", line = 154)
    public static void method391(byte arg0) {
        field915 = null;
        field918 = null;
        if (arg0 != 99) {
            method392(70, (class168) null);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILuf;)Z", line = 166)
    public static final boolean method392(int arg0, class168 arg1) {
        field916++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class107.field1642; var2++) {
            if (arg1.method1194(class142.field2192[var2], -26023)) {
                return true;
            }
        }
        if (arg1.method1194(class266.field4489.field658, -26023)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V", line = 209)
    public class69() {
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I)V", line = 214)
    public class69(int arg0) {
        this.field919 = arg0;
    }
}
