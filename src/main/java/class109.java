import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class109 {

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Lwb;")
    private class133 field2732 = null;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "Lwb;")
    private class133 field2728 = null;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    private int field2740 = 65000;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    private int field2743;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "La;")
    public static class1 field2735 = class113.method934(-11538, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "La;")
    public static class1 field2733 = class113.method934(-11538, " weitere Optionen");

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field2737 = 3353893;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "[Lua;")
    public static class121[] field2739 = new class121[50];

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "Lu;")
    public static class120 field2742;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Le;")
    public static class25 field2734;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "Le;")
    public static class25 field2748;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 4)
    public static void method907(int arg0) {
        field2733 = null;
        field2739 = null;
        field2734 = null;
        field2742 = null;
        if (arg0 <= 20) {
            method907(97);
        }
        field2735 = null;
        field2748 = null;
    }

    @OriginalMember(owner = "client!sa", name = "toString", descriptor = "()Ljava/lang/String;", line = 19)
    public final String toString() {
        field2745++;
        return "Cache:" + this.field2743;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([La;Z)[La;", line = 27)
    public static final class1[] method908(class1[] arg0, boolean arg1) {
        if (arg1) {
            method912((byte) -104);
        }
        class1[] var2 = new class1[5];
        field2736++;
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class116.method959(-69, new class1[] { class48.method504(var3, -1), class39.field1066 });
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class116.method959(117, new class1[] { var2[var3], arg0[var3] });
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)[B", line = 62)
    public final byte[] method909(int arg0, byte arg1) {
        field2741++;
        int var3 = -83 / ((-arg1 - 49) / 47);
        class133 var4 = this.field2728;
        synchronized (this.field2728) {
            try {
                if (this.field2732.method1045(0) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                this.field2732.method1044(0, (long) (arg0 * 6));
                this.field2732.method1048(0, (byte) -49, 6, class42.field1127);
                int var6 = (class42.field1127[5] & 0xFF) + ((class42.field1127[3] & 0xFF) << 16) + ((class42.field1127[4] & 0xFF) << 8);
                int var7 = (class42.field1127[2] & 0xFF) + (((class42.field1127[0] & 0xFF) << 16) + ((class42.field1127[1] & 0xFF) << 8));
                if (var7 < 0 || var7 > this.field2740) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field2728.method1045(0) / 520L) {
                    int var10 = 0;
                    int var11 = 0;
                    byte[] var12 = new byte[var7];
                    while (var7 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field2728.method1044(0, (long) (var6 * 520));
                        int var14 = var7 - var10;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field2728.method1048(0, (byte) -14, var14 + 8, class42.field1127);
                        int var15 = ((class42.field1127[0] & 0xFF) << 8) + (class42.field1127[1] & 0xFF);
                        int var16 = ((class42.field1127[4] & 0xFF) << 16) + ((class42.field1127[5] & 0xFF) << 8) + (class42.field1127[6] & 0xFF);
                        int var17 = ((class42.field1127[2] & 0xFF) << 8) + (class42.field1127[3] & 0xFF);
                        int var18 = class42.field1127[7] & 0xFF;
                        if (arg0 == var15 && var11 == var17 && this.field2743 == var18) {
                            if (var16 >= 0 && (long) var16 <= this.field2728.method1045(0) / 520L) {
                                var11++;
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var12[var10++] = class42.field1127[var21 + 8];
                                }
                                var6 = var16;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var12;
                } else {
                    return null;
                }
            } catch (IOException var40) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([BIZIB)Z", line = 146)
    private final boolean method910(byte[] arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        field2744++;
        class133 var6 = this.field2728;
        synchronized (this.field2728) {
            try {
                if (arg4 >= -80) {
                    this.method909(91, (byte) 63);
                }
                int var8;
                if (arg2) {
                    if (this.field2732.method1045(0) < (long) (arg3 * 6 + 6)) {
                        return false;
                    }
                    this.field2732.method1044(0, (long) (arg3 * 6));
                    this.field2732.method1048(0, (byte) -111, 6, class42.field1127);
                    var8 = (class42.field1127[5] & 0xFF) + (((class42.field1127[3] & 0xFF) << 16) + ((class42.field1127[4] & 0xFF) << 8));
                    if (var8 <= 0 || (long) var8 > this.field2728.method1045(0) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field2728.method1045(0) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class42.field1127[0] = (byte) (arg1 >> 16);
                class42.field1127[1] = (byte) (arg1 >> 8);
                class42.field1127[2] = (byte) arg1;
                int var10 = 0;
                class42.field1127[3] = (byte) (var8 >> 16);
                int var11 = 0;
                class42.field1127[4] = (byte) (var8 >> 8);
                class42.field1127[5] = (byte) var8;
                this.field2732.method1044(0, (long) (arg3 * 6));
                this.field2732.method1046(0, -16777216, 6, class42.field1127);
                while (var10 < arg1) {
                    int var12 = 0;
                    if (arg2) {
                        label108: {
                            this.field2728.method1044(0, (long) (var8 * 520));
                            try {
                                this.field2728.method1048(0, (byte) -106, 8, class42.field1127);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class42.field1127[6] & 0xFF) + (((class42.field1127[4] & 0xFF) << 16) + ((class42.field1127[5] & 0xFF) << 8));
                            int var13 = ((class42.field1127[0] & 0xFF) << 8) + (class42.field1127[1] & 0xFF);
                            int var14 = class42.field1127[7] & 0xFF;
                            int var15 = ((class42.field1127[2] & 0xFF) << 8) + (class42.field1127[3] & 0xFF);
                            if (arg3 == var13 && var11 == var15 && this.field2743 == var14) {
                                if (var12 >= 0 && this.field2728.method1045(0) / 520L >= (long) var12) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg2 = false;
                        var12 = (int) ((this.field2728.method1045(0) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class42.field1127[0] = (byte) (arg3 >> 8);
                    if (arg1 - var10 <= 512) {
                        var12 = 0;
                    }
                    class42.field1127[1] = (byte) arg3;
                    int var18 = arg1 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class42.field1127[2] = (byte) (var11 >> 8);
                    class42.field1127[3] = (byte) var11;
                    class42.field1127[4] = (byte) (var12 >> 16);
                    class42.field1127[5] = (byte) (var12 >> 8);
                    var11++;
                    class42.field1127[6] = (byte) var12;
                    class42.field1127[7] = (byte) this.field2743;
                    this.field2728.method1044(0, (long) (var8 * 520));
                    this.field2728.method1046(0, -16777216, 8, class42.field1127);
                    var8 = var12;
                    this.field2728.method1046(var10, -16777216, var18, arg0);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(ILwb;Lwb;I)V", line = 385)
    public class109(int arg0, class133 arg1, class133 arg2, int arg3) {
        this.field2740 = arg3;
        this.field2732 = arg2;
        this.field2728 = arg1;
        this.field2743 = arg0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([BIII)Z", line = 287)
    public final boolean method911(byte[] arg0, int arg1, int arg2, int arg3) {
        field2747++;
        class133 var5 = this.field2728;
        synchronized (this.field2728) {
            if (arg2 < 0 || arg2 > this.field2740) {
                throw new IllegalArgumentException();
            }
            if (arg1 != 1862596560) {
                this.method911(null, 96, -29, 88);
            }
            boolean var6 = this.method910(arg0, arg2, true, arg3, (byte) -120);
            if (!var6) {
                var6 = this.method910(arg0, arg2, false, arg3, (byte) -114);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)Lna;", line = 317)
    public static final class79 method912(byte arg0) {
        if (arg0 != 47) {
            method908(null, true);
        }
        field2729++;
        try {
            return (class79) Class.forName("sb").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class60();
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V", line = 346)
    public static final void method913(int arg0) {
        class133.field3249 = null;
        class32.field857 = null;
        if (arg0 >= -57) {
            field2733 = null;
        }
        class52.field1388 = null;
        class11.field413 = null;
        class47.field1249 = null;
        class75.field1875 = null;
        class117.field2933 = null;
        class37.field1004 = null;
        class34.field911 = null;
        class122.field3056 = null;
        field2731++;
        class85.field2134 = null;
        class116.field2909 = null;
    }
}
